package webcast.data.multi_guest_social_data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AvatarImageSelectTips_ProtoDecoder implements C0IMD<AvatarImageSelectTips> {
    public static AvatarImageSelectTips LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AvatarImageSelectTips avatarImageSelectTips = new AvatarImageSelectTips();
        avatarImageSelectTips.examples = new ArrayList();
        avatarImageSelectTips.rules = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                avatarImageSelectTips.rules.add(C1516700pZU.LIZLLL(c1516680pZS));
                            }
                        } else {
                            avatarImageSelectTips.examples.add(_AvatarImageCase_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        avatarImageSelectTips.desc = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    avatarImageSelectTips.title = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return avatarImageSelectTips;
            }
        }
    }

    public static void LJ(AvatarImageSelectTips avatarImageSelectTips) {
        ImageModel imageModel;
        List<AvatarImageCase> list = avatarImageSelectTips.examples;
        if (list == null) {
            avatarImageSelectTips.examples = new ArrayList();
        } else if (!list.isEmpty()) {
            for (AvatarImageCase avatarImageCase : avatarImageSelectTips.examples) {
                if (avatarImageCase != null && (imageModel = avatarImageCase.exampleImages) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        if (avatarImageSelectTips.rules == null) {
            avatarImageSelectTips.rules = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AvatarImageSelectTips avatarImageSelectTips) {
        LJ(avatarImageSelectTips);
    }

    @Override // X.C0IMD
    public final AvatarImageSelectTips LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AvatarImageSelectTips avatarImageSelectTips, List list) {
    }
}
