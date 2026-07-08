package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveAboutMeMergeConfig_OptTypeAdapter extends TypeAdapter<LiveAboutMeMergeConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveAboutMeMergeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAboutMeMergeConfig liveAboutMeMergeConfig = new LiveAboutMeMergeConfig("", "", "", "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1355851121:
                        if (strLJJJJ.equals("url_popup_live_sheet")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAboutMeMergeConfig.urlPopupLiveSheet = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1060221358:
                        if (strLJJJJ.equals("url_upgrade_popup_live_sheet")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAboutMeMergeConfig.urlUpgradePopupLiveSheet = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -149577589:
                        if (strLJJJJ.equals("url_fullscreen")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAboutMeMergeConfig.urlFullscreen = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -14120484:
                        if (strLJJJJ.equals("url_popup")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAboutMeMergeConfig.urlPopup = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1677480441:
                        if (strLJJJJ.equals("url_upgrade_popup")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAboutMeMergeConfig.urlUpgradePopup = c09cu.LJJJZ();
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
        return liveAboutMeMergeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAboutMeMergeConfig liveAboutMeMergeConfig) {
        LiveAboutMeMergeConfig liveAboutMeMergeConfig2 = liveAboutMeMergeConfig;
        if (liveAboutMeMergeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("url_popup");
        c09dl.LJJJJJ(liveAboutMeMergeConfig2.urlPopup);
        c09dl.LJIILLIIL("url_popup_live_sheet");
        c09dl.LJJJJJ(liveAboutMeMergeConfig2.urlPopupLiveSheet);
        c09dl.LJIILLIIL("url_fullscreen");
        c09dl.LJJJJJ(liveAboutMeMergeConfig2.urlFullscreen);
        c09dl.LJIILLIIL("url_upgrade_popup");
        c09dl.LJJJJJ(liveAboutMeMergeConfig2.urlUpgradePopup);
        c09dl.LJIILLIIL("url_upgrade_popup_live_sheet");
        c09dl.LJJJJJ(liveAboutMeMergeConfig2.urlUpgradePopupLiveSheet);
        c09dl.LJII();
    }
}
