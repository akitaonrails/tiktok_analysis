package com.ss.android.ugc.aweme.poi.quiz.vm;

import X.C09YA;
import X.C0PEM;
import X.C1175020ggO;
import X.C1178340glk;
import X.C1178440glu;
import X.C1182710gsn;
import X.C1182790gsv;
import X.C2188811AlT;
import X.C23250099c;
import X.EnumC1182690gsl;
import X.EnumC1182750gsr;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizConfigModel;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizItem;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizResponse;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizPageVM extends AssemViewModel<C1178340glk> {
    public static final /* synthetic */ int LLJILJIL = 0;
    public String LL;
    public C1175020ggO LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;
    public InterfaceC665370Q7z LLIZ;
    public PoiQuizResponse LLIZLLLIL;
    public PoiQuizConfigModel LLJ;
    public C1178440glu LLJI;
    public final C09YA LLILZIL = new C09YA(this, AFwS206S0000000_18.get$arr$(442));
    public final C1182710gsn LLILZLL = new C1182710gsn(this);
    public boolean LLJIJIL = true;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1178340glk(0);
    }

    public final List<PoiQuizItem> vQ2() {
        PoiQuizResponse poiQuizResponse = this.LLIZLLLIL;
        if (poiQuizResponse != null) {
            return poiQuizResponse.poiList;
        }
        return null;
    }

    public final void xQ2() {
        if (this.LLJI == null || !C1178440glu.LIZJ()) {
            yQ2(null);
            return;
        }
        C1182710gsn c1182710gsn = this.LLILZLL;
        EnumC1182750gsr enumC1182750gsr = c1182710gsn.LIZJ;
        if (enumC1182750gsr != null) {
            enumC1182750gsr.onPoiListDataStart(c1182710gsn);
        }
        C1178440glu c1178440glu = this.LLJI;
        if (c1178440glu != null) {
            c1178440glu.LIZIZ(new AwS562S0100000_18(this, 1717), new AwS597S0100000_18(this, 437));
        }
    }

    public final void yQ2(LocationData locationData) {
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1182790gsv(this, locationData, null), 2);
    }

    public final void wQ2(String str, boolean z) {
        String str2;
        EnumC1182690gsl enumC1182690gsl;
        C1175020ggO c1175020ggO = this.LLILLJJLI;
        if (c1175020ggO != null) {
            str2 = c1175020ggO.LIZ;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handlePoiSelected, poi_id is ");
        sbLIZ.append(str);
        sbLIZ.append(", animToCenter=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLJJLI = new C1175020ggO(str, z);
        C1182710gsn c1182710gsn = this.LLILZLL;
        c1182710gsn.getClass();
        if (str != null && str.length() != 0 && (enumC1182690gsl = c1182710gsn.LIZIZ) != null) {
            enumC1182690gsl.onMarkerHighlight(c1182710gsn, str);
        }
    }
}
