package com.ss.android.ugc.profile.platform.business.header.business.bio.container;

import X.C01GW;
import X.C0B9R;
import X.C0B9S;
import X.C1248230iaT;
import X.C1248870ibV;
import X.C1248950ibd;
import X.C1388190mED;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C2187701Ajg;
import X.C2532609wC;
import X.C268330AfP;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C487280J9a;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC487330J9f;
import X.ViewTreeObserverOnPreDrawListenerC1265970j35;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.platform.IHeaderRecommendUserCardAbility;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ISignatureAbility;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileHeaderBioBaseComponent extends HeaderBaseContainerComponent implements IHeaderBioAbility, InterfaceC487330J9f {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2506));
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(556));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2507));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2505));

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
    public final void clearAnimation() {
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            viewGroup.clearAnimation();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
    public final int r5() {
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            return viewGroup.getHeight();
        }
        return 0;
    }

    public final LinearLayout up() {
        return (LinearLayout) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        IHeaderRecommendUserCardAbility iHeaderRecommendUserCardAbility;
        Context context;
        Activity activityLIZ;
        super.onCreate();
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI() && (context = getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C487280J9a.LIZ(activityLIZ.hashCode(), this);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderBioAbility.class, null, null);
        }
        if (!((Boolean) C0B9S.LIZ.getValue()).booleanValue() || C268330AfP.LJIIIZ() || (iHeaderRecommendUserCardAbility = (IHeaderRecommendUserCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderRecommendUserCardAbility.class, null)) == null || !iHeaderRecommendUserCardAbility.LLIIIL()) {
            return;
        }
        bj(0);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IHeaderBioAbility.class, null);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        boolean zLJFF;
        ISignatureAbility iSignatureAbility;
        TuxTextView tuxTextViewIg0;
        ViewTreeObserver viewTreeObserver;
        LinearLayout linearLayoutUp;
        ProfilePlatformViewModel profilePlatformViewModelSo;
        User userVQ2;
        ProfileCommonInfo profileCommonInfoWG2;
        UserRelationInfo userRelationInfo;
        dp(profileComponents.components);
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null && (profileCommonInfoWG2 = iProfileBaseAbility.wG2()) != null && (userRelationInfo = profileCommonInfoWG2.getUserRelationInfo()) != null) {
            zLJFF = Intrinsics.LJFF(userRelationInfo.isBlocking(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF || ((profilePlatformViewModelSo = So()) != null && (userVQ2 = profilePlatformViewModelSo.vQ2()) != null && userVQ2.isBlock)) {
            ViewGroup viewGroup = this.LLJJIJIIJIL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
            }
        } else {
            ViewGroup viewGroup2 = this.LLJJIJIIJIL;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(0, viewGroup2);
            }
        }
        if (((Boolean) C0B9R.LIZ.getValue()).booleanValue() && (linearLayoutUp = up()) != null && linearLayoutUp.getChildCount() == 0) {
            LinearLayout linearLayoutUp2 = up();
            if (linearLayoutUp2 != null) {
                C786410Ut5.LJZL(8, linearLayoutUp2);
            }
        } else {
            LinearLayout linearLayoutUp3 = up();
            if (linearLayoutUp3 != null) {
                C786410Ut5.LJZL(0, linearLayoutUp3);
            }
        }
        if (C2532609wC.LIZIZ() && !this.LLJILLL && (iSignatureAbility = (ISignatureAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISignatureAbility.class, null)) != null && (tuxTextViewIg0 = iSignatureAbility.ig0()) != null && (viewTreeObserver = tuxTextViewIg0.getViewTreeObserver()) != null) {
            ViewTreeObserverOnPreDrawListenerC1265970j35 viewTreeObserverOnPreDrawListenerC1265970j35 = new ViewTreeObserverOnPreDrawListenerC1265970j35(tuxTextViewIg0, this, 0);
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1265970j35);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1265970j35, ViewTreeObserver.OnPreDrawListener.class);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c A[PHI: r3
      0x009c: PHI (r3v5 android.view.ViewGroup) = (r3v4 android.view.ViewGroup), (r3v7 android.view.ViewGroup) binds: [B:47:0x009b, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Xu1(android.view.View r7) {
        /*
            r6 = this;
            r4 = 8
            if (r7 == 0) goto L7
            X.C786410Ut5.LJLLLLLL(r4, r7)
        L7:
            boolean r0 = X.C2532609wC.LIZIZ()
            r5 = 0
            if (r0 != 0) goto L8c
            X.01GW r0 = X.C2532609wC.LJII
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8c
            X.01GW r0 = X.C2532609wC.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8c
            if (r7 == 0) goto L8a
            android.view.ViewParent r3 = r7.getParent()
        L30:
            boolean r0 = r3 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L9b
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L36:
            if (r3 == 0) goto L9c
            int r0 = r3.indexOfChild(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L40:
            r2 = 1
            if (r3 == 0) goto L88
            int r0 = r3.getChildCount()
            int r0 = r0 - r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L4c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7d
            if (r3 == 0) goto L86
            int r1 = r3.indexOfChild(r7)
            int r1 = r1 - r2
        L59:
            android.view.View r0 = r3.getChildAt(r1)
            if (r0 == 0) goto L63
            java.lang.Object r5 = r0.getTag()
        L63:
            java.lang.String r0 = "divider"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto L6e
            X.C786410Ut5.LJJLIL(r1, r3)
        L6e:
            if (r3 == 0) goto L7c
            X.C786410Ut5.LJJJLZIJ(r7, r3)
            int r0 = r3.getChildCount()
            if (r0 != 0) goto L7c
            X.C786410Ut5.LJLZ(r4, r3)
        L7c:
            return
        L7d:
            if (r3 == 0) goto L86
            int r0 = r3.indexOfChild(r7)
            int r1 = r0 + 1
            goto L59
        L86:
            r1 = 0
            goto L63
        L88:
            r0 = r5
            goto L4c
        L8a:
            r3 = r5
            goto L30
        L8c:
            if (r7 == 0) goto L99
            android.view.ViewParent r3 = r7.getParent()
        L92:
            boolean r0 = r3 instanceof X.C21532619Oq
            if (r0 == 0) goto L9b
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L36
        L99:
            r3 = r5
            goto L92
        L9b:
            r3 = r5
        L9c:
            r1 = r5
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.bio.container.ProfileHeaderBioBaseComponent.Xu1(android.view.View):void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
    public final void eq2(View view) {
        ViewParent parent;
        LinearLayout linearLayout;
        ViewGroup viewGroup;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        ViewParent parent2 = null;
        if (view != null) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        if ((parent instanceof LinearLayout) && (linearLayout = (LinearLayout) parent) != null && linearLayout.getChildCount() != 0) {
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
                parent2 = linearLayout.getParent();
            }
            if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        int i;
        int i2;
        int iLIZIZ;
        ViewGroup viewGroup;
        Context context = getContext();
        if (context != null) {
            this.LLJJIJIIJIL = new LinearLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout = (LinearLayout) this.LLJJIJIIJIL;
            linearLayout.setOrientation(1);
            if (C268330AfP.LJIIIZ()) {
                i = 8388627;
            } else {
                i = 17;
            }
            linearLayout.setGravity(i);
            C786410Ut5.d6(linearLayout, layoutParams);
            C19252910Tv.LIZIZ.LIZLLL().LJI().LLJL(linearLayout, null, null);
            ViewGroup viewGroup2 = this.LLJJIJIIJIL;
            if (viewGroup2 != null) {
                viewGroup2.addView(up());
            }
            if (C2532609wC.LIZIZ() && (viewGroup = this.LLJJIJIIJIL) != null) {
                viewGroup.addView((View) this.LLJLIL.getValue());
            }
            ViewGroup viewGroup3 = this.LLJJIJIIJIL;
            if (viewGroup3 != null) {
                Integer numValueOf = Integer.valueOf(((C1248230iaT) this.LLJJLIIIJLLLLLLLZ.getValue()).LJIIIIZZ());
                this.LLJJLIIIJLLLLLLLZ.getValue().getClass();
                if (C268330AfP.LIZLLL()) {
                    iLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)) - C1248230iaT.LJIILIIL()) - C1248230iaT.LIZLLL();
                } else {
                    if (((Boolean) C2532609wC.LJI.getValue()).booleanValue()) {
                        i2 = 10;
                    } else {
                        i2 = 0;
                    }
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
                }
                Integer numValueOf2 = Integer.valueOf(iLIZIZ);
                Integer numValueOf3 = Integer.valueOf(((C1248230iaT) this.LLJJLIIIJLLLLLLLZ.getValue()).LJIIIIZZ());
                this.LLJJLIIIJLLLLLLLZ.getValue().getClass();
                C268330AfP.LIZLLL();
                C426750GoL.LJIIIZ(viewGroup3, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
            }
            C1248870ibV.LIZJ(this.LLJJIJIIJIL, profileComponentUIConfig, true, false);
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C19252910Tv.LIZIZ.LIZLLL().LJI().LLJL(this.LLJJIJIIJIL, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
    public final void LJIIIZ(int i, View view, String str) {
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, true, 24);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
    public final void rQ2(int i, View view, String str) {
        HeaderBaseContainerComponent.bp(this, str, i, view, (ViewGroup) this.LLJLIL.getValue(), null, true, 16);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
    public final void tX1(int i, View view, String str) {
        LinearLayout linearLayoutUp;
        LinearLayout linearLayoutUp2;
        HeaderBaseContainerComponent.bp(this, str, i, view, up(), null, true, 16);
        if (((Boolean) C0B9R.LIZ.getValue()).booleanValue() && (linearLayoutUp = up()) != null && linearLayoutUp.getVisibility() == 8 && (linearLayoutUp2 = up()) != null) {
            C786410Ut5.LJZL(0, linearLayoutUp2);
        }
    }
}
