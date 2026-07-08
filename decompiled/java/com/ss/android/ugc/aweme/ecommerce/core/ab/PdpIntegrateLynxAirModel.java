package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class PdpIntegrateLynxAirModel {

    @C09CT("exprs")
    public final List<Object> exprs;

    @C09CT("gecko_channels")
    public final List<String> geckoChannels;

    @C09CT("opt")
    public final LynxOptModel opt;

    @C09CT("cards")
    public final List<LynxCardModel> renderCardList;

    @C09CT("showBoth")
    public final boolean showBoth;

    @C09CT("overall_switch")
    public final int totalSwitch;

    public PdpIntegrateLynxAirModel() {
        this(0, null, null, null, false, null);
    }

    public PdpIntegrateLynxAirModel(int i, LynxOptModel lynxOptModel, List<String> list, List<LynxCardModel> list2, boolean z, List<Object> list3) {
        this.totalSwitch = i;
        this.opt = lynxOptModel;
        this.geckoChannels = list;
        this.renderCardList = list2;
        this.showBoth = z;
        this.exprs = list3;
    }
}
