package com.ss.android.ugc.aweme.commercialize.live.business.links.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class BusinessLinksLiveLinkPin {

    @C09CT("action_type")
    public final String actionType;

    @C09CT("card_data")
    public final CardData cardData;

    @C09CT("count")
    public final int count;

    @C09CT("live_status")
    public final String liveStatus;

    public BusinessLinksLiveLinkPin(String str, String str2, int i, CardData cardData) {
        this.actionType = str;
        this.liveStatus = str2;
        this.count = i;
        this.cardData = cardData;
    }
}
