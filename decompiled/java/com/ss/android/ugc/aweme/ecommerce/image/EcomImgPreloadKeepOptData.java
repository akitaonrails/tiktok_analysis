package com.ss.android.ugc.aweme.ecommerce.image;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class EcomImgPreloadKeepOptData {

    @C09CT("delay_release_time")
    public final int delayReleaseTime;

    @C09CT("disable_lynx_image_async_pages")
    public final List<String> disableLynxImageAsyncPages;

    @C09CT("enable_lynx_force_resize")
    public final boolean enableLynxForceResize;

    @C09CT("enable_lynx_image_async")
    public final boolean enableLynxImageAsync;

    @C09CT("enable_preload_keep")
    public final boolean enablePreloadKeep;

    @C09CT("track_keep_count")
    public final int trackKeepCount;

    public EcomImgPreloadKeepOptData() {
        this(false, false, 0, false, null, 0, 63, null);
    }

    public EcomImgPreloadKeepOptData(boolean z, boolean z2, int i, boolean z3, List<String> list, int i2) {
        this.enablePreloadKeep = z;
        this.enableLynxForceResize = z2;
        this.delayReleaseTime = i;
        this.enableLynxImageAsync = z3;
        this.disableLynxImageAsyncPages = list;
        this.trackKeepCount = i2;
    }

    public EcomImgPreloadKeepOptData(boolean z, boolean z2, int i, boolean z3, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? 120 : i, (i3 & 8) == 0 ? z3 : false, (i3 & 16) != 0 ? C13BV.INSTANCE : list, (i3 & 32) != 0 ? 100 : i2);
    }
}
