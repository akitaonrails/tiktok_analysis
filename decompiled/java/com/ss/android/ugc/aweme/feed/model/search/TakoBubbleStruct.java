package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class TakoBubbleStruct {

    @C09CT("tako_bubble_icon_text")
    public final String takoBubbleIconText;

    @C09CT("tako_bubble_icon_text_show_enable")
    public final Boolean takoBubbleIconTextShowEnable;

    @C09CT("tako_bubble_sugs")
    public final List<TakoBubbleSugStruct> takoBubbleSugs;

    public TakoBubbleStruct() {
        this(null, null, null, 7, null);
    }

    public TakoBubbleStruct(List<TakoBubbleSugStruct> list, String str, Boolean bool) {
        this.takoBubbleSugs = list;
        this.takoBubbleIconText = str;
        this.takoBubbleIconTextShowEnable = bool;
    }

    public TakoBubbleStruct(List list, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? Boolean.FALSE : bool);
    }
}
