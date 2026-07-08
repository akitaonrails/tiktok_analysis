package com.ss.android.ugc.aweme.tako.botpage.components.sug;

import X.C12NV;
import X.C12YH;
import X.C12YN;
import X.C1558520qew;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import Y.ACListenerS163S0100000_29;
import Y.ARunnableS11S1200000_6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes30.dex */
public final class TakoContainerSugItemCell extends PowerCell<C12NV> {
    public TuxTextView LL;
    public View LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        C12NV c12nv = (C12NV) interfaceC1891350zJl;
        super.onBindItemView(c12nv);
        String str = (String) ListProtector.get(c12nv.LLIZLLLIL.LLILLJJLI.sugList, c12nv.LLJ);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        TuxTextView tuxTextView2 = this.LL;
        if (tuxTextView2 != null) {
            HandlerHook.viewPost(tuxTextView2, new ARunnableS11S1200000_6(this, tuxTextView2, str, 1));
        }
        InterfaceC665370Q7z interfaceC665370Q7z = c12nv.LLJILJIL;
        TakoChatUIAbility takoChatUIAbility = null;
        if (interfaceC665370Q7z != null) {
            takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoChatUIAbility.class, null);
        }
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(c12nv, 180), view);
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            if (takoChatUIAbility != null && !takoChatUIAbility.Gx1()) {
                z = true;
            } else {
                z = false;
            }
            view2.setClickable(z);
        }
        View view3 = this.LLILLJJLI;
        if (view3 != null) {
            if (view3.isAttachedToWindow()) {
                c12nv.LLJIJIL.invoke(view3, c12nv);
            } else {
                view3.addOnAttachStateChangeListener(new C12YN(view3, c12nv, 2));
            }
        }
        View view4 = this.LLILLJJLI;
        if (view4 != null) {
            view4.setOnLongClickListener(new C12YH(c12nv, 3));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fkh, viewGroup, false);
        this.LLILLJJLI = viewTd;
        this.LL = (TuxTextView) viewTd.findViewById(R.id.xlj);
        View view = this.LLILLJJLI;
        if (view != null) {
            C427690Gpr.LJ(view, C418440Gaw.LIZIZ(8));
        }
        return viewTd;
    }
}
