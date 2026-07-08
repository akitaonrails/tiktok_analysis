package com.ss.android.ugc.aweme.account.org.create;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class OrgAccountsInfoResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public OrgAccountsInfoResponse() {
        this("", new Data(null, null, null, null, null));
    }

    public OrgAccountsInfoResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }

    public static final class Data implements Serializable {
        public static final int $stable = 8;

        @C09CT("accounts")
        public final List<OrgAccount> accounts;

        @C09CT("create_page_url")
        public final String createPageUrl;

        @C09CT("description")
        public final String description;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("org_info")
        public final OrgInfo orgInfo;

        public Data() {
            this(null, null, null, null, null);
        }

        public Data(String str, Integer num, OrgInfo orgInfo, List<OrgAccount> list, String str2) {
            this.description = str;
            this.errorCode = num;
            this.orgInfo = orgInfo;
            this.accounts = list;
            this.createPageUrl = str2;
        }
    }
}
