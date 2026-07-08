package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class AddNotReceiveFirstFrameExpConf_OptTypeAdapter extends TypeAdapter<AddNotReceiveFirstFrameExpConf> {
    public final Gson LIZ;

    public AddNotReceiveFirstFrameExpConf_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final AddNotReceiveFirstFrameExpConf read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        AddNotReceiveFirstFrameExpConf addNotReceiveFirstFrameExpConf = new AddNotReceiveFirstFrameExpConf(true, 180L, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -2077031716) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == 325120893 && strLJJJJ.equals("report_when_not_reach_frame_linked")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                addNotReceiveFirstFrameExpConf.reportWhenNotReachFrameLinked = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            addNotReceiveFirstFrameExpConf.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("time_out")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        addNotReceiveFirstFrameExpConf.timeOUt = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return addNotReceiveFirstFrameExpConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AddNotReceiveFirstFrameExpConf addNotReceiveFirstFrameExpConf) throws IOException {
        AddNotReceiveFirstFrameExpConf addNotReceiveFirstFrameExpConf2 = addNotReceiveFirstFrameExpConf;
        if (addNotReceiveFirstFrameExpConf2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(addNotReceiveFirstFrameExpConf2.enable);
        c09dl.LJIILLIIL("time_out");
        c09dl.LJJIZ(addNotReceiveFirstFrameExpConf2.timeOUt);
        c09dl.LJIILLIIL("report_when_not_reach_frame_linked");
        c09dl.LJJJJJL(addNotReceiveFirstFrameExpConf2.reportWhenNotReachFrameLinked);
        c09dl.LJII();
    }
}
