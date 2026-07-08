package com.ss.android.ugc.profile.business.ad.platform.business;

import X.C08JS;
import X.C1050610dRj;
import X.C1251350ifV;
import X.C7740030o;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.BizAddress;
import com.ss.android.ugc.aweme.commerce.BizContactInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.ad.platform.BioAddressData;

/* JADX INFO: loaded from: classes20.dex */
public final class BioStructuralBAAddressProtocol extends BioStructuralBABaseProtocol<BioAddressData> {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "bio_business_account_address";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        BizAccountInfo bizAccountInfo;
        BizContactInfo bizContactInfo;
        User user = this.LLJJJJ;
        if (user == null || (bizAccountInfo = user.getBizAccountInfo()) == null || (bizContactInfo = bizAccountInfo.getBizContactInfo()) == null) {
            return false;
        }
        BizAddress bizAddress = new BizAddress();
        BioAddressData bioAddressData = (BioAddressData) this.LLJILJIL;
        bizAddress.setLatitude(bioAddressData != null ? bioAddressData.getLatitude() : null);
        BioAddressData bioAddressData2 = (BioAddressData) this.LLJILJIL;
        bizAddress.setLongitude(bioAddressData2 != null ? bioAddressData2.getLongitude() : null);
        BioAddressData bioAddressData3 = (BioAddressData) this.LLJILJIL;
        bizAddress.setFormattedAddressText(bioAddressData3 != null ? bioAddressData3.getFormattedAddressText() : null);
        BioAddressData bioAddressData4 = (BioAddressData) this.LLJILJIL;
        bizAddress.setSimplifiedAddressText(bioAddressData4 != null ? bioAddressData4.getSimplifiedAddressText() : null);
        bizContactInfo.setBizAddress(bizAddress);
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        Aweme aweme;
        C1251350ifV state;
        C1251350ifV state2;
        C1050610dRj c1050610dRj = new C1050610dRj();
        User user = this.LLJJJJ;
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        Aweme aweme2 = null;
        if (iProfilePlatformVM != null && (state2 = iProfilePlatformVM.getState()) != null) {
            aweme = state2.LLJILJILJ;
        } else {
            aweme = null;
        }
        c1050610dRj.LJIIL(aweme, user);
        IBAProfilePageService iBAProfilePageServiceLJIIL = BAProfilePageServiceImpl.LJIIL();
        Context context = getContext();
        String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), this.LLJILJIL);
        IProfilePlatformVM iProfilePlatformVM2 = this.LLIZLLLIL;
        if (iProfilePlatformVM2 != null && (state = iProfilePlatformVM2.getState()) != null) {
            aweme2 = state.LLJILJILJ;
        }
        iBAProfilePageServiceLJIIL.LJ(context, 5, json, aweme2, null, null, null);
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        BioAddressData bioAddressData;
        try {
            bioAddressData = (BioAddressData) C08JS.LIZ(nVar.toString(), BioAddressData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            bioAddressData = null;
        }
        this.LLJILJIL = bioAddressData;
    }
}
