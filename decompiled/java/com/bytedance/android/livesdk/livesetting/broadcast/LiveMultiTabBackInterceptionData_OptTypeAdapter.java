package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMultiTabBackInterceptionData_OptTypeAdapter extends TypeAdapter<LiveMultiTabBackInterceptionData> {
    public final Gson LIZ;

    public LiveMultiTabBackInterceptionData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMultiTabBackInterceptionData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMultiTabBackInterceptionData liveMultiTabBackInterceptionData = new LiveMultiTabBackInterceptionData(true, 2000L, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1481420638) {
                    if (iHashCode != -923847360) {
                        if (iHashCode == 570418373 && strLJJJJ.equals("interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMultiTabBackInterceptionData.interval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable_apply_permission_optimize")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveMultiTabBackInterceptionData.enablePermissionOptimize = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable_back_interception")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMultiTabBackInterceptionData.enableBackInterception = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveMultiTabBackInterceptionData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMultiTabBackInterceptionData liveMultiTabBackInterceptionData) throws IOException {
        LiveMultiTabBackInterceptionData liveMultiTabBackInterceptionData2 = liveMultiTabBackInterceptionData;
        if (liveMultiTabBackInterceptionData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_back_interception");
        c09dl.LJJJJJL(liveMultiTabBackInterceptionData2.enableBackInterception);
        c09dl.LJIILLIIL("interval");
        c09dl.LJJIZ(liveMultiTabBackInterceptionData2.interval);
        c09dl.LJIILLIIL("enable_apply_permission_optimize");
        c09dl.LJJJJJL(liveMultiTabBackInterceptionData2.enablePermissionOptimize);
        c09dl.LJII();
    }
}
