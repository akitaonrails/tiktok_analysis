package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C01GW;
import X.C13BV;
import X.C1749280vcc;
import X.C20736316Cj;
import X.C23250099c;
import X.C312201Iy;
import X.C419201k6;
import X.C452501pT;
import X.C497740JfY;
import X.C5182020e;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class LiveInviteGuestSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hHELIOSLTMlLDh9PywoLionZjYpPTs6JiJiBSYlLQwiPyYnLQI5LDwnGy0pLDs=";
    public final C01GW LLJLLL = C452501pT.LIZIZ(new C5182020e(this, 82));
    public C1749280vcc LLJZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exe, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        sheetOptions.dimBehindType = 2;
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(16.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LiveInviteGuestViewModel liveInviteGuestViewModel = (LiveInviteGuestViewModel) this.LLJLLL.getValue();
        C13BV c13bv = C13BV.INSTANCE;
        liveInviteGuestViewModel.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveInviteGuestViewModel), null, null, new C312201Iy(liveInviteGuestViewModel, "go_live_page_suggest_refresh", c13bv, null), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJZ = (C1749280vcc) view.findViewById(R.id.w28);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C419201k6(this, null), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hbd, viewGroup, false);
    }
}
