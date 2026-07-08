package com.ss.android.ugc.aweme.relation.ffp.vm;

import X.AbstractC2252651DEx;
import X.AbstractC848400XPy;
import X.C099G;
import X.C0AJM;
import X.C0PEM;
import X.C0XQ7;
import X.C1002320cBq;
import X.C1002330cBr;
import X.C1002350cBt;
import X.C1056000daQ;
import X.C1056010daR;
import X.C1056210dal;
import X.C1056250dap;
import X.C1056320daw;
import X.C1056330dax;
import X.C1069810dwh;
import X.C1071540dzU;
import X.C1073970e3P;
import X.C11NJ;
import X.C13LE;
import X.C13LP;
import X.C1720106oR;
import X.C1954807lC;
import X.C1DFB;
import X.C1DFH;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C2344009Gk;
import X.EnumC1070340dxY;
import X.EnumC1070410dxf;
import X.InterfaceC0148002o;
import X.InterfaceC1004520cFO;
import X.InterfaceC1055970daN;
import X.InterfaceC1056200dak;
import X.InterfaceC1070980dya;
import X.InterfaceC497601wk;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import com.ss.android.ugc.aweme.relation.ffp.ui.AnimationAuthFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class FindFriendsPageVM extends AssemViewModel<C1069810dwh> implements InterfaceC1070980dya {
    public final InterfaceC1055970daN LL;
    public final InterfaceC1004520cFO LLILLJJLI;
    public final Keva LLILLL;
    public final InterfaceC1056200dak LLILZ;
    public final InterfaceC1056200dak LLILZIL;
    public final AbstractC2252651DEx LLILZLL;
    public FFPMainFragmentVM LLIZ;
    public final C1056210dal LLIZLLLIL;
    public C099G LLJ;
    public C099G LLJI;
    public final C11NJ LLJIJIL;
    public final Map<EnumC1070410dxf, Boolean> LLJILJIL;

    public FindFriendsPageVM() {
        C1071540dzU c1071540dzU = C1071540dzU.LIZIZ;
        InterfaceC1055970daN interfaceC1055970daNLIZIZ = c1071540dzU.LIZIZ();
        InterfaceC1004520cFO interfaceC1004520cFOLJII = c1071540dzU.LJII();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("anim_auth_flag");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        sbLIZ.append(curUserId == null ? "" : curUserId);
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1056200dak interfaceC1056200dakLIZLLL = c1071540dzU.LIZLLL(EnumC1070410dxf.CONTACT);
        InterfaceC1056200dak interfaceC1056200dakLIZLLL2 = c1071540dzU.LIZLLL(EnumC1070410dxf.FACEBOOK);
        C1DFB c1dfb = C0PEM.LIZJ;
        this.LL = interfaceC1055970daNLIZIZ;
        this.LLILLJJLI = interfaceC1004520cFOLJII;
        this.LLILLL = repo;
        this.LLILZ = interfaceC1056200dakLIZLLL;
        this.LLILZIL = interfaceC1056200dakLIZLLL2;
        this.LLILZLL = c1dfb;
        this.LLIZLLLIL = new C1056210dal();
        this.LLJIJIL = new C11NJ();
        EnumC1070410dxf[] enumC1070410dxfArrValues = EnumC1070410dxf.values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1070410dxfArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1070410dxf enumC1070410dxf : enumC1070410dxfArrValues) {
            Pair pair = new Pair(enumC1070410dxf, Boolean.valueOf(enumC1070410dxf.isGrant()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.LLJILJIL = linkedHashMap;
    }

    public final FFPMainFragmentVM xQ2() {
        FFPMainFragmentVM fFPMainFragmentVM = this.LLIZ;
        if (fFPMainFragmentVM != null) {
            return fFPMainFragmentVM;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        boolean z;
        int length = EnumC1070410dxf.values().length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (!r3[i].isGrant()) {
                z = true;
                break;
            }
            i++;
        }
        boolean z2 = this.LLILLL.getBoolean("is_shown_anim", false);
        this.LLILLL.storeBoolean("is_shown_anim", true);
        if (((Number) C0AJM.LIZ.getValue()).intValue() == 1 && z && !z2) {
            this.LLIZLLLIL.LJFF(C13LE.LIZ(AnimationAuthFragment.class));
            String str = null;
            return new C1069810dwh(C13LE.LIZ(AnimationAuthFragment.class), new C1073970e3P("find_friends_page", str, str, str, 30), 39);
        }
        return new C1069810dwh(0 == true ? 1 : 0, new C1073970e3P("find_friends_page", (String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 30), 47);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1056210dal c1056210dal = this.LLIZLLLIL;
        c1056210dal.getClass();
        c1056210dal.LJFF = Boolean.valueOf(EnumC1070410dxf.CONTACT.isGrant());
        c1056210dal.LJI = Boolean.valueOf(EnumC1070410dxf.FACEBOOK.isGrant());
        C1056250dap c1056250dap = c1056210dal.LIZJ;
        if (c1056250dap != null) {
            c1056250dap.LIZ();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("previous_page", c1056210dal.LJII);
        c2344009Gk.LJIIIIZZ("current_page", c1056210dal.LJIIIIZZ);
        c2344009Gk.LJIIIIZZ("contact_granted_enter", C1056210dal.LIZJ(c1056210dal.LIZLLL));
        c2344009Gk.LJIIIIZZ("facebook_granted_enter", C1056210dal.LIZJ(c1056210dal.LJ));
        Boolean bool = c1056210dal.LJFF;
        c2344009Gk.LJIIIIZZ("contact_granted_leave", bool != null ? C1056210dal.LIZJ(bool.booleanValue()) : null);
        Boolean bool2 = c1056210dal.LJI;
        c2344009Gk.LJIIIIZZ("facebook_granted_leave", bool2 != null ? C1056210dal.LIZJ(bool2.booleanValue()) : null);
        c2344009Gk.LIZLLL(c1056210dal.LIZ().LIZ, "contact_api_cost");
        c2344009Gk.LIZLLL(c1056210dal.LIZIZ().LIZ, "facebook_api_cost");
        c2344009Gk.LIZJ(c1056210dal.LIZ().LIZJ.getValue(), "contact_api_status");
        c2344009Gk.LIZJ(c1056210dal.LIZIZ().LIZJ.getValue(), "facebook_api_status");
        c2344009Gk.LIZLLL(c1056210dal.LIZ.LIZLLL.LIZ, "maf_api_cost");
        c2344009Gk.LIZJ(c1056210dal.LIZ.LIZLLL.LIZJ.getValue(), "maf_api_status");
        c2344009Gk.LIZJ(c1056210dal.LIZ.LIZLLL.LIZIZ, "maf_count");
        c2344009Gk.LJIIIIZZ("has_more", C1056210dal.LIZJ(c1056210dal.LIZ.LIZLLL.LIZLLL));
        c2344009Gk.LIZLLL(c1056210dal.LIZ.LJ, "total_api_cost");
        c2344009Gk.LIZLLL(c1056210dal.LIZIZ.LIZLLL.LIZ, "maf_api_cost_2");
        c2344009Gk.LIZJ(c1056210dal.LIZIZ.LIZLLL.LIZJ.getValue(), "maf_api_status_2");
        c2344009Gk.LIZJ(c1056210dal.LIZIZ.LIZLLL.LIZIZ, "maf_count_2");
        c2344009Gk.LJIIIIZZ("has_more_2", C1056210dal.LIZJ(c1056210dal.LIZIZ.LIZLLL.LIZLLL));
        c2344009Gk.LIZLLL(c1056210dal.LIZIZ.LJ, "total_api_cost_2");
        Map<String, String> map = c2344009Gk.LIZ;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report: find_friends_monitor \n ");
        sbLIZ.append(map);
        C1720106oR.LJI("[ffp]_Monitor", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIILLIIL("find_friends_monitor", map);
        this.LLJIJIL.LJ();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        for (EnumC1070340dxY enumC1070340dxY : EnumC1070340dxY.values()) {
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1056320daw(enumC1070340dxY, this, null), 3);
        }
        InterfaceC497601wk assemVMScope = getAssemVMScope();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(assemVMScope, C2107308Nj.LIZ, null, new C1002320cBq(this, null), 2);
    }

    public final Set<EnumC1070410dxf> yQ2() {
        EnumC1070410dxf[] enumC1070410dxfArrValues = EnumC1070410dxf.values();
        ArrayList arrayList = new ArrayList();
        for (EnumC1070410dxf enumC1070410dxf : enumC1070410dxfArrValues) {
            if (enumC1070410dxf.isGrant() && Intrinsics.LJFF(((LinkedHashMap) this.LLJILJIL).get(enumC1070410dxf), Boolean.FALSE)) {
                arrayList.add(enumC1070410dxf);
            }
        }
        return C13LP.LLIIJI(arrayList);
    }

    public final FindFriendsPageArg zQ2() {
        return getState().LL;
    }

    @Override // X.InterfaceC1070980dya
    public final C099G gF2() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1070980dya
    public final C099G z91() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1070980dya
    public final void UA0(EnumC1070410dxf enumC1070410dxf, String str) {
        int i = C1056330dax.LIZ[enumC1070410dxf.ordinal()];
        if (i != 1) {
            if (i == 2) {
                setState(AFwS252S0000000_16.get$arr$(8));
                C099G c099gLIZIZ = C23250099c.LIZIZ(getAssemVMScope(), this.LLILZLL, null, new C1002330cBr(this, null), 2);
                this.LLJ = c099gLIZIZ;
                C23250099c.LIZLLL(getAssemVMScope(), this.LLILZLL, null, new C1056000daQ(this, c099gLIZIZ, str, null), 2);
                return;
            }
            throw new C1954807lC();
        }
        setState(AFwS252S0000000_16.get$arr$(7));
        int i2 = C2187451AjH.LIZ;
        C099G c099gLIZIZ2 = C23250099c.LIZIZ(getAssemVMScope(), this.LLILZLL, null, new C1002350cBt(this, null), 2);
        this.LLJI = c099gLIZIZ2;
        C23250099c.LIZLLL(getAssemVMScope(), this.LLILZLL, null, new C1056010daR(this, c099gLIZIZ2, str, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(java.lang.String r10, X.InterfaceC1364105Vn r11, X.AnonymousClass0957 r12) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C1056040daU
            if (r0 == 0) goto L24
            r3 = r11
            X.0daU r3 = (X.C1056040daU) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r8 = r3.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r7 = 1
            if (r0 == 0) goto L32
            if (r0 != r7) goto L2a
            java.lang.Object r10 = r3.LL
            java.lang.String r10 = (java.lang.String) r10
            goto L40
        L24:
            X.0daU r3 = new X.0daU
            r3.<init>(r9, r11)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r8)
            r3.LL = r10     // Catch: java.lang.Throwable -> L49
            r3.LLILZ = r7     // Catch: java.lang.Throwable -> L49
            java.lang.Object r8 = r12.LJLIIIL(r3)     // Catch: java.lang.Throwable -> L49
            if (r8 != r1) goto L43
            return r1
        L40:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Throwable -> L49
        L43:
            X.0e4o r8 = (X.C1074840e4o) r8     // Catch: java.lang.Throwable -> L49
            X.C189200o6.m2constructorimpl(r8)     // Catch: java.lang.Throwable -> L49
            goto L55
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r8 = new X.00Yq
            r8.<init>(r0)
            X.C189200o6.m2constructorimpl(r8)
        L55:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r8)
            r5 = 0
            java.lang.String r4 = "contact"
            java.lang.String r3 = "find_friends_page"
            java.lang.String r6 = "[ffp]_Activity"
            if (r0 == 0) goto L7d
            r2 = r8
            X.0e4o r2 = (X.C1074840e4o) r2
            kotlin.jvm.internal.AwS595S0100000_16 r1 = new kotlin.jvm.internal.AwS595S0100000_16
            r0 = 7
            r1.<init>(r2, r0)
            r9.setState(r1)
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r0 = "sync contact success!"
            X.C1720106oR.LJI(r6, r0)
            X.07tr r0 = new X.07tr
            r0.<init>(r3, r10, r7, r4)
            r0.LIZLLL(r5)
        L7d:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r8)
            if (r2 == 0) goto L9d
            kotlin.jvm.internal.AwS595S0100000_16 r1 = new kotlin.jvm.internal.AwS595S0100000_16
            r0 = 9
            r1.<init>(r2, r0)
            r9.setState(r1)
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r0 = "sync contact error!"
            X.C1720106oR.LIZIZ(r6, r0, r2)
            X.07tr r1 = new X.07tr
            r0 = 0
            r1.<init>(r3, r10, r0, r4)
            r1.LIZLLL(r5)
        L9d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM.vQ2(java.lang.String, X.05Vn, X.0957):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(java.lang.String r10, X.InterfaceC1364105Vn r11, X.AnonymousClass0957 r12) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C1056050daV
            if (r0 == 0) goto L24
            r3 = r11
            X.0daV r3 = (X.C1056050daV) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r2 = r3.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r8 = 1
            if (r0 == 0) goto L32
            if (r0 != r8) goto L2a
            java.lang.Object r10 = r3.LL
            java.lang.String r10 = (java.lang.String) r10
            goto L40
        L24:
            X.0daV r3 = new X.0daV
            r3.<init>(r9, r11)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r2)
            r3.LL = r10     // Catch: java.lang.Throwable -> L49
            r3.LLILZ = r8     // Catch: java.lang.Throwable -> L49
            java.lang.Object r2 = r12.LJLIIIL(r3)     // Catch: java.lang.Throwable -> L49
            if (r2 != r1) goto L43
            return r1
        L40:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L49
        L43:
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L49
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L49
            goto L55
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L55:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r2)
            r5 = 0
            java.lang.String r4 = "facebook"
            java.lang.String r3 = "find_friends_page"
            java.lang.String r6 = "[ffp]_Activity"
            if (r0 == 0) goto L90
            r7 = r2
            java.util.List r7 = (java.util.List) r7
            kotlin.jvm.internal.AwS595S0100000_16 r1 = new kotlin.jvm.internal.AwS595S0100000_16
            r0 = 11
            r1.<init>(r7, r0)
            r9.setState(r1)
            X.07tr r0 = new X.07tr
            r0.<init>(r3, r10, r8, r4)
            r0.LIZLLL(r5)
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "sync fb result: "
            r1.append(r0)
            int r0 = r7.size()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1720106oR.LJI(r6, r0)
        L90:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r2 == 0) goto Lb0
            kotlin.jvm.internal.AwS595S0100000_16 r1 = new kotlin.jvm.internal.AwS595S0100000_16
            r0 = 12
            r1.<init>(r2, r0)
            r9.setState(r1)
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r0 = "sync fb error"
            X.C1720106oR.LIZIZ(r6, r0, r2)
            X.07tr r1 = new X.07tr
            r0 = 0
            r1.<init>(r3, r10, r0, r4)
            r1.LIZLLL(r5)
        Lb0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM.wQ2(java.lang.String, X.05Vn, X.0957):java.lang.Object");
    }
}
