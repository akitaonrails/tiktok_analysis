package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notification.bean.UnSubscribeSettingsData;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class GroupUnsubscribeSetting {

    @C09CT("account_type")
    public final String accountType;

    @C09CT("group_description")
    public final String desc;

    @C09CT("group")
    public final int group;

    @C09CT("image_url")
    public final UrlModel imageUrl;

    @C09CT("image_url_dark")
    public final UrlModel imageUrlDark;

    @C09CT("name")
    public final String name;

    @C09CT("setting_image_url")
    public final UrlModel settingImageUrl;

    @C09CT("setting_image_url_dark")
    public final UrlModel settingImageUrlDark;

    @C09CT("setting_tux_image_url")
    public final TuxImageModel settingImageUrlTux;

    @C09CT("subscribe_combine_settings")
    public final SubscribeCombineSetting subscribeCombineSetting;

    @C09CT("unsubscribe_channel_settings")
    public final List<UnSubscribeSettingsData> unsubscribeCategoryList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupUnsubscribeSetting)) {
            return false;
        }
        GroupUnsubscribeSetting groupUnsubscribeSetting = (GroupUnsubscribeSetting) obj;
        return this.group == groupUnsubscribeSetting.group && Intrinsics.LJFF(this.name, groupUnsubscribeSetting.name) && Intrinsics.LJFF(this.desc, groupUnsubscribeSetting.desc) && Intrinsics.LJFF(this.imageUrl, groupUnsubscribeSetting.imageUrl) && Intrinsics.LJFF(this.imageUrlDark, groupUnsubscribeSetting.imageUrlDark) && Intrinsics.LJFF(this.unsubscribeCategoryList, groupUnsubscribeSetting.unsubscribeCategoryList) && Intrinsics.LJFF(this.accountType, groupUnsubscribeSetting.accountType) && Intrinsics.LJFF(this.settingImageUrl, groupUnsubscribeSetting.settingImageUrl) && Intrinsics.LJFF(this.settingImageUrlDark, groupUnsubscribeSetting.settingImageUrlDark) && Intrinsics.LJFF(this.settingImageUrlTux, groupUnsubscribeSetting.settingImageUrlTux) && Intrinsics.LJFF(this.subscribeCombineSetting, groupUnsubscribeSetting.subscribeCombineSetting);
    }

    public final int hashCode() {
        int iHashCode = ((((this.group * 31) + this.name.hashCode()) * 31) + this.desc.hashCode()) * 31;
        UrlModel urlModel = this.imageUrl;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        UrlModel urlModel2 = this.imageUrlDark;
        int iHashCode3 = (iHashCode2 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        List<UnSubscribeSettingsData> list = this.unsubscribeCategoryList;
        int iHashCode4 = (((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.accountType.hashCode()) * 31;
        UrlModel urlModel3 = this.settingImageUrl;
        int iHashCode5 = (iHashCode4 + (urlModel3 == null ? 0 : urlModel3.hashCode())) * 31;
        UrlModel urlModel4 = this.settingImageUrlDark;
        int iHashCode6 = (iHashCode5 + (urlModel4 == null ? 0 : urlModel4.hashCode())) * 31;
        TuxImageModel tuxImageModel = this.settingImageUrlTux;
        int iHashCode7 = (iHashCode6 + (tuxImageModel == null ? 0 : tuxImageModel.hashCode())) * 31;
        SubscribeCombineSetting subscribeCombineSetting = this.subscribeCombineSetting;
        return iHashCode7 + (subscribeCombineSetting != null ? subscribeCombineSetting.hashCode() : 0);
    }

    public GroupUnsubscribeSetting(int i, String str, String str2, UrlModel urlModel, UrlModel urlModel2, List<UnSubscribeSettingsData> list, String str3, UrlModel urlModel3, UrlModel urlModel4, TuxImageModel tuxImageModel, SubscribeCombineSetting subscribeCombineSetting) {
        this.group = i;
        this.name = str;
        this.desc = str2;
        this.imageUrl = urlModel;
        this.imageUrlDark = urlModel2;
        this.unsubscribeCategoryList = list;
        this.accountType = str3;
        this.settingImageUrl = urlModel3;
        this.settingImageUrlDark = urlModel4;
        this.settingImageUrlTux = tuxImageModel;
        this.subscribeCombineSetting = subscribeCombineSetting;
    }
}
