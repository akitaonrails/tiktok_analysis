package com.ss.android.ugc.aweme.poi.mapmode.assem;

import X.C019F;
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
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModeFilterVM;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeFilterAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public View LLJI;
    public View LLJIJIL;
    public C197039127h LLJILJIL;
    public C197039127h LLJILJILJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJ;
    public TuxTextView LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeFilterAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapModeFilterAssem.class, "filteVM", "getFilteVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModeFilterVM;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiMapModeFilterAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 412), AFwS256S0000000_18.get$arr$(502), null, true);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapModeFilterVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 413), AFwS256S0000000_18.get$arr$(503), null, true);
    }

    public final PoiMapModeFilterVM Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (PoiMapModeFilterVM) assemVMLazy.getValue();
    }

    public final PoiMapModePageVM Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (PoiMapModePageVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01da A[Catch: Exception -> 0x026b, TryCatch #1 {Exception -> 0x026b, blocks: (B:25:0x012b, B:27:0x0131, B:28:0x0145, B:30:0x014b, B:32:0x0153, B:34:0x015b, B:39:0x0164, B:41:0x0168, B:43:0x0170, B:45:0x0174, B:46:0x0178, B:47:0x017c, B:49:0x0180, B:55:0x018c, B:57:0x0190, B:59:0x0198, B:61:0x019c, B:62:0x01a0, B:63:0x01a4, B:66:0x01af, B:67:0x01b2, B:68:0x01b3, B:70:0x01b9, B:71:0x01bd, B:73:0x01c3, B:75:0x01cd, B:81:0x01ec, B:82:0x01fc, B:84:0x0202, B:86:0x020a, B:88:0x0216, B:91:0x021c, B:97:0x0227, B:98:0x0229, B:99:0x022d, B:101:0x0231, B:104:0x0237, B:110:0x0242, B:111:0x0244, B:112:0x024a, B:113:0x0252, B:114:0x0255, B:115:0x0256, B:78:0x01d2, B:80:0x01da, B:117:0x0261), top: B:124:0x012b }] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeFilterAssem.onViewCreated(android.view.View):void");
    }
}
