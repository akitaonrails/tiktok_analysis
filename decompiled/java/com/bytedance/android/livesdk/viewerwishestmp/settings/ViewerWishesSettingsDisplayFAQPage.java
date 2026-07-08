package com.bytedance.android.livesdk.viewerwishestmp.settings;

import X.C1126540fQC;
import X.C1143680frq;
import X.C16F5;
import X.C497740JfY;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.zhiliaoapp.musically.R;
import wh6.AbS710S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ViewerWishesSettingsDisplayFAQPage extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9PiwpPiohPyw/ISogPCg8HELIOSZzw2PDElJyggZhMlLDg2OhIlOic2OxYpPTs6JiI/DSYgOCktMAkSGRUtLio=";
    public int LLJLLL;
    public C16F5 LLJZ;
    public C16F5 LLJZIJLIL;
    public C1126540fQC LLL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJZ = (C16F5) view.findViewById(R.id.viewer_wishes_faq_title);
        this.LLJZIJLIL = (C16F5) view.findViewById(R.id.viewer_wishes_faq_content);
        View viewFindViewById = view.findViewById(R.id.viewer_wishes_faq_got_it);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS710S0100000_31(this, 2), viewFindViewById);
        }
        this.LLL = (C1126540fQC) view.findViewById(R.id.viewer_wishes_faq_img);
        if (this.LLJLLL == 0) {
            C16F5 c16f5 = this.LLJZ;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131856954));
            }
            C16F5 c16f52 = this.LLJZIJLIL;
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIJI(2131856956));
            }
            C1143680frq.LIZLLL(this.LLL, "tiktok_live_interaction_demand_11", "ttlive_viewer_wishes_faq_display_point_v2.png");
            return;
        }
        C16F5 c16f53 = this.LLJZ;
        if (c16f53 != null) {
            c16f53.setText(C497740JfY.LJIJI(2131856957));
        }
        C16F5 c16f54 = this.LLJZIJLIL;
        if (c16f54 != null) {
            c16f54.setText(C497740JfY.LJIJI(2131856958));
        }
        C1143680frq.LIZLLL(this.LLL, "tiktok_live_interaction_demand_11", "ttlive_viewer_wishes_faq_display_timer_v2.png");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hx0, viewGroup, false);
    }
}
