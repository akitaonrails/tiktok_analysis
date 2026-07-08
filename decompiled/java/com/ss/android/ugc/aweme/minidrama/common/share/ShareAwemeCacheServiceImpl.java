package com.ss.android.ugc.aweme.minidrama.common.share;

import X.AbstractC1574450r4d;
import X.AbstractC1574500r4i;
import X.C00EX;
import X.C01GW;
import X.C1156830gD3;
import X.C13BV;
import X.C13LP;
import X.C1556020qau;
import X.C1556040qaw;
import X.C1574370r4V;
import X.C1574380r4W;
import X.C1574400r4Y;
import X.C1574410r4Z;
import X.C1574430r4b;
import X.C1574590r4r;
import X.C1574690r51;
import X.C1579380rCa;
import X.C199596137q;
import X.C208700rF;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.EnumC1574650r4x;
import X.InterfaceC1574420r4a;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.IShareAwemeCacheService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class ShareAwemeCacheServiceImpl implements IShareAwemeCacheService {
    public static final C01GW<C1574590r4r> LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(241));
    public static final C01GW<InterfaceC497601wk> LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(588));
    public static final C1574430r4b LJFF = C1574430r4b.LIZ;
    public final C1574590r4r LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final InterfaceC1574420r4a LIZJ;

    public ShareAwemeCacheServiceImpl() {
        C1574590r4r value = LIZLLL.getValue();
        InterfaceC497601wk value2 = LJ.getValue();
        C1574430r4b c1574430r4b = LJFF;
        this.LIZ = value;
        this.LIZIZ = value2;
        this.LIZJ = c1574430r4b;
    }

    @Override // com.ss.android.ugc.aweme.service.IShareAwemeCacheService
    public final void LIZJ(long j) {
        if (j <= 0) {
            return;
        }
        this.LIZ.LIZLLL(Collections.singletonList(Long.valueOf(j)), null, EnumC1574650r4x.CONSUMED);
    }

    @Override // com.ss.android.ugc.aweme.service.IShareAwemeCacheService
    public final void LJFF(AbstractC1574500r4i abstractC1574500r4i) {
        List listLLIIII;
        String str;
        C1574590r4r c1574590r4r = this.LIZ;
        Set<C1156830gD3> setRemove = c1574590r4r.LJFF.remove(abstractC1574500r4i.LIZ());
        if (setRemove != null) {
            synchronized (setRemove) {
                try {
                    listLLIIII = C13LP.LLIIII(setRemove);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (!listLLIIII.isEmpty()) {
                c1574590r4r.LJII.set(EnumC1574650r4x.EXPLICIT_INVALIDATE);
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listLLIIII) {
                        C1156830gD3 c1156830gD3 = (C1156830gD3) obj;
                        C208700rF c208700rF = (C208700rF) c1574590r4r.LIZJ(c1156830gD3.LIZIZ).LJIIIZ(c1156830gD3);
                        if (c208700rF != null) {
                            str = c208700rF.LIZIZ;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, abstractC1574500r4i.LIZ())) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : arrayList) {
                            C199596137q c199596137qLIZJ = c1574590r4r.LIZJ(((C1156830gD3) obj2).LIZIZ);
                            Object arrayList2 = linkedHashMap.get(c199596137qLIZJ);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                linkedHashMap.put(c199596137qLIZJ, arrayList2);
                            }
                            ((List) arrayList2).add(obj2);
                        }
                        List list = (List) linkedHashMap.get(c1574590r4r.LIZJ);
                        if (list != null) {
                            c1574590r4r.LIZJ.LIZIZ(list);
                        }
                        List list2 = (List) linkedHashMap.get(c1574590r4r.LIZLLL);
                        if (list2 != null) {
                            c1574590r4r.LIZLLL.LIZIZ(list2);
                        }
                        List list3 = (List) linkedHashMap.get(c1574590r4r.LJ);
                        if (list3 != null) {
                            c1574590r4r.LJ.LIZIZ(list3);
                        }
                    }
                    c1574590r4r.LJII.set(null);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c1574590r4r.LJII.set(null);
                    throw th2;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IShareAwemeCacheService
    public final void LIZLLL(C1574380r4W c1574380r4W, List list) {
        this.LIZ.LIZLLL(list, c1574380r4W, EnumC1574650r4x.EXPLICIT_INVALIDATE);
    }

    public static String LJII(AbstractC1574500r4i abstractC1574500r4i, AbstractC1574450r4d abstractC1574450r4d, List list) {
        long jLongValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC1574500r4i.LIZ());
        sbLIZ.append('|');
        sbLIZ.append(abstractC1574450r4d.LIZ());
        sbLIZ.append('|');
        Long l = (Long) C13LP.LJJJLL(list);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        sbLIZ.append(jLongValue);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0r4r] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.13BV] */
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
    @Override // com.ss.android.ugc.aweme.service.IShareAwemeCacheService
    public final void LIZ(List list, C1556020qau c1556020qau, Function1 function1) {
        ?? arrayList;
        if (list.isEmpty()) {
            if (function1 != null) {
                function1.invoke(0);
                return;
            }
            return;
        }
        C1574690r51.LIZ.getClass();
        if (!C1574690r51.LIZIZ(c1556020qau)) {
            if (function1 != null) {
                function1.invoke(0);
                return;
            }
            return;
        }
        C1574590r4r c1574590r4r = this.LIZ;
        c1574590r4r.getClass();
        if (list.isEmpty()) {
            arrayList = C13BV.INSTANCE;
        } else {
            Set setKeySet = c1574590r4r.LJ.LL.keySet();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(a0.LJJJJZ("ep_", ((C1156830gD3) it2.next()).LIZIZ));
                if (lLJIILIIL != null) {
                    arrayList2.add(lLJIILIIL);
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList2);
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!setLLIIJI.contains(Long.valueOf(((Number) obj).longValue()))) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (function1 != null) {
                function1.invoke(Integer.valueOf(list.size()));
                return;
            }
            return;
        }
        C1574370r4V c1574370r4V = new C1574370r4V(0L);
        C00EX c00exLIZ = this.LIZ.LIZ(c1574370r4V, arrayList);
        if (c00exLIZ == null) {
            if (function1 != null) {
                function1.invoke(Integer.valueOf(list.size() - arrayList.size()));
            }
        } else {
            C23250099c.LIZLLL(this.LIZIZ, null, null, new C1574400r4Y(c1574370r4V, c1556020qau, this, c00exLIZ, LJII(c1556020qau, c1574370r4V, arrayList), arrayList, list, null, function1), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // com.ss.android.ugc.aweme.service.IShareAwemeCacheService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.feed.model.Aweme LJ(long r5, X.AbstractC1574450r4d r7, X.AbstractC1556090qb1 r8) {
        /*
            r4 = this;
            X.0r4r r2 = r4.LIZ
            r2.getClass()
            X.0gD3 r1 = new X.0gD3
            java.lang.String r0 = r7.LIZ()
            r1.<init>(r5, r0)
            X.137q r0 = r2.LIZIZ(r7)
            java.lang.Object r0 = r0.LJIIIZ(r1)
            X.00rF r0 = (X.C208700rF) r0
            r3 = 0
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.LIZ
            if (r2 == 0) goto L35
            X.0r4v r1 = new X.0r4v
            java.lang.String r0 = r8.LIZ()
            r1.<init>(r0)
        L28:
            X.0r55 r0 = X.EnumC1574730r55.AWEME_PRELOAD
            com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor.LIZIZ(r0, r1)
            if (r2 == 0) goto L33
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r2.m199clone()
        L33:
            return r3
        L34:
            r2 = r3
        L35:
            X.0r4u r1 = new X.0r4u
            java.lang.String r0 = r8.LIZ()
            r1.<init>(r0)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.common.share.ShareAwemeCacheServiceImpl.LJ(long, X.0r4d, X.0qb1):com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    @Override // com.ss.android.ugc.aweme.service.IShareAwemeCacheService
    public final void LIZIZ(long j, C1574370r4V c1574370r4V, Aweme aweme, C1556040qaw c1556040qaw) {
        C1574690r51.LIZ.getClass();
        if (!C1574690r51.LIZIZ(c1556040qaw) || C1579380rCa.LIZ(aweme)) {
            return;
        }
        this.LIZ.LJFF(j, c1574370r4V, aweme, c1556040qaw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0r4r] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [X.13BV] */
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
    @Override // com.ss.android.ugc.aweme.service.IShareAwemeCacheService
    public final void LJI(List<Long> list, AbstractC1574450r4d abstractC1574450r4d, AbstractC1574500r4i abstractC1574500r4i, Function1<? super Integer, Unit> function1) {
        ?? arrayList;
        if (list.isEmpty()) {
            if (function1 != null) {
                function1.invoke(0);
                return;
            }
            return;
        }
        C1574690r51.LIZ.getClass();
        if (!C1574690r51.LIZIZ(abstractC1574500r4i)) {
            if (function1 != null) {
                function1.invoke(0);
                return;
            }
            return;
        }
        C1574590r4r c1574590r4r = this.LIZ;
        c1574590r4r.getClass();
        if (list.isEmpty()) {
            arrayList = C13BV.INSTANCE;
        } else {
            C199596137q c199596137qLIZIZ = c1574590r4r.LIZIZ(abstractC1574450r4d);
            String strLIZ = abstractC1574450r4d.LIZ();
            arrayList = new ArrayList();
            for (Long l : list) {
                if (c199596137qLIZIZ.LJIIIZ(new C1156830gD3(l.longValue(), strLIZ)) == null) {
                    arrayList.add(l);
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (function1 != null) {
                function1.invoke(Integer.valueOf(list.size()));
                return;
            }
            return;
        }
        C00EX c00exLIZ = this.LIZ.LIZ(abstractC1574450r4d, arrayList);
        if (c00exLIZ == null) {
            if (function1 != null) {
                function1.invoke(Integer.valueOf(list.size() - arrayList.size()));
            }
        } else {
            C23250099c.LIZLLL(this.LIZIZ, null, null, new C1574410r4Z(abstractC1574450r4d, abstractC1574500r4i, this, c00exLIZ, LJII(abstractC1574500r4i, abstractC1574450r4d, arrayList), arrayList, list, null, function1), 3);
        }
    }
}
