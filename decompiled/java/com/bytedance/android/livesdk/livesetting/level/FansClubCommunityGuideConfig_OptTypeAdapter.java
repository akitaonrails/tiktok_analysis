package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubCommunityGuideConfig_OptTypeAdapter extends TypeAdapter<FansClubCommunityGuideConfig> {
    public final Gson LIZ;

    public FansClubCommunityGuideConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FansClubCommunityGuideConfig read(C09CU c09cu) {
        FansClubCommunityGuideConfig fansClubCommunityGuideConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            fansClubCommunityGuideConfig = new FansClubCommunityGuideConfig(new ArrayList());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "live_community_guidance")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        fansClubCommunityGuideConfig.setLiveCommunityGuidance(C473040Igo.LIZ(this.LIZ, c09cu, FansClubCommunityGuideItem.class));
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return fansClubCommunityGuideConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubCommunityGuideConfig fansClubCommunityGuideConfig) {
        FansClubCommunityGuideConfig fansClubCommunityGuideConfig2 = fansClubCommunityGuideConfig;
        if (fansClubCommunityGuideConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_community_guidance");
        C473040Igo.LIZLLL(this.LIZ, c09dl, fansClubCommunityGuideConfig2.getLiveCommunityGuidance(), FansClubCommunityGuideItem.class);
        c09dl.LJII();
    }
}
