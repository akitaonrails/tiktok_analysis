package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.AuthorizationNotifyMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AuthorizationNotifyMessage_RelationBlock_ProtoDecoder implements C0IMD<AuthorizationNotifyMessage.RelationBlock> {
    public static AuthorizationNotifyMessage.RelationBlock LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AuthorizationNotifyMessage.RelationBlock relationBlock = new AuthorizationNotifyMessage.RelationBlock();
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
                                    relationBlock.detail = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                relationBlock.content = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            relationBlock.title = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        relationBlock.isAuthorized = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                    }
                } else {
                    relationBlock.show = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return relationBlock;
            }
        }
    }

    @Override // X.C0IMD
    public final AuthorizationNotifyMessage.RelationBlock LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AuthorizationNotifyMessage.RelationBlock relationBlock) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AuthorizationNotifyMessage.RelationBlock relationBlock, List list) {
    }
}
