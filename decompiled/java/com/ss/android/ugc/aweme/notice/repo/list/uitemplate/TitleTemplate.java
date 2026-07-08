package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.C09CT;
import X.C13LP;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class TitleTemplate {

    @C09CT("title_append_info")
    public final ExtraActionTemplate extraAction;

    @C09CT("extra_schema_url")
    public final String extraSchemaUrl;

    @C09CT("from_users")
    public final List<User> fromUsers;

    @C09CT("merge_count")
    public final int mergeCount;

    @C09CT("title")
    public final String title;

    public final boolean equals(Object obj) {
        Integer numValueOf;
        Integer numValueOf2;
        Object objLJJJLL;
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(TitleTemplate.class, obj.getClass())) {
            return false;
        }
        TitleTemplate titleTemplate = (TitleTemplate) obj;
        List<User> list = this.fromUsers;
        Object objLJJJLL2 = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        List<User> list2 = titleTemplate.fromUsers;
        if (list2 != null) {
            numValueOf2 = Integer.valueOf(list2.size());
        } else {
            numValueOf2 = null;
        }
        if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
            List<User> list3 = this.fromUsers;
            if (list3 != null) {
                objLJJJLL = C13LP.LJJJLL(list3);
            } else {
                objLJJJLL = null;
            }
            List<User> list4 = titleTemplate.fromUsers;
            if (list4 != null) {
                objLJJJLL2 = C13LP.LJJJLL(list4);
            }
            if (Intrinsics.LJFF(objLJJJLL, objLJJJLL2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TitleTemplate(List<? extends User> list, int i, String str, String str2, ExtraActionTemplate extraActionTemplate) {
        this.fromUsers = list;
        this.mergeCount = i;
        this.extraSchemaUrl = str;
        this.title = str2;
        this.extraAction = extraActionTemplate;
    }
}
