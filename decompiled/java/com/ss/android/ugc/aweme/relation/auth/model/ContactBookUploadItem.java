package com.ss.android.ugc.aweme.relation.auth.model;

import X.C09CT;
import X.C09DE;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class ContactBookUploadItem {

    @C09CT("email_list")
    @C09DE
    public final List<ContactBookEmail> contactBookEmailList;

    @C09CT("phone_list")
    @C09DE
    public final List<ContactBookPhone> contactBookPhoneList;

    @C09CT("info")
    @C09DE
    public final ContactBookInfo info;

    public ContactBookUploadItem() {
        this(null, null, null, 7, null);
    }

    public ContactBookUploadItem(List<ContactBookPhone> list, List<ContactBookEmail> list2, ContactBookInfo contactBookInfo) {
        this.contactBookPhoneList = list;
        this.contactBookEmailList = list2;
        this.info = contactBookInfo;
    }

    public ContactBookUploadItem(List list, List list2, ContactBookInfo contactBookInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : contactBookInfo);
    }
}
