package com.ss.android.ugc.aweme.aikit.api.common;

import X.C542120LNy;
import X.InterfaceC1364105Vn;
import X.InterfaceC546090LbL;
import com.ss.android.ugc.aweme.aikit.api.common.task.GetDraftDetailResponse;
import com.ss.android.ugc.aweme.aikit.api.common.task.GetTaskInfoResponse;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public interface AITaskService {
    Object LIZ(String str, InterfaceC1364105Vn<? super GetDraftDetailResponse> interfaceC1364105Vn);

    Object LIZIZ(String str, String str2, InterfaceC1364105Vn<? super GetTaskInfoResponse> interfaceC1364105Vn);

    Object LIZJ(CreativeModel creativeModel, boolean z, InterfaceC1364105Vn<? super C542120LNy> interfaceC1364105Vn);

    Object LIZLLL(InterfaceC546090LbL interfaceC546090LbL, String str, String str2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object LJ(String str, InterfaceC546090LbL interfaceC546090LbL, boolean z, InterfaceC1364105Vn<? super C542120LNy> interfaceC1364105Vn);

    Object LJFF(String str);
}
