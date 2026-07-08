package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font;

import X.C019F;
import X.C01A1;
import X.C01A2;
import X.C01A3;
import X.C01A4;
import X.C01D0;
import X.C01D1;
import X.C01DP;
import X.C01DW;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C2884019u;
import X.C295801Cq;
import X.C295901Cr;
import X.C296001Cs;
import X.C296101Ct;
import X.C296201Cu;
import X.C296301Cv;
import X.C296401Cw;
import X.C297101Dd;
import X.C419910GdJ;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.RichTextStyleEditViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardTextColorViewModel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.drawable.TuxIconDrawable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CustomizedBoardTextFontButtonLayoutAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C296201Cu(this));
    public final C01GW LLJ = C452501pT.LIZIZ(new C296101Ct(this));
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C1559260qg8 LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CustomizedBoardTextFontButtonLayoutAssem.class, "textColorViewModel", "getTextColorViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardTextColorViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CustomizedBoardTextFontButtonLayoutAssem.class, "richTextStyleEditViewModel", "getRichTextStyleEditViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/decorationtools/RichTextStyleEditViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CustomizedBoardTextFontButtonLayoutAssem.class, "boardTextDynamicStyleViewModel", "getBoardTextDynamicStyleViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/font/viewmodel/BoardTextDynamicStyleViewModel;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public CustomizedBoardTextFontButtonLayoutAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FullyCustomizedBoardTextColorViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C295801Cq(c19719912DlLIZ), new C296401Cw(), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(RichTextStyleEditViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C295901Cr(c19719912DlLIZ2), new C296301Cv(), null, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(BoardTextDynamicStyleViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01d1, c1637906bB, new C296001Cs(c19719912DlLIZ3), new C01D0(), null, true);
        this.LLJILJILJ = new C1559260qg8(new C723590SZx(this, C01DP.class, "FullCustomizedBoardHierarchyData"), checkSupervisorPrepared());
    }

    public final RichTextStyleEditViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (RichTextStyleEditViewModel) assemVMLazy.getValue();
    }

    public final FullyCustomizedBoardTextColorViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (FullyCustomizedBoardTextColorViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        super.onViewCreated(view);
        C500260Jjc.LLFFF(LJJIJL());
        LiveIconView liveIconView = (LiveIconView) this.LLIZLLLIL.getValue();
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new C01DW() { // from class: X.01Cp
                @Override // X.C01DW
                public final void LIZ(View view2) {
                    if (((C01DP) this.LLILLL.LLJILJILJ.getValue()).LIZ()) {
                        RichTextStyleEditViewModel richTextStyleEditViewModelHo = this.LLILLL.Ho();
                        richTextStyleEditViewModelHo.withState(new C2877019n(richTextStyleEditViewModelHo));
                        return;
                    }
                    FullyCustomizedBoardTextColorViewModel fullyCustomizedBoardTextColorViewModelJo = this.LLILLL.Jo();
                    if (!fullyCustomizedBoardTextColorViewModelJo.wQ2().LIZ()) {
                        return;
                    }
                    fullyCustomizedBoardTextColorViewModelJo.withState(new C296501Cx(fullyCustomizedBoardTextColorViewModelJo));
                    if (fullyCustomizedBoardTextColorViewModelJo.wQ2().LIZ()) {
                        fullyCustomizedBoardTextColorViewModelJo.withState(new C01D3(fullyCustomizedBoardTextColorViewModelJo));
                    }
                    fullyCustomizedBoardTextColorViewModelJo.withState(new C01DJ(fullyCustomizedBoardTextColorViewModelJo));
                }
            });
        }
        View view2 = (View) this.LLIZLLLIL.getValue();
        if (view2 != null) {
            view2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0GzI
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1 && action != 3) {
                            return false;
                        }
                        C433530GzH.LIZ(1.0f, 100L, view3);
                        return false;
                    }
                    C433530GzH.LIZ(1.2f, 100L, view3);
                    return false;
                }
            });
        }
        LiveIconView liveIconView2 = (LiveIconView) this.LLJ.getValue();
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new View.OnClickListener() { // from class: X.01Co
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    if (((C01DP) this.LL.LLJILJILJ.getValue()).LIZ()) {
                        RichTextStyleEditViewModel richTextStyleEditViewModelHo = this.LL.Ho();
                        richTextStyleEditViewModelHo.withState(new C012Y(richTextStyleEditViewModelHo));
                    } else {
                        this.LL.Jo().vQ2();
                    }
                }
            });
        }
        View view3 = (View) this.LLJ.getValue();
        if (view3 != null) {
            view3.setOnTouchListener(new View.OnTouchListener() { // from class: X.0GzI
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view32, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1 && action != 3) {
                            return false;
                        }
                        C433530GzH.LIZ(1.0f, 100L, view32);
                        return false;
                    }
                    C433530GzH.LIZ(1.2f, 100L, view32);
                    return false;
                }
            });
        }
        int i = 0;
        if (C497740JfY.LJJI(C497740JfY.LJIIZILJ()) <= 360.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(28.0f);
            LiveIconView[] liveIconViewArr = {this.LLIZLLLIL.getValue(), this.LLJ.getValue()};
            do {
                C297101Dd c297101Dd = liveIconViewArr[i];
                C500260Jjc.LJJZ(iLIZIZ, c297101Dd);
                C500260Jjc.LJLJLLL(iLIZIZ, c297101Dd);
                i++;
            } while (i < 2);
        }
        if (((C01DP) this.LLJILJILJ.getValue()).LIZ()) {
            AssemVMLazy assemVMLazy = this.LLJILJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217371BqR() { // from class: X.0JE8
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C469920Ibm) obj).LLILLL;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C469920Ibm) obj).LLILLL = (List) obj2;
                }
            }, null, new C2884019u(this), 6);
            C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.019r
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C2880019q) obj).LLILZ;
                }
            }, null, new C01A3(this), 6);
            C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.019Y
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C2880019q) obj).LLILZLL;
                }
            }, null, new C01A1(this), 6);
            return;
        }
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.01Cy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C01D5) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), new C01A4(this), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.01Cz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C01D5) obj).LLJ;
            }
        }, null, new C01A2(this), 6);
    }

    public final void Go(LiveIconView liveIconView, C419910GdJ c419910GdJ) {
        TuxIconDrawable tuxIconDrawableLIZ;
        Context context = getContext();
        if (context != null && liveIconView != null) {
            if (c419910GdJ != null) {
                tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            } else {
                tuxIconDrawableLIZ = null;
            }
            liveIconView.setIcon(tuxIconDrawableLIZ);
        }
    }
}
