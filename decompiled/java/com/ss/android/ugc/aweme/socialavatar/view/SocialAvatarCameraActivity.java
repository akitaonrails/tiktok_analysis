package com.ss.android.ugc.aweme.socialavatar.view;

import X.C01GW;
import X.C054G;
import X.C0BNQ;
import X.C0HL2;
import X.C0HL5;
import X.C0HL8;
import X.C0HLA;
import X.C0HLG;
import X.C0HMK;
import X.C0HZ2;
import X.C0PEM;
import X.C0TVI;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1300690jx5;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C14K9;
import X.C15438062q;
import X.C1697810uHb;
import X.C1956107lP;
import X.C20684815ws;
import X.C214873197f;
import X.C2204961BRm;
import X.C2252321DDq;
import X.C23250099c;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C438960HJe;
import X.C439420HKy;
import X.C452501pT;
import X.C786410Ut5;
import X.C838130WuJ;
import X.EnumC335920DEw;
import X.EnumC439250HKh;
import X.EnumC439280HKk;
import X.EnumC439310HKn;
import X.InterfaceC214877197j;
import android.app.Activity;
import android.content.Intent;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarAddFlashToCreationExperiment;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarGenerateData;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarPhotoDetectResultItem;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.BaseSocialAvatarCreationVM;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarCameraActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYjKiYyJCQ6KDHELIOSsyOms6ICokZhYjKiYyJAQ6KDsyOgYtJCohKQQvPSYlITE1";
    public final C01GW LL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS236S0000000_6.get$arr$(337), "enter_from", String.class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS236S0000000_6.get$arr$(338), "enter_method", String.class);
    public final C01GW LLILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS236S0000000_6.get$arr$(346), "source", Integer.class);
    public final C01GW LLILZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS236S0000000_6.get$arr$(335), "conversation_id", String.class);
    public final C01GW LLILZIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS236S0000000_6.get$arr$(347), "story_id", Long.class);
    public final C01GW LLILZLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS236S0000000_6.get$arr$(345), "regenerate", Boolean.class);
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS236S0000000_6.get$arr$(336), "conversation_type", Integer.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS236S0000000_6.get$arr$(342), "exit_route", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS236S0000000_6.get$arr$(340), "exit_broadcast_intent", Intent.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS236S0000000_6.get$arr$(341), "exit_intent", Intent.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS236S0000000_6.get$arr$(348), "task_id", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS236S0000000_6.get$arr$(339), "enter_to", String.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS236S0000000_6.get$arr$(343), "generation_scene", C0HZ2.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS236S0000000_6.get$arr$(344), "perform_generation_outside", Boolean.class);
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(315));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 695));
    public final ViewModelLazy LLJJIII = new ViewModelLazy(C13LE.LIZ(BaseSocialAvatarCreationVM.class), new AwS550S0100000_6((ComponentActivity) this, 696), new AwS550S0100000_6(this, 697), new AwS407S0200000_6((Function0) null, this, 31));
    public final C0HMK LLJJIJI = new SensorEventListener() { // from class: X.0HMK
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            boolean z;
            C0HLC value;
            C0HLC c0hlc;
            C0HM5 c0hm5;
            boolean z2;
            float f = sensorEvent.values[0];
            BaseSocialAvatarCreationVM baseSocialAvatarCreationVMLLLLLZL = this.LL.LLLLLZL();
            baseSocialAvatarCreationVMLLLLLZL.getClass();
            SocialAvatarAddFlashToCreationExperiment.LIZ.getClass();
            if (f < ((Number) SocialAvatarAddFlashToCreationExperiment.LJFF.getValue()).floatValue()) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC332260D0u<C0HLC> interfaceC332260D0uXQ2 = baseSocialAvatarCreationVMLLLLLZL.xQ2();
            do {
                value = interfaceC332260D0uXQ2.getValue();
                c0hlc = value;
                C0HM3 c0hm3 = c0hlc.LIZJ;
                c0hm5 = c0hm3.LIZ;
                z2 = c0hm3.LIZIZ;
                c0hm3.getClass();
            } while (!interfaceC332260D0uXQ2.compareAndSet(value, C0HLC.LIZ(c0hlc, false, null, new C0HM3(c0hm5, z2, z), 3)));
        }
    };

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.socialavatar.view.SocialAvatarCameraActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.socialavatar.view.SocialAvatarCameraActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.socialavatar.view.SocialAvatarCameraActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final BaseSocialAvatarCreationVM LLLLLZL() {
        return (BaseSocialAvatarCreationVM) this.LLJJIII.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.socialavatar.view.SocialAvatarCameraActivity", "onResume", true);
        super.onResume();
        SocialAvatarAddFlashToCreationExperiment.LIZ.getClass();
        if (SocialAvatarAddFlashToCreationExperiment.LIZ()) {
            SensorManager sensorManager = (SensorManager) this.LLJJI.getValue();
            Sensor sensorLJJL = sensorManager != null ? C2204961BRm.LJJL(sensorManager, 5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0DPP/MoJBwQZsa04t8rzzBGE+t+adD5odd1Yz0BYTK5cLuUqwDWK", null)) : null;
            try {
                SensorManager sensorManager2 = (SensorManager) this.LLJJI.getValue();
                if (sensorManager2 != null) {
                    C1300690jx5.LIZJ(sensorManager2, this.LLJJIJI, sensorLJJL, 15000000, (Cert) this.LLJJ.getValue());
                }
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.socialavatar.view.SocialAvatarCameraActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        SocialAvatarAddFlashToCreationExperiment.LIZ.getClass();
        if (SocialAvatarAddFlashToCreationExperiment.LIZ()) {
            try {
                SensorManager sensorManager = (SensorManager) this.LLJJI.getValue();
                if (sensorManager != null) {
                    C1300690jx5.LJ(sensorManager, this.LLJJIJI, (Cert) this.LLJJ.getValue());
                }
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (isFinishing()) {
            C0HL8 c0hl8VQ2 = LLLLLZL().vQ2();
            if (c0hl8VQ2.LJIILIIL == null) {
                c0hl8VQ2.LJIILIIL = "close_app";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("exit_method", c0hl8VQ2.LJIILIIL);
            c2344009Gk.LJ(c0hl8VQ2.LJIILJJIL, "exit_step");
            Boolean bool = c0hl8VQ2.LJIIL;
            if (bool != null) {
                c2344009Gk.LIZJ(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0, "has_camera_permission");
            }
            if (!c0hl8VQ2.LJIILL.isEmpty()) {
                List<EnumC439310HKn> list = c0hl8VQ2.LJIILL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<EnumC439310HKn> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getParam());
                }
                c2344009Gk.LJ(arrayList, "capture_flow");
                c2344009Gk.LJFF("final_capture_method", ((EnumC439310HKn) C13LP.LJJLIIIJJI(c0hl8VQ2.LJIILL)).getParam());
            }
            if (C13LP.LJJLIIIJL(c0hl8VQ2.LJIILL) == EnumC439310HKn.METHOD_SHOOT) {
                c2344009Gk.LIZJ(c0hl8VQ2.LJIIZILJ, "face_capture_look_straight_cnt");
                c2344009Gk.LIZJ(c0hl8VQ2.LJIJJ, "face_capture_make_neutral_face_cnt");
                c2344009Gk.LIZJ(c0hl8VQ2.LJIJI, "face_capture_move_to_eye_level_cnt");
                c2344009Gk.LIZJ(c0hl8VQ2.LJIJ, "face_capture_position_face_in_frame_cnt");
                c2344009Gk.LIZJ(c0hl8VQ2.LJIJJLI, "image_upload_no_center_face_cnt");
                c2344009Gk.LIZJ(c0hl8VQ2.LJIL, "image_upload_not_neutral_expression_cnt");
                c2344009Gk.LIZJ(c0hl8VQ2.LJJ, "image_upload_something_went_wrong_cnt");
            }
            C0HLG.LIZ(c2344009Gk);
            C20684815ws.LJIILLIIL("exit_aimoji_creation", c2344009Gk.LIZ);
        }
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.socialavatar.view.SocialAvatarCameraActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().setStatusBarColor(-16777216);
        getWindow().setNavigationBarColor(-16777216);
        setContentView(R.layout.f_9);
        View viewFindViewById = findViewById(R.id.vnp);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(viewFindViewById, new C0TVI() { // from class: X.0Hfc
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        final Class<SocialAvatarCameraSceneV2> cls = SocialAvatarCameraSceneV2.class;
        C214873197f c214873197f = new C214873197f(this, SocialAvatarCameraSceneV2.class);
        c214873197f.LJFF = R.id.i9u;
        c214873197f.LJIIIIZZ = "SocialAvatarCreationActivity";
        c214873197f.LJI = false;
        c214873197f.LJII = new InterfaceC214877197j() { // from class: X.0HMa
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle2) {
                if (TextUtils.equals(cls.getName(), str)) {
                    return new SocialAvatarCameraSceneV2((SocialAvatarCreationViewModelV2) this.LLLLLZL());
                }
                return null;
            }
        };
        c214873197f.LIZ();
        ((Number) C0BNQ.LIZ.getValue()).intValue();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.socialavatar.view.SocialAvatarCameraActivity", "onCreate", false);
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
        SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2;
        Object value;
        EnumC439250HKh enumC439250HKh;
        SocialAvatarPhotoDetectResultItem socialAvatarPhotoDetectResultItem;
        Activity activity;
        SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV22;
        SocialAvatarPhotoDetectResultItem socialAvatarPhotoDetectResultItem2;
        Object value2;
        EnumC439280HKk enumC439280HKk;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            int iIntValue = -1;
            if (i2 == -1) {
                if (intent == null) {
                    return;
                }
                if (Intrinsics.LJFF(this.LLJILLL.getValue(), Boolean.TRUE)) {
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null && (socialAvatarPhotoDetectResultItem = (SocialAvatarPhotoDetectResultItem) extras.getParcelable("aimoji_album_photo_detect_result")) != null) {
                            SocialAvatarGenerateData socialAvatarGenerateData = new SocialAvatarGenerateData(EnumC439310HKn.METHOD_UPLOAD, socialAvatarPhotoDetectResultItem.boyProb, socialAvatarPhotoDetectResultItem.originalImagePath, socialAvatarPhotoDetectResultItem.normImagePath, socialAvatarPhotoDetectResultItem.faceRectF, socialAvatarPhotoDetectResultItem.noCenterFaceCount, socialAvatarPhotoDetectResultItem.notNeutralExpressionCount, socialAvatarPhotoDetectResultItem.somethingWentWrongCount, 0, 768);
                            Intent intent2 = new Intent();
                            Bundle bundle = new Bundle();
                            C786410Ut5.LJJIJL(bundle, "social_avatar_generate_data", socialAvatarGenerateData);
                            intent2.putExtras(bundle);
                            C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0DPP/MoJBwQZsa04t8rzzBGE+t+adD5odd1Yz0BYTK5cLuUqwDWK", null);
                            C0WST c0wst = new C0WST();
                            Object[] objArr = {-1, intent2};
                            C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
                            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/socialavatar/view/SocialAvatarCameraActivity", "setResult", this, objArr, "void", c0wzw);
                            if (c0wsuLIZIZ.LIZ) {
                                c0wst.LIZ(11071, "com/ss/android/ugc/aweme/socialavatar/view/SocialAvatarCameraActivity", "setResult", null, objArr, this, c0wzw, false);
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
                                c0wst.LIZ(11071, "com/ss/android/ugc/aweme/socialavatar/view/SocialAvatarCameraActivity", "setResult", null, objArr, activity, c0wzw, true);
                            }
                            finish();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                BaseSocialAvatarCreationVM baseSocialAvatarCreationVMLLLLLZL = LLLLLZL();
                if ((baseSocialAvatarCreationVMLLLLLZL instanceof SocialAvatarCreationViewModelV2) && (socialAvatarCreationViewModelV22 = (SocialAvatarCreationViewModelV2) baseSocialAvatarCreationVMLLLLLZL) != null) {
                    socialAvatarCreationViewModelV22.LLJLLL.LJIILLIIL = EnumC439310HKn.METHOD_UPLOAD;
                    try {
                        Bundle extras2 = intent.getExtras();
                        if (extras2 != null && (socialAvatarPhotoDetectResultItem2 = (SocialAvatarPhotoDetectResultItem) extras2.getParcelable("aimoji_album_photo_detect_result")) != null) {
                            Boolean bool = socialAvatarPhotoDetectResultItem2.changeInputPhoto;
                            String str = socialAvatarPhotoDetectResultItem2.fileLocalUriPath;
                            String str2 = socialAvatarPhotoDetectResultItem2.originalImagePath;
                            String str3 = socialAvatarPhotoDetectResultItem2.normImagePath;
                            RectF rectF = socialAvatarPhotoDetectResultItem2.faceRectF;
                            float f = socialAvatarPhotoDetectResultItem2.boyProb;
                            int i3 = socialAvatarPhotoDetectResultItem2.noCenterFaceCount;
                            int i4 = socialAvatarPhotoDetectResultItem2.notNeutralExpressionCount;
                            int i5 = socialAvatarPhotoDetectResultItem2.somethingWentWrongCount;
                            if (str != null) {
                                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(socialAvatarCreationViewModelV22), C0PEM.LIZJ, null, new C0HLA(str, socialAvatarCreationViewModelV22, null), 2);
                            }
                            C2252321DDq c2252321DDq = socialAvatarCreationViewModelV22.LLJIJIL;
                            do {
                                value2 = c2252321DDq.getValue();
                                enumC439280HKk = EnumC439280HKk.UPLOADING;
                                value2.getClass();
                            } while (!c2252321DDq.compareAndSet(value2, new C0HL5(enumC439280HKk, 0L, 0.0f)));
                            socialAvatarCreationViewModelV22.LLJL.invoke(new C438960HJe(true, 4));
                            C054G c054g = C1956107lP.LIZ;
                            C1956107lP.LIZIZ(socialAvatarCreationViewModelV22.wQ2(), false);
                            C23250099c.LIZLLL(C1956107lP.LIZ, null, null, new C439420HKy(str2, str3, rectF, socialAvatarCreationViewModelV22, f, i3, i4, i5, bool, null), 3);
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return;
                    }
                }
                return;
            }
        } else if (i != 1) {
            return;
        }
        if (i2 == 100) {
            BaseSocialAvatarCreationVM baseSocialAvatarCreationVMLLLLLZL2 = LLLLLZL();
            if ((baseSocialAvatarCreationVMLLLLLZL2 instanceof SocialAvatarCreationViewModelV2) && (socialAvatarCreationViewModelV2 = (SocialAvatarCreationViewModelV2) baseSocialAvatarCreationVMLLLLLZL2) != null) {
                socialAvatarCreationViewModelV2.LLJLLL.LJIILLIIL = EnumC439310HKn.METHOD_UPLOAD;
                if (intent != null) {
                    try {
                        String stringExtra = intent.getStringExtra("aimoji_album_selected_image_local_url");
                        if (stringExtra != null) {
                            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(socialAvatarCreationViewModelV2), C0PEM.LIZJ, null, new C0HLA(stringExtra, socialAvatarCreationViewModelV2, null), 2);
                        }
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
                C2252321DDq c2252321DDq2 = socialAvatarCreationViewModelV2.LLJILJILJ;
                do {
                    value = c2252321DDq2.getValue();
                    enumC439250HKh = EnumC439250HKh.FAILURE_IMAGE_UPLOADING;
                    value.getClass();
                } while (!c2252321DDq2.compareAndSet(value, new C0HL2(enumC439250HKh)));
            }
        }
    }
}
