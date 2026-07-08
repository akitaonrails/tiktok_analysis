package com.ss.android.ugc.aweme.ecommerce.base.bundlepanel;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C13LE;
import X.C1637806bA;
import X.C1755980vnQ;
import X.C1775710wJF;
import X.C1776240wK6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC599480NfG;
import X.InterfaceC665370Q7z;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class BundlePanelContentAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final String LLIZLLLIL = "BundlePanelContentAssem";
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJIJIL;
    public final C01GW LLJILJIL;
    public volatile InterfaceC599480NfG LLJILJILJ;
    public InterfaceC665370Q7z LLJILLL;
    public C0QSJ LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BundlePanelContentAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/bundlepanel/BundlePanelVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BundlePanelContentAssem.class, "eventCenter", "getEventCenter()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/eventcenter/IPdpEventCenter;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public BundlePanelContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BundlePanelVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 160), AFwS268S0000000_26.get$arr$(169), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 184));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 183));
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BundlePanelFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BundlePanelFragmentScope.class);
        return arrayList;
    }

    public final BundlePanelVM Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (BundlePanelVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go();
        C1755980vnQ c1755980vnQ = (C1755980vnQ) this.LLJI.getValue();
        if (c1755980vnQ != null) {
            c1755980vnQ.setLynxCallback(new C1775710wJF(this, 1));
        }
        C1755980vnQ c1755980vnQ2 = (C1755980vnQ) this.LLJI.getValue();
        if (c1755980vnQ2 != null) {
            c1755980vnQ2.setSparkLoadCallback(new C1776240wK6(this, 1));
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0vnS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1756010vnT) obj).LLILZIL;
            }
        }, null, new AwS640S0100000_26(this, 72), 6);
    }
}
