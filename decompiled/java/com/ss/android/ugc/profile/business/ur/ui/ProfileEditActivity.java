package com.ss.android.ugc.profile.business.ur.ui;

import X.AbstractActivityC1242660iRU;
import X.C01GW;
import X.C0TVI;
import X.C1248210iaR;
import X.C1308910kAL;
import X.C14K9;
import X.C1697810uHb;
import X.C19EH;
import X.C1A6V;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C960203pA;
import X.EnumC1253850ijX;
import X.EnumC335920DEw;
import X.InterfaceC1294060jmO;
import X.InterfaceC251700yB;
import Y.AObserverS216S0100000_12;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.ui.EmailConsentPageActivity;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileEditActivity extends AbstractActivityC1242660iRU {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISHELIOSspOjx9PTdiPCZ9GDcjLyY/LQAoIDsSKzElPyYnMQ==";
    public final int LLILLL = R.layout.acl;
    public final C01GW LLILZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(468), "enabled_impersonation_moderation", Integer.class);
    public final C01GW LLILZIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(469), "highlight_bio", Boolean.class);
    public final C01GW LLILZLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(467), "enter_method", String.class);
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(470), "enter_from", String.class);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2441));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.ProfileEditActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.ProfileEditActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        boolean zLJI = MethodIDManager.LJI(202441);
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.ProfileEditActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.ProfileEditActivity", "onStart", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.ProfileEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void init() {
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        if (!LLLLLZL().LLLZLL) {
            LLLLLZL().setArguments((Bundle) this.LLIZLLLIL.getValue());
            c19ehLJIIJ.LJIJ(R.id.iiv, LLLLLZL(), "user_profile_edit_fragment");
            c19ehLJIIJ.LJIIIZ();
        }
        ComplianceServiceProvider.LJIJ().LIZJ("profile_page", new InterfaceC251700yB() { // from class: X.0iKm
            @Override // X.InterfaceC251700yB
            public final void LIZJ() {
            }

            @Override // X.InterfaceC251700yB
            public final void LIZ(boolean z) {
                if (z) {
                    ProfileEditActivity profileEditActivity = this.LIZ;
                    C707370Rot.LIZ.LIZ("email_consent_status").observe(profileEditActivity, new AObserverS216S0100000_12(profileEditActivity, 28));
                }
            }

            @Override // X.InterfaceC251700yB
            public final void LIZIZ(boolean z) {
                if (z) {
                    final C1214130hhT c1214130hhT = new C1214130hhT();
                    final ProfileEditActivity profileEditActivity = this.LIZ;
                    c1214130hhT.LIZ();
                    final FrameLayout frameLayout = (FrameLayout) profileEditActivity.findViewById(android.R.id.content);
                    final ViewOnClickListenerC1238510iKn viewOnClickListenerC1238510iKn = new ViewOnClickListenerC1238510iKn(profileEditActivity, null);
                    c1214130hhT.LIZ = viewOnClickListenerC1238510iKn;
                    viewOnClickListenerC1238510iKn.setTitleText(2131821583);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, profileEditActivity);
                    if (numLIZJ != null) {
                        viewOnClickListenerC1238510iKn.setTitleTextColor(numLIZJ.intValue());
                    }
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_paperplane;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                    viewOnClickListenerC1238510iKn.setIconImage(c419910GdJ.LIZ(profileEditActivity));
                    viewOnClickListenerC1238510iKn.getIvButtonFromXml().setText(profileEditActivity.getString(2131821582));
                    viewOnClickListenerC1238510iKn.getIvButtonFromXml().setTextSize(10.0f);
                    viewOnClickListenerC1238510iKn.getIvButtonFromXml().setMinTextSize(1.0f);
                    viewOnClickListenerC1238510iKn.getIvButtonFromXml().setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    viewOnClickListenerC1238510iKn.getIvButtonFromXml().setMaxLines(1);
                    Drawable drawableLIZIZ = C800330VaR.LIZIZ(profileEditActivity, R.drawable.adi);
                    if (drawableLIZIZ != null) {
                        viewOnClickListenerC1238510iKn.setButtonBackgroundDrawable(drawableLIZIZ);
                    }
                    viewOnClickListenerC1238510iKn.setButtonTextColor(-1);
                    viewOnClickListenerC1238510iKn.setOnInternalClickListener(new InterfaceC1238520iKo() { // from class: X.0iKl
                        @Override // X.InterfaceC1238520iKo
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC1238520iKo
                        public final void LIZ() {
                            c1214130hhT.LIZ();
                            C786410Ut5.B1(viewOnClickListenerC1238510iKn, 8);
                        }

                        @Override // X.InterfaceC1238520iKo
                        public final void LIZIZ() throws Throwable {
                            c1214130hhT.LIZ();
                            BaseActivity baseActivity = (BaseActivity) profileEditActivity;
                            Intent intent = new Intent(baseActivity, (Class<?>) EmailConsentPageActivity.class);
                            intent.putExtra("enter_from", "profile_page");
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(baseActivity, intent, "Context_startActivity_1");
                            C1701330uNH.LIZ(intent, baseActivity);
                            C2204961BRm.LLLJ(baseActivity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4NKqzreHIumIMPIE1+BChO7DG", null));
                            C0XGR c0xgr = new C0XGR();
                            c0xgr.LIZLLL("page_name", "profile_page");
                            c0xgr.LIZLLL("exp_name", "collect_email_consent_phase3");
                            C20684815ws.LJIILLIIL("click_email_consent_tip", c0xgr.LIZ);
                            C786410Ut5.B1(viewOnClickListenerC1238510iKn, 8);
                        }
                    });
                    viewOnClickListenerC1238510iKn.setClickable(true);
                    final ViewOnClickListenerC1238510iKn viewOnClickListenerC1238510iKn2 = c1214130hhT.LIZ;
                    C844470XAv.LIZ.getClass();
                    final int iLIZJ = (int) C12ES.LIZJ(12.0f, C844470XAv.LIZ());
                    final LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(iLIZJ, 0, iLIZJ, 0);
                    C786410Ut5.x3(viewOnClickListenerC1238510iKn2.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0hhS
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            if (viewOnClickListenerC1238510iKn2.getHeight() != 0) {
                                C786410Ut5.C3(viewOnClickListenerC1238510iKn2.getViewTreeObserver(), this);
                                C786410Ut5.LJJJZ(viewOnClickListenerC1238510iKn2, frameLayout);
                                C844470XAv.LIZ.getClass();
                                Context contextLIZ = C844470XAv.LIZ();
                                c1214130hhT.getClass();
                                int iLIZJ2 = (int) C12ES.LIZJ(12.0f, contextLIZ);
                                boolean z2 = C14LC.LJIIIZ;
                                C309690CBz.LIZ.getClass();
                                int iLIZIZ = C14LC.LIZIZ();
                                int height = ((frameLayout.getHeight() - iLIZJ2) - viewOnClickListenerC1238510iKn2.getHeight()) - iLIZIZ;
                                LinearLayout.LayoutParams layoutParams2 = layoutParams;
                                int i = iLIZJ;
                                layoutParams2.setMargins(i, height, i, iLIZJ2 + iLIZIZ);
                                if (Build.VERSION.SDK_INT < 24) {
                                    ViewOnClickListenerC1238510iKn viewOnClickListenerC1238510iKn3 = viewOnClickListenerC1238510iKn2;
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnClickListenerC1238510iKn3);
                                    viewOnClickListenerC1238510iKn3.setY(height);
                                }
                                c1214130hhT.LIZ();
                                frameLayout.addView(viewOnClickListenerC1238510iKn2, layoutParams);
                                C786410Ut5.B1(viewOnClickListenerC1238510iKn2, 0);
                            }
                        }
                    });
                    C786410Ut5.B1(viewOnClickListenerC1238510iKn2, 4);
                    frameLayout.addView(viewOnClickListenerC1238510iKn2, layoutParams);
                    C0XGR c0xgr = new C0XGR();
                    c0xgr.LIZLLL("page_name", "profile_page");
                    c0xgr.LIZLLL("exp_name", "collect_email_consent_phase3");
                    C20684815ws.LJIILLIIL("show_email_consent_tip", c0xgr.LIZ);
                    ComplianceServiceProvider.LJIJ().LJ("profile_page");
                }
            }
        });
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC1294060jmO
    public final void onBackPressed() {
        LLLLLZL().hT();
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment r8 = r9.LLLLLZL()
            int r0 = r10.getAction()
            r7 = 1
            r4 = 0
            if (r0 != 0) goto L75
            X.19EG r0 = r8.getActivity()
            if (r0 == 0) goto L73
            android.view.View r3 = r0.getCurrentFocus()
        L16:
            X.0g8c r0 = com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment.LLLLZ
            r0.getClass()
            r2 = 2
            if (r3 == 0) goto L75
            boolean r0 = r3 instanceof android.widget.EditText
            if (r0 == 0) goto L75
            int[] r1 = new int[r2]
            r1 = {x007e: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r3.getLocationInWindow(r1)
            r0 = r1[r4]
            r6 = r1[r7]
            int r5 = r3.getHeight()
            int r5 = r5 + r6
            int r4 = r3.getWidth()
            int r4 = r4 + r0
            float r1 = r10.getX()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5c
            float r1 = r10.getX()
            float r0 = (float) r4
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5c
            float r1 = r10.getY()
            float r0 = (float) r6
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5c
            float r1 = r10.getY()
            float r0 = (float) r5
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L75
        L5c:
            X.19EG r1 = r8.requireActivity()
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = X.C786410Ut5.H2(r1, r0)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            android.os.IBinder r0 = r3.getWindowToken()
            boolean r0 = r1.hideSoftInputFromWindow(r0, r2)
            if (r0 == 0) goto L75
        L72:
            return r7
        L73:
            r3 = 0
            goto L16
        L75:
            boolean r0 = super.dispatchTouchEvent(r10)
            if (r0 != 0) goto L72
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.ProfileEditActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.ProfileEditActivity", "onCreate", true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate page=ProfileEditActivity, enterFrom=");
        sbLIZ.append((String) this.LLIZ.getValue());
        sbLIZ.append(", enterMethod=");
        sbLIZ.append((String) this.LLILZLL.getValue());
        C1248210iaR.LJ("ProfileEditActivity", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.PAGE, "EnterPage");
        super.onCreate(bundle);
        setContentView(this.LLILLL);
        C1308910kAL.LIZJ(R.attr.zp, this);
        boolean zLIZIZ = true ^ C960203pA.LIZIZ(this);
        getWindow().setStatusBarColor(0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, this);
        if (numLIZJ != null) {
            getWindow().setNavigationBarColor(numLIZJ.intValue());
        }
        new C1A6V(getWindow(), getWindow().getDecorView()).LIZJ(zLIZIZ);
        new C1A6V(getWindow(), getWindow().getDecorView()).LIZIZ(zLIZIZ);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zp, this);
        if (numLIZJ2 != null) {
            int iIntValue = numLIZJ2.intValue();
            ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
            View childAt = viewGroup.getChildAt(0);
            if (childAt != null) {
                viewGroup = childAt;
            }
            viewGroup.setBackgroundColor(iIntValue);
            C14K9.LJIJJ(viewGroup, new C0TVI() { // from class: X.0JOq
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    view.setPadding(view.getPaddingLeft(), c20246014Ju.LIZ(129).LIZIZ, view.getPaddingRight(), view.getPaddingBottom());
                    return C20246014Ju.LIZIZ;
                }
            });
        }
        init();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.ProfileEditActivity", "onCreate", false);
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
    @InterfaceC1294060jmO
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LLLLLZL().onActivityResult(i, i2, intent);
    }
}
