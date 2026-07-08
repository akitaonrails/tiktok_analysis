package com.ss.android.ugc.aweme.account.loginplatform;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import com.google.gson.n;
import java.util.List;
import java.util.ListIterator;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes29.dex */
public final class ThirdPartyLoginResponse {

    @C09CT("log_in_order")
    public String loginOrder;

    @C09CT("platform_configs")
    public n platformConfigs;

    @C09CT("recover_account_url")
    public String recoverAccountUrl;

    @C09CT("show_num")
    public Integer showNum;

    @C09CT("sign_up_order")
    public String signUpOrder;

    public final List<String> LIZ(boolean z) {
        String str;
        if (z) {
            str = this.signUpOrder;
        } else {
            str = this.loginOrder;
        }
        if (str == null) {
            return null;
        }
        List<String> listSplit = new Regex(",").split(str, 0);
        if (!listSplit.isEmpty()) {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    return C13LP.LL(listSplit, listIterator.nextIndex() + 1);
                }
            }
        }
        return C13BV.INSTANCE;
    }
}
