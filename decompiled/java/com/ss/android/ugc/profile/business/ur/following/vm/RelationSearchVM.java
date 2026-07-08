package com.ss.android.ugc.profile.business.ur.following.vm;

import X.C01GW;
import X.C1247100iYe;
import X.C1247180iYm;
import X.C1247220iYq;
import X.C1247270iYv;
import X.C1559260qg8;
import X.C1954807lC;
import X.C452501pT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS33S0010000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class RelationSearchVM extends AssemViewModel<C1247100iYe> {
    public static final /* synthetic */ int LLJI = 0;
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1247180iYm.class, (Class<Object>) "RelationListHierarchyData", (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2385));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2383));
    public String LLILZ = "";
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2384));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(452));
    public List<C1247270iYv> LLIZ;
    public List<C1247270iYv> LLIZLLLIL;
    public int LLJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1247100iYe(0);
    }

    public final String getEnterFrom() {
        return (String) this.LLILLL.getValue();
    }

    public final C1247180iYm wQ2() {
        return (C1247180iYm) this.LL.getValue();
    }

    public final String vQ2() {
        int i = C1247220iYq.LIZ[wQ2().LLILLJJLI.ordinal()];
        if (i == 1) {
            return "fans";
        }
        if (i == 2) {
            return "following_list";
        }
        if (i == 3) {
            return "school";
        }
        throw new C1954807lC();
    }

    public final void xQ2(boolean z, boolean z2) {
        if (z) {
            setState(AFwS257S0000000_19.get$arr$(442));
        } else {
            setState(new AwS33S0010000_19(z2, 7));
        }
    }
}
