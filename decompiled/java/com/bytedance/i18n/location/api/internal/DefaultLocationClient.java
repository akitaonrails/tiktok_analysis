package com.bytedance.i18n.location.api.internal;

import X.C092O;
import X.C1207210hWJ;
import X.C1216920hly;
import X.C1798620wuC;
import X.C1798680wuI;
import X.C2188811AlT;
import X.InterfaceC1294060jmO;
import android.content.Context;
import com.bytedance.i18n.location.api.LocationClient;
import com.bytedance.i18n.location.api.LocationData;
import kotlin.Pair;
import kotlin.jvm.internal.AwS462S0200000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class DefaultLocationClient implements LocationClient {
    @Override // com.bytedance.i18n.location.api.LocationClient
    public final void LIZJ() {
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final int LIZLLL() {
        return 0;
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final void LJFF() {
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final int LJIIIZ(Context context) {
        return 0;
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final int LJIIJJI() {
        return 0;
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final boolean LJIIL() {
        return false;
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final boolean LJIILJJIL(Context context) {
        return false;
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final boolean LJIILLIIL(Context context) {
        return false;
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final int LJIJI(Context context) {
        return 0;
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final boolean isInitialized() {
        return false;
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final boolean isLocationPermissionGranted(Context context) {
        return false;
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final boolean isLocationServiceEnabled(Context context) {
        return false;
    }

    @Override // X.InterfaceC1797790wsr
    public final void onAppBackground() {
    }

    @Override // X.InterfaceC1797790wsr
    public final void onAppForeground() {
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final Pair<Boolean, String> LJIIZILJ() {
        return new Pair<>(Boolean.FALSE, null);
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final void deInit() {
        C1798620wuC.LIZLLL("FakeLocationClient", "deInit");
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    @InterfaceC1294060jmO
    public final LocationData LJIIJ(C1216920hly c1216920hly) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLastLocation sync: ");
        sbLIZ.append(c1216920hly);
        C1798620wuC.LIZIZ("FakeLocationClient", C2188811AlT.LIZIZ(sbLIZ));
        return LocationData.LJIIL.getValue();
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final Pair LIZ(String str, String str2) {
        Double dValueOf = Double.valueOf(0.0d);
        return new Pair(dValueOf, dValueOf);
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final void LJIJ(C092O c092o, C1216920hly c1216920hly) {
        c092o.accept(LocationData.LJIIL.getValue());
    }

    @Override // com.bytedance.i18n.location.api.LocationClient
    public final void LJIILL(C1798680wuI c1798680wuI, C1207210hWJ c1207210hWJ, AwS462S0200000_27 awS462S0200000_27) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("default init: ");
        sbLIZ.append(c1798680wuI);
        C1798620wuC.LIZLLL("FakeLocationClient", C2188811AlT.LIZIZ(sbLIZ));
        awS462S0200000_27.invoke(0, null);
    }
}
