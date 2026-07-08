package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import X.C13LQ;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TTMBrand implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("button_text")
    public String buttonText;

    @C09CT("entrance")
    public String entrance;

    @C09CT("link")
    public TTMLink link;

    @C09CT("product_status")
    public int productStatus;

    @C09CT("subscribed")
    public boolean subscribed;

    @C09CT("subtitle")
    public String subtitle;

    @C09CT("title")
    public String title;

    public static final class Companion {
    }

    public TTMBrand() {
        this("", null, null, null, null, false, 1);
    }

    public final boolean isInExp() {
        return C13LQ.LJJIJIIJI(this.entrance, new String[]{"for_you_action_sheet", "music_detail_action_sheet", "music_detail_button"}) >= 0;
    }

    public final boolean isOn() {
        return this.productStatus == 2;
    }

    public final boolean isUX1() {
        return Intrinsics.LJFF(this.entrance, "for_you_action_sheet");
    }

    public TTMBrand(String str, TTMLink tTMLink, String str2, String str3, String str4, boolean z, int i) {
        this.entrance = str;
        this.link = tTMLink;
        this.title = str2;
        this.subtitle = str3;
        this.buttonText = str4;
        this.subscribed = z;
        this.productStatus = i;
    }
}
