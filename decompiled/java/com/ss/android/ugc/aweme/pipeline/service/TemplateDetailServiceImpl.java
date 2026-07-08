package com.ss.android.ugc.aweme.pipeline.service;

import X.C0FQK;
import X.C531550Ksz;
import X.C532250Ku7;
import X.C532330KuF;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateDetailService;
import com.ss.android.ugc.aweme.shortvideo.model.SummaryData;

/* JADX INFO: loaded from: classes6.dex */
public final class TemplateDetailServiceImpl implements ITemplateDetailService {
    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateDetailService
    public final String LIZ(String str) {
        C532330KuF c532330KuF;
        C531550Ksz c531550KszLIZ = C0FQK.LIZ(str);
        if (c531550KszLIZ != null && (c532330KuF = c531550KszLIZ.LIZJ) != null) {
            return c532330KuF.LJ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateDetailService
    public final String LIZIZ(String str) {
        C532330KuF c532330KuF;
        C531550Ksz c531550KszLIZ = C0FQK.LIZ(str);
        if (c531550KszLIZ != null && (c532330KuF = c531550KszLIZ.LIZJ) != null) {
            return c532330KuF.LIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateDetailService
    public final boolean LIZJ(String str) {
        SummaryData summaryDataLIZIZ = C0FQK.LIZIZ(str);
        if (summaryDataLIZIZ == null || !summaryDataLIZIZ.isUsingServerMagic || !C532250Ku7.LIZ(summaryDataLIZIZ)) {
            return false;
        }
        return true;
    }
}
