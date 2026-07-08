package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FacialGiftTrackingModel_OptTypeAdapter extends TypeAdapter<FacialGiftTrackingModel> {
    public final Gson LIZ;

    public FacialGiftTrackingModel_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FacialGiftTrackingModel read(C09CU c09cu) {
        FacialGiftTrackingModel facialGiftTrackingModel = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            facialGiftTrackingModel = new FacialGiftTrackingModel(Boolean.TRUE, 270900);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable_tracking")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        facialGiftTrackingModel.trackingEnabled = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "link_tracking_min_version")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        facialGiftTrackingModel.linkTrackingMinVersion = Integer.valueOf(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return facialGiftTrackingModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FacialGiftTrackingModel facialGiftTrackingModel) {
        FacialGiftTrackingModel facialGiftTrackingModel2 = facialGiftTrackingModel;
        if (facialGiftTrackingModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_tracking");
        c09dl.LJJJ(facialGiftTrackingModel2.trackingEnabled);
        c09dl.LJIILLIIL("link_tracking_min_version");
        c09dl.LJJJJ(facialGiftTrackingModel2.linkTrackingMinVersion);
        c09dl.LJII();
    }
}
