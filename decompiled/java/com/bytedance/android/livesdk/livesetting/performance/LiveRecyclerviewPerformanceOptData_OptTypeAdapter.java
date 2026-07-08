package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRecyclerviewPerformanceOptData_OptTypeAdapter extends TypeAdapter<LiveRecyclerviewPerformanceOptData> {
    public final Gson LIZ;

    public LiveRecyclerviewPerformanceOptData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRecyclerviewPerformanceOptData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRecyclerviewPerformanceOptData liveRecyclerviewPerformanceOptData = new LiveRecyclerviewPerformanceOptData(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -88889502) {
                    if (iHashCode != 106069776) {
                        if (iHashCode == 919802631 && strLJJJJ.equals("reuse_pool")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecyclerviewPerformanceOptData.reusePool = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("other")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveRecyclerviewPerformanceOptData.other = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("viewholder_layout_preload")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveRecyclerviewPerformanceOptData.viewHolderLayoutPreload = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveRecyclerviewPerformanceOptData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRecyclerviewPerformanceOptData liveRecyclerviewPerformanceOptData) throws IOException {
        LiveRecyclerviewPerformanceOptData liveRecyclerviewPerformanceOptData2 = liveRecyclerviewPerformanceOptData;
        if (liveRecyclerviewPerformanceOptData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("viewholder_layout_preload");
        c09dl.LJJJJJL(liveRecyclerviewPerformanceOptData2.viewHolderLayoutPreload);
        c09dl.LJIILLIIL("reuse_pool");
        c09dl.LJJJJJL(liveRecyclerviewPerformanceOptData2.reusePool);
        c09dl.LJIILLIIL("other");
        c09dl.LJJJJJL(liveRecyclerviewPerformanceOptData2.other);
        c09dl.LJII();
    }
}
