package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayAddress implements Serializable {

    @C09CT("data_size")
    public Long dataSize;

    @C09CT("file_cs")
    public String fileCS;

    @C09CT("file_hash")
    public String fileHash;

    @C09CT("height")
    public Integer height;

    @C09CT("player_access_key")
    public String playerAccessKey;

    @C09CT("uri")
    public String uri;

    @C09CT("url_key")
    public String urlKey;

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("width")
    public Integer width;

    public PlayAddress() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayAddress(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", urlKey=");
        sbLIZ.append(this.urlKey);
        sbLIZ.append(", dataSize=");
        sbLIZ.append(this.dataSize);
        sbLIZ.append(", fileHash=");
        sbLIZ.append(this.fileHash);
        sbLIZ.append(", fileCS=");
        sbLIZ.append(this.fileCS);
        sbLIZ.append(", playerAccessKey=");
        sbLIZ.append(this.playerAccessKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PlayAddress(String str, List<String> list, Integer num, Integer num2, String str2, Long l, String str3, String str4, String str5) {
        this.uri = str;
        this.urlList = list;
        this.width = num;
        this.height = num2;
        this.urlKey = str2;
        this.dataSize = l;
        this.fileHash = str3;
        this.fileCS = str4;
        this.playerAccessKey = str5;
    }
}
