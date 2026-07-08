package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautyCameraParams;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveAIBeautyCameraParams_CameraParams_OptTypeAdapter extends TypeAdapter<LiveAIBeautyCameraParams.CameraParams> {
    @Override // com.google.gson.TypeAdapter
    public final LiveAIBeautyCameraParams.CameraParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAIBeautyCameraParams.CameraParams cameraParams = new LiveAIBeautyCameraParams.CameraParams(-999.0f, 0.0f, 0.0f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 107876) {
                    if (iHashCode != 108114) {
                        if (iHashCode == 111972721 && strLJJJJ.equals("value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                cameraParams.setValue((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("min")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            cameraParams.setMin((float) c09cu.LJJIL());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("max")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        cameraParams.setMax((float) c09cu.LJJIL());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return cameraParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAIBeautyCameraParams.CameraParams cameraParams) {
        LiveAIBeautyCameraParams.CameraParams cameraParams2 = cameraParams;
        if (cameraParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("value");
        c09dl.LJJJJ(Float.valueOf(cameraParams2.getValue()));
        c09dl.LJIILLIIL("min");
        c09dl.LJJJJ(Float.valueOf(cameraParams2.getMin()));
        c09dl.LJIILLIIL("max");
        c09dl.LJJJJ(Float.valueOf(cameraParams2.getMax()));
        c09dl.LJII();
    }
}
