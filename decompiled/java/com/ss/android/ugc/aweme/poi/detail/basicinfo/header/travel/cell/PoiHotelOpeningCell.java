package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell;

import X.C2211631BhB;
import X.C436550H9x;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;
import irm.AkS78S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class PoiHotelOpeningCell extends PowerCell<C436550H9x> {
    public TuxTextView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LJ(this.itemView, new AwS585S0100000_6(this, 139));
        C786410Ut5.I7(new AkS78S0100000_6(this, 3), this.itemView);
    }

    public static String I5(C436550H9x c436550H9x) {
        PoiListApi.PoiYearForDisplay poiYearForDisplay;
        Integer num;
        if (c436550H9x == null || (poiYearForDisplay = c436550H9x.LLILLJJLI) == null || (num = poiYearForDisplay.yearType) == null) {
            return null;
        }
        if (num.intValue() == 1) {
            return "14";
        }
        if (num.intValue() != 2) {
            return null;
        }
        return "12";
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        C436550H9x c436550H9x = (C436550H9x) interfaceC1891350zJl;
        super.onBindItemView(c436550H9x);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            PoiListApi.PoiYearForDisplay poiYearForDisplay = c436550H9x.LLILLJJLI;
            if (poiYearForDisplay != null) {
                str = poiYearForDisplay.displayText;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e08, viewGroup, false);
        this.LL = (TuxTextView) viewTd.findViewById(R.id.pog);
        return viewTd;
    }
}
