package com.ss.android.ugc.aweme.poi.mapdetail.assem;

import X.C01D1;
import X.C09R3;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailAreaFilterVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailAreaFilterAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public View LLJI;
    public View LLJIJIL;
    public C197039127h LLJILJIL;
    public C197039127h LLJILJILJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapDetailAreaFilterAssem.class, "filterVM", "getFilterVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailAreaFilterVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapDetailAreaFilterAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailPageVM;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiMapDetailAreaFilterAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapDetailAreaFilterVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 407), AFwS256S0000000_18.get$arr$(465), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapDetailPageVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 408), AFwS256S0000000_18.get$arr$(466), null, true);
    }

    public final PoiMapDetailAreaFilterVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (PoiMapDetailAreaFilterVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailAreaFilterAssem.onViewCreated(android.view.View):void");
    }
}
