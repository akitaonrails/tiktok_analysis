package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.performance.LiveCoreEventForRecoTagConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveCoreEventForRecoTagConfigSetting_LiveCoreEventForRecoTagConfig_OptTypeAdapter extends TypeAdapter<LiveCoreEventForRecoTagConfigSetting.LiveCoreEventForRecoTagConfig> {
    public final Gson LIZ;

    public LiveCoreEventForRecoTagConfigSetting_LiveCoreEventForRecoTagConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveCoreEventForRecoTagConfigSetting.LiveCoreEventForRecoTagConfig read(C09CU c09cu) {
        LiveCoreEventForRecoTagConfigSetting.LiveCoreEventForRecoTagConfig liveCoreEventForRecoTagConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveCoreEventForRecoTagConfig = new LiveCoreEventForRecoTagConfigSetting.LiveCoreEventForRecoTagConfig(new ArrayList());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "core_event_set")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveCoreEventForRecoTagConfig.setEventWhiteList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveCoreEventForRecoTagConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCoreEventForRecoTagConfigSetting.LiveCoreEventForRecoTagConfig liveCoreEventForRecoTagConfig) {
        LiveCoreEventForRecoTagConfigSetting.LiveCoreEventForRecoTagConfig liveCoreEventForRecoTagConfig2 = liveCoreEventForRecoTagConfig;
        if (liveCoreEventForRecoTagConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("core_event_set");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveCoreEventForRecoTagConfig2.getEventWhiteList(), String.class);
        c09dl.LJII();
    }
}
