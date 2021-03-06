/* Generated By:JJTree: Do not edit this line. OFindReferencesStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.List;
import java.util.Map;

public class OFindReferencesStatement extends OStatement {
  protected ORid       rid;
  protected OStatement subQuery;

  //class or cluster
  protected List<SimpleNode> targets;

  public OFindReferencesStatement(int id) {
    super(id);
  }

  public OFindReferencesStatement(OrientSql p, int id) {
    super(p, id);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("FIND REFERENCES ");
    if(rid!=null){
      builder.append(rid.toString());
    }else{
      builder.append(" ( ");
      builder.append(subQuery.toString());
      builder.append(" )");
    }
    if(targets!=null){
      builder.append(" [");
      boolean first = true;
      for(SimpleNode node:targets){
        if(!first){
          builder.append(",");
        }
        builder.append(node.toString());
        first = false;
      }
      builder.append("]");
    }

    return builder.toString();
  }

  @Override
  public void replaceParameters(Map<Object, Object> params) {
    if(subQuery!=null){
      subQuery.replaceParameters(params);
    }
  }

}
/* JavaCC - OriginalChecksum=be781e05acef94aa5edd7438b4ead6d5 (do not edit this line) */
