package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class ComponentData implements Serializable {

    @C09CT("anchor_info")
    public final String anchorInfo;

    @C09CT("card_info")
    public final CardStruct cardInfo;

    public ComponentData(CardStruct cardStruct, String str) {
        this.cardInfo = cardStruct;
        this.anchorInfo = str;
    }
}
