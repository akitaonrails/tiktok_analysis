package com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.cell;

import X.AbstractViewOnClickListenerC1165700gRM;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C13LP;
import X.C1612910s4f;
import X.C19350310n7;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1578890rBn;
import X.InterfaceC1891350zJl;
import Y.ARunnableS29S1100000_24;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.appdiff.InnerFeedPlaylistAppDiffProtocol;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel;
import com.ss.android.ugc.aweme.model.BadgeType;
import com.ss.android.ugc.aweme.model.PaidCollectionOverView;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.service.MiniDramaRouterService;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public class SeriesPanelSquareRecommendItemCell extends PowerCell<C1612910s4f> {
    public RemoteImageView LL;
    public TuxIconView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 743));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 744));
    public final C736950SvV LLIZLLLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LLILLJJLI = (TuxIconView) this.itemView.findViewById(R.id.urz);
        this.LL = (RemoteImageView) this.itemView.findViewById(R.id.urx);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.us1);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.us0);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.ury);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1165700gRM() { // from class: X.0s4c
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1165700gRM
            public final void LIZ(View view) {
                C1612910s4f item;
                PaidCollectionOverView paidCollectionOverView;
                if (view != null && (item = this.LLILZ.getItem()) != null && (paidCollectionOverView = item.LL) != null) {
                    long j = paidCollectionOverView.collectionId;
                    this.LLILZ.LLIZLLLIL.getValue();
                    MiniDramaRouterService.LIZ.getClass();
                    MiniDramaRouterService miniDramaRouterServiceLIZ = C1573900r3k.LIZ();
                    if (miniDramaRouterServiceLIZ != null) {
                        miniDramaRouterServiceLIZ.LIZJ(j);
                    }
                    C1612860s4a c1612860s4a = (C1612860s4a) this.LLILZ.LLILZLL.getValue();
                    if (c1612860s4a != null) {
                        InnerFeedPlaylistAppDiffProtocol.LIZ.getClass();
                        C1613230s5B.LIZIZ.getValue().LIZIZ();
                        C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
                        long j2 = c1612860s4a.LLILZLL;
                        String str = c1612860s4a.LLJIJIL;
                        String str2 = c1612860s4a.LLILZIL;
                        boolean z = c1612860s4a.LLJILJIL;
                        boolean z2 = c1612860s4a.LLJILLL;
                        boolean z3 = c1612860s4a.LLJILJILJ;
                        c1581520rG2.LJJJIL(j2, str, str2, Boolean.valueOf(z), Boolean.valueOf(z3), Boolean.valueOf(z2), c1612860s4a.LLJJ, "recommended_drama", String.valueOf(this.LLILZ.getAbsoluteAdapterPosition() + 1), String.valueOf(j), c1612860s4a.LLJ, Boolean.valueOf(c1612860s4a.LLJJI), Boolean.valueOf(c1612860s4a.LLJJIII), c1612860s4a.LLJJIJI, c1612860s4a.LLJJIJIIJIL, c1612860s4a.LLJJIJIL, c1612860s4a.LLJJJ);
                    }
                }
            }
        }, this.itemView);
    }

    public SeriesPanelSquareRecommendItemCell() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 745);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(SeriesPanelSquareViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(220), null, null, null);
    }

    public final void I5(C1612910s4f c1612910s4f) {
        BadgeType badgeType;
        String str;
        UrlModel urlModel;
        List<String> urlList;
        String str2;
        RemoteImageView remoteImageView;
        PaidCollectionOverView paidCollectionOverView = c1612910s4f.LL;
        if (paidCollectionOverView != null && (urlModel = paidCollectionOverView.cover) != null && (urlList = urlModel.getUrlList()) != null && (str2 = (String) C13LP.LJJJLL(urlList)) != null && (remoteImageView = this.LL) != null) {
            HandlerHook.viewPost(remoteImageView, new ARunnableS29S1100000_24(this, str2, 0));
        }
        PaidCollectionOverView paidCollectionOverView2 = c1612910s4f.LL;
        if (paidCollectionOverView2 == null || (badgeType = paidCollectionOverView2.badgeType) == null) {
            badgeType = BadgeType.NUM_WATCHED;
        }
        if (badgeType == BadgeType.HEAT_SCORE) {
            TuxIconView tuxIconView = this.LLILLJJLI;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(EnumC1578890rBn.ICON_FIRE_3_FILL.id());
            }
            PaidCollectionOverView paidCollectionOverView3 = c1612910s4f.LL;
            if (paidCollectionOverView3 != null) {
                long j = paidCollectionOverView3.heatScore;
                TuxTextView tuxTextView = this.LLILLL;
                if (tuxTextView != null) {
                    tuxTextView.setText(C19350310n7.LIZ(j));
                }
            }
        } else {
            TuxIconView tuxIconView2 = this.LLILLJJLI;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(EnumC1578890rBn.ICON_PLAY_FILL.id());
            }
            PaidCollectionOverView paidCollectionOverView4 = c1612910s4f.LL;
            if (paidCollectionOverView4 != null) {
                int i = paidCollectionOverView4.watchedCount;
                TuxTextView tuxTextView2 = this.LLILLL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(C19350310n7.LIZ(i));
                }
            }
        }
        TuxTextView tuxTextView3 = this.LLILZ;
        Integer numValueOf = null;
        if (tuxTextView3 != null) {
            PaidCollectionOverView paidCollectionOverView5 = c1612910s4f.LL;
            if (paidCollectionOverView5 != null) {
                str = paidCollectionOverView5.name;
            } else {
                str = null;
            }
            tuxTextView3.setText(str);
        }
        TuxTextView tuxTextView4 = this.LLILZIL;
        if (tuxTextView4 != null) {
            String string = tuxTextView4.getContext().getString(2131847443);
            Object[] objArr = new Object[1];
            PaidCollectionOverView paidCollectionOverView6 = c1612910s4f.LL;
            if (paidCollectionOverView6 != null) {
                numValueOf = Integer.valueOf(paidCollectionOverView6.videoCount);
            }
            objArr[0] = numValueOf;
            tuxTextView4.setText(C786410Ut5.j4(string, Arrays.copyOf(objArr, 1)));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        I5((C1612910s4f) interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bbx, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        I5((C1612910s4f) interfaceC1891350zJl);
    }
}
