package com.ss.android.ugc.profile.business.ad.platform;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class BioEmailData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("bio_email")
    public String bioEmail;

    public final String getBioEmail() {
        return this.bioEmail;
    }

    public final void setBioEmail(String str) {
        this.bioEmail = str;
    }
}
