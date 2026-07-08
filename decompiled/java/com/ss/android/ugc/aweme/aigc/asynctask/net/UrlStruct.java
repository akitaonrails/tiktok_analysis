package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class UrlStruct implements Serializable {
    public static final int $stable = 8;

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
