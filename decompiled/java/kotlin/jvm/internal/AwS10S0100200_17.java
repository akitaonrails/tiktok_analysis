package kotlin.jvm.internal;

import X.C09AY;
import X.C1090310eTl;
import X.C1090320eTm;
import X.C1094360eaI;
import X.C1095250ebj;
import X.C1113480f58;
import X.C1148070fyv;
import X.C1161920gLG;
import X.C496760Jdy;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC1094410eaN;
import Y.ARunnableS103S0100000_3;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelChannel;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelEvent;
import com.bytedance.android.livesdk.impl.revenue.level.viewmodel.UserLevelViewModel;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS10S0100200_17 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS10S0100200_17 awS10S0100200_17, Object obj) {
        C1094360eaI c1094360eaI;
        Integer numValueOf;
        int i;
        BadgeStruct badgeStruct;
        Integer numValueOf2;
        long jLongValue = ((Number) obj).longValue();
        DataChannel dataChannel = ((UserLevelViewModel) awS10S0100200_17.l0).getDataChannel();
        BadgeStruct badgeStruct2 = null;
        if (dataChannel != null) {
            c1094360eaI = (C1094360eaI) dataChannel.gg0(UserLevelChannel.class);
        } else {
            c1094360eaI = null;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Long l = (Long) dataChannelGlobal.gg0(C1148070fyv.class);
        dataChannelGlobal.JQ2(C1148070fyv.class, Long.valueOf(awS10S0100200_17.j1));
        long j = awS10S0100200_17.j1;
        if (l != null && l.longValue() == j) {
            Boolean bool = Boolean.FALSE;
            Long lValueOf = Long.valueOf(awS10S0100200_17.j1);
            if (c1094360eaI != null) {
                numValueOf2 = Integer.valueOf(c1094360eaI.LIZ);
            } else {
                numValueOf2 = null;
            }
            C496760Jdy.LJI(bool, l, lValueOf, numValueOf2, "same mode failed", jLongValue - awS10S0100200_17.j2);
        } else {
            Boolean bool2 = Boolean.TRUE;
            Long lValueOf2 = Long.valueOf(awS10S0100200_17.j1);
            if (c1094360eaI != null) {
                numValueOf = Integer.valueOf(c1094360eaI.LIZ);
            } else {
                numValueOf = null;
            }
            C496760Jdy.LJI(bool2, l, lValueOf2, numValueOf, "success", jLongValue - awS10S0100200_17.j2);
        }
        if (c1094360eaI != null) {
            long j2 = awS10S0100200_17.j1;
            EnumC1094410eaN enumC1094410eaN = EnumC1094410eaN.USER_LEVEL_SWITCH_STATUS_ON;
            if (j2 == enumC1094410eaN.getValue()) {
                i = 1;
            } else {
                i = 2;
            }
            long j3 = awS10S0100200_17.j1;
            EnumC1094410eaN enumC1094410eaN2 = EnumC1094410eaN.USER_LEVEL_SWITCH_STATUS_OFF;
            if (j3 == enumC1094410eaN2.getValue()) {
                badgeStruct = null;
            } else {
                badgeStruct = c1094360eaI.LIZJ;
            }
            if (awS10S0100200_17.j1 != enumC1094410eaN2.getValue()) {
                badgeStruct2 = c1094360eaI.LIZLLL;
            }
            C1094360eaI c1094360eaILIZ = C1094360eaI.LIZ(c1094360eaI.LIZ, c1094360eaI.LIZIZ, badgeStruct, badgeStruct2, c1094360eaI.LJ, i, c1094360eaI.LJI, c1094360eaI.LJII, c1094360eaI.LJIIIIZZ, c1094360eaI.LJIIIZ, c1094360eaI.LJIIJ, c1094360eaI.LJIIJJI, 4, c1094360eaI.LJIILIIL);
            UserLevelViewModel userLevelViewModel = (UserLevelViewModel) awS10S0100200_17.l0;
            long j4 = awS10S0100200_17.j1;
            DataChannel dataChannel2 = userLevelViewModel.getDataChannel();
            if (dataChannel2 != null) {
                dataChannel2.zW(UserLevelChannel.class, c1094360eaILIZ);
            }
            if (j4 == enumC1094410eaN2.getValue()) {
                DataChannel dataChannel3 = userLevelViewModel.getDataChannel();
                if (dataChannel3 != null) {
                    dataChannel3.LC0(UserLevelEvent.class, C1090320eTm.LIZ);
                }
            } else if (j4 == enumC1094410eaN.getValue()) {
                DataChannel dataChannel4 = userLevelViewModel.getDataChannel();
                if (dataChannel4 != null) {
                    dataChannel4.LC0(UserLevelEvent.class, C1090310eTl.LIZ);
                }
                userLevelViewModel.gN("opt_api", Boolean.FALSE, "");
                C786410Ut5.LJLIIL(1000L, C1095250ebj.LIZ, new ARunnableS103S0100000_3((Object) new AwS561S0100000_17(userLevelViewModel, 184), 134));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS10S0100200_17 awS10S0100200_17, Object obj) {
        C1094360eaI c1094360eaI;
        long jLongValue = ((Number) obj).longValue();
        C766270U4b.LIZLLL(2131842705);
        DataChannel dataChannel = ((UserLevelViewModel) awS10S0100200_17.l0).getDataChannel();
        Integer numValueOf = null;
        if (dataChannel != null) {
            c1094360eaI = (C1094360eaI) dataChannel.gg0(UserLevelChannel.class);
        } else {
            c1094360eaI = null;
        }
        Long l = (Long) DataChannelGlobal.LLILZ.gg0(C1148070fyv.class);
        Boolean bool = Boolean.FALSE;
        Long lValueOf = Long.valueOf(awS10S0100200_17.j1);
        if (c1094360eaI != null) {
            numValueOf = Integer.valueOf(c1094360eaI.LIZ);
        }
        C496760Jdy.LJI(bool, l, lValueOf, numValueOf, "network failed", jLongValue - awS10S0100200_17.j2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS10S0100200_17 awS10S0100200_17, Object obj) {
        ((PublicAreaMessageCommon.CreatorSuccessInfo.Topic) awS10S0100200_17.l0).LIZ = ((Boolean) obj).booleanValue();
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        long j = awS10S0100200_17.j1;
        long j2 = awS10S0100200_17.j2;
        C1113480f58 c1113480f58 = new C1113480f58();
        c1113480f58.LIZ = ((PublicAreaMessageCommon.CreatorSuccessInfo.Topic) awS10S0100200_17.l0).tagType;
        iPublicScreenService.ke0(j, j2, c1113480f58);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S0100200_17(UserLevelViewModel userLevelViewModel, long j, long j2, int i) {
        super(1);
        this.$t = i;
        this.l0 = userLevelViewModel;
        this.j1 = j;
        this.j2 = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S0100200_17(PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic, long j, long j2, int i) {
        super(1);
        this.$t = i;
        this.l0 = topic;
        this.j1 = j;
        this.j2 = j2;
    }
}
