package com.ss.android.ugc.aweme.ecommercelive.audience.us.api;

import X.C09CT;
import X.C21165017s8;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.EnterRoomPrompt;

/* JADX INFO: loaded from: classes33.dex */
public interface UsRoomApi {
    public static final C21165017s8 LIZ = C21165017s8.LIZ;

    @InterfaceC1501170pAR("/aweme/v1/oec/live/room/common_info")
    Object getLiveRoomCommonInfo(@InterfaceC1485405rg GetLiveRoomCommonInfoRequest getLiveRoomCommonInfoRequest, InterfaceC1364105Vn<? super BaseResponse<GetLiveRoomCommonInfoResponse>> interfaceC1364105Vn);

    public static final class GetLiveRoomCommonInfoResponse {

        @C09CT("toast_info")
        public final EnterRoomPrompt toastInfo;

        public GetLiveRoomCommonInfoResponse() {
            this(null);
        }

        public GetLiveRoomCommonInfoResponse(EnterRoomPrompt enterRoomPrompt) {
            this.toastInfo = enterRoomPrompt;
        }
    }

    public static final class GetLiveRoomCommonInfoRequest {

        @C09CT("author_id")
        public final String authorId;

        @C09CT("room_id")
        public final String roomId;

        public GetLiveRoomCommonInfoRequest(String str, String str2) {
            this.roomId = str;
            this.authorId = str2;
        }
    }
}
