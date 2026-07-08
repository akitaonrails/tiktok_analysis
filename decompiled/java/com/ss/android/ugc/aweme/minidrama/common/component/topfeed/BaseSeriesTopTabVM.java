package com.ss.android.ugc.aweme.minidrama.common.component.topfeed;

import X.C1568090quN;
import X.C1568140quS;
import X.C1573090r2R;
import X.C1574210r4F;
import X.C1577250r99;
import X.C1577730r9v;
import X.C1577750r9x;
import X.C1577760r9y;
import X.C1577780rA0;
import X.C1577790rA1;
import X.C1577810rA3;
import X.C1577820rA4;
import X.C1577850rA7;
import X.InterfaceC1568150quT;
import X.InterfaceC1574160r4A;
import X.InterfaceC1577720r9u;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService;
import com.ss.android.ugc.aweme.minidrama.common.component.service.MiniDramaLimitedFreePopUpConfig;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.BaseSeriesTopTabVM;
import com.ss.android.ugc.aweme.series.feed.tab.SeriesHomeTabVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS119S0400000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public abstract class BaseSeriesTopTabVM<STATE extends C1577850rA7> extends AssemViewModel<STATE> {
    public C1568090quN LLILLJJLI;
    public C1577730r9v LLILLL;
    public C1577750r9x LLILZLL;
    public MiniDramaLimitedFreePopUpConfig LLIZ;
    public boolean LLIZLLLIL;
    public Long LLJ;
    public final C1568140quS LL = new C1568140quS();
    public boolean LLILZ = true;
    public boolean LLILZIL = true;

    public void CQ2() {
    }

    public void DQ2() {
    }

    public abstract String getEnterFrom();

    public abstract ISeriesLimitedFreeService vQ2();

    public abstract C1577250r99 wQ2();

    public void xQ2(InterfaceC1574160r4A interfaceC1574160r4A) {
    }

    public void yQ2() {
    }

    public final void BQ2() {
        Long l = this.LLJ;
        if (l != null) {
            l.longValue();
            C1577250r99 c1577250r99WQ2 = wQ2();
            System.currentTimeMillis();
            c1577250r99WQ2.getClass();
            this.LLJ = null;
        }
        ISeriesLimitedFreeService iSeriesLimitedFreeServiceVQ2 = vQ2();
        if (iSeriesLimitedFreeServiceVQ2 != null) {
            iSeriesLimitedFreeServiceVQ2.LJIIIZ();
        }
        C1573090r2R c1573090r2R = new C1573090r2R(false);
        this.LL.LIZJ(c1573090r2R, true);
        xQ2(c1573090r2R);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C1577730r9v c1577730r9v = this.LLILLL;
        if (c1577730r9v != null) {
            this.LL.LIZ(c1577730r9v);
        }
        this.LLILZLL = null;
        super.onCleared();
    }

    public final void AQ2() {
        this.LLJ = Long.valueOf(System.currentTimeMillis());
        if (this.LLIZLLLIL) {
            FQ2(new AwS568S0100000_24(this, 1873));
        }
        C1573090r2R c1573090r2R = new C1573090r2R(true);
        this.LL.LIZJ(c1573090r2R, true);
        xQ2(c1573090r2R);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0quT, X.0r9v] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object EQ2(InterfaceC1577720r9u interfaceC1577720r9u) {
        if (interfaceC1577720r9u instanceof C1577810rA3) {
            DQ2();
            C1568140quS c1568140quS = this.LL;
            final SeriesHomeTabVM seriesHomeTabVM = (SeriesHomeTabVM) this;
            ?? r1 = new InterfaceC1568150quT() { // from class: X.0r9v
                @Override // X.InterfaceC1568150quT
                public final void LIZ(InterfaceC1574160r4A interfaceC1574160r4A) {
                    ISeriesLimitedFreeService iSeriesLimitedFreeServiceVQ2;
                    Function0<FragmentManager> function0;
                    FragmentManager fragmentManagerInvoke;
                    if (interfaceC1574160r4A instanceof C1574230r4H) {
                        BaseSeriesTopTabVM<C1577850rA7> baseSeriesTopTabVM = seriesHomeTabVM;
                        if (baseSeriesTopTabVM.LLILZ) {
                            baseSeriesTopTabVM.LLILZ = false;
                            C1574230r4H c1574230r4H = (C1574230r4H) interfaceC1574160r4A;
                            ISeriesLimitedFreeService iSeriesLimitedFreeServiceVQ22 = baseSeriesTopTabVM.vQ2();
                            if (iSeriesLimitedFreeServiceVQ22 != null && iSeriesLimitedFreeServiceVQ22.LJII()) {
                                AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(baseSeriesTopTabVM, 1871);
                                C1577750r9x c1577750r9x = baseSeriesTopTabVM.LLILZLL;
                                if (c1577750r9x != null && (function0 = c1577750r9x.LIZIZ) != null && (fragmentManagerInvoke = function0.invoke()) != null) {
                                    baseSeriesTopTabVM.GQ2(true);
                                    C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
                                    C1611660s2e.LJJJJIZL(baseSeriesTopTabVM.getEnterFrom());
                                    C1577750r9x c1577750r9x2 = baseSeriesTopTabVM.LLILZLL;
                                    if (c1577750r9x2 != null) {
                                        int i = c1577750r9x2.LIZ;
                                        ISeriesLimitedFreeService iSeriesLimitedFreeServiceVQ23 = baseSeriesTopTabVM.vQ2();
                                        if (iSeriesLimitedFreeServiceVQ23 != null) {
                                            iSeriesLimitedFreeServiceVQ23.LJIIJ(fragmentManagerInvoke, i, false, new AwS425S0200000_24((BaseSeriesTopTabVM) baseSeriesTopTabVM, awS568S0100000_24, 97));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (!c1574230r4H.LIZIZ || ((iSeriesLimitedFreeServiceVQ2 = baseSeriesTopTabVM.vQ2()) != null && iSeriesLimitedFreeServiceVQ2.LJFF())) {
                                baseSeriesTopTabVM.LL.LIZJ(C1577830rA5.LIZ, true);
                                return;
                            } else {
                                baseSeriesTopTabVM.LLIZ = c1574230r4H.LIZJ;
                                baseSeriesTopTabVM.FQ2(new AwS568S0100000_24(baseSeriesTopTabVM, 1872));
                                return;
                            }
                        }
                        return;
                    }
                    if (!(interfaceC1574160r4A instanceof C1574220r4G)) {
                        return;
                    }
                    BaseSeriesTopTabVM<C1577850rA7> baseSeriesTopTabVM2 = seriesHomeTabVM;
                    if (!baseSeriesTopTabVM2.LLILZIL) {
                        return;
                    }
                    baseSeriesTopTabVM2.LLILZIL = false;
                    baseSeriesTopTabVM2.CQ2();
                }
            };
            this.LLILLL = r1;
            c1568140quS.LIZIZ(r1);
            return null;
        }
        if (interfaceC1577720r9u instanceof C1577750r9x) {
            this.LLILZLL = (C1577750r9x) interfaceC1577720r9u;
            return null;
        }
        if (interfaceC1577720r9u instanceof C1577780rA0) {
            if (!((C1577780rA0) interfaceC1577720r9u).LIZ) {
                return null;
            }
            AQ2();
            return null;
        }
        if (Intrinsics.LJFF(interfaceC1577720r9u, C1577820rA4.LIZ)) {
            BQ2();
            return null;
        }
        if (interfaceC1577720r9u instanceof C1577760r9y) {
            C1577760r9y c1577760r9y = (C1577760r9y) interfaceC1577720r9u;
            if (c1577760r9y.LIZ) {
                if (!c1577760r9y.LIZIZ) {
                    return null;
                }
                AQ2();
                return null;
            }
            BQ2();
            return null;
        }
        if (!(interfaceC1577720r9u instanceof C1577790rA1)) {
            return null;
        }
        C1568090quN c1568090quN = this.LLILLJJLI;
        boolean z = true;
        if (c1568090quN != null && c1568090quN.LIZ) {
            yQ2();
            z = false;
        } else {
            this.LL.LIZJ(new C1574210r4F(((C1577790rA1) interfaceC1577720r9u).LIZ), true);
        }
        return Boolean.valueOf(z);
    }

    public final void FQ2(Function0<Unit> function0) {
        MiniDramaLimitedFreePopUpConfig miniDramaLimitedFreePopUpConfig = this.LLIZ;
        if (miniDramaLimitedFreePopUpConfig == null) {
            return;
        }
        this.LLIZLLLIL = false;
        AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24(this, function0, (Function0<Unit>) 29);
        ISeriesLimitedFreeService iSeriesLimitedFreeServiceVQ2 = vQ2();
        if (iSeriesLimitedFreeServiceVQ2 != null) {
            iSeriesLimitedFreeServiceVQ2.LIZJ(miniDramaLimitedFreePopUpConfig.popUpImageUrl, awS425S0200000_24, new AwS568S0100000_24(this, 747), new AwS119S0400000_24(this, iSeriesLimitedFreeServiceVQ2, miniDramaLimitedFreePopUpConfig, awS425S0200000_24, 1));
        }
    }

    public final void GQ2(boolean z) {
        C1568090quN c1568090quN = new C1568090quN(z);
        this.LLILLJJLI = c1568090quN;
        this.LL.LIZJ(c1568090quN, true);
    }

    public static void zQ2(BaseSeriesTopTabVM baseSeriesTopTabVM, InterfaceC1574160r4A interfaceC1574160r4A) {
        baseSeriesTopTabVM.LL.LIZJ(interfaceC1574160r4A, true);
    }
}
