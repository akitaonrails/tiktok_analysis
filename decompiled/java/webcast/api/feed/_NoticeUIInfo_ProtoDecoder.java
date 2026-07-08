package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeUIInfo_ProtoDecoder implements C0IMD<NoticeUIInfo> {
    public static NoticeUIInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NoticeUIInfo noticeUIInfo = new NoticeUIInfo();
        noticeUIInfo.fromUserList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        noticeUIInfo.uiType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        noticeUIInfo.fromUserList.add(_NoticeUserStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        noticeUIInfo.content = _TopliveNoticeTextStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        noticeUIInfo.button = _NoticeButton_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        noticeUIInfo.rightImage = _NoticeUrlStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        noticeUIInfo.tuxId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        noticeUIInfo.tuxColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        noticeUIInfo.defaultJumpType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeUIInfo;
            }
        }
    }

    public static void LJ(NoticeUIInfo noticeUIInfo) {
        Text text;
        List<NoticeUserStruct> list = noticeUIInfo.fromUserList;
        if (list == null) {
            noticeUIInfo.fromUserList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<NoticeUserStruct> it2 = noticeUIInfo.fromUserList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        TopliveNoticeTextStruct topliveNoticeTextStruct = noticeUIInfo.content;
        if (topliveNoticeTextStruct != null && (text = topliveNoticeTextStruct.text) != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(NoticeUIInfo noticeUIInfo) {
        LJ(noticeUIInfo);
    }

    @Override // X.C0IMD
    public final NoticeUIInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeUIInfo noticeUIInfo, List list) {
    }
}
