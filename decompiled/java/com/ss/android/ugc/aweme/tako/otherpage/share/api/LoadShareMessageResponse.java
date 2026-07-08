package com.ss.android.ugc.aweme.tako.otherpage.share.api;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class LoadShareMessageResponse {

    @C09CT("extra")
    public Extra ext;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("messages")
    public List<Message> messages;

    @C09CT("status_code")
    public int statusCode;

    public LoadShareMessageResponse() {
        this(null, null, 0, false, 15, null);
    }

    public LoadShareMessageResponse(List<Message> list, Extra extra, int i, boolean z) {
        this.messages = list;
        this.ext = extra;
        this.statusCode = i;
        this.hasMore = z;
    }

    public LoadShareMessageResponse(List list, Extra extra, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? null : extra, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }
}
