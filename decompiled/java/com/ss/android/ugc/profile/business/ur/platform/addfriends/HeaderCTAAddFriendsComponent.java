package com.ss.android.ugc.profile.business.ur.platform.addfriends;

import X.AbstractC738140SxQ;
import X.C1220000hqw;
import X.C1248720ibG;
import X.C1249210ic3;
import X.C1250210idf;
import X.C1264430j0b;
import X.C127G;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19719912Dl;
import X.C1DGC;
import X.C2082308Dt;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C735800Ste;
import X.C736820SvI;
import X.C736950SvV;
import X.EnumC1248370iah;
import X.EnumC1249840id4;
import X.EnumC1249860id6;
import X.EnumC666200QBe;
import X.InterfaceC1210900hcG;
import Y.AObjectS71S0000000_19;
import android.content.Context;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.service.RouteAddFriendsPageService;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import com.ss.android.ugc.profile.business.ur.entrances.ProfileAddFriendsRedPointsVM;
import com.ss.android.ugc.profile.business.ur.entrances.ProfileMafRedPointsVM;
import com.ss.android.ugc.profile.business.ur.platform.AddFriendsData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderCTAAddFriendsComponent extends HeaderCTABaseUIComponent implements ICTAAddFriendsAbility {
    public static final /* synthetic */ int LLLFZ = 0;
    public final C736950SvV LLJZIJLIL;
    public final C736950SvV LLL;
    public int LLLF;
    public AddFriendsData LLLFF;
    public C127G LLLFFI;

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        this.LLLF = ((ProfileMafRedPointsVM) this.LLJZIJLIL.getValue()).LLILLJJLI ? C1DGC.LIZ(this.LLLF) : 0;
        FindFriendsPageArg findFriendsPageArg = new FindFriendsPageArg(false, 0, "personal_homepage", "", EnumC666200QBe.DEFAULT, null, this.LLLF, true, -1, null);
        C1264430j0b c1264430j0b = new C1264430j0b("personal_homepage", "find_friends_page", null);
        Context context = getContext();
        if (context != null) {
            ((RouteAddFriendsPageService) ServiceManager.get().getService(RouteAddFriendsPageService.class)).LIZJ(context, findFriendsPageArg, c1264430j0b, null, false);
        }
        C735800Ste c735800Ste = new C735800Ste("click_add_friends");
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c735800Ste.LJFF("enter_from", "personal_homepage", c2082308Dt);
        c735800Ste.LJFF("event_type", "normal_way", c2082308Dt);
        c735800Ste.LJIILLIIL("button_type", Ap() == EnumC1249860id6.ICON ? "icon" : "add_friends");
        boolean z = ((C1249210ic3) ((AssemViewModel) this.LLL.getValue()).getState()).LLILLL;
        c735800Ste.LJIILLIIL("has_notice", z ? "1" : CardStruct.IStatusCode.DEFAULT);
        if (z) {
            c735800Ste.LJIILLIIL("notice_cnt", String.valueOf(((C1249210ic3) ((AssemViewModel) this.LLL.getValue()).getState()).LLILLJJLI));
        }
        c735800Ste.LJIILJJIL();
        kp(C1248720ibG.LIZIZ(EnumC1249840id4.HAS_ADD_FRIENDS), EnumC1248370iah.CTA);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final Integer up() {
        Icon icon;
        Integer iconInt$default;
        AddFriendsData addFriendsData = this.LLLFF;
        int iIntValue = R.raw.icon_person_plus;
        if (addFriendsData != null && (icon = addFriendsData.getIcon()) != null && (iconInt$default = Icon.getIconInt$default(icon, null, Integer.valueOf(R.raw.icon_person_plus), 1, null)) != null) {
            iIntValue = iconInt$default.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final String yp() {
        Describe describe;
        String text;
        AddFriendsData addFriendsData = this.LLLFF;
        if (addFriendsData != null && (describe = addFriendsData.getDescribe()) != null && (text = describe.getText()) != null) {
            return text;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            return fragmentLJI.getString(2131845474);
        }
        return null;
    }

    public HeaderCTAAddFriendsComponent() {
        AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(459);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileMafRedPointsVM.class);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(447);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19((AbstractC738140SxQ) this, 2402);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJZIJLIL = new C736950SvV(c19719912DlLIZ, aFwS207S0000000_19, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS257S0000000_19, awS563S0100000_19, c451610HnL, c723700Sa8);
        AFwS207S0000000_19 aFwS207S0000000_192 = AFwS207S0000000_19.get$arr$(458);
        this.LLL = new C736950SvV(C13LE.LIZ(ProfileAddFriendsRedPointsVM.class), aFwS207S0000000_192, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS257S0000000_19.get$arr$(448), new AwS563S0100000_19((AbstractC738140SxQ) this, 2403), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, ICTAAddFriendsAbility.class, null, null);
        }
        Ip();
        ((AssemViewModel) this.LLL.getValue()).setState(AFwS257S0000000_19.get$arr$(764));
        AssemViewModel assemViewModel = (AssemViewModel) this.LLL.getValue();
        subscribe(assemViewModel, C736820SvI.LIZIZ(assemViewModel.usedInReusedScene), null, new AwS633S0100000_19(this, 139));
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        if (profilePlatformViewModelZo != null) {
            profilePlatformViewModelZo.JQ2(new AwS598S0100000_19(this, 389));
        }
        lp(EnumC1248370iah.CTA, "HAS_ADD_FRIENDS".toLowerCase(Locale.ROOT), true);
    }

    @Override // com.ss.android.ugc.profile.business.ur.platform.addfriends.ICTAAddFriendsAbility
    public final void Ha() {
        ((ProfileMafRedPointsVM) this.LLJZIJLIL.getValue()).vQ2(C1DGC.LIZ(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().mafRedCount));
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLFFI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLFFI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ProfileMafRedPointsVM.class, new AObjectS71S0000000_19(this, 16), ProfileAddFriendsRedPointsVM.class, new AObjectS71S0000000_19(this, 15)}, defaultViewModelProviderFactory);
                    this.LLLFFI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), ICTAAddFriendsAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        super.tp();
        String name = Button.class.getName();
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.OF(name, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            ep(nVar);
        }
        Pc1(this.assemTagInternal, new AwS563S0100000_19(this, 2404));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        int iIntValue;
        Integer mafRedCount;
        AddFriendsData addFriendsData = (AddFriendsData) C1250210idf.LIZ(nVar.toString(), AddFriendsData.class);
        this.LLLFF = addFriendsData;
        if (addFriendsData != null && (mafRedCount = addFriendsData.getMafRedCount()) != null) {
            iIntValue = mafRedCount.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLLF = C1DGC.LIZ(iIntValue);
    }
}
