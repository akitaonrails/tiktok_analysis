package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title;

import X.C019F;
import X.C01DP;
import X.C01DT;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C16F5;
import X.C1818080xPa;
import X.C1818110xPd;
import X.C1818120xPe;
import X.C1818130xPf;
import X.C1818140xPg;
import X.C1818150xPh;
import X.C1818160xPi;
import X.C1818170xPj;
import X.C1818180xPk;
import X.C1818190xPl;
import X.C1818200xPm;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1818210xPn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.RichTextStyleEditViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.CustomizedBoardScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditPageViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardTextColorViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title.CustomizedBoardTitleDoneAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title.CustomizedBoardTitleDoneViewModel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class CustomizedBoardTitleDoneAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1818160xPi(this));
    public final C1559260qg8 LLJ = new C1559260qg8(new C723590SZx(this, C01DP.class, "FullCustomizedBoardHierarchyData"), checkSupervisorPrepared());
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public volatile InterfaceC1818210xPn LLJILLL;
    public InterfaceC665370Q7z LLJJ;
    public C0QSJ LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CustomizedBoardTitleDoneAssem.class, "customizedBoardItemAbility", "getCustomizedBoardItemAbility()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/CustomizedBoardItemAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CustomizedBoardTitleDoneAssem.class, "editPageViewModel", "getEditPageViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardEditPageViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CustomizedBoardTitleDoneAssem.class, "textColorViewModel", "getTextColorViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardTextColorViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(CustomizedBoardTitleDoneAssem.class, "titleDoneViewModel", "getTitleDoneViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/title/CustomizedBoardTitleDoneViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(CustomizedBoardTitleDoneAssem.class, "richTextStyleEditViewModel", "getRichTextStyleEditViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/decorationtools/RichTextStyleEditViewModel;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public CustomizedBoardTitleDoneAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FullyCustomizedBoardEditPageViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C1818110xPd(c19719912DlLIZ), new C1818170xPj(), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FullyCustomizedBoardTextColorViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C1818120xPe(c19719912DlLIZ2), new C1818180xPk(), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(CustomizedBoardTitleDoneViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new C1818130xPf(c19719912DlLIZ3), new C1818190xPl(), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(RichTextStyleEditViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new C1818140xPg(c19719912DlLIZ4), new C1818200xPm(), null, true);
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

    public final InterfaceC1818210xPn Go() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJJI;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{CustomizedBoardScope.class});
            this.LLJJI = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1818210xPn interfaceC1818210xPn = (InterfaceC1818210xPn) c0qsjLIZLLL.getAbility(InterfaceC1818210xPn.class);
        C687700QyG.LJ(interfaceC1818210xPn, InterfaceC1818210xPn.class);
        return interfaceC1818210xPn;
    }

    public final C01DP Ho() {
        return (C01DP) this.LLJ.getValue();
    }

    public final CustomizedBoardTitleDoneViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (CustomizedBoardTitleDoneViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.l8((C16F5) this.LLIZLLLIL.getValue(), new View.OnClickListener() { // from class: X.01D9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                boolean z;
                boolean z2;
                C01DP c01dpHo = this.LL.Ho();
                if (c01dpHo.LLIZ == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || c01dpHo.LLILLL == 8) {
                    if (this.LL.Ho().LLILLL == 8) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C01DX.LIZIZ("click", this.LL.Ho().LLILZ, this.LL.Ho().LLIZLLLIL, this.LL.Ho().LLJ, "save", z2);
                }
                if (this.LL.Ho().LLILLL == 8) {
                    CustomizedBoardTitleDoneViewModel customizedBoardTitleDoneViewModelJo = this.LL.Jo();
                    customizedBoardTitleDoneViewModelJo.withState(new C1817360xOQ(customizedBoardTitleDoneViewModelJo));
                } else {
                    if (this.LL.Ho().LIZ()) {
                        CustomizedBoardTitleDoneAssem customizedBoardTitleDoneAssem = this.LL;
                        AssemVMLazy assemVMLazy = customizedBoardTitleDoneAssem.LLJILJILJ;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CustomizedBoardTitleDoneAssem.LLJJIII;
                        customizedBoardTitleDoneAssem.withState(assemVMLazy.getValue(), new C229300uZ(this.LL));
                        return;
                    }
                    CustomizedBoardTitleDoneAssem customizedBoardTitleDoneAssem2 = this.LL;
                    AssemVMLazy assemVMLazy2 = customizedBoardTitleDoneAssem2.LLJIJIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = CustomizedBoardTitleDoneAssem.LLJJIII;
                    customizedBoardTitleDoneAssem2.withState(assemVMLazy2.getValue(), new C01D2(this.LL));
                }
            }
        });
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xPX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1817990xPR) obj).LLILZIL;
            }
        }, null, new C01DT(this), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0xPb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159360gH8) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new C1818150xPh(this), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0xPc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159360gH8) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new C1818080xPa(this), 4);
    }
}
