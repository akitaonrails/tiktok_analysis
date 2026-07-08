package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices;

import X.C09CT;
import X.C11NZ;
import X.C2188811AlT;
import X.C252100yF;
import X.InterfaceC1485405rg;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface LocationServicesApi {
    public static final C252100yF LIZ = C252100yF.LIZ;

    @InterfaceC1501240pAY("/tiktok/location/delete/")
    C11NZ<DeleteLocationHistoryResponse> deleteLocationHistory(@InterfaceC1485405rg DeleteLocationHistoryBody deleteLocationHistoryBody);

    public static final class DeleteLocationHistoryBody {

        @C09CT("delete_coarse")
        public final int delete_coarse;

        public DeleteLocationHistoryBody(int i) {
            this.delete_coarse = i;
        }
    }

    public static final class DeleteLocationHistoryResponse extends BaseResponse {

        @C09CT("data")
        public final String data;

        @C09CT("err_no")
        public final Integer resultCode;

        @C09CT("err_msg")
        public final String resultMessage;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeleteLocationHistoryResponse)) {
                return false;
            }
            DeleteLocationHistoryResponse deleteLocationHistoryResponse = (DeleteLocationHistoryResponse) obj;
            return Intrinsics.LJFF(this.resultCode, deleteLocationHistoryResponse.resultCode) && Intrinsics.LJFF(this.resultMessage, deleteLocationHistoryResponse.resultMessage) && Intrinsics.LJFF(this.data, deleteLocationHistoryResponse.data);
        }

        public final int hashCode() {
            Integer num = this.resultCode;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.resultMessage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.data;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DeleteLocationHistoryResponse(resultCode=");
            sbLIZ.append(this.resultCode);
            sbLIZ.append(", resultMessage=");
            sbLIZ.append(this.resultMessage);
            sbLIZ.append(", data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public DeleteLocationHistoryResponse(Integer num, String str, String str2) {
            this.resultCode = num;
            this.resultMessage = str;
            this.data = str2;
        }
    }
}
