package com.ss.android.ugc.profile.platform.business.header.business.toptips.base;

import X.AbstractC1247880iZu;
import X.C1248660ibA;
import X.C1248700ibE;
import X.C1248950ibd;
import X.C1308910kAL;
import X.C1558520qew;
import X.C19252910Tv;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1248260iaW;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUIData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS297S0300000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileHeaderTopTipsBaseUIComponent extends BaseUIComponent {
    public LinearLayout LLJJL;

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        View view = this.LLJJ;
        if (view != null) {
            IHeaderTopTipsAbility iHeaderTopTipsAbility = (IHeaderTopTipsAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderTopTipsAbility.class, null);
            if (iHeaderTopTipsAbility != null) {
                if (!C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
                    String str = this.assemTagInternal;
                    iHeaderTopTipsAbility.LJIIIZ(this.LLJILLL, view, str != null ? str : "");
                    return;
                }
                String str2 = this.assemTagInternal;
                String str3 = str2 != null ? str2 : "";
                int i = this.LLJILLL;
                View viewFindViewById = this.LLJJL;
                if (viewFindViewById == null) {
                    View viewLJJIJL = LJJIJL();
                    viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.py4) : null;
                    this.LLJJL = (LinearLayout) viewFindViewById;
                }
                iHeaderTopTipsAbility.sf2(str3, i, view, (ViewGroup) viewFindViewById);
                View view2 = this.LLJJL;
                if (view2 == null) {
                    View viewLJJIJL2 = LJJIJL();
                    View viewFindViewById2 = viewLJJIJL2 != null ? viewLJJIJL2.findViewById(R.id.py4) : null;
                    this.LLJJL = (LinearLayout) viewFindViewById2;
                    view2 = viewFindViewById2;
                }
                C786410Ut5.LJZL(0, (LinearLayout) view2);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        ProfileComponents profileComponents;
        List<Action> list;
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (list = profileComponents.actions) == null) {
            return;
        }
        for (Action action : list) {
            if (Intrinsics.LJFF(action.getType(), "router")) {
                Context context = getContext();
                Action.RouterInfo router = action.getRouter();
                SmartRouter.buildRoute(context, router != null ? router.getUrl() : null).open();
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        C1248700ibE c1248700ibE;
        ProfileComponents profileComponents;
        String str;
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLJJI;
        int iIntValue;
        String strLJJIFFI;
        Integer numLJJJJJ;
        Context context = getContext();
        View viewLIZJ = null;
        if (context != null) {
            C1248950ibd c1248950ibd = this.LLJJI;
            if (c1248950ibd != null && (profileComponents = c1248950ibd.LLILLJJLI) != null && (str = profileComponents.componentId) != null) {
                ProfileUIData profileUIData = profileComponents.uiData;
                BizBaseData bizBaseData = this.LLJJIJIIJIL;
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
                if (profilePlatformProtocolAp == null || (numLIZJ = profilePlatformProtocolAp.LJJIIJ()) == null) {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context);
                }
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp2 = ap();
                if (profilePlatformProtocolAp2 == null || (numLIZJ2 = profilePlatformProtocolAp2.LJJ()) == null) {
                    numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, context);
                }
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp3 = ap();
                if (profilePlatformProtocolAp3 != null) {
                    numLJJI = profilePlatformProtocolAp3.LJJI();
                } else {
                    numLJJI = null;
                }
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp4 = ap();
                if (profilePlatformProtocolAp4 != null && (numLJJJJJ = profilePlatformProtocolAp4.LJJJJJ()) != null) {
                    iIntValue = numLJJJJJ.intValue();
                } else {
                    iIntValue = 41;
                }
                Integer numValueOf = Integer.valueOf(iIntValue);
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp5 = ap();
                if (profilePlatformProtocolAp5 != null) {
                    strLJJIFFI = profilePlatformProtocolAp5.LJJIFFI();
                } else {
                    strLJJIFFI = null;
                }
                c1248700ibE = new C1248700ibE(context, str, profileUIData, bizBaseData, numLIZJ, numLIZJ2, numLJJI, numValueOf, strLJJIFFI, Integer.valueOf(EnumC1248260iaW.ICON_TEXT.getType()));
            } else {
                c1248700ibE = null;
            }
            AbstractC1247880iZu abstractC1247880iZuLIZ = C1248660ibA.LIZ(c1248700ibE);
            if (abstractC1247880iZuLIZ != null) {
                viewLIZJ = abstractC1247880iZuLIZ.LIZJ(EnumC1248260iaW.UNKONWN, new AwS297S0300000_19(context, abstractC1247880iZuLIZ, this, 13));
                if (viewLIZJ != null) {
                    viewLIZJ.setTag(this.assemTagInternal);
                }
            }
        }
        return viewLIZJ;
    }

    public final void yp(TuxIconView tuxIconView) {
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        C426750GoL.LJIIL(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), 16);
    }

    public final void zp(TuxTextView tuxTextView) {
        C426750GoL.LJIIL(tuxTextView, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), 16);
        tuxTextView.setGravity(17);
    }

    public final void up(Context context, LinearLayout linearLayout) {
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.c7);
        linearLayout.setBackground(c384050F3z.LIZ(context));
    }
}
