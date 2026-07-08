package com.ss.android.ugc.feed.platform.cell.component.news;

import X.C0RF0;
import X.C0SQE;
import X.C1066750drl;
import X.C19513411Wa;
import X.C19513511Wb;
import X.EnumC1430380nKG;
import X.EnumC705650Rm7;
import X.InterfaceC710290Rtb;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class NewsAnchorStatusComponent extends BaseCellLogicComponent<NewsAnchorStatusComponent> {
    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        View view;
        AnchorCommonStruct next;
        EnumC705650Rm7 enumC705650Rm7LIZ;
        InterfaceC710290Rtb interfaceC710290RtbLIZ;
        C1066750drl c1066750drlLIZ;
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                view = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getType() == EnumC1430380nKG.NEWS.getTYPE()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct = next;
            if (anchorCommonStruct != null && anchorCommonStruct.getId().length() != 0 && (enumC705650Rm7LIZ = C0SQE.LIZ(anchorCommonStruct)) != null && (interfaceC710290RtbLIZ = C19513411Wa.LIZ()) != null && (c1066750drlLIZ = ((C19513511Wb) interfaceC710290RtbLIZ).LIZ()) != null) {
                C0RF0 c0rf0 = jm().LIZLLL;
                if (c0rf0 != null) {
                    view = c0rf0.LIZ;
                }
                c1066750drlLIZ.LIZIZ(aweme, anchorCommonStruct, enumC705650Rm7LIZ, view);
            }
        }
    }
}
