package com.ss.android.ugc.trill.feedback.api;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class FaqInfoMap implements Serializable {
    public static final int $stable = 8;

    @C09CT("common")
    public final List<Object> common;

    @C09CT("general")
    public final List<FaqGeneralItem> general;

    public FaqInfoMap() {
        this(new ArrayList(), new ArrayList());
    }

    public FaqInfoMap(List<? extends Object> list, List<FaqGeneralItem> list2) {
        this.common = list;
        this.general = list2;
    }
}
