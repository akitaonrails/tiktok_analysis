package com.ss.android.ugc.aweme.story.inbox.view;

import X.C01GW;
import X.C0S1B;
import X.C1387040mCM;
import X.C13LP;
import X.C1595350rcL;
import X.C1598120rgo;
import X.C1606320ru2;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1607400rvm;
import X.C1608320rxG;
import X.C1608680rxq;
import X.C1608750rxx;
import X.C1618440sDa;
import X.C295190Bhd;
import X.C427660Gpo;
import X.C452501pT;
import X.C737760Swo;
import X.C786410Ut5;
import X.EnumC1606080rte;
import X.EnumC1607270rvZ;
import X.EnumC1608710rxt;
import X.InterfaceC1398730mVD;
import X.InterfaceC1891350zJl;
import X.ViewOnLongClickListenerC1620730sHH;
import Y.ACListenerS158S0100000_24;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.story.inbox.StoryRevealInboxItem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS309S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryRevealInboxCell extends PowerCell<StoryRevealInboxItem> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1193));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1194));
    public InterfaceC1398730mVD LLILLL;

    public final AvatarComponentView I5() {
        return (AvatarComponentView) this.LL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1607400rvm.LIZIZ.LIZIZ(EnumC1606080rte.INBOX_TOP_LIST, new C1608320rxG(this.itemView, I5(), (View) null, (View) this.LLILLJJLI.getValue(), (TuxIconView) null, 48), C295190Bhd.LIZIZ());
        AvatarComponentView avatarComponentViewI5 = I5();
        C1608750rxx config = avatarComponentViewI5.getConfig();
        new AwS603S0100000_24(this, 658).invoke(config.LIZ);
        config.LIZJ(new C737760Swo(new C1606750ruj(EnumC1606080rte.REVEAL_ENTRANCE, new C1606770rul(null, new AwS625S0100000_11(this, 157), null, null, AFwS213S0000000_24.get$arr$(621), null, new AwS603S0100000_24(this, 660), null, null, 429), 4)));
        config.LIZJ(new C1606320ru2(0));
        avatarComponentViewI5.LJFF(avatarComponentViewI5.getConfig());
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 118), this.itemView);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1850);
        I5().LIZ(3, new ACListenerS158S0100000_24(awS568S0100000_24, 120));
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1620730sHH(awS568S0100000_24, 5));
        ((TextView) this.LLILLJJLI.getValue()).setText("Story Reveal");
        C1387040mCM.LIZ(this.itemView, new AwS309S0000000_24(2));
        C1595350rcL.LIZLLL(this);
    }

    public final View L5() {
        return I5().findViewById(C1608680rxq.LIZIZ(EnumC1607270rvZ.STORY, EnumC1608710rxt.BADGE, "icon"));
    }

    public final View N5() {
        return I5().findViewById(C1608680rxq.LIZIZ(EnumC1607270rvZ.STORY, EnumC1608710rxt.RING, null));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1618440sDa.LIZIZ.LJJ().LIZLLL(viewGroup.getContext(), null, R.layout.fbv, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1598120rgo c1598120rgo;
        StoryRevealInboxItem storyRevealInboxItem = (StoryRevealInboxItem) interfaceC1891350zJl;
        super.onBindItemView(storyRevealInboxItem, list);
        Object objLJJJLL = C13LP.LJJJLL(list);
        if (!(objLJJJLL instanceof C1598120rgo) || (c1598120rgo = (C1598120rgo) objLJJJLL) == null || c1598120rgo.LIZ) {
            C427660Gpo.LJIIJJI(I5().getAvatar(), Integer.valueOf(R.raw.icon_bitmap_story_reveal), false, null, null, false, false, null, null, false, null, 1022);
            C0S1B.LIZ(I5(), AwemeExtKt.getAuthorUid(storyRevealInboxItem.getStoryCollection()), storyRevealInboxItem.getStoryCollection(), this, false, null, 56);
        }
    }
}
