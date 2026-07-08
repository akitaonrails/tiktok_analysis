package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.ui;

import X.C01GW;
import X.C1819620xS4;
import X.C1833570xoZ;
import X.C1834080xpO;
import X.C1834130xpT;
import X.C1834240xpe;
import X.C20684815ws;
import X.C21685819tw;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import irm.AkS64S0200000_27;
import irm.AkS94S0100000_27;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplayCellFromBB extends PowerCell<C1834080xpO> {
    public C21685819tw LLJI;
    public final C01GW LL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 482));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 485));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 481));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 480));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 484));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 483));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 479));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 478));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 477));
    public final String LLJIJIL = String.valueOf(UserService.getInstance().user().getCurrentUserId());

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        View view = this.itemView;
        C786410Ut5.I7(new AkS64S0200000_27(this, view, 2), (View) this.LL.getValue());
        C786410Ut5.I7(new AkS94S0100000_27(this, 12), (View) this.LLIZ.getValue());
        ((ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue()).LJIIIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        String str;
        double dLIZIZ;
        C1834080xpO c1834080xpO = (C1834080xpO) interfaceC1891350zJl;
        super.onBindItemView(c1834080xpO);
        C1833570xoZ c1833570xoZ = C1833570xoZ.LIZ;
        C1834080xpO item = getItem();
        if (item != null && !item.LLILZ) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.LLJIJIL;
        c1833570xoZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            str = "anchor_id";
        } else {
            str = "viewer_user_id";
        }
        c2344009Gk.LJIIIIZZ(str, str2);
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board");
        C20684815ws.LJIILLIIL("livesdk_viewer_live_replay_module_show", c2344009Gk.LIZ);
        C1819620xS4.LIZ().LJIIIZ(c1834080xpO.LL.cover).LJJI((View) this.LLILZ.getValue());
        ((TextView) this.LLILLJJLI.getValue()).setText(C1834240xpe.LIZ(c1834080xpO.LL.createTime));
        TextView textView = (TextView) this.LLILLL.getValue();
        String strLJIJI = c1834080xpO.LL.title;
        if (strLJIJI.length() == 0) {
            strLJIJI = C497740JfY.LJIJI(2131851075);
        }
        textView.setText(strLJIJI);
        RoomReplay roomReplay = c1834080xpO.LL;
        if (roomReplay.watchStatus != 3 && roomReplay.available) {
            ((View) this.LLILZ.getValue()).setForeground(null);
            C500260Jjc.LJIILIIL((View) this.LLILZIL.getValue());
            C500260Jjc.LJIILIIL((View) this.LLILZLL.getValue());
            if (c1834080xpO.LLILLJJLI.isEmpty()) {
                C500260Jjc.LJIILIIL((View) this.LLIZ.getValue());
            } else {
                C500260Jjc.LLFFF((View) this.LLIZ.getValue());
                ((TextView) this.LLIZLLLIL.getValue()).setText(C497740JfY.LJIJJ(2131855675, String.valueOf(c1834080xpO.LLILLJJLI.size())));
            }
        } else {
            ((View) this.LLILZ.getValue()).setForeground(this.itemView.getContext().getDrawable(R.drawable.ci0));
            C500260Jjc.LLFFF((View) this.LLILZIL.getValue());
            if (!c1834080xpO.LL.available) {
                ((TextView) this.LLILZLL.getValue()).setText(C497740JfY.LJIJI(2131842556));
            } else {
                ((TextView) this.LLILZLL.getValue()).setText(C497740JfY.LJIJI(2131851271));
            }
            C500260Jjc.LLFFF((View) this.LLILZLL.getValue());
            C500260Jjc.LJIILIIL((View) this.LLIZ.getValue());
        }
        List<C1834130xpT> list = c1834080xpO.LLILLJJLI;
        C21685819tw c21685819tw = this.LLJI;
        if (c21685819tw == null) {
            C21685819tw c21685819tw2 = new C21685819tw(3, list.size(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            c21685819tw2.LJIIL = false;
            this.LLJI = c21685819tw2;
            ((ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue()).LJFF(this.LLJI);
        } else {
            c21685819tw.LJI = list.size();
            C21685819tw c21685819tw3 = this.LLJI;
            if (c21685819tw3 != null) {
                c21685819tw3.LJIILLIIL(0, list.size() - 1);
            }
        }
        ((ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue()).LJIILJJIL(FragmentCoverCell.class);
        double dLJIIZILJ = ((double) ((((C497740JfY.LJIIZILJ() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2)) / 3)) * 1.3d;
        int size = list.size() / 3;
        if (list.size() % 3 == 0) {
            dLIZIZ = (((double) size) * dLJIIZILJ) + ((double) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * (size - 1)));
        } else {
            dLIZIZ = (((double) (size + 1)) * dLJIIZILJ) + ((double) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * size));
        }
        ((View) this.LLJ.getValue()).getLayoutParams().height = (int) dLIZIZ;
        ((ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue()).getState().LJIIJJI(list, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.db6, false, 4, null);
    }
}
