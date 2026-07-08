package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class VisionSearchStruct {

    /* JADX INFO: renamed from: privacy, reason: collision with root package name */
    @C09CT("privacy")
    public VisionSearchPrivacy f382privacy;

    public VisionSearchPrivacy getPrivacy() throws C316660CbA {
        VisionSearchPrivacy visionSearchPrivacy = this.f382privacy;
        if (visionSearchPrivacy != null) {
            return visionSearchPrivacy;
        }
        throw new C316660CbA();
    }
}
