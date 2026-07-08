package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.level.FansClubCelebrationBubbleTextSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubCelebrationBubbleTextSetting_LiveFansStarlingKeyConfig_OptTypeAdapter extends TypeAdapter<FansClubCelebrationBubbleTextSetting.LiveFansStarlingKeyConfig> {
    public final Gson LIZ;

    public FansClubCelebrationBubbleTextSetting_LiveFansStarlingKeyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FansClubCelebrationBubbleTextSetting.LiveFansStarlingKeyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FansClubCelebrationBubbleTextSetting.LiveFansStarlingKeyConfig liveFansStarlingKeyConfig = new FansClubCelebrationBubbleTextSetting.LiveFansStarlingKeyConfig(null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "claim_key")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveFansStarlingKeyConfig.claimKey = (FansClubCelebrationBubbleTextSetting.LiveFansStarlingKey) this.LIZ.LJIIJ(FansClubCelebrationBubbleTextSetting.LiveFansStarlingKey.class).read(c09cu);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "no_claim_key")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveFansStarlingKeyConfig.noClaimKey = (FansClubCelebrationBubbleTextSetting.LiveFansStarlingKey) this.LIZ.LJIIJ(FansClubCelebrationBubbleTextSetting.LiveFansStarlingKey.class).read(c09cu);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveFansStarlingKeyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubCelebrationBubbleTextSetting.LiveFansStarlingKeyConfig liveFansStarlingKeyConfig) {
        FansClubCelebrationBubbleTextSetting.LiveFansStarlingKeyConfig liveFansStarlingKeyConfig2 = liveFansStarlingKeyConfig;
        if (liveFansStarlingKeyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("claim_key");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(FansClubCelebrationBubbleTextSetting.LiveFansStarlingKey.class);
        typeAdapterLJIIJ.write(c09dl, liveFansStarlingKeyConfig2.claimKey);
        c09dl.LJIILLIIL("no_claim_key");
        typeAdapterLJIIJ.write(c09dl, liveFansStarlingKeyConfig2.noClaimKey);
        c09dl.LJII();
    }
}
