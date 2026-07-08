package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class VoiceLayoutParam_OptTypeAdapter extends TypeAdapter<VoiceLayoutParam> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final VoiceLayoutParam read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        VoiceLayoutParam voiceLayoutParam = new VoiceLayoutParam(9, "3001", 2, 0.58f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1374441904:
                        if (strLJJJJ.equals("layout_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                voiceLayoutParam.layoutId = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -914519624:
                        if (strLJJJJ.equals("display_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                voiceLayoutParam.displayId = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -678927291:
                        if (strLJJJJ.equals("percent")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                voiceLayoutParam.percent = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1706030500:
                        if (strLJJJJ.equals("max_position")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                voiceLayoutParam.maxPosition = c09cu.LJJIZ();
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
        return voiceLayoutParam;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, VoiceLayoutParam voiceLayoutParam) {
        VoiceLayoutParam voiceLayoutParam2 = voiceLayoutParam;
        if (voiceLayoutParam2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("max_position");
        c09dl.LJJJJ(Integer.valueOf(voiceLayoutParam2.maxPosition));
        c09dl.LJIILLIIL("layout_id");
        c09dl.LJJJJJ(voiceLayoutParam2.layoutId);
        c09dl.LJIILLIIL("display_id");
        c09dl.LJJJJ(Integer.valueOf(voiceLayoutParam2.displayId));
        c09dl.LJIILLIIL("percent");
        c09dl.LJJJJ(Float.valueOf(voiceLayoutParam2.percent));
        c09dl.LJII();
    }
}
