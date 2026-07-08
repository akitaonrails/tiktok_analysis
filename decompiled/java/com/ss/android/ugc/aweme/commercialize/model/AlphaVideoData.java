package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AlphaVideoData implements Serializable {

    @C09CT("alpha_video_config")
    public final String alphaVideoConfig;

    @C09CT("file_hash")
    public final String fileHash;

    @C09CT("height")
    public final Integer height;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("vid")
    public final String vid;

    @C09CT("video_length")
    public final Integer videoLength;

    @C09CT("width")
    public final Integer width;

    public AlphaVideoData() {
        this(null, null, null, null, null, null, null);
    }

    public AlphaVideoData(String str, List<String> list, Integer num, Integer num2, Integer num3, String str2, String str3) {
        this.vid = str;
        this.urlList = list;
        this.videoLength = num;
        this.width = num2;
        this.height = num3;
        this.fileHash = str2;
        this.alphaVideoConfig = str3;
    }
}
