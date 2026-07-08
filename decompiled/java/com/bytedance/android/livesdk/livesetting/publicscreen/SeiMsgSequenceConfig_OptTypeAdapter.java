package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class SeiMsgSequenceConfig_OptTypeAdapter extends TypeAdapter<SeiMsgSequenceConfig> {
    @Override // com.google.gson.TypeAdapter
    public final SeiMsgSequenceConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SeiMsgSequenceConfig seiMsgSequenceConfig = new SeiMsgSequenceConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -946425600) {
                    if (iHashCode != 1597580960) {
                        if (iHashCode == 1779127686 && strLJJJJ.equals("report_msg_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                seiMsgSequenceConfig.msgCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("report_msg_id_interval")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            seiMsgSequenceConfig.reportMsgIdInterval = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("report_msg_id_seq_interval")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        seiMsgSequenceConfig.reportMsgIdSeqInterval = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return seiMsgSequenceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SeiMsgSequenceConfig seiMsgSequenceConfig) {
        SeiMsgSequenceConfig seiMsgSequenceConfig2 = seiMsgSequenceConfig;
        if (seiMsgSequenceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("report_msg_id_interval");
        c09dl.LJJJJ(Integer.valueOf(seiMsgSequenceConfig2.reportMsgIdInterval));
        c09dl.LJIILLIIL("report_msg_id_seq_interval");
        c09dl.LJJJJ(Integer.valueOf(seiMsgSequenceConfig2.reportMsgIdSeqInterval));
        c09dl.LJIILLIIL("report_msg_count");
        c09dl.LJJJJ(Integer.valueOf(seiMsgSequenceConfig2.msgCount));
        c09dl.LJII();
    }
}
