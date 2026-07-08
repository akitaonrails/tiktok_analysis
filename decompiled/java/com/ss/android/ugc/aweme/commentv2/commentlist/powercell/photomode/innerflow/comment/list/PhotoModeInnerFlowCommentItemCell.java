package com.ss.android.ugc.aweme.commentv2.commentlist.powercell.photomode.innerflow.comment.list;

import X.C01GW;
import X.C0H1U;
import X.C1196320hEk;
import X.C1339430kxZ;
import X.C1339950kyP;
import X.C1340400kz8;
import X.C1340430kzB;
import X.C1343670l4P;
import X.C1345550l7R;
import X.C1345760l7m;
import X.C14EU;
import X.C1554960qZC;
import X.C1558420qem;
import X.C20600815jK;
import X.C452501pT;
import X.C687700QyG;
import X.C946803n0;
import X.EnumC1346360l8k;
import X.InterfaceC1342370l2J;
import X.InterfaceC1345780l7o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentLikeViewModel;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentItemCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentActionMenuVM;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoModeInnerFlowCommentItemCell extends CommentItemCell<C1340430kzB> implements InterfaceC713360RyY {
    public final C01GW LLLLZLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(204));
    public final C01GW LLLLZLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 492));

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentItemCell, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentPageScope.class});
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentItemCell, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(CommentPageScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentItemCell, com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final void h7(boolean z) {
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLLLZLLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final void R7() {
        Fragment fragmentLIZ;
        C1340400kz8 c1340400kz8 = (C1340400kz8) getItem();
        if (c1340400kz8 == null || (fragmentLIZ = C946803n0.LIZ(this.itemView)) == null) {
            return;
        }
        b6().LL = C1558420qem.LIZIZ(this);
        ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(fragmentLIZ, C1558420qem.LIZIZ(this));
        C20600815jK<InterfaceC1891350zJl> c20600815jKAd0 = iCommentListAssemAbilityLIZLLL != null ? iCommentListAssemAbilityLIZLLL.ad0() : null;
        CommentActionMenuVM commentActionMenuVMB6 = b6();
        C1339430kxZ c1339430kxZ = this.LLJJIII;
        InterfaceC1345780l7o interfaceC1345780l7o = c1339430kxZ != null ? c1339430kxZ.LIZLLL : null;
        C1343670l4P c1343670l4P = this.LL;
        if (!(c1343670l4P instanceof InterfaceC1342370l2J)) {
            c1343670l4P = null;
        }
        CommentActionMenuVM.AQ2(commentActionMenuVMB6, c1340400kz8, interfaceC1345780l7o, c1343670l4P, fragmentLIZ, d6(), c20600815jKAd0, null, null, 0, null, false, 4032);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final InterfaceC665370Q7z c6() {
        return C1558420qem.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final CommentContextSource d6() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558420qem.LIZIZ(this), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            return (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
        }
        return null;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentItemCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentItemCell, com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        EventBus.LIZLLL().LJIJJ(this);
        View view = this.LLILZ;
        if (view != null) {
            C0H1U.LJIIIIZZ(0, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final EnumC1346360l8k getInputServiceType() {
        return EnumC1346360l8k.PHOTO_MODE_INNER_FLOW_EXPOSE_COMMENT;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentItemCell, com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    /* JADX INFO: renamed from: U6 */
    public final /* bridge */ /* synthetic */ void onBindItemView(C1340400kz8 c1340400kz8) throws Throwable {
        U6((C1340430kzB) c1340400kz8);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentItemCell, com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) throws Throwable {
        U6((C1340430kzB) interfaceC1891350zJl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C14EU
    public final void onDiggEvent(C1339950kyP c1339950kyP) {
        Comment comment;
        boolean z;
        C1340430kzB c1340430kzB = (C1340430kzB) getItem();
        if (c1340430kzB != null && (comment = c1340430kzB.LLILZIL) != null && Intrinsics.LJFF(c1339950kyP.LIZ, comment.getCid())) {
            boolean z2 = false;
            if (c1339950kyP.LIZ.length() != 0) {
                int userDigged = comment.getUserDigged();
                int i = c1339950kyP.LIZIZ;
                if (userDigged != i) {
                    comment.setUserDigged(i);
                    comment.setDiggCount(c1339950kyP.LIZJ);
                    comment.isAuthorDigged = c1339950kyP.LJ;
                    C1345550l7R c1345550l7R = this.LLJJJ;
                    if (c1345550l7R != null) {
                        if (c1339950kyP.LIZIZ == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c1345550l7R.LJIIJ(Boolean.valueOf(z), Boolean.valueOf(c1339950kyP.LJ), Integer.valueOf(c1339950kyP.LIZJ), true, true);
                    }
                }
                int userBuried = comment.getUserBuried();
                int i2 = c1339950kyP.LIZLLL;
                if (userBuried != i2) {
                    comment.setUserBuried(i2);
                    C1345550l7R c1345550l7R2 = this.LLJJJ;
                    if (c1345550l7R2 != null) {
                        if (c1339950kyP.LIZLLL == 1) {
                            z2 = true;
                        }
                        c1345550l7R2.LJIIIZ(Boolean.valueOf(z2));
                    }
                }
                c8();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentItemCell
    /* JADX INFO: renamed from: s8 */
    public final void U6(C1340430kzB c1340430kzB) throws Throwable {
        C1345550l7R c1345550l7R;
        CommentLikeViewModel likeVM;
        CommentLikeViewModel likeVM2;
        super.U6(c1340430kzB);
        C1345550l7R c1345550l7R2 = this.LLJJJ;
        if (c1345550l7R2 != null && (likeVM2 = c1345550l7R2.getLikeVM()) != null) {
            likeVM2.LLJILLL = C1558420qem.LIZIZ(this);
        }
        C1345550l7R c1345550l7R3 = this.LLJJJ;
        if (c1345550l7R3 != null && (likeVM = c1345550l7R3.getLikeVM()) != null) {
            likeVM.LLJJ = new WeakReference<>(getFragment());
        }
        CommentContextSource commentContextSourceD6 = d6();
        if (commentContextSourceD6 != null && (c1345550l7R = this.LLJJJ) != null) {
            c1345550l7R.setCommentContextSource(commentContextSourceD6);
        }
    }
}
