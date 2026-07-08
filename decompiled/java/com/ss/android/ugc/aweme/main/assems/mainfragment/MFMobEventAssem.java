package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.AbstractC738140SxQ;
import X.C0QSJ;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19EG;
import X.C2217381BqS;
import X.C446900Hfk;
import X.C680080Qly;
import X.C687700QyG;
import X.C724240Sb0;
import X.C994010byR;
import X.InterfaceC1146704e9;
import X.InterfaceC1581600rGA;
import X.InterfaceC1581610rGB;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ARunnableS11S0000100_9;
import Y.ARunnableS15S0100100_9;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS85S1000000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MFMobEventAssem extends AbstractC738140SxQ implements InterfaceC1581600rGA, InterfaceC1581610rGB, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public volatile HomeViewPagerAbility LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public C0QSJ LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MFMobEventAssem.class, "homeViewPagerAbility", "getHomeViewPagerAbility()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1581610rGB
    public final void Ae(int i, Fragment fragment) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1581610rGB
    public final void onNodeHide(Bundle bundle) {
    }

    @Override // X.InterfaceC1581610rGB
    public final void onNodeShow(Bundle bundle) {
    }

    @Override // X.InterfaceC1581600rGA
    public final void xh(Fragment fragment, Bundle bundle) {
    }

    public final int bo(String str) {
        C19EG c19egLIZ;
        Fragment fragmentKi;
        if (!Intrinsics.LJFF(str, "homepage_hot") || !C994010byR.LIZ.LIZ() || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
            return 0;
        }
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        if (!c446900Hfk.LIZ(c19egLIZ).KQ2("For You") || (fragmentKi = c446900Hfk.LIZ(c19egLIZ).Ki("For You")) == null) {
            return 0;
        }
        Boolean boolValueOf = null;
        FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbility = (FeedRecommendSkylightDrawerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentKi, null), FeedRecommendSkylightDrawerAbility.class, null);
        if (feedRecommendSkylightDrawerAbility != null) {
            boolValueOf = Boolean.valueOf(feedRecommendSkylightDrawerAbility.yw0());
        }
        return Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? 1 : 0;
    }

    @Override // X.InterfaceC1581600rGA
    public final void LLZLLLL(View view, Bundle bundle) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C680080Qly.LIZIZ(c19egLIZ).LLJJJIL.observe(this, new Observer() { // from class: X.0qvZ
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Boolean boolValueOf;
                    C1568820qvY c1568820qvY = (C1568820qvY) obj;
                    if (C299850Bp9.LIZ()) {
                        AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24(c1568820qvY, this.LL, 81);
                        AtomicLong atomicLong = C0NB9.LIZ;
                        AwS173S1100000_24 awS173S1100000_24 = new AwS173S1100000_24(awS425S0200000_24, 5);
                        long andIncrement = C0NB9.LIZ.getAndIncrement();
                        C0NB9.LIZIZ.put(Long.valueOf(andIncrement), awS173S1100000_24);
                        C0NB9.LIZLLL.execute(new ARunnableS15S0100100_9(andIncrement, C0NB9.LIZJ.schedule(new ARunnableS11S0000100_9(andIncrement, 1), Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS), 0));
                    } else {
                        HashMap map = new HashMap();
                        map.put("enter_from", c1568820qvY.LIZ);
                        map.put("refresh_method", c1568820qvY.LIZIZ);
                        Aweme awemeLJIIIIZZ = ((MainFragment) C724240Sb0.LJI(this.LL)).LJIIIIZZ();
                        if (awemeLJIIIIZZ != null) {
                            map.put("group_id", awemeLJIIIIZZ.getAid());
                            map.put("author_id", AwemeExtKt.getAuthorUid(awemeLJIIIIZZ));
                        }
                        if (Intrinsics.LJFF(c1568820qvY.LIZ, "homepage_hot")) {
                            map.put("has_topwindow", String.valueOf(this.LL.bo(c1568820qvY.LIZ)));
                        }
                        C20684815ws.LJIILLIIL("refresh_homepage", map);
                    }
                    Aweme awemeLJIIIIZZ2 = ((MainFragment) C724240Sb0.LJI(this.LL)).LJIIIIZZ();
                    String str = c1568820qvY.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[observeMainPageRefresh] aweme=");
                    String aid = null;
                    if (awemeLJIIIIZZ2 != null) {
                        boolValueOf = Boolean.valueOf(AwemeExtKt.isAdTraffic(awemeLJIIIIZZ2));
                    } else {
                        boolValueOf = null;
                    }
                    sbLIZ.append(boolValueOf);
                    sbLIZ.append(", ");
                    if (awemeLJIIIIZZ2 != null) {
                        aid = awemeLJIIIIZZ2.getAid();
                    }
                    sbLIZ.append(aid);
                    sbLIZ.append(", refresh_method=");
                    sbLIZ.append(c1568820qvY.LIZIZ);
                    C1022620cia.LIZ("MFMobEventAssem", C2188811AlT.LIZIZ(sbLIZ));
                    List listLJIIJJI = C1697810uHb.LJIIJJI("click_top_icon", "click_bottom_icon", "slide_down");
                    if (awemeLJIIIIZZ2 != null && AwemeExtKt.isAdTraffic(awemeLJIIIIZZ2) && listLJIIJJI.contains(str)) {
                        new C1049100dPI(new Object[0]).logAd(C1D2H.LIZ, awemeLJIIIIZZ2.getAwemeRawAd(), new AwS85S1000000_35(str, 11));
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033 A[Catch: all -> 0x0041, PHI: r1
      0x0033: PHI (r1v2 X.0QSJ) = (r1v1 X.0QSJ), (r1v4 X.0QSJ) binds: [B:12:0x0017, B:17:0x002f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:9:0x0011, B:11:0x0015, B:13:0x0019, B:15:0x001d, B:16:0x0023, B:20:0x003b, B:21:0x003d, B:19:0x0033), top: B:42:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1581610rGB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u5(int r7, boolean r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L3
            return
        L3:
            boolean r0 = X.C297720Bli.LIZ()
            r5 = 0
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility r0 = r6.LL
            if (r0 != 0) goto L50
            monitor-enter(r6)
            com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility r0 = r6.LL     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L3f
            X.0QSJ r1 = r6.LLILLL     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L33
            X.0Q7z r2 = r6.LLILLJJLI     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L23
            X.0Q7z r2 = X.C687700QyG.LJIIIZ(r6)     // Catch: java.lang.Throwable -> L41
            r6.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L41
        L23:
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L41
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r0 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r1[r5] = r0     // Catch: java.lang.Throwable -> L41
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r2, r1)     // Catch: java.lang.Throwable -> L41
            r6.LLILLL = r1     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L33
            r0 = r3
            goto L3b
        L33:
            java.lang.Class<com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility> r0 = com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L41
            com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility r0 = (com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility) r0     // Catch: java.lang.Throwable -> L41
        L3b:
            r6.LL = r0     // Catch: java.lang.Throwable -> L41
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L41
            goto L4e
        L3f:
            monitor-exit(r6)
            goto L50
        L41:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L44:
            com.ss.android.ugc.aweme.scope.MainActivityScope r0 = X.C0S4U.LIZLLL(r6)
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility r0 = X.C0CUK.LIZ(r0)
        L4e:
            if (r0 == 0) goto L5c
        L50:
            int r0 = r0.gk1()
            if (r0 == 0) goto L5c
            if (r0 == r4) goto L59
            return
        L59:
            java.lang.String r3 = "homepage_follow"
            goto L5e
        L5c:
            java.lang.String r3 = "homepage_hot"
        L5e:
            X.19EG r2 = X.C724240Sb0.LIZ(r6)
            if (r2 == 0) goto L74
            X.0qvY r1 = new X.0qvY
            java.lang.String r0 = "click_top_icon"
            r1.<init>(r3, r0)
            com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel r0 = X.C680080Qly.LIZIZ(r2)
            androidx.lifecycle.MutableLiveData<X.0qvY> r0 = r0.LLJJJIL
            r0.postValue(r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.mainfragment.MFMobEventAssem.u5(int, boolean):void");
    }
}
