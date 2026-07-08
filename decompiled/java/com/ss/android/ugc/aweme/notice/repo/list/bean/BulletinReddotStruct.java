package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinReddotStruct {

    @C09CT("reddot_count")
    public final Long reddotCount;

    @C09CT("reddot_style")
    public final String reddotStyle;

    public BulletinReddotStruct() {
        this(null, 0L);
    }

    public BulletinReddotStruct(String str, Long l) {
        this.reddotStyle = str;
        this.reddotCount = l;
    }
}
