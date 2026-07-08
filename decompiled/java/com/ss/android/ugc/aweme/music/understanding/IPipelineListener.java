package com.ss.android.ugc.aweme.music.understanding;

/* JADX INFO: loaded from: classes4.dex */
public interface IPipelineListener {
    void onFinishFailed(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, Throwable th, int i);

    void onFinishSuccess(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, ContentUnderstandingResult contentUnderstandingResult);

    /* JADX INFO: renamed from: onNodeFailed-qawT-gY */
    void mo16onNodeFailedqawTgY(PipelineTag pipelineTag, String str, Throwable th, int i);

    /* JADX INFO: renamed from: onNodeStart-R6Iu3AI */
    void mo17onNodeStartR6Iu3AI(PipelineTag pipelineTag, String str);

    /* JADX INFO: renamed from: onNodeSuccess-qawT-gY */
    void mo18onNodeSuccessqawTgY(PipelineTag pipelineTag, String str, ContentUnderstandingResult contentUnderstandingResult, boolean z);

    void onStart(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest);
}
