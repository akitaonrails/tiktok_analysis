package com.ss.android.ugc.aweme.feed.model.search;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchAwemePoiDataExperiment {
    public static final boolean online = false;
    public static final SearchAwemePoiDataExperiment INSTANCE = new SearchAwemePoiDataExperiment();
    public static final boolean v1 = true;
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1694));

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean isEnable() {
        return getValue() == v1;
    }

    public final boolean getOnline() {
        return online;
    }

    public final boolean getV1() {
        return v1;
    }
}
