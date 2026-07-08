package com.ss.android.ugc.aweme.service;

import X.AbstractC1201400hMw;
import X.C01GW;
import X.C0HWO;
import X.C1198940hIy;
import X.C1205440hTS;
import X.C1205450hTT;
import X.C1205460hTU;
import X.C1206950hVt;
import X.C1207210hWJ;
import X.C1207520hWo;
import X.C2188811AlT;
import X.C452501pT;
import X.C540070LGb;
import X.InterfaceC1207030hW1;
import X.InterfaceC1207170hWF;
import X.InterfaceC1294060jmO;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;
import com.ss.android.ugc.aweme.ui.LocationServicePreciseSettingCell;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.LocationServiceForM;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationServiceForPreciseProxy implements ILocationBaseServiceForMT {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(580));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1205460hTU());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1205440hTS());

    public final C1207210hWJ LJJIJIL() {
        return (C1207210hWJ) this.LIZ.getValue();
    }

    public final C1206950hVt LJJIJL() {
        return (C1206950hVt) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final Map<String, String> LIZ() {
        return LJJIJLIJ().LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final Class<? extends PowerCell<?>> LJIIIZ() {
        LJJIJL().getClass();
        return LocationServicePreciseSettingCell.class;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJIIJ() {
        return LJJIJLIJ().LJIIJ();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJIIL() {
        return LJJIJIL().LJIJ();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJIILJJIL() {
        return C1205450hTT.LIZ().maxAccuracyLevel == 2 ? LJJIJIL().LIZ() == 2 : LJJIJLIJ().LJIILJJIL();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJIILL() {
        LJJIJLIJ().LJIILL();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final List<String> LJIIZILJ() {
        return LJJIJIL().LIZIZ();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final InterfaceC1891350zJl LJIJI() {
        return LJJIJL().LJIJI();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJJ() {
        return LJJIJIL().LJIIJ();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJJIIJ() {
        return LJJIJLIJ().LJJIIJ();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJJIJ() {
        return LJJIJLIJ().LJJIJ();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJJIJIIJI() {
        LJJIJLIJ().LJJIJIIJI();
    }

    public final ILocationBaseServiceForMT LJJIJLIJ() {
        return LJJIJIL().LJIILJJIL() ? LJJIJL() : (LocationServiceForM) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LIZIZ(boolean z) {
        LJJIJLIJ().LIZIZ(z);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJ(Context context) {
        return LJJIJLIJ().LJ(context);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJFF(Context context) {
        return LJJIJL().LJFF(context);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJI(Context context) {
        return LJJIJL().LJI(context);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJII(Context context) {
        return LJJIJIL().LJIJJ(context);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final C540070LGb LJIIIIZZ(String str) {
        return LJJIJLIJ().LJIIIIZZ(str);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final C540070LGb LJIILLIIL(String str) {
        return LJJIJLIJ().LJIILLIIL(str);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJIJ(List<C0HWO> list) {
        LJJIJLIJ().LJIJ(list);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final CharSequence LJIJJ(Context context) {
        return LJJIJL().LJIJJ(context);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final CharSequence LJJI(Context context) {
        return LJJIJL().LJJI(context);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final PoiSearchRequestBody LJJII(PoiSearchRequestBody poiSearchRequestBody) {
        return LJJIJLIJ().LJJII(poiSearchRequestBody);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJJIIJZLJL(Context context) {
        return LJJIJIL().LJIJI(context);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final String LJJIIZ(Context context) {
        return LJJIJLIJ().LJJIIZ(context);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJJIIZI(View view) {
        LJJIJL().LJJIIZI(view);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJJIJIIJIL(Context context) {
        LJJIJL().LJJIJIIJIL(context);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJJIFFI(AFwS256S0000000_18 aFwS256S0000000_18, boolean z) {
        LJJIJLIJ().LJJIFFI(aFwS256S0000000_18, z);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJJIII(Context context, Map<String, String> map) {
        LJJIJLIJ().LJJIII(context, map);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final View LJIILIIL(Context context, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, AwS562S0100000_18 awS562S0100000_18) {
        return LJJIJLIJ().LJIILIIL(context, viewOnAttachStateChangeListenerC20604515jv, awS562S0100000_18);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LIZLLL(Activity activity, Fragment fragment, C1207520hWo c1207520hWo, InterfaceC1207170hWF interfaceC1207170hWF, String str) {
        LJJIJLIJ().LIZLLL(activity, fragment, c1207520hWo, interfaceC1207170hWF, str);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final C1198940hIy LJIIJJI(Context context, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, AwS384S0200000_18 awS384S0200000_18, AwS562S0100000_18 awS562S0100000_18, AwS562S0100000_18 awS562S0100000_182) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getGpsBannerHeaderView: ");
        sbLIZ.append(LJJIJLIJ());
        C2188811AlT.LIZIZ(sbLIZ);
        return LJJIJLIJ().LJIIJJI(context, viewOnAttachStateChangeListenerC20604515jv, awS384S0200000_18, awS562S0100000_18, awS562S0100000_182);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJIL(Activity activity, Fragment fragment, TokenCert tokenCert, C1207520hWo c1207520hWo, InterfaceC1207170hWF interfaceC1207170hWF) {
        LJJIJLIJ().LJIL(activity, fragment, tokenCert, c1207520hWo, interfaceC1207170hWF);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    @InterfaceC1294060jmO
    public final void LJIJJLI(String str, String str2, Cert cert, Activity activity, C1207520hWo c1207520hWo, InterfaceC1207030hW1 interfaceC1207030hW1, boolean z, boolean z2) {
        LJJIJLIJ().LJIJJLI(str, str2, cert, activity, c1207520hWo, interfaceC1207030hW1, z, z2);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    @InterfaceC1294060jmO
    public final void LIZJ(String str, String str2, Activity activity, AbstractC1201400hMw abstractC1201400hMw, Cert cert, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, String str3) {
        LJJIJLIJ().LIZJ(str, str2, activity, abstractC1201400hMw, cert, function0, function02, function03, str3);
    }
}
