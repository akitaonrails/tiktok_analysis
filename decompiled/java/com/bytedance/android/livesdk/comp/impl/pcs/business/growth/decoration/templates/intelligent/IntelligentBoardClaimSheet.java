package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent;

import X.C0HTI;
import X.C1766560w4U;
import X.C418440Gaw;
import X.C497740JfY;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.tux.system.TuxImmersionBar;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class IntelligentBoardClaimSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE0Oio7PSd9HELIOSLCAvJj0yPCwjJ2EnLSg8JS4nLTZiICEnLSkgICg2JjFiACEnLSkgICg2JjEOJi4hLAYgKCY+Gy0pLDs=";
    public long LLJLLL;

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
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.c5n);
        tuxImmersionBarLIZLLL.LJ(R.attr.ezk);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LIZLLL();
        RadiusLayout radiusLayout = (RadiusLayout) view.findViewById(R.id.c6i);
        if (radiusLayout != null) {
            radiusLayout.LIZ(C418440Gaw.LIZIZ(12), C418440Gaw.LIZIZ(12), 0.0f, 0.0f);
        }
        ((TextView) view.findViewById(R.id.dzl)).setText(C497740JfY.LJIJI(2131851481));
        TextView textView = (TextView) view.findViewById(R.id.dzk);
        int i = (int) this.LLJLLL;
        textView.setText(C497740JfY.LJIIL(2131755806, i, Integer.valueOf(i)));
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.dzi), new View.OnClickListener() { // from class: X.0xLn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.LL.close(1);
            }
        });
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.dzm);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.rj;
        liveIconView.setIcon(c0hti.LIZ(liveIconView.getContext()));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hlz, viewGroup, false);
    }
}
