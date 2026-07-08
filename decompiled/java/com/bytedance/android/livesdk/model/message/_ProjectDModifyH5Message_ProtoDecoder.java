package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ProjectDModifyH5Message_ProtoDecoder implements C0IMD<ProjectDModifyH5Message> {
    @Override // X.C0IMD
    public final void LIZ(ProjectDModifyH5Message projectDModifyH5Message) {
        CommonMessageData commonMessageData = projectDModifyH5Message.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final ProjectDModifyH5Message LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ProjectDModifyH5Message projectDModifyH5Message = new ProjectDModifyH5Message();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            projectDModifyH5Message.mBottomRightUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        projectDModifyH5Message.mTopLeftUrl = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    projectDModifyH5Message.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return projectDModifyH5Message;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ProjectDModifyH5Message projectDModifyH5Message, List list) {
    }
}
