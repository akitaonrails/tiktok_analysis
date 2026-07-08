package com.ss.android.ugc.aweme.series.feed.mylist.assme;

import X.C01GW;
import X.C1220000hqw;
import X.C1320310kSj;
import X.C1320340kSm;
import X.C1324840ka2;
import X.C1331090kk7;
import X.C1331100kk8;
import X.C13LE;
import X.C13LP;
import X.C1573160r2Y;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1320380kSq;
import X.InterfaceC1891350zJl;
import Y.ACListenerS126S0200000_24;
import Y.ARunnableS20S1200000_16;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import com.ss.android.ugc.aweme.series.feed.mylist.assme.opt.SeriesHistorySubPageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class MyListItemCell extends PowerCell<C1573160r2Y> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 919));
    public final C736950SvV LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;

    public MyListItemCell() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 920);
        this.LLILLJJLI = new C736950SvV(C13LE.LIZ(SeriesHistorySubPageViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(283), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.e7m);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.hah);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.hai);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.h_b);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        List<String> urlList;
        String str;
        int i;
        C1573160r2Y c1573160r2Y = (C1573160r2Y) interfaceC1891350zJl;
        ShortDramaOverview shortDramaOverview = c1573160r2Y.LL;
        RemoteImageView remoteImageView = (RemoteImageView) this.itemView.findViewById(R.id.e7c);
        Resources resources = remoteImageView.getContext().getResources();
        C1331090kk7 c1331090kk7 = new C1331090kk7(resources);
        c1331090kk7.LJIIZILJ = C1331100kk8.LIZLLL(C418440Gaw.LIZIZ(8));
        C1320310kSj c1320310kSj = InterfaceC1320380kSq.LIZJ;
        c1331090kk7.LJ = resources.getDrawable(R.drawable.arq);
        c1331090kk7.LJFF = c1320310kSj;
        C1320340kSm c1320340kSm = InterfaceC1320380kSq.LJI;
        c1331090kk7.LJIIIIZZ = resources.getDrawable(R.drawable.arq);
        c1331090kk7.LJIIIZ = c1320340kSm;
        remoteImageView.setHierarchy(c1331090kk7.LIZ());
        UrlModel urlModel = shortDramaOverview.cover;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
            int i2 = this.LLIZ;
            if (i2 != 0 && (i = this.LLIZLLLIL) != 0) {
                C1324840ka2.LJIIJ(remoteImageView, str, i2, i);
            } else {
                HandlerHook.viewPost(remoteImageView, new ARunnableS20S1200000_16(this, remoteImageView, str, 7));
            }
        }
        Integer num = shortDramaOverview.lastWatched;
        if (num != null && num.intValue() >= 0) {
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                C786410Ut5.LJLLLLLL(0, tuxTextView);
            }
            TuxTextView tuxTextView2 = this.LLILZLL;
            if (tuxTextView2 != null) {
                C786410Ut5.LJLLLLLL(0, tuxTextView2);
            }
            TuxTextView tuxTextView3 = this.LLILZLL;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(" / ");
            }
            TuxTextView tuxTextView4 = this.LLILZ;
            if (tuxTextView4 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EP.");
                sbLIZ.append(num);
                tuxTextView4.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            TuxTextView tuxTextView5 = this.LLILZIL;
            if (tuxTextView5 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EP.");
                sbLIZ2.append(shortDramaOverview.numVideos);
                tuxTextView5.setText(C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else {
            TuxTextView tuxTextView6 = this.LLILZ;
            if (tuxTextView6 != null) {
                C786410Ut5.LJLLLLLL(8, tuxTextView6);
            }
            TuxTextView tuxTextView7 = this.LLILZLL;
            if (tuxTextView7 != null) {
                C786410Ut5.LJLLLLLL(8, tuxTextView7);
            }
            TuxTextView tuxTextView8 = this.LLILZIL;
            if (tuxTextView8 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("EP.");
                sbLIZ3.append(shortDramaOverview.numVideos);
                tuxTextView8.setText(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        TuxTextView tuxTextView9 = this.LLILLL;
        if (tuxTextView9 != null) {
            tuxTextView9.setText(shortDramaOverview.title);
        }
        View view = this.itemView;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS126S0200000_24(this, c1573160r2Y, 22), view);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f5a, viewGroup, false);
    }
}
