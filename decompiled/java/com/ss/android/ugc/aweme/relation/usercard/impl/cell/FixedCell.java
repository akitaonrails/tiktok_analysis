package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C1262000iwg;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class FixedCell extends PowerCell<C1262000iwg> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C1262000iwg c1262000iwg = (C1262000iwg) interfaceC1891350zJl;
        super.onBindItemView(c1262000iwg);
        View view = this.itemView;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C786410Ut5.LJJJJI(viewGroup);
            View viewInvoke = c1262000iwg.LLILLJJLI.LLILLJJLI.invoke(viewGroup.getContext());
            ViewParent parent = viewInvoke.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                if (!Intrinsics.LJFF(viewGroup2, viewGroup)) {
                    C786410Ut5.LJJJLZIJ(viewInvoke, viewGroup2);
                    viewGroup.addView(viewInvoke);
                    return;
                }
                return;
            }
            viewGroup.addView(viewInvoke);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        return frameLayout;
    }
}
