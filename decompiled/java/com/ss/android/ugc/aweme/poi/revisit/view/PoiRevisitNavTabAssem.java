package com.ss.android.ugc.aweme.poi.revisit.view;

import X.C01D1;
import X.C09R3;
import X.C1076030e6j;
import X.C1076070e6n;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitNavTabViewModel;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class PoiRevisitNavTabAssem extends UIContentAssem implements IPoiRevisitNavAssemAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJI;
    public boolean LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiRevisitNavTabAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/revisit/vm/PoiRevisitViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiRevisitNavTabAssem.class, "tabVM", "getTabVM()Lcom/ss/android/ugc/aweme/poi/revisit/vm/PoiRevisitNavTabViewModel;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiRevisitNavTabAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiRevisitViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 419), AFwS252S0000000_16.get$arr$(308), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiRevisitNavTabViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 420), AFwS252S0000000_16.get$arr$(309), null, true);
    }

    public final PoiRevisitNavTabViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (PoiRevisitNavTabViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility
    public final C1076030e6j DT1() {
        return Go().LL;
    }

    @Override // com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility
    public final C1076070e6n Oy2() {
        return Go().LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility
    public final C1076030e6j dG0() {
        return Go().LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility
    public final boolean sD2() {
        C1076070e6n c1076070e6n = Go().LLILLL;
        return (c1076070e6n == null || c1076070e6n.LLILLL) ? false : true;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitNavTabAssem for r15v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitNavTabAssem.onViewCreated(android.view.View):void");
    }
}
