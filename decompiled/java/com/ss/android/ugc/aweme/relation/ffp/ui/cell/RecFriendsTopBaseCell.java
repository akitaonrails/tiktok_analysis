package com.ss.android.ugc.aweme.relation.ffp.ui.cell;

import X.AbstractC1069740dwa;
import X.C197039127h;
import X.C296060Bj2;
import X.C418440Gaw;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import wh6.AbS506S0200000_16;

/* JADX INFO: loaded from: classes17.dex */
public abstract class RecFriendsTopBaseCell<T extends AbstractC1069740dwa> extends PowerCell<T> {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public C197039127h LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxIconView LLILZLL;
    public LinearLayout LLIZ;

    public abstract void R5(T t);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.c_m;
    }

    public final TuxTextView I5() {
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final TuxIconView L5() {
        TuxIconView tuxIconView = this.LL;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        return null;
    }

    public final TuxTextView N5() {
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (TuxIconView) this.itemView.findViewById(R.id.k55);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.y3j);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.f0k);
        C197039127h c197039127h = (C197039127h) this.itemView.findViewById(R.id.ep9);
        this.LLILLL = c197039127h;
        if (c197039127h == null) {
            c197039127h = null;
        }
        c197039127h.getLayoutParams().width = (int) (((double) (C497820Jfg.LIZIZ(c197039127h.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(136)))) * 0.5d);
        C197039127h c197039127h2 = this.LLILLL;
        if (c197039127h2 == null) {
            c197039127h2 = null;
        }
        C786410Ut5.LLLLLLJ(c197039127h2, 0);
        if (C296060Bj2.LIZIZ) {
            this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.fpg);
            this.LLILZLL = (TuxIconView) this.itemView.findViewById(R.id.tld);
            this.LLIZ = (LinearLayout) this.itemView.findViewById(R.id.eys);
            TuxTextView tuxTextView = this.LLILZIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            TuxIconView tuxIconView = this.LLILZLL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            LinearLayout linearLayout = this.LLIZ;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            C197039127h c197039127h3 = this.LLILLL;
            C786410Ut5.LLLLLLJ(c197039127h3 != null ? c197039127h3 : null, 8);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: P5 */
    public void onBindItemView(T t) {
        super.onBindItemView(t);
        C786410Ut5.I7(new AbS506S0200000_16((RecFriendsTopBaseCell) this, (AbstractC1069740dwa) t, 0), this.itemView);
    }
}
