package com.ss.android.ugc.aweme.api.component.carousel;

import X.C1008160cLG;
import X.C1009340cNA;
import X.C1033870d0j;
import X.InterfaceC1007910cKr;
import android.content.Context;
import com.ss.android.ugc.aweme.api.carousel.ICarouselFeedService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CarouselFeedServiceImpl implements ICarouselFeedService {
    @Override // com.ss.android.ugc.aweme.api.carousel.ICarouselFeedService
    public final C1033870d0j LIZ(Context context, Aweme aweme, C1009340cNA c1009340cNA, InterfaceC1007910cKr interfaceC1007910cKr, C1008160cLG c1008160cLG) {
        Map<String, AnoleComponentModel> map;
        AnoleModel anoleModel = c1009340cNA.LIZLLL.getAnoleModel();
        if ((anoleModel != null || (anoleModel = c1009340cNA.LJFF) != null) && (map = anoleModel.components) != null && !map.isEmpty()) {
            Iterator<Map.Entry<String, AnoleComponentModel>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getValue().requireScene(), "carousel")) {
                    return new C1033870d0j(context, aweme, c1009340cNA, interfaceC1007910cKr, c1008160cLG);
                }
            }
        }
        return null;
    }
}
