package com.bytedance.android.livesdk.livesetting.highlight;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class VideoPreloadConfig_OptTypeAdapter extends TypeAdapter<VideoPreloadConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final VideoPreloadConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        VideoPreloadConfig videoPreloadConfig = new VideoPreloadConfig(0, 3, 3, 512);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1521307602:
                        if (strLJJJJ.equals("is_preload_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                videoPreloadConfig.isPreloadEnable = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1489732722:
                        if (strLJJJJ.equals("preload_highlight_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                videoPreloadConfig.preloadHighlightCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1228405459:
                        if (strLJJJJ.equals("preload_replay_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                videoPreloadConfig.preloadReplayCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 54071611:
                        if (strLJJJJ.equals("preload_video_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                videoPreloadConfig.preloadVideoSize = c09cu.LJJIZ();
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
        return videoPreloadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, VideoPreloadConfig videoPreloadConfig) {
        VideoPreloadConfig videoPreloadConfig2 = videoPreloadConfig;
        if (videoPreloadConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_preload_enable");
        c09dl.LJJJJ(Integer.valueOf(videoPreloadConfig2.isPreloadEnable));
        c09dl.LJIILLIIL("preload_replay_count");
        c09dl.LJJJJ(Integer.valueOf(videoPreloadConfig2.preloadReplayCount));
        c09dl.LJIILLIIL("preload_highlight_count");
        c09dl.LJJJJ(Integer.valueOf(videoPreloadConfig2.preloadHighlightCount));
        c09dl.LJIILLIIL("preload_video_size");
        c09dl.LJJJJ(Integer.valueOf(videoPreloadConfig2.preloadVideoSize));
        c09dl.LJII();
    }
}
