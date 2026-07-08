package com.ss.android.ugc.aweme.relation.label.popup;

import X.C01GW;
import X.C0I6B;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427660Gpo;
import X.C438710HIf;
import X.C447550Hgn;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC714850S2h;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MutualRelationPopupUserCell extends PowerCell<C0I6B> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 536));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0I6B c0i6b = (C0I6B) interfaceC1891350zJl;
        super.onBindItemView(c0i6b);
        UrlModel avatarMedium = c0i6b.LL.getAvatarMedium();
        if (avatarMedium == null && (avatarMedium = c0i6b.LL.getAvatarThumb()) == null) {
            avatarMedium = new UrlModel();
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarMedium));
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LL.getValue());
        c1331670kl3LJIIIIZZ.LJIJJLI(R.drawable.bg9);
        c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        TextView textView = (TextView) this.itemView.findViewById(R.id.p9l);
        String nickname = c0i6b.LL.getNickname();
        String str = "";
        if (nickname == null) {
            nickname = "";
        }
        textView.setText(nickname);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.username_view);
        String username = c0i6b.LL.getUsername();
        if (username != null) {
            str = username;
        }
        textView2.setText(str);
        ((C427660Gpo) this.LL.getValue()).setSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
        C447550Hgn.LJFF(this.itemView.findViewById(R.id.vzi), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null);
        C426750GoL.LJIIL(this.itemView, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
        C426750GoL.LJIIL(this.itemView.findViewById(R.id.obu), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, null, null, 30);
        C447550Hgn.LJFF(this.itemView.findViewById(R.id.h52), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dru, viewGroup, false);
    }
}
