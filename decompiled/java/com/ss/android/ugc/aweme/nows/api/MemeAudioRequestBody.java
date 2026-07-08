package com.ss.android.ugc.aweme.nows.api;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class MemeAudioRequestBody {

    @C09CT("descriptions")
    public final List<String> descriptions;

    @C09CT("uri")
    public final String uri;

    public MemeAudioRequestBody() {
        this(null, null, 3, null);
    }

    public MemeAudioRequestBody(String str, List<String> list) {
        this.uri = str;
        this.descriptions = list;
    }

    public MemeAudioRequestBody(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
