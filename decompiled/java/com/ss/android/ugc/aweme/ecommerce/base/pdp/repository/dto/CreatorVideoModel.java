package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CreatorVideoModel {

    @C09CT("videos")
    public final List<CreatorVideoItem> videos;

    public CreatorVideoModel() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreatorVideoModel) && Intrinsics.LJFF(this.videos, ((CreatorVideoModel) obj).videos);
    }

    public final int hashCode() {
        List<CreatorVideoItem> list = this.videos;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public CreatorVideoModel(List<CreatorVideoItem> list) {
        this.videos = list;
    }
}
