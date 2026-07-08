package com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C1075590e61;
import X.C1216270hkv;
import X.C1246160iX8;
import X.C1248230iaT;
import X.C1248870ibV;
import X.C1250210idf;
import X.C1250580ieG;
import X.C1252550ihR;
import X.C1388190mED;
import X.C13BV;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C197039127h;
import X.C1EDI;
import X.C2217381BqS;
import X.C2537109wv;
import X.C268330AfP;
import X.C313510CQr;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C487280J9a;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1248370iah;
import X.InterfaceC487330J9f;
import Y.ACListenerS154S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.ss.android.ugc.profile.platform.base.data.BioSignatureData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileHeaderBaseSignatureComponent extends BioBaseUIComponent<BioSignatureData> implements ISignatureAbility, InterfaceC487330J9f {
    public ProfileViewModel LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public final boolean LLJLLIL = ((Boolean) C2537109wv.LJIIJ.getValue()).booleanValue();
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2502));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void Go() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, ISignatureAbility.class, null, null);
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            this.LLJLILLLLZIIL = C1075590e61.LIZ(fragmentLJI2);
        }
        ProfilePlatformViewModel profilePlatformViewModelYp = yp();
        if (profilePlatformViewModelYp != null) {
            profilePlatformViewModelYp.FQ2(new AwS598S0100000_19(this, 483));
        }
        ProfilePlatformViewModel profilePlatformViewModelYp2 = yp();
        if (profilePlatformViewModelYp2 != null) {
            C736680Sv4.LJIIIIZZ(this, profilePlatformViewModelYp2, new C2217381BqS() { // from class: X.0ial
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLJJI;
                }
            }, null, new AwS633S0100000_19(this, 160), 6);
        }
        if (!C313510CQr.LIZ() && !C1EDI.LIZIZ()) {
            IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
            if (iHeaderBioAbility != null) {
                iHeaderBioAbility.Xu1(this.LLJJ);
                return;
            }
            return;
        }
        IHeaderBioAbility iHeaderBioAbility2 = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
        if (iHeaderBioAbility2 != null) {
            iHeaderBioAbility2.eq2(this.LLJJ);
        }
        ProfilePlatformViewModel profilePlatformViewModelYp3 = yp();
        if (profilePlatformViewModelYp3 != null) {
            profilePlatformViewModelYp3.KQ2(AFwS239S0000000_8.get$arr$(288));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        List<SignatureExtraInfo> signatureExtra;
        IHeaderBioAbility iHeaderBioAbility;
        Describe describe;
        T t = this.LLJJLIIIJLLLLLLLZ;
        String text = (t == 0 || (describe = t.getDescribe()) == null) ? null : describe.getText();
        BioSignatureData bioSignatureData = (BioSignatureData) this.LLJJLIIIJLLLLLLLZ;
        if (bioSignatureData == null || (signatureExtra = bioSignatureData.getSignatureExtra()) == null) {
            signatureExtra = C13BV.INSTANCE;
        }
        IP2(text, signatureExtra);
        if (C313510CQr.LIZ() || C1EDI.LIZIZ() || (iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null)) == null) {
            return;
        }
        iHeaderBioAbility.Xu1(this.LLJJ);
    }

    public final void zp() {
        Drawable drawableLIZ;
        TuxTextView tuxTextView = this.LLJLL;
        if (tuxTextView != null) {
            Context context = getContext();
            if (context != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                drawableLIZ = c384050F3z.LIZ(context);
            } else {
                drawableLIZ = null;
            }
            tuxTextView.setBackground(drawableLIZ);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Context context;
        Activity activityLIZ;
        super.onCreate();
        if (!C19252910Tv.LIZIZ.LIZLLL().LJI().LJI() || (context = getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        C487280J9a.LIZ(activityLIZ.hashCode(), this);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (q1() && !C1EDI.LIZLLL()) {
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().signature = null;
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().setSignatureExtra(null);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), ISignatureAbility.class, null);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ISignatureAbility
    public final TuxTextView ig0() {
        return this.LLJLL;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        if (C1EDI.LIZIZ()) {
            n nVar = profileComponents.bizData;
            if (nVar != null) {
                ep(nVar);
            }
            tp();
            View view = this.LLJJ;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS154S0100000_19(this, 188), view);
                return;
            }
            return;
        }
        super.Hj(profileComponents);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        LinearLayout.LayoutParams layoutParams;
        int iLIZIZ;
        int i;
        TuxTextView tuxTextView;
        int iLIZIZ2;
        C197039127h c197039127h;
        if (this.LLJLLIL && !C1EDI.LIZIZ()) {
            layoutParams = new LinearLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
            if (!C268330AfP.LJIIIZ() && !C268330AfP.LIZLLL()) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ2 = 0;
            }
            Context context = getContext();
            if (context != null) {
                Integer numValueOf = Integer.valueOf(iLIZIZ2);
                this.LLJLLL.getValue().getClass();
                Integer numValueOf2 = Integer.valueOf(C1248230iaT.LJII());
                Integer numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                this.LLJLLL.getValue().getClass();
                C426750GoL.LJIIJ(layoutParams, context, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(C1248230iaT.LJI()), 32);
            }
            Context context2 = getContext();
            if (context2 != null) {
                c197039127h = new C197039127h(context2, null, 6, 0);
            } else {
                c197039127h = null;
            }
            this.LLJLL = c197039127h;
            if ((c197039127h instanceof C197039127h) && c197039127h != null) {
                c197039127h.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                c197039127h.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                c197039127h.setIconTintColorRes(R.attr.a1j);
                c197039127h.setTextColorRes(R.attr.a1j);
                c197039127h.setTuxFont(72);
                c197039127h.setMinWidth(0);
                c197039127h.LJJJJL(new AwS581S0100000_2(c197039127h, 360));
            }
        } else {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (!C268330AfP.LJIIIZ() && !C268330AfP.LIZLLL()) {
                if (C1246160iX8.LIZ()) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                }
            } else {
                iLIZIZ = 0;
            }
            if (C1246160iX8.LIZ()) {
                i = 3;
            } else {
                i = 40;
            }
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
            Context context3 = getContext();
            if (context3 != null) {
                Integer numValueOf4 = Integer.valueOf(iLIZIZ);
                this.LLJLLL.getValue().getClass();
                Integer numValueOf5 = Integer.valueOf(C1248230iaT.LJII());
                Integer numValueOf6 = Integer.valueOf(iLIZIZ3);
                this.LLJLLL.getValue().getClass();
                C426750GoL.LJIIJ(layoutParams, context3, numValueOf4, numValueOf5, numValueOf6, Integer.valueOf(C1248230iaT.LJI()), 32);
            }
            Context context4 = getContext();
            if (context4 != null) {
                tuxTextView = new TuxTextView(context4, null, 6, 0);
            } else {
                tuxTextView = null;
            }
            this.LLJLL = tuxTextView;
        }
        if (C268330AfP.LIZLLL()) {
            this.LLJLLL.getValue().getClass();
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        }
        TuxTextView tuxTextView2 = this.LLJLL;
        if (tuxTextView2 != null) {
            C786410Ut5.R6(tuxTextView2, layoutParams);
            tuxTextView2.setGravity(17);
            tuxTextView2.setMaxLines(5);
            tuxTextView2.setId(R.id.s0c);
            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        }
        C1248870ibV.LIZJ(this.LLJLL, profileComponentUIConfig, false, true);
        Context context5 = getContext();
        if (context5 != null) {
            C19252910Tv.LIZIZ.LIZLLL().LJI().LJFF(this.LLJLL, context5, null, null);
        }
        return this.LLJLL;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C1250210idf.LIZ(nVar.toString(), BioSignatureData.class);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent
    public final void up(View view) {
        IHeaderBioAbility iHeaderBioAbility;
        if (view != null && (iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderBioAbility.tX1(this.LLJILLL, view, str);
        }
    }

    public void IP2(String str, List list) {
        ProfileCommonInfo profileCommonInfoVo;
        UserRelationInfo userRelationInfo;
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            TuxTextView tuxTextView = this.LLJLL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        } else {
            TuxTextView tuxTextView2 = this.LLJLL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
        }
        ProfileViewModel profileViewModel = this.LLJLILLLLZIIL;
        if (profileViewModel != null) {
            C1252550ihR.LIZ.getClass();
            profileViewModel.hR2(C1252550ihR.LJIILLIIL());
        }
        if (q1()) {
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().signature = str;
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().setSignatureExtra(list);
        }
        C1250580ieG.LIZJ(this.LLJLL, str, list, Boolean.valueOf(q1()));
        if (C1216270hkv.LIZLLL(this.LLJLL) && (profileCommonInfoVo = Vo()) != null && (userRelationInfo = profileCommonInfoVo.getUserRelationInfo()) != null && Intrinsics.LJFF(userRelationInfo.isBlocking(), Boolean.FALSE)) {
            z = true;
        }
        lp(EnumC1248370iah.BIO, "HAS_BIO_SIGNATURE", z);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        Context context = getContext();
        if (context != null) {
            C19252910Tv.LIZIZ.LIZLLL().LJI().LJFF(this.LLJLL, context, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
        }
    }
}
