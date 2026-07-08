package com.bytedance.android.livesdk.livesetting.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class GeckoStorageOpt_OptTypeAdapter extends TypeAdapter<GeckoStorageOpt> {
    public final Gson LIZ;

    public GeckoStorageOpt_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GeckoStorageOpt read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GeckoStorageOpt geckoStorageOpt = new GeckoStorageOpt();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 1554219082) {
                    if (iHashCode != 1668004020) {
                        if (iHashCode == 2132359346 && strLJJJJ.equals("ttlive_gecko_resource_unload_channel_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                geckoStorageOpt.channelList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("ttlive_gecko_resource_storage_is_delete")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            geckoStorageOpt.isDelete = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("ttlive_gecko_resource_storage_is_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        geckoStorageOpt.isOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return geckoStorageOpt;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GeckoStorageOpt geckoStorageOpt) throws IOException {
        GeckoStorageOpt geckoStorageOpt2 = geckoStorageOpt;
        if (geckoStorageOpt2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ttlive_gecko_resource_storage_is_opt");
        c09dl.LJJJJJL(geckoStorageOpt2.isOpt);
        c09dl.LJIILLIIL("ttlive_gecko_resource_storage_is_delete");
        c09dl.LJJJJJL(geckoStorageOpt2.isDelete);
        c09dl.LJIILLIIL("ttlive_gecko_resource_unload_channel_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, geckoStorageOpt2.channelList, String.class);
        c09dl.LJII();
    }
}
