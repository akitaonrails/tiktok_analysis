package com.ss.android.ugc.aweme.mix.pickcandidate;

import X.C1165690gRL;
import X.C1169160gWw;
import X.C1324840ka2;
import X.C20684815ws;
import X.C21412118qt;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS121S0200000_18;
import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class MixPickCandidatePowerCell extends PowerCell<C1165690gRL> {
    public Context LL;

    public final void I5(C1165690gRL c1165690gRL) {
        String str;
        MultiVideoViewModel multiVideoViewModel = (MultiVideoViewModel) getFragmentViewModel(MultiVideoViewModel.class, null);
        if (multiVideoViewModel != null && multiVideoViewModel.LLJILJILJ) {
            if (c1165690gRL.LLILLJJLI) {
                str = "select";
            } else {
                str = "cancel";
            }
            C1169160gWw.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("choose_type", str);
            C20684815ws.LJIILLIIL("livesdk_live_anchor_playlist_choose_post", c2344009Gk.LIZ);
        }
    }

    public final void L5(int i) {
        C786410Ut5.LLLLLLZZ((TuxIconView) this.itemView.findViewById(R.id.dbo), 0);
        ((TuxIconView) this.itemView.findViewById(R.id.dbo)).setIconRes(i);
        ((TuxIconView) this.itemView.findViewById(R.id.dbo)).setTintColor(this.itemView.getResources().getColor(R.color.ao));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        RelativeLayout.LayoutParams layoutParams;
        List<String> urlList;
        C1165690gRL c1165690gRL = (C1165690gRL) interfaceC1891350zJl;
        UrlModel urlModel = c1165690gRL.LL;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
            if (!urlList.isEmpty()) {
                RemoteImageView remoteImageView = (RemoteImageView) this.itemView.findViewById(R.id.dbi);
                String str = (String) ListProtector.get(urlList, 0);
                if (str == null) {
                    str = "";
                }
                C1324840ka2.LJIIJ(remoteImageView, str, -1, -1);
            } else {
                Context context = this.LL;
                if (context != null) {
                    C1324840ka2.LIZ((RemoteImageView) this.itemView.findViewById(R.id.dbi), context.getResources().getColor(R.color.al));
                }
            }
        }
        if (!c1165690gRL.LLILLL && !c1165690gRL.LLILZLL) {
            C786410Ut5.LJZ(8, (FrameLayout) this.itemView.findViewById(R.id.dbj));
        } else {
            C786410Ut5.LJZ(0, (FrameLayout) this.itemView.findViewById(R.id.dbj));
        }
        if (c1165690gRL.LLIZ) {
            L5(R.raw.icon_exclamation_mark_circle);
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 159), this.itemView);
            C786410Ut5.U7((C21412118qt) this.itemView.findViewById(R.id.dbg), new ACListenerS153S0100000_18(this, 160));
            C786410Ut5.S7((RelativeLayout) this.itemView.findViewById(R.id.dbh), new ACListenerS153S0100000_18(this, 161));
        } else if (c1165690gRL.LLILZ) {
            L5(R.raw.icon_playlist);
            C786410Ut5.LLLLLLZZ((TuxIconView) this.itemView.findViewById(R.id.dbo), 0);
        } else {
            C786410Ut5.LLLLLLZZ((TuxIconView) this.itemView.findViewById(R.id.dbo), 8);
        }
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.dbo);
        View viewFindViewById = this.itemView.findViewById(R.id.wg6);
        Aweme aweme = c1165690gRL.LLILZIL;
        if (aweme != null && aweme.isSubOnlyVideo()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                layoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                C786410Ut5.W5(viewFindViewById, layoutParams);
            }
        } else {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        ((TextView) this.itemView.findViewById(R.id.dbg)).setSelected(c1165690gRL.LLILLJJLI);
        this.itemView.findViewById(R.id.dbg).setClickable(true ^ c1165690gRL.LLILLL);
        if (!c1165690gRL.LLILLL && !c1165690gRL.LLILZLL) {
            C786410Ut5.I7(new ACListenerS121S0200000_18(this, c1165690gRL, 51), this.itemView);
            C786410Ut5.U7((C21412118qt) this.itemView.findViewById(R.id.dbg), new ACListenerS121S0200000_18(this, c1165690gRL, 52));
            C786410Ut5.S7((RelativeLayout) this.itemView.findViewById(R.id.dbh), new ACListenerS121S0200000_18(this, c1165690gRL, 53));
        } else {
            if (c1165690gRL.LLIZ) {
                return;
            }
            C786410Ut5.I7(null, this.itemView);
            C786410Ut5.U7((C21412118qt) this.itemView.findViewById(R.id.dbg), null);
            C786410Ut5.S7((RelativeLayout) this.itemView.findViewById(R.id.dbh), null);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        this.LL = viewGroup.getContext();
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dnz, viewGroup, false);
    }
}
