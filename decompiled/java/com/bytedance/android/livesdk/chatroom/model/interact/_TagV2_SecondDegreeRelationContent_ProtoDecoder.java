package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TagV2_SecondDegreeRelationContent_ProtoDecoder implements C0IMD<TagV2.SecondDegreeRelationContent> {
    public static TagV2.SecondDegreeRelationContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TagV2.SecondDegreeRelationContent secondDegreeRelationContent = new TagV2.SecondDegreeRelationContent();
        secondDegreeRelationContent.relatedUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        secondDegreeRelationContent.totalRelatedUserCnt = c1516680pZS.LJIIJJI();
                    }
                } else {
                    secondDegreeRelationContent.relatedUsers.add(_TagV2_SecondDegreeRelationContent_UserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return secondDegreeRelationContent;
            }
        }
    }

    public static void LJ(TagV2.SecondDegreeRelationContent secondDegreeRelationContent) {
        ImageModel imageModel;
        List<TagV2.SecondDegreeRelationContent.UserInfo> list = secondDegreeRelationContent.relatedUsers;
        if (list == null) {
            secondDegreeRelationContent.relatedUsers = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (TagV2.SecondDegreeRelationContent.UserInfo userInfo : secondDegreeRelationContent.relatedUsers) {
            if (userInfo != null && (imageModel = userInfo.avatarThumb) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TagV2.SecondDegreeRelationContent secondDegreeRelationContent) {
        LJ(secondDegreeRelationContent);
    }

    @Override // X.C0IMD
    public final TagV2.SecondDegreeRelationContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TagV2.SecondDegreeRelationContent secondDegreeRelationContent, List list) {
    }
}
