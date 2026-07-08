package com.ss.android.ugc.aweme.minidrama.tab.v2.guest;

import X.C1165730gRP;
import X.C1220000hqw;
import X.C1320310kSj;
import X.C1320340kSm;
import X.C1324840ka2;
import X.C1331090kk7;
import X.C1331100kk8;
import X.C13LE;
import X.C13LP;
import X.C19350310n7;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1578890rBn;
import X.InterfaceC1320380kSq;
import X.InterfaceC1891350zJl;
import Y.ACListenerS121S0200000_18;
import Y.ARunnableS20S1200000_16;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaGuestLandingItemCell extends PowerCell<C1165730gRP> {
    public final C736950SvV LL;
    public TuxTextView LLILLJJLI;
    public int LLILLL;
    public int LLILZ;

    public DramaGuestLandingItemCell() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(245);
        this.LL = new C736950SvV(C13LE.LIZ(DramaGuestLandingViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(227), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.g90);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        long jLongValue;
        List<String> urlList;
        String str;
        int i;
        C1165730gRP c1165730gRP = (C1165730gRP) interfaceC1891350zJl;
        ShortDramaOverview shortDramaOverview = c1165730gRP.LL;
        RemoteImageView remoteImageView = (RemoteImageView) this.itemView.findViewById(R.id.g91);
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
            int i2 = this.LLILLL;
            if (i2 != 0 && (i = this.LLILZ) != 0) {
                C1324840ka2.LJIIJ(remoteImageView, str, i2, i);
            } else {
                HandlerHook.viewPost(remoteImageView, new ARunnableS20S1200000_16(this, remoteImageView, str, 11));
            }
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            Long l = shortDramaOverview.numWatched;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            tuxTextView.setText(C19350310n7.LIZ(jLongValue));
        }
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.qmu);
        if (tuxIconView != null) {
            tuxIconView.setIconRes(EnumC1578890rBn.ICON_PLAY_FILL.id());
        }
        C786410Ut5.I7(new ACListenerS121S0200000_18(c1165730gRP, this, 57), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bnz, viewGroup, false);
    }
}
