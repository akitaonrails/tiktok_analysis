package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell;

import X.C0H4V;
import X.C2211631BhB;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class PoiHighLightIconCell extends PowerCell<C0H4V> {
    public TuxIconView LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public C0H4V LLILZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LJ(this.itemView, new AwS585S0100000_6(this, 138));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ca  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r9) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell.PoiHighLightIconCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e07, viewGroup, false);
        this.LL = (TuxIconView) viewTd.findViewById(R.id.x1g);
        this.LLILLJJLI = (SmartImageView) viewTd.findViewById(R.id.x1m);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.x2d);
        return viewTd;
    }
}
