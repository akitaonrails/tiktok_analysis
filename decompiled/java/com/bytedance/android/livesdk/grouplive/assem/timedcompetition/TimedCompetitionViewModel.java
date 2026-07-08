package com.bytedance.android.livesdk.grouplive.assem.timedcompetition;

import X.AnonymousClass0194;
import X.C001A;
import X.C019D;
import X.C081000Sa;
import X.C09JN;
import X.C0J1N;
import X.C0UO0;
import X.C1148140fz2;
import X.C11RD;
import X.C1559260qg8;
import X.C20441214yg;
import X.C2850018m;
import X.C2858018u;
import X.C480460Ism;
import X.C5183020f;
import X.C776250Uch;
import X.EnumC2851018n;
import X.InterfaceC0148002o;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfoParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionTeamBase;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionUserBase;
import com.bytedance.android.livesdk.grouplive.api.CompetitionApi;
import com.bytedance.android.livesdk.grouplive.assem.timedcompetition.TimedCompetitionViewModel;
import com.bytedance.android.livesdk.grouplive.datachannel.GroupLiveStatus;
import com.bytedance.android.livesdk.model.message.CompetitionMessage;
import com.bytedance.android.livesdk.model.message.CompetitionStart;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes.dex */
public final class TimedCompetitionViewModel extends AssemViewModel<C081000Sa> implements OnMessageListener {
    public DataChannel LL;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C019D.class, (Class<Object>) null, (String) 13), true);
    public final int LLILLL = 52;
    public final String LLILZ = "TimedCompetitionViewModel";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C081000Sa(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        IMessageManager iMessageManager;
        super.onCleared();
        DataChannel dataChannel = this.LL;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.removeMessageListener(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        IMessageManager iMessageManager;
        super.onPrepared();
        DataChannel dataChannel = ((C019D) this.LLILLJJLI.getValue()).LL;
        this.LL = dataChannel;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.addMessageListener(C001A.COMPETITION_MESSAGE.getIntType(), this);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        boolean z;
        CompetitionInitiateInfo competitionInitiateInfo;
        List<CompetitionTeamBase> list;
        long j;
        Map<String, BattleComboInfo> map;
        BattleComboInfo battleComboInfo;
        if (iMessage instanceof CompetitionMessage) {
            CompetitionMessage competitionMessage = (CompetitionMessage) iMessage;
            int i = competitionMessage.type;
            if (i != 3) {
                if (i != 5) {
                    if (i == 6) {
                        setState(new C5183020f(iMessage, 117));
                        return;
                    }
                    return;
                } else {
                    setState(new C5183020f(iMessage, 118));
                    DataChannel dataChannel = this.LL;
                    if (dataChannel != null) {
                        dataChannel.zW(GroupLiveStatus.class, new C2850018m(EnumC2851018n.NORMAL, null));
                    }
                    DataChannelGlobal.LLILZ.JQ2(C1148140fz2.class, Boolean.FALSE);
                    return;
                }
            }
            setState(new C5183020f(iMessage, 116));
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            CompetitionStart competitionStart = competitionMessage.start;
            if (competitionStart != null && competitionStart.gameplayOption == 2) {
                z = true;
            } else {
                z = false;
            }
            dataChannelGlobal.JQ2(C1148140fz2.class, Boolean.valueOf(z));
            ArrayList arrayList = new ArrayList();
            CompetitionStart competitionStart2 = competitionMessage.start;
            if (competitionStart2 != null && (competitionInitiateInfo = competitionStart2.initiateInfo) != null && (list = competitionInitiateInfo.teams) != null) {
                for (CompetitionTeamBase competitionTeamBase : list) {
                    if (competitionTeamBase.users.size() > 0) {
                        CompetitionStart competitionStart3 = competitionMessage.start;
                        long j2 = 0;
                        if (competitionStart3 != null && (map = competitionStart3.comboInfoMap) != null && (battleComboInfo = map.get(String.valueOf(((CompetitionUserBase) ListProtector.get(competitionTeamBase.users, 0)).userId))) != null) {
                            j = battleComboInfo.comboCount;
                        } else {
                            j = 0;
                        }
                        long j3 = ((CompetitionUserBase) ListProtector.get(competitionTeamBase.users, 0)).userId;
                        String str = ((CompetitionUserBase) ListProtector.get(competitionTeamBase.users, 0)).nickname;
                        ImageModel imageModel = ((CompetitionUserBase) ListProtector.get(competitionTeamBase.users, 0)).avatar;
                        CompetitionCommon competitionCommon = competitionMessage.bizCommon;
                        if (competitionCommon != null) {
                            j2 = competitionCommon.competitionId;
                        }
                        arrayList.add(new AnonymousClass0194(j3, str, imageModel, 0L, j2, j));
                    }
                }
            }
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.zW(GroupLiveStatus.class, new C2850018m(EnumC2851018n.TIMEDCOMPETITION, new C2858018u(arrayList)));
        }
    }

    public final void vQ2(final int i, final long j, final long j2) {
        if (i < 0) {
            return;
        }
        try {
            C480460Ism.LIZ().getClass();
            CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
            CompetitionInfoParams competitionInfoParams = new CompetitionInfoParams();
            CompetitionCommon competitionCommon = new CompetitionCommon();
            competitionCommon.type = this.LLILLL;
            competitionCommon.competitionId = j2;
            competitionCommon.roomId = j;
            competitionInfoParams.bizCommon = competitionCommon;
            competitionInfoParams.roomId = j;
            ((C0J1N) competitionApi.getCompetitionInfo(competitionInfoParams).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this))).LIZ(new C09JN() { // from class: X.018o
                @Override // X.C09JN
                public final void accept(Object obj) {
                    boolean z;
                    CompetitionInfo.GroupShowInfo groupShowInfo;
                    C1C7U.LIZ("TimedCompetitionViewModel@f986.onCountdownEndWithoutEndMessage$2");
                    C470590Icr c470590Icr = (C470590Icr) obj;
                    CompetitionInfo competitionInfo = (CompetitionInfo) c470590Icr.data;
                    if (competitionInfo != null && (groupShowInfo = competitionInfo.groupShowInfo) != null && groupShowInfo.status == 10) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        this.LL.setState(new C5183020f(c470590Icr, (C470590Icr<CompetitionInfo>) 325));
                        DataChannel dataChannel = this.LL.LL;
                        if (dataChannel != null) {
                            dataChannel.zW(GroupLiveStatus.class, new C2850018m(EnumC2851018n.NORMAL, null));
                        }
                    } else {
                        TimedCompetitionViewModel timedCompetitionViewModel = this.LL;
                        C500260Jjc.LJJJJJ(timedCompetitionViewModel, null, new C01J8(timedCompetitionViewModel, j, j2, i, null), 3);
                    }
                    C1C7U.LIZIZ("TimedCompetitionViewModel@f986.onCountdownEndWithoutEndMessage$2");
                }
            }, new C09JN() { // from class: X.018t
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("TimedCompetitionViewModel@f986.onCountdownEndWithoutEndMessage$3");
                    TimedCompetitionViewModel timedCompetitionViewModel = this.LL;
                    C500260Jjc.LJJJJJ(timedCompetitionViewModel, null, new C01J9(timedCompetitionViewModel, j, j2, i, null), 3);
                    C1C7U.LIZIZ("TimedCompetitionViewModel@f986.onCountdownEndWithoutEndMessage$3");
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJ(this.LLILZ, "An exception has been thrown.");
        }
    }
}
