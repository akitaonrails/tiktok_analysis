package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchInviteMockApiRequestFailData_OptTypeAdapter extends TypeAdapter<LiveMatchInviteMockApiRequestFailData> {
    public final Gson LIZ;

    public LiveMatchInviteMockApiRequestFailData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMatchInviteMockApiRequestFailData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchInviteMockApiRequestFailData liveMatchInviteMockApiRequestFailData = new LiveMatchInviteMockApiRequestFailData(false, 4029011, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != 329035797) {
                        if (iHashCode == 653451877 && strLJJJJ.equals("mockResend")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchInviteMockApiRequestFailData.mockResend = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("errorCode")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveMatchInviteMockApiRequestFailData.errorCode = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMatchInviteMockApiRequestFailData.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveMatchInviteMockApiRequestFailData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchInviteMockApiRequestFailData liveMatchInviteMockApiRequestFailData) throws IOException {
        LiveMatchInviteMockApiRequestFailData liveMatchInviteMockApiRequestFailData2 = liveMatchInviteMockApiRequestFailData;
        if (liveMatchInviteMockApiRequestFailData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveMatchInviteMockApiRequestFailData2.enable);
        c09dl.LJIILLIIL("errorCode");
        c09dl.LJJJJ(Integer.valueOf(liveMatchInviteMockApiRequestFailData2.errorCode));
        c09dl.LJIILLIIL("mockResend");
        c09dl.LJJJJJL(liveMatchInviteMockApiRequestFailData2.mockResend);
        c09dl.LJII();
    }
}
