package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AutoRefreshRankInterval_OptTypeAdapter extends TypeAdapter<AutoRefreshRankInterval> {
    @Override // com.google.gson.TypeAdapter
    public final AutoRefreshRankInterval read(C09CU c09cu) {
        AutoRefreshRankInterval autoRefreshRankInterval = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            autoRefreshRankInterval = new AutoRefreshRankInterval(5, 5);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "hourly_ranklist_interval")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        autoRefreshRankInterval.hourly_rank = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "weekly_ranklist_interval")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        autoRefreshRankInterval.weekly_rank = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return autoRefreshRankInterval;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AutoRefreshRankInterval autoRefreshRankInterval) {
        AutoRefreshRankInterval autoRefreshRankInterval2 = autoRefreshRankInterval;
        if (autoRefreshRankInterval2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("hourly_ranklist_interval");
        c09dl.LJJJJ(Integer.valueOf(autoRefreshRankInterval2.hourly_rank));
        c09dl.LJIILLIIL("weekly_ranklist_interval");
        c09dl.LJJJJ(Integer.valueOf(autoRefreshRankInterval2.weekly_rank));
        c09dl.LJII();
    }
}
