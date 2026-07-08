package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.register;

import X.AbstractC1764430w13;
import X.C01GW;
import X.C04FY;
import X.C452501pT;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CardRegisterProvider implements InterfaceC494301wD, InterfaceC1146704e9 {
    public static final C01GW<Set<ICardRegisterService>> LLILLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(111));
    public final InterfaceC665370Q7z LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 405));

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SeaPdpFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SeaPdpFragmentScope.class);
        return arrayList;
    }

    public CardRegisterProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }

    public final AbstractC1764430w13<?, ?, ?> LIZ(C04FY c04fy, String str) {
        String str2;
        if (c04fy != null) {
            str2 = c04fy.LIZIZ;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, "Myna")) {
            return (AbstractC1764430w13) ((Map) this.LLILLJJLI.getValue()).get("sea_pdp_list_body_myna");
        }
        if (str == null) {
            return null;
        }
        return (AbstractC1764430w13) ((Map) this.LLILLJJLI.getValue()).get(str);
    }
}
