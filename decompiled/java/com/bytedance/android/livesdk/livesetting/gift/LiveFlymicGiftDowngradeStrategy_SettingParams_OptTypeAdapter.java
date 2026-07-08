package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.LiveFlymicGiftDowngradeStrategy;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveFlymicGiftDowngradeStrategy_SettingParams_OptTypeAdapter extends TypeAdapter<LiveFlymicGiftDowngradeStrategy.SettingParams> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveFlymicGiftDowngradeStrategy.SettingParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveFlymicGiftDowngradeStrategy.SettingParams settingParams = new LiveFlymicGiftDowngradeStrategy.SettingParams(0.0f, 0, 0.0f, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -380804886:
                        if (strLJJJJ.equals("downgrade_device_score_level_1")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingParams.deviceScoreLevel1 = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -380804885:
                        if (strLJJJJ.equals("downgrade_device_score_level_2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingParams.deviceScoreLevel2 = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 481985668:
                        if (strLJJJJ.equals("downgrade_message_count_level_1")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingParams.msgCountLevel1 = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 481985669:
                        if (strLJJJJ.equals("downgrade_message_count_level_2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingParams.msgCountLevel2 = c09cu.LJJIZ();
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
    public final void write(C09DL c09dl, LiveFlymicGiftDowngradeStrategy.SettingParams settingParams) {
        LiveFlymicGiftDowngradeStrategy.SettingParams settingParams2 = settingParams;
        if (settingParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("downgrade_device_score_level_1");
        c09dl.LJJJJ(Float.valueOf(settingParams2.deviceScoreLevel1));
        c09dl.LJIILLIIL("downgrade_message_count_level_1");
        c09dl.LJJJJ(Integer.valueOf(settingParams2.msgCountLevel1));
        c09dl.LJIILLIIL("downgrade_device_score_level_2");
        c09dl.LJJJJ(Float.valueOf(settingParams2.deviceScoreLevel2));
        c09dl.LJIILLIIL("downgrade_message_count_level_2");
        c09dl.LJJJJ(Integer.valueOf(settingParams2.msgCountLevel2));
        c09dl.LJII();
    }
}
