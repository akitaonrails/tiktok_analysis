package com.ss.android.ugc.aweme.component.phone;

import X.C09CT;
import X.C0X52;
import X.C1717550unR;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501370pAl;
import X.InterfaceC837600WtS;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public interface PhoneApi {
    public static final C1717550unR LIZ = C1717550unR.LIZ;

    @InterfaceC837600WtS
    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/wallet/v1/user/consult_phone_number_change")
    Object consultPhoneChange(@InterfaceC1501050pAF("scenario") String str, @InterfaceC1501050pAF("set_stage") String str2, InterfaceC1364105Vn<? super C0X52<BaseResponse<WalletFlowDecision>>> interfaceC1364105Vn);

    @InterfaceC837600WtS
    @InterfaceC1501170pAR("/wallet/v1/user/query_phonenumber_change_page")
    Object getPhoneChangeSettings(@InterfaceC1501370pAl("pipo-fp-token") String str, InterfaceC1364105Vn<? super C0X52<BaseResponse<PhoneChangeSettings>>> interfaceC1364105Vn);

    @InterfaceC837600WtS
    @InterfaceC1501170pAR("/wallet/v1/user/reset_mobile")
    Object resetPhoneNumber(InterfaceC1364105Vn<? super C0X52<BaseResponse<String>>> interfaceC1364105Vn);

    public static final class PhoneChangeSettings implements Serializable {

        @C09CT("allow_change")
        public final boolean allowChange;

        @C09CT("content_list")
        public final ArrayList<String> contents;

        @C09CT("question_mark_cs_link")
        public final String customerServiceUrl;

        @C09CT("masked_phone_number")
        public final String maskedMobileNo;

        @C09CT("result_code")
        public final String resultCode;

        @C09CT("fp_session_id")
        public final String sessionId;

        @C09CT("content_map")
        public final Map<String, String> starlings;

        @C09CT("title")
        public final String title;

        public PhoneChangeSettings(String str, String str2, ArrayList<String> arrayList, String str3, boolean z, String str4, Map<String, String> map, String str5) {
            this.resultCode = str;
            this.title = str2;
            this.contents = arrayList;
            this.maskedMobileNo = str3;
            this.allowChange = z;
            this.sessionId = str4;
            this.starlings = map;
            this.customerServiceUrl = str5;
        }
    }
}
