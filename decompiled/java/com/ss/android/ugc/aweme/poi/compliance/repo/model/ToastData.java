package com.ss.android.ugc.aweme.poi.compliance.repo.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class ToastData implements Serializable {

    @C09CT("toast_content")
    public final PassportToastContent toastContent;

    public ToastData(PassportToastContent passportToastContent) {
        this.toastContent = passportToastContent;
    }
}
