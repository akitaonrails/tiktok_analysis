package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubCommunityGuideDisplayConfiguration_OptTypeAdapter extends TypeAdapter<FansClubCommunityGuideDisplayConfiguration> {
    @Override // com.google.gson.TypeAdapter
    public final FansClubCommunityGuideDisplayConfiguration read(C09CU c09cu) {
        FansClubCommunityGuideDisplayConfiguration fansClubCommunityGuideDisplayConfiguration = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            fansClubCommunityGuideDisplayConfiguration = new FansClubCommunityGuideDisplayConfiguration("", "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "channel_name")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        fansClubCommunityGuideDisplayConfiguration.setChannelName(c09cu.LJJJZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "guide_lottie_file_name")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        fansClubCommunityGuideDisplayConfiguration.setGuideLottieFileName(c09cu.LJJJZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return fansClubCommunityGuideDisplayConfiguration;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubCommunityGuideDisplayConfiguration fansClubCommunityGuideDisplayConfiguration) {
        FansClubCommunityGuideDisplayConfiguration fansClubCommunityGuideDisplayConfiguration2 = fansClubCommunityGuideDisplayConfiguration;
        if (fansClubCommunityGuideDisplayConfiguration2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("channel_name");
        c09dl.LJJJJJ(fansClubCommunityGuideDisplayConfiguration2.getChannelName());
        c09dl.LJIILLIIL("guide_lottie_file_name");
        c09dl.LJJJJJ(fansClubCommunityGuideDisplayConfiguration2.getGuideLottieFileName());
        c09dl.LJII();
    }
}
