package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.SendGiftRetrySetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SendGiftRetrySetting_SettingParams_OptTypeAdapter extends TypeAdapter<SendGiftRetrySetting.SettingParams> {
    public final Gson LIZ;

    public SendGiftRetrySetting_SettingParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SendGiftRetrySetting.SettingParams read(C09CU c09cu) {
        SendGiftRetrySetting.SettingParams settingParams = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            settingParams = new SendGiftRetrySetting.SettingParams(false, 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        settingParams.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "retry_count")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        settingParams.retryCount = c09cu.LJJIZ();
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
    public final void write(C09DL c09dl, SendGiftRetrySetting.SettingParams settingParams) throws IOException {
        SendGiftRetrySetting.SettingParams settingParams2 = settingParams;
        if (settingParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(settingParams2.enable);
        c09dl.LJIILLIIL("retry_count");
        c09dl.LJJJJ(Integer.valueOf(settingParams2.retryCount));
        c09dl.LJII();
    }
}
