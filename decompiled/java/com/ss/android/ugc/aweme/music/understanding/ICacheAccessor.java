package com.ss.android.ugc.aweme.music.understanding;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface ICacheAccessor {
    /* JADX INFO: renamed from: get-R6Iu3AI */
    ContentUnderstandingResult mo12getR6Iu3AI(PipelineTag pipelineTag, String str);

    /* JADX INFO: renamed from: getCrossRun-ZMYo8sw */
    ContentUnderstandingResult mo13getCrossRunZMYo8sw(PipelineTag pipelineTag, String str, String str2);

    /* JADX INFO: renamed from: put-ZMYo8sw */
    void mo14putZMYo8sw(PipelineTag pipelineTag, String str, ContentUnderstandingResult contentUnderstandingResult);

    /* JADX INFO: renamed from: putCrossRun-qawT-gY */
    void mo15putCrossRunqawTgY(PipelineTag pipelineTag, String str, String str2, ContentUnderstandingResult contentUnderstandingResult);

    Map<NodeTag, ContentUnderstandingResult> snapshot(PipelineTag pipelineTag);
}
