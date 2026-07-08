package com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.second;

import X.C1308910kAL;
import X.C1856130yOx;
import X.C21397818oa;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC21397618oY;
import Y.ATListenerS459S0100000_27;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.second.TakoSecondLevelQuestionnaireInputItemCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSecondLevelQuestionnaireInputItemCell extends PowerCell<C1856130yOx> {
    public C21397818oa LL;
    public View LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;

    public final void I5() {
        Context context = this.itemView.getContext();
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
            tuxTextView.setTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        }
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView != null) {
            C786410Ut5.LJLLLLLL(4, tuxIconView);
        }
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 != null) {
            C786410Ut5.LJLLLLLL(4, tuxTextView2);
        }
        C21397818oa c21397818oa = this.LL;
        if (c21397818oa != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c21397818oa.setBackground(c384050F3z.LIZ(context));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.xbx);
        if (linearLayout != null) {
            C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        }
        C21397818oa c21397818oa = (C21397818oa) this.itemView.findViewById(R.id.xbt);
        c21397818oa.setMaxLength(200);
        c21397818oa.setCallbacks(new InterfaceC21397618oY() { // from class: X.0yP3
            @Override // X.InterfaceC21397618oY
            public final void LIZ(int i, CharSequence charSequence) {
                Function1<String, Unit> function1;
                TuxTextView tuxTextView = this.LIZ.LLILZIL;
                if (tuxTextView != null) {
                    tuxTextView.setText(String.valueOf(i));
                }
                this.LIZ.I5();
                C1856130yOx item = this.LIZ.getItem();
                if (item != null && (function1 = item.LLILZ) != null) {
                    function1.invoke(charSequence.toString());
                }
            }

            @Override // X.InterfaceC21397618oY
            public final void LIZIZ(int i, CharSequence charSequence) {
                int iIntValue;
                TuxTextView tuxTextView = this.LIZ.LLILZIL;
                if (tuxTextView != null) {
                    tuxTextView.setText(String.valueOf(i));
                }
                if (i <= 200) {
                    this.LIZ.I5();
                    return;
                }
                TakoSecondLevelQuestionnaireInputItemCell takoSecondLevelQuestionnaireInputItemCell = this.LIZ;
                Context context = takoSecondLevelQuestionnaireInputItemCell.itemView.getContext();
                TuxTextView tuxTextView2 = takoSecondLevelQuestionnaireInputItemCell.LLILZIL;
                if (tuxTextView2 != null) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1l, context);
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    tuxTextView2.setTextColor(iIntValue);
                }
                TuxIconView tuxIconView = takoSecondLevelQuestionnaireInputItemCell.LLILLL;
                if (tuxIconView != null) {
                    C0DSB.LIZJ(tuxIconView);
                }
                TuxTextView tuxTextView3 = takoSecondLevelQuestionnaireInputItemCell.LLILZ;
                if (tuxTextView3 != null) {
                    C0DSB.LIZJ(tuxTextView3);
                }
                C21397818oa c21397818oa2 = takoSecondLevelQuestionnaireInputItemCell.LL;
                if (c21397818oa2 == null) {
                    return;
                }
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                c384050F3z.LJFF = Integer.valueOf(R.attr.zs);
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                c21397818oa2.setBackground(c384050F3z.LIZ(context));
            }
        });
        c21397818oa.setOnTouchListener(new ATListenerS459S0100000_27(this, 2));
        this.LL = c21397818oa;
        this.LLILLJJLI = this.itemView.findViewById(R.id.xbu);
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.xbv);
        C786410Ut5.LJLLLLLL(4, tuxIconView);
        this.LLILLL = tuxIconView;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.xbw);
        C786410Ut5.LJLLLLLL(4, tuxTextView);
        this.LLILZ = tuxTextView;
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.xbz);
        ((TextView) this.itemView.findViewById(R.id.xby)).setText("/200");
        I5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1856130yOx c1856130yOx = (C1856130yOx) interfaceC1891350zJl;
        super.onBindItemView(c1856130yOx);
        C21397818oa c21397818oa = this.LL;
        if (c21397818oa != null) {
            c21397818oa.setHint(c1856130yOx.LLILLL);
        }
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setText(c1856130yOx.LLILLJJLI);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.LJLLJ(viewGroup.getContext(), R.layout.fnd, null);
    }
}
