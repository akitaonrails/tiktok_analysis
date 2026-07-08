package com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed;

import X.C01GW;
import X.C1191604lO;
import X.C2245331CuR;
import X.C452501pT;
import X.C584620MwO;
import X.EnumC584610MwN;
import X.InterfaceC1603020roi;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class AdReRankServiceManager implements IAdReRankServiceManagerService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1191604lO());

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService
    public final void LIZ(EnumC584610MwN enumC584610MwN) {
        InterfaceC1603020roi interfaceC1603020roi = (InterfaceC1603020roi) ((Map) this.LIZ.getValue()).get(enumC584610MwN.name());
        if (interfaceC1603020roi != null) {
            interfaceC1603020roi.unBind();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService
    public final InterfaceC1603020roi LIZIZ(EnumC584610MwN enumC584610MwN) {
        InterfaceC1603020roi c2245331CuR = (InterfaceC1603020roi) ((Map) this.LIZ.getValue()).get(enumC584610MwN.name());
        if (c2245331CuR == null) {
            if (C584620MwO.LIZ[enumC584610MwN.ordinal()] == 1) {
                c2245331CuR = new C2245331CuR(enumC584610MwN);
            } else {
                throw new IllegalArgumentException("scene not implemented");
            }
        }
        ((Map) this.LIZ.getValue()).put(enumC584610MwN.name(), c2245331CuR);
        return c2245331CuR;
    }
}
