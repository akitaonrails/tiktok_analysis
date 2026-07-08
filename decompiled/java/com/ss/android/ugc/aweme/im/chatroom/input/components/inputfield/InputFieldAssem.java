package com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield;

import X.C019F;
import X.C09R3;
import X.C0HVA;
import X.C0I7D;
import X.C0WZX;
import X.C13LE;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1640006bW;
import X.C19719912Dl;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C432670Gxt;
import X.C458900Hz6;
import X.C458910Hz7;
import X.C458920Hz8;
import X.C458930Hz9;
import X.C458940HzA;
import X.C459000HzG;
import X.C462900IDg;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC458980HzE;
import X.InterfaceC458990HzF;
import Y.ACListenerS141S0100000_6;
import Y.ATListenerS440S0100000_6;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.protocol.InterceptKeyboardCloseProtocol;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class InputFieldAssem extends UISlotAssem implements IMEditTextAbility, C0HVA {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public C0I7D LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InputFieldAssem.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(InputFieldAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(InputFieldAssem.class, "inputPanelSizeViewModel", "getInputPanelSizeViewModel()Lcom/ss/android/ugc/aweme/im/viewmodel/InputPanelSizeViewModel;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public InputFieldAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputFieldVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 136), AFwS236S0000000_6.get$arr$(86), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 137), AFwS236S0000000_6.get$arr$(87), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(InputPanelSizeViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ3, 138), AFwS236S0000000_6.get$arr$(88), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cjy;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0HVA
    public final String Bc() {
        return C432670Gxt.LIZ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IMEditTextAbility.class, null, this);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IMEditTextAbility
    public final void rv() {
        try {
            EditText editText = getEditText();
            if (editText != null) {
                editText.setText("");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IMEditTextAbility
    public final EditText getEditText() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IMEditTextAbility
    public final void J5(CharSequence charSequence) throws Throwable {
        C0I7D c0i7d;
        if (!a0.LJJJIL(charSequence) && (c0i7d = this.LLJJIJIIJIL) != null) {
            int selectionStart = c0i7d.getSelectionStart();
            Editable editableLLJILLL = C2204961BRm.LLJILLL(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLZzG3SZ8ENR3tcVnhlZmxqPDsdbvrweE1/vCmCyGYlkunUQaAFRfI39L47LcZgGK6KVCyVp8tA==", null));
            if (editableLLJILLL != null) {
                editableLLJILLL.insert(selectionStart, charSequence);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IMEditTextAbility
    public final void dispatchKeyEvent(KeyEvent keyEvent) {
        C0I7D c0i7d = this.LLJJIJIIJIL;
        if (c0i7d != null) {
            c0i7d.dispatchKeyEvent(keyEvent);
        }
    }

    public final void hp(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            C0I7D c0i7d = this.LLJJIJIIJIL;
            if (c0i7d != null) {
                c0i7d.setHint("");
            }
            C0I7D c0i7d2 = this.LLJJIJIIJIL;
            if (c0i7d2 != null) {
                c0i7d2.setMaxLines(((C1640006bW) C459000HzG.LIZIZ(this).getValue()).LIZLLL);
            }
            C0I7D c0i7d3 = this.LLJJIJIIJIL;
            if (c0i7d3 != null) {
                c0i7d3.setEllipsize(null);
            }
        } else {
            C0I7D c0i7d4 = this.LLJJIJIIJIL;
            if (c0i7d4 != null) {
                c0i7d4.setHint(((C1640006bW) C459000HzG.LIZIZ(this).getValue()).LIZJ);
            }
            C0I7D c0i7d5 = this.LLJJIJIIJIL;
            if (c0i7d5 != null) {
                c0i7d5.setMaxLines(1);
            }
            C0I7D c0i7d6 = this.LLJJIJIIJIL;
            if (c0i7d6 != null) {
                c0i7d6.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        C2252321DDq c2252321DDq = ((InputFieldVM) assemVMLazy.getValue()).LL;
        c2252321DDq.setValue(C1640006bW.LIZ((C1640006bW) c2252321DDq.getValue(), false, String.valueOf(charSequence), null, 0, 13));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws Throwable {
        C0I7D c0i7d;
        Editable editableLLJILLL;
        InterfaceC458980HzE interfaceC458980HzE;
        super.onViewCreated(view);
        if (view instanceof C0I7D) {
            c0i7d = (C0I7D) view;
        } else {
            c0i7d = null;
        }
        if (c0i7d != null) {
            Function2 function2LIZJ = C459000HzG.LIZJ(this);
            if (function2LIZJ != null) {
                function2LIZJ.invoke(this, c0i7d);
            }
            AssemVMLazy assemVMLazy = this.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
            ((InputFieldVM) assemVMLazy.getValue()).LLILLL = c0i7d;
            c0i7d.setTuxFont(101);
            c0i7d.setFilters(new InputFilter[]{new C458940HzA(c0i7d, 6000, new AwS550S0100000_6(c0i7d, 135))});
            c0i7d.setGravity(16);
            c0i7d.setElegantTextHeight(false);
            if (Build.VERSION.SDK_INT >= 35) {
                c0i7d.setLocalePreferredLineHeightForMinimumUsed(false);
            }
            c0i7d.getHint();
        } else {
            c0i7d = null;
        }
        this.LLJJIJIIJIL = c0i7d;
        final List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), InterceptKeyboardCloseProtocol.class, false);
        if (listLIZIZ != null) {
            KeyEvent.Callback callback = this.LLJJIJIIJIL;
            if ((callback instanceof InterfaceC458980HzE) && (interfaceC458980HzE = (InterfaceC458980HzE) callback) != null) {
                interfaceC458980HzE.setKeyImeChangeListener(new InterfaceC458990HzF() { // from class: X.0HzD
                    @Override // X.InterfaceC458990HzF
                    public final boolean of(int i, KeyEvent keyEvent) {
                        Iterator<InterceptKeyboardCloseProtocol> it2 = listLIZIZ.iterator();
                        boolean z = false;
                        while (it2.hasNext()) {
                            if (it2.next().of(i, keyEvent)) {
                                z = true;
                            }
                        }
                        return z;
                    }
                });
            }
        }
        C0I7D c0i7d2 = this.LLJJIJIIJIL;
        if (c0i7d2 != null) {
            C786410Ut5.N7(c0i7d2, new ACListenerS141S0100000_6(this, 28));
        }
        C0I7D c0i7d3 = this.LLJJIJIIJIL;
        if (c0i7d3 != null) {
            c0i7d3.setOnTouchListener(new ATListenerS440S0100000_6(this, 0));
        }
        C0I7D c0i7d4 = this.LLJJIJIIJIL;
        if (c0i7d4 != null) {
            editableLLJILLL = C2204961BRm.LLJILLL(c0i7d4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLZzG3SZ8ENR3tcVnhlZmxqPDsdbvrweE1/vCmCyGYlkunUQaAFRfAEpa/oDhZhWa6LRYwF4=", null));
        } else {
            editableLLJILLL = null;
        }
        hp(editableLLJILLL);
        C0I7D c0i7d5 = this.LLJJIJIIJIL;
        if (c0i7d5 != null) {
            c0i7d5.addTextChangedListener(new C462900IDg(this, 2));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C458900Hz6(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C458910Hz7(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C458920Hz8(this, view, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C458930Hz9(this, null), 3);
    }
}
