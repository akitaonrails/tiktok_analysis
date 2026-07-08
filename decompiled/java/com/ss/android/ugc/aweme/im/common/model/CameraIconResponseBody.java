package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CameraIconResponseBody {

    @C09CT("uids")
    public final List<Long> uids;

    public CameraIconResponseBody() {
        this(null);
    }

    public CameraIconResponseBody(List<Long> list) {
        this.uids = list;
    }
}
