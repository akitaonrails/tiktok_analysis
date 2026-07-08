package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel;

import X.C004I;
import X.C036E;
import X.C09R3;
import X.C11S5;
import X.C13LE;
import X.C1701940uOG;
import X.C1744340vUe;
import X.C1747870vaL;
import X.C20136513qd;
import X.C2217371BqR;
import X.C769700UHg;
import X.InterfaceC1744330vUd;
import X.InterfaceC2217461Bqa;
import Y.AfS195S0100000_26;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.RegionRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class DistrictPickerViewModel extends JediViewModel<DistrictPickerState> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public String[] LLILZIL;
    public OrderSKUDTO LLILZLL;
    public final C20136513qd LLIZ;
    public final C20136513qd LLIZLLLIL;
    public ArrayList<Region> LLJ;
    public boolean LLJI;
    public Integer LLJIJIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(DistrictPickerViewModel.class, "numberOfRemainingLevel", "getNumberOfRemainingLevel()I", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217371BqR c2217371BqR2 = new C2217371BqR(DistrictPickerViewModel.class, "parentId", "getParentId()I", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2};
    }

    public final void iR2() {
        try {
            if (C036E.LIZ.LIZIZ()) {
                setState(new AwS38S0001000_26(0, 13));
                String[] strArr = this.LLILZIL;
                if (strArr == null) {
                    strArr = new String[0];
                }
                OrderSKUDTO orderSKUDTO = this.LLILZLL;
                RegionRequest regionRequest = new RegionRequest(strArr, orderSKUDTO != null ? Collections.singletonList(orderSKUDTO) : null, null, null, null, this.LLJIJIL, null, C1747870vaL.LIZ);
                InterfaceC1744330vUd.LIZ.getClass();
                ((InterfaceC1744330vUd) C1744340vUe.LIZIZ.create(InterfaceC1744330vUd.class)).LIZLLL(regionRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS195S0100000_26(this, 12), new AfS195S0100000_26(this, 13));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        setState(new AwS38S0001000_26(2, 13));
    }

    public final boolean jR2() {
        return this.LLJI && ((Number) this.LLIZ.getValue(this, LLJILJIL[0])).intValue() > 0;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new DistrictPickerState(null, null, null, null, 0, 31, null);
    }

    public DistrictPickerViewModel() {
        C769700UHg.LIZ.getClass();
        this.LLIZ = new C20136513qd();
        this.LLIZLLLIL = new C20136513qd();
        this.LLJ = new ArrayList<>();
    }

    public static List kR2(List list) {
        String upperCase;
        ArrayList arrayList = new ArrayList();
        if (list.size() > 7) {
            Iterator it2 = list.iterator();
            String str = "";
            while (it2.hasNext()) {
                District district = (District) it2.next();
                String str2 = district.index;
                if (str2 != null && (upperCase = str2.toUpperCase(Locale.ROOT)) != null && !Intrinsics.LJFF(upperCase, str)) {
                    arrayList.add(upperCase);
                    str = upperCase;
                }
                arrayList.add(district);
            }
        } else {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public final ArrayList<Region> hR2(District district) {
        ArrayList<Region> arrayList = new ArrayList<>(this.LLJ);
        arrayList.add(new Region(district.name, district.geoNameId, null, null, null, null, null));
        return arrayList;
    }
}
