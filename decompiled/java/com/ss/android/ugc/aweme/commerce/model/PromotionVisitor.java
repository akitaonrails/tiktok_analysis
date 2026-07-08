package com.ss.android.ugc.aweme.commerce.model;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class PromotionVisitor implements Serializable {

    @C09CT("avatar")
    public List<? extends UrlModel> avatars;

    @C09CT("count")
    public long count;

    public PromotionVisitor() {
        this(null, 0L, 3, null);
    }

    public final void setAvatars(List<? extends UrlModel> list) {
        this.avatars = list;
    }

    public final void setCount(long j) {
        this.count = j;
    }

    public PromotionVisitor(List<? extends UrlModel> list, long j) {
        this.avatars = list;
        this.count = j;
    }

    public PromotionVisitor(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0L : j);
    }
}
