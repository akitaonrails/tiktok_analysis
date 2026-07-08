package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C0137002d;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C19719912Dl;
import X.C21146717pB;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS155S0100000_21;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentCABannerCell extends PowerCell<C0137002d> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public TuxIconView LLILLJJLI;
    public TuxTextView LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentCABannerCell.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentListAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommentCABannerCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListAssemVM.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 328);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(107);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 313), awS565S0100000_21, AFwS209S0000000_21.get$arr$(176), new AwS565S0100000_21((C03K6) this, 314), new AwS565S0100000_21((C03K6) this, 316), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 318), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 320), null, new AwS565S0100000_21((C03K6) this, 321));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 315);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 317);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 319);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 25));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 322);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 323);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 324);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 325);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 326);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 327), awS565S0100000_21, AFwS209S0000000_21.get$arr$(177), new AwS565S0100000_21((C03K6) this, 329), new AwS565S0100000_21((C03K6) this, 330), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 331), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 332), null, new AwS565S0100000_21((C03K6) this, 333));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 334), awS565S0100000_21, AFwS209S0000000_21.get$arr$(178), new AwS565S0100000_21((C03K6) this, 335), new AwS565S0100000_21((C03K6) this, 336), new AwS565S0100000_21((C03K6) this, 337), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 338));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (TuxIconView) this.itemView.findViewById(R.id.br_);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.bs2);
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS155S0100000_21(this, 50));
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS155S0100000_21(this, 51));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.a2w, viewGroup, false);
    }
}
