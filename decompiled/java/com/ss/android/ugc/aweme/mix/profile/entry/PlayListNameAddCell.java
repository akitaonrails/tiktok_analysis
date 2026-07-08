package com.ss.android.ugc.aweme.mix.profile.entry;

import X.C1168750gWH;
import X.C197039127h;
import X.C2537109wv;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayListNameAddCell extends PowerCell<C1168750gWH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C197039127h c197039127h;
        View view = this.itemView;
        if ((view instanceof C197039127h) && (c197039127h = (C197039127h) view) != null) {
            c197039127h.setIconTintColorRes(R.attr.a1h);
            c197039127h.setButtonVariant(1);
            if (C2537109wv.LJIIIZ()) {
                ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                c197039127h.setButtonSize(1);
                c197039127h.setButtonVariant(1);
                c197039127h.LJJJJL(new AwS580S0100000_1(c197039127h, 526));
            }
            C786410Ut5.I7(new ACListenerS146S0100000_11(c197039127h, 51), this.itemView);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eeq, viewGroup, false);
    }
}
