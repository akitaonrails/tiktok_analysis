package com.ss.android.ugc.aweme.notification.aggregate.data;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TemplateAggregateLeftUiInfo {

    @C09CT("image_info")
    public final UrlModel avatarImageUrl;

    @C09CT("from_user")
    public final List<User> fromUsers;

    @C09CT("scheme_url")
    public final String schemeUrl;

    public final int hashCode() {
        List<User> list = this.fromUsers;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        UrlModel urlModel = this.avatarImageUrl;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str = this.schemeUrl;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateAggregateLeftUiInfo(fromUsers=");
        sbLIZ.append(this.fromUsers);
        sbLIZ.append(", avatarImageUrl=");
        sbLIZ.append(this.avatarImageUrl);
        sbLIZ.append(", schemeUrl=");
        sbLIZ.append(this.schemeUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TemplateAggregateLeftUiInfo(List<? extends User> list, UrlModel urlModel, String str) {
        this.fromUsers = list;
        this.avatarImageUrl = urlModel;
        this.schemeUrl = str;
    }
}
