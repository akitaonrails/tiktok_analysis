package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class InteractionModule_OptTypeAdapter extends TypeAdapter<InteractionModule> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final InteractionModule read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        InteractionModule interactionModule = new InteractionModule(0, "", "", "", 0L, "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -128761383:
                        if (strLJJJJ.equals("enterMethod")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                interactionModule.enterMethod = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3575610:
                        if (strLJJJJ.equals("type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                interactionModule.type = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 110371416:
                        if (strLJJJJ.equals("title")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                interactionModule.title = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1287124693:
                        if (strLJJJJ.equals("backgroundColor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                interactionModule.backgroundColor = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2088019150:
                        if (strLJJJJ.equals("innerFeedMgAggId")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                interactionModule.innerFeedMgAggId = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2097958236:
                        if (strLJJJJ.equals("btnTitle")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                interactionModule.btnTitle = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return interactionModule;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InteractionModule interactionModule) throws IOException {
        InteractionModule interactionModule2 = interactionModule;
        if (interactionModule2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("type");
        c09dl.LJJJJ(Integer.valueOf(interactionModule2.type));
        c09dl.LJIILLIIL("title");
        c09dl.LJJJJJ(interactionModule2.title);
        c09dl.LJIILLIIL("btnTitle");
        c09dl.LJJJJJ(interactionModule2.btnTitle);
        c09dl.LJIILLIIL("backgroundColor");
        c09dl.LJJJJJ(interactionModule2.backgroundColor);
        c09dl.LJIILLIIL("innerFeedMgAggId");
        c09dl.LJJIZ(interactionModule2.innerFeedMgAggId);
        c09dl.LJIILLIIL("enterMethod");
        c09dl.LJJJJJ(interactionModule2.enterMethod);
        c09dl.LJII();
    }
}
