package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class EventItem implements Serializable {

    @C09CT("actions")
    public final List<Action> actions;

    @C09CT("capture")
    public final Integer capture;

    @C09CT("exposureId")
    public final String exposureId;

    @C09CT("exposureMarginBottom")
    public final String exposureMarginBottom;

    @C09CT("exposureScene")
    public final String exposureScene;

    @C09CT("once")
    public final Integer once;

    @C09CT("stopPropagation")
    public final Integer stopPropagation;

    public EventItem() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public EventItem(List<Action> list, Integer num, Integer num2, Integer num3, String str, String str2, String str3) {
        this.actions = list;
        this.capture = num;
        this.once = num2;
        this.stopPropagation = num3;
        this.exposureId = str;
        this.exposureScene = str2;
        this.exposureMarginBottom = str3;
    }

    public EventItem(List list, Integer num, Integer num2, Integer num3, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) == 0 ? str3 : null);
    }
}
