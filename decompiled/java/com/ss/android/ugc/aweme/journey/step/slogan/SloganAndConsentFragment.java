package com.ss.android.ugc.aweme.journey.step.slogan;

import X.AnonymousClass0956;
import X.C05EE;
import X.C05X2;
import X.C0PEM;
import X.C0XQS;
import X.C0XQT;
import X.C0XWE;
import X.C0XXD;
import X.C10H4;
import X.C10NB;
import X.C10NW;
import X.C1295960jpS;
import X.C12ES;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C1514430pVp;
import X.C1619980sG4;
import X.C1848530yCh;
import X.C1911400zq6;
import X.C1911410zq7;
import X.C1911470zqD;
import X.C1911490zqF;
import X.C1912310zrZ;
import X.C1912370zrf;
import X.C1912470zrp;
import X.C1912560zry;
import X.C1912930zsZ;
import X.C1912940zsa;
import X.C1912950zsb;
import X.C1913090zsp;
import X.C1913640zti;
import X.C19233310Mh;
import X.C19233810Mm;
import X.C19249910Sr;
import X.C19252910Tv;
import X.C197039127h;
import X.C19EG;
import X.C1BV9;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2190008i2;
import X.C2190108i3;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C275570Ar5;
import X.C324601Ns;
import X.C418440Gaw;
import X.C420060GdY;
import X.C426750GoL;
import X.C616540OGe;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1911450zqB;
import X.InterfaceC1699660uKa;
import X.InterfaceC1912570zrz;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS162S0100000_28;
import Y.ALAdapterS23S0100000_28;
import Y.AObserverS230S0100000_28;
import Y.ARunnableS102S0100000_2;
import Y.ARunnableS128S0100000_28;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAutoLoginService;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.NewUserJourneyContainerActivity;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.DeviceConsentDisclaimerService;
import com.ss.android.ugc.aweme.compliance.consent.deviceconsent.DeviceConsentDisclaimerServiceImpl;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.aweme.journey.step.slogan.QuickLoginViewModel;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class SloganAndConsentFragment extends SloganFragment implements InterfaceC1912570zrz {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiOjHELIOSs2OGs/JSA0KStiGiM8LyQiCCE3CyoiOio9PAM+KCg+LSs4";
    public ConstraintLayout LLJILLL;
    public C197039127h LLJJ;
    public ConstraintLayout LLJJI;
    public LinearLayout LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public C1390410mHn LLJJJ;
    public C1295960jpS LLJJJIL;
    public ConstraintLayout LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public ConstraintLayout LLJJL;
    public C197039127h LLJJLIIIJLLLLLLLZ;
    public ConstraintLayout LLJL;
    public LinearLayout LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public C1390410mHn LLJLLL;
    public C1295960jpS LLJZ;
    public ConstraintLayout LLJZIJLIL;
    public TuxTextView LLL;
    public FrameLayout LLLF;
    public C1913640zti LLLFF;
    public TuxSheet LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public QuickLoginViewModel LLLII;
    public boolean LLLIIII;
    public AnonymousClass0956 LLLIIIIL;
    public final C19233310Mh LLLIIIL;
    public final String LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;

    @Override // X.InterfaceC1912570zrz
    public final void hE() {
        this.LLLIIII = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("thread: ");
        sbLIZ.append(C786410Ut5.u3());
        C1911410zq7.LIZ("SloganAndConsentFrag", C2188811AlT.LIZIZ(sbLIZ));
        if (gS() != EnumC1911450zqB.DEFAULT) {
            AnonymousClass0956 anonymousClass0956 = this.LLLIIIIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLLIIIIL = null;
            this.LLLI = false;
        }
    }

    public static EnumC1911450zqB gS() {
        return (EnumC1911450zqB) C1911470zqD.LIZIZ.getValue();
    }

    @Override // X.InterfaceC1912570zrz
    public final void EM() {
        QuickLoginViewModel quickLoginViewModel;
        C1911410zq7.LIZ("SloganAndConsentFrag", "skipSloganAndConsentPage");
        this.LLLIIII = true;
        if (!this.LLLIILIL || (quickLoginViewModel = this.LLLII) == null) {
            return;
        }
        if (!((Boolean) quickLoginViewModel.LL.getValue()).booleanValue() || quickLoginViewModel.LLILLL) {
            C1911410zq7.LIZ("SloganAndConsentFrag", "dismiss by animationEnded");
            iS();
        }
    }

    public final void hS() {
        C1911410zq7.LIZ("SloganAndConsentFrag", "dismissDualBallLoading");
        this.LLLIL = true;
        C1390410mHn c1390410mHn = this.LLJLLL;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 8);
            c1390410mHn.LIZLLL();
        }
    }

    public final void iS() {
        if (Intrinsics.LJFF(this.LLLIIIL.LJFF(), "revamp")) {
            C1911490zqF.LIZ.getClass();
            if (!C1911490zqF.LIZ()) {
                C1911410zq7.LIZ("SloganAndConsentFrag", "dismiss Slogan with Animation");
                if (this.LLL != null) {
                    C420060GdY.LIZ(this.LLJZIJLIL, this.LLJL, false, AFwS217S0000000_28.get$arr$(244), 16);
                    return;
                } else {
                    C1911410zq7.LIZLLL("SloganAndConsentFrag", "skip animation due to detached");
                    return;
                }
            }
        }
        C1911410zq7.LIZ("SloganAndConsentFrag", "dismiss Slogan immediately");
        C1912370zrf.LIZ.getClass();
        C1912370zrf.LIZIZ();
    }

    public final C1295960jpS kS() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uy3) : null;
            this.LLJJJIL = (C1295960jpS) viewFindViewById;
        }
        return (C1295960jpS) viewFindViewById;
    }

    public final AnimatorSet mS() {
        ObjectAnimator objectAnimatorOfFloat;
        C1390410mHn c1390410mHn = this.LLJLLL;
        ObjectAnimator objectAnimatorOfFloat2 = null;
        if (c1390410mHn == null) {
            return null;
        }
        C786410Ut5.LLLZZIL(c1390410mHn, this.LLLIL ? 8 : 0);
        c1390410mHn.LIZJ();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1390410mHn);
        c1390410mHn.setScaleX(0.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1390410mHn);
        c1390410mHn.setScaleY(0.0f);
        C1390410mHn c1390410mHn2 = this.LLJLLL;
        if (c1390410mHn2 != null) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1390410mHn2, "scaleX", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJ());
        } else {
            objectAnimatorOfFloat = null;
        }
        C1390410mHn c1390410mHn3 = this.LLJLLL;
        if (c1390410mHn3 != null) {
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1390410mHn3, "scaleY", 0.0f, 1.0f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJ());
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }

    public final boolean oS() {
        QuickLoginViewModel quickLoginViewModel;
        if ((this.LLLIIII || !ComplianceServiceProvider.LJJIII().LJ()) && (quickLoginViewModel = this.LLLII) != null) {
            return !((Boolean) quickLoginViewModel.LL.getValue()).booleanValue() || quickLoginViewModel.LLILLL;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C1911410zq7.LIZ("SloganAndConsentFrag", "onPause()");
        super.onPause();
        QuickLoginViewModel quickLoginViewModel = this.LLLII;
        if (quickLoginViewModel != null && quickLoginViewModel.LLILZ) {
            quickLoginViewModel.LLILZIL = true;
        }
        C1911490zqF.LIZ.getClass();
        if (C1911490zqF.LIZ()) {
            AnonymousClass0956 anonymousClass0956 = this.LLLIIIIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLLIIIIL = null;
        }
    }

    public final void rS() {
        ObjectAnimator objectAnimatorOfFloat;
        C1911410zq7.LIZ("SloganAndConsentFrag", "enter startAnimation");
        if (!isAdded() || !isVisible() || this.LLJJL == null) {
            C1911410zq7.LIZLLL("SloganAndConsentFrag", "startAnimation skipped");
            return;
        }
        C1911410zq7.LIZ("SloganAndConsentFrag", "startAnimation proceeded");
        if (Intrinsics.LJFF(this.LLLIIIL.LJFF(), "revamp_skip")) {
            C1912370zrf.LIZ.getClass();
            C1912370zrf.LIZLLL.observe(this, new AObserverS230S0100000_28(this, 32));
            return;
        }
        C1911410zq7.LIZ("SloganAndConsentFrag", "enter showSloganPageWithAnimation");
        ConstraintLayout constraintLayout = this.LLJJL;
        if (constraintLayout != null) {
            C786410Ut5.T4(constraintLayout, 1.0f);
        }
        TuxTextView tuxTextView = this.LLL;
        if (tuxTextView != null) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView, "translationY", 0.0f, C418440Gaw.LIZIZ(-50));
            objectAnimatorOfFloat.setDuration(800L);
            objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator(3.0f));
        } else {
            objectAnimatorOfFloat = null;
        }
        AnimatorSet animatorSetMS = mS();
        if (objectAnimatorOfFloat == null || animatorSetMS == null) {
            C1911410zq7.LIZLLL("SloganAndConsentFrag", "skip start animation part 1");
            return;
        }
        C1911410zq7.LIZ("SloganAndConsentFrag", "proceed showSloganPageWithAnimation");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new ALAdapterS23S0100000_28(this, 4));
        animatorSet.playTogether(objectAnimatorOfFloat, animatorSetMS);
        animatorSet.start();
    }

    public SloganAndConsentFragment() {
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SLOGAN_AND_CONSENT_PAGE;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZJ(c1912940zsaLIZ != null ? c1912940zsaLIZ.LJII : null);
        this.LLLI = true;
        C19233810Mm.LIZ.getClass();
        this.LLLIIIL = (C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class);
        this.LLLIIL = "multilanguage_animation";
    }

    public final void cS() {
        IAccountService iAccountService;
        ILoginService iLoginServiceLIZJ;
        MutableLiveData platform;
        LiveData<C0XXD> autoLoginState;
        AccountUserService accountUserServiceLJIIJ;
        if (gS() != EnumC1911450zqB.DEFAULT) {
            qS();
            return;
        }
        final QuickLoginViewModel quickLoginViewModel = this.LLLII;
        boolean z = false;
        if (quickLoginViewModel != null) {
            C19EG activity = getActivity();
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 279);
            quickLoginViewModel.LLILLL = true;
            if (activity != null && ((Boolean) quickLoginViewModel.LL.getValue()).booleanValue() && ((iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null)) == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || !accountUserServiceLJIIJ.isLogin())) {
                IAutoLoginService iAutoLoginService = (IAutoLoginService) PluggableExtentionKt.pluggableSpi$default(IAutoLoginService.class, false, false, false, 14, null);
                Object value = null;
                if (((iAutoLoginService == null || (autoLoginState = iAutoLoginService.getAutoLoginState()) == null) ? null : autoLoginState.getValue()) != C0XXD.IN_PROGRESS) {
                    quickLoginViewModel.LLILZLL = awS572S0100000_28;
                    quickLoginViewModel.LLILZ = true;
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(quickLoginViewModel), C0PEM.LIZJ, null, new C05EE(quickLoginViewModel, null), 2);
                    if (((Boolean) quickLoginViewModel.LLILLJJLI.getValue()).booleanValue()) {
                        z = false;
                        IPrevLoginPlatformService iPrevLoginPlatformService = (IPrevLoginPlatformService) PluggableExtentionKt.pluggableSpi$default(IPrevLoginPlatformService.class, false, false, false, 14, null);
                        if (iPrevLoginPlatformService != null && (platform = iPrevLoginPlatformService.getPlatform()) != null) {
                            value = platform.getValue();
                        }
                        if (Intrinsics.LJFF(value, "google") || Intrinsics.LJFF(value, "google_onetap")) {
                            ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) PluggableExtentionKt.pluggableSpi$default(ICredentialManagerService.class, false, false, false, 14, null);
                            if (iCredentialManagerService != null) {
                                C05X2 c05x2 = C05X2.GOOGLE_ONETAP;
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("autoselect_supported", true);
                                bundle.putBoolean("is_from_new_user_journey", true);
                                iCredentialManagerService.LJIL(activity, c05x2, new C1BV9("nuj_quick_login", "nuj_quick_login_autologin", "", "", "", bundle), new InterfaceC1699660uKa() { // from class: X.0zra
                                    @Override // X.InterfaceC1699660uKa
                                    public final void onFailure(Throwable th) {
                                        QuickLoginViewModel quickLoginViewModel2 = quickLoginViewModel;
                                        quickLoginViewModel2.LLILZ = false;
                                        Function0<Unit> function0 = quickLoginViewModel2.LLILZLL;
                                        if (function0 != null) {
                                            function0.invoke();
                                        }
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    IOneClickLoginService iOneClickLoginService = (IOneClickLoginService) PluggableExtentionKt.pluggableSpi$default(IOneClickLoginService.class, z, z, z, 14, null);
                    if (iOneClickLoginService != null && !iOneClickLoginService.LJIIJ(C0XWE.THE_ONE)) {
                        ICredentialManagerService iCredentialManagerService2 = (ICredentialManagerService) PluggableExtentionKt.pluggableSpi$default(ICredentialManagerService.class, z, z, z, 14, null);
                        if (iCredentialManagerService2 != null) {
                            C05X2 c05x22 = ((Number) C275570Ar5.LIZ.getValue()).intValue() == 1 ? C05X2.PASSKEY : C05X2.PASSKEY_AND_GOOGLE_ONETAP;
                            Bundle bundle2 = new Bundle();
                            bundle2.putBoolean("is_from_new_user_journey", true);
                            iCredentialManagerService2.LJIL(activity, c05x22, new C1BV9("nuj_quick_login", "nuj_quick_login_credman", "", "", "", bundle2), new InterfaceC1699660uKa() { // from class: X.0zra
                                @Override // X.InterfaceC1699660uKa
                                public final void onFailure(Throwable th) {
                                    QuickLoginViewModel quickLoginViewModel2 = quickLoginViewModel;
                                    quickLoginViewModel2.LLILZ = false;
                                    Function0<Unit> function0 = quickLoginViewModel2.LLILZLL;
                                    if (function0 != null) {
                                        function0.invoke();
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                    IAccountService iAccountService2 = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, z, z, z, 14, null);
                    if (iAccountService2 == null || (iLoginServiceLIZJ = iAccountService2.LIZJ()) == null) {
                        return;
                    }
                    C0XQS c0xqs = new C0XQS();
                    c0xqs.LIZ = activity;
                    c0xqs.LIZIZ = "nuj_quick_login";
                    c0xqs.LIZJ = "nuj_quick_login_theone";
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean("skip_login_popups", true);
                    bundle3.putBoolean("is_from_new_user_journey", true);
                    bundle3.putBoolean("do_not_style_buttons_nuj", true);
                    bundle3.putBoolean("is_fullscreen_dialog", z);
                    bundle3.putBoolean("is_skippable_dialog", true);
                    c0xqs.LIZLLL = bundle3;
                    iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
                    return;
                }
            }
        }
        qS();
    }

    public final void dS() {
        DeviceConsentDisclaimerService deviceConsentDisclaimerServiceLIZJ = DeviceConsentDisclaimerServiceImpl.LIZJ();
        TuxTextView tuxTextView = this.LLJLLIL;
        if (tuxTextView != null) {
            C19EG activity = getActivity();
            Integer numLIZJ = activity != null ? C1308910kAL.LIZJ(R.attr.a1j, activity) : null;
            C19EG activity2 = getActivity();
            tuxTextView.setText(deviceConsentDisclaimerServiceLIZJ.LIZIZ(numLIZJ, activity2 != null ? C1308910kAL.LIZJ(R.attr.a1i, activity2) : null, false));
        }
        C197039127h c197039127h = this.LLJJLIIIJLLLLLLLZ;
        if (c197039127h != null) {
            c197039127h.setText(deviceConsentDisclaimerServiceLIZJ.LIZ());
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        DialogFragment dialogFragment;
        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragmentLJJJJZI = fragmentManager != null ? fragmentManager.LJJJJZI("journey_kr_consent_sheet") : null;
        if (((fragmentLJJJJZI instanceof TuxSheet) && (dialogFragment = (DialogFragment) fragmentLJJJJZI) != null) || (dialogFragment = this.LLLFFI) != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        this.LLLFFI = null;
        this.LLLFF = null;
        this.LLLF = null;
        C1295960jpS c1295960jpSKS = kS();
        if (c1295960jpSKS != null) {
            c1295960jpSKS.cancelAnimation();
        }
        this.LLJJJIL = null;
        super.onDestroyView();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroyView: ");
        sbLIZ.append(this);
        C1911410zq7.LIZ("SloganAndConsentFrag", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SloganAndConsentFragment.class.getName());
        }
        C1911410zq7.LIZ("SloganAndConsentFrag", "onResume()");
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SLOGAN_AND_CONSENT_PAGE;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZJ(c1912940zsaLIZ != null ? c1912940zsaLIZ.LJI : null);
        super.onResume();
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZIZ(c1912940zsaLIZ2 != null ? c1912940zsaLIZ2.LJI : null);
        C1912940zsa c1912940zsaLIZ3 = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZIZ(c1912940zsaLIZ3 != null ? c1912940zsaLIZ3.LJII : null);
        C1912930zsZ.LIZLLL(c10nw);
        QuickLoginViewModel quickLoginViewModel = this.LLLII;
        if (quickLoginViewModel != null && quickLoginViewModel.LLILZ) {
            quickLoginViewModel.LLILZ = false;
            quickLoginViewModel.LLILZIL = false;
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS102S0100000_2(quickLoginViewModel, 45));
        }
        C1911490zqF.LIZ.getClass();
        if (C1911490zqF.LIZ() && this.LLLI) {
            AnonymousClass0956 anonymousClass0956 = this.LLLIIIIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLLIIIIL = null;
            this.LLLIIIIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C2190008i2(this, null), 2);
        }
    }

    public final void qS() {
        if (oS()) {
            iS();
            return;
        }
        C1912370zrf.LIZ.getClass();
        if (C1912370zrf.LJ()) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C2190108i3(this, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public final String RR() {
        return this.LLLIIL;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment
    public final View WR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C786410Ut5.Td(layoutInflater, R.layout.czh, viewGroup, false);
    }

    public final void nS(View view, C1913640zti c1913640zti) {
        if (this.LLLFZ) {
            return;
        }
        this.LLLFZ = true;
        if (c1913640zti != null && !c1913640zti.LJIIJJI) {
            c1913640zti.LJIIJJI = true;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
            C20684815ws.LJIILLIIL("register_terms_show", c2344009Gk.LIZ);
            C1913640zti.LJFF("terms-of-service");
            C1913640zti.LJFF("terms-and-conditions-kr");
            C1913640zti.LJFF("consent-to-collect-and-user-of-your-personal-information-for-marketing-purpose");
        }
        if (view != null) {
            C1848530yCh.LIZLLL(view, "page_slogan_consent", null);
        }
        C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("ui_type", this.LLLIIL);
        c19249910Sr.LIZIZ(c2344009Gk2, "show_consent_box");
    }

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1912950zsb c1912950zsb;
        boolean z;
        long j;
        C10NB c10nb;
        IMainService iMainService;
        C10H4 c10h4;
        C1912560zry c1912560zryLJFF;
        Intent intent;
        ObjectAnimator objectAnimatorOfFloat;
        String storeRegionUpperCase;
        String string;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SLOGAN_AND_CONSENT_PAGE;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912950zsb c1912950zsb2 = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LJFF;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        super.onViewCreated(view, bundle);
        this.LLLFZ = false;
        this.LLLII = (QuickLoginViewModel) ViewModelProviders.of(this).get(QuickLoginViewModel.class);
        C1912370zrf.LIZ.getClass();
        C1912370zrf.LIZIZ = new WeakReference<>(this);
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.tqy);
            } else {
                viewFindViewById = null;
            }
            this.LLJILLL = (ConstraintLayout) viewFindViewById;
        }
        this.LLJJL = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = this.LLJJ;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.epd);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJJ = (C197039127h) viewFindViewById2;
        }
        this.LLJJLIIIJLLLLLLLZ = (C197039127h) viewFindViewById2;
        View viewFindViewById3 = this.LLJJI;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.epf);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJJI = (ConstraintLayout) viewFindViewById3;
        }
        this.LLJL = (ConstraintLayout) viewFindViewById3;
        View viewFindViewById4 = this.LLJJIII;
        if (viewFindViewById4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById4 = view5.findViewById(R.id.epl);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJJIII = (LinearLayout) viewFindViewById4;
        }
        this.LLJLIL = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = this.LLJJIJI;
        if (viewFindViewById5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById5 = view6.findViewById(R.id.epk);
            } else {
                viewFindViewById5 = null;
            }
            this.LLJJIJI = (TuxTextView) viewFindViewById5;
        }
        this.LLJLILLLLZIIL = (TuxTextView) viewFindViewById5;
        View viewFindViewById6 = this.LLJJIJIIJIL;
        if (viewFindViewById6 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById6 = view7.findViewById(R.id.epi);
            } else {
                viewFindViewById6 = null;
            }
            this.LLJJIJIIJIL = (TuxTextView) viewFindViewById6;
        }
        this.LLJLL = (TuxTextView) viewFindViewById6;
        View viewFindViewById7 = this.LLJJIJIL;
        if (viewFindViewById7 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById7 = view8.findViewById(R.id.epm);
            } else {
                viewFindViewById7 = null;
            }
            this.LLJJIJIL = (TuxTextView) viewFindViewById7;
        }
        this.LLJLLIL = (TuxTextView) viewFindViewById7;
        View viewFindViewById8 = this.LLJJJ;
        if (viewFindViewById8 == null) {
            View view9 = getView();
            if (view9 != null) {
                viewFindViewById8 = view9.findViewById(R.id.nle);
            } else {
                viewFindViewById8 = null;
            }
            this.LLJJJ = (C1390410mHn) viewFindViewById8;
        }
        this.LLJLLL = (C1390410mHn) viewFindViewById8;
        this.LLJZ = kS();
        View viewFindViewById9 = this.LLJJJJ;
        if (viewFindViewById9 == null) {
            View view10 = getView();
            if (view10 != null) {
                viewFindViewById9 = view10.findViewById(R.id.vkp);
            } else {
                viewFindViewById9 = null;
            }
            this.LLJJJJ = (ConstraintLayout) viewFindViewById9;
        }
        this.LLJZIJLIL = (ConstraintLayout) viewFindViewById9;
        View viewFindViewById10 = this.LLJJJJJIL;
        if (viewFindViewById10 == null) {
            View view11 = getView();
            if (view11 != null) {
                viewFindViewById10 = view11.findViewById(R.id.vks);
            } else {
                viewFindViewById10 = null;
            }
            this.LLJJJJJIL = (TuxTextView) viewFindViewById10;
        }
        this.LLL = (TuxTextView) viewFindViewById10;
        View viewFindViewById11 = this.LLJJJJLIIL;
        if (viewFindViewById11 == null) {
            View view12 = getView();
            if (view12 != null) {
                viewFindViewById11 = view12.findViewById(R.id.m3h);
            } else {
                viewFindViewById11 = null;
            }
            this.LLJJJJLIIL = (FrameLayout) viewFindViewById11;
        }
        this.LLLF = (FrameLayout) viewFindViewById11;
        Integer num = 0;
        if (C1911400zq6.LIZ(getContext())) {
            TuxTextView tuxTextView = this.LLL;
            if (tuxTextView != null) {
                C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf((int) C12ES.LIZJ(32.0f, tuxTextView.getContext())), num, Integer.valueOf((int) C12ES.LIZJ(32.0f, tuxTextView.getContext())), num, false, 16);
                tuxTextView.setTuxFont(13);
            }
            C197039127h c197039127h = this.LLJJLIIIJLLLLLLLZ;
            if (c197039127h != null) {
                C426750GoL.LJIIL(c197039127h, Integer.valueOf((int) C12ES.LIZJ(20.0f, c197039127h.getContext())), Integer.valueOf((int) C12ES.LIZJ(8.0f, c197039127h.getContext())), Integer.valueOf((int) C12ES.LIZJ(20.0f, c197039127h.getContext())), Integer.valueOf((int) C12ES.LIZJ(8.0f, c197039127h.getContext())), 16);
                num = num;
                C426750GoL.LJIIIZ(c197039127h, num, Integer.valueOf((int) C12ES.LIZJ(8.0f, c197039127h.getContext())), num, Integer.valueOf((int) C12ES.LIZJ(8.0f, c197039127h.getContext())), false, 16);
            }
        }
        TuxTextView tuxTextView2 = this.LLL;
        if (tuxTextView2 != null) {
            IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
            if (iAccountService != null) {
                storeRegionUpperCase = iAccountService.getStoreRegionUpperCase();
            } else {
                storeRegionUpperCase = null;
            }
            if (Intrinsics.LJFF(storeRegionUpperCase, "US")) {
                string = getString(2131838040);
            } else {
                string = getString(2131838459);
            }
            tuxTextView2.setText(string);
        }
        dS();
        TuxTextView tuxTextView3 = this.LLJLLIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
            tuxTextView3.setHighlightColor(0);
        }
        C197039127h c197039127h2 = this.LLJJLIIIJLLLLLLLZ;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS162S0100000_28(this, 88));
        }
        TuxTextView tuxTextView4 = this.LLJLLIL;
        if (tuxTextView4 != null) {
            C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LIZLLL(tuxTextView4);
        }
        C197039127h c197039127h3 = this.LLJJLIIIJLLLLLLLZ;
        if (c197039127h3 != null) {
            C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LIZLLL(c197039127h3);
        }
        if (C1911400zq6.LIZ(getContext())) {
            C1295960jpS c1295960jpS = this.LLJZ;
            if (c1295960jpS != null) {
                C426750GoL.LJIIIZ(c1295960jpS, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, null, false, 29);
            }
            C197039127h c197039127h4 = this.LLJJLIIIJLLLLLLLZ;
            if (c197039127h4 != null) {
                C426750GoL.LJIIL(c197039127h4, Integer.valueOf((int) C12ES.LIZJ(14.0f, c197039127h4.getContext())), Integer.valueOf((int) C12ES.LIZJ(8.0f, c197039127h4.getContext())), Integer.valueOf((int) C12ES.LIZJ(14.0f, c197039127h4.getContext())), Integer.valueOf((int) C12ES.LIZJ(8.0f, c197039127h4.getContext())), 16);
                C426750GoL.LJIIIZ(c197039127h4, num, Integer.valueOf((int) C12ES.LIZJ(8.0f, c197039127h4.getContext())), num, num, false, 16);
            }
            TuxTextView tuxTextView5 = this.LLJLLIL;
            if (tuxTextView5 != null) {
                C426750GoL.LJIIL(tuxTextView5, num, Integer.valueOf((int) C12ES.LIZJ(8.0f, tuxTextView5.getContext())), num, Integer.valueOf((int) C12ES.LIZJ(8.0f, tuxTextView5.getContext())), 16);
                C426750GoL.LJIIIZ(tuxTextView5, num, num, num, num, false, 16);
            }
            TuxTextView tuxTextView6 = this.LLJLILLLLZIIL;
            if (tuxTextView6 != null) {
                tuxTextView6.setTuxFont(13);
            }
            TuxTextView tuxTextView7 = this.LLJLL;
            if (tuxTextView7 != null) {
                tuxTextView7.setTuxFont(51);
                C426750GoL.LJIIIZ(tuxTextView7, null, Integer.valueOf((int) C12ES.LIZJ(8.0f, tuxTextView7.getContext())), null, null, false, 29);
            }
        }
        if (Intrinsics.LJFF(this.LLLIIIL.LJFF(), "revamp_skip")) {
            AnimatorSet animatorSetMS = mS();
            C1390410mHn c1390410mHn = this.LLJLLL;
            if (c1390410mHn != null) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1390410mHn, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setStartDelay(500L);
                objectAnimatorOfFloat.setDuration(200L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            } else {
                objectAnimatorOfFloat = null;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(500L);
            animatorSet.playTogether(objectAnimatorOfFloat, animatorSetMS);
            animatorSet.start();
        }
        C19EG activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null && intent.getBooleanExtra("redirected_from_deeplink", false)) {
            z = true;
        } else {
            z = false;
        }
        long j2 = 1000;
        if (!z) {
            j = Mp4ScreenVideoLoadTimeout.CONTROL;
        } else {
            j = 1000;
        }
        C1912470zrp c1912470zrpOR = NUJComponentFragment.OR();
        if (c1912470zrpOR != null && (c10h4 = c1912470zrpOR.LIZ) != null && (c1912560zryLJFF = c10h4.LJFF()) != null) {
            c10nb = c1912560zryLJFF.LJ;
        } else {
            c10nb = null;
        }
        C1912310zrZ.LIZ = c10nb;
        if (!C1912310zrZ.LIZ()) {
            j2 = j;
        }
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            j2 = 0;
        }
        C19EG activity2 = getActivity();
        if (activity2 != null && !(activity2 instanceof NewUserJourneyActivity) && !(activity2 instanceof NewUserJourneyContainerActivity) && (iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null)) != null && iMainService.isNUJSingleActivityExpHit(activity2)) {
            C1911410zq7.LIZ("SloganAndConsentFrag", "single-activity NUJ: bypass MainActivity onStop wait");
            ConstraintLayout constraintLayout = this.LLJJL;
            if (constraintLayout != null) {
                HandlerHook.viewPost(constraintLayout, new ARunnableS128S0100000_28(this, 39));
            }
        } else {
            C1913090zsp c1913090zsp = C1913090zsp.LIZ;
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 280);
            Long lValueOf = Long.valueOf(j2);
            c1913090zsp.getClass();
            if (C1913090zsp.LJIIJ) {
                awS572S0100000_28.invoke();
            } else {
                C1913090zsp.LJIIL = awS572S0100000_28;
                if (lValueOf != null) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C324601Ns(lValueOf.longValue(), lValueOf, null), 3);
                }
            }
        }
        bS(true);
        NR(null);
        SloganFragment.aS();
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LJFF;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
    }
}
