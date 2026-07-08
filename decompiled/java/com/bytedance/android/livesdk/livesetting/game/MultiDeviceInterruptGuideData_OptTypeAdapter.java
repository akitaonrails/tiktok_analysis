package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes15.dex */
public final class MultiDeviceInterruptGuideData_OptTypeAdapter extends TypeAdapter<MultiDeviceInterruptGuideData> {
    public final Gson LIZ;

    public MultiDeviceInterruptGuideData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiDeviceInterruptGuideData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiDeviceInterruptGuideData multiDeviceInterruptGuideData = new MultiDeviceInterruptGuideData(0, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -2076094036) {
                    if (iHashCode != -1923894165) {
                        if (iHashCode == -1298848381 && strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiDeviceInterruptGuideData.enable = Integer.valueOf(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("process_exit_guide")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            multiDeviceInterruptGuideData.processExitGuideList = C473040Igo.LIZ(this.LIZ, c09cu, ProcessExitGuideData.class);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("guide_url")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiDeviceInterruptGuideData.guideUrl = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return multiDeviceInterruptGuideData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiDeviceInterruptGuideData multiDeviceInterruptGuideData) {
        MultiDeviceInterruptGuideData multiDeviceInterruptGuideData2 = multiDeviceInterruptGuideData;
        if (multiDeviceInterruptGuideData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(multiDeviceInterruptGuideData2.enable);
        c09dl.LJIILLIIL("guide_url");
        c09dl.LJJJJJ(multiDeviceInterruptGuideData2.guideUrl);
        c09dl.LJIILLIIL("process_exit_guide");
        C473040Igo.LIZLLL(this.LIZ, c09dl, multiDeviceInterruptGuideData2.processExitGuideList, ProcessExitGuideData.class);
        c09dl.LJII();
    }
}
