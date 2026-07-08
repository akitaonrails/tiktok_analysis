package com.ss.android.ugc.aweme.explore.domian;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C07MS;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09AE;
import X.C0NJK;
import X.C0PEM;
import X.C0XQ7;
import X.C11NJ;
import X.C1227904rF;
import X.C15438062q;
import X.C1841630y1Z;
import X.C1841650y1b;
import X.C1841660y1c;
import X.C1841730y1j;
import X.C1841750y1l;
import X.C1841760y1m;
import X.C1841770y1n;
import X.C1841780y1o;
import X.C1841870y1x;
import X.C189200o6;
import X.C1906580ziK;
import X.C1DFK;
import X.C20527015Tw;
import X.C2153908cD;
import X.C2252611DEt;
import X.C23250099c;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC1364105Vn;
import X.InterfaceC1841670y1d;
import X.InterfaceC427710Gpt;
import X.InterfaceC625970Ogt;
import Y.AfS173S0100000_4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.monitor.cache.ExploreTopicTabMonitor;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes28.dex */
public final class ExploreCustomTopicDataSource {
    public static final C1841770y1n Companion = new Object() { // from class: X.0y1n
    };
    public final C11NJ compositeDisposable;
    public InterfaceC1841670y1d fetchInRAMJob;
    public C09AE fetchUserTopicJob;
    public final InterfaceC427710Gpt onUserChangedListener;
    public final C1841870y1x scope;
    public final AtomicBoolean shouldSyncData;
    public C09AE syncUserTopicJob;
    public final C01GW localCustomTopicDataSource$delegate = C452501pT.LIZIZ(new C20527015Tw());
    public final C01GW remoteCustomTopicDataSource$delegate = C452501pT.LIZIZ(new C1841750y1l());
    public final CopyOnWriteArrayList<ExploreCustomTopicResponse> cacheRAMResponse = new CopyOnWriteArrayList<>();
    public final AtomicReference<C0NJK> _initState = new AtomicReference<>(C0NJK.UNINITIALIZED);
    public final C01GW exceptionHandler$delegate = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1841730y1j());

    private final CoroutineExceptionHandler getExceptionHandler() {
        return (CoroutineExceptionHandler) this.exceptionHandler$delegate.getValue();
    }

    public static final ExploreCustomTopicDataSource getInstance() {
        Companion.getClass();
        return C1841760y1m.LIZ;
    }

    public final C0NJK getInitState() {
        return this._initState.get();
    }

    public final InterfaceC625970Ogt getLocalCustomTopicDataSource() {
        return (InterfaceC625970Ogt) this.localCustomTopicDataSource$delegate.getValue();
    }

    public final C1841780y1o getRemoteCustomTopicDataSource() {
        return (C1841780y1o) this.remoteCustomTopicDataSource$delegate.getValue();
    }

    public final List<ExploreCustomTopicResponse> getTopicRAMResponseWithoutRedPoint() {
        CopyOnWriteArrayList<ExploreCustomTopicResponse> copyOnWriteArrayList = this.cacheRAMResponse;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
        for (ExploreCustomTopicResponse exploreCustomTopicResponse : copyOnWriteArrayList) {
            arrayList.add(exploreCustomTopicResponse.copy(exploreCustomTopicResponse.topicName, exploreCustomTopicResponse.topicId, Boolean.FALSE, exploreCustomTopicResponse.customRelatedItemsUpdatedCount));
        }
        return arrayList;
    }

    public final void onAccountChange() {
        C2153908cD c2153908cD = C2153908cD.LIZ;
        release();
        initialize();
    }

    public ExploreCustomTopicDataSource() {
        C1841870y1x c1841870y1x = new C1841870y1x(C0PEM.LIZJ.plus(getExceptionHandler()));
        this.scope = c1841870y1x;
        this.compositeDisposable = new C11NJ();
        this.fetchInRAMJob = new C1DFK(c1841870y1x.LLILLL);
        this.shouldSyncData = new AtomicBoolean(false);
        this.onUserChangedListener = new InterfaceC427710Gpt() { // from class: X.0y1i
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                String uid;
                if (i != 1 && i != 2 && i != 3) {
                    return;
                }
                String uid2 = null;
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                if (user2 != null) {
                    uid2 = user2.getUid();
                }
                if (Intrinsics.LJFF(uid, uid2)) {
                    return;
                }
                this.LL.onAccountChange();
            }
        };
    }

    public final void fetchUserCustomTopics() {
        if (!C07MS.LIZ()) {
            InterfaceC1841670y1d interfaceC1841670y1d = this.fetchInRAMJob;
            if (interfaceC1841670y1d != null) {
                interfaceC1841670y1d.LJFF();
                return;
            }
            return;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            InterfaceC1841670y1d interfaceC1841670y1d2 = this.fetchInRAMJob;
            if (interfaceC1841670y1d2 != null) {
                interfaceC1841670y1d2.LJFF();
                return;
            }
            return;
        }
        if (this._initState.get() != C0NJK.LOADING) {
            C2153908cD c2153908cD = C2153908cD.LIZ;
            AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 234);
            c2153908cD.getClass();
            C2153908cD.LIZIZ("ExploreCustomTopicDataSource", awS571S0100000_27);
            return;
        }
        C09AE c09ae = this.fetchUserTopicJob;
        if (c09ae != null && c09ae.isActive()) {
            C2153908cD c2153908cD2 = C2153908cD.LIZ;
            AFwS216S0000000_27 aFwS216S0000000_27 = AFwS216S0000000_27.get$arr$(103);
            c2153908cD2.getClass();
            C2153908cD.LIZIZ("ExploreCustomTopicDataSource", aFwS216S0000000_27);
            return;
        }
        C2153908cD c2153908cD3 = C2153908cD.LIZ;
        AFwS216S0000000_27 aFwS216S0000000_272 = AFwS216S0000000_27.get$arr$(104);
        c2153908cD3.getClass();
        C2153908cD.LIZIZ("ExploreCustomTopicDataSource", aFwS216S0000000_272);
        this.fetchUserTopicJob = C23250099c.LIZLLL(this.scope, null, null, new C1841660y1c(this, null), 3);
        InterfaceC1841670y1d interfaceC1841670y1d3 = this.fetchInRAMJob;
        if (interfaceC1841670y1d3 != null) {
            interfaceC1841670y1d3.LJII(new AwS606S0100000_27(this, 102));
        }
    }

    public final void initialize() {
        boolean z;
        if (C07MS.LIZ()) {
            AtomicReference<C0NJK> atomicReference = this._initState;
            C0NJK c0njk = C0NJK.UNINITIALIZED;
            C0NJK c0njk2 = C0NJK.LOADING;
            while (true) {
                if (atomicReference.compareAndSet(c0njk, c0njk2)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != c0njk) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                C2153908cD c2153908cD = C2153908cD.LIZ;
                AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 235);
                c2153908cD.getClass();
                C2153908cD.LIZ("ExploreCustomTopicDataSource", awS571S0100000_27);
                return;
            }
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI(this.onUserChangedListener);
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                C2153908cD c2153908cD2 = C2153908cD.LIZ;
                AFwS216S0000000_27 aFwS216S0000000_27 = AFwS216S0000000_27.get$arr$(105);
                c2153908cD2.getClass();
                C2153908cD.LIZIZ("ExploreCustomTopicDataSource", aFwS216S0000000_27);
                this.compositeDisposable.LIZ(C1906580ziK.LIZJ().LIZJ().LJJLJLI(new AfS173S0100000_4(this, 6)));
                this.shouldSyncData.set(false);
                this.cacheRAMResponse.clear();
                C09AE c09ae = this.fetchUserTopicJob;
                if (c09ae != null) {
                    c09ae.LIZIZ(null);
                }
                this.fetchUserTopicJob = null;
            }
        }
    }

    public final void release() {
        if (C07MS.LIZ()) {
            this.compositeDisposable.LJ();
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJIILLIIL(this.onUserChangedListener);
            this._initState.set(C0NJK.UNINITIALIZED);
            this.cacheRAMResponse.clear();
            this.scope.LIZ();
            C09AE c09ae = this.fetchUserTopicJob;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            this.fetchUserTopicJob = null;
            this.syncUserTopicJob = null;
            this.fetchInRAMJob = new C1DFK(this.scope.LLILLL);
            this.shouldSyncData.set(false);
            ExploreTopicTabMonitor.INSTANCE.clear();
        }
    }

    public final void syncCustomTopics() {
        if (C07MS.LIZ() && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C09AE c09ae = this.syncUserTopicJob;
            if (c09ae == null || !c09ae.isActive()) {
                this.syncUserTopicJob = C23250099c.LIZLLL(this.scope, null, null, new C1841650y1b(this, null), 3);
            }
        }
    }

    public final InterfaceC1841670y1d getFetchInRAMJob() {
        return this.fetchInRAMJob;
    }

    public final CopyOnWriteArrayList<ExploreCustomTopicResponse> getTopicRAMResponse() {
        return this.cacheRAMResponse;
    }

    private final void mergeRedDotToMemory(List<ExploreCustomTopicResponse> list) {
        ExploreCustomTopicResponse next;
        if (list == null) {
            return;
        }
        C2153908cD c2153908cD = C2153908cD.LIZ;
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(list, (List<BaseImage>) 236);
        c2153908cD.getClass();
        C2153908cD.LIZIZ("ExploreCustomTopicDataSource", awS571S0100000_27);
        for (ExploreCustomTopicResponse exploreCustomTopicResponse : this.cacheRAMResponse) {
            Iterator<ExploreCustomTopicResponse> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.topicId, exploreCustomTopicResponse.topicId)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ExploreCustomTopicResponse exploreCustomTopicResponse2 = next;
            if (exploreCustomTopicResponse2 != null) {
                exploreCustomTopicResponse.setHasRedPoint(exploreCustomTopicResponse2.hasRedPoint);
                exploreCustomTopicResponse.setCustomRelatedItemsUpdatedCount(exploreCustomTopicResponse2.customRelatedItemsUpdatedCount);
            }
        }
    }

    public final Object loadCache(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        ArrayList arrayList;
        boolean z;
        boolean z2 = true;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        try {
            try {
                String string = getLocalCustomTopicDataSource().getString("explore_user_pin_topics", null);
                Type type = new TypeToken<List<? extends ExploreCustomTopicResponse>>() { // from class: X.0y1e
                }.getType();
                C1227904rF.LIZ.getClass();
                List list = (List) C1227904rF.LIZJ(string, type);
                if (list != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (hashSet.add(((ExploreCustomTopicResponse) obj).topicId)) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        Long l = ((ExploreCustomTopicResponse) obj2).topicId;
                        if (l != null && l.longValue() == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                ExploreTopicTabMonitor.INSTANCE.readCacheEnd(true, null);
                if (arrayList != null && !arrayList.isEmpty()) {
                    z2 = false;
                }
                if (!z2) {
                    updateResponseToMemory(arrayList);
                    InterfaceC1841670y1d fetchInRAMJob = getFetchInRAMJob();
                    if (fetchInRAMJob != null) {
                        Boolean.valueOf(fetchInRAMJob.LJFF());
                    }
                    C2153908cD c2153908cD = C2153908cD.LIZ;
                } else {
                    InterfaceC1841670y1d fetchInRAMJob2 = getFetchInRAMJob();
                    if (fetchInRAMJob2 != null) {
                        Boolean.valueOf(fetchInRAMJob2.LJFF());
                    }
                    C2153908cD c2153908cD2 = C2153908cD.LIZ;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ExploreTopicTabMonitor.INSTANCE.readCacheEnd(false, e);
                C2153908cD c2153908cD3 = C2153908cD.LIZ;
            }
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            c2252611DEt.resumeWith(unit);
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(interfaceC1364105Vn);
            }
            if (objLJIJ == C099R.LJFF()) {
                return objLJIJ;
            }
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Unit unit2 = Unit.LIZ;
            C189200o6.m2constructorimpl(unit2);
            c2252611DEt.resumeWith(unit2);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6 A[Catch: Exception -> 0x014e, TryCatch #0 {Exception -> 0x014e, blocks: (B:26:0x007e, B:27:0x0081, B:28:0x0083, B:30:0x0099, B:32:0x009f, B:33:0x00a8, B:35:0x00ae, B:37:0x00b9, B:42:0x00c8, B:43:0x00cc, B:44:0x00da, B:46:0x00e0, B:48:0x00ef, B:51:0x00f6, B:52:0x0105, B:54:0x010b, B:55:0x0123, B:57:0x012b, B:58:0x0136, B:60:0x013c, B:62:0x0146, B:63:0x014a, B:15:0x0035, B:17:0x004b, B:19:0x0051, B:22:0x0073), top: B:68:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b A[Catch: Exception -> 0x014e, TryCatch #0 {Exception -> 0x014e, blocks: (B:26:0x007e, B:27:0x0081, B:28:0x0083, B:30:0x0099, B:32:0x009f, B:33:0x00a8, B:35:0x00ae, B:37:0x00b9, B:42:0x00c8, B:43:0x00cc, B:44:0x00da, B:46:0x00e0, B:48:0x00ef, B:51:0x00f6, B:52:0x0105, B:54:0x010b, B:55:0x0123, B:57:0x012b, B:58:0x0136, B:60:0x013c, B:62:0x0146, B:63:0x014a, B:15:0x0035, B:17:0x004b, B:19:0x0051, B:22:0x0073), top: B:68:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processApi(X.InterfaceC1364105Vn<? super kotlin.Unit> r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource.processApi(X.05Vn):java.lang.Object");
    }

    public final void saveToDisk(List<ExploreCustomTopicResponse> list) {
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(list);
        if (strLJI != null) {
            getLocalCustomTopicDataSource().LIZIZ("explore_user_pin_topics", strLJI);
        }
    }

    public final void updateLatestTopicResult(List<ExploreCustomTopicResponse> list) {
        if (!C07MS.LIZ() || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        C23250099c.LIZLLL(this.scope, null, null, new C1841630y1Z(list, this, null), 3);
    }

    public final void updateResponseToMemory(List<ExploreCustomTopicResponse> list) {
        if (list.isEmpty()) {
            C2153908cD c2153908cD = C2153908cD.LIZ;
            AFwS216S0000000_27 aFwS216S0000000_27 = AFwS216S0000000_27.get$arr$(107);
            c2153908cD.getClass();
            C2153908cD.LIZIZ("ExploreCustomTopicDataSource", aFwS216S0000000_27);
        }
        this.cacheRAMResponse.clear();
        this.cacheRAMResponse.addAll(list);
    }
}
