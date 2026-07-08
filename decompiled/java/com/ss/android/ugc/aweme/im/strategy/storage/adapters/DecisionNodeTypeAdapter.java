package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class DecisionNodeTypeAdapter extends TypeAdapter<DecisionNode> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static DecisionNode LIZ(C09CU c09cu) {
        c09cu.LIZIZ();
        String strLJJJZ = null;
        String strLJJJZ2 = null;
        String strLJJJZ3 = null;
        String strLJJJZ4 = null;
        String strLJJJZ5 = null;
        ArrayList arrayList = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2079747935:
                        if (strLJJJJ.equals("sub_node")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                arrayList = new ArrayList();
                                c09cu.LIZ();
                                while (c09cu.LJIIZILJ()) {
                                    arrayList.add(LIZ(c09cu));
                                }
                                c09cu.LJI();
                            }
                        }
                        break;
                    case -540788577:
                        if (strLJJJJ.equals("node_attribute")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 17328488:
                        if (strLJJJJ.equals("config_name")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ5 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 465832791:
                        if (strLJJJJ.equals("node_type")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ2 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 1108829034:
                        if (strLJJJJ.equals("node_operation")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ3 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 1557043444:
                        if (strLJJJJ.equals("node_value")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ4 = c09cu.LJJJZ();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return new DecisionNode(strLJJJZ, strLJJJZ2, strLJJJZ3, strLJJJZ4, strLJJJZ5, arrayList);
    }

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ DecisionNode read(C09CU c09cu) {
        return LIZ(c09cu);
    }

    public static void LIZIZ(C09DL c09dl, DecisionNode decisionNode) {
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("node_attribute");
        c09dl.LJJJJJ(decisionNode.nodeAttribute);
        c09dl.LJIILLIIL("node_type");
        c09dl.LJJJJJ(decisionNode.nodeType);
        c09dl.LJIILLIIL("node_operation");
        c09dl.LJJJJJ(decisionNode.nodeOperation);
        c09dl.LJIILLIIL("node_value");
        c09dl.LJJJJJ(decisionNode.nodeValue);
        c09dl.LJIILLIIL("config_name");
        c09dl.LJJJJJ(decisionNode.configName);
        c09dl.LJIILLIIL("sub_node");
        if (decisionNode.nodeList == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZIZ();
            List<DecisionNode> list = decisionNode.nodeList;
            if (list != null) {
                Iterator<DecisionNode> it2 = list.iterator();
                while (it2.hasNext()) {
                    LIZIZ(c09dl, it2.next());
                }
            }
            c09dl.LJI();
        }
        c09dl.LJII();
    }

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ void write(C09DL c09dl, DecisionNode decisionNode) {
        LIZIZ(c09dl, decisionNode);
    }
}
