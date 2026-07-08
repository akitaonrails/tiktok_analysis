package com.ss.android.ugc.aweme.commentv2.commentlist.powercell.photomode.innerflow.comment.list;

import X.C01GW;
import X.C1196320hEk;
import X.C1340820kzo;
import X.C1554960qZC;
import X.C1558420qem;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.ACListenerS146S0100000_11;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentMoreItemCell;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoModeInnerFlowCommentMoreItemCell extends CommentMoreItemCell<C1340820kzo> implements InterfaceC713360RyY {
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(205));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 493));

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLJJIJIIJIL.getValue();
    }

    public final CommentContextSource U5() {
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

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentMoreItemCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new ACListenerS146S0100000_11(this, 1), N5());
    }
}
