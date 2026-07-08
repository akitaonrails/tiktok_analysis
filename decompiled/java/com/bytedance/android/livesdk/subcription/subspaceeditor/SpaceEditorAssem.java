package com.bytedance.android.livesdk.subcription.subspaceeditor;

import X.C019F;
import X.C01GW;
import X.C0JCM;
import X.C0JCN;
import X.C0WZX;
import X.C1322110kVd;
import X.C1324610kZf;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1819620xS4;
import X.C19719912Dl;
import X.C19EG;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C521890KdP;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C766270U4b;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2262081DgM;
import Y.ARunnableS107S0100000_7;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import ttpobfuscated.e3;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SpaceEditorAssem extends UIContentAssem implements SubSpaceEditorAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public C0JCM LLJ;
    public EditText LLJI;
    public View LLJIJIL;
    public final C01GW LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SpaceEditorAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/subcription/subspaceeditor/SubSpaceEditorVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SpaceEditorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceEditorVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 99), AFwS237S0000000_7.get$arr$(44), null, true);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 98));
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

    public final void Ho() {
        Editable editableLLJILLL;
        EditText editText = this.LLJI;
        if (editText != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm1pV+sJ1qqoUA7llyuDeQA==", null))) != null && editableLLJILLL.length() + 1 > 140) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            C766270U4b.LJIIJJI(fragmentLJI != null ? fragmentLJI.getString(2131841268) : null);
            return;
        }
        EditText editText2 = this.LLJI;
        Integer numValueOf = editText2 != null ? Integer.valueOf(editText2.getSelectionStart()) : null;
        EditText editText3 = this.LLJI;
        Editable editableLLJILLL2 = editText3 != null ? C2204961BRm.LLJILLL(editText3, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm1pV+sJ1qqoUA7llyuDeQA==", null)) : null;
        if (numValueOf != null) {
            numValueOf.intValue();
            if (editableLLJILLL2 != null) {
                editableLLJILLL2.insert(numValueOf.intValue(), e3.g);
            }
            EditText editText4 = this.LLJI;
            if (editText4 != null) {
                editText4.setSelection(numValueOf.intValue() + 1);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.subcription.subspaceeditor.SubSpaceEditorAbility
    public final void od() {
        SubSpaceEditorVM subSpaceEditorVMGo = Go();
        EditText editText = this.LLJI;
        subSpaceEditorVMGo.xQ2(editText != null ? C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm1pV+sJ1qqoUA7llyuDeQA==", null)) : null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), SubSpaceEditorAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.android.livesdk.subcription.subspaceeditor.SubSpaceEditorAbility
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
            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm1pV+sJ1qqoUA7llyuDeQA==", null));
            if (editableLLJILLL != null) {
                length = editableLLJILLL.length();
            } else {
                length = 0;
            }
            editText2.setSelection(length);
        }
        C766270U4b.LIZLLL(2131841268);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws Throwable {
        Editable editableMq;
        View view2;
        C0JCM c0jcm;
        User user;
        List urls;
        ImageModel avatarThumb;
        List urls2;
        int length;
        super.onViewCreated(view);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        Boolean boolValueOf = null;
        if (c19egLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), this, SubSpaceEditorAbility.class, null, null);
        }
        EditText editText = (EditText) view.findViewById(R.id.grz);
        this.LLJI = editText;
        if (editText != null) {
            editText.addTextChangedListener(Go().LLILZLL);
        }
        C0JCN c0jcn = Go().LL;
        if (c0jcn != null) {
            editableMq = c0jcn.Mq();
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
                Editable editableLLJILLL = C2204961BRm.LLJILLL(editText3, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm1pV+sJ1qqoUA7llyuDeQA==", null));
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
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0JC3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JC4) obj).LLILZIL;
            }
        }, null, new AwS621S0100000_7(this, 4), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0JCQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JC4) obj).LLILLJJLI;
            }
        }, null, new AwS621S0100000_7(this, 5), 6);
        View viewFindViewById = view.findViewById(R.id.po_);
        this.LLJIJIL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS689S0100000_7(this, 6), viewFindViewById);
        }
        InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
        if ((currentUser instanceof User) && (user = (User) currentUser) != null) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(40.0f);
            ImageModel avatarMedium = user.getAvatarMedium();
            if (avatarMedium != null && (urls2 = avatarMedium.getUrls()) != null && !urls2.isEmpty()) {
                avatarThumb = user.getAvatarMedium();
            } else {
                ImageModel avatarThumb2 = user.getAvatarThumb();
                if (avatarThumb2 != null && (urls = avatarThumb2.getUrls()) != null && !urls.isEmpty()) {
                    avatarThumb = user.getAvatarThumb();
                }
                ((C1322110kVd) this.LLJILJIL.getValue()).setActualImageResource(R.drawable.el9);
            }
            if (avatarThumb != null) {
                C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(avatarThumb.getUrls());
                c1324610kZfLIZJ.LJI = iLIZIZ;
                c1324610kZfLIZJ.LJII = iLIZIZ;
                c1324610kZfLIZJ.LJIIL = new C521890KdP(this, 0);
                c1324610kZfLIZJ.LJJI((View) this.LLJILJIL.getValue());
            } else {
                ((C1322110kVd) this.LLJILJIL.getValue()).setActualImageResource(R.drawable.el9);
            }
        }
        if (this.LLJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0JCM.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                c0jcm = (C0JCM) interfaceC1555100qZQLIZIZ.getSource();
            } else {
                c0jcm = null;
            }
            this.LLJ = c0jcm;
        }
        C0JCM c0jcm2 = this.LLJ;
        if (c0jcm2 != null) {
            boolValueOf = Boolean.valueOf(c0jcm2.LLILLJJLI);
        }
        if (C500260Jjc.LJJJI(boolValueOf) && (view2 = this.LLJIJIL) != null) {
            HandlerHook.viewPost(view2, new ARunnableS107S0100000_7(this, 9));
        }
    }
}
