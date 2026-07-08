package com.ss.android.ugc.aweme.poi.mapdetail.viewmodel;

import X.AnonymousClass0956;
import X.C09YA;
import X.C0PEM;
import X.C1170000gYI;
import X.C1175650ghP;
import X.C1175660ghQ;
import X.C1175680ghS;
import X.C1175750ghZ;
import X.C1175770ghb;
import X.C1176200giI;
import X.C1176210giJ;
import X.C1176270giP;
import X.C1176430gif;
import X.C1185430gxB;
import X.C1558520qew;
import X.C2188811AlT;
import X.C23250099c;
import X.C614900O9w;
import X.EnumC1175760gha;
import X.EnumC1175790ghd;
import X.EnumC1176250giN;
import X.EnumC1176260giO;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailMapAssemAbility;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeTargetData;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailPageVM extends AssemViewModel<C1175650ghP> {
    public static final /* synthetic */ int LLJJI = 0;
    public final C1175770ghb LL = new C1175770ghb(this);
    public final MutableLiveData<C1176430gif> LLILLJJLI;
    public final MutableLiveData LLILLL;
    public EnumC1175760gha LLILZ;
    public C1175680ghS LLILZIL;
    public PoiMapModeMobParams LLILZLL;
    public InterfaceC665370Q7z LLIZ;
    public C1176270giP LLIZLLLIL;
    public PageFinder LLJ;
    public PoiMapDetailFilterVM LLJI;
    public PoiMapDetailNavTabVM LLJIJIL;
    public final C1175750ghZ LLJILJIL;
    public final C1176200giI LLJILJILJ;
    public final C09YA LLJILLL;
    public AnonymousClass0956 LLJJ;

    public final void AQ2() {
        PoiMapModeTargetData targetPoiData;
        String str;
        PoiMapDetailPageVM poiMapDetailPageVM = this;
        C1175680ghS c1175680ghS = poiMapDetailPageVM.LLILZIL;
        boolean z = false;
        if (c1175680ghS != null && c1175680ghS.isTargetPoiValid$poi_release()) {
            EnumC1176250giN enumC1176250giNWQ2 = poiMapDetailPageVM.wQ2(true);
            vQ2(poiMapDetailPageVM, new C1176270giP(enumC1176250giNWQ2 != null ? Integer.valueOf(enumC1176250giNWQ2.getValue()) : null, EnumC1176260giO.FIRST_HIGHLIGHT_REFRESH, null), true, false, 0L, 12);
        } else {
            EnumC1176250giN enumC1176250giNWQ22 = poiMapDetailPageVM.wQ2(true);
            poiMapDetailPageVM = poiMapDetailPageVM;
            z = false;
            vQ2(poiMapDetailPageVM, new C1176270giP(enumC1176250giNWQ22 != null ? Integer.valueOf(enumC1176250giNWQ22.getValue()) : null, EnumC1176260giO.FIRST_REFRESH, null), false, false, 0L, 12);
        }
        C1175680ghS c1175680ghS2 = poiMapDetailPageVM.LLILZIL;
        if (c1175680ghS2 == null || (targetPoiData = c1175680ghS2.getTargetPoiData()) == null || (str = targetPoiData.targetPoiId) == null) {
            return;
        }
        poiMapDetailPageVM.BQ2(str, z);
    }

    public final void zQ2() {
        IPoiMapDetailMapAssemAbility iPoiMapDetailMapAssemAbility;
        C1175770ghb c1175770ghb = this.LL;
        EnumC1175790ghd enumC1175790ghd = c1175770ghb.LIZIZ;
        if (enumC1175790ghd != null) {
            enumC1175790ghd.onFilterChanged(c1175770ghb);
        }
        PoiMapDetailFilterVM poiMapDetailFilterVM = this.LLJI;
        boolean z = (poiMapDetailFilterVM != null ? poiMapDetailFilterVM.vQ2() : null) == null;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLIZ;
        MapBounds mapBoundsGj1 = (interfaceC665370Q7z == null || (iPoiMapDetailMapAssemAbility = (IPoiMapDetailMapAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiMapDetailMapAssemAbility.class, null)) == null) ? null : iPoiMapDetailMapAssemAbility.Gj1(z);
        EnumC1176250giN enumC1176250giNWQ2 = wQ2(false);
        vQ2(this, new C1176270giP(enumC1176250giNWQ2 != null ? Integer.valueOf(enumC1176250giNWQ2.getValue()) : null, EnumC1176260giO.FILTER_CHANGE, mapBoundsGj1), false, false, 0L, 12);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1175650ghP(null, null, null);
    }

    public PoiMapDetailPageVM() {
        MutableLiveData<C1176430gif> mutableLiveData = new MutableLiveData<>(null);
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = mutableLiveData;
        this.LLJILJIL = new C1175750ghZ();
        this.LLJILJILJ = new C1176200giI(this);
        this.LLJILLL = new C09YA(this, AFwS206S0000000_18.get$arr$(382));
    }

    public final C1175660ghQ xQ2() {
        return getState().LLILLL;
    }

    public final void DQ2(InterfaceC665370Q7z interfaceC665370Q7z) {
        C1185430gxB.LJJIJL(C1185430gxB.LIZ, "poi_detail", "click", interfaceC665370Q7z, "poi_secondary_map_mode_page", "region_discovery", this.LLJ);
    }

    public final EnumC1176250giN wQ2(boolean z) {
        if (this.LLILZ == EnumC1175760gha.ACC_NEARBY) {
            return EnumC1176250giN.ACC;
        }
        if (z) {
            return null;
        }
        return EnumC1176250giN.WINDOW;
    }

    public final void BQ2(String str, boolean z) {
        String str2;
        EnumC1175790ghd enumC1175790ghd;
        C1176430gif value = this.LLILLJJLI.getValue();
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
        this.LLILLJJLI.postValue(new C1176430gif(str, z));
        C1175770ghb c1175770ghb = this.LL;
        c1175770ghb.getClass();
        if (str != null && str.length() != 0 && (enumC1175790ghd = c1175770ghb.LIZIZ) != null) {
            enumC1175790ghd.onMarkerHighlight(c1175770ghb, str);
        }
    }

    public final PoiMapDetailResponse yQ2(C614900O9w c614900O9w, boolean z) {
        List<PoiGeneralCard> listPoiList;
        ((LinkedHashMap) this.LLJILJIL.LIZ).clear();
        PoiMapDetailResponse poiMapDetailResponse = this.LLJILJILJ.LIZJ;
        if (poiMapDetailResponse != null && (listPoiList = poiMapDetailResponse.poiList()) != null) {
            for (PoiGeneralCard poiGeneralCard : listPoiList) {
                String poiId = poiGeneralCard.getPoiId();
                String str = c614900O9w.LIZIZ;
                if (str == null) {
                    str = "";
                }
                if (Intrinsics.LJFF(poiId, str)) {
                    poiGeneralCard.setCollected(Boolean.valueOf(c614900O9w.LIZ));
                }
            }
        }
        if (z) {
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1170000gYI(c614900O9w, null), 2);
        }
        return this.LLJILJILJ.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0ghQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(X.C1176270giP r42, boolean r43, boolean r44, long r45, X.InterfaceC1364105Vn<? super kotlin.Unit> r47) {
        /*
            Method dump skipped, instruction units count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM.CQ2(X.0giP, boolean, boolean, long, X.05Vn):java.lang.Object");
    }

    public static AnonymousClass0956 vQ2(PoiMapDetailPageVM poiMapDetailPageVM, C1176270giP c1176270giP, boolean z, boolean z2, long j, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            j = 0;
        }
        AnonymousClass0956 anonymousClass0956 = poiMapDetailPageVM.LLJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (!z2) {
            C1176200giI c1176200giI = poiMapDetailPageVM.LLJILJILJ;
            c1176200giI.LIZIZ.clear();
            c1176200giI.LIZJ = null;
            c1176200giI.LJFF = null;
        }
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(poiMapDetailPageVM.getAssemVMScope(), C0PEM.LIZJ, null, new C1176210giJ(poiMapDetailPageVM, c1176270giP, z, z2, j, null), 2);
        poiMapDetailPageVM.LLJJ = anonymousClass0956LIZLLL;
        return anonymousClass0956LIZLLL;
    }
}
