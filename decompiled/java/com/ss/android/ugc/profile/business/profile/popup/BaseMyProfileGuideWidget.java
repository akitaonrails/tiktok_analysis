package com.ss.android.ugc.profile.business.profile.popup;

import X.AbstractC20660115st;
import X.AbstractC637050Oyl;
import X.AbstractC848400XPy;
import X.AnimationAnimationListenerC1265820j2q;
import X.C01GW;
import X.C09A1;
import X.C0BW7;
import X.C0BXP;
import X.C0H9H;
import X.C0HKX;
import X.C0PEM;
import X.C0XQ7;
import X.C10EU;
import X.C11EA;
import X.C11NJ;
import X.C1248780ibM;
import X.C1250680ieQ;
import X.C1252550ihR;
import X.C1254650ikp;
import X.C1254790il3;
import X.C1256020in2;
import X.C1256940ioW;
import X.C1256960ioY;
import X.C1257000ioc;
import X.C1257020ioe;
import X.C1257420ipI;
import X.C1260090itb;
import X.C1266160j3O;
import X.C1266240j3W;
import X.C1266290j3b;
import X.C1388190mED;
import X.C13LE;
import X.C14EU;
import X.C14LC;
import X.C1548820qPI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1585030rLh;
import X.C15O7;
import X.C1745060vVo;
import X.C19719912Dl;
import X.C19EG;
import X.C20554315bp;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2238171Cit;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C2344009Gk;
import X.C262100zr;
import X.C280300Ayi;
import X.C286870BMf;
import X.C291001Au;
import X.C309690CBz;
import X.C384050F3z;
import X.C418440Gaw;
import X.C443120HZe;
import X.C446980Hfs;
import X.C452501pT;
import X.C637090Oyp;
import X.C786410Ut5;
import X.EnumC20654715s1;
import X.EnumC452301pR;
import X.InterfaceC1141530foN;
import X.InterfaceC1203590hQT;
import X.InterfaceC1238520iKo;
import X.InterfaceC20660615sy;
import X.InterfaceC633940Otk;
import X.ViewOnClickListenerC1203580hQS;
import X.ViewOnClickListenerC1238510iKn;
import Y.ARunnableS80S0200000_11;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.google.gson.n;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profilebanner.IProfileBannerService;
import com.ss.android.ugc.aweme.service.appdiff.IDramaSystemPushRevisitNoticeService;
import com.ss.android.ugc.aweme.watermark.MTCreativeFeatureService;
import com.ss.android.ugc.common.component.fragment.ComponentFragment;
import com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget;
import com.ss.android.ugc.profile.business.profile.survey.SurveyAnswer;
import com.ss.android.ugc.profile.business.profile.survey.SurveyData;
import com.ss.android.ugc.profile.business.profile.ui.v2.MyProfileAbility;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideState;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideViewModel;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS47S0010000_35;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public class BaseMyProfileGuideWidget extends ProfileWidget implements InterfaceC1141530foN {
    public final String LLJI;
    public final ComponentFragment LLJIJIL;
    public final C01GW LLJILJIL;
    public View LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public C1257020ioe LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public View LLJJIJIL;
    public AnimatorSet LLJJJ;
    public final WidgetLifecycleAwareLazy LLJJJIL;
    public final C11NJ LLJJJJ;
    public final C01GW LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public Aweme LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    public C443120HZe[] LJIILLIIL(MyProfileGuideState myProfileGuideState, ProfileState profileState) {
        return new C443120HZe[0];
    }

    public C443120HZe[] LJIIZILJ(MyProfileGuideState myProfileGuideState, ProfileState profileState) {
        return new C443120HZe[0];
    }

    public C443120HZe[] LJIJ(MyProfileGuideState myProfileGuideState, ProfileState profileState) {
        return new C443120HZe[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0ioV] */
    @Override // com.ss.android.ugc.profile.business.profile.popup.ProfileWidget, com.bytedance.widget.Widget
    public void onCreate() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        MutableLiveData<C291001Au<Unit>> mutableLiveDataLIZ;
        this.LLILLJJLI = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        EventBus.LIZLLL().LJIJJ(this);
        C1548820qPI.LIZLLL("profile_artist_highlight_guide_click", this);
        ProfileViewModel profileViewModelLJI = LJI();
        AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(this, 333);
        profileViewModelLJI.getClass();
        JediViewModel.bR2(profileViewModelLJI, new C2217381BqS() { // from class: X.0iod
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileState) obj).getTriggerCopyrightViolationSnackBarEvent();
            }
        }, null, new AwS598S0100000_19(awS598S0100000_19, 845), 2, null);
        IDramaSystemPushRevisitNoticeService.LIZ.getClass();
        IDramaSystemPushRevisitNoticeService value = C1256960ioY.LIZIZ.getValue();
        if (value != null && (mutableLiveDataLIZ = value.LIZ()) != null) {
            final AwS598S0100000_19 awS598S0100000_192 = new AwS598S0100000_19(this, 334);
            mutableLiveDataLIZ.observe(this, new Observer<T>(awS598S0100000_192) { // from class: X.00uU
                public final Function1<T, Unit> LL;
                public boolean LLILLJJLI = true;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LL = awS598S0100000_192;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(T t) {
                    if (this.LLILLJJLI) {
                        this.LLILLJJLI = false;
                    } else {
                        if (t == null) {
                            return;
                        }
                        this.LL.invoke(t);
                    }
                }
            });
        }
        C11EA.LJIIIZ(this, LJI(), new C2217381BqS() { // from class: X.0ijt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileState) obj).isPostAwemeEmpty();
            }
        }, new C2217381BqS() { // from class: X.0ioa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileState) obj).getLoadAvatar();
            }
        }, new C2217381BqS() { // from class: X.0iob
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileState) obj).isFromMain();
            }
        }, new C2217381BqS() { // from class: X.0ik1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileState) obj).getCurrentDownloadSetting();
            }
        }, new C1266290j3b(this, 0));
        C11EA.LJII(this, LJI(), new C2217381BqS() { // from class: X.0ijz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileState) obj).getOnHiddenChanged());
            }
        }, new AwS633S0100000_19(this, 123));
        C11EA.LJII(this, LJI(), new C2217381BqS() { // from class: X.0ik0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileState) obj).isPostAndDraftEmpty();
            }
        }, new AwS633S0100000_19(this, 120));
        if (((Number) C280300Ayi.LIZ.getValue()).intValue() == 1) {
            C11EA.LJIIL(this, LJIILIIL(), new AwS633S0100000_19(this, 122));
        } else {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("profile banner is close: ");
            sbLIZ.append(C286870BMf.LIZ());
            C2188811AlT.LIZIZ(sbLIZ);
            if (!C286870BMf.LIZ()) {
                final C2238171Cit c2238171CitLJIIJJI = LJIIJJI();
                c2238171CitLJIIJJI.getClass();
                if (C0BXP.LIZ() && c2238171CitLJIIJJI.LIZLLL) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ)), null, null, new C637090Oyp(c2238171CitLJIIJJI, null), 3);
                    C20554315bp.LIZIZ.LJIIIIZZ(EnumC20654715s1.PROFILE_BANNER, new AbstractC637050Oyl() { // from class: X.0Oys
                        @Override // X.AbstractC637050Oyl
                        public final void LIZ(C20554115bn c20554115bn, String str, n nVar, Map<String, Object> map) {
                            C2238171Cit c2238171Cit = c2238171CitLJIIJJI;
                            c2238171Cit.getClass();
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C637110Oyr(c20554115bn, str, c2238171Cit, nVar, null), 3);
                        }
                    });
                }
            }
            C11EA.LJIIL(this, LJIILIIL(), new AwS633S0100000_19(this, 121));
        }
        if (ComplianceServiceProvider.LJIL().LJJJJZI()) {
            LJIILIIL().setState(AFwS283S0000000_35.get$arr$(153));
        } else if (((AccountUserService) C0XQ7.LJFF()).LIZ()) {
            LJIILIIL().setState(AFwS283S0000000_35.get$arr$(154));
        } else {
            C1256940ioW.LIZ().LIZ = new C1257000ioc(LJIILIIL());
            C1256940ioW.LIZ().LIZJ();
            IProfileMusicTabService iProfileMusicTabService = (IProfileMusicTabService) ServiceManager.get().getService(IProfileMusicTabService.class);
            final MyProfileGuideViewModel myProfileGuideViewModelLJIILIIL = LJIILIIL();
            iProfileMusicTabService.LJIIJJI(new InterfaceC633940Otk(myProfileGuideViewModelLJIILIIL) { // from class: X.0ioV
                public final WeakReference<MyProfileGuideViewModel> LIZ;

                @Override // X.InterfaceC633940Otk
                public final void LIZ() {
                    MyProfileGuideViewModel myProfileGuideViewModel = this.LIZ.get();
                    if (myProfileGuideViewModel != null) {
                        myProfileGuideViewModel.setState(new AwS47S0010000_35(37));
                    }
                }

                @Override // X.InterfaceC633940Otk
                public final void LIZIZ() {
                    MyProfileGuideViewModel myProfileGuideViewModel = this.LIZ.get();
                    if (myProfileGuideViewModel != null) {
                        myProfileGuideViewModel.setState(new AwS47S0010000_35(36));
                    }
                }

                {
                    this.LIZ = new WeakReference<>(myProfileGuideViewModelLJIILIIL);
                }
            });
        }
        if (!((Boolean) C0BW7.LIZ.getValue()).booleanValue()) {
            C1260090itb.LIZIZ.needShowDiskManagerGuideView().LIZIZ(new C1266240j3W(this, 2));
        }
        C15O7.LIZJ(new Callable() { // from class: X.087i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("BaseMyProfileGuideWidget@aba5.checkYouTubeState$1");
                Keva repo = Keva.getRepo("keva_repo_profile_component");
                int i2 = repo.getInt("show_yt_removed_toast", -1);
                if (i2 == 1) {
                    repo.storeInt("show_yt_removed_toast", 0);
                }
                Integer numValueOf = Integer.valueOf(i2);
                C1C7U.LIZIZ("BaseMyProfileGuideWidget@aba5.checkYouTubeState$1");
                return numValueOf;
            }
        }).LJ(new C1266160j3O(this, 16), C15O7.LJIIIIZZ, null);
        C1254650ikp.LIZIZ = new WeakReference<>(LJIILIIL());
        boolean z = C14LC.LJIIIZ;
        C309690CBz.LIZ.getClass();
        int iLIZIZ = C1585030rLh.LJIILL() ? 0 : C14LC.LIZIZ();
        ViewOnClickListenerC1238510iKn viewOnClickListenerC1238510iKnLJIIJ = LJIIJ();
        ViewGroup.LayoutParams layoutParams = viewOnClickListenerC1238510iKnLJIIJ != null ? viewOnClickListenerC1238510iKnLJIIJ.getLayoutParams() : null;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams2.bottomMargin = iLIZIZ;
        }
        ViewOnClickListenerC1203580hQS viewOnClickListenerC1203580hQSLJIIIZ = LJIIIZ();
        ViewGroup.LayoutParams layoutParams2 = viewOnClickListenerC1203580hQSLJIIIZ != null ? viewOnClickListenerC1203580hQSLJIIIZ.getLayoutParams() : null;
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.bottomMargin = iLIZIZ;
        }
        ViewOnClickListenerC1203580hQS viewOnClickListenerC1203580hQSLJIIIZ2 = LJIIIZ();
        if (viewOnClickListenerC1203580hQSLJIIIZ2 != null) {
            viewOnClickListenerC1203580hQSLJIIIZ2.setNoticeBackgroundColor(C446980Hfs.LIZ(C1745060vVo.LIZ(this), R.color.dr));
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C1250680ieQ.LIZ.getClass();
        if (C1250680ieQ.LJIIJ) {
            return;
        }
        C1250680ieQ.LJIIJ = true;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("profile_attributes", C1250680ieQ.LJIIJJI);
        c2344009Gk.LJIIIIZZ("report_scene", "profile_popup_init");
        c2344009Gk.LIZLLL(jCurrentTimeMillis2, "page_popup_init_cost_time");
        C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.widget.Widget
    public void onDestroy() {
        IProfileMusicTabService iProfileMusicTabService;
        this.LLILLJJLI = true;
        C1256940ioW.LIZ().LIZ = null;
        EventBus.LIZLLL().LJJI(this);
        C1548820qPI.LJIIIIZZ("profile_artist_highlight_guide_click", this);
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager != null && (iProfileMusicTabService = (IProfileMusicTabService) serviceManager.getService(IProfileMusicTabService.class)) != null) {
            iProfileMusicTabService.LJJ();
        }
        this.LLJJJJ.LJ();
        C2238171Cit c2238171CitLJIIJJI = LJIIJJI();
        c2238171CitLJIIJJI.getClass();
        int i = C2187451AjH.LIZ;
        if (C0BXP.LIZ() && c2238171CitLJIIJJI.LIZLLL) {
            C20554315bp c20554315bp = C20554315bp.LIZIZ;
            EnumC20654715s1 enumC20654715s1 = EnumC20654715s1.PROFILE_BANNER;
            c20554315bp.LIZIZ(enumC20654715s1);
            c20554315bp.LJIIL(enumC20654715s1);
        }
        IProfileBannerService iProfileBannerService = (IProfileBannerService) this.LLJJJJJIL.getValue();
        if (iProfileBannerService != null) {
            iProfileBannerService.destroy();
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.popup.ProfileWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJII() {
        int i;
        C1257020ioe c1257020ioe = this.LLJJIJI;
        int i2 = 0;
        if (c1257020ioe == null || !c1257020ioe.LLJJ) {
            return;
        }
        View view = c1257020ioe.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        c1257020ioe.LIZ();
        c1257020ioe.LLJJ = false;
        C1256940ioW c1256940ioWLIZ = C1256940ioW.LIZ();
        SurveyData surveyData = this.LLJJIJI.LLJILJIL;
        if (surveyData != null) {
            i = surveyData.dialogId;
            i2 = surveyData.originId;
        } else {
            i = 0;
        }
        SurveyAnswer surveyAnswer = new SurveyAnswer(3, i, i2);
        c1256940ioWLIZ.getClass();
        C1256940ioW.LIZIZ(surveyAnswer);
    }

    public final ViewOnClickListenerC1203580hQS LJIIIZ() {
        return (ViewOnClickListenerC1203580hQS) this.LLILZ.findViewById(R.id.view_homepage_bottom_toast);
    }

    public final ViewOnClickListenerC1238510iKn LJIIJ() {
        return (ViewOnClickListenerC1238510iKn) this.LLILZ.findViewById(R.id.view_reward_notice);
    }

    public final C2238171Cit LJIIJJI() {
        return (C2238171Cit) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final FrameLayout LJIIL() {
        return (FrameLayout) this.LLJJIII.getValue();
    }

    public final MyProfileGuideViewModel LJIILIIL() {
        return (MyProfileGuideViewModel) this.LLJJJIL.getValue();
    }

    public final void LJIILJJIL() {
        if (this.LLJILJILJ != null) {
            return;
        }
        View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) this.LLJILJIL.getValue());
        this.LLJILJILJ = viewLJLLLL;
        boolean z = C14LC.LJIIIZ;
        C309690CBz.LIZ.getClass();
        int iLIZIZ = C14LC.LIZIZ();
        if (C1585030rLh.LJIILL()) {
            iLIZIZ = 0;
        }
        C0H9H.LIZJ(iLIZIZ, viewLJLLLL);
        View view = this.LLJILJILJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public final boolean LJIILL() {
        MyProfileAbility myProfileAbility = (MyProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LLJIJIL, null), MyProfileAbility.class, null);
        if (myProfileAbility != null) {
            return myProfileAbility.Om();
        }
        return false;
    }

    @Override // com.bytedance.widget.Widget
    public final void onPause() {
        Animation animation;
        Animation animation2;
        View view = this.LLJILJILJ;
        if (view != null && (animation2 = view.getAnimation()) != null) {
            animation2.cancel();
            animation2.reset();
        }
        View view2 = this.LLJJIJIL;
        if (view2 != null && (animation = view2.getAnimation()) != null) {
            animation.cancel();
            animation.reset();
        }
        AnimatorSet animatorSet = this.LLJJJ;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        animatorSet.pause();
    }

    @Override // com.bytedance.widget.Widget
    public void onResume() {
        View view;
        Animation animation;
        View view2 = this.LLJILJILJ;
        if (view2 != null && view2.getVisibility() == 0) {
            LJJIII();
        }
        View view3 = this.LLJJIJIL;
        if (view3 != null && view3.getVisibility() == 0 && (animation = view3.getAnimation()) != null) {
            animation.start();
        }
        AnimatorSet animatorSet = this.LLJJJ;
        if (animatorSet != null && (view = this.LLJJIJIL) != null && view.getVisibility() == 0 && animatorSet.isPaused()) {
            animatorSet.resume();
        }
        LJJIIJ();
    }

    public final void LJJIII() {
        C19EG c19egLIZ = C1745060vVo.LIZ(this);
        LJIILJJIL();
        View view = this.LLJILJILJ;
        if (view == null) {
            return;
        }
        view.setLayerType(2, null);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(c19egLIZ, R.anim.eu);
        animationLoadAnimation.setRepeatMode(2);
        animationLoadAnimation.setRepeatCount(-1);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC1265820j2q(this, 1));
        View view2 = this.LLJILJILJ;
        if (view2 != null) {
            view2.startAnimation(animationLoadAnimation);
        }
    }

    public final void LJJIIJ() {
        ViewOnClickListenerC1238510iKn viewOnClickListenerC1238510iKnLJIIJ;
        ViewOnClickListenerC1238510iKn viewOnClickListenerC1238510iKnLJIIJ2;
        ViewOnClickListenerC1238510iKn viewOnClickListenerC1238510iKnLJIIJ3 = LJIIJ();
        if (viewOnClickListenerC1238510iKnLJIIJ3 == null || viewOnClickListenerC1238510iKnLJIIJ3.getVisibility() != 0) {
            return;
        }
        C1254790il3 c1254790il3LIZ = C1254790il3.LIZ();
        if ((c1254790il3LIZ.LIZJ.getInt("show_bar_time", 0) >= c1254790il3LIZ.LIZIZ) && (viewOnClickListenerC1238510iKnLJIIJ2 = LJIIJ()) != null) {
            C786410Ut5.B1(viewOnClickListenerC1238510iKnLJIIJ2, 8);
        }
        C1254790il3 c1254790il3LIZ2 = C1254790il3.LIZ();
        c1254790il3LIZ2.LIZJ.storeInt("show_bar_time", c1254790il3LIZ2.LIZJ.getInt("show_bar_time", 0) + 1);
        C1254790il3 c1254790il3LIZ3 = C1254790il3.LIZ();
        if (c1254790il3LIZ3.LIZJ.getInt("show_bar_time", 0) < c1254790il3LIZ3.LIZIZ || (viewOnClickListenerC1238510iKnLJIIJ = LJIIJ()) == null) {
            return;
        }
        C786410Ut5.B1(viewOnClickListenerC1238510iKnLJIIJ, 8);
    }

    public static Pair LJIIIIZZ(C443120HZe[] c443120HZeArr) {
        int length = c443120HZeArr.length;
        for (int i = 0; i < length; i++) {
            C443120HZe c443120HZe = c443120HZeArr[i];
            if (((Boolean) c443120HZe.getFirst()).booleanValue() && ((Boolean) ((Function0) c443120HZe.getSecond()).invoke()).booleanValue()) {
                return new Pair(c443120HZe.getThird(), Integer.valueOf(i));
            }
        }
        return new Pair(null, -1);
    }

    public static void LJIJJ(boolean z) {
        Keva repo = Keva.getRepo("account_security_keva_name");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prior_to_safe_info");
        sbLIZ.append('_');
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        repo.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
        C1257420ipI.LIZIZ.postSafeInfoNoticeEvent(z);
    }

    public static boolean LJIJJLI(MyProfileGuideState myProfileGuideState) {
        IAccountUserService iAccountUserService = (IAccountUserService) ServiceManager.get().getService(IAccountUserService.class);
        if (myProfileGuideState.getNeedShowBindPhoneNumberNotice()) {
            C1252550ihR.LIZ.getClass();
            if (C1252550ihR.LJIILJJIL() && !iAccountUserService.LJFF().booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final void LJJIFFI(View view) {
        ViewOnClickListenerC1238510iKn viewOnClickListenerC1238510iKn;
        this.LLJJIJIL = view;
        View view2 = this.LLJJIJIL;
        if (view2 != null) {
            HandlerHook.viewPost(view2, new ARunnableS80S0200000_11(this, view, 30));
        }
        View view3 = this.LLJJIJIL;
        if (!(view3 instanceof ViewOnClickListenerC1203580hQS)) {
            view3 = null;
        }
        if (view3 != null) {
            View viewFindViewById = view3.findViewById(R.id.pcz);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.c5);
            viewFindViewById.setBackground(c384050F3z.LIZ(view3.getContext()));
        }
        View view4 = this.LLJJIJIL;
        if ((view4 instanceof ViewOnClickListenerC1238510iKn) && (viewOnClickListenerC1238510iKn = (ViewOnClickListenerC1238510iKn) view4) != null) {
            LinearLayout noticeBgFromXml = viewOnClickListenerC1238510iKn.getNoticeBgFromXml();
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.c5);
            noticeBgFromXml.setBackground(c384050F3z2.LIZ(viewOnClickListenerC1238510iKn.getContext()));
        }
    }

    public final void LJIJI(int i) {
        if (i == 0) {
            View view = this.LLJILJILJ;
            if (view != null && view.getVisibility() == 0) {
                return;
            }
            LJIILJJIL();
            View view2 = this.LLJILJILJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(i, view2);
                C786410Ut5.Ob(view2, 0.8f);
                C786410Ut5.pc(view2, 0.8f);
                LJJIII();
                return;
            }
            return;
        }
        View view3 = this.LLJILJILJ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(i, view3);
            View view4 = this.LLJILJILJ;
            if (view4 != null) {
                view4.clearAnimation();
            }
        }
    }

    public final boolean LJIL(ProfileState profileState) {
        User curUser;
        if (C10EU.LJIIIIZZ() || !LJIILL()) {
            return false;
        }
        Boolean boolIsPostAwemeEmpty = profileState.isPostAwemeEmpty();
        Boolean bool = Boolean.TRUE;
        if ((!Intrinsics.LJFF(boolIsPostAwemeEmpty, bool) || (curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser()) == null || curUser.getAwemeCount() != 0) && (!C1256020in2.LIZ || !Intrinsics.LJFF(profileState.isPostAwemeEmptyWhenPrivateShow(), bool))) {
            return false;
        }
        C1252550ihR.LIZ.getClass();
        if (!C1252550ihR.LJIILLIIL() || ComplianceServiceProvider.LJFF().LIZJ(1)) {
            return false;
        }
        MTCreativeFeatureService.LIZIZ().LIZ();
        return true;
    }

    public final void LJJ(final ViewOnClickListenerC1203580hQS viewOnClickListenerC1203580hQS) {
        viewOnClickListenerC1203580hQS.setIconImage(R.drawable.cz2);
        viewOnClickListenerC1203580hQS.setTitleText(2131837648);
        final MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = (MyProfileGuideWidgetV2) this;
        viewOnClickListenerC1203580hQS.setOnInternalClickListener(new InterfaceC1203590hQT() { // from class: X.0iog
            @Override // X.InterfaceC1203590hQT
            public final void LIZ() {
                C786410Ut5.D(viewOnClickListenerC1203580hQS, 8);
                C19259110Wf c19259110Wf = C746350TPl.LIZ;
                c19259110Wf.LJI().LJ(Long.valueOf(System.currentTimeMillis()));
                Long lLIZ = c19259110Wf.LJFF().LIZ();
                if (lLIZ != null && lLIZ.longValue() == 0) {
                    c19259110Wf.LJFF().LJ(Long.valueOf(System.currentTimeMillis()));
                }
                myProfileGuideWidgetV2.getClass();
                BaseMyProfileGuideWidget.LJIJJ(false);
            }

            @Override // X.InterfaceC1203590hQT
            public final void LIZIZ() {
                C786410Ut5.D(viewOnClickListenerC1203580hQS, 8);
                BaseMyProfileGuideWidget baseMyProfileGuideWidget = myProfileGuideWidgetV2;
                baseMyProfileGuideWidget.getClass();
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C1745060vVo.LIZ(baseMyProfileGuideWidget), "//webview");
                smartRouteBuildRoute.withParam("url", "https://www.tiktok.com/aweme/inapp/v2/c_feedback");
                smartRouteBuildRoute.withParam("hide_nav_bar", true);
                smartRouteBuildRoute.open();
                C19259110Wf c19259110Wf = C746350TPl.LIZ;
                c19259110Wf.LJI().LJ(Long.valueOf(System.currentTimeMillis()));
                Long lLIZ = c19259110Wf.LJFF().LIZ();
                if (lLIZ != null && lLIZ.longValue() == 0) {
                    c19259110Wf.LJFF().LJ(Long.valueOf(System.currentTimeMillis()));
                }
                myProfileGuideWidgetV2.getClass();
                BaseMyProfileGuideWidget.LJIJJ(false);
            }
        });
        LJJIFFI(viewOnClickListenerC1203580hQS);
        LJIJJ(true);
    }

    public final void LJJI(final ViewOnClickListenerC1238510iKn viewOnClickListenerC1238510iKn) {
        viewOnClickListenerC1238510iKn.setOnInternalClickListener(new InterfaceC1238520iKo() { // from class: X.0il4
            @Override // X.InterfaceC1238520iKo
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1238520iKo
            public final void LIZ() {
                C786410Ut5.B1(viewOnClickListenerC1238510iKn, 8);
                C1254790il3.LIZ().LIZIZ(true);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("banner_type", "coupon_fission");
                c2344009Gk.LJIIIIZZ("banner_name", "tiktok_rewards");
                c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
                c2344009Gk.LJIIIIZZ("click_position", "cross");
                C20684815ws.LJIILLIIL("banner_click", c2344009Gk.LIZ);
            }

            @Override // X.InterfaceC1238520iKo
            public final void LIZIZ() {
                C786410Ut5.B1(viewOnClickListenerC1238510iKn, 8);
                C1254790il3.LIZ().LIZIZ(true);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("banner_type", "coupon_fission");
                c2344009Gk.LJIIIIZZ("banner_name", "tiktok_rewards");
                c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
                c2344009Gk.LJIIIIZZ("click_position", "join");
                C20684815ws.LJIILLIIL("banner_click", c2344009Gk.LIZ);
                BaseMyProfileGuideWidget baseMyProfileGuideWidget = this.LIZ;
                baseMyProfileGuideWidget.getClass();
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C1745060vVo.LIZ(baseMyProfileGuideWidget), "//webview");
                String h5Link = null;
                try {
                    UgAwemeActivitySetting awemeActivitySetting = C0CLW.LIZIZ.LIZ.getAwemeActivitySetting();
                    if (awemeActivitySetting != null) {
                        UgProfileActivityButton profileActivityButton = awemeActivitySetting.getProfileActivityButton();
                        if (profileActivityButton != null) {
                            h5Link = profileActivityButton.getH5Link();
                        }
                    }
                } catch (C316660CbA e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                smartRouteBuildRoute.withParam("url", h5Link);
                smartRouteBuildRoute.withParam("hide_nav_bar", true);
                smartRouteBuildRoute.addFlags(268435456);
                smartRouteBuildRoute.open();
            }
        });
        LJJIFFI(viewOnClickListenerC1238510iKn);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("banner_type", "coupon_fission");
        c2344009Gk.LJIIIIZZ("banner_name", "tiktok_rewards");
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("banner_show", c2344009Gk.LIZ);
    }

    public final void LJJII(final InterfaceC20660615sy interfaceC20660615sy) {
        if (!interfaceC20660615sy.Xu()) {
            LJIILIIL().setState(AFwS283S0000000_35.get$arr$(108));
            return;
        }
        final C19EG c19egLIZIZ = C1388190mED.LIZIZ(C1745060vVo.LIZ(this));
        if (c19egLIZIZ == null) {
            return;
        }
        final C0HKX c0hkx = C0HKX.PROFILE;
        PopupManager.LJIJI(new AbstractC20660115st<TuxPanel>(interfaceC20660615sy, c19egLIZIZ, c0hkx) { // from class: X.0ioU
            public final C19EG LL;
            public final C0HKX LLILLJJLI;
            public final int LLILLL = 10;

            @Override // X.AbstractC20656215sG
            public final boolean canShow() {
                return true;
            }

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return this.LLILLL;
            }

            @Override // com.bytedance.poplayer.IPopupTask
            public final Object showPopup(C688120Qyw c688120Qyw) {
                C0HKW c0hkw = C0HKW.LIZ;
                C19EG c19eg = this.LL;
                C0HKX c0hkx2 = this.LLILLJJLI;
                c0hkw.getClass();
                return C0HKW.LIZ(c19eg, c0hkx2, null, null);
            }

            {
                this.LL = c19egLIZIZ;
                this.LLILLJJLI = c0hkx;
            }
        }, true);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        ServiceManager serviceManager;
        IProfileMusicTabService iProfileMusicTabService;
        if (Intrinsics.LJFF(c262100zr.LIZ, "profile_artist_highlight_guide_click") && (serviceManager = ServiceManager.get()) != null && (iProfileMusicTabService = (IProfileMusicTabService) serviceManager.getService(IProfileMusicTabService.class)) != null) {
            iProfileMusicTabService.LJIILL(c262100zr);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onProfilePageScrolledEvent(C1248780ibM c1248780ibM) {
        ViewOnClickListenerC1238510iKn viewOnClickListenerC1238510iKn = (ViewOnClickListenerC1238510iKn) this.LLILZ.findViewById(R.id.view_ba_growth_notice);
        if (viewOnClickListenerC1238510iKn != null) {
            C786410Ut5.B1(viewOnClickListenerC1238510iKn, 8);
        }
    }

    public BaseMyProfileGuideWidget(ComponentFragment componentFragment, ViewGroup viewGroup) {
        this.LLILZ = viewGroup;
        this.LLJIJIL = componentFragment;
        this.LLJI = "BaseMyProfileGuieWidget";
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJILJIL = C452501pT.LIZ(enumC452301pR, new AwS563S0100000_19(this, 2121));
        this.LLJILLL = C452501pT.LIZ(enumC452301pR, new AwS563S0100000_19(this, 2122));
        this.LLJJ = C452501pT.LIZ(enumC452301pR, new AwS563S0100000_19(this, 2119));
        this.LLJJI = C452501pT.LIZ(enumC452301pR, new AwS563S0100000_19(this, 2124));
        this.LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(viewGroup, 2125));
        this.LLJJIJIIJIL = C452501pT.LIZ(enumC452301pR, new AwS563S0100000_19(this, 2120));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MyProfileGuideViewModel.class);
        AwS420S0200000_19 awS420S0200000_19 = new AwS420S0200000_19(this, c19719912DlLIZ, 110);
        this.LLJJJIL = new WidgetLifecycleAwareLazy(this, awS420S0200000_19, new AwS154S0400000_26(this, awS420S0200000_19, c19719912DlLIZ, AFwS257S0000000_19.get$arr$(353), 14));
        this.LLJJJJ = new C11NJ();
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(371));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2123));
    }
}
