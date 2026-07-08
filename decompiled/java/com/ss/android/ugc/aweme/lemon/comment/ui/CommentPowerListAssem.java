package com.ss.android.ugc.aweme.lemon.comment.ui;

import X.AbstractC1906720ziY;
import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0CSC;
import X.C0Q4Y;
import X.C1340970l03;
import X.C1341040l0A;
import X.C1341050l0B;
import X.C1343050l3P;
import X.C1343150l3Z;
import X.C1343230l3h;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C20600815jK;
import X.C20603715jn;
import X.C20607315kN;
import X.C2217381BqS;
import X.C2344809Gs;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.EnumC1343330l3r;
import X.EnumC2007007tc;
import X.EnumC325100Com;
import X.InterfaceC1554640qYg;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS90S0200000_21;
import Y.AsS48S0100000_21;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.ss.android.ugc.aweme.comment.experiment.CommentPowerListMemoryConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem;
import com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM;
import com.ss.android.ugc.aweme.lemon.comment.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class CommentPowerListAssem extends UIContentAssem implements ICommentListAssemAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1343230l3h LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final int LLJILJILJ;
    public boolean LLJILLL;
    public EnumC325100Com LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public final C1343050l3P LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentPowerListAssem.class, "commentListVM", "getCommentListVM()Lcom/ss/android/ugc/aweme/lemon/comment/viewmodel/CommentListAssemVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommentPowerListAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/lemon/comment/model/CommentContextSource;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0l3P] */
    public CommentPowerListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListAssemVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 677), AFwS259S0000000_21.get$arr$(183), null, true);
        this.LLJ = new C1343230l3h();
        this.LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 676));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(288));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(289));
        this.LLJILJILJ = 8;
        this.LLJJIJI = new C0CSC() { // from class: X.0l3P
            @Override // X.C0CSC
            public final void LIZ(EnumC325100Com enumC325100Com) {
                boolean z;
                boolean z2;
                EnumC1343330l3r enumC1343330l3r;
                CommentPowerListAssem commentPowerListAssem = this.LIZ;
                if (commentPowerListAssem.LLJJI < 1) {
                    EnumC325100Com enumC325100Com2 = EnumC325100Com.NOT_AVAILABLE;
                    boolean z3 = false;
                    if (enumC325100Com != enumC325100Com2 && enumC325100Com != EnumC325100Com.FAKE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    EnumC325100Com enumC325100Com3 = commentPowerListAssem.LLJJ;
                    if (enumC325100Com3 != null && enumC325100Com3 != enumC325100Com2 && enumC325100Com3 != EnumC325100Com.FAKE) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onNetworkChange isLastNetworkUnAvailableOrDefault = ");
                    sbLIZ.append(z2);
                    sbLIZ.append(", isCurrentNetworkAvailable = ");
                    sbLIZ.append(z);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (z && z2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onNetworkChange isPageShow = ");
                        sbLIZ2.append(this.LIZ.LLILZ);
                        sbLIZ2.append(" commentListVM.curFooterStatus?.type = ");
                        C1343280l3m c1343280l3m = this.LIZ.Lo().LLJIJIL;
                        EnumC1343330l3r enumC1343330l3r2 = null;
                        if (c1343280l3m != null) {
                            enumC1343330l3r = c1343280l3m.LIZ;
                        } else {
                            enumC1343330l3r = null;
                        }
                        sbLIZ2.append(enumC1343330l3r);
                        sbLIZ2.append(" commentListVM.isLoading() = ");
                        sbLIZ2.append(this.LIZ.Lo().LLJILJIL);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        CommentPowerListAssem commentPowerListAssem2 = this.LIZ;
                        boolean z4 = commentPowerListAssem2.LLILZ;
                        C1343280l3m c1343280l3m2 = commentPowerListAssem2.Lo().LLJIJIL;
                        if (c1343280l3m2 != null) {
                            enumC1343330l3r2 = c1343280l3m2.LIZ;
                        }
                        if (enumC1343330l3r2 == EnumC1343330l3r.REFRESH_ERR && !this.LIZ.Lo().LLJILJIL) {
                            z3 = true;
                        }
                        if (z4 && z3) {
                            this.LIZ.Lo().Gj();
                            this.LIZ.LLJJI++;
                        }
                    }
                }
                this.LIZ.LLJJ = enumC325100Com;
            }
        };
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 648820353) {
            return null;
        }
        return this;
    }

    public final void Ho() {
        ((AbstractC1906720ziY) this.LLJILJIL.getValue()).LLILZLL.LIZLLL = C0Q4Y.BUFFER;
        So().LIZJ((AbstractC1906720ziY) this.LLJILJIL.getValue());
        Lo().LLJI = ((AbstractC1906720ziY) this.LLJILJIL.getValue()).LLILZLL;
    }

    public final C1340970l03 Jo() {
        return (C1340970l03) this.LLJIJIL.getValue();
    }

    public final CommentListAssemVM Lo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (CommentListAssemVM) assemVMLazy.getValue();
    }

    public final C1341050l0B No() {
        C1343230l3h c1343230l3h = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        if (c1343230l3h.LIZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1341050l0B.class, null);
            c1343230l3h.LIZ = interfaceC1555100qZQLIZIZ != null ? (C1341050l0B) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return c1343230l3h.LIZ;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv So() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJI.getValue();
    }

    public void ap() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.mRecycleChildrenOnDetach = true;
        So().setLayoutManager(linearLayoutManager);
    }

    public final void Go() {
        Jo().LLILZLL.LIZLLL = C0Q4Y.BUFFER;
        Lo().LLJ = Jo().LLILZLL;
        So().LIZJ(Jo());
    }

    public void Vo() {
        Go();
        Ho();
    }

    public final void Zo() {
        C20600815jK<InterfaceC1891350zJl> c20600815jK;
        C20600815jK<InterfaceC1891350zJl> c20600815jK2;
        C1341040l0A commonModel;
        C1341050l0B c1341050l0BNo = No();
        if (!Intrinsics.LJFF((c1341050l0BNo == null || (commonModel = c1341050l0BNo.getCommonModel()) == null) ? null : commonModel.getFromPage(), "graphic_detail") || (c20600815jK = Lo().LLJI) == null || c20600815jK.LJIIIIZZ() <= 0 || (c20600815jK2 = Lo().LLJI) == null) {
            return;
        }
        c20600815jK2.LJFF(null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJI = 0;
        ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).removeNetworkChangeObserver(this.LLJJIJI);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(4, "CommentPowerListAssem", "onParentSet");
        }
        C1558520qew.LIZLLL(this);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), this, ICommentListAssemAbility.class, null, null);
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), Lo(), ICommentListVMAbility.class, null, null);
        }
        Lo().LLIZLLLIL = C1558520qew.LJIIL(this);
    }

    @Override // com.ss.android.ugc.aweme.lemon.comment.ui.ICommentListAssemAbility
    public final C20600815jK<InterfaceC1891350zJl> wP2() {
        return Jo().LLILZLL;
    }

    public Class<? extends PowerLoadingCell> Oo() {
        return LoadingFooterCell.class;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AbstractC21674919sB abstractC21674919sB;
        C1341040l0A commonModel;
        super.onViewCreated(view);
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(4, "CommentPowerListAssem", "onViewCreated");
        }
        CommentListAssemVM commentListAssemVMLo = Lo();
        C1341050l0B c1341050l0BNo = No();
        Aweme aweme = null;
        if (c1341050l0BNo != null && (commonModel = c1341050l0BNo.getCommonModel()) != null) {
            aweme = commonModel.getAweme();
        }
        commentListAssemVMLo.LLILZIL = aweme;
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvSo = So();
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LJIIJ = false;
        c20603715jn.LIZ = 0;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = Oo();
        viewOnAttachStateChangeListenerC20604515jvSo.setListConfig(c20603715jn);
        Vo();
        So().LJIILIIL(Lo().LLJILJILJ, Jo());
        ap();
        AbstractC21673719rz itemAnimator = viewOnAttachStateChangeListenerC20604515jvSo.getItemAnimator();
        if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
            abstractC21674919sB.LLIZ = false;
        }
        AbstractC21673719rz itemAnimator2 = viewOnAttachStateChangeListenerC20604515jvSo.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.LJIJJ(0L);
            itemAnimator2.LJJ(0L);
            itemAnimator2.LJIL(0L);
            itemAnimator2.LJIJJLI(0L);
        }
        viewOnAttachStateChangeListenerC20604515jvSo.addOnScrollListener(new AsS48S0100000_21(this, 1));
        viewOnAttachStateChangeListenerC20604515jvSo.LJII(new C20607315kN() { // from class: X.0l1z
            @Override // X.C20607315kN
            public final void LJ(Exception exc) {
                CommentPowerListAssem commentPowerListAssem = this.LL;
                commentPowerListAssem.LLJILLL = false;
                commentPowerListAssem.Lo().wQ2(exc, false, this.LL.So());
            }

            @Override // X.C20607315kN
            public final void LJI(boolean z) {
                CommentPowerListAssem commentPowerListAssem = this.LL;
                commentPowerListAssem.LLJILLL = false;
                commentPowerListAssem.Lo().xQ2(false);
            }

            @Override // X.C20607315kN
            public final void LJII(Exception exc) {
                CommentPowerListAssem commentPowerListAssem = this.LL;
                commentPowerListAssem.LLJILLL = false;
                commentPowerListAssem.Zo();
                this.LL.Lo().wQ2(exc, true, this.LL.So());
            }

            @Override // X.C20607315kN
            public final void LJIIIZ(boolean z) {
                Aweme aweme2;
                C1341040l0A commonModel2;
                CommentPowerListAssem commentPowerListAssem = this.LL;
                commentPowerListAssem.LLJILLL = false;
                HandlerHook.viewPost(commentPowerListAssem.So(), new ARunnableS90S0200000_21(viewOnAttachStateChangeListenerC20604515jvSo, this.LL, 15));
                this.LL.Zo();
                this.LL.Lo().xQ2(true);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CommonOnPowerPageListener onRefreshSuccess  ");
                sbLIZ.append(this.LL.Jo().LLILZLL.LJIIIIZZ());
                C2188811AlT.LIZIZ(sbLIZ);
                CommentPowerListAssem commentPowerListAssem2 = this.LL;
                commentPowerListAssem2.So().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1401910maL(commentPowerListAssem2, 8));
                ICommentCareModeService.LIZ.getClass();
                ICommentCareModeService iCommentCareModeServiceLIZ = C1342200l22.LIZ();
                Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
                C1341050l0B c1341050l0BNo2 = this.LL.No();
                if (c1341050l0BNo2 != null && (commonModel2 = c1341050l0BNo2.getCommonModel()) != null) {
                    aweme2 = commonModel2.getAweme();
                } else {
                    aweme2 = null;
                }
                iCommentCareModeServiceLIZ.LIZ(fragmentLJI, aweme2);
            }
        });
        Lo().LLJILJILJ.getOperator().refresh();
        CommentListAssemVM commentListAssemVMLo2 = Lo();
        EnumC1343330l3r enumC1343330l3r = EnumC1343330l3r.LOADING;
        EnumC2007007tc enumC2007007tc = EnumC2007007tc.MATCH_PARENT;
        commentListAssemVMLo2.AQ2(enumC1343330l3r, null);
        ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).observerNetworkChange(this.LLJJIJI);
        if (((CommentPowerListMemoryConfig) C1343150l3Z.LIZIZ.getValue()).enableModifyPoolSize) {
            this.LLJJIII = true;
        }
    }
}
