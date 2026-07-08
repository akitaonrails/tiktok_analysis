package com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map;

import X.C09R9;
import X.C0PEM;
import X.C1158330gFT;
import X.C1165520gR4;
import X.C1165940gRk;
import X.C1178080glK;
import X.C1178490glz;
import X.C1198470hID;
import X.C13LE;
import X.C15438062q;
import X.C1697810uHb;
import X.C23250099c;
import X.InterfaceC0148002o;
import X.InterfaceC1177110gjl;
import X.InterfaceC1177250gjz;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.content.poicampaign.PoiVideoSummary;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCampaignMapVM extends AssemViewModel<C1158330gFT> {
    public InterfaceC1177250gjz LL;
    public InterfaceC1177110gjl<C1178080glK> LLILLJJLI;
    public final C09R9 LLILLL = new C09R9(this, C13LE.LIZ(C1198470hID.class));
    public List<C1178080glK> LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158330gFT(0);
    }

    public final void vQ2() {
        C1165940gRk c1165940gRkLJJIJIIJIL;
        InterfaceC1177250gjz interfaceC1177250gjz = this.LL;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1165520gR4(this, (interfaceC1177250gjz == null || (c1165940gRkLJJIJIIJIL = interfaceC1177250gjz.LJJIJIIJIL()) == null) ? null : c1165940gRkLJJIJIIJIL.bounds, null), 2);
    }

    public static Pair wQ2(List list) {
        double dDoubleValue;
        double dDoubleValue2;
        if (list == null) {
            return new Pair(null, null);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                PoiVideoSummary poiVideoSummary = (PoiVideoSummary) obj;
                String str = poiVideoSummary.poiId;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                linkedHashSet.add(str);
                String str3 = poiVideoSummary.poiId;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = poiVideoSummary.poiName;
                if (str4 != null) {
                    str2 = str4;
                }
                String str5 = poiVideoSummary.thumbnail;
                Double d = poiVideoSummary.latitude;
                if (d != null) {
                    dDoubleValue = d.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                Double d2 = poiVideoSummary.longitude;
                if (d2 != null) {
                    dDoubleValue2 = d2.doubleValue();
                } else {
                    dDoubleValue2 = 0.0d;
                }
                arrayList.add(new C1178080glK(str3, str2, list.size() - i, new C1178490glz(dDoubleValue, dDoubleValue2), str5, false, poiVideoSummary.collectInfo, 194));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return new Pair(linkedHashSet, arrayList);
    }
}
