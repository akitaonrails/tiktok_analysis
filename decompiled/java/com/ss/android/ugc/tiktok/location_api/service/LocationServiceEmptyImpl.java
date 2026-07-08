package com.ss.android.ugc.tiktok.location_api.service;

import X.AbstractC1549150qPp;
import X.AbstractC738140SxQ;
import X.C0CCZ;
import X.C0TSW;
import X.C1202170hOB;
import X.C1207520hWo;
import X.C13IQ;
import X.C1AG0;
import X.C1AUN;
import X.C2097608Jq;
import X.C2418809dq;
import X.C687980Qyi;
import X.InterfaceC1207030hW1;
import X.InterfaceC1207440hWg;
import X.InterfaceC19359210oY;
import X.InterfaceC687820QyS;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tiktok.location_api.service.jsb.RequestLocationData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationServiceEmptyImpl implements ILocationService {
    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LIZIZ(Fragment fragment, Aweme aweme, String str, boolean z) {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final View LIZJ(Context context, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        return null;
    }

    @Override // X.InterfaceC1207490hWl
    public final void LIZLLL(TokenCert tokenCert, Activity activity, Fragment fragment, C1207520hWo c1207520hWo, InterfaceC1207030hW1 interfaceC1207030hW1, C687980Qyi c687980Qyi, InterfaceC19359210oY interfaceC19359210oY) {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJ() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final C0CCZ LJFF() {
        return null;
    }

    @Override // X.InterfaceC1207490hWl
    public final boolean LJI(String str, String str2) {
        return false;
    }

    @Override // X.InterfaceC1207490hWl
    public final boolean LJII(int i, Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIIIZ(View view, boolean z) {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final View LJIIJ(View view) {
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIILJJIL() {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIILL(C1202170hOB c1202170hOB) {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIILLIIL(Context context, View view, Function0 function0) {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJIIZILJ() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJIJ() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final C13IQ<? extends AbstractC738140SxQ> LJIJI() {
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIJJLI() {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJIL(String... strArr) {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJIILIIL() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1AUN.class);
        arrayList.add(C0TSW.class);
        arrayList.add(RequestLocationData.class);
        arrayList.add(C1AG0.class);
        arrayList.add(C2418809dq.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final Map<String, String> LIZ() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1207490hWl
    public final LocationData LJIIIIZZ(TokenCert tokenCert, TokenCert tokenCert2) {
        return new LocationData(0.0d, 0.0d, 0L, -1001, "No implementation", 0, false, 0.0d, null, 0, null, null, null, null, null, null, null, null, null, 524263, null);
    }

    @Override // X.InterfaceC1207490hWl
    public final void LJIIL(String str, String str2, Cert cert, Cert cert2, InterfaceC687820QyS interfaceC687820QyS, Long l) {
        interfaceC687820QyS.onError(-1001, "No implementation");
    }

    @Override // X.InterfaceC1207490hWl
    public final void LJIJJ(String str, String str2, Cert cert, Activity activity, C1207520hWo c1207520hWo, InterfaceC1207030hW1 interfaceC1207030hW1, InterfaceC1207440hWg interfaceC1207440hWg) {
        if (interfaceC1207030hW1 != null) {
            interfaceC1207030hW1.LIZIZ(0, "empty impl");
        }
    }
}
