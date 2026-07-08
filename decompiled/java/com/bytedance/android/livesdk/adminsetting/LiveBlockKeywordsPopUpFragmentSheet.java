package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0IJT;
import X.C1119170fEJ;
import X.C292401Bi;
import X.C474500IjA;
import X.C497740JfY;
import X.C500060JjI;
import X.C510160Jza;
import X.C521860KdM;
import X.C758170Tod;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveBlockKeywordsPopUpFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4HELIOSICE0ZgklPyoRJCovIgQ2MTIjOysgGCo8HD8VOiQrJCo9PBYkLCon";
    public final C01GW LLJLLL = C292401Bi.LIZ(new AwS551S0100000_7(this, 14));
    public final C01GW LLJZ = C292401Bi.LIZ(new AwS551S0100000_7(this, 13));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131838729), R.style.a7b, new C521860KdM(this, 1)));
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131838731), R.style.a_u, new C521860KdM(this, 2)));
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C758170Tod(R.attr.eo4, new ACListenerS142S0100000_7(this, 5)));
        c1119170fEJ.LJFF = arrayList;
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        return sheetOptions;
    }

    public final void uS(String str) {
        boolean zBooleanValue;
        String str2;
        long id;
        if (this.LLJLLL.getValue() != null) {
            zBooleanValue = ((Boolean) this.LLJZ.getValue()).booleanValue();
        } else {
            zBooleanValue = true;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (zBooleanValue) {
            str2 = "anchor";
        } else {
            str2 = "admin";
        }
        c474500IjALIZ.LJJII(str2, "admin_type");
        Room room = (Room) this.LLJLLL.getValue();
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
        c474500IjALIZ.LJJII("1", "first_time_see");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        uS("livesdk_comment_keywords_blocking_popup_see");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g7x, viewGroup, false);
    }
}
