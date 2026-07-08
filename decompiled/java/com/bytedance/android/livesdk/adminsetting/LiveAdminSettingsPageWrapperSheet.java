package com.bytedance.android.livesdk.adminsetting;

import X.C1091700eW0;
import X.C19EH;
import X.C20736316Cj;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveAdminSettingsPageWrapperSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4HELIOSICE0ZgklPyoSLCglJxw2PDElJyggGCQrLBghKTU8LD0AICApPQ==";
    public final Fragment LLJLLL;

    public LiveAdminSettingsPageWrapperSheet(Fragment fragment) {
        this.LLJLLL = fragment;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezn, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        Fragment fragment = this.LLJLLL;
        c19ehLJIIJ.LIZJ(R.id.n0c, fragment, fragment.getClass().getCanonicalName());
        c19ehLJIIJ.LJIIJ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1091700eW0 c1091700eW0 = new C1091700eW0(layoutInflater.getContext());
        c1091700eW0.setId(R.id.n0c);
        C786410Ut5.v6(c1091700eW0, new ViewGroup.LayoutParams(-1, -1));
        return c1091700eW0;
    }
}
