package com.ss.android.ugc.aweme.socialavatar.mixstudio.network;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes7.dex */
public interface MixStudioNetworkAPI {
    @InterfaceC1501240pAY("/tiktok/v1/imagine_sticker/generate/append")
    Object append(@InterfaceC1485405rg MixStudioAppendRequest mixStudioAppendRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/v1/imagine_sticker/cancel")
    Object cancel(@InterfaceC1485405rg MixStudioCancelRequest mixStudioCancelRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/v1/imagine_sticker/generate")
    Object generate(@InterfaceC1485405rg MixStudioCreationRequest mixStudioCreationRequest, InterfaceC1364105Vn<? super MixStudioCreationResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/imagine_sticker/latest")
    Object getProgress(InterfaceC1364105Vn<? super MixStudioStatusResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/v1/imagine_sticker/status_update")
    Object updateTaskStatus(@InterfaceC1485405rg MixStudioStatusUpdateRequest mixStudioStatusUpdateRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
