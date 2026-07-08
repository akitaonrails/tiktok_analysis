package com.ss.android.ugc.aweme.pspapi;

import X.AbstractC842530X3j;
import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_all_response;

/* JADX INFO: loaded from: classes24.dex */
public interface IClientAiRequest {
    @InterfaceC1501170pAR("/tiktok_client_ai/sync/all/v1")
    C11NZ<cai_sync_all_response> requestAllClientAIData(@InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j);
}
