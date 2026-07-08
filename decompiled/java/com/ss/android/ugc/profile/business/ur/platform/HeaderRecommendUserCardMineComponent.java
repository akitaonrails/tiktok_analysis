package com.ss.android.ugc.profile.business.ur.platform;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C1250730ieV;
import X.C1250770ieZ;
import X.C1250800iec;
import X.C1250870iej;
import X.C1251330ifT;
import X.C1252710ihh;
import X.C1262780ixw;
import X.C127G;
import X.C13LE;
import X.C1558520qew;
import X.C1619980sG4;
import X.C1720106oR;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C283580B9o;
import X.C283590B9p;
import X.C295680BiQ;
import X.C418440Gaw;
import X.C428150Gqb;
import X.C452070Ho5;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC428940Grs;
import X.InterfaceC1252070igf;
import X.InterfaceC1261750iwH;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AAListenerS68S0110000_19;
import Y.ACListenerS154S0100000_19;
import Y.AObjectS71S0000000_19;
import Y.AUListenerS16S0102000_19;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.experiment.HomepageRecommendSetting;
import com.ss.android.ugc.profile.business.ur.user.HomepageRecommendVM;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderRecommendUserCardMineComponent extends HeaderRecommendUserCardBaseComponent {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final AssemVMLazy LLJL;
    public C127G LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HeaderRecommendUserCardMineComponent.class, "recViewModel", "getRecViewModel()Lcom/ss/android/ugc/profile/business/ur/user/HomepageRecommendVM;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final HomepageRecommendVM Fp() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (HomepageRecommendVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        HomepageRecommendVM homepageRecommendVMFp = Fp();
        C1250800iec.LIZ.getClass();
        if (C1250800iec.LIZIZ(C1250800iec.LIZ().disablePersonalHorizontal) && ((Number) C295680BiQ.LIZ.getValue()).intValue() == 2) {
            return;
        }
        User userWQ2 = homepageRecommendVMFp.wQ2();
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        boolean zLIZ = ((AccountUserService) C0XQ7.LJFF()).LIZ();
        boolean z = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAccountType() == 3;
        long j = HomepageRecommendSetting.LIZ().lowMufBound;
        long jMax = Math.max(C1250870iej.LIZIZ(), userWQ2.getFriendCount());
        boolean z2 = jMax <= j && jMax >= 0;
        long j2 = HomepageRecommendSetting.LIZ().lowFollowerBound;
        int i = userWQ2.historyMaxFollowerCount;
        boolean z3 = ((long) i) < j2;
        C01GW c01gw = C283580B9o.LIZ;
        boolean z4 = zIsLogin && !zLIZ && !z && z2 && z3 && (((Number) c01gw.getValue()).intValue() == 3);
        StringBuilder sb = new StringBuilder("shouldShowExpandBtn[result:");
        sb.append(z4);
        sb.append("][isLogin:");
        sb.append(zIsLogin);
        sb.append("][notKidsAccount:");
        sb.append(!zLIZ);
        sb.append("][notBAAccount:");
        sb.append(true ^ z);
        sb.append("][muf:");
        sb.append(z2);
        sb.append(", ");
        sb.append(jMax);
        sb.append('<');
        sb.append(j);
        sb.append("?][follower:");
        sb.append(z3);
        sb.append(", ");
        sb.append(i);
        sb.append('<');
        sb.append(j2);
        sb.append("?][expGroup:");
        sb.append(((Number) c01gw.getValue()).intValue());
        sb.append(']');
        C1720106oR.LJI("HomepageRecommend", sb.toString());
        if (z4) {
            Context context = getContext();
            if (context != null) {
                C1262780ixw c1262780ixw = new C1262780ixw(context, null, null, 14);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)));
                layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1262780ixw);
                c1262780ixw.setLayoutParams(layoutParams);
                this.LLJJLIIIJLLLLLLLZ = c1262780ixw;
                zp().LJLJLLL(C724240Sb0.LIZ(this), C724240Sb0.LJI(this), new AwS598S0100000_19(Fp().wQ2(), 837));
                zp().Eg(Fp());
                C1262780ixw c1262780ixwZp = zp();
                ACListenerS154S0100000_19 aCListenerS154S0100000_19 = new ACListenerS154S0100000_19(this, 278);
                TuxTextView tuxTextView = (TuxTextView) c1262780ixwZp.findViewById(R.id.uiz);
                tuxTextView.setText(c1262780ixwZp.getContext().getString(2131845477));
                C786410Ut5.h9(tuxTextView, aCListenerS154S0100000_19);
                C428150Gqb.LIZ(tuxTextView, EnumC428940Grs.ALPHA, 0.0f);
                View viewFindViewById = c1262780ixwZp.findViewById(R.id.uix);
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
                C786410Ut5.I7(aCListenerS154S0100000_19, viewFindViewById);
                InterfaceC1261750iwH interfaceC1261750iwH = (InterfaceC1261750iwH) Fp().LL.getValue();
                if (interfaceC1261750iwH != null) {
                    zp().Eg(interfaceC1261750iwH);
                }
                up();
            }
            C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0iea
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1250700ieS) obj).LL;
                }
            }, null, new AwS633S0100000_19(this, 293), 6);
            C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0ieB
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1250700ieS) obj).LLILLJJLI;
                }
            }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 295), 4);
            C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0i9m
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1250700ieS) obj).LLILLL;
                }
            }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 298), 4);
            ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
            if (profilePlatformViewModelZo != null) {
                profilePlatformViewModelZo.JQ2(new AwS598S0100000_19(this, 832));
            }
            HomepageRecommendSetting.HomepageRecommendConfigModel homepageRecommendConfigModelLIZ = HomepageRecommendSetting.LIZ();
            C1251330ifT c1251330ifT = (C1251330ifT) C1252710ihh.LJIIIIZZ(this, C13LE.LIZ(InterfaceC1252070igf.class));
            User user = c1251330ifT != null ? c1251330ifT.LIZ : null;
            C1250770ieZ c1250770ieZ = C1250770ieZ.LIZ;
            long jMax2 = Math.max(user != null ? user.getFriendCount() : 0L, C1250870iej.LIZIZ());
            int i2 = user != null ? user.historyMaxFollowerCount : -1;
            int iLIZIZ = C1250730ieV.LIZIZ();
            long j3 = homepageRecommendConfigModelLIZ.xDays;
            long j4 = homepageRecommendConfigModelLIZ.yHide;
            long j5 = homepageRecommendConfigModelLIZ.lowMufBound;
            long j6 = homepageRecommendConfigModelLIZ.lowFollowerBound;
            int iIntValue = ((Number) C283590B9p.LIZ.getValue()).intValue();
            c1250770ieZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jMax2, "max_muf");
            c2344009Gk.LIZJ(i2, "max_followers");
            c2344009Gk.LIZJ(iLIZIZ, "hide_count");
            c2344009Gk.LIZLLL(j3, "x_day");
            c2344009Gk.LIZLLL(j4, "y_hide");
            c2344009Gk.LIZLLL(j5, "muf_bound");
            c2344009Gk.LIZLLL(j6, "follower_bound");
            c2344009Gk.LIZJ(iIntValue, "j_time");
            C20684815ws.LJIILLIIL("homepage_rec_card_cur_state", c2344009Gk.LIZ);
        }
    }

    public HeaderRecommendUserCardMineComponent() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HomepageRecommendVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 2400);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(445);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((AbstractC738140SxQ) this, 2401), aFwS257S0000000_19, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJL = assemVMLazy;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{HomepageRecommendVM.class, new AObjectS71S0000000_19(this, 14)}, defaultViewModelProviderFactory);
                    this.LLJLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final void Gp(boolean z) {
        int iR5;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJ());
        IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
        int iR52 = 0;
        if (iHeaderBioAbility != null) {
            iR5 = iHeaderBioAbility.r5();
        } else {
            iR5 = 0;
        }
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            iR52 = iHeaderAdvancedFeatureAbility.r5();
        }
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS16S0102000_19(this, iR5, iR52, 1));
        valueAnimatorOfFloat.addListener(new AAListenerS68S0110000_19(this, z, 4));
        valueAnimatorOfFloat.addListener(new AAListenerS68S0110000_19(this, z, 3));
        if (z) {
            valueAnimatorOfFloat.start();
        } else {
            valueAnimatorOfFloat.reverse();
        }
    }
}
