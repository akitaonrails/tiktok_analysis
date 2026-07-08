package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastSmoothGoLiveConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBroadcastSmoothGoLiveConfigSetting_BroadcastSmoothGoLiveConfig_OptTypeAdapter extends TypeAdapter<LiveBroadcastSmoothGoLiveConfigSetting.BroadcastSmoothGoLiveConfig> {
    public final Gson LIZ;

    public LiveBroadcastSmoothGoLiveConfigSetting_BroadcastSmoothGoLiveConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveBroadcastSmoothGoLiveConfigSetting.BroadcastSmoothGoLiveConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBroadcastSmoothGoLiveConfigSetting.BroadcastSmoothGoLiveConfig broadcastSmoothGoLiveConfig = new LiveBroadcastSmoothGoLiveConfigSetting.BroadcastSmoothGoLiveConfig(false, 1000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable_dirty_len")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    broadcastSmoothGoLiveConfig.enableDirtyLenDetect = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "stream_info_time_out_threshold")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    broadcastSmoothGoLiveConfig.streamInfoTimeOutThreshold = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return broadcastSmoothGoLiveConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveBroadcastSmoothGoLiveConfigSetting.BroadcastSmoothGoLiveConfig broadcastSmoothGoLiveConfig) throws IOException {
        LiveBroadcastSmoothGoLiveConfigSetting.BroadcastSmoothGoLiveConfig broadcastSmoothGoLiveConfig2 = broadcastSmoothGoLiveConfig;
        if (broadcastSmoothGoLiveConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_dirty_len");
        c09dl.LJJJJJL(broadcastSmoothGoLiveConfig2.enableDirtyLenDetect);
        c09dl.LJIILLIIL("stream_info_time_out_threshold");
        c09dl.LJJIZ(broadcastSmoothGoLiveConfig2.streamInfoTimeOutThreshold);
        c09dl.LJII();
    }
}
