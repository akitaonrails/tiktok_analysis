package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class LogoModel {

    @C09CT("logo")
    public final UrlModel logo;

    @C09CT("logo_dark")
    public final UrlModel logoDark;

    public LogoModel() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogoModel)) {
            return false;
        }
        LogoModel logoModel = (LogoModel) obj;
        return Intrinsics.LJFF(this.logo, logoModel.logo) && Intrinsics.LJFF(this.logoDark, logoModel.logoDark);
    }

    public LogoModel(UrlModel urlModel, UrlModel urlModel2) {
        this.logo = urlModel;
        this.logoDark = urlModel2;
    }
}
