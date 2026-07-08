package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class Configuration {

    @C09CT("input_type")
    public Integer inputType;

    @C09CT("line_break")
    public Boolean lineBreak;

    @C09CT("max_length")
    public Integer maxLength;

    @C09CT("prefix")
    public String prefix;

    public Configuration() {
        this(null, null, Boolean.FALSE, null);
    }

    public Configuration(Integer num, Integer num2, Boolean bool, String str) {
        this.maxLength = num;
        this.inputType = num2;
        this.lineBreak = bool;
        this.prefix = str;
    }
}
