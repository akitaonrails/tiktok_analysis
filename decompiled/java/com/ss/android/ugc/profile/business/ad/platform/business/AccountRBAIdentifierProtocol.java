package com.ss.android.ugc.profile.business.ad.platform.business;

import X.AnonymousClass0859;
import X.C0OBG;
import X.C0XQ7;
import X.C1238750iLB;
import X.C1248240iaU;
import X.C1250210idf;
import X.C14EU;
import X.C268330AfP;
import X.C622680Oba;
import X.C786410Ut5;
import X.EnumC1248260iaW;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.profile.business.ad.platform.BABizData;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountRBAIdentifierProtocol extends ProfilePlatformProtocol<BABizData> implements GenericLifecycleObserver {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "user_account_rba_identifier";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJI() {
        return Integer.valueOf(R.raw.icon_store);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final TextUtils.TruncateAt LJJJJ() {
        if (C268330AfP.LJIIJJI()) {
            return TextUtils.TruncateAt.END;
        }
        return null;
    }

    public final String LJJLIIIJLJLI() {
        UserProfileInfo userProfileInfo;
        ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
        String uid = (profileCommonInfoLJIILIIL == null || (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null) ? null : userProfileInfo.getUid();
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        return Intrinsics.LJFF(uid, iAccountUserServiceLJFF != null ? iAccountUserServiceLJFF.getCurUserId() : null) ? "self" : "other";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final EnumC1248260iaW LJJIIZI() {
        return EnumC1248260iaW.ICON_TEXT;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C622680Oba.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        String rbaRealCompanyName;
        int iIntValue;
        Integer identifierType;
        if (C0OBG.LIZIZ(this.LLILZLL)) {
            return true;
        }
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("profile_rba_info_schema", "");
        String strLJJLIIIJLJLI = LJJLIIIJLJLI();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), strLJI);
        BABizData bABizData = (BABizData) this.LLJILJIL;
        String category = null;
        if (bABizData != null) {
            rbaRealCompanyName = bABizData.getRbaRealCompanyName();
        } else {
            rbaRealCompanyName = null;
        }
        smartRouteBuildRoute.withParam("company_name", rbaRealCompanyName);
        BABizData bABizData2 = (BABizData) this.LLJILJIL;
        if (bABizData2 != null) {
            category = bABizData2.getCategory();
        }
        smartRouteBuildRoute.withParam("category", category);
        smartRouteBuildRoute.withParam("type", strLJJLIIIJLJLI);
        smartRouteBuildRoute.open();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", LJJLIIIJLJLI());
            BABizData bABizData3 = (BABizData) this.LLJILJIL;
            if (bABizData3 != null && (identifierType = bABizData3.getIdentifierType()) != null) {
                iIntValue = identifierType.intValue();
            } else {
                iIntValue = 0;
            }
            jSONObject.put("identifier_type", iIntValue);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AppLogNewUtils.onEventV3("ttelite_profile_click_RBA_info", jSONObject);
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        BABizData bABizData;
        try {
            bABizData = (BABizData) C1250210idf.LIZ(nVar.toString(), BABizData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bABizData = null;
        }
        this.LLJILJIL = bABizData;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSwitchToBusinessAccount(C1238750iLB c1238750iLB) {
        View view = this.LLJJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSwitchToCreatorAccount(C1248240iaU c1248240iaU) {
        View view = this.LLJJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSwitchToPersonalAccount(AnonymousClass0859 anonymousClass0859) {
        View view = this.LLJJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }
}
