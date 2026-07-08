package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.assem;

import X.C019F;
import X.C0K0R;
import X.C0KC0;
import X.C0KC4;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS443S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackageErrorAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public TuxTextView LLJJI;
    public C197039127h LLJJIII;
    public C197039127h LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public C0KC4 LLJJIJIL;
    public ViewGroup LLJJJ;
    public ViewGroup LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubPackageErrorAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/foundation/packagepage/viewmodel/SubPackagePageAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubPackageErrorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubPackagePageAssemVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 440), AFwS237S0000000_7.get$arr$(202), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fft;
    }

    public final C0KC4 hp() {
        if (this.LLJJIJIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0KC4.class, null);
            this.LLJJIJIL = interfaceC1555100qZQLIZIZ != null ? (C0KC4) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIJIL;
    }

    public final void ip() {
        Function2<? super String, ? super Boolean, Unit> function2;
        C0KC4 c0kc4Hp = hp();
        if (c0kc4Hp != null && (function2 = c0kc4Hp.LLJILLL) != null) {
            function2.invoke(C0KC0.ERROR.getKey(), Boolean.FALSE);
        }
        ViewGroup viewGroup = this.LLJJJ;
        if (viewGroup != null) {
            C0K0R.LIZ(viewGroup);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C197039127h c197039127h;
        C197039127h c197039127h2;
        super.onViewCreated(view);
        TuxTextView tuxTextView = null;
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R.id.hbx);
        } else {
            viewGroup = null;
        }
        this.LLJJJ = viewGroup;
        ip();
        if (view != null) {
            viewGroup2 = (ViewGroup) view.findViewById(R.id.pxk);
        } else {
            viewGroup2 = null;
        }
        this.LLJJJIL = viewGroup2;
        if (view != null) {
            c197039127h = (C197039127h) view.findViewById(R.id.pxm);
        } else {
            c197039127h = null;
        }
        this.LLJJIJI = c197039127h;
        if (view != null) {
            c197039127h2 = (C197039127h) view.findViewById(R.id.m1_);
        } else {
            c197039127h2 = null;
        }
        this.LLJJIII = c197039127h2;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.pxi);
        }
        this.LLJJI = tuxTextView;
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0KF3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLILLJJLI;
            }
        }, null, new AwS443S0200000_7(this, view, 9), 6);
    }
}
