package com.ss.android.ugc.aweme.notice.api.bean;

import X.C1902010zax;
import X.EnumC1902000zaw;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeContainerParam implements Serializable {
    public static final C1902010zax Companion = new Object() { // from class: X.0zax
    };
    public final EnumC1902000zaw biz;

    public NoticeContainerParam() {
        this(EnumC1902000zaw.DEFAULT);
    }

    public NoticeContainerParam(EnumC1902000zaw enumC1902000zaw) {
        this.biz = enumC1902000zaw;
    }
}
