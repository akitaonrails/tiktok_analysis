package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAigcWallpaperConfigSetting;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestAigcWallpaperConfigSetting_MultiGuestAigcWallpaperConfigBean_OptTypeAdapter extends TypeAdapter<MultiGuestAigcWallpaperConfigSetting.MultiGuestAigcWallpaperConfigBean> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestAigcWallpaperConfigSetting.MultiGuestAigcWallpaperConfigBean read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestAigcWallpaperConfigSetting.MultiGuestAigcWallpaperConfigBean multiGuestAigcWallpaperConfigBean = new MultiGuestAigcWallpaperConfigSetting.MultiGuestAigcWallpaperConfigBean(0L, 5L, 300L, 3, 15, 3);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1891048267:
                        if (strLJJJJ.equals("audience_wait_accept_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAigcWallpaperConfigBean.invitedDialogCountDownTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1645576660:
                        if (strLJJJJ.equals("anchor_game_end_delay_show_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAigcWallpaperConfigBean.anchorEndGameDelayTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1064359208:
                        if (strLJJJJ.equals("audience_delay_show_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAigcWallpaperConfigBean.invitedDialogDelayTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -381574040:
                        if (strLJJJJ.equals("audience_each_round_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAigcWallpaperConfigBean.eachRoundTotalTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1270041481:
                        if (strLJJJJ.equals("wallpaper_create_timeout_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAigcWallpaperConfigBean.createTimeout = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1909674212:
                        if (strLJJJJ.equals("audience_play_max_retry_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAigcWallpaperConfigBean.maxRetryCount = c09cu.LJJIZ();
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
        return multiGuestAigcWallpaperConfigBean;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestAigcWallpaperConfigSetting.MultiGuestAigcWallpaperConfigBean multiGuestAigcWallpaperConfigBean) throws IOException {
        MultiGuestAigcWallpaperConfigSetting.MultiGuestAigcWallpaperConfigBean multiGuestAigcWallpaperConfigBean2 = multiGuestAigcWallpaperConfigBean;
        if (multiGuestAigcWallpaperConfigBean2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("audience_delay_show_time");
        c09dl.LJJIZ(multiGuestAigcWallpaperConfigBean2.invitedDialogDelayTime);
        c09dl.LJIILLIIL("audience_wait_accept_time");
        c09dl.LJJIZ(multiGuestAigcWallpaperConfigBean2.invitedDialogCountDownTime);
        c09dl.LJIILLIIL("audience_each_round_duration");
        c09dl.LJJIZ(multiGuestAigcWallpaperConfigBean2.eachRoundTotalTime);
        c09dl.LJIILLIIL("audience_play_max_retry_times");
        c09dl.LJJJJ(Integer.valueOf(multiGuestAigcWallpaperConfigBean2.maxRetryCount));
        c09dl.LJIILLIIL("wallpaper_create_timeout_interval");
        c09dl.LJJJJ(Integer.valueOf(multiGuestAigcWallpaperConfigBean2.createTimeout));
        c09dl.LJIILLIIL("anchor_game_end_delay_show_time");
        c09dl.LJJJJ(Integer.valueOf(multiGuestAigcWallpaperConfigBean2.anchorEndGameDelayTime));
        c09dl.LJII();
    }
}
