package com.ss.android.ugc.profile.business.ur.socialavatar;

import X.C01GW;
import X.C1308910kAL;
import X.C1378160ly2;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarDownloadArg;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarDownloadShareActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiOiAwISHELIOSQgKDkyPCQ+Zxw8KywtJQ4lKTEtOws8PysgJi43Gy0tOyoSKzElPyYnMQ==";
    public final C01GW LL = RouteArgExtension.INSTANCE.navArg(this, AFwS192S0000000_6.get$arr$(366));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        SocialAvatarDownloadShareFragment socialAvatarDownloadShareFragment;
        Fragment fragmentLJJJJZ = getSupportFragmentManager().LJJJJZ(R.id.iiv);
        if ((fragmentLJJJJZ instanceof SocialAvatarDownloadShareFragment) && (socialAvatarDownloadShareFragment = (SocialAvatarDownloadShareFragment) fragmentLJJJJZ) != null) {
            socialAvatarDownloadShareFragment.UR();
        }
        super.onBackPressed();
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        SocialAvatarDownloadArgument socialAvatarDownloadArgument;
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.eim);
        Serializable serializableExtra = getIntent().getSerializableExtra("social_avatar_background_resources");
        if (serializableExtra instanceof SocialAvatarDownloadArgument) {
            socialAvatarDownloadArgument = (SocialAvatarDownloadArgument) serializableExtra;
        } else {
            socialAvatarDownloadArgument = null;
        }
        if (socialAvatarDownloadArgument != null) {
            try {
                File file = socialAvatarDownloadArgument.displayBackgroundResource;
                if (file != null) {
                    File file2 = socialAvatarDownloadArgument.downloadCardResource;
                    if (file2 != null) {
                        File file3 = socialAvatarDownloadArgument.downloadStaticBackgroundResource;
                        if (file3 != null) {
                            File file4 = socialAvatarDownloadArgument.downloadMaskResource;
                            if (file4 != null) {
                                File file5 = socialAvatarDownloadArgument.staticAvatarResource;
                                if (file5 != null) {
                                    File file6 = socialAvatarDownloadArgument.dynamicAvatarResource;
                                    if (file6 != null) {
                                        String str = socialAvatarDownloadArgument.expressionName;
                                        if (str != null) {
                                            Integer num = socialAvatarDownloadArgument.backgroundStyleIndex;
                                            if (num != null) {
                                                int iIntValue = num.intValue();
                                                if (((SocialAvatarDownloadArg) this.LL.getValue()).getUserId().length() > 0 && ((SocialAvatarDownloadArg) this.LL.getValue()).getUsername().length() > 0 && ((SocialAvatarDownloadArg) this.LL.getValue()).getEnterFrom().length() != 0) {
                                                    if (!isFinishing()) {
                                                        C1378160ly2 c1378160ly2 = SocialAvatarDownloadShareFragment.LLJLLL;
                                                        SocialAvatarDownloadArg socialAvatarDownloadArg = (SocialAvatarDownloadArg) this.LL.getValue();
                                                        c1378160ly2.getClass();
                                                        SocialAvatarDownloadShareFragment socialAvatarDownloadShareFragmentLIZ = C1378160ly2.LIZ(file, file2, file3, file4, file5, file6, str, iIntValue, socialAvatarDownloadArg);
                                                        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                                                        c19ehLJIIJ.LJIJ(R.id.iiv, socialAvatarDownloadShareFragmentLIZ, null);
                                                        c19ehLJIIJ.LJIIJ();
                                                    }
                                                } else {
                                                    throw new Exception("The SocialAvatarDownloadArg should not have null parameter");
                                                }
                                            } else {
                                                throw new Exception("backgroundStyleIndex should not be null");
                                            }
                                        } else {
                                            throw new Exception("dynamicAvatarResource should not be null");
                                        }
                                    } else {
                                        throw new Exception("dynamicAvatarResource should not be null");
                                    }
                                } else {
                                    throw new Exception("staticAvatarResource should not be null");
                                }
                            } else {
                                throw new Exception("downloadMaskResource should not be null");
                            }
                        } else {
                            throw new Exception("downloadStaticBackgroundResource should not be null");
                        }
                    } else {
                        throw new Exception("downloadCardResource should not be null");
                    }
                } else {
                    throw new Exception("displayBackgroundResource should not be null");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                finish();
            }
        } else {
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareActivity", "onCreate", false);
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
