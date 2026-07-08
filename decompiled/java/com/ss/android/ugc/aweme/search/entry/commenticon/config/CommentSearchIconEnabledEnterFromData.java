package com.ss.android.ugc.aweme.search.entry.commenticon.config;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class CommentSearchIconEnabledEnterFromData {

    @C09CT("enabled_enter_from")
    public final List<String> enabledEnterFrom;

    public CommentSearchIconEnabledEnterFromData() {
        this(null, 1, null);
    }

    public CommentSearchIconEnabledEnterFromData(List<String> list) {
        this.enabledEnterFrom = list;
    }

    public CommentSearchIconEnabledEnterFromData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
