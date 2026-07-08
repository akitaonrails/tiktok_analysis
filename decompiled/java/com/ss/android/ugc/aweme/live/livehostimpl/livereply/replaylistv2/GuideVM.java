package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2;

import X.AnonymousClass0207;
import X.C0146002m;
import X.C1833580xoa;
import X.InterfaceC0148002o;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import tikcast.api.anchor.replay.SettingInfos;

/* JADX INFO: loaded from: classes.dex */
public final class GuideVM extends AssemViewModel<C0146002m> {
    public boolean LL;
    public String LLILLJJLI = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0146002m(false);
    }

    public final void vQ2(SettingInfos settingInfos) {
        if (this.LL) {
            return;
        }
        this.LL = true;
        if (settingInfos == null) {
            return;
        }
        List<String> list = C1833580xoa.LIZ;
        String str = this.LLILLJJLI;
        AnchorReplayInfoData anchorReplayInfoData = new AnchorReplayInfoData();
        anchorReplayInfoData.funcData = settingInfos.funcData;
        anchorReplayInfoData.hasPostedLast7d = settingInfos.hasPostedLast7d;
        anchorReplayInfoData.fragmentRevertSwitch = settingInfos.fragmentRevertSwitch;
        anchorReplayInfoData.shareWithViewersSwitch = settingInfos.shareWithViewersSwitch;
        anchorReplayInfoData.reminderInfo = settingInfos.reminderInfo;
        anchorReplayInfoData.shareWithFansClubSwitch = settingInfos.shareWithFansClubSwitch;
        anchorReplayInfoData.shareWithFansClubStrongReach = settingInfos.shareWithFansClubStrongReach;
        anchorReplayInfoData.supportShareWithFansClub = settingInfos.supportShareWithFansClub;
        anchorReplayInfoData.canStrongReachAutopostLiving = settingInfos.canStrongReachAutopostLiving;
        anchorReplayInfoData.autopostLivingSwitch = settingInfos.autopostLivingSwitch;
        C1833580xoa.LIZIZ(anchorReplayInfoData, str);
        setState(AnonymousClass0207.get$arr$(38));
    }
}
