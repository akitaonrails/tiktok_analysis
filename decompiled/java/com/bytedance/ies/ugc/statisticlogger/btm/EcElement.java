package com.bytedance.ies.ugc.statisticlogger.btm;

import X.C09CT;
import X.C1697810uHb;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class EcElement implements Serializable {

    @C09CT("ec_event_codes")
    public final List<String> ecEventCodes;

    @C09CT("ec_page_codes")
    public final List<String> ecPageCodes;

    public EcElement() {
        this(C1697810uHb.LJIIJJI("a2270.b0482", "a2270.b0865", "a2270.b6661", "a2270.b4197", "a2270.b1478", "a2270.b4891", "a2270.b58272"), C1697810uHb.LJIIJJI("c7998.d5945", "c20736", "c4314.d09588", "c7617.d8588", "c7617.d8034", "c07603.d0839", "c7068.d5479", "c3091.d84820", "c9855.d40179"));
    }

    public EcElement(List<String> list, List<String> list2) {
        this.ecPageCodes = list;
        this.ecEventCodes = list2;
    }
}
