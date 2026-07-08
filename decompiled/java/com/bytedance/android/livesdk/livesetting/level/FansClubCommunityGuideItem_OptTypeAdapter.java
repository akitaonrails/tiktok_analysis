package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubCommunityGuideItem_OptTypeAdapter extends TypeAdapter<FansClubCommunityGuideItem> {
    public final Gson LIZ;

    public FansClubCommunityGuideItem_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FansClubCommunityGuideItem read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FansClubCommunityGuideItem fansClubCommunityGuideItem = new FansClubCommunityGuideItem(null, null, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1918704583) {
                    if (iHashCode != -253185087) {
                        if (iHashCode == 956646091 && strLJJJJ.equals("event_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansClubCommunityGuideItem.setEventParams(C473040Igo.LIZIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("guidance_type")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            fansClubCommunityGuideItem.setGuidanceType(c09cu.LJJIZ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("display_configuration")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        fansClubCommunityGuideItem.setDisplayConfiguration((FansClubCommunityGuideDisplayConfiguration) this.LIZ.LJIIJ(FansClubCommunityGuideDisplayConfiguration.class).read(c09cu));
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return fansClubCommunityGuideItem;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubCommunityGuideItem fansClubCommunityGuideItem) {
        FansClubCommunityGuideItem fansClubCommunityGuideItem2 = fansClubCommunityGuideItem;
        if (fansClubCommunityGuideItem2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("display_configuration");
        this.LIZ.LJIIJ(FansClubCommunityGuideDisplayConfiguration.class).write(c09dl, fansClubCommunityGuideItem2.getDisplayConfiguration());
        c09dl.LJIILLIIL("event_params");
        C473040Igo.LJ(this.LIZ, c09dl, fansClubCommunityGuideItem2.getEventParams(), String.class);
        c09dl.LJIILLIIL("guidance_type");
        c09dl.LJJJJ(Integer.valueOf(fansClubCommunityGuideItem2.getGuidanceType()));
        c09dl.LJII();
    }
}
