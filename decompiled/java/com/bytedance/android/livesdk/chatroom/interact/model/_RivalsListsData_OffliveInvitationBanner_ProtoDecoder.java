package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalsListsData_OffliveInvitationBanner_ProtoDecoder implements C0IMD<RivalsListsData.OffliveInvitationBanner> {
    public static RivalsListsData.OffliveInvitationBanner LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RivalsListsData.OffliveInvitationBanner offliveInvitationBanner = new RivalsListsData.OffliveInvitationBanner();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            offliveInvitationBanner.description = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        offliveInvitationBanner.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    offliveInvitationBanner.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return offliveInvitationBanner;
            }
        }
    }

    public static void LJ(RivalsListsData.OffliveInvitationBanner offliveInvitationBanner) {
        ImageModel imageModel = offliveInvitationBanner.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text = offliveInvitationBanner.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = offliveInvitationBanner.description;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RivalsListsData.OffliveInvitationBanner offliveInvitationBanner) {
        LJ(offliveInvitationBanner);
    }

    @Override // X.C0IMD
    public final RivalsListsData.OffliveInvitationBanner LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalsListsData.OffliveInvitationBanner offliveInvitationBanner, List list) {
    }
}
