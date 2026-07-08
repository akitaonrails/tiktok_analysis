package com.ss.android.ugc.profile.business.profile.background;

import X.AbstractC1202400hOY;
import X.C01GW;
import X.C0PEM;
import X.C0SXF;
import X.C0TVI;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1248210iaR;
import X.C1254890ilD;
import X.C1254930ilH;
import X.C1266130j3L;
import X.C1308910kAL;
import X.C14K9;
import X.C1619980sG4;
import X.C1697810uHb;
import X.C19514711Wn;
import X.C19HG;
import X.C2296808zG;
import X.C23250099c;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C455790Hu5;
import X.C497270Jen;
import X.C786410Ut5;
import X.EnumC1253850ijX;
import X.EnumC335920DEw;
import Y.ACListenerS154S0100000_19;
import Y.ATListenerS452S0100000_19;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileBgImagePreviewActivity extends BaseActivity {
    public static Bitmap LLJJI = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9ODcjLyY/HELIOSLWsuKCw4LzcjPCE3ZhU+Jik6JCAOLgY+KSIpGT02PiwpPg4wPCw6IDsq";
    public C19HG LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public View LLILZ;
    public List<String> LLILZIL;
    public Bitmap LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLILZLL = true;
    public boolean LLIZ = true;
    public final float LLJILJILJ = 150.0f;
    public final Matrix LLJILLL = new Matrix();
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2088));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLLZL() {
        int i = Build.VERSION.SDK_INT;
        Pair pair = i < 33 ? new Pair(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, TokenCert.Companion.with("bpea-profile_background_image_download")) : i < 34 ? new Pair(new String[]{"android.permission.READ_MEDIA_IMAGES"}, TokenCert.Companion.with("bpea-profile_background_image_download_target_33")) : new Pair(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"}, TokenCert.Companion.with("bpea-profile_background_image_download_target_33"));
        String[] strArr = (String[]) pair.getFirst();
        C19514711Wn.LIZIZ.LIZIZ(this, (AbstractC1202400hOY) pair.getSecond()).LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new C1266130j3L(this, strArr, 1));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C1254890ilD c1254890ilD = (C1254890ilD) this.LLJJ.getValue();
        c1254890ilD.LIZLLL();
        c1254890ilD.LLJI = null;
        c1254890ilD.LLILZIL = null;
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
        ViewGroup.LayoutParams layoutParams;
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(1792);
        }
        Transition sharedElementEnterTransition = getWindow().getSharedElementEnterTransition();
        sharedElementEnterTransition.setDuration(200L);
        sharedElementEnterTransition.setInterpolator(C1619980sG4.LJIILIIL());
        getWindow().setSharedElementsUseOverlay(false);
        setContentView(R.layout.ebv);
        C497270Jen.LJFF(this);
        C455790Hu5.LIZ(this);
        View viewFindViewById = findViewById(R.id.by1);
        if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
            layoutParams.height = C0SXF.LJIIZILJ(this);
        }
        this.LLILZIL = getIntent().getStringArrayListExtra("extra_image_url_list");
        this.LLILZLL = getIntent().getBooleanExtra("extra_enable_save", true);
        this.LLIZ = getIntent().getBooleanExtra("extra_enable_change", true);
        List<String> list = this.LLILZIL;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1248210iaR.LIZJ("ProfileBgImagePreview", "Missing imageUrlList, finishing activity", EnumC1253850ijX.OTHERS, "");
            super.finish();
        }
        this.LL = (C19HG) findViewById(R.id.bxr);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.cnu);
        this.LLILLL = (TuxTextView) findViewById(R.id.cnr);
        this.LLILZ = findViewById(R.id.bxw);
        C19HG c19hg = this.LL;
        if (c19hg != null) {
            C14K9.LJIJJLI(c19hg, "profile_bg_image_preview");
        }
        View viewFindViewById2 = findViewById(R.id.cns);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS154S0100000_19(this, 219), viewFindViewById2);
        }
        if (this.LLIZ) {
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                if (this.LLILZLL) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LLLLZLL(tuxTextView, i);
            }
            TuxTextView tuxTextView2 = this.LLILLJJLI;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(2131845377);
            }
            TuxTextView tuxTextView3 = this.LLILLJJLI;
            if (tuxTextView3 != null) {
                C786410Ut5.h9(tuxTextView3, new ACListenerS154S0100000_19(this, 220));
            }
            TuxTextView tuxTextView4 = this.LLILLL;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 0);
            }
            TuxTextView tuxTextView5 = this.LLILLL;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(2131845376);
            }
            TuxTextView tuxTextView6 = this.LLILLL;
            if (tuxTextView6 != null) {
                C786410Ut5.h9(tuxTextView6, new ACListenerS154S0100000_19(this, 221));
            }
        } else {
            TuxTextView tuxTextView7 = this.LLILLJJLI;
            if (tuxTextView7 != null) {
                C786410Ut5.LLLLZLL(tuxTextView7, 4);
            }
            TuxTextView tuxTextView8 = this.LLILLJJLI;
            if (tuxTextView8 != null) {
                tuxTextView8.setText(2131845375);
            }
            TuxTextView tuxTextView9 = this.LLILLJJLI;
            if (tuxTextView9 != null) {
                C786410Ut5.h9(tuxTextView9, new ACListenerS154S0100000_19(this, 223));
            }
            TuxTextView tuxTextView10 = this.LLILLL;
            if (tuxTextView10 != null) {
                C786410Ut5.LLLLZLL(tuxTextView10, 4);
            }
            TuxTextView tuxTextView11 = this.LLILLL;
            if (tuxTextView11 != null) {
                tuxTextView11.setText(2131845378);
            }
            TuxTextView tuxTextView12 = this.LLILLL;
            if (tuxTextView12 != null) {
                C786410Ut5.h9(tuxTextView12, new ACListenerS154S0100000_19(this, 225));
            }
        }
        View viewFindViewById3 = findViewById(R.id.bxm);
        if (viewFindViewById3 != null) {
            final int paddingBottom = viewFindViewById3.getPaddingBottom();
            C14K9.LJIJJ(viewFindViewById3, new C0TVI() { // from class: X.0DRH
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), paddingBottom + c20246014Ju.LIZ(2).LIZLLL);
                    return c20246014Ju;
                }
            });
            if (viewFindViewById3.isAttachedToWindow()) {
                viewFindViewById3.requestApplyInsets();
            }
        }
        C19HG c19hg2 = this.LL;
        if (c19hg2 != null) {
            c19hg2.setOnTouchListener(new ATListenerS452S0100000_19(this, 7));
        }
        List<String> list2 = this.LLILZIL;
        if (list2 != null && !list2.isEmpty()) {
            Bitmap bitmap = LLJJI;
            LLJJI = null;
            if (bitmap != null) {
                C1248210iaR.LJ("ProfileBgImagePreview", "loadImage: using initial bitmap for instant display", EnumC1253850ijX.OTHERS, "");
                this.LLIZLLLIL = bitmap;
                C19HG c19hg3 = this.LL;
                if (c19hg3 != null) {
                    c19hg3.setImageBitmap(bitmap);
                }
            } else {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1254930ilH(this, null), 3);
            }
        } else {
            C1248210iaR.LIZJ("ProfileBgImagePreview", "loadImage: imageUrlList is empty", EnumC1253850ijX.OTHERS, "");
        }
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity", "onCreate", false);
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
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        Activity activity;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent2);
        if (!((C1254890ilD) this.LLJJ.getValue()).LJ(i, i2, intent2) && i == 2002) {
            int iIntValue = -1;
            if (i2 == -1) {
                if (intent2 == null) {
                    intent2 = new Intent();
                    intent2.putExtra("extra_bg_updated", true);
                }
                C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vpjsCmOQvxKkBRrqLwSJLa+uAZs9Z/Y3ig7uX5nrnoGoNR1DsFsl9Ipy2zelD8AKC", null);
                C0WST c0wst = new C0WST();
                Object[] objArr = {-1, intent2};
                C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/profile/business/profile/background/ProfileBgImagePreviewActivity", "setResult", this, objArr, "void", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(11071, "com/ss/android/ugc/profile/business/profile/background/ProfileBgImagePreviewActivity", "setResult", null, objArr, this, c0wzw, false);
                } else {
                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                    if (objArr2 != null) {
                        Object obj = objArr2[0];
                        if (obj != null) {
                            activity = (Activity) obj;
                        } else {
                            activity = this;
                        }
                        Object obj2 = objArr2[1];
                        if (obj2 != null) {
                            iIntValue = ((Integer) obj2).intValue();
                        }
                        Object obj3 = c0wsuLIZIZ.LIZJ[2];
                        if (obj3 != null) {
                            intent2 = (Intent) obj3;
                        }
                    } else {
                        activity = this;
                    }
                    activity.setResult(iIntValue, intent2);
                    c0wst.LIZ(11071, "com/ss/android/ugc/profile/business/profile/background/ProfileBgImagePreviewActivity", "setResult", null, objArr, activity, c0wzw, true);
                }
                super.finish();
            }
        }
    }
}
