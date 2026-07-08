package com.ss.android.ugc.aweme.ecommerce.base.address.widget;

import X.C098200Yq;
import X.C1007103wj;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C1744610vV5;
import X.C1748730vbj;
import X.C1766560w4U;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC1748810vbr;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.RegionPickerWrapper;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class RegionPickerDialogFragment extends CommerceBottomSheetDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyHELIOS43LDcpOjx9PywoLionZhcpLiY8JhUlKiQ2OgElKCM8LwM+KCg+LSs4";
    public Function2<? super List<Region>, ? super AddressBase, Unit> LLJI;
    public Function1<? super List<Region>, Unit> LLJIJIL;
    public Function0<Unit> LLJILJIL;
    public Boolean LLJILJILJ;
    public Boolean LLJILLL;
    public boolean LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public Integer LLJJIJIL;
    public boolean LLJJJ;
    public Integer LLJJJIL;
    public Integer LLJJJJ;
    public ArrayList<OrderSKUDTO> LLJJJJJIL;
    public List<String> LLJJJJLIIL;
    public List<District> LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public ECAnimDowngradeFragment LLJL;

    static {
        new C1744610vV5();
    }

    public RegionPickerDialogFragment() {
        super(0);
        this.LLJI = AFwS313S0000000_26.get$arr$(6);
        this.LLJIJIL = AFwS268S0000000_26.get$arr$(167);
        this.LLJILJIL = AFwS215S0000000_26.get$arr$(76);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.LLJILJIL.invoke();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0vTr
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4, types: [X.0vJv] */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v7 */
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4 || keyEvent == null || keyEvent.getAction() != 1) {
                    return false;
                }
                ECAnimDowngradeFragment eCAnimDowngradeFragment = this.LL.LLJL;
                ?? r0 = eCAnimDowngradeFragment;
                if (eCAnimDowngradeFragment == null) {
                    r0 = 0;
                }
                if (!r0.onBackPressed()) {
                    return false;
                }
                return true;
            }
        });
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zBooleanValue;
        super.onViewCreated(view, bundle);
        if (Intrinsics.LJFF(this.LLJILLL, Boolean.TRUE)) {
            TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
            tuxImmersionBarLIZJ.LIZIZ.LJIIJ(true);
            tuxImmersionBarLIZJ.LJFF(-16777216);
            tuxImmersionBarLIZJ.LIZIZ.LJII(false);
            tuxImmersionBarLIZJ.LIZLLL();
        }
        Bundle arguments = getArguments();
        int i = arguments.getInt("implement_type");
        String string = arguments.getString("geo_name_id");
        int i2 = arguments.getInt("level_count", Integer.MAX_VALUE);
        String string2 = arguments.getString("page_info");
        String string3 = arguments.getString("source_btm_token");
        AwS640S0100000_26 awS640S0100000_26 = new AwS640S0100000_26(this, 13);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(this, 182);
        if (i != 0 && i != 2) {
            String str = this.LLJJI;
            List<District> list = this.LLJJL;
            String str2 = this.LLJJLIIIJLLLLLLLZ;
            RegionPickerWrapper regionPickerWrapper = new RegionPickerWrapper();
            Bundle bundle2 = new Bundle();
            if (string != null) {
                bundle2.putStringArray("geoname_ids", new String[]{string});
            }
            bundle2.putInt("number_of_remaining_level", i2 - 1);
            bundle2.putBoolean("show_back_icon", true);
            C786410Ut5.LJJJI("page_info", string2, bundle2);
            if (str != null) {
                C786410Ut5.LJJJI("defaultRegion", str, bundle2);
            }
            regionPickerWrapper.LLJ = list;
            regionPickerWrapper.LLJI = str2;
            regionPickerWrapper.setArguments(bundle2);
            Function1<? super List<Region>, Unit> function1 = this.LLJIJIL;
            regionPickerWrapper.LLILLL = AFwS215S0000000_26.get$arr$(475);
            regionPickerWrapper.LLILZ = awS570S0100000_26;
            regionPickerWrapper.LLILZIL = awS640S0100000_26;
            regionPickerWrapper.LLILZLL = function1;
            this.LLJL = regionPickerWrapper;
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.iip, regionPickerWrapper);
            c19ehLJIIJ.LJIIJ();
            return;
        }
        ArrayList parcelableArrayList = arguments.getParcelableArrayList("current_selected_region_list");
        Boolean bool = this.LLJILJILJ;
        InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
        boolean z = this.LLJJ;
        String str3 = this.LLJJIII;
        String str4 = this.LLJJIJI;
        String str5 = this.LLJJIJIIJIL;
        Integer num = this.LLJJIJIL;
        boolean z2 = this.LLJJJ;
        Boolean bool2 = this.LLJILLL;
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        DistrictFragment districtFragmentLIZ = C1007103wj.LIZ(string, parcelableArrayList, i2, string2, bool, null, null, interfaceC1748810vbrLIZ, z, str3, str4, str5, num, z2, zBooleanValue, this.LLJJJIL, this.LLJJJJ, string3, this.LLJJJJJIL, this.LLJJJJLIIL, 96);
        districtFragmentLIZ.LLJZIJLIL = awS640S0100000_26;
        districtFragmentLIZ.LLL = awS570S0100000_26;
        districtFragmentLIZ.LLLFF = this.LLJIJIL;
        this.LLJL = districtFragmentLIZ;
        C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ2.LIZIZ(R.id.iip, districtFragmentLIZ);
        c19ehLJIIJ2.LJIIJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.amt, viewGroup, false);
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
