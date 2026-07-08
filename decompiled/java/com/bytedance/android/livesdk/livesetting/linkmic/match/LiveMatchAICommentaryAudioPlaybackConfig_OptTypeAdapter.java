package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveMatchAICommentaryAudioPlaybackConfig_OptTypeAdapter extends TypeAdapter<LiveMatchAICommentaryAudioPlaybackConfig> {
    public final Gson LIZ;

    public LiveMatchAICommentaryAudioPlaybackConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMatchAICommentaryAudioPlaybackConfig read(C09CU c09cu) {
        LiveMatchAICommentaryAudioPlaybackConfig liveMatchAICommentaryAudioPlaybackConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveMatchAICommentaryAudioPlaybackConfig = new LiveMatchAICommentaryAudioPlaybackConfig(true, 3000.0f);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "play_timeout_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMatchAICommentaryAudioPlaybackConfig.play_timeout_enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "play_timeout_extra_time_ms")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMatchAICommentaryAudioPlaybackConfig.play_timeout_extra_time_ms = (float) c09cu.LJJIL();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveMatchAICommentaryAudioPlaybackConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchAICommentaryAudioPlaybackConfig liveMatchAICommentaryAudioPlaybackConfig) throws IOException {
        LiveMatchAICommentaryAudioPlaybackConfig liveMatchAICommentaryAudioPlaybackConfig2 = liveMatchAICommentaryAudioPlaybackConfig;
        if (liveMatchAICommentaryAudioPlaybackConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("play_timeout_enable");
        c09dl.LJJJJJL(liveMatchAICommentaryAudioPlaybackConfig2.play_timeout_enable);
        c09dl.LJIILLIIL("play_timeout_extra_time_ms");
        c09dl.LJJJJ(Float.valueOf(liveMatchAICommentaryAudioPlaybackConfig2.play_timeout_extra_time_ms));
        c09dl.LJII();
    }
}
