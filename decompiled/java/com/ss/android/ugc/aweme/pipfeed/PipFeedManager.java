package com.ss.android.ugc.aweme.pipfeed;

import X.AbstractC1604130rqV;
import X.AbstractC19391210ti;
import X.AbstractC19392310tt;
import X.C01GW;
import X.C07HE;
import X.C0BVS;
import X.C0C64;
import X.C0WZX;
import X.C0XQ7;
import X.C109300bD;
import X.C1210990hcP;
import X.C1211000hcQ;
import X.C13BV;
import X.C1697810uHb;
import X.C1873590yr7;
import X.C18ZN;
import X.C19386010ss;
import X.C19386110st;
import X.C19386410sw;
import X.C19390510tb;
import X.C19390710td;
import X.C19391610tm;
import X.C19391710tn;
import X.C19391810to;
import X.C19391910tp;
import X.C19392010tq;
import X.C19392210ts;
import X.C19392510tv;
import X.C19392910tz;
import X.C19719612Di;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C23250099c;
import X.C2434009gI;
import X.C279750Axp;
import X.C318501Lj;
import X.C452501pT;
import X.C587650N3b;
import X.C7740030o;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1364105Vn;
import X.InterfaceC1390750mIL;
import X.InterfaceC19391310tj;
import X.InterfaceC19392410tu;
import X.InterfaceC497601wk;
import Y.ALAdapterS23S0200000_29;
import Y.ALAdapterS24S0100000_29;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pipfeed.assem.PipFeedMainActivityAssem;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS113S1000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class PipFeedManager implements InterfaceC1390750mIL, C18ZN {
    public String currentPipScene;
    public long enterBackgroundTime;
    public boolean initialized;
    public boolean initializedComplianceSettings;
    public boolean isInPipMode;
    public Boolean isPipEnabled;
    public AbstractC19391210ti pipFeedWindow;
    public boolean playerControllerNeedReportExtraRenderEvent;
    public boolean topActivityWillFinish;
    public long uiFirstDrawTime;
    public static final C19386010ss Companion = new Object() { // from class: X.10ss
    };
    public static final List<String> sceneWhiteList = Collections.singletonList("For You");
    public static final List<Integer> bannedAudioModes = C1697810uHb.LJIIJJI(2, 3, 1);
    public final C01GW _keva$delegate = C452501pT.LIZIZ(new C19392210ts());
    public final CopyOnWriteArrayList<InterfaceC19392410tu> callbacks = new CopyOnWriteArrayList<>();
    public boolean isColdBoot = true;
    public String exitReason = "click_back_icon";
    public final C01GW complianceBusinessService$delegate = C452501pT.LIZIZ(new C19391810to());
    public final C01GW complianceSettingsService$delegate = C452501pT.LIZIZ(new C19391910tp());
    public final C01GW commendFeedService$delegate = C452501pT.LIZIZ(new C19391710tn());
    public final C01GW audioManager$delegate = C452501pT.LIZIZ(new C19391610tm());
    public final List<Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object>> pendingBlocks = new ArrayList();
    public final List<Function0<Unit>> enterBackgroundListeners = new ArrayList();
    public final C01GW handler$delegate = C452501pT.LIZIZ(new C19392010tq());
    public final Runnable startOneShotPipRunnable = new Runnable() { // from class: X.0sGH
        public final void LIZ() {
            this.LL.getLogs().LJIIIZ("Starting One-session pip check");
            this.LL.isPipEnabled = Boolean.TRUE;
            PipFeedMainActivityAssem pipFeedMainActivityAssem = PipFeedMainActivityAssem.LLILLL.get();
            if (pipFeedMainActivityAssem != null && pipFeedMainActivityAssem.bo(true) && this.LL.canStartPipNow$pipfeed_release(false)) {
                ActivityStack.getTopActivity().moveTaskToBack(false);
                this.LL.getLogs().LJIIIZ("moveTaskToBack success");
            } else {
                this.LL.setPipEnabled$pipfeed_release(false);
                this.LL.reportCanStartPipNotError();
                this.LL.getLogs().LJIILL("moveTaskToBack fail");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("PipFeedManager@256a.startOneShotPipRunnable$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("PipFeedManager@256a.startOneShotPipRunnable$1");
        }
    };
    public final C01GW logs$delegate = C587650N3b.LIZ("PIPMGR");

    public final boolean isCurrentSceneEligible$pipfeed_release() {
        return true;
    }

    @Override // X.C18ZN
    public void onAppForeground() {
        this.topActivityWillFinish = false;
        if (this.isColdBoot) {
            this.isColdBoot = false;
        } else if (isPipEnabled$pipfeed_release()) {
            closePipWindow("click_back_icon");
        }
    }

    public final void onAppQuit$pipfeed_release() {
        this.topActivityWillFinish = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void reportCanStartPipNotError() {
        /*
            r6 = this;
            r5 = 1
            boolean r0 = r6.canStartPipNow$pipfeed_release(r5)
            if (r0 != 0) goto L1f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "startOneShotPipRunnable error - managerCanStartPipInfo: "
            r1.append(r0)
            java.lang.String r0 = r6.canStartPipNowInfo()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1AF0.LIZJ(r0)
            return
        L1f:
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "startOneShotPipRunnable error - assemCanStartPipInfo: "
            r4.append(r0)
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.pipfeed.assem.PipFeedMainActivityAssem> r0 = com.ss.android.ugc.aweme.pipfeed.assem.PipFeedMainActivityAssem.LLILLL
            java.lang.Object r3 = r0.get()
            com.ss.android.ugc.aweme.pipfeed.assem.PipFeedMainActivityAssem r3 = (com.ss.android.ugc.aweme.pipfeed.assem.PipFeedMainActivityAssem) r3
            if (r3 == 0) goto L64
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isIMainActivity: "
            r2.append(r0)
            X.0mCc r0 = X.C1906580ziK.LJ()
            r1 = 0
            if (r0 == 0) goto L44
            java.lang.Object r1 = r0.LIZ
        L44:
            boolean r0 = r1 instanceof X.InterfaceC1603190roz
            if (r0 == 0) goto L71
            if (r1 == 0) goto L71
        L4a:
            r2.append(r5)
            java.lang.String r0 = ", isUnderWhitelistScene: "
            r2.append(r0)
            boolean r0 = r3.m303do()
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            if (r0 != 0) goto L66
        L64:
            java.lang.String r0 = ""
        L66:
            r4.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r4)
            X.C1AF0.LIZJ(r0)
            return
        L71:
            r5 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipfeed.PipFeedManager.reportCanStartPipNotError():void");
    }

    private final AudioManager getAudioManager() {
        return (AudioManager) this.audioManager$delegate.getValue();
    }

    private final FeedCommonService getCommendFeedService() {
        return (FeedCommonService) this.commendFeedService$delegate.getValue();
    }

    private final IComplianceBusinessService getComplianceBusinessService() {
        return (IComplianceBusinessService) this.complianceBusinessService$delegate.getValue();
    }

    private final IComplianceSettingsService getComplianceSettingsService() {
        return (IComplianceSettingsService) this.complianceSettingsService$delegate.getValue();
    }

    private final Keva get_keva() {
        return (Keva) this._keva$delegate.getValue();
    }

    private final void onWindowShowed() {
        this.exitReason = "click_exit_app";
        Iterator<InterfaceC19392410tu> it2 = this.callbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        get_keva().storeBoolean("has_opened_pip", true);
        get_keva().storeBoolean("last_session_reported_exit", false);
        runWhenThisWindowClose$pipfeed_release(new AwS573S0100000_29(this, 172));
    }

    private final void relaunchApp() {
        C844470XAv.LIZ.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "//main");
        smartRouteBuildRoute.withParam("enter_from_pip", true);
        smartRouteBuildRoute.withParam("enter_from_pip_recreate_activity", true);
        smartRouteBuildRoute.open();
        getLogs().LJIIJJI(AFwS218S0000000_29.get$arr$(115));
    }

    public final Handler getHandler() {
        return (Handler) this.handler$delegate.getValue();
    }

    public final AbstractC1604130rqV getLogs() {
        return (AbstractC1604130rqV) this.logs$delegate.getValue();
    }

    public final boolean getPlayerControllerNeedReportExtraRenderEvent$pipfeed_release() {
        if (!this.playerControllerNeedReportExtraRenderEvent) {
            return false;
        }
        this.playerControllerNeedReportExtraRenderEvent = false;
        return true;
    }

    public final void initPip() {
        if (this.initialized) {
            return;
        }
        AbstractC1604130rqV logs = getLogs();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[initPip] ");
        sbLIZ.append(System.currentTimeMillis());
        logs.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        ActivityStack.addAppBackGroundListener(this);
        synchronized (this) {
            try {
                this.initialized = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        checkReportLastSessionExit();
    }

    public final boolean isPipEnabled$pipfeed_release() {
        if (this.isPipEnabled == null) {
            this.isPipEnabled = C0BVS.LIZ() ? Boolean.FALSE : Boolean.valueOf(get_keva().getBoolean("enable_pip", false));
        }
        Boolean bool = this.isPipEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean isWindowShowing$pipfeed_release() {
        return this.pipFeedWindow != null;
    }

    public final void onPrevActivityDestroyed$pipfeed_release() {
        closePipWindow("click_exit_app");
        AbstractC1604130rqV logs = getLogs();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("activity is recycled during pip: ");
        sbLIZ.append(ActivityStack.getTopActivity());
        logs.LJIILL(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void reportFirstVideoReady$pipfeed_release() {
        long j = this.uiFirstDrawTime;
        long j2 = this.enterBackgroundTime;
        if (1 > j2 || j2 >= j) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.enterBackgroundTime;
        long j4 = jElapsedRealtime - j3;
        long j5 = this.uiFirstDrawTime - j3;
        C20684815ws.LJIILLIIL("first_floating_window_show_duration", C2097608Jq.LJIIIIZZ(new Pair("total_duration", String.valueOf(j4)), new Pair("ui_duration", String.valueOf(j5)), new Pair("first_frame_duration", String.valueOf(j4 - j5))));
    }

    private final String canStartPipNowInfo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPrevActivityAvailable: ");
        sbLIZ.append(isPrevActivityAvailable());
        sbLIZ.append(", hasOverlaysPermission: ");
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C1873590yr7.LIZ(C844470XAv.LIZ()));
        sbLIZ.append(", isPipFeedExpHit: ");
        sbLIZ.append(C07HE.LIZ());
        sbLIZ.append(", !isAnyCompliancePopupShowing: ");
        sbLIZ.append(!getComplianceBusinessService().LJJIJ());
        sbLIZ.append(", isAccountEligible: ");
        sbLIZ.append(isAccountEligible());
        sbLIZ.append(", initializedComplianceSettings: ");
        sbLIZ.append(this.initializedComplianceSettings);
        sbLIZ.append(", !isSurveyDialogShowing: ");
        sbLIZ.append(!getCommendFeedService().LJI());
        sbLIZ.append(", !bannedAudioModes: ");
        sbLIZ.append(!bannedAudioModes.contains(Integer.valueOf(getAudioManager().getMode())));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final void checkReportLastSessionExit() {
        Double d;
        Double d2;
        int iDoubleValue = 0;
        if (!get_keva().getBoolean("last_session_reported_exit", false)) {
            Map map = (Map) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), get_keva().getString("last_session_record", "{}"), (Type) Map.class);
            Object obj = map.get("video_cnt");
            if ((obj instanceof Double) && (d2 = (Double) obj) != null) {
                iDoubleValue = (int) d2.doubleValue();
            }
            Object obj2 = map.get("duration");
            long jDoubleValue = (!(obj2 instanceof Double) || (d = (Double) obj2) == null) ? 0L : (long) d.doubleValue();
            if (iDoubleValue > 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("video_cnt", Integer.valueOf(iDoubleValue));
                linkedHashMap.put("duration", Long.valueOf(jDoubleValue));
                reportExitFloatingWindow$pipfeed_release(linkedHashMap);
            }
        }
        get_keva().storeString("last_session_record", "{}");
    }

    private final boolean isAccountEligible() {
        return C0XQ7.LJFF().isLogin();
    }

    private final boolean isPrevActivityAvailable() {
        Activity topActivity = ActivityStack.getTopActivity();
        return (this.topActivityWillFinish || topActivity == null || topActivity.isFinishing()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.10tl, android.view.ViewGroup] */
    private final void tryShowWindow() throws Exception {
        if (ActivityStack.getTopActivity() == null) {
            return;
        }
        C844470XAv.LIZ.getClass();
        final C19390710td c19390710td = new C19390710td(C844470XAv.LIZ());
        if (C2204961BRm.LLILZIL(c19390710td.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5nL2TYONO64gPMGyylufc3w+dHw97Tc46J4", null)).getState() != 2) {
            c19390710td.LJFF().LJ("[showWindow] called when screen is off");
            if (C279750Axp.LIZ()) {
                setPipEnabled$pipfeed_release(false);
            }
            c19390710td.LIZIZ();
            return;
        }
        Iterator it2 = ((ArrayList) c19390710td.LJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC19391310tj) it2.next()).LIZIZ();
        }
        if (c19390710td.LJFF == null) {
            c19390710td.LIZJ = new C19386110st(c19390710td, c19390710td.LJIJJLI);
            C19390510tb c19390510tbLJIIJ = c19390710td.LJIIJ(c19390710td.LIZ);
            final Context context = c19390710td.LIZ;
            ?? r1 = new FrameLayout(c19390710td, context) { // from class: X.10tl
                public float LL;
                public int LLILLJJLI;
                public float LLILLL;
                public float LLILZ;
                public final int LLILZIL;
                public final /* synthetic */ AbstractC19391210ti LLILZLL;

                @Override // android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0) {
                        if (actionMasked != 2 || Math.abs(this.LL - motionEvent.getX()) < this.LLILZIL) {
                            return false;
                        }
                        return true;
                    }
                    this.LLILLJJLI = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.LL = motionEvent.getX(motionEvent.getActionIndex());
                    motionEvent.getY(motionEvent.getActionIndex());
                    return false;
                }

                @Override // android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    int i;
                    int i2;
                    int rawX;
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0) {
                        final boolean z = true;
                        int rawY = 0;
                        if (actionMasked != 1) {
                            if (actionMasked == 2 && motionEvent.findPointerIndex(this.LLILLJJLI) >= 0) {
                                if (this.LLILLL < 0.0f) {
                                    rawX = 0;
                                } else {
                                    rawX = (int) (((int) motionEvent.getRawX()) - this.LLILLL);
                                }
                                if (this.LLILZ >= 0.0f) {
                                    rawY = (int) (((int) motionEvent.getRawY()) - this.LLILZ);
                                }
                                AbstractC19391210ti abstractC19391210ti = this.LLILZLL;
                                abstractC19391210ti.getClass();
                                Point point = new Point(abstractC19391210ti.LJIIIIZZ);
                                point.offset(rawX, rawY);
                                abstractC19391210ti.LJI(point);
                                this.LLILLL = motionEvent.getRawX();
                                this.LLILZ = motionEvent.getRawY();
                            }
                        } else {
                            this.LLILLL = -1.0f;
                            this.LLILZ = -1.0f;
                            final AbstractC19391210ti abstractC19391210ti2 = this.LLILZLL;
                            int i3 = abstractC19391210ti2.LJIIIIZZ.x;
                            C19386110st c19386110st = abstractC19391210ti2.LIZJ;
                            if (c19386110st == null) {
                                c19386110st = null;
                            }
                            if (i3 + (c19386110st.LIZJ() / 2) <= abstractC19391210ti2.LJIIJ / 2) {
                                i = abstractC19391210ti2.LJIIIIZZ.x;
                                i2 = abstractC19391210ti2.LIZLLL.left;
                            } else {
                                z = false;
                                i = abstractC19391210ti2.LIZLLL.right;
                                i2 = abstractC19391210ti2.LJIIIIZZ.x;
                            }
                            final int i4 = i - i2;
                            final Point point2 = new Point(abstractC19391210ti2.LJIIIIZZ);
                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
                            duration.setInterpolator(C1619980sG4.LIZLLL());
                            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.10tk
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    if (z) {
                                        AbstractC19391210ti abstractC19391210ti3 = abstractC19391210ti2;
                                        Point point3 = point2;
                                        abstractC19391210ti3.LJI(new Point(point3.x - ((int) (i4 * fFloatValue)), point3.y));
                                    } else {
                                        AbstractC19391210ti abstractC19391210ti4 = abstractC19391210ti2;
                                        Point point4 = point2;
                                        abstractC19391210ti4.LJI(new Point(point4.x + ((int) (i4 * fFloatValue)), point4.y));
                                    }
                                }
                            });
                            duration.addListener(new ALAdapterS24S0100000_29(abstractC19391210ti2, 31));
                            duration.addListener(new ALAdapterS23S0200000_29(abstractC19391210ti2, duration, 22));
                            duration.start();
                            abstractC19391210ti2.LJIIIZ = z;
                        }
                    } else {
                        this.LLILLJJLI = motionEvent.getPointerId(motionEvent.getActionIndex());
                    }
                    return super.onTouchEvent(motionEvent);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(context);
                    this.LLILLL = -1.0f;
                    this.LLILZ = -1.0f;
                    this.LLILZIL = ViewConfiguration.get(context).getScaledTouchSlop();
                }

                @Override // android.widget.FrameLayout, android.view.View
                public final void onMeasure(int i, int i2) {
                    super.onMeasure(i, i2);
                    this.LLILZLL.LJIIIIZZ(getMeasuredWidth(), getMeasuredHeight());
                }

                @Override // android.view.View
                public final void onSizeChanged(int i, int i2, int i3, int i4) {
                    super.onSizeChanged(i, i2, i3, i4);
                    this.LLILZLL.LJIIIIZZ(i, i2);
                }
            };
            r1.addView(c19390510tbLJIIJ);
            c19390710td.LJFF = r1;
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            c19390710td.LJIIIZ(null);
            C19386110st c19386110st = c19390710td.LIZJ;
            if (c19386110st == null) {
                c19386110st = null;
            }
            int iLIZJ = c19386110st.LIZJ();
            C19386110st c19386110st2 = c19390710td.LIZJ;
            if (c19386110st2 == null) {
                c19386110st2 = null;
            }
            c19390710td.LJIIIIZZ(iLIZJ, c19386110st2.LIZ());
            layoutParams.type = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
            layoutParams.format = 1;
            layoutParams.gravity = 51;
            layoutParams.flags = 552;
            C19386110st c19386110st3 = c19390710td.LIZJ;
            if (c19386110st3 == null) {
                c19386110st3 = null;
            }
            layoutParams.width = c19386110st3.LIZJ();
            C19386110st c19386110st4 = c19390710td.LIZJ;
            if (c19386110st4 == null) {
                c19386110st4 = null;
            }
            layoutParams.height = c19386110st4.LIZ();
            c19390710td.LJIIJJI(layoutParams);
            c19390710td.LIZIZ.addView(c19390710td.LJFF, layoutParams);
            int i = c19390710td.LJIIJJI;
            int i2 = c19390710td.LJIIL;
            c19390710td.LJIILJJIL = (c19390710td.LJIIIIZZ.y - i2) / ((i - i2) - c19390710td.LJIILIIL);
            AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(c19390710td, 1104);
            ArrayList arrayList = (ArrayList) C2434009gI.LIZIZ;
            arrayList.add(awS573S0100000_29);
            if (arrayList.size() == 1) {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                BroadcastReceiver broadcastReceiver = (BroadcastReceiver) C2434009gI.LIZ.getValue();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
                C786410Ut5.LJIJJ(contextLIZ, broadcastReceiver, intentFilter);
            }
            AbstractC1604130rqV abstractC1604130rqVLJFF = c19390710td.LJFF();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[ShowWindow] size: ");
            C19386110st c19386110st5 = c19390710td.LIZJ;
            sbLIZ.append(c19386110st5 != null ? c19386110st5 : null);
            sbLIZ.append(" rel_position: ");
            sbLIZ.append(c19390710td.LJIILJJIL);
            abstractC1604130rqVLJFF.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.pipFeedWindow = c19390710td;
        onWindowShowed();
    }

    public final Keva getKeva() {
        return get_keva();
    }

    @Override // X.C18ZN
    public void onAppBackground() throws Exception {
        C19392910tz c19392910tz;
        this.enterBackgroundTime = SystemClock.elapsedRealtime();
        Iterator<Function0<Unit>> it2 = this.enterBackgroundListeners.iterator();
        while (it2.hasNext()) {
            it2.next().invoke();
        }
        this.enterBackgroundListeners.clear();
        if (!canStartPipNow$pipfeed_release(false)) {
            getLogs().LJIILL("show pip window fail");
            return;
        }
        this.isInPipMode = true;
        tryShowWindow();
        for (Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> function2 : this.pendingBlocks) {
            AbstractC19391210ti abstractC19391210ti = this.pipFeedWindow;
            if (abstractC19391210ti != null && (c19392910tz = abstractC19391210ti.LJII) != null) {
                ((ArrayList) c19392910tz.LLILLJJLI).add(C23250099c.LIZLLL(c19392910tz, null, null, new C318501Lj(function2, c19392910tz, null), 3));
            }
        }
        this.pendingBlocks.clear();
        getLogs().LJIIIZ("show pip window success");
    }

    public final void onComplianceTakeDown$pipfeed_release() {
        AbstractC1604130rqV logs = getLogs();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onComplianceTakeDown] isShowing: ");
        sbLIZ.append(isWindowShowing$pipfeed_release());
        logs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (isWindowShowing$pipfeed_release()) {
            closePipWindow("click_exit_app");
        }
    }

    public final void onFetchedComplianceSetting$pipfeed_release() {
        getLogs().LJIIIZ("[onFetchedComplianceSetting] success");
        setInitializedComplianceSettings(true);
    }

    public final void reenterMainApp$pipfeed_release() throws PendingIntent.CanceledException {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null) {
            relaunchApp();
            return;
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Intent intent = new Intent(C844470XAv.LIZ(), topActivity.getClass());
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(131072);
        intent.putExtra("enter_from_pip", true);
        intent.putExtra("enter_from_pip_recreate_activity", false);
        PendingIntent.getActivity(contextLIZ, 0, intent, Build.VERSION.SDK_INT >= 31 ? 335544320 : 268435456).send();
        closePipWindow("click_back_icon");
        getLogs().LJIIJJI(AFwS218S0000000_29.get$arr$(114));
    }

    public final void reportViewReady$pipfeed_release() {
        this.uiFirstDrawTime = SystemClock.elapsedRealtime();
    }

    public final CopyOnWriteArrayList<InterfaceC19392410tu> getCallbacks$pipfeed_release() {
        return this.callbacks;
    }

    public final String getExitReason$pipfeed_release() {
        return this.exitReason;
    }

    public final boolean isInPipMode$pipfeed_release() {
        return this.isInPipMode;
    }

    private final void closePipWindow(String str) {
        getLogs().LJIIJJI(new AwS113S1000000_29(str, 0));
        this.exitReason = str;
        AbstractC19391210ti abstractC19391210ti = this.pipFeedWindow;
        if (abstractC19391210ti != null) {
            abstractC19391210ti.LIZIZ();
            Iterator<InterfaceC19392410tu> it2 = this.callbacks.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ();
            }
            C19719612Di.LJJIIJ(this.callbacks, AFwS273S0000000_29.get$arr$(98), true);
        }
        this.pipFeedWindow = null;
        this.isInPipMode = false;
    }

    private final void runWhenEnterBackground(Function0<Unit> function0) {
        this.enterBackgroundListeners.add(function0);
    }

    private final void setInitializedComplianceSettings(boolean z) {
        if (this.initializedComplianceSettings) {
            return;
        }
        this.initializedComplianceSettings = z;
    }

    public final boolean canStartPipNow$pipfeed_release(boolean z) {
        boolean zIsPipEnabled$pipfeed_release;
        boolean zLIZ;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (z) {
            zIsPipEnabled$pipfeed_release = true;
            zLIZ = true;
        } else {
            zIsPipEnabled$pipfeed_release = isPipEnabled$pipfeed_release();
            zLIZ = C1873590yr7.LIZ(contextLIZ);
        }
        if (zIsPipEnabled$pipfeed_release && isCurrentSceneEligible$pipfeed_release() && isPrevActivityAvailable() && zLIZ && C07HE.LIZ() && !getComplianceBusinessService().LJJIJ() && isAccountEligible() && this.initializedComplianceSettings && !getCommendFeedService().LJI() && !bannedAudioModes.contains(Integer.valueOf(getAudioManager().getMode()))) {
            return true;
        }
        return false;
    }

    public final void closeWindowOnly$pipfeed_release(String str) {
        closePipWindow(str);
    }

    public final void launchUtilWindowDestroy$pipfeed_release(Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        C19392910tz c19392910tz;
        AbstractC19391210ti abstractC19391210ti = this.pipFeedWindow;
        if (abstractC19391210ti != null && (c19392910tz = abstractC19391210ti.LJII) != null) {
            ((ArrayList) c19392910tz.LLILLJJLI).add(C23250099c.LIZLLL(c19392910tz, null, null, new C318501Lj(function2, c19392910tz, null), 3));
        } else {
            if (!this.isInPipMode) {
                return;
            }
            this.pendingBlocks.add(function2);
        }
    }

    @Override // X.InterfaceC1390750mIL
    public void onAppBackground(Activity activity) {
        isPipEnabled$pipfeed_release();
    }

    public final void reportExitFloatingWindow$pipfeed_release(Map<String, ? extends Object> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reporting exit with ");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
        AbstractC1604130rqV logs = getLogs();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[CloseWindow] pip session info: ");
        sbLIZ2.append(map);
        logs.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
        C109300bD.LIZ("exit_floating_window_mode", map);
        get_keva().storeBoolean("last_session_reported_exit", true);
    }

    public final void runWhenThisWindowClose$pipfeed_release(final Function0<Unit> function0) {
        this.callbacks.add(new AbstractC19392310tt() { // from class: X.10tr
            @Override // X.InterfaceC19392410tu
            public final void LIZIZ() {
                function0.invoke();
            }
        });
    }

    public final void setPipEnabled$pipfeed_release(boolean z) {
        this.isPipEnabled = Boolean.valueOf(z);
        get_keva().storeBoolean("enable_pip", z);
    }

    public final void setPlayerControllerNeedReportExtraRenderEvent$pipfeed_release(boolean z) {
        if (z) {
            this.playerControllerNeedReportExtraRenderEvent = true;
        }
    }

    public final void setScene$pipfeed_release(String str) {
        this.currentPipScene = str;
    }

    public final void startPipByEnterBackground$pipfeed_release(long j) {
        if (j > 0) {
            runWhenEnterBackground(new AwS573S0100000_29(this, 173));
        }
        getHandler().removeCallbacks(this.startOneShotPipRunnable);
        C786410Ut5.LJLIIL(j, getHandler(), this.startOneShotPipRunnable);
    }

    public final boolean shouldShowInLongPress(String str, Aweme aweme) {
        PipFeedMainActivityAssem pipFeedMainActivityAssem;
        if (!C07HE.LIZIZ() ? C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_pip_feed", false) == 1 : C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_pip_feed_pad", false) == 1) {
            if (C07HE.LIZ()) {
                List<String> list = sceneWhiteList;
                ArrayList arrayList = new ArrayList();
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    List<String> list2 = C19392510tv.LIZJ.get(it2.next());
                    if (list2 == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    C19719612Di.LJJI(list2, arrayList);
                }
                if (!arrayList.contains(str)) {
                    getLogs().LJIJ(new AwS113S1000000_29(str, 1));
                    return false;
                }
                if (aweme != null && !aweme.isAd()) {
                    if (!isCurrentSceneEligible$pipfeed_release()) {
                        getLogs().LJIJ(AFwS218S0000000_29.get$arr$(117));
                        return false;
                    }
                    if (C0BVS.LIZ()) {
                        CopyOnWriteArrayList<C1210990hcP> copyOnWriteArrayList = FeedPipViewModel.LLJJJIL;
                        boolean zLIZ = C1211000hcQ.LIZ(aweme);
                        getLogs().LJIIJJI(new C19386410sw(zLIZ));
                        if (!zLIZ) {
                            getLogs().LJIJ(AFwS218S0000000_29.get$arr$(118));
                            return false;
                        }
                        if (C0C64.LJIILLIIL().LJIIIZ(31744, "feed_pip_show_condition_exp", true, false) && C0BVS.LIZ() && (!canStartPipNow$pipfeed_release(true) || (pipFeedMainActivityAssem = PipFeedMainActivityAssem.LLILLL.get()) == null || !pipFeedMainActivityAssem.bo(true))) {
                            getLogs().LJIJ(AFwS218S0000000_29.get$arr$(119));
                            reportCanStartPipNotError();
                            return false;
                        }
                    }
                    return true;
                }
                getLogs().LJIIJ("aweme not available", aweme);
                return false;
            }
        }
        getLogs().LJIJ(AFwS218S0000000_29.get$arr$(116));
        return false;
    }
}
