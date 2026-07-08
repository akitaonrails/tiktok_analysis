package com.ss.android.ugc.profile.business.ur.platform;

import X.C019F;
import X.C01GW;
import X.C0OBG;
import X.C1243370iSd;
import X.C1243400iSg;
import X.C1243410iSh;
import X.C1247000iYU;
import X.C1249090ibr;
import X.C1250080idS;
import X.C1250210idf;
import X.C1253000iiA;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1390920mIc;
import X.C13LE;
import X.C14KQ;
import X.C1558520qew;
import X.C1637806bA;
import X.C1720106oR;
import X.C19719912Dl;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C259800zU;
import X.C268330AfP;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427690Gpr;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1252150ign;
import X.InterfaceC1243310iSX;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS122S0200000_19;
import Y.ACListenerS141S0100000_6;
import Y.AObserverS223S0100000_19;
import Y.ARunnableS52S0300000_19;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.business.ur.follow.UserProfileFollowVM;
import com.ss.android.ugc.profile.business.ur.nickname.IProfileInfoOtherNicknameAbility;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserAccountInfo;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavBarOtherNicknameAbility;
import com.ss.android.ugc.ur.alias.IAliasService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderCTASettingsButtonComponent extends HeaderCTABaseUIComponent {
    public static final C1250080idS LLLFZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public static final int LLLII;
    public final AssemVMLazy LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public SettingsButtonData LLLFF;
    public boolean LLLFFI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0idS] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HeaderCTASettingsButtonComponent.class, "userProfileFollowVM", "getUserProfileFollowVM()Lcom/ss/android/ugc/profile/business/ur/follow/UserProfileFollowVM;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLFZ = new Object() { // from class: X.0idS
        };
        LLLII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(117));
    }

    public HeaderCTASettingsButtonComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UserProfileFollowVM.class);
        this.LLJZIJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2397), AFwS257S0000000_19.get$arr$(444), null, true);
        this.LLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2395));
        this.LLLF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2396));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        super.tp();
        if (C268330AfP.LJFF()) {
            Qp(dq(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), true, Integer.valueOf(R.raw.icon_arrow_triangle_down_large_fill));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        Context context;
        C19EG c19egLIZIZ;
        User userAq;
        HashMap<String, String> map;
        Set<String> setKeySet;
        Integer aliasPermission;
        String uid;
        IAliasService iAliasService;
        if (C0OBG.LIZIZ(Bp()) || (context = getContext()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (userAq = aq()) == null) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        String str = null;
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.eit, null);
        LinearLayout linearLayout = (LinearLayout) viewLJLLJ.findViewById(R.id.a2s);
        TextView textView = (TextView) viewLJLLJ.findViewById(R.id.y3j);
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.wh3);
        if (C1253000iiA.LIZ()) {
            SettingsButtonData settingsButtonData = this.LLLFF;
            Integer aliasPermission2 = settingsButtonData != null ? settingsButtonData.getAliasPermission() : null;
            User userAq2 = aq();
            if (!C1247000iYU.LIZLLL(aliasPermission2, userAq2 != null ? Integer.valueOf(userAq2.getFollowStatus()) : null)) {
                textView.setText(userAq.getNickname());
                C786410Ut5.LLLLZLL(tuxTextView, 8);
                if (C1247000iYU.LIZIZ(userAq) != null && (uid = userAq.getUid()) != null && (iAliasService = (IAliasService) PluggableExtentionKt.pluggableSpi$default(IAliasService.class, false, false, false, 14, null)) != null) {
                    iAliasService.LJIIIZ(uid);
                }
            } else if (C1247000iYU.LIZIZ(userAq) != null) {
                textView.setText(C1247000iYU.LIZIZ(userAq));
                tuxTextView.setText(context.getString(2131824789, userAq.getNickname()));
            } else {
                textView.setText(userAq.getNickname());
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        } else {
            textView.setText(userAq.getNickname());
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        if (C1253000iiA.LIZ()) {
            SettingsButtonData settingsButtonData2 = this.LLLFF;
            Integer aliasPermission3 = settingsButtonData2 != null ? settingsButtonData2.getAliasPermission() : null;
            User userAq3 = aq();
            if (C1247000iYU.LIZLLL(aliasPermission3, userAq3 != null ? Integer.valueOf(userAq3.getFollowStatus()) : null)) {
                Xp(linearLayout, R.raw.icon_pen, C1253000iiA.LIZIZ(C1247000iYU.LIZIZ(userAq) != null), true, new ACListenerS122S0200000_19(c259800zU, this, 82));
            } else {
                Xp(linearLayout, R.raw.icon_pen, C1253000iiA.LIZIZ(C1247000iYU.LIZIZ(userAq) != null), false, new ACListenerS122S0200000_19(c259800zU, this, 83));
            }
        }
        if (this.LLLFFI) {
            Xp(linearLayout, R.raw.icon_person_minus, 2131857735, true, new ACListenerS122S0200000_19(c259800zU, this, 84));
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIII = viewLJLLJ;
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context);
        ?? r4 = c1390920mIc.LIZ;
        r4.LLJI = numLIZJ;
        c259800zU.element = r4;
        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.e2g);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZ = R.raw.icon_x_mark_small;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context)));
        C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(c259800zU, 149));
        C1243400iSg c1243400iSg = C1243400iSg.LIZ;
        int followStatus = userAq.getFollowStatus();
        boolean z = C1247000iYU.LIZIZ(userAq) != null;
        SettingsButtonData settingsButtonData3 = this.LLLFF;
        int iIntValue = (settingsButtonData3 == null || (aliasPermission = settingsButtonData3.getAliasPermission()) == null) ? 0 : aliasPermission.intValue();
        SettingsButtonData settingsButtonData4 = this.LLLFF;
        Integer aliasPermission4 = settingsButtonData4 != null ? settingsButtonData4.getAliasPermission() : null;
        User userAq4 = aq();
        boolean zLIZLLL = C1247000iYU.LIZLLL(aliasPermission4, userAq4 != null ? Integer.valueOf(userAq4.getFollowStatus()) : null);
        C1249090ibr c1249090ibr = (C1249090ibr) fq().LLILLJJLI.getValue();
        if (c1249090ibr != null && (map = c1249090ibr.LLIZ) != null && (setKeySet = map.keySet()) != null && setKeySet.contains("to_acc_type")) {
            str = "org_acc";
        }
        C1243410iSh c1243410iSh = new C1243410iSh(followStatus, iIntValue, zLIZLLL ? 1 : 0, "others_homepage", "click_setting_button", "show", str, z);
        c1243400iSg.getClass();
        C1243400iSg.LIZIZ(c1243410iSh);
        ((DialogFragment) c259800zU.element).show(c19egLIZIZ.getSupportFragmentManager(), "cta_settings_button_sheet");
    }

    public final UserProfileFollowVM fq() {
        AssemVMLazy assemVMLazy = this.LLJZIJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
        return (UserProfileFollowVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final Integer up() {
        Icon icon;
        Integer iconInt$default;
        BizBaseData bizBaseData = this.LLJLLL;
        int iIntValue = R.raw.icon_person_gear_fill;
        if (bizBaseData != null && (icon = bizBaseData.getIcon()) != null && (iconInt$default = Icon.getIconInt$default(icon, null, Integer.valueOf(R.raw.icon_person_gear_fill), 1, null)) != null) {
            iIntValue = iconInt$default.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        Integer numValueOf;
        super.Go();
        Ip();
        User userAq = aq();
        if (userAq == null || (numValueOf = Integer.valueOf(userAq.getFollowStatus())) == null || !(numValueOf.intValue() == 1 || numValueOf.intValue() == 2 || numValueOf.intValue() == 4)) {
            Gp();
        } else {
            Ip();
        }
        jq();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Ho() {
        fq().LLJILLL.observe(this, new AObserverS223S0100000_19(this, 46));
    }

    public final User aq() {
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility != null) {
            return userProfileAbility.getUser();
        }
        return null;
    }

    public final String dq() {
        Describe describe;
        Describe describe2;
        if (!C268330AfP.LJFF()) {
            BizBaseData bizBaseData = this.LLJLLL;
            if (bizBaseData == null || (describe = bizBaseData.getDescribe()) == null || describe.getText() == null) {
                Context context = getContext();
                if (context != null) {
                    return context.getString(2131845430);
                }
                return null;
            }
            BizBaseData bizBaseData2 = this.LLJLLL;
            if (bizBaseData2 == null || (describe2 = bizBaseData2.getDescribe()) == null) {
                return null;
            }
            return describe2.getText();
        }
        EnumC1252150ign value = fq().LLJILLL.getValue();
        User userAq = aq();
        if (userAq != null && userAq.isSecret()) {
            Context context2 = getContext();
            if (context2 != null) {
                return context2.getString(2131845430);
            }
            return null;
        }
        if (value == EnumC1252150ign.UNFOLLOW) {
            Context context3 = getContext();
            if (context3 != null) {
                return context3.getString(R.string.jrk);
            }
            return null;
        }
        if (value == EnumC1252150ign.DOUBLE_CANCEL) {
            Context context4 = getContext();
            if (context4 != null) {
                return context4.getString(2131834932);
            }
            return null;
        }
        Context context5 = getContext();
        if (context5 != null) {
            return context5.getString(2131845430);
        }
        return null;
    }

    public final void iq() {
        Integer aliasPermission;
        User userAq = aq();
        Context context = getContext();
        if (userAq == null || context == null) {
            return;
        }
        String str = C1247000iYU.LIZIZ(userAq) != null ? "edit_name" : "add_another_username";
        int followStatus = userAq.getFollowStatus();
        boolean z = C1247000iYU.LIZIZ(userAq) != null;
        SettingsButtonData settingsButtonData = this.LLLFF;
        int iIntValue = (settingsButtonData == null || (aliasPermission = settingsButtonData.getAliasPermission()) == null) ? 0 : aliasPermission.intValue();
        SettingsButtonData settingsButtonData2 = this.LLLFF;
        Integer aliasPermission2 = settingsButtonData2 != null ? settingsButtonData2.getAliasPermission() : null;
        User userAq2 = aq();
        C1243410iSh c1243410iSh = new C1243410iSh("others_homepage", "click_setting_button", str, followStatus, z, iIntValue, C1247000iYU.LIZLLL(aliasPermission2, userAq2 != null ? Integer.valueOf(userAq2.getFollowStatus()) : null) ? 1 : 0);
        C1243400iSg.LIZ.getClass();
        C1243400iSg.LIZIZ(c1243410iSh);
        ((IAliasService) ServiceManager.get().getService(IAliasService.class)).LJII(userAq, context, c1243410iSh, new InterfaceC1243310iSX() { // from class: X.0ia6
            @Override // X.InterfaceC1243310iSX
            public final void onFailed() {
            }

            @Override // X.InterfaceC1243310iSX
            public final void LIZJ(String str2, boolean z2) {
                if (C1249540ica.LIZ) {
                    IProfileInfoOtherNicknameAbility iProfileInfoOtherNicknameAbility = (IProfileInfoOtherNicknameAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), IProfileInfoOtherNicknameAbility.class, null);
                    if (iProfileInfoOtherNicknameAbility != null) {
                        iProfileInfoOtherNicknameAbility.CP0(Boolean.valueOf(!z2), str2);
                        return;
                    }
                    return;
                }
                INavBarOtherNicknameAbility iNavBarOtherNicknameAbility = (INavBarOtherNicknameAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), INavBarOtherNicknameAbility.class, null);
                if (iNavBarOtherNicknameAbility == null) {
                    return;
                }
                iNavBarOtherNicknameAbility.ef1(str2, !z2);
            }
        });
    }

    public final void jq() {
        View viewBp = Bp();
        if (viewBp == null || viewBp.getVisibility() != 0) {
            return;
        }
        C1243370iSd.LIZ.getClass();
        if (!C1243370iSd.LIZJ().getBoolean("alias_tooltip_has_shown", false)) {
            View view = this.LLJJ;
            View viewFindViewById = view != null ? view.findViewById(R.id.fa8) : null;
            Context context = getContext();
            if (context == null || viewFindViewById == null) {
                return;
            }
            HandlerHook.viewPost(viewFindViewById, new ARunnableS52S0300000_19(context, viewFindViewById, this, 8));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final String yp() {
        UserAccountInfo userAccountInfo;
        Integer banStatus;
        if (!C268330AfP.LJIIIZ()) {
            return "";
        }
        ProfileCommonInfo profileCommonInfoVo = Vo();
        if (profileCommonInfoVo != null && (userAccountInfo = profileCommonInfoVo.getUserAccountInfo()) != null && (banStatus = userAccountInfo.getBanStatus()) != null && banStatus.intValue() == 1) {
            Wp(((Number) this.LLL.getValue()).intValue(), true);
        } else if (C268330AfP.LJFF()) {
            View viewBp = Bp();
            if ((viewBp instanceof LinearLayout) && viewBp != null) {
                TextView textView = (TextView) viewBp.findViewById(R.id.fad);
                if (textView != null) {
                    textView.setMaxWidth(((((C14KQ.LJIIIIZZ(textView.getContext()) - zp()) - Ep()) - (Fp() * 2)) / 2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxLines(1);
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getTextContent: maxWidth: ");
                    sbLIZ.append(textView.getMaxWidth());
                    C1720106oR.LJI("Profile_HeaderCTASettingsButtonComponent", C2188811AlT.LIZIZ(sbLIZ));
                }
                viewBp.requestLayout();
            }
        } else {
            Wp(((Number) this.LLLF.getValue()).intValue(), false);
        }
        return dq();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        Integer numValueOf;
        User userAq = aq();
        if (userAq != null && (numValueOf = Integer.valueOf(userAq.getFollowStatus())) != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 2 || numValueOf.intValue() == 4)) {
            Ip();
            if (C268330AfP.LJFF()) {
                Qp(dq(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), true, Integer.valueOf(R.raw.icon_arrow_triangle_down_large_fill));
            }
        } else {
            Gp();
        }
        jq();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLLFF = (SettingsButtonData) C1250210idf.LIZ(nVar.toString(), SettingsButtonData.class);
    }

    public final void Xp(LinearLayout linearLayout, int i, int i2, boolean z, View.OnClickListener onClickListener) {
        View viewLJLLJ = C786410Ut5.LJLLJ(getContext(), R.layout.eis, null);
        View viewFindViewById = viewLJLLJ.findViewById(R.id.tsw);
        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.a3r);
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.a48);
        tuxIconView.setIconRes(i);
        tuxTextView.setText(i2);
        C427690Gpr.LJ(viewFindViewById, 0.0f);
        if (z) {
            C786410Ut5.I7(onClickListener, viewLJLLJ);
        } else {
            C786410Ut5.B5(tuxTextView, 0.34f);
            TuxTextView tuxTextView2 = (TuxTextView) viewLJLLJ.findViewById(R.id.a4p);
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
                C786410Ut5.B5(tuxTextView2, 0.34f);
            }
            C786410Ut5.x5(tuxIconView, 0.34f);
        }
        linearLayout.addView(viewLJLLJ);
    }
}
