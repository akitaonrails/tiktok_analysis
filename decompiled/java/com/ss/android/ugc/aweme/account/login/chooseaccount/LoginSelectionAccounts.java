package com.ss.android.ugc.aweme.account.login.chooseaccount;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes26.dex */
public final class LoginSelectionAccounts {

    @C09CT("authorized_org_account_info_list")
    public final List<AuthorizedOrgAccountInfo> authorizedOrgAccountInfoList;

    @C09CT("device_redirect_info")
    public final String deviceRedirectInfo;

    @C09CT("has_authorized_org_account")
    public final boolean hasAuthorizedOrgAccount;

    @C09CT("has_individual_account")
    public final boolean hasIndividualAccount;

    @C09CT("has_reached_org_account_list_limit")
    public final boolean hasReachedOrgAccountListLimit;

    @C09CT("individual_account_avatar_url")
    public final String individualAccountAvatarUrl;

    @C09CT("individual_account_domain")
    public final String individualAccountDomain;

    @C09CT("individual_account_nickname")
    public final String individualAccountNickname;

    @C09CT("individual_account_user_id_str")
    public final String individualAccountUserIdStr;

    @C09CT("individual_account_username")
    public final String individualAccountUsername;

    public LoginSelectionAccounts() {
        this(false, false, null, null, null, null, null, false, null, null, 1023, null);
    }

    public LoginSelectionAccounts(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, boolean z3, String str6, List<AuthorizedOrgAccountInfo> list) {
        this.hasIndividualAccount = z;
        this.hasAuthorizedOrgAccount = z2;
        this.individualAccountUserIdStr = str;
        this.individualAccountUsername = str2;
        this.individualAccountNickname = str3;
        this.individualAccountDomain = str4;
        this.individualAccountAvatarUrl = str5;
        this.hasReachedOrgAccountListLimit = z3;
        this.deviceRedirectInfo = str6;
        this.authorizedOrgAccountInfoList = list;
    }

    public LoginSelectionAccounts(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, boolean z3, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? "" : str5, (i & 128) == 0 ? z3 : false, (i & 256) == 0 ? str6 : null, (i & 512) != 0 ? C13BV.INSTANCE : list);
    }
}
