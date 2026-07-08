package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautyCameraParams;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveAIBeautyCameraParams_AIBeautyCameraParamList_OptTypeAdapter extends TypeAdapter<LiveAIBeautyCameraParams.AIBeautyCameraParamList> {
    public final Gson LIZ;

    public LiveAIBeautyCameraParams_AIBeautyCameraParamList_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveAIBeautyCameraParams.AIBeautyCameraParamList read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAIBeautyCameraParams.AIBeautyCameraParamList aIBeautyCameraParamList = new LiveAIBeautyCameraParams.AIBeautyCameraParamList(null, null, null, null, null, null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1267206133:
                        if (strLJJJJ.equals("opacity")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyCameraParamList.setOpacity((LiveAIBeautyCameraParams.CameraParams) this.LIZ.LJIIJ(LiveAIBeautyCameraParams.CameraParams.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1261829310:
                        if (strLJJJJ.equals("addColor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyCameraParamList.setAddColor((LiveAIBeautyCameraParams.CameraParams) this.LIZ.LJIIJ(LiveAIBeautyCameraParams.CameraParams.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -421782861:
                        if (strLJJJJ.equals("constrast")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyCameraParamList.setContrast((LiveAIBeautyCameraParams.CameraParams) this.LIZ.LJIIJ(LiveAIBeautyCameraParams.CameraParams.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -230491182:
                        if (strLJJJJ.equals("saturation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyCameraParamList.setSaturation((LiveAIBeautyCameraParams.CameraParams) this.LIZ.LJIIJ(LiveAIBeautyCameraParams.CameraParams.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 98120615:
                        if (strLJJJJ.equals("gamma")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyCameraParamList.setGamma((LiveAIBeautyCameraParams.CameraParams) this.LIZ.LJIIJ(LiveAIBeautyCameraParams.CameraParams.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 298795626:
                        if (strLJJJJ.equals("hueShift")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyCameraParamList.setHueShift((LiveAIBeautyCameraParams.CameraParams) this.LIZ.LJIIJ(LiveAIBeautyCameraParams.CameraParams.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 608752127:
                        if (strLJJJJ.equals("mulColor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyCameraParamList.setMulColor((LiveAIBeautyCameraParams.CameraParams) this.LIZ.LJIIJ(LiveAIBeautyCameraParams.CameraParams.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 648162385:
                        if (strLJJJJ.equals("brightness")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyCameraParamList.setBrightness((LiveAIBeautyCameraParams.CameraParams) this.LIZ.LJIIJ(LiveAIBeautyCameraParams.CameraParams.class).read(c09cu));
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
        return aIBeautyCameraParamList;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAIBeautyCameraParams.AIBeautyCameraParamList aIBeautyCameraParamList) {
        LiveAIBeautyCameraParams.AIBeautyCameraParamList aIBeautyCameraParamList2 = aIBeautyCameraParamList;
        if (aIBeautyCameraParamList2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("gamma");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(LiveAIBeautyCameraParams.CameraParams.class);
        typeAdapterLJIIJ.write(c09dl, aIBeautyCameraParamList2.getGamma());
        c09dl.LJIILLIIL("brightness");
        typeAdapterLJIIJ.write(c09dl, aIBeautyCameraParamList2.getBrightness());
        c09dl.LJIILLIIL("constrast");
        typeAdapterLJIIJ.write(c09dl, aIBeautyCameraParamList2.getContrast());
        c09dl.LJIILLIIL("saturation");
        typeAdapterLJIIJ.write(c09dl, aIBeautyCameraParamList2.getSaturation());
        c09dl.LJIILLIIL("hueShift");
        typeAdapterLJIIJ.write(c09dl, aIBeautyCameraParamList2.getHueShift());
        c09dl.LJIILLIIL("opacity");
        typeAdapterLJIIJ.write(c09dl, aIBeautyCameraParamList2.getOpacity());
        c09dl.LJIILLIIL("addColor");
        typeAdapterLJIIJ.write(c09dl, aIBeautyCameraParamList2.getAddColor());
        c09dl.LJIILLIIL("mulColor");
        typeAdapterLJIIJ.write(c09dl, aIBeautyCameraParamList2.getMulColor());
        c09dl.LJII();
    }
}
