package com.ss.android.ugc.aweme.social.sticker.editcomponent;

import X.C0ET4;
import X.C0FQ0;
import X.C12C1;
import X.C12CR;
import X.C1462410o9v;
import X.C1659700tI8;
import X.C19566411gs;
import X.C19621411pk;
import X.C19621711pn;
import X.C19669511xV;
import X.C19669911xZ;
import X.C19680211zE;
import X.C19680611zI;
import X.C19A3;
import X.C1DRG;
import X.C2188811AlT;
import X.C283060B7o;
import X.C298450Bmt;
import X.C539960LFq;
import X.EnumC1642750sqn;
import X.InterfaceC1452170ntP;
import X.InterfaceC1452410ntn;
import X.InterfaceC1462270o9h;
import X.InterfaceC1462290o9j;
import X.InterfaceC1462300o9k;
import X.InterfaceC19624811qI;
import X.InterfaceC19627411qi;
import X.InterfaceC19627511qj;
import X.InterfaceC459260Hzg;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.sticker.service.IEditStickerSceneSocialStickerRegister;
import com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarStoryPostService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS110S0201000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS52S0301000_29;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class EditStickerSceneSocialStickerRegisterImpl implements IEditStickerSceneSocialStickerRegister {
    @Override // com.ss.android.ugc.aweme.social.sticker.service.IEditStickerSceneSocialStickerRegister
    public final void LIZIZ(C539960LFq c539960LFq) {
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.LAZY;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C19669911xZ.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC19627411qi.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC19627411qi.class, C19669911xZ.class, new AwS608S0100000_29(new C0ET4(), c539960LFq, 252));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("register component ");
        sbLIZ2.append(C19669511xV.class.getName());
        sbLIZ2.append(" api ");
        sbLIZ2.append(InterfaceC19627511qj.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC19627511qj.class, C19669511xV.class, new AwS608S0100000_29(new C0ET4(), c539960LFq, 253));
        if (((Number) C283060B7o.LIZ.getValue()).intValue() == 1) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("register component ");
            sbLIZ3.append(C19621411pk.class.getName());
            sbLIZ3.append(" api ");
            sbLIZ3.append(InterfaceC19624811qI.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC19624811qI.class, C19621411pk.class, new AwS608S0100000_29(new C0ET4(), c539960LFq, 254));
        }
        if (C298450Bmt.LIZ()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("register component ");
            sbLIZ4.append(C19621711pn.class.getName());
            sbLIZ4.append(" api ");
            sbLIZ4.append(InterfaceC1462290o9j.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC1462290o9j.class, C19621711pn.class, new AwS608S0100000_29(new C0ET4(), c539960LFq, 255));
        }
        ISocialAvatarStoryPostService iSocialAvatarStoryPostService = (ISocialAvatarStoryPostService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarStoryPostService.class, false, false, false, 14, null);
        if (iSocialAvatarStoryPostService != null && iSocialAvatarStoryPostService.enable()) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("register component ");
            sbLIZ5.append(C1462410o9v.class.getName());
            sbLIZ5.append(" api ");
            sbLIZ5.append(InterfaceC1462270o9h.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC1462270o9h.class, C1462410o9v.class, new AwS601S0100000_22(new C0ET4(), c539960LFq, 251));
        }
    }

    @Override // com.ss.android.ugc.aweme.social.sticker.service.IEditStickerSceneSocialStickerRegister
    public final void LIZLLL(C539960LFq c539960LFq) {
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C19680211zE.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC1462300o9k.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC1462300o9k.class, C19680211zE.class, new AwS608S0100000_29(new C0ET4(), c539960LFq, 256));
    }

    @Override // com.ss.android.ugc.aweme.social.sticker.service.IEditStickerSceneSocialStickerRegister
    public final void LIZJ(C539960LFq c539960LFq, Function2<? super C0FQ0, ? super InterfaceC1452170ntP, Unit> function2) {
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C19680611zI.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC1452410ntn.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC1452410ntn.class, C19680611zI.class, new AwS395S0200000_29(new C0ET4(), c539960LFq, function2, 37));
    }

    @Override // com.ss.android.ugc.aweme.social.sticker.service.IEditStickerSceneSocialStickerRegister
    public final void LIZ(C539960LFq c539960LFq, C1DRG c1drg, C19A3 c19a3, VideoPublishEditModel videoPublishEditModel) {
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C19566411gs.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC459260Hzg.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC459260Hzg.class, C19566411gs.class, new AwS110S0201000_29(new C0ET4(), c539960LFq, c19a3, R.id.gsu, 5));
        if ((videoPublishEditModel instanceof VideoPublishEditModel) && videoPublishEditModel != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("register component ");
            sbLIZ2.append(C12CR.class.getName());
            sbLIZ2.append(" api ");
            sbLIZ2.append(C12C1.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C12C1.class, C12CR.class, new AwS52S0301000_29(new C0ET4(), c539960LFq, c19a3, R.id.grq, videoPublishEditModel, 1));
        }
    }
}
