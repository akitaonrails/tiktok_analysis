package com.ss.android.ugc.aweme.share.dislike;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class Keyword {
    public static final int $stable = 8;

    @C09CT("scenes")
    public final List<Integer> scenes;

    @C09CT("text")
    public final String text;

    public Keyword() {
        this(null, null, 3, null);
    }

    public Keyword(String str, List<Integer> list) {
        this.text = str;
        this.scenes = list;
    }

    public Keyword(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
