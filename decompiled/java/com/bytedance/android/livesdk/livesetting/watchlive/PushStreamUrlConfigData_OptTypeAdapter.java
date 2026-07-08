package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PushStreamUrlConfigData_OptTypeAdapter extends TypeAdapter<PushStreamUrlConfigData> {
    @Override // com.google.gson.TypeAdapter
    public final PushStreamUrlConfigData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PushStreamUrlConfigData pushStreamUrlConfigData = new PushStreamUrlConfigData();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "cache_size")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    pushStreamUrlConfigData.cacheSize = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "expire_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    pushStreamUrlConfigData.expireTime = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return pushStreamUrlConfigData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PushStreamUrlConfigData pushStreamUrlConfigData) {
        PushStreamUrlConfigData pushStreamUrlConfigData2 = pushStreamUrlConfigData;
        if (pushStreamUrlConfigData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("cache_size");
        c09dl.LJJJJ(Integer.valueOf(pushStreamUrlConfigData2.cacheSize));
        c09dl.LJIILLIIL("expire_time");
        c09dl.LJJJJ(Integer.valueOf(pushStreamUrlConfigData2.expireTime));
        c09dl.LJII();
    }
}
