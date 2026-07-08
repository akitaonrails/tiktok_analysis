package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes10.dex */
public final class CategorySetting {

    @C09CT("client_key")
    public String clientKey;

    @C09CT("icon")
    public UrlModel icon;

    @C09CT("is_subscribe")
    public boolean isSubscribe;

    @C09CT("label")
    public final Integer label;

    @C09CT("label_title")
    public final String labelTitle;

    public final int hashCode() {
        Integer num = this.label;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.labelTitle;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.isSubscribe)) * 31;
        String str2 = this.clientKey;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.icon;
        return iHashCode3 + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public CategorySetting(Integer num, String str, boolean z, String str2, UrlModel urlModel) {
        this.label = num;
        this.labelTitle = str;
        this.isSubscribe = z;
        this.clientKey = str2;
        this.icon = urlModel;
    }
}
