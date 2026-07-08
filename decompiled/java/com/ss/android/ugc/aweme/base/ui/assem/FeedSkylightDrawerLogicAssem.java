package com.ss.android.ugc.aweme.base.ui.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1564260qoC;
import X.C452501pT;
import X.C724240Sb0;
import X.InterfaceC1564270qoD;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ability.FeedSkylightDrawerLogicAbility;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSkylightDrawerLogicAssem extends AbstractC738140SxQ implements FeedSkylightDrawerLogicAbility {
    public final CopyOnWriteArrayList<InterfaceC1564270qoD> LL = new CopyOnWriteArrayList<>();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1564260qoC());
    public float LLILLL = -1.0f;
    public float LLILZ = -1.0f;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), FeedSkylightDrawerLogicAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, FeedSkylightDrawerLogicAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.FeedSkylightDrawerLogicAbility
    public final void Km(Function1<? super Boolean, Unit> function1) {
        ((CopyOnWriteArrayList) this.LLILLJJLI.getValue()).remove(function1);
    }

    @Override // com.ss.android.ugc.aweme.ability.FeedSkylightDrawerLogicAbility
    public final void lh(Function1<? super Boolean, Unit> function1) {
        ((CopyOnWriteArrayList) this.LLILLJJLI.getValue()).add(function1);
    }

    @Override // com.ss.android.ugc.aweme.ability.FeedSkylightDrawerLogicAbility
    public final void qN0(InterfaceC1564270qoD interfaceC1564270qoD) {
        this.LL.remove(interfaceC1564270qoD);
    }

    @Override // com.ss.android.ugc.aweme.ability.FeedSkylightDrawerLogicAbility
    public final void tF1(InterfaceC1564270qoD interfaceC1564270qoD) {
        this.LL.add(interfaceC1564270qoD);
        float f = this.LLILZ;
        if (f != -1.0f) {
            float f2 = this.LLILLL;
            if (f2 != -1.0f) {
                interfaceC1564270qoD.LIZ(f2, f, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.FeedSkylightDrawerLogicAbility
    public final void zO2(float f, float f2, Float f3) {
        this.LLILLL = f;
        this.LLILZ = f2;
        Iterator<InterfaceC1564270qoD> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(this.LLILLL, this.LLILZ, f3);
        }
    }
}
