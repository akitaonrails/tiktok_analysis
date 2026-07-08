package com.ss.android.ugc.aweme.social.sticker.model;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class InteractionData {

    @C09CT("business_info")
    public final BusinessInfo businessInfo;

    @C09CT("interaction_type")
    public final int interactionType;

    @C09CT("key")
    public final String key;

    @C09CT("position")
    public final Position position;

    public InteractionData() {
        this(0, null, "", new Position(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public InteractionData(int i, BusinessInfo businessInfo, String str, Position position) {
        this.interactionType = i;
        this.businessInfo = businessInfo;
        this.key = str;
        this.position = position;
    }
}
