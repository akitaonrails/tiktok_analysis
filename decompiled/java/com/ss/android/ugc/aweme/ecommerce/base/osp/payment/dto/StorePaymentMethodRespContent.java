package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class StorePaymentMethodRespContent {

    @C09CT("action_info_list")
    public List<MaterialCollectionInfo> actionInfoList;

    @C09CT("bind_id")
    public String bindId;

    @C09CT("error_code")
    public String errorCode;

    @C09CT("error_content")
    public String errorContent;

    @C09CT("error_message")
    public String errorMessage;

    @C09CT("pipo_error_action")
    public String pipoErrorAction;

    @C09CT("redirect_details")
    public RedirectDetailsContent redirectDetails;

    @C09CT("result_code")
    public String resultCode;

    public StorePaymentMethodRespContent() {
        this(null, null, null, null, null, null, null, null);
    }

    public StorePaymentMethodRespContent(String str, String str2, String str3, RedirectDetailsContent redirectDetailsContent, String str4, String str5, String str6, List<MaterialCollectionInfo> list) {
        this.errorCode = str;
        this.errorMessage = str2;
        this.errorContent = str3;
        this.redirectDetails = redirectDetailsContent;
        this.resultCode = str4;
        this.bindId = str5;
        this.pipoErrorAction = str6;
        this.actionInfoList = list;
    }
}
