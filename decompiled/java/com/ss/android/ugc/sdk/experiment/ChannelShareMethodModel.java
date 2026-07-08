package com.ss.android.ugc.sdk.experiment;

import X.C09CT;
import X.EnumC1376430lvF;

/* JADX INFO: loaded from: classes22.dex */
public final class ChannelShareMethodModel {
    public static final int $stable = 0;

    @C09CT("facebook")
    public final int facebook;

    @C09CT("facebook_lite")
    public final int facebookLite;

    @C09CT("instagram")
    public final int instagram;

    @C09CT("messenger")
    public final int messenger;

    @C09CT("whatsapp")
    public final int whatsapp;

    public ChannelShareMethodModel() {
        this(EnumC1376430lvF.INTENT_SHARE.getNum(), EnumC1376430lvF.INTENT_SHARE.getNum(), EnumC1376430lvF.INTENT_SHARE.getNum(), EnumC1376430lvF.INTENT_SHARE.getNum(), EnumC1376430lvF.INTENT_SHARE.getNum());
    }

    public ChannelShareMethodModel(int i, int i2, int i3, int i4, int i5) {
        this.messenger = i;
        this.instagram = i2;
        this.facebook = i3;
        this.whatsapp = i4;
        this.facebookLite = i5;
    }
}
