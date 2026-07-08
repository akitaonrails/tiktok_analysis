package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfoWithCategory;
import com.ss.android.ugc.aweme.profile.model.AvatarSizeUrlStruct;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class Avatar implements Serializable {

    @C09CT("avatar_300x300")
    public UrlModel avatar300;

    @C09CT("avatar_larger")
    public UrlModel avatarLarger;

    @C09CT("avatar_medium")
    public UrlModel avatarMedium;

    @C09CT("avatar_meta_info")
    public AvatarMetaInfo avatarMetaInfo;

    @C09CT("avatar_meta_info_list")
    public List<AvatarMetaInfoWithCategory> avatarMetaInfoList;

    @C09CT("avatar_thumb")
    public UrlModel avatarThumb;

    @C09CT("video_icon")
    public UrlModel avatarVideoUri;

    @C09CT("dynamic_social_avatar")
    public AvatarSizeUrlStruct dynamicSocialAvatar;

    @C09CT("navi_id")
    public String naviId;

    @C09CT("social_avatar_with_background")
    public AvatarSizeUrlStruct socialAvatarWithBackground;

    @C09CT("social_avatar_without_background")
    public AvatarSizeUrlStruct socialAvatarWithoutBackground;

    @C09CT("static_avatar")
    public AvatarSizeUrlStruct staticAvatar;

    public final UrlModel getAvatar300() {
        return this.avatar300;
    }

    public final UrlModel getAvatarLarger() {
        return this.avatarLarger;
    }

    public final UrlModel getAvatarMedium() {
        return this.avatarMedium;
    }

    public final AvatarMetaInfo getAvatarMetaInfo() {
        return this.avatarMetaInfo;
    }

    public final List<AvatarMetaInfoWithCategory> getAvatarMetaInfoList() {
        return this.avatarMetaInfoList;
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final UrlModel getAvatarVideoUri() {
        return this.avatarVideoUri;
    }

    public final AvatarSizeUrlStruct getDynamicSocialAvatar() {
        return this.dynamicSocialAvatar;
    }

    public final String getNaviId() {
        return this.naviId;
    }

    public final AvatarSizeUrlStruct getSocialAvatarWithBackground() {
        return this.socialAvatarWithBackground;
    }

    public final AvatarSizeUrlStruct getSocialAvatarWithoutBackground() {
        return this.socialAvatarWithoutBackground;
    }

    public final AvatarSizeUrlStruct getStaticAvatar() {
        return this.staticAvatar;
    }

    public final void setAvatar300(UrlModel urlModel) {
        this.avatar300 = urlModel;
    }

    public final void setAvatarLarger(UrlModel urlModel) {
        this.avatarLarger = urlModel;
    }

    public final void setAvatarMedium(UrlModel urlModel) {
        this.avatarMedium = urlModel;
    }

    public final void setAvatarMetaInfo(AvatarMetaInfo avatarMetaInfo) {
        this.avatarMetaInfo = avatarMetaInfo;
    }

    public final void setAvatarMetaInfoList(List<AvatarMetaInfoWithCategory> list) {
        this.avatarMetaInfoList = list;
    }

    public final void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public final void setAvatarVideoUri(UrlModel urlModel) {
        this.avatarVideoUri = urlModel;
    }

    public final void setDynamicSocialAvatar(AvatarSizeUrlStruct avatarSizeUrlStruct) {
        this.dynamicSocialAvatar = avatarSizeUrlStruct;
    }

    public final void setNaviId(String str) {
        this.naviId = str;
    }

    public final void setSocialAvatarWithBackground(AvatarSizeUrlStruct avatarSizeUrlStruct) {
        this.socialAvatarWithBackground = avatarSizeUrlStruct;
    }

    public final void setSocialAvatarWithoutBackground(AvatarSizeUrlStruct avatarSizeUrlStruct) {
        this.socialAvatarWithoutBackground = avatarSizeUrlStruct;
    }

    public final void setStaticAvatar(AvatarSizeUrlStruct avatarSizeUrlStruct) {
        this.staticAvatar = avatarSizeUrlStruct;
    }
}
