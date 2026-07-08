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
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
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
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class ContentCellGetLeadsProtocol extends ContentCellProtocol implements GenericLifecycleObserver {
    public final C11NJ LLL = new C11NJ();
    public boolean LLLF;
    public boolean LLLFF;
    public GetQuoteData LLLFFI;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_leads_gen";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            destroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        LeadsGenModel leadsGen;
        String uid;
        LeadsGenModel leadsGen2;
        String actionName;
        GetQuoteData getQuoteData = this.LLLFFI;
        if (getQuoteData != null && (leadsGen2 = getQuoteData.getLeadsGen()) != null && (actionName = leadsGen2.getActionName()) != null) {
            LJLI(actionName);
        }
        GetQuoteData getQuoteData2 = this.LLLFFI;
        if (getQuoteData2 != null && (leadsGen = getQuoteData2.getLeadsGen()) != null && leadsGen.getHasLeadsGen() && this.LLLF && !this.LLLFF) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LLJJIJIL);
            String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            String str = "";
            if (currentUserID == null) {
                currentUserID = "";
            }
            c2344009Gk.LJIIIIZZ("from_uid_id", currentUserID);
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            if (curUser != null && (uid = curUser.getUid()) != null) {
                str = uid;
            }
            c2344009Gk.LJIIIIZZ("to_user_id", str);
            Aweme awemeLJLLL = LJLLL();
            c2344009Gk.LJIIIIZZ("is_ad", (awemeLJLLL == null || !AwemeExtKt.isAdTraffic(awemeLJLLL)) ? CardStruct.IStatusCode.DEFAULT : "1");
            C20684815ws.LJIILLIIL("ttelite_ba_lead_tt_show_cta", c2344009Gk.LIZ);
            this.LLLFF = true;
        }
        return false;
    }

    public final Aweme LJLLL() {
        C1251350ifV state;
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM == null || (state = iProfilePlatformVM.getState()) == null) {
            return null;
        }
        return state.LLJILJILJ;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void destroy() {
        this.LLL.dispose();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        String uid;
        boolean z;
        String str;
        LeadsGenModel leadsGen;
        Activity activityLJII;
        String aid;
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
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("to_user_id", uid);
        Aweme awemeLJLLL = LJLLL();
        if (awemeLJLLL != null && AwemeExtKt.isAdTraffic(awemeLJLLL)) {
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
        Aweme awemeLJLLL2 = LJLLL();
        if (awemeLJLLL2 != null && (aid = awemeLJLLL2.getAid()) != null) {
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
            Aweme awemeLJLLL3 = LJLLL();
            if (awemeLJLLL3 == null || !AwemeExtKt.isAdTraffic(awemeLJLLL3)) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk2.LJIIIIZZ("is_ad", str3);
            c2344009Gk2.LIZJ(-1, "result");
            C20684815ws.LJIILLIIL("ttelite_ba_lead_tt_enter_instantform", c2344009Gk2.LIZ);
            return true;
        }
        GetQuoteData getQuoteData = this.LLLFFI;
        if (getQuoteData != null && (leadsGen = getQuoteData.getLeadsGen()) != null) {
            BAProfilePageServiceImpl.LJIIL().LIZIZ(getContext(), leadsGen, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser(), LJLLL());
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        BizAccountInfo bizAccountInfo;
        LeadsGenModel leadsGen;
        GetQuoteData getQuoteData = (GetQuoteData) C1250210idf.LIZ(nVar.toString(), GetQuoteData.class);
        this.LLLFFI = getQuoteData;
        this.LLJJJJ = getQuoteData;
        User curUser = C0XQ7.LJFF().getCurUser();
        if (curUser != null && (bizAccountInfo = curUser.getBizAccountInfo()) != null) {
            GetQuoteData getQuoteData2 = this.LLLFFI;
            if (getQuoteData2 != null) {
                leadsGen = getQuoteData2.getLeadsGen();
            } else {
                leadsGen = null;
            }
            bizAccountInfo.setLeadsGenModel(leadsGen);
        }
        this.LLJILJIL = this.LLLFFI;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final void LJLJJLL(Map map, boolean z) {
        this.LLLF = z;
        if (!z) {
            this.LLLFF = false;
        }
    }
}
