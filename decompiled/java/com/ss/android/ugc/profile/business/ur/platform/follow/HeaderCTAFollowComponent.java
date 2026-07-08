package com.ss.android.ugc.profile.business.ur.platform.follow;

import X.AbstractC848400XPy;
import X.C00BG;
import X.C019F;
import X.C01GW;
import X.C034I;
import X.C04TD;
import X.C06MM;
import X.C0BUB;
import X.C0LAB;
import X.C0O3Q;
import X.C0OBG;
import X.C0OVM;
import X.C0PEM;
import X.C0PSR;
import X.C0XPD;
import X.C0XQ7;
import X.C1076010e6h;
import X.C10E1;
import X.C10ET;
import X.C10EU;
import X.C1216270hkv;
import X.C123100dR;
import X.C1233040iBy;
import X.C1248950ibd;
import X.C1249540ica;
import X.C1249940idE;
import X.C1250210idf;
import X.C1251930igR;
import X.C1252060ige;
import X.C1252170igp;
import X.C1252220igu;
import X.C1252230igv;
import X.C1252280ih0;
import X.C1252380ihA;
import X.C1252480ihK;
import X.C1252620ihY;
import X.C1252710ihh;
import X.C1253930ijf;
import X.C1266200j3S;
import X.C1266280j3a;
import X.C127G;
import X.C12ES;
import X.C1323820kYO;
import X.C1336205Ku;
import X.C1381440m3K;
import X.C1388190mED;
import X.C1391850mK7;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1440005kM;
import X.C14EU;
import X.C14KQ;
import X.C1548820qPI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1720106oR;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C211000rc;
import X.C21387918mz;
import X.C2188811AlT;
import X.C2201941BFw;
import X.C2217381BqS;
import X.C2230608oa;
import X.C23250099c;
import X.C2344009Gk;
import X.C268330AfP;
import X.C296550Bjp;
import X.C299940BpI;
import X.C384050F3z;
import X.C397901gf;
import X.C418440Gaw;
import X.C437850HEx;
import X.C452501pT;
import X.C627150Oin;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C735080SsU;
import X.C735370Ssx;
import X.C735830Sth;
import X.C736400Suc;
import X.C736550Sur;
import X.C736820SvI;
import X.C739490Szb;
import X.C757520Tna;
import X.C767302z9;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.C848460XQe;
import X.C888460YtI;
import X.C985403tE;
import X.DialogInterfaceOnClickListenerC1265940j32;
import X.EnumC1249910idB;
import X.EnumC1250640ieM;
import X.EnumC1251790igD;
import X.EnumC1252150ign;
import X.EnumC1260930iux;
import X.EnumC1584370rKd;
import X.InterfaceC1250630ieL;
import X.InterfaceC1345705Ol;
import X.InterfaceC1914010zuJ;
import X.InterfaceC19225710Jj;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS141S0100000_6;
import Y.AObjectS71S0000000_19;
import Y.AObserverS223S0100000_19;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.greet.IGreetFullScreenPageService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelAuthEdmAndSmsGuideV3;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.ss.android.ugc.profile.business.message.HeaderCTAMessageComponent;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.business.ur.follow.UserProfileFollowVM;
import com.ss.android.ugc.profile.business.ur.platform.follow.HeaderCTAFollowComponent;
import com.ss.android.ugc.profile.business.ur.platform.recommendbutton.ICTARecommendButtonAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUIData;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialBlockData;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.ICTASocialInteractionAbility;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility;
import com.ss.android.ugc.tiktok.tns.userrelation.api.block.IBlockService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import defpackage.GreetFullScreenInputPageController;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS168S1100000_19;
import kotlin.jvm.internal.AwS18S0001000_3;
import kotlin.jvm.internal.AwS263S0300000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS70S1000000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderCTAFollowComponent extends HeaderCTABaseUIComponent implements ICTASocialInteractionAbility, WeakHandler.IHandler {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIL;
    public final AssemVMLazy LLJZIJLIL;
    public final C01GW LLL;
    public boolean LLLF;
    public final C01GW LLLFF;
    public String LLLFFI;
    public String LLLFZ;
    public boolean LLLI;
    public C437850HEx LLLII;
    public SocialBlockData LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public C127G LLLIILIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HeaderCTAFollowComponent.class, "userProfileFollowVM", "getUserProfileFollowVM()Lcom/ss/android/ugc/profile/business/ur/follow/UserProfileFollowVM;", 0);
        C13LE.LIZ.getClass();
        LLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HeaderCTAFollowComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UserProfileFollowVM.class);
        this.LLJZIJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2412), AFwS257S0000000_19.get$arr$(456), null, true);
        this.LLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2415));
        this.LLLF = true;
        this.LLLFF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2414));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2417));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2413));
        this.LLLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2418));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        super.Go();
        AssemViewModel.asyncSubscribe$default(qq(), new C2217381BqS() { // from class: X.0iaI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1247710iZd) obj).LLILLJJLI;
            }
        }, null, new AwS598S0100000_19(this, 402), null, new AwS598S0100000_19(this, 403), 10, null);
        AssemViewModel.asyncSubscribe$default(qq(), new C2217381BqS() { // from class: X.0iaJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1247710iZd) obj).LLILLL;
            }
        }, null, new AwS598S0100000_19(this, 404), null, new AwS598S0100000_19(this, 405), 10, null);
        qq().LLJILLL.observe(this, new AObserverS223S0100000_19(this, 83));
        AssemViewModel assemViewModel = (AssemViewModel) this.LLL.getValue();
        if (assemViewModel != null) {
            selectSubscribe(assemViewModel, new C2217381BqS() { // from class: X.0igZ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C09Z8) obj).LL;
                }
            }, new C2217381BqS() { // from class: X.0igW
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C09Z8) obj).LLILLJJLI;
                }
            }, new C2217381BqS() { // from class: X.0igV
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C09Z8) obj).LLILZ);
                }
            }, C736820SvI.LIZIZ(assemViewModel.usedInReusedScene), null, new C1266280j3a(this, 4));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.ICTASocialInteractionAbility
    public final void Nq2() throws JSONException {
        tq(C00BG.NAV_BAR.ordinal());
    }

    public final int jq() {
        return ((Number) this.LLLIIIIL.getValue()).intValue();
    }

    public final UserProfileFollowVM qq() {
        AssemVMLazy assemVMLazy = this.LLJZIJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIL;
        return (UserProfileFollowVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final String yp() {
        Jp(EnumC1249910idB.PRIMARY);
        return C1216270hkv.LIZJ(2131836766);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Ho() {
        C1252220igu otherParams;
        View view;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        Drawable drawableLIZ = null;
        this.LLLII = (fragmentLJI == null || (view = fragmentLJI.getView()) == null) ? null : (C437850HEx) view.findViewById(R.id.if7);
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        this.LLLFZ = (userProfileAbility == null || (otherParams = userProfileAbility.getOtherParams()) == null) ? null : otherParams.LJIIJ;
        C437850HEx c437850HEx = this.LLLII;
        if (c437850HEx != null) {
            Context context = getContext();
            if (context != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.c5);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                drawableLIZ = c384050F3z.LIZ(context);
            }
            c437850HEx.setBackground(drawableLIZ);
        }
        qq().LLJJI.observe(this, new AObserverS223S0100000_19(this, 47));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() throws JSONException {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        boolean zIsAdded = fragmentLJI != null ? fragmentLJI.isAdded() : false;
        if (C04TD.LIZ(IGreetFullScreenPageService.class, false) == null && C04TD.LIZ == null) {
            synchronized (IGreetFullScreenPageService.class) {
                if (C04TD.LIZ == null) {
                    C04TD.LIZ = new GreetFullScreenInputPageController();
                }
            }
        }
        if (!this.LLILZ || !zIsAdded || iq() == null || getContext() == null || C0OBG.LIZ(300L, Bp())) {
            return;
        }
        if (!C10EU.LJIIIIZZ()) {
            tq(-1);
            return;
        }
        C844470XAv.LIZ.getClass();
        C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
        c1233040iBy.LIZIZ(2131828626);
        c1233040iBy.LIZLLL();
    }

    public final void aq() {
        Context context = getContext();
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LIZ(2131857706);
            C985403tE.LIZ(c1397580mTM, new AwS598S0100000_19(this, 406));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public final Aweme fq() {
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        if (profilePlatformViewModelZo != null) {
            return profilePlatformViewModelZo.getAweme();
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLIILIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLIILIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{UserProfileFollowVM.class, new AObjectS71S0000000_19(this, 18)}, defaultViewModelProviderFactory);
                    this.LLLIILIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final String getEnterFrom() {
        C1252230igv c1252230igvPq = pq();
        if (c1252230igvPq != null) {
            return c1252230igvPq.LLILLL;
        }
        return null;
    }

    public final User iq() {
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility != null) {
            return userProfileAbility.getUser();
        }
        return null;
    }

    public final int kq() {
        ProfileUIData profileUIData;
        if (!C268330AfP.LJFF()) {
            return C268330AfP.LJIIIZ() ? (((C14KQ.LJIIIIZZ(getContext()) - zp()) - Ep()) - (Fp() * 2)) / 2 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(116));
        }
        ProfileComponents profileComponents = this.LLJJJ;
        return Intrinsics.LJFF((profileComponents == null || (profileUIData = profileComponents.uiData) == null) ? null : profileUIData.displayStyle, EnumC1250640ieM.PARALLEL.getValue()) ? (((C14KQ.LJIIIIZZ(getContext()) - zp()) - Ep()) - (Fp() * 2)) / 2 : (((C14KQ.LJIIIIZZ(getContext()) - zp()) - Ep()) - HeaderCTAMessageComponent.LLLFZ) - (Fp() * 2);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, ICTASocialInteractionAbility.class, null, null);
        }
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(this, new AObserverS223S0100000_19(this, 48));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    public final C1252230igv pq() {
        IHeaderBaseAbility iHeaderBaseAbility = (IHeaderBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBaseAbility.class, null);
        if (iHeaderBaseAbility != null) {
            return iHeaderBaseAbility.cA1();
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.ICTASocialInteractionAbility
    public final void qg0() {
        String uid;
        C437850HEx c437850HEx;
        User userIq;
        String uid2;
        UserProfileFollowVM userProfileFollowVMQq = qq();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
        User user = userProfileFollowVMQq.LLILZIL;
        String str = "";
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("to_user_id", uid);
        C20684815ws.LJIILLIIL("click_remove_fans", c2344009Gk.LIZ);
        Context context = getContext();
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131846231);
            c1397580mTM.LIZIZ(C786410Ut5.j4(context.getResources().getString(2131846230), Arrays.copyOf(new Object[]{C10EU.LIZJ(iq())}, 1)));
            C985403tE.LIZ(c1397580mTM, new AwS598S0100000_19(this, 407));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        if (TextUtils.equals(getEnterFrom(), "follow_request_page") && this.LLLI && (c437850HEx = this.LLLII) != null && c437850HEx.LLILZ && (userIq = iq()) != null && userIq.isBlock) {
            C437850HEx c437850HEx2 = this.LLLII;
            if (c437850HEx2 != null) {
                c437850HEx2.LIZIZ();
            }
            User userIq2 = iq();
            if (userIq2 != null && (uid2 = userIq2.getUid()) != null) {
                str = uid2;
            }
            C1440005kM.LIZ(new C767302z9(str, -101));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        User userIq;
        UserRelationInfo userRelationInfo;
        Integer fpBlockByType;
        UserRelationInfo userRelationInfo2;
        Boolean boolIsPendingUnblockRequest;
        UserProfileInfo userProfileInfo;
        UserRelationInfo userRelationInfo3;
        Boolean boolIsBlocking;
        UserRelationInfo userRelationInfo4;
        Integer followerStatus;
        UserRelationInfo userRelationInfo5;
        Integer followStatus;
        ProfileCommonInfo profileCommonInfoVo = Vo();
        String uid = null;
        if ((profileCommonInfoVo == null || profileCommonInfoVo.getUserRelationInfo() == null) && iq() == null) {
            return;
        }
        int followStatus2 = 0;
        if (iq() != null) {
            userIq = iq();
            if (userIq != null) {
            }
            dq(followStatus2);
        }
        userIq = new User();
        ProfileCommonInfo profileCommonInfoVo2 = Vo();
        userIq.setFollowStatus((profileCommonInfoVo2 == null || (userRelationInfo5 = profileCommonInfoVo2.getUserRelationInfo()) == null || (followStatus = userRelationInfo5.getFollowStatus()) == null) ? 0 : followStatus.intValue());
        ProfileCommonInfo profileCommonInfoVo3 = Vo();
        userIq.setFollowerStatus((profileCommonInfoVo3 == null || (userRelationInfo4 = profileCommonInfoVo3.getUserRelationInfo()) == null || (followerStatus = userRelationInfo4.getFollowerStatus()) == null) ? 0 : followerStatus.intValue());
        ProfileCommonInfo profileCommonInfoVo4 = Vo();
        userIq.isBlock = (profileCommonInfoVo4 == null || (userRelationInfo3 = profileCommonInfoVo4.getUserRelationInfo()) == null || (boolIsBlocking = userRelationInfo3.isBlocking()) == null) ? false : boolIsBlocking.booleanValue();
        ProfileCommonInfo profileCommonInfoVo5 = Vo();
        if (profileCommonInfoVo5 != null && (userProfileInfo = profileCommonInfoVo5.getUserProfileInfo()) != null) {
            uid = userProfileInfo.getUid();
        }
        userIq.setUid(uid);
        ProfileCommonInfo profileCommonInfoVo6 = Vo();
        userIq.setPendingUnblockRequest((profileCommonInfoVo6 == null || (userRelationInfo2 = profileCommonInfoVo6.getUserRelationInfo()) == null || (boolIsPendingUnblockRequest = userRelationInfo2.isPendingUnblockRequest()) == null) ? false : boolIsPendingUnblockRequest.booleanValue());
        ProfileCommonInfo profileCommonInfoVo7 = Vo();
        userIq.setFpBlockByType((profileCommonInfoVo7 == null || (userRelationInfo = profileCommonInfoVo7.getUserRelationInfo()) == null || (fpBlockByType = userRelationInfo.getFpBlockByType()) == null) ? -1 : fpBlockByType.intValue());
        followStatus2 = userIq.getFollowStatus();
        dq(followStatus2);
    }

    public final void vq() {
        View viewBp = Bp();
        if (!(viewBp instanceof C1249940idE) || viewBp == null) {
            return;
        }
        viewBp.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        ((LinearLayout.LayoutParams) viewBp.getLayoutParams()).weight = 1.0f;
    }

    public static int lq(int i) {
        if (!((Boolean) C1252620ihY.LJFF.getValue()).booleanValue()) {
            return i;
        }
        if (i == R.raw.icon_person_tick) {
            return R.raw.icon_person_tick_fill;
        }
        if (i != R.raw.icon_person_arrow_left_right) {
            return i;
        }
        return R.raw.icon_person_arrow_left_right_fill;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.ICTASocialInteractionAbility
    public final void Bm1(int i) {
        Integer numValueOf;
        int followStatus;
        Integer numValueOf2;
        int i2;
        int i3;
        Integer numValueOf3;
        String str;
        String str2;
        Bundle arguments;
        C1252230igv c1252230igvPq;
        C1252280ih0 c1252280ih0;
        String str3;
        String uid;
        String secUid;
        Boolean boolValueOf;
        String str4;
        boolean zBooleanValue;
        int iLIZ;
        boolean zBooleanValue2;
        int iIntValue;
        boolean zIsAccuratePrivateAccount;
        HashMap map;
        Aweme awemeFq;
        String logExtra;
        Long adId;
        Long creativeId;
        AwemeRawAd monetizationData;
        AwemeRawAd monetizationData2;
        AwemeRawAd monetizationData3;
        User author;
        C1252220igu otherParams;
        String str5;
        C1252220igu otherParams2;
        C19EG c19egLIZ;
        String uid2;
        Integer numValueOf4;
        String str6;
        C1252230igv c1252230igvPq2;
        C1252280ih0 c1252280ih02;
        Bundle arguments2;
        String tabName;
        C1252220igu otherParams3;
        User userIq = iq();
        String accurateRecType = null;
        if (userIq != null) {
            numValueOf = Integer.valueOf(userIq.getFollowStatus());
        } else {
            numValueOf = null;
        }
        User userIq2 = iq();
        if (userIq2 != null) {
            followStatus = userIq2.getFollowStatus();
        } else {
            followStatus = 0;
        }
        boolean zLJIIJ = C10EU.LJIIJ(followStatus);
        User userIq3 = iq();
        if (userIq3 != null) {
            numValueOf2 = Integer.valueOf(userIq3.getFollowStatus());
        } else {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            if (numValueOf2.intValue() == 0) {
                User userIq4 = iq();
                if (userIq4 != null && userIq4.isSecret()) {
                    i2 = 4;
                    C2230608oa<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
                    Integer numLIZ = privacyAccountFollowCount.LIZ();
                    if (numLIZ != null && numLIZ.intValue() == 0) {
                        Context context = getContext();
                        if (context != null) {
                            C1397580mTM c1397580mTM = new C1397580mTM(context);
                            c1397580mTM.LIZ(2131845226);
                            C985403tE.LIZ(c1397580mTM, AFwS257S0000000_19.get$arr$(784));
                            C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                            C1391850mK7.LIZIZ(c1397510mTF, "479");
                            c1397510mTF.LIZLLL();
                        }
                    } else {
                        int iIntValue2 = numLIZ.intValue();
                        if (1 <= iIntValue2 && iIntValue2 < 4) {
                            C1233040iBy c1233040iBy = new C1233040iBy(getContext());
                            c1233040iBy.LIZIZ(2131845227);
                            c1233040iBy.LIZLLL();
                        }
                    }
                    privacyAccountFollowCount.LJ(Integer.valueOf(numLIZ.intValue() + 1));
                } else {
                    User userIq5 = iq();
                    if (userIq5 != null && userIq5.getFollowerStatus() == 1) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                }
            } else {
                if (numValueOf2.intValue() != 4 && numValueOf2.intValue() != 1) {
                    numValueOf2.intValue();
                }
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        User userIq6 = iq();
        if ((userIq6 != null && userIq6.getFollowStatus() == 4) || zLJIIJ) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        boolean zLLZZZIL = ((InterfaceC1250630ieL) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1250630ieL.class), null)).LLZZZIL();
        UserAwemePagerAbility userAwemePagerAbility = (UserAwemePagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserAwemePagerAbility.class, null);
        if (userAwemePagerAbility != null) {
            numValueOf3 = Integer.valueOf(userAwemePagerAbility.getTabCount());
        } else {
            numValueOf3 = null;
        }
        String strValueOf = String.valueOf(numValueOf3);
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility != null && (otherParams3 = userProfileAbility.getOtherParams()) != null) {
            str = otherParams3.LJIIZILJ;
        } else {
            str = null;
        }
        if (C1249540ica.LIZ) {
            Bundle bundle = new Bundle();
            if (i == C00BG.NAV_BAR.ordinal()) {
                C786410Ut5.LJJJI("enter_position", "profile_navbar", bundle);
                UserAwemePagerAbility userAwemePagerAbility2 = (UserAwemePagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserAwemePagerAbility.class, null);
                if (userAwemePagerAbility2 != null) {
                    tabName = userAwemePagerAbility2.getTabName();
                } else {
                    tabName = null;
                }
                C786410Ut5.LJJJI("tab_name", tabName, bundle);
            }
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (arguments2 = fragmentLJI.getArguments()) != null) {
                C786410Ut5.LJJIIJZLJL(bundle, arguments2);
            }
            UserProfileFollowVM userProfileFollowVMQq = qq();
            Aweme awemeFq2 = fq();
            User userIq7 = iq();
            Context context2 = getContext();
            if (!C296550Bjp.LIZ() || (c1252230igvPq2 = pq()) == null || (c1252280ih02 = c1252230igvPq2.LLIZLLLIL) == null || (str6 = c1252280ih02.LJII) == null) {
                str6 = this.LLLFFI;
            }
            userProfileFollowVMQq.BQ2(awemeFq2, userIq7, context2, zLLZZZIL, str6, this.LLLFZ, strValueOf, str, bundle);
        } else {
            UserProfileFollowVM userProfileFollowVMQq2 = qq();
            Aweme awemeFq3 = fq();
            User userIq8 = iq();
            Context context3 = getContext();
            if (!C296550Bjp.LIZ() || (c1252230igvPq = pq()) == null || (c1252280ih0 = c1252230igvPq.LLIZLLLIL) == null || (str2 = c1252280ih0.LJII) == null) {
                str2 = this.LLLFFI;
            }
            String str7 = this.LLLFZ;
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null) {
                arguments = fragmentLJI2.getArguments();
            } else {
                arguments = null;
            }
            userProfileFollowVMQq2.BQ2(awemeFq3, userIq8, context3, zLLZZZIL, str2, str7, strValueOf, str, arguments);
        }
        C1440005kM.LIZ(new C0PSR(i2, iq()));
        dq(i2);
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        if (profilePlatformViewModelZo != null) {
            profilePlatformViewModelZo.SQ2(new AwS18S0001000_3(i2, 0), false);
        }
        if (!C0BUB.LIZ()) {
            EventLiveData<FollowStatus> relationObservable = C1076010e6h.LIZJ.LIZIZ().getRelationObservable();
            User userIq9 = iq();
            if (userIq9 != null) {
                uid2 = userIq9.getUid();
            } else {
                uid2 = null;
            }
            User userIq10 = iq();
            if (userIq10 != null) {
                numValueOf4 = Integer.valueOf(userIq10.getFollowerStatus());
            } else {
                numValueOf4 = null;
            }
            relationObservable.postValue(new FollowStatus(uid2, i2, numValueOf4));
        }
        if (C1076010e6h.LIZJ.LJIJ(iq()) && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19egLIZ), C0PEM.LIZJ, null, new C757520Tna(c19egLIZ, null), 2);
        }
        UserProfileAbility userProfileAbility2 = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        String str8 = "";
        if (userProfileAbility2 == null || (otherParams2 = userProfileAbility2.getOtherParams()) == null || (str3 = otherParams2.LIZLLL) == null) {
            str3 = "";
        }
        UserProfileAbility userProfileAbility3 = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility3 != null && (otherParams = userProfileAbility3.getOtherParams()) != null && (str5 = otherParams.LJIIJ) != null) {
            str8 = str5;
        }
        UserProfileFollowVM userProfileFollowVMQq3 = qq();
        C0OVM c0ovm = new C0OVM();
        User userIq11 = iq();
        if (userIq11 != null) {
            uid = userIq11.getUid();
        } else {
            uid = null;
        }
        c0ovm.LIZJ(uid);
        User userIq12 = iq();
        if (userIq12 != null) {
            secUid = userIq12.getSecUid();
        } else {
            secUid = null;
        }
        c0ovm.LIZIZ(secUid);
        C1252380ihA c1252380ihA = c0ovm.LIZ;
        c1252380ihA.LIZLLL = i3;
        c1252380ihA.LJI = "others_homepage";
        c1252380ihA.LJ = 19;
        Aweme awemeFq4 = fq();
        if (awemeFq4 != null && (author = awemeFq4.getAuthor()) != null) {
            boolValueOf = Boolean.valueOf(C736550Sur.LIZIZ(author));
        } else {
            boolValueOf = null;
        }
        C1252230igv c1252230igvPq3 = pq();
        if (c1252230igvPq3 != null) {
            str4 = c1252230igvPq3.LLILZ;
        } else {
            str4 = null;
        }
        if (Intrinsics.LJFF(str4, "connect_now_friend_banner")) {
            iLIZ = 60;
        } else if (Intrinsics.LJFF(str4, "click_comment_head")) {
            iLIZ = C735830Sth.LIZ(str8, false, true, false, 5);
        } else if (Intrinsics.LJFF(str8, "find_friends_page")) {
            iLIZ = 3;
        } else if (C123100dR.LIZ(str3)) {
            if (boolValueOf != null) {
                zBooleanValue2 = boolValueOf.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            iLIZ = C735830Sth.LIZ(str3, zBooleanValue2, false, false, 6);
        } else {
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            } else {
                zBooleanValue = false;
            }
            iLIZ = C735830Sth.LIZ(str8, zBooleanValue, false, false, 6);
        }
        c0ovm.LIZ.LJFF = iLIZ;
        int followerStatus = -1;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        c0ovm.LIZ.LJIIJ = iIntValue;
        User userIq13 = iq();
        if (userIq13 != null) {
            followerStatus = userIq13.getFollowerStatus();
        }
        c0ovm.LIZ.LJIIJJI = followerStatus;
        User userIq14 = iq();
        if (userIq14 != null) {
            zIsAccuratePrivateAccount = userIq14.isAccuratePrivateAccount();
        } else {
            zIsAccuratePrivateAccount = false;
        }
        c0ovm.LIZ.LJIILIIL = zIsAccuratePrivateAccount;
        if (fq() != null && (awemeFq = fq()) != null && AwemeExtKt.isMonetizationTraffic(awemeFq)) {
            Context context4 = getContext();
            if (context4 != null) {
                Aweme awemeFq5 = fq();
                if (awemeFq5 != null && (monetizationData3 = AwemeExtKt.getMonetizationData(awemeFq5)) != null) {
                    logExtra = monetizationData3.getLogExtra();
                } else {
                    logExtra = null;
                }
                Aweme awemeFq6 = fq();
                if (awemeFq6 != null && (monetizationData2 = AwemeExtKt.getMonetizationData(awemeFq6)) != null) {
                    adId = monetizationData2.getAdId();
                } else {
                    adId = null;
                }
                String strValueOf2 = String.valueOf(adId);
                Aweme awemeFq7 = fq();
                if (awemeFq7 != null && (monetizationData = AwemeExtKt.getMonetizationData(awemeFq7)) != null) {
                    creativeId = monetizationData.getCreativeId();
                } else {
                    creativeId = null;
                }
                String strValueOf3 = String.valueOf(creativeId);
                map = new HashMap();
                C735080SsU.LIZ(context4, logExtra, strValueOf2, strValueOf3, map);
            } else {
                map = null;
            }
        } else {
            map = new HashMap();
            C735080SsU.LIZJ(null, str3, map);
        }
        c0ovm.LIZ.LJIIL = map;
        User userIq15 = iq();
        if (userIq15 != null) {
            accurateRecType = userIq15.getAccurateRecType();
        }
        c0ovm.LIZ.LJIILLIIL = accurateRecType;
        userProfileFollowVMQq3.withState(new AwS385S0200000_19(userProfileFollowVMQq3, c0ovm.LIZ(), 140));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Map<String, String> map;
        C1252220igu otherParams;
        C1252220igu otherParams2;
        C1252220igu otherParams3;
        C1252220igu otherParams4;
        C1252220igu otherParams5;
        C1252220igu otherParams6;
        C1252220igu otherParams7;
        C1252220igu otherParams8;
        C1252220igu otherParams9;
        if (((Boolean) C268330AfP.LJIJ.getValue()).booleanValue()) {
            C1248950ibd c1248950ibd = this.LLJJI;
            if (c1248950ibd != null) {
                c1248950ibd.LLILLJJLI = profileComponents;
            }
            this.LLJJJ = profileComponents;
        }
        C1252480ihK c1252480ihK = null;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility != null && (otherParams9 = userProfileAbility.getOtherParams()) != null) {
            num = otherParams9.LJIIIZ;
        } else {
            num = null;
        }
        UserProfileAbility userProfileAbility2 = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility2 != null && (otherParams8 = userProfileAbility2.getOtherParams()) != null) {
            str = otherParams8.LIZLLL;
        } else {
            str = null;
        }
        UserProfileAbility userProfileAbility3 = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility3 != null && (otherParams7 = userProfileAbility3.getOtherParams()) != null) {
            str2 = otherParams7.LJ;
        } else {
            str2 = null;
        }
        UserProfileAbility userProfileAbility4 = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility4 != null && (otherParams6 = userProfileAbility4.getOtherParams()) != null) {
            str3 = otherParams6.LJFF;
        } else {
            str3 = null;
        }
        UserProfileAbility userProfileAbility5 = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility5 != null && (otherParams5 = userProfileAbility5.getOtherParams()) != null) {
            str4 = otherParams5.LJI;
        } else {
            str4 = null;
        }
        UserProfileAbility userProfileAbility6 = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility6 != null && (otherParams4 = userProfileAbility6.getOtherParams()) != null) {
            str5 = otherParams4.LJII;
        } else {
            str5 = null;
        }
        UserProfileAbility userProfileAbility7 = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility7 != null && (otherParams3 = userProfileAbility7.getOtherParams()) != null) {
            str6 = otherParams3.LJIIIIZZ;
        } else {
            str6 = null;
        }
        UserProfileFollowVM userProfileFollowVMQq = qq();
        userProfileFollowVMQq.LLILLL = str;
        userProfileFollowVMQq.LLILZ = str2;
        userProfileFollowVMQq.LLILZLL = str3;
        userProfileFollowVMQq.LLIZ = str4;
        userProfileFollowVMQq.LLIZLLLIL = str5;
        userProfileFollowVMQq.LLJ = str6;
        userProfileFollowVMQq.LLJI = num;
        qq().LLILZIL = iq();
        UserProfileAbility userProfileAbility8 = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility8 != null && (otherParams2 = userProfileAbility8.getOtherParams()) != null) {
            map = otherParams2.LJIIL;
        } else {
            map = null;
        }
        UserProfileAbility userProfileAbility9 = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility9 != null && (otherParams = userProfileAbility9.getOtherParams()) != null) {
            c1252480ihK = otherParams.LJIJI;
        }
        UserProfileFollowVM userProfileFollowVMQq2 = qq();
        userProfileFollowVMQq2.LLJIJIL = c1252480ihK;
        userProfileFollowVMQq2.LLJILJIL = map;
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            ep(nVar);
        }
        tp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.10EW, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.CharSequence] */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.ICTASocialInteractionAbility
    public final void Uo(final FollowStatus followStatus) {
        String str;
        String str2;
        String str3;
        String nickname;
        PopupInstanceConfig popupInstanceConfig;
        String uid;
        C1252220igu otherParams;
        String uid2;
        String secUid;
        UserProfileInfo userProfileInfo;
        UserProfileInfo userProfileInfo2;
        AwemeRawAd awemeRawAd;
        Activity activityLIZ;
        String str4;
        String str5;
        AwemeRawAd awemeRawAd2;
        C1252220igu otherParams2;
        String str6;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HeaderCTAFollowComponent.onFollowSuccess(");
        sbLIZ.append(followStatus);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push]");
        boolean z = false;
        if (followStatus != null) {
            ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
            if (profilePlatformViewModelZo != null) {
                profilePlatformViewModelZo.SQ2(new AwS582S0100000_3(followStatus, 11), false);
            }
            ?? r0 = 0;
            r0 = 0;
            if (followStatus.getFollowStatus() == 1 || followStatus.getFollowStatus() == 2) {
                User userIq = iq();
                if (userIq != null) {
                    userIq.setBlock(false);
                }
                this.LLLF = true;
                C736400Suc c736400Suc = C736400Suc.LIZ;
                User userIq2 = iq();
                String type = EnumC1260930iux.PROFILE_FOLLOW.getType();
                String enterFrom = getEnterFrom();
                C1252230igv c1252230igvPq = pq();
                if (c1252230igvPq != null) {
                    str = c1252230igvPq.LLILZIL;
                } else {
                    str = null;
                }
                c736400Suc.getClass();
                C736400Suc.LJ(userIq2, type, enterFrom, str, null, null, null);
            }
            if (followStatus.getFollowStatus() == 1 || followStatus.getFollowStatus() == 2 || followStatus.getFollowStatus() == 4) {
                C211000rc.LIZ("[Push]");
                final C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    if (!ChannelsAuthRefactorExp.INSTANCE.enabled() && !ChannelAuthEdmAndSmsGuideV3.INSTANCE.enabled()) {
                        ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIIJ(c19egLIZ, "follow_finish", new InterfaceC1914010zuJ() { // from class: X.0igt
                            @Override // X.InterfaceC1914010zuJ
                            public final void LIZIZ() {
                            }

                            @Override // X.InterfaceC1914010zuJ
                            public final void LIZ() {
                                INoticeService iNoticeService = (INoticeService) PluggableExtentionKt.pluggableSpi$default(INoticeService.class, false, false, false, 14, null);
                                if (iNoticeService != null) {
                                    C19EG c19eg = c19egLIZ;
                                    HeaderCTAFollowComponent headerCTAFollowComponent = this;
                                    int followStatus2 = followStatus.getFollowStatus();
                                    headerCTAFollowComponent.getClass();
                                    iNoticeService.LJJLIIIJILLIZJL(c19eg, new C1917290zzb(null, "others_homepage", null, "follow", null, null, null, null, followStatus2 == 4 ? "ug_338_follow_request" : "ug_338_follow_profile", 4085));
                                }
                            }
                        });
                    } else {
                        UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("follow_finish");
                        if (followStatus.getFollowStatus() == 4) {
                            str2 = "follow_finish_follow_request";
                        } else {
                            str2 = "follow_finish_profile";
                        }
                        unifiedAuthPopupConfigLIZJ.setSceneId(str2);
                        unifiedAuthPopupConfigLIZJ.setSubSceneId(unifiedAuthPopupConfigLIZJ.sceneId);
                        unifiedAuthPopupConfigLIZJ.setEnterFrom("others_homepage");
                        if (followStatus.getFollowStatus() == 4) {
                            str3 = "ug_338_follow_request";
                        } else {
                            str3 = "ug_338_follow_profile";
                        }
                        unifiedAuthPopupConfigLIZJ.setPopupTriggerId(str3);
                        unifiedAuthPopupConfigLIZJ.setSysPage("follow_finish");
                        User userIq3 = iq();
                        if (userIq3 == null || (nickname = userIq3.getNickname()) == null || !Boolean.valueOf(!a0.LJJJIL(nickname)).booleanValue()) {
                            nickname = "";
                        }
                        unifiedAuthPopupConfigLIZJ.setTargetUserName(nickname);
                        List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
                        if (list != null && (!list.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
                            popupInstanceConfig.setPopupCombinationType(3);
                        }
                        ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(c19egLIZ, null, unifiedAuthPopupConfigLIZJ);
                    }
                }
            }
            if (followStatus.getFollowStatus() == 0) {
                C736400Suc c736400Suc2 = C736400Suc.LIZ;
                User userIq4 = iq();
                String type2 = EnumC1260930iux.PROFILE_FOLLOW_CANCEL.getType();
                String enterFrom2 = getEnterFrom();
                C1252230igv c1252230igvPq2 = pq();
                if (c1252230igvPq2 != null) {
                    str6 = c1252230igvPq2.LLILZIL;
                } else {
                    str6 = null;
                }
                c736400Suc2.getClass();
                C736400Suc.LJ(userIq4, type2, enterFrom2, str6, null, null, null);
            }
            Aweme awemeFq = fq();
            if (awemeFq != null && (awemeRawAd = awemeFq.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                C10E1 c10e1M4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4();
                User userIq5 = iq();
                Context context = getContext();
                if (context != null) {
                    activityLIZ = C1388190mED.LIZ(context);
                } else {
                    activityLIZ = null;
                }
                String str7 = "others_homepage";
                C1252230igv c1252230igvPq3 = pq();
                if (c1252230igvPq3 != null) {
                    str4 = c1252230igvPq3.LLILLL;
                } else {
                    str4 = null;
                }
                UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
                if (userProfileAbility != null && (otherParams2 = userProfileAbility.getOtherParams()) != null) {
                    str5 = otherParams2.LJ;
                } else {
                    str5 = null;
                }
                InterfaceC19225710Jj interfaceC19225710Jj = new InterfaceC19225710Jj() { // from class: X.0igm
                    @Override // X.InterfaceC19225710Jj
                    public final void LIZ(User user) {
                        UserProfileAbility userProfileAbility2 = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), UserProfileAbility.class, null);
                        if (userProfileAbility2 != null) {
                            userProfileAbility2.sA2(this.LIZ.iq(), EnumC1251790igD.NORMAL);
                        }
                    }
                };
                String str8 = "follow_notification";
                Aweme awemeFq2 = fq();
                if (awemeFq2 != null) {
                    awemeRawAd2 = awemeFq2.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                c10e1M4.LJIILL(new C10ET(userIq5, activityLIZ, str7, str4, str5, interfaceC19225710Jj, str8, awemeRawAd2, z, r0, r0, 1792));
            }
            User userIq6 = iq();
            if (userIq6 == null) {
                userIq6 = new User();
                ProfileCommonInfo profileCommonInfoVo = Vo();
                if (profileCommonInfoVo != null && (userProfileInfo2 = profileCommonInfoVo.getUserProfileInfo()) != null) {
                    uid2 = userProfileInfo2.getUid();
                } else {
                    uid2 = null;
                }
                userIq6.setUid(uid2);
                ProfileCommonInfo profileCommonInfoVo2 = Vo();
                if (profileCommonInfoVo2 != null && (userProfileInfo = profileCommonInfoVo2.getUserProfileInfo()) != null) {
                    secUid = userProfileInfo.getSecUid();
                } else {
                    secUid = null;
                }
                userIq6.setSecUid(secUid);
                userIq6.setFollowStatus(followStatus.getFollowStatus());
            }
            InterfaceC1345705Ol imUserService = C1336205Ku.LIZ(false).getImUserService();
            IMUser.Companion.getClass();
            imUserService.LJIILJJIL(C2201941BFw.LIZJ(userIq6));
            dq(followStatus.getFollowStatus());
            if ((followStatus.getFollowStatus() == 1 || followStatus.getFollowStatus() == 4) && userIq6.isBlock()) {
                userIq6.setBlock(false);
                UserAwemePagerAbility userAwemePagerAbility = (UserAwemePagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserAwemePagerAbility.class, null);
                if (userAwemePagerAbility != null) {
                    userAwemePagerAbility.OC1();
                }
            }
            ICTARecommendButtonAbility iCTARecommendButtonAbility = (ICTARecommendButtonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICTARecommendButtonAbility.class, null);
            if (iCTARecommendButtonAbility != null) {
                iCTARecommendButtonAbility.d50(followStatus.getFollowStatus());
            }
            User userIq7 = iq();
            if (userIq7 != null && (uid = userIq7.getUid()) != null && (!TextUtils.isEmpty(uid))) {
                if (TextUtils.equals(getEnterFrom(), "follow_request_page")) {
                    C1440005kM.LIZ(new C767302z9(uid, followStatus.getFollowStatus()));
                } else {
                    UserProfileAbility userProfileAbility2 = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
                    if (userProfileAbility2 != null && (otherParams = userProfileAbility2.getOtherParams()) != null) {
                        r0 = otherParams.LIZLLL;
                    }
                    if (TextUtils.equals(r0, "homepage_friends") && followStatus.getFollowStatus() == 0) {
                        C1440005kM.LIZ(new C034I(fq()));
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("follow_status", followStatus.getFollowStatus());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1440005kM.LIZ(new C848460XQe("userFollowStatusChange", jSONObject));
        }
    }

    public final void Xp(boolean z) throws JSONException {
        String str;
        String uid;
        String uid2;
        Activity activityLIZ;
        IBlockService iBlockService;
        User userIq;
        String uid3;
        C1252220igu otherParams;
        Activity activityLIZ2 = null;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility != null && (otherParams = userProfileAbility.getOtherParams()) != null) {
            str = otherParams.LIZLLL;
        } else {
            str = null;
        }
        String str2 = "";
        if (z) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", str);
            c0lab.LIZ(0, "role");
            C20684815ws.LJIILLIIL("block", c0lab.LIZ);
            Context context = getContext();
            if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null || (iBlockService = (IBlockService) PluggableExtentionKt.pluggableSpi$default(IBlockService.class, false, false, false, 14, null)) == null || (userIq = iq()) == null) {
                return;
            }
            String str3 = (String) this.LLLFF.getValue();
            User userIq2 = iq();
            if (userIq2 != null && (uid3 = userIq2.getUid()) != null) {
                str2 = uid3;
            }
            iBlockService.LIZIZ(activityLIZ, userIq, str3, str2, new AwS168S1100000_19(str, this, 6), new AwS70S1000000_19(str, 8));
            return;
        }
        C0LAB c0lab2 = new C0LAB();
        c0lab2.LJ("enter_from", str);
        c0lab2.LIZ(0, "role");
        C20684815ws.LJIILLIIL("unblock", c0lab2.LIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        User userIq3 = iq();
        if (userIq3 != null) {
            uid = userIq3.getUid();
        } else {
            uid = null;
        }
        jSONObject.put("uid", uid);
        jSONObject.put("block_status", 0);
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "parentBlockUserForTeen"));
        IBlockService iBlockService2 = (IBlockService) PluggableExtentionKt.pluggableSpi$default(IBlockService.class, false, false, false, 14, null);
        if (iBlockService2 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                activityLIZ2 = C1388190mED.LIZ(context2);
            }
            if (iq() == null) {
                return;
            }
            String str4 = (String) this.LLLFF.getValue();
            User userIq4 = iq();
            if (userIq4 != null && (uid2 = userIq4.getUid()) != null) {
                str2 = uid2;
            }
            iBlockService2.LJFF(activityLIZ2, str4, str2, new AwS563S0100000_19(this, 2416), AFwS257S0000000_19.get$arr$(457));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.ICTASocialInteractionAbility
    public final void bJ1(String str) {
        Activity activityLIZ;
        String str2;
        C1252230igv c1252230igvPq = pq();
        if (c1252230igvPq != null && (str2 = c1252230igvPq.LLILZ) != null && Intrinsics.LJFF(str2, "guide_dm")) {
            C736400Suc c736400Suc = C736400Suc.LIZ;
            User userIq = iq();
            c736400Suc.getClass();
            C736400Suc.LIZLLL(userIq, str2, str);
            return;
        }
        C736400Suc c736400Suc2 = C736400Suc.LIZ;
        Context context = getContext();
        if (context != null) {
            activityLIZ = C06MM.LIZ(context);
        } else {
            activityLIZ = null;
        }
        EnumC1584370rKd enumC1584370rKd = EnumC1584370rKd.PROFILE;
        c736400Suc2.getClass();
        C736400Suc.LIZJ(activityLIZ, str, enumC1584370rKd, null);
    }

    public final void dq(int i) {
        boolean z;
        boolean z2;
        int followToastType;
        User userIq;
        User userIq2;
        User userIq3;
        User userIq4;
        User userIq5;
        User userIq6;
        String accurateRecType;
        GeneralPermission generalPermission;
        User userIq7;
        Integer numValueOf;
        if (!this.LLILZ) {
            return;
        }
        User userIq8 = iq();
        if (userIq8 != null && userIq8.getFollowStatus() == i) {
            z = true;
        } else {
            z = false;
        }
        String uid = null;
        if (!z) {
            User userIq9 = iq();
            if (userIq9 != null) {
                userIq9.setFollowStatus(i);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateFollowStatus followStatus ");
            sbLIZ.append(i);
            sbLIZ.append(", curUser ");
            User userIq10 = iq();
            if (userIq10 != null) {
                numValueOf = Integer.valueOf(userIq10.getFollowStatus());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            C1720106oR.LJI("ProfileNavbarMessageProtocol", C2188811AlT.LIZIZ(sbLIZ));
            User userIq11 = iq();
            if (userIq11 != null && userIq11.getFollowStatus() == 0) {
                userIq11.boldFields = Collections.singletonList("nickname");
            }
            UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
            if (userProfileAbility != null) {
                userProfileAbility.sA2(iq(), EnumC1251790igD.NORMAL);
            }
        }
        if (!C1336205Ku.LIZJ().LIZJ() && (userIq7 = iq()) != null && userIq7.isShowMessageButton()) {
            z2 = true;
        } else {
            z2 = false;
        }
        User userIq12 = iq();
        if (userIq12 != null && (generalPermission = userIq12.getGeneralPermission()) != null) {
            followToastType = generalPermission.getFollowToastType();
        } else {
            followToastType = 0;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            qq().zQ2(EnumC1252150ign.LOGIN);
        } else if (!TextUtils.isEmpty((String) this.LLLFF.getValue())) {
            User userIq13 = iq();
            if (userIq13 != null && userIq13.getFpBlockByType() == 1) {
                qq().zQ2(EnumC1252150ign.IS_BLOCK_BY_TEEN);
            } else {
                User userIq14 = iq();
                if (userIq14 != null && userIq14.getFpBlockByType() == 2) {
                    qq().zQ2(EnumC1252150ign.PARENT_CAN_UNBLOCK_FOR_TEEN);
                } else {
                    User userIq15 = iq();
                    if (userIq15 != null && userIq15.getFpBlockByType() == 0) {
                        qq().zQ2(EnumC1252150ign.PARENT_CAN_BLOCK_FOR_TEEN);
                    }
                }
            }
        } else {
            User userIq16 = iq();
            if (userIq16 != null && userIq16.isPendingUnblockRequest() && (userIq5 = iq()) != null && userIq5.getFpBlockByType() == 2) {
                qq().zQ2(EnumC1252150ign.IS_PENDING_UNBLOCK_REQUEST);
            } else {
                User userIq17 = iq();
                if (userIq17 != null && !userIq17.isPendingUnblockRequest() && (userIq4 = iq()) != null && userIq4.getFpBlockByType() == 2) {
                    qq().zQ2(EnumC1252150ign.CAN_REQUEST_UNBLOCK);
                } else {
                    User userIq18 = iq();
                    if ((userIq18 != null && !userIq18.isBlock && (userIq3 = iq()) != null && userIq3.isBlocked()) || (((userIq = iq()) != null && userIq.isUserCancelled()) || ((userIq2 = iq()) != null && userIq2.isGeoBlocked()))) {
                        qq().zQ2(EnumC1252150ign.GEO_BLOCK);
                    } else {
                        User userIq19 = iq();
                        if (userIq19 != null && userIq19.isBlock) {
                            qq().zQ2(EnumC1252150ign.BLOCK);
                        } else {
                            User userIq20 = iq();
                            if (userIq20 != null && userIq20.getFollowStatus() == 0) {
                                if (followToastType != 1) {
                                    if (followToastType != 2) {
                                        qq().zQ2(EnumC1252150ign.FOLLOW);
                                    } else {
                                        qq().zQ2(EnumC1252150ign.TEMPORARY_BAN);
                                    }
                                } else {
                                    qq().zQ2(EnumC1252150ign.BAN);
                                }
                            } else if (i == 4) {
                                qq().zQ2(EnumC1252150ign.REQUESTED);
                            } else if (i == 1 || i == 2) {
                                if (!z2) {
                                    if (i == 1) {
                                        qq().zQ2(EnumC1252150ign.U16_FOLLOW);
                                    } else {
                                        qq().zQ2(EnumC1252150ign.U16_MUTUAL_FOLLOW);
                                    }
                                } else if (i == 2) {
                                    qq().zQ2(EnumC1252150ign.DOUBLE_CANCEL);
                                } else {
                                    qq().zQ2(EnumC1252150ign.UNFOLLOW);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.LLLF && i == 0 && (userIq6 = iq()) != null && userIq6.getFollowerStatus() == 1) {
            UserProfileFollowVM userProfileFollowVMQq = qq();
            User userIq21 = iq();
            if (userIq21 != null) {
                uid = userIq21.getUid();
            }
            String str = "";
            if (uid == null) {
                uid = "";
            }
            User userIq22 = iq();
            if (userIq22 != null && (accurateRecType = userIq22.getAccurateRecType()) != null) {
                str = accurateRecType;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("to_user_id", uid);
            c2344009Gk.LJIIIIZZ("rec_type", str);
            c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
            c2344009Gk.LJIIIIZZ("previous_page", userProfileFollowVMQq.LLILLL);
            C20684815ws.LJIILLIIL("show_follow_back_button", c2344009Gk.LIZ);
            this.LLLF = false;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLLIIII = (SocialBlockData) C1250210idf.LIZ(nVar.toString(), SocialBlockData.class);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        BaseResponse baseResponse;
        User userIq = iq();
        if (userIq != null) {
            Object messageObj = null;
            if (message != null) {
                messageObj = HandlerHook.getMessageObj(message.obj);
            }
            if ((messageObj instanceof BaseResponse) && (baseResponse = (BaseResponse) messageObj) != null) {
                if (((INoticeService) ServiceManager.get().getService(INoticeService.class)).LJLJJI(baseResponse)) {
                    C1440005kM.LIZ(new C767302z9(userIq.getUid(), -101));
                    return;
                }
                if (!((INoticeService) ServiceManager.get().getService(INoticeService.class)).LJLLI(baseResponse)) {
                    return;
                }
                C1440005kM.LIZ(new C767302z9(userIq.getUid(), -100));
                userIq.setFollowerStatus(1);
                if (userIq.getFollowStatus() == 1) {
                    userIq.setFollowStatus(2);
                }
                dq(userIq.getFollowStatus());
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        C437850HEx c437850HEx = this.LLLII;
        if (c437850HEx != null && c437850HEx.LLILZ) {
            c437850HEx.LIZIZ();
        }
    }

    @C14EU
    public final void onEvent(C1252060ige c1252060ige) {
        String creativeIdStr;
        CommerceUserInfo commerceUserInfo;
        AwemeRawAd awemeRawAd;
        String str = c1252060ige.LIZ;
        Aweme awemeFq = fq();
        if (awemeFq != null && (awemeRawAd = awemeFq.getAwemeRawAd()) != null) {
            creativeIdStr = awemeRawAd.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        if (!Intrinsics.LJFF(str, creativeIdStr)) {
            return;
        }
        User userIq = iq();
        if (userIq != null && (commerceUserInfo = userIq.getCommerceUserInfo()) != null) {
            commerceUserInfo.setNotificationConfig(c1252060ige.LIZIZ ? 1 : 0);
        }
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility != null) {
            userProfileAbility.sA2(iq(), EnumC1251790igD.NORMAL);
        }
    }

    @C14EU
    public final void onMobRequestIdEvent(C739490Szb c739490Szb) {
        this.LLLFFI = c739490Szb.LIZ;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.ICTASocialInteractionAbility
    public final void th(Exception exc) {
        Activity activityLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HeaderCTAFollowComponent.onFollowFail(");
        sbLIZ.append(exc.getMessage());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push]");
        if (!this.LLILZ) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        C0O3Q.LIZ(activityLIZ, exc);
    }

    public final void tq(int i) throws JSONException {
        String str;
        int i2;
        String aid;
        String authorUid;
        Activity activityLIZ;
        User userIq;
        IBlockService iBlockService;
        SocialBlockData socialBlockData;
        Integer blockingByType;
        IBlockService iBlockService2;
        String nickname;
        String str2;
        C1252280ih0 c1252280ih0;
        C1252280ih0 c1252280ih02;
        C1252230igv c1252230igvPq = pq();
        String aid2 = null;
        if (c1252230igvPq != null && (c1252280ih02 = c1252230igvPq.LLIZLLLIL) != null) {
            str = c1252280ih02.LJ;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            C1252230igv c1252230igvPq2 = pq();
            if (c1252230igvPq2 != null && (c1252280ih0 = c1252230igvPq2.LLIZLLLIL) != null) {
                str2 = c1252280ih0.LJ;
            } else {
                str2 = null;
            }
            this.LLLFZ = str2;
        }
        EnumC1252150ign value = qq().LLJILLL.getValue();
        if (value == null) {
            i2 = -1;
        } else {
            i2 = C1252170igp.LIZ[value.ordinal()];
        }
        String str3 = "";
        switch (i2) {
            case 1:
                qq().xQ2();
                bJ1("profile_follow");
                Bm1(i);
                break;
            case 2:
                bJ1("profile_follow_cancel");
                Bm1(i);
                break;
            case 3:
                C1251930igR.LIZIZ("unblock");
                Context context = getContext();
                if (context != null) {
                    String string = context.getResources().getString(2131822981);
                    Object[] objArr = new Object[2];
                    objArr[0] = C10EU.LIZJ(iq());
                    User userIq2 = iq();
                    if (userIq2 != null && (nickname = userIq2.getNickname()) != null) {
                        str3 = nickname;
                    }
                    objArr[1] = str3;
                    String strJ4 = C786410Ut5.j4(string, Arrays.copyOf(objArr, 2));
                    AwS385S0200000_19 awS385S0200000_19 = new AwS385S0200000_19(this, context, 144);
                    if (C299940BpI.LIZ() && (socialBlockData = this.LLLIIII) != null && (blockingByType = socialBlockData.getBlockingByType()) != null && blockingByType.intValue() == 1) {
                        Context context2 = getContext();
                        if (context2 != null && (iBlockService2 = (IBlockService) PluggableExtentionKt.pluggableSpi$default(IBlockService.class, false, false, false, 14, null)) != null) {
                            iBlockService2.LIZ(context2, C10EU.LIZJ(iq()), AFwS207S0000000_19.get$arr$(StrategyCenter.ENABLE_SMART_SERVICE), awS385S0200000_19);
                            break;
                        }
                    } else {
                        Context context3 = getContext();
                        if (context3 != null) {
                            String string2 = context3.getResources().getString(2131822980);
                            Object[] objArr2 = new Object[1];
                            User userIq3 = iq();
                            if (userIq3 != null) {
                                aid2 = userIq3.getUniqueId();
                            }
                            objArr2[0] = aid2;
                            String strJ42 = C786410Ut5.j4(string2, Arrays.copyOf(objArr2, 1));
                            C1397580mTM c1397580mTM = new C1397580mTM(context3);
                            c1397580mTM.LJI(strJ4);
                            c1397580mTM.LIZIZ(strJ42);
                            C985403tE.LIZ(c1397580mTM, new AwS385S0200000_19(awS385S0200000_19, this, 143));
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                        break;
                    }
                }
                break;
            case 4:
                Xp(true);
                break;
            case 5:
                Xp(false);
                break;
            case 6:
                Context context4 = getContext();
                if (context4 != null && (activityLIZ = C1388190mED.LIZ(context4)) != null && (userIq = iq()) != null && (iBlockService = (IBlockService) PluggableExtentionKt.pluggableSpi$default(IBlockService.class, false, false, false, 14, null)) != null) {
                    iBlockService.LJI(activityLIZ, userIq, "", new AwS420S0200000_19(this, userIq, 210), new AwS598S0100000_19(this, 880));
                    break;
                }
                break;
            case 7:
                Context context5 = getContext();
                if (context5 != null) {
                    C1381440m3K c1381440m3K = new C1381440m3K(context5);
                    c1381440m3K.LIZ(new String[]{context5.getResources().getString(2131828356), context5.getResources().getString(2131828357)}, new DialogInterfaceOnClickListenerC1265940j32(this, 7));
                    c1381440m3K.LIZIZ();
                }
                break;
            case 8:
                Context context6 = getContext();
                if (context6 != null) {
                    C1397580mTM c1397580mTM2 = new C1397580mTM(context6);
                    c1397580mTM2.LJFF(2131826368);
                    c1397580mTM2.LIZ(2131826369);
                    C985403tE.LIZ(c1397580mTM2, new AwS598S0100000_19(this, 876));
                    new C1397510mTF(c1397580mTM2).LIZLLL();
                }
                qq();
                UserProfileFollowVM.DQ2(iq());
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                Context context7 = getContext();
                if (context7 != null) {
                    C1397580mTM c1397580mTM3 = new C1397580mTM(context7);
                    c1397580mTM3.LIZ(2131826370);
                    C985403tE.LIZ(c1397580mTM3, new AwS598S0100000_19(this, 879));
                    new C1397510mTF(c1397580mTM3).LIZLLL();
                }
                qq();
                UserProfileFollowVM.DQ2(iq());
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                Bm1(-1);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                aq();
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                String str4 = this.LLLFZ;
                if (str4 != null) {
                    str3 = str4;
                }
                C627150Oin c627150Oin = new C627150Oin();
                Aweme awemeFq = fq();
                if (awemeFq != null) {
                    aid = awemeFq.getAid();
                } else {
                    aid = null;
                }
                C786410Ut5.LJJJI("group_id", aid, c627150Oin.LIZ);
                Aweme awemeFq2 = fq();
                if (awemeFq2 != null) {
                    authorUid = AwemeExtKt.getAuthorUid(awemeFq2);
                } else {
                    authorUid = null;
                }
                C786410Ut5.LJJJI("author_id", authorUid, c627150Oin.LIZ);
                Aweme awemeFq3 = fq();
                if (awemeFq3 != null) {
                    aid2 = awemeFq3.getAid();
                }
                C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aid2), c627150Oin.LIZ);
                C0XPD.LIZIZ(c19egLIZ, str3, "click_follow", c627150Oin.LIZ, new C1266200j3S(this, 4));
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                aq();
                break;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.ICTASocialInteractionAbility
    public final void z41(User user) {
        String uid;
        GeneralPermission generalPermission;
        if (TextUtils.equals(getEnterFrom(), "follow_request_page") && !this.LLLI) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (getContext() != null && c19egLIZ != null && this.LLILZ && user != null) {
                User userIq = iq();
                if (userIq != null) {
                    uid = userIq.getUid();
                } else {
                    uid = null;
                }
                if (!TextUtils.isEmpty(uid) && !c19egLIZ.isFinishing() && !user.isBlock && !user.isBlocked()) {
                    if ((user.getGeneralPermission() == null || ((generalPermission = user.getGeneralPermission()) != null && generalPermission.getFollowToastType() == 0)) && user.getFollowerStatus() != 1) {
                        C437850HEx c437850HEx = this.LLLII;
                        if (c437850HEx != null) {
                            ((C197039127h) c437850HEx.getView().findViewById(R.id.s72)).setButtonVariant(1);
                            ((TextView) c437850HEx.getView().findViewById(R.id.s74)).setText(C10EU.LIZJ(user));
                            C786410Ut5.U8((C197039127h) c437850HEx.getView().findViewById(R.id.s72), new ACListenerS141S0100000_6(c437850HEx, 96));
                            C786410Ut5.U8((C197039127h) c437850HEx.getView().findViewById(R.id.s71), new ACListenerS141S0100000_6(c437850HEx, 97));
                            c437850HEx.setAcceptCallback(new AwS263S0300000_19(this, user, c437850HEx, 11));
                            c437850HEx.setDeleteCallback(new AwS263S0300000_19(this, user, c437850HEx, 12));
                            if (!c437850HEx.LLILZ) {
                                c437850HEx.LLILZ = true;
                                if (c437850HEx.LLILLL.isRunning()) {
                                    c437850HEx.LLILLL.cancel();
                                }
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c437850HEx, "translationY", c437850HEx.getTranslationY(), -C12ES.LIZJ(16.0f, c437850HEx.getContext()));
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c437850HEx, "alpha", c437850HEx.getAlpha(), 1.0f);
                                c437850HEx.LLILLJJLI.setDuration(200L);
                                c437850HEx.LLILLJJLI.setInterpolator(new C21387918mz());
                                c437850HEx.LLILLJJLI.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
                                int visibility = c437850HEx.getVisibility();
                                c437850HEx.setVisibility(0);
                                C1602160rnK.LIZIZ(visibility, 0, c437850HEx);
                                c437850HEx.LLILLJJLI.start();
                            }
                            C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                            String enterFrom = getEnterFrom();
                            if (enterFrom == null) {
                                enterFrom = "";
                            }
                            String uid2 = user.getUid();
                            c1253930ijf.getClass();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("to_user_id", uid2);
                            c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
                            C20684815ws.LJIILLIIL("show_follow_request_pop_up", c2344009Gk.LIZ);
                        }
                        this.LLLI = true;
                    }
                }
            }
        }
    }
}
