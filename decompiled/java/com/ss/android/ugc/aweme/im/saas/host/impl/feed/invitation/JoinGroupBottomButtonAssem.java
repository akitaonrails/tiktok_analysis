package com.ss.android.ugc.aweme.im.saas.host.impl.feed.invitation;

import X.C01GW;
import X.C1229970i71;
import X.C1230620i84;
import X.C1230830i8P;
import X.C1260120ite;
import X.C14EU;
import X.C337180DJs;
import X.C452501pT;
import X.C724270Sb3;
import X.DialogC1389620mGW;
import X.EnumC1229960i70;
import Y.ARunnableS23S1200000_19;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.publicgroup.data.GroupForInvitation;
import com.ss.android.ugc.aweme.publicgroup.data.PopupDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupResponse;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class JoinGroupBottomButtonAssem extends BaseCellSlotComponent<JoinGroupBottomButtonAssem> {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1499));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1498));
    public DialogC1389620mGW LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b8y;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final boolean Vo() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void hp() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJoinedGroupSuccess(C1230830i8P c1230830i8P) {
        Object obj;
        String str;
        String str2 = c1230830i8P.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(str2, ((VideoItemParams) obj).getAweme().getAid()) && (str = c1230830i8P.LIZ) != null) {
            C1230620i84.LIZ.remove(str);
            C337180DJs.LIZ(LJJIJL());
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        IMGroupChatApi iMGroupChatApiLIZ;
        GroupInvitePopupResponse groupInvitePopupResponseLJIILJJIL;
        String aid = videoItemParams.getAweme().getAid();
        String strLIZ = C1230620i84.LIZ(aid);
        if (aid.length() != 0 && strLIZ != null && strLIZ.length() != 0 && (iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ()) != null && (groupInvitePopupResponseLJIILJJIL = iMGroupChatApiLIZ.LJIILJJIL(strLIZ)) != null && groupInvitePopupResponseLJIILJJIL.error_code == 0) {
            PopupDisplayMeta popupDisplayMeta = groupInvitePopupResponseLJIILJJIL.popupMeta;
            GroupForInvitation groupForInvitation = popupDisplayMeta.groupInfo;
            C1229970i71 c1229970i71 = EnumC1229960i70.Companion;
            int i = popupDisplayMeta.userGroupStatus;
            c1229970i71.getClass();
            EnumC1229960i70 enumC1229960i70LIZ = C1229970i71.LIZ(i);
            int i2 = JoinGroupBottomButtonTrigger.LLJLL;
            if (enumC1229960i70LIZ == EnumC1229960i70.CAN_JOIN) {
                C1260120ite.LIZIZ(new ARunnableS23S1200000_19(this, groupForInvitation, aid, 5));
            }
        }
    }
}
