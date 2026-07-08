package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track;

import X.C01GW;
import X.C04B4;
import X.C04B9;
import X.C04BJ;
import X.C04G1;
import X.C1054104Ah;
import X.C1748720vbi;
import X.C1762750vyL;
import X.C1764220w0i;
import X.C1764510w1B;
import X.C452501pT;
import X.EnumC1764120w0Y;
import X.InterfaceC1748810vbr;
import X.InterfaceC665370Q7z;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS0S0411000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS5S2100100_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaGodaV1TrackHelper implements ISeaTrackHelper {
    public final InterfaceC665370Q7z LL;
    public final InterfaceC1748810vbr LLILLJJLI;
    public final SeaPdpViewModel LLILLL;
    public final PageFinder LLILZ;
    public int LLJ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 402));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 401));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 403));
    public final Set<String> LLIZLLLIL = new LinkedHashSet();
    public final Set<String> LLJI = new LinkedHashSet();

    public final ISeaListHelper LIZ() {
        return (ISeaListHelper) this.LLILZIL.getValue();
    }

    public final Map<String, Object> LIZIZ(int i) {
        String str;
        C1764510w1B c1764510w1BYN;
        List<C04G1> list;
        int size;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = i + 1;
        ISeaListHelper iSeaListHelperLIZ = LIZ();
        if (iSeaListHelperLIZ != null && (c1764510w1BYN = iSeaListHelperLIZ.yN()) != null && (list = c1764510w1BYN.LIZIZ) != null && (size = list.size()) > 1) {
            if (i == 0) {
                str = "first";
            } else if (i == size - 1) {
                str = "last";
            } else {
                str = "middle";
            }
        } else {
            str = "single";
        }
        linkedHashMap.put("position_rank", Integer.valueOf(i2));
        linkedHashMap.put("position_type", str);
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track.ISeaTrackHelper
    public final void XF0(C04G1 c04g1, String str, Map<String, ? extends Object> map) {
        Integer numValueOf;
        int iIntValue;
        if (this.LLIZLLLIL.contains(c04g1.LJIILIIL)) {
            return;
        }
        this.LLIZLLLIL.add(c04g1.LJIILIIL);
        ISeaListHelper iSeaListHelperLIZ = LIZ();
        Object objLIZ = null;
        if (iSeaListHelperLIZ != null) {
            numValueOf = Integer.valueOf(iSeaListHelperLIZ.sz());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue() + 1;
        } else {
            iIntValue = -1;
        }
        PageStateContext pageStateContext = (PageStateContext) this.LLIZ.getValue();
        if (pageStateContext != null) {
            objLIZ = PageStateContext.LIZ(pageStateContext, "page_show_type");
        }
        AwS0S0411000_26 awS0S0411000_26 = new AwS0S0411000_26(this, (SeaGodaV1TrackHelper) numValueOf, (Integer) iIntValue, (int) Intrinsics.LJFF(objLIZ, 2), (boolean) c04g1, (C04G1) map, (Map<String, ? extends Object>) 1);
        if (str != null && str.length() != 0 && this.LLILZ != null) {
            InterfaceC1748810vbr interfaceC1748810vbr = this.LLILLJJLI;
            if (interfaceC1748810vbr != null) {
                C1748720vbi.LIZ(interfaceC1748810vbr, new C04B4(), str, this.LLILZ, awS0S0411000_26);
                return;
            }
            return;
        }
        InterfaceC1748810vbr interfaceC1748810vbr2 = this.LLILLJJLI;
        if (interfaceC1748810vbr2 == null) {
            return;
        }
        C1748720vbi.LIZIZ(interfaceC1748810vbr2, new C04B4(), awS0S0411000_26);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track.ISeaTrackHelper
    public final void yH2(C04G1 c04g1, String str, Map<String, ? extends Object> map) {
        Integer numValueOf;
        int iIntValue;
        ISeaListHelper iSeaListHelperLIZ = LIZ();
        Object objLIZ = null;
        if (iSeaListHelperLIZ != null) {
            numValueOf = Integer.valueOf(iSeaListHelperLIZ.sz());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue() + 1;
        } else {
            iIntValue = -1;
        }
        PageStateContext pageStateContext = (PageStateContext) this.LLIZ.getValue();
        if (pageStateContext != null) {
            objLIZ = PageStateContext.LIZ(pageStateContext, "page_show_type");
        }
        AwS0S0411000_26 awS0S0411000_26 = new AwS0S0411000_26(this, (SeaGodaV1TrackHelper) numValueOf, (Integer) iIntValue, (int) Intrinsics.LJFF(objLIZ, 2), (boolean) c04g1, (C04G1) map, (Map<String, ? extends Object>) 0);
        if (str != null && str.length() != 0 && this.LLILZ != null) {
            InterfaceC1748810vbr interfaceC1748810vbr = this.LLILLJJLI;
            if (interfaceC1748810vbr != null) {
                C1748720vbi.LIZ(interfaceC1748810vbr, new C04BJ(), str, this.LLILZ, awS0S0411000_26);
                return;
            }
            return;
        }
        InterfaceC1748810vbr interfaceC1748810vbr2 = this.LLILLJJLI;
        if (interfaceC1748810vbr2 == null) {
            return;
        }
        C1748720vbi.LIZIZ(interfaceC1748810vbr2, new C04BJ(), awS0S0411000_26);
    }

    public SeaGodaV1TrackHelper(InterfaceC665370Q7z interfaceC665370Q7z, InterfaceC1748810vbr interfaceC1748810vbr, SeaPdpViewModel seaPdpViewModel, PageFinder pageFinder) {
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = interfaceC1748810vbr;
        this.LLILLL = seaPdpViewModel;
        this.LLILZ = pageFinder;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track.ISeaTrackHelper
    public final void O10(C04G1 c04g1, int i, EnumC1764120w0Y enumC1764120w0Y, Map map) {
        String str;
        String str2;
        Object objLIZ;
        if (i > this.LLJ) {
            str = "left";
        } else {
            str = "right";
        }
        if (enumC1764120w0Y == EnumC1764120w0Y.BLACK_PAGE) {
            str2 = "viewer";
        } else {
            str2 = "main";
        }
        this.LLJ = i;
        PageStateContext pageStateContext = (PageStateContext) this.LLIZ.getValue();
        if (pageStateContext != null) {
            objLIZ = PageStateContext.LIZ(pageStateContext, "page_show_type");
        } else {
            objLIZ = null;
        }
        C1764220w0i c1764220w0i = new C1764220w0i(this, Intrinsics.LJFF(objLIZ, 2), str, str2, c04g1, map, i);
        InterfaceC1748810vbr interfaceC1748810vbr = this.LLILLJJLI;
        if (interfaceC1748810vbr != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbr, new C04B9(), c1764220w0i);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track.ISeaTrackHelper
    public final void ka2(int i, String str, Boolean bool, String str2) {
        int iVh2;
        boolean z;
        String str3 = str2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ISeaListHelper iSeaListHelperLIZ = LIZ();
        if (iSeaListHelperLIZ != null) {
            iVh2 = iSeaListHelperLIZ.vh2();
        } else {
            iVh2 = 0;
        }
        boolean z2 = true;
        if (i == iVh2) {
            z = true;
        } else {
            z = false;
        }
        if (!this.LLJI.contains(str) && z) {
            if (Intrinsics.LJFF(str, "video") && !Intrinsics.LJFF(bool, Boolean.TRUE)) {
                z2 = false;
            }
            if ((Intrinsics.LJFF(str, "video") && !this.LLILLL.LLIZLLLIL) || !z2) {
                return;
            }
            this.LLJI.add(str);
            SeaPdpViewModel seaPdpViewModel = this.LLILLL;
            long j = jCurrentTimeMillis - seaPdpViewModel.m;
            C1054104Ah c1054104Ah = seaPdpViewModel.LLJLIL;
            if (c1054104Ah == null) {
                return;
            }
            if (str3 == null) {
                str3 = "";
            }
            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
            if (interfaceC1748810vbrLJJIZ == null) {
                return;
            }
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C1762750vyL(), new AwS5S2100100_26(c1054104Ah, str3, j, str, 1));
        }
    }
}
