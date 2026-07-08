package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C01GW;
import X.C099G;
import X.C0PEM;
import X.C1217260hmW;
import X.C1235830iGT;
import X.C2232408os;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class InMemorySchoolListRepository implements SchoolListRepository {
    public static final /* synthetic */ int LJ = 0;
    public List<C1217260hmW> LIZIZ;
    public C099G LIZJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(470));
    public final C2232408os LIZLLL = new C2232408os(C786410Ut5.h4());

    @Override // com.ss.android.ugc.profile.business.ur.school.datasource.SchoolListRepository
    public final void LIZ() {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LIZLLL), C0PEM.LIZJ, null, new C1235830iGT(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super java.util.List<X.C1217260hmW>> r18) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.datasource.InMemorySchoolListRepository.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    @Override // com.ss.android.ugc.profile.business.ur.school.datasource.SchoolListRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSchoolList(X.InterfaceC1364105Vn<? super java.util.List<X.C1217260hmW>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1235840iGU
            if (r0 == 0) goto L44
            r5 = r7
            X.0iGU r5 = (X.C1235840iGU) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L4a
            X.C155000ia.LIZIZ(r1)
        L22:
            if (r1 != 0) goto L52
            X.0hzv r1 = new X.0hzv
            java.lang.String r0 = "school list not in result"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C155000ia.LIZIZ(r1)
            java.util.List<X.0hmW> r1 = r6.LIZIZ
            if (r1 != 0) goto L52
            X.08os r2 = r6.LIZLLL
            X.0iGR r1 = new X.0iGR
            r0 = 0
            r1.<init>(r6, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L44:
            X.0iGU r5 = new X.0iGU
            r5.<init>(r6, r7)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.datasource.InMemorySchoolListRepository.getSchoolList(X.05Vn):java.lang.Object");
    }
}
