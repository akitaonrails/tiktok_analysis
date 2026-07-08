package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.touchpoint;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C0QSJ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.EnumC1121470fI1;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class TouchPointAssem extends AbstractC738140SxQ implements InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TouchPointAssem.class, "touchPointVM", "getTouchPointVM()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/touchpoint/TouchPointViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TouchPointAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TouchPointViewModel.class);
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS561S0100000_17(c19719912DlLIZ, 197), AFwS254S0000000_17.get$arr$(75), null, true);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CampaignPanelScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CampaignPanelScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EnumC1121470fI1 enumC1121470fI1 = (EnumC1121470fI1) C723850SaN.LJFF(this, "tp_name");
        if (enumC1121470fI1 == null) {
            return;
        }
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        assemVMLazy.getValue().setState(new AwS596S0100000_17(enumC1121470fI1, 588));
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CampaignPanelScope.class});
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        c0qsjLIZIZ.unbindAbility(assemVMLazy.getValue(), TouchPointAbility.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CampaignPanelScope.class});
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        c0qsjLIZIZ.bindAbility(assemVMLazy.getValue(), TouchPointAbility.class);
    }
}
