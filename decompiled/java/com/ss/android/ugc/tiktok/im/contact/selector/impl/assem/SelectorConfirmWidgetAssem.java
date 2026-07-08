package com.ss.android.ugc.tiktok.im.contact.selector.impl.assem;

import X.AnonymousClass0208;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0H25;
import X.C0QSJ;
import X.C1223620hwm;
import X.C1223980hxM;
import X.C1224280hxq;
import X.C1224580hyK;
import X.C1224710hyX;
import X.C1224730hyZ;
import X.C127G;
import X.C1308910kAL;
import X.C13LE;
import X.C1584506Ih;
import X.C1637806bA;
import X.C1637906bB;
import X.C1954807lC;
import X.C197039127h;
import X.C19719912Dl;
import X.C19ME;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1224720hyY;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS393S0100000_19;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorConfirmWidgetVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContainerVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorConfirmWidgetAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C01GW LLIZLLLIL = C1223620hwm.LIZLLL(this);
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C127G LLJJJ;
    public InterfaceC665370Q7z LLJJJIL;
    public C0QSJ LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectorConfirmWidgetAssem.class, "selectorConfirmWidgetVM", "getSelectorConfirmWidgetVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorConfirmWidgetVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SelectorConfirmWidgetAssem.class, "selectorContainerVM", "getSelectorContainerVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorContainerVM;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SelectorConfirmWidgetAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SelectorConfirmWidgetVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 2582), AFwS257S0000000_19.get$arr$(502), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SelectorContainerVM.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 2583), AFwS257S0000000_19.get$arr$(503), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2578));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2580));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2573));
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2579));
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2581));
        this.LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2584));
        this.LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2575));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2574));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2577));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2576));
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ContactSelectorFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C0QSJ Go() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJJJ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ContactSelectorFragmentScope.class});
        this.LLJJJJ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final C197039127h Ho() {
        return (C197039127h) this.LLJILJIL.getValue();
    }

    public final SelectorConfirmWidgetVM Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (SelectorConfirmWidgetVM) assemVMLazy.getValue();
    }

    public final ConstraintLayout Lo() {
        return (ConstraintLayout) this.LLJJI.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SelectorContainerVM.class, new AObjectS393S0100000_19(this, 5)}, defaultViewModelProviderFactory);
                    this.LLJJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C0H25 c0h25 = (C0H25) this.LLJJIJIIJIL.getValue();
        if (c0h25 != null) {
            c0h25.onPause();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C0H25 c0h25 = (C0H25) this.LLJJIJIIJIL.getValue();
        if (c0h25 != null) {
            c0h25.onResume();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        int i;
        Integer numLIZJ;
        super.onViewCreated(view);
        C0H25 c0h25 = (C0H25) this.LLJJIJIIJIL.getValue();
        if (c0h25 != null) {
            c0h25.LJJIIJ((C1223980hxM) this.LLJJIJIL.getValue());
        }
        Integer num = ((C1224280hxq) this.LLIZLLLIL.getValue()).LJIIIZ().LJIIJ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = R.attr.zm;
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(iIntValue, context)) != null) {
            LJJIJL().setBackgroundColor(numLIZJ.intValue());
        }
        View view2 = (View) this.LLJJ.getValue();
        if (((C1224580hyK) this.LLJJIJI.getValue()).LJFF()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view2);
        EnumC1224720hyY enumC1224720hyYLJ = ((C1224280hxq) this.LLIZLLLIL.getValue()).LIZIZ().LJIIL().LJ();
        C1224580hyK c1224580hyKLJIIL = ((C1224280hxq) Jo().LL.getValue()).LIZIZ().LJIIL();
        EnumC1224720hyY enumC1224720hyYLJ2 = c1224580hyKLJIIL.LJ();
        int i2 = C1224730hyZ.LIZ[enumC1224720hyYLJ2.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    throw new C1954807lC();
                }
                if (!c1224580hyKLJIIL.LIZJ().LIZLLL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("the confirm widget variant is ");
                    sbLIZ.append(enumC1224720hyYLJ2);
                    sbLIZ.append(", this variant only support show both button, but you set the secondary button gone, check your defaultSecondButtonState");
                    RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                    if (C1223620hwm.LJFF()) {
                        throw runtimeException;
                    }
                }
                if (!a0.LJJJIL(c1224580hyKLJIIL.LIZ())) {
                    SelectorConfirmWidgetVM.wQ2(enumC1224720hyYLJ2);
                }
            } else {
                if (c1224580hyKLJIIL.LIZJ().LIZLLL) {
                    SelectorConfirmWidgetVM.xQ2(enumC1224720hyYLJ2);
                }
                if (a0.LJJJIL(c1224580hyKLJIIL.LIZ())) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("the confirm widget variant is ");
                    sbLIZ2.append(enumC1224720hyYLJ2);
                    sbLIZ2.append(", this variant need show hint on the widget, check your defaultButtonHint");
                    RuntimeException runtimeException2 = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
                    if (C1223620hwm.LJFF()) {
                        throw runtimeException2;
                    }
                }
            }
        } else {
            if (c1224580hyKLJIIL.LIZJ().LIZLLL) {
                SelectorConfirmWidgetVM.xQ2(enumC1224720hyYLJ2);
            }
            if (!a0.LJJJIL(c1224580hyKLJIIL.LIZ())) {
                SelectorConfirmWidgetVM.wQ2(enumC1224720hyYLJ2);
            }
        }
        int i3 = C1224710hyX.LIZ[enumC1224720hyYLJ.ordinal()];
        if (i3 != 1) {
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        Lo().setPadding(Lo().getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), Lo().getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                        C1584506Ih.LIZIZ((View) this.LLJILJILJ.getValue());
                        C786410Ut5.LJLLLLLL(8, Ho());
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    Lo().setPadding(Lo().getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), Lo().getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    ViewGroup.LayoutParams layoutParams = Ho().getLayoutParams();
                    if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, 0);
                    }
                    C786410Ut5.J6(Ho(), marginLayoutParams);
                    Ho().setButtonVariant(-1);
                    Ho().setButtonSize(1);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, Lo().getContext());
                    if (numLIZJ2 != null) {
                        Ho().setBackgroundColor(numLIZJ2.intValue());
                    }
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, Lo().getContext());
                    if (numLIZJ3 != null) {
                        Ho().setTextColor(numLIZJ3.intValue());
                    }
                    C786410Ut5.LJLLLLLL(0, Ho());
                }
            } else {
                Lo().setPadding(Lo().getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), Lo().getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                Ho().setButtonVariant(1);
                ViewGroup.LayoutParams layoutParams2 = Ho().getLayoutParams();
                if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 0);
                }
                C786410Ut5.J6(Ho(), marginLayoutParams);
                Ho().setButtonSize(3);
                C786410Ut5.LJLLLLLL(0, Ho());
            }
        } else {
            Lo().setPadding(Lo().getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), Lo().getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            C786410Ut5.LJLLLLLL(8, Ho());
        }
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ZKX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1223570hwh) obj).LL);
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 207), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0hxV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1224060hxU) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 209), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0hxW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1224060hxU) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AnonymousClass0208.get$arr$(23), 4);
    }
}
