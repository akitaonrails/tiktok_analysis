package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePushGuideToFypConfig_OptTypeAdapter extends TypeAdapter<LivePushGuideToFypConfig> {
    public final Gson LIZ;

    public LivePushGuideToFypConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePushGuideToFypConfig read(C09CU c09cu) {
        LivePushGuideToFypConfig livePushGuideToFypConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            livePushGuideToFypConfig = new LivePushGuideToFypConfig(0, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "live_room_count")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePushGuideToFypConfig.liveRoomCount = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "auto_swipe_to_next")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePushGuideToFypConfig.autoSwipeToNext = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return livePushGuideToFypConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePushGuideToFypConfig livePushGuideToFypConfig) throws IOException {
        LivePushGuideToFypConfig livePushGuideToFypConfig2 = livePushGuideToFypConfig;
        if (livePushGuideToFypConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_room_count");
        c09dl.LJJJJ(Integer.valueOf(livePushGuideToFypConfig2.liveRoomCount));
        c09dl.LJIILLIIL("auto_swipe_to_next");
        c09dl.LJJJJJL(livePushGuideToFypConfig2.autoSwipeToNext);
        c09dl.LJII();
    }
}
