package com.ss.android.ugc.aweme.video.local;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* JADX INFO: loaded from: classes31.dex */
public class LocalVideoUrlModel extends VideoUrlModel {

    @C09CT("accessed_time")
    public Long accessedTime;

    @C09CT("author_id")
    public String authorId;

    @C09CT("local_path")
    public String localPath;

    public LocalVideoUrlModel() {
        this.accessedTime = Long.valueOf(System.currentTimeMillis());
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public LocalVideoUrlModel(String str) {
        setSourceId(str);
        this.accessedTime = Long.valueOf(System.currentTimeMillis());
    }
}
