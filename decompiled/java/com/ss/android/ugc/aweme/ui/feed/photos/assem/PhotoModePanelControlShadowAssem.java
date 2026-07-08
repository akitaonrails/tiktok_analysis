package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C01GW;
import X.C0SDV;
import X.C0SP9;
import X.C13LE;
import X.C19252910Tv;
import X.C19659111vp;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC665370Q7z;
import X.InterfaceC704110Rjd;
import X.InterfaceC710220RtU;
import X.InterfaceC737790Swr;
import X.ViewOnLayoutChangeListenerC738740SyO;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.feed.model.AdCarouselColorInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModePanelControlShadowAssem extends BaseCellContentComponent<PhotoModePanelControlShadowAssem> implements InterfaceC704110Rjd, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLLF = 0;
    public View LLJLLIL;
    public View LLJLLL;
    public final PhotoModePanelControlShadowAssem LLJJJJLIIL = this;
    public final C01GW LLJJL = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(519));
    public final int LLJJLIIIJLLLLLLLZ = R.id.qe_;
    public final int LLJL = R.id.qed;
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1027));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1025));
    public final C630740Ooa LLJLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1023));
    public final ViewOnLayoutChangeListenerC738740SyO LLJZ = new ViewOnLayoutChangeListenerC738740SyO(this, 3);
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1026));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1024));

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC704110Rjd
    public final void ab() {
        View viewFindViewById;
        Context context;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C724270Sb3 c724270Sb3 = this.LLJI;
        View view = null;
        if (!op((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null))) {
            mp();
            return;
        }
        if (this.LLJLLIL == null && Bo()) {
            View viewFindViewById2 = LJJIJL().findViewById(R.id.i8r);
            if (viewFindViewById2 != null) {
                view = viewFindViewById2;
                this.LLJLLIL = view;
                viewFindViewById = LJJIJL().findViewById(R.id.i8q);
                this.LLJLLL = viewFindViewById;
                context = getContext();
                if (viewFindViewById != null && context != null) {
                    C19659111vp c19659111vp = new C19659111vp();
                    c19659111vp.LIZ = C418440Gaw.LIZIZ(100);
                    c19659111vp.LIZLLL = C418440Gaw.LIZIZ(60);
                    c19659111vp.LJFF = 1174405120;
                    viewFindViewById.setBackground(c19659111vp.LIZ(context));
                }
            } else {
                Context context2 = getContext();
                if (context2 != null) {
                    viewFindViewById2 = C786410Ut5.Sd(R.layout.d7_, C786410Ut5.ne(context2), null);
                    View viewLJJIJL = LJJIJL();
                    if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null && viewFindViewById2 != null && !Intrinsics.LJFF(viewFindViewById2.getParent(), viewGroup)) {
                        if (viewFindViewById2.getParent() != null) {
                            ViewParent parent = viewFindViewById2.getParent();
                            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                                C786410Ut5.LJJJLZIJ(viewFindViewById2, viewGroup2);
                            }
                        }
                        viewGroup.addView(viewFindViewById2, 0);
                    }
                    view = viewFindViewById2;
                }
                this.LLJLLIL = view;
                viewFindViewById = LJJIJL().findViewById(R.id.i8q);
                this.LLJLLL = viewFindViewById;
                context = getContext();
                if (viewFindViewById != null) {
                    C19659111vp c19659111vp2 = new C19659111vp();
                    c19659111vp2.LIZ = C418440Gaw.LIZIZ(100);
                    c19659111vp2.LIZLLL = C418440Gaw.LIZIZ(60);
                    c19659111vp2.LJFF = 1174405120;
                    viewFindViewById.setBackground(c19659111vp2.LIZ(context));
                }
            }
        }
        ISlideIndicatorAbility iSlideIndicatorAbilityKp = kp();
        if (iSlideIndicatorAbilityKp != null && iSlideIndicatorAbilityKp.isVisible()) {
            ISlideIndicatorAbility iSlideIndicatorAbilityKp2 = kp();
            if (iSlideIndicatorAbilityKp2 != null) {
                iSlideIndicatorAbilityKp2.Mc(this.LLJJLIIIJLLLLLLLZ, this.LLJZ);
            }
            View view2 = this.LLJLLIL;
            if (view2 != null) {
                view2.addOnLayoutChangeListener((View.OnLayoutChangeListener) this.LLJZIJLIL.getValue());
            }
            ep();
            ISlideIndicatorAbility iSlideIndicatorAbilityKp3 = kp();
            if (iSlideIndicatorAbilityKp3 != null) {
                iSlideIndicatorAbilityKp3.zi();
                return;
            }
            return;
        }
        BottomSlideIndicatorAbility bottomSlideIndicatorAbilityIp = ip();
        if (bottomSlideIndicatorAbilityIp == null || !bottomSlideIndicatorAbilityIp.isVisible()) {
            return;
        }
        BottomSlideIndicatorAbility bottomSlideIndicatorAbilityIp2 = ip();
        if (bottomSlideIndicatorAbilityIp2 != null) {
            bottomSlideIndicatorAbilityIp2.Mc(R.id.qec, (View.OnLayoutChangeListener) this.LLL.getValue());
        }
        View view3 = this.LLJLLIL;
        if (view3 != null) {
            view3.addOnLayoutChangeListener((View.OnLayoutChangeListener) this.LLJZIJLIL.getValue());
        }
        hp();
        BottomSlideIndicatorAbility bottomSlideIndicatorAbilityIp3 = ip();
        if (bottomSlideIndicatorAbilityIp3 != null) {
            bottomSlideIndicatorAbilityIp3.zi();
        }
    }

    public final BottomSlideIndicatorAbility ip() {
        return (BottomSlideIndicatorAbility) this.LLJLL.getValue();
    }

    public final ISlideIndicatorAbility kp() {
        return (ISlideIndicatorAbility) this.LLJLIL.getValue();
    }

    public final void mp() {
        if (this.LLJLLIL == null) {
            return;
        }
        I6(false);
        ISlideIndicatorAbility iSlideIndicatorAbilityKp = kp();
        if (iSlideIndicatorAbilityKp != null) {
            iSlideIndicatorAbilityKp.z7();
        }
        BottomSlideIndicatorAbility bottomSlideIndicatorAbilityIp = ip();
        if (bottomSlideIndicatorAbilityIp != null) {
            bottomSlideIndicatorAbilityIp.z7();
        }
        lp();
    }

    public final void ep() {
        C0SDV c0sdvL2;
        ISlideIndicatorAbility iSlideIndicatorAbilityKp;
        C0SDV c0sdvL22;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ISlideIndicatorAbility iSlideIndicatorAbilityKp2 = kp();
        if (iSlideIndicatorAbilityKp2 == null || (c0sdvL2 = iSlideIndicatorAbilityKp2.l2(this.LLJJLIIIJLLLLLLLZ)) == null || (iSlideIndicatorAbilityKp = kp()) == null || (c0sdvL22 = iSlideIndicatorAbilityKp.l2(this.LLJL)) == null || c0sdvL2.LIZ <= 0 || c0sdvL2.LJ <= 0) {
            return;
        }
        View view = this.LLJLLIL;
        ViewGroup.LayoutParams layoutParams2 = view != null ? view.getLayoutParams() : null;
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.width = c0sdvL2.LIZ;
            marginLayoutParams.height = c0sdvL2.LIZIZ;
            marginLayoutParams.topMargin = c0sdvL2.LJ;
            View view2 = this.LLJLLIL;
            if (view2 != null) {
                C786410Ut5.W5(view2, marginLayoutParams);
            }
            View view3 = this.LLJLLIL;
            if (view3 != null) {
                C786410Ut5.T4(view3, 1.0f);
            }
        }
        View view4 = this.LLJLLL;
        if (view4 != null && (layoutParams = view4.getLayoutParams()) != null) {
            ISlideIndicatorAbility iSlideIndicatorAbilityKp3 = kp();
            int iNg = iSlideIndicatorAbilityKp3 != null ? iSlideIndicatorAbilityKp3.Ng() : (c0sdvL22.LIZ - c0sdvL22.LIZJ) - c0sdvL22.LIZLLL;
            if (iNg != layoutParams.width) {
                layoutParams.width = iNg;
                View view5 = this.LLJLLL;
                if (view5 != null) {
                    C786410Ut5.W5(view5, layoutParams);
                }
            }
        }
        I6(true);
    }

    public final void hp() {
        C0SDV c0sdvL2;
        BottomSlideIndicatorAbility bottomSlideIndicatorAbilityIp = ip();
        if (bottomSlideIndicatorAbilityIp == null || (c0sdvL2 = bottomSlideIndicatorAbilityIp.l2(this.LLJL)) == null) {
            return;
        }
        View view = this.LLJLLL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = c0sdvL2.LIZ;
            C786410Ut5.W5(view, layoutParams);
        }
        View view2 = this.LLJLLIL;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLFF().LIZ() ? 10 : 49)));
            marginLayoutParams.width = -1;
            marginLayoutParams.height = c0sdvL2.LIZIZ + (iLIZIZ * 2);
            BottomSlideIndicatorAbility bottomSlideIndicatorAbilityIp2 = ip();
            marginLayoutParams.topMargin = (bottomSlideIndicatorAbilityIp2 != null ? bottomSlideIndicatorAbilityIp2.di() : 0) - iLIZIZ;
            C786410Ut5.W5(view2, marginLayoutParams);
        }
        I6(true);
    }

    public final void lp() {
        ISlideIndicatorAbility iSlideIndicatorAbilityKp = kp();
        if (iSlideIndicatorAbilityKp != null) {
            iSlideIndicatorAbilityKp.uj(this.LLJJLIIIJLLLLLLLZ, this.LLJZ);
        }
        BottomSlideIndicatorAbility bottomSlideIndicatorAbilityIp = ip();
        if (bottomSlideIndicatorAbilityIp != null) {
            bottomSlideIndicatorAbilityIp.uj(R.id.qec, (View.OnLayoutChangeListener) this.LLL.getValue());
        }
        View view = this.LLJLLIL;
        if (view != null) {
            view.removeOnLayoutChangeListener((View.OnLayoutChangeListener) this.LLJZIJLIL.getValue());
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        lp();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        mp();
    }

    public static boolean op(VideoItemParams videoItemParams) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        AdCarouselColorInfo carouselColorInfo;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.size() <= 1 || C0SP9.LJ(videoItemParams.getAweme())) {
            return false;
        }
        AwemeRawAd awemeRawAd = videoItemParams.getAweme().getAwemeRawAd();
        if ((awemeRawAd == null || (carouselColorInfo = awemeRawAd.getCarouselColorInfo()) == null || carouselColorInfo.getShowPageControlShadow() != 1) && AwemeExtKt.isAdTraffic(videoItemParams.getAweme())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC704110Rjd
    public final void I6(boolean z) {
        InterfaceC710220RtU interfaceC710220RtUYn;
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLJLILLLLZIIL.getValue();
        int i = 0;
        if (iPhotoSlidesAbility != null && (interfaceC710220RtUYn = iPhotoSlidesAbility.yn()) != null && interfaceC710220RtUYn.LJJIFFI() && 1 != 0) {
            View view = this.LLJLLIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        View view2 = this.LLJLLIL;
        if (view2 == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view2);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).unbindAbility(this.LLJJJJLIIL, InterfaceC704110Rjd.class);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0S7c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S9P) obj).LLJJIJIL);
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(161), 4);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).bindAbility(this.LLJJJJLIIL, InterfaceC704110Rjd.class);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(VideoItemParams videoItemParams) {
    }
}
