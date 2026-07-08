package com.ss.android.ugc.aweme.tools.music.aichoosemusic;

import X.C0CHQ;
import X.C0VSJ;
import X.C201955140j;
import X.C2188811AlT;
import X.C2276808w2;
import X.EnumC20228214Cy;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingParamProvider;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentUnderstandingParamProvider implements IContentUnderstandingParamProvider {
    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingParamProvider
    public final int LIZ() {
        return ((Number) C2276808w2.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingParamProvider
    public final String LIZIZ(CreativeInfo creativeInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ame-extract-frames-");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".zip");
        C0VSJ c0vsj = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILJJIL(creativeInfo, EnumC20228214Cy.CONTENT_UNDERSTANDING, C2188811AlT.LIZIZ(sbLIZ), true));
        File parentFile = c0vsj.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ContentUnderstandingParamProvider createUploadFile: ");
        sbLIZ2.append(c0vsj.getAbsolutePath());
        C201955140j.LJIILIIL("AIMusicConfigOptHelper", C2188811AlT.LIZIZ(sbLIZ2));
        return c0vsj.getAbsolutePath();
    }
}
