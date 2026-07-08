package com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.consumption;

import X.C019F;
import X.C0QSJ;
import X.C1146960fx8;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C687700QyG;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class ConsumptionTaskContainerAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final C1146960fx8 LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public volatile PanelHostAbility LLJ;
    public volatile TouchPointAbility LLJI;
    public InterfaceC665370Q7z LLJIJIL;
    public C0QSJ LLJILJIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0fx8] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ConsumptionTaskContainerAssem.class, "consumeVM", "getConsumeVM()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/rechargeconsumption/consumption/ConsumptionTaskViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(ConsumptionTaskContainerAssem.class, "panelHostAbility", "getPanelHostAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/PanelHostAbility;", 0), new C2217381BqS(ConsumptionTaskContainerAssem.class, "touchPointAbility", "getTouchPointAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/TouchPointAbility;", 0)};
        LLJILJILJ = new Object() { // from class: X.0fx8
        };
        LLJJ = R.id.da2;
    }

    public ConsumptionTaskContainerAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ConsumptionTaskViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS561S0100000_17(c19719912DlLIZ, 202), AFwS254S0000000_17.get$arr$(78), null, true);
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

    public final C0QSJ Go() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJILJIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJIJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJIJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{CampaignPanelScope.class});
        this.LLJILJIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final ConsumptionTaskViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (ConsumptionTaskViewModel) assemVMLazy.getValue();
    }

    public final PanelHostAbility Jo() {
        PanelHostAbility panelHostAbility;
        PanelHostAbility panelHostAbility2 = this.LLJ;
        if (panelHostAbility2 == null) {
            synchronized (this) {
                panelHostAbility2 = this.LLJ;
                if (panelHostAbility2 == null) {
                    C0QSJ c0qsjGo = Go();
                    if (c0qsjGo != null) {
                        panelHostAbility = (PanelHostAbility) c0qsjGo.getAbility(PanelHostAbility.class);
                        C687700QyG.LJ(panelHostAbility, PanelHostAbility.class);
                    } else {
                        panelHostAbility = null;
                    }
                    this.LLJ = panelHostAbility;
                    return panelHostAbility;
                }
            }
        }
        return panelHostAbility2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.consumption.ConsumptionTaskContainerAssem.onViewCreated(android.view.View):void");
    }
}
