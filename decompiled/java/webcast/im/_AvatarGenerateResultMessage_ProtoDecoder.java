package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multi_guest_social_data._Avatar_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _AvatarGenerateResultMessage_ProtoDecoder implements C0IMD<AvatarGenerateResultMessage> {
    @Override // X.C0IMD
    public final void LIZ(AvatarGenerateResultMessage avatarGenerateResultMessage) {
        ImageModel imageModel;
        AvatarGenerateResultMessage avatarGenerateResultMessage2 = avatarGenerateResultMessage;
        CommonMessageData commonMessageData = avatarGenerateResultMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Avatar avatar = avatarGenerateResultMessage2.avatar;
        if (avatar != null && (imageModel = avatar.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final AvatarGenerateResultMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AvatarGenerateResultMessage avatarGenerateResultMessage = new AvatarGenerateResultMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        avatarGenerateResultMessage.avatar = _Avatar_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    avatarGenerateResultMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return avatarGenerateResultMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AvatarGenerateResultMessage avatarGenerateResultMessage, List list) {
    }
}
