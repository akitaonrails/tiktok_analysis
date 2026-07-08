package com.ss.android.ugc.aweme.poi.albummix.cell;

import X.C1183810guZ;
import X.C21681819tI;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class PoiAlbumMixAccCategoryTitleCell extends PowerCell<C1183810guZ> {
    public TuxTextView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C21681819tI c21681819tI;
        super.onItemViewCreated();
        View view = this.itemView;
        this.LL = view instanceof TuxTextView ? (TuxTextView) view : null;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C21681819tI) || (c21681819tI = (C21681819tI) layoutParams) == null) {
            return;
        }
        c21681819tI.LLILLJJLI = true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1183810guZ c1183810guZ = (C1183810guZ) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            String str = c1183810guZ.LLIZ;
            if (str == null) {
                str = "";
            }
            tuxTextView.setText(str);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dya, viewGroup, false);
    }
}
