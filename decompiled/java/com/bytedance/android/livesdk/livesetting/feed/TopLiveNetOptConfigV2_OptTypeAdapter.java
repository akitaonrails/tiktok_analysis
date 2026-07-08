package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class TopLiveNetOptConfigV2_OptTypeAdapter extends TypeAdapter<TopLiveNetOptConfigV2> {
    public final Gson LIZ;

    public TopLiveNetOptConfigV2_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TopLiveNetOptConfigV2 read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TopLiveNetOptConfigV2 topLiveNetOptConfigV2 = new TopLiveNetOptConfigV2();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -723757735) {
                    if (iHashCode != -341137609) {
                        if (iHashCode == 1062630055 && strLJJJJ.equals("opt_go_live_request")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveNetOptConfigV2.setOptGoLiveRequest(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("not_close_sky_on_net_error")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            topLiveNetOptConfigV2.setNotCloseSkyWhenNetError(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("opt_pip_on_resume")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        topLiveNetOptConfigV2.setOptPipOnResume(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return topLiveNetOptConfigV2;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TopLiveNetOptConfigV2 topLiveNetOptConfigV2) throws IOException {
        TopLiveNetOptConfigV2 topLiveNetOptConfigV22 = topLiveNetOptConfigV2;
        if (topLiveNetOptConfigV22 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("opt_go_live_request");
        c09dl.LJJJJJL(topLiveNetOptConfigV22.getOptGoLiveRequest());
        c09dl.LJIILLIIL("not_close_sky_on_net_error");
        c09dl.LJJJJJL(topLiveNetOptConfigV22.getNotCloseSkyWhenNetError());
        c09dl.LJIILLIIL("opt_pip_on_resume");
        c09dl.LJJJJJL(topLiveNetOptConfigV22.getOptPipOnResume());
        c09dl.LJII();
    }
}
