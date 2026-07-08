package com.ss.android.ugc.aweme.tako.botpage.components.sug;

import X.C12NU;
import X.C12YH;
import X.C12YN;
import X.C13LP;
import X.C1546210qL5;
import X.C1558520qew;
import X.C19ME;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427690Gpr;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import Y.ACListenerS163S0100000_29;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class TakoMixCardSugItemCell extends PowerCell<C12NU> {
    public TuxTextView LL;
    public View LLILLJJLI;
    public View LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        C12NU c12nu = (C12NU) interfaceC1891350zJl;
        super.onBindItemView(c12nu);
        List<String> list = c12nu.LLIZLLLIL.LLILLJJLI.sugList;
        TakoChatUIAbility takoChatUIAbility = null;
        if (list != null) {
            str = (String) C13LP.LJJJLZIJ(c12nu.LLJ, list);
        } else {
            str = null;
        }
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        boolean z = true;
        switch (c12nu.LLIZLLLIL.LLILLJJLI.sugShowType) {
            case 100:
                View view = this.LLILLJJLI;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                View view2 = this.LLILLJJLI;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams != null) {
                        C19ME c19me = (C19ME) layoutParams;
                        c19me.startToEnd = R.id.xlj;
                        C786410Ut5.W5(view2, c19me);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                }
                View view3 = this.LLILLL;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams.width = -2;
                        C1546210qL5.LIZ.getClass();
                        marginLayoutParams.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(32));
                        C786410Ut5.W5(view3, marginLayoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                TuxTextView tuxTextView2 = this.LL;
                if (tuxTextView2 != null) {
                    C1546210qL5.LIZ.getClass();
                    tuxTextView2.setMaxWidth(C814420VxA.LIZIZ(C1546210qL5.LIZ(222)) + C814420VxA.LIZIZ(C1546210qL5.LIZ(16)));
                }
                TuxTextView tuxTextView3 = this.LL;
                if (tuxTextView3 != null) {
                    C1546210qL5.LIZ.getClass();
                    tuxTextView3.setMinWidth(C814420VxA.LIZIZ(C1546210qL5.LIZ(50)) + C814420VxA.LIZIZ(C1546210qL5.LIZ(16)));
                }
                TuxTextView tuxTextView4 = this.LL;
                if (tuxTextView4 != null) {
                    tuxTextView4.setMaxLines(1);
                }
                break;
            case 101:
                View view4 = this.LLILLJJLI;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(0, view4);
                }
                View view5 = this.LLILLJJLI;
                if (view5 != null) {
                    ViewGroup.LayoutParams layoutParams3 = view5.getLayoutParams();
                    if (layoutParams3 != null) {
                        C19ME c19me2 = (C19ME) layoutParams3;
                        c19me2.startToEnd = -1;
                        C786410Ut5.W5(view5, c19me2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                }
                View view6 = this.LLILLL;
                if (view6 != null) {
                    ViewGroup.LayoutParams layoutParams4 = view6.getLayoutParams();
                    if (layoutParams4 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams2.width = -1;
                        marginLayoutParams2.height = -2;
                        C786410Ut5.W5(view6, marginLayoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                TuxTextView tuxTextView5 = this.LL;
                if (tuxTextView5 != null) {
                    ViewGroup.LayoutParams layoutParams5 = tuxTextView5.getLayoutParams();
                    if (layoutParams5 != null) {
                        C19ME c19me3 = (C19ME) layoutParams5;
                        ((ViewGroup.MarginLayoutParams) c19me3).width = 0;
                        c19me3.endToStart = R.id.jxe;
                        C1546210qL5.LIZ.getClass();
                        ((ViewGroup.MarginLayoutParams) c19me3).topMargin = C814420VxA.LIZIZ(C1546210qL5.LIZ(7));
                        ((ViewGroup.MarginLayoutParams) c19me3).bottomMargin = C814420VxA.LIZIZ(C1546210qL5.LIZ(7));
                        C786410Ut5.W5(tuxTextView5, c19me3);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                }
                TuxTextView tuxTextView6 = this.LL;
                if (tuxTextView6 != null) {
                    tuxTextView6.setMaxLines(2);
                }
                break;
            case 102:
                View view7 = this.LLILLJJLI;
                if (view7 != null) {
                    C786410Ut5.LJLLLLLL(8, view7);
                }
                View view8 = this.LLILLL;
                if (view8 != null) {
                    ViewGroup.LayoutParams layoutParams6 = view8.getLayoutParams();
                    if (layoutParams6 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams6;
                        marginLayoutParams3.width = -1;
                        C1546210qL5.LIZ.getClass();
                        marginLayoutParams3.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(48));
                        C786410Ut5.W5(view8, marginLayoutParams3);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                TuxTextView tuxTextView7 = this.LL;
                if (tuxTextView7 != null) {
                    C1546210qL5.LIZ.getClass();
                    C426750GoL.LJIIL(tuxTextView7, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(10))), 0, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(10))), 0, 16);
                }
                TuxTextView tuxTextView8 = this.LL;
                if (tuxTextView8 != null) {
                    ViewGroup.LayoutParams layoutParams7 = tuxTextView8.getLayoutParams();
                    if (layoutParams7 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams7;
                        C1546210qL5.LIZ.getClass();
                        marginLayoutParams4.setMarginEnd(C814420VxA.LIZIZ(C1546210qL5.LIZ(10)));
                        C786410Ut5.W5(tuxTextView8, marginLayoutParams4);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                }
                TuxTextView tuxTextView9 = this.LL;
                if (tuxTextView9 != null) {
                    tuxTextView9.setMaxLines(2);
                }
                break;
        }
        InterfaceC665370Q7z interfaceC665370Q7z = c12nu.LLJILJIL;
        if (interfaceC665370Q7z != null) {
            takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoChatUIAbility.class, null);
        }
        View view9 = this.LLILLL;
        if (view9 != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(c12nu, 181), view9);
        }
        View view10 = this.LLILLL;
        if (view10 != null) {
            if (takoChatUIAbility == null || takoChatUIAbility.Gx1()) {
                z = false;
            }
            view10.setClickable(z);
        }
        View view11 = this.LLILLL;
        if (view11 != null) {
            if (view11.isAttachedToWindow()) {
                c12nu.LLJIJIL.invoke(view11, c12nu);
            } else {
                view11.addOnAttachStateChangeListener(new C12YN(view11, c12nu, 3));
            }
        }
        View view12 = this.LLILLL;
        if (view12 != null) {
            view12.setOnLongClickListener(new C12YH(c12nu, 4));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fl5, viewGroup, false);
        this.LLILLL = viewTd;
        this.LL = (TuxTextView) viewTd.findViewById(R.id.xlj);
        this.LLILLJJLI = viewTd.findViewById(R.id.jxe);
        View view = this.LLILLL;
        if (view != null) {
            C427690Gpr.LJ(view, C418440Gaw.LIZIZ(8));
        }
        return viewTd;
    }
}
