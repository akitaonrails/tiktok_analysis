package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBroadcastMessageSortConfig_OptTypeAdapter extends TypeAdapter<LiveBroadcastMessageSortConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveBroadcastMessageSortConfig read(C09CU c09cu) {
        LiveBroadcastMessageSortConfig liveBroadcastMessageSortConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveBroadcastMessageSortConfig = new LiveBroadcastMessageSortConfig(0, "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "sort_type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveBroadcastMessageSortConfig.setSortType(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "sort_priority")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveBroadcastMessageSortConfig.setSortPriority(c09cu.LJJJZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveBroadcastMessageSortConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveBroadcastMessageSortConfig liveBroadcastMessageSortConfig) {
        LiveBroadcastMessageSortConfig liveBroadcastMessageSortConfig2 = liveBroadcastMessageSortConfig;
        if (liveBroadcastMessageSortConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("sort_type");
        c09dl.LJJJJ(Integer.valueOf(liveBroadcastMessageSortConfig2.getSortType()));
        c09dl.LJIILLIIL("sort_priority");
        c09dl.LJJJJJ(liveBroadcastMessageSortConfig2.getSortPriority());
        c09dl.LJII();
    }
}
