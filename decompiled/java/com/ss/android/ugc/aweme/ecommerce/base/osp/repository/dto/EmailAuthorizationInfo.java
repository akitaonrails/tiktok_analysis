package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EmailAuthorizationInfo {

    @C09CT("auth_type")
    public Integer authType;

    @C09CT("desc_text")
    public ECRichText descRichText;

    @C09CT("description")
    public String description;

    @C09CT("disable_auth_toast")
    public String disableAuthToast;

    @C09CT("enable_auth_toast")
    public String enableAuthToast;

    @C09CT("is_authorized")
    public Boolean isAuthorized;

    @C09CT("title")
    public String title;

    @C09CT("to_authorized_seller_ids")
    public List<String> toAuthorizedSellerIds;

    public EmailAuthorizationInfo() {
        this(Boolean.FALSE, null, null, null, null, null, null, null);
    }

    public static EmailAuthorizationInfo LIZ(EmailAuthorizationInfo emailAuthorizationInfo, Boolean bool, Integer num) {
        List<String> list = emailAuthorizationInfo.toAuthorizedSellerIds;
        String str = emailAuthorizationInfo.title;
        String str2 = emailAuthorizationInfo.description;
        ECRichText eCRichText = emailAuthorizationInfo.descRichText;
        String str3 = emailAuthorizationInfo.enableAuthToast;
        String str4 = emailAuthorizationInfo.disableAuthToast;
        emailAuthorizationInfo.getClass();
        return new EmailAuthorizationInfo(bool, list, str, str2, num, eCRichText, str3, str4);
    }

    public EmailAuthorizationInfo(Boolean bool, List<String> list, String str, String str2, Integer num, ECRichText eCRichText, String str3, String str4) {
        this.isAuthorized = bool;
        this.toAuthorizedSellerIds = list;
        this.title = str;
        this.description = str2;
        this.authType = num;
        this.descRichText = eCRichText;
        this.enableAuthToast = str3;
        this.disableAuthToast = str4;
    }
}
