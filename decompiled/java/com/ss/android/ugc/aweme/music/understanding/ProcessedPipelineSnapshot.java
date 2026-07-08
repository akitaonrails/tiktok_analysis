package com.ss.android.ugc.aweme.music.understanding;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ProcessedPipelineSnapshot {
    public final PipelineTag pipelineTag;
    public final ContentUnderstandingRequest request;
    public final ContentUnderstandingResult result;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessedPipelineSnapshot)) {
            return false;
        }
        ProcessedPipelineSnapshot processedPipelineSnapshot = (ProcessedPipelineSnapshot) obj;
        return Intrinsics.LJFF(this.pipelineTag, processedPipelineSnapshot.pipelineTag) && Intrinsics.LJFF(this.request, processedPipelineSnapshot.request) && Intrinsics.LJFF(this.result, processedPipelineSnapshot.result);
    }

    public int hashCode() {
        return (((this.pipelineTag.hashCode() * 31) + this.request.hashCode()) * 31) + this.result.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcessedPipelineSnapshot(pipelineTag=");
        sbLIZ.append(this.pipelineTag);
        sbLIZ.append(", request=");
        sbLIZ.append(this.request);
        sbLIZ.append(", result=");
        sbLIZ.append(this.result);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProcessedPipelineSnapshot(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, ContentUnderstandingResult contentUnderstandingResult) {
        this.pipelineTag = pipelineTag;
        this.request = contentUnderstandingRequest;
        this.result = contentUnderstandingResult;
    }
}
