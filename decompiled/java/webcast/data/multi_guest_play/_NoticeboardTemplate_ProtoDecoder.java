package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeboardTemplate_ProtoDecoder implements C0IMD<NoticeboardTemplate> {
    public static NoticeboardTemplate LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NoticeboardTemplate noticeboardTemplate = new NoticeboardTemplate();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        noticeboardTemplate.noticeboardTemplateId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        noticeboardTemplate.mediaNodeId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        noticeboardTemplate.convertNoticeboardMaterialInfo = _ConvertNoticeboardMaterialInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        noticeboardTemplate.privateStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        noticeboardTemplate.reviewStatus = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        noticeboardTemplate.authorInfo = _SimpleUser_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeboardTemplate;
            }
        }
    }

    public static void LJ(NoticeboardTemplate noticeboardTemplate) {
        ImageModel imageModel;
        ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo = noticeboardTemplate.convertNoticeboardMaterialInfo;
        if (convertNoticeboardMaterialInfo != null && convertNoticeboardMaterialInfo.starlingMap == null) {
            convertNoticeboardMaterialInfo.starlingMap = new HashMap();
        }
        SimpleUser simpleUser = noticeboardTemplate.authorInfo;
        if (simpleUser != null && (imageModel = simpleUser.avatarThumb) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(NoticeboardTemplate noticeboardTemplate) {
        LJ(noticeboardTemplate);
    }

    @Override // X.C0IMD
    public final NoticeboardTemplate LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeboardTemplate noticeboardTemplate, List list) {
    }
}
