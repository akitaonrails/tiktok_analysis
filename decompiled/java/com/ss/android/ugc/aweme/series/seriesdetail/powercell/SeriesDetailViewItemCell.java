package com.ss.android.ugc.aweme.series.seriesdetail.powercell;

import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1611880s30;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;
import com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesDetailViewItemCell extends PowerCell<C1611880s30> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1090));
    public final C736950SvV LLILLJJLI;
    public final C736950SvV LLILLL;
    public SmartImageView LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public TuxIconView LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxIconView LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public C1611880s30 LLJJJ;
    public String LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LLJJJJJIL;

    public SeriesDetailViewItemCell() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1092);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesDetailVideoListViewModel.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(346);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLILLJJLI = new C736950SvV(c19719912DlLIZ, awS568S0100000_24, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS264S0000000_24, null, null, null);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24(this, 1093);
        this.LLILLL = new C736950SvV(C13LE.LIZ(SeriesInnerFeedViewModel.class), awS568S0100000_242, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(347), null, null, null);
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1091));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILZ = (SmartImageView) this.itemView.findViewById(R.id.video_item_cover);
        this.LLIZ = (TuxIconView) this.itemView.findViewById(R.id.enp);
        this.LLIZLLLIL = (TuxIconView) this.itemView.findViewById(R.id.video_item_reported_icon);
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.l4_);
        this.LLJI = (TuxTextView) this.itemView.findViewById(R.id.l4a);
        this.LLJIJIL = (TuxTextView) this.itemView.findViewById(R.id.l4b);
        this.LLJILJIL = (TuxTextView) this.itemView.findViewById(R.id.l1x);
        this.LLJILJILJ = (TuxTextView) this.itemView.findViewById(R.id.l4k);
        this.LLJILLL = (TuxIconView) this.itemView.findViewById(R.id.l2s);
        this.LLJJ = this.itemView.findViewById(R.id.roz);
        this.LLJJI = this.itemView.findViewById(R.id.sih);
        this.LLJJIII = this.itemView.findViewById(R.id.l4f);
        this.LLJJIJI = this.itemView.findViewById(R.id.l4e);
        this.LLILZIL = this.itemView.findViewById(R.id.video_item_progress);
        this.LLILZLL = this.itemView.findViewById(R.id.video_item_progress_background);
        this.LLJJIJIIJIL = this.itemView.findViewById(R.id.vcx);
        this.LLJJIJIL = (TuxTextView) this.itemView.findViewById(R.id.vcy);
        TuxIconView tuxIconView = this.LLJILLL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_lock;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        c419910GdJ.LJ = Integer.valueOf(R.attr.ds);
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1611880s30 c1611880s30) {
        I5(null, c1611880s30);
        if (!this.LLJJJJ) {
            AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLILLJJLI.getValue(), new C2217381BqS() { // from class: X.0s2L
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1612160s3S) obj).LLJJ;
                }
            }, null, null, null, new AwS603S0100000_24(this, 265), 14, null);
            this.LLJJJJ = true;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bhe, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:336:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(java.lang.String r18, X.C1611880s30 r19) {
        /*
            Method dump skipped, instruction units count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.seriesdetail.powercell.SeriesDetailViewItemCell.I5(java.lang.String, X.0s30):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        onBindItemView((C1611880s30) interfaceC1891350zJl);
    }
}
