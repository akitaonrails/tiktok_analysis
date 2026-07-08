package com.ss.android.ugc.aweme.notification;

import X.AbstractC1907870zkP;
import X.C01GW;
import X.C036E;
import X.C0P6P;
import X.C11NJ;
import X.C1238750iLB;
import X.C1242260iQq;
import X.C1242320iQw;
import X.C1259960itO;
import X.C1260870iur;
import X.C1308910kAL;
import X.C14EU;
import X.C15O7;
import X.C1697810uHb;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C1907770zkF;
import X.C1907850zkN;
import X.C1908260zl2;
import X.C1908300zl6;
import X.C1908990zmD;
import X.C1909000zmE;
import X.C1913380ztI;
import X.C19335310kh;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C481090Itn;
import X.C635570OwN;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1212360hec;
import X.InterfaceC1259970itP;
import X.InterfaceC1906690ziV;
import X.InterfaceC19341710lj;
import X.InterfaceC744180THc;
import Y.ARunnableS128S0100000_28;
import android.os.SystemClock;
import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UnsubscribeSettingMetadata;
import com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.ss.android.ugc.aweme.notification.vm.SubscribeSettingVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS572S0100000_28;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class MusNotificationDetailActivity extends BaseActivity implements InterfaceC19341710lj, C0P6P, InterfaceC1212360hec<BaseNotice>, InterfaceC744180THc, InterfaceC1906690ziV {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1ISYtPSHELIOSY8JmsBPDwdJzElLyYwKTElJiEXLTEtICMSKzElPyYnMQ==";
    public RecyclerView LL;
    public C481090Itn LLILLJJLI;
    public TuxNavBar LLILLL;
    public C1749280vcc LLILZ;
    public AbstractC1907870zkP LLIZ;
    public InterfaceC1259970itP LLIZLLLIL;
    public InterfaceC1259970itP LLJ;
    public C1259960itO LLJI;
    public MusNewNotificationModel LLJILJIL;
    public C635570OwN LLJILJILJ;
    public boolean LLJJI;
    public final C01GW LLILZIL = RouteArgExtension.INSTANCE.navArg(this);
    public final C1907770zkF LLILZLL = C1907770zkF.LIZ;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(264));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1624));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(263));
    public long LLJJIII = -1;
    public String LLJJIJI = "close";
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 304));

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
    }

    @Override // X.InterfaceC1212360hec
    public final void LJ() {
    }

    @Override // X.InterfaceC19341710lj
    public final void LJFF() {
        boolean zLIZIZ;
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            C1259960itO c1259960itO = this.LLJI;
            if (c1259960itO == null) {
                c1259960itO = null;
            }
            if (c1259960itO.getItemCount() == 0) {
                C15O7.LJIIIIZZ(100L).LJ(new C19335310kh(this, 0), C15O7.LJIIIIZZ, null);
            }
            C1908300zl6.LIZ = null;
            return;
        }
        C1259960itO c1259960itO2 = this.LLJI;
        if (c1259960itO2 == null) {
            c1259960itO2 = null;
        }
        if (c1259960itO2.getItemCount() == 0) {
            LLLLZLL().LJ();
            C786410Ut5.LLLZLZ(LLLLZLL(), 0);
        }
        ((C1260870iur) this.LLJIJIL.getValue()).LIZJ(1, Integer.valueOf(LLLLLZL().groupType), null, Boolean.valueOf(LLLLLZL().mergeTikTokShop));
        ((Set) ((NotificationDetailVM) this.LLJILLL.getValue()).LL.getValue()).clear();
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(253);
        C1908260zl2 c1908260zl2 = C1908300zl6.LIZ;
        if (c1908260zl2 != null) {
            aFwS271S0000000_28.invoke(c1908260zl2);
        }
    }

    @Override // X.InterfaceC1906690ziV
    public final void LLJIJIL() {
    }

    @Override // X.InterfaceC1906690ziV
    public final void LLJLLIL(int i, C1242320iQw c1242320iQw) {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<BaseNotice> list, boolean z) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onStart", true);
        super.onStart();
        this.LLJJIJI = "close";
        this.LLJJIII = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void zK() {
        throw null;
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        ((C1260870iur) this.LLJIJIL.getValue()).LIZJ(4, Integer.valueOf(LLLLLZL().groupType), null, Boolean.valueOf(LLLLLZL().mergeTikTokShop));
    }

    public final MusNotificationDetailArg LLLLLZL() {
        MusNotificationDetailArg musNotificationDetailArg = (MusNotificationDetailArg) this.LLILZIL.getValue();
        return musNotificationDetailArg == null ? new MusNotificationDetailArg(-1, 0, null, "", null, false, 0L, null) : musNotificationDetailArg;
    }

    public final RecyclerView LLLLZI() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.per);
            this.LL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final C481090Itn LLLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pf_);
            this.LLILLJJLI = (C481090Itn) callbackFindViewById;
        }
        return (C481090Itn) callbackFindViewById;
    }

    public final C1749280vcc LLLLZLL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w28);
            this.LLILZ = (C1749280vcc) callbackFindViewById;
        }
        return (C1749280vcc) callbackFindViewById;
    }

    public final C1907850zkN LLLLZLLIL() {
        LLLLLZL();
        C1907850zkN c1907850zkN = new C1907850zkN(LLLLLZL().title, LLLLLZL().tabName, LLLLLZL().enterFrom, LLLLLZL().mergeTikTokShop ? "shop_info" : null, LLLLLZL().mergeTikTokShop ? "a2270.b9415.c4351.d3152" : null, C1242260iQq.LIZ(this));
        c1907850zkN.LIZ = (NotificationDetailVM) this.LLJILLL.getValue();
        return c1907850zkN;
    }

    @Override // X.InterfaceC1212360hec
    public final void Ng1() {
        C1259960itO c1259960itO = this.LLJI;
        if ((c1259960itO == null ? null : c1259960itO).mShowFooter) {
            if (c1259960itO == null) {
                c1259960itO = null;
            }
            c1259960itO.setShowFooter(false);
            C1259960itO c1259960itO2 = this.LLJI;
            if (c1259960itO2 == null) {
                c1259960itO2 = null;
            }
            c1259960itO2.notifyDataSetChanged();
            showLoadMoreEmpty();
        }
        LLLLZIL().setRefreshing(false);
        C1259960itO c1259960itO3 = this.LLJI;
        if (c1259960itO3 == null) {
            c1259960itO3 = null;
        }
        if (c1259960itO3.getItemCount() == 0) {
            C1749280vcc c1749280vccLLLLZLL = LLLLZLL();
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            InterfaceC1259970itP interfaceC1259970itP = this.LLIZLLLIL;
            if (interfaceC1259970itP == null) {
                interfaceC1259970itP = null;
            }
            c1722300uv6.LJI = interfaceC1259970itP.LIZIZ();
            InterfaceC1259970itP interfaceC1259970itP2 = this.LLIZLLLIL;
            (interfaceC1259970itP2 != null ? interfaceC1259970itP2 : null).LJ();
            c1722300uv6.LJIIIIZZ = "";
            c1749280vccLLLLZLL.setStatus(c1722300uv6);
            C786410Ut5.LLLZLZ(LLLLZLL(), 0);
        }
        C1908300zl6.LIZ(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    @Override // X.InterfaceC744180THc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.analysis.Analysis getAnalysis() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.analysis.Analysis r2 = new com.ss.android.ugc.aweme.analysis.Analysis
            r2.<init>()
            com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg r0 = r3.LLLLLZL()
            int r1 = r0.groupType
            r0 = 7
            if (r1 == r0) goto L24
            int r0 = X.C1904270zeb.LIZ
            if (r1 != r0) goto L18
            java.lang.String r0 = "like"
        L14:
            r2.setLabelName(r0)
            return r2
        L18:
            r0 = 6
            if (r1 != r0) goto L1e
            java.lang.String r0 = "at"
            goto L14
        L1e:
            r0 = 2
            if (r1 != r0) goto L24
            java.lang.String r0 = "comment"
            goto L14
        L24:
            java.lang.String r0 = "fans"
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity.getAnalysis():com.ss.android.ugc.aweme.analysis.Analysis");
    }

    public final void showLoadMoreEmpty() {
        C1259960itO c1259960itO = this.LLJI;
        if (c1259960itO == null) {
            c1259960itO = null;
        }
        c1259960itO.showLoadMoreEmpty();
        C1259960itO c1259960itO2 = this.LLJI;
        (c1259960itO2 != null ? c1259960itO2 : null).setShowFooter(false);
    }

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        C1259960itO c1259960itO = this.LLJI;
        if (c1259960itO == null) {
            c1259960itO = null;
        }
        c1259960itO.showLoadMoreLoading();
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        this.LLJJIJI = "return";
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((C1260870iur) this.LLJIJIL.getValue()).LIZ();
        ((C11NJ) this.LLJJ.getValue()).dispose();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (LLLLLZL().mergeTikTokShop && LLLLLZL().groupType == 210 && this.LLJJIII != -1) {
            HandlerHook.viewPost(LLLLZI(), new ARunnableS128S0100000_28(this, 49));
        }
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.InterfaceC1906690ziV
    public final void LIZ(int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemClick:");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJIJI = "next";
    }

    @Override // X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        C1259960itO c1259960itO;
        C1259960itO c1259960itO2 = this.LLJI;
        C1259960itO c1259960itO3 = null;
        if (c1259960itO2 == null) {
            c1259960itO = null;
        } else {
            c1259960itO = c1259960itO2;
        }
        if (c1259960itO.mShowFooter) {
            if (c1259960itO2 == null) {
                c1259960itO2 = null;
            }
            c1259960itO2.setShowFooter(false);
            C1259960itO c1259960itO4 = this.LLJI;
            if (c1259960itO4 == null) {
                c1259960itO4 = null;
            }
            c1259960itO4.notifyDataSetChanged();
        }
        LLLLZIL().setRefreshing(false);
        C1259960itO c1259960itO5 = this.LLJI;
        if (c1259960itO5 != null) {
            c1259960itO3 = c1259960itO5;
        }
        if (c1259960itO3.getItemCount() == 0) {
            C786410Ut5.LLLZLZ(LLLLZLL(), 0);
            C1913380ztI c1913380ztI = C1913380ztI.LLILLJJLI;
            if (c1913380ztI.isStandardUIEnable()) {
                c1913380ztI.setStatusView(LLLLZLL(), "inbox_notification_detail", new C1908990zmD(this), exc);
                c1913380ztI.triggerNetworkTips(this, "inbox_notification_detail", exc, LLLLZLL());
            } else {
                C1749280vcc c1749280vccLLLLZLL = LLLLZLL();
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C1893080zMY.LIZ(c1722300uv6, new C1909000zmE(this));
                c1749280vccLLLLZLL.setStatus(c1722300uv6);
            }
        }
        C1908300zl6.LIZ(0);
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        C1259960itO c1259960itO = this.LLJI;
        if (c1259960itO == null) {
            c1259960itO = null;
        }
        c1259960itO.showPullUpLoadMore();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity.onCreate(android.os.Bundle):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSwitchBusinessAccountSuccessEvent(C1238750iLB c1238750iLB) {
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void LLJJJIL(List<BaseNotice> list, boolean z) {
        C1259960itO c1259960itO = this.LLJI;
        C1259960itO c1259960itO2 = null;
        if (c1259960itO == null) {
            c1259960itO = null;
        }
        c1259960itO.setShowFooter(true);
        int size = 0;
        if (this.LLJJI) {
            C1259960itO c1259960itO3 = this.LLJI;
            if (c1259960itO3 == null) {
                c1259960itO3 = null;
            }
            c1259960itO3.LLILZ = 0;
        }
        if (!z) {
            showLoadMoreEmpty();
        } else {
            C1259960itO c1259960itO4 = this.LLJI;
            if (c1259960itO4 == null) {
                c1259960itO4 = null;
            }
            c1259960itO4.resetLoadMoreState();
        }
        MusNewNotificationModel musNewNotificationModel = this.LLJILJIL;
        if (musNewNotificationModel == null) {
            musNewNotificationModel = null;
        }
        UnsubscribeSettingMetadata unsubscribeSettingMetadata = musNewNotificationModel.unsubscribeSetting;
        if (unsubscribeSettingMetadata != null && unsubscribeSettingMetadata.hasUnsubscribeSetting) {
            C635570OwN c635570OwN = this.LLJILJILJ;
            if (c635570OwN == null) {
                c635570OwN = null;
            }
            ((SubscribeSettingVM) c635570OwN.LJFF.getValue()).vQ2(c635570OwN.LIZIZ);
            KeyEvent.Callback callbackFindViewById = this.LLILLL;
            if (callbackFindViewById == null) {
                callbackFindViewById = findViewById(R.id.y08);
                this.LLILLL = (TuxNavBar) callbackFindViewById;
            }
            ((TuxNavBar) callbackFindViewById).LJJ(AFwS271S0000000_28.get$arr$(125), "gear");
        }
        LLLLZIL().setRefreshing(false);
        C1259960itO c1259960itO5 = this.LLJI;
        if (c1259960itO5 != null) {
            c1259960itO2 = c1259960itO5;
        }
        c1259960itO2.setData(list);
        C786410Ut5.LLLZLZ(LLLLZLL(), 8);
        if (!this.LLJJI && LLLLLZL().mergeTikTokShop && LLLLLZL().groupType == 210) {
            HandlerHook.viewPost(LLLLZI(), new ARunnableS128S0100000_28(this, 48));
        }
        this.LLJJI = true;
        if (list != null) {
            size = list.size();
        }
        C1908300zl6.LIZ(size);
    }

    @Override // X.InterfaceC1212360hec
    public final void Pj(List<BaseNotice> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        C1259960itO c1259960itO = null;
        if (!z) {
            showLoadMoreEmpty();
        } else {
            C1259960itO c1259960itO2 = this.LLJI;
            if (c1259960itO2 == null) {
                c1259960itO2 = null;
            }
            c1259960itO2.resetLoadMoreState();
        }
        C1259960itO c1259960itO3 = this.LLJI;
        if (c1259960itO3 != null) {
            c1259960itO = c1259960itO3;
        }
        c1259960itO.setDataAfterLoadMore(list);
    }
}
