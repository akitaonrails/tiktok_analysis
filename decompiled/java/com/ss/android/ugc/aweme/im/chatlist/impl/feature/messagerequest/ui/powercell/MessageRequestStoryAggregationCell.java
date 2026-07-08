package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell;

import X.AbstractC884010Ym7;
import X.AbstractC885530YoZ;
import X.C01GW;
import X.C0I0B;
import X.C1322090kVb;
import X.C20684815ws;
import X.C300860Bqm;
import X.C337180DJs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C814420VxA;
import X.C881240Yhe;
import X.C885310YoD;
import X.C886410Ypz;
import X.EnumC880520YgU;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestStoryAggregationCell extends BaseMessageRequestChatListCell<C881240Yhe> {
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1493));

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.BaseMessageRequestChatListCell
    public final void P5() {
        List<String> conversations;
        if (!C300860Bqm.LIZ()) {
            AssemViewModel assemViewModel = (AssemViewModel) this.LLJJJ.getValue();
            EnumC880520YgU enumC880520YgU = EnumC880520YgU.MESSAGE_REQUEST_SPAM;
            assemViewModel.getClass();
            assemViewModel.setState(new AwS593S0100000_14(enumC880520YgU, 195));
        }
        N5().GQ2(EnumC880520YgU.MESSAGE_REQUEST_SPAM, "story_reactions");
        AbstractC885530YoZ abstractC885530YoZ = this.LLJJIJIIJIL;
        if (abstractC885530YoZ != null) {
            C885310YoD c885310YoD = C885310YoD.LIZ;
            C0I0B.LJFF.LIZIZ();
            c885310YoD.getClass();
            C886410Ypz c886410Ypz = abstractC885530YoZ instanceof C886410Ypz ? (C886410Ypz) abstractC885530YoZ : null;
            int size = (c886410Ypz == null || (conversations = c886410Ypz.getConversations()) == null) ? 0 : conversations.size();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", "notification_page");
            AbstractC884010Ym7 unreadState = abstractC885530YoZ.getUnreadState();
            linkedHashMap.put("unread_cnt", String.valueOf(Math.max(0, unreadState != null ? unreadState.getNum() : 0)));
            linkedHashMap.put("cell_type", "message_request_spam_entrance");
            Integer numValueOf = Integer.valueOf(size);
            if (numValueOf.intValue() > 0) {
                linkedHashMap.put("total_chat_cnt", String.valueOf(numValueOf.intValue()));
            }
            C20684815ws.LJIILLIIL("im_stranger_request_list_cell_click", linkedHashMap);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.BaseMessageRequestChatListCell
    public final void S5(AbstractC885530YoZ abstractC885530YoZ) {
        Context context;
        if (!(abstractC885530YoZ instanceof C886410Ypz)) {
            return;
        }
        C337180DJs.LIZJ((View) this.LLJJ.getValue());
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null && (context = currentFragment.getContext()) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_bubble_left_right_fill;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.of);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
            C1322090kVb c1322090kVb = (C1322090kVb) this.LLJJI.getValue();
            if (c1322090kVb != null) {
                c1322090kVb.setImageDrawable(layerDrawableLJIILIIL);
            }
        }
    }
}
