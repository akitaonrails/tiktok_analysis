package com.ss.android.ugc.profile.business.creator.monetization;

import X.C1248950ibd;
import X.C1250210idf;
import X.C13SS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C2399609ak;
import X.C786410Ut5;
import X.C828330WeV;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.aweme.donation.IDonationService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.ProfileHeaderAdvancedFeatureViewModel;
import com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAdvancedFeatureSupportingProtocol extends AdvancedFeatureProtocol {
    public TuxSheet LLJL;
    public Map<String, String> LLJLIL;
    public SupportingData LLJLILLLLZIIL;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "advanced_feature_supporting";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        ProfileHeaderAdvancedFeatureViewModel profileHeaderAdvancedFeatureViewModel = this.LLJJJIL;
        if (profileHeaderAdvancedFeatureViewModel != null) {
            profileHeaderAdvancedFeatureViewModel.vQ2(new AwS598S0100000_19(this, 309));
        }
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.IQ2(new AwS598S0100000_19(this, 310));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol
    public final void LJJLIIIJLJLI() {
        String donationLink;
        String uid;
        Resources resources;
        UserProfileInfo userProfileInfo;
        SupportingData supportingData = this.LLJLILLLLZIIL;
        ProfileNgoStruct supportedNonprofit = supportingData != null ? supportingData.getSupportedNonprofit() : null;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJIJIL);
        String str = "";
        if (supportedNonprofit == null || (donationLink = supportedNonprofit.getDonationLink()) == null) {
            donationLink = "";
        }
        c2344009Gk.LJIIIIZZ("link", donationLink);
        ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
        if (profileCommonInfoLJIILIIL == null || (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LJIIIIZZ("link_type", "nonprofit");
        c2344009Gk.LJIIIIZZ("powered_by", supportedNonprofit != null ? supportedNonprofit.getOrgType() : null);
        c2344009Gk.LJIIIIZZ("ngo_name", supportedNonprofit != null ? supportedNonprofit.getName() : null);
        c2344009Gk.LJIIIIZZ("fundraiser_id", supportedNonprofit != null ? supportedNonprofit.getFundraiserId() : null);
        this.LLJLIL = c2344009Gk.LIZ;
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            Object[] objArr = new Object[1];
            objArr[0] = supportedNonprofit != null ? supportedNonprofit.getName() : null;
            String string = resources.getString(2131838233, objArr);
            if (string != null) {
                str = string;
            }
        }
        LJLI(str);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onDestroy() {
        new C828330WeV(new ThirdPartyBizCert(402677760)).LIZJ();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJI() {
        return Integer.valueOf(R.raw.icon_heart_grid);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        String strLIZJ;
        String fundraiserId;
        int id;
        String orgId;
        String orgType;
        String secUid;
        UserProfileInfo userProfileInfo;
        ProfileNgoStruct supportedNonprofit;
        ProfileNgoStruct supportedNonprofit2;
        ProfileNgoStruct supportedNonprofit3;
        ProfileNgoStruct supportedNonprofit4;
        ProfileComponents profileComponents;
        n nVar;
        TuxSheet tuxSheet = this.LLJL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", this.LLJJIJIL, bundle);
        C786410Ut5.LJJJI("enter_method", "profile_link", bundle);
        bundle.putBoolean("should_dim_bg", true);
        C1248950ibd c1248950ibd = this.LLIZ;
        if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (nVar = profileComponents.bizData) == null || (strLIZJ = C2399609ak.LIZJ(nVar, "profile_share_url")) == null) {
            strLIZJ = "";
        }
        C786410Ut5.LJJJI("share_url", strLIZJ, bundle);
        Fragment fragment = this.LLILZ;
        if (fragment != null) {
            fragment.getActivity();
        }
        SupportingData supportingData = this.LLJLILLLLZIIL;
        if (supportingData != null && supportingData.getSupportedNonprofit() != null) {
            SupportingData supportingData2 = this.LLJLILLLLZIIL;
            if (supportingData2 == null || (supportedNonprofit4 = supportingData2.getSupportedNonprofit()) == null || (fundraiserId = supportedNonprofit4.getFundraiserId()) == null) {
                fundraiserId = "";
            }
            C786410Ut5.LJJJI("fundraiser_id", fundraiserId, bundle);
            C20684815ws.LJIILLIIL("click_link", this.LLJLIL);
            Fragment fragment2 = this.LLILZ;
            if (fragment2 != null) {
                IDonationService iDonationService = (IDonationService) ServiceManager.get().getService(IDonationService.class);
                Context context = fragment2.getContext();
                SupportingData supportingData3 = this.LLJLILLLLZIIL;
                if (supportingData3 != null && (supportedNonprofit3 = supportingData3.getSupportedNonprofit()) != null) {
                    id = supportedNonprofit3.getId();
                } else {
                    id = 0;
                }
                SupportingData supportingData4 = this.LLJLILLLLZIIL;
                if (supportingData4 == null || (supportedNonprofit2 = supportingData4.getSupportedNonprofit()) == null || (orgId = supportedNonprofit2.getOrgId()) == null) {
                    orgId = "";
                }
                SupportingData supportingData5 = this.LLJLILLLLZIIL;
                if (supportingData5 == null || (supportedNonprofit = supportingData5.getSupportedNonprofit()) == null || (orgType = supportedNonprofit.getOrgType()) == null) {
                    orgType = "";
                }
                ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
                if (profileCommonInfoLJIILIIL == null || (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null || (secUid = userProfileInfo.getSecUid()) == null) {
                    secUid = "";
                }
                TuxSheet tuxSheetLIZLLL = iDonationService.LIZLLL(context, id, orgId, orgType, secUid, bundle);
                this.LLJL = tuxSheetLIZLLL;
                if (tuxSheetLIZLLL != null) {
                    try {
                        tuxSheetLIZLLL.show(fragment2.getChildFragmentManager(), "DonationFragment");
                        return true;
                    } catch (IllegalStateException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C13SS.LIZ.getClass();
                        C13SS.LIZIZ("ProfileAdvancedFeatureSupportingProtocol", "DonationFragment", e);
                    }
                }
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        SupportingData supportingData = (SupportingData) C1250210idf.LIZ(nVar.toString(), SupportingData.class);
        this.LLJLILLLLZIIL = supportingData;
        this.LLJJJJ = supportingData;
    }
}
