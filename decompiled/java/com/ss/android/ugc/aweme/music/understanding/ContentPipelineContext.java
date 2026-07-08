package com.ss.android.ugc.aweme.music.understanding;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentPipelineContext {
    public final ICacheAccessor cacheAccessor;
    public final PipelineTag pipelineTag;
    public final ContentUnderstandingRequest request;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPipelineContext)) {
            return false;
        }
        ContentPipelineContext contentPipelineContext = (ContentPipelineContext) obj;
        return Intrinsics.LJFF(this.pipelineTag, contentPipelineContext.pipelineTag) && Intrinsics.LJFF(this.request, contentPipelineContext.request) && Intrinsics.LJFF(this.cacheAccessor, contentPipelineContext.cacheAccessor);
    }

    public int hashCode() {
        return (((this.pipelineTag.hashCode() * 31) + this.request.hashCode()) * 31) + this.cacheAccessor.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentPipelineContext(pipelineTag=");
        sbLIZ.append(this.pipelineTag);
        sbLIZ.append(", request=");
        sbLIZ.append(this.request);
        sbLIZ.append(", cacheAccessor=");
        sbLIZ.append(this.cacheAccessor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ContentPipelineContext(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, ICacheAccessor iCacheAccessor) {
        this.pipelineTag = pipelineTag;
        this.request = contentUnderstandingRequest;
        this.cacheAccessor = iCacheAccessor;
    }
}
