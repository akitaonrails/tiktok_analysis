package com.ss.android.ugc.aweme.comment.gift.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes22.dex */
public final class GiftStruct {
    public static final int $stable = 8;

    @C09CT("describe")
    public final String describeMessage;

    @C09CT("diamond_count")
    public final int diamondCount;

    @C09CT("asset")
    public final UrlModel effectAsset;

    @C09CT("icon")
    public final UrlModel iconList;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("image")
    public final UrlModel imageList;
    public boolean isFromGiftBag;

    @C09CT("name")
    public final String name;
    public Integer selectedIndex;

    public final boolean isFromGiftBag() {
        return this.isFromGiftBag;
    }

    public final void setFromGiftBag(boolean z) {
        this.isFromGiftBag = z;
    }

    public final void setSelectedIndex(Integer num) {
        this.selectedIndex = num;
    }

    public GiftStruct(long j, String str, String str2, int i, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, Integer num, boolean z) {
        this.id = j;
        this.name = str;
        this.describeMessage = str2;
        this.diamondCount = i;
        this.imageList = urlModel;
        this.iconList = urlModel2;
        this.effectAsset = urlModel3;
        this.selectedIndex = num;
        this.isFromGiftBag = z;
    }
}
