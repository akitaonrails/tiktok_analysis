package com.ss.android.ugc.aweme.ui.cell.publish;

import X.C01GW;
import X.C0S1B;
import X.C1220000hqw;
import X.C1388190mED;
import X.C13LE;
import X.C20673215v0;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C994030byT;
import X.InterfaceC1891350zJl;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.vm.publish.CollabEditPageContainerViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS61S0200000_24;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class CollabInviteSelectedCell extends PowerCell<C994030byT> {
    public final C736950SvV LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLILLJJLI.getValue();
        avatarComponentView.setClickable(false);
        new AwS603S0100000_24(this, 380).invoke(avatarComponentView.getConfig().LIZ);
        avatarComponentView.LJFF(avatarComponentView.getConfig());
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZ = R.raw.icon_x_mark_small;
        c419910GdJ.LJ = Integer.valueOf(R.attr.bx);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.itemView.getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1k);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        ((TuxIconView) this.LLILZ.getValue()).setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.itemView.getContext())));
        View view = (View) this.LLILZIL.getValue();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.bx);
        c384050F3z2.LIZJ = Float.valueOf(Float.MAX_VALUE);
        view.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
        ((View) this.LLILZ.getValue()).setClickable(false);
    }

    public CollabInviteSelectedCell() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(388);
        this.LL = new C736950SvV(C13LE.LIZ(CollabEditPageContainerViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(500), null, null, null);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1471));
        this.LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1472));
        this.LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1473));
        this.LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1474));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C994030byT c994030byT = (C994030byT) interfaceC1891350zJl;
        C0S1B.LIZ((AvatarComponentView) this.LLILLJJLI.getValue(), c994030byT.LL.getUid(), c994030byT.LL, this, false, null, 56);
        TextView textView = (TextView) this.LLILLL.getValue();
        String nickname = c994030byT.LL.getNickname();
        if (nickname.length() == 0) {
            nickname = c994030byT.LL.getUniqueId();
        }
        textView.setText(nickname);
        C786410Ut5.I7(new AkS61S0200000_24(this, c994030byT, 3), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZJ;
        Activity activityLIZ = C1388190mED.LIZ(viewGroup.getContext());
        if (activityLIZ == null || (viewLIZJ = C20673215v0.LIZJ(R.layout.agi, activityLIZ)) == null) {
            return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.agi, viewGroup, false);
        }
        return viewLIZJ;
    }
}
