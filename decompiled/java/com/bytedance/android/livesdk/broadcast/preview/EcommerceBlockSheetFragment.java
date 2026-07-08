package com.bytedance.android.livesdk.broadcast.preview;

import X.C0IJT;
import X.C0UQX;
import X.C1119170fEJ;
import X.C418440Gaw;
import X.C474500IjA;
import X.C497740JfY;
import X.C500060JjI;
import X.C510160Jza;
import X.C521860KdM;
import X.C758170Tod;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC500050JjH;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class EcommerceBlockSheetFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTHELIOSY4Zz8hLTMlLDh9DSYjJCI2OiYpCyM8Ky4fISo2PAM+KCg+LSs4";
    public final DataChannel LLJLLL;

    public EcommerceBlockSheetFragment() {
        this(null);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        ArrayList arrayList = new ArrayList();
        C510160Jza c510160Jza = new C510160Jza(C497740JfY.LJIJI(2131852039), R.style.a7h, new C521860KdM(this, 5));
        c500060JjI.LIZLLL = EnumC500050JjH.PADDING_STYLE_LARGE;
        arrayList.add(c510160Jza);
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C758170Tod(R.attr.eo4, new ACListenerS142S0100000_7(this, 27)));
        c1119170fEJ.LJFF = arrayList;
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    public EcommerceBlockSheetFragment(DataChannel dataChannel) {
        this.LLJLLL = dataChannel;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.isHeaderFloating = false;
        sheetOptions.draggable = false;
        sheetOptions.cornerRadius = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_probation_mode_banner");
        c474500IjALIZ.LJIJJLI(this.LLJLLL);
        c474500IjALIZ.LJJII(C0UQX.LIZJ(this.LLJLLL), "live_entrance_name");
        c474500IjALIZ.LIZ();
        super.onViewCreated(view, bundle);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.ge4, viewGroup, false);
    }
}
