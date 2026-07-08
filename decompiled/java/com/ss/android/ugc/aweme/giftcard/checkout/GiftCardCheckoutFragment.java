package com.ss.android.ugc.aweme.giftcard.checkout;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1548870qPN;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1708710uZB;
import X.C1712340uf2;
import X.C1712380uf6;
import X.C1712390uf7;
import X.C1712400uf8;
import X.C1714100uhs;
import X.C1717770unn;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1AF0;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C844470XAv;
import X.C985403tE;
import X.C987103tV;
import X.InterfaceC1192660h8q;
import X.InterfaceC1548890qPP;
import X.InterfaceC1709520uaU;
import X.InterfaceC1713900uhY;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import X.InterfaceC921603iw;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.giftcard.ab.ErrorMsgShowModel;
import com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutVM;
import com.ss.android.ugc.aweme.pipo.errorsdk.IErrorCodeSdk;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class GiftCardCheckoutFragment extends BaseFragment implements IGiftCardCheckoutCashierAbility, InterfaceC1548890qPP {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiIlLzswKTcoZyHELIOSw7LSYnJjonZgIlLzsQKTcoCic2Ky4jPDsVOiQrJCo9PA==";
    public int LLIZ = 16;
    public final String LLIZLLLIL = UUID.randomUUID().toString();
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 678));
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GiftCardCheckoutFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/giftcard/checkout/GiftCardCheckoutVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GiftCardCheckoutFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftCardCheckoutVM.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 564);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(323);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 679), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS570S0100000_26((Fragment) this, 680), aFwS268S0000000_26, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 681), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJI = assemVMLazy;
    }

    public final InterfaceC1192660h8q SR() {
        return (InterfaceC1192660h8q) this.LLJ.getValue();
    }

    public final GiftCardCheckoutVM UR() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (GiftCardCheckoutVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.giftcard.checkout.IGiftCardCheckoutCashierAbility
    public final InterfaceC1192660h8q n8() {
        return SR();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        new C1548870qPN().LJI("pipo_pay_result", this);
        C1712390uf7.LIZ.getClass();
        C1712390uf7.LIZIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        super.onPause();
        C19EG activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(this.LLIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        C19EG activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        this.LLIZ = window.getAttributes().softInputMode;
        window.setSoftInputMode(48);
    }

    public final void VR(String str) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ErrorMsgShowModel errorMsgShowModel = C1712400uf8.LIZ;
        ErrorMsgShowModel errorMsgShowModel2 = (ErrorMsgShowModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_gift_card_checkout_force_fixed_errmsg", ErrorMsgShowModel.class, errorMsgShowModel);
        if (errorMsgShowModel2 == null) {
            errorMsgShowModel2 = errorMsgShowModel;
        }
        if (errorMsgShowModel2.force) {
            ErrorMsgShowModel errorMsgShowModel3 = (ErrorMsgShowModel) SettingsManager.LIZLLL().LJIIIIZZ("pipo_gift_card_checkout_force_fixed_errmsg", ErrorMsgShowModel.class, errorMsgShowModel);
            if (errorMsgShowModel3 != null) {
                errorMsgShowModel = errorMsgShowModel3;
            }
            if (errorMsgShowModel.mode == 1) {
                str = requireContext().getString(2131848597);
            } else {
                str = requireContext().getString(2131835103);
            }
        } else if (str == null) {
            str = requireContext().getString(2131835103);
        }
        C1714100uhs.LIZ.getClass();
        C1714100uhs.LIZIZ("pipo_popup_show", C2097608Jq.LJIIJ(new Pair("event_type", "show"), new Pair("popup_id", "payment_declined")));
        C1397580mTM c1397580mTM = new C1397580mTM(requireContext());
        c1397580mTM.LJFF(2131835102);
        c1397580mTM.LIZIZ(str);
        C985403tE.LIZ(c1397580mTM, AFwS268S0000000_26.get$arr$(322));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(new AwS605S0100000_26(this, 306));
        activityConfiguration(AFwS268S0000000_26.get$arr$(321));
    }

    @Override // X.InterfaceC1548890qPP
    public final void onEvent(String str, String str2) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1712380uf6(this, str, str2, null), 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String currentLocaleStr;
        InterfaceC921603iw interfaceC921603iwLIZ;
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 86), 3);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IGiftCardCheckoutCashierAbility.class, null, null);
        InterfaceC1192660h8q interfaceC1192660h8qSR = SR();
        if (interfaceC1192660h8qSR != null) {
            interfaceC1192660h8qSR.LJIILLIIL(new InterfaceC1709520uaU() { // from class: X.0uf3
                @Override // X.InterfaceC1709520uaU
                public final C1192680h8s LIZ() {
                    return null;
                }

                @Override // X.InterfaceC1709520uaU
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1709520uaU
                public final void c3() {
                    GiftCardCheckoutVM giftCardCheckoutVMUR = this.LIZ.UR();
                    C23250099c.LIZLLL(giftCardCheckoutVMUR.getAssemVMScope(), null, null, new C0CYB(giftCardCheckoutVMUR, null), 3);
                }

                @Override // X.InterfaceC1709520uaU
                public final void LIZJ(EnumC1155070gAD enumC1155070gAD) {
                    this.LIZ.UR().vQ2();
                }
            });
        }
        new C1548870qPN().LJFF("pipo_pay_result", this);
        C1712390uf7 c1712390uf7 = C1712390uf7.LIZ;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("merchant_id");
        } else {
            string = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("merchant_user_id");
        } else {
            string2 = null;
        }
        c1712390uf7.getClass();
        if (string != null) {
            try {
                if (string.length() != 0 && string2 != null && string2.length() != 0 && (!Intrinsics.LJFF(string, C1712390uf7.LIZJ) || !Intrinsics.LJFF(string2, C1712390uf7.LIZLLL))) {
                    C1712390uf7.LIZJ = string;
                    C1712390uf7.LIZLLL = string2;
                    try {
                        InterfaceC1713900uhY interfaceC1713900uhYLIZLLL = C1717770unn.LIZLLL();
                        C844470XAv.LIZ.getClass();
                        currentLocaleStr = interfaceC1713900uhYLIZLLL.getCurrentLocaleStr(C844470XAv.LIZ());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                    if (currentLocaleStr == null) {
                        currentLocaleStr = "en";
                    }
                    C1708710uZB.LIZ("Cashier").LIZ(4, "init error sdk, mid=" + string + ", muid=" + string2 + ", locale=" + currentLocaleStr);
                    IErrorCodeSdk iErrorCodeSdk = (IErrorCodeSdk) PluggableExtentionKt.pluggableSpi$default(IErrorCodeSdk.class, false, false, false, 14, null);
                    if (iErrorCodeSdk != null) {
                        if (string == null) {
                            string = "";
                        }
                        if (string2 == null) {
                            string2 = "";
                        }
                        interfaceC921603iwLIZ = iErrorCodeSdk.LIZ("general_embedded_cashier", currentLocaleStr, string, string2);
                    } else {
                        interfaceC921603iwLIZ = null;
                    }
                    C1712390uf7.LIZIZ = interfaceC921603iwLIZ;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJ(e2);
                C1708710uZB.LIZ("Cashier").LIZ(4, "init error sdk fail");
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1712340uf2(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cck, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
