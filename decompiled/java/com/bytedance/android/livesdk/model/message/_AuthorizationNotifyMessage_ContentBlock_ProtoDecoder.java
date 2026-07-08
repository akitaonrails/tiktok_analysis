package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.AuthorizationNotifyMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AuthorizationNotifyMessage_ContentBlock_ProtoDecoder implements C0IMD<AuthorizationNotifyMessage.ContentBlock> {
    public static AuthorizationNotifyMessage.ContentBlock LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AuthorizationNotifyMessage.ContentBlock contentBlock = new AuthorizationNotifyMessage.ContentBlock();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    contentBlock.detail = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                contentBlock.content = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            contentBlock.title = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        contentBlock.isAuthorized = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                    }
                } else {
                    contentBlock.show = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return contentBlock;
            }
        }
    }

    @Override // X.C0IMD
    public final AuthorizationNotifyMessage.ContentBlock LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AuthorizationNotifyMessage.ContentBlock contentBlock) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AuthorizationNotifyMessage.ContentBlock contentBlock, List list) {
    }
}
