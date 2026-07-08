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
public final class _PermitJoinGroupBizContent_QuickCohostInviteeUserInfo_ProtoDecoder implements C0IMD<PermitJoinGroupBizContent.QuickCohostInviteeUserInfo> {
    public static PermitJoinGroupBizContent.QuickCohostInviteeUserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PermitJoinGroupBizContent.QuickCohostInviteeUserInfo quickCohostInviteeUserInfo = new PermitJoinGroupBizContent.QuickCohostInviteeUserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        quickCohostInviteeUserInfo.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    quickCohostInviteeUserInfo.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quickCohostInviteeUserInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PermitJoinGroupBizContent.QuickCohostInviteeUserInfo quickCohostInviteeUserInfo) {
        ImageModel imageModel = quickCohostInviteeUserInfo.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final PermitJoinGroupBizContent.QuickCohostInviteeUserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PermitJoinGroupBizContent.QuickCohostInviteeUserInfo quickCohostInviteeUserInfo, List list) {
    }
}
