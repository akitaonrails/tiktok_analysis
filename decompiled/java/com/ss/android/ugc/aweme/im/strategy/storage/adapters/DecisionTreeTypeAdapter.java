package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionNode;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionTree;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class DecisionTreeTypeAdapter extends TypeAdapter<DecisionTree> {
    public final Gson LIZ;

    public DecisionTreeTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final DecisionTree read(C09CU c09cu) {
        c09cu.LIZIZ();
        DecisionNode decisionNode = null;
        String strLJJJZ = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "root")) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    decisionNode = null;
                } else {
                    decisionNode = (DecisionNode) this.LIZ.LJIIJ(DecisionNode.class).read(c09cu);
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "default_config_name")) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    strLJJJZ = null;
                } else {
                    strLJJJZ = c09cu.LJJJZ();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return new DecisionTree(decisionNode, strLJJJZ);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DecisionTree decisionTree) {
        DecisionTree decisionTree2 = decisionTree;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("root");
        if (decisionTree2.root == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(DecisionNode.class).write(c09dl, decisionTree2.root);
        }
        c09dl.LJIILLIIL("default_config_name");
        c09dl.LJJJJJ(decisionTree2.defaultConfigName);
        c09dl.LJII();
    }
}
