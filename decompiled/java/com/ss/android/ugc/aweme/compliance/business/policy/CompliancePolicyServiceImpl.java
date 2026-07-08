package com.ss.android.ugc.aweme.compliance.business.policy;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C0OM1;
import X.C1251150ifB;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1408950mlh;
import X.C1408970mlj;
import X.C1541950qED;
import X.C1697810uHb;
import X.C1867460yhE;
import X.C1906580ziK;
import X.C1913610ztf;
import X.C19336810kw;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C258090A9n;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.DialogInterfaceOnDismissListenerC19333210kM;
import X.EnumC1408960mli;
import X.EnumC1408980mlk;
import X.EnumC1913590ztd;
import X.InterfaceC1913620ztg;
import X.InterfaceC2217701Bqy;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ACListenerS74S0300000_7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.RouteManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class CompliancePolicyServiceImpl implements ICompliancePolicyService {
    public final C1408970mlj LIZ = C1408970mlj.LIZ;

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService
    public final void LIZLLL() {
        this.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService
    public final void LJ() {
        if (C1408950mlh.LIZ) {
            return;
        }
        C1408950mlh.LIZ = true;
        RouteManager.getInstance().addGlobalResultCallback(new AbsOpenResultCallback() { // from class: X.0mll
            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onOpen(Intent intent) {
                C1951107kb.LIZIZ(this, intent);
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1408940mlg(intent, null), 3);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0210  */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZJ(X.C1913610ztf r15) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.policy.CompliancePolicyServiceImpl.LIZJ(X.0ztf):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService
    public final void LJFF(C1913610ztf c1913610ztf) {
        this.LIZ.getClass();
        String value = EnumC1408960mli.POLICY_ENTRANCE_CLICK.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(EnumC1408980mlk.BIZ_CASE_ID.getValue(), c1913610ztf.LIZ);
        c2344009Gk.LJIIIIZZ(EnumC1408980mlk.POLICY_KEY.getValue(), c1913610ztf.LIZIZ);
        C20684815ws.LJIILLIIL(value, c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService
    public final void LIZ(C1913610ztf c1913610ztf, InterfaceC1913620ztg interfaceC1913620ztg) {
        this.LIZ.getClass();
        String value = EnumC1408960mli.REQUEST_POLICY_SERVICE.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(EnumC1408980mlk.BIZ_CASE_ID.getValue(), c1913610ztf.LIZ);
        c2344009Gk.LJIIIIZZ(EnumC1408980mlk.POLICY_KEY.getValue(), c1913610ztf.LIZIZ);
        c2344009Gk.LJIIIIZZ(EnumC1408980mlk.REQUEST_TYPE.getValue(), "show_policy_document");
        C20684815ws.LJIILLIIL(value, c2344009Gk.LIZ);
        LJFF(c1913610ztf);
        LJI(LIZJ(c1913610ztf), c1913610ztf, interfaceC1913620ztg);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService
    public final void LIZIZ(String str, C1913610ztf c1913610ztf, InterfaceC1913620ztg interfaceC1913620ztg) {
        LJI(str, c1913610ztf, interfaceC1913620ztg);
    }

    public final void LJI(final String str, final C1913610ztf c1913610ztf, final InterfaceC1913620ztg interfaceC1913620ztg) {
        boolean z;
        C19EG c19egLIZIZ;
        int iLIZ;
        FragmentManager supportFragmentManager;
        Activity activityLIZIZ;
        Activity activityLIZIZ2;
        final FrameLayout frameLayout;
        TuxIconView tuxIconView;
        Activity activityLIZ;
        View decorView;
        Window window;
        Activity activityLIZIZ3;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Uri.Builder builderBuildUpon = UriProtector.parse("aweme://webview").buildUpon();
        builderBuildUpon.appendQueryParameter("url", str);
        builderBuildUpon.appendQueryParameter("use_spark", "1");
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(builderBuildUpon.build().toString());
        sparkContext.LJJL("use_webview_title", c1913610ztf.LIZLLL);
        sparkContext.LJJL("hide_status_bar", !c1913610ztf.LIZJ);
        sparkContext.LJJL("show_separate_line", c1913610ztf.LJ);
        if (c1913610ztf.LJI) {
            sparkContext.LJJJZ("force_theme_style", "dark");
        }
        sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0zte
            @Override // X.InterfaceC2217701Bqy
            public final Context LIZJ(Context context) {
                return context;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIILLIIL(boolean z2) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIL(Activity activity, Context context) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIII(SparkActivity sparkActivity, boolean z2) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIJZLJL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIJIIJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJZI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                return false;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLJLI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void finish() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                interfaceC1913620ztg.onComplete();
                C1408970mlj c1408970mlj = this.LIZ;
                C1913610ztf c1913610ztf2 = c1913610ztf;
                String str2 = str;
                c1408970mlj.getClass();
                C1408970mlj.LIZ(c1913610ztf2, str2);
            }
        });
        sparkContext.LJJJJZI(new C19336810kw(0));
        C1867460yhE.LIZ.getClass();
        C1867460yhE.LIZIZ.put("consent_h5", Long.valueOf(SystemClock.elapsedRealtime()));
        if (C1697810uHb.LJIIJJI(EnumC1913590ztd.ACCOUNT_SIGNUP_OR_LOGIN.getValue(), EnumC1913590ztd.ACCOUNT_KIDS_SIGNUP.getValue(), EnumC1913590ztd.ACCOUNT_EMAIL_SIGNUP.getValue(), EnumC1913590ztd.ACCOUNT_AGE_GATE.getValue(), EnumC1913590ztd.CONSENT_BOX_ROW.getValue(), EnumC1913590ztd.CONSENT_BOX_KR.getValue(), EnumC1913590ztd.NUJ_CONSENT.getValue()).contains(c1913610ztf.LIZ)) {
            C01GW c01gw = C258090A9n.LIZ;
            if (((Number) c01gw.getValue()).intValue() != 0) {
                C1541950qED.LIZJ.getClass();
                final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(contextLIZ, sparkContext).LIZ(false);
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                interfaceC1913620ztg.onComplete();
                this.LIZ.getClass();
                C1408970mlj.LIZ(c1913610ztf, str);
                if (((Number) c01gw.getValue()).intValue() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                final ViewGroup viewGroup = null;
                if (z) {
                    if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                        C786410Ut5.re(Toast.makeText(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getContext(), "use spark view", 0));
                    }
                    new Object() { // from class: X.0zth
                    }.getClass();
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null) {
                        activityLIZIZ2 = abstractC1387200mCcLIZIZ.LIZIZ();
                    } else {
                        activityLIZIZ2 = null;
                    }
                    if (activityLIZIZ2 != null) {
                        frameLayout = new FrameLayout(activityLIZIZ2);
                        frameLayout.setBackgroundColor(-1);
                        frameLayout.setClickable(true);
                        frameLayout.setFocusable(true);
                        frameLayout.setFocusableInTouchMode(true);
                        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)) + C497820Jfg.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getContext());
                        frameLayout.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, layoutParams);
                    } else {
                        frameLayout = null;
                    }
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c419910GdJ.LIZ = R.raw.icon_arrow_left_ltr;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.u_);
                    if (activityLIZIZ2 != null) {
                        tuxIconView = new TuxIconView(activityLIZIZ2, null, 0, 6, null);
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        tuxIconView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
                        tuxIconView.setTuxIcon(c419910GdJ);
                    } else {
                        tuxIconView = null;
                    }
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 8388659;
                    layoutParams2.topMargin = C497820Jfg.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getContext());
                    if (frameLayout != null) {
                        frameLayout.addView(tuxIconView, layoutParams2);
                    }
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ2 != null && (activityLIZIZ3 = abstractC1387200mCcLIZIZ2.LIZIZ()) != null) {
                        activityLIZ = C1388190mED.LIZ(activityLIZIZ3);
                    } else {
                        activityLIZ = null;
                    }
                    if ((activityLIZ instanceof C19EG) && activityLIZ != null && (window = activityLIZ.getWindow()) != null) {
                        decorView = window.getDecorView();
                    } else {
                        decorView = null;
                    }
                    if (decorView instanceof ViewGroup) {
                        viewGroup = (ViewGroup) decorView;
                    }
                    if (tuxIconView != null) {
                        C786410Ut5.a9(tuxIconView, new ACListenerS74S0300000_7(viewGroup, frameLayout, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, 20));
                    }
                    if (frameLayout != null) {
                        frameLayout.setOnKeyListener(new View.OnKeyListener() { // from class: X.0JDK
                            @Override // android.view.View.OnKeyListener
                            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                                if (i == 4 && keyEvent.getAction() == 1) {
                                    ViewGroup viewGroup2 = viewGroup;
                                    if (viewGroup2 != null) {
                                        C786410Ut5.LJJJLZIJ(frameLayout, viewGroup2);
                                    }
                                    View view2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
                                    if (view2 instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
                                        ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) view2).LJJ(true);
                                    }
                                    return true;
                                }
                                return false;
                            }
                        });
                    }
                    if (viewGroup != null) {
                        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                    }
                    if (frameLayout != null) {
                        frameLayout.requestFocus();
                        return;
                    }
                    return;
                }
                new Object() { // from class: X.0zth
                }.getClass();
                AbstractC1387200mCc abstractC1387200mCcLIZIZ3 = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ3 != null && (activityLIZIZ = abstractC1387200mCcLIZIZ3.LIZIZ()) != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ);
                } else {
                    c19egLIZIZ = null;
                }
                C0OM1 c0om1 = new C0OM1();
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
                c1251150ifB.LIZJ(new AwS550S0100000_6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, 1492));
                c0om1.LJ(c1251150ifB);
                c0om1.LIZLLL = false;
                Context context = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getContext();
                if (context != null) {
                    iLIZ = C497820Jfg.LIZ(context);
                } else {
                    iLIZ = 0;
                }
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIII = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
                tuxSheet.LLJJIJIL = c0om1;
                tuxSheet.LLJJJ = null;
                c1390920mIc.LJIIIIZZ(1);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJL = (int) (((double) iLIZ) * 0.8d);
                tuxSheet2.LLJJIJIIJIL = true;
                tuxSheet2.LLJLILLLLZIIL = false;
                tuxSheet2.LLJLLL = false;
                tuxSheet2.LLILLJJLI = new DialogInterfaceOnDismissListenerC19333210kM(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, 18);
                if (c19egLIZIZ == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
                    return;
                }
                tuxSheet2.show(supportFragmentManager, "consent_half");
                return;
            }
        }
        C1541950qED.LIZJ.getClass();
        new C1541950qED(contextLIZ, sparkContext).LIZIZ();
    }
}
