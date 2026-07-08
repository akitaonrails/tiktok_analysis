package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSyncAnchorAudienceV2Setting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftSyncAnchorAudienceV2Setting_SettingParams_OptTypeAdapter extends TypeAdapter<LiveGiftSyncAnchorAudienceV2Setting.SettingParams> {
    @Override // com.google.gson.TypeAdapter
    public final LiveGiftSyncAnchorAudienceV2Setting.SettingParams read(C09CU c09cu) {
        LiveGiftSyncAnchorAudienceV2Setting.SettingParams settingParams = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            settingParams = new LiveGiftSyncAnchorAudienceV2Setting.SettingParams(7, 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "consume_value_max")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        settingParams.consumeValueMax = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "consume_value_min")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        settingParams.consumeValueMin = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return settingParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftSyncAnchorAudienceV2Setting.SettingParams settingParams) {
        LiveGiftSyncAnchorAudienceV2Setting.SettingParams settingParams2 = settingParams;
        if (settingParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("consume_value_max");
        c09dl.LJJJJ(Integer.valueOf(settingParams2.consumeValueMax));
        c09dl.LJIILLIIL("consume_value_min");
        c09dl.LJJJJ(Integer.valueOf(settingParams2.consumeValueMin));
        c09dl.LJII();
    }
}
