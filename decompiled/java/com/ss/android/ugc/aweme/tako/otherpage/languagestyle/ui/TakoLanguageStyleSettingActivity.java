package com.ss.android.ugc.aweme.tako.otherpage.languagestyle.ui;

import X.C01GW;
import X.C1077410e8x;
import X.C1077420e8y;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1841350y17;
import X.C1857690yRT;
import X.C1862330yYx;
import X.C1875907Wj;
import X.C197039127h;
import X.C20226514Ch;
import X.C20600815jK;
import X.C299020Bno;
import X.C331070CyP;
import X.C335910DEv;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC335920DEw;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS164S0100000_30;
import Y.ARunnableS73S0200000_4;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoLanguageStyleOption;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoLanguageStyleSetting;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoLanguageStyleSettingActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLD0jKSIpZyMyJiI5HELIOSKCg2OzE1JSp9PSxiHS44JwktJygmKSIpGjsqJCAfLDsnISsrCCwnITMlPTY=";
    public final C01GW LL = RouteArgExtension.INSTANCE.requiredArg(this, (Function0) null, "tako_language_style", TakoLanguageStyleSetting.class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.requiredArg(this, (Function0) null, "tako_enter_param", TakoEnterParams.class);
    public final C01GW LLILLL = RouteArgExtension.INSTANCE.requiredArg(this, (Function0) null, "tako_session_id", String.class);
    public final C01GW LLILZ = RouteArgExtension.INSTANCE.requiredArg(this, (Function0) null, "tako_chat_id", String.class);
    public FrameLayout LLILZIL;
    public C197039127h LLILZLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZ;
    public LinearLayout LLIZLLLIL;
    public int LLJ;
    public int LLJI;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.languagestyle.ui.TakoLanguageStyleSettingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.languagestyle.ui.TakoLanguageStyleSettingActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.languagestyle.ui.TakoLanguageStyleSettingActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.languagestyle.ui.TakoLanguageStyleSettingActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.languagestyle.ui.TakoLanguageStyleSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final TakoEnterParams DN1() {
        return (TakoEnterParams) this.LLILLJJLI.getValue();
    }

    public final void LLLLLZL() {
        TakoLanguageStyleOption next;
        C20226514Ch c20226514Ch;
        TakoLanguageStyleOption takoLanguageStyleOption;
        TakoLanguageStyleOption next2;
        C197039127h c197039127h = this.LLILZLL;
        if (c197039127h != null) {
            c197039127h.setEnabled(this.LLJI != this.LLJ);
        }
        LinearLayout linearLayout = this.LLIZLLLIL;
        if (linearLayout != null) {
            Iterator it2 = new C1077420e8y(linearLayout, 26).iterator();
            while (true) {
                C1077410e8x c1077410e8x = (C1077410e8x) it2;
                if (!c1077410e8x.hasNext()) {
                    break;
                }
                View view = (View) c1077410e8x.next();
                if ((view instanceof C20226514Ch) && (c20226514Ch = (C20226514Ch) view) != null) {
                    List<TakoLanguageStyleOption> list = ((TakoLanguageStyleSetting) this.LL.getValue()).languageStyleOptions;
                    if (list != null) {
                        Iterator<TakoLanguageStyleOption> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            } else {
                                next2 = it3.next();
                                if (next2.languageStyleType == ((C20226514Ch) view).getType()) {
                                    break;
                                }
                            }
                        }
                        takoLanguageStyleOption = next2;
                    } else {
                        takoLanguageStyleOption = null;
                    }
                    boolean z = ((C20226514Ch) view).getType() == this.LLJ;
                    if (takoLanguageStyleOption != null) {
                        TuxTextView tuxTextView = c20226514Ch.LL;
                        if (tuxTextView != null) {
                            tuxTextView.setText(takoLanguageStyleOption.languageStyleName);
                        }
                        TuxTextView tuxTextView2 = c20226514Ch.LLILLL;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setText(takoLanguageStyleOption.languageStyleDescription);
                        }
                        C1841350y17 c1841350y17 = c20226514Ch.LLILLJJLI;
                        if (c1841350y17 != null) {
                            c1841350y17.setChecked(z);
                        }
                    }
                }
            }
        }
        List<TakoLanguageStyleOption> list2 = ((TakoLanguageStyleSetting) this.LL.getValue()).languageStyleOptions;
        if (list2 != null) {
            Iterator<TakoLanguageStyleOption> it4 = list2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it4.next();
                    if (next.languageStyleType == this.LLJ) {
                        break;
                    }
                }
            }
            TakoLanguageStyleOption takoLanguageStyleOption2 = next;
            if (takoLanguageStyleOption2 != null) {
                List listLJIILJJIL = C1697810uHb.LJIILJJIL(new C1875907Wj(takoLanguageStyleOption2.languageStyleDemoQuery, true), new C1875907Wj(takoLanguageStyleOption2.languageStyleDemoAnswer, false));
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZ;
                if (viewOnAttachStateChangeListenerC20604515jv != null) {
                    C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
                    if (state != null) {
                        state.LJIILL(listLJIILJJIL, null);
                    }
                    HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS73S0200000_4(listLJIILJJIL, (List<C331070CyP>) viewOnAttachStateChangeListenerC20604515jv, (ViewOnAttachStateChangeListenerC20604515jv) 31));
                }
            }
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = DN1().enterFrom;
        String str2 = DN1().enterMethod;
        String str3 = DN1().processId;
        String str4 = (String) this.LLILLL.getValue();
        if (str4 == null) {
            str4 = "";
        }
        C1862330yYx.LJJI(c1862330yYx, str, str2, str3, str4, DN1().takoChatId, "language_style_selection", String.valueOf(this.LLJ), null, null, null, 1920);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.languagestyle.ui.TakoLanguageStyleSettingActivity", "onCreate", true);
        activityConfiguration(new AwS597S0100000_18(this, 588));
        super.onCreate(bundle);
        setContentView(R.layout.fjg);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.m5n);
        int[] iArr = {Color.argb(38, 2, 183, 255), Color.argb(35, 26, 143, 255), Color.argb(27, 93, 29, 255), Color.argb(23, 255, 0, 57)};
        float[] fArr = {0.0445f, 0.2651f, 0.5397f, 0.9449f};
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, iArr);
        gradientDrawable.setGradientType(0);
        if (Build.VERSION.SDK_INT >= 29) {
            gradientDrawable.setColors(iArr, fArr);
        }
        frameLayout.setBackground(gradientDrawable);
        this.LLILZIL = frameLayout;
        C197039127h c197039127h = (C197039127h) findViewById(R.id.m5s);
        c197039127h.setEnabled(false);
        C786410Ut5.U8(c197039127h, new ACListenerS164S0100000_30(this, 27));
        this.LLILZLL = c197039127h;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) findViewById(R.id.m5o);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoChatDemoItemCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 1, false));
        viewOnAttachStateChangeListenerC20604515jv.setVerticalScrollBarEnabled(false);
        viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
        this.LLIZ = viewOnAttachStateChangeListenerC20604515jv;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.m5q);
        List<TakoLanguageStyleOption> list = ((TakoLanguageStyleSetting) this.LL.getValue()).languageStyleOptions;
        if (list != null) {
            for (TakoLanguageStyleOption takoLanguageStyleOption : list) {
                C20226514Ch c20226514Ch = new C20226514Ch(linearLayout.getContext());
                c20226514Ch.setType(takoLanguageStyleOption.languageStyleType);
                c20226514Ch.setClickListener(new AwS431S0200000_30(this, takoLanguageStyleOption, 32));
                linearLayout.addView(c20226514Ch);
            }
        }
        this.LLIZLLLIL = linearLayout;
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById(R.id.m5p);
        C426750GoL.LJIIIZ(tuxNavBar, null, Integer.valueOf(C497820Jfg.LIZJ(this)), null, null, false, 29);
        C1251150ifB c1251150ifB = new C1251150ifB();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZLLL = Integer.valueOf(C1857690yRT.LJIIJ(R.attr.a1h));
        c1251150ifB.LIZLLL();
        c1251150ifB.LJ = c419910GdJ;
        c1251150ifB.LIZJ(new AwS574S0100000_30(this, 319));
        tuxNavBar.LIZIZ(c1251150ifB);
        tuxNavBar.setNavBackground(0);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131849821);
        tuxNavBar.LJIJJ(c1250250idj);
        this.LLJ = ((TakoLanguageStyleSetting) this.LL.getValue()).selectedLanguageStyle;
        this.LLJI = ((TakoLanguageStyleSetting) this.LL.getValue()).selectedLanguageStyle;
        LLLLLZL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.languagestyle.ui.TakoLanguageStyleSettingActivity", "onCreate", false);
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
