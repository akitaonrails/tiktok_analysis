package com.ss.android.ugc.aweme.platform;

import X.AbstractC1357610lQt;
import X.C0RD4;
import X.C1357600lQs;
import X.InterfaceC1197130hG3;
import X.InterfaceC1357630lQv;
import X.InterfaceC712540RxE;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.platform.AnchorEventCenter;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AnchorEventCenter extends DataCenter implements InterfaceC1197130hG3 {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final List<WeakReference<AbstractC1357610lQt<C0RD4>>> LLIZ = new ArrayList();

    public final void CQ2() {
        Iterator it2 = ((ArrayList) this.LLIZ).iterator();
        while (it2.hasNext()) {
            AbstractC1357610lQt abstractC1357610lQt = (AbstractC1357610lQt) ((Reference) it2.next()).get();
            if (abstractC1357610lQt != null) {
                BQ2(abstractC1357610lQt.LL, abstractC1357610lQt);
            }
        }
    }

    @Override // X.InterfaceC1197130hG3
    public final void kF(C1357600lQs c1357600lQs, InterfaceC712540RxE interfaceC712540RxE) {
        c1357600lQs.LIZ(interfaceC712540RxE);
        zQ2(c1357600lQs, c1357600lQs.LIZ);
    }

    public final <E extends InterfaceC1357630lQv> void DQ2(final InterfaceC712540RxE interfaceC712540RxE, final String str, final Function1<? super E, Unit> function1) {
        if (this.LLILLL == null) {
            return;
        }
        AbstractC1357610lQt<C0RD4> abstractC1357610lQt = new AbstractC1357610lQt<C0RD4>(str, this, interfaceC712540RxE, function1) { // from class: X.0lQr
            public final /* synthetic */ String LLILLJJLI;
            public final /* synthetic */ AnchorEventCenter LLILLL;
            public final /* synthetic */ InterfaceC712540RxE LLILZ;
            public final /* synthetic */ Function1<E, Unit> LLILZIL;

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                InterfaceC1357630lQv interfaceC1357630lQv = (InterfaceC1357630lQv) this.LLILLL.get(this.LLILLJJLI);
                if (interfaceC1357630lQv.getHost() == null || (this.LLILZ instanceof C1392530mLD) || Intrinsics.LJFF(interfaceC1357630lQv.getHost(), this)) {
                    this.LLILZIL.invoke((E) interfaceC1357630lQv);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(str);
                this.LLILLJJLI = str;
                this.LLILLL = this;
                this.LLILZ = interfaceC712540RxE;
                this.LLILZIL = function1;
            }
        };
        ((ArrayList) this.LLIZ).add(new WeakReference(abstractC1357610lQt));
        yQ2(str, abstractC1357610lQt, false);
    }
}
