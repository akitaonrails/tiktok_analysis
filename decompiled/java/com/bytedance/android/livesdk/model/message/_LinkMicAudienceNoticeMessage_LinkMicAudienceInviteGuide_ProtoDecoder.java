package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicAudienceNoticeMessage_LinkMicAudienceInviteGuide_ProtoDecoder implements C0IMD<LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide> {
    public static LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide = new LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide();
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
                                    linkMicAudienceInviteGuide.linkmicAudienceInviteNoticeReason = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                linkMicAudienceInviteGuide.displayStrategy = c1516680pZS.LJIIJ();
                            }
                        } else {
                            linkMicAudienceInviteGuide.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        linkMicAudienceInviteGuide.buttonContent = _LinkMicAudienceNoticeMessage_LinkMicAudienceNoticeText_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkMicAudienceInviteGuide.content = _LinkMicAudienceNoticeMessage_LinkMicAudienceNoticeText_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicAudienceInviteGuide;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide) {
        User user = linkMicAudienceInviteGuide.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide, List list) {
    }
}
