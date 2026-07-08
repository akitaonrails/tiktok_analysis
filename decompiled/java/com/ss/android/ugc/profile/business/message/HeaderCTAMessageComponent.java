package com.ss.android.ugc.profile.business.message;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C06MM;
import X.C0O26;
import X.C0SY5;
import X.C0XQ7;
import X.C0ZE7;
import X.C1216270hkv;
import X.C1248950ibd;
import X.C1250210idf;
import X.C1251930igR;
import X.C1252230igv;
import X.C1252620ihY;
import X.C1336205Ku;
import X.C14EU;
import X.C14KQ;
import X.C1558520qew;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C23250099c;
import X.C2451109j3;
import X.C268330AfP;
import X.C300150Bpd;
import X.C418440Gaw;
import X.C452501pT;
import X.C595710NYb;
import X.C735370Ssx;
import X.C736400Suc;
import X.C736820SvI;
import X.C814420VxA;
import X.C879340Yea;
import X.C896480ZEw;
import X.C897370ZIh;
import X.C897490ZIt;
import X.EnumC1250640ieM;
import X.EnumC1584370rKd;
import X.InterfaceC897380ZIi;
import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.business.ur.platform.HeaderCTASettingsButtonComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUIData;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderCTAMessageComponent extends HeaderCTABaseUIComponent {
    public static final int LLLFZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    public boolean LLJZIJLIL;
    public boolean LLL;
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2085));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2084));
    public final C01GW LLLFFI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(356));

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        super.Go();
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        if (profilePlatformViewModelZo != null) {
            profilePlatformViewModelZo.TQ2(new AwS598S0100000_19(this, 326));
        }
        ProfilePlatformViewModel profilePlatformViewModelZo2 = Zo();
        if (profilePlatformViewModelZo2 != null) {
            AssemViewModel.selectSubscribe$default(profilePlatformViewModelZo2, new C2217381BqS() { // from class: X.0ifX
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLJLLIL;
                }
            }, C736820SvI.LIZLLL(), null, null, new AwS598S0100000_19(new AwS598S0100000_19(this, 327), 6), 12, null);
        }
        ProfilePlatformViewModel profilePlatformViewModelZo3 = Zo();
        if (profilePlatformViewModelZo3 != null) {
            AssemViewModel.selectSubscribe$default(profilePlatformViewModelZo3, new C2217381BqS() { // from class: X.0ifY
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLJLLL;
                }
            }, C736820SvI.LIZLLL(), null, null, new AwS598S0100000_19(new AwS598S0100000_19(this, 328), 7), 12, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Ho() {
        ViewGroup viewGroup;
        EventBus.LIZLLL().LJIJJ(this);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2451109j3(this, null), 3);
        if (C268330AfP.LJFF() || !((Boolean) C1252620ihY.LIZIZ.getValue()).booleanValue()) {
            return;
        }
        View viewBp = Bp();
        ViewParent parent = viewBp != null ? viewBp.getParent() : null;
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimateParentHierarchy(false);
        layoutTransition.disableTransitionType(0);
        layoutTransition.disableTransitionType(1);
        layoutTransition.disableTransitionType(3);
        if (C300150Bpd.LIZ()) {
            layoutTransition.disableTransitionType(2);
        }
        viewGroup.setLayoutTransition(layoutTransition);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        UserRelationInfo userRelationInfo;
        Integer followStatus;
        User userAq;
        C595710NYb c595710NYbLIZJ;
        ProfileCommonInfo profileCommonInfoVo = Vo();
        if (profileCommonInfoVo == null || (userRelationInfo = profileCommonInfoVo.getUserRelationInfo()) == null || (followStatus = userRelationInfo.getFollowStatus()) == null) {
            return;
        }
        if (followStatus.intValue() != 1 && followStatus.intValue() != 2) {
            if (followStatus.intValue() == 0) {
                jq(null, "airplane_button");
                return;
            }
            return;
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        if (C897370ZIh.LIZ().LJ().LIZ() && (userAq = aq()) != null && userAq.getFollowStatus() == 2) {
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            User userAq2 = aq();
            if (!((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(userAq2 != null ? userAq2.getUid() : null)) {
                User userAq3 = aq();
                ((C0ZE7) this.LLLF.getValue()).LJII = Boolean.valueOf(C896480ZEw.LIZJ((userAq3 == null || (c595710NYbLIZJ = C0O26.LIZJ(AFwS245S0000000_12.get$arr$(263), userAq3)) == null) ? null : C897370ZIh.LIZ().LIZIZ(c595710NYbLIZJ)));
                C0ZE7 c0ze7 = (C0ZE7) this.LLLF.getValue();
                User userAq4 = aq();
                c0ze7.LIZJ = userAq4 != null ? userAq4.getUid() : null;
                C897490ZIt.LIZIZ(c0ze7);
            }
        }
        String str = Intrinsics.LJFF(getText(), C1216270hkv.LIZJ(2131837236)) ? "message" : "sayhi";
        C1252230igv c1252230igvFq = fq();
        String str2 = c1252230igvFq != null ? c1252230igvFq.LLILZ : null;
        if (str2 == null || !Intrinsics.LJFF(str2, "guide_dm")) {
            C736400Suc c736400Suc = C736400Suc.LIZ;
            Context context = getContext();
            Activity activityLIZ = context != null ? C06MM.LIZ(context) : null;
            EnumC1584370rKd enumC1584370rKd = EnumC1584370rKd.PROFILE;
            c736400Suc.getClass();
            C736400Suc.LIZJ(activityLIZ, "enter_chat", enumC1584370rKd, null);
        } else {
            C736400Suc c736400Suc2 = C736400Suc.LIZ;
            User userAq5 = aq();
            c736400Suc2.getClass();
            C736400Suc.LIZLLL(userAq5, str2, "enter_chat");
        }
        jq(str, "button");
    }

    public final User aq() {
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility != null) {
            return userProfileAbility.getUser();
        }
        return null;
    }

    public final int dq() {
        ProfileUIData profileUIData;
        if (!C268330AfP.LJFF()) {
            return C268330AfP.LJIIIZ() ? (((C14KQ.LJIIIIZZ(getContext()) - zp()) - Ep()) - (Fp() * 2)) / 2 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(116));
        }
        ProfileComponents profileComponents = this.LLJJJ;
        if (Intrinsics.LJFF((profileComponents == null || (profileUIData = profileComponents.uiData) == null) ? null : profileUIData.displayStyle, EnumC1250640ieM.PARALLEL.getValue())) {
            return (((C14KQ.LJIIIIZZ(getContext()) - zp()) - Ep()) - (Fp() * 2)) / 2;
        }
        int iLJIIIIZZ = ((C14KQ.LJIIIIZZ(getContext()) - zp()) - Ep()) - (Fp() * 2);
        HeaderCTASettingsButtonComponent.LLLFZ.getClass();
        return iLJIIIIZZ - HeaderCTASettingsButtonComponent.LLLII;
    }

    public final C1252230igv fq() {
        IHeaderBaseAbility iHeaderBaseAbility = (IHeaderBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBaseAbility.class, null);
        if (iHeaderBaseAbility != null) {
            return iHeaderBaseAbility.cA1();
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        UserRelationInfo userRelationInfo;
        Integer followStatus;
        User userAq = aq();
        if (userAq != null) {
            ProfileCommonInfo profileCommonInfoVo = Vo();
            Xp((profileCommonInfoVo == null || (userRelationInfo = profileCommonInfoVo.getUserRelationInfo()) == null || (followStatus = userRelationInfo.getFollowStatus()) == null) ? 0 : followStatus.intValue(), userAq);
            if (Unit.LIZ != null) {
                return;
            }
        }
        Gp();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        if (((Boolean) C268330AfP.LJIJ.getValue()).booleanValue()) {
            C1248950ibd c1248950ibd = this.LLJJI;
            if (c1248950ibd != null) {
                c1248950ibd.LLILLJJLI = profileComponents;
            }
            this.LLJJJ = profileComponents;
        }
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            ep(nVar);
        }
        tp();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        C1250210idf.LIZ(nVar.toString(), MessageData.class);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C879340Yea c879340Yea) {
        String uid;
        String str = c879340Yea.LIZ;
        if (str != null) {
            User userAq = aq();
            if (userAq != null) {
                uid = userAq.getUid();
            } else {
                uid = null;
            }
            if (Intrinsics.LJFF(str, uid)) {
                Vp(C1216270hkv.LIZJ(2131837236));
                if (Intrinsics.LJFF(getText(), C1216270hkv.LIZJ(2131837236)) && ((Boolean) C1252620ihY.LJFF.getValue()).booleanValue()) {
                    Qp(getText(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), false, Integer.valueOf(R.raw.icon_paperplane_fill));
                } else {
                    Vp(getText());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x037a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Xp(int r18, com.ss.android.ugc.aweme.profile.model.User r19) {
        /*
            Method dump skipped, instruction units count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.message.HeaderCTAMessageComponent.Xp(int, com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public final void iq(String str, String str2) {
        LifecycleOwner lifecycleOwnerLIZIZ;
        if (str2 == null) {
            return;
        }
        IIMService iIMServiceLIZ = C1336205Ku.LIZ(false);
        if (!iIMServiceLIZ.getImSayHiService().LJIILJJIL(str2)) {
            return;
        }
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "others_homepage"), new Pair("enter_method", "profile"));
        if (Intrinsics.LJFF(str, "show")) {
            IMSayhiAnalytics imSayhiAnalytics = iIMServiceLIZ.getImSayhiAnalytics();
            Context context = getContext();
            if (context != null) {
                lifecycleOwnerLIZIZ = C0SY5.LIZIZ(context);
            } else {
                lifecycleOwnerLIZIZ = null;
            }
            imSayhiAnalytics.LIZIZ(str2, mapLJIIJ, lifecycleOwnerLIZIZ, true);
            return;
        }
        if (!Intrinsics.LJFF(str, "click")) {
            return;
        }
        iIMServiceLIZ.getImSayhiAnalytics().LIZJ(str2, mapLJIIJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jq(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.message.HeaderCTAMessageComponent.jq(java.lang.String, java.lang.String):void");
    }

    public final void lq(int i, User user, boolean z) {
        if (user == null) {
            return;
        }
        this.LLL = C1252620ihY.LIZIZ(user);
        if (i == 0) {
            if (z) {
                return;
            }
        } else if (!z) {
            return;
        }
        if (!C1252620ihY.LIZIZ(user)) {
            return;
        }
        this.LLL = true;
    }

    public static void kq(int i, User user, String str, boolean z) {
        if (user == null || TextUtils.equals(user.getUid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) || C1336205Ku.LIZJ().LIZJ()) {
            return;
        }
        boolean z2 = false;
        if (((i == 1 || i == 2) && !z) || (i == 0 && z)) {
            String uid = user.getUid();
            if (user.getAccountType() == 3) {
                z2 = true;
            }
            C1251930igR.LIZLLL(i, uid, str, C735370Ssx.LJJIFFI(user), z2);
        }
    }
}
