package com.ss.android.ugc.tiktok.ban;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class Data implements Serializable {

    @C09CT("verify_ticket")
    public final String verifyTicket;

    public Data() {
        this(null);
    }

    public Data(String str) {
        this.verifyTicket = str;
    }
}
