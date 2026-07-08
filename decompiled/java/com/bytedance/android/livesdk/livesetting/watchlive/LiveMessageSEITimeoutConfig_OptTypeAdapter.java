package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMessageSEITimeoutConfig_OptTypeAdapter extends TypeAdapter<LiveMessageSEITimeoutConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveMessageSEITimeoutConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMessageSEITimeoutConfig liveMessageSEITimeoutConfig = new LiveMessageSEITimeoutConfig(1.0f, 0L, 8000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1283000954) {
                    if (iHashCode != 3023545) {
                        if (iHashCode == 653829648 && strLJJJJ.equals("multiple")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageSEITimeoutConfig.multiple = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("bias")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveMessageSEITimeoutConfig.bias = c09cu.LJJJ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("max_timeout")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMessageSEITimeoutConfig.maxTimeout = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveMessageSEITimeoutConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMessageSEITimeoutConfig liveMessageSEITimeoutConfig) throws IOException {
        LiveMessageSEITimeoutConfig liveMessageSEITimeoutConfig2 = liveMessageSEITimeoutConfig;
        if (liveMessageSEITimeoutConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("multiple");
        c09dl.LJJJJ(Float.valueOf(liveMessageSEITimeoutConfig2.multiple));
        c09dl.LJIILLIIL("bias");
        c09dl.LJJIZ(liveMessageSEITimeoutConfig2.bias);
        c09dl.LJIILLIIL("max_timeout");
        c09dl.LJJIZ(liveMessageSEITimeoutConfig2.maxTimeout);
        c09dl.LJII();
    }
}
