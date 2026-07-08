package com.ss.android.ugc.aweme.aigc.graph.net;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UrlStruct implements Serializable {

    @C09CT("data_size")
    public final Long dataSize;

    @C09CT("file_cs")
    public final String fileCs;

    @C09CT("file_hash")
    public final String fileHash;

    @C09CT("height")
    public final Integer height;

    @C09CT("invalid")
    public final Boolean invalid;

    @C09CT("md5")
    public final String md5;

    @C09CT("player_access_key")
    public final String playerAccessKey;

    @C09CT("type")
    public final Integer type;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_key")
    public final String urlKey;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("url_prefix")
    public final List<String> urlPrefix;

    @C09CT("url_sub_type")
    public final Integer urlSubType;

    @C09CT("width")
    public final Integer width;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlStruct)) {
            return false;
        }
        UrlStruct urlStruct = (UrlStruct) obj;
        return Intrinsics.LJFF(this.uri, urlStruct.uri) && Intrinsics.LJFF(this.urlList, urlStruct.urlList) && Intrinsics.LJFF(this.width, urlStruct.width) && Intrinsics.LJFF(this.height, urlStruct.height) && Intrinsics.LJFF(this.urlKey, urlStruct.urlKey) && Intrinsics.LJFF(this.dataSize, urlStruct.dataSize) && Intrinsics.LJFF(this.fileHash, urlStruct.fileHash) && Intrinsics.LJFF(this.invalid, urlStruct.invalid) && Intrinsics.LJFF(this.fileCs, urlStruct.fileCs) && Intrinsics.LJFF(this.type, urlStruct.type) && Intrinsics.LJFF(this.urlSubType, urlStruct.urlSubType) && Intrinsics.LJFF(this.md5, urlStruct.md5) && Intrinsics.LJFF(this.playerAccessKey, urlStruct.playerAccessKey) && Intrinsics.LJFF(this.urlPrefix, urlStruct.urlPrefix);
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.urlKey;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.dataSize;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.fileHash;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.invalid;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.fileCs;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.type;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.urlSubType;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str5 = this.md5;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.playerAccessKey;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list2 = this.urlPrefix;
        return iHashCode13 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "UrlStruct(uri=" + this.uri + ", urlList=" + this.urlList + ", width=" + this.width + ", height=" + this.height + ", urlKey=" + this.urlKey + ", dataSize=" + this.dataSize + ", fileHash=" + this.fileHash + ", invalid=" + this.invalid + ", fileCs=" + this.fileCs + ", type=" + this.type + ", urlSubType=" + this.urlSubType + ", md5=" + this.md5 + ", playerAccessKey=" + this.playerAccessKey + ", urlPrefix=" + this.urlPrefix + ')';
    }

    public UrlStruct(String str, List<String> list, Integer num, Integer num2, String str2, Long l, String str3, Boolean bool, String str4, Integer num3, Integer num4, String str5, String str6, List<String> list2) {
        this.uri = str;
        this.urlList = list;
        this.width = num;
        this.height = num2;
        this.urlKey = str2;
        this.dataSize = l;
        this.fileHash = str3;
        this.invalid = bool;
        this.fileCs = str4;
        this.type = num3;
        this.urlSubType = num4;
        this.md5 = str5;
        this.playerAccessKey = str6;
        this.urlPrefix = list2;
    }
}
