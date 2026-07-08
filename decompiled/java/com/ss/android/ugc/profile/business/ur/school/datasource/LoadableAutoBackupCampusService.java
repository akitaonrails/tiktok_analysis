package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C01GW;
import X.C054G;
import X.C05YC;
import X.C05YD;
import X.C09IC;
import X.C0DHZ;
import X.C0DN1;
import X.C0DN8;
import X.C0PEM;
import X.C1006050cHr;
import X.C1007230cJl;
import X.C1007300cJs;
import X.C13LQ;
import X.C1BNE;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2296808zG;
import X.C23250099c;
import X.C338000DMw;
import X.C414301jJ;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC332260D0u;
import X.InterfaceC346201Wa;
import X.InterfaceC497601wk;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.ur.school.service.UserCampusService;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class LoadableAutoBackupCampusService implements UserCampusService {
    public final C0DN1 LIZ = new C0DN1();
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(471));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(312));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(313));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(311));
    public final Map<String, InterfaceC332260D0u<C338000DMw>> LJFF = new LinkedHashMap();
    public final Set<String> LJI = new LinkedHashSet();
    public final Map<String, InterfaceC332260D0u<C338000DMw>> LJII = new LinkedHashMap();
    public final C054G LJIIIIZZ = C2296808zG.LIZ(C0PEM.LIZJ);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    @Override // com.ss.android.ugc.ur.school.service.UserCampusService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C338000DMw> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1007190cJh
            if (r0 == 0) goto L23
            r3 = r8
            X.0cJh r3 = (X.C1007190cJh) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r6 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            java.lang.String r2 = "LoadableAutoBackupCampusService"
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L31
            if (r0 != r5) goto L29
            goto L4a
        L23:
            X.0cJh r3 = new X.0cJh
            r3.<init>(r7, r8)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r6)
            X.0cJn r0 = com.ss.android.ugc.ur.school.api.UserCampusInfoAPI.LIZ
            r0.getClass()
            X.01GW<com.ss.android.ugc.ur.school.api.UserCampusInfoAPI> r0 = X.C1007250cJn.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.ur.school.api.UserCampusInfoAPI r0 = (com.ss.android.ugc.ur.school.api.UserCampusInfoAPI) r0
            r3.LLILLL = r5     // Catch: java.io.IOException -> L7e X.C0XIR -> L8e
            java.lang.Object r6 = r0.getUserCampusInfo(r3)     // Catch: java.io.IOException -> L7e X.C0XIR -> L8e
            if (r6 != r1) goto L4d
            return r1
        L4a:
            X.C155000ia.LIZIZ(r6)     // Catch: java.io.IOException -> L7e X.C0XIR -> L8e
        L4d:
            com.ss.android.ugc.ur.school.api.UserSchoolInfoResponse r6 = (com.ss.android.ugc.ur.school.api.UserSchoolInfoResponse) r6     // Catch: java.io.IOException -> L7e X.C0XIR -> L8e
            java.lang.String r1 = r6.schoolName
            java.lang.String r0 = r6.schoolId
            if (r1 == 0) goto L7b
            if (r0 == 0) goto L7b
            X.0DMw r4 = new X.0DMw
            X.0DHZ r3 = new X.0DHZ
            r3.<init>(r1, r0)
            java.lang.Integer r2 = r6.graduateYear
            java.lang.Boolean r1 = r6.enableSchoolGroup
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7c
            X.06uk r0 = X.C1759206uk.LIZ
            boolean r0 = X.C1759206uk.LIZ()
            if (r0 == 0) goto L7c
        L74:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r4.<init>(r3, r2, r0)
        L7b:
            return r4
        L7c:
            r5 = 0
            goto L74
        L7e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.01GW r0 = r7.LIZIZ
            java.lang.Object r0 = r0.getValue()
            X.0zpH r0 = (X.C1910890zpH) r0
            r0.LIZLLL(r2, r1)
            return r4
        L8e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.01GW r0 = r7.LIZIZ
            java.lang.Object r0 = r0.getValue()
            X.0zpH r0 = (X.C1910890zpH) r0
            r0.LIZLLL(r2, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService.LIZ(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.ur.school.service.UserCampusService
    public final C338000DMw LIZIZ(String str) {
        boolean z;
        String[] stringArray = ((Keva) this.LIZ.LIZ.getValue()).getStringArray(str, C0DN1.LIZIZ);
        if (stringArray != null && stringArray.length != 0) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = null;
        if (z || stringArray.length < 3) {
            return null;
        }
        String str2 = stringArray[0];
        String str3 = stringArray[1];
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(stringArray[2]);
        if (numLJIIJJI == null || numLJIIJJI.intValue() == 0) {
            numLJIIJJI = null;
        }
        Object objLJJIIZ = C13LQ.LJJIIZ(3, stringArray);
        if (objLJJIIZ != null) {
            boolValueOf = Boolean.valueOf(Intrinsics.LJFF(objLJJIIZ, "1"));
        }
        return new C338000DMw(new C0DHZ(str3, str2), numLJIIJJI, boolValueOf);
    }

    @Override // com.ss.android.ugc.ur.school.service.UserCampusService
    public final C338000DMw LJFF(String str) {
        C338000DMw c338000DMw;
        InterfaceC332260D0u interfaceC332260D0u = (InterfaceC332260D0u) ((LinkedHashMap) this.LJII).get(str);
        if (interfaceC332260D0u == null || (c338000DMw = (C338000DMw) interfaceC332260D0u.getValue()) == null) {
            InterfaceC332260D0u interfaceC332260D0u2 = (InterfaceC332260D0u) ((LinkedHashMap) this.LJFF).get(str);
            if (interfaceC332260D0u2 != null) {
                return (C338000DMw) interfaceC332260D0u2.getValue();
            }
            return null;
        }
        return c338000DMw;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.ur.school.service.UserCampusService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C1007200cJi
            r5 = r12
            if (r0 == 0) goto L84
            r11 = r14
            X.0cJi r11 = (X.C1007200cJi) r11
            int r2 = r11.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r11.LLILZ = r2
        L13:
            java.lang.Object r4 = r11.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r11.LLILZ
            r6 = 3
            r2 = 2
            r0 = 1
            r7 = 0
            if (r1 == 0) goto L34
            if (r1 == r0) goto L45
            if (r1 == r2) goto L68
            if (r1 != r6) goto L8a
            java.lang.Object r13 = r11.LL
            X.C155000ia.LIZIZ(r4)
        L2c:
            java.util.Set<java.lang.String> r0 = r5.LJI
            r0.add(r13)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L34:
            X.C155000ia.LIZIZ(r4)
            r11.LL = r13
            r11.LLILZ = r0
            r8 = r7
            r9 = r7
            r10 = r7
            java.lang.Object r0 = r5.LJIIIIZZ(r6, r7, r8, r9, r10, r11)
            if (r0 != r3) goto L4a
            return r3
        L45:
            java.lang.Object r13 = r11.LL
            X.C155000ia.LIZIZ(r4)
        L4a:
            java.util.Map<java.lang.String, X.0D0u<X.0DMw>> r1 = r5.LJFF
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r13)
            if (r0 != 0) goto L5b
            X.1DDq r0 = X.C1BNE.LIZ(r7)
            r1.put(r13, r0)
        L5b:
            X.05YC r0 = (X.C05YC) r0
            r11.LL = r13
            r11.LLILZ = r2
            java.lang.Object r0 = r0.emit(r7, r11)
            if (r0 != r3) goto L6d
            return r3
        L68:
            java.lang.Object r13 = r11.LL
            X.C155000ia.LIZIZ(r4)
        L6d:
            java.util.Map<java.lang.String, X.0D0u<X.0DMw>> r0 = r5.LJII
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r13)
            X.05YC r0 = (X.C05YC) r0
            if (r0 == 0) goto L2c
            r11.LL = r13
            r11.LLILZ = r6
            java.lang.Object r0 = r0.emit(r7, r11)
            if (r0 != r3) goto L2c
            return r3
        L84:
            X.0cJi r11 = new X.0cJi
            r11.<init>(r5, r14)
            goto L13
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService.LJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    @Override // com.ss.android.ugc.ur.school.service.UserCampusService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r17, X.C338000DMw r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService.LIZJ(java.lang.String, X.0DMw, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.ur.school.service.UserCampusService
    public final void LIZLLL(String str, C338000DMw c338000DMw, C0DN8 c0dn8) {
        InterfaceC332260D0u interfaceC332260D0u;
        if (c0dn8 == C0DN8.INTO_MEMORY || c0dn8 == C0DN8.INTO_ALL) {
            if (c338000DMw != null) {
                Keva kevaLIZ = ((C1007300cJs) this.LJ.getValue()).LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("_has_added_school");
                kevaLIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
            }
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJFF;
            Object objLIZ = linkedHashMap.get(str);
            if (objLIZ == null) {
                objLIZ = C1BNE.LIZ(c338000DMw);
                linkedHashMap.put(str, objLIZ);
            }
            ((C05YC) objLIZ).LIZJ(c338000DMw);
            if (c338000DMw != null && (interfaceC332260D0u = (InterfaceC332260D0u) ((LinkedHashMap) this.LJII).get(str)) != null) {
                interfaceC332260D0u.setValue(null);
            }
            this.LJI.add(str);
        }
        if (c0dn8 == C0DN8.INTO_DISK || c0dn8 == C0DN8.INTO_ALL) {
            this.LIZ.LIZ(str, c338000DMw);
        }
    }

    @Override // com.ss.android.ugc.ur.school.service.UserCampusService
    public final Object LJI(String str, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C05YD<C338000DMw>> interfaceC1364105Vn) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJFF;
        Object obj = linkedHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
            C23250099c.LIZLLL(this.LJIIIIZZ, null, null, new C1007230cJl(this, str, c2252321DDqLIZ, null), 3);
            linkedHashMap.put(str, c2252321DDqLIZ);
            obj2 = c2252321DDqLIZ;
        }
        InterfaceC346201Wa interfaceC346201Wa = (InterfaceC346201Wa) obj2;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.LJII;
        Object objLIZ = linkedHashMap2.get(str);
        if (objLIZ == null) {
            objLIZ = C1BNE.LIZ(null);
            linkedHashMap2.put(str, objLIZ);
        }
        return C09IC.LJJIJIIJIL(new C414301jJ(interfaceC346201Wa, (InterfaceC346201Wa) objLIZ, new C1006050cHr(null)), interfaceC497601wk, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.ur.school.service.UserCampusService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r14, X.C338000DMw r15, java.lang.String r16, java.lang.String r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService.LJII(java.lang.String, X.0DMw, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(int r14, java.lang.String r15, java.lang.String r16, java.lang.Integer r17, java.lang.String r18, X.InterfaceC1364105Vn r19) {
        /*
            r13 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C1007180cJg
            r11 = r13
            if (r0 == 0) goto L23
            r4 = r3
            X.0cJg r4 = (X.C1007180cJg) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r4.LLILLL = r2
        L15:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 != r0) goto L2d
            goto L29
        L23:
            X.0cJg r4 = new X.0cJg
            r4.<init>(r11, r3)
            goto L15
        L29:
            X.C155000ia.LIZIZ(r3)     // Catch: X.C0XIR -> L54 java.io.IOException -> L6a X.C094W -> L75
            goto L51
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r3)
            X.0cGo r5 = new X.0cGo     // Catch: X.C0XIR -> L54 java.io.IOException -> L6a X.C094W -> L75
            r12 = 0
            r10 = r18
            r8 = r17
            r9 = r16
            r7 = r15
            r6 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: X.C0XIR -> L54 java.io.IOException -> L6a X.C094W -> L75
            r4.LLILLL = r0     // Catch: X.C0XIR -> L54 java.io.IOException -> L6a X.C094W -> L75
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = X.C099A.LIZIZ(r0, r5, r4)     // Catch: X.C0XIR -> L54 java.io.IOException -> L6a X.C094W -> L75
            if (r0 != r2) goto L51
            return r2
        L51:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L54:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.07ct r2 = new X.07ct
            java.lang.String r1 = r3.getErrorMsg()
            int r0 = r3.getErrorCode()
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r2.<init>(r3, r1, r0)
            throw r2
        L6a:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.07ct r1 = new X.07ct
            r0 = 0
            r1.<init>(r2, r0, r0)
            throw r1
        L75:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.07ct r2 = new X.07ct
            r0 = 2131846980(0x7f116744, float:1.9327425E38)
            java.lang.String r1 = X.C1216270hkv.LIZJ(r0)
            r0 = 0
            r2.<init>(r3, r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService.LJIIIIZZ(int, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, X.05Vn):java.lang.Object");
    }
}
