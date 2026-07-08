package com.bytedance.android.livesdk.grouplive.assem.mvpseat;

import X.AnonymousClass0193;
import X.AnonymousClass0194;
import X.AnonymousClass0207;
import X.C019D;
import X.C019F;
import X.C020W;
import X.C020Z;
import X.C0UO0;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C500260Jjc;
import X.C516201zk;
import X.C5182020e;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736820SvI;
import X.C963140bAe;
import X.EnumC2856018s;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2855018r;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionContributorInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionResultsTeamInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettleEnd;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionTeamBase;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionTeamMemberInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionUserBase;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.grouplive.assem.timedcompetition.TimedCompetitionViewModel;
import com.bytedance.android.livesdk.livesetting.grouplive.GroupLiveConfig;
import com.bytedance.android.livesdk.model.message.CompetitionStart;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import qo2.w;

/* JADX INFO: loaded from: classes.dex */
public final class GroupLiveMvpSeatAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public DataChannel LLJ;
    public InterfaceC2855018r LLJI;
    public AnonymousClass0194 LLJIJIL;
    public AnonymousClass0194 LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public List<CompetitionContributorInfo> LLJJ;
    public List<CompetitionContributorInfo> LLJJI;
    public AnonymousClass0193 LLJJIII;
    public final AssemVMLazy LLJJIJIIJIL;
    public C11JF LLJJIJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C019D.class, null), checkSupervisorPrepared());
    public EnumC2856018s LLJJIJI = EnumC2856018s.HIDDEN;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupLiveMvpSeatAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/grouplive/assem/timedcompetition/TimedCompetitionViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupLiveMvpSeatAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TimedCompetitionViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 90), AnonymousClass0207.get$arr$(23), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        InterfaceC2855018r interfaceC2855018r = this.LLJI;
        if (interfaceC2855018r != null) {
            interfaceC2855018r.destroy();
        }
        this.LLJI = null;
        C11JF c11jf = this.LLJJIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJIJIL = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        Room room;
        GroupLiveInfo groupLiveInfo;
        final CompetitionInfo competitionInfo;
        ViewGroup viewGroup;
        long j;
        long j2;
        String str;
        long j3;
        ImageModel imageModel;
        String string;
        long j4;
        String string2;
        long j5;
        String string3;
        long j6;
        String strValueOf;
        long j7;
        Room room2;
        String string4;
        Room room3;
        String str2;
        super.onViewCreated(view);
        DataChannel dataChannel = ((C019D) this.LLIZLLLIL.getValue()).LL;
        this.LLJ = dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (groupLiveInfo = room.groupLiveInfo) != null && (competitionInfo = groupLiveInfo.groupShow) != null) {
            ImageModel imageModel2 = null;
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                Context context = viewGroup.getContext();
                InterfaceC2855018r interfaceC2855018rJO2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).JO2(context, this.LLJ);
                this.LLJI = interfaceC2855018rJO2;
                if (interfaceC2855018rJO2 != null) {
                    interfaceC2855018rJO2.LIZJ(viewGroup);
                }
                InterfaceC2855018r interfaceC2855018r = this.LLJI;
                if (interfaceC2855018r != null) {
                    interfaceC2855018r.LIZIZ(new C020W(this, context, 7));
                }
                C500260Jjc.LJIILIIL(view);
                AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
                AssemViewModel value = assemVMLazy.getValue();
                subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, new C020Z(view, this, 11));
                CompetitionInfo.GroupShowInfo groupShowInfo = competitionInfo.groupShowInfo;
                if (groupShowInfo != null && groupShowInfo.status == 1) {
                    long jLIZJ = groupShowInfo.endTimestamp - (C963140bAe.LIZJ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    if (!competitionInfo.teamInfos.isEmpty() && competitionInfo.teamInfos.size() > 1 && jLIZJ > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (CompetitionResultsTeamInfo competitionResultsTeamInfo : competitionInfo.teamInfos) {
                            if (!competitionResultsTeamInfo.members.isEmpty() && ((CompetitionTeamMemberInfo) ListProtector.get(competitionResultsTeamInfo.members, 0)).user != null) {
                                arrayList.add(ListProtector.get(competitionResultsTeamInfo.members, 0));
                            } else {
                                return;
                            }
                        }
                        if (arrayList.size() == 2) {
                            this.LLJILJILJ = ((CompetitionResultsTeamInfo) ListProtector.get(competitionInfo.teamInfos, 0)).teamId;
                            this.LLJILLL = ((CompetitionResultsTeamInfo) ListProtector.get(competitionInfo.teamInfos, 1)).teamId;
                            CompetitionCommon competitionCommon = competitionInfo.bizCommon;
                            if (competitionCommon != null) {
                                j = competitionCommon.competitionId;
                            } else {
                                j = 0;
                            }
                            CompetitionUserBase competitionUserBase = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 0)).user;
                            if (competitionUserBase != null) {
                                j2 = competitionUserBase.userId;
                            } else {
                                j2 = 0;
                            }
                            CompetitionUserBase competitionUserBase2 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 0)).user;
                            String str3 = "";
                            if (competitionUserBase2 == null || (str = competitionUserBase2.nickname) == null) {
                                str = "";
                            }
                            CompetitionUserBase competitionUserBase3 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 0)).user;
                            if (competitionUserBase3 != null) {
                                imageModel2 = competitionUserBase3.avatar;
                            }
                            this.LLJIJIL = new AnonymousClass0194(j2, str, imageModel2, ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 0)).score, j, 0L);
                            CompetitionUserBase competitionUserBase4 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 1)).user;
                            if (competitionUserBase4 != null) {
                                j3 = competitionUserBase4.userId;
                            } else {
                                j3 = 0;
                            }
                            CompetitionUserBase competitionUserBase5 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 1)).user;
                            if (competitionUserBase5 != null && (str2 = competitionUserBase5.nickname) != null) {
                                str3 = str2;
                            }
                            CompetitionUserBase competitionUserBase6 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 1)).user;
                            if (competitionUserBase6 != null) {
                                imageModel = competitionUserBase6.avatar;
                            } else {
                                imageModel = null;
                            }
                            this.LLJILJIL = new AnonymousClass0194(j3, str3, imageModel, ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 1)).score, j, 0L);
                            Map<String, BattleComboInfo> map = competitionInfo.comboInfoMap;
                            CompetitionUserBase competitionUserBase7 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 0)).user;
                            if (competitionUserBase7 != null) {
                                string = Long.valueOf(competitionUserBase7.userId).toString();
                            } else {
                                string = null;
                            }
                            BattleComboInfo battleComboInfo = map.get(string);
                            if (battleComboInfo != null) {
                                j4 = battleComboInfo.comboCount;
                            } else {
                                j4 = 0;
                            }
                            Map<String, BattleComboInfo> map2 = competitionInfo.comboInfoMap;
                            CompetitionUserBase competitionUserBase8 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 1)).user;
                            if (competitionUserBase8 != null) {
                                string2 = Long.valueOf(competitionUserBase8.userId).toString();
                            } else {
                                string2 = null;
                            }
                            BattleComboInfo battleComboInfo2 = map2.get(string2);
                            if (battleComboInfo2 != null) {
                                j5 = battleComboInfo2.comboCount;
                            } else {
                                j5 = 0;
                            }
                            w.LIZ.getClass();
                            String strLJIIIZ = w.LJIIIZ();
                            String strLJIIL = w.LJIIL();
                            DataChannel dataChannel2 = this.LLJ;
                            String str4 = CardStruct.IStatusCode.DEFAULT;
                            if (dataChannel2 == null || (room3 = (Room) dataChannel2.gg0(RoomChannel.class)) == null || (string3 = Long.valueOf(room3.getOwnerUserId()).toString()) == null) {
                                string3 = CardStruct.IStatusCode.DEFAULT;
                            }
                            DataChannel dataChannel3 = this.LLJ;
                            if (dataChannel3 != null && (room2 = (Room) dataChannel3.gg0(RoomChannel.class)) != null && (string4 = Long.valueOf(room2.getId()).toString()) != null) {
                                str4 = string4;
                            }
                            String strValueOf2 = String.valueOf(j);
                            CompetitionUserBase competitionUserBase9 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 0)).user;
                            if (competitionUserBase9 != null) {
                                j6 = competitionUserBase9.userId;
                            } else {
                                j6 = 0;
                            }
                            String strValueOf3 = "99+";
                            if (j4 > 99) {
                                strValueOf = "99+";
                            } else {
                                strValueOf = String.valueOf(j4);
                            }
                            CompetitionUserBase competitionUserBase10 = ((CompetitionTeamMemberInfo) ListProtector.get(arrayList, 1)).user;
                            if (competitionUserBase10 != null) {
                                j7 = competitionUserBase10.userId;
                            } else {
                                j7 = 0;
                            }
                            if (j5 <= 99) {
                                strValueOf3 = String.valueOf(j5);
                            }
                            this.LLJJIII = new AnonymousClass0193(strLJIIIZ, strLJIIL, string3, str4, strValueOf2, j6, strValueOf, j7, strValueOf3);
                            this.LLJJIJI = EnumC2856018s.STARTED;
                            this.LLJJ = ((CompetitionResultsTeamInfo) ListProtector.get(competitionInfo.teamInfos, 0)).contributors;
                            this.LLJJI = ((CompetitionResultsTeamInfo) ListProtector.get(competitionInfo.teamInfos, 1)).contributors;
                            HandlerHook.viewPost(view, new Runnable() { // from class: X.018q
                                public final void LIZ() {
                                    C500260Jjc.LLFFF(view);
                                    InterfaceC2855018r interfaceC2855018r2 = this.LLJI;
                                    if (interfaceC2855018r2 != null) {
                                        interfaceC2855018r2.start();
                                    }
                                    InterfaceC2855018r interfaceC2855018r3 = this.LLJI;
                                    if (interfaceC2855018r3 != null) {
                                        interfaceC2855018r3.LIZ(((CompetitionResultsTeamInfo) ListProtector.get(competitionInfo.teamInfos, 0)).contributors);
                                    }
                                    InterfaceC2855018r interfaceC2855018r4 = this.LLJI;
                                    if (interfaceC2855018r4 != null) {
                                        interfaceC2855018r4.LJ(((CompetitionResultsTeamInfo) ListProtector.get(competitionInfo.teamInfos, 1)).contributors);
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("GroupLiveMvpSeatAssem@92f0.showMvpSeatOnViewCreated$2");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("GroupLiveMvpSeatAssem@92f0.showMvpSeatOnViewCreated$2");
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    public final void Go(CompetitionStart competitionStart, long j) {
        long j2;
        String string;
        String strValueOf;
        Room room;
        String string2;
        Room room2;
        List<CompetitionTeamBase> list;
        this.LLJJIJI = EnumC2856018s.STARTED;
        long jLIZJ = competitionStart.endTimestamp - (C963140bAe.LIZJ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        ArrayList arrayList = new ArrayList();
        CompetitionInitiateInfo competitionInitiateInfo = competitionStart.initiateInfo;
        if (competitionInitiateInfo != null && (list = competitionInitiateInfo.teams) != null) {
            Iterator<CompetitionTeamBase> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        if (arrayList.size() != 2) {
            return;
        }
        long j3 = 0;
        if (jLIZJ <= 0) {
            return;
        }
        this.LLJILJILJ = ((CompetitionTeamBase) ListProtector.get(arrayList, 0)).teamId;
        this.LLJILLL = ((CompetitionTeamBase) ListProtector.get(arrayList, 1)).teamId;
        this.LLJIJIL = new AnonymousClass0194(((CompetitionUserBase) ListProtector.get(((CompetitionTeamBase) ListProtector.get(arrayList, 0)).users, 0)).userId, ((CompetitionUserBase) ListProtector.get(((CompetitionTeamBase) ListProtector.get(arrayList, 0)).users, 0)).nickname, ((CompetitionUserBase) ListProtector.get(((CompetitionTeamBase) ListProtector.get(arrayList, 0)).users, 0)).avatar, 0L, j, 0L);
        this.LLJILJIL = new AnonymousClass0194(((CompetitionUserBase) ListProtector.get(((CompetitionTeamBase) ListProtector.get(arrayList, 1)).users, 0)).userId, ((CompetitionUserBase) ListProtector.get(((CompetitionTeamBase) ListProtector.get(arrayList, 1)).users, 0)).nickname, ((CompetitionUserBase) ListProtector.get(((CompetitionTeamBase) ListProtector.get(arrayList, 1)).users, 0)).avatar, 0L, j, 0L);
        BattleComboInfo battleComboInfo = competitionStart.comboInfoMap.get(String.valueOf(((CompetitionUserBase) ListProtector.get(((CompetitionTeamBase) ListProtector.get(arrayList, 0)).users, 0)).userId));
        if (battleComboInfo != null) {
            j2 = battleComboInfo.comboCount;
        } else {
            j2 = 0;
        }
        BattleComboInfo battleComboInfo2 = competitionStart.comboInfoMap.get(String.valueOf(((CompetitionUserBase) ListProtector.get(((CompetitionTeamBase) ListProtector.get(arrayList, 1)).users, 0)).userId));
        if (battleComboInfo2 != null) {
            j3 = battleComboInfo2.comboCount;
        }
        w.LIZ.getClass();
        String strLJIIIZ = w.LJIIIZ();
        String strLJIIL = w.LJIIL();
        DataChannel dataChannel = this.LLJ;
        String str = CardStruct.IStatusCode.DEFAULT;
        if (dataChannel == null || (room2 = (Room) dataChannel.gg0(RoomChannel.class)) == null || (string = Long.valueOf(room2.getOwnerUserId()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null && (string2 = Long.valueOf(room.getId()).toString()) != null) {
            str = string2;
        }
        String strValueOf2 = String.valueOf(j);
        long j4 = ((CompetitionUserBase) ListProtector.get(((CompetitionTeamBase) ListProtector.get(arrayList, 0)).users, 0)).userId;
        String strValueOf3 = "99+";
        if (j2 > 99) {
            strValueOf = "99+";
        } else {
            strValueOf = String.valueOf(j2);
        }
        long j5 = ((CompetitionUserBase) ListProtector.get(((CompetitionTeamBase) ListProtector.get(arrayList, 1)).users, 0)).userId;
        if (j3 <= 99) {
            strValueOf3 = String.valueOf(j3);
        }
        this.LLJJIII = new AnonymousClass0193(strLJIIIZ, strLJIIL, string, str, strValueOf2, j4, strValueOf, j5, strValueOf3);
    }

    public final void Ho(CompetitionSettleEnd competitionSettleEnd, View view) {
        InterfaceC2855018r interfaceC2855018r;
        InterfaceC2855018r interfaceC2855018r2;
        CompetitionResultsTeamInfo competitionResultsTeamInfo = (CompetitionResultsTeamInfo) C13LP.LJJJLZIJ(0, competitionSettleEnd.teamInfos);
        if (competitionResultsTeamInfo == null) {
            return;
        }
        this.LLJJIJI = EnumC2856018s.FINISHED;
        long j = competitionResultsTeamInfo.teamId;
        if (j == this.LLJILJILJ) {
            int i = competitionResultsTeamInfo.result;
            if (i == 1) {
                InterfaceC2855018r interfaceC2855018r3 = this.LLJI;
                if (interfaceC2855018r3 != null) {
                    interfaceC2855018r3.LIZLLL(true);
                }
            } else if (i == 2 && (interfaceC2855018r2 = this.LLJI) != null) {
                interfaceC2855018r2.LIZLLL(false);
            }
        } else if (j == this.LLJILLL) {
            int i2 = competitionResultsTeamInfo.result;
            if (i2 == 1) {
                InterfaceC2855018r interfaceC2855018r4 = this.LLJI;
                if (interfaceC2855018r4 != null) {
                    interfaceC2855018r4.LIZLLL(false);
                }
            } else if (i2 == 2 && (interfaceC2855018r = this.LLJI) != null) {
                interfaceC2855018r.LIZLLL(true);
            }
        }
        long j2 = GroupLiveConfig.INSTANCE.getGetValue().matchConfig.resultDisplaySec;
        C11JF c11jf = this.LLJJIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJIJIL = (C11JF) C11NZ.LJLJJLL(j2, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new C516201zk(view, 78), new C516201zk(view, 79));
    }
}
