package com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.second;

import X.C0HZQ;
import X.C1856140yOy;
import X.C427690Gpr;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS161S0100000_27;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSecondLevelQuestionnaireOptionItemCell extends PowerCell<C1856140yOy> {
    public View LL;
    public TuxTextView LLILLJJLI;
    public C0HZQ LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View viewFindViewById = this.itemView.findViewById(R.id.xbq);
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 75), viewFindViewById);
        C427690Gpr.LJ(viewFindViewById, 0.0f);
        this.LL = viewFindViewById;
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.xbs);
        this.LLILLL = (C0HZQ) this.itemView.findViewById(R.id.xbr);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1856140yOy c1856140yOy = (C1856140yOy) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c1856140yOy.LLILLL.text);
        }
        C0HZQ c0hzq = this.LLILLL;
        if (c0hzq != null) {
            c0hzq.setChecked(c1856140yOy.LLILZ);
            c0hzq.setInterceptToggleListener(new AwS571S0100000_27(c1856140yOy, 1415));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.fne, false, 4, null);
    }
}
