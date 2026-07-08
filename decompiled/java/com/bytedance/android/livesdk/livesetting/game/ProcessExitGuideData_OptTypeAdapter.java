package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ProcessExitGuideData_OptTypeAdapter extends TypeAdapter<ProcessExitGuideData> {
    public final Gson LIZ;

    public ProcessExitGuideData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ProcessExitGuideData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ProcessExitGuideData processExitGuideData = new ProcessExitGuideData(null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1938360187) {
                    if (iHashCode != 93997959) {
                        if (iHashCode == 1222565467 && strLJJJJ.equals("exit_description")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                processExitGuideData.exitDescriptionList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("brand")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            processExitGuideData.brand = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("exit_reason")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        processExitGuideData.exitReasonList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return processExitGuideData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ProcessExitGuideData processExitGuideData) {
        ProcessExitGuideData processExitGuideData2 = processExitGuideData;
        if (processExitGuideData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("brand");
        c09dl.LJJJJJ(processExitGuideData2.brand);
        c09dl.LJIILLIIL("exit_reason");
        C473040Igo.LIZLLL(this.LIZ, c09dl, processExitGuideData2.exitReasonList, Integer.TYPE);
        c09dl.LJIILLIIL("exit_description");
        C473040Igo.LIZLLL(this.LIZ, c09dl, processExitGuideData2.exitDescriptionList, String.class);
        c09dl.LJII();
    }
}
