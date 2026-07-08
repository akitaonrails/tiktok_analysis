package com.ss.android.ugc.profile.business.profile.background;

import X.C01GW;
import X.C0SXF;
import X.C0TVI;
import X.C0WZX;
import X.C1058540deW;
import X.C1250680ieQ;
import X.C1251000iew;
import X.C1251020iey;
import X.C1254890ilD;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389600mGU;
import X.C1390410mHn;
import X.C13LP;
import X.C1478410oZj;
import X.C1479570obb;
import X.C1482560ogQ;
import X.C1482570ogR;
import X.C1482580ogS;
import X.C1484680ojq;
import X.C14K9;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2204961BRm;
import X.C299020Bno;
import X.C335910DEv;
import X.C371430EhJ;
import X.C418440Gaw;
import X.C425410GmB;
import X.C452501pT;
import X.C455790Hu5;
import X.C497270Jen;
import X.C582130MsN;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1046760dLW;
import X.EnumC310850CGl;
import X.EnumC335920DEw;
import X.InterfaceC1482530ogN;
import X.InterfaceC1483820oiS;
import X.InterfaceC1484830ok5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS13S0400000_4;
import Y.ARunnableS5S0202000_19;
import Y.ARunnableS88S0200000_19;
import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileBgVideoPreviewActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9ODcjLyY/HELIOSLWsuKCw4LzcjPCE3ZhU+Jik6JCAOLhk6LCAjGT02PiwpPg4wPCw6IDsq";
    public InterfaceC1484830ok5 LL;
    public C1251020iey LLILLJJLI;
    public C1251000iew LLILLL;
    public FrameLayout LLILZ;
    public FrameLayout LLILZIL;
    public SmartImageView LLILZLL;
    public C425410GmB LLIZ;
    public C371430EhJ LLIZLLLIL;
    public LinearLayout LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxIconView LLJJ;
    public View LLJJI;
    public C1390410mHn LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public Float LLJJL;
    public int LLJLL;
    public int LLJLLIL;
    public long LLJZ;
    public boolean LLJZIJLIL;
    public ARunnableS119S0100000_19 LLL;
    public ARunnableS88S0200000_19 LLLFF;
    public final LinkedHashSet<String> LLJJLIIIJLLLLLLLZ = new LinkedHashSet<>();
    public String LLJL = "";
    public String LLJLIL = "";
    public String LLJLILLLLZIIL = "";
    public int LLJLLL = 1;
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2089));

    public final void LLLZLZ() {
        View viewFindViewById;
        FrameLayout frameLayout;
        C371430EhJ c371430EhJ;
        if (this.LLJLLL != 2 || (viewFindViewById = findViewById(R.id.content)) == null || (frameLayout = this.LLILZIL) == null || (c371430EhJ = this.LLIZLLLIL) == null) {
            return;
        }
        HandlerHook.viewPost(viewFindViewById, new ARunnableS13S0400000_4(viewFindViewById, frameLayout, c371430EhJ, this, 1));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        this.LLJJIJIL = true;
        super.finish();
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        InterfaceC1484830ok5 interfaceC1484830ok5;
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity", "onResume", true);
        super.onResume();
        this.LLJJJ = false;
        if (!this.LLJJIJIIJIL && (interfaceC1484830ok5 = this.LL) != null) {
            interfaceC1484830ok5.resume();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLLZL() {
        C371430EhJ c371430EhJ;
        ARunnableS119S0100000_19 aRunnableS119S0100000_19 = this.LLL;
        if (aRunnableS119S0100000_19 != null && (c371430EhJ = this.LLIZLLLIL) != null) {
            HandlerHook.viewRemoveCallbacks(c371430EhJ, aRunnableS119S0100000_19);
        }
        this.LLL = null;
    }

    public final void LLLLZLL() {
        if (this.LLJZ <= 30000) {
            LLLLZIL();
            return;
        }
        LLLLLZL();
        LinearLayout linearLayout = this.LLJ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        C371430EhJ c371430EhJ = this.LLIZLLLIL;
        if (c371430EhJ != null) {
            c371430EhJ.setDisplayMode(EnumC310850CGl.MINIMAL);
        }
        C371430EhJ c371430EhJ2 = this.LLIZLLLIL;
        if (c371430EhJ2 != null) {
            int visibility = c371430EhJ2.getVisibility();
            c371430EhJ2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c371430EhJ2);
        }
        C371430EhJ c371430EhJ3 = this.LLIZLLLIL;
        if (c371430EhJ3 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c371430EhJ3);
            c371430EhJ3.setAlpha(1.0f);
        }
    }

    public final void LLLZIL() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LL;
        if (interfaceC1484830ok5 == null) {
            return;
        }
        if (!this.LLJJIJI) {
            this.LLJJJJJIL = false;
            interfaceC1484830ok5.resume();
        } else {
            this.LLJJJJJIL = true;
            this.LLJJJJLIIL = true;
            interfaceC1484830ok5.pause();
            LLLZ(false);
        }
    }

    public final void LLLLZIL() {
        LLLLLZL();
        LinearLayout linearLayout = this.LLJ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        C371430EhJ c371430EhJ = this.LLIZLLLIL;
        if (c371430EhJ != null) {
            int visibility = c371430EhJ.getVisibility();
            c371430EhJ.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c371430EhJ);
        }
        C371430EhJ c371430EhJ2 = this.LLIZLLLIL;
        if (c371430EhJ2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c371430EhJ2);
            c371430EhJ2.setAlpha(0.0f);
        }
    }

    public final void LLLLZLLIL() {
        LLLLLZL();
        C371430EhJ c371430EhJ = this.LLIZLLLIL;
        if (c371430EhJ != null) {
            c371430EhJ.setDisplayMode(EnumC310850CGl.NORMAL);
        }
        C371430EhJ c371430EhJ2 = this.LLIZLLLIL;
        if (c371430EhJ2 != null) {
            int visibility = c371430EhJ2.getVisibility();
            c371430EhJ2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c371430EhJ2);
        }
        C371430EhJ c371430EhJ3 = this.LLIZLLLIL;
        if (c371430EhJ3 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c371430EhJ3);
            c371430EhJ3.setAlpha(1.0f);
        }
        LinearLayout linearLayout = this.LLJ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        FrameLayout frameLayout;
        Handler handler;
        super.onDestroy();
        LLLLLZL();
        if (!this.LLJJLIIIJLLLLLLLZ.isEmpty()) {
            C1250680ieQ.LJIJJLI(C1250680ieQ.LIZ, "video", C13LP.LLIIII(this.LLJJLIIIJLLLLLLLZ));
        }
        this.LLJJLIIIJLLLLLLLZ.clear();
        ARunnableS88S0200000_19 aRunnableS88S0200000_19 = this.LLLFF;
        if (aRunnableS88S0200000_19 != null && (frameLayout = this.LLILZIL) != null && (handler = frameLayout.getHandler()) != null) {
            handler.removeCallbacks(aRunnableS88S0200000_19);
        }
        this.LLLFF = null;
        C1390410mHn c1390410mHn = this.LLJJIII;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C1254890ilD c1254890ilD = (C1254890ilD) this.LLLF.getValue();
        c1254890ilD.LIZLLL();
        c1254890ilD.LLJI = null;
        c1254890ilD.LLILZIL = null;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.stop();
            interfaceC1484830ok5.release();
            C1251020iey c1251020iey = this.LLILLJJLI;
            if (c1251020iey != null) {
                interfaceC1484830ok5.LJIIJJI(c1251020iey);
            }
            C1251000iew c1251000iew = this.LLILLL;
            if (c1251000iew != null) {
                interfaceC1484830ok5.LJJIIZ(c1251000iew);
            }
        }
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.pause();
        }
        LLLZ(false);
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

    public final String LLLLZI(long j) {
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = 60;
        return C786410Ut5.j4("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf(j2 % j3)}, 2));
    }

    public final void LLLLZLLLI(boolean z) {
        C371430EhJ c371430EhJ;
        LLLLLZL();
        C371430EhJ c371430EhJ2 = this.LLIZLLLIL;
        if (c371430EhJ2 != null) {
            c371430EhJ2.setDisplayMode(EnumC310850CGl.NORMAL);
        }
        C371430EhJ c371430EhJ3 = this.LLIZLLLIL;
        if (c371430EhJ3 != null) {
            int visibility = c371430EhJ3.getVisibility();
            c371430EhJ3.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c371430EhJ3);
        }
        C371430EhJ c371430EhJ4 = this.LLIZLLLIL;
        if (c371430EhJ4 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c371430EhJ4);
            c371430EhJ4.setAlpha(1.0f);
        }
        LinearLayout linearLayout = this.LLJ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        if (z && this.LLJJIJI && (c371430EhJ = this.LLIZLLLIL) != null) {
            ARunnableS119S0100000_19 aRunnableS119S0100000_19 = new ARunnableS119S0100000_19(this, 149);
            this.LLL = aRunnableS119S0100000_19;
            HandlerHook.viewPostDelay(c371430EhJ, aRunnableS119S0100000_19, 3000L);
        }
    }

    public final void LLLZ(boolean z) {
        TuxIconView tuxIconView;
        int i;
        this.LLJJIJI = z;
        if (!this.LLJJIJIL && !this.LLJJJ && (tuxIconView = this.LLJJ) != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i);
        }
        if (z) {
            if (this.LLJJJIL) {
                LLLLZLLIL();
                return;
            }
            if (this.LLJJJJLIIL) {
                this.LLJJJJLIIL = false;
                LLLLZLL();
                return;
            } else {
                if (this.LLJZIJLIL) {
                    return;
                }
                long j = this.LLJZ;
                if (j <= 0 || j <= 0) {
                    return;
                }
                this.LLJZIJLIL = true;
                LLLLZLL();
                return;
            }
        }
        if (!this.LLJJJJJIL) {
            return;
        }
        this.LLJJJJJIL = false;
        LLLLZLLLI(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v79, types: [X.0iey, X.0oiS] */
    /* JADX WARN: Type inference failed for: r0v87, types: [X.0iew, X.0ogN] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        boolean z;
        boolean z2;
        boolean z3;
        ?? r5;
        FrameLayout frameLayout;
        final FrameLayout frameLayout2;
        final C371430EhJ c371430EhJ;
        final int i;
        int i2;
        int i3;
        int i4;
        int i5;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        FrameLayout.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(com.zhiliaoapp.musically.R.layout.eby);
        C497270Jen.LJFF(this);
        C455790Hu5.LIZ(this);
        View viewFindViewById = findViewById(com.zhiliaoapp.musically.R.id.by1);
        if (viewFindViewById != null && (layoutParams5 = viewFindViewById.getLayoutParams()) != null) {
            layoutParams5.height = C0SXF.LJIIZILJ(this);
        }
        ViewGroup.LayoutParams layoutParams6 = null;
        try {
            stringExtra = getIntent().getStringExtra("extra_video_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.LLJL = stringExtra;
        try {
            stringExtra2 = getIntent().getStringExtra("extra_video_play_url");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.LLJLIL = stringExtra2;
        try {
            String stringExtra3 = getIntent().getStringExtra("extra_video_cover_url");
            if (stringExtra3 != null) {
                str = stringExtra3;
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        this.LLJLILLLLZIIL = str;
        this.LLJLL = getIntent().getIntExtra("extra_video_width", 0);
        this.LLJLLIL = getIntent().getIntExtra("extra_video_height", 0);
        this.LLJLLL = getIntent().getIntExtra("extra_video_preview_mode", 1);
        if (this.LLJL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.LLJLIL.length() == 0) {
            int i6 = C2187451AjH.LIZ;
            C1720106oR.LIZ("ProfileBackground", "PreviewActivity: missing videoId or playUrl");
            finish();
        }
        if (isFinishing()) {
            int i7 = C2187451AjH.LIZ;
            C1720106oR.LIZ("ProfileBackground", "PreviewActivity: isFinishing");
            ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity", "onCreate", false);
            return;
        }
        this.LLILZ = (FrameLayout) findViewById(com.zhiliaoapp.musically.R.id.bxt);
        this.LLILZIL = (FrameLayout) findViewById(com.zhiliaoapp.musically.R.id.by3);
        this.LLILZLL = (SmartImageView) findViewById(com.zhiliaoapp.musically.R.id.bxp);
        this.LLIZ = (C425410GmB) findViewById(com.zhiliaoapp.musically.R.id.bxq);
        this.LLIZLLLIL = (C371430EhJ) findViewById(com.zhiliaoapp.musically.R.id.bxx);
        this.LLJ = (LinearLayout) findViewById(com.zhiliaoapp.musically.R.id.bxz);
        this.LLJI = (TuxTextView) findViewById(com.zhiliaoapp.musically.R.id.bxy);
        this.LLJIJIL = (TuxTextView) findViewById(com.zhiliaoapp.musically.R.id.by0);
        this.LLJILJIL = (TuxTextView) findViewById(com.zhiliaoapp.musically.R.id.zai);
        this.LLJILJILJ = (TuxTextView) findViewById(com.zhiliaoapp.musically.R.id.cnq);
        this.LLJILLL = (TuxTextView) findViewById(com.zhiliaoapp.musically.R.id.cnu);
        this.LLJJ = (TuxIconView) findViewById(com.zhiliaoapp.musically.R.id.cnt);
        this.LLJJI = findViewById(com.zhiliaoapp.musically.R.id.bxw);
        this.LLJJIII = (C1390410mHn) findViewById(com.zhiliaoapp.musically.R.id.bxv);
        View viewFindViewById2 = findViewById(com.zhiliaoapp.musically.R.id.cns);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS154S0100000_19(this, 222), viewFindViewById2);
        }
        TuxTextView tuxTextView = this.LLJILJILJ;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS154S0100000_19(this, 224));
        }
        TuxTextView tuxTextView2 = this.LLJILLL;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS154S0100000_19(this, 226));
        }
        TuxIconView tuxIconView = this.LLJJ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS154S0100000_19(this, 227));
        }
        FrameLayout frameLayout3 = this.LLILZIL;
        if (frameLayout3 != null) {
            C786410Ut5.O7(frameLayout3, new ACListenerS154S0100000_19(this, 228));
        }
        C425410GmB c425410GmB = this.LLIZ;
        if (c425410GmB != null) {
            c425410GmB.setOnVisibleWindowClick(new AwS563S0100000_19(this, 2933));
        }
        C425410GmB c425410GmB2 = this.LLIZ;
        if (c425410GmB2 != null) {
            c425410GmB2.setOnWindowPositionChanged(new AwS598S0100000_19(this, 624));
        }
        C371430EhJ c371430EhJ2 = this.LLIZLLLIL;
        if (c371430EhJ2 != null) {
            c371430EhJ2.setOnSeekChanged(new AwS633S0100000_19(this, 248));
        }
        C371430EhJ c371430EhJ3 = this.LLIZLLLIL;
        if (c371430EhJ3 != null) {
            c371430EhJ3.setOnDragStateChanged(new AwS598S0100000_19(this, 623));
        }
        LinearLayout linearLayout = this.LLJ;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
            if (layoutParams7 != null) {
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                layoutParams8.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
                C786410Ut5.W5(linearLayout, layoutParams8);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        int i8 = this.LLJLLL;
        if (i8 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && i8 != 3) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            TuxTextView tuxTextView3 = this.LLJILJIL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 4);
            }
            C425410GmB c425410GmB3 = this.LLIZ;
            if (c425410GmB3 != null) {
                int visibility = c425410GmB3.getVisibility();
                c425410GmB3.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c425410GmB3);
            }
            if (this.LLJLLL == 3) {
                LinearLayout linearLayout2 = this.LLJ;
                if (linearLayout2 != null) {
                    C786410Ut5.LJZL(8, linearLayout2);
                }
                TuxTextView tuxTextView4 = this.LLJILJILJ;
                if (tuxTextView4 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView4, 8);
                }
                TuxTextView tuxTextView5 = this.LLJILLL;
                if (tuxTextView5 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView5, 0);
                }
                TuxTextView tuxTextView6 = this.LLJILLL;
                if (tuxTextView6 != null) {
                    tuxTextView6.setText(2131845376);
                }
                View viewFindViewById3 = findViewById(com.zhiliaoapp.musically.R.id.bxo);
                if (viewFindViewById3 != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById3);
                }
            } else {
                LinearLayout linearLayout3 = this.LLJ;
                if (linearLayout3 != null) {
                    C786410Ut5.LJZL(8, linearLayout3);
                }
                View viewFindViewById4 = findViewById(com.zhiliaoapp.musically.R.id.bxn);
                if (viewFindViewById4 != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById4);
                }
                View viewFindViewById5 = findViewById(com.zhiliaoapp.musically.R.id.bxm);
                if (viewFindViewById5 != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById5);
                }
                FrameLayout frameLayout4 = this.LLILZ;
                if (frameLayout4 != null) {
                    ViewGroup.LayoutParams layoutParams9 = frameLayout4.getLayoutParams();
                    if (layoutParams9 != null) {
                        FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams9;
                        layoutParams10.bottomMargin = 0;
                        C786410Ut5.W5(frameLayout4, layoutParams10);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                }
                LLLZLZ();
            }
        }
        View viewFindViewById6 = findViewById(R.id.content);
        if (viewFindViewById6 != null && (frameLayout2 = this.LLILZ) != null && (c371430EhJ = this.LLIZLLLIL) != null) {
            ViewGroup.LayoutParams layoutParams11 = frameLayout2.getLayoutParams();
            if ((layoutParams11 instanceof FrameLayout.LayoutParams) && (layoutParams4 = (FrameLayout.LayoutParams) layoutParams11) != null) {
                i = layoutParams4.bottomMargin;
            } else {
                i = 0;
            }
            ViewGroup.LayoutParams layoutParams12 = c371430EhJ.getLayoutParams();
            if ((layoutParams12 instanceof FrameLayout.LayoutParams) && (layoutParams3 = (FrameLayout.LayoutParams) layoutParams12) != null) {
                i2 = layoutParams3.bottomMargin;
            } else {
                i2 = 0;
            }
            LinearLayout linearLayout4 = this.LLJ;
            if (linearLayout4 != null) {
                layoutParams6 = linearLayout4.getLayoutParams();
            }
            if ((layoutParams6 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams6) != null) {
                i3 = layoutParams2.bottomMargin;
            } else {
                i3 = 0;
            }
            final View viewFindViewById7 = findViewById(com.zhiliaoapp.musically.R.id.bxn);
            ViewGroup.LayoutParams layoutParams13 = viewFindViewById7.getLayoutParams();
            if ((layoutParams13 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams13) != null) {
                i4 = layoutParams.bottomMargin;
            } else {
                i4 = 0;
            }
            final View viewFindViewById8 = findViewById(com.zhiliaoapp.musically.R.id.bxm);
            ViewGroup.LayoutParams layoutParams14 = viewFindViewById8.getLayoutParams();
            if (layoutParams14 != null) {
                i5 = layoutParams14.height;
            } else {
                i5 = 0;
            }
            final int paddingBottom = viewFindViewById8.getPaddingBottom();
            r5 = 0;
            r5 = 0;
            final int i9 = i2;
            final int i10 = i3;
            final int i11 = i4;
            final int i12 = i5;
            C14K9.LJIJJ(viewFindViewById6, new C0TVI() { // from class: X.0DSn
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(2);
                    int i13 = 0;
                    if (c20246014Ju.LJIIIIZZ(2) && c20244914JjLIZ.LIZLLL > 0) {
                        i13 = c20244914JjLIZ.LIZLLL;
                    }
                    FrameLayout frameLayout5 = frameLayout2;
                    int i14 = i;
                    ViewGroup.LayoutParams layoutParams15 = frameLayout5.getLayoutParams();
                    if (layoutParams15 != null) {
                        FrameLayout.LayoutParams layoutParams16 = (FrameLayout.LayoutParams) layoutParams15;
                        layoutParams16.bottomMargin = i14 + i13;
                        C786410Ut5.W5(frameLayout5, layoutParams16);
                        C371430EhJ c371430EhJ4 = c371430EhJ;
                        int i15 = i9;
                        ViewGroup.LayoutParams layoutParams17 = c371430EhJ4.getLayoutParams();
                        if (layoutParams17 != null) {
                            FrameLayout.LayoutParams layoutParams18 = (FrameLayout.LayoutParams) layoutParams17;
                            layoutParams18.bottomMargin = i15 + i13;
                            C786410Ut5.W5(c371430EhJ4, layoutParams18);
                            LinearLayout linearLayout5 = this.LLJ;
                            if (linearLayout5 != null) {
                                int i16 = i10;
                                ViewGroup.LayoutParams layoutParams19 = linearLayout5.getLayoutParams();
                                if (layoutParams19 != null) {
                                    FrameLayout.LayoutParams layoutParams20 = (FrameLayout.LayoutParams) layoutParams19;
                                    layoutParams20.bottomMargin = i16 + i13;
                                    C786410Ut5.W5(linearLayout5, layoutParams20);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                }
                            }
                            View view2 = viewFindViewById7;
                            int i17 = i11;
                            ViewGroup.LayoutParams layoutParams21 = view2.getLayoutParams();
                            if (layoutParams21 != null) {
                                FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) layoutParams21;
                                layoutParams22.bottomMargin = i17 + i13;
                                C786410Ut5.W5(view2, layoutParams22);
                                View view3 = viewFindViewById8;
                                int i18 = i12;
                                ViewGroup.LayoutParams layoutParams23 = view3.getLayoutParams();
                                if (layoutParams23 != null) {
                                    FrameLayout.LayoutParams layoutParams24 = (FrameLayout.LayoutParams) layoutParams23;
                                    layoutParams24.height = i18 + i13;
                                    C786410Ut5.W5(view3, layoutParams24);
                                    View view4 = viewFindViewById8;
                                    view4.setPadding(view4.getPaddingLeft(), viewFindViewById8.getPaddingTop(), viewFindViewById8.getPaddingRight(), paddingBottom + i13);
                                    this.LLLZLZ();
                                    return c20246014Ju;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            });
            if (viewFindViewById6.isAttachedToWindow()) {
                viewFindViewById6.requestApplyInsets();
            }
        } else {
            r5 = 0;
        }
        if (this.LLJLL > 0 && this.LLJLLIL > 0 && (frameLayout = this.LLILZ) != null) {
            HandlerHook.viewPost(frameLayout, new ARunnableS119S0100000_19(this, 151));
        }
        LLLLZIL();
        if (this.LLJLILLLLZIIL.length() > 0) {
            SmartImageView smartImageView = this.LLILZLL;
            if (smartImageView != null) {
                C786410Ut5.LLFF(r5, smartImageView);
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(this.LLJLILLLLZIIL);
            c1331670kl3LJIIIZ.LJJ(this.LLILZLL);
            c1331670kl3LJIIIZ.LJIIJJI();
        }
        final FrameLayout frameLayout5 = this.LLILZIL;
        if (frameLayout5 != null) {
            C1478410oZj c1478410oZj = new C1478410oZj();
            c1478410oZj.LIZIZ = true;
            InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = C582130MsN.LIZ().LIZJ(c1478410oZj);
            ?? r0 = new InterfaceC1483820oiS() { // from class: X.0iey
                @Override // X.InterfaceC1483820oiS
                public final boolean bn() {
                    return true;
                }

                @Override // X.InterfaceC1483820oiS
                public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
                    return null;
                }

                @Override // X.InterfaceC1483820oiS
                public final /* synthetic */ Surface getSurface() {
                    return null;
                }

                @Override // X.InterfaceC1483820oiS
                public final /* synthetic */ void hj() {
                }

                @Override // X.InterfaceC1483820oiS
                public final /* synthetic */ void pe() {
                }

                @Override // X.InterfaceC1483820oiS
                public final HashMap getParams() {
                    return new HashMap();
                }

                @Override // X.InterfaceC1483820oiS
                public final FrameLayout getPlayViewContainer() {
                    return frameLayout5;
                }
            };
            this.LLILLJJLI = r0;
            interfaceC1484830ok5LIZJ.LIZJ(r0);
            this.LL = interfaceC1484830ok5LIZJ;
            C1482580ogS c1482580ogS = new C1482580ogS();
            c1482580ogS.LIZ = this.LLJL;
            C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
            c1058540deW.LIZLLL = Collections.singletonList(this.LLJLIL);
            C1482580ogS c1482580ogSLIZ = c1058540deW.LIZ();
            C1482570ogR c1482570ogRLIZ = c1482580ogSLIZ.LIZ();
            c1482570ogRLIZ.LIZ(EnumC1046760dLW.VIDEO);
            C1479570obb c1479570obb = c1482570ogRLIZ.LIZIZ;
            c1479570obb.LIZIZ = true;
            c1479570obb.LJJ = r5;
            c1482570ogRLIZ.LIZ.LJ = c1482570ogRLIZ;
            C1482560ogQ c1482560ogQLIZ = new C1484680ojq(c1482580ogSLIZ).LIZ();
            ?? r02 = new InterfaceC1482530ogN() { // from class: X.0iew
                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void Au(Surface surface) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void VK() {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void W1(String str2) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onBrightnessChanged(String str2, float f) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onBufferedPercent(String str2, long j, int i13) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onBufferedTimeMs(String str2, long j) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onBuffering(String str2, boolean z4, C1480430ocz c1480430ocz) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onCompleteLoaded(String str2, boolean z4) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onCrosstalkHappened(String str2, List list) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onDecoderBuffering(String str2, boolean z4, C1480430ocz c1480430ocz) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onFrameAboutToBeRendered(int i13, long j, long j2, Map map) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onLiveRenderFirstFrame(String str2, C1480420ocy c1480420ocy) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onLoopPlay(String str2, int i13) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onMaskInfoCallback(String str2, C1480290ocl c1480290ocl) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayCompleted(String str2, int i13) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayCompletedFirstTime(String str2, C1480430ocz c1480430ocz) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayPause(String str2) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayPrepare(String str2) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayPrepared(String str2) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayProgressChange(String str2, long j, long j2) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayRelease(String str2) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayerInternalEvent(String str2, int i13, JSONObject jSONObject) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
                public final /* synthetic */ void onPreRenderReady(String str2) {
                    C490850JMt.LIZ(this, str2);
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPreRenderSessionMissed(String str2) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPreparePlay(String str2, C1480430ocz c1480430ocz) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onRetryOnError(String str2, C1481290oeN c1481290oeN) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onSeekEnd(String str2, boolean z4) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onSeekStart(String str2, int i13, float f) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onSpeedChanged(String str2, float f) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onStopPlay(String str2) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onVideoBitrateChanged(String str2, EnumC2281141EQm enumC2281141EQm, int i13) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onVideoSecondFrame(String str2) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void tc(String str2, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void uv(JSONObject jSONObject) {
                }

                @Override // X.InterfaceC1482530ogN
                public final void onPausePlay(String str2, C1480430ocz c1480430ocz) {
                    this.LL.LLLZ(false);
                }

                @Override // X.InterfaceC1482530ogN
                public final void onPlaying(String str2, C1480430ocz c1480430ocz) {
                    this.LL.LLLZ(true);
                }

                @Override // X.InterfaceC1482530ogN
                public final void onRenderFirstFrame(String str2, C1480420ocy c1480420ocy) {
                    Handler handler;
                    int i13 = C2187451AjH.LIZ;
                    C1720106oR.LJI("ProfileBackground", "Preview: first frame rendered");
                    SmartImageView smartImageView2 = this.LL.LLILZLL;
                    if (smartImageView2 != null) {
                        C786410Ut5.LLFF(8, smartImageView2);
                    }
                    this.LL.LLLZ(true);
                    ProfileBgVideoPreviewActivity profileBgVideoPreviewActivity = this.LL;
                    FrameLayout frameLayout6 = profileBgVideoPreviewActivity.LLILZIL;
                    if (frameLayout6 != null && (handler = frameLayout6.getHandler()) != null) {
                        ARunnableS88S0200000_19 aRunnableS88S0200000_19 = new ARunnableS88S0200000_19(profileBgVideoPreviewActivity, handler, 42);
                        profileBgVideoPreviewActivity.LLLFF = aRunnableS88S0200000_19;
                        C786410Ut5.LJJZZIII(handler, aRunnableS88S0200000_19);
                    }
                }

                @Override // X.InterfaceC1482530ogN
                public final void onResumePlay(String str2, C1480430ocz c1480430ocz) {
                    this.LL.LLLZ(true);
                }

                @Override // X.InterfaceC1482530ogN
                public final void onPlayFailed(String str2, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                    int i13 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Preview: play failed, error=");
                    sbLIZ.append(c1481290oeN);
                    C1720106oR.LIZ("ProfileBackground", C2188811AlT.LIZIZ(sbLIZ));
                    this.LL.LLLZ(false);
                }

                @Override // X.InterfaceC1482530ogN
                public final void onPlayStop(String str2, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                    this.LL.LLLZ(false);
                }

                @Override // X.InterfaceC1482530ogN
                public final void onVideoSizeChanged(String str2, int i13, int i14) {
                    boolean z4;
                    ProfileBgVideoPreviewActivity profileBgVideoPreviewActivity;
                    FrameLayout frameLayout6;
                    int iIntValue = i14;
                    int iIntValue2 = i13;
                    int i15 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Preview: video size changed, w=");
                    sbLIZ.append(iIntValue2);
                    sbLIZ.append(", h=");
                    sbLIZ.append(iIntValue);
                    C1720106oR.LJI("ProfileBackground", C2188811AlT.LIZIZ(sbLIZ));
                    Integer numValueOf = Integer.valueOf(this.LL.LLJLL);
                    if (numValueOf.intValue() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        iIntValue2 = numValueOf.intValue();
                    }
                    Integer numValueOf2 = Integer.valueOf(this.LL.LLJLLIL);
                    if (numValueOf2.intValue() > 0) {
                        iIntValue = numValueOf2.intValue();
                    }
                    if (iIntValue2 > 0 && iIntValue > 0 && (frameLayout6 = (profileBgVideoPreviewActivity = this.LL).LLILZ) != null) {
                        HandlerHook.viewPost(frameLayout6, new ARunnableS5S0202000_19(frameLayout6, iIntValue2, iIntValue, profileBgVideoPreviewActivity, 1));
                    }
                }
            };
            this.LLILLL = r02;
            interfaceC1484830ok5LIZJ.LJIIZILJ(r02);
            interfaceC1484830ok5LIZJ.LJ(c1482560ogQLIZ);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity", "onCreate", r5);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(com.zhiliaoapp.musically.R.style.a9t), Integer.valueOf(com.zhiliaoapp.musically.R.style.a9u), Integer.valueOf(com.zhiliaoapp.musically.R.style.a9v), Integer.valueOf(com.zhiliaoapp.musically.R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(com.zhiliaoapp.musically.R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(com.zhiliaoapp.musically.R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9u, true);
                } else {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9v, true);
                } else {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9y, true);
        }
    }

    public final void LLLZZIL(long j, long j2) {
        TuxTextView tuxTextView = this.LLJI;
        if (tuxTextView != null) {
            tuxTextView.setText(LLLLZI(j));
        }
        TuxTextView tuxTextView2 = this.LLJIJIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(LLLLZI(j2));
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        super.onActivityResult(i, i2, intent);
        if (!((C1254890ilD) this.LLLF.getValue()).LJ(i, i2, intent) && i == 2002 && i2 == -1) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("extra_bg_updated", true);
            }
            C2204961BRm.S(this, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vpjsCmOQvxKkBRrqLwSJLa+uAZs9Z/Y3ig7uX5mXjpWgHR1DsFsl9Ipy2zemiqTix", null));
            if (this.LLJLLL == 3) {
                finish();
            }
        }
    }
}
