package com.ss.android.ugc.profile.business.ur.utils;

import X.C01GW;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1910890zpH;
import X.C214873197f;
import X.C2216131BoR;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.EnumC335920DEw;
import X.InterfaceC214877197j;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.profile.business.ur.utils.ProfileAvatarChoosePhotoActivity;
import com.ss.android.ugc.profile.business.ur.utils.ProfileAvatarChoosePhotoScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS552S0100000_8;
import lth.o;

/* JADX INFO: loaded from: classes9.dex */
public final class ProfileAvatarChoosePhotoActivity extends MvChoosePhotoActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiHELIOSPDs6JDZiGT08LiwgLA4lKTEtOww7Jyo/LB87JzEjCCwnITMlPTY=";
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(537));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 800));

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.utils.ProfileAvatarChoosePhotoActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.utils.ProfileAvatarChoosePhotoActivity", "onResume", false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.utils.ProfileAvatarChoosePhotoActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.utils.ProfileAvatarChoosePhotoActivity", "onStart", false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.utils.ProfileAvatarChoosePhotoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity
    public final void LLLLZLLLI() {
        C214873197f c214873197f = new C214873197f(this, ProfileAvatarChoosePhotoScene.class);
        c214873197f.LJFF = R.id.i9u;
        c214873197f.LJIIIIZZ = "ProfileAvatarChoosePhotoActivity";
        c214873197f.LJI = false;
        c214873197f.LJII = new InterfaceC214877197j() { // from class: X.0Kzz
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle) {
                ProfileAvatarChoosePhotoScene profileAvatarChoosePhotoScene = null;
                if (TextUtils.equals("com.ss.android.ugc.profile.business.ur.utils.ProfileAvatarChoosePhotoScene", str)) {
                    profileAvatarChoosePhotoScene = new ProfileAvatarChoosePhotoScene();
                    ProfileAvatarChoosePhotoActivity profileAvatarChoosePhotoActivity = this.LIZ;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("key_choose_scene", 45);
                    bundle2.putInt("key_support_flag", 2);
                    bundle2.putInt("key_photo_select_min_count", 1);
                    bundle2.putInt("key_photo_select_max_count", 1);
                    C786410Ut5.LJJJI("key_mv_hint_text", " ", bundle2);
                    if (((Boolean) C1EDI.LJIILJJIL.getValue()).booleanValue()) {
                        C786410Ut5.LJJIZ(bundle2, "key_album_interact_view_holder_list", C1697810uHb.LJ(new C536620L2u((C1255030ilR) profileAvatarChoosePhotoActivity.LLILZIL.getValue(), profileAvatarChoosePhotoActivity)));
                    }
                    try {
                        Bundle extras = profileAvatarChoosePhotoActivity.getIntent().getExtras();
                        if (extras != null) {
                            bundle2.putInt("upload_photo_min_height", extras.getInt("upload_photo_min_height"));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    try {
                        Bundle extras2 = profileAvatarChoosePhotoActivity.getIntent().getExtras();
                        if (extras2 != null) {
                            bundle2.putInt("upload_photo_min_width", extras2.getInt("upload_photo_min_width"));
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    profileAvatarChoosePhotoScene.mArguments = bundle2;
                }
                return profileAvatarChoosePhotoScene;
            }
        };
        c214873197f.LIZ();
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

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity, X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.utils.ProfileAvatarChoosePhotoActivity", "onCreate", true);
        super.onCreate(bundle);
        o.LJFF(C2216131BoR.LIZ());
        ((C1910890zpH) this.LLILZ.getValue()).LIZ("ProfileAvatarChoosePhotoActivity", "initVESDK");
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.utils.ProfileAvatarChoosePhotoActivity", "onCreate", false);
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            super.onActivityResult(r5, r6, r7)
            X.01GW r0 = X.C1EDI.LJIILJJIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L12
            return
        L12:
            r0 = 10002(0x2712, float:1.4016E-41)
            if (r5 != r0) goto L31
            if (r7 == 0) goto L33
            if (r6 != 0) goto L38
            java.lang.String r0 = "retake"
            r1 = 0
            boolean r0 = r7.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L30
            X.01GW r0 = r4.LLILZIL
            java.lang.Object r0 = r0.getValue()
            X.0ilR r0 = (X.C1255030ilR) r0
            X.0imR r0 = r0.LL
            r0.LJIIL(r1)
        L30:
            return
        L31:
            if (r7 != 0) goto L38
        L33:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
        L38:
            X.0ihR r3 = X.C1252550ihR.LIZ
            java.lang.String r1 = "photo"
            java.lang.String r0 = "video"
            java.lang.String[] r2 = new java.lang.String[]{r1, r0}
            r3.getClass()
            r1 = 0
            java.lang.String r0 = "click_save"
            android.os.Bundle r1 = X.C1252550ihR.LJI(r1, r0, r2)
            java.lang.String r0 = "extras_info"
            r7.putExtra(r0, r1)
            X.01GW r0 = r4.LLILZIL
            java.lang.Object r0 = r0.getValue()
            X.0ilR r0 = (X.C1255030ilR) r0
            boolean r0 = r0.onActivityResult(r5, r6, r7)
            if (r0 == 0) goto L30
            r4.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.utils.ProfileAvatarChoosePhotoActivity.onActivityResult(int, int, android.content.Intent):void");
    }
}
