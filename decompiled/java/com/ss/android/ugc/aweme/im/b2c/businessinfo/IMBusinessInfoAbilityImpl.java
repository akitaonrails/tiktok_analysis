package com.ss.android.ugc.aweme.im.b2c.businessinfo;

import X.C01GW;
import X.C069P;
import X.C0C64;
import X.C1353205Ri;
import X.C1664606fU;
import X.C452501pT;
import X.EnumC1725606pK;
import X.InterfaceC15516065q;
import X.InterfaceC1554640qYg;
import X.InterfaceC332260D0u;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.im.b2c.api.ability.IMBusinessInfoAbility;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMB2CBusinessInfoAvgResp;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS116S1100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class IMBusinessInfoAbilityImpl implements IMBusinessInfoAbility, InterfaceC1554640qYg {
    public final C01GW LL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(335));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(336));
    public boolean LLILLL;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1452669823) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.ability.IMBusinessInfoAbility
    public final InterfaceC332260D0u so0() {
        return (InterfaceC332260D0u) this.LLILLJJLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.ability.IMBusinessInfoAbility
    public final void c71(String str) {
        long jLongValue;
        if (str.length() == 0) {
            return;
        }
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJ = C069P.LIZ().LJ().LJ(str, null);
        C1664606fU.LIZ.getClass();
        if (C1664606fU.LIZLLL(iMUserLJ) && C0C64.LJIILLIIL().LJIJ(31744, 0, "dm_b2C_business_indicator_add_resp_time", false) > 0) {
            AwS116S1100000_2 awS116S1100000_2 = new AwS116S1100000_2(this, str, 3);
            AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(337);
            InterfaceC15516065q interfaceC15516065q = (InterfaceC15516065q) C1353205Ri.LIZ.getValue();
            EnumC1725606pK enumC1725606pK = EnumC1725606pK.B2C_USER_AVG_RESP_TIME;
            IMB2CBusinessInfoAvgResp iMB2CBusinessInfoAvgResp = (IMB2CBusinessInfoAvgResp) interfaceC15516065q.LJFF(enumC1725606pK, str, null, enumC1725606pK.getAllowUsingLocalStaleValue(), true);
            if (iMB2CBusinessInfoAvgResp != null) {
                awS116S1100000_2.invoke(iMB2CBusinessInfoAvgResp);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long l = iMB2CBusinessInfoAvgResp.updateTime;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                if (jCurrentTimeMillis - jLongValue > ((Number) C1353205Ri.LIZIZ.getValue()).longValue()) {
                    C1353205Ri.LIZ(str, aFwS187S0000000_2, awS116S1100000_2);
                    return;
                }
                return;
            }
            C1353205Ri.LIZ(str, aFwS187S0000000_2, awS116S1100000_2);
        }
    }
}
