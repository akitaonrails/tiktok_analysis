package com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1276004z0;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.viewmodel.LiveQuickPostViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS64S0200000_27;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class LivePostTagCell extends PowerCell<C1276004z0> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public TuxTextView LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LivePostTagCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/quickpost/viewmodel/LiveQuickPostViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dgm;
    }

    public LivePostTagCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveQuickPostViewModel.class);
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c19719912DlLIZ, 433);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(88);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 444), awS571S0100000_27, AFwS216S0000000_27.get$arr$(133), new AwS571S0100000_27((C03K6) this, 419), new AwS571S0100000_27((C03K6) this, 421), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 423), aFwS269S0000000_27, new AwS571S0100000_27((C03K6) this, 425), null, new AwS571S0100000_27((C03K6) this, 426));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS571S0100000_27 awS571S0100000_272 = new AwS571S0100000_27((C03K6) this, 420);
            AwS571S0100000_27 awS571S0100000_273 = new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 422);
            AwS571S0100000_27 awS571S0100000_274 = new AwS571S0100000_27(c19719912DlLIZ, 424);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS428S0200000_27((InterfaceC451590HnJ) obj, awS571S0100000_272, 21));
            AwS571S0100000_27 awS571S0100000_275 = new AwS571S0100000_27(c01gwLIZIZ, 427);
            AwS571S0100000_27 awS571S0100000_276 = new AwS571S0100000_27(c01gwLIZIZ, 428);
            AwS571S0100000_27 awS571S0100000_277 = new AwS571S0100000_27(c01gwLIZIZ, 429);
            AwS571S0100000_27 awS571S0100000_278 = new AwS571S0100000_27(c01gwLIZIZ, 430);
            AwS571S0100000_27 awS571S0100000_279 = new AwS571S0100000_27(c01gwLIZIZ, 431);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS571S0100000_274, awS571S0100000_27, new C452080Ho6(), awS571S0100000_275, awS571S0100000_276, awS571S0100000_273, aFwS269S0000000_27, awS571S0100000_277, awS571S0100000_278, awS571S0100000_279);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 432), awS571S0100000_27, AFwS216S0000000_27.get$arr$(131), new AwS571S0100000_27((C03K6) this, 434), new AwS571S0100000_27((C03K6) this, 435), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 436), aFwS269S0000000_27, new AwS571S0100000_27((C03K6) this, 437), null, new AwS571S0100000_27((C03K6) this, 438));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 439), awS571S0100000_27, AFwS216S0000000_27.get$arr$(132), new AwS571S0100000_27((C03K6) this, 440), new AwS571S0100000_27((C03K6) this, 441), new AwS571S0100000_27((C03K6) this, 442), aFwS269S0000000_27, null, null, new AwS571S0100000_27((C03K6) this, 443));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.zvd);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1276004z0 c1276004z0 = (C1276004z0) interfaceC1891350zJl;
        super.onBindItemView(c1276004z0);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('#');
            sbLIZ.append(c1276004z0.LL);
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C786410Ut5.I7(new AkS64S0200000_27(this, c1276004z0, 0), this.itemView);
    }
}
