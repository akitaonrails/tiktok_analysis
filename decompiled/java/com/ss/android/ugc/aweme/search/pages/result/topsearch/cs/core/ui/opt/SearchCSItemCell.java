package com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.ui.opt;

import X.AbstractViewOnTouchListenerC446430Hez;
import X.C01GW;
import X.C0PUB;
import X.C0PUL;
import X.C0Q3E;
import X.C1308910kAL;
import X.C21415018rM;
import X.C418440Gaw;
import X.C444830HcP;
import X.C444840HcQ;
import X.C452501pT;
import X.C645860PUy;
import X.C653660PkS;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC446420Hey;
import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCSItemCell extends PowerCell<C0PUL> implements View.OnAttachStateChangeListener {
    public final C01GW LL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 762));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 763));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ey4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.itemView.addOnAttachStateChangeListener(this);
        View view = this.itemView;
        final Context context = view.getContext();
        AbstractViewOnTouchListenerC446430Hez abstractViewOnTouchListenerC446430Hez = new AbstractViewOnTouchListenerC446430Hez(context) { // from class: X.0PnS
            @Override // X.AbstractViewOnTouchListenerC446430Hez
            public final void LIZ(boolean z) {
                if (z) {
                    this.LLJIJIL.itemView.setBackgroundResource(R.drawable.d2u);
                } else {
                    this.LLJIJIL.itemView.setBackgroundResource(R.drawable.d2t);
                }
            }
        };
        abstractViewOnTouchListenerC446430Hez.LLIZ = new InterfaceC446420Hey() { // from class: X.0PV4
            @Override // X.InterfaceC446420Hey
            public final void LIZ() {
                ClickSearchWord clickSearchWord;
                C0PUL item = this.LIZ.getItem();
                if (item == null || (clickSearchWord = item.LL) == null) {
                    return;
                }
                C0PV3 c0pv3 = C0PV3.LIZ;
                View view2 = this.LIZ.itemView;
                Context context2 = view2.getContext();
                C0PUL item2 = this.LIZ.getItem();
                C653660PkS c653660PkS = item2 != null ? item2.LLILLJJLI : null;
                c0pv3.getClass();
                C0PV3.LIZIZ(clickSearchWord, view2, context2, c653660PkS);
            }
        };
        abstractViewOnTouchListenerC446430Hez.LLIZLLLIL = new ATListenerS444S0100000_10(this, 7);
        view.setOnTouchListener(abstractViewOnTouchListenerC446430Hez);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        int iIntValue;
        String str;
        C653660PkS c653660PkS;
        C0PUL c0pul = (C0PUL) interfaceC1891350zJl;
        C21415018rM c21415018rM = (C21415018rM) this.LLILLJJLI.getValue();
        C0PUL item = getItem();
        if (item != null && (c653660PkS = item.LLILLJJLI) != null) {
            i = c653660PkS.LJJJLL;
        } else {
            i = -1;
        }
        if (i > 0) {
            iIntValue = ((((Number) this.LL.getValue()).intValue() - ((i + 1) * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)))) / i) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else {
            iIntValue = ((((Number) this.LL.getValue()).intValue() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) / 2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        C444830HcP c444830HcP = new C444830HcP();
        ClickSearchWord clickSearchWord = c0pul.LL;
        if (clickSearchWord == null || (str = clickSearchWord.word) == null) {
            str = "";
        }
        c444830HcP.LJIILIIL(str);
        c444830HcP.LIZIZ.LJ = iIntValue;
        c444830HcP.LJIIIZ(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
        c444840HcQ.LJII = truncateAt;
        c444840HcQ.LJIIIZ = TextDirectionHeuristics.LOCALE;
        c444830HcP.LIZLLL = false;
        c444830HcP.LJII(52);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c21415018rM.getContext());
        if (numLIZJ != null) {
            c444830HcP.LJIILJJIL(numLIZJ.intValue());
        }
        c21415018rM.setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.0f, true, null, 29));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ClickSearchWord clickSearchWord;
        Word word;
        C653660PkS c653660PkS;
        String str;
        ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
        C0PUL item = getItem();
        if (item != null && (clickSearchWord = item.LL) != null && (word = clickSearchWord.wordRecord) != null) {
            C0PUL item2 = getItem();
            C0PUB c0pub = null;
            if (item2 != null) {
                c653660PkS = item2.LLILLJJLI;
            } else {
                c653660PkS = null;
            }
            C0PUL item3 = getItem();
            if (item3 != null) {
                str = item3.LLILLL;
            } else {
                str = null;
            }
            C0PUL item4 = getItem();
            if (item4 != null) {
                c0pub = item4.LLILZ;
            }
            C645860PUy.LIZJ(word, iSearchContextAbilityLJI, c653660PkS, str, c0pub);
        }
    }
}
