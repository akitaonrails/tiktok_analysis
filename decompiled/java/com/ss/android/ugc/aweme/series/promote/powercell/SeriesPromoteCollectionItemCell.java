package com.ss.android.ugc.aweme.series.promote.powercell;

import X.C01GW;
import X.C0HZQ;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C13LP;
import X.C1572980r2G;
import X.C1573950r3p;
import X.C1BWL;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC1891350zJl;
import Y.ACListenerS126S0200000_24;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.series.serieslist.viewmodel.SeriesListAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesPromoteCollectionItemCell extends PowerCell<C1573950r3p> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1056));
    public final C736950SvV LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;

    public SeriesPromoteCollectionItemCell() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1057);
        this.LLILLJJLI = new C736950SvV(C13LE.LIZ(SeriesListAssemViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(328), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.s_j);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.s_n);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.s_m);
    }

    public final void I5(CollectionDetailModel collectionDetailModel) {
        C0HZQ c0hzq = (C0HZQ) this.itemView.findViewById(R.id.s_a);
        C786410Ut5.LLLLLZ(c0hzq, 0);
        c0hzq.setClickable(false);
        c0hzq.setChecked(((C1572980r2G) ((AssemViewModel) this.LLILLJJLI.getValue()).getState()).LLILLL.containsKey(Long.valueOf(collectionDetailModel.collectionId)));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        int iIntValue;
        List<String> urlList;
        C1573950r3p c1573950r3p = (C1573950r3p) interfaceC1891350zJl;
        CollectionDetailModel collectionDetailModel = c1573950r3p.LL;
        I5(collectionDetailModel);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.s_l);
        UrlModel urlModel = collectionDetailModel.collectionCover;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
            str = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        TuxTextView tuxTextView = this.LLILLL;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(collectionDetailModel.collectionName);
        TuxTextView tuxTextView3 = this.LLILZ;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.setText(tuxTextView3.getResources().getString(2131847460));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.o9, this.itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextView3.setTextColor(iIntValue);
        tuxTextView3.setBackground(C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.bf9));
        tuxTextView3.setTuxFont(62);
        TuxTextView tuxTextView4 = this.LLILZIL;
        if (tuxTextView4 != null) {
            tuxTextView2 = tuxTextView4;
        }
        tuxTextView2.setText(C1BWL.LIZJ().getString(2131847458, Integer.valueOf((int) collectionDetailModel.collectionSalesNum)));
        C786410Ut5.I7(new ACListenerS126S0200000_24(this, c1573950r3p, 1), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bhl, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1573950r3p c1573950r3p = (C1573950r3p) interfaceC1891350zJl;
        I5(c1573950r3p.LL);
        super.onBindItemView(c1573950r3p, list);
    }
}
