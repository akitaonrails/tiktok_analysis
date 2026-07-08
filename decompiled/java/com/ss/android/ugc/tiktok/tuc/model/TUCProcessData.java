package com.ss.android.ugc.tiktok.tuc.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class TUCProcessData implements Serializable {

    @C09CT("steps")
    public List<TUCActionData> actions;

    @C09CT("event")
    public TUCEventData event;

    public TUCProcessData() {
        this(null, null);
    }

    public TUCProcessData(TUCEventData tUCEventData, List<TUCActionData> list) {
        this.event = tUCEventData;
        this.actions = list;
    }
}
