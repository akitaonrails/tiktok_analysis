package com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class AdFastScrollConfigParam implements Serializable {

    @C09CT("label_upload_enable")
    public final boolean labelUploadEnable;

    public final boolean getLabelUploadEnable() {
        return this.labelUploadEnable;
    }

    public AdFastScrollConfigParam(boolean z) {
        this.labelUploadEnable = z;
    }
}
