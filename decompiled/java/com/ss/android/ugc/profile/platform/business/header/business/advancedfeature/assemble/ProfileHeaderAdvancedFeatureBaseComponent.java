package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.assemble;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09JN;
import X.C09R3;
import X.C0B9S;
import X.C0QSJ;
import X.C11NJ;
import X.C11NZ;
import X.C1248270iaX;
import X.C1248540iay;
import X.C1248830ibR;
import X.C1248870ibV;
import X.C1248950ibd;
import X.C127G;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C14KI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1701940uOG;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2532609wC;
import X.C2537109wv;
import X.C268330AfP;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C487280J9a;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1248650ib9;
import X.InterfaceC1249220ic4;
import X.InterfaceC2217461Bqa;
import X.InterfaceC487330J9f;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObjectS71S0000000_19;
import Y.ARunnableS119S0100000_19;
import Y.AfS188S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.business.commerce.OrderCenterData;
import com.ss.android.ugc.profile.business.ur.platform.IHeaderRecommendUserCardAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.ProfileHeaderAdvancedFeatureViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileHeaderAdvancedFeatureBaseComponent extends HeaderBaseContainerComponent implements IHeaderAdvancedFeatureAbility, InterfaceC487330J9f {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public Context LLJL;
    public LinearLayout LLJLIL;
    public final Set<String> LLJLILLLLZIIL;
    public final Map<String, Integer> LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public final Map<String, Integer> LLJZ;
    public final List<InterfaceC1248650ib9> LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public int LLLI;
    public ProfileComponents LLLII;
    public List<? extends ProfileComponents> LLLIIII;
    public boolean LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public boolean LLLILZJ;
    public final C01GW LLLILZLLLI;
    public long LLLIZZ;
    public boolean LLLJ;
    public final Map<String, Boolean> LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public int LLLLIILL;
    public int LLLLIILLL;
    public final Map<String, Function1<Boolean, Unit>> LLLLIL;
    public volatile HomePageViewPagerAbility LLLLILI;
    public C127G LLLLJ;
    public InterfaceC665370Q7z LLLLJI;
    public C0QSJ LLLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileHeaderAdvancedFeatureBaseComponent.class, "profileHeaderAdvancedFeatureViewModel", "getProfileHeaderAdvancedFeatureViewModel()Lcom/ss/android/ugc/profile/platform/business/header/business/advancedfeature/base/ProfileHeaderAdvancedFeatureViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ProfileHeaderAdvancedFeatureBaseComponent.class, "homePageViewPagerAbility", "getHomePageViewPagerAbility()Lcom/ss/android/ugc/aweme/base/HomePageViewPagerAbility;", 0);
        c09r3.getClass();
        LLLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public ProfileHeaderAdvancedFeatureBaseComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileHeaderAdvancedFeatureViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS548S0100000_4(c19719912DlLIZ, 382), AFwS257S0000000_19.get$arr$(491), null, true);
        this.LLJLILLLLZIIL = new LinkedHashSet();
        this.LLJLL = new LinkedHashMap();
        this.LLJLLIL = -1;
        this.LLJLLL = true;
        this.LLJZ = new LinkedHashMap();
        this.LLJZIJLIL = new ArrayList();
        this.LLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 381));
        this.LLLF = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2286));
        this.LLLFF = C452501pT.LIZIZ(new AwS548S0100000_4(this, 380));
        this.LLLFZ = true;
        this.LLLIIIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 378));
        this.LLLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2472));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 379));
        this.LLLIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 376));
        this.LLLILZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 377));
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2475));
        this.LLLJIL = new LinkedHashMap();
        this.LLLJL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(546));
        this.LLLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(544));
        this.LLLLII = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(545));
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2473));
        this.LLLLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2474));
        this.LLLLIL = new LinkedHashMap();
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void ip() {
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final View kp(View view, ViewGroup viewGroup) {
        return viewGroup;
    }

    public final boolean Ap() {
        return ((Boolean) this.LLLLIIIILLL.getValue()).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ep() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.assemble.ProfileHeaderAdvancedFeatureBaseComponent.Ep():void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    public final void clearAnimation() {
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            viewGroup.clearAnimation();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        IHeaderRecommendUserCardAbility iHeaderRecommendUserCardAbility;
        super.onCreate();
        Context context = getContext();
        if (context != null) {
            this.LLJL = context;
            C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
            if (c19252910Tv.LIZLLL().LJI().LJI()) {
                Context context2 = this.LLJL;
                if (context2 == null) {
                    context2 = null;
                }
                Activity activityLIZ = C1388190mED.LIZ(context2);
                if (activityLIZ != null) {
                    C487280J9a.LIZ(activityLIZ.hashCode(), this);
                }
            }
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderAdvancedFeatureAbility.class, null, null);
            }
            Context context3 = getContext();
            if (context3 != null) {
                LinearLayout linearLayout = new LinearLayout(context3);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((C268330AfP.LJ() || !Ap()) ? -2 : 0, -2);
                if (C268330AfP.LJ() || !Ap()) {
                    layoutParams.weight = 0.0f;
                } else {
                    layoutParams.weight = 1.0f;
                }
                layoutParams.gravity = zp();
                C786410Ut5.d6(linearLayout, layoutParams);
                linearLayout.setGravity(zp());
                linearLayout.setOrientation(0);
                int iLIZIZ = (C268330AfP.LIZLLL() && C14KI.LJI(linearLayout.getContext())) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) : ((Boolean) C268330AfP.LJFF.getValue()).booleanValue() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)) : C2532609wC.LIZ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                C426750GoL.LJIIL(linearLayout, Integer.valueOf(iLIZIZ), 0, Integer.valueOf(iLIZIZ), 0, 16);
                c19252910Tv.LIZLLL().LJI().LJJLIIIJILLIZJL(linearLayout, null, null);
                this.LLJLIL = linearLayout;
                if (Ap()) {
                    ViewGroup viewGroup = (ViewGroup) this.LLLIL.getValue();
                    if (viewGroup != null) {
                        LinearLayout linearLayout2 = this.LLJLIL;
                        if (linearLayout2 == null) {
                            linearLayout2 = null;
                        }
                        viewGroup.addView(linearLayout2);
                    }
                    ViewGroup viewGroup2 = (ViewGroup) this.LLLIL.getValue();
                    if (viewGroup2 != null) {
                        viewGroup2.addView((View) this.LLLIILIL.getValue());
                    }
                } else {
                    ViewGroup viewGroup3 = this.LLJJIJIIJIL;
                    if (viewGroup3 != null) {
                        LinearLayout linearLayout3 = this.LLJLIL;
                        if (linearLayout3 == null) {
                            linearLayout3 = null;
                        }
                        viewGroup3.addView(linearLayout3);
                    }
                }
            }
            ((C11NJ) this.LLLLII.getValue()).LIZ(((C11NZ) this.LLLL.getValue()).LJJLIIIJLLLLLLLZ(200L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS188S0100000_19(this, 64), new C09JN() { // from class: X.00rd
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ProfileHeaderAdvancedFeatureBaseComponent@c75a.initBehaviorSubject$2");
                    String message = ((Throwable) obj).getMessage();
                    if (message == null) {
                        message = "";
                    }
                    C1720106oR.LIZ("advanced features", message);
                    C1C7U.LIZIZ("ProfileHeaderAdvancedFeatureBaseComponent@c75a.initBehaviorSubject$2");
                }
            }));
            if (Intrinsics.LJFF(Bp(), Boolean.TRUE)) {
                ProfilePlatformViewModel profilePlatformViewModelSo = So();
                if (profilePlatformViewModelSo != null) {
                    profilePlatformViewModelSo.JQ2(new AwS598S0100000_19(this, 472));
                }
            } else {
                ViewGroup viewGroup4 = this.LLJJIJIIJIL;
                if (viewGroup4 != null) {
                    HandlerHook.viewPost(viewGroup4, new ARunnableS119S0100000_19(this, 112));
                }
                ProfilePlatformViewModel profilePlatformViewModelSo2 = So();
                if (profilePlatformViewModelSo2 != null) {
                    profilePlatformViewModelSo2.TQ2(new AwS598S0100000_19(this, 473));
                }
            }
            if (((Boolean) C0B9S.LIZ.getValue()).booleanValue() && !C268330AfP.LJIIIZ() && (iHeaderRecommendUserCardAbility = (IHeaderRecommendUserCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderRecommendUserCardAbility.class, null)) != null && iHeaderRecommendUserCardAbility.LLIIIL()) {
                bj(0);
            }
            ProfilePlatformViewModel profilePlatformViewModelSo3 = So();
            if (profilePlatformViewModelSo3 != null) {
                C736680Sv4.LJIIIIZZ(this, profilePlatformViewModelSo3, new C2217381BqS() { // from class: X.0ibw
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1251350ifV) obj).LLILZLL;
                    }
                }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 238), 4);
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        ((LinkedHashMap) this.LLLJIL).clear();
        super.onPause();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    public final int r5() {
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            return viewGroup.getHeight();
        }
        return 0;
    }

    public final void yp() {
        if (this.LLLLIILLL == this.LLJILJIL.size()) {
            boolean z = this.LLLLIILL == 1;
            Iterator it2 = ((LinkedHashMap) this.LLLLIL).entrySet().iterator();
            while (it2.hasNext()) {
                ((Function1) ((Map.Entry) it2.next()).getValue()).invoke(Boolean.valueOf(z));
            }
        }
    }

    public final int zp() {
        return ((Number) this.LLLJL.getValue()).intValue();
    }

    public final Boolean Bp() {
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null) {
            return Boolean.valueOf(profileBaseAbility.q1());
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLLJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLLJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ProfileHeaderAdvancedFeatureViewModel.class, new AObjectS71S0000000_19(this, 7)}, defaultViewModelProviderFactory);
                    this.LLLLJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        ((C11NJ) this.LLLLII.getValue()).dispose();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IHeaderAdvancedFeatureAbility.class, null);
        }
        ViewGroup viewGroup2 = this.LLJJIJIIJIL;
        ViewParent parent = viewGroup2 != null ? viewGroup2.getParent() : null;
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LLJJIJIIJIL, viewGroup);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Ep();
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC1248970ibf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Hj(com.ss.android.ugc.profile.platform.base.data.ProfileComponents r15) {
        /*
            Method dump skipped, instruction units count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.assemble.ProfileHeaderAdvancedFeatureBaseComponent.Hj(com.ss.android.ugc.profile.platform.base.data.ProfileComponents):void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    public final boolean LG(int i) {
        if (Ap() && this.LLLIIIIL) {
            LinearLayout linearLayout = this.LLJLIL;
            if (linearLayout == null) {
                linearLayout = null;
            }
            if (i == linearLayout.getChildCount() - 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OY1(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.assemble.ProfileHeaderAdvancedFeatureBaseComponent.OY1(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    public final void Sk(float f) {
        Float fValueOf;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.LLJJIJIIJIL;
        if (viewGroup2 != null) {
            fValueOf = Float.valueOf(viewGroup2.getAlpha());
        } else {
            fValueOf = null;
        }
        if (!Intrinsics.LIZLLL(fValueOf, f) && (viewGroup = this.LLJJIJIIJIL) != null) {
            C786410Ut5.R4(f, viewGroup);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    public final void bj(int i) {
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
                layoutParams = null;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.height = i;
                C786410Ut5.W5(viewGroup, layoutParams2);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void dp(List<? extends ProfileComponents> list) {
        boolean z = false;
        if (this.LLJILLL && list != null) {
            Iterator<? extends ProfileComponents> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.LJFF(it2.next().componentId, "advanced_feature_base_item")) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
        }
        super.dp(list);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        ViewGroup c1248830ibR;
        int i;
        int iValueOf;
        int i2;
        Context context = getContext();
        if (context != null) {
            if (Ap()) {
                c1248830ibR = (ViewGroup) this.LLLIL.getValue();
            } else {
                c1248830ibR = new C1248830ibR(context, null, 6);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = zp();
                if (!C2537109wv.LIZJ() && !C268330AfP.LJ()) {
                    i = -8;
                } else {
                    i = 0;
                }
                layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
                if (C268330AfP.LJ()) {
                    i2 = 12;
                } else if (!C2532609wC.LIZ() && C2537109wv.LIZJ()) {
                    i2 = 10;
                } else {
                    iValueOf = 0;
                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(iValueOf));
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1248830ibR);
                    c1248830ibR.setLayoutParams(layoutParams);
                    c1248830ibR.setScrollBarStyle(0);
                }
                iValueOf = Integer.valueOf(i2);
                layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(iValueOf));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1248830ibR);
                c1248830ibR.setLayoutParams(layoutParams);
                c1248830ibR.setScrollBarStyle(0);
            }
            this.LLJJIJIIJIL = c1248830ibR;
            C1248870ibV.LIZJ(c1248830ibR, profileComponentUIConfig, true, false);
            C19252910Tv.LIZIZ.LIZLLL().LJI().LLJJJJLIIL(this.LLJJIJIIJIL, null, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    public final boolean pA1(String str) {
        Integer num = (Integer) ((LinkedHashMap) this.LLJLL).get(str);
        if (num != null) {
            int iIntValue = num.intValue();
            LinearLayout linearLayout = this.LLJLIL;
            if (linearLayout == null) {
                linearLayout = null;
            }
            View childAt = linearLayout.getChildAt(iIntValue);
            if (childAt != null) {
                return childAt.getLocalVisibleRect(new Rect());
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    public final void vE(C1248540iay c1248540iay) {
        ((ArrayList) this.LLJZIJLIL).add(c1248540iay);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    public final void F00(String str, boolean z) {
        ViewGroup viewGroup;
        this.LLJLILLLLZIIL.remove(str);
        if (this.LLJLILLLLZIIL.isEmpty() && (viewGroup = this.LLJJIJIIJIL) != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        Integer num = (Integer) ((LinkedHashMap) this.LLJLL).get(str);
        if (num != null) {
            int iIntValue = num.intValue();
            LinearLayout linearLayout = this.LLJLIL;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                linearLayout = null;
            }
            View childAt = linearLayout.getChildAt(iIntValue);
            if (z) {
                this.LLJLL.remove(str);
                LinearLayout linearLayout3 = this.LLJLIL;
                if (linearLayout3 == null) {
                    linearLayout3 = null;
                }
                C786410Ut5.LJJL(childAt, linearLayout3);
                for (Map.Entry entry : ((LinkedHashMap) this.LLJLL).entrySet()) {
                    Object key = entry.getKey();
                    int iIntValue2 = ((Number) entry.getValue()).intValue();
                    if (!Intrinsics.LJFF(key, str) && iIntValue2 > iIntValue) {
                        this.LLJLL.put((String) key, Integer.valueOf(iIntValue2 - 1));
                    }
                }
            }
            if (childAt != null) {
                C786410Ut5.LJLLLLLL(8, childAt);
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hideFeature, name=");
            sbLIZ.append(str);
            sbLIZ.append(", featureLocation=");
            sbLIZ.append(iIntValue);
            sbLIZ.append(", lastShowOrder=");
            sbLIZ.append(this.LLJLLIL);
            C2188811AlT.LIZIZ(sbLIZ);
            int i2 = this.LLJLLIL;
            if (iIntValue == i2) {
                int i3 = i2 - 1;
                this.LLJLLIL = i3;
                LinearLayout linearLayout4 = this.LLJLIL;
                if (linearLayout4 != null) {
                    linearLayout2 = linearLayout4;
                }
                up(8, linearLayout2.getChildAt(i3));
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    public final void Ur0(int i, String str) {
        TuxIconView tuxIconView;
        Integer num = (Integer) ((LinkedHashMap) this.LLJLL).get(str);
        if (num != null) {
            int iIntValue = num.intValue();
            LinearLayout linearLayout = this.LLJLIL;
            if (linearLayout == null) {
                linearLayout = null;
            }
            View childAt = linearLayout.getChildAt(iIntValue);
            if (childAt != null && (tuxIconView = (TuxIconView) childAt.findViewById(R.id.aiz)) != null) {
                tuxIconView.setIconRes(i);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    public final void Vf0(String str, Function1 function1) {
        this.LLLLIILL++;
        this.LLLLIL.put(str, function1);
        this.LLLLIILLL++;
        yp();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    public final void Vk1(int i, String str) {
        Integer num;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        int i2;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateViewOrder, name=");
        sbLIZ.append(str);
        sbLIZ.append(", newOrder=");
        sbLIZ.append(i);
        sbLIZ.append(", oldOrder=");
        sbLIZ.append(((LinkedHashMap) this.LLJLL).get(str));
        C2188811AlT.LIZIZ(sbLIZ);
        Integer num2 = (Integer) ((LinkedHashMap) this.LLJLL).get(str);
        if ((num2 == null || num2.intValue() != i) && (num = (Integer) ((LinkedHashMap) this.LLJLL).get(str)) != null) {
            int iIntValue = num.intValue();
            LinearLayout linearLayout3 = this.LLJLIL;
            LinearLayout linearLayout4 = null;
            if (linearLayout3 == null) {
                linearLayout = null;
                linearLayout3 = null;
            } else {
                linearLayout = linearLayout3;
            }
            up(0, linearLayout.getChildAt(linearLayout3.getChildCount() - 1));
            LinearLayout linearLayout5 = this.LLJLIL;
            if (linearLayout5 == null) {
                linearLayout5 = null;
            }
            View childAt = linearLayout5.getChildAt(iIntValue);
            if (childAt != null) {
                LinearLayout linearLayout6 = this.LLJLIL;
                if (linearLayout6 == null) {
                    linearLayout6 = null;
                }
                C786410Ut5.LJJLJ(iIntValue, linearLayout6);
                LinearLayout linearLayout7 = this.LLJLIL;
                if (linearLayout7 == null) {
                    linearLayout2 = null;
                    linearLayout7 = null;
                } else {
                    linearLayout2 = linearLayout7;
                }
                linearLayout2.addView(childAt, Math.min(i, linearLayout7.getChildCount()));
                int iMin = Math.min(i, iIntValue);
                int iMax = Math.max(i, iIntValue);
                if (i < iIntValue) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                for (Map.Entry entry : ((LinkedHashMap) this.LLJLL).entrySet()) {
                    Object key = entry.getKey();
                    int iIntValue2 = ((Number) entry.getValue()).intValue();
                    if (iMin <= iIntValue2 && iIntValue2 <= iMax) {
                        this.LLJLL.put((String) key, Integer.valueOf(iIntValue2 + i2));
                    }
                }
                this.LLJLL.put(str, Integer.valueOf(i));
            }
            LinearLayout linearLayout8 = this.LLJLIL;
            if (linearLayout8 != null) {
                linearLayout4 = linearLayout8;
            }
            up(8, linearLayout4.getChildAt(linearLayout4.getChildCount() - 1));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    public final void eW1(String str, String str2) {
        TextView textView;
        Integer num = (Integer) ((LinkedHashMap) this.LLJLL).get(str2);
        if (num != null) {
            int iIntValue = num.intValue();
            LinearLayout linearLayout = this.LLJLIL;
            if (linearLayout == null) {
                linearLayout = null;
            }
            View childAt = linearLayout.getChildAt(iIntValue);
            if (childAt != null && (textView = (TextView) childAt.findViewById(R.id.aj1)) != null) {
                textView.setText(str);
            }
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LJI().LLJJJJLIIL(this.LLJJIJIIJIL, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
        InterfaceC1249220ic4 interfaceC1249220ic4LJI = c19252910Tv.LIZLLL().LJI();
        LinearLayout linearLayout = this.LLJLIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        interfaceC1249220ic4LJI.LJJLIIIJILLIZJL(linearLayout, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void tp(String str, C13IQ<? extends AbstractC738140SxQ> c13iq) {
        this.LLLLIILL--;
        this.LLLLIILLL--;
        this.LLLLIL.remove(str);
        super.tp(str, c13iq);
        yp();
    }

    public final void up(int i, View view) {
        View viewFindViewById;
        if (!Ap() && view != null && (viewFindViewById = view.findViewById(R.id.aiy)) != null) {
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    public final void LJIIIZ(int i, View view, String str) {
        if (str == null) {
            return;
        }
        this.LLJLL.put(str, Integer.valueOf(i));
        for (Map.Entry entry : ((LinkedHashMap) this.LLJLL).entrySet()) {
            Object key = entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            if (!Intrinsics.LJFF(key, str) && iIntValue >= i) {
                this.LLJLL.put((String) key, Integer.valueOf(iIntValue + 1));
            }
        }
        LinearLayout linearLayout = this.LLJLIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        HeaderBaseContainerComponent.bp(this, str, i, view, linearLayout, null, true, 16);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility
    public final void aN2(View view, OrderCenterData orderCenterData, Integer num, Integer num2, Integer num3) {
        String str = "advanced_feature_base_item";
        if (view != null) {
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.aiz);
            OrderCenterData orderCenterData2 = orderCenterData;
            if (tuxIconView != null) {
                orderCenterData2 = orderCenterData2;
                str = "advanced_feature_base_item";
                C1248270iaX.LIZ(tuxIconView, orderCenterData2, str, num, null, null);
            }
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.aj1);
            if (tuxTextView != null) {
                C1248270iaX.LIZJ(tuxTextView, orderCenterData2, str, num2, num3, false, 16);
            }
        }
    }
}
