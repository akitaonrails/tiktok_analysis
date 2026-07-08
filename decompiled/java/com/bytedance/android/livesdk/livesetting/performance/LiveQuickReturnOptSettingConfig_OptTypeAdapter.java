package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveQuickReturnOptSettingConfig_OptTypeAdapter extends TypeAdapter<LiveQuickReturnOptSettingConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveQuickReturnOptSettingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveQuickReturnOptSettingConfig liveQuickReturnOptSettingConfig = new LiveQuickReturnOptSettingConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1646867447) {
                    if (iHashCode != -1332914459) {
                        if (iHashCode == -96179731 && strLJJJJ.equals("expire_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveQuickReturnOptSettingConfig.expireTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("mock_status_code")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveQuickReturnOptSettingConfig.mockStatusCode = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("delay_time")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveQuickReturnOptSettingConfig.delayTime = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveQuickReturnOptSettingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveQuickReturnOptSettingConfig liveQuickReturnOptSettingConfig) throws IOException {
        LiveQuickReturnOptSettingConfig liveQuickReturnOptSettingConfig2 = liveQuickReturnOptSettingConfig;
        if (liveQuickReturnOptSettingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("expire_time");
        c09dl.LJJIZ(liveQuickReturnOptSettingConfig2.expireTime);
        c09dl.LJIILLIIL("delay_time");
        c09dl.LJJJJ(Integer.valueOf(liveQuickReturnOptSettingConfig2.delayTime));
        c09dl.LJIILLIIL("mock_status_code");
        c09dl.LJJJJ(Integer.valueOf(liveQuickReturnOptSettingConfig2.mockStatusCode));
        c09dl.LJII();
    }
}
