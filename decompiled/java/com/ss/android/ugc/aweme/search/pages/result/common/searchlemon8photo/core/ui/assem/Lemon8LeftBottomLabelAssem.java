package com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem;

import X.C07E5;
import X.C288710BTh;
import X.C418440Gaw;
import X.C426750GoL;
import X.C814420VxA;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class Lemon8LeftBottomLabelAssem extends ReusedUISlotAssem<Lemon8LeftBottomLabelAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.euj;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        String string;
        Context context = LJJIJL().getContext();
        C426750GoL.LJIIIZ(view, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-4))), null, null, false, 29);
        TextView textView = (TextView) view.findViewById(R.id.mly);
        if (textView != null) {
            if (C288710BTh.LIZ() == 2) {
                string = context.getResources().getString(2131836381);
            } else {
                string = context.getResources().getString(2131836382);
            }
            textView.setText(string);
        }
    }
}
