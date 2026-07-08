package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloadVideoInfo {

    @C09CT("data_size")
    public final Long dataSize;

    @C09CT("height")
    public final Integer height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("url_prefix")
    public final String urlPrefix;

    @C09CT("width")
    public final Integer width;

    public DownloadVideoInfo(Integer num, Long l, List<String> list, Integer num2, String str, String str2) {
        this.width = num;
        this.dataSize = l;
        this.urlList = list;
        this.height = num2;
        this.uri = str;
        this.urlPrefix = str2;
    }
}
