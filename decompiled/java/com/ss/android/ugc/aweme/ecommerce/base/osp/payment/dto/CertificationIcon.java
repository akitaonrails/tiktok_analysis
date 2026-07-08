package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CertificationIcon {

    @C09CT("height")
    public Integer height;

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("width")
    public Integer width;

    public CertificationIcon() {
    }

    public final int hashCode() {
        Integer num = this.height;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.width;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.uri;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.urlList;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public CertificationIcon(Integer num, Integer num2, String str, List<String> list) {
        this.height = num;
        this.width = num2;
        this.uri = str;
        this.urlList = list;
    }
}
