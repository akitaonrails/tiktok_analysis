package com.ss.android.ugc.aweme.shortvideo.editpost.api;

import X.C0X9S;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.editpost.EditPostResponse;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public interface EditPostApi$Api {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/post/edit/v1/")
    C0X9S<EditPostResponse> createEditPost(@InterfaceC1501150pAP LinkedHashMap<String, String> linkedHashMap);
}
