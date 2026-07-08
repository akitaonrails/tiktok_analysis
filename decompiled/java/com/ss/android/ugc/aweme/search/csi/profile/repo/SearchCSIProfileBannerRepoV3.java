package com.ss.android.ugc.aweme.search.csi.profile.repo;

import X.AbstractC848400XPy;
import X.AnonymousClass0945;
import X.AnonymousClass0956;
import X.C00JA;
import X.C01GW;
import X.C07BJ;
import X.C07BL;
import X.C07BN;
import X.C08Z3;
import X.C09IC;
import X.C0C64;
import X.C0M2W;
import X.C0M4J;
import X.C0XQ7;
import X.C12E4;
import X.C12E5;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1619430sFB;
import X.C18112077m;
import X.C1889807ai;
import X.C1890007ak;
import X.C1954807lC;
import X.C19720112Dn;
import X.C19720512Dr;
import X.C19721012Dw;
import X.C1BNE;
import X.C1D1B;
import X.C2137308Yx;
import X.C2182408go;
import X.C2182508gp;
import X.C2182708gr;
import X.C2188811AlT;
import X.C2192911As5;
import X.C2193231Asb;
import X.C2193281Asg;
import X.C2193291Ash;
import X.C2193381Asq;
import X.C2193391Asr;
import X.C2193401Ass;
import X.C2252321DDq;
import X.C23271099x;
import X.C356901a3;
import X.C418440Gaw;
import X.C438710HIf;
import X.C443120HZe;
import X.C452501pT;
import X.C561420M0e;
import X.C562760M5i;
import X.C814420VxA;
import X.C948503nH;
import X.EnumC1154090g8d;
import X.EnumC1300180jwG;
import X.EnumC19720912Dv;
import X.EnumC2193121AsQ;
import X.EnumC2193181AsW;
import X.EnumC2193221Asa;
import X.EnumC2193241Asc;
import X.EnumC2193251Asd;
import X.EnumC562220M3g;
import X.InterfaceC2193211AsZ;
import X.InterfaceC2193271Asf;
import X.InterfaceC2193371Asp;
import X.InterfaceC346201Wa;
import Y.AComparatorS49S0000000_30;
import Y.AComparatorS53S0000000_34;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPI;
import com.ss.android.ugc.aweme.search.csi.profile.config.ServerTakeoverCheck;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class SearchCSIProfileBannerRepoV3 implements InterfaceC2193211AsZ {
    public static WeakReference<SearchCSIProfileBannerRepoV3> LJJIIZ;
    public static C19720512Dr LJJIIZI;
    public final LifecycleOwner LIZIZ;
    public final InterfaceC2193271Asf LIZJ;
    public final C01GW LIZLLL;
    public final C19721012Dw LJ;
    public final C2252321DDq LJFF;
    public final C1D1B LJI;
    public C19720512Dr LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public boolean LJIIJJI;
    public final C0M2W LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public long LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public AnonymousClass0956 LJJ;
    public AnonymousClass0956 LJJI;
    public final Set<String> LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public static final C1890007ak LJJIIJ = new Object() { // from class: X.07ak
    };
    public static final Map<String, Set<String>> LJJIIJZLJL = new LinkedHashMap();
    public static final LinkedHashMap<String, C1889807ai> LJJIJ = new LinkedHashMap<>();

    @Override // X.InterfaceC2193211AsZ
    public final void destroy() {
        IAVDraftService iAVDraftServiceDraftService;
        this.LJIL = false;
        this.LJIJJLI = false;
        this.LIZJ.clearCache();
        C19720112Dn.LIZ.getClass();
        ((LinkedHashMap) C19720112Dn.LIZIZ).clear();
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (iAVDraftServiceDraftService = iExternalService.draftService()) != null) {
            iAVDraftServiceDraftService.unregisterListener(this.LJIIL);
        }
        AnonymousClass0956 anonymousClass0956 = this.LJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJJ = null;
        this.LJJIFFI.clear();
    }

    public static List LJJI() {
        IAVDraftService iAVDraftServiceDraftService;
        C2193391Asr c2193391Asr;
        try {
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            if (iExternalService == null || (iAVDraftServiceDraftService = iExternalService.draftService()) == null) {
                return C13BV.INSTANCE;
            }
            List<C561420M0e> listQueryDraftMetaList = iAVDraftServiceDraftService.queryDraftMetaList(new C0M4J(true, true, EnumC562220M3g.NORMAL, null, null, 120));
            ArrayList arrayList = new ArrayList();
            for (C561420M0e c561420M0e : listQueryDraftMetaList) {
                String str = c561420M0e.LIZ;
                if (str.length() == 0) {
                    c2193391Asr = null;
                } else {
                    long j = c561420M0e.LIZIZ;
                    if (j <= 0) {
                        j = c561420M0e.LIZJ;
                    }
                    c2193391Asr = new C2193391Asr(str, j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                }
                if (c2193391Asr != null) {
                    arrayList.add(c2193391Asr);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C13BV.INSTANCE;
        }
    }

    public final C443120HZe<Boolean, Integer, Long> LJIIL() {
        Integer numValueOf;
        boolean zLJIILIIL = this.LIZJ.LJIILIIL();
        int iLJIJI = this.LIZJ.LJIJI();
        long jLJIJJLI = this.LIZJ.LJIJJLI();
        boolean z = zLJIILIIL || !(iLJIJI > 0 || (jLJIJJLI > 0L ? 1 : (jLJIJJLI == 0L ? 0 : -1)) > 0);
        Long lValueOf = null;
        if (z) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(iLJIJI);
            lValueOf = Long.valueOf(jLJIJJLI);
        }
        return new C443120HZe<>(Boolean.valueOf(z), numValueOf, lValueOf);
    }

    public final int LJIILIIL() {
        int size;
        List<C19720512Dr> listLJJIFFI = this.LIZJ.LJJIFFI();
        if (listLJJIFFI == null) {
            listLJJIFFI = C13BV.INSTANCE;
        }
        if (!listLJJIFFI.isEmpty() && (listLJJIFFI.size() - this.LJIILL) - 1 >= 0) {
            return size;
        }
        return 0;
    }

    public final long LJIILJJIL() {
        if (this.LJIIIZ > 0) {
            return System.currentTimeMillis() - this.LJIIIZ;
        }
        return 0L;
    }

    public final InterfaceC2193371Asp LJIILL() {
        return (InterfaceC2193371Asp) this.LIZLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public final List<C2192911As5> LJIILLIIL() {
        ArrayList arrayList;
        ?? arrayList2;
        C2192911As5 c2192911As5;
        List<Aweme> listLJJIIJZLJL = this.LIZJ.LJJIIJZLJL();
        if (listLJJIIJZLJL == null) {
            listLJJIIJZLJL = C13BV.INSTANCE;
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJIIJZLJL, 10));
        for (Aweme aweme : listLJJIIJZLJL) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            arrayList3.add(new C2192911As5(aid, aweme.getCreateTime(), AwemeExtKt.isPrivate(aweme), false));
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C2192911As5) it2.next()).LIZ);
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((String) next).length() > 0) {
                arrayList5.add(next);
            }
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList5);
        LJJIIJ.getClass();
        LinkedHashMap<String, C1889807ai> linkedHashMap = LJJIJ;
        synchronized (linkedHashMap) {
            try {
                Set<Map.Entry<String, C1889807ai>> setEntrySet = linkedHashMap.entrySet();
                arrayList = new ArrayList();
                Iterator it4 = setEntrySet.iterator();
                while (it4.hasNext()) {
                    Map.Entry entry = (Map.Entry) it4.next();
                    String str = (String) entry.getKey();
                    C1889807ai c1889807ai = (C1889807ai) entry.getValue();
                    if ((str.length() == 0) || setLLIIJI.contains(str)) {
                        c2192911As5 = null;
                    } else {
                        long j = c1889807ai.LIZ;
                        Integer num = c1889807ai.LIZIZ;
                        c2192911As5 = new C2192911As5(str, j, num != null && num.intValue() == 1, false);
                    }
                    if (c2192911As5 != null) {
                        arrayList.add(c2192911As5);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (C18112077m.LIZ()) {
            List<C2193391Asr> listLJIIIIZZ = this.LIZJ.LJIIIIZZ();
            if (listLJIIIIZZ == null) {
                listLJIIIIZZ = C13BV.INSTANCE;
            }
            arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJIIIIZZ, 10));
            for (C2193391Asr c2193391Asr : listLJIIIIZZ) {
                arrayList2.add(new C2192911As5(c2193391Asr.LIZ, c2193391Asr.LIZIZ, false, true));
            }
        } else {
            arrayList2 = C13BV.INSTANCE;
        }
        return C13LP.LJLLLL(new AComparatorS53S0000000_34(1), C13LP.LJLIL(arrayList2, C13LP.LJLIL(arrayList, arrayList3)));
    }

    public final void LJJIIZ() {
        List<C2193391Asr> listLJIIIIZZ;
        if (this.LJJIII) {
            return;
        }
        List<Aweme> listLJJIIJZLJL = this.LIZJ.LJJIIJZLJL();
        boolean z = false;
        boolean z2 = !(listLJJIIJZLJL == null || listLJJIIJZLJL.isEmpty());
        if (C18112077m.LIZ() && (listLJIIIIZZ = this.LIZJ.LJIIIIZZ()) != null && !listLJIIIIZZ.isEmpty()) {
            z = true;
        }
        if (!z2 && !z) {
            if (this.LJJII) {
                return;
            }
            C948503nH.LJ(this.LIZIZ, C23271099x.INSTANCE, new C562760M5i(this, null));
        } else if (!this.LJIJJLI) {
            this.LJIL = true;
        } else {
            this.LJJIII = true;
            LJIIIIZZ(EnumC2193221Asa.PAGE_INIT);
        }
    }

    @Override // X.InterfaceC2193211AsZ
    public final void initialize() {
        IAVDraftService iAVDraftServiceDraftService;
        LJJIIZ = new WeakReference<>(this);
        String str = C2193281Asg.LIZLLL;
        C2193281Asg.LIZLLL = UUID.randomUUID().toString();
        System.currentTimeMillis();
        this.LIZIZ.getLifecycle().addObserver(new AnonymousClass1());
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (iAVDraftServiceDraftService = iExternalService.draftService()) != null) {
            iAVDraftServiceDraftService.registerListener(this.LJIIL);
        }
        long jLJJI = this.LIZJ.LJJI();
        long jLJIIZILJ = this.LIZJ.LJIIZILJ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        LJIILL().LIZLLL(EnumC2193241Asc.COLD_START, this.LJIIJJI, jLJJI, jCurrentTimeMillis >= jLJJI, jLJIIZILJ, jCurrentTimeMillis >= jLJIIZILJ, jCurrentTimeMillis);
        this.LJIJJLI = true;
        if (this.LJIL) {
            this.LJIL = false;
            LJJIIZ();
        }
    }

    @Override // X.InterfaceC2193211AsZ
    public final void LJFF() {
        if (C18112077m.LIZ()) {
            C948503nH.LJ(this.LIZIZ, C23271099x.INSTANCE, new C08Z3(this, null));
        }
    }

    @Override // X.InterfaceC2193211AsZ
    public final InterfaceC346201Wa<C19720512Dr> LIZ() {
        return this.LJI;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3$initialize$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes31.dex */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            SearchCSIProfileBannerRepoV3.this.destroy();
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0M2W] */
    public SearchCSIProfileBannerRepoV3(AwemeListFragmentImpl awemeListFragmentImpl) {
        InterfaceC2193271Asf interfaceC2193271Asf = new InterfaceC2193271Asf() { // from class: X.142S
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(247));
            public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(246));
            public final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(248));
            public List<? extends Aweme> LIZLLL;
            public List<C2193391Asr> LJ;
            public List<C19720512Dr> LJFF;
            public long LJI;
            public int LJII;
            public int LJIIIIZZ;
            public int LJIIIZ;
            public int LJIIJ;
            public boolean LJIIJJI;

            @Override // X.InterfaceC2193271Asf
            public final void LJII() {
                this.LJIIJJI = false;
                this.LJIIIZ = 0;
                this.LJIIJ = 0;
            }

            @Override // X.InterfaceC2193271Asf
            public final void LJIIJ() {
                this.LJIIIZ = 0;
                this.LJIIJ = 0;
            }

            @Override // X.InterfaceC2193271Asf
            public final void LJIILLIIL() {
                this.LJFF = null;
                this.LJI = 0L;
            }

            @Override // X.InterfaceC2193271Asf
            public final void clearCache() {
                this.LIZLLL = null;
                this.LJ = null;
                this.LJFF = null;
                this.LJI = 0L;
                this.LJIIIZ = 0;
                this.LJIIJ = 0;
                this.LJIIJJI = false;
            }

            @Override // X.InterfaceC2193271Asf
            public final void LIZJ() {
                this.LJIIJ++;
            }

            @Override // X.InterfaceC2193271Asf
            public final void LIZLLL() {
                this.LJIIIZ++;
            }

            @Override // X.InterfaceC2193271Asf
            public final void LJIIIZ() {
                ((Keva) this.LIZ.getValue()).storeBoolean(C1952507kp.LIZ("has_reported_historical_close"), true);
            }

            @Override // X.InterfaceC2193271Asf
            public final boolean LJIILIIL() {
                return ((Keva) this.LIZ.getValue()).getBoolean(C1952507kp.LIZ("has_reported_historical_close"), false);
            }

            @Override // X.InterfaceC2193271Asf
            public final long LJJI() {
                return ((Keva) this.LIZ.getValue()).getLong(C1952507kp.LIZ("freq_timestamp"), 0L);
            }

            public final C1260490iuF LJJIIZ() {
                return (C1260490iuF) this.LIZJ.getValue();
            }

            @Override // X.InterfaceC2193271Asf
            public final boolean LIZ() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<C19720512Dr> list = this.LJFF;
                return list != null && (list.isEmpty() ^ true) && this.LJI > jCurrentTimeMillis;
            }

            @Override // X.InterfaceC2193271Asf
            public final Pair<Integer, Long> LJIJ() {
                int iLJIJI = LJIJI();
                long jLJIJJLI = LJIJJLI();
                LJIL();
                return new Pair<>(Integer.valueOf(iLJIJI), Long.valueOf(jLJIJJLI));
            }

            @Override // X.InterfaceC2193271Asf
            public final int LJIJI() {
                return LJJIIZI().getFirst().intValue();
            }

            @Override // X.InterfaceC2193271Asf
            public final long LJIJJLI() {
                return LJJIIZI().getSecond().longValue();
            }

            @Override // X.InterfaceC2193271Asf
            public final void LJIL() {
                LJJIIZ().LJFF(0);
                LJJIIZ().LIZ.storeLong(C1260490iuF.LJ("photo_mode_banner_show_timestamp"), -1L);
            }

            @Override // X.InterfaceC2193271Asf
            public final void LJJII() {
                C1260490iuF.LJII(LJJIIZ());
                C1260490iuF.LJII(LJJIIZ());
                C1260490iuF c1260490iuFLJJIIZ = LJJIIZ();
                c1260490iuFLJJIIZ.LJFF(c1260490iuFLJJIIZ.LIZJ() + 1);
            }

            @Override // X.InterfaceC2193271Asf
            public final boolean LJJIIJ() {
                long jLJJI = LJJI();
                return jLJJI == 0 || System.currentTimeMillis() > jLJJI;
            }

            public final Pair<Integer, Long> LJJIIZI() {
                int iLIZJ = LJJIIZ().LIZJ();
                long j = LJJIIZ().LIZ.getLong(C1260490iuF.LJ("photo_mode_banner_show_timestamp"), -1L);
                return new Pair<>(Integer.valueOf(iLIZJ + ((Keva) this.LIZIZ.getValue()).getInt(C1952507kp.LIZ("close_times"), 0)), Long.valueOf(Math.max(j, ((Keva) this.LIZIZ.getValue()).getLong(C1952507kp.LIZ("last_close_timestamp"), 0L))));
            }

            @Override // X.InterfaceC2193271Asf
            public final int LIZIZ() {
                return this.LJIIIIZZ;
            }

            @Override // X.InterfaceC2193271Asf
            public final int LJ() {
                return this.LJII;
            }

            @Override // X.InterfaceC2193271Asf
            public final int LJFF() {
                return this.LJIIJ;
            }

            @Override // X.InterfaceC2193271Asf
            public final int LJI() {
                return this.LJIIIZ;
            }

            @Override // X.InterfaceC2193271Asf
            public final List<C2193391Asr> LJIIIIZZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC2193271Asf
            public final long LJIIZILJ() {
                return this.LJI;
            }

            @Override // X.InterfaceC2193271Asf
            public final boolean LJIJJ() {
                return this.LJIIJJI;
            }

            @Override // X.InterfaceC2193271Asf
            public final List<C19720512Dr> LJJIFFI() {
                return this.LJFF;
            }

            @Override // X.InterfaceC2193271Asf
            public final List<Aweme> LJJIIJZLJL() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC2193271Asf
            public final void LJIIJJI(long j) {
                ((Keva) this.LIZ.getValue()).storeLong(C1952507kp.LIZ("freq_timestamp"), j);
            }

            @Override // X.InterfaceC2193271Asf
            public final void LJIILJJIL(List<? extends Aweme> list) {
                this.LIZLLL = C13LP.LJLLLL(new AComparatorS49S0000000_30(13), list);
            }

            @Override // X.InterfaceC2193271Asf
            public final void LJJ(List<C2193391Asr> list) {
                this.LJ = list;
            }

            @Override // X.InterfaceC2193271Asf
            public final void LJJIII(boolean z) {
                this.LJIIJJI = z;
            }

            @Override // X.InterfaceC2193271Asf
            public final void LJIIL(long j, List list) {
                this.LJFF = list;
                this.LJI = j;
            }

            @Override // X.InterfaceC2193271Asf
            public final void LJIILL(int i, int i2) {
                this.LJII = i;
                this.LJIIIIZZ = i2;
            }
        };
        this.LIZIZ = awemeListFragmentImpl;
        this.LIZJ = interfaceC2193271Asf;
        this.LIZLLL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 129));
        this.LJ = new C19721012Dw();
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C2182708gr(0));
        this.LJFF = c2252321DDqLIZ;
        C09IC.LIZIZ(c2252321DDqLIZ);
        this.LJI = new C1D1B(c2252321DDqLIZ, 1);
        this.LJIIJJI = true;
        this.LJIIL = new DraftListenerAdapter() { // from class: X.0M2W
            @Override // com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter, com.ss.android.ugc.aweme.services.draft.IDraftListener
            public final void onDeleted(AwemeDraft awemeDraft) {
                super.onDeleted(awemeDraft);
                this.LIZ.LJIIIIZZ(EnumC2193221Asa.DRAFT_DELETED);
            }

            @Override // com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter, com.ss.android.ugc.aweme.services.draft.IDraftListener
            public final void onUpdated(IDraftListener.UpdateParams updateParams) {
                super.onUpdated(updateParams);
                this.LIZ.getClass();
                AwemeDraft awemeDraft = updateParams.draft;
                if (!Intrinsics.LJFF(awemeDraft.LIZJ(), "CHECK_POINT") && C0MZ9.LJII(awemeDraft)) {
                    String str = awemeDraft.LIZ.draftInfoModel.saveDraftScene;
                    if (!Intrinsics.LJFF(str, "silence") && !Intrinsics.LJFF(str, "autoSaveDraftAfterPublished")) {
                        if (updateParams.isPublish() && !awemeDraft.LIZ.pugcTemplateData.isFromCreateTemplate) {
                            return;
                        }
                        this.LIZ.LJIIIIZZ(EnumC2193221Asa.DRAFT_SAVED);
                    }
                }
            }
        };
        this.LJIILL = -1;
        this.LJJIFFI = new LinkedHashSet();
    }

    @Override // X.InterfaceC2193211AsZ
    public final void LIZIZ(List<? extends Aweme> list) {
        Integer numValueOf;
        List<? extends Aweme> listLJLLLL;
        long createTime;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preProcessUserRecentPosted: size=");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (list == null || (listLJLLLL = C13LP.LJLLLL(new AComparatorS49S0000000_30(7), list)) == null) {
            listLJLLLL = C13BV.INSTANCE;
        }
        if (!this.LJJIFFI.isEmpty()) {
            listLJLLLL.size();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJLLLL) {
                if (!this.LJJIFFI.contains(((Aweme) obj).getAid())) {
                    arrayList.add(obj);
                }
            }
            this.LJJIFFI.clear();
            listLJLLLL = arrayList;
        }
        LJJIIJ.getClass();
        LinkedHashMap<String, C1889807ai> linkedHashMap = LJJIJ;
        if (!linkedHashMap.isEmpty()) {
            synchronized (linkedHashMap) {
                try {
                    Iterator<? extends Aweme> it2 = listLJLLLL.iterator();
                    while (it2.hasNext()) {
                        String aid = ((Aweme) it2.next()).getAid();
                        if (aid != null) {
                            LJJIJ.remove(aid);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LIZJ.LJIILJJIL(listLJLLLL);
        this.LJIJ = listLJLLLL.size();
        Aweme aweme = (Aweme) C13LP.LJJJLL(listLJLLLL);
        if (aweme != null) {
            createTime = aweme.getCreateTime();
        } else {
            createTime = 0;
        }
        this.LJIJI = createTime;
        LJIILL().LJII(this.LJIJ, this.LJIJI);
        LJJIIZ();
    }

    @Override // X.InterfaceC2193211AsZ
    public final void LIZJ(String str) {
        long createTime;
        if (str != null && str.length() > 0) {
            LJJIIJ.getClass();
            LinkedHashMap<String, C1889807ai> linkedHashMap = LJJIJ;
            synchronized (linkedHashMap) {
                try {
                    linkedHashMap.remove(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LJJIFFI.add(str);
            List<Aweme> listLJJIIJZLJL = this.LIZJ.LJJIIJZLJL();
            if (listLJJIIJZLJL != null && !listLJJIIJZLJL.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Aweme aweme : listLJJIIJZLJL) {
                    if (!Intrinsics.LJFF(aweme.getAid(), str)) {
                        arrayList.add(aweme);
                    }
                }
                if (arrayList.size() < listLJJIIJZLJL.size()) {
                    this.LIZJ.LJIILJJIL(arrayList);
                    this.LJIJ = arrayList.size();
                    Aweme aweme2 = (Aweme) C13LP.LJJJLL(arrayList);
                    if (aweme2 != null) {
                        createTime = aweme2.getCreateTime();
                    } else {
                        createTime = 0;
                    }
                    this.LJIJI = createTime;
                    LJIILL().LJII(this.LJIJ, this.LJIJI);
                }
            }
        }
    }

    @Override // X.InterfaceC2193211AsZ
    public final void LIZLLL(C2193291Ash c2193291Ash) {
        LJIILL().LIZ(c2193291Ash.LIZ, c2193291Ash.LIZIZ, c2193291Ash.LIZJ, c2193291Ash.LIZLLL, c2193291Ash.LJ, c2193291Ash.LJFF, c2193291Ash.LJI, c2193291Ash.LJII, c2193291Ash.LJIIIIZZ, c2193291Ash.LJIIIZ, c2193291Ash.LJIIJ, c2193291Ash.LJIIJJI, c2193291Ash.LJIIL, System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:32:0x0099, B:33:0x009c, B:35:0x00a0, B:45:0x00bf, B:46:0x00c3, B:47:0x00d6, B:49:0x00da, B:44:0x00ba), top: B:66:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:32:0x0099, B:33:0x009c, B:35:0x00a0, B:45:0x00bf, B:46:0x00c3, B:47:0x00d6, B:49:0x00da, B:44:0x00ba), top: B:66:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1364105Vn<? super java.util.List<X.C2193391Asr>> r17) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3.LJI(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC2193211AsZ
    public final void LJIIIIZZ(EnumC2193221Asa enumC2193221Asa) {
        EnumC2193221Asa enumC2193221Asa2 = EnumC2193221Asa.PAGE_INIT;
        if (enumC2193221Asa == enumC2193221Asa2) {
            System.currentTimeMillis();
        }
        int i = C2193231Asb.LIZ[enumC2193221Asa.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            C948503nH.LJ(this.LIZIZ, C23271099x.INSTANCE, new C2137308Yx(this, null));
        }
        if (!((Boolean) C07BL.LIZ.getValue()).booleanValue()) {
            C948503nH.LJ(this.LIZIZ, C23271099x.INSTANCE, new C2182508gp(enumC2193221Asa, this, null));
            if (enumC2193221Asa == enumC2193221Asa2) {
                this.LJIIJJI = false;
                return;
            }
            return;
        }
        this.LJFF.setValue(new C2182708gr("experiment_disabled"));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C2159208d4
            if (r0 == 0) goto L20
            r5 = r7
            X.08d4 r5 = (X.C2159208d4) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L56
        L20:
            X.08d4 r5 = new X.08d4
            r5.<init>(r6, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            boolean r0 = X.C18112077m.LIZ()
            if (r0 != 0) goto L3a
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3a:
            X.1Asf r0 = r6.LIZJ
            java.util.List r0 = r0.LJIIIIZZ()
            if (r0 == 0) goto L45
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L45:
            X.1DFB r2 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L7c
            X.08Z1 r1 = new X.08Z1     // Catch: java.lang.Throwable -> L7c
            r0 = 0
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> L7c
            r5.LLILLL = r3     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r2 = X.C23250099c.LJI(r5, r2, r1)     // Catch: java.lang.Throwable -> L7c
            if (r2 != r4) goto L59
            return r4
        L56:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L7c
        L59:
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L7c
            X.1Asf r0 = r6.LIZJ     // Catch: java.lang.Throwable -> L7c
            r0.LJJ(r2)     // Catch: java.lang.Throwable -> L7c
            r2.size()     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = "ensureDraftDataLoaded: loaded "
            r1.append(r0)     // Catch: java.lang.Throwable -> L7c
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L7c
            r1.append(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = " drafts"
            r1.append(r0)     // Catch: java.lang.Throwable -> L7c
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7c
            goto L80
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L80:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3.LJIIIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:33:0x007f, B:34:0x0082, B:36:0x0086, B:44:0x00a2, B:45:0x00a6, B:43:0x009d, B:26:0x0061, B:27:0x0064, B:30:0x006d, B:17:0x0038, B:20:0x0048, B:23:0x004f), top: B:50:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:33:0x007f, B:34:0x0082, B:36:0x0086, B:44:0x00a2, B:45:0x00a6, B:43:0x009d, B:26:0x0061, B:27:0x0064, B:30:0x006d, B:17:0x0038, B:20:0x0048, B:23:0x004f), top: B:50:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(X.InterfaceC1364105Vn<? super X.C2192911As5> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.C2193361Aso
            if (r0 == 0) goto L24
            r4 = r14
            X.1Aso r4 = (X.C2193361Aso) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r3 = 2
            r6 = 1
            r12 = 0
            if (r0 == 0) goto L35
            if (r0 == r6) goto L32
            if (r0 != r3) goto L2a
            goto L7f
        L24:
            X.1Aso r4 = new X.1Aso
            r4.<init>(r13, r14)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.0M5m r2 = r4.LL
            goto L61
        L35:
            X.C155000ia.LIZIZ(r1)
            java.lang.Class<com.ss.android.ugc.airemix.api.IAIRemixService> r7 = com.ss.android.ugc.airemix.api.IAIRemixService.class
            r8 = 0
            r11 = 14
            r9 = r8
            r10 = r8
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb4
            com.ss.android.ugc.airemix.api.IAIRemixService r0 = (com.ss.android.ugc.airemix.api.IAIRemixService) r0     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L48
            return r12
        L48:
            X.0M5m r2 = r0.LIZIZ()     // Catch: java.lang.Throwable -> Lb4
            if (r2 != 0) goto L4f
            return r12
        L4f:
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> Lb4
            X.0M5g r0 = new X.0M5g     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r2, r12)     // Catch: java.lang.Throwable -> Lb4
            r4.LL = r2     // Catch: java.lang.Throwable -> Lb4
            r4.LLILZ = r6     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r1 = X.C23250099c.LJI(r4, r1, r0)     // Catch: java.lang.Throwable -> Lb4
            if (r1 != r5) goto L64
            return r5
        L61:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lb4
        L64:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L6d
            return r12
        L6d:
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> Lb4
            X.0M5j r0 = new X.0M5j     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r2, r12)     // Catch: java.lang.Throwable -> Lb4
            r4.LL = r12     // Catch: java.lang.Throwable -> Lb4
            r4.LLILZ = r3     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r1 = X.C23250099c.LJI(r4, r1, r0)     // Catch: java.lang.Throwable -> Lb4
            if (r1 != r5) goto L82
            return r5
        L7f:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lb4
        L82:
            X.00IR r1 = (X.C00IR) r1     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto L9d
            long r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> Lb4
            java.lang.Long r5 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Throwable -> Lb4
            long r3 = r5.longValue()     // Catch: java.lang.Throwable -> Lb4
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L97
            r6 = 0
        L97:
            if (r6 != 0) goto L9a
            r5 = r12
        L9a:
            if (r5 == 0) goto L9d
            goto La2
        L9d:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb4
            goto La6
        La2:
            long r2 = r5.longValue()     // Catch: java.lang.Throwable -> Lb4
        La6:
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch: java.lang.Throwable -> Lb4
            long r2 = r2 / r0
            X.1As5 r0 = new X.1As5     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = "ai_remix_draft"
            r4 = 0
            r5 = 1
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> Lb4
            return r0
        Lb4:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3.LJIIJJI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C2159508d7
            if (r0 == 0) goto L69
            r6 = r8
            X.08d7 r6 = (X.C2159508d7) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r6.LLILZ
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 == r0) goto L38
            if (r1 != r3) goto L6f
            X.C155000ia.LIZIZ(r5)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r5)
            X.1Asc r2 = X.EnumC2193241Asc.DELETE_POST
            r6.LL = r2
            r6.LLILZ = r0
            java.lang.Object r0 = r7.LJJIFFI(r6)
            if (r0 != r4) goto L3d
            return r4
        L38:
            X.1Asc r2 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L3d:
            X.1Asf r1 = r7.LIZJ
            r0 = 0
            r1.LJJIII(r0)
            boolean r0 = r7.LJJIII(r2)
            if (r0 != 0) goto L58
            X.1DDq r2 = r7.LJFF
            X.08gr r1 = new X.08gr
            java.lang.String r0 = "client_close_freq_control"
            r1.<init>(r0)
            r2.setValue(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L58:
            X.08cw r1 = new X.08cw
            r0 = 0
            r1.<init>(r7, r2, r0)
            r6.LL = r0
            r6.LLILZ = r3
            java.lang.Object r0 = r7.LJIL(r2, r1, r6)
            if (r0 != r4) goto L25
            return r4
        L69:
            X.08d7 r6 = new X.08d7
            r6.<init>(r7, r8)
            goto L12
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3.LJIIZILJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C2159408d6
            if (r0 == 0) goto L69
            r6 = r8
            X.08d6 r6 = (X.C2159408d6) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r6.LLILZ
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 == r0) goto L38
            if (r1 != r3) goto L6f
            X.C155000ia.LIZIZ(r5)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r5)
            X.1Asc r2 = X.EnumC2193241Asc.DRAFT_DELETED
            r6.LL = r2
            r6.LLILZ = r0
            java.lang.Object r0 = r7.LJJIFFI(r6)
            if (r0 != r4) goto L3d
            return r4
        L38:
            X.1Asc r2 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L3d:
            X.1Asf r1 = r7.LIZJ
            r0 = 0
            r1.LJJIII(r0)
            boolean r0 = r7.LJJIII(r2)
            if (r0 != 0) goto L58
            X.1DDq r2 = r7.LJFF
            X.08gr r1 = new X.08gr
            java.lang.String r0 = "client_close_freq_control"
            r1.<init>(r0)
            r2.setValue(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L58:
            X.08Yv r1 = new X.08Yv
            r0 = 0
            r1.<init>(r0)
            r6.LL = r0
            r6.LLILZ = r3
            java.lang.Object r0 = r7.LJIL(r2, r1, r6)
            if (r0 != r4) goto L25
            return r4
        L69:
            X.08d6 r6 = new X.08d6
            r6.<init>(r7, r8)
            goto L12
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3.LJIJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C2159608d8
            if (r0 == 0) goto L69
            r6 = r8
            X.08d8 r6 = (X.C2159608d8) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L3e
            if (r0 != r4) goto L6f
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            X.1Asc r2 = X.EnumC2193241Asc.DRAFT_SAVED
            X.1Asf r1 = r7.LIZJ
            r0 = 0
            r1.LJJIII(r0)
            r6.LL = r2
            r6.LLILZ = r3
            java.lang.Object r0 = r7.LJJIFFI(r6)
            if (r0 != r5) goto L43
            return r5
        L3e:
            X.1Asc r2 = r6.LL
            X.C155000ia.LIZIZ(r1)
        L43:
            boolean r0 = r7.LJJIII(r2)
            if (r0 != 0) goto L58
            X.1DDq r2 = r7.LJFF
            X.08gr r1 = new X.08gr
            java.lang.String r0 = "client_close_freq_control"
            r1.<init>(r0)
            r2.setValue(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L58:
            X.08Yw r1 = new X.08Yw
            r0 = 0
            r1.<init>(r0)
            r6.LL = r0
            r6.LLILZ = r4
            java.lang.Object r0 = r7.LJIL(r2, r1, r6)
            if (r0 != r5) goto L25
            return r5
        L69:
            X.08d8 r6 = new X.08d8
            r6.<init>(r7, r8)
            goto L12
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3.LJIJI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIFFI(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C2159308d5
            if (r0 == 0) goto L26
            r6 = r8
            X.08d5 r6 = (X.C2159308d5) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L34
            if (r0 == r2) goto L53
            if (r0 != r4) goto L2c
            X.0956 r2 = r6.LL
            goto L85
        L26:
            X.08d5 r6 = new X.08d5
            r6.<init>(r7, r8)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = X.C18112077m.LIZ()
            if (r0 != 0) goto L40
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            X.0956 r1 = r7.LJJI
            if (r1 == 0) goto L6b
            boolean r0 = r1.isActive()
            if (r0 == 0) goto L6b
            r6.LLILZ = r2     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r1.LJJZ(r6)     // Catch: java.lang.Throwable -> L5c
            if (r0 != r5) goto L56
            return r5
        L53:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L5c
        L56:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L5c
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L5c
            goto L68
        L5c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L68:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6b:
            androidx.lifecycle.LifecycleOwner r2 = r7.LIZIZ
            X.08Yz r1 = new X.08Yz
            r1.<init>(r7, r3)
            X.099x r0 = X.C23271099x.INSTANCE
            X.0956 r2 = X.C948503nH.LJ(r2, r0, r1)
            r7.LJJI = r2
            r6.LL = r2     // Catch: java.lang.Throwable -> L90
            r6.LLILZ = r4     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r2.LJJZ(r6)     // Catch: java.lang.Throwable -> L90
            if (r0 != r5) goto L88
            return r5
        L85:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L8e
        L88:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L8e
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L8e
            goto L9c
        L8e:
            r1 = move-exception
            goto L91
        L90:
            r1 = move-exception
        L91:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L9c:
            X.0956 r0 = r7.LJJI
            if (r0 != r2) goto La2
            r7.LJJI = r3
        La2:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3.LJJIFFI(X.05Vn):java.lang.Object");
    }

    public final boolean LJJIII(EnumC2193241Asc enumC2193241Asc) {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLJJI = this.LIZJ.LJJI();
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ServerTakeoverCheck serverTakeoverCheck = C2193401Ass.LIZ;
        ServerTakeoverCheck serverTakeoverCheck2 = (ServerTakeoverCheck) c0c64LJIILLIIL.LJJII(ServerTakeoverCheck.class, serverTakeoverCheck, "profile_top_topic_banner_server_takeover", true);
        if (serverTakeoverCheck2 != null) {
            serverTakeoverCheck = serverTakeoverCheck2;
        }
        if (!serverTakeoverCheck.privateAccount && ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isAccuratePrivateAccount()) {
            InterfaceC2193371Asp interfaceC2193371AspLJIILL = LJIILL();
            EnumC1154090g8d enumC1154090g8d = EnumC1154090g8d.CLIENT_CLOSE_FREQ;
            if (jCurrentTimeMillis >= jLJJI) {
                z6 = true;
            } else {
                z6 = false;
            }
            interfaceC2193371AspLJIILL.LJIIIZ(enumC2193241Asc, "local", "blocked", enumC1154090g8d, "user_is_private_account", jLJJI, z6, jCurrentTimeMillis, 0, null, null);
            return false;
        }
        if (!serverTakeoverCheck.childrenMode && ((AccountUserService) C0XQ7.LJFF()).LIZ()) {
            InterfaceC2193371Asp interfaceC2193371AspLJIILL2 = LJIILL();
            EnumC1154090g8d enumC1154090g8d2 = EnumC1154090g8d.CLIENT_CLOSE_FREQ;
            if (jCurrentTimeMillis >= jLJJI) {
                z5 = true;
            } else {
                z5 = false;
            }
            interfaceC2193371AspLJIILL2.LJIIIZ(enumC2193241Asc, "local", "blocked", enumC1154090g8d2, "user_is_children_mode", jLJJI, z5, jCurrentTimeMillis, 0, null, null);
            return false;
        }
        if (!serverTakeoverCheck.feedNonPersonalized && Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE)) {
            InterfaceC2193371Asp interfaceC2193371AspLJIILL3 = LJIILL();
            EnumC1154090g8d enumC1154090g8d3 = EnumC1154090g8d.CLIENT_CLOSE_FREQ;
            if (jCurrentTimeMillis >= jLJJI) {
                z4 = true;
            } else {
                z4 = false;
            }
            interfaceC2193371AspLJIILL3.LJIIIZ(enumC2193241Asc, "local", "blocked", enumC1154090g8d3, "feeds_non_personalized_enabled", jLJJI, z4, jCurrentTimeMillis, 0, null, null);
            return false;
        }
        if (this.LIZJ.LJIILIIL()) {
            return true;
        }
        int iLJIJI = this.LIZJ.LJIJI();
        long jLJIJJLI = this.LIZJ.LJIJJLI();
        if (iLJIJI >= C07BN.LIZ()) {
            InterfaceC2193371Asp interfaceC2193371AspLJIILL4 = LJIILL();
            EnumC1154090g8d enumC1154090g8d4 = EnumC1154090g8d.CLIENT_CLOSE_FREQ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("close_count_exceeds_max: ");
            sbLIZ.append(iLJIJI);
            sbLIZ.append(" >= ");
            sbLIZ.append(C07BN.LIZ());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (jCurrentTimeMillis >= jLJJI) {
                z3 = true;
            } else {
                z3 = false;
            }
            interfaceC2193371AspLJIILL4.LJIIIZ(enumC2193241Asc, "local", "blocked", enumC1154090g8d4, strLIZIZ, jLJJI, z3, jCurrentTimeMillis, 0, null, null);
            return false;
        }
        C01GW c01gw = C00JA.LIZIZ;
        Integer num = (Integer) C13LP.LJJJLZIJ(iLJIJI, (List) c01gw.getValue());
        if (num == null) {
            InterfaceC2193371Asp interfaceC2193371AspLJIILL5 = LJIILL();
            EnumC1154090g8d enumC1154090g8d5 = EnumC1154090g8d.CLIENT_CLOSE_FREQ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("invalid_timeout_config: closedTimes=");
            sbLIZ2.append(iLJIJI);
            sbLIZ2.append(", config=");
            sbLIZ2.append(c01gw.getValue());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (jCurrentTimeMillis >= jLJJI) {
                z2 = true;
            } else {
                z2 = false;
            }
            interfaceC2193371AspLJIILL5.LJIIIZ(enumC2193241Asc, "local", "blocked", enumC1154090g8d5, strLIZIZ2, jLJJI, z2, jCurrentTimeMillis, 0, null, null);
            return false;
        }
        if (jLJIJJLI > 0) {
            j = (jCurrentTimeMillis - jLJIJJLI) / ((long) 86400000);
        } else {
            j = Long.MAX_VALUE;
        }
        if (j >= num.intValue()) {
            return true;
        }
        InterfaceC2193371Asp interfaceC2193371AspLJIILL6 = LJIILL();
        EnumC1154090g8d enumC1154090g8d6 = EnumC1154090g8d.CLIENT_CLOSE_FREQ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("in_cooldown_period: closedTimes=");
        sbLIZ3.append(iLJIJI);
        sbLIZ3.append(", dayElapsed=");
        sbLIZ3.append(j);
        sbLIZ3.append(", requirement=");
        sbLIZ3.append(num);
        sbLIZ3.append(" days");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        if (jCurrentTimeMillis >= jLJJI) {
            z = true;
        } else {
            z = false;
        }
        interfaceC2193371AspLJIILL6.LJIIIZ(enumC2193241Asc, "local", "blocked", enumC1154090g8d6, strLIZIZ3, jLJJI, z, jCurrentTimeMillis, 0, null, null);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(int r12, X.InterfaceC1364105Vn<? super kotlin.Pair<X.C19720512Dr, java.lang.Integer>> r13) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3.LJIIJ(int, X.05Vn):java.lang.Object");
    }

    public final void LJIJJ(C2193381Asq c2193381Asq, EnumC2193241Asc enumC2193241Asc) {
        if (c2193381Asq.LJFF) {
            Pair<Integer, Long> pairLJIJ = this.LIZJ.LJIJ();
            LJIILL().LJIIIIZZ(enumC2193241Asc, pairLJIJ.getFirst().intValue(), pairLJIJ.getSecond().longValue(), System.currentTimeMillis());
            this.LIZJ.LJIIIZ();
        }
    }

    @Override // X.InterfaceC2193211AsZ
    public final void LJ(C19720512Dr c19720512Dr, EnumC2193181AsW enumC2193181AsW, Map<String, ? extends Object> map) {
        boolean z;
        Object obj;
        EnumC1300180jwG enumC1300180jwG;
        String strLIZ;
        Object obj2;
        EnumC2193121AsQ enumC2193121AsQ;
        String str;
        EnumC2193121AsQ enumC2193121AsQ2;
        Object obj3;
        String str2;
        EnumC2193241Asc enumC2193241Asc = EnumC2193241Asc.USER_INTERACTION;
        int i = this.LJIILIIL + 1;
        this.LJIILIIL = i;
        int i2 = this.LJIILJJIL;
        if (i2 > 0 && i % i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj4 = null;
        string = null;
        String string = null;
        if (z) {
            SearchCSIProfilerBannerAPI searchCSIProfilerBannerAPI = SearchCSIProfilerBannerAPI.LIZIZ;
            String str3 = c19720512Dr.LJ;
            EnumC2193121AsQ[] enumC2193121AsQArrValues = EnumC2193121AsQ.values();
            int length = enumC2193121AsQArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    enumC2193121AsQ2 = enumC2193121AsQArrValues[i3];
                    if (enumC2193121AsQ2.getValue() == enumC2193181AsW.getValue()) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    enumC2193121AsQ2 = EnumC2193121AsQ.SHOW;
                    break;
                }
            }
            if (map != null) {
                obj3 = map.get("itemId");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str2 = (String) obj3;
            } else {
                str2 = null;
            }
            String str4 = c19720512Dr.LJIIZILJ;
            Integer num = c19720512Dr.LJIIJ;
            String str5 = c19720512Dr.LJIILL;
            searchCSIProfilerBannerAPI.getClass();
            SearchCSIProfilerBannerAPI.LIZ(str3, enumC2193121AsQ2, str2, str4, num, str5, "v3", "banner");
        }
        switch (C2193231Asb.LIZJ[enumC2193181AsW.ordinal()]) {
            case 1:
                C19720112Dn c19720112Dn = C19720112Dn.LIZ;
                EnumC19720912Dv enumC19720912Dv = EnumC19720912Dv.SHOW;
                c19720112Dn.getClass();
                C19720112Dn.LIZJ(c19720512Dr, enumC19720912Dv, null);
                break;
            case 2:
                LJJIIZI = c19720512Dr;
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIIIZZ;
                long jLJIILJJIL = LJIILJJIL();
                if (map != null) {
                    obj = map.get("click_area");
                } else {
                    obj = null;
                }
                if (Intrinsics.LJFF(obj, "button")) {
                    enumC1300180jwG = EnumC1300180jwG.BUTTON_JOIN;
                } else if (Intrinsics.LJFF(obj, "image")) {
                    enumC1300180jwG = EnumC1300180jwG.IMAGE;
                } else {
                    enumC1300180jwG = EnumC1300180jwG.TEXT;
                }
                if (enumC1300180jwG == EnumC1300180jwG.BUTTON_JOIN) {
                    strLIZ = c19720512Dr.LIZJ;
                } else {
                    strLIZ = c19720512Dr.LIZ();
                }
                LJIILL().LIZJ(c19720512Dr, enumC1300180jwG, strLIZ, this.LJIILL, jLJIILJJIL, jCurrentTimeMillis, System.currentTimeMillis());
                C19720112Dn c19720112Dn2 = C19720112Dn.LIZ;
                EnumC19720912Dv enumC19720912Dv2 = EnumC19720912Dv.CLICK;
                if (map != null && (obj2 = map.get("click_area")) != null) {
                    string = obj2.toString();
                }
                c19720112Dn2.getClass();
                C19720112Dn.LIZJ(c19720512Dr, enumC19720912Dv2, string);
                this.LIZJ.LJIL();
                break;
            case 3:
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.LIZJ.LJJII();
                this.LIZJ.LJIILLIIL();
                int iLJIJI = this.LIZJ.LJIJI();
                LJIILL().LJI(c19720512Dr, this.LJIILL, iLJIJI, LJIILJJIL(), System.currentTimeMillis() - this.LJIIIIZZ, System.currentTimeMillis());
                this.LJFF.setValue(new C2182708gr("user_close"));
                this.LJII = null;
                this.LJIILL = -1;
                this.LJIILLIIL = 0;
                this.LJIIZILJ = 0;
                this.LJIIIIZZ = 0L;
                C19720112Dn c19720112Dn3 = C19720112Dn.LIZ;
                EnumC19720912Dv enumC19720912Dv3 = EnumC19720912Dv.CLOSE;
                c19720112Dn3.getClass();
                C19720112Dn.LIZJ(c19720512Dr, enumC19720912Dv3, null);
                if (iLJIJI >= C07BN.LIZ()) {
                    new C1619430sFB().LJIILJJIL();
                }
                this.LJ.LIZIZ("close", "v3", System.currentTimeMillis() - jCurrentTimeMillis2, c19720512Dr);
                break;
            case 4:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("User published content: itemId=");
                if (map != null) {
                    obj4 = map.get("itemId");
                }
                sbLIZ.append(obj4);
                C2188811AlT.LIZIZ(sbLIZ);
                break;
            case 5:
            case 6:
                C948503nH.LJ(this.LIZIZ, C23271099x.INSTANCE, new C2182408go(this, enumC2193241Asc, null));
                break;
            default:
                throw new C1954807lC();
        }
        EnumC2193121AsQ[] enumC2193121AsQArrValues2 = EnumC2193121AsQ.values();
        int length2 = enumC2193121AsQArrValues2.length;
        int i4 = 0;
        while (true) {
            if (i4 < length2) {
                enumC2193121AsQ = enumC2193121AsQArrValues2[i4];
                if (enumC2193121AsQ.getValue() != enumC2193181AsW.getValue()) {
                    i4++;
                }
            } else {
                enumC2193121AsQ = EnumC2193121AsQ.SHOW;
            }
        }
        if (enumC2193121AsQ == EnumC2193121AsQ.SHOW) {
            for (C12E4 c12e4 : C12E5.LIZ) {
                if (Intrinsics.LJFF(c19720512Dr.LJIIZILJ, c12e4.LJFF()) && (str = c19720512Dr.LJ) != null) {
                    Map<String, Set<String>> map2 = LJJIIJZLJL;
                    String strLJFF = c12e4.LJFF();
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
                    Object obj5 = linkedHashMap.get(strLJFF);
                    Object obj6 = obj5;
                    if (obj5 == null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashMap.put(strLJFF, linkedHashSet);
                        obj6 = linkedHashSet;
                    }
                    Set set = (Set) obj6;
                    if (!set.contains(str)) {
                        set.add(str);
                        c12e4.LIZJ();
                    }
                }
            }
            return;
        }
        for (C12E4 c12e42 : C12E5.LIZ) {
            if (Intrinsics.LJFF(c19720512Dr.LJIIZILJ, c12e42.LJFF())) {
                c12e42.LIZJ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.EnumC2193241Asc r7, boolean r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C2193351Asn
            if (r0 == 0) goto L95
            r5 = r9
            X.1Asn r5 = (X.C2193351Asn) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L95
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L4d
            if (r0 != r3) goto L9c
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            X.1Asf r0 = r6.LIZJ
            java.util.List r0 = r0.LJJIFFI()
            r1 = 0
            if (r0 == 0) goto La4
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La4
            int r0 = r6.LJIILL
            if (r0 < 0) goto L3f
            r1 = r0
        L3f:
            r5.LL = r7
            r5.getClass()
            r5.LLILZ = r2
            java.lang.Object r1 = r6.LJIIJ(r1, r5)
            if (r1 != r4) goto L52
            return r4
        L4d:
            X.1Asc r7 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L52:
            kotlin.Pair r1 = (kotlin.Pair) r1
            if (r1 == 0) goto L7c
            java.lang.Object r2 = r1.getFirst()
            X.12Dr r2 = (X.C19720512Dr) r2
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r6.LJIILL
            if (r1 != r0) goto L78
            java.lang.String r1 = "CSIProfileRepoV3"
            java.lang.String r0 = "checkHandlerShouldShow: current banner still valid, keep showing"
            int r0 = android.util.Log.d(r1, r0)
            X.C2286608xc.LJ(r0)
        L75:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L78:
            r6.LJJIIJ(r2, r1, r7)
            goto L75
        L7c:
            r1 = 0
            r5.LL = r1
            r5.LLILZ = r3
            X.08cv r0 = new X.08cv
            r0.<init>(r6, r7, r1)
            java.lang.Object r1 = r6.LJIL(r7, r0, r5)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L92
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L92:
            if (r1 != r4) goto L25
            return r4
        L95:
            X.1Asn r5 = new X.1Asn
            r5.<init>(r6, r9)
            goto L12
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La4:
            X.1DDq r2 = r6.LJFF
            X.08gr r1 = new X.08gr
            java.lang.String r0 = "cache_empty"
            r1.<init>(r0)
            r2.setValue(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3.LJII(X.1Asc, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016e  */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(X.EnumC2193241Asc r26, X.EnumC2182608gq r27, X.InterfaceC1364105Vn<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3.LJIJJLI(X.1Asc, X.08gq, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:14))(0)|7|91|(6:(1:(1:(1:(5:13|101|15|84|85)(2:18|19))(3:20|92|21))(11:22|99|23|37|(1:39)(1:40)|41|(1:43)(1:47)|44|(2:46|48)(1:49)|50|(1:52)))(14:26|89|27|96|34|(1:36)|37|(0)(0)|41|(0)(0)|44|(0)(0)|50|(0))|80|(1:82)|83|84|85)(15:30|94|31|(1:33)|96|34|(0)|37|(0)(0)|41|(0)(0)|44|(0)(0)|50|(0))|98|53|(4:55|(1:57)|58|59)(4:60|(2:62|(1:64))(4:65|(1:67)|68|(1:72))|84|85)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b3, code lost:
    
        r6 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[Catch: Exception -> 0x01b5, CancellationException -> 0x0221, TryCatch #1 {CancellationException -> 0x0221, blocks: (B:15:0x003c, B:21:0x0052, B:53:0x0110, B:55:0x012d, B:58:0x0137, B:60:0x0140, B:62:0x0144, B:65:0x0168, B:68:0x017f, B:70:0x0189, B:72:0x0191, B:23:0x005d, B:37:0x0096, B:41:0x00d4, B:43:0x00de, B:44:0x00ea, B:50:0x00f4, B:27:0x006a, B:34:0x0087, B:31:0x0078), top: B:91:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIL(X.EnumC2193241Asc r22, kotlin.jvm.functions.Function2<? super java.lang.String, ? super X.InterfaceC1364105Vn<? super kotlin.Unit>, ? extends java.lang.Object> r23, X.InterfaceC1364105Vn<? super kotlin.Unit> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3.LJIL(X.1Asc, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    public final void LJJ(int i, int i2, List list) {
        if (i2 <= 0 || i >= list.size() || !C07BJ.LIZ()) {
            return;
        }
        int iMin = Math.min(i2 + i, list.size());
        while (i < iMin) {
            String str = ((C19720512Dr) ListProtector.get(list, i)).LJIIL;
            if (str != null && str.length() != 0) {
                try {
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(str));
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ;
                    c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ2;
                    c1331670kl3LJIIIIZZ.LIZLLL("CSIProfileRepoV3");
                    c1331670kl3LJIIIIZZ.LJJIII();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            i++;
        }
        this.LJIILLIIL = iMin;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[Catch: Exception -> 0x014f, TryCatch #0 {Exception -> 0x014f, blocks: (B:25:0x007a, B:26:0x007d, B:28:0x0086, B:35:0x0098, B:37:0x009c, B:38:0x00a2, B:40:0x00a8, B:42:0x00ae, B:43:0x00b2, B:45:0x00b6, B:46:0x00ba, B:47:0x00bd, B:50:0x00cb, B:61:0x00e5, B:63:0x00e9, B:64:0x00eb, B:67:0x010a, B:69:0x010e, B:70:0x0114, B:71:0x0133, B:30:0x008c), top: B:83:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8 A[Catch: Exception -> 0x014f, TryCatch #0 {Exception -> 0x014f, blocks: (B:25:0x007a, B:26:0x007d, B:28:0x0086, B:35:0x0098, B:37:0x009c, B:38:0x00a2, B:40:0x00a8, B:42:0x00ae, B:43:0x00b2, B:45:0x00b6, B:46:0x00ba, B:47:0x00bd, B:50:0x00cb, B:61:0x00e5, B:63:0x00e9, B:64:0x00eb, B:67:0x010a, B:69:0x010e, B:70:0x0114, B:71:0x0133, B:30:0x008c), top: B:83:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0133 A[Catch: Exception -> 0x014f, TRY_LEAVE, TryCatch #0 {Exception -> 0x014f, blocks: (B:25:0x007a, B:26:0x007d, B:28:0x0086, B:35:0x0098, B:37:0x009c, B:38:0x00a2, B:40:0x00a8, B:42:0x00ae, B:43:0x00b2, B:45:0x00b6, B:46:0x00ba, B:47:0x00bd, B:50:0x00cb, B:61:0x00e5, B:63:0x00e9, B:64:0x00eb, B:67:0x010a, B:69:0x010e, B:70:0x0114, B:71:0x0133, B:30:0x008c), top: B:83:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJII(X.EnumC2193241Asc r31, java.lang.String r32, X.InterfaceC1364105Vn<? super kotlin.Unit> r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3.LJJII(X.1Asc, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJJIIJ(C19720512Dr c19720512Dr, int i, EnumC2193241Asc enumC2193241Asc) {
        boolean z;
        C12E4 next;
        boolean z2;
        List<C19720512Dr> listLJJIFFI;
        EnumC2193251Asd enumC2193251Asd;
        String str;
        int size;
        C19720512Dr c19720512Dr2 = this.LJII;
        boolean z3 = false;
        if (c19720512Dr2 != null && !Intrinsics.LJFF(c19720512Dr2.LJ, c19720512Dr.LJ)) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJIIIZ == 0) {
            this.LJIIIZ = System.currentTimeMillis();
        }
        if (z) {
            List<C19720512Dr> listLJJIFFI2 = this.LIZJ.LJJIFFI();
            switch (C2193231Asb.LIZIZ[enumC2193241Asc.ordinal()]) {
                case 1:
                    enumC2193251Asd = EnumC2193251Asd.PULL_REFRESH;
                    break;
                case 2:
                    enumC2193251Asd = EnumC2193251Asd.INTERVAL;
                    break;
                case 3:
                    enumC2193251Asd = EnumC2193251Asd.PUBLISH;
                    break;
                case 4:
                    enumC2193251Asd = EnumC2193251Asd.DELETE_POST;
                    break;
                case 5:
                    enumC2193251Asd = EnumC2193251Asd.DRAFT_SAVED;
                    break;
                case 6:
                    enumC2193251Asd = EnumC2193251Asd.DRAFT_DELETED;
                    break;
                case 7:
                    enumC2193251Asd = EnumC2193251Asd.SHOWN;
                    break;
                default:
                    enumC2193251Asd = EnumC2193251Asd.SHOWN;
                    break;
            }
            InterfaceC2193371Asp interfaceC2193371AspLJIILL = LJIILL();
            if (c19720512Dr2 == null || (str = c19720512Dr2.LJ) == null) {
                str = "";
            }
            if (listLJJIFFI2 != null) {
                size = listLJJIFFI2.size() - 1;
            } else {
                size = 0;
            }
            interfaceC2193371AspLJIILL.LJFF(enumC2193241Asc, c19720512Dr, str, enumC2193251Asd, size, System.currentTimeMillis());
            if (this.LJIIJ > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIJ;
                this.LJ.LIZIZ("update", "v3", jCurrentTimeMillis, c19720512Dr);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("trackOverallUpdateCost: update, cost=");
                sbLIZ.append(jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } else if (c19720512Dr2 == null && this.LJIIJ > 0) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LJIIJ;
            this.LJ.LIZIZ("create", "v3", jCurrentTimeMillis2, c19720512Dr);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("trackOverallUpdateCost: create, cost=");
            sbLIZ2.append(jCurrentTimeMillis2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        Iterator<C12E4> it2 = C12E5.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LJFF(), c19720512Dr.LJIIZILJ)) {
                }
            } else {
                next = null;
            }
        }
        C12E4 c12e4 = next;
        if (c12e4 != null) {
            c12e4.LJ(c19720512Dr);
        }
        this.LJII = c19720512Dr;
        this.LJIILL = i;
        if (C07BJ.LIZ() && this.LJIIZILJ > 0 && (listLJJIFFI = this.LIZJ.LJJIFFI()) != null && !listLJJIFFI.isEmpty() && this.LJIILLIIL < listLJJIFFI.size()) {
            int i2 = this.LJIILLIIL;
            if (i >= i2 - 1) {
                LJJ(i2, this.LJIIZILJ, listLJJIFFI);
            }
        }
        this.LJIIIIZZ = System.currentTimeMillis();
        C2252321DDq c2252321DDq = this.LJFF;
        if (!z && c19720512Dr2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        c2252321DDq.setValue(new AnonymousClass0945(c19720512Dr, i, z2));
        if (!z && c19720512Dr2 == null) {
            z3 = true;
        }
        long jLJIILJJIL = LJIILJJIL();
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        if (z3 && enumC2193241Asc == EnumC2193241Asc.COLD_START) {
            LJIILL().LIZIZ(enumC2193241Asc, c19720512Dr, i, LJIILIIL(), true, jLJIILJJIL, 0L, jCurrentTimeMillis3, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(X.C2193381Asq r20, X.EnumC2193241Asc r21, long r22, long r24, long r26) {
        /*
            r19 = this;
            r3 = r20
            int r0 = r3.LJII
            r11 = r22
            r14 = r24
            if (r0 == 0) goto L45
            r4 = 1
        Lb:
            r13 = 0
        Lc:
            r1 = r19
            X.1Asp r5 = r1.LJIILL()
            java.lang.String r7 = "server"
            if (r4 == 0) goto L33
            java.lang.String r8 = "error"
            X.0g8d r9 = X.EnumC1154090g8d.CLIENT_ERROR
        L1a:
            java.lang.String r10 = r3.LIZLLL
            int r2 = r3.LJII
            java.lang.String r0 = r3.LJIIIIZZ
            r18 = 0
            r6 = r21
            r17 = r0
            r16 = r2
            r5.LJIIIZ(r6, r7, r8, r9, r10, r11, r13, r14, r16, r17, r18)
            X.12Dr r0 = r1.LJII
            r1 = r26
            X.C19721012Dw.LIZLLL(r1, r0)
            return
        L33:
            boolean r0 = r3.LIZ
            if (r0 == 0) goto L40
            java.lang.String r8 = "success"
        L39:
            java.lang.String r0 = r3.LIZJ
            if (r0 == 0) goto L43
            X.0g8d r9 = X.EnumC1154090g8d.SERVER_FREQ
            goto L1a
        L40:
            java.lang.String r8 = "blocked"
            goto L39
        L43:
            r9 = 0
            goto L1a
        L45:
            r4 = 0
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lb
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 < 0) goto Lb
            r13 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3.LJJIIJZLJL(X.1Asq, X.1Asc, long, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZI(X.EnumC2193241Asc r8, boolean r9, boolean r10, java.lang.String r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3.LJJIIZI(X.1Asc, boolean, boolean, java.lang.String, X.05Vn):java.lang.Object");
    }
}
