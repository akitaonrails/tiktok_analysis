package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautyVEBmfParams;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveAIBeautyVEBmfParams_AIBeautyVEParamList_OptTypeAdapter extends TypeAdapter<LiveAIBeautyVEBmfParams.AIBeautyVEParamList> {
    public final Gson LIZ;

    public LiveAIBeautyVEBmfParams_AIBeautyVEParamList_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveAIBeautyVEBmfParams.AIBeautyVEParamList read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAIBeautyVEBmfParams.AIBeautyVEParamList aIBeautyVEParamList = new LiveAIBeautyVEBmfParams.AIBeautyVEParamList(0, 0, 0, 0, 0, "", "", 0, new LiveAIBeautyVEBmfParams.AesBoostAlgType(0, null, null, 7, null));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2129366492:
                        if (strLJJJJ.equals("modeDownloadUrl")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyVEParamList.setModeDownloadUrl(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -2115058085:
                        if (strLJJJJ.equals("accessKey")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyVEParamList.setAccessKey(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1002772407:
                        if (strLJJJJ.equals("algorithmType")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyVEParamList.setAlgorithmType(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -906066005:
                        if (strLJJJJ.equals("maxHeight")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyVEParamList.setMaxHeight(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -347208044:
                        if (strLJJJJ.equals("backend")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyVEParamList.setBackend(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -326341958:
                        if (strLJJJJ.equals("aesBoostParams")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyVEParamList.setAesBoostParams((LiveAIBeautyVEBmfParams.AesBoostAlgType) this.LIZ.LJIIJ(LiveAIBeautyVEBmfParams.AesBoostAlgType.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 400381634:
                        if (strLJJJJ.equals("maxWidth")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyVEParamList.setMaxWidth(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 635076157:
                        if (strLJJJJ.equals("poolSize")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyVEParamList.setPoolSize(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2096262050:
                        if (strLJJJJ.equals("texProcessType")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aIBeautyVEParamList.setTexProcessType(c09cu.LJJIZ());
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
        return aIBeautyVEParamList;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAIBeautyVEBmfParams.AIBeautyVEParamList aIBeautyVEParamList) {
        LiveAIBeautyVEBmfParams.AIBeautyVEParamList aIBeautyVEParamList2 = aIBeautyVEParamList;
        if (aIBeautyVEParamList2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("algorithmType");
        c09dl.LJJJJ(Integer.valueOf(aIBeautyVEParamList2.getAlgorithmType()));
        c09dl.LJIILLIIL("backend");
        c09dl.LJJJJ(Integer.valueOf(aIBeautyVEParamList2.getBackend()));
        c09dl.LJIILLIIL("poolSize");
        c09dl.LJJJJ(Integer.valueOf(aIBeautyVEParamList2.getPoolSize()));
        c09dl.LJIILLIIL("maxWidth");
        c09dl.LJJJJ(Integer.valueOf(aIBeautyVEParamList2.getMaxWidth()));
        c09dl.LJIILLIIL("maxHeight");
        c09dl.LJJJJ(Integer.valueOf(aIBeautyVEParamList2.getMaxHeight()));
        c09dl.LJIILLIIL("modeDownloadUrl");
        c09dl.LJJJJJ(aIBeautyVEParamList2.getModeDownloadUrl());
        c09dl.LJIILLIIL("accessKey");
        c09dl.LJJJJJ(aIBeautyVEParamList2.getAccessKey());
        c09dl.LJIILLIIL("texProcessType");
        c09dl.LJJJJ(Integer.valueOf(aIBeautyVEParamList2.getTexProcessType()));
        c09dl.LJIILLIIL("aesBoostParams");
        this.LIZ.LJIIJ(LiveAIBeautyVEBmfParams.AesBoostAlgType.class).write(c09dl, aIBeautyVEParamList2.getAesBoostParams());
        c09dl.LJII();
    }
}
