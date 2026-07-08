package com.bytedance.android.livesdk.grouplive.assem.icyclash;

import X.AnonymousClass0207;
import X.C019D;
import X.C019F;
import X.C019N;
import X.C020Z;
import X.C1148140fz2;
import X.C1161920gLG;
import X.C13IQ;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5182020e;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.C916420ZxI;
import X.C916720Zxm;
import X.C930770aKR;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionResultsTeamInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionTeamMemberInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionUserBase;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.grouplive.assem.icyclash.GroupLiveIcyClashAssem;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchGroupLiveIcyClashSetting;
import com.bytedance.android.livesdkapi.depend.model.live.GroupLiveInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleEffectInfos;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class GroupLiveIcyClashAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C019D.class, null), checkSupervisorPrepared());
    public DataChannel LLJ;
    public C019N LLJI;
    public final AssemVMLazy LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupLiveIcyClashAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/grouplive/assem/icyclash/GroupLiveIcyClashViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupLiveIcyClashAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupLiveIcyClashViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 89), AnonymousClass0207.get$arr$(22), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        Room room;
        GroupLiveInfo groupLiveInfo;
        final CompetitionInfo competitionInfo;
        ViewGroup viewGroup;
        super.onViewCreated(view);
        DataChannel dataChannel = ((C019D) this.LLIZLLLIL.getValue()).LL;
        this.LLJ = dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (groupLiveInfo = room.groupLiveInfo) != null && (competitionInfo = groupLiveInfo.groupShow) != null) {
            LiveMatchGroupLiveIcyClashSetting liveMatchGroupLiveIcyClashSetting = LiveMatchGroupLiveIcyClashSetting.INSTANCE;
            if (!liveMatchGroupLiveIcyClashSetting.isEnable()) {
                DataChannelGlobal.LLILZ.JQ2(C1148140fz2.class, Boolean.FALSE);
                C500260Jjc.LJIILIIL(view);
                return;
            }
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = (int) (C497740JfY.LJIILLIIL() * liveMatchGroupLiveIcyClashSetting.getEffectScreenHeightPercentage());
                }
                C786410Ut5.X5(layoutParams, viewGroup);
            }
            AssemVMLazy assemVMLazy = this.LLJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
            AssemViewModel value = assemVMLazy.getValue();
            subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, new C020Z(view, this, 10));
            if (competitionInfo.gameplayOption == 2 && !competitionInfo.teamInfos.isEmpty() && competitionInfo.teamInfos.size() > 1) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Boolean bool = Boolean.TRUE;
                dataChannelGlobal.JQ2(C1148140fz2.class, bool);
                dataChannelGlobal.JQ2(C930770aKR.class, bool);
                final ArrayList arrayList = new ArrayList();
                for (CompetitionResultsTeamInfo competitionResultsTeamInfo : competitionInfo.teamInfos) {
                    if (!competitionResultsTeamInfo.members.isEmpty() && ((CompetitionTeamMemberInfo) ListProtector.get(competitionResultsTeamInfo.members, 0)).user != null) {
                        arrayList.add(ListProtector.get(competitionResultsTeamInfo.members, 0));
                    } else {
                        return;
                    }
                }
                if (arrayList.size() == 2) {
                    HandlerHook.viewPost(view, new Runnable() { // from class: X.00kE
                        public final void LIZ() {
                            CompetitionInfo competitionInfo2 = competitionInfo;
                            CompetitionCommon competitionCommon = competitionInfo2.bizCommon;
                            long j = competitionCommon != null ? competitionCommon.competitionId : 0L;
                            GroupLiveIcyClashAssem groupLiveIcyClashAssem = this;
                            int i = competitionInfo2.gameplayOption;
                            BattleEffectInfos battleEffectInfos = competitionInfo2.effectInfos;
                            View view2 = view;
                            CompetitionUserBase competitionUserBase = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 0)).user;
                            long j2 = competitionUserBase != null ? competitionUserBase.userId : 0L;
                            CompetitionUserBase competitionUserBase2 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 1)).user;
                            groupLiveIcyClashAssem.Go(i, battleEffectInfos, view2, j2, competitionUserBase2 != null ? competitionUserBase2.userId : 0L, j);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("GroupLiveIcyClashAssem@222f.initIcyClashEffectViewCreated$2");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("GroupLiveIcyClashAssem@222f.initIcyClashEffectViewCreated$2");
                        }
                    });
                }
            }
        }
    }

    public final void Go(int i, BattleEffectInfos battleEffectInfos, View view, long j, long j2, long j3) {
        ViewGroup viewGroup;
        Context context;
        C019N c019n;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initIcyClashEffect: gameplayOption = ");
        sbLIZ.append(i);
        sbLIZ.append(", effectInfos = ");
        sbLIZ.append(battleEffectInfos);
        sbLIZ.append(", leftUserId = ");
        sbLIZ.append(j);
        sbLIZ.append(", rightUserId = ");
        sbLIZ.append(j2);
        sbLIZ.append(", competitionId = ");
        sbLIZ.append(j3);
        C20441214yg.LIZIZ("GroupLiveIcyClashAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null || (context = getContext()) == null) {
            return;
        }
        if (i == 2) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Boolean bool = Boolean.TRUE;
            dataChannelGlobal.JQ2(C1148140fz2.class, bool);
            dataChannelGlobal.JQ2(C930770aKR.class, bool);
            ArrayList arrayList = new ArrayList();
            int width = view.getWidth();
            int height = view.getHeight();
            int i2 = width / 2;
            arrayList.add(new C916720Zxm(j, new C916420ZxI(0, 0, 0, 0), new C916420ZxI(0, 0, i2, height)));
            arrayList.add(new C916720Zxm(j2, new C916420ZxI(0, 0, 0, 0), new C916420ZxI(i2, 0, i2, height)));
            C019N c019nIa1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Ia1(context, this.LLJ);
            this.LLJI = c019nIa1;
            if (c019nIa1 != null) {
                c019nIa1.LIZJ(viewGroup, arrayList, j3);
            }
            if (battleEffectInfos != null && (c019n = this.LLJI) != null) {
                c019n.LIZ(battleEffectInfos);
            }
            C500260Jjc.LLFFF(view);
            return;
        }
        C500260Jjc.LJIILIIL(view);
        DataChannelGlobal.LLILZ.JQ2(C1148140fz2.class, Boolean.FALSE);
    }
}
