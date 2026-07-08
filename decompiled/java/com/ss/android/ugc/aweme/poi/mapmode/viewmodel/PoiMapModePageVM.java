package com.ss.android.ugc.aweme.poi.mapmode.viewmodel;

import X.C09YA;
import X.C0PEM;
import X.C1170010gYJ;
import X.C1174440gfS;
import X.C1174450gfT;
import X.C1174480gfW;
import X.C1174520gfa;
import X.C1174530gfb;
import X.C1174650gfn;
import X.C1174740gfw;
import X.C1174780gg0;
import X.C1174990ggL;
import X.C1175020ggO;
import X.C1185430gxB;
import X.C1558520qew;
import X.C2188811AlT;
import X.C23250099c;
import X.C614900O9w;
import X.EnumC1174570gff;
import X.EnumC1175380ggy;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.mapmode.assem.IPoiMapModeMapAssemAbility;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeDataParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS7S3100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModePageVM extends AssemViewModel<C1174440gfS> {
    public static final /* synthetic */ int LLJILLL = 0;
    public final C1174480gfW LL = new C1174480gfW(this);
    public final MutableLiveData<C1175020ggO> LLILLJJLI;
    public final MutableLiveData LLILLL;
    public EnumC1175380ggy LLILZ;
    public PoiMapModeDataParams LLILZIL;
    public PoiMapModeMobParams LLILZLL;
    public InterfaceC665370Q7z LLIZ;
    public C1174650gfn LLIZLLLIL;
    public PageFinder LLJ;
    public final C1174990ggL LLJI;
    public PoiMapModeResponse LLJIJIL;
    public final C09YA LLJILJIL;
    public boolean LLJILJILJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1174440gfS(null, null, null);
    }

    public PoiMapModePageVM() {
        MutableLiveData<C1175020ggO> mutableLiveData = new MutableLiveData<>(null);
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = mutableLiveData;
        this.LLJI = new C1174990ggL();
        this.LLJILJIL = new C09YA(this, AFwS206S0000000_18.get$arr$(409));
        this.LLJILJILJ = true;
    }

    public final C1174450gfT vQ2() {
        return getState().LLILLL;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    public final void AQ2(InterfaceC665370Q7z interfaceC665370Q7z) {
        C1185430gxB.LJJIJL(C1185430gxB.LIZ, "poi_detail", "click", interfaceC665370Q7z, "poi_secondary_map_mode_page", "region_discovery", this.LLJ);
    }

    public final PoiMapModeResponse xQ2(C614900O9w c614900O9w, boolean z) {
        List<PoiDiscoveryCard> poiList;
        ((LinkedHashMap) this.LLJI.LIZ).clear();
        PoiMapModeResponse poiMapModeResponse = this.LLJIJIL;
        if (poiMapModeResponse != null) {
            poiList = poiMapModeResponse.getPoiList();
        } else {
            poiList = null;
        }
        ArrayList arrayList = new ArrayList();
        if (poiList != null) {
            for (PoiDiscoveryCard poiDiscoveryCard : poiList) {
                String str = poiDiscoveryCard.poiId;
                String str2 = c614900O9w.LIZIZ;
                if (str2 == null) {
                    str2 = "";
                }
                if (Intrinsics.LJFF(str, str2)) {
                    arrayList.add(poiDiscoveryCard.copy(poiDiscoveryCard.poiId, poiDiscoveryCard.schema, poiDiscoveryCard.poiName, poiDiscoveryCard.categoryName, poiDiscoveryCard.averagePrice, poiDiscoveryCard.videoCount, poiDiscoveryCard.videoCountForShow, poiDiscoveryCard.timeForShow, poiDiscoveryCard.exactDistanceForShow, poiDiscoveryCard.estimatedDistanceForShow, poiDiscoveryCard.formattedAddress, Boolean.valueOf(c614900O9w.LIZ), poiDiscoveryCard.collectInfo, poiDiscoveryCard.videoList, poiDiscoveryCard.regionCode, poiDiscoveryCard.cityCode, poiDiscoveryCard.typeLevel, poiDiscoveryCard.location, poiDiscoveryCard.poiTitleImg, poiDiscoveryCard.isClaimed, poiDiscoveryCard.poiHeaderImg, poiDiscoveryCard.reviewScore, poiDiscoveryCard.reviewMaxScore, poiDiscoveryCard.reviewCount, poiDiscoveryCard.highlightTags, poiDiscoveryCard.poiTags, poiDiscoveryCard.poiDetailTagStyleMap, poiDiscoveryCard.poiDistanceForShow, poiDiscoveryCard.poiDistanceFromCenter, poiDiscoveryCard.keyCategory, poiDiscoveryCard.poiDisplay, poiDiscoveryCard.realTimeFavCnt, poiDiscoveryCard.poiBackendType, poiDiscoveryCard.poiDistance, poiDiscoveryCard.noRating, poiDiscoveryCard.sortDistanceMeter, poiDiscoveryCard.poiTrustTag, poiDiscoveryCard.poiCropHeaderImg, poiDiscoveryCard.isPoiHasProduct, poiDiscoveryCard.hotelShelfInfo, poiDiscoveryCard.poiMapPinInfo, poiDiscoveryCard.categoryForMarker, poiDiscoveryCard.isHotelMarkerSpecial, poiDiscoveryCard.originalIndex, poiDiscoveryCard.upperTag, poiDiscoveryCard.addressInfo, poiDiscoveryCard.coverImg, poiDiscoveryCard.productInfo));
                } else {
                    arrayList.add(poiDiscoveryCard);
                }
            }
        }
        PoiMapModeResponse poiMapModeResponse2 = this.LLJIJIL;
        if (poiMapModeResponse2 != null) {
            poiMapModeResponse2.setPoiList(arrayList);
        }
        if (z) {
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1170010gYJ(c614900O9w, null), 2);
        }
        return this.LLJIJIL;
    }

    public final void yQ2(String str, boolean z) {
        String str2;
        EnumC1174570gff enumC1174570gff;
        C1175020ggO value = this.LLILLJJLI.getValue();
        if (value != null) {
            str2 = value.LIZ;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("google_map_map_mode handlePoiSelected, poi_id is ");
        sbLIZ.append(str);
        sbLIZ.append(", animToCenter=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLJJLI.postValue(new C1175020ggO(str, z));
        C1174480gfW c1174480gfW = this.LL;
        c1174480gfW.getClass();
        if (str != null && str.length() != 0 && (enumC1174570gff = c1174480gfW.LIZIZ) != null) {
            enumC1174570gff.onMarkerHighlight(c1174480gfW, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c0  */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(X.C1174650gfn r30, boolean r31, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse> r32) {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM.zQ2(X.0gfn, boolean, X.05Vn):java.lang.Object");
    }

    public final void wQ2(String str, PoiLandmark poiLandmark, String str2, String str3) {
        String str4;
        MapBounds mapBoundsMb1;
        IPoiMapModeMapAssemAbility iPoiMapModeMapAssemAbility;
        C1174450gfT c1174450gfT = getState().LLILLL;
        if (c1174450gfT != null) {
            str4 = c1174450gfT.filterDistance;
        } else {
            str4 = null;
        }
        setStateImmediate(new AwS7S3100000_18(str, poiLandmark, str2, str3, 0));
        C1174480gfW c1174480gfW = this.LL;
        c1174480gfW.LIZ.yQ2(null, true);
        EnumC1174570gff enumC1174570gff = c1174480gfW.LIZIZ;
        if (enumC1174570gff != null) {
            enumC1174570gff.onChangeCurrentTab(c1174480gfW);
        }
        if (str4 != null && str2 == null) {
            PoiMapModeDataParams poiMapModeDataParams = this.LLILZIL;
            if (poiMapModeDataParams != null && poiMapModeDataParams.isTargetPoiValid$poi_release()) {
                C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1174780gg0(this, null), 2);
                return;
            } else {
                C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1174530gfb(this, null), 2);
                return;
            }
        }
        if (poiLandmark != null && str2 != null && str2.length() != 0) {
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1174740gfw(this, poiLandmark, null), 2);
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLIZ;
        if (interfaceC665370Q7z != null && (iPoiMapModeMapAssemAbility = (IPoiMapModeMapAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiMapModeMapAssemAbility.class, null)) != null) {
            mapBoundsMb1 = iPoiMapModeMapAssemAbility.Mb1();
        } else {
            mapBoundsMb1 = null;
        }
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1174520gfa(this, mapBoundsMb1, null), 2);
    }
}
