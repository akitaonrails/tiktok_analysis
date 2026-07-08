package com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base;

import X.AbstractC1247880iZu;
import X.C01GW;
import X.C1248270iaX;
import X.C1248660ibA;
import X.C1248700ibE;
import X.C1248950ibd;
import X.C268330AfP;
import X.C418440Gaw;
import X.C428150Gqb;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1248260iaW;
import X.EnumC428940Grs;
import X.InterfaceC1248530iax;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUIData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import kotlin.jvm.internal.AwS297S0300000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class BioStructuralInfoBaseComponent<T extends BizBaseData> extends BioBusinessBaseUIComponent<T> implements InterfaceC1248530iax {
    public int LLLF;
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS563S0100000_19((BioStructuralInfoBaseComponent) this, 2491));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS563S0100000_19((BioStructuralInfoBaseComponent) this, 2492));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS563S0100000_19((BioStructuralInfoBaseComponent) this, 2493));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS563S0100000_19((BioStructuralInfoBaseComponent) this, 2494));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS563S0100000_19((BioStructuralInfoBaseComponent) this, 2496));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS563S0100000_19((BioStructuralInfoBaseComponent) this, 2495));
    public final String LLLFF = "";

    @Override // X.InterfaceC1248530iax
    public final int I2() {
        BizBaseData bizBaseData;
        BizBaseData bizBaseData2;
        String text;
        TextPaint paint;
        Describe describe;
        Describe describe2;
        String str = this.LLLFF;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
        if (Intrinsics.LJFF(str, (((profilePlatformProtocolAp == null || (bizBaseData = profilePlatformProtocolAp.LLJILJIL) == null) && (bizBaseData = this.LLJJIJIIJIL) == null) || (describe2 = bizBaseData.getDescribe()) == null) ? null : describe2.getText())) {
            return this.LLLF;
        }
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp2 = ap();
        if (((profilePlatformProtocolAp2 == null || (bizBaseData2 = profilePlatformProtocolAp2.LLJILJIL) == null) && (bizBaseData2 = this.LLJJIJIIJIL) == null) || (describe = bizBaseData2.getDescribe()) == null || (text = describe.getText()) == null) {
            text = "";
        }
        TextView textView = (TextView) this.LLJZIJLIL.getValue();
        int iMeasureText = (textView == null || (paint = textView.getPaint()) == null) ? 0 : (int) paint.measureText(text);
        int iLIZIZ = (!C268330AfP.LJIIIZ() || iMeasureText <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(254))) ? iMeasureText + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(284));
        this.LLLF = iLIZIZ;
        return iLIZIZ;
    }

    public final int Ip() {
        return ((Number) this.LLJLLIL.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        BizBaseData bizBaseData;
        Describe describe;
        BizBaseData bizBaseData2;
        ProfileComponents profileComponents;
        BizBaseData bizBaseData3;
        ProfileComponents profileComponents2;
        TuxIconView tuxIconView = (TuxIconView) this.LLL.getValue();
        String text = null;
        if (tuxIconView != null) {
            ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
            if (profilePlatformProtocolAp == null || (bizBaseData3 = profilePlatformProtocolAp.LLJILJIL) == null) {
                bizBaseData3 = this.LLJJIJIIJIL;
            }
            C1248950ibd c1248950ibd = (C1248950ibd) this.LLJJL.getValue();
            C1248270iaX.LIZ(tuxIconView, bizBaseData3, (c1248950ibd == null || (profileComponents2 = c1248950ibd.LLILLJJLI) == null) ? null : profileComponents2.componentId, Integer.valueOf(Ip()), null, null);
        }
        TuxTextView tuxTextView = (TuxTextView) this.LLJZIJLIL.getValue();
        if (tuxTextView != null) {
            ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp2 = ap();
            if (profilePlatformProtocolAp2 == null || (bizBaseData2 = profilePlatformProtocolAp2.LLJILJIL) == null) {
                bizBaseData2 = this.LLJJIJIIJIL;
            }
            C1248950ibd c1248950ibd2 = (C1248950ibd) this.LLJJL.getValue();
            C1248270iaX.LIZJ(tuxTextView, bizBaseData2, (c1248950ibd2 == null || (profileComponents = c1248950ibd2.LLILLJJLI) == null) ? null : profileComponents.componentId, Integer.valueOf(Ip()), Integer.valueOf(((Number) this.LLJLLL.getValue()).intValue()), false, 16);
        }
        TextView textView = (TextView) this.LLJZIJLIL.getValue();
        if (textView != null) {
            ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp3 = ap();
            if (((profilePlatformProtocolAp3 != null && (bizBaseData = profilePlatformProtocolAp3.LLJILJIL) != null) || (bizBaseData = this.LLJJIJIIJIL) != null) && (describe = bizBaseData.getDescribe()) != null) {
                text = describe.getText();
            }
            textView.setText(text);
        }
    }

    @Override // X.InterfaceC1248530iax
    public final int a() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1248530iax
    public final String getTag() {
        return this.assemTagInternal;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gp(com.bytedance.tux.input.TuxTextView r3) {
        /*
            r2 = this;
            r0 = 2131364764(0x7f0a0b9c, float:1.8349374E38)
            r3.setId(r0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r0 = -2
            r1.<init>(r0, r0)
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r1.setMarginStart(r0)
            X.C786410Ut5.R6(r3, r1)
            r0 = 16
            r3.setGravity(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r0)
            r0 = 1
            r3.setMaxLines(r0)
            r0 = 254(0xfe, float:3.56E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r3.setMaxWidth(r0)
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L5f
            X.01GW r0 = r2.LLJLL
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            int r0 = X.C1248230iaT.LJIIJ()
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L5f
            int r0 = r0.intValue()
        L5b:
            r3.setTextColorRes(r0)
            return
        L5f:
            r0 = 0
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioStructuralInfoBaseComponent.Gp(com.bytedance.tux.input.TuxTextView):void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp;
        n nVar = profileComponents.bizData;
        if (nVar != null && (profilePlatformProtocolAp = ap()) != null) {
            profilePlatformProtocolAp.LJJJLZIJ(nVar);
        }
        tp();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        C1248700ibE c1248700ibE;
        ProfileComponents profileComponents;
        String str;
        int iIp;
        int iIp2;
        Integer numLJJI;
        int iIntValue;
        String strLJJIFFI;
        Integer numLJJJJJ;
        Integer numLJJ;
        Integer numLJJIIJ;
        Context context = getContext();
        View viewLIZJ = null;
        if (context != null) {
            C1248950ibd c1248950ibd = this.LLJJI;
            if (c1248950ibd != null && (profileComponents = c1248950ibd.LLILLJJLI) != null && (str = profileComponents.componentId) != null) {
                ProfileUIData profileUIData = profileComponents.uiData;
                T t = this.LLJJLIIIJLLLLLLLZ;
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp = ap();
                if (profilePlatformProtocolAp != null && (numLJJIIJ = profilePlatformProtocolAp.LJJIIJ()) != null) {
                    iIp = numLJJIIJ.intValue();
                } else {
                    iIp = Ip();
                }
                Integer numValueOf = Integer.valueOf(iIp);
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp2 = ap();
                if (profilePlatformProtocolAp2 != null && (numLJJ = profilePlatformProtocolAp2.LJJ()) != null) {
                    iIp2 = numLJJ.intValue();
                } else {
                    iIp2 = Ip();
                }
                Integer numValueOf2 = Integer.valueOf(iIp2);
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
                    iIntValue = ((Number) this.LLJLLL.getValue()).intValue();
                }
                Integer numValueOf3 = Integer.valueOf(iIntValue);
                ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp5 = ap();
                if (profilePlatformProtocolAp5 != null) {
                    strLJJIFFI = profilePlatformProtocolAp5.LJJIFFI();
                } else {
                    strLJJIFFI = null;
                }
                c1248700ibE = new C1248700ibE(context, str, profileUIData, t, numValueOf, numValueOf2, numLJJI, numValueOf3, strLJJIFFI, Integer.valueOf(EnumC1248260iaW.ICON_TEXT.getType()));
            } else {
                c1248700ibE = null;
            }
            AbstractC1247880iZu abstractC1247880iZuLIZ = C1248660ibA.LIZ(c1248700ibE);
            if (abstractC1247880iZuLIZ != null) {
                viewLIZJ = abstractC1247880iZuLIZ.LIZJ(EnumC1248260iaW.ICON_TEXT, new AwS297S0300000_19(context, (Context) abstractC1247880iZuLIZ, (AbstractC1247880iZu) this, 8));
            }
        }
        this.LLJJ = viewLIZJ;
        C428150Gqb.LIZ(viewLIZJ, EnumC428940Grs.ALPHA, 0.0f);
        return this.LLJJ;
    }

    public final void Fp(Context context, LinearLayout linearLayout) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17)));
        layoutParams.gravity = 17;
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
    }
}
