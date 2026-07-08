package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.assem;

import X.C019F;
import X.C01GW;
import X.C0JCO;
import X.C0JCP;
import X.C0JCX;
import X.C0WZX;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C15WP;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C417410GYh;
import X.C452501pT;
import X.C511410K3v;
import X.C511520K4g;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS107S0100000_7;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.model.PGCSubSpaceEditorAbility;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.viewmodel.SubSpaceEditorVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCSpaceEditorAssem extends UIContentAssem implements PGCSubSpaceEditorAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public C0JCP LLJ;
    public EditText LLJI;
    public View LLJIJIL;
    public final C01GW LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PGCSpaceEditorAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/foundation/editor/viewmodel/SubSpaceEditorVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PGCSpaceEditorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceEditorVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 430), AFwS237S0000000_7.get$arr$(192), null, true);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 429));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final SubSpaceEditorVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (SubSpaceEditorVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.model.PGCSubSpaceEditorAbility
    public final void od() {
        SubSpaceEditorVM subSpaceEditorVMGo = Go();
        EditText editText = this.LLJI;
        subSpaceEditorVMGo.xQ2(editText != null ? C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0OAqDFRqxwzyTj883OIPvjFpOJd3pSl8Mx0/+EWjPTnyyeuUfNSEiSM28YTpb/AZ/4L5yw==", null)) : null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), PGCSubSpaceEditorAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.model.PGCSubSpaceEditorAbility
    public final void Jc(CharSequence charSequence) throws Throwable {
        int length;
        if (charSequence == null) {
            return;
        }
        EditText editText = this.LLJI;
        if (editText != null) {
            editText.setText(charSequence);
        }
        EditText editText2 = this.LLJI;
        if (editText2 != null) {
            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0OAqDFRqxwzyTj883OIPvjFpOJd3pSl8Mx0/+EWjPTnyyeuUfNSEiSM28YTpb/AZ/4L5yw==", null));
            if (editableLLJILLL != null) {
                length = editableLLJILLL.length();
            } else {
                length = 0;
            }
            editText2.setSelection(length);
        }
        C0JCX.LIZ(2131839334);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws Throwable {
        Editable editableMq;
        User currentUser;
        View view2;
        int length;
        super.onViewCreated(view);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        C0JCP c0jcp = null;
        if (c19egLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), this, PGCSubSpaceEditorAbility.class, null, null);
        }
        EditText editText = (EditText) view.findViewById(R.id.grz);
        this.LLJI = editText;
        if (editText != null) {
            editText.addTextChangedListener(Go().LLJ);
        }
        C0JCO c0jco = Go().LL;
        if (c0jco != null) {
            editableMq = c0jco.Mq();
        } else {
            editableMq = null;
        }
        if (editableMq != null && editableMq.length() != 0) {
            EditText editText2 = this.LLJI;
            if (editText2 != null) {
                editText2.setText(editableMq);
            }
            EditText editText3 = this.LLJI;
            if (editText3 != null) {
                Editable editableLLJILLL = C2204961BRm.LLJILLL(editText3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0OAqDFRqxwzyTj883OIPvjFpOJd3pSl8Mx0/+EWjPTnyyeuUfNSEiSM28YTpb/AZ/4L5yw==", null));
                if (editableLLJILLL != null) {
                    length = editableLLJILLL.length();
                } else {
                    length = 0;
                }
                editText3.setSelection(length);
            }
        } else {
            Go().xQ2(null);
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0JC6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JC5) obj).LLILZIL;
            }
        }, null, new AwS621S0100000_7(this, 46), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0JCR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JC5) obj).LLILLJJLI;
            }
        }, null, new AwS621S0100000_7(this, 47), 6);
        this.LLJIJIL = view.findViewById(R.id.po_);
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            currentUser = iUserService.getCurrentUser();
        } else {
            currentUser = null;
        }
        com.bytedance.android.live.base.model.user.User userLJ = C15WP.LJ(currentUser);
        if (userLJ != null) {
            C511410K3v.LIZ((C417410GYh) this.LLJILJIL.getValue(), userLJ, (int) C511520K4g.LIZ(40.0f));
        }
        if (this.LLJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0JCP.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                c0jcp = (C0JCP) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLJ = c0jcp;
        }
        C0JCP c0jcp2 = this.LLJ;
        if (c0jcp2 != null && c0jcp2.LLILLJJLI && (view2 = this.LLJIJIL) != null) {
            HandlerHook.viewPost(view2, new ARunnableS107S0100000_7(this, 155));
        }
    }
}
