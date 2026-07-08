package com.ss.android.ugc.aweme.social.creation.edit.serviceimpl;

import X.C0ET4;
import X.C0MSS;
import X.C0MSU;
import X.C1428670nHV;
import X.C1428680nHW;
import X.C1444940nhk;
import X.C1455260nyO;
import X.C1659700tI8;
import X.C2188811AlT;
import X.C539960LFq;
import X.EnumC1642750sqn;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.shortvideo.componentservices.VideoEditComponentService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class SocialVideoEditComponentService implements VideoEditComponentService {
    @Override // com.ss.android.ugc.aweme.shortvideo.componentservices.VideoEditComponentService
    public final void LIZIZ(C539960LFq c539960LFq, C1455260nyO c1455260nyO, C1428680nHW c1428680nHW, C1428670nHV c1428670nHV) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.componentservices.VideoEditComponentService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.componentservices.VideoEditComponentService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.componentservices.VideoEditComponentService
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.componentservices.VideoEditComponentService
    public final void LIZ(C539960LFq c539960LFq, VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData != null && C1444940nhk.LJIIZILJ(canvasVideoData)) {
            EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register component ");
            sbLIZ.append(C0MSS.class.getName());
            sbLIZ.append(" api ");
            sbLIZ.append(C0MSU.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C0MSU.class, C0MSS.class, new AwS587S0100000_8(new C0ET4(), c539960LFq, 727));
        }
    }
}
