package com.ss.android.ugc.profile.business.ur.school.modifyschool;

import X.C01GW;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0DLM;
import X.C1007300cJs;
import X.C1245860iWe;
import X.C13LP;
import X.C1559260qg8;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C23250099c;
import X.C337920DMo;
import X.C337950DMr;
import X.C338650DPj;
import X.C452501pT;
import X.EnumC1231460i9Q;
import X.EnumC337870DMj;
import X.InterfaceC1364105Vn;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class CampusFlowViewModel extends AssemViewModel<C337920DMo> {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C337950DMr.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2236));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(512));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2238));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2239));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2237));
    public AwS548S0100000_4 LLIZ;

    public final C337950DMr BQ2() {
        return (C337950DMr) this.LL.getValue();
    }

    public final String CQ2() {
        return (String) this.LLILZIL.getValue();
    }

    public final boolean bt0() {
        C1007300cJs c1007300cJs = (C1007300cJs) this.LLILZLL.getValue();
        String strCQ2 = CQ2();
        Keva kevaLIZ = c1007300cJs.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strCQ2);
        sbLIZ.append("_has_added_school");
        return kevaLIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[PHI: r9
      0x007c: PHI (r9v4 X.0DHZ) = (r9v2 X.0DHZ), (r9v5 X.0DHZ) binds: [B:19:0x006e, B:23:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o defaultState() {
        /*
            r15 = this;
            X.01GW r0 = r15.LLILZ
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.ur.school.service.UserCampusService r1 = (com.ss.android.ugc.ur.school.service.UserCampusService) r1
            java.lang.String r0 = r15.CQ2()
            X.0DMw r1 = r1.LJFF(r0)
            X.0DMr r0 = r15.BQ2()
            com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct r0 = r0.LLIZ
            r11 = 0
            if (r0 == 0) goto L82
            java.lang.String r3 = r0.schoolId
        L1b:
            X.0DMr r0 = r15.BQ2()
            com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct r0 = r0.LLIZ
            if (r0 == 0) goto L80
            java.lang.String r2 = r0.schoolName
        L25:
            if (r3 == 0) goto L7e
            int r0 = r3.length()
            if (r0 == 0) goto L7e
            if (r2 == 0) goto L7e
            int r0 = r2.length()
            if (r0 == 0) goto L7e
            X.0DHZ r9 = new X.0DHZ
            r9.<init>(r2, r3)
        L3a:
            X.0DMo r3 = new X.0DMo
            X.0DMr r0 = r15.BQ2()
            X.0DMf r4 = r0.LLILLJJLI
            X.0DMr r0 = r15.BQ2()
            X.0DMj r0 = r0.LL
            java.util.List r5 = java.util.Collections.singletonList(r0)
            X.0DMr r0 = r15.BQ2()
            X.0DMf r2 = r0.LLILLJJLI
            X.0DMr r0 = r15.BQ2()
            X.0DMj r0 = r0.LL
            boolean r6 = r2.isSkippable(r0)
            X.0DMr r0 = r15.BQ2()
            X.0iWe r7 = r0.LLILLL
            X.0DMr r0 = r15.BQ2()
            boolean r8 = r0.LLILZ
            if (r9 != 0) goto L6e
            if (r1 == 0) goto L7b
            X.0DHZ r9 = r1.LIZ
        L6e:
            if (r1 == 0) goto L7c
            java.lang.Integer r10 = r1.LIZIZ
            java.lang.Boolean r11 = r1.LIZJ
        L74:
            r12 = 0
            r13 = r12
            r14 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r3
        L7b:
            r9 = r11
        L7c:
            r10 = r11
            goto L74
        L7e:
            r9 = r11
            goto L3a
        L80:
            r2 = r11
            goto L25
        L82:
            r3 = r11
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel.defaultState():X.002o");
    }

    public final void vQ2() {
        C338650DPj.LIZ.getClass();
        String strLIZIZ = C338650DPj.LIZIZ();
        if (strLIZIZ != null && strLIZIZ.length() != 0) {
            Keva keva = (Keva) C338650DPj.LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("campus_revisit_popup_shown_");
            sbLIZ.append(strLIZIZ);
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        }
        wQ2();
    }

    public final boolean EQ2() {
        SchoolMutualStruct schoolMutualStruct;
        return BQ2().LLIZ != null && ((schoolMutualStruct = BQ2().LLIZ) == null || schoolMutualStruct.viewerVerifyStatus != 1);
    }

    public final C1245860iWe getEnterFrom() {
        List<EnumC337870DMj> list = getState().LLILLJJLI;
        EnumC337870DMj enumC337870DMj = EnumC337870DMj.FIND_SCHOOL_FRIENDS;
        return (!list.contains(enumC337870DMj) || C13LP.LJJLIIIJJI(list) == enumC337870DMj) ? getState().LLILZ : new C1245860iWe(EnumC1231460i9Q.SCHOOL_COMMUNITY_PAGE, null, null);
    }

    public final void wQ2() {
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C0DLM(this, null), 3);
    }

    public final Object DQ2(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        withState(new AwS370S0200000_4(this, c2252611DEt, 39));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object GQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C0DLO
            if (r0 == 0) goto L20
            r4 = r6
            X.0DLO r4 = (X.C0DLO) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L44
        L20:
            X.0DLO r4 = new X.0DLO
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = r5.LLILLJJLI     // Catch: java.lang.Exception -> L4a
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L4a
            com.ss.android.ugc.profile.business.ur.school.datasource.SchoolClickAPI r0 = (com.ss.android.ugc.profile.business.ur.school.datasource.SchoolClickAPI) r0     // Catch: java.lang.Exception -> L4a
            if (r0 == 0) goto L5d
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L4a
            java.lang.Object r3 = r0.recordSchoolClick(r4)     // Catch: java.lang.Exception -> L4a
            if (r3 != r2) goto L47
            return r2
        L44:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.base.api.BaseResponse r3 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r3     // Catch: java.lang.Exception -> L4a
            goto L5d
        L4a:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.01GW r0 = r5.LLILLL
            java.lang.Object r2 = r0.getValue()
            X.0zpH r2 = (X.C1910890zpH) r2
            java.lang.String r1 = "CampusFlowViewModel"
            java.lang.String r0 = "Failed to record school click"
            r2.LIZJ(r1, r0, r3)
        L5d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel.GQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C0DME
            if (r0 == 0) goto L21
            r5 = r7
            X.0DME r5 = (X.C0DME) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L2f
            if (r0 != r4) goto L27
            goto L47
        L21:
            X.0DME r5 = new X.0DME
            r5.<init>(r6, r7)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = r6.LLILZ     // Catch: X.C1903307ct -> L7a
            java.lang.Object r1 = r0.getValue()     // Catch: X.C1903307ct -> L7a
            com.ss.android.ugc.ur.school.service.UserCampusService r1 = (com.ss.android.ugc.ur.school.service.UserCampusService) r1     // Catch: X.C1903307ct -> L7a
            java.lang.String r0 = r6.CQ2()     // Catch: X.C1903307ct -> L7a
            r5.LLILLL = r4     // Catch: X.C1903307ct -> L7a
            java.lang.Object r0 = r1.LJ(r0, r5)     // Catch: X.C1903307ct -> L7a
            if (r0 != r2) goto L4a
            return r2
        L47:
            X.C155000ia.LIZIZ(r1)     // Catch: X.C1903307ct -> L7a
        L4a:
            X.0DN3 r1 = new X.0DN3     // Catch: X.C1903307ct -> L7a
            X.0DMu r0 = X.EnumC337980DMu.DELETED     // Catch: X.C1903307ct -> L7a
            r2 = 0
            r1.<init>(r0, r2, r2, r2)     // Catch: X.C1903307ct -> L7a
            X.C1440005kM.LIZ(r1)     // Catch: X.C1903307ct -> L7a
            X.05jm r0 = new X.05jm     // Catch: X.C1903307ct -> L7a
            r0.<init>(r3)     // Catch: X.C1903307ct -> L7a
            X.C1440005kM.LIZ(r0)     // Catch: X.C1903307ct -> L7a
            java.lang.String r1 = r6.CQ2()     // Catch: X.C1903307ct -> L7a
            X.0DN1 r0 = new X.0DN1     // Catch: X.C1903307ct -> L7a
            r0.<init>()     // Catch: X.C1903307ct -> L7a
            r0.LIZ(r1, r2)     // Catch: X.C1903307ct -> L7a
            r0 = 121(0x79, float:1.7E-43)
            kotlin.jvm.internal.AFwS232S0000000_4 r0 = kotlin.jvm.internal.AFwS232S0000000_4.get$arr$(r0)     // Catch: X.C1903307ct -> L7a
            r6.setState(r0)     // Catch: X.C1903307ct -> L7a
            r6.wQ2()     // Catch: X.C1903307ct -> L7a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch: X.C1903307ct -> L7a
            return r0
        L7a:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.01GW r0 = r6.LLILLL
            java.lang.Object r1 = r0.getValue()
            X.0zpH r1 = (X.C1910890zpH) r1
            java.lang.String r0 = "CampusFlowViewModel"
            r1.LIZLLL(r0, r2)
            r0 = 122(0x7a, float:1.71E-43)
            kotlin.jvm.internal.AFwS232S0000000_4 r0 = kotlin.jvm.internal.AFwS232S0000000_4.get$arr$(r0)
            r6.setState(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel.yQ2(X.05Vn):java.lang.Object");
    }

    public final Object zQ2(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        withState(new AwS370S0200000_4(this, c2252611DEt, 38));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7 A[Catch: 07ct -> 0x00d7, TryCatch #0 {07ct -> 0x00d7, blocks: (B:29:0x0092, B:30:0x0095, B:32:0x00a7, B:33:0x00ab, B:39:0x00cf, B:25:0x0077), top: B:44:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(boolean r9, X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel.AQ2(boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object FQ2(X.AbstractC337970DMt r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0DLP
            if (r0 == 0) goto L7b
            r5 = r9
            X.0DLP r5 = (X.C0DLP) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7b
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 1
            if (r0 == 0) goto L6f
            if (r0 != r4) goto L8a
            java.lang.Object r3 = r5.LL
            java.util.Iterator r3 = (java.util.Iterator) r3
            X.C155000ia.LIZIZ(r1)
        L26:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r2 = r3.next()
            X.0DMt r2 = (X.AbstractC337970DMt) r2
            boolean r0 = r2 instanceof X.C337820DMe
            if (r0 == 0) goto L45
            X.0DMe r2 = (X.C337820DMe) r2
            X.0DMj r2 = r2.LLILLJJLI
            kotlin.jvm.internal.AwS370S0200000_4 r1 = new kotlin.jvm.internal.AwS370S0200000_4
            r0 = 97
            r1.<init>(r2, r7, r0)
            r7.withState(r1)
            goto L26
        L45:
            boolean r0 = r2 instanceof X.C337840DMg
            if (r0 == 0) goto L4d
            r7.wQ2()
            goto L26
        L4d:
            boolean r0 = r2 instanceof X.C337810DMd
            if (r0 == 0) goto L5c
            kotlin.jvm.internal.AwS583S0100000_4 r1 = new kotlin.jvm.internal.AwS583S0100000_4
            r0 = 174(0xae, float:2.44E-43)
            r1.<init>(r2, r0)
            r7.setState(r1)
            goto L26
        L5c:
            X.0DMy r0 = new X.AbstractC337970DMt() { // from class: X.0DMy
                static {
                    /*
                        X.0DMy r0 = new X.0DMy
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0DMy) X.0DMy.LLILLJJLI X.0DMy
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C338020DMy.<clinit>():void");
                }

                public final boolean equals(java.lang.Object r3) {
                    /*
                        r2 = this;
                        r1 = 1
                        if (r2 != r3) goto L4
                        return r1
                    L4:
                        boolean r0 = r3 instanceof X.C338020DMy
                        if (r0 != 0) goto La
                        r0 = 0
                        return r0
                    La:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C338020DMy.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    /*
                        r1 = this;
                        r0 = -1763555834(0xffffffff96e24606, float:-3.655646E-25)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C338020DMy.hashCode():int");
                }

                public final java.lang.String toString() {
                    /*
                        r1 = this;
                        java.lang.String r0 = "Back"
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C338020DMy.toString():java.lang.String");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C338020DMy.<init>():void");
                }
            }
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L81
            r5.LL = r3
            r5.LLILZ = r4
            java.lang.Object r0 = r7.DQ2(r5)
            if (r0 != r6) goto L26
            return r6
        L6f:
            X.C155000ia.LIZIZ(r1)
            r8.getClass()
            X.0DMv r3 = new X.0DMv
            r3.<init>(r8)
            goto L26
        L7b:
            X.0DLP r5 = new X.0DLP
            r5.<init>(r7, r9)
            goto L12
        L81:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L87:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel.FQ2(X.0DMt, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb A[Catch: 07ct -> 0x00ec, TryCatch #0 {07ct -> 0x00ec, blocks: (B:28:0x0099, B:29:0x009c, B:31:0x00bb, B:32:0x00bf, B:25:0x007e), top: B:37:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.C0DHZ r12, java.lang.String r13, java.lang.String r14, X.InterfaceC1364105Vn<? super X.C443120HZe<? extends X.EnumC337930DMp, java.lang.String, java.lang.Integer>> r15) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel.xQ2(X.0DHZ, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
