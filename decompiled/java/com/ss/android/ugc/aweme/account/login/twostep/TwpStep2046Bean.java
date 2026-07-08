package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;
import com.ss.android.ugc.aweme.account.model.TwoStepVerifyWays;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class TwpStep2046Bean implements Serializable {
    public static final int $stable = 8;

    @C09CT("default_verify_way")
    public final String default_verify_way;

    @C09CT("not_login_ticket")
    public final String not_login_ticket;

    @C09CT("verify_ticket")
    public final String verify_ticket;

    @C09CT("verify_ways")
    public final ArrayList<TwoStepVerifyWays> verify_ways;

    public TwpStep2046Bean(String str, String str2, ArrayList<TwoStepVerifyWays> arrayList, String str3) {
        this.verify_ticket = str;
        this.default_verify_way = str2;
        this.verify_ways = arrayList;
        this.not_login_ticket = str3;
    }
}
