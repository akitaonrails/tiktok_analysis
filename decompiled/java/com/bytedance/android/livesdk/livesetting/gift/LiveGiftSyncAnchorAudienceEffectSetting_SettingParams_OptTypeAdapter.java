package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSyncAnchorAudienceEffectSetting;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftSyncAnchorAudienceEffectSetting_SettingParams_OptTypeAdapter extends TypeAdapter<LiveGiftSyncAnchorAudienceEffectSetting.SettingParams> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGiftSyncAnchorAudienceEffectSetting.SettingParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftSyncAnchorAudienceEffectSetting.SettingParams settingParams = new LiveGiftSyncAnchorAudienceEffectSetting.SettingParams(0, 11, 0, 0L, 500);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1824820973:
                        if (strLJJJJ.equals("consume_value_max")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingParams.consumeValueMax = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1824820735:
                        if (strLJJJJ.equals("consume_value_min")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingParams.consumeValueMin = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1435273065:
                        if (strLJJJJ.equals("sync_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingParams.syncStrategy = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -924613267:
                        if (strLJJJJ.equals("sei_delay_map_count_max")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingParams.seiDelayMapCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1705308037:
                        if (strLJJJJ.equals("sei_delay_max_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingParams.seiDelayMaxMs = c09cu.LJJJ();
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
        return settingParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftSyncAnchorAudienceEffectSetting.SettingParams settingParams) throws IOException {
        LiveGiftSyncAnchorAudienceEffectSetting.SettingParams settingParams2 = settingParams;
        if (settingParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("sync_strategy");
        c09dl.LJJJJ(Integer.valueOf(settingParams2.syncStrategy));
        c09dl.LJIILLIIL("consume_value_max");
        c09dl.LJJJJ(Integer.valueOf(settingParams2.consumeValueMax));
        c09dl.LJIILLIIL("consume_value_min");
        c09dl.LJJJJ(Integer.valueOf(settingParams2.consumeValueMin));
        c09dl.LJIILLIIL("sei_delay_max_ms");
        c09dl.LJJIZ(settingParams2.seiDelayMaxMs);
        c09dl.LJIILLIIL("sei_delay_map_count_max");
        c09dl.LJJJJ(Integer.valueOf(settingParams2.seiDelayMapCount));
        c09dl.LJII();
    }
}
