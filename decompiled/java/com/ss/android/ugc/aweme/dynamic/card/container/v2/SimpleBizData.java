package com.ss.android.ugc.aweme.dynamic.card.container.v2;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class SimpleBizData {

    @C09CT("messages")
    public final List<SimpleMessage> messages;

    public SimpleBizData() {
        this(null, 1, null);
    }

    public SimpleBizData(List<SimpleMessage> list) {
        this.messages = list;
    }

    public SimpleBizData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
