package com.bytedance.android.livesdk.grouplive.assem.timedcompetition;

import X.AnonymousClass0193;
import X.AnonymousClass0207;
import X.C019D;
import X.C019F;
import X.C020Z;
import X.C1099560eig;
import X.C1099610eil;
import X.C13IQ;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C16F5;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C5182020e;
import X.C5183020f;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.C963140bAe;
import X.InterfaceC2217461Bqa;
import X.ViewOnClickListenerC511801z2;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionResultsTeamInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionTeamMemberInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionUserBase;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.grouplive.assem.timedcompetition.TimedCompetitionAssem;
import com.bytedance.android.livesdk.grouplive.datachannel.GroupLiveStatus;
import com.bytedance.android.livesdkapi.depend.model.live.GroupLiveInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import qo2.w;

/* JADX INFO: loaded from: classes.dex */
public final class TimedCompetitionAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public DataChannel LLJI;
    public C1099560eig LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public AnonymousClass0193 LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TimedCompetitionAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/grouplive/assem/timedcompetition/TimedCompetitionViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TimedCompetitionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TimedCompetitionViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 91), AnonymousClass0207.get$arr$(24), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C019D.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1099560eig c1099560eig = this.LLJIJIL;
        if (c1099560eig != null) {
            c1099560eig.LJIIJ();
        }
        this.LLJIJIL = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Room room;
        GroupLiveInfo groupLiveInfo;
        final CompetitionInfo competitionInfo;
        CompetitionInfo.GroupShowInfo groupShowInfo;
        CompetitionInfo.GroupShowInfo groupShowInfo2;
        String string;
        final long j;
        long j2;
        super.onViewCreated(view);
        this.LLJI = ((C019D) this.LLJ.getValue()).LL;
        C1099560eig c1099560eig = new C1099560eig(getContext(), (ViewGroup) view.findViewById(R.id.xwr), this.LLJI);
        this.LLJIJIL = c1099560eig;
        C5183020f c5183020f = new C5183020f(this, 114);
        C786410Ut5.H8((C1099610eil) c1099560eig.LIZLLL.getValue(), new ViewOnClickListenerC511801z2(c5183020f, c1099560eig, 11));
        C786410Ut5.l8((C16F5) c1099560eig.LJI.getValue(), new ViewOnClickListenerC511801z2(c5183020f, c1099560eig, 12));
        C786410Ut5.H8((C1099610eil) c1099560eig.LJ.getValue(), new ViewOnClickListenerC511801z2(c5183020f, c1099560eig, 9));
        C786410Ut5.l8((C16F5) c1099560eig.LJII.getValue(), new ViewOnClickListenerC511801z2(c5183020f, c1099560eig, 10));
        C1099560eig c1099560eig2 = this.LLJIJIL;
        if (c1099560eig2 != null) {
            c1099560eig2.LJJIIJZLJL = new C5183020f(this, 115);
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        AssemViewModel value = assemVMLazy.getValue();
        String string2 = null;
        subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, new C020Z(view, this, 5));
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (groupLiveInfo = room.groupLiveInfo) != null && (competitionInfo = groupLiveInfo.groupShow) != null && (groupShowInfo = competitionInfo.groupShowInfo) != null && groupShowInfo.status == 1 && (groupShowInfo2 = competitionInfo.groupShowInfo) != null) {
            final long jLIZJ = groupShowInfo2.endTimestamp - (C963140bAe.LIZJ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            final long j3 = groupShowInfo2.actualEndTimestamp - groupShowInfo2.endTimestamp;
            if (!competitionInfo.teamInfos.isEmpty() && competitionInfo.teamInfos.size() > 1 && jLIZJ > 0) {
                final ArrayList arrayList = new ArrayList();
                for (CompetitionResultsTeamInfo competitionResultsTeamInfo : competitionInfo.teamInfos) {
                    if (!competitionResultsTeamInfo.members.isEmpty() && ((CompetitionTeamMemberInfo) ListProtector.get(competitionResultsTeamInfo.members, 0)).user != null) {
                        arrayList.add(ListProtector.get(competitionResultsTeamInfo.members, 0));
                    } else {
                        return;
                    }
                }
                if (arrayList.size() == 2) {
                    this.LLJILJIL = ((CompetitionResultsTeamInfo) ListProtector.get(competitionInfo.teamInfos, 0)).teamId;
                    this.LLJILJILJ = ((CompetitionResultsTeamInfo) ListProtector.get(competitionInfo.teamInfos, 1)).teamId;
                    Map<String, BattleComboInfo> map = competitionInfo.comboInfoMap;
                    CompetitionUserBase competitionUserBase = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 0)).user;
                    if (competitionUserBase != null) {
                        string = Long.valueOf(competitionUserBase.userId).toString();
                    } else {
                        string = null;
                    }
                    BattleComboInfo battleComboInfo = map.get(string);
                    if (battleComboInfo != null) {
                        j = battleComboInfo.comboCount;
                    } else {
                        j = 0;
                    }
                    Map<String, BattleComboInfo> map2 = competitionInfo.comboInfoMap;
                    CompetitionUserBase competitionUserBase2 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 1)).user;
                    if (competitionUserBase2 != null) {
                        string2 = Long.valueOf(competitionUserBase2.userId).toString();
                    }
                    BattleComboInfo battleComboInfo2 = map2.get(string2);
                    if (battleComboInfo2 != null) {
                        j2 = battleComboInfo2.comboCount;
                    } else {
                        j2 = 0;
                    }
                    final long j4 = j2;
                    HandlerHook.viewPost(view, new Runnable() { // from class: X.018v
                        public final void LIZ() {
                            int i;
                            int i2;
                            String string3;
                            CompetitionUserBase competitionUserBase3;
                            Room room2;
                            String string4;
                            Room room3;
                            String str;
                            String str2;
                            CompetitionCommon competitionCommon = competitionInfo.bizCommon;
                            long j5 = competitionCommon != null ? competitionCommon.competitionId : 0L;
                            C1099560eig c1099560eig3 = this.LLJIJIL;
                            if (c1099560eig3 != null) {
                                long j6 = jLIZJ;
                                CompetitionUserBase competitionUserBase4 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 0)).user;
                                long j7 = competitionUserBase4 != null ? competitionUserBase4.userId : 0L;
                                CompetitionUserBase competitionUserBase5 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 0)).user;
                                String str3 = "";
                                if (competitionUserBase5 == null || (str = competitionUserBase5.nickname) == null) {
                                    str = "";
                                }
                                CompetitionUserBase competitionUserBase6 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 0)).user;
                                ImageModel imageModel = competitionUserBase6 != null ? competitionUserBase6.avatar : null;
                                i = 0;
                                i2 = 1;
                                AnonymousClass0194 anonymousClass0194 = new AnonymousClass0194(j7, str, imageModel, ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 0)).score, j5, j);
                                CompetitionUserBase competitionUserBase7 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 1)).user;
                                long j8 = competitionUserBase7 != null ? competitionUserBase7.userId : 0L;
                                CompetitionUserBase competitionUserBase8 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 1)).user;
                                if (competitionUserBase8 != null && (str2 = competitionUserBase8.nickname) != null) {
                                    str3 = str2;
                                }
                                CompetitionUserBase competitionUserBase9 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 1)).user;
                                c1099560eig3.LJIIL(j6, anonymousClass0194, new AnonymousClass0194(j8, str3, competitionUserBase9 != null ? competitionUserBase9.avatar : null, ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 1)).score, j5, j4), j5, competitionInfo.gameplayOption, (int) j3);
                            } else {
                                i = 0;
                                i2 = 1;
                            }
                            TimedCompetitionAssem timedCompetitionAssem = this;
                            w.LIZ.getClass();
                            String strLJIIIZ = w.LJIIIZ();
                            String strLJIIL = w.LJIIL();
                            DataChannel dataChannel2 = this.LLJI;
                            String str4 = CardStruct.IStatusCode.DEFAULT;
                            if (dataChannel2 == null || (room3 = (Room) dataChannel2.gg0(RoomChannel.class)) == null || (string3 = Long.valueOf(room3.getOwnerUserId()).toString()) == null) {
                                string3 = CardStruct.IStatusCode.DEFAULT;
                            }
                            DataChannel dataChannel3 = this.LLJI;
                            if (dataChannel3 != null && (room2 = (Room) dataChannel3.gg0(RoomChannel.class)) != null && (string4 = Long.valueOf(room2.getId()).toString()) != null) {
                                str4 = string4;
                            }
                            String strValueOf = String.valueOf(j5);
                            CompetitionUserBase competitionUserBase10 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, i)).user;
                            long j9 = competitionUserBase10 != null ? competitionUserBase10.userId : 0L;
                            long j10 = j;
                            String strValueOf2 = j10 > 99 ? "99+" : String.valueOf(j10);
                            CompetitionUserBase competitionUserBase11 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, i2)).user;
                            long j11 = competitionUserBase11 != null ? competitionUserBase11.userId : 0L;
                            long j12 = j4;
                            timedCompetitionAssem.LLJILLL = new AnonymousClass0193(strLJIIIZ, strLJIIL, string3, str4, strValueOf, j9, strValueOf2, j11, j12 <= 99 ? String.valueOf(j12) : "99+");
                            AnonymousClass0193 anonymousClass0193 = this.LLJILLL;
                            if (anonymousClass0193 != null) {
                                AnonymousClass0192.LIZIZ(anonymousClass0193);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            List<CompetitionResultsTeamInfo> list = competitionInfo.teamInfos;
                            if (list.size() > 1) {
                                CompetitionInfo competitionInfo2 = competitionInfo;
                                for (CompetitionResultsTeamInfo competitionResultsTeamInfo2 : list) {
                                    if (competitionResultsTeamInfo2.members.size() > 0 && (competitionUserBase3 = ((CompetitionTeamMemberInfo) ListProtector.get(competitionResultsTeamInfo2.members, 0)).user) != null) {
                                        BattleComboInfo battleComboInfo3 = competitionInfo2.comboInfoMap.get(String.valueOf(competitionUserBase3.userId));
                                        arrayList2.add(new AnonymousClass0194(competitionUserBase3.userId, competitionUserBase3.nickname, competitionUserBase3.avatar, ((CompetitionTeamMemberInfo) ListProtector.get(competitionResultsTeamInfo2.members, 0)).score, j5, battleComboInfo3 != null ? battleComboInfo3.comboCount : 0L));
                                    }
                                }
                            }
                            DataChannel dataChannel4 = this.LLJI;
                            if (dataChannel4 != null) {
                                dataChannel4.zW(GroupLiveStatus.class, new C2850018m(EnumC2851018n.TIMEDCOMPETITION, new C2858018u(arrayList2)));
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("TimedCompetitionAssem@a890.showTimedCompetitionBarOnViewCreate$2");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("TimedCompetitionAssem@a890.showTimedCompetitionBarOnViewCreate$2");
                        }
                    });
                }
            }
        }
    }
}
