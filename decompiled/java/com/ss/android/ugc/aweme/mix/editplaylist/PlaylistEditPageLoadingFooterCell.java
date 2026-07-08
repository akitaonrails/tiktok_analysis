package com.ss.android.ugc.aweme.mix.editplaylist;

import X.AbstractC20607715kR;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1390410mHn;
import X.C13LE;
import X.C19719912Dl;
import X.C20605115k1;
import X.C20607815kS;
import X.C20607915kT;
import X.C20608115kV;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PlaylistEditPageLoadingFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public static final int LLILLL;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PlaylistEditPageLoadingFooterCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/editplaylist/EditPlaylistViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
    }

    public PlaylistEditPageLoadingFooterCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditPlaylistViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 556);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(159);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 567), awS562S0100000_18, AFwS206S0000000_18.get$arr$(200), new AwS562S0100000_18((C03K6) this, 542), new AwS562S0100000_18((C03K6) this, 544), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 546), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 548), null, new AwS562S0100000_18((C03K6) this, 549));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 543);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 545);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 547);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 43));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 550);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 551);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 552);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 553);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 554);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 555), awS562S0100000_18, AFwS206S0000000_18.get$arr$(201), new AwS562S0100000_18((C03K6) this, 557), new AwS562S0100000_18((C03K6) this, 558), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 559), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 560), null, new AwS562S0100000_18((C03K6) this, 561));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 562), awS562S0100000_18, AFwS206S0000000_18.get$arr$(202), new AwS562S0100000_18((C03K6) this, 563), new AwS562S0100000_18((C03K6) this, 564), new AwS562S0100000_18((C03K6) this, 565), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 566));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = 0;
        C786410Ut5.W5(view, layoutParams);
        ((C1390410mHn) view.findViewById(R.id.gb5)).LIZLLL();
        C786410Ut5.LJLLLLLL(8, view);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = LLILLL;
        C786410Ut5.W5(view, layoutParams);
        C786410Ut5.LJLLLLLL(0, view);
        ((C1390410mHn) view.findViewById(R.id.gb5)).LIZJ();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        L5();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* JADX INFO: renamed from: I5 */
    public final void onBindItemView(C20605115k1 c20605115k1) {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        if (((EditPlaylistViewModel) assemVMLazy.getValue()).LLJ) {
            AbstractC20607715kR abstractC20607715kR = c20605115k1.LLILLL.LIZIZ;
            if (abstractC20607715kR instanceof C20608115kV) {
                N5();
                return;
            } else if (abstractC20607715kR instanceof C20607815kS) {
                L5();
                return;
            } else {
                if (!(abstractC20607715kR instanceof C20607915kT)) {
                    return;
                }
                L5();
                return;
            }
        }
        L5();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C20605115k1) interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i3j, viewGroup, false);
    }
}
