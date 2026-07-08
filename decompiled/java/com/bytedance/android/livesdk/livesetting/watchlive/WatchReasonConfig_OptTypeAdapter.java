package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class WatchReasonConfig_OptTypeAdapter extends TypeAdapter<WatchReasonConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final WatchReasonConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        WatchReasonConfig watchReasonConfig = new WatchReasonConfig(0, 0, 2000L, 10000L, 0, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1362672412:
                        if (strLJJJJ.equals("preview_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                watchReasonConfig.previewTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -253466138:
                        if (strLJJJJ.equals("inner_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                watchReasonConfig.innerCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -211363491:
                        if (strLJJJJ.equals("sub_title_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                watchReasonConfig.subTitleDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 691315160:
                        if (strLJJJJ.equals("preview_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                watchReasonConfig.previewCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 823608086:
                        if (strLJJJJ.equals("inner_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                watchReasonConfig.innerTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1179182970:
                        if (strLJJJJ.equals("sub_title_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                watchReasonConfig.subTitleDuration = c09cu.LJJJ();
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
        return watchReasonConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, WatchReasonConfig watchReasonConfig) throws IOException {
        WatchReasonConfig watchReasonConfig2 = watchReasonConfig;
        if (watchReasonConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("preview_time");
        c09dl.LJJJJ(Integer.valueOf(watchReasonConfig2.previewTime));
        c09dl.LJIILLIIL("preview_count");
        c09dl.LJJJJ(Integer.valueOf(watchReasonConfig2.previewCount));
        c09dl.LJIILLIIL("sub_title_delay");
        c09dl.LJJIZ(watchReasonConfig2.subTitleDelay);
        c09dl.LJIILLIIL("sub_title_duration");
        c09dl.LJJIZ(watchReasonConfig2.subTitleDuration);
        c09dl.LJIILLIIL("inner_time");
        c09dl.LJJJJ(Integer.valueOf(watchReasonConfig2.innerTime));
        c09dl.LJIILLIIL("inner_count");
        c09dl.LJJJJ(Integer.valueOf(watchReasonConfig2.innerCount));
        c09dl.LJII();
    }
}
