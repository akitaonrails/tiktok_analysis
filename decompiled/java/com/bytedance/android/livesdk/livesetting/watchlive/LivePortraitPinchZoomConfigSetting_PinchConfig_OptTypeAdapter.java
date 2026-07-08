package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePortraitPinchZoomConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePortraitPinchZoomConfigSetting_PinchConfig_OptTypeAdapter extends TypeAdapter<LivePortraitPinchZoomConfigSetting.PinchConfig> {
    public final Gson LIZ;

    public LivePortraitPinchZoomConfigSetting_PinchConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePortraitPinchZoomConfigSetting.PinchConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePortraitPinchZoomConfigSetting.PinchConfig pinchConfig = new LivePortraitPinchZoomConfigSetting.PinchConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1683782399:
                        if (strLJJJJ.equals("enable_only_in_clear_screen_mode")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pinchConfig.enableOnlyInClearScreen = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1359193867:
                        if (strLJJJJ.equals("portrait_max_scale")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pinchConfig.portraitMaxScale = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1598725458:
                        if (strLJJJJ.equals("enable_portrait_pinch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pinchConfig.enablePinch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2131672441:
                        if (strLJJJJ.equals("portrait_min_scale")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pinchConfig.portraitMinScale = (float) c09cu.LJJIL();
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
        return pinchConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePortraitPinchZoomConfigSetting.PinchConfig pinchConfig) throws IOException {
        LivePortraitPinchZoomConfigSetting.PinchConfig pinchConfig2 = pinchConfig;
        if (pinchConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("portrait_max_scale");
        c09dl.LJJJJ(Float.valueOf(pinchConfig2.portraitMaxScale));
        c09dl.LJIILLIIL("portrait_min_scale");
        c09dl.LJJJJ(Float.valueOf(pinchConfig2.portraitMinScale));
        c09dl.LJIILLIIL("enable_portrait_pinch");
        c09dl.LJJJJJL(pinchConfig2.enablePinch);
        c09dl.LJIILLIIL("enable_only_in_clear_screen_mode");
        c09dl.LJJJJJL(pinchConfig2.enableOnlyInClearScreen);
        c09dl.LJII();
    }
}
