package com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.header;

import X.C0QSJ;
import X.C1133800fbu;
import X.C1146920fx4;
import X.C13LE;
import X.C2217381BqS;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.os.CountDownTimer;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class CampaignHeaderAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final C1146920fx4 LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final C1133800fbu LLIZLLLIL = new C1133800fbu();
    public volatile PanelHostAbility LLJ;
    public volatile TouchPointAbility LLJI;
    public InterfaceC665370Q7z LLJIJIL;
    public C0QSJ LLJILJIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0fx4] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CampaignHeaderAssem.class, "panelHostAbility", "getPanelHostAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/PanelHostAbility;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(CampaignHeaderAssem.class, "touchPointAbility", "getTouchPointAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/TouchPointAbility;", 0)};
        LLJILJILJ = new Object() { // from class: X.0fx4
        };
        LLJJ = R.id.da3;
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

    public final PanelHostAbility Ho() {
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

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1133800fbu c1133800fbu = this.LLIZLLLIL;
        CountDownTimer countDownTimer = c1133800fbu.LIZIZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c1133800fbu.LIZIZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.header.CampaignHeaderAssem.onViewCreated(android.view.View):void");
    }
}
