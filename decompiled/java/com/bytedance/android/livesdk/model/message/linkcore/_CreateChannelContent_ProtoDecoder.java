package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CreateChannelContent_ProtoDecoder implements C0IMD<CreateChannelContent> {
    public static CreateChannelContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CreateChannelContent createChannelContent = new CreateChannelContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            createChannelContent.ownerLinkerSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        createChannelContent.ownerLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    createChannelContent.owner = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return createChannelContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CreateChannelContent createChannelContent) {
    }

    @Override // X.C0IMD
    public final CreateChannelContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CreateChannelContent createChannelContent, List list) {
    }
}
