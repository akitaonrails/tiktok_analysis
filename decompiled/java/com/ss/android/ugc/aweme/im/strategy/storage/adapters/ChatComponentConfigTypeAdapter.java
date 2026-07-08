package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatComponentConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatComponentConfigTypeAdapter extends TypeAdapter<ChatComponentConfig> {
    @Override // com.google.gson.TypeAdapter
    public final ChatComponentConfig read(C09CU c09cu) throws IOException {
        c09cu.LIZIZ();
        boolean zLJJ = false;
        String strLJJJZ = "";
        String strLJJJZ2 = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != -499132515) {
                        if (iHashCode == 1278893910 && strLJJJJ.equals("biz_data")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ2 = c09cu.LJJJZ();
                            }
                        }
                    } else if (strLJJJJ.equals("component_id")) {
                        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                            c09cu.LJJJJJL();
                        } else {
                            strLJJJZ = c09cu.LJJJZ();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                        c09cu.LJJJJJL();
                    } else {
                        zLJJ = c09cu.LJJ();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return new ChatComponentConfig(zLJJ, strLJJJZ, strLJJJZ2);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ChatComponentConfig chatComponentConfig) throws IOException {
        ChatComponentConfig chatComponentConfig2 = chatComponentConfig;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(chatComponentConfig2.enable);
        c09dl.LJIILLIIL("component_id");
        c09dl.LJJJJJ(chatComponentConfig2.componentId);
        c09dl.LJIILLIIL("biz_data");
        c09dl.LJJJJJ(chatComponentConfig2.bizData);
        c09dl.LJII();
    }
}
