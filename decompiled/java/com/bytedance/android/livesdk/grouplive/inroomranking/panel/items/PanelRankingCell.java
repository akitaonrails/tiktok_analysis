package com.bytedance.android.livesdk.grouplive.inroomranking.panel.items;

import X.C019L;
import X.C01GW;
import X.C1143680frq;
import X.C1143780fs0;
import X.C1324610kZf;
import X.C1819620xS4;
import X.C2872019i;
import X.C292401Bi;
import X.C500260Jjc;
import X.C5182020e;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class PanelRankingCell extends PowerCell<C019L> {
    public final C01GW LL = C292401Bi.LIZ(new C5182020e(this, 96));
    public final C01GW LLILLJJLI = C292401Bi.LIZ(new C5182020e(this, 98));
    public final C01GW LLILLL = C292401Bi.LIZ(new C5182020e(this, 97));
    public final C01GW LLILZ = C292401Bi.LIZ(new C5182020e(this, 95));
    public final C01GW LLILZIL = C292401Bi.LIZ(new C5182020e(this, 94));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        String strValueOf;
        int iIntValue;
        String strK4;
        int iIntValue2;
        C019L c019l = (C019L) interfaceC1891350zJl;
        super.onBindItemView(c019l);
        if (c019l.LLILLJJLI < 0) {
            z = true;
        } else {
            z = false;
        }
        TextView textView = (TextView) this.LL.getValue();
        if (z) {
            strValueOf = "-";
        } else {
            strValueOf = String.valueOf(c019l.LLILLJJLI);
        }
        textView.setText(strValueOf);
        Integer numLIZ = C2872019i.LIZ(R.attr.ezq, ((View) this.LL.getValue()).getContext());
        int iIntValue3 = -592138;
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = -592138;
        }
        textView.setTextColor(iIntValue);
        C500260Jjc.LLFFF(textView);
        TextView textView2 = (TextView) this.LLILLJJLI.getValue();
        textView2.setText(c019l.LLILLL);
        Integer numLIZ2 = C2872019i.LIZ(R.attr.ezq, ((View) this.LLILLJJLI.getValue()).getContext());
        if (numLIZ2 != null) {
            iIntValue3 = numLIZ2.intValue();
        }
        textView2.setTextColor(iIntValue3);
        TextView textView3 = (TextView) this.LLILLL.getValue();
        long j = c019l.LLILZ;
        if (j < 1000) {
            strK4 = String.valueOf(j);
        } else if (j < 1000000) {
            strK4 = C786410Ut5.k4(Locale.US, "%.1fK", Arrays.copyOf(new Object[]{Double.valueOf(j / ((double) LSPassThroughRecordSizeConfig.DEFAULT))}, 1));
        } else if (j < 1000000000) {
            strK4 = C786410Ut5.k4(Locale.US, "%.1fM", Arrays.copyOf(new Object[]{Double.valueOf(j / ((double) 1000000))}, 1));
        } else {
            strK4 = C786410Ut5.k4(Locale.US, "%.1fB", Arrays.copyOf(new Object[]{Double.valueOf(j / ((double) 1000000000))}, 1));
        }
        textView3.setText(strK4);
        Integer numLIZ3 = C2872019i.LIZ(R.attr.ezt, ((View) this.LLILLL.getValue()).getContext());
        if (numLIZ3 != null) {
            iIntValue2 = numLIZ3.intValue();
        } else {
            iIntValue2 = -1711276033;
        }
        textView3.setTextColor(iIntValue2);
        View viewFindViewById = this.itemView.findViewById(R.id.q2_);
        if (viewFindViewById != null) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(c019l.LLILZLL);
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            int width = viewFindViewById.getWidth();
            int height = viewFindViewById.getHeight();
            c1324610kZfLJIIIZ.LJ = width;
            c1324610kZfLJIIIZ.LJFF = height;
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
            c1324610kZfLJIIIZ.LJJI(viewFindViewById);
        }
        if (C500260Jjc.LJJIFFI(c019l.LLILZIL)) {
            C500260Jjc.LJIILIIL((View) this.LLILZ.getValue());
            C500260Jjc.LJIILIIL((View) this.LLILZIL.getValue());
        } else {
            C500260Jjc.LLFFF((View) this.LLILZ.getValue());
            C1143680frq.LJI((View) this.LLILZIL.getValue(), C1143780fs0.LJIIJ("tiktok_live_interaction_normal_4", "ttlive_group_live_ranking_panel_performing_icon.webp"), null, true);
            C500260Jjc.LLFFF((View) this.LLILZIL.getValue());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.goo, false, 4, null);
    }
}
