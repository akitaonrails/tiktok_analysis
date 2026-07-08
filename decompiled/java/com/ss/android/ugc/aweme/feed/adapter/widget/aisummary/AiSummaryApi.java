package com.ss.android.ugc.aweme.feed.adapter.widget.aisummary;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import tikcast.api.anchor_tool.SubmitLLMTitleFeedbackReq;
import tikcast.api.anchor_tool.SubmitLLMTitleFeedbackResp;

/* JADX INFO: loaded from: classes13.dex */
public interface AiSummaryApi {
    @InterfaceC1501170pAR("/webcast/anchor_tool/llm_title/feedback/")
    C11NZ<SubmitLLMTitleFeedbackResp> aiSummaryFeedback(@InterfaceC1485405rg SubmitLLMTitleFeedbackReq submitLLMTitleFeedbackReq);
}
