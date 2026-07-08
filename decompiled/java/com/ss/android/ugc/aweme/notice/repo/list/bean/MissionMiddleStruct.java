package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class MissionMiddleStruct {

    @C09CT("banner_images")
    public final List<BannerImageStruct> bannerImages;

    @C09CT("content_title")
    public final MissionTextStruct contentTitle;

    @C09CT("content_title_extra")
    public final ContentTitleExtra contentTitleExtra;

    @C09CT("content_title_icon")
    public final TuxImageModel contentTitleIcon;

    @C09CT("contents")
    public final List<MissionLineTextStruct> contents;

    @C09CT("right_image_url")
    public final UrlModel rightImageModel;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("total_banner_image")
    public final long totalBannerImage;

    public MissionMiddleStruct() {
        this(null, null, null, "", null, null, 0L, null);
    }

    public int hashCode() {
        MissionTextStruct missionTextStruct = this.contentTitle;
        int iHashCode = (missionTextStruct == null ? 0 : missionTextStruct.hashCode()) * 31;
        List<MissionLineTextStruct> list = this.contents;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        UrlModel urlModel = this.rightImageModel;
        int iHashCode3 = (((iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.schemaUrl.hashCode()) * 31;
        ContentTitleExtra contentTitleExtra = this.contentTitleExtra;
        int iHashCode4 = (iHashCode3 + (contentTitleExtra == null ? 0 : contentTitleExtra.hashCode())) * 31;
        List<BannerImageStruct> list2 = this.bannerImages;
        int iHashCode5 = (((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + C786410Ut5.Y2(this.totalBannerImage)) * 31;
        TuxImageModel tuxImageModel = this.contentTitleIcon;
        return iHashCode5 + (tuxImageModel != null ? tuxImageModel.hashCode() : 0);
    }

    public MissionMiddleStruct(MissionTextStruct missionTextStruct, List<MissionLineTextStruct> list, UrlModel urlModel, String str, ContentTitleExtra contentTitleExtra, List<BannerImageStruct> list2, long j, TuxImageModel tuxImageModel) {
        this.contentTitle = missionTextStruct;
        this.contents = list;
        this.rightImageModel = urlModel;
        this.schemaUrl = str;
        this.contentTitleExtra = contentTitleExtra;
        this.bannerImages = list2;
        this.totalBannerImage = j;
        this.contentTitleIcon = tuxImageModel;
    }
}
