package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription;

import X.C01GW;
import X.C0TOS;
import X.C0TQ7;
import X.C100F;
import X.C1251150ifB;
import X.C127K;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C1440005kM;
import X.C1697810uHb;
import X.C197039127h;
import X.C20515215Pi;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C746100TOm;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC335920DEw;
import Y.AObserverS212S0100000_8;
import Y.AObserverS216S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.BenefitsResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class SubscriptionAdPageActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSHELIOSM6KSsvLGEgPSc/Kj06ODElJiF9GzAuOiwhITU4ICA9CSEcKCg2CSY4IDk6PDw=";
    public TuxNavBar LLILLJJLI;
    public SubscriptionStatusInfo LLILZLL;
    public SubscriptionInfo LLIZ;
    public Integer LLIZLLLIL;
    public SubscriptionVM LLJ;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public LinearLayout LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public ConstraintLayout LLJJJ;
    public C127K LLJJJIL;
    public C127K LLJJJJ;
    public C127K LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public C197039127h LLJL;
    public C197039127h LLJLIL;
    public ConstraintLayout LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public C1390410mHn LLJLLIL;
    public long LLJLLL;
    public C20515215Pi LLJZ;
    public final String LL = "SubscriptionVM";
    public String LLILLL = "unknown";
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 348));
    public final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<IapProductDetail> LLJI = new MutableLiveData<>();
    public int LLJZIJLIL = 4;

    /* JADX WARN: Removed duplicated region for block: B:112:0x01c5 A[PHI: r7
      0x01c5: PHI (r7v8 java.lang.String) = (r7v7 java.lang.String), (r7v22 java.lang.String) binds: [B:110:0x01c1, B:27:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:314:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZIL() {
        /*
            Method dump skipped, instruction units count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionAdPageActivity.LLLLZIL():void");
    }

    public final Context getContext() {
        return (Context) this.LLILZ.getValue();
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (Intrinsics.LJFF(this.LLILZIL.getValue(), Boolean.TRUE)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        if (this.LLJIJIL) {
            C1440005kM.LIZ(new IEvent() { // from class: X.0TNc
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
        }
        C0TOS.LIZ.getClass();
        C0TOS.LIZJ = null;
        super.onDestroy();
    }

    public final boolean LLLLZLL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJLLL < 500) {
            return true;
        }
        this.LLJLLL = jCurrentTimeMillis;
        return false;
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

    public final void LLLLLZL(final Function0<Unit> function0) {
        ComplianceServiceProvider.LJJI().LJIJJLI(new C100F() { // from class: X.0TNY
            @Override // X.C100F
            public final void LIZIZ(boolean z) {
                this.LL.LLLLZIL();
                SubscriptionVM subscriptionVM = this.LL.LLJ;
                if (subscriptionVM != null) {
                    subscriptionVM.AQ2();
                }
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        }, 0);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        int iIntValue;
        MutableLiveData<BenefitsResponse> mutableLiveData;
        MutableLiveData<SubscriptionStatusResponse> mutableLiveData2;
        activityConfiguration(AFwS245S0000000_12.get$arr$(58));
        super.onCreate(bundle);
        setTheme(R.style.my);
        setContentView(R.layout.bfb);
        SmartRouter.autowire(this);
        try {
            stringExtra = getIntent().getStringExtra("enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LLILLL = String.valueOf(stringExtra);
        this.LLJ = C0TQ7.LIZ(this);
        new ViewModelProvider(this).get(PersonalizationViewModel.class);
        this.LLILLJJLI = (TuxNavBar) findViewById(R.id.pyi);
        this.LLJILJILJ = (TuxTextView) findViewById(R.id.wj5);
        this.LLJILLL = (TuxTextView) findViewById(R.id.wj6);
        this.LLJJ = (TuxTextView) findViewById(R.id.wj9);
        this.LLJJI = (TuxTextView) findViewById(R.id.wj8);
        this.LLJJIII = (TuxTextView) findViewById(R.id.wj7);
        this.LLJLILLLLZIIL = (ConstraintLayout) findViewById(R.id.wje);
        this.LLJJIJI = (LinearLayout) findViewById(R.id.rtc);
        this.LLJJIJIIJIL = (TuxTextView) findViewById(R.id.wj3);
        this.LLJJIJIL = (TuxTextView) findViewById(R.id.wja);
        this.LLJJJ = (ConstraintLayout) findViewById(R.id.wj_);
        this.LLJJJIL = (C127K) findViewById(R.id.bvv);
        this.LLJJJJ = (C127K) findViewById(R.id.bvx);
        this.LLJJJJJIL = (C127K) findViewById(R.id.bw3);
        this.LLJJJJLIIL = (TuxTextView) findViewById(R.id.wju);
        this.LLJJL = (TuxTextView) findViewById(R.id.wjr);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) findViewById(R.id.wjs);
        this.LLJL = (C197039127h) findViewById(R.id.wji);
        this.LLJLIL = (C197039127h) findViewById(R.id.wjd);
        this.LLJLLIL = (C1390410mHn) findViewById(R.id.nmp);
        this.LLJLL = (TuxIconView) findViewById(R.id.wj4);
        TuxTextView tuxTextView = this.LLJJIJIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setTuxFont(53);
        TuxTextView tuxTextView2 = this.LLJJIJIL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C426750GoL.LJIIIZ(tuxTextView2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 18);
        TuxTextView tuxTextView3 = this.LLJJIJIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        TuxTextView tuxTextView4 = this.LLJJ;
        if (tuxTextView4 != null) {
            tuxTextView4.LJJJJI(28.0f);
        }
        TuxNavBar tuxNavBar = this.LLILLJJLI;
        if (tuxNavBar == null) {
            tuxNavBar = null;
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 831));
        tuxNavBar.LIZIZ(c1251150ifB);
        TuxNavBar tuxNavBar2 = this.LLILLJJLI;
        if (tuxNavBar2 == null) {
            tuxNavBar2 = null;
        }
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_question_mark_circle_ltr;
        c1251150ifB2.LIZJ(new AwS556S0100000_12(this, 832));
        tuxNavBar2.LIZ(c1251150ifB2);
        TuxNavBar tuxNavBar3 = this.LLILLJJLI;
        if (tuxNavBar3 == null) {
            tuxNavBar3 = null;
        }
        tuxNavBar3.LJIIZILJ(false);
        TuxNavBar tuxNavBar4 = this.LLILLJJLI;
        if (tuxNavBar4 == null) {
            tuxNavBar4 = null;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c7u, this);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        tuxNavBar4.setNavBackground(iIntValue);
        TuxNavBar tuxNavBar5 = this.LLILLJJLI;
        if (tuxNavBar5 == null) {
            tuxNavBar5 = null;
        }
        C786410Ut5.LLLLZLLLI(tuxNavBar5, 0);
        C0TOS.LIZ.getClass();
        C0TOS.LIZJ = new WeakReference<>(this);
        this.LLILZIL.observe(this, new AObserverS212S0100000_8(this, 86));
        SubscriptionVM subscriptionVM = this.LLJ;
        if (subscriptionVM != null && (mutableLiveData2 = subscriptionVM.LLILLJJLI) != null) {
            mutableLiveData2.observe(this, new AObserverS216S0100000_12(this, 89));
        }
        SubscriptionVM subscriptionVM2 = this.LLJ;
        if (subscriptionVM2 != null && (mutableLiveData = subscriptionVM2.LLILLL) != null) {
            mutableLiveData.observe(this, new AObserverS216S0100000_12(this, 90));
        }
        LLLLZIL();
        LLLLLZL(null);
        if (C0TOS.LIZLLL()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(2, "prompt_type");
            c2344009Gk.LJIIIIZZ("enter_from", this.LLILLL);
            C20684815ws.LJIILLIIL("show_subscription_prompt", c2344009Gk.LIZ);
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", this.LLILLL);
        C20684815ws.LJIILLIIL("show_tt_plus_benefit_page", c2344009Gk2.LIZ);
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

    public final void LLLLZI(TuxTextView tuxTextView, String str, String str2, Integer num) {
        if (num != null && num.intValue() > 0) {
            int iIntValue = num.intValue();
            C746100TOm c746100TOm = C746100TOm.LIZ;
            if (str == null) {
                str = str2;
            }
            c746100TOm.getClass();
            tuxTextView.setText(C746100TOm.LJ(this, iIntValue, str, "{%s}"));
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
    }
}
