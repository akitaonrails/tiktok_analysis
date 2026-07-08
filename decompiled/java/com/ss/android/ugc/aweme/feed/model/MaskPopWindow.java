package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class MaskPopWindow implements Serializable {

    @C09CT("pop_content")
    public List<MaskPopText> content;

    @C09CT("pop_title")
    public String title;

    public MaskPopWindow() {
        this(null, null, 3, null);
    }

    public MaskPopWindow(String str, List<MaskPopText> list) {
        this.title = str;
        this.content = list;
    }

    public MaskPopWindow(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
