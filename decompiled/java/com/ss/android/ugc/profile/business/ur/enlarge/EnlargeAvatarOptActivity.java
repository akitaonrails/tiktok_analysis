package com.ss.android.ugc.profile.business.ur.enlarge;

import X.AbstractC20628015ni;
import X.C01GW;
import X.C03IT;
import X.C0C64;
import X.C10EU;
import X.C1233040iBy;
import X.C1245160iVW;
import X.C1255030ilR;
import X.C1256750ioD;
import X.C1256770ioF;
import X.C1308910kAL;
import X.C1322200kVm;
import X.C1365870leD;
import X.C1436405jm;
import X.C1440005kM;
import X.C14EU;
import X.C14LC;
import X.C1599690rjL;
import X.C1697810uHb;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C268330AfP;
import X.C299020Bno;
import X.C335910DEv;
import X.C418440Gaw;
import X.C442840HYc;
import X.C442910HYj;
import X.C452501pT;
import X.C631450Opj;
import X.C786410Ut5;
import X.C844470XAv;
import X.C848450XQd;
import X.EnumC335920DEw;
import X.InterfaceC1232420iAy;
import X.InterfaceC1255040ilS;
import X.InterfaceC1294060jmO;
import X.InterfaceC1365380ldQ;
import X.InterfaceC438160HGc;
import Y.AObserverS223S0100000_19;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.AvatarSizeUrlStruct;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public final class EnlargeAvatarOptActivity extends BaseActivity implements InterfaceC1232420iAy, InterfaceC1255040ilS {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9HELIOSPTdiLCE/KTcrLGEWJiktOyg2CTMtPS4hBzU4CCwnITMlPTY=";
    public ViewGroup LL;
    public TuxIconView LLILLJJLI;
    public AvatarComponentView LLILLL;
    public User LLILZ;
    public boolean LLILZIL;
    public LinearLayout LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public Integer LLJILJIL;
    public Integer LLJILJILJ;
    public final boolean LLILZLL = C14LC.LJIIIZ;
    public double LLJIJIL = 128.0d;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 884));
    public final AObserverS223S0100000_19 LLJJ = new AObserverS223S0100000_19(this, 43);
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2264));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(360));

    @Override // X.InterfaceC1255040ilS
    public final void Eb0(AvatarUri avatarUri) {
    }

    @Override // X.InterfaceC1232420iAy
    public final void JE2(int i, Exception exc) {
    }

    @Override // X.InterfaceC1232420iAy
    public final void aL0(String str, boolean z) {
    }

    @Override // X.InterfaceC1255040ilS
    public final void hO(Exception exc) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarOptActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarOptActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarOptActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarOptActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarOptActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final boolean LLLLLZL() {
        return ((Boolean) this.LLJJI.getValue()).booleanValue();
    }

    public final boolean LLLLZI() {
        User user;
        ProfileBadgeStruct profileBadge;
        User user2 = this.LLILZ;
        ProfileBadgeStruct profileBadge2 = user2 != null ? user2.getProfileBadge() : null;
        return (!C268330AfP.LIZIZ() || profileBadge2 == null || profileBadge2.getUrl().length() == 0 || C10EU.LJIIIIZZ() || (user = this.LLILZ) == null || (profileBadge = user.getProfileBadge()) == null || !profileBadge.getShouldShow()) ? false : true;
    }

    public final void LLLLZLL() {
        User user;
        AvatarSizeUrlStruct dynamicSocialAvatar;
        UrlModel urlModel;
        List<String> urlList;
        if (!LLLLLZL() || (user = this.LLILZ) == null || (dynamicSocialAvatar = user.getDynamicSocialAvatar()) == null || (urlModel = dynamicSocialAvatar.avatarLarger) == null || (urlList = urlModel.getUrlList()) == null) {
            return;
        }
        AvatarComponentView avatarComponentView = this.LLILLL;
        if (avatarComponentView == null) {
            avatarComponentView = null;
        }
        InterfaceC438160HGc socialAvatarAbility = avatarComponentView.getSocialAvatarAbility();
        if (socialAvatarAbility != null) {
            socialAvatarAbility.LIZIZ(urlList);
        }
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC1294060jmO
    public final void onBackPressed() {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "fix_6864128301_sa_enlarge_avatar_dismiss_jank", true, true)) {
            super.onBackPressed();
        }
        LLLLZIL("click_cancel");
        finishAfterTransition();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_6864128301_sa_enlarge_avatar_dismiss_jank", true, true) && LLLLLZL()) {
            AvatarComponentView avatarComponentView = this.LLILLL;
            if (avatarComponentView == null) {
                avatarComponentView = null;
            }
            InterfaceC438160HGc socialAvatarAbility = avatarComponentView.getSocialAvatarAbility();
            if (socialAvatarAbility != null) {
                socialAvatarAbility.LIZ();
            }
        }
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

    public final void LLLLZIL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str2 = this.LLJI;
        if (str2 == null) {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", this.LLJ);
        c2344009Gk.LJIIIIZZ("exit_method", str);
        c2344009Gk.LJ(Boolean.TRUE, "is_avatar");
        c2344009Gk.LJIIIIZZ("local_time_ms", String.valueOf(System.currentTimeMillis()));
        C20684815ws.LJIILLIIL("cancel_profile_photo", c2344009Gk.LIZ);
    }

    public final void LLLLZLLIL(boolean z) {
        C442840HYc c442840HYc;
        LinearLayout linearLayout = null;
        if (z) {
            C442840HYc c442840HYc2 = (C442840HYc) this.LLJILLL.getValue();
            if (c442840HYc2 != null) {
                LinearLayout linearLayout2 = this.LLIZ;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                C786410Ut5.LJJJJJL(linearLayout2);
                C631450Opj.LIZ(linearLayout2, Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(14.0f))), null, null, null, null, 30);
                int i = 0;
                do {
                    AbstractC20628015ni abstractC20628015ni = (AbstractC20628015ni) C786410Ut5.LJLLJ(c442840HYc2.LIZ, R.layout.ed0, null);
                    int placeholderColor = abstractC20628015ni.getPlaceholderColor();
                    int pulsingColor = abstractC20628015ni.getPulsingColor();
                    abstractC20628015ni.setLoading(true);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setDuration(800L);
                    valueAnimator.setRepeatCount(-1);
                    valueAnimator.setRepeatMode(2);
                    valueAnimator.setIntValues(placeholderColor, pulsingColor);
                    valueAnimator.setEvaluator(new ArgbEvaluator());
                    abstractC20628015ni.setAnimator(valueAnimator);
                    linearLayout2.addView(abstractC20628015ni);
                    i++;
                } while (i < 3);
                return;
            }
            return;
        }
        AObserverS223S0100000_19 aObserverS223S0100000_19 = this.LLJJ;
        int i2 = C2187451AjH.LIZ;
        C442910HYj.LIZ.removeObserver(aObserverS223S0100000_19);
        String str = this.LLIZLLLIL;
        if (str != null && (c442840HYc = (C442840HYc) this.LLJILLL.getValue()) != null) {
            LinearLayout linearLayout3 = this.LLIZ;
            if (linearLayout3 != null) {
                linearLayout = linearLayout3;
            }
            c442840HYc.LJIIJJI(linearLayout, str, new C1256750ioD(this), new C1256770ioF(this));
        }
    }

    @Override // X.InterfaceC1232420iAy
    public final void Pc0(boolean z) {
        if (z) {
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZIZ(2131858159);
            c1233040iBy.LIZLLL();
            C1440005kM.LIZ(new C1436405jm(false));
            finishAfterTransition();
        }
    }

    @Override // X.InterfaceC1255040ilS
    public final void dN2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("file://");
        sbLIZ.append(str);
        Uri uri = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
        C1322200kVm.LIZ().LIZJ(uri);
        AvatarComponentView avatarComponentView = this.LLILLL;
        if (avatarComponentView == null) {
            avatarComponentView = null;
        }
        avatarComponentView.LJIIJ(new C03IT(Collections.singletonList(uri.toString())));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0168 A[PHI: r1
      0x0168: PHI (r1v17 float) = (r1v12 float), (r1v18 float) binds: [B:85:0x0280, B:55:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0284  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarOptActivity.onCreate(android.os.Bundle):void");
    }

    @C14EU
    public final void onShareCompleteEvent(C1365870leD c1365870leD) {
        IMSharePanelApi.LIZ.getClass();
        InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
        ViewGroup viewGroup = this.LL;
        if (viewGroup == null) {
            viewGroup = null;
        }
        shareService.LJIL(this, viewGroup, c1365870leD);
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

    @Override // X.InterfaceC1232420iAy
    public final void Ud0(int i, User user) {
        AvatarSizeUrlStruct staticAvatar;
        UrlModel urlModel;
        List<String> urlList;
        AvatarSizeUrlStruct dynamicSocialAvatar;
        UrlModel urlModel2;
        List<String> urlList2;
        if (i == 112 && !Intrinsics.LJFF(this.LLJILJILJ, this.LLJILJIL)) {
            this.LLJILJILJ = this.LLJILJIL;
            AvatarMetaInfo avatarMetaInfoLIZIZ = C1245160iVW.LIZIZ(user);
            if (avatarMetaInfoLIZIZ != null) {
                avatarMetaInfoLIZIZ.setAvatarChoice(this.LLJILJILJ);
            }
            C1440005kM.LIZ(new C848450XQd(user));
            Integer num = this.LLJILJILJ;
            AvatarComponentView avatarComponentView = null;
            if (num != null && num.intValue() == 1) {
                User user2 = this.LLILZ;
                if (user2 != null && (dynamicSocialAvatar = user2.getDynamicSocialAvatar()) != null && (urlModel2 = dynamicSocialAvatar.avatarLarger) != null && (urlList2 = urlModel2.getUrlList()) != null) {
                    AvatarComponentView avatarComponentView2 = this.LLILLL;
                    if (avatarComponentView2 != null) {
                        avatarComponentView = avatarComponentView2;
                    }
                    InterfaceC438160HGc socialAvatarAbility = avatarComponentView.getSocialAvatarAbility();
                    if (socialAvatarAbility != null) {
                        socialAvatarAbility.LIZIZ(urlList2);
                        return;
                    }
                    return;
                }
                return;
            }
            User user3 = this.LLILZ;
            if (user3 == null || (staticAvatar = user3.getStaticAvatar()) == null || (urlModel = staticAvatar.avatarLarger) == null || (urlList = urlModel.getUrlList()) == null) {
                return;
            }
            AvatarComponentView avatarComponentView3 = this.LLILLL;
            if (avatarComponentView3 != null) {
                avatarComponentView = avatarComponentView3;
            }
            InterfaceC438160HGc socialAvatarAbility2 = avatarComponentView.getSocialAvatarAbility();
            if (socialAvatarAbility2 == null) {
                return;
            }
            socialAvatarAbility2.LIZLLL(urlList, true);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC1294060jmO
    public final void onActivityResult(int i, int i2, Intent intent) {
        C1255030ilR c1255030ilR;
        super.onActivityResult(i, i2, intent);
        C442840HYc c442840HYc = (C442840HYc) this.LLJILLL.getValue();
        if (c442840HYc != null && (c1255030ilR = c442840HYc.LJIIIIZZ) != null) {
            c1255030ilR.onActivityResult(i, i2, intent);
        }
    }
}
