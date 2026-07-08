package com.ss.android.ugc.aweme.account.login.chooseaccount;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class AccountSelectionData {

    @C09CT("login_selection_accounts")
    public final LoginSelectionAccounts loginSelectionAccounts;

    @C09CT("login_selection_ticket")
    public final String loginSelectionTicket;

    public AccountSelectionData() {
        this("", new LoginSelectionAccounts(false, false, null, null, null, null, null, false, null, null, 1023, null));
    }

    public AccountSelectionData(String str, LoginSelectionAccounts loginSelectionAccounts) {
        this.loginSelectionTicket = str;
        this.loginSelectionAccounts = loginSelectionAccounts;
    }
}
