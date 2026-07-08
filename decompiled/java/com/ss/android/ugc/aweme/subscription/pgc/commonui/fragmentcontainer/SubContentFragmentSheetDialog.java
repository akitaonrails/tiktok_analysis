package com.ss.android.ugc.aweme.subscription.pgc.commonui.fragmentcontainer;

import X.C0K4C;
import X.C19EH;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SheetOptions;
import com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SubscriptionSheetFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SubContentFragmentSheetDialog extends SubscriptionSheetFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KyohJCA9PSHELIOSxiLz0yLygpJzswJys4KCY9LTdiGjoxCyoiPSo9PAM+KCg+LSs4Gic2LTEIIC4/JyI=";
    public String LLJJIJIIJIL = "";

    @Override // com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SubscriptionSheetFragment
    public final SheetOptions ZR() {
        String string;
        SheetOptions sheetOptions = new SheetOptions();
        Bundle arguments = getArguments();
        sheetOptions.sheetStyle = (arguments == null || (string = arguments.getString("is_super_fans")) == null || !Boolean.parseBoolean(string)) ? 6 : 7;
        sheetOptions.cornerRadiusPx = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        sheetOptions.isDraggable = false;
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("fragment_id")) == null) {
            string = "";
        }
        this.LLJJIJIIJIL = string;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null && getChildFragmentManager().LJJJJZ(R.id.wl2) == null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.wl2, C0K4C.LIZ(getArguments(), this.LLJJIJIIJIL), "SubContentFragmentContainer");
            c19ehLJIIJ.LJIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SubscriptionSheetFragment
    public final View VR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.ffe, viewGroup, false);
    }
}
