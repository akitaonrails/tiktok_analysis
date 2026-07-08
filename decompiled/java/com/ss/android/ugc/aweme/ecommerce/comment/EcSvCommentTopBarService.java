package com.ss.android.ugc.aweme.ecommerce.comment;

import X.AbstractC1351650lHH;
import X.C1955407lI;
import X.C21272218Mm;
import X.C21274118Nf;
import X.C255960A1i;
import X.EnumC1430380nKG;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.service.IEcSvCommentTopBarService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class EcSvCommentTopBarService implements IEcSvCommentTopBarService {
    public final Map<String, AbstractC1351650lHH> LIZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcSvCommentTopBarService
    public final void LIZIZ(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        AbstractC1351650lHH abstractC1351650lHH = (AbstractC1351650lHH) ((LinkedHashMap) this.LIZ).get(C1955407lI.LIZLLL(fragment));
        if (abstractC1351650lHH != null) {
            abstractC1351650lHH.LIZJ();
        }
        this.LIZ.remove(C1955407lI.LIZLLL(fragment));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcSvCommentTopBarService
    public final boolean LIZJ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (!C255960A1i.LIZ() || !C21272218Mm.LJJIFFI(aweme)) {
            if (C21274118Nf.LIZJ() && aweme != null && (anchors = aweme.getAnchors()) != null) {
                for (AnchorCommonStruct anchorCommonStruct : anchors) {
                    if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_SHOWCASE.getTYPE()) {
                        if (anchorCommonStruct == null) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01eb  */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcSvCommentTopBarService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC1351650lHH LIZ(androidx.fragment.app.Fragment r25, com.ss.android.ugc.aweme.feed.model.Aweme r26, java.lang.Integer r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.comment.EcSvCommentTopBarService.LIZ(androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer, java.lang.String):X.0lHH");
    }
}
