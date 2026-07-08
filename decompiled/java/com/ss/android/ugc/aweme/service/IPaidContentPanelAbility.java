package com.ss.android.ugc.aweme.service;

import X.C1612560s46;
import X.C1612750s4P;
import X.C1612770s4R;
import X.C1613030s4r;
import X.EnumC1612690s4J;
import X.InterfaceC1613260s5E;
import X.InterfaceC1614460s7A;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.iap.component.api.PaymentComponentResponse;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaywallInfoModel;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public interface IPaidContentPanelAbility extends InterfaceC494301wD {
    void AH0(EnumC1612690s4J enumC1612690s4J);

    C1613030s4r Am1();

    void CA0(InterfaceC1614460s7A interfaceC1614460s7A);

    void KV1(PurchaseOption purchaseOption, EnumC1612690s4J enumC1612690s4J, boolean z, C1612560s46 c1612560s46);

    SeriesCategory LM1();

    void Lf2(InterfaceC1613260s5E interfaceC1613260s5E);

    void Mc1(boolean z);

    List<C1613030s4r> RS1();

    void S20(InterfaceC1613260s5E interfaceC1613260s5E);

    PaywallInfoModel Tw();

    C1612770s4R cJ2();

    C1612770s4R g02();

    List<PurchaseOption> getPurchaseOption();

    String getSeriesEnterEntrance();

    void i11(InterfaceC1614460s7A interfaceC1614460s7A);

    C1612750s4P i90();

    boolean lm0();

    int pm1();

    PaymentComponentResponse rQ1();

    Integer vp2();

    CollectionDetailModel zl0();
}
