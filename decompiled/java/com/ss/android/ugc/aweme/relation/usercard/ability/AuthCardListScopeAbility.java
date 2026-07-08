package com.ss.android.ugc.aweme.relation.usercard.ability;

import X.AbstractC2252651DEx;
import X.C01GW;
import X.C0PEM;
import X.C1070940dyW;
import X.C1070950dyX;
import X.C1071000dyc;
import X.C1072360e0o;
import X.C1072440e0w;
import X.C1072450e0x;
import X.C1075800e6M;
import X.C11NJ;
import X.C1262300ixA;
import X.C1262470ixR;
import X.C1262490ixT;
import X.C1263080iyQ;
import X.C1DFB;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.EnumC1070340dxY;
import X.EnumC1070410dxf;
import X.InterfaceC497601wk;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AuthCardListScopeAbility implements IAuthCardListScopeAbility {
    public static final /* synthetic */ int LLJJIII = 0;
    public final Function0<C1262300ixA> LL;
    public final InterfaceC497601wk LLILLJJLI;
    public final C1263080iyQ LLILLL;
    public final IUserCardListAbility LLILZ;
    public final Function0<Unit> LLILZIL;
    public final Function1<Integer, Unit> LLILZLL;
    public final Function0<Unit> LLIZ;
    public final Function0<C1075800e6M> LLIZLLLIL;
    public final Function1<List<? extends EnumC1070410dxf>, Unit> LLJ;
    public final String LLJI;
    public final AbstractC2252651DEx LLJIJIL;
    public final C11NJ LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final Map<EnumC1070410dxf, Integer> LLJJ;
    public final Map<EnumC1070410dxf, Boolean> LLJJI;

    public AuthCardListScopeAbility() {
        throw null;
    }

    public final C1262300ixA getConfig() {
        return this.LL.invoke();
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IAuthCardListScopeAbility
    public final void onCleared() {
        this.LLJILJIL.LJ();
    }

    public final EnumC1070410dxf LIZ(EnumC1070340dxY enumC1070340dxY) {
        int i = C1071000dyc.LIZIZ[enumC1070340dxY.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return EnumC1070410dxf.CONTACT;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unknown platform: ");
            sbLIZ.append(enumC1070340dxY);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }
        return EnumC1070410dxf.FACEBOOK;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IAuthCardListScopeAbility
    public final void Cs2(EnumC1070410dxf enumC1070410dxf, AwS420S0200000_19 awS420S0200000_19) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(C1262490ixT.LIZJ(getConfig())), null, null, new C1070940dyW(this, enumC1070410dxf, awS420S0200000_19, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r9, X.EnumC1070410dxf r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility.LIZIZ(int, X.0dxf, X.05Vn):java.lang.Object");
    }

    public final void LIZLLL(EnumC1070410dxf enumC1070410dxf, boolean z, boolean z2) {
        getConfig().apiConfig.LJIILLIIL = true;
        C23250099c.LIZLLL(this.LLILLJJLI, this.LLJIJIL, null, new C1072360e0o(this, enumC1070410dxf, z, z2, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.EnumC1070410dxf r7, X.InterfaceC1364105Vn r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1072390e0r
            if (r0 == 0) goto L79
            r4 = r8
            X.0e0r r4 = (X.C1072390e0r) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L79
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 1
            if (r0 == 0) goto L41
            if (r0 != r5) goto L7f
            X.0dxf r7 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            X.0j0Q r2 = X.C1264320j0Q.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "refresh by "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            java.lang.String r0 = "AuthAbility"
            X.C1264320j0Q.LIZLLL(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L41:
            X.C155000ia.LIZIZ(r1)
            X.0ixA r0 = r6.getConfig()
            X.0ixd r0 = r0.apiConfig
            java.util.List<? extends X.0dxf> r0 = r0.LJ
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            boolean r0 = r1.contains(r7)
            if (r0 != 0) goto L5f
            r1.add(r7)
            kotlin.jvm.functions.Function1<java.util.List<? extends X.0dxf>, kotlin.Unit> r0 = r6.LLJ
            r0.invoke(r1)
        L5f:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6.LLILZIL
            r0.invoke()
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0e0u r1 = new X.0e0u
            r0 = 0
            r1.<init>(r7, r6, r0, r9)
            r4.LL = r7
            r4.LLILZ = r5
            java.lang.Object r0 = X.C23250099c.LJI(r4, r2, r1)
            if (r0 != r3) goto L24
            return r3
        L79:
            X.0e0r r4 = new X.0e0r
            r4.<init>(r6, r8)
            goto L12
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility.LJFF(X.0dxf, X.05Vn, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:33:0x007e, B:34:0x0081, B:36:0x0085, B:38:0x0089, B:55:0x00b8, B:56:0x00c3, B:59:0x00d7, B:60:0x00e1, B:61:0x00e6, B:62:0x00e7, B:48:0x00a7, B:49:0x00aa, B:51:0x00af, B:24:0x0057, B:25:0x005a, B:28:0x006d, B:30:0x0073, B:41:0x0090, B:42:0x0095, B:43:0x0096, B:45:0x009c, B:21:0x0045), top: B:69:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5 A[PHI: r13
      0x00b5: PHI (r13v4 X.0dxf) = (r13v2 X.0dxf), (r13v2 X.0dxf), (r13v6 X.0dxf), (r13v6 X.0dxf) binds: [B:50:0x00ad, B:52:0x00b3, B:37:0x0087, B:40:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:33:0x007e, B:34:0x0081, B:36:0x0085, B:38:0x0089, B:55:0x00b8, B:56:0x00c3, B:59:0x00d7, B:60:0x00e1, B:61:0x00e6, B:62:0x00e7, B:48:0x00a7, B:49:0x00aa, B:51:0x00af, B:24:0x0057, B:25:0x005a, B:28:0x006d, B:30:0x0073, B:41:0x0090, B:42:0x0095, B:43:0x0096, B:45:0x009c, B:21:0x0045), top: B:69:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:33:0x007e, B:34:0x0081, B:36:0x0085, B:38:0x0089, B:55:0x00b8, B:56:0x00c3, B:59:0x00d7, B:60:0x00e1, B:61:0x00e6, B:62:0x00e7, B:48:0x00a7, B:49:0x00aa, B:51:0x00af, B:24:0x0057, B:25:0x005a, B:28:0x006d, B:30:0x0073, B:41:0x0090, B:42:0x0095, B:43:0x0096, B:45:0x009c, B:21:0x0045), top: B:69:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(boolean r11, boolean r12, X.EnumC1070410dxf r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility.LJI(boolean, boolean, X.0dxf, X.05Vn):java.lang.Object");
    }

    public AuthCardListScopeAbility(AwS560S0100000_16 awS560S0100000_16, InterfaceC497601wk interfaceC497601wk, C1263080iyQ c1263080iyQ, IUserCardListAbility iUserCardListAbility, AwS560S0100000_16 awS560S0100000_162, C1072440e0w c1072440e0w, C1072450e0x c1072450e0x, AwS560S0100000_16 awS560S0100000_163, AwS595S0100000_16 awS595S0100000_16) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthCard_");
        sbLIZ.append(((UserCardListViewModel) awS560S0100000_16.l0).LL.hashCode());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1DFB c1dfb = C0PEM.LIZJ;
        this.LL = awS560S0100000_16;
        this.LLILLJJLI = interfaceC497601wk;
        this.LLILLL = c1263080iyQ;
        this.LLILZ = iUserCardListAbility;
        this.LLILZIL = awS560S0100000_162;
        this.LLILZLL = c1072440e0w;
        this.LLIZ = c1072450e0x;
        this.LLIZLLLIL = awS560S0100000_163;
        this.LLJ = awS595S0100000_16;
        this.LLJI = strLIZIZ;
        this.LLJIJIL = c1dfb;
        this.LLJILJIL = new C11NJ();
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(423));
        this.LLJILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(422));
        this.LLJJ = new LinkedHashMap();
        EnumC1070410dxf[] enumC1070410dxfArrValues = EnumC1070410dxf.values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1070410dxfArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1070410dxf enumC1070410dxf : enumC1070410dxfArrValues) {
            linkedHashMap.put(enumC1070410dxf, Boolean.valueOf(enumC1070410dxf.isGrant()));
        }
        this.LLJJI = new LinkedHashMap(linkedHashMap);
        if (!(getConfig().listConfig.LJ instanceof C1262470ixR)) {
            for (EnumC1070340dxY enumC1070340dxY : EnumC1070340dxY.values()) {
                C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C1070950dyX(enumC1070340dxY, this, null), 3);
            }
        }
    }
}
