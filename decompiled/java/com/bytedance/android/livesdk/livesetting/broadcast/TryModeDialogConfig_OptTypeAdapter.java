package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public final class TryModeDialogConfig_OptTypeAdapter extends TypeAdapter<TryModeDialogConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TryModeDialogConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TryModeDialogConfig tryModeDialogConfig = new TryModeDialogConfig(0, 30L, 5L, 60L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -664347352:
                        if (strLJJJJ.equals("short_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeDialogConfig.setShortestDuration(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 111972721:
                        if (strLJJJJ.equals("value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeDialogConfig.setValue(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1312896174:
                        if (strLJJJJ.equals("action_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeDialogConfig.setMotionDuration(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1619254056:
                        if (strLJJJJ.equals("long_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeDialogConfig.setLongestDuration(c09cu.LJJJ());
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
        return tryModeDialogConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TryModeDialogConfig tryModeDialogConfig) throws IOException {
        TryModeDialogConfig tryModeDialogConfig2 = tryModeDialogConfig;
        if (tryModeDialogConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("value");
        c09dl.LJJJJ(Integer.valueOf(tryModeDialogConfig2.getValue()));
        c09dl.LJIILLIIL("short_interval");
        c09dl.LJJIZ(tryModeDialogConfig2.getShortestDuration());
        c09dl.LJIILLIIL("action_interval");
        c09dl.LJJIZ(tryModeDialogConfig2.getMotionDuration());
        c09dl.LJIILLIIL("long_interval");
        c09dl.LJJIZ(tryModeDialogConfig2.getLongestDuration());
        c09dl.LJII();
    }
}
