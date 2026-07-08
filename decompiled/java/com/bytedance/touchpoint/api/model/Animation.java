package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class Animation {
    public String LIZ;
    public String LIZIZ;

    @C09CT("cover_image")
    public String coverImage;

    @C09CT("end_frame")
    public int endFrame;

    @C09CT("lottie")
    public String lottie;

    @C09CT("lottie_md5")
    public String lottieMd5;

    @C09CT("transition_frame")
    public int transitionFrame;

    public Animation(String str, String str2, int i, int i2, String str3, String str4, String str5) {
        this.lottie = str;
        this.lottieMd5 = str2;
        this.transitionFrame = i;
        this.endFrame = i2;
        this.coverImage = str3;
        this.LIZ = str4;
        this.LIZIZ = str5;
    }
}
