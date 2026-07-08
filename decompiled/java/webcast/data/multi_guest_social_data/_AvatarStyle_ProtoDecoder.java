package webcast.data.multi_guest_social_data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AvatarStyle_ProtoDecoder implements C0IMD<AvatarStyle> {
    public static AvatarStyle LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AvatarStyle avatarStyle = new AvatarStyle();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        avatarStyle.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    avatarStyle.styleId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return avatarStyle;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AvatarStyle avatarStyle) {
        ImageModel imageModel = avatarStyle.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final AvatarStyle LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AvatarStyle avatarStyle, List list) {
    }
}
