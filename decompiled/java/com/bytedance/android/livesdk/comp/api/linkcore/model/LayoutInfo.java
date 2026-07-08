package com.bytedance.android.livesdk.comp.api.linkcore.model;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public final class LayoutInfo {
    public final String businessId;
    public final boolean isFloat;
    public final String layoutId;
    public final String layoutType;
    public final Function0<ResolutionConfig> lazyGet;
    public final int version;

    public final boolean isFloat() {
        return this.isFloat;
    }

    public LayoutInfo(String str, String str2, String str3, int i, boolean z, Function0<ResolutionConfig> function0) {
        this.businessId = str;
        this.layoutType = str2;
        this.layoutId = str3;
        this.version = i;
        this.isFloat = z;
        this.lazyGet = function0;
    }
}
