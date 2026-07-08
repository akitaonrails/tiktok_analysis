package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentAtTakoInfo implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("show_tako_account")
    public Integer showTakoAccount;

    public static final class Companion {
    }

    public CommentAtTakoInfo() {
        this(null);
    }

    public final boolean canShowTakoAccount() {
        Integer num = this.showTakoAccount;
        return num != null && num.intValue() == 1;
    }

    public CommentAtTakoInfo(Integer num) {
        this.showTakoAccount = num;
    }
}
