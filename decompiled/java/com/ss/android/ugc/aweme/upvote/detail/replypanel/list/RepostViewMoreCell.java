package com.ss.android.ugc.aweme.upvote.detail.replypanel.list;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03GK;
import X.C03IJ;
import X.C03K6;
import X.C1235900iGa;
import X.C1358170lRn;
import X.C1358180lRo;
import X.C1358230lRt;
import X.C1358360lS6;
import X.C1358550lSP;
import X.C1359720lUI;
import X.C13LE;
import X.C1402390mb7;
import X.C19719912Dl;
import X.C21146717pB;
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
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostViewMoreCell extends PowerCell<C1358360lS6> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LL;
    public FrameLayout LLILLJJLI;
    public LinearLayout LLILLL;
    public C1235900iGa LLILZ;
    public View LLILZIL;
    public LinearLayout LLILZLL;
    public TuxTextView LLIZ;
    public Space LLIZLLLIL;
    public LinearLayout LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostViewMoreCell.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/upvote/detail/replypanel/vm/RepostInteractListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RepostViewMoreCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostInteractListViewModel.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 1016);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(264);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 1027), awS565S0100000_21, AFwS209S0000000_21.get$arr$(373), new AwS565S0100000_21((C03K6) this, 1002), new AwS565S0100000_21((C03K6) this, 1004), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1006), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 1008), null, new AwS565S0100000_21((C03K6) this, 1009));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 1003);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1005);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 1007);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 68));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 1010);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 1011);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 1012);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 1013);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 1014);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 1015), awS565S0100000_21, AFwS209S0000000_21.get$arr$(371), new AwS565S0100000_21((C03K6) this, 1017), new AwS565S0100000_21((C03K6) this, 1018), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1019), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 1020), null, new AwS565S0100000_21((C03K6) this, 1021));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 1022), awS565S0100000_21, AFwS209S0000000_21.get$arr$(372), new AwS565S0100000_21((C03K6) this, 1023), new AwS565S0100000_21((C03K6) this, 1024), new AwS565S0100000_21((C03K6) this, 1025), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 1026));
        }
        this.LL = assemVMLazy;
    }

    public final RepostInteractListViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (RepostInteractListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (FrameLayout) this.itemView.findViewById(R.id.tav);
        this.LLILLL = (LinearLayout) this.itemView.findViewById(R.id.a3w);
        this.LLILZ = (C1235900iGa) this.itemView.findViewById(R.id.nnp);
        this.LLILZIL = this.itemView.findViewById(R.id.mjt);
        this.LLIZLLLIL = (Space) this.itemView.findViewById(R.id.vro);
        this.LLILZLL = (LinearLayout) this.itemView.findViewById(R.id.hg3);
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.hg8);
        this.LLJ = (LinearLayout) this.itemView.findViewById(R.id.e62);
        this.itemView.findViewById(R.id.e64);
        LinearLayout linearLayout = this.LLILZLL;
        EnumC1358190lRp enumC1358190lRp = EnumC1358190lRp.BUTTON;
        C03GK.LIZ(linearLayout, enumC1358190lRp, null, 12);
        LinearLayout linearLayout2 = this.LLILZLL;
        if (linearLayout2 != null) {
            C786410Ut5.R7(linearLayout2, new ACListenerS155S0100000_21(this, 152));
        }
        C03GK.LIZ(this.LLJ, enumC1358190lRp, null, 12);
        LinearLayout linearLayout3 = this.LLJ;
        if (linearLayout3 != null) {
            C786410Ut5.R7(linearLayout3, new ACListenerS155S0100000_21(this, 153));
        }
        C2211751BhN.LIZ(this.itemView, new C1402390mb7(this, 7));
    }

    public final void L5(C1358360lS6 c1358360lS6) {
        TuxTextView tuxTextView = this.LLIZ;
        if (tuxTextView != null) {
            long j = c1358360lS6.LLILLL - ((long) c1358360lS6.LLILZIL);
            tuxTextView.setText(tuxTextView.getContext().getResources().getQuantityString(2131756050, (int) j, C618720OOo.LIZ(j)));
        }
    }

    public final void N5(String str) {
        String str2;
        String aid;
        int iLIZLLL;
        String uid;
        if (!I5().LLJILJILJ.contains(str)) {
            I5().LLJILJILJ.add(str);
            C1358360lS6 item = getItem();
            if (item == null) {
                return;
            }
            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
            VideoItemParams videoItemParams = I5().LLILLJJLI;
            if (videoItemParams == null || (str2 = videoItemParams.mEventType) == null) {
                str2 = "";
            }
            String strAQ2 = I5().AQ2();
            String str3 = I5().LLJ;
            Aweme aweme = I5().LL;
            String str4 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            User user = item.LL.user;
            if (user != null) {
                iLIZLLL = C1358170lRn.LIZLLL(user);
            } else {
                iLIZLLL = 0;
            }
            User user2 = item.LL.user;
            if (user2 != null) {
                uid = user2.getUid();
            } else {
                uid = null;
            }
            boolean zLJ = C1359720lUI.LJ(item.LL);
            int i = (int) (item.LLILLL - ((long) item.LLILZIL));
            UpvoteStruct upvoteStruct = item.LL;
            if (upvoteStruct != null) {
                str4 = upvoteStruct.upvoteId;
            }
            String str5 = I5().LLILZLL;
            c1358550lSP.getClass();
            C1358550lSP.LJJ(iLIZLLL, zLJ ? 1 : 0, "ttsocial_repost_panel_hide_reply_show", str2, i, strAQ2, str3, aid, uid, str4, str5);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        C1358360lS6 c1358360lS6 = (C1358360lS6) interfaceC1891350zJl;
        super.onBindItemView(c1358360lS6);
        int i = c1358360lS6.LLILZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C339190DRl.LIZIZ(this.LLILLL);
                            C1235900iGa c1235900iGa = this.LLILZ;
                            if (c1235900iGa != null) {
                                C786410Ut5.LLLLIIL(c1235900iGa, 0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C339190DRl.LIZIZ(this.itemView);
                    C339190DRl.LIZIZ(this.LLILLJJLI);
                    C339190DRl.LIZIZ(this.LLILLL);
                    C339190DRl.LIZIZ(this.LLILZ);
                    return;
                }
                C339190DRl.LIZLLL(this.LLILLL);
                C339190DRl.LIZIZ(this.LLILZ);
                View view = this.LLILZIL;
                if (view != null) {
                    C339190DRl.LIZLLL(view);
                }
                C339190DRl.LIZIZ(this.LLILZLL);
                C339190DRl.LIZIZ(this.LLIZLLLIL);
                C339190DRl.LIZLLL(this.LLJ);
                C1358360lS6 item = getItem();
                if (item == null || (str = item.LLILLJJLI) == null) {
                    return;
                }
                N5(str);
                return;
            }
            C339190DRl.LIZLLL(this.LLILLL);
            C339190DRl.LIZIZ(this.LLILZ);
            View view2 = this.LLILZIL;
            if (view2 != null) {
                C339190DRl.LIZLLL(view2);
            }
            C339190DRl.LIZLLL(this.LLILZLL);
            Space space = this.LLIZLLLIL;
            if (space != null) {
                C339190DRl.LIZLLL(space);
            }
            C339190DRl.LIZLLL(this.LLJ);
            L5(c1358360lS6);
            N5(c1358360lS6.LLILLJJLI);
            return;
        }
        if (c1358360lS6.LLILLL - ((long) c1358360lS6.LLILZIL) <= 0) {
            C339190DRl.LIZIZ(this.itemView);
            C339190DRl.LIZIZ(this.LLILLJJLI);
            C339190DRl.LIZIZ(this.LLILLL);
            C339190DRl.LIZIZ(this.LLILZ);
            return;
        }
        C339190DRl.LIZLLL(this.LLILLL);
        C339190DRl.LIZIZ(this.LLILZ);
        View view3 = this.LLILZIL;
        if (view3 != null) {
            C339190DRl.LIZLLL(view3);
        }
        C339190DRl.LIZLLL(this.LLILZLL);
        Space space2 = this.LLIZLLLIL;
        if (space2 != null) {
            C339190DRl.LIZLLL(space2);
        }
        C339190DRl.LIZIZ(this.LLJ);
        L5(c1358360lS6);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd;
        C1358230lRt.LIZIZ();
        if (C1358180lRo.LIZIZ()) {
            viewTd = C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.i71, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i71, viewGroup, false);
        }
        C1358230lRt.LIZ();
        return viewTd;
    }
}
