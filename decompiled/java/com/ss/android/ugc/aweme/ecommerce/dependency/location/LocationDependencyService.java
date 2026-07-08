package com.ss.android.ugc.aweme.ecommerce.dependency.location;

import X.C04TD;
import X.C1199590hK1;
import X.C1207450hWh;
import X.C1207520hWo;
import X.C1742730vS3;
import X.C19EG;
import X.C1AUG;
import X.C1AUJ;
import X.C1AUK;
import X.C1AUL;
import X.C1AUM;
import X.C20301014c4;
import X.C2222691Bz1;
import X.C839940WxE;
import X.EnumC2094808Io;
import X.InterfaceC1207030hW1;
import X.InterfaceC1207440hWg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1748950vc5;
import X.InterfaceC687820QyS;
import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: loaded from: classes34.dex */
public final class LocationDependencyService implements ILocationDependencyService {
    public static final C1AUK Companion = new Object() { // from class: X.1AUK
    };

    public void initService() {
    }

    private final Cert getDecryptLocationDataTokenCert() {
        TokenCert tokenCertWith = TokenCert.Companion.with("bpea-ecom_address_map_decrypt_location_data");
        tokenCertWith.auth("mckd");
        return tokenCertWith;
    }

    private final Cert getEncryptLocationDataTokenCert() {
        TokenCert tokenCertWith = TokenCert.Companion.with("bpea-ecom_address_map_encrypt_location_data");
        tokenCertWith.auth("hyqv");
        return tokenCertWith;
    }

    private final Cert getMapLocateDataTokenCert() {
        TokenCert tokenCertWith = TokenCert.Companion.with("bpea-ecom_address_map_locate");
        tokenCertWith.auth("svfi");
        return tokenCertWith;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public Cert getUSLocatePermissionTokenCert() {
        return TokenCert.Companion.with("bpea-ecom_address_us_popup_android");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public Cert getUSMapLocateDataTokenCert() {
        TokenCert tokenCertWith = TokenCert.Companion.with("bpea-ecom_address_us_locate_android");
        tokenCertWith.auth("svfi");
        return tokenCertWith;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public boolean isFineLocationPermissionGranted() {
        ILocationService iLocationService = (ILocationService) PluggableExtentionKt.pluggableSpi$default(ILocationService.class, false, false, false, 14, null);
        return iLocationService != null && iLocationService.LJIL("android.permission.ACCESS_FINE_LOCATION");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public boolean isIndia() {
        C2222691Bz1.LIZ.getClass();
        return u.LJIJI("IN", C2222691Bz1.LIZIZ(), true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public boolean isUK() {
        C2222691Bz1.LIZ.getClass();
        return C2222691Bz1.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public boolean isUS() {
        C2222691Bz1.LIZ.getClass();
        return C2222691Bz1.LJIIL();
    }

    private final Cert getLocatePermissionTokenCert() {
        return ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIILJJIL() ? TokenCert.Companion.with("bpea-ecom_address_request_locate") : TokenCert.Companion.with("bpea-ecom_address_request_coarse_locate");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public String getCurrentRegionCode() {
        return C2222691Bz1.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public String getPriorityRegion() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJI("priority_region", "");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public String getRegion() {
        return C2222691Bz1.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public String getSimCountry() {
        return C2222691Bz1.LJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public String getStoreRegion() {
        return C20301014c4.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public String getSysRegion() {
        return C2222691Bz1.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public boolean isInTikTokRegion() {
        return C2222691Bz1.LJIIIIZZ();
    }

    private final InterfaceC1207030hW1 convert(final C1AUJ c1auj) {
        return new InterfaceC1207030hW1() { // from class: X.1AUI
            @Override // X.InterfaceC1207030hW1
            public final void LIZ() {
                c1auj.LIZ();
            }

            @Override // X.InterfaceC1207030hW1
            public final void LIZJ(int i) {
                c1auj.LIZIZ();
            }

            @Override // X.InterfaceC1207030hW1
            public final void LIZIZ(int i, String str) {
                c1auj.LIZJ(str);
            }
        };
    }

    private final C1207520hWo covertLocationExtensionParams(C1AUG c1aug) {
        return new C1207520hWo(c1aug.LIZ, c1aug.LIZIZ, null, c1aug.LIZJ, c1aug.LIZLLL, c1aug.LJ, c1aug.LJFF, c1aug.LJI, c1aug.LJII, 4);
    }

    public static ILocationDependencyService createILocationDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ILocationDependencyService.class, z);
        if (objLIZ != null) {
            return (ILocationDependencyService) objLIZ;
        }
        if (C04TD.D == null) {
            synchronized (ILocationDependencyService.class) {
                if (C04TD.D == null) {
                    C04TD.D = new LocationDependencyService();
                }
            }
        }
        return C04TD.D;
    }

    public int convertAccuracyValue(EnumC2094808Io enumC2094808Io) {
        return enumC2094808Io.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public C1199590hK1 encryptLocation(double d, double d2) {
        return C839940WxE.LIZIZ(d, d2, getEncryptLocationDataTokenCert());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public void fetchLocation(Cert cert, final InterfaceC1631620sYq<? super Boolean, ? super C1742730vS3, ? super String, Unit> interfaceC1631620sYq) {
        Cert mapLocateDataTokenCert = cert;
        C1207450hWh c1207450hWh = C1207450hWh.LIZ;
        if (mapLocateDataTokenCert == null) {
            mapLocateDataTokenCert = getMapLocateDataTokenCert();
        }
        c1207450hWh.LJIIL("ttshop", "ship_address", mapLocateDataTokenCert, getDecryptLocationDataTokenCert(), new InterfaceC687820QyS() { // from class: X.0vS2
            @Override // X.InterfaceC687820QyS
            public final void LIZ(LocationData locationData) {
                interfaceC1631620sYq.invoke(Boolean.TRUE, new C1742730vS3(Double.valueOf(locationData.longitude), Double.valueOf(locationData.latitude), locationData.encryptedLongitude, locationData.encryptedLatitude), null);
            }

            @Override // X.InterfaceC687820QyS
            public final void onError(int i, String str) {
                interfaceC1631620sYq.invoke(Boolean.FALSE, null, str);
            }
        }, -1L);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public boolean isLocationPermissionGranted(Context context, EnumC2094808Io enumC2094808Io) {
        return C1207450hWh.LIZ.LJII(convertAccuracyValue(enumC2094808Io), context);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public void openCountryListActivity(Activity activity, final C1AUL c1aul) {
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LIZJ().openCountryListActivity(activity, new InterfaceC1748950vc5() { // from class: X.1AUH
            @Override // X.InterfaceC1748950vc5
            public void onExit() {
                c1aul.onExit();
            }

            @Override // X.InterfaceC1748950vc5
            public void onChanged(String str, String str2) {
                c1aul.onChanged(str, str2);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public void requestLocationPermission(C19EG c19eg, C1AUG c1aug, Cert cert, C1AUJ c1auj, final C1AUM c1aum) {
        InterfaceC1207030hW1 interfaceC1207030hW1Convert;
        Cert locatePermissionTokenCert = cert;
        C1207450hWh c1207450hWh = C1207450hWh.LIZ;
        if (locatePermissionTokenCert == null) {
            locatePermissionTokenCert = getLocatePermissionTokenCert();
        }
        C1207520hWo c1207520hWoCovertLocationExtensionParams = covertLocationExtensionParams(c1aug);
        InterfaceC1207440hWg interfaceC1207440hWg = null;
        if (c1auj != null) {
            interfaceC1207030hW1Convert = convert(c1auj);
        } else {
            interfaceC1207030hW1Convert = null;
        }
        if (c1aum != null) {
            interfaceC1207440hWg = new InterfaceC1207440hWg() { // from class: X.1AUF
                @Override // X.InterfaceC1207440hWg
                public final void LIZ() {
                    c1aum.LIZ();
                }
            };
        }
        c1207450hWh.LJIJJ("ttshop", "ship_address", locatePermissionTokenCert, c19eg, c1207520hWoCovertLocationExtensionParams, interfaceC1207030hW1Convert, interfaceC1207440hWg);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService
    public void requestSystemConversionPopup(C19EG c19eg, C1AUG c1aug, Cert cert, C1AUJ c1auj, boolean z, boolean z2) {
        InterfaceC1207030hW1 interfaceC1207030hW1Convert;
        Cert locatePermissionTokenCert = cert;
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        if (locatePermissionTokenCert == null) {
            locatePermissionTokenCert = getLocatePermissionTokenCert();
        }
        C1207520hWo c1207520hWoCovertLocationExtensionParams = covertLocationExtensionParams(c1aug);
        if (c1auj != null) {
            interfaceC1207030hW1Convert = convert(c1auj);
        } else {
            interfaceC1207030hW1Convert = null;
        }
        iLocationBaseServiceForMT.LJIJJLI("ttshop", "ship_address", locatePermissionTokenCert, c19eg, c1207520hWoCovertLocationExtensionParams, interfaceC1207030hW1Convert, z, z2);
    }
}
