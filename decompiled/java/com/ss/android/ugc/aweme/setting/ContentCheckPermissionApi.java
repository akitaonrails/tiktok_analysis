package com.ss.android.ugc.aweme.setting;

import X.C11NZ;
import X.C858850Xmd;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes15.dex */
public interface ContentCheckPermissionApi {
    public static final C858850Xmd LIZ = C858850Xmd.LIZ;

    @InterfaceC1501160pAQ("/api/moderation/penalties/getcontentcheckeligibility")
    C11NZ<ContentCheckPermissionResponse> getContentCheckPermission();
}
