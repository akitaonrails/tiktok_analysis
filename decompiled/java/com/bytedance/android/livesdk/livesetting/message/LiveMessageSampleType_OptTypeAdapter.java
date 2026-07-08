package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveMessageSampleType_OptTypeAdapter extends TypeAdapter<LiveMessageSampleType> {
    public final Gson LIZ;

    public LiveMessageSampleType_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessageSampleType read(C09CU c09cu) {
        LiveMessageSampleType liveMessageSampleType = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveMessageSampleType = new LiveMessageSampleType(new LiveMessageSampleRatio(0L, 0L, 0L, 1000L), new LiveMessageSampleRatio(0L, 0L, 0L, 1000L));
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "room_ratio")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMessageSampleType.setRoomRatio((LiveMessageSampleRatio) this.LIZ.LJIIJ(LiveMessageSampleRatio.class).read(c09cu));
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "p2p_ratio")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMessageSampleType.setP2pRatio((LiveMessageSampleRatio) this.LIZ.LJIIJ(LiveMessageSampleRatio.class).read(c09cu));
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveMessageSampleType;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMessageSampleType liveMessageSampleType) {
        LiveMessageSampleType liveMessageSampleType2 = liveMessageSampleType;
        if (liveMessageSampleType2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("room_ratio");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(LiveMessageSampleRatio.class);
        typeAdapterLJIIJ.write(c09dl, liveMessageSampleType2.getRoomRatio());
        c09dl.LJIILLIIL("p2p_ratio");
        typeAdapterLJIIJ.write(c09dl, liveMessageSampleType2.getP2pRatio());
        c09dl.LJII();
    }
}
