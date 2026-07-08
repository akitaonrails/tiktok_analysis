package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautyVEBmfParams;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveAIBeautyVEBmfParams_AesBoostAlgType_OptTypeAdapter extends TypeAdapter<LiveAIBeautyVEBmfParams.AesBoostAlgType> {
    public final Gson LIZ;

    public LiveAIBeautyVEBmfParams_AesBoostAlgType_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveAIBeautyVEBmfParams.AesBoostAlgType read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAIBeautyVEBmfParams.AesBoostAlgType aesBoostAlgType = new LiveAIBeautyVEBmfParams.AesBoostAlgType(0, null, null, 7, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1649933246) {
                    if (iHashCode != 506340281) {
                        if (iHashCode == 2069134598 && strLJJJJ.equals("modelNamePrefix")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aesBoostAlgType.setModelNamePrefix(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("groupIds")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            aesBoostAlgType.setGroupIds(C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE));
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("aesBoostAlgType")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        aesBoostAlgType.setAesBoostAlgType(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return aesBoostAlgType;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAIBeautyVEBmfParams.AesBoostAlgType aesBoostAlgType) {
        LiveAIBeautyVEBmfParams.AesBoostAlgType aesBoostAlgType2 = aesBoostAlgType;
        if (aesBoostAlgType2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("aesBoostAlgType");
        c09dl.LJJJJ(Integer.valueOf(aesBoostAlgType2.getAesBoostAlgType()));
        c09dl.LJIILLIIL("groupIds");
        C473040Igo.LIZLLL(this.LIZ, c09dl, aesBoostAlgType2.getGroupIds(), Integer.TYPE);
        c09dl.LJIILLIIL("modelNamePrefix");
        c09dl.LJJJJJ(aesBoostAlgType2.getModelNamePrefix());
        c09dl.LJII();
    }
}
