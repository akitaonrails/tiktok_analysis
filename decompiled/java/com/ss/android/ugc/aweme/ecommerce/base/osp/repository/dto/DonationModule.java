package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DonationModule {

    @C09CT("donation_icon")
    public Icon donationIcon;

    @C09CT("donation_info")
    public DonationInfo donationInfo;

    @C09CT("donation_module_status")
    public Integer donationModuleStatus;

    @C09CT("normal_donation_detail")
    public List<ECRichText> normalDonationDetail;

    @C09CT("payment_unable_detail")
    public List<ECRichText> paymentUnableDetail;

    @C09CT("payment_unable_toast")
    public String paymentUnableToast;

    @C09CT("unable_detail")
    public List<ECRichText> unableDetail;

    @C09CT("unable_toast")
    public String unableToast;

    public DonationModule() {
        this(null, null, null, null, null, null, null, null);
    }

    public DonationModule(Icon icon, Integer num, List<ECRichText> list, List<ECRichText> list2, List<ECRichText> list3, DonationInfo donationInfo, String str, String str2) {
        this.donationIcon = icon;
        this.donationModuleStatus = num;
        this.normalDonationDetail = list;
        this.paymentUnableDetail = list2;
        this.unableDetail = list3;
        this.donationInfo = donationInfo;
        this.paymentUnableToast = str;
        this.unableToast = str2;
    }
}
