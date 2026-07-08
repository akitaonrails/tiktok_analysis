package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatComponentConfig;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatFeatureListConfTypeAdapter extends TypeAdapter<ChatFeatureListConf> {
    public final Gson LIZ;

    public ChatFeatureListConfTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ChatFeatureListConf read(C09CU c09cu) throws IOException {
        c09cu.LIZIZ();
        ArrayList arrayList = null;
        int iLJJIZ = -1;
        String strLJJJZ = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -447446250) {
                    if (iHashCode != 17328488) {
                        if (iHashCode == 1620118465 && strLJJJJ.equals("chat_type")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                iLJJIZ = c09cu.LJJIZ();
                            }
                        }
                    } else if (strLJJJJ.equals("config_name")) {
                        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                            c09cu.LJJJJJL();
                        } else {
                            strLJJJZ = c09cu.LJJJZ();
                        }
                    }
                } else if (strLJJJJ.equals("components")) {
                    if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                        c09cu.LJJJJJL();
                    } else {
                        arrayList = new ArrayList();
                        c09cu.LIZ();
                        while (c09cu.LJIIZILJ()) {
                            arrayList.add(this.LIZ.LJIIJ(ChatComponentConfig.class).read(c09cu));
                        }
                        c09cu.LJI();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        ChatFeatureListConf chatFeatureListConf = new ChatFeatureListConf(iLJJIZ, arrayList);
        chatFeatureListConf.setConfigName(strLJJJZ);
        return chatFeatureListConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ChatFeatureListConf chatFeatureListConf) {
        ChatFeatureListConf chatFeatureListConf2 = chatFeatureListConf;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("config_name");
        c09dl.LJJJJJ(chatFeatureListConf2.getConfigName());
        c09dl.LJIILLIIL("chat_type");
        c09dl.LJJJJ(Integer.valueOf(chatFeatureListConf2.getChatType()));
        c09dl.LJIILLIIL("components");
        if (chatFeatureListConf2.getComponents() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZIZ();
            List<ChatComponentConfig> components = chatFeatureListConf2.getComponents();
            if (components != null) {
                Iterator<ChatComponentConfig> it2 = components.iterator();
                while (it2.hasNext()) {
                    this.LIZ.LJIIJ(ChatComponentConfig.class).write(c09dl, it2.next());
                }
            }
            c09dl.LJI();
        }
        c09dl.LJII();
    }
}
