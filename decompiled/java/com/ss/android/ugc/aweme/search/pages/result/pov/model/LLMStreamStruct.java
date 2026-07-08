package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class LLMStreamStruct implements Serializable {

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    @C09CT("summary_stream")
    public final AISummaryStream summaryStream;

    public LLMStreamStruct() {
        this(null, null);
    }

    public int hashCode() {
        Integer num = this.scene;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        AISummaryStream aISummaryStream = this.summaryStream;
        return iHashCode + (aISummaryStream != null ? aISummaryStream.hashCode() : 0);
    }

    public LLMStreamStruct(Integer num, AISummaryStream aISummaryStream) {
        this.scene = num;
        this.summaryStream = aISummaryStream;
    }
}
