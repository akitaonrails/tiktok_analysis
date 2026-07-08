package com.ss.android.ugc.profile.business.ad.platform.business;

import X.C08JS;
import X.C1050610dRj;
import X.C1216270hkv;
import X.C1248720ibG;
import X.C1251350ifV;
import X.C7740030o;
import X.EnumC1248370iah;
import X.EnumC1249830id3;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.BizAddress;
import com.ss.android.ugc.aweme.commerce.BizContactInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ad.platform.BioAddressData;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public final class BioBusinessAddressComponent extends BioBusinessBaseUIComponent<BioAddressData> {
    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String Ap() {
        return "HAS_BA_BUSINESS_ADDRESS".toLowerCase(Locale.ROOT);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        C1251350ifV state;
        C1251350ifV state2;
        kp(C1248720ibG.LIZ(EnumC1249830id3.HAS_BA_BUSINESS_ADDRESS), EnumC1248370iah.BIO);
        C1050610dRj c1050610dRj = new C1050610dRj();
        ProfilePlatformViewModel profilePlatformViewModelYp = yp();
        Aweme aweme = null;
        User userVQ2 = profilePlatformViewModelYp != null ? profilePlatformViewModelYp.vQ2() : null;
        ProfilePlatformViewModel profilePlatformViewModelYp2 = yp();
        c1050610dRj.LJIIL((profilePlatformViewModelYp2 == null || (state2 = profilePlatformViewModelYp2.getState()) == null) ? null : state2.LLJILJILJ, userVQ2);
        IBAProfilePageService iBAProfilePageServiceLJIIL = BAProfilePageServiceImpl.LJIIL();
        Context context = getContext();
        String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), this.LLJJLIIIJLLLLLLLZ);
        ProfilePlatformViewModel profilePlatformViewModelYp3 = yp();
        if (profilePlatformViewModelYp3 != null && (state = profilePlatformViewModelYp3.getState()) != null) {
            aweme = state.LLJILJILJ;
        }
        iBAProfilePageServiceLJIIL.LJ(context, 5, json, aweme, null, null, null);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final Integer Bp() {
        return Integer.valueOf(R.raw.icon_map_pin);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String Ep() {
        return C1216270hkv.LIZJ(2131827238);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        User userVQ2;
        BizAccountInfo bizAccountInfo;
        BizContactInfo bizContactInfo;
        super.tp();
        ProfilePlatformViewModel profilePlatformViewModelYp = yp();
        if (profilePlatformViewModelYp == null || (userVQ2 = profilePlatformViewModelYp.vQ2()) == null || (bizAccountInfo = userVQ2.getBizAccountInfo()) == null || (bizContactInfo = bizAccountInfo.getBizContactInfo()) == null) {
            return;
        }
        BizAddress bizAddress = new BizAddress();
        BioAddressData bioAddressData = (BioAddressData) this.LLJJLIIIJLLLLLLLZ;
        bizAddress.setLatitude(bioAddressData != null ? bioAddressData.getLatitude() : null);
        BioAddressData bioAddressData2 = (BioAddressData) this.LLJJLIIIJLLLLLLLZ;
        bizAddress.setLongitude(bioAddressData2 != null ? bioAddressData2.getLongitude() : null);
        BioAddressData bioAddressData3 = (BioAddressData) this.LLJJLIIIJLLLLLLLZ;
        bizAddress.setFormattedAddressText(bioAddressData3 != null ? bioAddressData3.getFormattedAddressText() : null);
        BioAddressData bioAddressData4 = (BioAddressData) this.LLJJLIIIJLLLLLLLZ;
        bizAddress.setSimplifiedAddressText(bioAddressData4 != null ? bioAddressData4.getSimplifiedAddressText() : null);
        bizContactInfo.setBizAddress(bizAddress);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C08JS.LIZ(nVar.toString(), BioAddressData.class);
    }
}
