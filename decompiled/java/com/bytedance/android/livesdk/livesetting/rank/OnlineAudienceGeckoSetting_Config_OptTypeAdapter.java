package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGeckoSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class OnlineAudienceGeckoSetting_Config_OptTypeAdapter extends TypeAdapter<OnlineAudienceGeckoSetting.Config> {
    public final Gson LIZ;

    public OnlineAudienceGeckoSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final OnlineAudienceGeckoSetting.Config read(C09CU c09cu) {
        OnlineAudienceGeckoSetting.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new OnlineAudienceGeckoSetting.Config(false, "revenue_client_audience_ranking_lynx");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "is_audience_list_gecko_setting_on")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.isAudienceListGeckoSettingOn = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "audience_list_gecko_channel")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.audienceListGeckoChannel = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, OnlineAudienceGeckoSetting.Config config) throws IOException {
        OnlineAudienceGeckoSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_audience_list_gecko_setting_on");
        c09dl.LJJJJJL(config2.isAudienceListGeckoSettingOn);
        c09dl.LJIILLIIL("audience_list_gecko_channel");
        c09dl.LJJJJJ(config2.audienceListGeckoChannel);
        c09dl.LJII();
    }
}
