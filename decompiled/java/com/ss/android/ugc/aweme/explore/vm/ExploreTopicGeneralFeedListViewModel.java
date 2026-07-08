package com.ss.android.ugc.aweme.explore.vm;

import X.AbstractC1623806Xk;
import X.AbstractC316870CbV;
import X.AnonymousClass0956;
import X.C01GW;
import X.C09YA;
import X.C0C1X;
import X.C1158470gFh;
import X.C1210880hcE;
import X.C1263204ww;
import X.C13BV;
import X.C13LP;
import X.C14EU;
import X.C150D;
import X.C15438062q;
import X.C1559260qg8;
import X.C15SN;
import X.C15T7;
import X.C15TE;
import X.C15TG;
import X.C15TH;
import X.C15TI;
import X.C15TZ;
import X.C15V2;
import X.C15VE;
import X.C1623606Xi;
import X.C1841870y1x;
import X.C19719512Dh;
import X.C1DFK;
import X.C20522415Sc;
import X.C20526015Tm;
import X.C20530015Va;
import X.C20530215Vc;
import X.C2153908cD;
import X.C2487409ou;
import X.C316650Cb9;
import X.C317290CcB;
import X.C323380Cm0;
import X.C438710HIf;
import X.C452501pT;
import X.C484220Iyq;
import X.C491101vh;
import X.C622680Oba;
import X.C626160OhC;
import X.C627660Ojc;
import X.C723600SZy;
import X.C737030Svd;
import X.EnumC323450Cm7;
import X.EnumC452301pR;
import X.InterfaceC0148002o;
import X.InterfaceC1361890lXn;
import X.InterfaceC1364105Vn;
import Y.ARunnableS112S0100000_12;
import android.text.TextUtils;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.explore.ExploreFeedParams;
import com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride;
import com.ss.android.ugc.aweme.explore.data.ExploreTopBannerData;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import com.ss.android.ugc.aweme.explore.monitor.ff.ExploreCustomFeedColdBootManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS145S1100000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS43S0010000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes32.dex */
public class ExploreTopicGeneralFeedListViewModel extends AssemListViewModel<C15SN, C20526015Tm, C1263204ww> {
    public static final /* synthetic */ int LLLF = 0;
    public ExploreFeedParams LL;
    public Long LLILLJJLI;
    public boolean LLILZ;
    public ExploreTopBannerData LLILZIL;
    public ExploreFeedRequestOverride LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJJIII;
    public volatile int LLJJIJIIJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public AbstractC316870CbV<C1263204ww> LLJL;
    public int LLJLIL;
    public AnonymousClass0956 LLJLL;
    public AnonymousClass0956 LLJZ;
    public C1DFK LLL;
    public List<String> LLILLL = C13BV.INSTANCE;
    public final C01GW LLJILLL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS221S0000000_31.get$arr$(177));
    public final C20522415Sc LLJJ = new C20522415Sc();
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723600SZy(this, C15T7.class, null), true);
    public AbstractC1623806Xk<C626160OhC> LLJJIJI = C491101vh.LIZ;
    public boolean LLJJIJIL = true;
    public final C15TZ LLJJJ = new C15TZ();
    public final C09YA LLJJJIL = new C09YA(this, new AwS575S0100000_31(this, 636));
    public final C15TH LLJJJJLIIL = C15TH.COLD_OPEN;
    public final C15TH LLJJL = C15TH.REFRESH;
    public final AtomicBoolean LLJJLIIIJLLLLLLLZ = new AtomicBoolean(false);
    public final Set<String> LLJLILLLLZIIL = new LinkedHashSet();
    public final boolean LLJLLIL = true;
    public final AtomicBoolean LLJLLL = new AtomicBoolean(false);
    public final C1841870y1x LLJZIJLIL = new C1841870y1x(0);

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: EQ2, reason: merged with bridge method [inline-methods] */
    public Object onLoadMore(C1263204ww c1263204ww, InterfaceC1364105Vn<? super AbstractC316870CbV<C1263204ww>> interfaceC1364105Vn) {
        return FQ2(this, interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1263204ww>> interfaceC1364105Vn) {
        return GQ2(this, interfaceC1364105Vn);
    }

    public final C15T7 AQ2() {
        return (C15T7) this.LLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C15SN(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C15V2 c15v2;
        ExploreCustomFeedColdBootManager exploreCustomFeedColdBootManager = ExploreCustomFeedColdBootManager.LIZ;
        C15T7 c15t7AQ2 = AQ2();
        Long l = (c15t7AQ2 == null || (c15v2 = c15t7AQ2.LL) == null) ? null : c15v2.LIZIZ;
        exploreCustomFeedColdBootManager.getClass();
        if (l != null && l.longValue() != 0 && l != null) {
            l.longValue();
            C19719512Dh.LIZJ(ExploreCustomFeedColdBootManager.LIZIZ).remove(l);
        }
        super.onCleared();
        this.LLJZIJLIL.LLILLJJLI.LIZIZ(null);
        C622680Oba.LIZLLL(this);
    }

    public final C15VE xm() {
        return (C15VE) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C2153908cD c2153908cD = C2153908cD.LIZ;
        if (C0C1X.LIZ.enable) {
            C2487409ou.LIZLLL(500L, new ARunnableS112S0100000_12(this, 175));
        } else {
            C622680Oba.LIZJ(this);
        }
    }

    public C15TH BQ2() {
        return this.LLJJJJLIIL;
    }

    public C15TH CQ2() {
        return this.LLJJL;
    }

    public boolean zQ2() {
        return this.LLJLLIL;
    }

    public final void DQ2(List<C20526015Tm> list) {
        C20526015Tm next;
        String str = this.LLJILJIL;
        if (str == null) {
            return;
        }
        Iterator<C20526015Tm> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LL.getAid(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C20526015Tm c20526015Tm = next;
        if (c20526015Tm != null) {
            c20526015Tm.LLJJIII = true;
        }
        this.LLJILJIL = null;
    }

    public final void MQ2(boolean z) {
        setState(new AwS43S0010000_31(z, 4));
    }

    public final void NQ2(String str) {
        AnonymousClass0956 anonymousClass0956 = this.LLJZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJZ = null;
        this.LLJLILLLLZIIL.clear();
        withState(new AwS145S1100000_31(this, str, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r0.isEmpty() == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean PQ2(long r25) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel.PQ2(long):boolean");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C20526015Tm> c627660Ojc) {
        setState(new AwS610S0100000_31(c627660Ojc, (C627660Ojc<C150D>) 189));
    }

    @C14EU
    public final void onDeleteAwemeEvent(C1210880hcE c1210880hcE) {
        withState(new AwS397S0200000_31(this, c1210880hcE, 50));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        String string;
        try {
            if (TextUtils.equals("videoReportSuccess", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName")) && (string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "object_id")) != null && string.length() != 0) {
                withState(new AwS145S1100000_31(this, string, 7));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        String str;
        String str2;
        int i = c737030Svd.LIZ;
        if (i != 2) {
            if (i == 13) {
                Object obj = c737030Svd.LIZIZ;
                if ((obj instanceof String) && (str2 = (String) obj) != null && str2.length() != 0) {
                    withState(new AwS145S1100000_31(this, str2, 5));
                    return;
                }
                return;
            }
            return;
        }
        Object obj2 = c737030Svd.LIZIZ;
        if ((obj2 instanceof String) && (str = (String) obj2) != null && str.length() != 0) {
            withState(new AwS145S1100000_31(this, str, 7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(com.ss.android.ugc.aweme.explore.ExploreLynxParams r6) {
        /*
            r5 = this;
            java.lang.Long r0 = r6.lynxJumpInterestId
            r5.LLILLJJLI = r0
            java.util.List<java.lang.String> r1 = r6.lynxJumpAwemeIds
            r2 = 1
            if (r1 == 0) goto L50
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r0 = r0.toString()
            r3.add(r0)
            goto L18
        L30:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L39:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r1 = r3.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L39
            r4.add(r1)
            goto L39
        L50:
            X.13BV r4 = X.C13BV.INSTANCE
        L52:
            r5.LLILLL = r4
            java.lang.String r0 = r6.lynxJumpInterestName
            r5.LLIZ = r0
            java.lang.String r0 = r6.enterMethod
            r5.LLIZLLLIL = r0
            java.lang.String r0 = r6.subEnterMethod
            r5.LLJ = r0
            java.lang.String r0 = r6.specialShapedCardTriggerType
            r5.LLJI = r0
            java.lang.String r0 = r6.requestId
            r5.LLJIJIL = r0
            java.lang.String r0 = r6.groupId
            r5.LLJILJIL = r0
            java.lang.Long r1 = r6.lynxJumpInterestId
            if (r1 == 0) goto L87
            X.15T7 r0 = r5.AQ2()
            if (r0 == 0) goto L85
            X.15V2 r0 = r0.LL
            if (r0 == 0) goto L85
            java.lang.Long r0 = r0.LIZIZ
        L7c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L87
        L82:
            r5.LLILZ = r2
            return
        L85:
            r0 = 0
            goto L7c
        L87:
            r2 = 0
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel.vQ2(com.ss.android.ugc.aweme.explore.ExploreLynxParams):void");
    }

    public final List<Aweme> yQ2(List<Aweme> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            if (aweme.getAid() == null || (!this.LLJLILLLLZIIL.contains(r1))) {
                arrayList.add(aweme);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.LLJLILLLLZIIL.add(((Aweme) it2.next()).getAid());
        }
        return new ArrayList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object FQ2(com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C1846480y9O
            if (r0 == 0) goto L7d
            r2 = r8
            X.0y9O r2 = (X.C1846480y9O) r2
            int r3 = r2.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L7d
            int r3 = r3 - r1
            r2.LLILZ = r3
        L12:
            java.lang.Object r1 = r2.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r2.LLILZ
            r6 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L29
            if (r0 == r5) goto L8f
            if (r0 == r4) goto L8b
            if (r0 != r6) goto L83
            X.C155000ia.LIZIZ(r1)
        L28:
            return r1
        L29:
            X.C155000ia.LIZIZ(r1)
            X.15TZ r0 = r7.LLJJJ
            java.util.concurrent.atomic.AtomicReference<X.0quz> r0 = r0.LIZ
            java.lang.Object r1 = r0.get()
            X.0quz r0 = X.EnumC1568470quz.CHUNK_PROCESSING
            if (r1 == r0) goto L44
            X.15TZ r0 = r7.LLJJJ
            java.util.concurrent.atomic.AtomicReference<X.0quz> r0 = r0.LIZ
            java.lang.Object r1 = r0.get()
            X.0quz r0 = X.EnumC1568470quz.CHUNK_INIT
            if (r1 != r0) goto L67
        L44:
            X.0956 r0 = r7.LLJLL
            if (r0 == 0) goto L67
            boolean r0 = r0.isActive()
            if (r0 != r5) goto L67
            X.0956 r0 = r7.LLJLL
            if (r0 == 0) goto L94
            boolean r0 = r0.isActive()
            if (r0 != r5) goto L94
            X.0956 r0 = r7.LLJLL
            if (r0 == 0) goto L94
            r2.LL = r7
            r2.LLILZ = r5
            java.lang.Object r0 = r0.LJJZ(r2)
            if (r0 != r3) goto L94
            return r3
        L67:
            int r0 = r7.LLJLIL
            if (r0 != 0) goto L72
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            X.0Cb8 r0 = X.C317290CcB.LIZIZ(r0)
            return r0
        L72:
            X.15TH r0 = X.C15TH.LOAD_MORE
            r2.LLILZ = r6
            java.lang.Object r1 = r7.wQ2(r0, r2)
            if (r1 != r3) goto L28
            return r3
        L7d:
            X.0y9O r2 = new X.0y9O
            r2.<init>(r7, r8)
            goto L12
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8b:
            X.C155000ia.LIZIZ(r1)
            return r1
        L8f:
            com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel r7 = r2.LL
            X.C155000ia.LIZIZ(r1)
        L94:
            int r0 = r7.LLJLIL
            if (r0 != 0) goto L9f
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            X.0Cb8 r1 = X.C317290CcB.LIZIZ(r0)
        L9e:
            return r1
        L9f:
            X.15TH r1 = X.C15TH.LOAD_MORE
            r0 = 0
            r2.LL = r0
            r2.LLILZ = r4
            java.lang.Object r1 = r7.wQ2(r1, r2)
            if (r1 != r3) goto L9e
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel.FQ2(com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object GQ2(com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel r6, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1263204ww>> r7) {
        /*
            boolean r0 = r7 instanceof X.C1890570zIV
            if (r0 == 0) goto L4c
            r3 = r7
            X.0zIV r3 = (X.C1890570zIV) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L12:
            java.lang.Object r5 = r3.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZIL
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L79
            X.15TH r4 = r3.LLILLJJLI
            com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel r6 = r3.LL
            X.C155000ia.LIZIZ(r5)
        L26:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.LLJLLL
            boolean r0 = r0.get()
            if (r0 == 0) goto L52
            return r5
        L2f:
            X.C155000ia.LIZIZ(r5)
            boolean r0 = r6.LLJJJJ
            if (r0 == 0) goto L47
            X.15TH r4 = r6.BQ2()
        L3a:
            r3.LL = r6
            r3.LLILLJJLI = r4
            r3.LLILZIL = r1
            java.lang.Object r5 = r6.wQ2(r4, r3)
            if (r5 != r2) goto L26
            return r2
        L47:
            X.15TH r4 = r6.CQ2()
            goto L3a
        L4c:
            X.0zIV r3 = new X.0zIV
            r3.<init>(r6, r7)
            goto L12
        L52:
            X.15TZ r0 = r6.LLJJJ
            java.util.concurrent.atomic.AtomicReference<X.0quz> r0 = r0.LIZ
            java.lang.Object r1 = r0.get()
            X.0quz r0 = X.EnumC1568470quz.CHUNK_COMPLETE
            if (r1 == r0) goto L78
            X.0956 r0 = r6.LLJLL
            r3 = 0
            if (r0 == 0) goto L66
            r0.LIZIZ(r3)
        L66:
            r6.LLJLL = r3
            X.01wk r2 = r6.getAssemVMScope()
            X.0zIU r1 = new X.0zIU
            r1.<init>(r6, r4, r3)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            r6.LLJLL = r0
        L78:
            return r5
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel.GQ2(com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void HQ2(com.ss.android.ugc.aweme.explore.ExploreFeedParams r11, com.ss.android.ugc.aweme.explore.ExploreLynxParams r12) {
        /*
            r10 = this;
            r2 = 1
            r10.LLJJIII = r2
            r10.LL = r11
            r3 = 0
            r10.LLILZLL = r3
            java.lang.Long r1 = r12.lynxJumpInterestId
            if (r1 == 0) goto L54
            X.15T7 r0 = r10.AQ2()
            if (r0 == 0) goto L52
            X.15V2 r0 = r0.LL
            if (r0 == 0) goto L52
            java.lang.Long r0 = r0.LIZIZ
        L18:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L54
        L1e:
            r10.LLILZ = r2
            java.lang.Long r5 = r12.lynxJumpInterestId
            if (r5 == 0) goto L85
            boolean r4 = r12.lynxIsPinTopic
            java.util.List<java.lang.String> r6 = r12.lynxJumpAwemeIds
            java.lang.Long r7 = r10.LLILLJJLI
            java.util.List<java.lang.String> r8 = r10.LLILLL
            X.15T7 r0 = r10.AQ2()
            if (r0 == 0) goto L50
            X.15V2 r0 = r0.LL
            if (r0 == 0) goto L50
            java.lang.Long r9 = r0.LIZIZ
        L38:
            X.0gFe r4 = X.C1158460gFg.LIZ(r4, r5, r6, r7, r8, r9)
            X.0gFf r0 = X.C1158450gFf.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L56
            java.lang.String r0 = r12.groupId
            if (r0 == 0) goto L4f
            r10.vQ2(r12)
            java.lang.String r0 = r12.groupId
            r10.LLJILJILJ = r0
        L4f:
            return
        L50:
            r9 = r3
            goto L38
        L52:
            r0 = r3
            goto L18
        L54:
            r2 = 0
            goto L1e
        L56:
            boolean r0 = r4 instanceof X.C1158430gFd
            r2 = 3
            if (r0 == 0) goto L68
            X.01wk r1 = r10.getAssemVMScope()
            X.15Sq r0 = new X.15Sq
            r0.<init>(r10, r4, r12, r3)
            X.C23250099c.LIZLLL(r1, r3, r3, r0, r2)
            return
        L68:
            boolean r0 = r4 instanceof X.C1158420gFc
            if (r0 == 0) goto L7f
            X.0gFc r4 = (X.C1158420gFc) r4
            com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride r0 = r4.LIZIZ
            r10.LLILZLL = r0
            X.01wk r1 = r10.getAssemVMScope()
            X.0y9C r0 = new X.0y9C
            r0.<init>(r10, r12, r3)
            X.C23250099c.LIZLLL(r1, r3, r3, r0, r2)
            return
        L7f:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L85:
            r10.LLIZ = r3
            r10.LLIZLLLIL = r3
            r10.LLJ = r3
            r10.LLJI = r3
            r10.LLJILJIL = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel.HQ2(com.ss.android.ugc.aweme.explore.ExploreFeedParams, com.ss.android.ugc.aweme.explore.ExploreLynxParams):void");
    }

    public final void JQ2(List<Aweme> list, C15TH c15th) {
        UrlModel cover;
        boolean z;
        if (!C20530215Vc.LIZIZ() && list != null) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : list) {
                Video video = aweme.getVideo();
                if (video != null && (cover = video.getCover()) != null) {
                    String aid = aweme.getAid();
                    ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(cover);
                    if (c15th != C15TH.COLD_OPEN && c15th != C15TH.REFRESH) {
                        z = false;
                    } else {
                        z = true;
                    }
                    arrayList.add(new C20530015Va(aid, imageUrlModelLIZ, aweme, z, 8));
                }
            }
            if (!arrayList.isEmpty()) {
                xm().LIZIZ();
                xm().LJFF(arrayList);
                xm().LJ(0);
                xm().LJI(-1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LQ2(java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r4, X.C15TH r5) {
        /*
            r3 = this;
            r0 = 112(0x70, float:1.57E-43)
            kotlin.jvm.internal.AFwS276S0000000_31 r0 = kotlin.jvm.internal.AFwS276S0000000_31.get$arr$(r0)
            r3.setState(r0)
            r1 = 1
            r2 = 0
            if (r4 == 0) goto L13
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L5b
        L13:
            X.002o r0 = r3.getState()
            X.15SN r0 = (X.C15SN) r0
            r0.getClass()
            java.util.List r0 = X.C627260Oiy.LIZ(r0)
            if (r0 == 0) goto L37
            X.002o r0 = r3.getState()
            X.15SN r0 = (X.C15SN) r0
            r0.getClass()
            java.util.List r0 = X.C627260Oiy.LIZ(r0)
            if (r0 == 0) goto L5b
            boolean r0 = r0.isEmpty()
            if (r0 != r1) goto L5b
        L37:
            X.002o r0 = r3.getState()
            X.15SN r0 = (X.C15SN) r0
            r0.getClass()
            java.util.List r0 = X.C627260Oiy.LIZ(r0)
            if (r0 == 0) goto L5b
            r0 = 113(0x71, float:1.58E-43)
            kotlin.jvm.internal.AFwS276S0000000_31 r0 = kotlin.jvm.internal.AFwS276S0000000_31.get$arr$(r0)
            r3.setState(r0)
            boolean r0 = r3.LLJJJJ
            if (r0 == 0) goto L5a
            r3.LLJJJJ = r2
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.LLJJLIIIJLLLLLLLZ
            r0.set(r2)
        L5a:
            return r1
        L5b:
            boolean r0 = X.C0BK2.LIZ()
            if (r0 == 0) goto L94
            X.15TH r0 = X.C15TH.REFRESH
            if (r5 == r0) goto L6d
            X.15TH r0 = X.C15TH.COLD_OPEN
            if (r5 == r0) goto L6d
            X.15TH r0 = X.C15TH.INSERT_CARD
            if (r5 != r0) goto L94
        L6d:
            if (r4 == 0) goto L75
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L94
        L75:
            X.002o r0 = r3.getState()
            X.15SN r0 = (X.C15SN) r0
            r0.getClass()
            java.util.List r0 = X.C627260Oiy.LIZ(r0)
            if (r0 == 0) goto L94
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L94
            r0 = 114(0x72, float:1.6E-43)
            kotlin.jvm.internal.AFwS276S0000000_31 r0 = kotlin.jvm.internal.AFwS276S0000000_31.get$arr$(r0)
            r3.setState(r0)
            return r1
        L94:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel.LQ2(java.util.List, X.15TH):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:54:0x00b6, B:55:0x00b9, B:56:0x00bb, B:58:0x00cb, B:59:0x00cd, B:61:0x00d1, B:87:0x0135, B:89:0x0148, B:91:0x0159, B:93:0x0167, B:95:0x016e, B:96:0x0170, B:98:0x0174, B:66:0x00da, B:67:0x00dc, B:69:0x00e0, B:71:0x00e4, B:72:0x00f3, B:74:0x00f9, B:75:0x010b, B:76:0x0114, B:78:0x011a, B:84:0x012d, B:86:0x0133, B:85:0x0131, B:15:0x0036, B:17:0x003e, B:19:0x0042, B:20:0x0044, B:22:0x0048, B:23:0x0051, B:29:0x005e, B:31:0x0062, B:37:0x006e, B:39:0x0072, B:41:0x007b, B:43:0x0081, B:49:0x008f, B:50:0x009d, B:51:0x00ab), top: B:109:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0131 A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:54:0x00b6, B:55:0x00b9, B:56:0x00bb, B:58:0x00cb, B:59:0x00cd, B:61:0x00d1, B:87:0x0135, B:89:0x0148, B:91:0x0159, B:93:0x0167, B:95:0x016e, B:96:0x0170, B:98:0x0174, B:66:0x00da, B:67:0x00dc, B:69:0x00e0, B:71:0x00e4, B:72:0x00f3, B:74:0x00f9, B:75:0x010b, B:76:0x0114, B:78:0x011a, B:84:0x012d, B:86:0x0133, B:85:0x0131, B:15:0x0036, B:17:0x003e, B:19:0x0042, B:20:0x0044, B:22:0x0048, B:23:0x0051, B:29:0x005e, B:31:0x0062, B:37:0x006e, B:39:0x0072, B:41:0x007b, B:43:0x0081, B:49:0x008f, B:50:0x009d, B:51:0x00ab), top: B:109:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0148 A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:54:0x00b6, B:55:0x00b9, B:56:0x00bb, B:58:0x00cb, B:59:0x00cd, B:61:0x00d1, B:87:0x0135, B:89:0x0148, B:91:0x0159, B:93:0x0167, B:95:0x016e, B:96:0x0170, B:98:0x0174, B:66:0x00da, B:67:0x00dc, B:69:0x00e0, B:71:0x00e4, B:72:0x00f3, B:74:0x00f9, B:75:0x010b, B:76:0x0114, B:78:0x011a, B:84:0x012d, B:86:0x0133, B:85:0x0131, B:15:0x0036, B:17:0x003e, B:19:0x0042, B:20:0x0044, B:22:0x0048, B:23:0x0051, B:29:0x005e, B:31:0x0062, B:37:0x006e, B:39:0x0072, B:41:0x007b, B:43:0x0081, B:49:0x008f, B:50:0x009d, B:51:0x00ab), top: B:109:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:54:0x00b6, B:55:0x00b9, B:56:0x00bb, B:58:0x00cb, B:59:0x00cd, B:61:0x00d1, B:87:0x0135, B:89:0x0148, B:91:0x0159, B:93:0x0167, B:95:0x016e, B:96:0x0170, B:98:0x0174, B:66:0x00da, B:67:0x00dc, B:69:0x00e0, B:71:0x00e4, B:72:0x00f3, B:74:0x00f9, B:75:0x010b, B:76:0x0114, B:78:0x011a, B:84:0x012d, B:86:0x0133, B:85:0x0131, B:15:0x0036, B:17:0x003e, B:19:0x0042, B:20:0x0044, B:22:0x0048, B:23:0x0051, B:29:0x005e, B:31:0x0062, B:37:0x006e, B:39:0x0072, B:41:0x007b, B:43:0x0081, B:49:0x008f, B:50:0x009d, B:51:0x00ab), top: B:109:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0174 A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:54:0x00b6, B:55:0x00b9, B:56:0x00bb, B:58:0x00cb, B:59:0x00cd, B:61:0x00d1, B:87:0x0135, B:89:0x0148, B:91:0x0159, B:93:0x0167, B:95:0x016e, B:96:0x0170, B:98:0x0174, B:66:0x00da, B:67:0x00dc, B:69:0x00e0, B:71:0x00e4, B:72:0x00f3, B:74:0x00f9, B:75:0x010b, B:76:0x0114, B:78:0x011a, B:84:0x012d, B:86:0x0133, B:85:0x0131, B:15:0x0036, B:17:0x003e, B:19:0x0042, B:20:0x0044, B:22:0x0048, B:23:0x0051, B:29:0x005e, B:31:0x0062, B:37:0x006e, B:39:0x0072, B:41:0x007b, B:43:0x0081, B:49:0x008f, B:50:0x009d, B:51:0x00ab), top: B:109:0x001d }] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.C15TH r10, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1263204ww>> r11) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel.wQ2(X.15TH, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.C15TH r21, X.InterfaceC1364105Vn<? super kotlin.Pair<com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse, com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride>> r22) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel.xQ2(X.15TH, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection, java.util.List, java.util.List<X.15Tm>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r38v0, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C20526015Tm> IQ2(com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse r39, X.C15TH r40, com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride r41) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel.IQ2(com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse, X.15TH, com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride):java.util.List");
    }

    public final void KQ2(ExploreTopicAwemeListResponse exploreTopicAwemeListResponse, C15TH c15th, ExploreFeedRequestOverride exploreFeedRequestOverride) {
        UrlModel cover;
        boolean z;
        if (exploreTopicAwemeListResponse != null) {
            exploreTopicAwemeListResponse.items = yQ2(exploreTopicAwemeListResponse.items);
            if (this.LLJJLIIIJLLLLLLLZ.get()) {
                List<Aweme> list = exploreTopicAwemeListResponse.items;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Aweme aweme : list) {
                        Video video = aweme.getVideo();
                        if (video != null && (cover = video.getCover()) != null) {
                            String aid = aweme.getAid();
                            ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(cover);
                            if (c15th != C15TH.COLD_OPEN && c15th != C15TH.REFRESH) {
                                z = false;
                            } else {
                                z = true;
                            }
                            arrayList.add(new C20530015Va(aid, imageUrlModelLIZ, aweme, z, 8));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        xm().LIZ(arrayList, true);
                    }
                }
                withState(new AwS126S0400000_31(this, exploreTopicAwemeListResponse, c15th, exploreFeedRequestOverride, 13));
                C2153908cD c2153908cD = C2153908cD.LIZ;
                AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(exploreTopicAwemeListResponse, 635);
                c2153908cD.getClass();
                C2153908cD.LIZIZ("topic_general_list_vm", awS575S0100000_31);
            }
        } else {
            C2153908cD c2153908cD2 = C2153908cD.LIZ;
            AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(178);
            c2153908cD2.getClass();
            C2153908cD.LIZ("topic_general_list_vm", aFwS221S0000000_31);
            this.LLJJLIIIJLLLLLLLZ.set(false);
        }
        this.LLJJIJIL = true;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final List<C20526015Tm> onLoadPageAddData(EnumC323450Cm7 enumC323450Cm7, List<C20526015Tm> list, List<C20526015Tm> list2) {
        List<C20526015Tm> listOnLoadPageAddData = super.onLoadPageAddData(enumC323450Cm7, list, list2);
        if (enumC323450Cm7 == EnumC323450Cm7.Refresh && list2.isEmpty() && (this.LLJL instanceof C316650Cb9)) {
            return new ArrayList(list);
        }
        return listOnLoadPageAddData;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void QQ2(List<C20526015Tm> list, C15TI c15ti, boolean z, boolean z2) {
        HashSet hashSetLLIFFJFJJ;
        C15TH c15th;
        Long l;
        ?? ZQ2;
        Long l2;
        C15V2 c15v2;
        C15V2 c15v22;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C20526015Tm> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LL);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (C20526015Tm c20526015Tm : list) {
            c20526015Tm.LLIZ = true;
            c20526015Tm.LLILZLL = c15ti.getValue();
        }
        List<String> list2 = this.LLILLL;
        if (!list2.isEmpty()) {
            hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(list2);
        } else {
            hashSetLLIFFJFJJ = null;
        }
        C15TE.LIZ(list, hashSetLLIFFJFJJ, this.LLILLJJLI, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, null);
        DQ2(list);
        List<Aweme> listYQ2 = yQ2(arrayList2);
        if (listYQ2 != null && !listYQ2.isEmpty()) {
            int i = C15TG.LIZIZ[c15ti.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    c15th = C15TH.COLD_OPEN;
                } else {
                    c15th = C15TH.INSERT_CARD;
                }
            } else {
                c15th = C15TH.SERVER_UG;
            }
            ExploreCustomFeedColdBootManager exploreCustomFeedColdBootManager = ExploreCustomFeedColdBootManager.LIZ;
            C15T7 c15t7AQ2 = AQ2();
            if (c15t7AQ2 != null && (c15v22 = c15t7AQ2.LL) != null) {
                l = c15v22.LIZIZ;
            } else {
                l = null;
            }
            int value = c15th.getValue();
            exploreCustomFeedColdBootManager.getClass();
            ExploreCustomFeedColdBootManager.LIZIZ(value, l);
            if (C1158470gFh.LIZ()) {
                if (z2 && zQ2()) {
                    ZQ2 = 1;
                } else {
                    ZQ2 = 0;
                }
            } else {
                ZQ2 = zQ2();
            }
            if (C1158470gFh.LIZ()) {
                this.LLJLIL = ZQ2;
            }
            C1623606Xi c1623606Xi = new C1623606Xi(new C626160OhC(false, ZQ2));
            C491101vh c491101vh = C491101vh.LIZ;
            C627660Ojc c627660Ojc = new C627660Ojc(c1623606Xi, c491101vh, c491101vh, list);
            C15T7 c15t7AQ22 = AQ2();
            if (c15t7AQ22 != null && (c15v2 = c15t7AQ22.LL) != null) {
                l2 = c15v2.LIZIZ;
            } else {
                l2 = null;
            }
            ExploreCustomFeedColdBootManager.LIZJ(l2);
            newState(c627660Ojc);
            InterfaceC1361890lXn<C1263204ww> operator = getConfig().getOperator();
            EnumC323450Cm7 enumC323450Cm7 = EnumC323450Cm7.Refresh;
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            C1263204ww c1263204ww = new C1263204ww(list.size());
            c317290CcB.getClass();
            operator.LIZJ(enumC323450Cm7, new C323380Cm0(null, c1263204ww, list), true);
            JQ2(listYQ2, C15TH.COLD_OPEN);
            if (z) {
                AssemSingleListViewModel.manualListLoadMore$default(this, null, 1, null);
                return;
            }
            return;
        }
        NQ2("init");
    }
}
