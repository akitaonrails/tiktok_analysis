package com.ss.android.ugc.aweme.video.preload.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes24.dex */
public class PreloadTask {
    public boolean alreadyPreload;

    @C09CT("count")
    public int count;

    @C09CT("offset")
    public int offset;

    @C09CT("download_progress")
    public int progress;

    @C09CT("size")
    public int size;

    public int getVideoPreloadSize() {
        int i = this.size;
        if (i <= 0) {
            return 10485759;
        }
        return i * 1024;
    }

    public PreloadTask() {
        this.progress = 100;
        this.count = 1;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadTask{progress=");
        sbLIZ.append(this.progress);
        sbLIZ.append(", offset=");
        sbLIZ.append(this.offset);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", size=");
        sbLIZ.append(this.size);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreloadTask(int i, int i2) {
        this.progress = 100;
        this.count = i;
        this.size = i2;
    }
}
