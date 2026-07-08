package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class CameoInfo {

    @C09CT("cameo_id")
    public final String cameoId;

    @C09CT("deleted")
    public final boolean deleted;

    @C09CT("is_virtual")
    public final Boolean isVirtual;

    public CameoInfo() {
        this(null, false, Boolean.FALSE);
    }

    public CameoInfo(String str, boolean z, Boolean bool) {
        this.cameoId = str;
        this.deleted = z;
        this.isVirtual = bool;
    }
}
