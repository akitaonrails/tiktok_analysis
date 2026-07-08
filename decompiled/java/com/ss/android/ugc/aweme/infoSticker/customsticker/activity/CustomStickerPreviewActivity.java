package com.ss.android.ugc.aweme.infoSticker.customsticker.activity;

import X.AbstractActivityC1674880tgc;
import X.C0JAI;
import X.C1166990gTR;
import X.C11NJ;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1659650tI3;
import X.C1697810uHb;
import X.C20577315fX;
import X.C214873197f;
import X.C299020Bno;
import X.C335910DEv;
import X.C497820Jfg;
import X.C537520L6g;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC214877197j;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CustomStickerPreviewActivity extends AbstractActivityC1674880tgc {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiLyAAPCwvIiohZiY5Ojs8JTY4HELIOSICw4LTdiKCwnITMlPTZ9CzA/PSA+GzElKiQ2OhU+LDk6LTINKjs6Piw4MA==";
    public C1166990gTR LLIZ;
    public EditPreviewStickerViewModel LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public CreativeInfo LLJILJIL;

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLLZLLLI(boolean z) {
    }

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLZ() {
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C1166990gTR c1166990gTR = this.LLIZ;
        if (c1166990gTR == null) {
            c1166990gTR = null;
        }
        if (((C20577315fX) c1166990gTR.LLJJJ.getValue()).LLLILZ()) {
            super.onBackPressed();
            return;
        }
        C1166990gTR c1166990gTR2 = this.LLIZ;
        if (c1166990gTR2 == null) {
            c1166990gTR2 = null;
        }
        if (((C20577315fX) c1166990gTR2.LLJJJ.getValue()).LLLIIIL) {
            return;
        }
        C1166990gTR c1166990gTR3 = this.LLIZ;
        if (c1166990gTR3 == null) {
            c1166990gTR3 = null;
        }
        if (!((C20577315fX) c1166990gTR3.LLJJJ.getValue()).isLoading()) {
            super.onBackPressed();
            return;
        }
        EditPreviewStickerViewModel editPreviewStickerViewModel = this.LLIZLLLIL;
        EditPreviewStickerViewModel editPreviewStickerViewModel2 = editPreviewStickerViewModel != null ? editPreviewStickerViewModel : null;
        C11NJ c11nj = editPreviewStickerViewModel2.LLILZIL;
        if (c11nj != null) {
            c11nj.dispose();
        }
        editPreviewStickerViewModel2.setState(AFwS276S0000000_31.get$arr$(309));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
        super.onPause();
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

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLZIL(boolean z) {
        int iMax = Math.max(C497820Jfg.LIZJ(this) - ((int) C0JAI.LIZ(8.0f, this)), 0) + ((int) C0JAI.LIZ(24.5f, this));
        View viewFindViewById = findViewById(R.id.bmy);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams();
        layoutParams.topMargin = iMax;
        C786410Ut5.W5(viewFindViewById, layoutParams);
    }

    @Override // X.AbstractActivityC1674880tgc, X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ik);
        this.LLJILJIL = C537520L6g.LIZ(getIntent());
        EditPreviewStickerViewModel editPreviewStickerViewModel = null;
        try {
            stringExtra = getIntent().getStringExtra("shoot_way");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LLJ = stringExtra;
        try {
            stringExtra2 = getIntent().getStringExtra("content_source");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            stringExtra2 = null;
        }
        this.LLJI = stringExtra2;
        try {
            stringExtra3 = getIntent().getStringExtra("content_type");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            stringExtra3 = null;
        }
        this.LLJIJIL = stringExtra3;
        MediaModel mediaModel = (MediaModel) getIntent().getParcelableExtra("preview_sticker_params");
        if (mediaModel != null) {
            Effect effect = (Effect) getIntent().getParcelableExtra("custom_sticker");
            String str = this.LLJ;
            String str2 = this.LLJI;
            String str3 = this.LLJIJIL;
            CreativeInfo creativeInfo = this.LLJILJIL;
            if (creativeInfo == null) {
                creativeInfo = null;
            }
            this.LLIZ = new C1166990gTR(mediaModel, effect, str, str2, str3, creativeInfo);
            C214873197f c214873197f = new C214873197f(this, C1166990gTR.class);
            c214873197f.LJI = false;
            c214873197f.LJII = new InterfaceC214877197j() { // from class: X.0MB5
                @Override // X.InterfaceC214877197j
                public final Scene LIZ(ClassLoader classLoader, String str4, Bundle bundle2) {
                    C1166990gTR c1166990gTR;
                    if (!Intrinsics.LJFF(C1166990gTR.class.getName(), str4) || (c1166990gTR = this.LIZ.LLIZ) == null) {
                        return null;
                    }
                    return c1166990gTR;
                }
            };
            c214873197f.LIZLLL = false;
            c214873197f.LJ = false;
            c214873197f.LJFF = R.id.tp8;
            c214873197f.LIZ();
        }
        EditPreviewStickerViewModel editPreviewStickerViewModel2 = (EditPreviewStickerViewModel) C1659650tI3.LIZ(this).LIZ(EditPreviewStickerViewModel.class);
        this.LLIZLLLIL = editPreviewStickerViewModel2;
        if (editPreviewStickerViewModel2 != null) {
            editPreviewStickerViewModel = editPreviewStickerViewModel2;
        }
        MediaModel mediaModel2 = (MediaModel) getIntent().getParcelableExtra("preview_sticker_params");
        editPreviewStickerViewModel.getClass();
        editPreviewStickerViewModel.setState(new AwS610S0100000_31(mediaModel2, 441));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onCreate", false);
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
