package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.assem;

import X.C019F;
import X.C0HZQ;
import X.C0KC4;
import X.C0KDP;
import X.C0KQD;
import X.C0XQS;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C259800zU;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS111S0200000_7;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS443S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class BottomSubscribeComponent extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final AssemVMLazy LLJJI;
    public C0KC4 LLJJIII;
    public ViewGroup LLJJIJI;
    public C197039127h LLJJIJIIJIL;
    public C0HZQ LLJJIJIL;
    public TuxTextView LLJJJ;
    public ViewGroup LLJJJIL;
    public boolean LLJJJJ;
    public long LLJJJJJIL;
    public long LLJJJJLIIL;
    public Boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public ObjectAnimator LLJL;
    public List<? extends C0KQD> LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BottomSubscribeComponent.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/foundation/packagepage/viewmodel/SubPackagePageAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BottomSubscribeComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubPackagePageAssemVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 436), AFwS237S0000000_7.get$arr$(199), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fgn;
    }

    public final C0KC4 hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0KC4.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0KC4) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final SubPackagePageAssemVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (SubPackagePageAssemVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ObjectAnimator objectAnimator = this.LLJL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            objectAnimator.removeAllListeners();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.jvm.internal.AwS373S0200000_7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlin.jvm.internal.AwS551S0100000_7] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJI = (ViewGroup) view.findViewById(R.id.why);
        this.LLJJIJIIJIL = (C197039127h) view.findViewById(R.id.whz);
        this.LLJJIJIL = (C0HZQ) view.findViewById(R.id.wgw);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.wgx);
        this.LLJJJIL = (ViewGroup) view.findViewById(R.id.xj2);
        C197039127h c197039127h = this.LLJJIJIIJIL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS111S0200000_7(this, c197039127h, 37));
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0KEr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLILLJJLI;
            }
        }, null, new AwS621S0100000_7(this, 85), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0KF5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLILZIL;
            }
        }, null, new AwS621S0100000_7(this, 87), 6);
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = new AwS373S0200000_7(this, (BottomSubscribeComponent) c259800zU, (C259800zU<Function0<Unit>>) 67);
        c259800zU.element = new AwS551S0100000_7(c259800zU2, (C259800zU<C0XQS>) 671);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0KF7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLIZ;
            }
        }, null, new AwS443S0200000_7(this, (BottomSubscribeComponent) c259800zU2, (C259800zU<Function1<C0KDP, Unit>>) 10), 6);
    }
}
