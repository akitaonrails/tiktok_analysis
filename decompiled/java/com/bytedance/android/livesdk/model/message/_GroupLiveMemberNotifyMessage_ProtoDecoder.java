package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupLiveMemberNotifyMessage_ProtoDecoder implements C0IMD<GroupLiveMemberNotifyMessage> {
    @Override // X.C0IMD
    public final void LIZ(GroupLiveMemberNotifyMessage groupLiveMemberNotifyMessage) {
        ImageModel imageModel;
        GroupLiveMemberNotifyMessage groupLiveMemberNotifyMessage2 = groupLiveMemberNotifyMessage;
        CommonMessageData commonMessageData = groupLiveMemberNotifyMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<MemberInfo> list = groupLiveMemberNotifyMessage2.memberInfo;
        if (list == null) {
            groupLiveMemberNotifyMessage2.memberInfo = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (MemberInfo memberInfo : groupLiveMemberNotifyMessage2.memberInfo) {
            if (memberInfo != null && (imageModel = memberInfo.avatar) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final GroupLiveMemberNotifyMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GroupLiveMemberNotifyMessage groupLiveMemberNotifyMessage = new GroupLiveMemberNotifyMessage();
        groupLiveMemberNotifyMessage.memberInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            groupLiveMemberNotifyMessage.memberInfo.add(_MemberInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        groupLiveMemberNotifyMessage.hostUserId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    groupLiveMemberNotifyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupLiveMemberNotifyMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupLiveMemberNotifyMessage groupLiveMemberNotifyMessage, List list) {
    }
}
