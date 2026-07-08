package com.ss.android.ugc.aweme.detail.component.biz.friends;

import X.C01GW;
import X.C0T2Y;
import X.C10IT;
import X.C1345700l7g;
import X.C452501pT;
import X.C740740T3w;
import Y.ACListenerS115S0200000_11;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.component.biz.friends.FriendsDetailTopBarAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailTopBarAssem extends BasePanelUIComponent {
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 129));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 131));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 133));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 132));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 130));

    public final boolean Go(Aweme aweme) {
        VideoMaskInfo contentClassificationMaskInfo;
        if (aweme == null) {
            return false;
        }
        C10IT.LIZ.getClass();
        if (!C10IT.LJIILJJIL(aweme) && !C10IT.LJIIL(aweme) && !C10IT.LJIILIIL(aweme) && ((contentClassificationMaskInfo = aweme.getContentClassificationMaskInfo()) == null || !Intrinsics.LJFF(contentClassificationMaskInfo.showMask, Boolean.TRUE))) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C740740T3w.LIZIZ(C1345700l7g.LJIILLIIL(this), this, new C0T2Y() { // from class: X.0SEr
            @Override // X.C0T2Y
            public final void Y3(Aweme aweme) {
                int i;
                int i2;
                String strLJI;
                FriendsDetailTopBarAssem friendsDetailTopBarAssem = this.LL;
                if (aweme != null) {
                    friendsDetailTopBarAssem.getClass();
                    User author = aweme.getAuthor();
                    if (author != null) {
                        TextView textView = (TextView) friendsDetailTopBarAssem.LLJIJIL.getValue();
                        if (textView != null) {
                            C1243240iSQ.LIZ.getClass();
                            textView.setText(C1243240iSQ.LIZ(author, true));
                        }
                        LinearLayout linearLayout = (LinearLayout) friendsDetailTopBarAssem.LLJILLL.getValue();
                        if (linearLayout != null) {
                            C786410Ut5.R7(linearLayout, new ACListenerS115S0200000_11(friendsDetailTopBarAssem, aweme, 33));
                        }
                    }
                }
                TextView textView2 = (TextView) friendsDetailTopBarAssem.LLJILJIL.getValue();
                if (textView2 != null) {
                    if (aweme != null && aweme.getCreateTime() > 0 && !AwemeExtKt.isScheduleVideo(aweme)) {
                        strLJI = C1356610lPH.LJI(aweme.getCreateTime() * 1000, C1BWL.LIZ());
                    } else {
                        strLJI = "";
                    }
                    textView2.setText(strLJI);
                }
                boolean zGo = friendsDetailTopBarAssem.Go(aweme);
                TuxTextView tuxTextView = (TuxTextView) friendsDetailTopBarAssem.LLJIJIL.getValue();
                int i3 = 0;
                if (tuxTextView != null) {
                    if (zGo) {
                        i2 = 4;
                    } else {
                        i2 = 0;
                    }
                    C786410Ut5.LLLLZLL(tuxTextView, i2);
                }
                TuxTextView tuxTextView2 = (TuxTextView) friendsDetailTopBarAssem.LLJILJIL.getValue();
                if (tuxTextView2 != null) {
                    if (zGo) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    C786410Ut5.LLLLZLL(tuxTextView2, i);
                }
                FriendsDetailTopBarAssem friendsDetailTopBarAssem2 = this.LL;
                TuxIconView tuxIconView = (TuxIconView) friendsDetailTopBarAssem2.LLJILJILJ.getValue();
                if (tuxIconView != null) {
                    tuxIconView.setIconRes(R.raw.icon_ellipsis_horizontal);
                    tuxIconView.setTintColorRes(R.attr.ee);
                    C786410Ut5.a9(tuxIconView, new ACListenerS146S0100000_11(friendsDetailTopBarAssem2, 68));
                    if (friendsDetailTopBarAssem2.Go(aweme)) {
                        i3 = 4;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView, i3);
                }
            }
        });
    }
}
