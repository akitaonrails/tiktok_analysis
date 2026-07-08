package com.ss.android.ugc.aweme.publicgroup.vm;

import X.C01GW;
import X.C1228650i4t;
import X.C1228700i4y;
import X.C1228710i4z;
import X.C1228870i5F;
import X.C1527305yR;
import X.C1528505yd;
import X.C1559260qg8;
import X.C291001Au;
import X.C452501pT;
import X.C461720I8s;
import X.C830490Whz;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class PublicGroupCreationVM extends AssemViewModel<C1228870i5F> {
    public List<GroupAccessCriteriaCollection> LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1527305yR.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1719));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1720));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        this.LLILLJJLI = xQ2().LJII.LIZ;
        C1228710i4z c1228710i4z = xQ2().LJII;
        Boolean bool = Boolean.FALSE;
        return new C1228870i5F("", new C291001Au(bool), "", new C291001Au(bool), "", xQ2().LJJII, c1228710i4z.LIZIZ, c1228710i4z.LIZJ, c1228710i4z.LIZLLL, new C291001Au(bool), (String) this.LLILZIL.getValue(), (CharSequence) this.LLILZLL.getValue(), false, new C291001Au(""));
    }

    public final C1527305yR wQ2() {
        return (C1527305yR) this.LL.getValue();
    }

    public final C1228700i4y vQ2() {
        return xQ2().LJFF;
    }

    public final C1228650i4t xQ2() {
        return wQ2().LL.LIZ;
    }

    public final C830490Whz yQ2(String str, String str2) {
        C830490Whz c830490Whz = new C830490Whz();
        Map<String, String> map = wQ2().LL.LIZ.LJIIIZ;
        c830490Whz.put("enter_from", str);
        c830490Whz.put("enter_method", str2);
        c830490Whz.put("create_group_option", "public_group");
        c830490Whz.put("account_type", C1528505yd.LIZ(C461720I8s.LIZIZ()));
        String str3 = map.get("enter_position");
        if (str3 != null) {
            c830490Whz.put("enter_position", str3);
        }
        return c830490Whz;
    }
}
