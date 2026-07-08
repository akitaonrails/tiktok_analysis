package com.ss.android.ugc.aweme.commentv2.commentlist.powercell.photomode.innerflow.comment;

import X.C07XH;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C2188811AlT;
import X.C722360SVe;
import X.C722420SVk;
import X.C748602w8;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC722440SVm;
import X.InterfaceC722480SVq;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.tuc.service.ITUCBizService;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class CommentCareModeBannerCell extends PowerCell<C748602w8> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        CommentContextSource commentContextSource;
        CommentContextSource commentContextSource2;
        FrameLayout frameLayout;
        C748602w8 c748602w8 = (C748602w8) interfaceC1891350zJl;
        String str = null;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this.itemView, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
        } else {
            commentContextSource = null;
        }
        Aweme aweme = CommentContextSourceKt.aweme(commentContextSource);
        if (aweme != null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(C1558360qeg.LJ(this.itemView, null), "source_default_key", CommentContextSource.class, null);
            if (interfaceC1555100qZQLIZIZ2 != null) {
                commentContextSource2 = (CommentContextSource) interfaceC1555100qZQLIZIZ2.getSource();
            } else {
                commentContextSource2 = null;
            }
            String strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSource2);
            InterfaceC722480SVq interfaceC722480SVq = (InterfaceC722480SVq) ((ITUCBizService) ServiceManager.get().getService(ITUCBizService.class)).LJIIIZ().LIZLLL(c748602w8.LLILLJJLI, aweme);
            if (interfaceC722480SVq != null) {
                InterfaceC722440SVm<? extends C07XH> interfaceC722440SVmLIZ = interfaceC722480SVq.LIZ(this.itemView.getContext(), aweme, strEnterFrom, AFwS198S0000000_11.get$arr$(482));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cell: ");
                sbLIZ.append(hashCode());
                sbLIZ.append(", needShowType = ");
                C722360SVe c722360SVeLIZ = interfaceC722440SVmLIZ.LIZ();
                if (c722360SVeLIZ != null) {
                    str = c722360SVeLIZ.LIZIZ;
                }
                sbLIZ.append(str);
                sbLIZ.append("curAweme = ");
                sbLIZ.append(aweme.getAid());
                C2188811AlT.LIZIZ(sbLIZ);
                View view = this.itemView;
                if ((view instanceof FrameLayout) && (frameLayout = (FrameLayout) view) != null) {
                    C786410Ut5.LJJJJIZL(frameLayout);
                }
                C722420SVk.LIZ(C722420SVk.LIZ, interfaceC722440SVmLIZ, this.itemView);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        return frameLayout;
    }
}
