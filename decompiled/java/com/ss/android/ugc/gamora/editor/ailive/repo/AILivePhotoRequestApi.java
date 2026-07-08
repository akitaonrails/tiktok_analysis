package com.ss.android.ugc.gamora.editor.ailive.repo;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface AILivePhotoRequestApi {
    @InterfaceC1501160pAQ("/tiktok/v1/aigc/prompt_suggest")
    Object getAILivePhotoPrompts(@InterfaceC1501070pAH("source") int i, @InterfaceC1501070pAH("input") String str, @InterfaceC1501070pAH("biz") int i2, @InterfaceC1501070pAH("limit") int i3, InterfaceC1364105Vn<? super AILivePhotoPromptsResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/aigc/prompt_rewrite")
    Object getAILivePromptRewrite(@InterfaceC1501070pAH("business_scene") String str, @InterfaceC1501070pAH("task_type") String str2, @InterfaceC1501070pAH("prompt_text") String str3, @InterfaceC1501070pAH("image_uri_list") List<String> list, @InterfaceC1501070pAH("task_id") String str4, InterfaceC1364105Vn<? super AILivePromptRewriteResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/aigc/blip")
    Object getBlipDescription(@InterfaceC1501050pAF("uri") String str, @InterfaceC1501050pAF("biz") int i, InterfaceC1364105Vn<? super BlipDescriptionResponse> interfaceC1364105Vn);
}
