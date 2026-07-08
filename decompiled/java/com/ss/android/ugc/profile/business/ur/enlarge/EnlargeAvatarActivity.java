package com.ss.android.ugc.profile.business.ur.enlarge;

import X.C01GW;
import X.C03IT;
import X.C1067920dte;
import X.C10EU;
import X.C1255030ilR;
import X.C1255650imR;
import X.C1256710io9;
import X.C1256720ioA;
import X.C1308910kAL;
import X.C1322200kVm;
import X.C1365870leD;
import X.C1369580lkC;
import X.C14EU;
import X.C1599690rjL;
import X.C1619980sG4;
import X.C1697810uHb;
import X.C19252910Tv;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C268330AfP;
import X.C280120AyQ;
import X.C299020Bno;
import X.C308850C8t;
import X.C313430CQj;
import X.C335910DEv;
import X.C452501pT;
import X.C475630Ikz;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1254860ilA;
import X.EnumC335920DEw;
import X.InterfaceC1249220ic4;
import X.InterfaceC1255040ilS;
import X.InterfaceC1294060jmO;
import X.InterfaceC1365380ldQ;
import X.InterfaceC445670Hdl;
import X.ViewTreeObserverOnGlobalLayoutListenerC1265990j37;
import Y.ACListenerS110S0200000_6;
import Y.ACListenerS154S0100000_19;
import Y.AUListenerS268S0100000_19;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.profile.aigc.ProfileBadgeSettingsObject;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public final class EnlargeAvatarActivity extends BaseActivity implements InterfaceC1255040ilS {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjHELIOSx9PTdiLCE/KTcrLGEWJiktOyg2CTMtPS4hCSY4IDk6PDw=";
    public ViewGroup LL;
    public C197039127h LLILLJJLI;
    public C197039127h LLILLL;
    public TuxIconView LLILZ;
    public AvatarComponentView LLILZIL;
    public User LLILZLL;
    public boolean LLIZ;
    public LinearLayout LLIZLLLIL;
    public Animator LLJ;
    public View LLJIJIL;
    public C1369580lkC LLJILJIL;
    public float[][] LLJILJILJ;
    public String LLJILLL;
    public InterfaceC445670Hdl LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public C1255030ilR LLJJIJIIJIL;
    public ViewTreeObserverOnGlobalLayoutListenerC1265990j37 LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public LinearLayout LLJJJJ;
    public float LLJI = 1.0f;
    public String LLJJIJI = "click_head";
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(437));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 76));
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(436));

    @Override // X.InterfaceC1255040ilS
    public final void Eb0(AvatarUri avatarUri) {
    }

    @Override // X.InterfaceC1255040ilS
    public final void hO(Exception exc) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final AnimatorSet LLLLZIL() {
        AvatarComponentView avatarComponentView = this.LLILZIL;
        if (avatarComponentView == null) {
            avatarComponentView = null;
        }
        View view = (View) avatarComponentView.getParent();
        int height = view.getHeight();
        View view2 = this.LLJIJIL;
        if (view2 == null) {
            view2 = null;
        }
        int height2 = height - view2.getHeight();
        AvatarComponentView avatarComponentView2 = this.LLILZIL;
        if (avatarComponentView2 == null) {
            avatarComponentView2 = null;
        }
        float x = avatarComponentView2.getX();
        AvatarComponentView avatarComponentView3 = this.LLILZIL;
        if (avatarComponentView3 == null) {
            avatarComponentView3 = null;
        }
        float y = avatarComponentView3.getY();
        int width = view.getWidth();
        AvatarComponentView avatarComponentView4 = this.LLILZIL;
        if (avatarComponentView4 == null) {
            avatarComponentView4 = null;
        }
        float width2 = (width - avatarComponentView4.getWidth()) / 2.0f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parent width ");
        sbLIZ.append(view.getWidth());
        sbLIZ.append(" avatarComponent Width ");
        AvatarComponentView avatarComponentView5 = this.LLILZIL;
        if (avatarComponentView5 == null) {
            avatarComponentView5 = null;
        }
        sbLIZ.append(avatarComponentView5.getWidth());
        C2188811AlT.LIZIZ(sbLIZ);
        AvatarComponentView avatarComponentView6 = this.LLILZIL;
        if (avatarComponentView6 == null) {
            avatarComponentView6 = null;
        }
        int height3 = height2 - avatarComponentView6.getHeight();
        LinearLayout linearLayout = this.LLIZLLLIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        float height4 = (height3 - linearLayout.getHeight()) / 2.0f;
        this.LLJILJILJ = new float[][]{new float[]{x, width2}, new float[]{y, height4}};
        AvatarComponentView avatarComponentView7 = this.LLILZIL;
        if (avatarComponentView7 == null) {
            avatarComponentView7 = null;
        }
        ObjectAnimator objectAnimatorLLLLZLL = LLLLZLL(x, width2, avatarComponentView7, "x");
        AvatarComponentView avatarComponentView8 = this.LLILZIL;
        if (avatarComponentView8 == null) {
            avatarComponentView8 = null;
        }
        ObjectAnimator objectAnimatorLLLLZLL2 = LLLLZLL(y, height4, avatarComponentView8, "y");
        float fLLLLLZL = LLLLLZL(LLLLZI());
        if (Float.isNaN(fLLLLLZL) || Float.isInfinite(fLLLLLZL)) {
            User user = this.LLILZLL;
            fLLLLLZL = LLLZIL(user != null ? user.getProfileBadge() : null) ? 2.5f : 3.0f;
        }
        this.LLJI = fLLLLLZL;
        AvatarComponentView avatarComponentView9 = this.LLILZIL;
        if (avatarComponentView9 == null) {
            avatarComponentView9 = null;
        }
        ObjectAnimator objectAnimatorLLLLZLL3 = LLLLZLL(1.0f, fLLLLLZL, avatarComponentView9, "scaleX");
        AvatarComponentView avatarComponentView10 = this.LLILZIL;
        ObjectAnimator objectAnimatorLLLLZLL4 = LLLLZLL(1.0f, this.LLJI, avatarComponentView10 != null ? avatarComponentView10 : null, "scaleY");
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(0, C475630Ikz.LIZIZ(R.attr.e1, this));
        valueAnimatorOfArgb.addUpdateListener(new AUListenerS268S0100000_19(view, 14));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorLLLLZLL, objectAnimatorLLLLZLL2, objectAnimatorLLLLZLL3, objectAnimatorLLLLZLL4, valueAnimatorOfArgb);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(C1619980sG4.LJIILIIL());
        return animatorSet;
    }

    public final C1256720ioA LLLLZLLIL() {
        return (C1256720ioA) this.LLJJL.getValue();
    }

    public final boolean LLLLZLLLI() {
        return ((Boolean) this.LLJJJJLIIL.getValue()).booleanValue();
    }

    public final boolean LLLZZIL() {
        if (!this.LLIZ || ComplianceServiceProvider.LJFF().LIZJ(4)) {
            return false;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1255030ilR c1255030ilR = this.LLJJIJIIJIL;
        if (c1255030ilR == null) {
            c1255030ilR = new C1255030ilR();
            c1255030ilR.LJI(c19egLIZ, fragmentLJI, EnumC1254860ilA.ENLARGE_AVATAR.getValue(), null);
            c1255030ilR.LLILLJJLI = this;
            this.LLJJIJIIJIL = c1255030ilR;
        }
        C1255650imR c1255650imR = c1255030ilR.LL;
        C197039127h c197039127h = this.LLILLJJLI;
        C786410Ut5.U8(c197039127h != null ? c197039127h : null, new ACListenerS110S0200000_6(c1255650imR, this, 20));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZ() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.profile.model.User r0 = r4.LLILZLL
            r2 = 0
            if (r0 == 0) goto L7d
            com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r1 = r0.getProfileBadge()
            if (r1 == 0) goto L7d
            X.0CQj r0 = X.C308850C8t.LIZ
            java.lang.Long r0 = r1.getId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.0CQj r0 = X.C308850C8t.LIZ
            if (r0 == 0) goto L7d
            java.lang.Object r3 = r0.get(r1)
            com.ss.android.ugc.aweme.profile.aigc.ProfileBadgeSettingsObject r3 = (com.ss.android.ugc.aweme.profile.aigc.ProfileBadgeSettingsObject) r3
        L1f:
            boolean r0 = r4.LLIZ
            if (r0 == 0) goto L7f
            boolean r0 = r4.LLLZ()
            if (r0 == 0) goto L46
            X.09Gk r3 = new X.09Gk
            r3.<init>()
            java.lang.String r1 = r4.LLJJIII
            if (r1 != 0) goto L33
            r1 = r2
        L33:
            java.lang.String r0 = "enter_from"
            r3.LJIIIIZZ(r0, r1)
            java.lang.String r1 = "action_type"
            java.lang.String r0 = "show"
            r3.LJIIIIZZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "profile_ai_avatar_frame"
            X.C20684815ws.LJIILLIIL(r0, r1)
        L46:
            X.127h r1 = r4.LLILLL
            if (r1 != 0) goto L4b
            r1 = r2
        L4b:
            com.ss.android.ugc.aweme.profile.model.User r0 = r4.LLILZLL
            if (r0 == 0) goto L7b
            com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r0 = r0.getProfileBadge()
        L53:
            boolean r0 = r4.LLLZIL(r0)
            if (r0 == 0) goto L73
            r0 = 2131845460(0x7f116154, float:1.9324342E38)
            java.lang.String r0 = r4.getString(r0)
        L60:
            r1.setText(r0)
            X.127h r0 = r4.LLILLL
            if (r0 == 0) goto L68
            r2 = r0
        L68:
            Y.ACListenerS141S0100000_6 r1 = new Y.ACListenerS141S0100000_6
            r0 = 90
            r1.<init>(r4, r0)
            X.C786410Ut5.U8(r2, r1)
            return
        L73:
            r0 = 2131850718(0x7f1175de, float:1.9335006E38)
            java.lang.String r0 = r4.getString(r0)
            goto L60
        L7b:
            r0 = r2
            goto L53
        L7d:
            r3 = r2
            goto L1f
        L7f:
            if (r3 == 0) goto La1
            java.lang.String r1 = r3.ctaAddBadge
        L83:
            boolean r0 = X.C703302op.LIZ(r1)
            if (r0 == 0) goto L91
            X.127h r0 = r4.LLILLL
            if (r0 != 0) goto L8e
            r0 = r2
        L8e:
            r0.setText(r1)
        L91:
            X.127h r0 = r4.LLILLL
            if (r0 == 0) goto L96
            r2 = r0
        L96:
            Y.ACListenerS110S0200000_6 r1 = new Y.ACListenerS110S0200000_6
            r0 = 21
            r1.<init>(r4, r3, r0)
            X.C786410Ut5.U8(r2, r1)
            return
        La1:
            r1 = r2
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarActivity.LLZ():void");
    }

    public final void LLZLLLL() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", this.LLJJIJI);
        String str = this.LLJJIII;
        if (str == null) {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("action_type", "show");
        C20684815ws.LJIILLIIL("profile_ai_avatar_entrance", c2344009Gk.LIZ);
        C197039127h c197039127h = this.LLILLL;
        if (c197039127h == null) {
            c197039127h = null;
        }
        c197039127h.setText(2131820640);
        C197039127h c197039127h2 = this.LLILLL;
        C786410Ut5.U8(c197039127h2 != null ? c197039127h2 : null, new ACListenerS154S0100000_19(this, 169));
    }

    public final float LLLLZI() {
        float f = (getResources().getDisplayMetrics().widthPixels / getResources().getDisplayMetrics().density) - (LLLLZLLLI() ? 64 : 32);
        if (f > 400.0f) {
            f = 400.0f;
        }
        User user = this.LLILZLL;
        if (!LLLZIL(user != null ? user.getProfileBadge() : null)) {
            f *= 1.3333334f;
        }
        return C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LIZJ(f);
    }

    public final boolean LLLZ() {
        User user;
        ProfileBadgeStruct profileBadge;
        ProfileBadgeStruct profileBadge2;
        Long id;
        ProfileBadgeSettingsObject profileBadgeSettingsObject;
        if (!C1067920dte.LIZ() || (user = this.LLILZLL) == null || (profileBadge = user.getProfileBadge()) == null || !profileBadge.getShouldShow()) {
            return false;
        }
        C313430CQj c313430CQj = C308850C8t.LIZ;
        User user2 = this.LLILZLL;
        String str = null;
        if (user2 != null && (profileBadge2 = user2.getProfileBadge()) != null && (id = profileBadge2.getId()) != null) {
            String strValueOf = String.valueOf(id.longValue());
            C313430CQj c313430CQj2 = C308850C8t.LIZ;
            if (c313430CQj2 != null && (profileBadgeSettingsObject = (ProfileBadgeSettingsObject) c313430CQj2.get((Object) strValueOf)) != null) {
                str = profileBadgeSettingsObject.name;
            }
        }
        return Intrinsics.LJFF(str, "aigc_avatar");
    }

    public final boolean LLZLI() {
        if (!C268330AfP.LIZIZ()) {
            return false;
        }
        User user = this.LLILZLL;
        if (LLLZIL(user != null ? user.getProfileBadge() : null)) {
            if (C1067920dte.LIZ() && LLLZ() && !this.LLIZ) {
                LLZLLLL();
                return true;
            }
            LLZ();
            return true;
        }
        User user2 = this.LLILZLL;
        if (!LLLZLZ(user2 != null ? user2.getProfileBadge() : null)) {
            if (!C1067920dte.LIZ()) {
                return false;
            }
            LLZLLLL();
            return true;
        }
        if (this.LLIZ) {
            LLZ();
            return true;
        }
        if (!C1067920dte.LIZ()) {
            return false;
        }
        LLZLLLL();
        return true;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC1294060jmO
    public final void onBackPressed() {
        getWindow().getExitTransition().addListener(new C1256710io9(this, "click_cancel"));
        finishAfterTransition();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        if (this.LLJJIJIL != null) {
            AvatarComponentView avatarComponentView = this.LLILZIL;
            if (avatarComponentView == null) {
                avatarComponentView = null;
            }
            C786410Ut5.C3(avatarComponentView.getViewTreeObserver(), this.LLJJIJIL);
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

    public final float LLLLLZL(float f) {
        int width;
        AvatarComponentView avatarComponentView = null;
        if (C280120AyQ.LIZ()) {
            AvatarComponentView avatarComponentView2 = this.LLILZIL;
            if (avatarComponentView2 != null) {
                avatarComponentView = avatarComponentView2;
            }
            width = avatarComponentView.getHeight();
        } else {
            AvatarComponentView avatarComponentView3 = this.LLILZIL;
            if (avatarComponentView3 != null) {
                avatarComponentView = avatarComponentView3;
            }
            width = avatarComponentView.getWidth();
        }
        if (width <= 0) {
            return Float.NaN;
        }
        return (f * getResources().getDisplayMetrics().density) / width;
    }

    public final boolean LLLZIL(ProfileBadgeStruct profileBadgeStruct) {
        if (!LLLZLZ(profileBadgeStruct) || profileBadgeStruct == null || !profileBadgeStruct.getShouldShow()) {
            return false;
        }
        return true;
    }

    public final boolean LLLZLZ(ProfileBadgeStruct profileBadgeStruct) {
        if (!C268330AfP.LIZIZ() || profileBadgeStruct == null || profileBadgeStruct.getUrl().length() == 0 || C10EU.LJIIIIZZ()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1255040ilS
    public final void dN2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("file://");
        sbLIZ.append(str);
        Uri uri = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
        C1322200kVm.LIZ().LIZJ(uri);
        AvatarComponentView avatarComponentView = this.LLILZIL;
        if (avatarComponentView == null) {
            avatarComponentView = null;
        }
        avatarComponentView.LJIIJ(new C03IT(Collections.singletonList(uri.toString())));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        InterfaceC1249220ic4 interfaceC1249220ic4LJI = C19252910Tv.LIZIZ.LIZLLL().LJI();
        AvatarComponentView avatarComponentView = this.LLILZIL;
        if (avatarComponentView == null) {
            avatarComponentView = null;
        }
        interfaceC1249220ic4LJI.LJJZZIII(avatarComponentView, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:304:0x067e  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 1869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarActivity.onCreate(android.os.Bundle):void");
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC1294060jmO
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C1255030ilR c1255030ilR = this.LLJJIJIIJIL;
        if (c1255030ilR != null) {
            c1255030ilR.onActivityResult(i, i2, intent);
        }
    }

    public static ObjectAnimator LLLLZLL(float f, float f2, AvatarComponentView avatarComponentView, String str) {
        return ObjectAnimator.ofFloat(avatarComponentView, str, f, f2);
    }
}
