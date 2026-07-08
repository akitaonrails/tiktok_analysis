package com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0259006v;
import X.C0P0T;
import X.C0XQ7;
import X.C1075590e61;
import X.C11JF;
import X.C11VU;
import X.C1216270hkv;
import X.C1248230iaT;
import X.C1248430ian;
import X.C1248440iao;
import X.C1248870ibV;
import X.C1250210idf;
import X.C1250580ieG;
import X.C1251350ifV;
import X.C1252550ihR;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1391600mJi;
import X.C13BV;
import X.C1558360qeg;
import X.C1558520qew;
import X.C161N;
import X.C1720106oR;
import X.C1743690vTb;
import X.C19252910Tv;
import X.C1954807lC;
import X.C1EDI;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C2532609wC;
import X.C268330AfP;
import X.C300150Bpd;
import X.C418440Gaw;
import X.C426750GoL;
import X.C450860Hm8;
import X.C452501pT;
import X.C475630Ikz;
import X.C487280J9a;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1065850dqJ;
import X.EnumC1235690iGF;
import X.EnumC1248370iah;
import X.EnumC1248450iap;
import X.EnumC1248480ias;
import X.InterfaceC1248320iac;
import X.InterfaceC487330J9f;
import X.ViewOnLongClickListenerC1265920j30;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS119S0100000_19;
import Y.ATListenerS452S0100000_19;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.cla.et.newet.ClickSeeTranslationInBioEvent;
import com.ss.android.ugc.aweme.cla.et.newet.SeeOriginalShowInBioEvent;
import com.ss.android.ugc.aweme.cla.et.newet.SeeTranslationShowInBioEvent;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.ss.android.ugc.profile.platform.base.data.BioSignatureData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS46S0301000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileHeaderSignatureTranslationComponent extends BioBaseUIComponent<BioSignatureData> implements ISignatureAbility, InterfaceC487330J9f, InterfaceC1248320iac {
    public ProfileViewModel LLJLL;
    public C0P0T LLJLLIL;
    public TuxTextView LLJLLL;
    public FrameLayout LLJZ;
    public LinearLayout LLJZIJLIL;
    public ObjectAnimator LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2504));
    public EnumC1248450iap LLLFFI = EnumC1248450iap.NORMAL;
    public String LLLFZ = "";
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2503));
    public final C01GW LLLII = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(552));
    public final C01GW LLLIIII = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(551));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(555));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(554));
    public final C01GW LLLIIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(553));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, ISignatureAbility.class, null, null);
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            this.LLJLL = C1075590e61.LIZ(fragmentLJI2);
        }
        BioTranslationViewModel bioTranslationViewModelBp = Bp();
        if (bioTranslationViewModelBp != null) {
            C736680Sv4.LJIIIIZZ(this, bioTranslationViewModelBp, new C2217371BqR() { // from class: X.0iau
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1248430ian) obj).LLIZ;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C1248430ian) obj).LLIZ = (EnumC1248480ias) obj2;
                }
            }, null, new AwS633S0100000_19(this, 161), 6);
        }
        ProfilePlatformViewModel profilePlatformViewModelYp = yp();
        if (profilePlatformViewModelYp != null) {
            C736680Sv4.LJIIIIZZ(this, profilePlatformViewModelYp, new C2217381BqS() { // from class: X.0iZl
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLJJI;
                }
            }, null, new AwS633S0100000_19(this, 162), 6);
        }
        ProfilePlatformViewModel profilePlatformViewModelYp2 = yp();
        if (profilePlatformViewModelYp2 != null) {
            C736680Sv4.LJIIIIZZ(this, profilePlatformViewModelYp2, new C2217381BqS() { // from class: X.0iav
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLJJJJJIL;
                }
            }, null, new AwS633S0100000_19(this, 163), 6);
        }
        ProfilePlatformViewModel profilePlatformViewModelYp3 = yp();
        if (profilePlatformViewModelYp3 != null) {
            profilePlatformViewModelYp3.FQ2(new AwS598S0100000_19(this, 484));
        }
    }

    public final int Ap() {
        return ((Number) this.LLLII.getValue()).intValue();
    }

    public final BioTranslationViewModel Bp() {
        return (BioTranslationViewModel) this.LLJLILLLLZIIL.getValue();
    }

    public final void Fp() {
        TuxTextView tuxTextView = this.LLJLLL;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.a1h);
        }
    }

    public final void Gp() {
        int i = C1248440iao.LIZ[this.LLLFFI.ordinal()];
        if (i == 1 || i == 2) {
            return;
        }
        if (i == 3) {
            TuxTextView tuxTextView = this.LLJLLL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
                return;
            }
            return;
        }
        if (i != 4) {
            throw new C1954807lC();
        }
        TuxTextView tuxTextView2 = this.LLJLLL;
        if (tuxTextView2 != null) {
            HandlerHook.viewPost(tuxTextView2, new ARunnableS106S0100000_6(this, 214));
        }
    }

    @Override // X.InterfaceC1248320iac
    public final void fm() {
        Describe describe;
        int i = C1248440iao.LIZ[this.LLLFFI.ordinal()];
        if (i == 3) {
            TuxTextView tuxTextView = this.LLJLLL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
        } else if (i == 4) {
            TuxTextView tuxTextView2 = this.LLJLLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setMaxLines(5);
            }
            T t = this.LLJJLIIIJLLLLLLLZ;
            String text = (t == 0 || (describe = t.getDescribe()) == null) ? null : describe.getText();
            BioSignatureData bioSignatureData = (BioSignatureData) this.LLJJLIIIJLLLLLLLZ;
            List<SignatureExtraInfo> signatureExtra = bioSignatureData != null ? bioSignatureData.getSignatureExtra() : null;
            BioTranslationViewModel bioTranslationViewModelBp = Bp();
            if (bioTranslationViewModelBp != null) {
                C11JF c11jf = bioTranslationViewModelBp.LL;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                bioTranslationViewModelBp.setState(new AwS133S1100000_19(text, (String) signatureExtra, (List<IMUser>) 26));
            }
            if (signatureExtra == null) {
                signatureExtra = C13BV.INSTANCE;
            }
            IP2(text, signatureExtra);
        }
        this.LLLFFI = EnumC1248450iap.NORMAL;
    }

    public final int zp() {
        return ((Number) this.LLLIIII.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Context context;
        Activity activityLIZ;
        super.onCreate();
        if (!((Boolean) this.LLLIIIIL.getValue()).booleanValue() || (context = getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        C487280J9a.LIZ(activityLIZ.hashCode(), this);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (((Boolean) this.LLLIIIIL.getValue()).booleanValue()) {
            C487280J9a.LIZJ(this);
        }
        lp(EnumC1248370iah.BIO, "HAS_BIO_SIGNATURE", false);
        if (q1()) {
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().signature = null;
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().setSignatureExtra(null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        String text;
        Describe describe;
        ProfileCommonInfo profileCommonInfoVo;
        UserRelationInfo userRelationInfo;
        Describe describe2;
        if (C300150Bpd.LIZ()) {
            T t = this.LLJJLIIIJLLLLLLLZ;
            if (t == 0 || (describe2 = t.getDescribe()) == null || (text = describe2.getText()) == null) {
                text = "";
            }
        } else {
            T t2 = this.LLJJLIIIJLLLLLLLZ;
            text = (t2 == 0 || (describe = t2.getDescribe()) == null) ? null : describe.getText();
        }
        if (!Intrinsics.LJFF(this.LLLFZ, text) || (((profileCommonInfoVo = Vo()) == null || (userRelationInfo = profileCommonInfoVo.getUserRelationInfo()) == null || !Intrinsics.LJFF(userRelationInfo.isBlocking(), Boolean.TRUE)) && this.LLJLIL)) {
            this.LLJLIL = false;
            this.LLLFZ = text != null ? text : "";
            BioSignatureData bioSignatureData = (BioSignatureData) this.LLJJLIIIJLLLLLLLZ;
            List<SignatureExtraInfo> signatureExtra = bioSignatureData != null ? bioSignatureData.getSignatureExtra() : null;
            BioTranslationViewModel bioTranslationViewModelBp = Bp();
            if (bioTranslationViewModelBp != null) {
                C11JF c11jf = bioTranslationViewModelBp.LL;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                bioTranslationViewModelBp.setState(new AwS133S1100000_19(text, (String) signatureExtra, (List<IMUser>) 26));
            }
            if (signatureExtra == null) {
                signatureExtra = C13BV.INSTANCE;
            }
            IP2(text, signatureExtra);
            Gp();
            FrameLayout frameLayout = this.LLJZ;
            if (frameLayout != null) {
                HandlerHook.viewPost(frameLayout, new ARunnableS119S0100000_19(this, 116));
            }
        }
    }

    @Override // X.InterfaceC1248320iac
    public final int a() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1248320iac
    public final EnumC1248450iap h() {
        return this.LLLFFI;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ISignatureAbility
    public final TuxTextView ig0() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC1248320iac
    public final void Bk(EnumC1248450iap enumC1248450iap) {
        this.LLLFFI = enumC1248450iap;
        Gp();
    }

    public final void Ep(EnumC1065850dqJ enumC1065850dqJ) {
        ClickSeeTranslationInBioEvent clickSeeTranslationInBioEvent = new ClickSeeTranslationInBioEvent();
        String str = null;
        clickSeeTranslationInBioEvent.LIZ().add(new C0259006v(null, C161N.LIZIZ.LLIIZ(), null, getEnterFrom()));
        if (((Boolean) C1EDI.LIZLLL.getValue()).booleanValue()) {
            if (enumC1065850dqJ == EnumC1065850dqJ.TAP) {
                str = "click";
            } else {
                str = "long_press";
            }
        }
        clickSeeTranslationInBioEvent.LJI(str, "action_type");
        clickSeeTranslationInBioEvent.LJIIIIZZ();
    }

    public final void Ip(View view) {
        C1251350ifV state;
        ProfilePlatformViewModel profilePlatformViewModelYp = yp();
        if (profilePlatformViewModelYp != null && (state = profilePlatformViewModelYp.getState()) != null && state.LLJJIJIL) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(2131821350);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void Jp(EnumC1065850dqJ enumC1065850dqJ) {
        int i;
        C0P0T c0p0tLIZIZ;
        String str;
        C1248430ian state;
        int iIntValue;
        int i2;
        Integer numLIZJ;
        String str2;
        if (((Boolean) C1EDI.LIZLLL.getValue()).booleanValue()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
            if (enumC1065850dqJ == EnumC1065850dqJ.TAP) {
                str2 = "click";
            } else {
                str2 = "long_press";
            }
            c2344009Gk.LJIIIIZZ("action_type", str2);
            C20684815ws.LJIILLIIL("bio_translation_entrance_show", c2344009Gk.LIZ);
        }
        if (!this.LLLFF) {
            this.LLLFF = true;
            FrameLayout frameLayout = this.LLJZ;
            Context context = getContext();
            BioTranslationViewModel bioTranslationViewModelBp = Bp();
            if (bioTranslationViewModelBp != null && bioTranslationViewModelBp.getState().LLIZ == EnumC1248480ias.ORIGINAL) {
                i = 2131847255;
            } else {
                i = R.string.suj;
            }
            if (frameLayout != null) {
                C450860Hm8 c450860Hm8 = new C450860Hm8(frameLayout.getContext());
                c450860Hm8.LLILLJJLI.LIZIZ = frameLayout;
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uj, context)) != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -16777216;
                }
                c450860Hm8.LJI(iIntValue);
                c450860Hm8.LLILLJJLI.LJII = -1001L;
                c450860Hm8.LJIIJ(new AwS46S0301000_19(i, this, frameLayout, enumC1065850dqJ, 3));
                c450860Hm8.LIZLLL();
                C1391600mJi c1391600mJi = c450860Hm8.LLILLJJLI;
                c1391600mJi.LJIJJ = true;
                c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                c450860Hm8.LJ(new AwS563S0100000_19(this, 3048));
                if (C268330AfP.LJIIIZ()) {
                    i2 = -(((C1743690vTb.LIZIZ() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) / 2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                } else {
                    i2 = 0;
                }
                c450860Hm8.LLILLJJLI.LJI = i2;
                c450860Hm8.LIZJ(new AwS598S0100000_19(this, 665));
                c0p0tLIZIZ = c450860Hm8.LIZIZ();
            } else {
                c0p0tLIZIZ = null;
            }
            this.LLJLLIL = c0p0tLIZIZ;
            BioTranslationViewModel bioTranslationViewModelBp2 = Bp();
            if (bioTranslationViewModelBp2 != null && bioTranslationViewModelBp2.getState().LLIZ == EnumC1248480ias.ORIGINAL) {
                SeeTranslationShowInBioEvent seeTranslationShowInBioEvent = new SeeTranslationShowInBioEvent();
                seeTranslationShowInBioEvent.LIZ().add(new C0259006v(enumC1065850dqJ.getValue(), C161N.LIZIZ.LLIIZ(), null, null));
                seeTranslationShowInBioEvent.LJIIIIZZ();
            } else {
                SeeOriginalShowInBioEvent seeOriginalShowInBioEvent = new SeeOriginalShowInBioEvent();
                String value = enumC1065850dqJ.getValue();
                String strLLIIZ = C161N.LIZIZ.LLIIZ();
                BioTranslationViewModel bioTranslationViewModelBp3 = Bp();
                if (bioTranslationViewModelBp3 != null && (state = bioTranslationViewModelBp3.getState()) != null) {
                    str = state.LLILZ;
                } else {
                    str = null;
                }
                seeOriginalShowInBioEvent.LIZ().add(new C0259006v(value, strLLIIZ, str, null));
                seeOriginalShowInBioEvent.LJIIIIZZ();
            }
            C0P0T c0p0t = this.LLJLLIL;
            this.LLJLLIL = c0p0t;
            if (c0p0t != null) {
                c0p0t.show();
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        FrameLayout frameLayout;
        TuxTextView tuxTextView;
        TuxIconView tuxIconView;
        TuxTextView tuxTextView2;
        TuxTextView tuxTextView3;
        Context context = getContext();
        String string = null;
        if (context != null) {
            frameLayout = new FrameLayout(context);
        } else {
            frameLayout = null;
        }
        this.LLJZ = frameLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        Context context2 = getContext();
        if (context2 != null) {
            this.LLLI.getValue().getClass();
            Integer numValueOf = Integer.valueOf(C1248230iaT.LJIIL());
            this.LLLI.getValue().getClass();
            Integer numValueOf2 = Integer.valueOf(C1248230iaT.LJIILIIL());
            this.LLLI.getValue().getClass();
            C426750GoL.LJIIJ(layoutParams, context2, numValueOf, numValueOf2, Integer.valueOf(C1248230iaT.LJIIL()), 0, 32);
        }
        FrameLayout frameLayout2 = this.LLJZ;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams);
        }
        C1248870ibV.LIZJ(this.LLJZ, profileComponentUIConfig, true, false);
        Context context3 = getContext();
        if (context3 != null) {
            C19252910Tv.LIZIZ.LIZLLL().LJI().LJJJJIZL(this.LLJZ, context3, null, null);
        }
        Context context4 = getContext();
        if (context4 != null) {
            tuxTextView = new TuxTextView(context4, null, 6, 0);
        } else {
            tuxTextView = null;
        }
        this.LLJLLL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setGravity(Ap());
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LJI().LLIIIL(this.LLJLLL, null, null);
        TuxTextView tuxTextView4 = this.LLJLLL;
        if (tuxTextView4 != null) {
            tuxTextView4.setMaxLines(5);
        }
        TuxTextView tuxTextView5 = this.LLJLLL;
        if (tuxTextView5 != null) {
            tuxTextView5.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (C268330AfP.LJIIIZ() && (tuxTextView3 = this.LLJLLL) != null) {
            tuxTextView3.setTextAlignment(5);
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, Ap());
        c19252910Tv.LIZLLL().LJI().LJJIIZI(layoutParams2, null, null);
        TuxTextView tuxTextView6 = this.LLJLLL;
        if (tuxTextView6 != null) {
            tuxTextView6.setOnTouchListener(new ATListenerS452S0100000_19(this, 9));
        }
        TuxTextView tuxTextView7 = this.LLJLLL;
        if (tuxTextView7 != null) {
            C786410Ut5.h9(tuxTextView7, new ACListenerS154S0100000_19(this, 238));
        }
        TuxTextView tuxTextView8 = this.LLJLLL;
        if (tuxTextView8 != null) {
            tuxTextView8.setOnLongClickListener(new ViewOnLongClickListenerC1265920j30(this, 5));
        }
        TuxTextView tuxTextView9 = this.LLJLLL;
        if (tuxTextView9 != null) {
            C786410Ut5.LLLLZLL(tuxTextView9, 0);
        }
        FrameLayout frameLayout3 = this.LLJZ;
        if (frameLayout3 != null) {
            frameLayout3.addView(this.LLJLLL, layoutParams2);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.LLJZIJLIL = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.LLJZIJLIL;
        if (linearLayout2 != null) {
            linearLayout2.setGravity(Ap());
        }
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1, Ap());
        Context context5 = getContext();
        if (context5 != null) {
            tuxIconView = new TuxIconView(context5, null, 0, 6, null);
            tuxIconView.setId(R.id.ocu);
        } else {
            tuxIconView = null;
        }
        Context context6 = getContext();
        if (context6 != null) {
            if (tuxIconView != null) {
                C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams((int) C11VU.LIZIZ(14.0f, context6), (int) C11VU.LIZIZ(14.0f, context6)));
                tuxIconView.setIconRes(R.raw.icon_spinner_normal);
            }
        } else if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_spinner_normal);
        }
        if (tuxIconView != null) {
            tuxIconView.setTintColor(C475630Ikz.LIZIZ(R.attr.a1k, getContext()));
            ObjectAnimator duration = ObjectAnimator.ofFloat(tuxIconView, "rotation", 0.0f, 360.0f).setDuration(800L);
            this.LLL = duration;
            if (duration != null) {
                duration.setInterpolator(new LinearInterpolator());
            }
            ObjectAnimator objectAnimator = this.LLL;
            if (objectAnimator != null) {
                objectAnimator.setRepeatCount(-1);
            }
        }
        Context context7 = getContext();
        if (context7 != null) {
            tuxTextView2 = new TuxTextView(context7, null, 6, 0);
            tuxTextView2.setId(R.id.ocv);
            C786410Ut5.R6(tuxTextView2, new LinearLayout.LayoutParams(-2, -2));
            tuxTextView2.setGravity(Ap());
            Context context8 = getContext();
            if (context8 != null) {
                string = context8.getString(R.string.dzs);
            }
            tuxTextView2.setText(string);
            tuxTextView2.setTextColor(C475630Ikz.LIZIZ(R.attr.a1k, getContext()));
        } else {
            tuxTextView2 = null;
        }
        LinearLayout linearLayout3 = this.LLJZIJLIL;
        if (linearLayout3 != null) {
            linearLayout3.addView(tuxIconView);
        }
        LinearLayout linearLayout4 = this.LLJZIJLIL;
        if (linearLayout4 != null) {
            linearLayout4.addView(tuxTextView2);
        }
        LinearLayout linearLayout5 = this.LLJZIJLIL;
        if (linearLayout5 != null) {
            C786410Ut5.LJZL(8, linearLayout5);
        }
        FrameLayout frameLayout4 = this.LLJZ;
        if (frameLayout4 != null) {
            frameLayout4.addView(this.LLJZIJLIL, layoutParams3);
        }
        return this.LLJZ;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C1250210idf.LIZ(nVar.toString(), BioSignatureData.class);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent
    public final void up(View view) {
        if (view != null) {
            String str = "";
            if (C2532609wC.LIZIZ()) {
                IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
                if (iHeaderBioAbility != null) {
                    String str2 = this.assemTagInternal;
                    if (str2 != null) {
                        str = str2;
                    }
                    iHeaderBioAbility.rQ2(this.LLJILLL, view, str);
                    return;
                }
                return;
            }
            IHeaderBioAbility iHeaderBioAbility2 = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
            if (iHeaderBioAbility2 == null) {
                return;
            }
            String str3 = this.assemTagInternal;
            if (str3 != null) {
                str = str3;
            }
            iHeaderBioAbility2.LJIIIZ(this.LLJILLL, view, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ISignatureAbility
    public final void IP2(String str, List list) {
        TuxTextView tuxTextView;
        String str2;
        ProfileCommonInfo profileCommonInfoVo;
        UserRelationInfo userRelationInfo;
        C1248430ian state;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("BaseUIComponent", "displayUserSignature signature");
        ProfileViewModel profileViewModel = this.LLJLL;
        if (profileViewModel != null) {
            C1252550ihR.LIZ.getClass();
            profileViewModel.hR2(C1252550ihR.LJIILLIIL());
        }
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            TuxTextView tuxTextView2 = this.LLJLLL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
        } else {
            TuxTextView tuxTextView3 = this.LLJLLL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
            }
            if (((Boolean) this.LLLIIL.getValue()).booleanValue() && (tuxTextView = this.LLJLLL) != null) {
                tuxTextView.setTuxFont(61);
            }
        }
        ProfileViewModel profileViewModel2 = this.LLJLL;
        if (profileViewModel2 != null) {
            C1252550ihR.LIZ.getClass();
            profileViewModel2.hR2(C1252550ihR.LJIILLIIL());
        }
        BioTranslationViewModel bioTranslationViewModelBp = Bp();
        if (bioTranslationViewModelBp != null && (state = bioTranslationViewModelBp.getState()) != null) {
            str2 = state.LL;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2) && q1()) {
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().signature = str;
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().setSignatureExtra(list);
        }
        C1250580ieG.LIZJ(this.LLJLLL, str, list, Boolean.valueOf(q1()));
        if (C1216270hkv.LIZLLL(this.LLJLLL) && ((profileCommonInfoVo = Vo()) == null || (userRelationInfo = profileCommonInfoVo.getUserRelationInfo()) == null || !Intrinsics.LJFF(userRelationInfo.isBlocking(), Boolean.TRUE))) {
            z = true;
        }
        lp(EnumC1248370iah.BIO, "HAS_BIO_SIGNATURE", z);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C0P0T c0p0t;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LJI().LLIIIL(this.LLJLLL, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
        c19252910Tv.LIZLLL().LJI().LLJJJ(this.LLJZ, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
        Context context = getContext();
        if (context != null) {
            c19252910Tv.LIZLLL().LJI().LJJJJIZL(this.LLJZ, context, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
        }
        if (((Boolean) this.LLLIIIIL.getValue()).booleanValue() && (c0p0t = this.LLJLLIL) != null) {
            c0p0t.dismiss();
        }
    }
}
