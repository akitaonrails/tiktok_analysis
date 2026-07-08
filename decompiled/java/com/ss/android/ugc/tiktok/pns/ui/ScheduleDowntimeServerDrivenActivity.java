package com.ss.android.ugc.tiktok.pns.ui;

import X.C01GW;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C13LE;
import X.C1485060okS;
import X.C15544066s;
import X.C1697810uHb;
import X.C1744830vVR;
import X.C197039127h;
import X.C20136513qd;
import X.C20498815Ja;
import X.C20684815ws;
import X.C2217371BqR;
import X.C23250099c;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C769700UHg;
import X.C786410Ut5;
import X.EnumC1744820vVQ;
import X.EnumC335920DEw;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS137S0100000_2;
import Y.ARunnableS126S0100000_26;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ScheduleDowntimeServerDrivenActivity extends BaseActivity {
    public static final C1744830vVR LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static volatile boolean LLJJJIL = false;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s8Jzx9PSxiGiHELIOSw7LSE5JSoXJzIiPSY+LRYpOzk2OgE+IDk2JgQvPSYlITE1";
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public C197039127h LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public C1295960jpS LLILZLL;
    public C1295960jpS LLIZ;
    public ConstraintLayout LLIZLLLIL;
    public boolean LLJIJIL;
    public C1485060okS LLJILJILJ;
    public final C20136513qd LLJJI;
    public final C20136513qd LLJJIII;
    public final C20136513qd LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final String LLJ = "ScheduleDowntimeActivity";
    public final String LLJI = "7211206046400612353";
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1180));
    public String LLJILLL = "3:00 AM";
    public String LLJJ = "04:00 PM";

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0vVR] */
    static {
        C2217371BqR c2217371BqR = new C2217371BqR(ScheduleDowntimeServerDrivenActivity.class, "reviewStatus", "getReviewStatus()I", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217371BqR, new C2217371BqR(ScheduleDowntimeServerDrivenActivity.class, "startTimestamp", "getStartTimestamp()J", 0), new C2217371BqR(ScheduleDowntimeServerDrivenActivity.class, "endTimestamp", "getEndTimestamp()J", 0)};
        LLJJIJIL = new Object() { // from class: X.0vVR
        };
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.ui.ScheduleDowntimeServerDrivenActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.ui.ScheduleDowntimeServerDrivenActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.ui.ScheduleDowntimeServerDrivenActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final ConstraintLayout LLLLZI() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bnx);
            this.LLIZLLLIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C1295960jpS LLLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.caf);
            this.LLIZ = (C1295960jpS) callbackFindViewById;
        }
        return (C1295960jpS) callbackFindViewById;
    }

    public final TuxTextView LLLLZLL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.g4x);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.g4y);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final long LLLLZLLLI() {
        return ((Number) this.LLJJIJI.getValue(this, LLJJJ[2])).longValue();
    }

    public final C1295960jpS LLLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y8t);
            this.LLILZLL = (C1295960jpS) callbackFindViewById;
        }
        return (C1295960jpS) callbackFindViewById;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.ui.ScheduleDowntimeServerDrivenActivity", "onStart", true);
        super.onStart();
        C1485060okS c1485060okS = this.LLJILJILJ;
        if (c1485060okS != null) {
            ((C20498815Ja) this.LLJILJIL.getValue()).LIZIZ(c1485060okS);
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C15544066s(this, null), 3);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.ui.ScheduleDowntimeServerDrivenActivity", "onStart", false);
    }

    public ScheduleDowntimeServerDrivenActivity() {
        C769700UHg.LIZ.getClass();
        this.LLJJI = new C20136513qd();
        this.LLJJIII = new C20136513qd();
        this.LLJJIJI = new C20136513qd();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(277));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        LLJJJIL = false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        ((C20498815Ja) this.LLJILJIL.getValue()).stop();
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

    public static Bundle LLLLLZL(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LLLZIL(int i) {
        if (i == EnumC1744820vVQ.INIT.ordinal()) {
            C786410Ut5.LLLLZLL(LLLLZLL(), 0);
            C786410Ut5.LLLLZLL(LLLLZLLIL(), 8);
            C786410Ut5.h9(LLLLZLL(), new ACListenerS137S0100000_2(this, 68));
        } else if (i == EnumC1744820vVQ.PENDING.ordinal()) {
            C786410Ut5.LLLLZLL(LLLLZLL(), 8);
            C786410Ut5.LLLLZLL(LLLLZLLIL(), 0);
            LLLLZLLIL().setText(getString(2131821608));
        } else {
            if (i != EnumC1744820vVQ.REJECTED.ordinal()) {
                return;
            }
            C786410Ut5.LLLLZLL(LLLLZLL(), 8);
            C786410Ut5.LLLLZLL(LLLLZLLIL(), 0);
            LLLLZLLIL().setText(getString(2131821607));
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Long] */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        int i;
        long j;
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.ui.ScheduleDowntimeServerDrivenActivity", "onCreate", true);
        setTheme(R.style.y0);
        activityConfiguration(AFwS268S0000000_26.get$arr$(493));
        super.onCreate(bundle);
        LLJJJIL = true;
        setContentView(R.layout.bf7);
        Bundle bundleLLLLLZL = LLLLLZL(getIntent());
        String str = "3:00 AM";
        if (bundleLLLLLZL == null || (string = bundleLLLLLZL.getString("startTime")) == null) {
            string = "3:00 AM";
        }
        this.LLJILLL = string;
        Bundle bundleLLLLLZL2 = LLLLLZL(getIntent());
        String str2 = "04:00 PM";
        if (bundleLLLLLZL2 == null || (string2 = bundleLLLLLZL2.getString("endTime")) == null) {
            string2 = "04:00 PM";
        }
        this.LLJJ = string2;
        Bundle bundleLLLLLZL3 = LLLLLZL(getIntent());
        if (bundleLLLLLZL3 != null) {
            i = bundleLLLLLZL3.getInt("reviewStatus");
        } else {
            i = 0;
        }
        C20136513qd c20136513qd = this.LLJJI;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLJJJ;
        c20136513qd.LL = Integer.valueOf(i);
        Bundle bundleLLLLLZL4 = LLLLLZL(getIntent());
        long j2 = 0;
        if (bundleLLLLLZL4 != null) {
            j = ((long) bundleLLLLLZL4.getInt("startTimestamp")) * 1000;
        } else {
            j = 0;
        }
        this.LLJJIII.LL = Long.valueOf(j);
        Bundle bundleLLLLLZL5 = LLLLLZL(getIntent());
        if (bundleLLLLLZL5 != null) {
            j2 = ((long) bundleLLLLLZL5.getInt("endTimestamp")) * 1000;
        }
        this.LLJJIJI.LL = Long.valueOf(j2);
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.g4z);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        ((TextView) callbackFindViewById).setTextSize(40.0f);
        KeyEvent.Callback callbackFindViewById2 = this.LLILLJJLI;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.g4w);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById2;
        }
        TextView textView = (TextView) callbackFindViewById2;
        Object[] objArr = new Object[2];
        String str3 = this.LLJILLL;
        if (str3 != null) {
            str = str3;
        }
        objArr[0] = str;
        String str4 = this.LLJJ;
        if (str4 != null) {
            str2 = str4;
        }
        objArr[1] = str2;
        textView.setText(getString(2131821612, objArr));
        KeyEvent.Callback callbackFindViewById3 = this.LLILLL;
        if (callbackFindViewById3 == null) {
            callbackFindViewById3 = findViewById(R.id.g50);
            this.LLILLL = (C197039127h) callbackFindViewById3;
        }
        C786410Ut5.U8((C197039127h) callbackFindViewById3, new ACListenerS137S0100000_2(this, 67));
        LLLZIL(((Number) this.LLJJI.getValue(this, interfaceC2217461BqaArr[0])).intValue());
        LLLZ().setAnimationFromUrl("https://p16.tiktokcdn.com/obj/tiktok-obj/raining_animation.json");
        LLLLZIL().setAnimationFromUrl("https://p16.tiktokcdn.com/obj/tiktok-obj/water_animation.json");
        HandlerHook.viewPost(LLLZ(), new ARunnableS126S0100000_26(this, 79));
        HandlerHook.viewPost(LLLLZIL(), new ARunnableS126S0100000_26(this, 80));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("block_type", "state_law");
        C20684815ws.LJIILLIIL("show_scheduled_break_block", c2344009Gk.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.ui.ScheduleDowntimeServerDrivenActivity", "onCreate", false);
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
