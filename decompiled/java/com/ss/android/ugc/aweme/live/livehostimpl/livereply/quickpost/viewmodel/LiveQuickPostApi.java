package com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.viewmodel;

import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501330pAh;
import tikcast.api.anchor.PostLiveFragmentReq;
import tikcast.api.anchor.PostLiveFragmentResp;

/* JADX INFO: loaded from: classes28.dex */
public interface LiveQuickPostApi {
    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501170pAR("/webcast/anchor/live_fragment/post/")
    Object postAutoCut(@InterfaceC1485405rg PostLiveFragmentReq postLiveFragmentReq, InterfaceC1364105Vn<? super C470590Icr<PostLiveFragmentResp.ResponseData>> interfaceC1364105Vn);
}
