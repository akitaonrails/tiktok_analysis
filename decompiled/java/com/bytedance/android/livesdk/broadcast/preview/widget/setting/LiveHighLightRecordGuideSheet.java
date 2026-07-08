package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C011Z;
import X.C0IJT;
import X.C1119170fEJ;
import X.C1143680frq;
import X.C1143780fs0;
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
import android.widget.ImageView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHighLightRecordGuideSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDHELIOSh9PywoLionZjYpPTs6JiJiBSYlLQ0lLicfISIkPR02Kyo+LQgmISEpGic2LTE=";
    public final boolean LLJLLL;
    public final String LLJZ;
    public final Function0<Unit> LLJZIJLIL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        ArrayList arrayList = new ArrayList();
        C510160Jza c510160Jza = new C510160Jza(C497740JfY.LJIJI(this.LLJLLL ? 2131855668 : 2131855667), R.style.a7h, new C521860KdM(this, 6));
        c500060JjI.LIZLLL = EnumC500050JjH.PADDING_STYLE_LARGE;
        arrayList.add(c510160Jza);
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C758170Tod(R.attr.eo4, new ACListenerS142S0100000_7(this, 30)));
        c1119170fEJ.LJFF = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        if (!Intrinsics.LJFF(this.LLJZ, "live_take_page")) {
            sheetOptions.dimBehindType = 1;
        }
        sheetOptions.LIZ(2, null);
        sheetOptions.isHeaderFloating = true;
        sheetOptions.draggable = false;
        sheetOptions.cornerRadius = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<String> listLJIIJJI;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.jcq);
        if (viewFindViewById != null) {
            if (C011Z.LIZ.LJIJ(getContext())) {
                listLJIIJJI = C1143780fs0.LJIIJJI("tiktok_live_broadcast_demand_2", "record_comments_and_gifts_guide_dark.png");
            } else {
                listLJIIJJI = C1143780fs0.LJIIJJI("tiktok_live_broadcast_demand_2", "record_comments_and_gifts_guide_light.png");
            }
            C1143680frq.LJIIJ(viewFindViewById, listLJIIJJI, ImageView.ScaleType.FIT_CENTER, null, false, null, 48);
        }
        uS(this.LLJZ, "show", null);
    }

    public LiveHighLightRecordGuideSheet(String str, Function0 function0, boolean z) {
        this.LLJLLL = z;
        this.LLJZ = str;
        this.LLJZIJLIL = function0;
    }

    public static void uS(String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_highlight_element_popup");
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII("record_elements", "popup_type");
        c474500IjALIZ.LJJII(str2, "action_type");
        if (str3 != null) {
            c474500IjALIZ.LJJII(str3, "click_type");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.goz, viewGroup, false);
    }
}
