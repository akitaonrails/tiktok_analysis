package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MemberInfo_ProtoDecoder implements C0IMD<MemberInfo> {
    public static MemberInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MemberInfo memberInfo = new MemberInfo();
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
                                memberInfo.avatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            memberInfo.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        memberInfo.isStaged = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    memberInfo.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return memberInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MemberInfo memberInfo) {
        ImageModel imageModel = memberInfo.avatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final MemberInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MemberInfo memberInfo, List list) {
    }
}
