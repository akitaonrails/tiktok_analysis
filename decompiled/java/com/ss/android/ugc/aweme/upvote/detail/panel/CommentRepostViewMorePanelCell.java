package com.ss.android.ugc.aweme.upvote.detail.panel;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03GK;
import X.C03IJ;
import X.C03K6;
import X.C1358780lSm;
import X.C1388190mED;
import X.C13LE;
import X.C1402390mb7;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C339190DRl;
import X.C452080Ho6;
import X.C452501pT;
import X.C618720OOo;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1358190lRp;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS155S0100000_21;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentRepostViewMorePanelCell extends PowerCell<C1358780lSm> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public UpvotePanelListViewModel LL;
    public final AssemVMLazy LLILLJJLI;
    public View LLILLL;
    public TuxTextView LLILZ;
    public View LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentRepostViewMorePanelCell.class, "panelVm", "getPanelVm()Lcom/ss/android/ugc/aweme/upvote/detail/panel/RepostPanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommentRepostViewMorePanelCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostPanelViewModel.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 872);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(233);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 856), awS565S0100000_21, AFwS209S0000000_21.get$arr$(347), new AwS565S0100000_21((C03K6) this, 858), new AwS565S0100000_21((C03K6) this, 860), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 862), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 864), null, new AwS565S0100000_21((C03K6) this, 865));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 859);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 861);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 863);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 58));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 866);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 867);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 868);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 869);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 870);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 871), awS565S0100000_21, AFwS209S0000000_21.get$arr$(348), new AwS565S0100000_21((C03K6) this, 873), new AwS565S0100000_21((C03K6) this, 874), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 875), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 876), null, new AwS565S0100000_21((C03K6) this, 877));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 878), awS565S0100000_21, AFwS209S0000000_21.get$arr$(349), new AwS565S0100000_21((C03K6) this, 879), new AwS565S0100000_21((C03K6) this, 880), new AwS565S0100000_21((C03K6) this, 881), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 855));
        }
        this.LLILLJJLI = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
        if (c19egLIZIZ != null) {
            this.LL = (UpvotePanelListViewModel) ViewModelProviders.of(c19egLIZIZ).get(UpvotePanelListViewModel.class);
        }
        this.LLILLL = this.itemView.findViewById(R.id.hg3);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.hg8);
        this.LLILZIL = this.itemView.findViewById(R.id.e62);
        View view = this.LLILLL;
        EnumC1358190lRp enumC1358190lRp = EnumC1358190lRp.BUTTON;
        C03GK.LIZ(view, enumC1358190lRp, null, 12);
        View view2 = this.LLILLL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 93), view2);
        }
        C03GK.LIZ(this.LLILZIL, enumC1358190lRp, null, 12);
        View view3 = this.LLILZIL;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 94), view3);
        }
        C2211751BhN.LIZ(this.itemView, new C1402390mb7(this, 2));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1358780lSm c1358780lSm = (C1358780lSm) interfaceC1891350zJl;
        super.onBindItemView(c1358780lSm);
        int i = c1358780lSm.LLILZ;
        String quantityString = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    View view = this.LLILLL;
                    if (view != null) {
                        C339190DRl.LIZIZ(view);
                    }
                    View view2 = this.LLILZIL;
                    if (view2 != null) {
                        C339190DRl.LIZLLL(view2);
                        return;
                    }
                    return;
                }
                return;
            }
            View view3 = this.LLILLL;
            if (view3 != null) {
                C339190DRl.LIZLLL(view3);
            }
            View view4 = this.LLILZIL;
            if (view4 != null) {
                C339190DRl.LIZLLL(view4);
            }
            int i2 = c1358780lSm.LLILLJJLI - c1358780lSm.LLILLL;
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView == null) {
                return;
            }
            Resources resources = this.itemView.getContext().getResources();
            if (resources != null) {
                quantityString = resources.getQuantityString(2131755670, i2, C618720OOo.LIZ(i2));
            }
            tuxTextView.setText(quantityString);
            return;
        }
        View view5 = this.LLILLL;
        if (view5 != null) {
            C339190DRl.LIZLLL(view5);
        }
        View view6 = this.LLILZIL;
        if (view6 != null) {
            C339190DRl.LIZIZ(view6);
        }
        int i3 = c1358780lSm.LLILLJJLI - c1358780lSm.LLILLL;
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 == null) {
            return;
        }
        Resources resources2 = this.itemView.getContext().getResources();
        if (resources2 != null) {
            quantityString = resources2.getQuantityString(2131755670, i3, C618720OOo.LIZ(i3));
        }
        tuxTextView2.setText(quantityString);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i6a, viewGroup, false);
    }
}
