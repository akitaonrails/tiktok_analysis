package com.ss.android.ugc.aweme.music.ui;

import X.C0OM1;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1061730djf;
import X.C1250250idj;
import X.C1250300ido;
import X.C1266020j3A;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C299020Bno;
import X.C335910DEv;
import X.C397901gf;
import X.C785410UrT;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.EnumC638250P1r;
import X.InterfaceC1239340iM8;
import Y.ACListenerS154S0100000_19;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS33S0010000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class EditOriginMusicTitleActivity extends BaseActivity implements InterfaceC1239340iM8 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiYwZjHELIOSAlZwo3ITEDOyY0ISsBPDw6KxElPSM2CSY4IDk6PDw=";
    public TuxNavBar LL;
    public EditText LLILLJJLI;
    public ImageView LLILLL;
    public final String LLILZ = "[._ \\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]+";
    public String LLILZIL;
    public String LLILZLL;
    public EditOriginMusicTitlePresenter LLIZ;
    public ProgressDialog LLIZLLLIL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1239340iM8
    public final void onSuccess() throws Throwable {
        Activity activity;
        char c;
        int i;
        ProgressDialog progressDialog = this.LLIZLLLIL;
        if (progressDialog != null && progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = this.LLIZLLLIL;
            progressDialog2.dismiss();
            C785410UrT.LIZ(progressDialog2);
        }
        Intent intent = new Intent();
        intent.putExtra("MUSIC_TITLE", this.LLILZIL);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe9cJbNkicrVaFMq/OOTscd35AyT4XDmPSc4EYT6YyZ0XWmhVQ=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/music/ui/EditOriginMusicTitleActivity", "setResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/music/ui/EditOriginMusicTitleActivity", "setResult", null, objArr, this, c0wzw, false);
            c = 0;
            i = 2;
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                activity = obj != null ? (Activity) obj : this;
                Object obj2 = objArr2[1];
                iIntValue = obj2 != null ? ((Integer) obj2).intValue() : -1;
                Object obj3 = c0wsuLIZIZ.LIZJ[2];
                if (obj3 != null) {
                    intent = (Intent) obj3;
                }
            } else {
                activity = this;
            }
            activity.setResult(iIntValue, intent);
            c = 0;
            i = 2;
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/music/ui/EditOriginMusicTitleActivity", "setResult", null, objArr, activity, c0wzw, true);
        }
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        new C1061730djf();
        Pair[] pairArr = new Pair[i];
        String str = this.LLILZLL;
        if (str == null) {
            str = "";
        }
        pairArr[c] = new Pair("music_id", str);
        String str2 = this.LLILZIL;
        pairArr[1] = new Pair("new_title", str2 != null ? str2 : "");
        C1548820qPI.LIZIZ(new C397901gf(jCurrentThreadTimeMillis, C1061730djf.LIZLLL(C2097608Jq.LJIIIIZZ(pairArr)), "change_music_title"));
        finish();
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onCreate", true);
        activityConfiguration(AFwS248S0000000_14.get$arr$(308));
        super.onCreate(bundle);
        setContentView(R.layout.dpn);
        this.LL = (TuxNavBar) findViewById(R.id.y08);
        this.LLILLJJLI = (EditText) findViewById(R.id.ox8);
        ImageView imageView = (ImageView) findViewById(R.id.e05);
        this.LLILLL = imageView;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS154S0100000_19(this, 120));
        }
        this.LLIZ = new EditOriginMusicTitlePresenter(this);
        try {
            stringExtra = getIntent().getStringExtra("MUSIC_TITLE");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LLILZLL = stringExtra;
        EditText editText = this.LLILLJJLI;
        if (editText != null) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
        }
        EditText editText2 = this.LLILLJJLI;
        if (editText2 != null) {
            editText2.addTextChangedListener(new C1266020j3A(this, 7));
        }
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1250300ido c1250300ido = new C1250300ido();
            c1250300ido.LIZJ = getString(2131828217);
            c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
            c1250300ido.LIZ(new AwS563S0100000_19(this, 1620));
            c0om1.LJ(c1250300ido);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(R.string.ilc);
            c0om1.LIZJ = c1250250idj;
            C1250300ido c1250300ido2 = new C1250300ido();
            c1250300ido2.LIZJ = getString(2131833276);
            c1250300ido2.LIZIZ = "save";
            c1250300ido2.LIZ(new AwS563S0100000_19(this, 1621));
            c0om1.LIZIZ(c1250300ido2);
            tuxNavBar.setNavActions(c0om1);
        }
        this.LL.LJJ(new AwS33S0010000_19(false, 30), "save");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onCreate", false);
    }

    @Override // X.InterfaceC1239340iM8
    public final void onError(String str) {
        ProgressDialog progressDialog = this.LLIZLLLIL;
        if (progressDialog != null && progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = this.LLIZLLLIL;
            progressDialog2.dismiss();
            C785410UrT.LIZ(progressDialog2);
        }
        if (!TextUtils.isEmpty(str)) {
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void onViewClicked(View view) {
        if (view.getId() == R.id.e05) {
            this.LLILLJJLI.setText("");
        }
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
