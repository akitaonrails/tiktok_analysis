package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location;

import X.C1199590hK1;
import X.C1742730vS3;
import X.C19EG;
import X.C1AUG;
import X.C1AUJ;
import X.C1AUL;
import X.C1AUM;
import X.EnumC2094808Io;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class DefaultLocationDependencyService implements ILocationDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public C1199590hK1 encryptLocation(double d, double d2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public void fetchLocation(Cert cert, InterfaceC1631620sYq<? super Boolean, ? super C1742730vS3, ? super String, Unit> interfaceC1631620sYq) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public String getCurrentRegionCode() {
        return "CN";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public String getPriorityRegion() {
        return "CN";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public String getRegion() {
        return "CN";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public String getSimCountry() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public String getStoreRegion() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public String getSysRegion() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public Cert getUSLocatePermissionTokenCert() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public Cert getUSMapLocateDataTokenCert() {
        return null;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public boolean isFineLocationPermissionGranted() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public boolean isInTikTokRegion() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public boolean isIndia() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public boolean isLocationPermissionGranted(Context context, EnumC2094808Io enumC2094808Io) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public boolean isUK() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public boolean isUS() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public void openCountryListActivity(Activity activity, C1AUL c1aul) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public void requestLocationPermission(C19EG c19eg, C1AUG c1aug, Cert cert, C1AUJ c1auj, C1AUM c1aum) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public void requestSystemConversionPopup(C19EG c19eg, C1AUG c1aug, Cert cert, C1AUJ c1auj, boolean z, boolean z2) {
    }
}
