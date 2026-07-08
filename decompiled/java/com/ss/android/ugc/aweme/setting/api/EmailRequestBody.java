package com.ss.android.ugc.aweme.setting.api;

import X.AbstractC848400XPy;
import X.C09CT;
import X.C0XQ7;
import X.C844470XAv;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public final class EmailRequestBody {

    @C09CT("aid")
    public final int aid;

    @C09CT("email")
    public final String email;

    @C09CT("country")
    public final String region;

    @C09CT("uid")
    public final String uid;

    @C09CT("version")
    public final String versionName;

    public EmailRequestBody(String str, int i, String str2, String str3, String str4) {
        this.email = str;
        this.aid = i;
        this.uid = str2;
        this.region = str3;
        this.versionName = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EmailRequestBody(String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            C844470XAv.LIZ.getClass();
            i = C844470XAv.LJIIJ;
        }
        str2 = (i2 & 4) != 0 ? ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId() : str2;
        str3 = (i2 & 8) != 0 ? ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase() : str3;
        if ((i2 & 16) != 0) {
            C844470XAv.LIZ.getClass();
            str4 = C844470XAv.LJFF();
        }
        this(str, i, str2, str3, str4);
    }
}
