package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.im.PermitJoinGroupBizContent;

/* JADX INFO: loaded from: classes.dex */
public final class _PermitJoinGroupBizContent_ProtoDecoder implements C0IMD<PermitJoinGroupBizContent> {
    public static PermitJoinGroupBizContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PermitJoinGroupBizContent permitJoinGroupBizContent = new PermitJoinGroupBizContent();
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
                                    permitJoinGroupBizContent.quickCohostInviteeUserInfo = _PermitJoinGroupBizContent_QuickCohostInviteeUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                permitJoinGroupBizContent.matchedPreferenceTag = c1516680pZS.LJIIJ();
                            }
                        } else {
                            permitJoinGroupBizContent.skipCancelMatch = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        permitJoinGroupBizContent.sourceType = c1516680pZS.LJIIJ();
                    }
                } else {
                    permitJoinGroupBizContent.replyStatus = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return permitJoinGroupBizContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PermitJoinGroupBizContent permitJoinGroupBizContent) {
        ImageModel imageModel;
        PermitJoinGroupBizContent.QuickCohostInviteeUserInfo quickCohostInviteeUserInfo = permitJoinGroupBizContent.quickCohostInviteeUserInfo;
        if (quickCohostInviteeUserInfo != null && (imageModel = quickCohostInviteeUserInfo.avatarThumb) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final PermitJoinGroupBizContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PermitJoinGroupBizContent permitJoinGroupBizContent, List list) {
    }
}
