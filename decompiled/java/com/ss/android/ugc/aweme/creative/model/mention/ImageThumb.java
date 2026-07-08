package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageThumb {

    @C09CT("data_size")
    public final Long dataSize;

    @C09CT("file_cs")
    public final String fileCs;

    @C09CT("file_hash")
    public final String fileHash;

    @C09CT("height")
    public final Integer height;

    @C09CT("player_access_key")
    public final String playerAccessKey;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_key")
    public final String urlKey;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final Integer width;

    public ImageThumb() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public ImageThumb(String str, List<String> list, Long l, Integer num, Integer num2, String str2, String str3, String str4, String str5) {
        this.uri = str;
        this.urlList = list;
        this.dataSize = l;
        this.width = num;
        this.height = num2;
        this.urlKey = str2;
        this.fileHash = str3;
        this.fileCs = str4;
        this.playerAccessKey = str5;
    }
}
