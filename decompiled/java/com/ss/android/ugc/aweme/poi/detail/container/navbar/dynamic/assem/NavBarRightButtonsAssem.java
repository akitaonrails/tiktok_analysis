package com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.assem;

import X.C098200Yq;
import X.C1180060goW;
import X.C1184190gvB;
import X.C1184530gvj;
import X.C1185410gx9;
import X.C1185600gxS;
import X.C1188530h2B;
import X.C1252710ihh;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C189200o6;
import X.C19659111vp;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C723580SZw;
import X.C723850SaN;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1184330gvP;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiNavButtonGroup;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.IDynamicNavBarIconAbility;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.PoiDynamicNavBarModule;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.List;
import kotlin.jvm.internal.AwS101S0400000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NavBarRightButtonsAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1184190gvB.class, "poi_dynamic_nav_bar_hierarchy_data"), checkSupervisorPrepared());

    public final C1184190gvB Ho() {
        return (C1184190gvB) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        PoiDynamicNavBarModule poiDynamicNavBarModule;
        PoiNavButtonGroup poiNavButtonGroup;
        List<PoiButton> list;
        IDynamicNavBarIconAbility iDynamicNavBarIconAbility;
        ViewGroup viewGroup;
        Object c098200Yq;
        String str;
        String name;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        PoiListApi.PoiDetailResponse poiDetailResponse2;
        PoiListApi.PoiDetailResponse poiDetailResponse3;
        Boolean boolIsCollected;
        C1185600gxS c1185600gxS;
        IDynamicNavBarIconAbility iDynamicNavBarIconAbility2;
        super.onViewCreated(view);
        C1184190gvB c1184190gvBHo = Ho();
        if (c1184190gvBHo != null && (poiDynamicNavBarModule = c1184190gvBHo.LL) != null && (poiNavButtonGroup = poiDynamicNavBarModule.getPoiNavButtonGroup()) != null && (list = poiNavButtonGroup.rightButtons) != null) {
            for (PoiButton poiButton : list) {
                Integer num = poiButton.buttonType;
                String address = null;
                if (num != null) {
                    if (num.intValue() == 1) {
                        FrameLayout frameLayout = new FrameLayout(view.getContext());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 8388627;
                        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                        C786410Ut5.a6(frameLayout, layoutParams);
                        frameLayout.setId(View.generateViewId());
                        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                            viewGroup.addView(frameLayout);
                            boolean zBooleanValue = false;
                            try {
                                InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
                                if (interfaceC1184330gvP == null) {
                                    c098200Yq = null;
                                } else {
                                    c098200Yq = interfaceC1184330gvP.jN(false, null, null, null);
                                }
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            C1188530h2B c1188530h2B = (C1188530h2B) c098200Yq;
                            C1184190gvB c1184190gvBHo2 = Ho();
                            if (c1184190gvBHo2 != null && (c1185600gxS = c1184190gvBHo2.LLILLL) != null) {
                                str = c1185600gxS.LIZ;
                            } else {
                                str = null;
                            }
                            C1184190gvB c1184190gvBHo3 = Ho();
                            if (c1184190gvBHo3 != null && (poiDetailResponse3 = c1184190gvBHo3.LLILLJJLI) != null && (boolIsCollected = poiDetailResponse3.isCollected()) != null) {
                                zBooleanValue = boolIsCollected.booleanValue();
                            }
                            int i = 0;
                            C1184190gvB c1184190gvBHo4 = Ho();
                            if (c1184190gvBHo4 != null && (poiDetailResponse2 = c1184190gvBHo4.LLILLJJLI) != null) {
                                name = poiDetailResponse2.getName();
                            } else {
                                name = null;
                            }
                            C1184190gvB c1184190gvBHo5 = Ho();
                            if (c1184190gvBHo5 != null && (poiDetailResponse = c1184190gvBHo5.LLILLJJLI) != null) {
                                address = poiDetailResponse.getAddress();
                            }
                            C723850SaN.LIZLLL(this, new AwS101S0400000_2(this, new C1184530gvj(str, zBooleanValue, i, name, address, (boolean) (null == true ? 1 : 0), c1188530h2B, (C1185410gx9) null, (Boolean) (null == true ? 1 : 0), (boolean) (null == true ? 1 : 0), 1956), poiButton, frameLayout, 12));
                            C1180060goW.LIZ(frameLayout, new AwS562S0100000_18(this, 2611));
                        }
                    } else if (num.intValue() == 2) {
                        TuxIconView tuxIconViewGo = Go(view, poiButton);
                        if (tuxIconViewGo != null) {
                            C339190DRl.LIZLLL(tuxIconViewGo);
                            Fragment fragmentLJI = C724240Sb0.LJI(this);
                            if (fragmentLJI != null && (iDynamicNavBarIconAbility2 = (IDynamicNavBarIconAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IDynamicNavBarIconAbility.class, null)) != null) {
                                iDynamicNavBarIconAbility2.p62(tuxIconViewGo);
                            }
                            C723850SaN.LIZLLL(this, new AwS368S0200000_2(this, tuxIconViewGo, 127));
                        }
                    }
                }
                TuxIconView tuxIconViewGo2 = Go(view, poiButton);
                if (tuxIconViewGo2 != null) {
                    Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                    if (fragmentLJI2 != null && (iDynamicNavBarIconAbility = (IDynamicNavBarIconAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), IDynamicNavBarIconAbility.class, null)) != null) {
                        iDynamicNavBarIconAbility.p62(tuxIconViewGo2);
                    }
                    C786410Ut5.I7(new AkS57S0200000_18(poiButton, this, 37), tuxIconViewGo2);
                }
            }
        }
    }

    public final TuxIconView Go(View view, PoiButton poiButton) {
        Integer dynamicIcon;
        Boolean boolValueOf;
        ViewGroup viewGroup;
        PoiDynamicNavBarModule poiDynamicNavBarModule;
        PoiNavButtonGroup poiNavButtonGroup;
        DynamicIcon dynamicIcon2 = poiButton.icon;
        if (dynamicIcon2 != null && (dynamicIcon = dynamicIcon2.parseDynamicIcon(view.getContext(), null)) != null) {
            int iIntValue = dynamicIcon.intValue();
            TuxIconView tuxIconView = new TuxIconView(view.getContext(), null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            layoutParams.gravity = 8388627;
            layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            C786410Ut5.M6(tuxIconView, layoutParams);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZ = iIntValue;
            tuxIconView.setTuxIcon(c419910GdJ);
            C1184190gvB c1184190gvBHo = Ho();
            if (c1184190gvBHo != null && (poiDynamicNavBarModule = c1184190gvBHo.LL) != null && (poiNavButtonGroup = poiDynamicNavBarModule.getPoiNavButtonGroup()) != null) {
                boolValueOf = Boolean.valueOf(poiNavButtonGroup.isImmersion());
            } else {
                boolValueOf = null;
            }
            Context context = getContext();
            if (context != null && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zc);
                Drawable drawableLIZ = c384050F3z.LIZ(context);
                C19659111vp c19659111vp = new C19659111vp();
                c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
                c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
                c19659111vp.LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c19659111vp.LJ = Integer.valueOf(R.attr.p0);
                tuxIconView.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(context)));
            }
            tuxIconView.setId(View.generateViewId());
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                viewGroup.addView(tuxIconView);
                C1180060goW.LIZ(tuxIconView, new AwS419S0200000_18(poiButton, this, 66));
                return tuxIconView;
            }
        }
        return null;
    }
}
