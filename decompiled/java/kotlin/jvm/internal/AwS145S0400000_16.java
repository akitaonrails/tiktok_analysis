package kotlin.jvm.internal;

import X.C09AY;
import X.C09R7;
import X.C1009340cNA;
import X.C1014730cVr;
import X.C1014790cVx;
import X.C1030130cuh;
import X.C1030380cv6;
import X.C1391190mJ3;
import X.C13IQ;
import X.InterfaceC1014270cV7;
import X.InterfaceC1015000cWI;
import X.InterfaceC1075600e62;
import X.InterfaceC1766500w4O;
import android.app.Dialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.ss.android.ugc.aweme.feed.model.AdPrefix;
import com.ss.android.ugc.aweme.landpage.popup.AdLandingPagePopUpImpl;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public class AwS145S0400000_16 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS145S0400000_16 awS145S0400000_16) {
        C1030130cuh c1030130cuh = (C1030130cuh) awS145S0400000_16.l0;
        List<String> list = ((AdPrefix) awS145S0400000_16.l1).secondaryPrefixImageUrls;
        ConstraintLayout constraintLayout = (ConstraintLayout) awS145S0400000_16.l2;
        AwS382S0200000_16 awS382S0200000_16 = new AwS382S0200000_16(c1030130cuh, (C1030130cuh) awS145S0400000_16.l3, (Function0<Unit>) 10);
        AwS260S0300000_16 awS260S0300000_16 = new AwS260S0300000_16((C1030130cuh) awS145S0400000_16.l0, (C1030130cuh) awS145S0400000_16.l1, (AdPrefix) awS145S0400000_16.l3, (Function0<Unit>) 2);
        c1030130cuh.getClass();
        C1030130cuh.LJI(list, constraintLayout, awS382S0200000_16, awS260S0300000_16);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$1(AwS145S0400000_16 awS145S0400000_16) {
        Fragment fragment = (Fragment) awS145S0400000_16.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS145S0400000_16.l1).invoke(), C09R7.LIZ((C13IQ) awS145S0400000_16.l2));
        Function2 function2 = (Function2) awS145S0400000_16.l3;
        Fragment fragment2 = (Fragment) awS145S0400000_16.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(DeliveryPanelViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS367S0200000_1(function2, fragment2, 40));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$2(AwS145S0400000_16 awS145S0400000_16) {
        Fragment fragment = (Fragment) awS145S0400000_16.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS145S0400000_16.l1).invoke(), C09R7.LIZ((C13IQ) awS145S0400000_16.l2));
        Function2 function2 = (Function2) awS145S0400000_16.l3;
        Fragment fragment2 = (Fragment) awS145S0400000_16.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(DeliveryPanelViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS367S0200000_1(function2, fragment2, 41));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$3(AwS145S0400000_16 awS145S0400000_16) {
        Fragment fragment = (Fragment) awS145S0400000_16.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS145S0400000_16.l1).invoke(), C09R7.LIZ((C13IQ) awS145S0400000_16.l2));
        Function2 function2 = (Function2) awS145S0400000_16.l3;
        Fragment fragment2 = (Fragment) awS145S0400000_16.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(AddressSelectViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS367S0200000_1(function2, fragment2, 42));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$4(AwS145S0400000_16 awS145S0400000_16) {
        Fragment fragment = (Fragment) awS145S0400000_16.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS145S0400000_16.l1).invoke(), C09R7.LIZ((C13IQ) awS145S0400000_16.l2));
        Function2 function2 = (Function2) awS145S0400000_16.l3;
        Fragment fragment2 = (Fragment) awS145S0400000_16.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(PaymentViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS367S0200000_1(function2, fragment2, 80));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$5(AwS145S0400000_16 awS145S0400000_16) {
        Fragment fragment = (Fragment) awS145S0400000_16.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS145S0400000_16.l1).invoke(), C09R7.LIZ((C13IQ) awS145S0400000_16.l2));
        Function2 function2 = (Function2) awS145S0400000_16.l3;
        Fragment fragment2 = (Fragment) awS145S0400000_16.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(SeaSkuPanelViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS367S0200000_1(function2, fragment2, 126));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$6(AwS145S0400000_16 awS145S0400000_16) {
        Fragment fragment = (Fragment) awS145S0400000_16.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS145S0400000_16.l1).invoke(), C09R7.LIZ((C13IQ) awS145S0400000_16.l2));
        Function2 function2 = (Function2) awS145S0400000_16.l3;
        Fragment fragment2 = (Fragment) awS145S0400000_16.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(SocialRecRequestViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS382S0200000_16(function2, fragment2, 41));
        return jediViewModel;
    }

    public static final Object invoke$7(AwS145S0400000_16 awS145S0400000_16) {
        C1014790cVx c1014790cVx = new C1014790cVx((C1009340cNA) awS145S0400000_16.l1, (AnoleComponentModel) awS145S0400000_16.l0);
        final C1014730cVr c1014730cVr = (C1014730cVr) awS145S0400000_16.l2;
        final InterfaceC1014270cV7 interfaceC1014270cV7 = (InterfaceC1014270cV7) awS145S0400000_16.l3;
        final AnoleComponentModel anoleComponentModel = (AnoleComponentModel) awS145S0400000_16.l0;
        final C1009340cNA c1009340cNA = (C1009340cNA) awS145S0400000_16.l1;
        c1014790cVx.LIZLLL = new InterfaceC1015000cWI() { // from class: X.0cVu
            @Override // X.InterfaceC1015000cWI
            public final void LIZ() {
            }

            @Override // X.InterfaceC1015000cWI
            public final void LIZIZ(boolean z, String str, EnumC1014780cVw enumC1014780cVw, String str2) {
                boolean z2;
                String str3;
                Map<String, Object> mapLIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[AnoleComponentStateListener],[onRenderResult], isSuccess = ");
                sbLIZ.append(z);
                sbLIZ.append(", failReason = ");
                sbLIZ.append(str);
                sbLIZ.append(", renderFromType = ");
                sbLIZ.append(enumC1014780cVw);
                sbLIZ.append(", triggerType = ");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC1014270cV7 interfaceC1014270cV72 = interfaceC1014270cV7;
                if (enumC1014780cVw == EnumC1014780cVw.PRERENDER) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                interfaceC1014270cV72.LJIJ(new C991600buY(z ? 1 : 0, str, z2), c1014730cVr);
                Map<String, Object> mapLIZ2 = null;
                if (!z && Intrinsics.LJFF(str, "prerender_not_invoke")) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[AnoleComponentStateListener],[onPreRenderNotInvokeFailTrigger], failReason = ");
                    sbLIZ2.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1014730cVr c1014730cVr2 = c1014730cVr;
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    String str4 = c1014730cVr2.LLLI;
                    AnoleComponentModel anoleComponentModel2 = anoleComponentModel;
                    C1009340cNA c1009340cNA2 = c1009340cNA;
                    InterfaceC1014900cW8 interfaceC1014900cW8LJJII = c1014730cVr2.LJJII();
                    if (interfaceC1014900cW8LJJII != null) {
                        mapLIZ = C1014770cVv.LIZ(interfaceC1014900cW8LJJII);
                    } else {
                        mapLIZ = null;
                    }
                    C1014740cVs.LIZIZ(c1014730cVr2, false, str3, str4, anoleComponentModel2, c1009340cNA2, mapLIZ);
                }
                if (Intrinsics.LJFF(str2, EnumC1014820cW0.FALLBACK.getValue())) {
                    C1014730cVr c1014730cVr3 = c1014730cVr;
                    String str5 = c1014730cVr3.LLLI;
                    AnoleComponentModel anoleComponentModel3 = anoleComponentModel;
                    C1009340cNA c1009340cNA3 = c1009340cNA;
                    InterfaceC1014900cW8 interfaceC1014900cW8LJJII2 = c1014730cVr3.LJJII();
                    if (interfaceC1014900cW8LJJII2 != null) {
                        mapLIZ2 = C1014770cVv.LIZ(interfaceC1014900cW8LJJII2);
                    }
                    C1014740cVs.LIZIZ(c1014730cVr3, z, str2, str5, anoleComponentModel3, c1009340cNA3, mapLIZ2);
                }
            }
        };
        return c1014790cVx;
    }

    public static final Object invoke$8(AwS145S0400000_16 awS145S0400000_16) {
        Dialog dialog = ((TuxSheet) awS145S0400000_16.l0).getDialog();
        if (dialog != null) {
            Fragment fragment = (Fragment) awS145S0400000_16.l1;
            TuxSheet tuxSheet = (TuxSheet) awS145S0400000_16.l0;
            C1030380cv6 c1030380cv6 = (C1030380cv6) awS145S0400000_16.l2;
            AdLandingPagePopUpImpl adLandingPagePopUpImpl = (AdLandingPagePopUpImpl) awS145S0400000_16.l3;
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJIILIIL(fragment);
            tuxSheet.onCancel(dialog);
            c1030380cv6.LIZIZ.onDismiss(dialog);
            adLandingPagePopUpImpl.getClass();
            AdLandingPagePopUpImpl.LJJIIJZLJL(tuxSheet, c1030380cv6);
            return Unit.LIZ;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0400000_16(C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, AnoleComponentModel anoleComponentModel, C1014730cVr c1014730cVr, int i) {
        super(0);
        this.$t = i;
        this.l0 = anoleComponentModel;
        this.l1 = c1009340cNA;
        this.l2 = c1014730cVr;
        this.l3 = interfaceC1014270cV7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0400000_16(C1030130cuh c1030130cuh, AdPrefix adPrefix, ConstraintLayout constraintLayout, AwS132S1200000_16 awS132S1200000_16, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1030130cuh;
        this.l1 = adPrefix;
        this.l2 = constraintLayout;
        this.l3 = awS132S1200000_16;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0400000_16(Fragment fragment, Function0 function0, C13IQ c13iq, Function2 function2, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = function0;
        this.l2 = c13iq;
        this.l3 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0400000_16(TuxSheet tuxSheet, Fragment fragment, C1030380cv6 c1030380cv6, AdLandingPagePopUpImpl adLandingPagePopUpImpl, int i) {
        super(0);
        this.$t = i;
        this.l0 = tuxSheet;
        this.l1 = fragment;
        this.l2 = c1030380cv6;
        this.l3 = adLandingPagePopUpImpl;
    }
}
