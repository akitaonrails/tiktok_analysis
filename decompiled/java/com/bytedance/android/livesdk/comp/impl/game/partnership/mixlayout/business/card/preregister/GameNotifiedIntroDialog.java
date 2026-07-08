package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.preregister;

import X.C1546210qL5;
import X.C1880070z1Z;
import X.C1882730z5r;
import X.C2097608Jq;
import X.C497740JfY;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes29.dex */
public final class GameNotifiedIntroDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7ITViJCHELIOSYrJCQ1JjonZic5OiY9LTY/ZywyOiFiOT02OiArIDwnLTdiDi4+LQsjPSY1ISAoACEnOioIIC4/JyI=";

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.draggable = true;
        sheetOptions.dimBehindType = 1;
        C1546210qL5.LIZ.getClass();
        sheetOptions.cornerRadius = C814420VxA.LIZIZ(C1546210qL5.LIZ(26));
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        String string;
        super.onDestroy();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("page_id")) == null) {
            string = "";
        }
        C1880070z1Z.LJII(C1882730z5r.LIZ(string), "first_intro", "close", C2097608Jq.LJ());
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0z8u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.LL.close(1);
            }
        }, view.findViewById(R.id.cqt));
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0z8v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.LL.close(1);
            }
        }, view.findViewById(R.id.fsw));
        TextView textView = (TextView) view.findViewById(R.id.jdv);
        if (textView != null) {
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getInt("subscription_type") == 1) {
                textView.setText(2131852538);
            } else {
                textView.setText(2131852541);
            }
        }
        ((TuxTextView) view.findViewById(R.id.zou)).LJJJJI(28.0f);
        View viewFindViewById = view.findViewById(R.id.k66);
        if (viewFindViewById != null) {
            int iLIZLLL = C497740JfY.LIZLLL(R.attr.c63, viewFindViewById.getContext());
            viewFindViewById.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{16777215 & iLIZLLL, iLIZLLL}));
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("page_id")) == null) {
            string = "";
        }
        C1880070z1Z.LJIIIZ(C1882730z5r.LIZ(string), "first_intro");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gma, viewGroup, false);
    }
}
