package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.content;

import X.C019F;
import X.C01DP;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C0WZX;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1826200xcg;
import X.C1826220xci;
import X.C1826230xcj;
import X.C1826240xck;
import X.C1826250xcl;
import X.C1826260xcm;
import X.C1826270xcn;
import X.C1826290xcp;
import X.C1826300xcq;
import X.C1826310xcr;
import X.C1826320xcs;
import X.C1826330xct;
import X.C1826340xcu;
import X.C1826350xcv;
import X.C1826360xcw;
import X.C1826370xcx;
import X.C1834150xpV;
import X.C1836370xt5;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C758440Tp4;
import X.C786410Ut5;
import X.EnumC1826380xcy;
import X.InterfaceC1146704e9;
import X.InterfaceC1818210xPn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.text.Editable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsClickableBulletSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.CustomizedBoardScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditFontViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditPageViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardTextColorViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title.CustomizedBoardTitleDoneViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.LiveSecondaryBoardItemMaxInputSetting;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class CustomizedBoardTextEditContentDescriptionAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new C1826330xct(this));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new C1826320xcs(this));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new C1826300xcq(this));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new C1826310xcr(this));
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public final C1559260qg8 LLJJJJ;
    public boolean LLJJJJJIL;
    public final C1826200xcg LLJJJJLIIL;
    public volatile InterfaceC1818210xPn LLJJL;
    public InterfaceC665370Q7z LLJJLIIIJLLLLLLLZ;
    public C0QSJ LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CustomizedBoardTextEditContentDescriptionAssem.class, "textColorViewModel", "getTextColorViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardTextColorViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CustomizedBoardTextEditContentDescriptionAssem.class, "customizedBoardEditPageViewModel", "getCustomizedBoardEditPageViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardEditPageViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CustomizedBoardTextEditContentDescriptionAssem.class, "customizedBoardTitleDoneViewModel", "getCustomizedBoardTitleDoneViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/title/CustomizedBoardTitleDoneViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(CustomizedBoardTextEditContentDescriptionAssem.class, "fontViewModel", "getFontViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardEditFontViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(CustomizedBoardTextEditContentDescriptionAssem.class, "customizedBoardItemAbility", "getCustomizedBoardItemAbility()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/CustomizedBoardItemAbility;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public CustomizedBoardTextEditContentDescriptionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FullyCustomizedBoardTextColorViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C1826240xck(c19719912DlLIZ), new C1826340xcu(), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FullyCustomizedBoardEditPageViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C1826250xcl(c19719912DlLIZ2), new C1826350xcv(), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(CustomizedBoardTitleDoneViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new C1826260xcm(c19719912DlLIZ3), new C1826360xcw(), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(FullyCustomizedBoardEditFontViewModel.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new C1826270xcn(c19719912DlLIZ4), new C1826370xcx(), null, true);
        this.LLJJJJ = new C1559260qg8(new C723590SZx(this, C01DP.class, "FullCustomizedBoardHierarchyData"), checkSupervisorPrepared());
        this.LLJJJJLIIL = new C1826200xcg(this);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gxo;
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
        C0QSJ c0qsjLIZLLL = this.LLJL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJLIIIJLLLLLLLZ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{CustomizedBoardScope.class});
            this.LLJL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1818210xPn interfaceC1818210xPn = (InterfaceC1818210xPn) c0qsjLIZLLL.getAbility(InterfaceC1818210xPn.class);
        C687700QyG.LJ(interfaceC1818210xPn, InterfaceC1818210xPn.class);
        return interfaceC1818210xPn;
    }

    public final C1836370xt5 ip() {
        return (C1836370xt5) this.LLJJI.getValue();
    }

    public final FullyCustomizedBoardTextColorViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (FullyCustomizedBoardTextColorViewModel) assemVMLazy.getValue();
    }

    public final int lp() {
        return LiveSecondaryBoardItemMaxInputSetting.INSTANCE.getValue().wordLimit;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ip().removeTextChangedListener(this.LLJJJJLIIL);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        return C1834150xpV.LJII(context);
    }

    public final void mp(C1836370xt5 c1836370xt5) {
        if (LivePcsClickableBulletSetting.INSTANCE.getValue()) {
            ((View) this.LLJJIJI.getValue()).setBackgroundColor(C497740JfY.LIZLLL(R.attr.exm, getContext()));
        } else {
            c1836370xt5.LJIIIZ(kp().getState().LLILLJJLI, EnumC1826380xcy.EDIT_ONLY_ONE_TEMPLATE, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws Throwable {
        super.onViewCreated(view);
        C500260Jjc.LLFFF(LJJIJL());
        int length = 0;
        C1836370xt5.LJIIIIZZ(ip(), ((C01DP) this.LLJJJJ.getValue()).LIZ(), false, 10);
        ip().setInputType(131073);
        ip().setTextAlignment(1);
        ip().setGravity(8388659);
        ip().setFocusable(true);
        ip().setFocusableInTouchMode(true);
        ip().setMaxLines(LiveSecondaryBoardItemMaxInputSetting.INSTANCE.getValue().descLineLimit);
        ip().setHint(((C01DP) this.LLJJJJ.getValue()).LLILZLL);
        ip().setCursorVisible(true);
        ip().setHintTextColor(C20736316Cj.LIZIZ(R.attr.ezy, new ContextThemeWrapper(getContext(), R.style.z4)));
        ip().addTextChangedListener(this.LLJJJJLIIL);
        ip().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0xco
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                if (z) {
                    KeyBoardUtil.LIZLLL(C497740JfY.LJII(), this.LL.ip());
                } else {
                    KeyBoardUtil.LIZJ(C497740JfY.LJII(), this.LL.ip());
                }
            }
        });
        if (LivePcsClickableBulletSetting.INSTANCE.getValue()) {
            String str = C758440Tp4.LIZIZ;
            if (C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJJIIZ(str)))) {
                C786410Ut5.LLIL((TextView) this.LLJJIII.getValue(), 0);
                C786410Ut5.LJLLLLLL(0, (View) this.LLJJIJIIJIL.getValue());
                ((TextView) this.LLJJIII.getValue()).setText(str);
            } else {
                C786410Ut5.LLIL((TextView) this.LLJJIII.getValue(), 8);
                C786410Ut5.LJLLLLLL(8, (View) this.LLJJIJIIJIL.getValue());
            }
        }
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.01DB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C01D5) obj).LLILZIL;
            }
        }, null, new C1826290xcp(this), 6);
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xPY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1817990xPR) obj).LL;
            }
        }, null, new C1826220xci(this), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJJIL.getValue(), new C2217381BqS() { // from class: X.0O2W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0O2V) obj).LLILLJJLI;
            }
        }, null, new C1826230xcj(this), 6);
        ip().clearFocus();
        ip().requestFocus();
        C1836370xt5 c1836370xt5Ip = ip();
        Editable editableLLLIIIL = C2204961BRm.LLLIIIL(ip(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HJz8IX7dXItfrncbtCedtf/syrizfX9N/6hHZy2STvp1lnORDb4ILja6IN37lbKpNeWuB3bjgfxbqPiRIJOvbIjENO7mrRccif8lnXAJ6U=", null));
        if (editableLLLIIIL != null) {
            length = editableLLLIIIL.length();
        }
        c1836370xt5Ip.setSelection(length);
        KeyBoardUtil.LIZLLL(getContext(), ip());
    }
}
