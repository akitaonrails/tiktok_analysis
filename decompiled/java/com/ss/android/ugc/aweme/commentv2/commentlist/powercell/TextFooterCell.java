package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1157120gDW;
import X.C1342590l2f;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS124S0200000_21;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TextFooterCell extends PowerCell<C1157120gDW> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TextFooterCell.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentListAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TextFooterCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListAssemVM.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 478);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(116);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 489), awS565S0100000_21, AFwS209S0000000_21.get$arr$(202), new AwS565S0100000_21((C03K6) this, 464), new AwS565S0100000_21((C03K6) this, 466), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 468), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 470), null, new AwS565S0100000_21((C03K6) this, 471));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 465);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 467);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 469);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 33));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 472);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 473);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 474);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 475);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 476);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 477), awS565S0100000_21, AFwS209S0000000_21.get$arr$(200), new AwS565S0100000_21((C03K6) this, 479), new AwS565S0100000_21((C03K6) this, 480), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 481), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 482), null, new AwS565S0100000_21((C03K6) this, 483));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 484), awS565S0100000_21, AFwS209S0000000_21.get$arr$(201), new AwS565S0100000_21((C03K6) this, 485), new AwS565S0100000_21((C03K6) this, 486), new AwS565S0100000_21((C03K6) this, 487), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 488));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TextView textView;
        C1157120gDW c1157120gDW = (C1157120gDW) interfaceC1891350zJl;
        View view = this.itemView;
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            AssemVMLazy assemVMLazy = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
            textView.setText(((CommentListAssemVM) assemVMLazy.getValue()).IQ2(this.itemView.getContext(), c1157120gDW.LL.LIZ));
        }
        View view2 = this.itemView;
        C786410Ut5.W5(view2, C1342590l2f.LIZ(view2.getLayoutParams(), c1157120gDW.LL.LIZIZ, view2));
        C786410Ut5.I7(new ACListenerS124S0200000_21(this, c1157120gDW, 81), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView, new ViewGroup.MarginLayoutParams(-1, -2));
        tuxTextView.setGravity(17);
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        return tuxTextView;
    }
}
