package com.ss.android.ugc.tiktok.im.contact.selector.impl.assem;

import X.AnonymousClass0208;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C1223620hwm;
import X.C1224280hxq;
import X.C1266020j3A;
import X.C127G;
import X.C13LE;
import X.C14K4;
import X.C1584506Ih;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C19EG;
import X.C20246014Ju;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS393S0100000_19;
import Y.ARunnableS119S0100000_19;
import Y.ATListenerS452S0100000_19;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContainerVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorSearchBarVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import wh6.AbS509S0200000_19;
import wh6.AbS700S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorSearchBarAssem extends UIContentAssem implements ViewTreeObserver.OnWindowFocusChangeListener, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public long LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C127G LLJJJ;
    public InterfaceC665370Q7z LLJJJIL;
    public C0QSJ LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectorSearchBarAssem.class, "searchBarVM", "getSearchBarVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorSearchBarVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SelectorSearchBarAssem.class, "selectorContainerVM", "getSelectorContainerVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorContainerVM;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SelectorSearchBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SelectorSearchBarVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 2613), AFwS257S0000000_19.get$arr$(516), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SelectorContainerVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 2614), AFwS257S0000000_19.get$arr$(517), null, true);
        this.LLJI = C1223620hwm.LIZLLL(this);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2611));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2615));
        this.LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2612));
        this.LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2610));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2609));
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

    public final SelectorSearchBarVM Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (SelectorSearchBarVM) assemVMLazy.getValue();
    }

    public final SelectorContainerVM Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (SelectorContainerVM) assemVMLazy.getValue();
    }

    public final void No() {
        if (!this.LLJJIJIIJIL) {
            this.LLJJIJIL = true;
            return;
        }
        if (!this.LLJILLL) {
            this.LLJILLL = true;
            Ho().setStateImmediate(AFwS257S0000000_19.get$arr$(678));
        }
        Lo();
    }

    public final EditText Xv() {
        return (EditText) this.LLJJI.getValue();
    }

    public final void Lo() {
        EditText editTextXv = Xv();
        if (editTextXv != null) {
            editTextXv.requestFocus();
            HandlerHook.viewPost(editTextXv, new ARunnableS119S0100000_19(editTextXv, 121));
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SelectorContainerVM.class, new AObjectS393S0100000_19(this, 10)}, defaultViewModelProviderFactory);
                    this.LLJJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        Window window;
        View decorView;
        super.onPause();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (window = c19egLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        C20246014Ju c20246014JuLIZ = C14K4.LIZ(decorView);
        boolean zLJIIIIZZ = c20246014JuLIZ != null ? c20246014JuLIZ.LJIIIIZZ(8) : false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPause onCall, whether showKeyboard when window hasFocus: searchEditText#hasFocus(");
        EditText editTextXv = Xv();
        sbLIZ.append(editTextXv != null ? Boolean.valueOf(editTextXv.hasFocus()) : null);
        sbLIZ.append(") && isKeyboardShowing(");
        sbLIZ.append(zLJIIIIZZ);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        EditText editTextXv2 = Xv();
        if (editTextXv2 != null && editTextXv2.hasFocus() && zLJIIIIZZ) {
            this.LLJILJILJ = true;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        EditText editTextXv;
        super.onResume();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume onCall: hasWindowFocus ");
        EditText editTextXv2 = Xv();
        sbLIZ.append(editTextXv2 != null ? Boolean.valueOf(editTextXv2.hasWindowFocus()) : null);
        sbLIZ.append(" !hasAutoShownKeyboard_: ");
        sbLIZ.append(!this.LLJILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!((C1224280hxq) this.LLJI.getValue()).LJII().LJIIZILJ().LIZIZ || (editTextXv = Xv()) == null || !editTextXv.hasWindowFocus() || this.LLJILLL) {
            return;
        }
        No();
        this.LLJILJILJ = false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1584506Ih.LIZIZ(LJJIJL());
        EditText editTextXv = Xv();
        if (editTextXv != null) {
            String string = ((C1224280hxq) this.LLJI.getValue()).LJII().LJIIZILJ().LIZJ;
            if (string == null) {
                Context context = editTextXv.getContext();
                if (context != null) {
                    string = context.getString(2131835237);
                } else {
                    string = null;
                }
            }
            editTextXv.setHint(string);
            editTextXv.addTextChangedListener(new C1266020j3A(this, 14));
            editTextXv.setOnTouchListener(new ATListenerS452S0100000_19(this, 5));
            editTextXv.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        }
        TuxIconView tuxIconView = (TuxIconView) this.LLJJIII.getValue();
        C786410Ut5.I7(new AbS509S0200000_19(this, tuxIconView, 5), tuxIconView);
        C786410Ut5.I7(new AbS700S0100000_19(this, 9), (View) this.LLJJIJI.getValue());
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0hxC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223910hxF) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 215), 4);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0hxD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223910hxF) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 217), 4);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0hxE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223910hxF) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), AnonymousClass0208.get$arr$(24), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ZKY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1223570hwh) obj).LL);
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 219), 4);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0hxG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223910hxF) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 211), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0hwg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223570hwh) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 213), 4);
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("window get focus, showKeyboard: !hasAutoShownKeyboard_(");
            sbLIZ.append(!this.LLJILLL);
            sbLIZ.append(") || showKeyboardWhenWindowFocus(");
            sbLIZ.append(this.LLJILJILJ);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
            if (((C1224280hxq) this.LLJI.getValue()).LJII().LJIIZILJ().LIZIZ) {
                if (!this.LLJILLL || this.LLJILJILJ) {
                    No();
                    this.LLJILJILJ = false;
                }
            }
        }
    }
}
