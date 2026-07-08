package com.ss.android.ugc.gamora.editor.audioservice.service.memesong;

import X.C09CT;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class MemeSongNetRes implements Serializable {
    public static final int $stable = 8;
    public String LL;
    public int LLILLJJLI;
    public String LLILLL;

    @C09CT("results")
    public final List<MemeSongModel> results;

    public final List<MemeSongModel> getResults() {
        return this.results;
    }

    public final int getStatusCode() {
        return this.LLILLJJLI;
    }

    public final String getStatusText() {
        return this.LLILLL;
    }

    public final String getTaskId() {
        return this.LL;
    }

    public MemeSongNetRes(List<MemeSongModel> list) {
        this.results = list;
    }

    public final void setStatusCode(int i) {
        this.LLILLJJLI = i;
    }

    public final void setStatusText(String str) {
        this.LLILLL = str;
    }

    public final void setTaskId(String str) {
        this.LL = str;
    }
}
