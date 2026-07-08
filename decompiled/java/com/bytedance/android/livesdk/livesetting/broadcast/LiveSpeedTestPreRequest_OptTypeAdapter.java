package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveSpeedTestPreRequest_OptTypeAdapter extends TypeAdapter<LiveSpeedTestPreRequest> {
    public final Gson LIZ;

    public LiveSpeedTestPreRequest_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSpeedTestPreRequest read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSpeedTestPreRequest liveSpeedTestPreRequest = new LiveSpeedTestPreRequest(false, 7.0d, 10.0d);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1410704889) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == 1479345738 && strLJJJJ.equals("available_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSpeedTestPreRequest.setAvailableDuration(c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveSpeedTestPreRequest.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("interval_time")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveSpeedTestPreRequest.setIntervalTime(c09cu.LJJIL());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveSpeedTestPreRequest;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSpeedTestPreRequest liveSpeedTestPreRequest) throws IOException {
        LiveSpeedTestPreRequest liveSpeedTestPreRequest2 = liveSpeedTestPreRequest;
        if (liveSpeedTestPreRequest2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveSpeedTestPreRequest2.getEnable());
        c09dl.LJIILLIIL("interval_time");
        c09dl.LJJIL(liveSpeedTestPreRequest2.getIntervalTime());
        c09dl.LJIILLIIL("available_duration");
        c09dl.LJJIL(liveSpeedTestPreRequest2.getAvailableDuration());
        c09dl.LJII();
    }
}
