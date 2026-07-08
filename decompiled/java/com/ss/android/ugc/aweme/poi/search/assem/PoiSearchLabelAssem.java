package com.ss.android.ugc.aweme.poi.search.assem;

import X.AbstractC738140SxQ;
import X.C0IDF;
import X.C1220000hqw;
import X.C13LE;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.poi.search.creator.tag.PoiSearchCreatorCategoryLabelCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class PoiSearchLabelAssem extends UISlotAssem {
    public final String LLJJI = "PoiSearchLabelAssem";
    public final C736950SvV LLJJIII;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e8p;
    }

    public PoiSearchLabelAssem() {
        AFwS192S0000000_6 aFwS192S0000000_6 = AFwS192S0000000_6.get$arr$(116);
        this.LLJJIII = new C736950SvV(C13LE.LIZ(PoiSearchVM.class), aFwS192S0000000_6, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(259), new AwS550S0100000_6((AbstractC738140SxQ) this, 525), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rcw);
        this.LLJJIJI = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 0, false));
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiSearchCreatorCategoryLabelCell.class);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0IDF(viewOnAttachStateChangeListenerC20604515jv, 3));
        }
        C736680Sv4.LJIIIIZZ(this, this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0HPY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1197490hGd) obj).LLIZLLLIL;
            }
        }, null, new AwS620S0100000_6(this, 49), 6);
    }
}
