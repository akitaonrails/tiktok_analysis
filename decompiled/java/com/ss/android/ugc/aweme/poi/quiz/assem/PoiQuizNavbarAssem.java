package com.ss.android.ugc.aweme.poi.quiz.assem;

import X.C01D1;
import X.C01GW;
import X.C0OM1;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2255108sX;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.poi.quiz.vm.PoiQuizPageVM;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizNavbarAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public TuxNavBar LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiQuizNavbarAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/quiz/vm/PoiQuizPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiQuizNavbarAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiQuizPageVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1685), AFwS256S0000000_18.get$arr$(552), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1684));
    }

    public final PoiQuizPageVM Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (PoiQuizPageVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.r9_);
        this.LLIZLLLIL = tuxNavBar;
        if (tuxNavBar != null) {
            tuxNavBar.bringToFront();
        }
        C736680Sv4.LJIIIZ(this, Go(), new C2217381BqS() { // from class: X.0gmT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1178340glk) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0gmX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1178340glk) obj).LL;
            }
        }, null, new AwS667S0100000_18(this, 29), 12);
        TuxNavBar tuxNavBar2 = this.LLIZLLLIL;
        if (tuxNavBar2 != null) {
            tuxNavBar2.setNavActions((C0OM1) this.LLJI.getValue());
        }
        InterfaceC665370Q7z interfaceC665370Q7z = Go().LLIZ;
        if (interfaceC665370Q7z != null) {
            IPoiQuizDespAbility iPoiQuizDespAbility = new IPoiQuizDespAbility() { // from class: com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizNavbarAssem$loadAbility$1
                @Override // com.ss.android.ugc.aweme.poi.quiz.assem.IPoiQuizDespAbility
                public final int getHeight() {
                    TuxNavBar tuxNavBar3 = this.LL.LLIZLLLIL;
                    if (tuxNavBar3 != null) {
                        return tuxNavBar3.getHeight();
                    }
                    return 0;
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, IPoiQuizDespAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7z, iPoiQuizDespAbility, IPoiQuizDespAbility.class, null, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(iPoiQuizDespAbility);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(iPoiQuizDespAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(IPoiQuizDespAbility.class.getClassLoader(), new Class[]{IPoiQuizDespAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7z, (InterfaceC494301wD) objNewProxyInstance, IPoiQuizDespAbility.class, null, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.quiz.assem.IPoiQuizDespAbility");
            }
        }
    }
}
