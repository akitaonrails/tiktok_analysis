package com.ss.android.ugc.aweme.story.archive2.calendar;

import X.C1156960gDG;
import X.C1697810uHb;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class StoryArchiveV2MonthHeaderCell extends PowerCell<C1156960gDG> {
    public final List<String> LL;

    public StoryArchiveV2MonthHeaderCell() {
        String[] strArr = new String[7];
        Context context = getContext();
        strArr[0] = context != null ? context.getString(2131833973) : null;
        Context context2 = getContext();
        strArr[1] = context2 != null ? context2.getString(2131833971) : null;
        Context context3 = getContext();
        strArr[2] = context3 != null ? context3.getString(2131833975) : null;
        Context context4 = getContext();
        strArr[3] = context4 != null ? context4.getString(2131833976) : null;
        Context context5 = getContext();
        strArr[4] = context5 != null ? context5.getString(2131833974) : null;
        Context context6 = getContext();
        strArr[5] = context6 != null ? context6.getString(2131833970) : null;
        Context context7 = getContext();
        strArr[6] = context7 != null ? context7.getString(2131833972) : null;
        this.LL = C1697810uHb.LJIIJJI(strArr);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1156960gDG c1156960gDG = (C1156960gDG) interfaceC1891350zJl;
        super.onBindItemView(c1156960gDG);
        ((TextView) this.itemView.findViewById(R.id.zp6)).setText(new BDDateFormat("LL-D").LIZIZ(c1156960gDG.LL, Locale.getDefault()));
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.nen);
        C786410Ut5.LJJJJJL(linearLayout);
        for (String str : this.LL) {
            TuxTextView tuxTextView = new TuxTextView(linearLayout.getContext(), null, 6, 0);
            C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(0, -2, 1.0f));
            tuxTextView.setText(str);
            tuxTextView.setGravity(17);
            tuxTextView.setTuxFont(62);
            tuxTextView.setTextColorRes(R.attr.zl);
            linearLayout.addView(tuxTextView);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.fb5, false, 4, null);
    }
}
