package com.bytedance.android.livesdk.livesetting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class MultiGuestLayoutMonitorInfo_OptTypeAdapter extends TypeAdapter<MultiGuestLayoutMonitorInfo> {
    public final Gson LIZ;

    public MultiGuestLayoutMonitorInfo_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestLayoutMonitorInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestLayoutMonitorInfo multiGuestLayoutMonitorInfo = new MultiGuestLayoutMonitorInfo(true, 10L, 10L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -889473228) {
                    if (iHashCode != 201702376) {
                        if (iHashCode == 1694290147 && strLJJJJ.equals("layout_flick_threshold_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestLayoutMonitorInfo.setLayoutFlickThresholdMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("bg_flick_threshold_ms")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            multiGuestLayoutMonitorInfo.setBgFlickThresholdMs(c09cu.LJJJ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("switch")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestLayoutMonitorInfo.setSwitch(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return multiGuestLayoutMonitorInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestLayoutMonitorInfo multiGuestLayoutMonitorInfo) throws IOException {
        MultiGuestLayoutMonitorInfo multiGuestLayoutMonitorInfo2 = multiGuestLayoutMonitorInfo;
        if (multiGuestLayoutMonitorInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("switch");
        c09dl.LJJJJJL(multiGuestLayoutMonitorInfo2.getSwitch());
        c09dl.LJIILLIIL("layout_flick_threshold_ms");
        c09dl.LJJIZ(multiGuestLayoutMonitorInfo2.getLayoutFlickThresholdMs());
        c09dl.LJIILLIIL("bg_flick_threshold_ms");
        c09dl.LJJIZ(multiGuestLayoutMonitorInfo2.getBgFlickThresholdMs());
        c09dl.LJII();
    }
}
