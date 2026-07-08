package com.ss.android.ugc.aweme.ecommerce.galleryviewer.ui;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* JADX INFO: loaded from: classes24.dex */
public class ECLocalVideoUrlModel extends VideoUrlModel {

    @C09CT("accessed_time")
    public Long accessedTime;

    @C09CT("author_id")
    public String authorId;

    @C09CT("local_path")
    public String localPath;

    public ECLocalVideoUrlModel() {
        this.accessedTime = Long.valueOf(System.currentTimeMillis());
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public ECLocalVideoUrlModel(String str) {
        setSourceId(str);
        this.accessedTime = Long.valueOf(System.currentTimeMillis());
    }
}
