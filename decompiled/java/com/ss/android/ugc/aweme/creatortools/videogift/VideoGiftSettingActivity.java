package com.ss.android.ugc.aweme.creatortools.videogift;

import X.AbstractC2126608Uu;
import X.C01GW;
import X.C09JN;
import X.C0CQT;
import X.C0OM1;
import X.C11IR;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1237450iJ5;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C19291110dZ;
import X.C19292910dr;
import X.C19318810i2;
import X.C19319810iC;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.EnumC1913590ztd;
import X.EnumC335920DEw;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AfS197S0100000_28;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftApi;
import com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS114S0110000_28;
import kotlin.jvm.internal.AwS40S0010000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoGiftSettingActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiY+LC4nJzc4JiA/HELIOSO2s6ICs2JyIlLzt9HiwoLCAUISM4GionPCwiLg4wPCw6IDsq";
    public ViewOnAttachStateChangeListenerC20604515jv LL;
    public TuxNavBar LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZLL;
    public User LLIZLLLIL;
    public C19292910dr LLJ;
    public final C11NJ LLILZIL = new C11NJ();
    public String LLIZ = "";
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 182));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        this.LLILZIL.dispose();
        super.onDestroy();
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

    public final void LLLLLZL(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = "gift_setting";
        c2344009Gk.LJIIIIZZ("enter_from", "gift_setting");
        c2344009Gk.LIZJ(i, "is_success");
        if (this.LLILZLL) {
            str = "notification";
        }
        c2344009Gk.LJIIIIZZ("previous_page", str);
        C20684815ws.LJIILLIIL("disable_video_gifting", c2344009Gk.LIZ);
    }

    public final void LLLLZI(int i) {
        String str;
        String str2 = "gift_setting";
        if (!this.LLILLL || this.LLILZ) {
            str = "gift_setting";
        } else {
            this.LLILZ = true;
            str = "video_gift_opt_in";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(i, "is_success");
        if (this.LLILZLL) {
            str2 = "notification";
        }
        c2344009Gk.LJIIIIZZ("previous_page", str2);
        C20684815ws.LJIILLIIL("enable_video_gifting", c2344009Gk.LIZ);
    }

    public final void LLLLZIL(final boolean z) {
        C11NZ<VideoGiftSettingResponse> giftSettings;
        this.LLILZIL.LJ();
        C19292910dr c19292910dr = this.LLJ;
        if (c19292910dr == null) {
            c19292910dr = null;
        }
        c19292910dr.LJI(new AwS40S0010000_28(z, 2));
        int i = !z ? 1 : 0;
        try {
            if (VideoGiftApi.LIZ == null) {
                VideoGiftApi.LIZ = (VideoGiftApi.SetGiftSettingsApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(VideoGiftApi.SetGiftSettingsApi.class);
            }
            giftSettings = VideoGiftApi.LIZ.setGiftSettings(i);
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
            giftSettings = C11IR.LL;
        }
        this.LLILZIL.LIZ(giftSettings.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS197S0100000_28(this, 12), new C09JN() { // from class: X.10dp
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoGiftSettingActivity@73be.onSwitchGiftToggle$disposable$2");
                Throwable th = (Throwable) obj;
                VideoGiftSettingActivity videoGiftSettingActivity = this.LL;
                boolean z2 = z;
                C19292910dr c19292910dr2 = videoGiftSettingActivity.LLJ;
                if (c19292910dr2 == null) {
                    c19292910dr2 = null;
                }
                c19292910dr2.LJI(new AwS40S0010000_28(z2, 3));
                if (z2) {
                    videoGiftSettingActivity.LLLLLZL(0);
                } else {
                    videoGiftSettingActivity.LLLLZI(0);
                }
                th.getMessage();
                C1C7U.LIZIZ("VideoGiftSettingActivity@73be.onSwitchGiftToggle$disposable$2");
            }
        }));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean booleanExtra;
        String stringExtra;
        boolean booleanExtra2;
        String str;
        boolean z = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onCreate", true);
        activityConfiguration(AFwS271S0000000_28.get$arr$(92));
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.f64);
        Intent intent = getIntent();
        if (intent != null) {
            booleanExtra = intent.getBooleanExtra("bundle_enter_from_gift_eligibility", false);
        } else {
            booleanExtra = false;
        }
        this.LLILLL = booleanExtra;
        Intent intent2 = getIntent();
        C19292910dr c19292910dr = null;
        if (intent2 != null) {
            try {
                stringExtra = intent2.getStringExtra("bundle_video_gift_previous_page");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        } else {
            stringExtra = "";
        }
        this.LLIZ = stringExtra;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            booleanExtra2 = intent3.getBooleanExtra("bundle_video_gift_enter_from_notification", false);
        } else {
            booleanExtra2 = false;
        }
        this.LLILZLL = booleanExtra2;
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y1z);
            this.LLILLJJLI = (TuxNavBar) callbackFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, getString(2131858228), new AwS572S0100000_28(this, 1111));
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_question_mark_circle_ltr;
        c1251150ifB.LIZJ(new AwS572S0100000_28(this, 1112));
        c0om1.LIZIZ(c1251150ifB);
        ((TuxNavBar) callbackFindViewById).setNavActions(c0om1);
        C19318810i2 c19318810i2 = (C19318810i2) this.LLJI.getValue();
        C19292910dr c19292910dr2 = new C19292910dr(new C19319810iC(false, getString(2131858229), null, false, null, null, null, getString(2131858227), false, false, false, null, 130044));
        this.LLJ = c19292910dr2;
        c19318810i2.LIZ(c19292910dr2);
        C19291110dZ c19291110dZ = C19291110dZ.LIZ;
        Keva repo = Keva.getRepo("video_gift_settings_keva_repo");
        C19291110dZ.LIZ.getClass();
        repo.storeBoolean(C19291110dZ.LIZIZ("vgc_visiting_first_time"), false);
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            EnumC1913590ztd.SETTINGS_VIDEO_GIFT_PAGE.getValue();
            iCompliancePolicyServiceLJIIIIZZ.LIZLLL();
        }
        User curUser = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser();
        this.LLIZLLLIL = curUser;
        if (curUser.getVideoGiftStatus() != 2) {
            z = false;
        }
        C19292910dr c19292910dr3 = this.LLJ;
        if (c19292910dr3 != null) {
            c19292910dr = c19292910dr3;
        }
        c19292910dr.LJI(new AwS114S0110000_28(this, z, 9));
        if (this.LLILLL) {
            LLLLZIL(false);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "gift_setting");
        if (this.LLILZLL) {
            str = "notification";
        } else {
            str = this.LLIZ;
        }
        c2344009Gk.LJIIIIZZ("previous_page", str);
        C20684815ws.LJIILLIIL("enter_gift_setting_page", c2344009Gk.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onCreate", false);
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
}
