package com.ss.android.ugc.now.interaction.assem;

import X.C01GW;
import X.C03IT;
import X.C1243240iSQ;
import X.C1354870lMT;
import X.C1402390mb7;
import X.C2211751BhN;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427660Gpo;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1398730mVD;
import X.InterfaceC1891350zJl;
import Y.ACListenerS124S0200000_21;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class LikeCell extends PowerCell<LikeItem> {
    public User LLILZLL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1108));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1113));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1109));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1112));
    public String LLILZIL = "";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1111));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = (View) this.LLILZ.getValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -2;
        layoutParams.height = -2;
        C786410Ut5.W5(view, layoutParams);
        View view2 = (View) this.LL.getValue();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        C786410Ut5.W5(view2, layoutParams2);
        View view3 = (View) this.LLILLL.getValue();
        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        C786410Ut5.W5(view3, layoutParams3);
        C2211751BhN.LIZ(this.itemView, new C1402390mb7(this, 5));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String nickname;
        String enterFrom;
        LikeItem likeItem = (LikeItem) interfaceC1891350zJl;
        super.onBindItemView(likeItem);
        this.LLILZLL = likeItem.getUser();
        TextView textView = (TextView) this.LLILLJJLI.getValue();
        User user = this.LLILZLL;
        String str = "";
        if (user != null) {
            C1243240iSQ.LIZ.getClass();
            nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
        } else {
            nickname = null;
        }
        textView.setText(nickname);
        C03IT c03itLIZ = C1354870lMT.LIZ(this.LLILZLL);
        if (c03itLIZ != null) {
            C427660Gpo.LJIIJJI((C427660Gpo) this.LL.getValue(), c03itLIZ, false, null, null, false, false, null, null, false, null, 1006);
        }
        C786410Ut5.I7(new ACListenerS124S0200000_21(likeItem, this, 71), this.itemView);
        NowFeedMobHierarchyData interactionHierarchyData = likeItem.getInteractionHierarchyData();
        if (interactionHierarchyData != null && (enterFrom = interactionHierarchyData.getEnterFrom()) != null) {
            str = enterFrom;
        }
        this.LLILZIL = str;
        InterfaceC1398730mVD interfaceC1398730mVD = (InterfaceC1398730mVD) this.LLIZ.getValue();
        if (interfaceC1398730mVD != null) {
            interfaceC1398730mVD.LIZLLL(this.LLILZLL);
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_n_thumbup_outlined;
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        ((TuxIconView) this.LLILLL.getValue()).setTuxIcon(c419910GdJ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ctt, viewGroup, false);
    }
}
