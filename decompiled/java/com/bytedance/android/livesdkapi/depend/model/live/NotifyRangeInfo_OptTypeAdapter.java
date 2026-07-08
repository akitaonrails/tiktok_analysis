package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class NotifyRangeInfo_OptTypeAdapter extends TypeAdapter<NotifyRangeInfo> {
    public final Gson LIZ;

    public NotifyRangeInfo_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final NotifyRangeInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        NotifyRangeInfo notifyRangeInfo = new NotifyRangeInfo();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "horizontal_range")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    notifyRangeInfo.horizontalRange = C473040Igo.LIZ(this.LIZ, c09cu, Long.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "vertical_range")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    notifyRangeInfo.verticalRange = C473040Igo.LIZ(this.LIZ, c09cu, Long.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return notifyRangeInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NotifyRangeInfo notifyRangeInfo) {
        NotifyRangeInfo notifyRangeInfo2 = notifyRangeInfo;
        if (notifyRangeInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("horizontal_range");
        Gson gson = this.LIZ;
        List<Long> list = notifyRangeInfo2.horizontalRange;
        Class cls = Long.TYPE;
        C473040Igo.LIZLLL(gson, c09dl, list, cls);
        c09dl.LJIILLIIL("vertical_range");
        C473040Igo.LIZLLL(this.LIZ, c09dl, notifyRangeInfo2.verticalRange, cls);
        c09dl.LJII();
    }
}
