package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTicketIconUrlSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class LinkMicTicketIconUrlSetting_TicketConfig_OptTypeAdapter extends TypeAdapter<LinkMicTicketIconUrlSetting.TicketConfig> {
    public final Gson LIZ;

    public LinkMicTicketIconUrlSetting_TicketConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LinkMicTicketIconUrlSetting.TicketConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicTicketIconUrlSetting.TicketConfig ticketConfig = new LinkMicTicketIconUrlSetting.TicketConfig(null, null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1940847101:
                        if (strLJJJJ.equals("animation_name_to_value_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ticketConfig.animationNameToValueMap = C473040Igo.LIZIZ(this.LIZ, c09cu, LinkMicTicketIconUrlSetting.AnimationValue.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -810046354:
                        if (strLJJJJ.equals("style_name_to_url_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ticketConfig.styleNameToUrlMap = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -505277383:
                        if (strLJJJJ.equals("rank_bg_color_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ticketConfig.iconName2RankBgMap = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 933104610:
                        if (strLJJJJ.equals("style_name_to_color_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ticketConfig.styleNameToColorMap = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
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
        return ticketConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicTicketIconUrlSetting.TicketConfig ticketConfig) {
        LinkMicTicketIconUrlSetting.TicketConfig ticketConfig2 = ticketConfig;
        if (ticketConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("style_name_to_url_map");
        C473040Igo.LJ(this.LIZ, c09dl, ticketConfig2.styleNameToUrlMap, String.class);
        c09dl.LJIILLIIL("style_name_to_color_map");
        C473040Igo.LJ(this.LIZ, c09dl, ticketConfig2.styleNameToColorMap, String.class);
        c09dl.LJIILLIIL("rank_bg_color_map");
        C473040Igo.LJ(this.LIZ, c09dl, ticketConfig2.iconName2RankBgMap, String.class);
        c09dl.LJIILLIIL("animation_name_to_value_map");
        C473040Igo.LJ(this.LIZ, c09dl, ticketConfig2.animationNameToValueMap, LinkMicTicketIconUrlSetting.AnimationValue.class);
        c09dl.LJII();
    }
}
