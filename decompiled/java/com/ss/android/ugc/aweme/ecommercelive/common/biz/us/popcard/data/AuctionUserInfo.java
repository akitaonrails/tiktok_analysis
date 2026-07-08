package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;

/* JADX INFO: loaded from: classes33.dex */
public final class AuctionUserInfo {

    @C09CT("avatar")
    public final ECImage avatar;

    @C09CT("is_winner")
    public final Boolean isWinner;

    @C09CT("nick_name")
    public final String nickName;

    @C09CT("user_id")
    public final Long userId;

    public AuctionUserInfo() {
        this(null, null, null, Boolean.FALSE);
    }

    public AuctionUserInfo(Long l, String str, ECImage eCImage, Boolean bool) {
        this.userId = l;
        this.nickName = str;
        this.avatar = eCImage;
        this.isWinner = bool;
    }
}
