package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class DealLabel {

    @C09CT("label_type")
    public Integer labelType;

    @C09CT("text")
    public String text;

    public DealLabel() {
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.labelType;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public DealLabel(String str, Integer num) {
        this.text = str;
        this.labelType = num;
    }
}
