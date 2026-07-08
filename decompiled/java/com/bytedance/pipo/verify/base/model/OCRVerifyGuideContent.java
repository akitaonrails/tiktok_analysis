package com.bytedance.pipo.verify.base.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class OCRVerifyGuideContent {

    @C09CT("button")
    public final OCRVerifyButton button;

    @C09CT("content")
    public final String content;

    /* JADX INFO: renamed from: privacy, reason: collision with root package name */
    @C09CT("privacy")
    public final String f332privacy;

    @C09CT("security")
    public final OCRVerifySecurity security;

    @C09CT("steps")
    public final OCRVerifySteps steps;

    @C09CT("title")
    public final String title;

    @C09CT("virtual_card_fallback")
    public final String virtualCardFallback;

    public OCRVerifyGuideContent(OCRVerifySecurity oCRVerifySecurity, String str, String str2, OCRVerifySteps oCRVerifySteps, String str3, OCRVerifyButton oCRVerifyButton, String str4) {
        this.security = oCRVerifySecurity;
        this.title = str;
        this.content = str2;
        this.steps = oCRVerifySteps;
        this.f332privacy = str3;
        this.button = oCRVerifyButton;
        this.virtualCardFallback = str4;
    }
}
