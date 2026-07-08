package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base;

import X.AbstractC1247880iZu;
import X.C1238700iL6;
import X.C1248660ibA;
import X.C1248700ibE;
import X.C1248950ibd;
import X.C1308910kAL;
import X.C1558520qew;
import X.C1DDC;
import X.C2537109wv;
import X.C268330AfP;
import X.C418440Gaw;
import X.C814420VxA;
import X.EnumC1248260iaW;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUIData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS297S0300000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class AccountUserInfoBaseUIComponent<T extends BizBaseData> extends AccountInfoBaseUIComponent<T> {
    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        View view;
        TextView textView;
        ProfileComponents profileComponents;
        IAccountUserInfoAbility iAccountUserInfoAbility;
        View view2 = this.LLJJ;
        if (view2 != null && (iAccountUserInfoAbility = (IAccountUserInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IAccountUserInfoAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            C1248950ibd c1248950ibd = (C1248950ibd) this.LLJJL.getValue();
            iAccountUserInfoAbility.LJIIIZ(c1248950ibd != null ? c1248950ibd.LL : -1, view2, str);
        }
        if (C268330AfP.LJIIJ() && (this.LLJJ instanceof TuxIconView)) {
            C1248950ibd c1248950ibd2 = this.LLJJI;
            if (Intrinsics.LJFF((c1248950ibd2 == null || (profileComponents = c1248950ibd2.LLILLJJLI) == null) ? null : profileComponents.componentName, "user_account_user_name_modify") && C1238700iL6.LIZIZ()) {
                return;
            }
            View view3 = this.LLJJ;
            Object parent = view3 != null ? view3.getParent() : null;
            if (!(parent instanceof View) || (view = (View) parent) == null || (textView = (TextView) view.findViewById(R.id.f797s7d)) == null) {
                return;
            }
            textView.setMaxWidth(C1DDC.LIZIZ().screenRating == 1 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(125)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(163)));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        C1248700ibE c1248700ibE;
        ProfileComponents profileComponents;
        String str;
        int i;
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLJJI;
        int iIntValue;
        String strLJJIFFI;
        Integer numValueOf;
        EnumC1248260iaW enumC1248260iaWLJJIIZI;
        Integer numLJJJJJ;
        View viewLIZJ = null;
        EnumC1248260iaW enumC1248260iaWLJJIIZI2 = null;
        viewLIZJ = null;
        if (!cp()) {
            return null;
        }
        Context context = getContext();
        if (context != null) {
            C1248950ibd c1248950ibd = this.LLJJI;
            if (c1248950ibd != null && (profileComponents = c1248950ibd.LLILLJJLI) != null && (str = profileComponents.componentId) != null) {
                ProfileUIData profileUIData = profileComponents.uiData;
                BizBaseData bizBaseData = this.LLJJIJIIJIL;
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
                int i2 = R.attr.a1k;
                if (profilePlatformProtocolAp == null || (numLIZJ = profilePlatformProtocolAp.LJJIIJ()) == null) {
                    if (C2537109wv.LJI()) {
                        i = R.attr.a1k;
                    } else {
                        i = R.attr.a1j;
                    }
                    numLIZJ = C1308910kAL.LIZJ(i, context);
                }
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp2 = ap();
                if (profilePlatformProtocolAp2 == null || (numLIZJ2 = profilePlatformProtocolAp2.LJJ()) == null) {
                    if (!C2537109wv.LJI()) {
                        i2 = R.attr.a1j;
                    }
                    numLIZJ2 = C1308910kAL.LIZJ(i2, context);
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
                } else if (C2537109wv.LJI()) {
                    iIntValue = 61;
                } else {
                    iIntValue = 41;
                }
                Integer numValueOf2 = Integer.valueOf(iIntValue);
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp5 = ap();
                if (profilePlatformProtocolAp5 != null) {
                    strLJJIFFI = profilePlatformProtocolAp5.LJJIFFI();
                } else {
                    strLJJIFFI = null;
                }
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp6 = ap();
                if (profilePlatformProtocolAp6 != null && (enumC1248260iaWLJJIIZI = profilePlatformProtocolAp6.LJJIIZI()) != null) {
                    numValueOf = Integer.valueOf(enumC1248260iaWLJJIIZI.getType());
                } else {
                    numValueOf = null;
                }
                c1248700ibE = new C1248700ibE(context, str, profileUIData, bizBaseData, numLIZJ, numLIZJ2, numLJJI, numValueOf2, strLJJIFFI, numValueOf);
            } else {
                c1248700ibE = null;
            }
            AbstractC1247880iZu abstractC1247880iZuLIZ = C1248660ibA.LIZ(c1248700ibE);
            if (abstractC1247880iZuLIZ != null) {
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp7 = ap();
                if (profilePlatformProtocolAp7 != null) {
                    enumC1248260iaWLJJIIZI2 = profilePlatformProtocolAp7.LJJIIZI();
                }
                viewLIZJ = abstractC1247880iZuLIZ.LIZJ(enumC1248260iaWLJJIIZI2, new AwS297S0300000_19((AccountUserInfoBaseUIComponent) this, abstractC1247880iZuLIZ, (AbstractC1247880iZu) context, (Context) 10));
                if (viewLIZJ != null) {
                    viewLIZJ.setTag(this.assemTagInternal);
                }
            }
        }
        return viewLIZJ;
    }
}
