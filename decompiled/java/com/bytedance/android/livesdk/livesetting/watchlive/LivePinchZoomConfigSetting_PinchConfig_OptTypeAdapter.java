package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePinchZoomConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePinchZoomConfigSetting_PinchConfig_OptTypeAdapter extends TypeAdapter<LivePinchZoomConfigSetting.PinchConfig> {
    public final Gson LIZ;

    public LivePinchZoomConfigSetting_PinchConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePinchZoomConfigSetting.PinchConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePinchZoomConfigSetting.PinchConfig pinchConfig = new LivePinchZoomConfigSetting.PinchConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -800098773:
                        if (strLJJJJ.equals("landscape_max_scale")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pinchConfig.landscapeMaxScale = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -270082182:
                        if (strLJJJJ.equals("enable_landscape_pinch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pinchConfig.enableLandscape = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -27620199:
                        if (strLJJJJ.equals("landscape_min_scale")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pinchConfig.landscapeMinScale = (float) c09cu.LJJIL();
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
                                pinchConfig.enablePortrait = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
    public final void write(C09DL c09dl, LivePinchZoomConfigSetting.PinchConfig pinchConfig) throws IOException {
        LivePinchZoomConfigSetting.PinchConfig pinchConfig2 = pinchConfig;
        if (pinchConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_portrait_pinch");
        c09dl.LJJJJJL(pinchConfig2.enablePortrait);
        c09dl.LJIILLIIL("portrait_max_scale");
        c09dl.LJJJJ(Float.valueOf(pinchConfig2.portraitMaxScale));
        c09dl.LJIILLIIL("portrait_min_scale");
        c09dl.LJJJJ(Float.valueOf(pinchConfig2.portraitMinScale));
        c09dl.LJIILLIIL("enable_landscape_pinch");
        c09dl.LJJJJJL(pinchConfig2.enableLandscape);
        c09dl.LJIILLIIL("landscape_max_scale");
        c09dl.LJJJJ(Float.valueOf(pinchConfig2.landscapeMaxScale));
        c09dl.LJIILLIIL("landscape_min_scale");
        c09dl.LJJJJ(Float.valueOf(pinchConfig2.landscapeMinScale));
        c09dl.LJII();
    }
}
