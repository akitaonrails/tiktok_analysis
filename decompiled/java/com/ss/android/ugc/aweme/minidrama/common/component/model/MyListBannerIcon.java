package com.ss.android.ugc.aweme.minidrama.common.component.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MyListBannerIcon implements Serializable {

    @C09CT("data_size")
    public final Long dataSize;

    @C09CT("file_cs")
    public final String fileCs;

    @C09CT("file_hash")
    public final String fileHash;

    @C09CT("file_id")
    public final String fileId;

    @C09CT("height")
    public final Long height;

    @C09CT("image_media_model")
    public final MyListBannerImageMediaModel imageMediaModel;

    @C09CT("player_access_key")
    public final String playerAccessKey;

    @C09CT("preview")
    public final MyListBannerPreview preview;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_key")
    public final String urlKey;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final Long width;

    public MyListBannerIcon() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyListBannerIcon)) {
            return false;
        }
        MyListBannerIcon myListBannerIcon = (MyListBannerIcon) obj;
        return Intrinsics.LJFF(this.uri, myListBannerIcon.uri) && Intrinsics.LJFF(this.urlList, myListBannerIcon.urlList) && Intrinsics.LJFF(this.width, myListBannerIcon.width) && Intrinsics.LJFF(this.height, myListBannerIcon.height) && Intrinsics.LJFF(this.urlKey, myListBannerIcon.urlKey) && Intrinsics.LJFF(this.dataSize, myListBannerIcon.dataSize) && Intrinsics.LJFF(this.fileHash, myListBannerIcon.fileHash) && Intrinsics.LJFF(this.fileCs, myListBannerIcon.fileCs) && Intrinsics.LJFF(this.playerAccessKey, myListBannerIcon.playerAccessKey) && Intrinsics.LJFF(this.fileId, myListBannerIcon.fileId) && Intrinsics.LJFF(this.imageMediaModel, myListBannerIcon.imageMediaModel) && Intrinsics.LJFF(this.preview, myListBannerIcon.preview);
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
        String str5 = this.playerAccessKey;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fileId;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        MyListBannerImageMediaModel myListBannerImageMediaModel = this.imageMediaModel;
        int iHashCode11 = (iHashCode10 + (myListBannerImageMediaModel == null ? 0 : myListBannerImageMediaModel.hashCode())) * 31;
        MyListBannerPreview myListBannerPreview = this.preview;
        return iHashCode11 + (myListBannerPreview != null ? myListBannerPreview.hashCode() : 0);
    }

    public String toString() {
        return "MyListBannerIcon(uri=" + this.uri + ", urlList=" + this.urlList + ", width=" + this.width + ", height=" + this.height + ", urlKey=" + this.urlKey + ", dataSize=" + this.dataSize + ", fileHash=" + this.fileHash + ", fileCs=" + this.fileCs + ", playerAccessKey=" + this.playerAccessKey + ", fileId=" + this.fileId + ", imageMediaModel=" + this.imageMediaModel + ", preview=" + this.preview + ')';
    }

    public MyListBannerIcon(String str, List<String> list, Long l, Long l2, String str2, Long l3, String str3, String str4, String str5, String str6, MyListBannerImageMediaModel myListBannerImageMediaModel, MyListBannerPreview myListBannerPreview) {
        this.uri = str;
        this.urlList = list;
        this.width = l;
        this.height = l2;
        this.urlKey = str2;
        this.dataSize = l3;
        this.fileHash = str3;
        this.fileCs = str4;
        this.playerAccessKey = str5;
        this.fileId = str6;
        this.imageMediaModel = myListBannerImageMediaModel;
        this.preview = myListBannerPreview;
    }
}
