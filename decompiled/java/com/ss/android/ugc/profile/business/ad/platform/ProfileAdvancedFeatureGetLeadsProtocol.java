package com.ss.android.ugc.profile.business.ad.platform;

import X.AbstractC848400XPy;
import X.C0OBG;
import X.C0XPD;
import X.C0XQ7;
import X.C11NJ;
import X.C1250210idf;
import X.C1251350ifV;
import X.C1375500ltk;
import X.C20684815ws;
import X.C2344009Gk;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.LeadsGenModel;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAdvancedFeatureGetLeadsProtocol extends AdvancedFeatureProtocol {
    public final C11NJ LLJL = new C11NJ();
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public GetQuoteData LLJLL;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "advanced_feature_leads_gen";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.KQ2(new AwS598S0100000_19(this, 290));
        }
        IProfilePlatformVM iProfilePlatformVM2 = this.LLIZLLLIL;
        if (iProfilePlatformVM2 != null) {
            iProfilePlatformVM2.GQ2(new AwS598S0100000_19(this, 291));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol
    public final void LJJLIIIJLJLI() {
        LeadsGenModel leadsGen;
        User userVQ2;
        String uid;
        LeadsGenModel leadsGen2;
        String actionName;
        GetQuoteData getQuoteData = this.LLJLL;
        if (getQuoteData != null && (leadsGen2 = getQuoteData.getLeadsGen()) != null && (actionName = leadsGen2.getActionName()) != null) {
            LJLI(actionName);
        }
        GetQuoteData getQuoteData2 = this.LLJLL;
        if (getQuoteData2 == null || (leadsGen = getQuoteData2.getLeadsGen()) == null || !leadsGen.getHasLeadsGen() || !this.LLJLIL || this.LLJLILLLLZIIL) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJIJIL);
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        String str = "";
        if (currentUserID == null) {
            currentUserID = "";
        }
        c2344009Gk.LJIIIIZZ("from_uid_id", currentUserID);
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null && (userVQ2 = iProfilePlatformVM.vQ2()) != null && (uid = userVQ2.getUid()) != null) {
            str = uid;
        }
        c2344009Gk.LJIIIIZZ("to_user_id", str);
        Aweme awemeLJLILLLLZI = LJLILLLLZI();
        c2344009Gk.LJIIIIZZ("is_ad", (awemeLJLILLLLZI == null || !AwemeExtKt.isAdTraffic(awemeLJLILLLLZI)) ? CardStruct.IStatusCode.DEFAULT : "1");
        C20684815ws.LJIILLIIL("ttelite_ba_lead_tt_show_cta", c2344009Gk.LIZ);
        this.LLJLILLLLZIIL = true;
    }

    public final Aweme LJLILLLLZI() {
        C1251350ifV state;
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM == null || (state = iProfilePlatformVM.getState()) == null) {
            return null;
        }
        return state.LLJILJILJ;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onDestroy() {
        this.LLJL.dispose();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJI() {
        return Integer.valueOf(R.raw.icon_pen_on_paper);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        String uid;
        boolean z;
        String str;
        LeadsGenModel leadsGen;
        Activity activityLJII;
        String aid;
        User userVQ2;
        if (C0OBG.LIZIZ(view)) {
            return true;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJIJIL);
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        String str2 = "";
        if (currentUserID == null) {
            currentUserID = "";
        }
        c2344009Gk.LJIIIIZZ("from_uid_id", currentUserID);
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        User userVQ22 = null;
        if (iProfilePlatformVM == null || (userVQ2 = iProfilePlatformVM.vQ2()) == null || (uid = userVQ2.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("to_user_id", uid);
        Aweme awemeLJLILLLLZI = LJLILLLLZI();
        if (awemeLJLILLLLZI != null && AwemeExtKt.isAdTraffic(awemeLJLILLLLZI)) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "1";
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_ad", str);
        Aweme awemeLJLILLLLZI2 = LJLILLLLZI();
        if (awemeLJLILLLLZI2 != null && (aid = awemeLJLILLLLZI2.getAid()) != null) {
            str2 = aid;
        }
        c2344009Gk.LJIIIIZZ("item_id", str2);
        C20684815ws.LJIILLIIL("ttelite_ba_lead_tt_click_cta", c2344009Gk.LIZ);
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            Context context = getContext();
            if (context != null) {
                activityLJII = C1375500ltk.LJII(context);
            } else {
                activityLJII = null;
            }
            C0XPD.LIZIZ(activityLJII, "getLeads", "getLeads", null, null);
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", this.LLJJIJIL);
            Aweme awemeLJLILLLLZI3 = LJLILLLLZI();
            if (awemeLJLILLLLZI3 == null || !AwemeExtKt.isAdTraffic(awemeLJLILLLLZI3)) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk2.LJIIIIZZ("is_ad", str3);
            c2344009Gk2.LIZJ(-1, "result");
            C20684815ws.LJIILLIIL("ttelite_ba_lead_tt_enter_instantform", c2344009Gk2.LIZ);
            return true;
        }
        GetQuoteData getQuoteData = this.LLJLL;
        if (getQuoteData != null && (leadsGen = getQuoteData.getLeadsGen()) != null) {
            IBAProfilePageService iBAProfilePageServiceLJIIL = BAProfilePageServiceImpl.LJIIL();
            Context context2 = getContext();
            IProfilePlatformVM iProfilePlatformVM2 = this.LLIZLLLIL;
            if (iProfilePlatformVM2 != null) {
                userVQ22 = iProfilePlatformVM2.vQ2();
            }
            iBAProfilePageServiceLJIIL.LIZIZ(context2, leadsGen, userVQ22, LJLILLLLZI());
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        User userVQ2;
        BizAccountInfo bizAccountInfo;
        GetQuoteData getQuoteData = (GetQuoteData) C1250210idf.LIZ(nVar.toString(), GetQuoteData.class);
        this.LLJLL = getQuoteData;
        this.LLJJJJ = getQuoteData;
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        LeadsGenModel leadsGen = null;
        if (iProfilePlatformVM != null && (userVQ2 = iProfilePlatformVM.vQ2()) != null && (bizAccountInfo = userVQ2.getBizAccountInfo()) != null) {
            GetQuoteData getQuoteData2 = this.LLJLL;
            if (getQuoteData2 != null) {
                leadsGen = getQuoteData2.getLeadsGen();
            }
            bizAccountInfo.setLeadsGenModel(leadsGen);
        }
    }
}
