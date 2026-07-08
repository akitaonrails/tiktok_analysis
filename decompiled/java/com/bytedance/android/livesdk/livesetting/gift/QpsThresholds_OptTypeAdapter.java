package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class QpsThresholds_OptTypeAdapter extends TypeAdapter<QpsThresholds> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final QpsThresholds read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        QpsThresholds qpsThresholds = new QpsThresholds();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -857685939:
                        if (strLJJJJ.equals("enter_qps")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                qpsThresholds.enterQps = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 849688229:
                        if (strLJJJJ.equals("gift_qps")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                qpsThresholds.giftQPs = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1103098252:
                        if (strLJJJJ.equals("like_qps")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                qpsThresholds.likeQps = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1437732045:
                        if (strLJJJJ.equals("chat_qps")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                qpsThresholds.chatQps = (float) c09cu.LJJIL();
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
        return qpsThresholds;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, QpsThresholds qpsThresholds) {
        QpsThresholds qpsThresholds2 = qpsThresholds;
        if (qpsThresholds2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enter_qps");
        c09dl.LJJJJ(Float.valueOf(qpsThresholds2.enterQps));
        c09dl.LJIILLIIL("chat_qps");
        c09dl.LJJJJ(Float.valueOf(qpsThresholds2.chatQps));
        c09dl.LJIILLIIL("gift_qps");
        c09dl.LJJJJ(Float.valueOf(qpsThresholds2.giftQPs));
        c09dl.LJIILLIIL("like_qps");
        c09dl.LJJJJ(Float.valueOf(qpsThresholds2.likeQps));
        c09dl.LJII();
    }
}
