package com.ss.android.ugc.aweme.creatortools;

import X.AbstractC19318610i0;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0C1P;
import X.C0C64;
import X.C0CHQ;
import X.C0CNI;
import X.C0SCM;
import X.C0TAV;
import X.C0XQ7;
import X.C10EU;
import X.C11NJ;
import X.C1238750iLB;
import X.C1238760iLC;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C14EU;
import X.C1697810uHb;
import X.C19292410dm;
import X.C19292910dr;
import X.C19318810i2;
import X.C19319010i4;
import X.C19319110i5;
import X.C19319810iC;
import X.C19323610io;
import X.C1944507jX;
import X.C1944607jY;
import X.C20684815ws;
import X.C2222691Bz1;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C299020Bno;
import X.C306500Bzs;
import X.C312880COg;
import X.C335910DEv;
import X.C419910GdJ;
import X.C452501pT;
import X.EnumC1430380nKG;
import X.EnumC335920DEw;
import X.InterfaceC20673515v3;
import X.InterfaceC493680JXq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.anchor.service.IAnchorListService;
import com.ss.android.ugc.aweme.check.IAutoSoundCheckService;
import com.ss.android.ugc.aweme.creatortools.api.ShowCaseModel;
import com.ss.android.ugc.aweme.creatortools.tiktokseries.SeriesSetting;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS111S1200000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class CreatorToolsActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiY+LC4nHELIOSJzc4JiA/O2sPOyoyPCo+HSA8JDYNKjs6Piw4MA==";
    public ViewOnAttachStateChangeListenerC20604515jv LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public C1390410mHn LLILZIL;
    public TuxNavBar LLILZLL;
    public ConstraintLayout LLIZ;
    public boolean LLJI;
    public InterfaceC493680JXq LLJILJIL;
    public final boolean LLJILLL;
    public final boolean LLJJ;
    public final String LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public C1238760iLC LLJJIJIIJIL;
    public C1238760iLC LLJJIJIL;
    public C1238760iLC LLJJJ;
    public C1238760iLC LLJJJIL;
    public C1238760iLC LLJJJJ;
    public C19319110i5 LLJJJJJIL;
    public C19319110i5 LLJJJJLIIL;
    public C1238760iLC LLJJL;
    public C1238760iLC LLJJLIIIJLLLLLLLZ;
    public C1238760iLC LLJL;
    public C1238760iLC LLJLIL;
    public C19292910dr LLJLILLLLZIIL;
    public C19292910dr LLJLL;
    public C1238760iLC LLJLLIL;
    public C0TAV LLJLLL;
    public C1238760iLC LLJZ;
    public C1238760iLC LLJZIJLIL;
    public C0SCM LLL;
    public String LLIZLLLIL = "";
    public final C11NJ LLJ = new C11NJ();
    public boolean LLJIJIL = true;
    public final Map<String, String> LLJILJILJ = new LinkedHashMap();

    public final void LLLZIL() {
        boolean adAuthorization = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAdAuthorization();
        C19318810i2 c19318810i2LLLZ = LLLZ();
        C19292910dr c19292910dr = new C19292910dr(new C19319810iC(adAuthorization, getString(2131836779), new ACListenerS162S0100000_28(this, 47), true, null, null, null, getString(2131836780), false, false, false, null, 130032));
        this.LLJLILLLLZIIL = c19292910dr;
        c19318810i2LLLZ.LIZ(c19292910dr);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final TuxNavBar LLLLZI() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f7r);
            this.LLILZLL = (TuxNavBar) callbackFindViewById;
        }
        return (TuxNavBar) callbackFindViewById;
    }

    public final TuxTextView LLLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f7y);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1390410mHn LLLLZLL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nl1);
            this.LLILZIL = (C1390410mHn) callbackFindViewById;
        }
        return (C1390410mHn) callbackFindViewById;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rn0);
            this.LL = (ViewOnAttachStateChangeListenerC20604515jv) callbackFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) callbackFindViewById;
    }

    public final ConstraintLayout LLLLZLLLI() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tqy);
            this.LLIZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C19318810i2 LLLZ() {
        return (C19318810i2) this.LLJJIJI.getValue();
    }

    public final void LLLZZIL() {
        C19318810i2 c19318810i2LLLZ = LLLZ();
        String string = getString(2131830351);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_dollar_sign_fill;
        C1238760iLC c1238760iLC = new C1238760iLC(new C19323610io(string, c419910GdJ, null, null, false, null, null, null, false, false, null, null, false, false, null, null, null, 16777212));
        this.LLJJLIIIJLLLLLLLZ = c1238760iLC;
        c19318810i2LLLZ.LIZ(c1238760iLC);
        String str = "";
        try {
            SettingsManager.LIZLLL().getClass();
            String strLJI = SettingsManager.LJI("creator_fund_setting_entry_schema", "");
            if (strLJI != null) {
                str = strLJI;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2344809Gs.LJ("creator_fund_investigate action = creator_fund_setting_entry_schema_error, throwable = " + th.getMessage());
        }
        C2344809Gs.LJ("creator_fund_investigate action = creator_fund_setting_entry_schema, content = ".concat(str));
        C1944607jY c1944607jYLIZ = C1944507jX.LIZ(str);
        if (C10EU.LJIIIIZZ() || TextUtils.isEmpty(str)) {
            C1238760iLC c1238760iLC2 = this.LLJJLIIIJLLLLLLLZ;
            if (c1238760iLC2 != null) {
                c1238760iLC2.LJI(AFwS271S0000000_28.get$arr$(88));
                return;
            }
            return;
        }
        C1238760iLC c1238760iLC3 = this.LLJJLIIIJLLLLLLLZ;
        if (c1238760iLC3 != null) {
            c1238760iLC3.LJI(new AwS394S0200000_28(c1944607jYLIZ, this, 18));
        }
        this.LLJIJIL = false;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "creator_account");
        c2344009Gk.LJIIIIZZ("process_id", this.LLIZLLLIL);
        C20684815ws.LJIILLIIL("show_creator_fund_cell", c2344009Gk.LIZ);
        LLZZLLIL("creator_fund_show");
    }

    public final void LLZ() {
        C312880COg.LIZ.getClass();
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        boolean z = curUser != null && curUser.shoutoutsStatus / 100 > 0;
        C19318810i2 c19318810i2LLLZ = LLLZ();
        String string = getString(2131848223);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_shoutouts_fill;
        c19318810i2LLLZ.LIZ(new C1238760iLC(new C19323610io(string, c419910GdJ, new ACListenerS162S0100000_28(this, 48), null, z, null, null, null, false, false, null, null, false, false, null, null, null, 16777192)));
        if (z) {
            this.LLJIJIL = false;
            LLZZLLIL("tiktok_shoutouts_show");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0b2c  */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r13v10, types: [X.0hlc, android.view.View, android.view.View$OnClickListener, com.bytedance.tux.status.loading.TuxSpinner, java.lang.Integer, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.0hlc, android.view.View, android.view.View$OnClickListener, com.bytedance.tux.status.loading.TuxSpinner, java.lang.Integer, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [T, X.0hlc, android.view.View, android.view.View$OnClickListener, com.bytedance.tux.status.loading.TuxSpinner, java.lang.CharSequence, java.lang.Integer, java.lang.Object, java.lang.String, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v9, types: [X.0hlc, android.view.View, android.view.View$OnClickListener, com.bytedance.tux.status.loading.TuxSpinner, java.lang.Integer, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v21, types: [X.10dd] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, X.0mHn] */
    /* JADX WARN: Type inference failed for: r22v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r23v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r24v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r25v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v118 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v90, types: [T] */
    /* JADX WARN: Type inference failed for: r5v129 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58, types: [X.0JSu, X.0JXq] */
    /* JADX WARN: Type inference failed for: r6v15, types: [X.0tAW] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZZ() {
        /*
            Method dump skipped, instruction units count: 2869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.LLZZ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r7 = this;
            java.lang.String r5 = "com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity"
            java.lang.String r4 = "onResume"
            r6 = 1
            com.bytedance.apm.agent.v2.instrumentation.ActivityAgent.onTrace(r5, r4, r6)
            super.onResume()
            X.0iLC r1 = r7.LLJJL
            if (r1 == 0) goto L18
            r0 = 419(0x1a3, float:5.87E-43)
            kotlin.jvm.internal.AFwS271S0000000_28 r0 = kotlin.jvm.internal.AFwS271S0000000_28.get$arr$(r0)
            r1.LJI(r0)
        L18:
            X.0iLC r1 = r7.LLJJIJIIJIL
            if (r1 == 0) goto L25
            r0 = 417(0x1a1, float:5.84E-43)
            kotlin.jvm.internal.AFwS271S0000000_28 r0 = kotlin.jvm.internal.AFwS271S0000000_28.get$arr$(r0)
            r1.LJI(r0)
        L25:
            X.0iLC r1 = r7.LLJLIL
            if (r1 == 0) goto L32
            r0 = 423(0x1a7, float:5.93E-43)
            kotlin.jvm.internal.AFwS271S0000000_28 r0 = kotlin.jvm.internal.AFwS271S0000000_28.get$arr$(r0)
            r1.LJI(r0)
        L32:
            X.0iLC r1 = r7.LLJLLIL
            if (r1 == 0) goto L3f
            r0 = 420(0x1a4, float:5.89E-43)
            kotlin.jvm.internal.AFwS271S0000000_28 r0 = kotlin.jvm.internal.AFwS271S0000000_28.get$arr$(r0)
            r1.LJI(r0)
        L3f:
            X.0TAV r0 = r7.LLJLLL
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusViewModel r0 = r0.LIZ()
            r0.vQ2()
        L4a:
            com.ss.android.ugc.aweme.creatortools.tiktokseries.SeriesSetting r0 = X.C0C1P.LIZ()
            r3 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r0.showRedDot
            if (r0 == 0) goto Lac
            X.0CNI r0 = X.C0CNI.LIZ
            r0.getClass()
            boolean r0 = X.C0CNI.LIZ()
            if (r0 == 0) goto Lac
        L60:
            X.0iLC r2 = r7.LLJZ
            if (r2 == 0) goto L6e
            kotlin.jvm.internal.AwS40S0010000_28 r1 = new kotlin.jvm.internal.AwS40S0010000_28
            r0 = 31
            r1.<init>(r6, r0)
            r2.LJI(r1)
        L6e:
            X.0iLC r2 = r7.LLJJIJIL
            if (r2 == 0) goto L7c
            kotlin.jvm.internal.AwS607S0100000_28 r1 = new kotlin.jvm.internal.AwS607S0100000_28
            r0 = 355(0x163, float:4.97E-43)
            r1.<init>(r7, r0)
            r2.LJI(r1)
        L7c:
            boolean r0 = r7.LLJILLL
            if (r0 == 0) goto L92
            X.0iLC r1 = r7.LLJJJ
            if (r1 == 0) goto L8d
            r0 = 349(0x15d, float:4.89E-43)
            kotlin.jvm.internal.AFwS237S0000000_7 r0 = kotlin.jvm.internal.AFwS237S0000000_7.get$arr$(r0)
            r1.LJI(r0)
        L8d:
            java.lang.String r0 = "show"
            LLZZZIL(r0)
        L92:
            com.ss.android.ugc.aweme.services.ArticleModeService r0 = com.ss.android.ugc.aweme.services.ArticleModeService.INSTANCE
            com.ss.android.ugc.aweme.services.IArticleModeRssService r2 = r0.getArticleRssService()
            boolean r0 = r2.isArticleRssCreationEnabled()
            if (r0 == 0) goto La8
            kotlin.jvm.internal.AwS394S0200000_28 r1 = new kotlin.jvm.internal.AwS394S0200000_28
            r0 = 92
            r1.<init>(r7, r2, r0)
            r2.fetchRssUser(r7, r1)
        La8:
            com.bytedance.apm.agent.v2.instrumentation.ActivityAgent.onTrace(r5, r4, r3)
            return
        Lac:
            r6 = 0
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.onResume():void");
    }

    public CreatorToolsActivity() {
        String strB6;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC20673515v3 interfaceC20673515v3K42;
        String str = "";
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        boolean zLJFF = false;
        this.LLJILLL = (iLiveOuterService == null || (interfaceC20673515v3K42 = iLiveOuterService.k4()) == null) ? false : Intrinsics.LJFF(interfaceC20673515v3K42.LJJLIL(), Boolean.TRUE);
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService2 != null && (interfaceC20673515v3K4 = iLiveOuterService2.k4()) != null) {
            zLJFF = Intrinsics.LJFF(interfaceC20673515v3K4.LJIIIIZZ(), Boolean.TRUE);
        }
        this.LLJJ = zLJFF;
        ILiveOuterService iLiveOuterService3 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService3 != null && (strB6 = iLiveOuterService3.b6()) != null) {
            str = strB6;
        }
        this.LLJJI = str;
        this.LLJJIII = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(140));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 181));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLZLZ() {
        boolean zLIZIZ = ((IAnchorListService) ServiceManager.get().getService(IAnchorListService.class)).LIZIZ(EnumC1430380nKG.ANCHOR_SHOP_LINK.getTYPE());
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser == null || !currentUser.LJI() || !C0C64.LJIILLIIL().LJIIIZ(31744, "enable_sub_only_video", true, false)) {
            if (!(zLIZIZ ? ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJZZIII() : ((IAutoSoundCheckService) ServiceManager.get().getService(IAutoSoundCheckService.class)).LIZLLL())) {
                return;
            }
        }
        boolean z = true;
        LLLZ().LIZ(new C19319110i5(new C19319010i4(getString(2131837750), z, z, false, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 65528)));
        ((IAutoSoundCheckService) ServiceManager.get().getService(IAutoSoundCheckService.class)).LIZJ(new AwS607S0100000_28(this, 354));
    }

    public final void LLZLI() {
        SeriesSetting seriesSettingLIZ = C0C1P.LIZ();
        if (seriesSettingLIZ == null) {
            return;
        }
        C19318810i2 c19318810i2LLLZ = LLLZ();
        String string = getString(2131847406);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_series_fill;
        C0CNI.LIZ.getClass();
        C1238760iLC c1238760iLC = new C1238760iLC(new C19323610io(string, c419910GdJ, new ACListenerS130S0200000_28(this, seriesSettingLIZ, 19), null, true, null, null, null, false, !C0CNI.LIZ() ? false : seriesSettingLIZ.showRedDot, null, null, false, false, null, null, null, 16776680));
        this.LLJZ = c1238760iLC;
        c19318810i2LLLZ.LIZ(c1238760iLC);
        this.LLJIJIL = false;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
        C20684815ws.LJIILLIIL("paid_content_tab_show", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZLLLL() {
        /*
            r23 = this;
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "nlg_creators"
            java.lang.Class<com.ss.android.ugc.aweme.creatortools.videogift.GiftSettings> r0 = com.ss.android.ugc.aweme.creatortools.videogift.GiftSettings.class
            r2.getClass()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Throwable -> L14
            com.ss.android.ugc.aweme.creatortools.videogift.GiftSettings r0 = (com.ss.android.ugc.aweme.creatortools.videogift.GiftSettings) r0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L18
            goto L1a
        L14:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L18:
            r9 = 0
            goto L1f
        L1a:
            boolean r0 = r0.allowVideoGift
            r9 = 1
            if (r0 != r9) goto L18
        L1f:
            r3 = r23
            X.10i2 r2 = r3.LLLZ()
            r0 = 2131858220(0x7f11932c, float:1.9350222E38)
            java.lang.String r5 = r3.getString(r0)
            X.0GdJ r6 = new X.0GdJ
            r6.<init>()
            r0 = 2130773909(0x7f010795, float:1.7150978E38)
            r6.LIZ = r0
            Y.ACListenerS162S0100000_28 r7 = new Y.ACListenerS162S0100000_28
            r0 = 49
            r7.<init>(r3, r0)
            X.10io r4 = new X.10io
            r8 = 0
            r13 = 0
            r22 = 16777192(0xffffe8, float:2.3509853E-38)
            r1 = r4
            r10 = r8
            r11 = r8
            r12 = r8
            r14 = r13
            r15 = r8
            r16 = r8
            r17 = r13
            r18 = r13
            r19 = r8
            r20 = r8
            r21 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.0iLC r0 = new X.0iLC
            r0.<init>(r1)
            r3.LLJLIL = r0
            r2.LIZ(r0)
            if (r9 == 0) goto L7a
            r3.LLJIJIL = r13
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "settings"
            r2.LJIIIIZZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "show_gifts_for_creators"
            X.C20684815ws.LJIILLIIL(r0, r1)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.LLZLLLL():void");
    }

    public final boolean f() {
        String strG6;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService == null || (strG6 = iLiveOuterService.g6()) == null) {
            strG6 = "";
        }
        return (TextUtils.isEmpty(this.LLJJI) || TextUtils.equals(strG6, this.LLJJI)) ? false : true;
    }

    public final void g() {
        AbstractC19318610i0<?> abstractC19318610i0 = null;
        int i = 0;
        boolean z = false;
        for (AbstractC19318610i0<?> abstractC19318610i02 : LLLZ().LIZJ()) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            AbstractC19318610i0<?> abstractC19318610i03 = abstractC19318610i02;
            if (abstractC19318610i03 instanceof C19319110i5) {
                if (!z && abstractC19318610i0 != null) {
                    abstractC19318610i0.LJFF(false);
                }
                z = false;
                abstractC19318610i0 = abstractC19318610i03;
            } else if (abstractC19318610i03.LIZIZ().LIZ()) {
                z = true;
            }
            i = i2;
        }
    }

    public final String getEnterFrom() {
        Intent intent = getIntent();
        String stringExtra = null;
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("PRO_ENTER_FROM");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return stringExtra == null ? "" : stringExtra;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC493680JXq interfaceC493680JXq = this.LLJILJIL;
        if (interfaceC493680JXq != null) {
            interfaceC493680JXq.onDestroy();
        }
        this.LLJ.LJ();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
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

    public static void LLZZZIL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("livesdk_creator_hub_inapp", c2344009Gk.LIZ);
    }

    public final void LLLLLZL(ShowCaseModel showCaseModel) {
        String lowerCase;
        String str;
        String lowerCase2;
        String str2;
        String str3;
        if (showCaseModel != null && showCaseModel.showEntrance) {
            LLZZLLIL("creator_showcase_show");
            String strLIZIZ = C2222691Bz1.LIZIZ();
            String str4 = "";
            if (strLIZIZ == null || (lowerCase = strLIZIZ.toLowerCase(Locale.getDefault())) == null) {
                lowerCase = "";
            }
            C1238760iLC c1238760iLC = this.LLJL;
            if (c1238760iLC != null) {
                c1238760iLC.LJI(new AwS111S1200000_28(this, showCaseModel, lowerCase, 0));
            }
            String str5 = "no";
            if (showCaseModel.showEntrance) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
                c2344009Gk.LJIIIIZZ("page_name", "creator_tools");
                c2344009Gk.LJIIIIZZ("author_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                c2344009Gk.LJIIIIZZ("country", lowerCase);
                c2344009Gk.LJIIIIZZ("module_for", "tiktok_showcase");
                if (!showCaseModel.havePermission) {
                    str2 = "no";
                } else {
                    str2 = "yes";
                }
                c2344009Gk.LJIIIIZZ("is_onboard_ecom", str2);
                if (!C306500Bzs.LIZ()) {
                    str3 = "no";
                } else {
                    str3 = "yes";
                }
                c2344009Gk.LJIIIIZZ("enable_showcase", str3);
                C20684815ws.LJIILLIIL("tiktokec_creator_tools_module_show", c2344009Gk.LIZ);
            }
            if (!showCaseModel.havePermission) {
                str = "no";
            } else {
                str = "yes";
            }
            String strLIZIZ2 = C2222691Bz1.LIZIZ();
            if (strLIZIZ2 != null && (lowerCase2 = strLIZIZ2.toLowerCase(Locale.getDefault())) != null) {
                str4 = lowerCase2;
            }
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
            c2344009Gk2.LJIIIIZZ("page_name", "creator_tools");
            c2344009Gk2.LJIIIIZZ("author_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            c2344009Gk2.LJIIIIZZ("country", str4);
            c2344009Gk2.LJIIIIZZ("is_onboard_ecom", str);
            if (C306500Bzs.LIZ()) {
                str5 = "yes";
            }
            c2344009Gk2.LJIIIIZZ("enable_showcase", str5);
            C20684815ws.LJIILLIIL("tiktokec_creator_tools_show", c2344009Gk2.LIZ);
            return;
        }
        C1238760iLC c1238760iLC2 = this.LLJL;
        if (c1238760iLC2 == null) {
            return;
        }
        c1238760iLC2.LJI(AFwS271S0000000_28.get$arr$(87));
    }

    public final void LLZZLLIL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onCreate", true);
        activityConfiguration(AFwS271S0000000_28.get$arr$(90));
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setTheme(R.style.my);
        setContentView(R.layout.f5x);
        LLZZ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onCreate", false);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
