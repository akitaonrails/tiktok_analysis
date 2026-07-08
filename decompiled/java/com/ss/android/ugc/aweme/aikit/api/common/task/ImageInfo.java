package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageInfo implements Serializable {

    @C09CT("alternate_text")
    public final String alternateText;

    @C09CT("data_size")
    public final Long dataSize;

    @C09CT("expire_time")
    public final Long expireTime;

    @C09CT("file_cs")
    public final String fileCs;

    @C09CT("file_hash")
    public final String fileHash;

    @C09CT("file_id")
    public final String fileId;

    @C09CT("height")
    public final Long height;

    @C09CT("image_index")
    public final Long imageIndex;

    @C09CT("image_media_model")
    public final ImageMediaModel imageMediaModel;

    @C09CT("image_source")
    public final Long imageSource;

    @C09CT("image_thumb")
    public final ImageInfo imageThumb;

    @C09CT("invalid")
    public final Boolean invalid;

    @C09CT("md5")
    public final String md5;

    @C09CT("pack_source_info")
    public final PackSourceInfo packSourceInfo;

    @C09CT("player_access_key")
    public final String playerAccessKey;

    @C09CT("preview")
    public final PreviewInfo preview;

    @C09CT("primary_image_type")
    public final Long primaryImageType;

    @C09CT("seq")
    public final Long seq;

    @C09CT("static_image_larger")
    public final ImageInfo staticImageLarger;

    @C09CT("static_image_medium")
    public final ImageInfo staticImageMedium;

    @C09CT("subscription_info")
    public final SubscriptionInfo subscriptionInfo;

    @C09CT("type")
    public final Long type;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_key")
    public final String urlKey;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("url_prefix")
    public final List<String> urlPrefix;

    @C09CT("url_sub_type")
    public final Long urlSubType;

    @C09CT("width")
    public final Long width;

    public ImageInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageInfo)) {
            return false;
        }
        ImageInfo imageInfo = (ImageInfo) obj;
        return Intrinsics.LJFF(this.uri, imageInfo.uri) && Intrinsics.LJFF(this.urlList, imageInfo.urlList) && Intrinsics.LJFF(this.width, imageInfo.width) && Intrinsics.LJFF(this.height, imageInfo.height) && Intrinsics.LJFF(this.urlKey, imageInfo.urlKey) && Intrinsics.LJFF(this.dataSize, imageInfo.dataSize) && Intrinsics.LJFF(this.fileHash, imageInfo.fileHash) && Intrinsics.LJFF(this.fileCs, imageInfo.fileCs) && Intrinsics.LJFF(this.type, imageInfo.type) && Intrinsics.LJFF(this.urlSubType, imageInfo.urlSubType) && Intrinsics.LJFF(this.md5, imageInfo.md5) && Intrinsics.LJFF(this.playerAccessKey, imageInfo.playerAccessKey) && Intrinsics.LJFF(this.urlPrefix, imageInfo.urlPrefix) && Intrinsics.LJFF(this.imageMediaModel, imageInfo.imageMediaModel) && Intrinsics.LJFF(this.expireTime, imageInfo.expireTime) && Intrinsics.LJFF(this.packSourceInfo, imageInfo.packSourceInfo) && Intrinsics.LJFF(this.primaryImageType, imageInfo.primaryImageType) && Intrinsics.LJFF(this.imageIndex, imageInfo.imageIndex) && Intrinsics.LJFF(this.preview, imageInfo.preview) && Intrinsics.LJFF(this.fileId, imageInfo.fileId) && Intrinsics.LJFF(this.imageSource, imageInfo.imageSource) && Intrinsics.LJFF(this.seq, imageInfo.seq) && Intrinsics.LJFF(this.invalid, imageInfo.invalid) && Intrinsics.LJFF(this.alternateText, imageInfo.alternateText) && Intrinsics.LJFF(this.subscriptionInfo, imageInfo.subscriptionInfo) && Intrinsics.LJFF(this.staticImageMedium, imageInfo.staticImageMedium) && Intrinsics.LJFF(this.staticImageLarger, imageInfo.staticImageLarger) && Intrinsics.LJFF(this.imageThumb, imageInfo.imageThumb);
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.width;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.height;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.urlKey;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.dataSize;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.fileHash;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fileCs;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l4 = this.type;
        int iHashCode9 = (iHashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.urlSubType;
        int iHashCode10 = (iHashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str5 = this.md5;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.playerAccessKey;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list2 = this.urlPrefix;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ImageMediaModel imageMediaModel = this.imageMediaModel;
        int iHashCode14 = (iHashCode13 + (imageMediaModel == null ? 0 : imageMediaModel.hashCode())) * 31;
        Long l6 = this.expireTime;
        int iHashCode15 = (iHashCode14 + (l6 == null ? 0 : l6.hashCode())) * 31;
        PackSourceInfo packSourceInfo = this.packSourceInfo;
        int iHashCode16 = (iHashCode15 + (packSourceInfo == null ? 0 : packSourceInfo.hashCode())) * 31;
        Long l7 = this.primaryImageType;
        int iHashCode17 = (iHashCode16 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.imageIndex;
        int iHashCode18 = (iHashCode17 + (l8 == null ? 0 : l8.hashCode())) * 31;
        PreviewInfo previewInfo = this.preview;
        int iHashCode19 = (iHashCode18 + (previewInfo == null ? 0 : previewInfo.hashCode())) * 31;
        String str7 = this.fileId;
        int iHashCode20 = (iHashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l9 = this.imageSource;
        int iHashCode21 = (iHashCode20 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.seq;
        int iHashCode22 = (iHashCode21 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool = this.invalid;
        int iHashCode23 = (iHashCode22 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.alternateText;
        int iHashCode24 = (iHashCode23 + (str8 == null ? 0 : str8.hashCode())) * 31;
        SubscriptionInfo subscriptionInfo = this.subscriptionInfo;
        int iHashCode25 = (iHashCode24 + (subscriptionInfo == null ? 0 : subscriptionInfo.hashCode())) * 31;
        ImageInfo imageInfo = this.staticImageMedium;
        int iHashCode26 = (iHashCode25 + (imageInfo == null ? 0 : imageInfo.hashCode())) * 31;
        ImageInfo imageInfo2 = this.staticImageLarger;
        int iHashCode27 = (iHashCode26 + (imageInfo2 == null ? 0 : imageInfo2.hashCode())) * 31;
        ImageInfo imageInfo3 = this.imageThumb;
        return iHashCode27 + (imageInfo3 != null ? imageInfo3.hashCode() : 0);
    }

    public String toString() {
        return "ImageInfo(uri=" + this.uri + ", urlList=" + this.urlList + ", width=" + this.width + ", height=" + this.height + ", urlKey=" + this.urlKey + ", dataSize=" + this.dataSize + ", fileHash=" + this.fileHash + ", fileCs=" + this.fileCs + ", type=" + this.type + ", urlSubType=" + this.urlSubType + ", md5=" + this.md5 + ", playerAccessKey=" + this.playerAccessKey + ", urlPrefix=" + this.urlPrefix + ", imageMediaModel=" + this.imageMediaModel + ", expireTime=" + this.expireTime + ", packSourceInfo=" + this.packSourceInfo + ", primaryImageType=" + this.primaryImageType + ", imageIndex=" + this.imageIndex + ", preview=" + this.preview + ", fileId=" + this.fileId + ", imageSource=" + this.imageSource + ", seq=" + this.seq + ", invalid=" + this.invalid + ", alternateText=" + this.alternateText + ", subscriptionInfo=" + this.subscriptionInfo + ", staticImageMedium=" + this.staticImageMedium + ", staticImageLarger=" + this.staticImageLarger + ", imageThumb=" + this.imageThumb + ')';
    }

    public ImageInfo(String str, List<String> list, Long l, Long l2, String str2, Long l3, String str3, String str4, Long l4, Long l5, String str5, String str6, List<String> list2, ImageMediaModel imageMediaModel, Long l6, PackSourceInfo packSourceInfo, Long l7, Long l8, PreviewInfo previewInfo, String str7, Long l9, Long l10, Boolean bool, String str8, SubscriptionInfo subscriptionInfo, ImageInfo imageInfo, ImageInfo imageInfo2, ImageInfo imageInfo3) {
        this.uri = str;
        this.urlList = list;
        this.width = l;
        this.height = l2;
        this.urlKey = str2;
        this.dataSize = l3;
        this.fileHash = str3;
        this.fileCs = str4;
        this.type = l4;
        this.urlSubType = l5;
        this.md5 = str5;
        this.playerAccessKey = str6;
        this.urlPrefix = list2;
        this.imageMediaModel = imageMediaModel;
        this.expireTime = l6;
        this.packSourceInfo = packSourceInfo;
        this.primaryImageType = l7;
        this.imageIndex = l8;
        this.preview = previewInfo;
        this.fileId = str7;
        this.imageSource = l9;
        this.seq = l10;
        this.invalid = bool;
        this.alternateText = str8;
        this.subscriptionInfo = subscriptionInfo;
        this.staticImageMedium = imageInfo;
        this.staticImageLarger = imageInfo2;
        this.imageThumb = imageInfo3;
    }
}
