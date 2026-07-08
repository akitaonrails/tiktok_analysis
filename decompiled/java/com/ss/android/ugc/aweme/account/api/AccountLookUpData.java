package com.ss.android.ugc.aweme.account.api;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes35.dex */
public final class AccountLookUpData implements Serializable {
    public static final int $stable = 8;

    @C09CT("banner")
    public final String banner;

    @C09CT("banner_config")
    public final BannerConfig bannerConfig;

    @C09CT("description")
    public final String description;

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("found_accounts")
    public final List<FoundAccountForLogin> foundAccounts;

    @C09CT("is_safe")
    public final boolean isSafe;

    @C09CT("passport_ticket")
    public final String passportTicket;

    @C09CT("popup_config")
    public final AccountLookupPopupConfig popupConfig;

    public AccountLookUpData() {
        this(null, null, null, 0, false, null, null, null, 255, null);
    }

    public final boolean isSafe() {
        return this.isSafe;
    }

    public AccountLookUpData(List<FoundAccountForLogin> list, String str, String str2, int i, boolean z, String str3, BannerConfig bannerConfig, AccountLookupPopupConfig accountLookupPopupConfig) {
        this.foundAccounts = list;
        this.passportTicket = str;
        this.description = str2;
        this.errorCode = i;
        this.isSafe = z;
        this.banner = str3;
        this.bannerConfig = bannerConfig;
        this.popupConfig = accountLookupPopupConfig;
    }

    public AccountLookUpData(List list, String str, String str2, int i, boolean z, String str3, BannerConfig bannerConfig, AccountLookupPopupConfig accountLookupPopupConfig, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) == 0 ? z : false, (i2 & 32) == 0 ? str3 : "", (i2 & 64) != 0 ? null : bannerConfig, (i2 & 128) == 0 ? accountLookupPopupConfig : null);
    }
}
