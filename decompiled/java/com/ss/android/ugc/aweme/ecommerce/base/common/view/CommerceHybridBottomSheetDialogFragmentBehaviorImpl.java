package com.ss.android.ugc.aweme.ecommerce.base.common.view;

import X.C04TD;
import X.C786410Ut5;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.service.ICommerceHybridBottomSheetDialogFragmentBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class CommerceHybridBottomSheetDialogFragmentBehaviorImpl implements ICommerceHybridBottomSheetDialogFragmentBehavior {
    public static ICommerceHybridBottomSheetDialogFragmentBehavior LIZIZ() {
        Object objLIZ = C04TD.LIZ(ICommerceHybridBottomSheetDialogFragmentBehavior.class, false);
        if (objLIZ != null) {
            return (ICommerceHybridBottomSheetDialogFragmentBehavior) objLIZ;
        }
        if (C04TD.LLLZLZ == null) {
            synchronized (ICommerceHybridBottomSheetDialogFragmentBehavior.class) {
                if (C04TD.LLLZLZ == null) {
                    C04TD.LLLZLZ = new CommerceHybridBottomSheetDialogFragmentBehaviorImpl();
                }
            }
        }
        return C04TD.LLLZLZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.ICommerceHybridBottomSheetDialogFragmentBehavior
    public final void LIZ(Uri uri, int i, FragmentManager fragmentManager, String str, boolean z) {
        CommerceHybridBottomSheetDialogFragment commerceHybridBottomSheetDialogFragment = new CommerceHybridBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "url", uri);
        bundle.putInt("height", i);
        bundle.putBoolean("use_react_id_close", z);
        bundle.putBoolean("enable_drag_close", true);
        commerceHybridBottomSheetDialogFragment.setArguments(bundle);
        commerceHybridBottomSheetDialogFragment.show(fragmentManager, str);
    }
}
