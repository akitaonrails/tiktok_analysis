package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class TabModule_OptTypeAdapter extends TypeAdapter<TabModule> {
    @Override // com.google.gson.TypeAdapter
    public final TabModule read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TabModule tabModule = new TabModule("", "", 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 3373707) {
                    if (iHashCode != 110371416) {
                        if (iHashCode == 2088019150 && strLJJJJ.equals("innerFeedMgAggId")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tabModule.innerFeedMgAggId = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("title")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            tabModule.title = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("name")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        tabModule.name = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return tabModule;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TabModule tabModule) throws IOException {
        TabModule tabModule2 = tabModule;
        if (tabModule2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("name");
        c09dl.LJJJJJ(tabModule2.name);
        c09dl.LJIILLIIL("title");
        c09dl.LJJJJJ(tabModule2.title);
        c09dl.LJIILLIIL("innerFeedMgAggId");
        c09dl.LJJIZ(tabModule2.innerFeedMgAggId);
        c09dl.LJII();
    }
}
