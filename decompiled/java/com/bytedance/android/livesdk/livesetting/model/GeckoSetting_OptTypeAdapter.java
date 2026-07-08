package com.bytedance.android.livesdk.livesetting.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class GeckoSetting_OptTypeAdapter extends TypeAdapter<GeckoSetting> {
    public final Gson LIZ;

    public GeckoSetting_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GeckoSetting read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GeckoSetting geckoSetting = new GeckoSetting();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1380821995:
                        if (strLJJJJ.equals("boe_url_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                geckoSetting.boeUrlList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1370615288:
                        if (strLJJJJ.equals("ppe_url_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                geckoSetting.ppeUrlList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -970411666:
                        if (strLJJJJ.equals("url_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                geckoSetting.urlList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -834809288:
                        if (strLJJJJ.equals("is_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                geckoSetting.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1212116679:
                        if (strLJJJJ.equals("delay_trigger_down_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                geckoSetting.delayTriggerDownTime = c09cu.LJJIZ();
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
        return geckoSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GeckoSetting geckoSetting) throws IOException {
        GeckoSetting geckoSetting2 = geckoSetting;
        if (geckoSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enable");
        c09dl.LJJJJJL(geckoSetting2.isEnable);
        c09dl.LJIILLIIL("url_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, geckoSetting2.urlList, String.class);
        c09dl.LJIILLIIL("ppe_url_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, geckoSetting2.ppeUrlList, String.class);
        c09dl.LJIILLIIL("boe_url_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, geckoSetting2.boeUrlList, String.class);
        c09dl.LJIILLIIL("delay_trigger_down_time");
        c09dl.LJJJJ(Integer.valueOf(geckoSetting2.delayTriggerDownTime));
        c09dl.LJII();
    }
}
