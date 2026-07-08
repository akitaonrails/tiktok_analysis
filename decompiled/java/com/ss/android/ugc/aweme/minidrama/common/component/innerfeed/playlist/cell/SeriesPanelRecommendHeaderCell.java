package com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.cell;

import X.C007R;
import X.C01GW;
import X.C452501pT;
import X.C718540SGm;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.json.JSONException;
import wh6.AbS703S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesPanelRecommendHeaderCell extends PowerCell<C007R> {
    public View LL;
    public AwS568S0100000_24 LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 738));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View viewFindViewById = this.itemView.findViewById(R.id.njm);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS703S0100000_24(viewFindViewById, 8), viewFindViewById);
        } else {
            viewFindViewById = null;
        }
        this.LL = viewFindViewById;
        this.LLILLJJLI = new AwS568S0100000_24(this, 739);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() throws JSONException {
        super.onViewAttachedToWindow();
        AwS568S0100000_24 awS568S0100000_24 = this.LLILLJJLI;
        if (awS568S0100000_24 != null) {
            awS568S0100000_24.invoke();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C007R c007r = (C007R) interfaceC1891350zJl;
        View view = this.LL;
        if (view != null) {
            if (c007r.LL) {
                C718540SGm.LIZIZ(view);
            } else {
                C718540SGm.LIZ(view);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bbz, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C007R c007r = (C007R) interfaceC1891350zJl;
        View view = this.LL;
        if (view != null) {
            if (c007r.LL) {
                C718540SGm.LIZIZ(view);
            } else {
                C718540SGm.LIZ(view);
            }
        }
    }
}
