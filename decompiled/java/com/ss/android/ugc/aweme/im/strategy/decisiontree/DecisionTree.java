package com.ss.android.ugc.aweme.im.strategy.decisiontree;

import X.C09CT;
import X.C909280Zlm;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class DecisionTree implements Serializable {
    public static final C909280Zlm Companion = new Object() { // from class: X.0Zlm
    };

    @C09CT("default_config_name")
    public String defaultConfigName;

    @C09CT("root")
    public DecisionNode root;

    public DecisionTree() {
        this(null, null);
    }

    public final void setDefaultConfigName(String str) {
        this.defaultConfigName = str;
    }

    public final void setRoot(DecisionNode decisionNode) {
        this.root = decisionNode;
    }

    public DecisionTree(DecisionNode decisionNode, String str) {
        this.root = decisionNode;
        this.defaultConfigName = str;
    }
}
