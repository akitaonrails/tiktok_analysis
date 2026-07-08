package com.ss.android.ugc.aweme.creationeoycard;

import X.C0RF0;
import X.C0SZL;
import X.C0TRR;
import X.C20549215b0;
import X.C786410Ut5;
import X.InterfaceC691450RAh;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.api.creationeoy.ICreationEoyService;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class CreationEoyServiceImpl implements ICreationEoyService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.15b0] */
    @Override // com.ss.android.ugc.aweme.api.creationeoy.ICreationEoyService
    public final C20549215b0 LIZIZ() {
        return new C0TRR() { // from class: X.15b0
            @Override // X.C0TRR
            public final int LIZ() {
                throw null;
            }

            @Override // X.C0TRR
            public final int LIZIZ() {
                return 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
            @Override // X.C0TRR
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List<com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest> LIZJ(X.C0TRR r17, com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData r18, java.util.List<com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo> r19) {
                /*
                    Method dump skipped, instruction units count: 437
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20549215b0.LIZJ(X.0TRR, com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData, java.util.List):java.util.List");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.api.creationeoy.ICreationEoyService
    public final View LIZ(Context context) {
        return C786410Ut5.Sd(R.layout.d53, C786410Ut5.ne(context), null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0RAY] */
    @Override // com.ss.android.ugc.aweme.api.creationeoy.ICreationEoyService
    public final CreationEoyCardViewHolder LIZJ(InterfaceC691450RAh interfaceC691450RAh) {
        if (!(interfaceC691450RAh instanceof C0RF0)) {
            return null;
        }
        return new CreationEoyCardViewHolder((C0RF0) interfaceC691450RAh, new C0SZL<CreationEoyCardViewHolder, VideoItemParams>() { // from class: X.0RAY
            @Override // X.C0SZL
            public final String LIZLLL(VideoItemParams videoItemParams) {
                String aid = videoItemParams.getAweme().getAid();
                if (aid == null) {
                    return "";
                }
                return aid;
            }
        });
    }
}
