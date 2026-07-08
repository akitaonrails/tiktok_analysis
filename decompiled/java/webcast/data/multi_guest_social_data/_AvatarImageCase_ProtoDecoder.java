package webcast.data.multi_guest_social_data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AvatarImageCase_ProtoDecoder implements C0IMD<AvatarImageCase> {
    public static AvatarImageCase LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AvatarImageCase avatarImageCase = new AvatarImageCase();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        avatarImageCase.isBad = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    avatarImageCase.exampleImages = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return avatarImageCase;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AvatarImageCase avatarImageCase) {
        ImageModel imageModel = avatarImageCase.exampleImages;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final AvatarImageCase LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AvatarImageCase avatarImageCase, List list) {
    }
}
