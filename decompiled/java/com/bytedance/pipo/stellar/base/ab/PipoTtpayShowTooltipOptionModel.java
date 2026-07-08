package com.bytedance.pipo.stellar.base.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoTtpayShowTooltipOptionModel {

    @C09CT("delay_time")
    public final Long delayTime;

    @C09CT("option")
    public final Integer option;

    public PipoTtpayShowTooltipOptionModel() {
        this(null, null);
    }

    public PipoTtpayShowTooltipOptionModel(Integer num, Long l) {
        this.option = num;
        this.delayTime = l;
    }
}
