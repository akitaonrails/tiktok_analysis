package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentCertification {

    @C09CT("dark_icons")
    public List<CertificationIcon> dark_icons;

    @C09CT("icons")
    public List<CertificationIcon> icons;

    @C09CT("title")
    public String title;

    public PaymentCertification() {
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CertificationIcon> list = this.icons;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<CertificationIcon> list2 = this.dark_icons;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public PaymentCertification(String str, List<CertificationIcon> list, List<CertificationIcon> list2) {
        this.title = str;
        this.icons = list;
        this.dark_icons = list2;
    }
}
