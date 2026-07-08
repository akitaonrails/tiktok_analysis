package com.ss.android.ugc.aweme.social.creation.edit.serviceimpl;

import X.AbstractC1664490tPr;
import X.C0ET4;
import X.C1408640mlC;
import X.C1444940nhk;
import X.C1450500nqi;
import X.C1453080nus;
import X.C1453870nw9;
import X.C1453880nwA;
import X.C1453950nwH;
import X.C1455260nyO;
import X.C1644160st4;
import X.C1659700tI8;
import X.C19A3;
import X.C20736616Cm;
import X.C21665319qd;
import X.C2188811AlT;
import X.C385670FAf;
import X.C539960LFq;
import X.C559610Lx9;
import X.EnumC1453860nw8;
import X.EnumC1642750sqn;
import X.EnumC371580EhY;
import X.InterfaceC1408660mlE;
import X.InterfaceC1452390ntl;
import X.InterfaceC1452510ntx;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.creation.api.ISocialEditComponentRegisterApi;
import com.ss.android.ugc.aweme.social.creation.edit.component.filter.core.story.StoryEditFilterViewModel;
import com.ss.android.ugc.aweme.social.creation.edit.component.filter.story.StoryEditFilterIndicatorViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS73S0210000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class SocialEditComponentRegisterApiImpl implements ISocialEditComponentRegisterApi {
    @Override // com.ss.android.ugc.aweme.social.creation.api.ISocialEditComponentRegisterApi
    public final void LIZ(C539960LFq c539960LFq, ImageEditRootScene imageEditRootScene) {
        EnumC371580EhY enumC371580EhY = EnumC371580EhY.HIDE;
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register slotUIComponent ");
        sbLIZ.append(C1453880nwA.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC1452390ntl.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC1452390ntl.class, C1453880nwA.class, AbstractC1664490tPr.class, R.id.mbh, enumC371580EhY, new AwS388S0200000_22(new C0ET4(), (C559610Lx9) c539960LFq, (C19A3) imageEditRootScene, 291));
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.ISocialEditComponentRegisterApi
    public final void LIZLLL(C539960LFq c539960LFq, ImageEditRootScene imageEditRootScene) {
        EnumC371580EhY enumC371580EhY = EnumC371580EhY.HIDE;
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register slotUIComponent ");
        sbLIZ.append(C1450500nqi.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC1452510ntx.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC1452510ntx.class, C1450500nqi.class, C21665319qd.class, R.id.m_v, enumC371580EhY, new AwS73S0210000_22(new C0ET4(), c539960LFq, imageEditRootScene, false, 5));
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.ISocialEditComponentRegisterApi
    public final void LIZJ(C539960LFq c539960LFq, C1455260nyO c1455260nyO, VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData != null && C1444940nhk.LJFF(canvasVideoData)) {
            EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register component ");
            sbLIZ.append(C1408640mlC.class.getName());
            sbLIZ.append(" api ");
            sbLIZ.append(InterfaceC1408660mlE.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC1408660mlE.class, C1408640mlC.class, new AwS388S0200000_22(new C0ET4(), (C559610Lx9) c539960LFq, (C19A3) c1455260nyO, 290));
        }
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.ISocialEditComponentRegisterApi
    public final void LJ(C539960LFq c539960LFq, C1455260nyO c1455260nyO, VideoPublishEditModel videoPublishEditModel, C385670FAf c385670FAf, C1453870nw9 c1453870nw9) {
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.LAZY;
        EnumC1642750sqn enumC1642750sqnLIZJ = C1453950nwH.LIZJ(videoPublishEditModel, enumC1642750sqn, 4);
        C385670FAf c385670FAfLIZ = C1453950nwH.LIZ(enumC1642750sqn, c385670FAf, c1453870nw9.LIZLLL(EnumC1453860nw8.EDIT_VIDEO_FRAME_AVAILABLE));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C20736616Cm.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(StoryEditFilterIndicatorViewModel.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqnLIZJ, c385670FAfLIZ, StoryEditFilterIndicatorViewModel.class, C20736616Cm.class, new AwS388S0200000_22(new C0ET4(), (C559610Lx9) c539960LFq, (C19A3) c1455260nyO, 292));
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.ISocialEditComponentRegisterApi
    public final void LIZIZ(C539960LFq c539960LFq, C1455260nyO c1455260nyO, VideoPublishEditModel videoPublishEditModel, C385670FAf c385670FAf, C1453870nw9 c1453870nw9, C1453080nus c1453080nus) {
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.LAZY;
        EnumC1642750sqn enumC1642750sqnLIZJ = C1453950nwH.LIZJ(videoPublishEditModel, enumC1642750sqn, 4);
        C385670FAf c385670FAfLIZ = C1453950nwH.LIZ(enumC1642750sqn, c385670FAf, c1453870nw9.LIZLLL(EnumC1453860nw8.EDIT_VIDEO_FRAME_AVAILABLE));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C1644160st4.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(StoryEditFilterViewModel.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqnLIZJ, c385670FAfLIZ, StoryEditFilterViewModel.class, C1644160st4.class, new AwS231S0300000_22(new C0ET4(), c539960LFq, c1455260nyO, c1453080nus, 41));
    }
}
