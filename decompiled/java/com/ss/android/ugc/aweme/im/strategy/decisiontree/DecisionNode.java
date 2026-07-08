package com.ss.android.ugc.aweme.im.strategy.decisiontree;

import X.C09CT;
import X.C909690ZmR;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class DecisionNode implements Serializable {
    public static final C909690ZmR Companion = new Object() { // from class: X.0ZmR
    };

    @C09CT("config_name")
    public String configName;

    @C09CT("node_attribute")
    public String nodeAttribute;

    @C09CT("sub_node")
    public List<DecisionNode> nodeList;

    @C09CT("node_operation")
    public String nodeOperation;

    @C09CT("node_type")
    public String nodeType;

    @C09CT("node_value")
    public String nodeValue;

    public DecisionNode() {
        this(null, null, null, null, null, null);
    }

    public final DecisionNode copy(String str, String str2, String str3, String str4, String str5, List<DecisionNode> list) {
        return new DecisionNode(str, str2, str3, str4, str5, list);
    }

    public final void setConfigName(String str) {
        this.configName = str;
    }

    public final void setNodeAttribute(String str) {
        this.nodeAttribute = str;
    }

    public final void setNodeList(List<DecisionNode> list) {
        this.nodeList = list;
    }

    public final void setNodeOperation(String str) {
        this.nodeOperation = str;
    }

    public final void setNodeType(String str) {
        this.nodeType = str;
    }

    public final void setNodeValue(String str) {
        this.nodeValue = str;
    }

    public DecisionNode(String str, String str2, String str3, String str4, String str5, List<DecisionNode> list) {
        this.nodeAttribute = str;
        this.nodeType = str2;
        this.nodeOperation = str3;
        this.nodeValue = str4;
        this.configName = str5;
        this.nodeList = list;
    }
}
