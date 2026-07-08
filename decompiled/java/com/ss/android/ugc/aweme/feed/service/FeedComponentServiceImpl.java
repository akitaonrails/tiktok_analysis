package com.ss.android.ugc.aweme.feed.service;

import X.C0HTT;
import X.C0R5N;
import X.C1291860jiq;
import X.C1393410mMd;
import X.C1393500mMm;
import X.EnumC1430380nKG;
import X.InterfaceC704770Rkh;
import X.InterfaceC705610Rm3;
import X.InterfaceC752010Teh;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.DialogController;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class FeedComponentServiceImpl implements IFeedComponentService {
    public C1393410mMd LIZ;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0mMd] */
    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final C0R5N LIZIZ() {
        if (this.LIZ == null) {
            this.LIZ = new C0R5N() { // from class: X.0mMd
            };
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final C1291860jiq LIZ(float f) {
        return new C1291860jiq(5, f, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final <T> T LIZJ(Class<T> cls) {
        if (Intrinsics.LJFF(cls, InterfaceC704770Rkh.class)) {
            return (T) new C1393500mMm();
        }
        if (Intrinsics.LJFF(cls, InterfaceC705610Rm3.class)) {
            return (T) new InterfaceC705610Rm3() { // from class: X.0mFN
                @Override // X.InterfaceC705610Rm3
                public final int LIZ(Aweme aweme, C19EG c19eg, String str, JSONObject jSONObject, Fragment fragment) {
                    C712510RxB c712510RxB = new C712510RxB(aweme, c19eg, str, jSONObject, false, fragment, null, null);
                    if (C712530RxD.LIZ(null, c712510RxB, "video_anchor", C1392650mLP.LIZ(c712510RxB), null).LJIIJ() == 0) {
                        return 0;
                    }
                    return C386801es.DEFAULT;
                }
            };
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final List<AnchorCommonStruct> LJIIIIZZ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            ArrayList arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                if (anchorCommonStruct.getType() == EnumC1430380nKG.DONATION_STICKER.getTYPE()) {
                    arrayList.add(anchorCommonStruct);
                }
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final DialogController LIZLLL(String str, int i, C0HTT c0htt, InterfaceC752010Teh interfaceC752010Teh) {
        return new DialogController(str, i, c0htt, interfaceC752010Teh);
    }
}
