package com.ss.android.ugc.tiktok.addyours.model;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursPagination {

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("load_type")
    public final Integer loadType;

    public AddYoursPagination() {
        this(null, null);
    }

    public AddYoursPagination(Long l, Integer num) {
        this.cursor = l;
        this.loadType = num;
    }
}
