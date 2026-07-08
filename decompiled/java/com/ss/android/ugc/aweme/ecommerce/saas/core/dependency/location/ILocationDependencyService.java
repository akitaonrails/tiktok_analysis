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
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public interface ILocationDependencyService extends IECommerceHostService {
    C1199590hK1 encryptLocation(double d, double d2);

    void fetchLocation(Cert cert, InterfaceC1631620sYq<? super Boolean, ? super C1742730vS3, ? super String, Unit> interfaceC1631620sYq);

    String getCurrentRegionCode();

    String getPriorityRegion();

    String getRegion();

    String getSimCountry();

    String getStoreRegion();

    String getSysRegion();

    Cert getUSLocatePermissionTokenCert();

    Cert getUSMapLocateDataTokenCert();

    boolean isFineLocationPermissionGranted();

    boolean isInTikTokRegion();

    boolean isIndia();

    boolean isLocationPermissionGranted(Context context, EnumC2094808Io enumC2094808Io);

    boolean isUK();

    boolean isUS();

    void openCountryListActivity(Activity activity, C1AUL c1aul);

    void requestLocationPermission(C19EG c19eg, C1AUG c1aug, Cert cert, C1AUJ c1auj, C1AUM c1aum);

    void requestSystemConversionPopup(C19EG c19eg, C1AUG c1aug, Cert cert, C1AUJ c1auj, boolean z, boolean z2);
}
