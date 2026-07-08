package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C1855680yOE;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class BaseImage implements Serializable {
    public static final C1855680yOE Companion = new Object() { // from class: X.0yOE
    };

    @C09CT("compressed_file_path")
    public String compressedFilePath;

    @C09CT("compressed_file_size")
    public Long compressedFileSize;

    @C09CT("extra_info")
    public ImageExtraInfo extraInfo;

    @C09CT("height")
    public int height;

    @C09CT("image_id")
    public String imageId;

    @C09CT("image_scene_type")
    public int imageSceneType;

    @C09CT("image_source")
    public String imageSource;

    @C09CT("image_uuid")
    public final String imageUuid;

    @C09CT("inner_url_list")
    public List<String> innerUrlList;

    @C09CT("local_cache_path")
    public String localCachePath;

    @C09CT("original_file_size")
    public Long originalFileSize;

    @C09CT("std_size")
    public int stdSize;

    @C09CT("thumbnail_url_list")
    public List<String> thumbnailUrlList;

    @C09CT("upload_progress")
    public Long uploadProgress;

    @C09CT("upload_status")
    public Integer uploadStatus;

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("width")
    public int width;

    public BaseImage() {
        this(null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262143, null);
    }

    public final BaseImage copy(String str, List<String> list, List<String> list2, List<String> list3, int i, int i2, String str2, Long l, String str3, String str4, Long l2, String str5, Integer num, Long l3, String str6, int i3, int i4, ImageExtraInfo imageExtraInfo) {
        return new BaseImage(str, list, list2, list3, i, i2, str2, l, str3, str4, l2, str5, num, l3, str6, i3, i4, imageExtraInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseImage)) {
            return false;
        }
        BaseImage baseImage = (BaseImage) obj;
        return Intrinsics.LJFF(this.imageId, baseImage.imageId) && Intrinsics.LJFF(this.innerUrlList, baseImage.innerUrlList) && Intrinsics.LJFF(this.urlList, baseImage.urlList) && Intrinsics.LJFF(this.thumbnailUrlList, baseImage.thumbnailUrlList) && this.width == baseImage.width && this.height == baseImage.height && Intrinsics.LJFF(this.uri, baseImage.uri) && Intrinsics.LJFF(this.uploadProgress, baseImage.uploadProgress) && Intrinsics.LJFF(this.localCachePath, baseImage.localCachePath) && Intrinsics.LJFF(this.compressedFilePath, baseImage.compressedFilePath) && Intrinsics.LJFF(this.compressedFileSize, baseImage.compressedFileSize) && Intrinsics.LJFF(this.imageSource, baseImage.imageSource) && Intrinsics.LJFF(this.uploadStatus, baseImage.uploadStatus) && Intrinsics.LJFF(this.originalFileSize, baseImage.originalFileSize) && Intrinsics.LJFF(this.imageUuid, baseImage.imageUuid) && this.stdSize == baseImage.stdSize && this.imageSceneType == baseImage.imageSceneType && Intrinsics.LJFF(this.extraInfo, baseImage.extraInfo);
    }

    public int hashCode() {
        int iHashCode = ((((this.imageId.hashCode() * 31) + this.innerUrlList.hashCode()) * 31) + this.urlList.hashCode()) * 31;
        List<String> list = this.thumbnailUrlList;
        int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.width) * 31) + this.height) * 31;
        String str = this.uri;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.uploadProgress;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.localCachePath;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.compressedFilePath;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.compressedFileSize;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.imageSource;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.uploadStatus;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Long l3 = this.originalFileSize;
        int iHashCode10 = (((((((iHashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31) + this.imageUuid.hashCode()) * 31) + this.stdSize) * 31) + this.imageSceneType) * 31;
        ImageExtraInfo imageExtraInfo = this.extraInfo;
        return iHashCode10 + (imageExtraInfo != null ? imageExtraInfo.hashCode() : 0);
    }

    public String toString() {
        return "BaseImage(imageId=" + this.imageId + ", innerUrlList=" + this.innerUrlList + ", urlList=" + this.urlList + ", thumbnailUrlList=" + this.thumbnailUrlList + ", width=" + this.width + ", height=" + this.height + ", uri=" + this.uri + ", uploadProgress=" + this.uploadProgress + ", localCachePath=" + this.localCachePath + ", compressedFilePath=" + this.compressedFilePath + ", compressedFileSize=" + this.compressedFileSize + ", imageSource=" + this.imageSource + ", uploadStatus=" + this.uploadStatus + ", originalFileSize=" + this.originalFileSize + ", imageUuid=" + this.imageUuid + ", stdSize=" + this.stdSize + ", imageSceneType=" + this.imageSceneType + ", extraInfo=" + this.extraInfo + ')';
    }

    public final void setCompressedFilePath(String str) {
        this.compressedFilePath = str;
    }

    public final void setCompressedFileSize(Long l) {
        this.compressedFileSize = l;
    }

    public final void setExtraInfo(ImageExtraInfo imageExtraInfo) {
        this.extraInfo = imageExtraInfo;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setImageId(String str) {
        this.imageId = str;
    }

    public final void setImageSceneType(int i) {
        this.imageSceneType = i;
    }

    public final void setImageSource(String str) {
        this.imageSource = str;
    }

    public final void setInnerUrlList(List<String> list) {
        this.innerUrlList = list;
    }

    public final void setLocalCachePath(String str) {
        this.localCachePath = str;
    }

    public final void setOriginalFileSize(Long l) {
        this.originalFileSize = l;
    }

    public final void setStdSize(int i) {
        this.stdSize = i;
    }

    public final void setThumbnailUrlList(List<String> list) {
        this.thumbnailUrlList = list;
    }

    public final void setUploadProgress(Long l) {
        this.uploadProgress = l;
    }

    public final void setUploadStatus(Integer num) {
        this.uploadStatus = num;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public final void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public BaseImage(String str, List<String> list, List<String> list2, List<String> list3, int i, int i2, String str2, Long l, String str3, String str4, Long l2, String str5, Integer num, Long l3, String str6, int i3, int i4, ImageExtraInfo imageExtraInfo) {
        this.imageId = str;
        this.innerUrlList = list;
        this.urlList = list2;
        this.thumbnailUrlList = list3;
        this.width = i;
        this.height = i2;
        this.uri = str2;
        this.uploadProgress = l;
        this.localCachePath = str3;
        this.compressedFilePath = str4;
        this.compressedFileSize = l2;
        this.imageSource = str5;
        this.uploadStatus = num;
        this.originalFileSize = l3;
        this.imageUuid = str6;
        this.stdSize = i3;
        this.imageSceneType = i4;
        this.extraInfo = imageExtraInfo;
    }

    public BaseImage(String str, List list, List list2, List list3, int i, int i2, String str2, Long l, String str3, String str4, Long l2, String str5, Integer num, Long l3, String str6, int i3, int i4, ImageExtraInfo imageExtraInfo, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? C13BV.INSTANCE : list, (i5 & 4) != 0 ? C13BV.INSTANCE : list2, (i5 & 8) != 0 ? null : list3, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? "" : str2, (i5 & 128) != 0 ? 0L : l, (i5 & 256) != 0 ? "" : str3, (i5 & 512) != 0 ? "" : str4, (i5 & 1024) != 0 ? 0L : l2, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str5 : "", (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : num, (i5 & 8192) != 0 ? 0L : l3, (i5 & 16384) != 0 ? UUID.randomUUID().toString() : str6, (32768 & i5) != 0 ? 0 : i3, (65536 & i5) != 0 ? 0 : i4, (i5 & 131072) != 0 ? null : imageExtraInfo);
    }
}
