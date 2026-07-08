package com.ss.android.ugc.aweme.explore.vm;

import X.AbstractC1623806Xk;
import X.AbstractC316870CbV;
import X.AnonymousClass0956;
import X.C01GW;
import X.C07CF;
import X.C07MS;
import X.C099R;
import X.C09YA;
import X.C0AZB;
import X.C0NJK;
import X.C1204000hR8;
import X.C1210880hcE;
import X.C1263204ww;
import X.C128Y;
import X.C1335180kqi;
import X.C13BV;
import X.C13LP;
import X.C14EU;
import X.C150D;
import X.C15438062q;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1584500rKq;
import X.C1593510rZN;
import X.C15SM;
import X.C15T5;
import X.C15T6;
import X.C15T7;
import X.C15T8;
import X.C15TA;
import X.C15TI;
import X.C15TM;
import X.C15VC;
import X.C15VE;
import X.C15WT;
import X.C1623606Xi;
import X.C1697810uHb;
import X.C1841760y1m;
import X.C1841840y1u;
import X.C1841850y1v;
import X.C1841870y1x;
import X.C1868410yil;
import X.C1910420zoW;
import X.C19EG;
import X.C1DFK;
import X.C2043407zU;
import X.C20521215Rq;
import X.C20523415Sm;
import X.C20523715Sp;
import X.C20524115St;
import X.C20524315Sv;
import X.C20524515Sx;
import X.C20524715Sz;
import X.C20525915Tl;
import X.C20526015Tm;
import X.C20529615Uw;
import X.C20530015Va;
import X.C20530215Vc;
import X.C20532415Vy;
import X.C20532515Vz;
import X.C2153908cD;
import X.C23250099c;
import X.C2487409ou;
import X.C278080Av8;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C323380Cm0;
import X.C438710HIf;
import X.C452501pT;
import X.C484220Iyq;
import X.C491101vh;
import X.C591510NHx;
import X.C622680Oba;
import X.C626160OhC;
import X.C627660Ojc;
import X.C720360SNm;
import X.C723600SZy;
import X.C737030Svd;
import X.C823050WQl;
import X.EnumC1593290rZ1;
import X.EnumC1782540wUG;
import X.EnumC1910400zoU;
import X.EnumC323450Cm7;
import X.EnumC452301pR;
import X.EnumC993440bxW;
import X.InterfaceC0148002o;
import X.InterfaceC1361890lXn;
import X.InterfaceC1364105Vn;
import X.InterfaceC1589760rTK;
import X.InterfaceC1841670y1d;
import X.InterfaceC20236714Gf;
import X.InterfaceC665370Q7z;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS1S0102000_3;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.explore.ExploreFeedParams;
import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreCardInsertResultStruct;
import com.ss.android.ugc.aweme.explore.data.ExploreChatGroupStruct;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicStruct;
import com.ss.android.ugc.aweme.explore.data.ExploreDataLruPool;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource;
import com.ss.android.ugc.aweme.explore.experiment.ExploreFirstPreloadVideoConfig;
import com.ss.android.ugc.aweme.explore.monitor.cache.ExploreCacheMonitor;
import com.ss.android.ugc.aweme.explore.monitor.ff.ExploreColdBootMonitor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS114S1200000_31;
import kotlin.jvm.internal.AwS145S1100000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS43S0010000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS82S0210000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreFeedListViewModel extends AssemListViewModel<C15SM, C150D, C1263204ww> {
    public static String LLJZIJLIL = "other";
    public static String LLL = "";
    public static int LLLF;
    public C1DFK LLILLJJLI;
    public C1DFK LLILLL;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public AbstractC316870CbV<C1263204ww> LLIZ;
    public Aweme LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public ExploreFeedParams LLJIJIL;
    public volatile Long LLJILJIL;
    public ExploreFeedRequestOverride LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public AnonymousClass0956 LLJJJJ;
    public AnonymousClass0956 LLJJJJJIL;
    public volatile int LLJJJJLIIL;
    public boolean LLJLILLLLZIIL;
    public final C1841870y1x LL = new C1841870y1x(0);
    public final Set<String> LLILZ = new LinkedHashSet();
    public volatile List<String> LLJILJILJ = C13BV.INSTANCE;
    public final Set<String> LLJJJIL = new LinkedHashSet();
    public boolean LLJJL = true;
    public final AtomicBoolean LLJJLIIIJLLLLLLLZ = new AtomicBoolean(false);
    public final AtomicBoolean LLJL = new AtomicBoolean(false);
    public final CopyOnWriteArrayList<InterfaceC20236714Gf<AbstractC316870CbV<C1263204ww>>> LLJLIL = new CopyOnWriteArrayList<>();
    public final C01GW LLJLL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS221S0000000_31.get$arr$(175));
    public AbstractC1623806Xk<C626160OhC> LLJLLIL = C491101vh.LIZ;
    public final C09YA LLJLLL = new C09YA(this, AFwS221S0000000_31.get$arr$(173));
    public final C1559260qg8 LLJZ = new C1559260qg8(new C723600SZy(this, C15T7.class, null), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C15SM(0);
    }

    public final C15VE xm() {
        return (C15VE) this.LLJLL.getValue();
    }

    public final C15T7 zQ2() {
        return (C15T7) this.LLJZ.getValue();
    }

    public final void BQ2() {
        if (C07MS.LIZ() || C07CF.LIZ()) {
            C1DFK c1dfk = this.LLILLJJLI;
            if (c1dfk != null) {
                c1dfk.LJFF();
            }
            C1DFK c1dfk2 = this.LLILLJJLI;
            if (c1dfk2 != null) {
                c1dfk2.LJII(new AwS610S0100000_31(this, 185));
            }
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL.LLILLJJLI.LIZIZ(null);
        this.LLILZ.clear();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (!C1584500rKq.LIZ().enable) {
            C622680Oba.LIZJ(this);
        } else {
            C2487409ou.LIZLLL(C1584500rKq.LIZ().eventBusRegisterDelayMills, new ARunnableS112S0100000_12(this, 174));
        }
    }

    public static Object xQ2(InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC1841670y1d fetchInRAMJob;
        InterfaceC1841670y1d fetchInRAMJob2;
        if (C07MS.LIZ()) {
            ExploreCustomTopicDataSource.Companion.getClass();
            ExploreCustomTopicDataSource exploreCustomTopicDataSource = C1841760y1m.LIZ;
            if (exploreCustomTopicDataSource.getInitState() == C0NJK.LOADING && (fetchInRAMJob = exploreCustomTopicDataSource.getFetchInRAMJob()) != null && fetchInRAMJob.isActive() && (fetchInRAMJob2 = exploreCustomTopicDataSource.getFetchInRAMJob()) != null) {
                Object objLJJZ = fetchInRAMJob2.LJJZ(interfaceC1364105Vn);
                if (objLJJZ == C099R.LJFF()) {
                    return objLJJZ;
                }
                return Unit.LIZ;
            }
        }
        return Unit.LIZ;
    }

    public final void FQ2(ExploreLynxParams exploreLynxParams) {
        AnonymousClass0956 anonymousClass0956 = this.LLJJJJJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJJJJIL = C23250099c.LIZLLL(getAssemVMScope(), null, null, new C20523415Sm(exploreLynxParams, this, null), 3);
    }

    public final void GQ2(boolean z) {
        setState(new AwS43S0010000_31(z, 2));
    }

    public final void HQ2(String str) {
        AnonymousClass0956 anonymousClass0956 = this.LLJJJJJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJJJJIL = null;
        this.LLJJJIL.clear();
        this.LLILZLL = false;
        withState(new AwS145S1100000_31(this, str, 3));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C150D> c627660Ojc) {
        setState(new AwS610S0100000_31(c627660Ojc, (C627660Ojc<C150D>) 184));
    }

    @C14EU
    public final void onDeleteAwemeEvent(C1210880hcE c1210880hcE) {
        withState(new AwS397S0200000_31(this, c1210880hcE, 49));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        String string;
        try {
            if (TextUtils.equals("videoReportSuccess", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName")) && (string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "object_id")) != null && string.length() != 0) {
                withState(new C15T6(this, string));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1263204ww>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1842230y2X
            if (r0 == 0) goto L37
            r3 = r6
            X.0y2X r3 = (X.C1842230y2X) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r3.LLILLL
            r0 = 1
            if (r1 == 0) goto L2b
            if (r1 != r0) goto L70
            X.C155000ia.LIZIZ(r4)
        L22:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.LLJL
            boolean r0 = r0.get()
            if (r0 == 0) goto L3d
            return r4
        L2b:
            X.C155000ia.LIZIZ(r4)
            r3.LLILLL = r0
            java.lang.Object r4 = r5.yQ2(r0, r3)
            if (r4 != r2) goto L22
            return r2
        L37:
            X.0y2X r3 = new X.0y2X
            r3.<init>(r5, r6)
            goto L12
        L3d:
            java.util.concurrent.atomic.AtomicReference<X.0quu> r0 = X.C20524815Ta.LIZIZ
            java.lang.Object r1 = r0.get()
            X.0quu r0 = X.EnumC1568420quu.CHUNK_COMPLETE
            if (r1 == r0) goto L5f
            X.0956 r0 = r5.LLJJJJ
            r3 = 0
            if (r0 == 0) goto L4f
            r0.LIZIZ(r3)
        L4f:
            X.01wk r2 = r5.getAssemVMScope()
            X.0y2Z r1 = new X.0y2Z
            r1.<init>(r5, r3)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            r5.LLJJJJ = r0
        L5f:
            X.08cD r2 = X.C2153908cD.LIZ
            r0 = 112(0x70, float:1.57E-43)
            kotlin.jvm.internal.AFwS216S0000000_27 r1 = kotlin.jvm.internal.AFwS216S0000000_27.get$arr$(r0)
            r2.getClass()
            java.lang.String r0 = "explore_chunk_process_request"
            X.C2153908cD.LIZ(r0, r1)
            return r4
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        Aweme aweme;
        String aid;
        String str;
        Aweme aweme2;
        C128Y c128yKi;
        InterfaceC1589760rTK interfaceC1589760rTK;
        InterfaceC665370Q7z interfaceC665370Q7zAt;
        IMFPubAbility iMFPubAbility;
        C19EG c19eg;
        int i = c737030Svd.LIZ;
        if (i != 2) {
            if (i != 13) {
                if (i == 15) {
                    Object obj = c737030Svd.LIZIZ;
                    if ((obj instanceof Aweme) && (aweme2 = (Aweme) obj) != null && AwemeExtKt.isPhotoMode(aweme2) && C15WT.LIZIZ.LJIILL(c737030Svd.LJIIZILJ)) {
                        if (((Boolean) C0AZB.LIZ.getValue()).booleanValue() && C720360SNm.LJIIJJI(aweme2) && Intrinsics.LJFF(c737030Svd.LJIIZILJ.shootWay, "explore_quick_entrance")) {
                            String aid2 = aweme2.getAid();
                            if (aid2 != null && aid2.length() != 0) {
                                this.LLJJJIL.add(aid2);
                                withState(new AwS114S1200000_31(this, aweme2, aid2, 3));
                                return;
                            }
                            return;
                        }
                        this.LLIZLLLIL = aweme2;
                        C1593510rZN.LL.getClass();
                        if (!((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().isPublishing() && C1593510rZN.LIZ()) {
                            WeakReference<C19EG> weakReference = C1593510rZN.LLILLJJLI;
                            if (weakReference != null && (c19eg = weakReference.get()) != null) {
                                c128yKi = Hox.LLJILJIL.LIZ(c19eg).Ki("HOME");
                            } else {
                                c128yKi = null;
                            }
                            if ((c128yKi instanceof InterfaceC1589760rTK) && (interfaceC1589760rTK = (InterfaceC1589760rTK) c128yKi) != null && (interfaceC665370Q7zAt = interfaceC1589760rTK.at()) != null && (iMFPubAbility = (IMFPubAbility) C1558520qew.LIZ(interfaceC665370Q7zAt, IMFPubAbility.class, null)) != null) {
                                iMFPubAbility.gB1(1);
                            }
                        }
                        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme2);
                        HQ2("publish_landing");
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj2 = c737030Svd.LIZIZ;
            if ((obj2 instanceof String) && (str = (String) obj2) != null && str.length() != 0) {
                withState(new AwS145S1100000_31(this, str, 4));
                return;
            }
            return;
        }
        Object obj3 = c737030Svd.LIZIZ;
        if ((((obj3 instanceof String) && (aid = (String) obj3) != null) || ((obj3 instanceof Aweme) && (aweme = (Aweme) obj3) != null && (aid = aweme.getAid()) != null)) && aid.length() != 0) {
            withState(new C15T6(this, aid));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<C150D> wQ2(List<? extends C150D> list) {
        String aid;
        if (!C1335180kqi.LIZ() || this.LLILZLL) {
            return list;
        }
        this.LLILZLL = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (ArrayList) list) {
            C150D c150d = (C150D) obj;
            if ((c150d instanceof C20526015Tm) && (aid = ((C20526015Tm) c150d).LL.getAid()) != null && C15VC.LIZIZ.contains(aid)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.getFirst();
        Iterable iterable = (Iterable) pair.getSecond();
        if (list2.isEmpty()) {
            return list;
        }
        return C13LP.LJLIL(iterable, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: AQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1263204ww r11, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1263204ww>> r12) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel.onLoadMore(X.04ww, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r35v0, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    public final List<C150D> CQ2(ExploreAwemeList exploreAwemeList, boolean z) {
        boolean z2;
        boolean z3;
        HashSet hashSetLLIFFJFJJ;
        ?? arrayList;
        List<ExploreCardInsertResultStruct> list;
        Object next;
        List<C150D> listWQ2;
        boolean z4;
        if (z) {
            setState(new AwS610S0100000_31(exploreAwemeList, 186));
        }
        this.LLJJLIIIJLLLLLLLZ.set(exploreAwemeList.LL);
        ArrayList arrayList2 = new ArrayList();
        if (z && this.LLJJI != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<String> list2 = this.LLJILJILJ;
        if (z2 && (!list2.isEmpty())) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && list2 != null) {
            hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(list2);
        } else {
            hashSetLLIFFJFJJ = null;
        }
        Long l = this.LLJILJIL;
        if (!z2) {
            l = null;
        }
        String str = this.LLJJ;
        if (!z2) {
            str = null;
        }
        String str2 = this.LLJJI;
        if (!z2) {
            str2 = null;
        }
        String str3 = this.LLJJIII;
        if (!z2) {
            str3 = null;
        }
        String str4 = this.LLJJIJI;
        if (!z2) {
            str4 = null;
        }
        String str5 = this.LLJJIJIIJIL;
        if (!z2) {
            str5 = null;
        }
        String str6 = this.LLJJIJIL;
        if (z2) {
            if (str6 != null) {
                this.LLJJIJIL = null;
            }
        } else {
            str6 = null;
        }
        List<ExplorePostItem> list3 = exploreAwemeList.items;
        if (list3 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
            int i = 0;
            for (ExplorePostItem explorePostItem : list3) {
                int i2 = i + 1;
                if (i >= 0) {
                    ExplorePostItem explorePostItem2 = explorePostItem;
                    Aweme aweme = explorePostItem2.aweme;
                    if (aweme == null) {
                        aweme = new Aweme();
                    }
                    Aweme aweme2 = explorePostItem2.aweme;
                    if (aweme2 != null && aweme2.isLike()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    C20526015Tm c20526015Tm = new C20526015Tm(aweme, z4, exploreAwemeList.getRequestId(), exploreAwemeList.logPb, false, exploreAwemeList.LLILZ, exploreAwemeList.LLILZIL, exploreAwemeList.LLIZ, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 130448);
                    if (l != null) {
                        c20526015Tm.LLJIJIL = l;
                        c20526015Tm.LLJILJIL = str;
                        c20526015Tm.LLJJ = str4;
                    }
                    if (str2 != null && hashSetLLIFFJFJJ != null && hashSetLLIFFJFJJ.contains(c20526015Tm.LL.getAid())) {
                        c20526015Tm.LLJILJILJ = str2;
                        c20526015Tm.LLJILLL = str3;
                        c20526015Tm.LLJJI = str5;
                    }
                    if (str6 != null && Intrinsics.LJFF(str6, c20526015Tm.LL.getAid())) {
                        c20526015Tm.LLJJIII = true;
                    }
                    arrayList.add(c20526015Tm);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        arrayList2.addAll(arrayList);
        if (z && (listWQ2 = wQ2(arrayList2)) != arrayList2) {
            arrayList2.clear();
            arrayList2.addAll(listWQ2);
        }
        if (C07MS.LIZ() && z && ((this.LLJJLIIIJLLLLLLLZ.get() || exploreAwemeList.LLILZLL) && exploreAwemeList.LJ())) {
            ExploreCustomTopicDataSource.Companion.getClass();
            CopyOnWriteArrayList<ExploreCustomTopicResponse> topicRAMResponse = C1841760y1m.LIZ.getTopicRAMResponse();
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(topicRAMResponse, 10));
            Iterator<ExploreCustomTopicResponse> it2 = topicRAMResponse.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().topicId);
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList3);
            List<ExploreCardInsertResultStruct> list4 = exploreAwemeList.cards;
            if (list4 != null) {
                for (ExploreCardInsertResultStruct exploreCardInsertResultStruct : list4) {
                    Integer num = exploreCardInsertResultStruct.insertPosition;
                    if (num != null) {
                        num.intValue();
                        Long l2 = exploreCardInsertResultStruct.id;
                        if (l2 != null) {
                            l2.longValue();
                            Integer num2 = exploreCardInsertResultStruct.insertPosition;
                            if (num2 == null || num2.intValue() != -1) {
                                int iMax = Math.max(Math.min(Math.max(arrayList2.size() - 1, 0) + 1, exploreCardInsertResultStruct.insertPosition.intValue() - 1), 0);
                                ExploreCardInsertResultStruct.Companion.getClass();
                                List listLIZJ = C20529615Uw.LIZJ(exploreCardInsertResultStruct);
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj : listLIZJ) {
                                    if (!setLLIIJI.contains(((ExploreCustomTopicStruct) obj).topicId)) {
                                        arrayList4.add(obj);
                                    }
                                }
                                if (!arrayList4.isEmpty() && arrayList4.size() >= 4) {
                                    ListProtector.add(arrayList2, iMax, new C20525915Tl(arrayList4, exploreCardInsertResultStruct.id.longValue(), exploreAwemeList.LLILZIL, exploreAwemeList.getRequestId()));
                                }
                            }
                        }
                    }
                }
            }
        }
        if (C07CF.LIZ() && this.LLJJLIIIJLLLLLLLZ.get() && (list = exploreAwemeList.cards) != null) {
            for (ExploreCardInsertResultStruct exploreCardInsertResultStruct2 : list) {
                Integer num3 = exploreCardInsertResultStruct2.insertPosition;
                if (num3 != null) {
                    num3.intValue();
                    Long l3 = exploreCardInsertResultStruct2.id;
                    if (l3 != null) {
                        l3.longValue();
                        Integer num4 = exploreCardInsertResultStruct2.insertPosition;
                        if (num4 == null || num4.intValue() != -1) {
                            int iMax2 = Math.max(Math.min(Math.max(arrayList2.size() - 1, 0) + 1, exploreCardInsertResultStruct2.insertPosition.intValue() - 1), 0);
                            ExploreCardInsertResultStruct.Companion.getClass();
                            Iterator it3 = C20529615Uw.LIZIZ(exploreCardInsertResultStruct2).iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    if (((ExploreChatGroupStruct) next).groupId != null) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            ExploreChatGroupStruct exploreChatGroupStruct = (ExploreChatGroupStruct) next;
                            if (exploreChatGroupStruct != null) {
                                ListProtector.add(arrayList2, iMax2, new C15T5(exploreChatGroupStruct));
                            }
                        }
                    }
                }
            }
        }
        Integer num5 = exploreAwemeList.hasMore;
        if (num5 != null && num5.intValue() == 1) {
            this.LLIZ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, new C1263204ww(0L), arrayList2, 1);
            return arrayList2;
        }
        AbstractC316870CbV.LIZ.getClass();
        this.LLIZ = new C316640Cb8(arrayList2);
        return arrayList2;
    }

    public final void DQ2(ExploreAwemeList exploreAwemeList, boolean z) {
        List<ExplorePostItem> list;
        Video video;
        UrlModel cover;
        if (exploreAwemeList != null) {
            if (this.LLJJLIIIJLLLLLLLZ.get()) {
                if (!C20530215Vc.LIZIZ() && z && (list = exploreAwemeList.items) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (ExplorePostItem explorePostItem : list) {
                        Aweme aweme = explorePostItem.aweme;
                        if (aweme != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null) {
                            arrayList.add(new C20530015Va(explorePostItem.aweme.getAid(), C438710HIf.LIZ(cover), explorePostItem.aweme, z, 8));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        xm().LIZ(arrayList, true);
                    }
                }
                withState(new AwS82S0210000_31(exploreAwemeList, this, z, 2));
                C2153908cD c2153908cD = C2153908cD.LIZ;
                AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(exploreAwemeList, 633);
                c2153908cD.getClass();
                C2153908cD.LIZIZ("explore_chunk_process_request", awS575S0100000_31);
            }
        } else {
            C2153908cD c2153908cD2 = C2153908cD.LIZ;
            AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(176);
            c2153908cD2.getClass();
            C2153908cD.LIZ("explore_chunk_process_request", aFwS221S0000000_31);
            this.LLJJLIIIJLLLLLLLZ.set(false);
        }
        this.LLJJL = true;
    }

    public final boolean IQ2(int i, boolean z) {
        ExploreAwemeList exploreAwemeListLJFF;
        if (i == C15TI.FAKE_REFRESH.getValue()) {
            C20524315Sv.LL.getClass();
            exploreAwemeListLJFF = C20524315Sv.LIZ();
        } else if (i == C15TI.HOT_CACHE.getValue()) {
            C20524115St.LL.getClass();
            exploreAwemeListLJFF = C20524115St.LIZLLL();
        } else if (i == C15TI.PRELOAD.getValue()) {
            C15T8 c15t8 = C15T8.LL;
            c15t8.getClass();
            if ((!C20524515Sx.LIZ().enablePreload || (exploreAwemeListLJFF = ((ExploreDataLruPool) C20524715Sz.LIZ.getValue()).LJII()) == null) && (exploreAwemeListLJFF = c15t8.LJFF()) != null) {
                C15T8.LJIJI(c15t8, EnumC1782540wUG.USE_PRELOAD.getValue(), null, System.currentTimeMillis(), 2);
            }
        } else {
            exploreAwemeListLJFF = C15T8.LL.LJFF();
        }
        return JQ2(exploreAwemeListLJFF, i, null, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final void vQ2(Long l, ExploreLynxParams exploreLynxParams) {
        ?? arrayList;
        this.LLJILJIL = l;
        List<String> list = exploreLynxParams.lynxJumpAwemeIds;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a0.LJLIIIL(it2.next()).toString());
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        this.LLJILJILJ = arrayList;
        this.LLJJ = exploreLynxParams.lynxJumpInterestName;
        this.LLJJI = exploreLynxParams.enterMethod;
        this.LLJJIII = exploreLynxParams.subEnterMethod;
        this.LLJJIJI = exploreLynxParams.specialShapedCardTriggerType;
        this.LLJJIJIIJIL = exploreLynxParams.requestId;
        this.LLJJIJIL = exploreLynxParams.groupId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4 A[Catch: Exception -> 0x04a7, TryCatch #1 {Exception -> 0x04a7, blocks: (B:14:0x003a, B:18:0x004d, B:41:0x00b1, B:42:0x00b4, B:44:0x00c4, B:45:0x00c9, B:47:0x00cd, B:49:0x00d1, B:50:0x00d9, B:52:0x00e9, B:54:0x00ed, B:55:0x00fa, B:57:0x0100, B:59:0x010c, B:60:0x0110, B:62:0x0114, B:64:0x011a, B:65:0x011e, B:69:0x012b, B:72:0x013b, B:21:0x005a, B:25:0x0065, B:30:0x0079, B:32:0x0091, B:34:0x0095, B:36:0x00a0, B:38:0x00a4, B:74:0x014d, B:75:0x0152, B:77:0x0156, B:78:0x0158, B:87:0x017f), top: B:308:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0100 A[Catch: Exception -> 0x04a7, TryCatch #1 {Exception -> 0x04a7, blocks: (B:14:0x003a, B:18:0x004d, B:41:0x00b1, B:42:0x00b4, B:44:0x00c4, B:45:0x00c9, B:47:0x00cd, B:49:0x00d1, B:50:0x00d9, B:52:0x00e9, B:54:0x00ed, B:55:0x00fa, B:57:0x0100, B:59:0x010c, B:60:0x0110, B:62:0x0114, B:64:0x011a, B:65:0x011e, B:69:0x012b, B:72:0x013b, B:21:0x005a, B:25:0x0065, B:30:0x0079, B:32:0x0091, B:34:0x0095, B:36:0x00a0, B:38:0x00a4, B:74:0x014d, B:75:0x0152, B:77:0x0156, B:78:0x0158, B:87:0x017f), top: B:308:0x0027 }] */
    /* JADX WARN: Type inference failed for: r4v73, types: [X.15VE] */
    /* JADX WARN: Type inference failed for: r4v75, types: [X.15VE] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v16, types: [X.15Sv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v27, types: [X.15VE] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v13, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(boolean r24, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1263204ww>> r25) {
        /*
            Method dump skipped, instruction units count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel.yQ2(boolean, X.05Vn):java.lang.Object");
    }

    public final void EQ2(AwS610S0100000_31 awS610S0100000_31, Function1 function1, boolean z) {
        if (((Boolean) C278080Av8.LIZ.getValue()).booleanValue() && z) {
            function1.invoke(Boolean.TRUE);
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1841850y1v(this, awS610S0100000_31, null), 3);
        } else {
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1841840y1u(function1, this, awS610S0100000_31, null), 3);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final List<C150D> onLoadPageAddData(EnumC323450Cm7 enumC323450Cm7, List<? extends C150D> list, List<? extends C150D> list2) {
        List<C150D> listOnLoadPageAddData = super.onLoadPageAddData(enumC323450Cm7, list, list2);
        if (enumC323450Cm7 == EnumC323450Cm7.Refresh && list2.isEmpty() && (this.LLIZ instanceof C316650Cb9)) {
            return new ArrayList(list);
        }
        return listOnLoadPageAddData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean JQ2(ExploreAwemeList exploreAwemeList, int i, Function1<? super List<C20526015Tm>, Unit> function1, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        boolean z2;
        List<ExplorePostItem> list;
        Video video;
        UrlModel cover;
        C20521215Rq c20521215Rq;
        List<ExploreCardInsertResultStruct> list2;
        List listLLIIII;
        boolean z3;
        long jLongValue;
        ExploreCacheMonitor.INSTANCE.startReadCache(EnumC993440bxW.TYPE_NORMAL);
        if (exploreAwemeList != null) {
            List<ExplorePostItem> list3 = exploreAwemeList.items;
            boolean z4 = true;
            if (list3 != null && !list3.isEmpty()) {
                C20524315Sv.LL.getClass();
                ReentrantLock reentrantLock = C20524315Sv.LLILLJJLI;
                reentrantLock.lock();
                try {
                    List<ExploreCardInsertResultStruct> list4 = C20524315Sv.LLILZ;
                    if (list4 != null) {
                        arrayList = new ArrayList();
                        for (ExploreCardInsertResultStruct exploreCardInsertResultStruct : list4) {
                            long serverTimeMills = NetworkUtils.getServerTimeMills();
                            Long l = exploreCardInsertResultStruct.cardServerTimestamp;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = -1;
                            }
                            if (serverTimeMills - jLongValue < 86400000) {
                                arrayList.add(exploreCardInsertResultStruct);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    reentrantLock.unlock();
                    if (arrayList != null) {
                        arrayList2 = new ArrayList(arrayList);
                    } else {
                        arrayList2 = null;
                    }
                    exploreAwemeList.cards = arrayList2;
                    ExploreColdBootMonitor.INSTANCE.startRender();
                    if (C15TM.LIZ()) {
                        C2043407zU.LIZ();
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    List<ExplorePostItem> list5 = exploreAwemeList.items;
                    if (list5 != null && (listLLIIII = C13LP.LLIIII(list5)) != null) {
                        IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
                        Iterator it2 = listLLIIII.iterator();
                        while (it2.hasNext()) {
                            Aweme awemeLLILLL = ((ExplorePostItem) it2.next()).aweme;
                            if (!z) {
                                awemeLLILLL = iAwemeService.LLILLL(awemeLLILLL);
                            }
                            if (awemeLLILLL != null) {
                                boolean zIsLike = awemeLLILLL.isLike();
                                String requestId = exploreAwemeList.getRequestId();
                                LogPbBean logPbBean = exploreAwemeList.logPb;
                                if (i == C15TI.CACHE.getValue()) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                C20526015Tm c20526015Tm = new C20526015Tm(awemeLLILLL, zIsLike, requestId, logPbBean, z3, i, z4, 0L, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 130944);
                                arrayList3.add(c20526015Tm);
                                arrayList4.add(c20526015Tm);
                            }
                        }
                    }
                    if (function1 != null) {
                        function1.invoke(arrayList4);
                    }
                    if (((ExploreFirstPreloadVideoConfig) C1868410yil.LIZIZ.getValue()).isLoadDataEnable() && !arrayList4.isEmpty()) {
                        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(((C20526015Tm) it3.next()).LL);
                        }
                        C01GW c01gw = C1868410yil.LIZIZ;
                        int i2 = ((ExploreFirstPreloadVideoConfig) c01gw.getValue()).preloadVideoCount;
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        int i3 = ((ExploreFirstPreloadVideoConfig) c01gw.getValue()).preloadAudioSizeKBs;
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        Set<String> set = C591510NHx.LIZ;
                        if (!arrayList5.isEmpty() && i2 > 0) {
                            C823050WQl.LIZLLL().submit(new ARunnableS1S0102000_3(arrayList5, i2, i3, 2));
                        }
                    }
                    List<C150D> listWQ2 = wQ2(arrayList3);
                    if (listWQ2 != arrayList3) {
                        arrayList3.clear();
                        arrayList3.addAll(listWQ2);
                    }
                    if ((!arrayList3.isEmpty()) && (list2 = exploreAwemeList.cards) != null) {
                        for (ExploreCardInsertResultStruct exploreCardInsertResultStruct2 : list2) {
                            ExploreCustomTopicDataSource.Companion.getClass();
                            CopyOnWriteArrayList<ExploreCustomTopicResponse> topicRAMResponse = C1841760y1m.LIZ.getTopicRAMResponse();
                            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(topicRAMResponse, 10));
                            Iterator<ExploreCustomTopicResponse> it4 = topicRAMResponse.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(it4.next().topicId);
                            }
                            Set setLLIIJI = C13LP.LLIIJI(arrayList6);
                            Integer num = exploreCardInsertResultStruct2.insertPosition;
                            if (num != null) {
                                num.intValue();
                                Long l2 = exploreCardInsertResultStruct2.id;
                                if (l2 != null) {
                                    l2.longValue();
                                    Integer num2 = exploreCardInsertResultStruct2.insertPosition;
                                    if (num2 == null || num2.intValue() != -1) {
                                        int iMax = Math.max(Math.min(Math.max(arrayList3.size() - 1, 0) + 1, exploreCardInsertResultStruct2.insertPosition.intValue() - 1), 0);
                                        ExploreCardInsertResultStruct.Companion.getClass();
                                        List listLIZJ = C20529615Uw.LIZJ(exploreCardInsertResultStruct2);
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj : listLIZJ) {
                                            if (!setLLIIJI.contains(((ExploreCustomTopicStruct) obj).topicId)) {
                                                arrayList7.add(obj);
                                            }
                                        }
                                        if (!arrayList7.isEmpty() && arrayList7.size() >= 4 && C07MS.LIZ()) {
                                            ListProtector.add(arrayList3, iMax, new C20525915Tl(arrayList7, exploreCardInsertResultStruct2.id.longValue(), exploreAwemeList.LLILZIL, exploreAwemeList.getRequestId()));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C15TA.LIZ.getClass();
                    if (C15TA.LJJJ <= 0) {
                        C15TA.LJJJ = SystemClock.elapsedRealtime() - C15TA.LJJIZ;
                    }
                    C1623606Xi c1623606Xi = new C1623606Xi(new C626160OhC(false, true));
                    C491101vh c491101vh = C491101vh.LIZ;
                    newState(new C627660Ojc(c1623606Xi, c491101vh, c491101vh, arrayList3));
                    C15T7 c15t7ZQ2 = zQ2();
                    if (c15t7ZQ2 != null && (c20521215Rq = c15t7ZQ2.LLILLJJLI) != null) {
                        str = c20521215Rq.LIZ;
                    } else {
                        str = null;
                    }
                    List<ExplorePostItem> list6 = exploreAwemeList.items;
                    if (list6 != null && !list6.isEmpty()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    C20523715Sp.LIZ.getClass();
                    if (C20523715Sp.LIZIZ != 0) {
                        z4 = true;
                        C20532515Vz.LIZ(new C20532415Vy("enter_tab", true, SystemClock.elapsedRealtime() - C20523715Sp.LIZIZ, true, null, str, z2));
                        C20523715Sp.LIZIZ = 0L;
                    }
                    TabSwitchMetricService.LIZ.getClass();
                    TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                    if (tabSwitchMetricServiceLIZ != null) {
                        tabSwitchMetricServiceLIZ.LIZIZ("homepage_explore", EnumC1593290rZ1.VIEW, false);
                    }
                    if (C20530215Vc.LIZIZ() && (list = exploreAwemeList.items) != null) {
                        ArrayList arrayList8 = new ArrayList();
                        for (ExplorePostItem explorePostItem : list) {
                            Aweme aweme = explorePostItem.aweme;
                            if (aweme != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null) {
                                arrayList8.add(new C20530015Va(explorePostItem.aweme.getAid(), C438710HIf.LIZ(cover), explorePostItem.aweme, z4, 8));
                            }
                        }
                        xm().LJFF(arrayList8);
                        xm().LJ(0);
                    }
                    C1910420zoW.LIZLLL(EnumC1910400zoU.MANUAL_LOAD_TO_VIEW_ATTACHED);
                    InterfaceC1361890lXn<T> operator = getConfig().getOperator();
                    EnumC323450Cm7 enumC323450Cm7 = EnumC323450Cm7.Refresh;
                    C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                    C1263204ww c1263204ww = new C1263204ww(arrayList3.size());
                    c317290CcB.getClass();
                    operator.LIZJ(enumC323450Cm7, new C323380Cm0(null, c1263204ww, arrayList3), z4);
                    return z4;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
        return false;
    }
}
