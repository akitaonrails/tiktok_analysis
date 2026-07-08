package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop;

import X.C019F;
import X.C01D1;
import X.C13LE;
import X.C1622206Wu;
import X.C1766560w4U;
import X.C1821230xUf;
import X.C1821240xUg;
import X.C1821250xUh;
import X.C1821260xUi;
import X.C1821270xUj;
import X.C1821280xUk;
import X.C1826730xdX;
import X.C1911200zpm;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC517590KRp;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class OneStopSheetFragment extends LiveSheetFragment {
    public static final C1821280xUk LLJZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDHELIOSw6JiA/OmE0Oio7PSd9JyspOjs8ODYkJj99ByspGjs8OBYkLConDjctLiI2JjE=";
    public final AssemVMLazy LLJLLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0xUk] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OneStopSheetFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/onestopshop/vm/OneStopPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJZ = new Object() { // from class: X.0xUk
        };
    }

    public OneStopSheetFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OneStopPageVM.class);
        C1821230xUf c1821230xUf = new C1821230xUf(c19719912DlLIZ);
        C1821270xUj c1821270xUj = new C1821270xUj();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1821230xUf, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C1821240xUg(this), c1821270xUj, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1821230xUf, new C1821250xUh(this), c1821270xUj, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1821230xUf, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1821260xUi(this), c1821270xUj, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJLLL = assemVMLazy;
    }

    public final OneStopPageVM uS() {
        AssemVMLazy assemVMLazy = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        return (OneStopPageVM) assemVMLazy.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.onHide(hashCode());
        }
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIL();
        tuxImmersionBarLIZLLL.LIZLLL();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void sl() {
        uS().yQ2(0, 1);
        C1911200zpm.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.dimBehindType = 2;
        sheetOptions.LIZ(6, null);
        sheetOptions.isHeaderHidden = true;
        if (Build.VERSION.SDK_INT >= 35) {
            sheetOptions.requireDrawBehindStatusBar = false;
        }
        return sheetOptions;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:4:0x0012, B:6:0x0018, B:8:0x001f, B:10:0x0027, B:11:0x0035), top: B:62:0x0012 }] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.OneStopSheetFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gkj, viewGroup, false);
    }
}
