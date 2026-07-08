package com.bytedance.ies.ugc.aweme.commwecialize.ba.api;

import X.C09CT;
import X.C1050790dS1;
import X.C11NZ;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public interface BACouponApi {
    public static final C1050790dS1 LIZ = C1050790dS1.LIZ;

    @InterfaceC1501240pAY("/aweme/v1/ad/ba/coupon/redeem/")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZ(@InterfaceC1501100pAK("coupon_code_id") String str, @InterfaceC1501100pAK("received_id") String str2);

    @InterfaceC1501240pAY("/aweme/v1/ad/ba/coupon/receive/")
    @InterfaceC1485505rh
    C11NZ<ReceiveResponse> LIZIZ(@InterfaceC1501100pAK("coupon_code_id") String str);

    public static class BaseResponse {

        @C09CT("status_code")
        public int statusCode;

        @C09CT("status_msg")
        public String statusMsg;

        public BaseResponse() {
            this(-1, null);
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public final String getStatusMsg() {
            return this.statusMsg;
        }

        public final void setStatusCode(int i) {
            this.statusCode = i;
        }

        public final void setStatusMsg(String str) {
            this.statusMsg = str;
        }

        public BaseResponse(int i, String str) {
            this.statusCode = i;
            this.statusMsg = str;
        }
    }

    public static final class ReceiveResponse extends BaseResponse implements Serializable {

        @C09CT("received_id")
        public String receivedID;

        public ReceiveResponse() {
            this(null);
        }

        public final String getReceivedID() {
            return this.receivedID;
        }

        public ReceiveResponse(String str) {
            super(-1, null);
            this.receivedID = str;
        }

        public final void setReceivedID(String str) {
            this.receivedID = str;
        }
    }
}
