package kotlin.jvm.internal;

import X.C09AY;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C20441214yg;
import X.C588290N5n;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C917840Zza;
import X.C918410a0V;
import X.C918650a0t;
import X.C920310a3Z;
import X.C921640a5i;
import X.C924630aAX;
import X.C944860ahA;
import X.C945060ahU;
import X.C953100auS;
import X.C953230auf;
import X.C953770avX;
import X.C955410ayB;
import X.C955540ayO;
import X.C955590ayT;
import X.C956740b0K;
import X.C956930b0d;
import X.C958370b2x;
import X.C971040bNO;
import X.EnumC952840au2;
import X.EnumC952890au7;
import X.EnumC959580b4u;
import X.InterfaceC955420ayC;
import X.InterfaceC955990az7;
import X.InterfaceC956210azT;
import X.InterfaceC960800b6s;
import Y.AfS184S0100000_15;
import android.os.Handler;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveInviteFriendFreqCtrl;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS19S0300100_15 extends C09AY implements Function0 {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS19S0300100_15 awS19S0300100_15) {
        long id;
        ((C944860ahA) awS19S0300100_15.l0).getClass();
        C20441214yg.LIZIZ("ToolbarCoHostBehavior", "onReceiveFriendGuide reject by coHostFriendNoticeService");
        if (InterfaceC960800b6s.LLLLIIL.LIZIZ().booleanValue() && C958370b2x.LIZJ()) {
            ((C944860ahA) awS19S0300100_15.l0).LLL.LIZ(String.valueOf(((CapsuleMessage) awS19S0300100_15.l1).getMessageId()));
            DataChannel dataChannel = ((C944860ahA) awS19S0300100_15.l0).LLJZ;
            if (dataChannel != null) {
                dataChannel.SX0(C956930b0d.class, Long.valueOf(((CapsuleMessage) awS19S0300100_15.l1).getMessageId()));
            }
            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Jf0(awS19S0300100_15.j3, (CapsuleMessage) awS19S0300100_15.l1, true, null);
            InterfaceC955420ayC interfaceC955420ayCLIZ = C915980Zwa.LJI().LIZ();
            User user = ((CapsuleBizParamsCohost) awS19S0300100_15.l2).inviteeUserInfo;
            long id2 = 0;
            if (user != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            interfaceC955420ayCLIZ.LJLJJLL(id);
            User user2 = ((CapsuleBizParamsCohost) awS19S0300100_15.l2).inviteeUserInfo;
            if (user2 != null) {
                id2 = user2.getId();
            }
            C945060ahU c945060ahU = new C945060ahU(((CapsuleBizParamsCohost) awS19S0300100_15.l2).isFriend, id2, false);
            DataChannel dataChannel2 = ((C944860ahA) awS19S0300100_15.l0).LLJZ;
            if (dataChannel2 != null) {
                dataChannel2.SX0(C956740b0K.class, c945060ahU);
            }
            ((C944860ahA) awS19S0300100_15.l0).LJIIIZ(c945060ahU);
            C11JF c11jf = ((C944860ahA) awS19S0300100_15.l0).LLJLILLLLZIIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            ((C944860ahA) awS19S0300100_15.l0).LLJLILLLLZIIL = (C11JF) C11NZ.LJLJJLL(30L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS184S0100000_15((C944860ahA) awS19S0300100_15.l0, 148));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS19S0300100_15 awS19S0300100_15) {
        C955410ayB.LJI(C915980Zwa.LJIIIZ().LIZLLL(), "popup", "switch_random_to_apply");
        C915980Zwa.LJIIIZ().LIZ(EnumC959580b4u.WITHDRAW_QUICK_CO_HOST_TO_APPLY, null);
        InterfaceC956210azT interfaceC956210azTG4 = ((InterfaceC955990az7) awS19S0300100_15.l0).g4();
        if (interfaceC956210azTG4 != null) {
            interfaceC956210azTG4.GP((C955590ayT) awS19S0300100_15.l1, (C955540ayO) awS19S0300100_15.l2, false, awS19S0300100_15.j3);
        }
        ((C955590ayT) awS19S0300100_15.l1).LJIIJJI = false;
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS19S0300100_15 awS19S0300100_15) {
        Function0 function0 = (Function0) awS19S0300100_15.l0;
        if (function0 != null) {
            function0.invoke();
        }
        ((C588290N5n) ((C918650a0t) awS19S0300100_15.l1).LJIIJJI.getValue()).LIZJ.add(Long.valueOf(System.currentTimeMillis()));
        ((C918650a0t) awS19S0300100_15.l1).LJIIJ.add(Long.valueOf(awS19S0300100_15.j3));
        Handler handler = (Handler) ((C918650a0t) awS19S0300100_15.l1).LJIIIZ.getValue();
        final C918650a0t c918650a0t = (C918650a0t) awS19S0300100_15.l1;
        final long j = awS19S0300100_15.j3;
        final Function1 function1 = (Function1) awS19S0300100_15.l2;
        C786410Ut5.LJLIIL(MultiLiveInviteFriendFreqCtrl.INSTANCE.getSettingValue().singleUserTimeWindow * ((long) LSPassThroughRecordSizeConfig.DEFAULT), handler, new Runnable() { // from class: X.0a0H
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.adaptOutsideFriendRequest$1$1");
                try {
                    c918650a0t.LJIIJ.remove(Long.valueOf(j));
                    function1.invoke(Long.valueOf(j));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.adaptOutsideFriendRequest$1$1");
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS19S0300100_15 awS19S0300100_15) {
        C918650a0t c918650a0t = (C918650a0t) awS19S0300100_15.l0;
        long j = awS19S0300100_15.j3;
        C918410a0V c918410a0V = (C918410a0V) awS19S0300100_15.l1;
        c918650a0t.getClass();
        C921640a5i.LIZ(1, c918410a0V.LIZLLL, j, "room");
        C924630aAX.LJJII(j);
        ((C920310a3Z) c918650a0t.LJIILIIL.getValue()).LIZ(String.valueOf(j));
        Function0 function0 = (Function0) awS19S0300100_15.l2;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS19S0300100_15 awS19S0300100_15) {
        EnumC952890au7 enumC952890au7;
        C953230auf c953230auf = C953230auf.LIZ;
        String str = ((C953770avX) awS19S0300100_15.l0).LJII;
        Long lValueOf = Long.valueOf(awS19S0300100_15.j3);
        String str2 = ((C953770avX) awS19S0300100_15.l0).LJIIIZ;
        C917840Zza c917840Zza = (C917840Zza) awS19S0300100_15.l1;
        EnumC952840au2 enumC952840au2 = EnumC952840au2.DIALOG_SAVE;
        C953100auS c953100auS = ((C971040bNO) awS19S0300100_15.l2).LJI;
        if (c953100auS != null) {
            enumC952890au7 = c953100auS.LIZJ;
        } else {
            enumC952890au7 = null;
        }
        c953230auf.getClass();
        C953230auf.LJIJJ(str, lValueOf, str2, c917840Zza, enumC952840au2, enumC952890au7);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS19S0300100_15) (LINE:83886087) kotlin.jvm.internal.AwS19S0300100_15.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS19S0300100_15(C918650a0t c918650a0t, C918650a0t c918650a0t2, long j, C918410a0V c918410a0V, Function0<Unit> function0) {
        Object obj;
        super(0);
        this.$t = function0;
        this.l0 = c918650a0t;
        this.j3 = c918650a0t2;
        this.l1 = obj;
        this.l2 = c918410a0V;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S0300100_15(C944860ahA c944860ahA, CapsuleMessage capsuleMessage, long j, CapsuleBizParamsCohost capsuleBizParamsCohost, int i) {
        super(0);
        this.$t = i;
        this.l0 = c944860ahA;
        this.l1 = capsuleMessage;
        this.j3 = j;
        this.l2 = capsuleBizParamsCohost;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S0300100_15(C953770avX c953770avX, long j, C917840Zza c917840Zza, C971040bNO c971040bNO, int i) {
        super(0);
        this.$t = i;
        this.l0 = c953770avX;
        this.j3 = j;
        this.l1 = c917840Zza;
        this.l2 = c971040bNO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S0300100_15(InterfaceC955990az7 interfaceC955990az7, C955590ayT c955590ayT, C955540ayO c955540ayO, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC955990az7;
        this.l1 = c955590ayT;
        this.l2 = c955540ayO;
        this.j3 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS19S0300100_15) (LINE:84148233) kotlin.jvm.internal.AwS19S0300100_15.l2 java.lang.Object, block:B:2:0x0000 */
    public AwS19S0300100_15(Function0 function0, Function0<Unit> function02, C918650a0t c918650a0t, long j, Function1<? super Long, Unit> function1) {
        Object obj;
        super(0);
        this.$t = function1;
        this.l0 = function0;
        this.l1 = function02;
        this.j3 = c918650a0t;
        this.l2 = obj;
    }
}
