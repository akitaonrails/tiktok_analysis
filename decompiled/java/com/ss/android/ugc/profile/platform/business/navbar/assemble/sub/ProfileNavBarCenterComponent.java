package com.ss.android.ugc.profile.platform.business.navbar.assemble.sub;

import X.C01GW;
import X.C1249540ica;
import X.C1260280itu;
import X.C1308910kAL;
import X.C13LE;
import X.C1558520qew;
import X.C1720106oR;
import X.C19252910Tv;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2537109wv;
import X.C268330AfP;
import X.C287560BOw;
import X.C300150Bpd;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1249130ibv;
import X.InterfaceC1260330itz;
import X.ViewOnLayoutChangeListenerC1265890j2x;
import Y.AAListenerS330S0100000_19;
import Y.ARunnableS88S0200000_19;
import Y.ATListenerS452S0100000_19;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.profile.business.cd.IMenuAbility;
import com.ss.android.ugc.profile.business.profile.ui.v2.MineProfileAbility;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.ability.IUserNameAbility;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarCenterComponent;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarCenterAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavBarCenterComponent extends ProfileNavBarBaseComponent {
    public static boolean LLLIIII;
    public float LLJZ;
    public View LLJZIJLIL;
    public int LLLFF;
    public int LLLFFI;
    public boolean LLLFZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2539));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2538));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new AwS563S0100000_19(this, 2534));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2541));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2536));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2537));
    public int LLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(112));
    public final Rect LLLF = new Rect();
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2535));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2540));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("nav_bar_base_item", C13LE.LIZ(NavbarBaseUIComponent.class), null, -1, false);
    }

    public final boolean ip() {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        return c19252910Tv.LIZLLL().LJI().LLLII() || c19252910Tv.LIZLLL().LJI().LJI();
    }

    public final void hp() {
        Integer numLIZJ;
        View viewFindViewById = cp().findViewById(R.id.p1k);
        this.LLJZIJLIL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(4, viewFindViewById);
        }
        LLLIIII = false;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("profile_nav_bar_color_op", true) || C268330AfP.LJIIIZ() || C300150Bpd.LIZ()) {
            Context context = getContext();
            this.LLLFFI = (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) == null) ? 0 : numLIZJ.intValue();
            cp().setNavBackground(Color.argb(ip() ? 255 : 0, Color.red(this.LLLFFI), Color.green(this.LLLFFI), Color.blue(this.LLLFFI)));
        }
        cp().getGlobalVisibleRect(this.LLLF);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        ProfilePlatformViewModel profilePlatformViewModelSo;
        super.onCreate();
        if (C2537109wv.LJIIIIZZ() || C268330AfP.LJIIIZ()) {
            hp();
            cp().setOnTouchListener(new ATListenerS452S0100000_19(this, 15));
            ((Animator) this.LLLI.getValue()).addListener(new AAListenerS330S0100000_19(this, 14));
            ((Animator) this.LLLII.getValue()).addListener(new AAListenerS330S0100000_19(this, 15));
            if (!this.LLJILLL && (profilePlatformViewModelSo = So()) != null) {
                profilePlatformViewModelSo.EQ2(new AwS598S0100000_19(this, 852));
            }
            C1260280itu c1260280ituZp = null;
            if (this.LLJILLL) {
                MineProfileAbility mineProfileAbility = (MineProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MineProfileAbility.class, null);
                if (mineProfileAbility != null) {
                    c1260280ituZp = mineProfileAbility.Zp();
                }
            } else {
                UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
                if (userProfileAbility != null) {
                    c1260280ituZp = userProfileAbility.Zp();
                }
            }
            if (!C268330AfP.LJIIIZ()) {
                HandlerHook.viewPost(cp(), new ARunnableS88S0200000_19(c1260280ituZp, this, 29));
            }
            if (c1260280ituZp != null) {
                c1260280ituZp.LJ(new InterfaceC1260330itz() { // from class: X.0icX
                    @Override // X.InterfaceC1260330itz
                    public final boolean onScrollEnd() {
                        return false;
                    }

                    @Override // X.InterfaceC1260330itz
                    public final void onScrolled(float f, float f2) {
                    }

                    @Override // X.InterfaceC1260330itz
                    public final void onScroll(int i, int i2) {
                        Integer numValueOf;
                        View viewFindViewById;
                        TuxTextView tuxTextViewNx;
                        View view;
                        int i3;
                        if (!this.LL.ip()) {
                            ProfileNavBarCenterComponent profileNavBarCenterComponent = this.LL;
                            profileNavBarCenterComponent.getClass();
                            if (!C268330AfP.LJIIIZ() && profileNavBarCenterComponent.getContext() != null) {
                                try {
                                    int i4 = profileNavBarCenterComponent.LLLFF;
                                    if (i >= i4) {
                                        i3 = 255;
                                    } else {
                                        i3 = (int) ((i / i4) * 255);
                                    }
                                    if (i <= i4 || (((((ColorDrawable) ((C1CRB) profileNavBarCenterComponent.cp().findViewById(R.id.p1z)).getBackground()).getColor() >> 24) & 255) < 255 && i > profileNavBarCenterComponent.LLLFF)) {
                                        profileNavBarCenterComponent.cp().setNavBackground(Color.argb(i3, Color.red(profileNavBarCenterComponent.LLLFFI), Color.green(profileNavBarCenterComponent.LLLFFI), Color.blue(profileNavBarCenterComponent.LLLFFI)));
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    int i5 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("handleNavbarAlpha e: ");
                                    sbLIZ.append(th.getCause());
                                    sbLIZ.append(", message: ");
                                    sbLIZ.append(th.getMessage());
                                    sbLIZ.append(", isAnimViewShown: ");
                                    sbLIZ.append(profileNavBarCenterComponent.LLLFZ);
                                    sbLIZ.append(" currentY: ");
                                    sbLIZ.append(i);
                                    C1720106oR.LIZ("ProfileNavBarCenterComponent", C2188811AlT.LIZIZ(sbLIZ));
                                }
                            }
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("isAnimViewShown: ");
                        sbLIZ2.append(this.LL.LLLFZ);
                        sbLIZ2.append(", offSetY: ");
                        sbLIZ2.append(this.LL.LLJZ);
                        sbLIZ2.append(", nickNameVisible: ");
                        View view2 = this.LL.LLJZIJLIL;
                        Integer numValueOf2 = null;
                        if (view2 != null) {
                            numValueOf = Integer.valueOf(view2.getVisibility());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ2.append(numValueOf);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        ProfileNavBarCenterComponent profileNavBarCenterComponent2 = this.LL;
                        if (profileNavBarCenterComponent2.LLLFZ ? i - profileNavBarCenterComponent2.LLJZ < 0.0f : i - profileNavBarCenterComponent2.LLJZ > 0.0f) {
                            ProfileNavBarCenterComponent profileNavBarCenterComponent3 = this.LL;
                            profileNavBarCenterComponent3.getClass();
                            try {
                                IUserNameAbility iUserNameAbility = (IUserNameAbility) C1558520qew.LIZ(C1558520qew.LJIIL(profileNavBarCenterComponent3), IUserNameAbility.class, null);
                                if (iUserNameAbility != null) {
                                    tuxTextViewNx = iUserNameAbility.nx();
                                } else {
                                    tuxTextViewNx = null;
                                }
                                Rect rect = new Rect();
                                if (((Boolean) C283650B9v.LIZ.getValue()).booleanValue() && Build.VERSION.SDK_INT > 23 && (view = profileNavBarCenterComponent3.LLJZIJLIL) != null) {
                                    view.forceHasOverlappingRendering(false);
                                }
                                profileNavBarCenterComponent3.cp().getGlobalVisibleRect(profileNavBarCenterComponent3.LLLF);
                                if (tuxTextViewNx != null) {
                                    tuxTextViewNx.getGlobalVisibleRect(rect);
                                }
                                int i6 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("navbarRec.bottom: ");
                                sbLIZ3.append(profileNavBarCenterComponent3.LLLF.bottom);
                                sbLIZ3.append(", userNameViewRec.bottom: ");
                                sbLIZ3.append(rect.bottom);
                                sbLIZ3.append(", currentY: ");
                                sbLIZ3.append(i);
                                sbLIZ3.append(", maxY: ");
                                sbLIZ3.append(i2);
                                C1720106oR.LJI("ProfileNavBarCenterComponent", C2188811AlT.LIZIZ(sbLIZ3));
                                if ((profileNavBarCenterComponent3.LLLF.bottom >= rect.bottom || (C299890BpD.LIZ() && i == i2)) && !profileNavBarCenterComponent3.LLLFZ) {
                                    C1720106oR.LJI("ProfileNavBarCenterComponent", "isAnimViewShown set true");
                                    profileNavBarCenterComponent3.LLLFZ = true;
                                    ProfileNavBarCenterComponent.LLLIIII = true;
                                    INavbarCenterAbility iNavbarCenterAbility = (INavbarCenterAbility) profileNavBarCenterComponent3.LLJLILLLLZIIL.getValue();
                                    if (iNavbarCenterAbility != null) {
                                        iNavbarCenterAbility.ih2(true);
                                    }
                                    ((ValueAnimator) profileNavBarCenterComponent3.LLLI.getValue()).cancel();
                                    ((ValueAnimator) profileNavBarCenterComponent3.LLLII.getValue()).start();
                                    IMenuAbility iMenuAbility = (IMenuAbility) profileNavBarCenterComponent3.LLJLLL.getValue();
                                    if (iMenuAbility != null) {
                                        iMenuAbility.xK1();
                                    }
                                } else if (profileNavBarCenterComponent3.LLLF.bottom < rect.bottom && profileNavBarCenterComponent3.LLLFZ) {
                                    C1720106oR.LJI("ProfileNavBarCenterComponent", "isAnimViewShown set false");
                                    profileNavBarCenterComponent3.LLLFZ = false;
                                    ProfileNavBarCenterComponent.LLLIIII = false;
                                    INavbarCenterAbility iNavbarCenterAbility2 = (INavbarCenterAbility) profileNavBarCenterComponent3.LLJLILLLLZIIL.getValue();
                                    if (iNavbarCenterAbility2 != null) {
                                        iNavbarCenterAbility2.ih2(false);
                                    }
                                    ((ValueAnimator) profileNavBarCenterComponent3.LLLII.getValue()).cancel();
                                    ((ValueAnimator) profileNavBarCenterComponent3.LLLI.getValue()).start();
                                } else if (profileNavBarCenterComponent3.LLLFZ && i == 0) {
                                    C1720106oR.LJI("ProfileNavBarCenterComponent", "isAnimViewShown set false");
                                    profileNavBarCenterComponent3.LLLFZ = false;
                                    ProfileNavBarCenterComponent.LLLIIII = false;
                                    INavbarCenterAbility iNavbarCenterAbility3 = (INavbarCenterAbility) profileNavBarCenterComponent3.LLJLILLLLZIIL.getValue();
                                    if (iNavbarCenterAbility3 != null) {
                                        iNavbarCenterAbility3.ih2(false);
                                    }
                                    ((ValueAnimator) profileNavBarCenterComponent3.LLLII.getValue()).cancel();
                                    ((ValueAnimator) profileNavBarCenterComponent3.LLLI.getValue()).start();
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                TuxNavBar tuxNavBarCp = profileNavBarCenterComponent3.cp();
                                if (tuxNavBarCp != null && (viewFindViewById = tuxNavBarCp.findViewById(R.id.p1k)) != null) {
                                    numValueOf2 = Integer.valueOf(viewFindViewById.getLayerType());
                                }
                                int i7 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("handleNavbarCenterAnimation e: ");
                                sbLIZ4.append(th2.getCause());
                                sbLIZ4.append(", message: ");
                                sbLIZ4.append(th2.getMessage());
                                sbLIZ4.append(", isAnimViewShown: ");
                                sbLIZ4.append(profileNavBarCenterComponent3.LLLFZ);
                                sbLIZ4.append(" currentY: ");
                                sbLIZ4.append(i);
                                sbLIZ4.append(", layerType: ");
                                sbLIZ4.append(numValueOf2);
                                C1720106oR.LIZ("ProfileNavBarCenterComponent", C2188811AlT.LIZIZ(sbLIZ4));
                            }
                        }
                        this.LL.LLJZ = i;
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarBaseComponent, com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void HU1(Integer num) {
        int iLIZIZ;
        int iLIZIZ2;
        if (num != null && num.intValue() > 0) {
            iLIZIZ = num.intValue();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(112));
        }
        this.LLL = iLIZIZ;
        View viewCP = null;
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null) {
            viewCP = iProfileBaseAbility.cP();
        }
        int height = this.LLL - cp().getHeight();
        if (viewCP != null) {
            iLIZIZ2 = viewCP.getPaddingTop();
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        }
        this.LLLFF = height + iLIZIZ2;
        if (ip()) {
            this.LLLFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileNavBarCenterComponent", "notifyAvatarHeight : " + num);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarBaseComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        UI1(true, false);
    }

    public static int ep(int i, ViewGroup viewGroup) {
        int width = 0;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null && (childAt.getVisibility() == 0 || childAt.getVisibility() == 4)) {
                width += childAt.getWidth();
            }
        }
        return width;
    }

    public static void kp(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int width = viewGroup.getWidth();
        int width2 = viewGroup2.getWidth();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCenterView startAreaView.width=");
        sbLIZ.append(width);
        sbLIZ.append(", endAreaView.width=");
        sbLIZ.append(width2);
        C1720106oR.LJI("ProfileNavBarCenterComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (width2 == width) {
            C1720106oR.LJI("ProfileNavBarCenterComponent", "updateCenterView null calculateEndWidth equal calculateStartWidth");
            return;
        }
        int childCount = viewGroup.getChildCount();
        int childCount2 = viewGroup2.getChildCount();
        int iEp = ep(childCount, viewGroup);
        int iEp2 = ep(childCount2, viewGroup2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateCenterView startChildWidth ");
        sbLIZ2.append(iEp);
        sbLIZ2.append(", endChildWidth ");
        sbLIZ2.append(iEp2);
        C1720106oR.LJI("ProfileNavBarCenterComponent", C2188811AlT.LIZIZ(sbLIZ2));
        ViewGroup.LayoutParams layoutParams = null;
        if (iEp == iEp2) {
            if (width > width2) {
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = width2;
                    layoutParams = layoutParams2;
                }
                C786410Ut5.X5(layoutParams, viewGroup);
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = viewGroup2.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = width;
                layoutParams = layoutParams3;
            }
            C786410Ut5.X5(layoutParams, viewGroup2);
            return;
        }
        if (iEp2 > iEp) {
            ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.width = width2;
                layoutParams = layoutParams4;
            }
            C786410Ut5.X5(layoutParams, viewGroup);
            return;
        }
        ViewGroup.LayoutParams layoutParams5 = viewGroup2.getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.width = width;
            layoutParams = layoutParams5;
        }
        C786410Ut5.X5(layoutParams, viewGroup2);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarBaseComponent, com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void UI1(final boolean z, boolean z2) {
        final ViewGroup viewGroup;
        final int iSH;
        ViewGroup viewGroupCp;
        View viewD00;
        ViewGroup viewGroup2;
        View viewD002;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRootActionsUpdated isManualUpdate=");
        sbLIZ.append(z);
        sbLIZ.append(", isMyProfile=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(", isHitFollowExp=");
        sbLIZ.append(C1249540ica.LIZ);
        C1720106oR.LJI("ProfileNavBarCenterComponent", C2188811AlT.LIZIZ(sbLIZ));
        View viewD003 = null;
        ViewGroup viewGroup3 = null;
        if (C1249540ica.LIZ && !this.LLJILLL) {
            INavBarActionAbility iNavBarActionAbility = (INavBarActionAbility) this.LLJLIL.getValue();
            if (iNavBarActionAbility != null) {
                viewD00 = iNavBarActionAbility.d00(EnumC1249130ibv.START_AREA);
            } else {
                viewD00 = null;
            }
            if (viewD00 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewD00;
            } else {
                viewGroup2 = null;
            }
            INavBarActionAbility iNavBarActionAbility2 = (INavBarActionAbility) this.LLJLIL.getValue();
            if (iNavBarActionAbility2 != null) {
                viewD002 = iNavBarActionAbility2.d00(EnumC1249130ibv.END_AREA);
            } else {
                viewD002 = null;
            }
            if (viewD002 instanceof ViewGroup) {
                viewGroup3 = (ViewGroup) viewD002;
            }
            if (viewGroup2 == null) {
                C1720106oR.LJI("ProfileNavBarCenterComponent", "alignLeftAndRightWidth startAreaView is null");
                return;
            }
            if (viewGroup3 == null) {
                C1720106oR.LJI("ProfileNavBarCenterComponent", "alignLeftAndRightWidth endAreaView is null");
                return;
            } else if (!z2) {
                cp().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1265890j2x(this, viewGroup2, viewGroup3, 1));
                return;
            } else {
                kp(viewGroup2, viewGroup3);
                return;
            }
        }
        if (((Boolean) this.LLJL.getValue()).booleanValue()) {
            INavBarActionAbility iNavBarActionAbility3 = (INavBarActionAbility) this.LLJLIL.getValue();
            if (iNavBarActionAbility3 != null) {
                viewD003 = iNavBarActionAbility3.d00(EnumC1249130ibv.CENTER_AREA);
            }
            if ((viewD003 instanceof ViewGroup) && (viewGroup = (ViewGroup) viewD003) != null) {
                INavbarCenterAbility iNavbarCenterAbility = (INavbarCenterAbility) this.LLJLILLLLZIIL.getValue();
                if (iNavbarCenterAbility != null) {
                    iSH = iNavbarCenterAbility.SH();
                } else {
                    iSH = 0;
                }
                if (((Boolean) C287560BOw.LIZ.getValue()).booleanValue()) {
                    viewGroupCp = cp();
                } else {
                    viewGroupCp = viewGroup;
                }
                viewGroupCp.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0icO
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        View viewD004;
                        ViewGroup viewGroup4;
                        View viewD005;
                        ViewGroup viewGroup5;
                        INavbarBaseAbility iNavbarBaseAbility;
                        C1249430icP c1249430icPSr2;
                        Integer num;
                        C1249430icP c1249430icPSr22;
                        Integer num2;
                        int childCount;
                        view.removeOnLayoutChangeListener(this);
                        SettingsManager.LIZLLL().getClass();
                        int iIntValue = 0;
                        if (!SettingsManager.LIZ("profile_nav_bar_right_padding_fix", true)) {
                            String str = this.LL.assemTagInternal;
                            if (str == null) {
                                str = "";
                            }
                            if (C1248890ibX.LIZ(str)) {
                                C426750GoL.LJIIL(view, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, 16);
                            }
                        }
                        INavBarActionAbility iNavBarActionAbility4 = (INavBarActionAbility) this.LL.LLJLIL.getValue();
                        ViewGroup.LayoutParams layoutParams = null;
                        if (iNavBarActionAbility4 != null) {
                            viewD004 = iNavBarActionAbility4.d00(EnumC1249130ibv.START_AREA);
                        } else {
                            viewD004 = null;
                        }
                        if ((viewD004 instanceof ViewGroup) && (viewGroup4 = (ViewGroup) viewD004) != null) {
                            INavBarActionAbility iNavBarActionAbility5 = (INavBarActionAbility) this.LL.LLJLIL.getValue();
                            if (iNavBarActionAbility5 != null) {
                                viewD005 = iNavBarActionAbility5.d00(EnumC1249130ibv.END_AREA);
                            } else {
                                viewD005 = null;
                            }
                            if ((viewD005 instanceof ViewGroup) && (viewGroup5 = (ViewGroup) viewD005) != null && (iNavbarBaseAbility = (INavbarBaseAbility) this.LL.LLJLL.getValue()) != null && (c1249430icPSr2 = iNavbarBaseAbility.Sr2()) != null && (num = c1249430icPSr2.LIZ) != null) {
                                int iIntValue2 = num.intValue();
                                INavbarBaseAbility iNavbarBaseAbility2 = (INavbarBaseAbility) this.LL.LLJLLIL.getValue();
                                if (iNavbarBaseAbility2 != null && (c1249430icPSr22 = iNavbarBaseAbility2.Sr2()) != null && (num2 = c1249430icPSr22.LIZ) != null) {
                                    int iIntValue3 = num2.intValue();
                                    if (z) {
                                        childCount = 2;
                                    } else {
                                        childCount = viewGroup5.getChildCount();
                                    }
                                    int i10 = childCount * iIntValue3;
                                    int childCount2 = viewGroup4.getChildCount() * iIntValue2;
                                    if (i10 != childCount2) {
                                        if (iSH == 1) {
                                            C1077410e8x c1077410e8x = (C1077410e8x) new C1077420e8y(viewGroup, 15).iterator();
                                            if (c1077410e8x.hasNext()) {
                                                Integer numValueOf = Integer.valueOf(((View) c1077410e8x.next()).getMeasuredWidth());
                                                while (c1077410e8x.hasNext()) {
                                                    Integer numValueOf2 = Integer.valueOf(((View) c1077410e8x.next()).getMeasuredWidth());
                                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                                        numValueOf = numValueOf2;
                                                    }
                                                }
                                                if (numValueOf != null) {
                                                    iIntValue = numValueOf.intValue();
                                                }
                                            }
                                            int i11 = C2187451AjH.LIZ;
                                            C1720106oR.LJI("ProfileNavBarCenterComponent", "forcedCenter with FORCED_CENTER_WIDTH_HOLDER, centerWidth=" + iIntValue);
                                            int screenWidth = ScreenUtils.getScreenWidth(this.LL.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                                            if (screenWidth - (Math.max(i10, childCount2) * 2) < iIntValue) {
                                                C1720106oR.LJI("ProfileNavBarCenterComponent", "forcedCenter with FORCED_CENTER_WIDTH_HOLDER, no enough space left for centerView");
                                                int i12 = -2;
                                                if (i10 > childCount2) {
                                                    ViewGroup.LayoutParams layoutParams2 = viewGroup4.getLayoutParams();
                                                    if (layoutParams2 != null) {
                                                        int i13 = (screenWidth - iIntValue) - i10;
                                                        if (i13 > 0) {
                                                            i12 = i13;
                                                        }
                                                        layoutParams2.width = i12;
                                                        layoutParams = layoutParams2;
                                                    }
                                                    C786410Ut5.X5(layoutParams, viewGroup4);
                                                    return;
                                                }
                                                ViewGroup.LayoutParams layoutParams3 = viewGroup5.getLayoutParams();
                                                if (layoutParams3 != null) {
                                                    int i14 = (screenWidth - iIntValue) - childCount2;
                                                    if (i14 > 0) {
                                                        i12 = i14;
                                                    }
                                                    layoutParams3.width = i12;
                                                    layoutParams = layoutParams3;
                                                }
                                                C786410Ut5.X5(layoutParams, viewGroup5);
                                                return;
                                            }
                                        }
                                        int i15 = C2187451AjH.LIZ;
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("forcedCenter anyway, startWidth=");
                                        sbLIZ2.append(childCount2);
                                        sbLIZ2.append(", endAWidth=");
                                        sbLIZ2.append(i10);
                                        C1720106oR.LJI("ProfileNavBarCenterComponent", C2188811AlT.LIZIZ(sbLIZ2));
                                        if (i10 > childCount2) {
                                            ViewGroup.LayoutParams layoutParams4 = viewGroup4.getLayoutParams();
                                            if (layoutParams4 != null) {
                                                layoutParams4.width = i10;
                                                layoutParams = layoutParams4;
                                            }
                                            C786410Ut5.X5(layoutParams, viewGroup4);
                                        } else {
                                            ViewGroup.LayoutParams layoutParams5 = viewGroup5.getLayoutParams();
                                            if (layoutParams5 != null) {
                                                layoutParams5.width = childCount2;
                                                layoutParams = layoutParams5;
                                            }
                                            C786410Ut5.X5(layoutParams, viewGroup5);
                                        }
                                        if (childCount2 > i10) {
                                            if (childCount == 1) {
                                                if (((Boolean) C287560BOw.LIZ.getValue()).booleanValue()) {
                                                    ((LinearLayout) viewGroup5).setGravity(8388629);
                                                    return;
                                                } else {
                                                    viewGroup5.setLayoutDirection(1);
                                                    return;
                                                }
                                            }
                                            int childCount3 = (viewGroup4.getChildCount() - viewGroup5.getChildCount()) * iIntValue3;
                                            if (viewGroup5.getLayoutParams().width > childCount3) {
                                                C426750GoL.LJIIL(viewGroup5, Integer.valueOf(childCount3), 0, 0, 0, 16);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }
    }
}
