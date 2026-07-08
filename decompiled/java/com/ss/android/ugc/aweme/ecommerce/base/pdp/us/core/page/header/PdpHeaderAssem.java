package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1146704e9;
import X.InterfaceC1755080vly;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes19.dex */
public final class PdpHeaderAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public volatile InterfaceC1755080vly LLJJIJI;
    public InterfaceC665370Q7z LLJJIJIIJIL;
    public C0QSJ LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpHeaderAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/header/PdpHeaderVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PdpHeaderAssem.class, "pdpTaskMgr", "getPdpTaskMgr()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/opt/ITaskManager;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PdpHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpHeaderVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 196), AFwS256S0000000_18.get$arr$(63), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 195));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.b32;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.04Fe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C04FT) obj).LL;
            }
        }, null, new AwS640S0100000_26(this, 184), 6);
    }
}
