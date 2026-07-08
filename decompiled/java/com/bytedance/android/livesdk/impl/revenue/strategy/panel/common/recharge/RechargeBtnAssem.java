package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.recharge;

import X.C019F;
import X.C0QSJ;
import X.C1148670fzt;
import X.C1151310g49;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C16FS;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C500260Jjc;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS392S0100000_17;
import Y.AObserverS181S0200000_17;
import Y.AObserverS221S0100000_17;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;
import wh6.AbS507S0200000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class RechargeBtnAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final C1151310g49 LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final AssemVMLazy LLIZLLLIL;
    public C16FS LLJ;
    public volatile PackageListAbility LLJI;
    public volatile PanelHostAbility LLJIJIL;
    public volatile TouchPointAbility LLJILJIL;
    public C127G LLJILJILJ;
    public InterfaceC665370Q7z LLJILLL;
    public C0QSJ LLJJ;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0g49] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RechargeBtnAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/recharge/RechargeBtnViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(RechargeBtnAssem.class, "packageListAbility", "getPackageListAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/PackageListAbility;", 0), new C2217381BqS(RechargeBtnAssem.class, "panelHostAbilities", "getPanelHostAbilities()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/PanelHostAbility;", 0), new C2217381BqS(RechargeBtnAssem.class, "touchPointAbility", "getTouchPointAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/TouchPointAbility;", 0)};
        LLJJI = new Object() { // from class: X.0g49
        };
        LLJJIJI = R.id.ctx;
    }

    public RechargeBtnAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RechargeBtnViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS561S0100000_17(c19719912DlLIZ, 196), AFwS254S0000000_17.get$arr$(71), null, true);
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

    public final C0QSJ Go() {
        C0QSJ c0qsj = this.LLJJ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJILLL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJILLL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{CampaignPanelScope.class});
        this.LLJJ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final PackageListAbility Ho() {
        PackageListAbility packageListAbility;
        PackageListAbility packageListAbility2 = this.LLJI;
        if (packageListAbility2 == null) {
            synchronized (this) {
                packageListAbility2 = this.LLJI;
                if (packageListAbility2 == null) {
                    C0QSJ c0qsjGo = Go();
                    if (c0qsjGo != null) {
                        packageListAbility = (PackageListAbility) c0qsjGo.getAbility(PackageListAbility.class);
                        C687700QyG.LJ(packageListAbility, PackageListAbility.class);
                    } else {
                        packageListAbility = null;
                    }
                    this.LLJI = packageListAbility;
                    return packageListAbility;
                }
            }
        }
        return packageListAbility2;
    }

    public final PanelHostAbility Jo() {
        PanelHostAbility panelHostAbility;
        PanelHostAbility panelHostAbility2 = this.LLJIJIL;
        if (panelHostAbility2 == null) {
            synchronized (this) {
                panelHostAbility2 = this.LLJIJIL;
                if (panelHostAbility2 == null) {
                    C0QSJ c0qsjGo = Go();
                    if (c0qsjGo != null) {
                        panelHostAbility = (PanelHostAbility) c0qsjGo.getAbility(PanelHostAbility.class);
                        C687700QyG.LJ(panelHostAbility, PanelHostAbility.class);
                    } else {
                        panelHostAbility = null;
                    }
                    this.LLJIJIL = panelHostAbility;
                    return panelHostAbility;
                }
            }
        }
        return panelHostAbility2;
    }

    public final TouchPointAbility Lo() {
        TouchPointAbility touchPointAbility = this.LLJILJIL;
        if (touchPointAbility == null) {
            synchronized (this) {
                touchPointAbility = this.LLJILJIL;
                if (touchPointAbility == null) {
                    C0QSJ c0qsjGo = Go();
                    TouchPointAbility touchPointAbility2 = c0qsjGo != null ? (TouchPointAbility) c0qsjGo.getAbility(TouchPointAbility.class) : null;
                    this.LLJILJIL = touchPointAbility2;
                    return touchPointAbility2;
                }
            }
        }
        return touchPointAbility;
    }

    public final RechargeBtnViewModel No() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (RechargeBtnViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJILJILJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJILJILJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{RechargeBtnViewModel.class, new AObjectS392S0100000_17(this, 40)}, defaultViewModelProviderFactory);
                    this.LLJILJILJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C16FS c16fs = (C16FS) view.findViewById(R.id.ctw);
        if (c16fs != null) {
            C786410Ut5.I7(new AbS507S0200000_17(this, c16fs, 3), c16fs);
        } else {
            c16fs = null;
        }
        this.LLJ = c16fs;
        TextView textView = (TextView) view.findViewById(R.id.sw1);
        if (textView != null) {
            if (C1148670fzt.LIZ().canRedirectRechargeV3()) {
                textView.setText(C1148670fzt.LIZ().getStoreDescription());
                C500260Jjc.LLFFF(textView);
            } else {
                C500260Jjc.LJIILIIL(textView);
            }
        }
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0g46
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1151330g4B) obj).LL);
            }
        }, null, new AwS631S0100000_17(this, 38), 6);
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0g47
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1151330g4B) obj).LLILLL);
            }
        }, null, AFwS290S0000000_7.get$arr$(24), 6);
        MutableLiveData mutableLiveDataRT1 = Ho().rT1();
        getActualLifecycleOwner();
        mutableLiveDataRT1.observe(this, new AObserverS221S0100000_17(this, 42));
        MutableLiveData mutableLiveDataPV1 = Ho().pV1();
        getActualLifecycleOwner();
        mutableLiveDataPV1.observe(this, new AObserverS181S0200000_17(this, view, 8));
    }
}
