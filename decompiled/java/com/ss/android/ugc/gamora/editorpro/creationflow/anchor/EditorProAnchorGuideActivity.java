package com.ss.android.ugc.gamora.editorpro.creationflow.anchor;

import X.AbstractC1849910yEv;
import X.AnonymousClass0956;
import X.C018G;
import X.C098200Yq;
import X.C0EGK;
import X.C0LAB;
import X.C1066460drI;
import X.C118300cf;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1361400lX0;
import X.C1697810uHb;
import X.C1849890yEt;
import X.C1849920yEw;
import X.C1849930yEx;
import X.C189200o6;
import X.C1954807lC;
import X.C20684815ws;
import X.C23250099c;
import X.C299020Bno;
import X.C335910DEv;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C497820Jfg;
import X.C592910NNh;
import X.C592920NNi;
import X.C639030P4r;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC335920DEw;
import X.InterfaceC1482530ogN;
import X.InterfaceC1484830ok5;
import Y.ACListenerS129S0200000_27;
import Y.ACListenerS161S0100000_27;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class EditorProAnchorGuideActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KzcpKDs6HELIOSJysqJSAkZiQiKic8OmsJLSYnJzccOyASJiYkJj0UPSwoLA4wPCw6IDsq";
    public C1849890yEt LL;
    public boolean LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public float LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public FrameLayout LLJI;
    public SmartImageView LLJIJIL;
    public TuxSpinner LLJILJIL;
    public View LLJILJILJ;
    public AbstractC1849910yEv LLJILLL;
    public long LLJJ;
    public long LLJJI;
    public AnonymousClass0956 LLJJIII;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.creationflow.anchor.EditorProAnchorGuideActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.creationflow.anchor.EditorProAnchorGuideActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.creationflow.anchor.EditorProAnchorGuideActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(C1066460drI.LIZ(), "captions_content_type");
        c0lab.LJ("captions_enter_source", "fyp_anchor");
        c0lab.LIZIZ(this.LLJJ, "duration");
        c0lab.LJ("exit_type", "click_back");
        C20684815ws.LJIILLIIL("captions_landing_page_exit", c0lab.LIZ);
        super.finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        C1849890yEt c1849890yEt;
        InterfaceC1484830ok5 interfaceC1484830ok5LIZ;
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.creationflow.anchor.EditorProAnchorGuideActivity", "onResume", true);
        if (this.LLJJI <= 0) {
            this.LLJJI = System.currentTimeMillis();
        }
        super.onResume();
        if (Intrinsics.LJFF(this.LLJILLL, C1849920yEw.LIZ)) {
            LLLLZI(C1849920yEw.LIZ);
        } else if (Intrinsics.LJFF(this.LLJILLL, C592920NNi.LIZ)) {
            LLLLZI(C1849920yEw.LIZ);
            C1849890yEt c1849890yEt2 = this.LL;
            if (c1849890yEt2 != null) {
                InterfaceC1484830ok5 interfaceC1484830ok5LIZ2 = c1849890yEt2.LIZ();
                if (interfaceC1484830ok5LIZ2 != null) {
                    interfaceC1484830ok5LIZ2.LIZJ(c1849890yEt2.LIZLLL);
                }
                InterfaceC1484830ok5 interfaceC1484830ok5LIZ3 = c1849890yEt2.LIZ();
                if (interfaceC1484830ok5LIZ3 != null) {
                    interfaceC1484830ok5LIZ3.LJ(c1849890yEt2.LIZJ);
                }
            }
            String str = this.LLIZLLLIL;
            if (str != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJIIIZ.LJJII(new C639030P4r(this, 0));
            }
        } else if (this.LLILLJJLI && (c1849890yEt = this.LL) != null && (interfaceC1484830ok5LIZ = c1849890yEt.LIZ()) != null) {
            interfaceC1484830ok5LIZ.resume();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.creationflow.anchor.EditorProAnchorGuideActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C1849890yEt c1849890yEt = this.LL;
        if (c1849890yEt != null) {
            InterfaceC1484830ok5 interfaceC1484830ok5LIZ = c1849890yEt.LIZ();
            if (interfaceC1484830ok5LIZ != null) {
                interfaceC1484830ok5LIZ.stop();
            }
            InterfaceC1484830ok5 interfaceC1484830ok5LIZ2 = c1849890yEt.LIZ();
            if (interfaceC1484830ok5LIZ2 != null) {
                interfaceC1484830ok5LIZ2.release();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        InterfaceC1484830ok5 interfaceC1484830ok5LIZ;
        AnonymousClass0956 anonymousClass0956;
        super.onPause();
        if (Intrinsics.LJFF(this.LLJILLL, C1849920yEw.LIZ) && (anonymousClass0956 = this.LLJJIII) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (!Intrinsics.LJFF(this.LLJILLL, C592920NNi.LIZ)) {
            C1849890yEt c1849890yEt = this.LL;
            if (c1849890yEt != null && (interfaceC1484830ok5LIZ = c1849890yEt.LIZ()) != null) {
                interfaceC1484830ok5LIZ.pause();
            }
            this.LLILLJJLI = true;
        }
        this.LLJJ += System.currentTimeMillis() - this.LLJJI;
        this.LLJJI = 0L;
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

    public final void LLLLZI(AbstractC1849910yEv abstractC1849910yEv) {
        AnonymousClass0956 anonymousClass0956 = this.LLJJIII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (Intrinsics.LJFF(abstractC1849910yEv, C1849920yEw.LIZ)) {
            this.LLJJIII = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C592910NNh(this, null), 3);
            TuxSpinner tuxSpinner = this.LLJILJIL;
            if (tuxSpinner != null) {
                C786410Ut5.LLZILL(tuxSpinner, 0);
            }
            View view = this.LLJILJILJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            FrameLayout frameLayout = this.LLJI;
            if (frameLayout != null) {
                C786410Ut5.U4(frameLayout, 1.0f);
            }
            SmartImageView smartImageView = this.LLJIJIL;
            if (smartImageView != null) {
                C786410Ut5.u5(smartImageView, 1.0f);
            }
        } else if (Intrinsics.LJFF(abstractC1849910yEv, C1849930yEx.LIZ)) {
            TuxSpinner tuxSpinner2 = this.LLJILJIL;
            if (tuxSpinner2 != null) {
                C786410Ut5.LLZILL(tuxSpinner2, 8);
            }
            View view2 = this.LLJILJILJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            FrameLayout frameLayout2 = this.LLJI;
            if (frameLayout2 != null) {
                C786410Ut5.U4(frameLayout2, 1.0f);
            }
            SmartImageView smartImageView2 = this.LLJIJIL;
            if (smartImageView2 != null) {
                C786410Ut5.u5(smartImageView2, 1.0f);
            }
        } else if (Intrinsics.LJFF(abstractC1849910yEv, C592920NNi.LIZ)) {
            TuxSpinner tuxSpinner3 = this.LLJILJIL;
            if (tuxSpinner3 != null) {
                C786410Ut5.LLZILL(tuxSpinner3, 8);
            }
            View view3 = this.LLJILJILJ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            FrameLayout frameLayout3 = this.LLJI;
            if (frameLayout3 != null) {
                C786410Ut5.U4(frameLayout3, 0.0f);
            }
            SmartImageView smartImageView3 = this.LLJIJIL;
            if (smartImageView3 != null) {
                C786410Ut5.u5(smartImageView3, 0.0f);
            }
        } else {
            throw new C1954807lC();
        }
        this.LLJILLL = abstractC1849910yEv;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        String stringExtra;
        String stringExtra2;
        Object c098200Yq;
        int iIntValue;
        Object c098200Yq2;
        int iIntValue2;
        int i;
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.creationflow.anchor.EditorProAnchorGuideActivity", "onCreate", true);
        this.LLJJI = System.currentTimeMillis();
        if (bundle != null) {
            this.LLJJ = bundle.getLong("key_stay_duration");
        }
        super.onCreate(bundle);
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        tuxImmersionBar.LIZJ(false, false);
        immersionBarLJIILJJIL.LJIIL();
        tuxImmersionBar.LJFF(-16777216);
        immersionBarLJIILJJIL.LJII(false);
        tuxImmersionBar.LIZLLL();
        setContentView(R.layout.ts);
        Object obj = null;
        try {
            String stringExtra3 = getIntent().getStringExtra("prev_url");
            if (stringExtra3 != null) {
                this.LLILLL = stringExtra3;
                try {
                    stringExtra = getIntent().getStringExtra("enter_from");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                this.LLILZ = stringExtra;
                try {
                    stringExtra2 = getIntent().getStringExtra("enter_method");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    stringExtra2 = null;
                }
                this.LLILZIL = stringExtra2;
                String strLIZIZ = C018G.LIZIZ(this.LLILLL, "captions_landing_page_video");
                this.LLILZLL = strLIZIZ;
                if (strLIZIZ != null) {
                    C118300cf c118300cf = new C118300cf();
                    C118300cf c118300cf2 = new C118300cf();
                    String strLIZIZ2 = C018G.LIZIZ(strLIZIZ, "width");
                    if (strLIZIZ2 != null) {
                        try {
                            c098200Yq = Integer.valueOf(CastIntegerProtector.parseInt(strLIZIZ2));
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        Integer num = (Integer) c098200Yq;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        c118300cf.element = iIntValue;
                    }
                    String strLIZIZ3 = C018G.LIZIZ(strLIZIZ, "height");
                    if (strLIZIZ3 != null) {
                        try {
                            c098200Yq2 = Integer.valueOf(CastIntegerProtector.parseInt(strLIZIZ3));
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq2 = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                            obj = c098200Yq2;
                        }
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        c118300cf2.element = iIntValue2;
                    }
                    int i2 = c118300cf.element;
                    if (i2 > 0 && (i = c118300cf2.element) > 0) {
                        this.LLIZ = i2 / i;
                    }
                }
                this.LLIZLLLIL = C018G.LIZIZ(this.LLILLL, "captions_landing_page_title");
                this.LLJ = C018G.LIZIZ(this.LLILLL, "captions_landing_page_subtitle");
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        C1361400lX0 c1361400lX0 = new C1361400lX0(this, R.style.z4);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.bn2);
        C426750GoL.LJIIIZ(tuxIconView, null, Integer.valueOf(C497820Jfg.LIZJ(this)), null, null, false, 29);
        C786410Ut5.a9(tuxIconView, new ACListenerS161S0100000_27(this, 6));
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.title);
        this.LLJIJIL = smartImageView;
        C426750GoL.LJIIIZ(smartImageView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) + C497820Jfg.LIZJ(this)), null, null, false, 29);
        String str = this.LLIZLLLIL;
        if (str != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIZ.LJJII(new C639030P4r(this, 0));
        }
        TextView textView = (TextView) findViewById(R.id.wgz);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, c1361400lX0);
        if (numLIZJ != null) {
            textView.setTextColor(numLIZJ.intValue());
        }
        if (C497820Jfg.LIZIZ(this) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            textView.setTextSize(15.0f);
            C426750GoL.LJIIIZ(textView, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84))), false, 23);
        } else {
            String str2 = this.LLJ;
            if (str2 != null) {
                int iLIZIZ = C497820Jfg.LIZIZ(this) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                TextPaint textPaint = new TextPaint(textView.getPaint());
                textPaint.setTextSize(C418440Gaw.LJ(20));
                for (StaticLayout staticLayoutLLLLLZL = LLLLLZL(str2, textPaint, iLIZIZ); staticLayoutLLLLLZL.getHeight() > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)); staticLayoutLLLLLZL = LLLLLZL(str2, textPaint, iLIZIZ)) {
                    textPaint.setTextSize(textPaint.getTextSize() - C418440Gaw.LJ(1));
                }
                textView.setTextSize(textPaint.getTextSize() / C0EGK.LIZIZ());
            }
        }
        textView.setText(this.LLJ);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.eoo);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a00);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        tuxTextView.setBackground(c384050F3z.LIZ(c1361400lX0));
        C786410Ut5.h9(tuxTextView, new ACListenerS129S0200000_27(tuxTextView, this, 5));
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.tec);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a00);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(40));
        tuxTextView2.setBackground(c384050F3z2.LIZ(c1361400lX0));
        C786410Ut5.h9(tuxTextView2, new ACListenerS161S0100000_27(this, 7));
        this.LLJILJIL = (TuxSpinner) findViewById(R.id.nnp);
        this.LLJILJILJ = findViewById(R.id.hb0);
        String str3 = this.LLILZLL;
        if (str3 != null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.wq2);
            this.LLJI = frameLayout;
            if (this.LLIZ > 0.0f && (layoutParams = frameLayout.getLayoutParams()) != null) {
                layoutParams.height = (int) (C497820Jfg.LIZIZ(this) / this.LLIZ);
                C786410Ut5.a6(frameLayout, layoutParams);
            }
            C1849890yEt c1849890yEt = new C1849890yEt(frameLayout, str3);
            this.LL = c1849890yEt;
            InterfaceC1482530ogN interfaceC1482530ogN = new InterfaceC1482530ogN() { // from class: X.0yEs
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
                public final /* synthetic */ void W1(String str4) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onBrightnessChanged(String str4, float f) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onBufferedPercent(String str4, long j, int i3) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onBufferedTimeMs(String str4, long j) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onCrosstalkHappened(String str4, List list) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onDecoderBuffering(String str4, boolean z2, C1480430ocz c1480430ocz) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onFrameAboutToBeRendered(int i3, long j, long j2, Map map) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onLiveRenderFirstFrame(String str4, C1480420ocy c1480420ocy) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onLoopPlay(String str4, int i3) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onMaskInfoCallback(String str4, C1480290ocl c1480290ocl) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPausePlay(String str4, C1480430ocz c1480430ocz) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayCompleted(String str4, int i3) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayCompletedFirstTime(String str4, C1480430ocz c1480430ocz) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayPause(String str4) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayPrepare(String str4) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayPrepared(String str4) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayRelease(String str4) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayStop(String str4, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlayerInternalEvent(String str4, int i3, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPlaying(String str4, C1480430ocz c1480430ocz) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
                public final /* synthetic */ void onPreRenderReady(String str4) {
                    C490850JMt.LIZ(this, str4);
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPreRenderSessionMissed(String str4) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onPreparePlay(String str4, C1480430ocz c1480430ocz) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onRenderFirstFrame(String str4, C1480420ocy c1480420ocy) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onResumePlay(String str4, C1480430ocz c1480430ocz) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onSeekEnd(String str4, boolean z2) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onSeekStart(String str4, int i3, float f) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onSpeedChanged(String str4, float f) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onStopPlay(String str4) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onVideoBitrateChanged(String str4, EnumC2281141EQm enumC2281141EQm, int i3) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onVideoSecondFrame(String str4) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void onVideoSizeChanged(String str4, int i3, int i4) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void tc(String str4, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC1482530ogN
                public final /* synthetic */ void uv(JSONObject jSONObject) {
                }

                @Override // X.InterfaceC1482530ogN
                public final void onCompleteLoaded(String str4, boolean z2) {
                    InterfaceC1484830ok5 interfaceC1484830ok5LIZ;
                    InterfaceC1484830ok5 interfaceC1484830ok5LIZ2;
                    AbstractC1849910yEv abstractC1849910yEv = this.LL.LLJILLL;
                    if (abstractC1849910yEv == null || Intrinsics.LJFF(abstractC1849910yEv, C1849920yEw.LIZ)) {
                        this.LL.LLLLZI(C1849930yEx.LIZ);
                        C1849890yEt c1849890yEt2 = this.LL.LL;
                        if (c1849890yEt2 != null && (interfaceC1484830ok5LIZ2 = c1849890yEt2.LIZ()) != null) {
                            interfaceC1484830ok5LIZ2.pause();
                        }
                        C1849890yEt c1849890yEt3 = this.LL.LL;
                        if (c1849890yEt3 != null && (interfaceC1484830ok5LIZ = c1849890yEt3.LIZ()) != null) {
                            interfaceC1484830ok5LIZ.resume();
                        }
                    }
                }

                @Override // X.InterfaceC1482530ogN
                public final void onRetryOnError(String str4, C1481290oeN c1481290oeN) {
                    this.LL.LLLLZI(C592920NNi.LIZ);
                }

                @Override // X.InterfaceC1482530ogN
                public final void onBuffering(String str4, boolean z2, C1480430ocz c1480430ocz) {
                    InterfaceC1484830ok5 interfaceC1484830ok5LIZ;
                    if (z2) {
                        if (!Intrinsics.LJFF(this.LL.LLJILLL, C592920NNi.LIZ)) {
                            this.LL.LLLLZI(C1849920yEw.LIZ);
                        }
                    } else {
                        if (Intrinsics.LJFF(this.LL.LLJILLL, C592920NNi.LIZ)) {
                            C1849890yEt c1849890yEt2 = this.LL.LL;
                            if (c1849890yEt2 != null && (interfaceC1484830ok5LIZ = c1849890yEt2.LIZ()) != null) {
                                interfaceC1484830ok5LIZ.pause();
                                return;
                            }
                            return;
                        }
                        if (Intrinsics.LJFF(this.LL.LLJILLL, C1849930yEx.LIZ)) {
                            return;
                        }
                        this.LL.LLLLZI(C1849930yEx.LIZ);
                    }
                }

                @Override // X.InterfaceC1482530ogN
                public final void onPlayFailed(String str4, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                    this.LL.LLLLZI(C592920NNi.LIZ);
                }

                @Override // X.InterfaceC1482530ogN
                public final void onPlayProgressChange(String str4, long j, long j2) {
                    if (this.LL.LLJILLL == null) {
                        this.LL.LLLLZI(C1849930yEx.LIZ);
                    }
                }
            };
            InterfaceC1484830ok5 interfaceC1484830ok5LIZ = c1849890yEt.LIZ();
            if (interfaceC1484830ok5LIZ != null) {
                interfaceC1484830ok5LIZ.LJIIZILJ(interfaceC1482530ogN);
            }
            C1849890yEt c1849890yEt2 = this.LL;
            if (c1849890yEt2 != null) {
                InterfaceC1484830ok5 interfaceC1484830ok5LIZ2 = c1849890yEt2.LIZ();
                if (interfaceC1484830ok5LIZ2 != null) {
                    interfaceC1484830ok5LIZ2.LIZJ(c1849890yEt2.LIZLLL);
                }
                InterfaceC1484830ok5 interfaceC1484830ok5LIZ3 = c1849890yEt2.LIZ();
                if (interfaceC1484830ok5LIZ3 != null) {
                    interfaceC1484830ok5LIZ3.LJ(c1849890yEt2.LIZJ);
                }
            }
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(C1066460drI.LIZ(), "captions_content_type");
        c0lab.LJ("captions_enter_source", "fyp_anchor");
        C20684815ws.LJIILLIIL("captions_landing_page_show", c0lab.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.creationflow.anchor.EditorProAnchorGuideActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("key_stay_duration", this.LLJJ);
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

    public static final StaticLayout LLLLLZL(String str, TextPaint textPaint, int i) {
        return StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).build();
    }
}
