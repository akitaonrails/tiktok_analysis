package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class OrgAssociateAccount implements Serializable {

    @C09CT("avatar_url_list")
    public final List<String> avatars;

    @C09CT("header")
    public final String header;

    @C09CT("nickname")
    public final String nickName;

    @C09CT("sec_uid")
    public final String secUid;

    @C09CT("uid")
    public final String uid;

    @C09CT("unique_id")
    public final String username;

    public OrgAssociateAccount() {
        this(null, null, null, null, null, null, 63, null);
    }

    public OrgAssociateAccount(String str, String str2, String str3, String str4, String str5, List<String> list) {
        this.uid = str;
        this.secUid = str2;
        this.nickName = str3;
        this.username = str4;
        this.header = str5;
        this.avatars = list;
    }

    public OrgAssociateAccount(String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? C13BV.INSTANCE : list);
    }
}
