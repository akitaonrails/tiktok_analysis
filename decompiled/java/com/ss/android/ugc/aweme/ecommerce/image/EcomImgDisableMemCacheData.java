package com.ss.android.ugc.aweme.ecommerce.image;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public final class EcomImgDisableMemCacheData {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("scene_list")
    public final List<String> sceneList;

    public EcomImgDisableMemCacheData() {
        this(false, null, 3, null);
    }

    public EcomImgDisableMemCacheData(boolean z, List<String> list) {
        this.enable = z;
        this.sceneList = list;
    }

    public EcomImgDisableMemCacheData(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
