package com.ss.android.ugc.aweme.main;

import X.C075L;
import X.C08B7;
import X.C08TU;
import X.C0B1P;
import X.C0BSS;
import X.C0J5E;
import X.C0OHD;
import X.C0S78;
import X.C0SSZ;
import X.C0X35;
import X.C1017070cZd;
import X.C1030680cva;
import X.C1035180d2q;
import X.C128Y;
import X.C1388190mED;
import X.C13SZ;
import X.C1513230pTt;
import X.C1513540pUO;
import X.C1557550qdN;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1561720qk6;
import X.C1563800qnS;
import X.C1564470qoX;
import X.C1581140rFQ;
import X.C1584320rKY;
import X.C1585070rLl;
import X.C1591020rVM;
import X.C1591880rWk;
import X.C1593540rZQ;
import X.C1593570rZT;
import X.C1593730rZj;
import X.C1595430rcT;
import X.C1602170rnL;
import X.C1606580ruS;
import X.C1886700zCG;
import X.C19252910Tv;
import X.C1A5I;
import X.C20554315bp;
import X.C2188811AlT;
import X.C2230608oa;
import X.C2241008qG;
import X.C2344809Gs;
import X.C297720Bli;
import X.C343710Ddh;
import X.C529890KqJ;
import X.C794420VEi;
import X.C823050WQl;
import X.EnumC1589910rTZ;
import X.InterfaceC1017450caF;
import X.InterfaceC1209250hZb;
import X.InterfaceC1218550hob;
import X.InterfaceC1399350mWD;
import X.InterfaceC1570710qyb;
import X.InterfaceC1593530rZP;
import X.InterfaceC1593550rZR;
import X.InterfaceC1593560rZS;
import X.InterfaceC1593630rZZ;
import X.InterfaceC1602140rnI;
import X.InterfaceC1603190roz;
import X.InterfaceC1711206n0;
import X.InterfaceC342470Dbh;
import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFFeedAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.IPhotoSlideFailDetectAbility;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.BackRefreshStrategyAbility;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.services.publish.PublishProgressWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes25.dex */
public class MainRootFragment extends MainRootFragmentBase implements InterfaceC1602140rnI, InterfaceC1603190roz, InterfaceC1218550hob, PublishProgressWidgetContainer, InterfaceC1017450caF, C08B7, C0J5E, InterfaceC1711206n0 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZigtICF9BSQlJx08JzEKOy40JSAiPQ==";
    public final C1591880rWk LLJLIL = C1591880rWk.LIZIZ;
    public ScrollSwitchStateManager LLJLILLLLZIIL;
    public HomePageDataViewModel LLJLL;
    public C1591020rVM LLJLLIL;
    public C1591020rVM LLJLLL;
    public List<InterfaceC1399350mWD> LLJZ;
    public boolean LLJZIJLIL;
    public long LLL;

    @Override // X.InterfaceC1603190roz
    public final boolean isDuoDualMode() {
        return false;
    }

    @Override // X.InterfaceC1017450caF
    public final boolean isADShowing() {
        if (C1035180d2q.LIZLLL || C1030680cva.LJIIIZ()) {
            return true;
        }
        HomePageDataViewModel homePageDataViewModel = this.LLJLL;
        if (homePageDataViewModel != null) {
            return C1017070cZd.LJJLIIIIJ(homePageDataViewModel.LLJILJILJ) || C1017070cZd.LLIZLLLIL(this.LLJLL.LLJILJILJ);
        }
        return false;
    }

    @Override // X.InterfaceC1017450caF
    public final boolean mainPageOnFeed() {
        return this.LLJLILLLLZIIL.FQ2("page_feed");
    }

    public final C1591020rVM rS() {
        if (this.LLJLLIL == null) {
            this.LLJLLIL = this.LLJLIL.LJIIIIZZ(this.LLJILLL);
        }
        return this.LLJLLIL;
    }

    public final C1591020rVM sS() {
        if (this.LLJLLL == null) {
            this.LLJLLL = this.LLJLIL.LJJI(this.LLJILLL, rS());
        }
        return this.LLJLLL;
    }

    public final TabChangeManager uS() {
        return C343710Ddh.LIZ(this.LLJILLL);
    }

    public MainRootFragment() {
        new AtomicBoolean(false);
    }

    public final void Vj0() {
        IMFFeedAbility iMFFeedAbilityLIZ;
        C2230608oa<Boolean> isUseBackRefresh = SharePrefCache.inst().getIsUseBackRefresh();
        if (isUseBackRefresh == null || !isUseBackRefresh.LIZ().booleanValue() || uS().BQ2() == null || !(uS().BQ2() instanceof MainFragment) || (iMFFeedAbilityLIZ = C1561720qk6.LIZ(uS().BQ2())) == null) {
            return;
        }
        iMFFeedAbilityLIZ.Vj0();
    }

    @Override // X.InterfaceC1603190roz
    public final Fragment getCurFragment() {
        if (uS() == null) {
            return null;
        }
        return uS().BQ2();
    }

    @Override // X.InterfaceC1603190roz
    public final String getEnterFrom() {
        MainBusinessAbility mainBusinessAbility;
        return (nS().isDestroyed() || nS().isFinishing() || (mainBusinessAbility = (MainBusinessAbility) this.LLJJIJIIJIL.getValue()) == null) ? "" : mainBusinessAbility.jr0();
    }

    @Override // X.InterfaceC1218550hob
    public final InterfaceC1209250hZb getHelper() {
        return mS().w8();
    }

    @Override // X.InterfaceC1603190roz
    public final InterfaceC1570710qyb getMainHelper() {
        BackRefreshStrategyAbility backRefreshStrategyAbility = C297720Bli.LIZ() ? (BackRefreshStrategyAbility) this.LLJJIJI.getValue() : (BackRefreshStrategyAbility) C1558520qew.LIZ(C1558360qeg.LJI(this.LLJILLL, null), BackRefreshStrategyAbility.class, null);
        if (backRefreshStrategyAbility != null) {
            return backRefreshStrategyAbility.getMainHelper();
        }
        return null;
    }

    @Override // X.InterfaceC1602140rnI
    public final boolean isPaused() {
        MainBusinessAbility mainBusinessAbility = C297720Bli.LIZ() ? (MainBusinessAbility) this.LLJJIJIIJIL.getValue() : (MainBusinessAbility) C1558520qew.LIZ(C1558360qeg.LJI(this.LLJILLL, null), MainBusinessAbility.class, null);
        if (mainBusinessAbility != null) {
            return mainBusinessAbility.cF0();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.main.MainRootFragmentBase, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C20554315bp.LIZIZ.LJIIJ();
    }

    @Override // X.InterfaceC1603190roz
    public final void onKeyBack() {
        HomePageViewPagerAbility homePageViewPagerAbilityMS = mS();
        if (homePageViewPagerAbilityMS == null || !homePageViewPagerAbilityMS.Ta0(false, null)) {
            if (uS().BQ2() != null && (uS().BQ2() instanceof C0SSZ)) {
                Vj0();
            }
            Vj0();
        }
    }

    @Override // X.InterfaceC1017450caF
    public final void splashOverShowMandatoryLoginPage() {
        List<InterfaceC1593530rZP> listLIZ = C1581140rFQ.LIZ(this, nS());
        if (listLIZ != null) {
            Iterator<InterfaceC1593530rZP> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().splashOverShowMandatoryLoginPage();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.main.MainRootFragmentBase, androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void LLLLIILLL(Bundle bundle) {
        C1602170rnL c1602170rnLQS = qS();
        if (c1602170rnLQS != null) {
            c1602170rnLQS.LJI();
        }
        this.LLJILLL.getIntent().putExtra("onNewIntent", true);
        Intent intent = this.LLJILLL.getIntent();
        List<InterfaceC1593530rZP> listLIZ = C1581140rFQ.LIZ(this, nS());
        if (listLIZ != null) {
            Iterator<InterfaceC1593530rZP> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().onNewIntent(intent);
            }
        }
        C2344809Gs.LJ("saf: MainActivity onNewIntent End");
        super.LLLLIILLL(bundle);
    }

    @Override // X.InterfaceC1017450caF
    public final void allowSwipeLeft(boolean z) {
        if (z) {
            if (Hox.AQ2(this.LLJILLL).KQ2("HOME")) {
                this.LLJLILLLLZIIL.LQ2(rS());
                return;
            }
            if (C1593730rZj.LIZIZ.LJIJJLI(this.LLJILLL, uS().BQ2(), this.LLJLILLLLZIIL, sS(), rS())) {
                return;
            }
            this.LLJLILLLLZIIL.LQ2(sS());
            return;
        }
        this.LLJLILLLLZIIL.LQ2(sS());
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zLJJZ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJZ();
        C128Y curFragment = getCurFragment();
        if (curFragment instanceof InterfaceC1593630rZZ) {
            FeedFragment feedFragmentUx = ((InterfaceC1593630rZZ) curFragment).ux();
            if ((feedFragmentUx instanceof FeedFragment) && feedFragmentUx.onDispatchKeyEvent(keyEvent) && zLJJZ) {
                return Boolean.TRUE;
            }
            return null;
        }
        return null;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IPhotoSlideFailDetectAbility iPhotoSlideFailDetectAbility;
        if (qS() != null) {
            this.LLJILLL.legacyBeforeDispatchTouch(motionEvent);
        }
        MainActivity mainActivity = this.LLJILLL;
        try {
            C1A5I c1a5i = C1A5I.LIZ;
            c1a5i.getClass();
            if (C1A5I.LIZ() && mainPageOnFeed() && !C529890KqJ.LIZ().LLFFF(mainActivity)) {
                C128Y c128yBQ2 = uS().BQ2();
                if (c128yBQ2 instanceof InterfaceC1593630rZZ) {
                    ViewGroup viewGroup = (ViewGroup) mainActivity.getWindow().getDecorView();
                    Fragment fragmentBQ2 = uS().BQ2();
                    int iYv = ((InterfaceC1593630rZZ) c128yBQ2).yv();
                    c1a5i.getClass();
                    C1A5I.LIZIZ(viewGroup, motionEvent, fragmentBQ2, iYv);
                }
            }
            if (((Number) C0B1P.LIZ.getValue()).intValue() > 0 && mainPageOnFeed() && !C529890KqJ.LIZ().LLFFF(mainActivity)) {
                C128Y c128yBQ22 = uS().BQ2();
                if ((c128yBQ22 instanceof InterfaceC1593630rZZ) && ((InterfaceC1593630rZZ) c128yBQ22).Ik() && (iPhotoSlideFailDetectAbility = (IPhotoSlideFailDetectAbility) C1558520qew.LIZ(C1558360qeg.LJI(mainActivity, null), IPhotoSlideFailDetectAbility.class, null)) != null) {
                    iPhotoSlideFailDetectAbility.v60(motionEvent);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2344809Gs.LJI(th);
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("message", th.getMessage());
            C794420VEi.LIZIZ("main_activity_dispatch_error", "", c2241008qG.LJ());
        }
        try {
            C1513230pTt.LIZIZ.LIZJ(motionEvent);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        long j = C1513540pUO.LIZJ;
        if (j > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - this.LLL >= j) {
                C1513230pTt.LIZIZ.LIZ(motionEvent);
                if (motionEvent.getAction() == 1) {
                    this.LLL = jElapsedRealtime;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.main.MainRootFragmentBase, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) throws Exception {
        C1606580ruS.LIZIZ(this, "onActivityCreated Start");
        MainActivity mainActivity = this.LLJILLL;
        if (mainActivity.stateManager == null || mainActivity.homeViewModel == null) {
            mainActivity.prepareActivityVM();
        }
        MainActivity mainActivity2 = this.LLJILLL;
        this.LLJLILLLLZIIL = mainActivity2.stateManager;
        this.LLJLL = mainActivity2.homeViewModel;
        mainActivity2.beforeCallSceneActivityCreated(bundle);
        try {
            this.LLJILLL.afterCallSceneActivityCreated(bundle, this.LLJJI);
            super.onActivityCreated(bundle);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String strLIZIZ = C13SZ.LIZIZ(e);
            StackTraceElement[] stackTrace = e.getStackTrace();
            if (stackTrace == null) {
                stackTrace = new StackTraceElement[0];
            }
            if (stackTrace.length >= 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onActivityCreated has exception: ");
                sbLIZ.append(e);
                sbLIZ.append(stackTrace[0]);
                sbLIZ.append(stackTrace[1]);
                C1606580ruS.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ));
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onActivityCreated has exception: ");
                sbLIZ2.append(e);
                C1606580ruS.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ2));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onActivityCreated full exception: ");
            sbLIZ3.append(strLIZIZ);
            C1606580ruS.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ3));
            throw e;
        }
    }

    @Override // com.ss.android.ugc.aweme.main.MainRootFragmentBase, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        this.LLJILLL = (MainActivity) C1388190mED.LIZ(requireContext());
        if (((Boolean) C075L.LIZIZ.getValue()).booleanValue()) {
            C08TU.LIZ().execute(new Runnable() { // from class: X.0Mue
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TaskHolder@2769.preload$1");
                    try {
                        C1306930k79.LIZ.LIZIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TaskHolder@2769.preload$1");
                }
            });
        } else {
            C0S78.LIZJ(new C0OHD(), true);
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_home_pre_vscope", true)) {
            C1557550qdN.LIZIZ = C08TU.LIZ();
        }
        C1558360qeg.LIZIZ(this, null);
        super.onAttach(context);
    }

    @Override // com.ss.android.ugc.aweme.main.MainRootFragmentBase, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C1606580ruS.LIZIZ(this, "onCreate Start");
        C1602170rnL c1602170rnLQS = qS();
        if (c1602170rnLQS != null) {
            c1602170rnLQS.LJ(bundle);
            C0X35.LJIIJJI("cold_boot_main_create_init_scene_duration", false);
            C0X35.LIZ("cold_boot_main_create_dispatch_scene_create_to_main_root_fragment", false);
        }
        C1593570rZT c1593570rZT = C1593540rZQ.LIZ;
        if (c1593570rZT.LJFF != -1) {
            c1593570rZT.LJI = System.currentTimeMillis() - c1593570rZT.LJFF;
            C823050WQl.LIZIZ().execute(new ARunnableS124S0100000_24(c1593570rZT, 56));
        }
        this.LLJILLL = (MainActivity) C1388190mED.LIZ(requireContext());
        C20554315bp.LIZIZ.LJII(requireContext());
        if (C1564470qoX.LIZ()) {
            C1585070rLl.LIZ.getClass();
            C1585070rLl.LIZIZ.clear();
            C1585070rLl.LIZJ.clear();
            C1585070rLl.LIZLLL = null;
            C1585070rLl.LJI = null;
            C1585070rLl.LJ.clear();
            C1585070rLl.LJFF.clear();
            ((ArrayList) C1563800qnS.LIZ).clear();
            C1595430rcT.LIZIZ.LIZJ().clearFriends2TabAssem();
        }
        C1606580ruS.LIZIZ(this, "beforeSuperOnCreate Start");
        this.LLJILLL.beforeSuperOnCreate(bundle, true);
        C1606580ruS.LIZIZ(this, "beforeSuperOnCreate End");
        super.onCreate(bundle);
        if (c1602170rnLQS != null) {
            c1602170rnLQS.LIZLLL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[ORIG_RETURN, RETURN] */
    @Override // com.ss.android.ugc.aweme.main.MainRootFragmentBase, androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRestoreInstanceState(android.os.Bundle r5) {
        /*
            r4 = this;
            java.lang.String r0 = "onRestoreInstanceState Start"
            X.C1606580ruS.LIZIZ(r4, r0)
            super.onRestoreInstanceState(r5)
            android.content.Context r0 = r4.requireContext()
            android.app.Activity r1 = X.C1388190mED.LIZ(r0)
            com.ss.android.ugc.aweme.main.MainActivity r1 = (com.ss.android.ugc.aweme.main.MainActivity) r1
            r4.LLJILLL = r1
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = r1.stateManager
            if (r0 == 0) goto L1c
            com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel r0 = r1.homeViewModel
            if (r0 != 0) goto L1f
        L1c:
            r1.prepareActivityVM()
        L1f:
            com.ss.android.ugc.aweme.main.MainActivity r1 = r4.LLJILLL
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = r1.stateManager
            r4.LLJLILLLLZIIL = r0
            com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel r0 = r1.homeViewModel
            r4.LLJLL = r0
            boolean r0 = X.C1571680r0A.LIZIZ
            if (r0 != 0) goto La8
            com.ss.android.ugc.aweme.main.TabChangeManager r2 = r4.uS()
            if (r5 == 0) goto La4
            java.lang.String r0 = r2.CQ2()
            if (r0 != 0) goto L51
            java.lang.String r0 = "cur_fragment"
            java.lang.String r0 = r5.getString(r0)
            r2.LLJ = r0
            X.0rNr r0 = r2.LLJILJIL
            if (r0 == 0) goto L51
            java.lang.String r1 = r2.CQ2()
            X.0rNw r0 = r0.LIZ
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = r0.LIZJ
            if (r0 == 0) goto L51
            r0.LLJJIJIL = r1
        L51:
            java.lang.String r0 = r2.LLILZLL
            if (r0 != 0) goto L5d
            java.lang.String r0 = "last_fragment"
            java.lang.String r0 = r5.getString(r0)
            r2.LLILZLL = r0
        L5d:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r1 = "isForcedRefreshView"
            r0 = 1
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "fromStart"
            java.lang.String r0 = "MainPage"
            X.C786410Ut5.LJJJI(r1, r0, r3)
            com.ss.android.ugc.aweme.main.MainActivity r0 = r4.LLJILLL
            com.bytedance.hox.Hox r2 = com.bytedance.hox.Hox.AQ2(r0)
            java.lang.String r1 = "HOME"
            r0 = 0
            r2.TQ2(r3, r1, r0)
        L7b:
            java.lang.String r0 = "slide_switch_scanScroll"
            boolean r1 = r5.getBoolean(r0)
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = r4.LLJLILLLLZIIL
            r0.KQ2(r1)
        L86:
            com.ss.android.ugc.aweme.main.MainActivity r0 = r4.nS()
            java.util.List r0 = X.C1581140rFQ.LIZ(r4, r0)
            if (r0 == 0) goto Laf
            java.util.Iterator r1 = r0.iterator()
        L94:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r1.next()
            X.0rZP r0 = (X.InterfaceC1593530rZP) r0
            r0.onRestoreInstanceState(r5)
            goto L94
        La4:
            r2.getClass()
            goto L5d
        La8:
            boolean r0 = X.C277650AuR.LIZ()
            if (r0 != 0) goto L86
            goto L7b
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainRootFragment.onRestoreInstanceState(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    @Override // com.ss.android.ugc.aweme.main.MainRootFragmentBase, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSaveInstanceState(android.os.Bundle r7) {
        /*
            r6 = this;
            java.lang.String r0 = "onSaveInstanceState Start"
            X.C1606580ruS.LIZIZ(r6, r0)
            super.onSaveInstanceState(r7)
            boolean r0 = X.C1571680r0A.LIZIZ
            if (r0 != 0) goto L97
            com.ss.android.ugc.aweme.main.TabChangeManager r2 = r6.uS()
            java.lang.String r1 = r2.CQ2()
            java.lang.String r0 = "cur_fragment"
            X.C786410Ut5.LJJJI(r0, r1, r7)
            java.lang.String r1 = "last_fragment"
            java.lang.String r0 = r2.LLILZLL
            X.C786410Ut5.LJJJI(r1, r0, r7)
        L20:
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = r6.LLJLILLLLZIIL
            boolean r1 = r0.DQ2()
            java.lang.String r0 = "slide_switch_scanScroll"
            r7.putBoolean(r0, r1)
        L2b:
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r6.uS()
            java.lang.String r1 = r0.CQ2()
            java.lang.String r0 = "previousTag"
            X.C786410Ut5.LJJJI(r0, r1, r7)
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r5 = r6.LLJLILLLLZIIL
            androidx.lifecycle.MutableLiveData<java.util.List<X.0rUP>> r0 = r5.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            r4 = 0
            if (r0 == 0) goto L6f
            androidx.lifecycle.MutableLiveData<java.util.List<X.0rUP>> r0 = r5.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            int r3 = r0.size()
            r2 = 0
        L50:
            if (r2 >= r3) goto L6f
            androidx.lifecycle.MutableLiveData<java.util.List<X.0rUP>> r0 = r5.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L95
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            X.0rUP r0 = (X.C1590430rUP) r0
            if (r0 == 0) goto L95
            java.lang.String r1 = r0.LIZIZ
        L66:
            java.lang.String r0 = "page_setting"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L92
            r4 = 1
        L6f:
            java.lang.String r0 = "should_show_slide_setting"
            r7.putBoolean(r0, r4)
            com.ss.android.ugc.aweme.main.MainActivity r0 = r6.nS()
            java.util.List r0 = X.C1581140rFQ.LIZ(r6, r0)
            if (r0 == 0) goto L9e
            java.util.Iterator r1 = r0.iterator()
        L82:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r1.next()
            X.0rZP r0 = (X.InterfaceC1593530rZP) r0
            r0.onSaveInstanceState(r7)
            goto L82
        L92:
            int r2 = r2 + 1
            goto L50
        L95:
            r1 = 0
            goto L66
        L97:
            boolean r0 = X.C277650AuR.LIZ()
            if (r0 != 0) goto L2b
            goto L20
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainRootFragment.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override // X.InterfaceC655270Pn3
    public final void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        if (this.LLJZ == null) {
            this.LLJZ = new ArrayList();
        }
        if (!this.LLJZ.contains(interfaceC1399350mWD)) {
            for (InterfaceC1399350mWD interfaceC1399350mWD2 : this.LLJZ) {
                if (interfaceC1399350mWD2.getClass() == interfaceC1399350mWD.getClass()) {
                    List<InterfaceC1399350mWD> list = this.LLJZ;
                    ListProtector.add(list, list.indexOf(interfaceC1399350mWD2), interfaceC1399350mWD);
                    return;
                }
            }
            this.LLJZ.add(interfaceC1399350mWD);
        }
    }

    @Override // X.InterfaceC1017450caF
    public final void setVpEnableDispatchTouchEventCheck(boolean z) {
        HomePageViewPagerAbility homePageViewPagerAbilityMS = mS();
        if (homePageViewPagerAbilityMS != null) {
            homePageViewPagerAbilityMS.Mw2(z);
        }
    }

    @Override // X.InterfaceC655270Pn3
    public final void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        List<InterfaceC1399350mWD> list = this.LLJZ;
        if (list != null) {
            ((ArrayList) list).remove(interfaceC1399350mWD);
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean onKeyDown(int i, KeyEvent keyEvent) {
        CommonPageFragment commonPageFragmentXQ2;
        CommonPageFragment commonPageFragmentXQ22;
        CommonPageFragment commonPageFragmentXQ23;
        this.LLJZIJLIL = false;
        List<InterfaceC1399350mWD> list = this.LLJZ;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((InterfaceC1399350mWD) it2.next()).onKeyDown(i, keyEvent)) {
                    this.LLJZIJLIL = true;
                    return Boolean.TRUE;
                }
            }
        }
        if (i != 4) {
            if (i != 67) {
                return Boolean.FALSE;
            }
            return super.onKeyDown(i, keyEvent);
        }
        if (this.LLJLILLLLZIIL.FQ2("page_discover") && (commonPageFragmentXQ23 = this.LLJLILLLLZIIL.xQ2("page_discover")) != null && commonPageFragmentXQ23.LLZLL()) {
            return Boolean.TRUE;
        }
        if (this.LLJLILLLLZIIL.FQ2("page_profile") && (commonPageFragmentXQ22 = this.LLJLILLLLZIIL.xQ2("page_profile")) != null && commonPageFragmentXQ22.LLZLL()) {
            return Boolean.TRUE;
        }
        if (this.LLJLILLLLZIIL.FQ2("page_camera") && (commonPageFragmentXQ2 = this.LLJLILLLLZIIL.xQ2("page_camera")) != null && commonPageFragmentXQ2.LLZLL()) {
            return Boolean.TRUE;
        }
        C128Y c128yBQ2 = uS().BQ2();
        if (c128yBQ2 != null && (c128yBQ2 instanceof InterfaceC1593550rZR) && ((InterfaceC1593550rZR) c128yBQ2).LLLLIIL()) {
            return Boolean.TRUE;
        }
        C1584320rKY c1584320rKY = C1584320rKY.LIZ;
        String value = EnumC1589910rTZ.GOBACK_ICON.getValue();
        c1584320rKY.getClass();
        C1584320rKY.LJ = value;
        HomePageViewPagerAbility homePageViewPagerAbilityMS = mS();
        if (homePageViewPagerAbilityMS != null && homePageViewPagerAbilityMS.Ta0(true, null)) {
            return Boolean.TRUE;
        }
        if (uS().BQ2() != null && (uS().BQ2() instanceof C0SSZ)) {
            Vj0();
            return super.onKeyDown(i, keyEvent);
        }
        Vj0();
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (C0BSS.LIZ) {
            if (i != 25 && i != 24) {
                return super.onKeyUp(i, keyEvent);
            }
            return Boolean.valueOf(this.LLJZIJLIL);
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void gv(int i, String[] strArr, int[] iArr) {
        C1886700zCG.LIZ(this.LLJILLL, i, iArr);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onResult(int i, int i2, Intent intent) {
        InterfaceC342470Dbh interfaceC342470Dbh = this.LLJILLL.mActivityResultListener;
        if (interfaceC342470Dbh != null) {
            interfaceC342470Dbh.onActivityResult(i, i2, intent);
        }
        if (i == 1 && i2 == 2) {
            mS().Vf1();
        } else if (getCurFragment() != null && (getCurFragment() instanceof InterfaceC1593560rZS)) {
            getCurFragment().onActivityResult(i, i2, intent);
        }
        List<InterfaceC1593530rZP> listLIZ = C1581140rFQ.LIZ(this, nS());
        boolean z = false;
        if (listLIZ != null) {
            Iterator<InterfaceC1593530rZP> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                if (it2.next().onActivityResult(i, i2, intent)) {
                    z = true;
                }
            }
        }
        return !(!z);
    }
}
