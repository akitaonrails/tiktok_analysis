package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base;

import X.C01GW;
import X.C09YG;
import X.C0LAB;
import X.C1248270iaX;
import X.C1248300iaa;
import X.C1248840ibS;
import X.C1248950ibd;
import X.C1250210idf;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1558520qew;
import X.C197039127h;
import X.C20684815ws;
import X.C2215381BnE;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1248260iaW;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.google.gson.n;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.DialogInfo;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUIData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileUserInfoManageBaseComponent<T extends BizBaseData> extends BaseUIComponent {
    public static final int LLJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
    public static final int LLJLILLLLZIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    public static final int LLJLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
    public static final int LLJLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(61));
    public static final int LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    public static final int LLJZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
    public static final int LLJZIJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
    public static final int LLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    public static final int LLLF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
    public static final C01GW<Integer> LLLFF = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(565));
    public static final C01GW<Integer> LLLFFI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(563));
    public static final C01GW<Integer> LLLFZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(564));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS563S0100000_19((ProfileUserInfoManageBaseComponent) this, 2527));
    public T LLJJLIIIJLLLLLLLZ;
    public String LLJL;

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        IUserInfoManageAbility iUserInfoManageAbility;
        View view = this.LLJJ;
        if (view == null || (iUserInfoManageAbility = (IUserInfoManageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IUserInfoManageAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        C1248950ibd c1248950ibd = (C1248950ibd) this.LLJJL.getValue();
        iUserInfoManageAbility.LJIIIZ(c1248950ibd != null ? c1248950ibd.LL : -1, view, str);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        C1248950ibd c1248950ibd;
        ProfileComponents profileComponents;
        List<EventParams> list;
        ProfileComponents profileComponents2;
        List<Action> list2;
        C1248950ibd c1248950ibd2 = (C1248950ibd) this.LLJJL.getValue();
        if (c1248950ibd2 != null && (profileComponents2 = c1248950ibd2.LLILLJJLI) != null && (list2 = profileComponents2.actions) != null) {
            for (Action action : list2) {
                String type = action.getType();
                if (Intrinsics.LJFF(type, "router")) {
                    Context context = getContext();
                    Action.RouterInfo router = action.getRouter();
                    SmartRouter.buildRoute(context, router != null ? router.getUrl() : null).open();
                } else if (Intrinsics.LJFF(type, "dialog")) {
                    C2215381BnE c2215381BnE = C2215381BnE.LIZ;
                    Context context2 = getContext();
                    DialogInfo dialog = action.getDialog();
                    c2215381BnE.getClass();
                    C1397580mTM c1397580mTMLIZIZ = C2215381BnE.LIZIZ(context2, dialog);
                    if (c1397580mTMLIZIZ != null) {
                        new C1397510mTF(c1397580mTMLIZIZ).LIZLLL();
                    }
                }
            }
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("entrance", "click_edit_profile");
        C20684815ws.LJIILLIIL("profile_empty_guide_click", c0lab.LIZ);
        if (!cp() || (c1248950ibd = this.LLJJI) == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (list = profileComponents.eventParams) == null) {
            return;
        }
        C1248840ibS.LIZ(C1248840ibS.LIZ, C09YG.TYPE_CLICK.getType(), list, new AwS668S0100000_19(this, 30), 4);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        String str;
        T t;
        Integer numValueOf;
        EnumC1248260iaW enumC1248260iaWLJJIIZI;
        C197039127h c197039127h;
        Describe describe;
        String text;
        Icon icon;
        Icon icon2;
        Describe describe2;
        C197039127h c197039127h2;
        Describe describe3;
        String text2;
        C197039127h c197039127h3;
        Icon icon3;
        Icon icon4;
        ProfileComponents profileComponents;
        ProfileUIData profileUIData;
        ProfileComponents profileComponents2;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp2 = ap();
        String iconColor = null;
        op(Boolean.valueOf((profilePlatformProtocolAp2 != null && profilePlatformProtocolAp2.LJJJZ()) || (profilePlatformProtocolAp = ap()) == null || Boolean.valueOf(profilePlatformProtocolAp.LJJJZ()) == null));
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd == null || (profileComponents2 = c1248950ibd.LLILLJJLI) == null || (str = profileComponents2.componentId) == null) {
            str = this.LLJILJIL;
        }
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp3 = ap();
        if (profilePlatformProtocolAp3 == null || (t = profilePlatformProtocolAp3.LLJILJIL) == null) {
            t = this.LLJJLIIIJLLLLLLLZ;
        }
        C1248950ibd c1248950ibd2 = this.LLJJI;
        if (c1248950ibd2 == null || (profileComponents = c1248950ibd2.LLILLJJLI) == null || (profileUIData = profileComponents.uiData) == null || (numValueOf = profileUIData.type) == null) {
            ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp4 = ap();
            numValueOf = (profilePlatformProtocolAp4 == null || (enumC1248260iaWLJJIIZI = profilePlatformProtocolAp4.LJJIIZI()) == null) ? null : Integer.valueOf(enumC1248260iaWLJJIIZI.getType());
        }
        int type = EnumC1248260iaW.ICON.getType();
        if (numValueOf != null && numValueOf.intValue() == type) {
            View view = this.LLJJ;
            if (!(view instanceof C197039127h) || (c197039127h3 = (C197039127h) view) == null) {
                return;
            }
            c197039127h3.setText("");
            T t2 = this.LLJJLIIIJLLLLLLLZ;
            String localIcon = (t2 == null || (icon4 = t2.getIcon()) == null) ? null : icon4.getLocalIcon();
            T t3 = this.LLJJLIIIJLLLLLLLZ;
            if (t3 != null && (icon3 = t3.getIcon()) != null) {
                iconColor = icon3.getIconColor();
            }
            C1248270iaX.LIZLLL(c197039127h3, localIcon, iconColor, str, C1308910kAL.LIZJ(R.attr.a1h, c197039127h3.getContext()), Integer.valueOf(R.raw.icon_pen));
            return;
        }
        int type2 = EnumC1248260iaW.TEXT.getType();
        if (numValueOf != null && numValueOf.intValue() == type2) {
            View view2 = this.LLJJ;
            if (!(view2 instanceof C197039127h) || (c197039127h2 = (C197039127h) view2) == null) {
                return;
            }
            c197039127h2.setButtonStartIcon(0);
            C1248270iaX.LIZJ(c197039127h2, t, str, null, null, false, 28);
            if (t == null || (describe3 = t.getDescribe()) == null || (text2 = describe3.getText()) == null) {
                return;
            }
            c197039127h2.setText(text2);
            return;
        }
        int type3 = EnumC1248260iaW.ICON_TEXT.getType();
        if (numValueOf == null || numValueOf.intValue() != type3) {
            return;
        }
        View view3 = this.LLJJ;
        if (!(view3 instanceof C197039127h) || (c197039127h = (C197039127h) view3) == null) {
            return;
        }
        if (!up(c197039127h, (t == null || (describe2 = t.getDescribe()) == null) ? null : describe2.getText())) {
            c197039127h.setButtonStartIcon(0);
            C1248270iaX.LIZJ(c197039127h, t, str, null, null, false, 28);
            if (t == null || (describe = t.getDescribe()) == null || (text = describe.getText()) == null) {
                return;
            }
            c197039127h.setText(text);
            return;
        }
        c197039127h.setText("");
        T t4 = this.LLJJLIIIJLLLLLLLZ;
        String localIcon2 = (t4 == null || (icon2 = t4.getIcon()) == null) ? null : icon2.getLocalIcon();
        T t6 = this.LLJJLIIIJLLLLLLLZ;
        if (t6 != null && (icon = t6.getIcon()) != null) {
            iconColor = icon.getIconColor();
        }
        C1248270iaX.LIZLLL(c197039127h, localIcon2, iconColor, str, C1308910kAL.LIZJ(R.attr.a1h, c197039127h.getContext()), Integer.valueOf(R.raw.icon_pen));
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Ho() {
        C1248950ibd c1248950ibd;
        ProfileComponents profileComponents;
        List<EventParams> list;
        if (!cp() || (c1248950ibd = this.LLJJI) == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (list = profileComponents.eventParams) == null) {
            return;
        }
        C1248840ibS.LIZ(C1248840ibS.LIZ, C09YG.TYPE_SHOW.getType(), list, new AwS668S0100000_19(this, 29), 4);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        View view = this.LLJJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        String string;
        if (cp()) {
            super.Hj(profileComponents);
        }
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            ep(nVar);
            if (cp()) {
                n nVar2 = profileComponents.bizData;
                if (nVar2 != null) {
                    string = nVar2.toString();
                } else {
                    string = null;
                }
                if (Intrinsics.LJFF(string, this.LLJL)) {
                    return;
                } else {
                    this.LLJL = string;
                }
            }
            tp();
            this.LLJL = nVar.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0195  */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig r14) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.ProfileUserInfoManageBaseComponent.So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig):android.view.View");
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C1250210idf.LIZ(nVar.toString(), BizBaseData.class);
    }

    public static boolean up(C197039127h c197039127h, String str) {
        if (str != null && str.length() != 0 && c197039127h.getPaint().measureText(str) + c197039127h.getPaddingStart() + c197039127h.getPaddingEnd() <= C1248300iaa.LIZIZ()) {
            return false;
        }
        return true;
    }
}
