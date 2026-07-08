package com.ss.android.ugc.aweme.external;

import X.C0LE0;
import X.C1432940nOO;
import X.C531610Kt5;
import X.C531620Kt6;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.services.external.IVideoTemplateService;
import com.ss.android.ugc.aweme.shortvideo.model.SummaryData;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoTemplateServiceImpl implements IVideoTemplateService {
    @Override // com.ss.android.ugc.aweme.services.external.IVideoTemplateService
    public final boolean enableAutoCut() {
        return s.LJIIIIZZ(false);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IVideoTemplateService
    public final boolean hasMagic(List<String> list) {
        C1432940nOO.LIZ.getClass();
        return C1432940nOO.LJFF(list);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IVideoTemplateService
    public final SummaryData resolveNLESummary(String str) {
        return C0LE0.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IVideoTemplateService
    public final Pair<Boolean, List<TemplateSlot>> tryToFreezeAssetSlots(List<TemplateSlot> list) {
        return C531610Kt5.LIZ(list);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IVideoTemplateService
    public final Pair<Boolean, List<TemplateSlot>> tryToSameAssetSlots(List<TemplateSlot> list, boolean z) {
        return C531620Kt6.LIZIZ(list, z);
    }
}
