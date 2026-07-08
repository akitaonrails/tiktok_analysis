package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages;

import X.C019F;
import X.C01GW;
import X.C0IJT;
import X.C0QSJ;
import X.C1126800fQc;
import X.C1133830fbx;
import X.C1134320fck;
import X.C1147000fxC;
import X.C1151190g3x;
import X.C1161920gLG;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C16FS;
import X.C1804840x4E;
import X.C19719912Dl;
import X.C20441214yg;
import X.C20603715jn;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C431260Gvc;
import X.C452501pT;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1094160eZy;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS392S0100000_17;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.FirstRechargeModel;

/* JADX INFO: loaded from: classes18.dex */
public final class PackageListAssem extends UIListContentAssem<PackageListViewModel> implements InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final C1147000fxC LLJJLIIIJLLLLLLLZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final int LLJLIL;
    public TextView LLIZLLLIL;
    public TextView LLJ;
    public View LLJI;
    public View LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C01GW LLJILLL;
    public ViewGroup LLJJ;
    public C16FS LLJJI;
    public String LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public volatile TouchPointAbility LLJJJ;
    public volatile PackageListAbility LLJJJIL;
    public volatile PanelHostAbility LLJJJJ;
    public C127G LLJJJJJIL;
    public InterfaceC665370Q7z LLJJJJLIIL;
    public C0QSJ LLJJL;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0fxC] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PackageListAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/packages/PackageListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(PackageListAssem.class, "touchPointAbility", "getTouchPointAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/TouchPointAbility;", 0), new C2217381BqS(PackageListAssem.class, "packageListAbility", "getPackageListAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/PackageListAbility;", 0), new C2217381BqS(PackageListAssem.class, "panelHostAbilities", "getPanelHostAbilities()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/PanelHostAbility;", 0)};
        LLJJLIIIJLLLLLLLZ = new Object() { // from class: X.0fxC
        };
        LLJLIL = R.id.sw5;
    }

    public PackageListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PackageListViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS561S0100000_17(c19719912DlLIZ, 195), AFwS254S0000000_17.get$arr$(70), null, true);
        this.LLJILLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 193));
        this.LLJJIII = "google_play";
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 194));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 192));
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CampaignPanelScope.class}).unbindAbility(ip(), PackageListAbility.class);
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

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CampaignPanelScope.class}).bindAbility(ip(), PackageListAbility.class);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LJIIJ = false;
        c20603715jn.LIZ = 3;
        c20603715jn.LJIIIZ = "recharge_panel";
        return c20603715jn;
    }

    public final C0QSJ Lo() {
        C0QSJ c0qsj = this.LLJJL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJJLIIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJJJLIIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{CampaignPanelScope.class});
        this.LLJJL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final PackageListAbility No() {
        PackageListAbility packageListAbility;
        PackageListAbility packageListAbility2 = this.LLJJJIL;
        if (packageListAbility2 == null) {
            synchronized (this) {
                packageListAbility2 = this.LLJJJIL;
                if (packageListAbility2 == null) {
                    C0QSJ c0qsjLo = Lo();
                    if (c0qsjLo != null) {
                        packageListAbility = (PackageListAbility) c0qsjLo.getAbility(PackageListAbility.class);
                        C687700QyG.LJ(packageListAbility, PackageListAbility.class);
                    } else {
                        packageListAbility = null;
                    }
                    this.LLJJJIL = packageListAbility;
                    return packageListAbility;
                }
            }
        }
        return packageListAbility2;
    }

    public final PanelHostAbility Oo() {
        PanelHostAbility panelHostAbility;
        PanelHostAbility panelHostAbility2 = this.LLJJJJ;
        if (panelHostAbility2 == null) {
            synchronized (this) {
                panelHostAbility2 = this.LLJJJJ;
                if (panelHostAbility2 == null) {
                    C0QSJ c0qsjLo = Lo();
                    if (c0qsjLo != null) {
                        panelHostAbility = (PanelHostAbility) c0qsjLo.getAbility(PanelHostAbility.class);
                        C687700QyG.LJ(panelHostAbility, PanelHostAbility.class);
                    } else {
                        panelHostAbility = null;
                    }
                    this.LLJJJJ = panelHostAbility;
                    return panelHostAbility;
                }
            }
        }
        return panelHostAbility2;
    }

    public final FirstRechargeModel.RechargeBanner So() {
        return (FirstRechargeModel.RechargeBanner) this.LLJJIJIIJIL.getValue();
    }

    public final boolean Vo() {
        return C500260Jjc.LJJJI((Boolean) C723850SaN.LJFF(this, "always_show_exchange_entrance")) || !Intrinsics.LJFF(InterfaceC1094160eZy.G1.LIZ(), Boolean.TRUE);
    }

    public final TouchPointAbility Zo() {
        TouchPointAbility touchPointAbility = this.LLJJJ;
        if (touchPointAbility == null) {
            synchronized (this) {
                touchPointAbility = this.LLJJJ;
                if (touchPointAbility == null) {
                    C0QSJ c0qsjLo = Lo();
                    TouchPointAbility touchPointAbility2 = c0qsjLo != null ? (TouchPointAbility) c0qsjLo.getAbility(TouchPointAbility.class) : null;
                    this.LLJJJ = touchPointAbility2;
                    return touchPointAbility2;
                }
            }
        }
        return touchPointAbility;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: ap, reason: merged with bridge method [inline-methods] */
    public final PackageListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (PackageListViewModel) assemVMLazy.getValue();
    }

    public final void ip() {
        if (Intrinsics.LJFF(this.LLJJIII, "google_play")) {
            TextView textView = this.LLJ;
            if (textView != null) {
                textView.setText(C497740JfY.LJIJI(2131850997));
                return;
            }
            return;
        }
        TextView textView2 = this.LLJ;
        if (textView2 != null) {
            textView2.setText(C497740JfY.LJIJI(2131850998));
        }
    }

    public final void cp() {
        C1804840x4E c1804840x4EUD1 = No().uD1();
        if (c1804840x4EUD1 != null) {
            this.LLJJIJI = c1804840x4EUD1.LJIJJ();
            this.LLJJIII = c1804840x4EUD1.LJIIIIZZ();
            this.LLJILJIL = (ConstraintLayout) LJJIJL().findViewById(R.id.dxp);
            if (this.LLJJIJI) {
                TextView textView = this.LLIZLLLIL;
                if (textView != null) {
                    C500260Jjc.LLFFF(textView);
                }
                TextView textView2 = this.LLJ;
                if (textView2 != null) {
                    C500260Jjc.LLFFF(textView2);
                }
                ViewGroup.LayoutParams layoutParams = Go().getLayoutParams();
                layoutParams.height -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                C786410Ut5.E6(Go(), layoutParams);
                View walletTabPicker = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getWalletTabPicker(this.LLJILJIL, this.LLJJIII, new AwS596S0100000_17(this, 174), Boolean.TRUE);
                ConstraintLayout constraintLayout = this.LLJILJIL;
                if (constraintLayout != null) {
                    C786410Ut5.LJJJJL(constraintLayout);
                    if (walletTabPicker != null) {
                        constraintLayout.addView(walletTabPicker);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJJJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJJJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PackageListViewModel.class, new AObjectS392S0100000_17(this, 39)}, defaultViewModelProviderFactory);
                    this.LLJJJJJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final boolean kp() {
        Text text;
        if (So() == null) {
            return false;
        }
        FirstRechargeModel.RechargeBanner rechargeBannerSo = So();
        String str = null;
        Text text2 = rechargeBannerSo != null ? rechargeBannerSo.rechargeTitle : null;
        FirstRechargeModel.RechargeBanner rechargeBannerSo2 = So();
        if (rechargeBannerSo2 != null && (text = rechargeBannerSo2.rechargeTitle) != null) {
            str = text.defaultPattern;
        }
        Spannable spannableLJIILIIL = C1133830fbx.LJIILIIL(text2, str);
        if (spannableLJIILIIL == null || spannableLJIILIIL.length() == 0) {
            return false;
        }
        TextView textView = this.LLIZLLLIL;
        if (textView != null) {
            textView.setText(spannableLJIILIIL);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setTitleByTouchPointData: ");
        sbLIZ.append((Object) spannableLJIILIIL);
        C20441214yg.LJIIIZ("PackageListAssem", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    public final void bp(SpannableStringBuilder spannableStringBuilder) {
        TextView textView = this.LLJ;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(C431260Gvc.LIZ);
        }
        C1126800fQc.LIZ.KE0().LJIJI(11, 15, "recharge_task_page", "recharge_task_page");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exchange_preview");
        c474500IjALIZ.LJJII(Integer.valueOf(C1151190g3x.LJI()), "is_first_recharge");
        c474500IjALIZ.LJJII(11, "task_type");
        c474500IjALIZ.LIZ();
    }

    public final void dp(boolean z) {
        int i;
        ViewGroup viewGroup = this.LLJJ;
        if (viewGroup != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LJLZ(i, viewGroup);
        }
        C16FS c16fs = this.LLJJI;
        if (c16fs != null) {
            c16fs.LJIIL();
        }
        C16FS c16fs2 = this.LLJJI;
        if (c16fs2 != null) {
            c16fs2.setClickable(true);
        }
        C2097608Jq.LJ();
        C1134320fck.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ep(boolean r3) {
        /*
            r2 = this;
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility r0 = r2.Oo()
            com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams r0 = r0.getInputParams()
            if (r0 == 0) goto L2a
            com.bytedance.android.livesdk.firstrecharge.RechargePanelExchangeParams r0 = r0.exchangeParams
            if (r0 == 0) goto L2a
            java.lang.Integer r0 = r0.isPeriodicPayout
            if (r0 == 0) goto L2a
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L2a
        L19:
            if (r3 == 0) goto L2c
            android.widget.TextView r1 = r2.LLJ
            if (r1 == 0) goto L29
            r0 = 2131850992(0x7f1176f0, float:1.9335562E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r1.setText(r0)
        L29:
            return
        L2a:
            r1 = 0
            goto L19
        L2c:
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility r0 = r2.Oo()
            com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams r0 = r0.getInputParams()
            boolean r0 = X.C1149560g1K.LIZLLL(r0)
            if (r0 != 0) goto L4d
            int r0 = com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.util.PanelUIUtil.LIZ
            android.content.Context r0 = r2.getContext()
            android.text.SpannableStringBuilder r0 = com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.util.PanelUIUtil.LIZIZ(r0)
            if (r0 == 0) goto L4a
            r2.bp(r0)
            return
        L4a:
            if (r1 == 0) goto L5e
            goto L4f
        L4d:
            if (r1 == 0) goto L5e
        L4f:
            r0 = 2131850991(0x7f1176ef, float:1.933556E38)
        L52:
            android.widget.TextView r1 = r2.LLJ
            if (r1 == 0) goto L5d
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r1.setText(r0)
        L5d:
            return
        L5e:
            r0 = 2131850990(0x7f1176ee, float:1.9335558E38)
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListAssem.ep(boolean):void");
    }

    public final boolean hp(boolean z) {
        Text text;
        Spannable spannableLJIILIIL;
        Text text2;
        Text text3;
        Text text4;
        if (So() == null) {
            return false;
        }
        String str = null;
        if (z) {
            FirstRechargeModel.RechargeBanner rechargeBannerSo = So();
            if (rechargeBannerSo != null) {
                text3 = rechargeBannerSo.rechargeSubTitle;
            } else {
                text3 = null;
            }
            FirstRechargeModel.RechargeBanner rechargeBannerSo2 = So();
            if (rechargeBannerSo2 != null && (text4 = rechargeBannerSo2.rechargeSubTitle) != null) {
                str = text4.defaultPattern;
            }
            spannableLJIILIIL = C1133830fbx.LJIILIIL(text3, str);
        } else {
            FirstRechargeModel.RechargeBanner rechargeBannerSo3 = So();
            if (rechargeBannerSo3 != null) {
                text = rechargeBannerSo3.exchangeSubTitle;
            } else {
                text = null;
            }
            FirstRechargeModel.RechargeBanner rechargeBannerSo4 = So();
            if (rechargeBannerSo4 != null && (text2 = rechargeBannerSo4.exchangeSubTitle) != null) {
                str = text2.defaultPattern;
            }
            spannableLJIILIIL = C1133830fbx.LJIILIIL(text, str);
        }
        if (spannableLJIILIIL == null || spannableLJIILIIL.length() == 0) {
            return false;
        }
        TextView textView = this.LLJ;
        if (textView != null) {
            textView.setText(spannableLJIILIIL);
        }
        return true;
    }

    public final void lp(boolean z) {
        if (this.LLJILJIL == null) {
            cp();
        }
        int i = 8;
        if (this.LLJJIJI) {
            ConstraintLayout constraintLayout = this.LLJILJIL;
            if (constraintLayout != null) {
                if (z) {
                    i = 0;
                }
                C786410Ut5.LL(i, constraintLayout);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = this.LLJILJIL;
        if (constraintLayout2 == null) {
            return;
        }
        C786410Ut5.LL(8, constraintLayout2);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0278  */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListAssem.onViewCreated(android.view.View):void");
    }
}
