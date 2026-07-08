package com.bytedance.pipo.stellar.base.dynamic.page;

import X.C01GW;
import X.C1720720usY;
import X.C1720760usc;
import X.C1721190utJ;
import X.C452501pT;
import X.C736820SvI;
import X.EnumC1720740usa;
import X.InterfaceC1720700usW;
import X.InterfaceC1721200utK;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public abstract class DynamicPageAssem<S extends InterfaceC1721200utK> extends UIContentAssem {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26((DynamicPageAssem) this, 40));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS570S0100000_26((DynamicPageAssem) this, 38));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS570S0100000_26((DynamicPageAssem) this, 39));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26((DynamicPageAssem) this, 37));

    public InterfaceC1720700usW Go() {
        return null;
    }

    public abstract DynamicPageViewModel<S> Jo();

    public abstract C1720760usc Ka1();

    public abstract void No();

    public abstract void Oo(StellarActionDO stellarActionDO);

    public abstract void onRenderStart();

    public final C1720720usY Ho() {
        return (C1720720usY) this.LLJ.getValue();
    }

    public void Lo() {
        C1720720usY.LIZIZ(Ho(), Ka1(), EnumC1720740usa.LINE_SCROLL, Go(), false, 8);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        DynamicPageViewModel<S> dynamicPageViewModelJo = Jo();
        subscribe(dynamicPageViewModelJo, C736820SvI.LIZIZ(dynamicPageViewModelJo.usedInReusedScene), null, new C1721190utJ(this));
    }
}
