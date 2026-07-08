package com.ss.android.ugc.aweme.ecommerce.base.address.tab;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1391190mJ3;
import X.C13LE;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2217381BqS;
import X.C343970De7;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C817603Hi;
import X.C960603pE;
import X.C966003q6;
import X.C976403rm;
import X.C976703rp;
import X.C978603s8;
import X.InterfaceC1164530gPT;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListPanelAssemFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryFullScreenFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressTabFragment extends ECBaseFragment implements InterfaceC1164530gPT {
    public static final C966003q6 LLILZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExHELIOSKTYpZy43LDcpOjx9PCQuZw43LDcpOjwHKScKOy40JSAiPQ==";
    public final AssemVMLazy LLILLL;
    public C978603s8 LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddressTabFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/address/tab/AddressTabViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = new C966003q6();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "address_tab";
    }

    public final AddressTabViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (AddressTabViewModel) assemVMLazy.getValue();
    }

    public AddressTabFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressTabViewModel.class);
        this.LLILLL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS545S0100000_1(c19719912DlLIZ, 65), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 66), AFwS228S0000000_1.get$arr$(43));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        if (VR().LLILLJJLI.LIZ) {
            return;
        }
        C817603Hi c817603Hi = VR().LLILLJJLI;
        AddressTabEnterParams addressTabEnterParams = VR().LL;
        c817603Hi.LIZJ = addressTabEnterParams != null ? addressTabEnterParams.btmToken : null;
        VR().LLILLJJLI.LJIIL(this, "a2270.b14900", null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_address_select", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZJ("event_request_close_delivery", this);
        }
    }

    public final void WR(int i) {
        DeliveryPanelStarter.EnterParam enterParam;
        AddressPageStarter.AddressListEnterParams addressListEnterParamsCopy;
        String stringExtra;
        String str;
        C978603s8 c978603s8 = this.LLILZ;
        if (c978603s8 != null) {
            c978603s8.setSelectedIndex(i);
        }
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI("address_list");
        Fragment fragmentLJJJJZI2 = getChildFragmentManager().LJJJJZI("delivery_full_screen");
        DeliveryPanelStarter.EnterParam enterParamLIZ = null;
        stringExtra = null;
        String stringExtra2 = null;
        enterParamLIZ = null;
        if (i == 0) {
            if (fragmentLJJJJZI2 != null) {
                c19ehLJIIJ.LJIILL(fragmentLJJJJZI2);
            }
            if (fragmentLJJJJZI == null) {
                AddressTabEnterParams addressTabEnterParams = VR().LL;
                if (addressTabEnterParams != null && (str = addressTabEnterParams.addressListSchema) != null) {
                    Uri uri = UriProtector.parse(str);
                    Intent intent = new Intent();
                    for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                        intent.putExtra(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
                    }
                    Intent intentSmartIntent = SmartIntent.smartIntent(intent);
                    AddressPageStarter.AddressListEnterParams.Companion.getClass();
                    AddressPageStarter.AddressListEnterParams addressListEnterParamsLIZIZ = C976403rm.LIZIZ(intentSmartIntent);
                    String strLIZJ = VR().LLILLJJLI.LIZJ("c66872.d86248", null);
                    if (addressListEnterParamsLIZIZ != null) {
                        Boolean bool = Boolean.FALSE;
                        Boolean bool2 = Boolean.TRUE;
                        addressListEnterParamsCopy = addressListEnterParamsLIZIZ.copy(addressListEnterParamsLIZIZ.isSelectMode, addressListEnterParamsLIZIZ.trackParams, addressListEnterParamsLIZIZ.fromClaimIncentive, addressListEnterParamsLIZIZ.incentiveRecordId, addressListEnterParamsLIZIZ.productId, addressListEnterParamsLIZIZ.markUnavailableAddress, addressListEnterParamsLIZIZ.scene, addressListEnterParamsLIZIZ.sceneParamsStr, addressListEnterParamsLIZIZ.selectScene, addressListEnterParamsLIZIZ.extraInfo, addressListEnterParamsLIZIZ.freeShipping, addressListEnterParamsLIZIZ.addressEntranceScene, addressListEnterParamsLIZIZ.updateCache, strLIZJ, addressListEnterParamsLIZIZ.checkoutType, addressListEnterParamsLIZIZ.addressSelectScene, addressListEnterParamsLIZIZ.pageHeightPercent, addressListEnterParamsLIZIZ.needTaxIdItem, bool, bool2, bool2, addressListEnterParamsLIZIZ.forceEditMode, addressListEnterParamsLIZIZ.forceVertical);
                    } else {
                        addressListEnterParamsCopy = null;
                    }
                    if (intentSmartIntent != null) {
                        try {
                            stringExtra = intentSmartIntent.getStringExtra("selected_address_id");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            stringExtra = null;
                        }
                        try {
                            stringExtra2 = intentSmartIntent.getStringExtra("unavailable_address_ids");
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                    C976703rp c976703rp = AddressListPanelAssemFragment.LLILZLL;
                    String strLJ = C960603pE.LJ(this);
                    c976703rp.getClass();
                    c19ehLJIIJ.LIZJ(R.id.iiv, C976703rp.LIZ(addressListEnterParamsCopy, strLJ, stringExtra, stringExtra2), "address_list");
                } else {
                    addressListEnterParamsCopy = null;
                }
                stringExtra = null;
                C976703rp c976703rp2 = AddressListPanelAssemFragment.LLILZLL;
                String strLJ2 = C960603pE.LJ(this);
                c976703rp2.getClass();
                c19ehLJIIJ.LIZJ(R.id.iiv, C976703rp.LIZ(addressListEnterParamsCopy, strLJ2, stringExtra, stringExtra2), "address_list");
            } else {
                c19ehLJIIJ.LJJIFFI(fragmentLJJJJZI);
            }
        } else {
            if (fragmentLJJJJZI != null) {
                c19ehLJIIJ.LJIILL(fragmentLJJJJZI);
            }
            if (fragmentLJJJJZI2 == null) {
                DeliveryFullScreenFragment deliveryFullScreenFragment = new DeliveryFullScreenFragment();
                Bundle bundle = new Bundle();
                String strLIZJ2 = VR().LLILLJJLI.LIZJ("c66872.d52551", null);
                AddressTabEnterParams addressTabEnterParams2 = VR().LL;
                if (addressTabEnterParams2 != null && (enterParam = addressTabEnterParams2.deliveryInfo) != null) {
                    enterParamLIZ = DeliveryPanelStarter.EnterParam.LIZ(enterParam, null, strLIZJ2, -131073);
                }
                C786410Ut5.LJJIJL(bundle, "enter_param", enterParamLIZ);
                C960603pE.LJIIJ(bundle, C960603pE.LJ(deliveryFullScreenFragment));
                deliveryFullScreenFragment.setArguments(bundle);
                c19ehLJIIJ.LIZJ(R.id.iiv, deliveryFullScreenFragment, "delivery_full_screen");
            } else {
                c19ehLJIIJ.LJJIFFI(fragmentLJJJJZI2);
            }
        }
        c19ehLJIIJ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_address_select", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZLLL("event_request_close_delivery", this);
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_address_select") || Intrinsics.LJFF(str, "event_request_close_delivery")) {
            String str3 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AddressTabEnterParams addressTabEnterParams;
        Integer num;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Integer numLIZJ = null;
        if (arguments != null) {
            addressTabEnterParams = (AddressTabEnterParams) arguments.getParcelable("enter_params");
        } else {
            addressTabEnterParams = null;
        }
        if (!(addressTabEnterParams instanceof AddressTabEnterParams)) {
            addressTabEnterParams = null;
        }
        VR().LL = addressTabEnterParams;
        Context context = getContext();
        if (context != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context);
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.xzl);
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131832989);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1809));
        int iIntValue = 0;
        c0om1.LIZIZ(c1251150ifB);
        if (numLIZJ != null) {
            c0om1.LIZJ(numLIZJ.intValue());
        }
        tuxNavBar.setNavActions(c0om1);
        tuxNavBar.LJIIZILJ(false);
        this.LLILZ = (C978603s8) view.findViewById(R.id.y9a);
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI(getString(2131832985), getString(2131832988));
        C978603s8 c978603s8 = this.LLILZ;
        if (c978603s8 != null) {
            c978603s8.setTitles(listLJIIJJI);
        }
        C978603s8 c978603s82 = this.LLILZ;
        if (c978603s82 != null) {
            c978603s82.setOnTabSelectedListener(new AwS580S0100000_1(this, 1115));
        }
        if (bundle == null) {
            AddressTabEnterParams addressTabEnterParams2 = VR().LL;
            if (addressTabEnterParams2 != null && (num = addressTabEnterParams2.tab) != null) {
                iIntValue = num.intValue();
            }
            WR(iIntValue);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ajf, viewGroup, false);
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
