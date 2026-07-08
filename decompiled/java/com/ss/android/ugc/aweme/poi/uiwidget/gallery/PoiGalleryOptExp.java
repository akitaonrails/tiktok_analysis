package com.ss.android.ugc.aweme.poi.uiwidget.gallery;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PoiGalleryOptExp {
    public static final PoiGalleryOptExpModel LIZ = new PoiGalleryOptExpModel(Boolean.FALSE);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(330));

    public static final class PoiGalleryOptExpModel {

        @C09CT("enable_sr")
        public final Boolean enableSR;

        public PoiGalleryOptExpModel() {
            this(Boolean.FALSE);
        }

        public PoiGalleryOptExpModel(Boolean bool) {
            this.enableSR = bool;
        }
    }

    public static boolean LIZ() {
        return Intrinsics.LJFF(((PoiGalleryOptExpModel) LIZIZ.getValue()).enableSR, Boolean.TRUE);
    }
}
