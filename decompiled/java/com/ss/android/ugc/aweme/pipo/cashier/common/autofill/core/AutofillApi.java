package com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core;

import X.C09CT;
import X.C0X52;
import X.C0X9S;
import X.C1505730pHn;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.api.BaseSignResponse;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SecurityInfoItem;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public interface AutofillApi {
    public static final C1505730pHn LIZ = C1505730pHn.LIZ;

    @InterfaceC1501170pAR("/autofill/v2/get_auto_fill")
    Object getCardNumber(@InterfaceC1501350pAj("x-ttnet-isolation-info") String str, @InterfaceC1501350pAj("x-ttnet-cert-id") String str2, @InterfaceC1485405rg CardNumberRequest cardNumberRequest, InterfaceC1364105Vn<? super C0X52<BaseSignResponse>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ
    C0X9S<String> getCert(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map);

    @InterfaceC1501170pAR("/autofill/v2/get_valid_pi_list")
    Object getValidPiList(@InterfaceC1501350pAj("x-ttnet-isolation-info") String str, @InterfaceC1501350pAj("x-ttnet-cert-id") String str2, @InterfaceC1485405rg ValidPiListRequest validPiListRequest, InterfaceC1364105Vn<? super C0X52<BaseSignResponse>> interfaceC1364105Vn);

    public static final class AutoFillInfo {

        @C09CT("card_number")
        public String cardNumber;

        @C09CT("expiration_month_year")
        public String expireDate;

        @C09CT("holder_name")
        public String holderName;

        public AutoFillInfo() {
            this(null, null, null);
        }

        public AutoFillInfo(String str, String str2, String str3) {
            this.cardNumber = str;
            this.holderName = str2;
            this.expireDate = str3;
        }
    }

    public static final class CardNumberRequest {

        @C09CT("biz_content")
        public final String bizContent;

        @C09CT("merchant_id")
        public final String merchantId;

        @C09CT("request_time")
        public final String requestTime;

        public CardNumberRequest() {
            this(null, null, null);
        }

        public CardNumberRequest(String str, String str2, String str3) {
            this.merchantId = str;
            this.requestTime = str2;
            this.bizContent = str3;
        }
    }

    public static final class ValidPiListRequest {

        @C09CT("biz_content")
        public final String bizContent;

        @C09CT("merchant_id")
        public final String merchantId;

        @C09CT("request_time")
        public final String requestTime;

        public ValidPiListRequest() {
            this(null, null, null);
        }

        public ValidPiListRequest(String str, String str2, String str3) {
            this.merchantId = str;
            this.requestTime = str2;
            this.bizContent = str3;
        }
    }

    public static final class ValidPiListRequestContent {

        @C09CT("client_pk")
        public String clientPk;

        @C09CT("merchant_id")
        public final String merchantId;

        @C09CT("merchant_user_id")
        public final String merchantUserId;

        @C09CT("risk_info")
        public String riskInfo;

        @C09CT("sign")
        public String sign;

        public ValidPiListRequestContent() {
            this(null, null, null, null, null);
        }

        public ValidPiListRequestContent(String str, String str2, String str3, String str4, String str5) {
            this.merchantId = str;
            this.merchantUserId = str2;
            this.clientPk = str3;
            this.riskInfo = str4;
            this.sign = str5;
        }
    }

    public static final class CardNumberRequestContent {

        @C09CT("client_pk")
        public String clientPk;

        @C09CT("instrument_id")
        public String instrumentId;

        @C09CT("merchant_id")
        public final String merchantId;

        @C09CT("merchant_user_id")
        public final String merchantUserId;

        @C09CT("pipo_user_id")
        public final String pipoUserId;

        @C09CT("risk_info")
        public String riskInfo;

        @C09CT("sign")
        public String sign;

        @C09CT("verify_id")
        public String verifyId;

        public CardNumberRequestContent() {
            this(null, null, null, null, null, null, null, null);
        }

        public CardNumberRequestContent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.merchantId = str;
            this.merchantUserId = str2;
            this.pipoUserId = str3;
            this.clientPk = str4;
            this.instrumentId = str5;
            this.verifyId = str6;
            this.sign = str7;
            this.riskInfo = str8;
        }
    }

    public static final class CardNumberList {
        public CardNumberItem LIZ;
        public ArrayList<CardNumberItem> LIZIZ;

        @C09CT("pi_list")
        public final String PIList;

        @C09CT("error_code")
        public String errorCode;

        @C09CT("error_content")
        public String errorContent;

        @C09CT("error_message")
        public String errorMessage;

        @C09CT("protocol_tips")
        public final String protocolTips;

        @C09CT("recommend_pi")
        public final String recommendPI;

        @C09CT("result_code")
        public String resultCode;

        @C09CT("top_security_info")
        public final SecurityInfoItem securityInfoItem;

        public CardNumberList() {
            this(null, null, null, null, null, null, null, null, null, null);
        }

        public CardNumberList(String str, String str2, String str3, String str4, SecurityInfoItem securityInfoItem, String str5, CardNumberItem cardNumberItem, String str6, ArrayList<CardNumberItem> arrayList, String str7) {
            this.errorCode = str;
            this.errorMessage = str2;
            this.resultCode = str3;
            this.errorContent = str4;
            this.securityInfoItem = securityInfoItem;
            this.recommendPI = str5;
            this.LIZ = cardNumberItem;
            this.PIList = str6;
            this.LIZIZ = arrayList;
            this.protocolTips = str7;
        }
    }

    public static final class CardNumberItem {
        public AutoFillInfo LIZ;

        @C09CT("dark_mode_icon_url")
        public final String darkModeIconUrl;

        @C09CT("fill_info")
        public final String fillInfo;

        @C09CT("icon_url")
        public final String icon;

        @C09CT("instrument_id")
        public final String instrumentId;

        @C09CT("pipo_user_id")
        public final String pipoUserId;

        @C09CT("result_code")
        public String resultCode;

        @C09CT("sub_title")
        public final String subTitle;

        @C09CT("title")
        public final String title;

        @C09CT("verify_id")
        public final String verifyId;

        @C09CT("verify_info")
        public final String verifyInfo;

        public CardNumberItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, AutoFillInfo autoFillInfo) {
            this.resultCode = str;
            this.instrumentId = str2;
            this.title = str3;
            this.subTitle = str4;
            this.icon = str5;
            this.darkModeIconUrl = str6;
            this.pipoUserId = str7;
            this.verifyInfo = str8;
            this.verifyId = str9;
            this.fillInfo = str10;
            this.LIZ = autoFillInfo;
        }
    }
}
