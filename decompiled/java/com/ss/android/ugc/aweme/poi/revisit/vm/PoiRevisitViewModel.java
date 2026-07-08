package com.ss.android.ugc.aweme.poi.revisit.vm;

import X.C01GW;
import X.C09R9;
import X.C09YA;
import X.C0OA1;
import X.C0PEM;
import X.C1076190e6z;
import X.C1169990gYH;
import X.C1176580giu;
import X.C1177630gkb;
import X.C1177670gkf;
import X.C1177680gkg;
import X.C1177730gkl;
import X.C1177920gl4;
import X.C1198600hIQ;
import X.C1200890hM7;
import X.C1207450hWh;
import X.C13LE;
import X.C2188811AlT;
import X.C23250099c;
import X.C297520BlO;
import X.C614880O9u;
import X.C614900O9w;
import X.C616670OGr;
import X.EnumC1076160e6w;
import X.EnumC1177720gkk;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC687820QyS;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRevisitViewModel extends AssemViewModel<C616670OGr> {
    public C1177730gkl LLILLJJLI;
    public PoiRevisitApi.PoiRevisitCardListResponse LLILLL;
    public String LLILZIL;
    public Double LLIZ;
    public Double LLIZLLLIL;
    public InterfaceC665370Q7z LLJ;
    public final MutableLiveData<C1177630gkb> LLJI;
    public final MutableLiveData LLJIJIL;
    public final MutableLiveData<Boolean> LLJILJIL;
    public final MutableLiveData LLJILJILJ;
    public final C1076190e6z LL = new C1076190e6z(this);
    public final C09R9 LLILZ = new C09R9(this, C13LE.LIZ(C1177920gl4.class));
    public final C09YA LLILZLL = new C09YA(this, AFwS206S0000000_18.get$arr$(518));

    public final void yQ2() {
        ArrayList arrayList;
        List<PoiRevisitApi.PoiRevisitCardModel> list;
        PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponseWQ2 = wQ2(true, true, true);
        if (poiRevisitCardListResponseWQ2 == null || (list = poiRevisitCardListResponseWQ2.poiCardList) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator<PoiRevisitApi.PoiRevisitCardModel> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().poiId;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        setState(new AwS588S0100000_9(arrayList, (List<InterfaceC1891350zJl>) 373));
    }

    public final void AQ2() {
        this.LL.LIZIZ(EnumC1177720gkk.POI_LIST_LOW_SHEET);
        C1076190e6z c1076190e6z = this.LL;
        EnumC1076160e6w enumC1076160e6w = EnumC1076160e6w.LIST_LOADING;
        synchronized (c1076190e6z) {
            c1076190e6z.LIZJ = enumC1076160e6w;
            c1076190e6z.LIZ();
        }
        C1177670gkf.LIZ.getClass();
        if (!C1177670gkf.LIZ() || C297520BlO.LIZ()) {
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C0OA1(this, null, null), 2);
            return;
        }
        final AwS588S0100000_9 awS588S0100000_9 = new AwS588S0100000_9(this, 433);
        C01GW c01gw = C1198600hIQ.LIZ;
        C1207450hWh.LIZ.LJIIL(C1177680gkg.LIZJ, C1177680gkg.LIZLLL, C1177680gkg.LJFF, (Cert) new Pair(CertProviderManagerKt.findCert("bpea-config-claim-poi_poi_claim_poi_locate_android", 1476788523), CertProviderManagerKt.findCert("bpea-claim_poi_fetch_cache_location_decrypt", 1476788524)).getSecond(), new InterfaceC687820QyS() { // from class: X.0gke
            @Override // X.InterfaceC687820QyS
            public final void LIZ(LocationData locationData) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchLocation Success, onLocationChanged lat=");
                sbLIZ.append(locationData.latitude);
                sbLIZ.append(", lon=");
                sbLIZ.append(locationData.longitude);
                sbLIZ.append(", encLat=");
                sbLIZ.append(locationData.encryptedLatitude);
                sbLIZ.append(", encLon=");
                sbLIZ.append(locationData.encryptedLongitude);
                C2188811AlT.LIZIZ(sbLIZ);
                this.LIZ.LLIZ = Double.valueOf(locationData.latitude);
                this.LIZ.LLIZLLLIL = Double.valueOf(locationData.longitude);
                Function1<LocationData, Unit> function1 = awS588S0100000_9;
                if (function1 != null) {
                    function1.invoke(locationData);
                }
            }

            @Override // X.InterfaceC687820QyS
            public final void onError(int i, String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchLocation Fail, errCode=");
                sbLIZ.append(i);
                sbLIZ.append(", errMsg=");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                Function1<LocationData, Unit> function1 = awS588S0100000_9;
                if (function1 != null) {
                    function1.invoke(null);
                }
            }
        }, -1L);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C616670OGr(0);
    }

    public PoiRevisitViewModel() {
        MutableLiveData<C1177630gkb> mutableLiveData = new MutableLiveData<>(null);
        this.LLJI = mutableLiveData;
        this.LLJIJIL = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(null);
        this.LLJILJIL = mutableLiveData2;
        this.LLJILJILJ = mutableLiveData2;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C614880O9u(this, null), 2);
    }

    public static MapBounds BQ2(C1176580giu c1176580giu) {
        return new MapBounds(String.valueOf(c1176580giu.northeast.lon), String.valueOf(c1176580giu.northeast.lat), String.valueOf(c1176580giu.southwest.lon), String.valueOf(c1176580giu.southwest.lat));
    }

    public static void zQ2(PoiRevisitViewModel poiRevisitViewModel, String str) {
        String str2;
        EnumC1177720gkk enumC1177720gkk;
        C1177630gkb value = poiRevisitViewModel.LLJI.getValue();
        if (value != null) {
            str2 = value.LIZ;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handlePoiSelected, poiId is ");
            sbLIZ.append(str);
            sbLIZ.append(", animToCenter=");
            sbLIZ.append(true);
            C2188811AlT.LIZIZ(sbLIZ);
            poiRevisitViewModel.LLJI.postValue(new C1177630gkb(str, true));
            C1076190e6z c1076190e6z = poiRevisitViewModel.LL;
            c1076190e6z.getClass();
            if (C1200890hM7.LIZ(str) && (enumC1177720gkk = c1076190e6z.LIZIZ) != null) {
                enumC1177720gkk.onMarkerHighlight(c1076190e6z, str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(com.bytedance.i18n.location.api.LocationData r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi.PoiRevisitCardListResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0OA2
            if (r0 == 0) goto L90
            r4 = r8
            X.0OA2 r4 = (X.C0OA2) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r0 = r4.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r3 = 1
            if (r1 == 0) goto L58
            if (r1 != r3) goto L97
            X.00zU r1 = r4.LLILLJJLI
            X.00zU r2 = r4.LL
            X.C155000ia.LIZIZ(r0)
        L26:
            r1.element = r0
        L28:
            T r1 = r2.element
            com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi$PoiRevisitCardListResponse r1 = (com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi.PoiRevisitCardListResponse) r1
            r6.LLILLL = r1
            X.0gkm r0 = com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitErrorFragment.LLJI
            r0.getClass()
            X.0gkn r0 = X.C1177740gkm.LIZ(r1)
            if (r0 == 0) goto L4e
            X.0e6z r1 = r6.LL
            X.0gkk r0 = r1.LIZIZ
            if (r0 == 0) goto L42
            r0.onError(r1)
        L42:
            X.0e6z r1 = r6.LL
            X.0e6w r0 = r1.LIZJ
            if (r0 == 0) goto L4b
            r0.onPoiListDataLoaded(r1)
        L4b:
            T r0 = r2.element
            return r0
        L4e:
            X.0e6z r1 = r6.LL
            X.0e6w r0 = r1.LIZJ
            if (r0 == 0) goto L4b
            r0.onPoiListDataLoaded(r1)
            goto L4b
        L58:
            X.C155000ia.LIZIZ(r0)
            X.0e6z r1 = r6.LL
            X.0e6w r0 = r1.LIZJ
            if (r0 == 0) goto L64
            r0.onPoiListDataStart(r1)
        L64:
            X.00zU r2 = new X.00zU
            r2.<init>()
            X.0gkl r0 = r6.LLILLJJLI
            if (r0 == 0) goto L28
            java.util.List r1 = r0.getCollectPoiIdList()
            if (r1 == 0) goto L28
            X.09R9 r0 = r6.LLILZ
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            X.00hg r0 = r0.getOperator()
            X.0gkw r0 = (X.InterfaceC1177840gkw) r0
            r4.LL = r2
            r4.LLILLJJLI = r2
            r4.LLILZIL = r3
            java.lang.Object r0 = r0.LJJJJJL(r1, r7, r4)
            if (r0 != r5) goto L8e
            return r5
        L8e:
            r1 = r2
            goto L26
        L90:
            X.0OA2 r4 = new X.0OA2
            r4.<init>(r6, r8)
            goto L12
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel.vQ2(com.bytedance.i18n.location.api.LocationData, X.05Vn):java.lang.Object");
    }

    public final void xQ2(C614900O9w c614900O9w, boolean z) {
        List<PoiRevisitApi.PoiRevisitCardModel> list;
        PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponse;
        PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponse2 = this.LLILLL;
        if (poiRevisitCardListResponse2 != null) {
            list = poiRevisitCardListResponse2.poiCardList;
        } else {
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (PoiRevisitApi.PoiRevisitCardModel poiRevisitCardModel : list) {
                String str = poiRevisitCardModel.poiId;
                String str2 = c614900O9w.LIZIZ;
                if (str2 == null) {
                    str2 = "";
                }
                if (Intrinsics.LJFF(str, str2)) {
                    arrayList.add(PoiRevisitApi.PoiRevisitCardModel.LIZ(poiRevisitCardModel, Boolean.valueOf(c614900O9w.LIZ), false, null, 134086655));
                } else {
                    arrayList.add(poiRevisitCardModel);
                }
            }
        }
        PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponse3 = this.LLILLL;
        if (poiRevisitCardListResponse3 != null) {
            poiRevisitCardListResponse = new PoiRevisitApi.PoiRevisitCardListResponse(arrayList, poiRevisitCardListResponse3.distanceIndex);
        } else {
            poiRevisitCardListResponse = null;
        }
        this.LLILLL = poiRevisitCardListResponse;
        if (z) {
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1169990gYH(c614900O9w, null), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056 A[PHI: r3 r5
      0x0056: PHI (r3v2 com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility) = 
      (r3v1 com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility)
      (r3v6 com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility)
      (r3v6 com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility)
     binds: [B:28:0x0053, B:17:0x0027, B:19:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String), (r5v3 java.lang.String) binds: [B:28:0x0053, B:17:0x0027, B:19:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d A[LOOP:1: B:50:0x0097->B:52:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0113  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [T] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.08CX] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi.PoiRevisitCardListResponse wQ2(boolean r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel.wQ2(boolean, boolean, boolean):com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi$PoiRevisitCardListResponse");
    }
}
