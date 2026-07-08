package com.ss.android.ugc.aweme.minis.payment.qcpx;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09R3;
import X.C0CWU;
import X.C0PEM;
import X.C0QSJ;
import X.C11JF;
import X.C1392060mKS;
import X.C1397370mT1;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2195221Avo;
import X.C2217381BqS;
import X.C23250099c;
import X.C452070Ho5;
import X.C452501pT;
import X.C555520LqY;
import X.C687700QyG;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1324510kZV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.minis.page.main.scope.MinisMainScope;
import com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisCouponAssem extends AbstractC738140SxQ implements IMinisTimingProtocol, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C01GW LL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 696));
    public final AssemVMLazy LLILLJJLI;
    public final C01GW LLILLL;
    public C11JF LLILZ;
    public TuxPanel LLILZIL;
    public final C01GW LLILZLL;
    public volatile InterfaceC1324510kZV LLIZ;
    public InterfaceC665370Q7z LLIZLLLIL;
    public C0QSJ LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MinisCouponAssem.class, "coreAbility", "getCoreAbility()Lcom/ss/android/ugc/aweme/minis/page/main/ability/MinisCoreAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MinisCouponAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/minis/payment/qcpx/MinisCouponViewModel;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void LJJJJZI() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void LJLLLLLL() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void Xm0() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MinisMainScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MinisMainScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void sZ1() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void wB0() {
    }

    public final InterfaceC1324510kZV bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLIZLLLIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLIZLLLIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MinisMainScope.class});
            this.LLJ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1324510kZV interfaceC1324510kZV = (InterfaceC1324510kZV) c0qsjLIZLLL.getAbility(InterfaceC1324510kZV.class);
        C687700QyG.LJ(interfaceC1324510kZV, InterfaceC1324510kZV.class);
        return interfaceC1324510kZV;
    }

    public final MinisCouponViewModel fo() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (MinisCouponViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0043 A[PHI: r7
      0x0043: PHI (r7v5 java.lang.String) = (r7v0 java.lang.String), (r7v6 java.lang.String) binds: [B:29:0x0041, B:27:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051 A[PHI: r7
      0x0051: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v5 java.lang.String), (r7v5 java.lang.String) binds: [B:29:0x0041, B:31:0x0049, B:33:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0054 A[PHI: r7 r8
      0x0054: PHI (r7v4 java.lang.String) = (r7v1 java.lang.String), (r7v5 java.lang.String) binds: [B:35:0x0052, B:33:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r8v3 java.lang.String) = (r8v0 java.lang.String), (r8v4 java.lang.String) binds: [B:35:0x0052, B:33:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062 A[PHI: r7 r8
      0x0062: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v4 java.lang.String), (r7v4 java.lang.String) binds: [B:35:0x0052, B:37:0x005a, B:39:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String), (r8v3 java.lang.String) binds: [B:35:0x0052, B:37:0x005a, B:39:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ho() {
        /*
            r12 = this;
            X.0kZV r0 = r12.LLIZ
            if (r0 != 0) goto L15
            monitor-enter(r12)
            X.0kZV r0 = r12.LLIZ     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L14
            X.0kZV r0 = r12.bo()     // Catch: java.lang.Throwable -> L11
            r12.LLIZ = r0     // Catch: java.lang.Throwable -> L11
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L14:
            monitor-exit(r12)
        L15:
            com.ss.android.ugc.aweme.minis.common.SchemaParserData r4 = r0.Cl()
            if (r4 != 0) goto L1c
            return
        L1c:
            com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponViewModel r3 = r12.fo()
            com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams r0 = r4.tiktokMinisParams
            r2 = 0
            if (r0 == 0) goto L90
            java.util.Map<java.lang.String, ? extends java.lang.Object> r1 = r0.logExtra
        L27:
            X.0iCA r5 = new X.0iCA
            java.lang.String r6 = r4.clientKey
            java.lang.String r10 = ""
            if (r6 != 0) goto L30
            r6 = r10
        L30:
            if (r1 == 0) goto L40
            java.lang.String r0 = "req_id"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L40
            java.lang.String r7 = r0.toString()
            if (r7 != 0) goto L43
        L40:
            r7 = r10
            if (r1 == 0) goto L51
        L43:
            java.lang.String r0 = "creative_id"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L51
            java.lang.String r8 = r0.toString()
            if (r8 != 0) goto L54
        L51:
            r8 = r10
            if (r1 == 0) goto L62
        L54:
            java.lang.String r0 = "discount_rate"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L62
            java.lang.String r9 = r0.toString()
            if (r9 != 0) goto L63
        L62:
            r9 = r10
        L63:
            java.lang.String r0 = r4.LJIIIZ()
            if (r0 == 0) goto L6a
            r10 = r0
        L6a:
            X.1Arl r1 = r4.minisStage
            X.1Arl r0 = X.EnumC2192711Arl.MINIS_STAGE_DEBUG
            if (r1 != r0) goto L8e
            r11 = 1
        L71:
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.LL = r5
            X.01GW r0 = r12.LL
            java.lang.Object r1 = r0.getValue()
            X.0mKO r1 = (X.C1392020mKO) r1
            if (r1 == 0) goto L8d
            com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponViewModel r0 = r12.fo()
            X.0iCA r0 = r0.LL
            if (r0 == 0) goto L8a
            java.lang.String r2 = r0.LIZLLL
        L8a:
            r1.LIZ(r2)
        L8d:
            return
        L8e:
            r11 = 0
            goto L71
        L90:
            r1 = r2
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponAssem.ho():void");
    }

    public MinisCouponAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MinisCouponViewModel.class);
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(c19719912DlLIZ, 170);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(192);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS548S0100000_4, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((AbstractC738140SxQ) this, 698), aFwS259S0000000_21, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLILLJJLI = assemVMLazy;
        this.LLILLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 169));
        this.LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 695));
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void Ym1() {
        ho();
        MinisCouponViewModel minisCouponViewModelFo = fo();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(minisCouponViewModelFo), C0PEM.LIZJ, null, new C0CWU(minisCouponViewModelFo, null), 2);
        ko(false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IMinisTimingProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Function1<? super Function2<? super Boolean, ? super String, Unit>, Unit> function1 = C1397370mT1.LLILLL;
        C1397370mT1.LLILLL = null;
        Function0<Unit> function0 = C1392060mKS.LLILLL;
        C1392060mKS.LLILLL = null;
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void pw1() {
        fo();
        C2195221Avo.LJIIJJI = null;
        C11JF c11jf = this.LLILZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILZ = null;
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void zd0() {
        ho();
        MinisCouponViewModel minisCouponViewModelFo = fo();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(minisCouponViewModelFo), C0PEM.LIZJ, null, new C0CWU(minisCouponViewModelFo, null), 2);
        Function1<? super Function2<? super Boolean, ? super String, Unit>, Unit> function1 = C1397370mT1.LLILLL;
        C1397370mT1.LLILLL = (Function1) this.LLILLL.getValue();
        Function0<Unit> function0 = C1392060mKS.LLILLL;
        C1392060mKS.LLILLL = new AwS565S0100000_21(this, 697);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static String m269do(long j) {
        return C786410Ut5.j4(C555520LqY.LIZIZ(2131857194), Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r6 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ko(boolean r6) {
        /*
            r5 = this;
            X.01GW r0 = r5.LL
            java.lang.Object r4 = r0.getValue()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto Lb
            return
        Lb:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 != 0) goto L4b
            if (r6 == 0) goto L4e
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r5)
            r3 = 0
            if (r0 == 0) goto L1e
            android.view.View r3 = r0.getView()
        L1e:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L30
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L30
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0 = -2
            r2.<init>(r1, r0)
            r3.addView(r4, r2)
        L30:
            com.ss.android.ugc.aweme.minis.common.SchemaParserData r0 = X.C2195221Avo.LJII
            if (r0 == 0) goto L46
            java.util.Map r1 = r0.LIZLLL()
        L38:
            X.0I0B r0 = X.C0I0B.LJFF
            r0.LIZIZ()
            java.lang.String r0 = "tm_coupon_ribbon_show"
            X.C20684815ws.LJIILLIIL(r0, r1)
            X.C1584506Ih.LIZIZ(r4)
            return
        L46:
            java.util.Map r1 = X.C2097608Jq.LJ()
            goto L38
        L4b:
            if (r6 == 0) goto L4e
            goto L30
        L4e:
            X.C337180DJs.LIZ(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponAssem.ko(boolean):void");
    }
}
