package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class LLMStreamExtraStruct implements Serializable {

    @C09CT("server_stream_time")
    public final Long serverStreamTime;

    public LLMStreamExtraStruct() {
        this(null);
    }

    public int hashCode() {
        Long l = this.serverStreamTime;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public LLMStreamExtraStruct(Long l) {
        this.serverStreamTime = l;
    }
}
