package com.ss.android.ugc.profile.business.ur.editprofile.pronouns.powerlist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C1909950znl;
import X.C19719912Dl;
import X.C1EDI;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.business.ur.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PronounCell extends PowerCell<C1909950znl> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public TuxTextView LL;
    public final AssemVMLazy LLILLJJLI;
    public Context LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PronounCell.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/editprofile/pronouns/viewmodel/ProfileEditPronounsSearchAndDisplayViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PronounCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileEditPronounsSearchAndDisplayViewModel.class);
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(c19719912DlLIZ, 605);
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(234);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS572S0100000_28(c19719912DlLIZ, 616), awS572S0100000_28, AFwS217S0000000_28.get$arr$(420), new AwS572S0100000_28((C03K6) this, 591), new AwS572S0100000_28((C03K6) this, 593), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 595), aFwS271S0000000_28, new AwS572S0100000_28((C03K6) this, 597), null, new AwS572S0100000_28((C03K6) this, 598));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS572S0100000_28 awS572S0100000_282 = new AwS572S0100000_28((C03K6) this, 592);
            AwS572S0100000_28 awS572S0100000_283 = new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 594);
            AwS572S0100000_28 awS572S0100000_284 = new AwS572S0100000_28(c19719912DlLIZ, 596);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS429S0200000_28((InterfaceC451590HnJ) obj, awS572S0100000_282, 62));
            AwS572S0100000_28 awS572S0100000_285 = new AwS572S0100000_28(c01gwLIZIZ, 599);
            AwS572S0100000_28 awS572S0100000_286 = new AwS572S0100000_28(c01gwLIZIZ, 600);
            AwS572S0100000_28 awS572S0100000_287 = new AwS572S0100000_28(c01gwLIZIZ, 601);
            AwS572S0100000_28 awS572S0100000_288 = new AwS572S0100000_28(c01gwLIZIZ, 602);
            AwS572S0100000_28 awS572S0100000_289 = new AwS572S0100000_28(c01gwLIZIZ, 603);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS572S0100000_284, awS572S0100000_28, new C452080Ho6(), awS572S0100000_285, awS572S0100000_286, awS572S0100000_283, aFwS271S0000000_28, awS572S0100000_287, awS572S0100000_288, awS572S0100000_289);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS572S0100000_28(c19719912DlLIZ, 604), awS572S0100000_28, AFwS217S0000000_28.get$arr$(421), new AwS572S0100000_28((C03K6) this, 606), new AwS572S0100000_28((C03K6) this, 607), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 608), aFwS271S0000000_28, new AwS572S0100000_28((C03K6) this, 609), null, new AwS572S0100000_28((C03K6) this, 610));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS572S0100000_28(c19719912DlLIZ, 611), awS572S0100000_28, AFwS217S0000000_28.get$arr$(422), new AwS572S0100000_28((C03K6) this, 612), new AwS572S0100000_28((C03K6) this, 613), new AwS572S0100000_28((C03K6) this, 614), aFwS271S0000000_28, null, null, new AwS572S0100000_28((C03K6) this, 615));
        }
        this.LLILLJJLI = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 79), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1909950znl c1909950znl = (C1909950znl) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(c1909950znl.LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        int i;
        this.LLILLL = viewGroup.getContext();
        if (C1EDI.LJ()) {
            i = R.layout.ei7;
        } else {
            i = R.layout.ei6;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
        this.LL = (TuxTextView) viewTd.findViewById(R.id.sda);
        return viewTd;
    }
}
