package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveMessageSampleRatio_OptTypeAdapter extends TypeAdapter<LiveMessageSampleRatio> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMessageSampleRatio read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMessageSampleRatio liveMessageSampleRatio = new LiveMessageSampleRatio(0L, 0L, 0L, 1000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1132661299:
                        if (strLJJJJ.equals("msg_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageSampleRatio.setMsgRatio(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -586860318:
                        if (strLJJJJ.equals("device_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageSampleRatio.setDeviceRatio(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -476538595:
                        if (strLJJJJ.equals("base_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageSampleRatio.setBaseRatio(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1933335191:
                        if (strLJJJJ.equals("user_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageSampleRatio.setUserRatio(c09cu.LJJJ());
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
        return liveMessageSampleRatio;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMessageSampleRatio liveMessageSampleRatio) throws IOException {
        LiveMessageSampleRatio liveMessageSampleRatio2 = liveMessageSampleRatio;
        if (liveMessageSampleRatio2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("msg_ratio");
        c09dl.LJJIZ(liveMessageSampleRatio2.getMsgRatio());
        c09dl.LJIILLIIL("device_ratio");
        c09dl.LJJIZ(liveMessageSampleRatio2.getDeviceRatio());
        c09dl.LJIILLIIL("user_ratio");
        c09dl.LJJIZ(liveMessageSampleRatio2.getUserRatio());
        c09dl.LJIILLIIL("base_ratio");
        c09dl.LJJIZ(liveMessageSampleRatio2.getBaseRatio());
        c09dl.LJII();
    }
}
