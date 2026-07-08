package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.UrlStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefWebDoc;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SourceFromEntity implements Serializable {

    @C09CT("source_user")
    public final SummarySourceUser sourceUser;

    @C09CT("type")
    public final Integer type;

    @C09CT("user")
    public final User user;

    @C09CT("web")
    public final RefWebDoc web;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceFromEntity)) {
            return false;
        }
        SourceFromEntity sourceFromEntity = (SourceFromEntity) obj;
        return Intrinsics.LJFF(this.type, sourceFromEntity.type) && Intrinsics.LJFF(this.user, sourceFromEntity.user) && Intrinsics.LJFF(this.sourceUser, sourceFromEntity.sourceUser) && Intrinsics.LJFF(this.web, sourceFromEntity.web);
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        User user = this.user;
        int iHashCode2 = (iHashCode + (user == null ? 0 : user.hashCode())) * 31;
        SummarySourceUser summarySourceUser = this.sourceUser;
        int iHashCode3 = (iHashCode2 + (summarySourceUser == null ? 0 : summarySourceUser.hashCode())) * 31;
        RefWebDoc refWebDoc = this.web;
        return iHashCode3 + (refWebDoc != null ? refWebDoc.hashCode() : 0);
    }

    public final String getUserAvatar() {
        UrlModel avatarThumb;
        List<String> urlList;
        UrlStruct urlStruct;
        String firstUrl;
        SummarySourceUser summarySourceUser = this.sourceUser;
        if (summarySourceUser != null && (urlStruct = summarySourceUser.avatarThumb) != null && (firstUrl = urlStruct.getFirstUrl()) != null) {
            return firstUrl;
        }
        User user = this.user;
        String str = null;
        if (user != null && (avatarThumb = user.getAvatarThumb()) != null && (urlList = avatarThumb.getUrlList()) != null) {
            Iterator<String> it2 = urlList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                String str2 = next;
                if (str2 != null && str2.length() != 0) {
                    str = next;
                    break;
                }
            }
            String str3 = str;
            if (str3 != null) {
                return str3;
            }
        }
        return "";
    }

    public SourceFromEntity(Integer num, User user, SummarySourceUser summarySourceUser, RefWebDoc refWebDoc) {
        this.type = num;
        this.user = user;
        this.sourceUser = summarySourceUser;
        this.web = refWebDoc;
    }
}
