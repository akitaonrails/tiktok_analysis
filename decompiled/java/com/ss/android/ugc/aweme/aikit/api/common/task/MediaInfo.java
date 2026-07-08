package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaInfo implements Serializable {

    @C09CT("data_size")
    public final Long dataSize;

    @C09CT("file_cs")
    public final String fileCs;

    @C09CT("file_hash")
    public final String fileHash;

    @C09CT("height")
    public final Long height;

    @C09CT("player_access_key")
    public final String playerAccessKey;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_key")
    public final String urlKey;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("url_prefix")
    public final String urlPrefix;

    @C09CT("width")
    public final Long width;

    public MediaInfo() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        return Intrinsics.LJFF(this.uri, mediaInfo.uri) && Intrinsics.LJFF(this.urlList, mediaInfo.urlList) && Intrinsics.LJFF(this.dataSize, mediaInfo.dataSize) && Intrinsics.LJFF(this.width, mediaInfo.width) && Intrinsics.LJFF(this.height, mediaInfo.height) && Intrinsics.LJFF(this.urlKey, mediaInfo.urlKey) && Intrinsics.LJFF(this.fileHash, mediaInfo.fileHash) && Intrinsics.LJFF(this.fileCs, mediaInfo.fileCs) && Intrinsics.LJFF(this.playerAccessKey, mediaInfo.playerAccessKey) && Intrinsics.LJFF(this.urlPrefix, mediaInfo.urlPrefix);
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.dataSize;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.width;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.height;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.urlKey;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileHash;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fileCs;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.playerAccessKey;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.urlPrefix;
        return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaInfo(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", dataSize=");
        sbLIZ.append(this.dataSize);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", urlKey=");
        sbLIZ.append(this.urlKey);
        sbLIZ.append(", fileHash=");
        sbLIZ.append(this.fileHash);
        sbLIZ.append(", fileCs=");
        sbLIZ.append(this.fileCs);
        sbLIZ.append(", playerAccessKey=");
        sbLIZ.append(this.playerAccessKey);
        sbLIZ.append(", urlPrefix=");
        sbLIZ.append(this.urlPrefix);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MediaInfo(String str, List<String> list, Long l, Long l2, Long l3, String str2, String str3, String str4, String str5, String str6) {
        this.uri = str;
        this.urlList = list;
        this.dataSize = l;
        this.width = l2;
        this.height = l3;
        this.urlKey = str2;
        this.fileHash = str3;
        this.fileCs = str4;
        this.playerAccessKey = str5;
        this.urlPrefix = str6;
    }
}
