package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGiftGuideSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class OnlineAudienceGiftGuideSetting_Config_OptTypeAdapter extends TypeAdapter<OnlineAudienceGiftGuideSetting.Config> {
    public final Gson LIZ;

    public OnlineAudienceGiftGuideSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final OnlineAudienceGiftGuideSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        OnlineAudienceGiftGuideSetting.Config config = new OnlineAudienceGiftGuideSetting.Config(true, 5655L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "online_audience_gift_guide_available")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    config.giftGuideAvailable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "online_audience_gift_guide_gift_id")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    config.giftId = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, OnlineAudienceGiftGuideSetting.Config config) throws IOException {
        OnlineAudienceGiftGuideSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("online_audience_gift_guide_available");
        c09dl.LJJJJJL(config2.giftGuideAvailable);
        c09dl.LJIILLIIL("online_audience_gift_guide_gift_id");
        c09dl.LJJIZ(config2.giftId);
        c09dl.LJII();
    }
}
