package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools;

import X.C019F;
import X.C01DP;
import X.C01GW;
import X.C050200Ge;
import X.C09R3;
import X.C0QSJ;
import X.C105700ad;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1838240xw6;
import X.C1838260xw8;
import X.C1838290xwB;
import X.C1838300xwC;
import X.C1838310xwD;
import X.C1838320xwE;
import X.C1838330xwF;
import X.C1838340xwG;
import X.C1838350xwH;
import X.C1838360xwI;
import X.C1838410xwN;
import X.C1838420xwO;
import X.C1838430xwP;
import X.C1838440xwQ;
import X.C1838450xwR;
import X.C1838520xwY;
import X.C19719912Dl;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C229100uX;
import X.C229200uY;
import X.C452501pT;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C995740c1E;
import X.C995750c1F;
import X.InterfaceC1146704e9;
import X.InterfaceC1818210xPn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.text.TextWatcher;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.edittool.color.BoardTextSelectColorStyleViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextSelectFontStyleViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.CustomizedBoardScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditPageViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.LiveFullyCustomizedBoardItemMaxInputSetting;
import com.bytedance.android.livesdk.model.RichTextStyle;
import com.bytedance.android.livesdk.model.SMBBoardColorPreset;
import com.bytedance.android.livesdk.model.SMBBoardFontStyle;
import com.bytedance.android.livesdk.model.StrokeStyle;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class DecorationTextEditContentAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new C1838360xwI(this));
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final C1559260qg8 LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final List<Pair<C1838520xwY, TextWatcher>> LLJJJIL;
    public volatile InterfaceC1818210xPn LLJJJJ;
    public InterfaceC665370Q7z LLJJJJJIL;
    public C0QSJ LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DecorationTextEditContentAssem.class, "textColorViewModel", "getTextColorViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/edittool/color/BoardTextSelectColorStyleViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(DecorationTextEditContentAssem.class, "customizedBoardEditPageViewModel", "getCustomizedBoardEditPageViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardEditPageViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(DecorationTextEditContentAssem.class, "richTextStyleEditViewModel", "getRichTextStyleEditViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/decorationtools/RichTextStyleEditViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(DecorationTextEditContentAssem.class, "boardTextSelectFontStyleViewModel", "getBoardTextSelectFontStyleViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/font/viewmodel/BoardTextSelectFontStyleViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(DecorationTextEditContentAssem.class, "customizedBoardItemAbility", "getCustomizedBoardItemAbility()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/CustomizedBoardItemAbility;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public DecorationTextEditContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BoardTextSelectColorStyleViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C1838320xwE(c19719912DlLIZ), new C1838410xwN(), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FullyCustomizedBoardEditPageViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C1838330xwF(c19719912DlLIZ2), new C1838420xwO(), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(RichTextStyleEditViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new C1838340xwG(c19719912DlLIZ3), new C1838430xwP(), null, true);
        this.LLJJIJIL = new C1559260qg8(new C723590SZx(this, C01DP.class, "FullCustomizedBoardHierarchyData"), checkSupervisorPrepared());
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(BoardTextSelectFontStyleViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new C1838350xwH(c19719912DlLIZ4), new C1838440xwQ(), null, true);
        this.LLJJJIL = new ArrayList();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gym;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CustomizedBoardScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CustomizedBoardScope.class);
        return arrayList;
    }

    public final InterfaceC1818210xPn hp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJJJJLIIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJJJIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJJJJIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{CustomizedBoardScope.class});
            this.LLJJJJLIIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1818210xPn interfaceC1818210xPn = (InterfaceC1818210xPn) c0qsjLIZLLL.getAbility(InterfaceC1818210xPn.class);
        C687700QyG.LJ(interfaceC1818210xPn, InterfaceC1818210xPn.class);
        return interfaceC1818210xPn;
    }

    public final C1838520xwY ip() {
        List<C1838520xwY> paragraphs;
        C1838450xwR c1838450xwR = (C1838450xwR) this.LLJJI.getValue();
        if (c1838450xwR == null || (paragraphs = c1838450xwR.getParagraphs()) == null) {
            return null;
        }
        return (C1838520xwY) C13LP.LJJJLZIJ(0, paragraphs);
    }

    public final RichTextStyleEditViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (RichTextStyleEditViewModel) assemVMLazy.getValue();
    }

    public final void mp() {
        String str;
        RichTextStyle richTextStyleLIZ;
        RichTextStyle richTextStyleLIZIZ;
        List<RichTextStyle> list;
        List<RichTextStyle> list2;
        RichTextStyle richTextStyleLIZ2;
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        SMBBoardColorPreset sMBBoardColorPreset = ((C995750c1F) assemVMLazy.getValue().getState()).LL.LIZ;
        SMBBoardFontStyle sMBBoardFontStyle = ((C995740c1E) this.LLJJJ.getValue().getState()).LLILZ.LIZ;
        RichTextStyleEditViewModel richTextStyleEditViewModelKp = kp();
        int i = richTextStyleEditViewModelKp.getState().LLILLL;
        C229200uY c229200uY = richTextStyleEditViewModelKp.getState().LLILLJJLI.LIZ;
        if (c229200uY == null || (richTextStyleLIZ2 = c229200uY.LIZ()) == null || (str = richTextStyleLIZ2.color) == null) {
            str = "#FFFFFFFF";
        }
        if (sMBBoardColorPreset == null || (list2 = sMBBoardColorPreset.styles) == null) {
            richTextStyleLIZ = C050200Ge.LIZ(i, str);
        } else {
            Iterator<RichTextStyle> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                RichTextStyle next = it2.next();
                if (next.textStyle == i) {
                    if (next == null || (richTextStyleLIZ = (RichTextStyle) C105700ad.LIZ(C105700ad.LIZIZ(next), RichTextStyle.class)) == null) {
                        break;
                    }
                }
            }
            richTextStyleLIZ = C050200Ge.LIZ(i, str);
        }
        if (sMBBoardFontStyle == null || (list = sMBBoardFontStyle.styles) == null) {
            richTextStyleLIZIZ = C050200Ge.LIZIZ(i);
        } else {
            Iterator<RichTextStyle> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                RichTextStyle next2 = it3.next();
                if (next2.textStyle == i) {
                    if (next2 == null || (richTextStyleLIZIZ = (RichTextStyle) C105700ad.LIZ(C105700ad.LIZIZ(next2), RichTextStyle.class)) == null) {
                        break;
                    }
                }
            }
            richTextStyleLIZIZ = C050200Ge.LIZIZ(i);
        }
        C050200Ge.LIZJ(richTextStyleLIZ, richTextStyleLIZIZ);
        richTextStyleEditViewModelKp.vQ2(richTextStyleLIZ, 24);
        String str2 = richTextStyleLIZ.fontFamily;
        if (str2.length() <= 0 && (sMBBoardFontStyle == null || (str2 = sMBBoardFontStyle.fontIdentifier) == null || str2.length() <= 0)) {
            str2 = null;
        }
        StrokeStyle strokeStyle = richTextStyleLIZ.stroke;
        String str3 = richTextStyleLIZ.color;
        if (!(true ^ Intrinsics.LJFF(str3, ""))) {
            str3 = null;
        }
        RichTextStyleEditViewModel.xQ2(richTextStyleEditViewModelKp, null, Integer.valueOf(i), str2, strokeStyle, str3, richTextStyleLIZ.colorBackground, richTextStyleLIZ.padding, true, Float.valueOf(richTextStyleLIZ.lineHeight), richTextStyleLIZ.inlineBackground, Float.valueOf(richTextStyleLIZ.lineSpacing), 1);
    }

    public final int lp() {
        C229100uX c229100uX;
        Integer numValueOf;
        C229200uY c229200uY = kp().getState().LLILLJJLI.LIZ;
        return (c229200uY == null || (c229100uX = (C229100uX) C13LP.LJJJLZIJ(0, c229200uY.LIZ)) == null || (numValueOf = Integer.valueOf((int) c229100uX.LIZJ)) == null || numValueOf.intValue() == 0) ? LiveFullyCustomizedBoardItemMaxInputSetting.INSTANCE.getValue().wordLimit : numValueOf.intValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        for (Pair<C1838520xwY, TextWatcher> pair : this.LLJJJIL) {
            pair.getFirst().removeTextChangedListener(pair.getSecond());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217371BqR() { // from class: X.0xwL
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C995750c1F) obj).LLILLJJLI;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C995750c1F) obj).LLILLJJLI = (C291001Au) obj2;
            }
        }, C736820SvI.LIZLLL(), new C1838300xwC(this), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLJJJ.getValue(), new C2217371BqR() { // from class: X.0xwM
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C995740c1E) obj).LLILZIL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C995740c1E) obj).LLILZIL = (C291001Au) obj2;
            }
        }, C736820SvI.LIZLLL(), new C1838310xwD(this), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0xPZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1817990xPR) obj).LLILLJJLI;
            }
        }, null, new C1838260xw8(this), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.019s
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2880019q) obj).LLILLJJLI;
            }
        }, null, new C1838240xw6(this), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0xwK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2880019q) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new C1838290xwB(this), 4);
    }
}
