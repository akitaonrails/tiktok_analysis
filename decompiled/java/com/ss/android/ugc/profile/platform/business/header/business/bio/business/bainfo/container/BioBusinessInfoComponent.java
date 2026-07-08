package com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.container;

import X.C13LE;
import com.ss.android.ugc.profile.business.ad.platform.business.BioBusinessAddressComponent;
import com.ss.android.ugc.profile.business.ad.platform.business.BioBusinessAppDownloadComponent;
import com.ss.android.ugc.profile.business.ad.platform.business.BioBusinessContactComponent;
import com.ss.android.ugc.profile.business.ad.platform.business.BioBusinessCouponComponent;
import com.ss.android.ugc.profile.business.ad.platform.business.BioBusinessEmailComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent;

/* JADX INFO: loaded from: classes20.dex */
public final class BioBusinessInfoComponent extends BioBusinessInfoBaseComponent {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("bio_business_account_email", C13LE.LIZ(BioBusinessEmailComponent.class), null, -1, false);
        Ho("bio_business_account_app_download", C13LE.LIZ(BioBusinessAppDownloadComponent.class), null, -1, false);
        Ho("bio_business_account_phone", C13LE.LIZ(BioBusinessContactComponent.class), null, -1, false);
        Ho("bio_tto_collaboration", C13LE.LIZ(BioBusinessBaseUIComponent.class), null, -1, false);
        Ho("bio_business_account_address", C13LE.LIZ(BioBusinessAddressComponent.class), null, -1, false);
        Ho("bio_business_account_coupon", C13LE.LIZ(BioBusinessCouponComponent.class), null, -1, false);
    }
}
