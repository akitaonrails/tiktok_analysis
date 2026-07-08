package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.dialog;

import X.C1143680frq;
import X.C384050F3z;
import X.C497740JfY;
import X.C516560KNq;
import X.C786410Ut5;
import X.C823050WQl;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.ss.android.common.lib.AppLogNewUtils;
import com.zhiliaoapp.musically.R;
import irm.AkS79S0100000_7;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseM2GuideSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUvOmEwJzA+Oip9Kyo5Ozw2LCHELIOSA4KCY/OCQrLGElISA7Zys6KSkjLmEDKzYPJjohOyABewgmISEpGic2LTE=";

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zLIZ;
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        if (TextUtils.isEmpty("com.nc.tiktok.usmain")) {
            zLIZ = true;
        } else {
            zLIZ = C516560KNq.LIZ(context, "com.nc.tiktok.usmain");
        }
        View viewFindViewById = view.findViewById(R.id.e1v);
        View viewFindViewById2 = view.findViewById(R.id.nuz);
        View viewFindViewById3 = view.findViewById(R.id.nuw);
        TextView textView = (TextView) view.findViewById(R.id.nux);
        TextView textView2 = (TextView) view.findViewById(R.id.nv0);
        TextView textView3 = (TextView) view.findViewById(R.id.nuy);
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131821832));
        }
        if (zLIZ) {
            if (textView2 != null) {
                textView2.setText(C497740JfY.LJIJJ(2131821834, C497740JfY.LJIJI(2131853635)));
            }
            if (textView3 != null) {
                textView3.setText(C497740JfY.LJIJJ(2131821833, C497740JfY.LJIJI(2131853635)));
            }
        } else {
            if (textView2 != null) {
                textView2.setText(C497740JfY.LJIJI(2131855829));
            }
            if (textView3 != null) {
                textView3.setText(C497740JfY.LJIJI(2131855828));
            }
        }
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AkS79S0100000_7(this, 4), viewFindViewById);
        }
        if (viewFindViewById3 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            c384050F3z.LIZJ = Float.valueOf(C497740JfY.LIZIZ(12));
            viewFindViewById3.setBackground(c384050F3z.LIZ(view.getContext()));
            C786410Ut5.I7(new AkS79S0100000_7(this, 5), viewFindViewById3);
        }
        C1143680frq.LJ(viewFindViewById2, "tiktok_live_subscription_demand_1", "pcs_course_m2_guide.png", ImageView.ScaleType.FIT_CENTER);
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0C9E
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ2;
                C1C7U.LIZ("PcsCourseM2GuideSheet@7950.logM2GuideShow$1");
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("enter_from", "service_plus_course_purchase_page");
                    AppLogNewUtils.onEventV3("guide_user_m2_show", jSONObject);
                } finally {
                    if (!zLIZ2) {
                    }
                }
                C1C7U.LIZIZ("PcsCourseM2GuideSheet@7950.logM2GuideShow$1");
            }
        });
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.dca, viewGroup, false);
    }
}
