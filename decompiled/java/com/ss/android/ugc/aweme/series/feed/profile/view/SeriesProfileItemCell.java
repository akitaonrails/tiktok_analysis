package com.ss.android.ugc.aweme.series.feed.profile.view;

import X.C01GW;
import X.C1220000hqw;
import X.C1324840ka2;
import X.C13LE;
import X.C13LP;
import X.C1572790r1x;
import X.C19350310n7;
import X.C2188811AlT;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1578890rBn;
import X.InterfaceC1891350zJl;
import Y.ACListenerS88S0300000_24;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.series.feed.profile.viewmodel.SeriesProfileTabViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesProfileItemCell extends PowerCell<C1572790r1x> {
    public TuxTextView LL;
    public RemoteImageView LLILLJJLI;
    public LinearLayout LLILLL;
    public TuxTextView LLILZ;
    public View LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 946));
    public final C736950SvV LLIZ;

    public SeriesProfileItemCell() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 947);
        this.LLIZ = new C736950SvV(C13LE.LIZ(SeriesProfileTabViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(290), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        View view = this.LLILZIL;
        if (view != null) {
            view.setBackground(null);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.hag);
        this.LLILLJJLI = (RemoteImageView) this.itemView.findViewById(R.id.e7c);
        this.LLILLL = (LinearLayout) this.itemView.findViewById(R.id.m1g);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.tv_play_count);
        this.LLILZIL = this.itemView.findViewById(R.id.us9);
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.qmu);
        if (tuxIconView != null) {
            tuxIconView.setIconRes(EnumC1578890rBn.ICON_PLAY_FILL.id());
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.tv_play_icon);
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(EnumC1578890rBn.ICON_PLAY.id());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        Long lValueOf;
        List<String> urlList;
        int i;
        long jIntValue;
        C1572790r1x c1572790r1x = (C1572790r1x) interfaceC1891350zJl;
        super.onBindItemView(c1572790r1x);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EP.");
            sbLIZ.append(c1572790r1x.LLILLL);
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 != null) {
            Integer num = c1572790r1x.LLILZIL.LIZ;
            if (num != null) {
                jIntValue = num.intValue();
            } else {
                jIntValue = 0;
            }
            tuxTextView2.setText(C19350310n7.LIZ(jIntValue));
        }
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout != null) {
            if (c1572790r1x.LLILZ) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, linearLayout);
        }
        RemoteImageView remoteImageView = this.LLILLJJLI;
        UrlModel urlModel = c1572790r1x.LLILLJJLI;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
            str = "";
        }
        C1324840ka2.LJIIJ(remoteImageView, str, -1, -1);
        if (Intrinsics.LJFF(c1572790r1x.LLILZIL.LIZJ, Boolean.TRUE)) {
            lValueOf = c1572790r1x.LLILZIL.LIZLLL;
        } else {
            lValueOf = Long.valueOf(c1572790r1x.LLILZLL);
        }
        RemoteImageView remoteImageView2 = this.LLILLJJLI;
        if (remoteImageView2 != null) {
            C786410Ut5.E9(remoteImageView2, new ACListenerS88S0300000_24(this, c1572790r1x, lValueOf, 7));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bi4, viewGroup, false);
    }
}
