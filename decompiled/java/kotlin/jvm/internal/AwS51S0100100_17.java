package kotlin.jvm.internal;

import X.AbstractC1098830ehV;
import X.C062P;
import X.C09AY;
import X.C0GSA;
import X.C1100170ejf;
import X.C1101750emD;
import X.C1101820emK;
import X.C1114120f6A;
import X.C1126380fPw;
import X.C1126390fPx;
import X.C1126400fPy;
import X.C1129740fVM;
import X.C1132910faT;
import X.C1145200fuI;
import X.C1146350fw9;
import X.C1161920gLG;
import X.C930940aKi;
import X.EnumC1083620eIy;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS51S0100100_17 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
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
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS51S0100100_17 awS51S0100100_17, Object obj) {
        boolean z;
        C1146350fw9 c1146350fw9 = (C1146350fw9) obj;
        if (Intrinsics.LJFF(c1146350fw9.LLJILJILJ, (Long) awS51S0100100_17.l0) && c1146350fw9.LL == awS51S0100100_17.j1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AwS51S0100100_17 awS51S0100100_17, Object obj) {
        ((C062P) obj).LIZ = new C1145200fuI(awS51S0100100_17.j1, EnumC1083620eIy.PREVIEW_CARD, (DataChannel) awS51S0100100_17.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS51S0100100_17 awS51S0100100_17, Object obj) {
        ((C1114120f6A) awS51S0100100_17.l0).LLILZ = awS51S0100100_17.j1;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS51S0100100_17 awS51S0100100_17, Object obj) {
        ((C1126380fPw) obj).LIZ(new AwS51S0100100_17((C0GSA) awS51S0100100_17.l0, awS51S0100100_17.j1, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS51S0100100_17 awS51S0100100_17, Object obj) {
        C1126390fPx c1126390fPx = (C1126390fPx) obj;
        c1126390fPx.LIZJ = Collections.singletonList((C0GSA) awS51S0100100_17.l0);
        C1126390fPx.LIZJ(c1126390fPx, ((C0GSA) awS51S0100100_17.l0).getBorderAlpha1(), 0, new AwS620S0100000_6((C0GSA) awS51S0100100_17.l0, 107));
        c1126390fPx.LIZLLL = awS51S0100100_17.j1;
        c1126390fPx.LJ = C1126400fPy.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS51S0100100_17 awS51S0100100_17, Object obj) {
        C1132910faT c1132910faT = (C1132910faT) obj;
        c1132910faT.LIZLLL.isCurrentRoom(awS51S0100100_17.j1);
        return Boolean.valueOf(((List) awS51S0100100_17.l0).add(c1132910faT));
    }

    public static final Object invoke$5(AwS51S0100100_17 awS51S0100100_17, Object obj) {
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (owner = room.getOwner()) != null) {
            long j = awS51S0100100_17.j1;
            IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
            Long lValueOf = Long.valueOf(j);
            Boolean bool = Boolean.FALSE;
            iGiftService.openGiftDialog("gift", new C1129740fVM("viewer_wishes_queue", lValueOf, bool, bool, owner, null, false, 192));
        }
        ((ViewerWishesQueuePage) awS51S0100100_17.l0).zS("send_gift");
        ((ViewerWishesQueuePage) awS51S0100100_17.l0).close(1);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS51S0100100_17 awS51S0100100_17, Object obj) {
        C1101820emK c1101820emKLIZIZ;
        C1101820emK c1101820emKLIZIZ2 = C1101750emD.LIZIZ(((C1100170ejf) awS51S0100100_17.l0).LJII());
        if (c1101820emKLIZIZ2 != null) {
            c1101820emKLIZIZ2.LIZLLL = System.currentTimeMillis() - awS51S0100100_17.j1;
        }
        if ((obj instanceof AbstractC1098830ehV) && (c1101820emKLIZIZ = C1101750emD.LIZIZ(((C1100170ejf) awS51S0100100_17.l0).LJII())) != null) {
            c1101820emKLIZIZ.LJI = 1;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS51S0100100_17 awS51S0100100_17, Object obj) {
        ((C1114120f6A) awS51S0100100_17.l0).LLILLL = awS51S0100100_17.j1;
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS51S0100100_17 awS51S0100100_17, Object obj) {
        ((C1114120f6A) awS51S0100100_17.l0).LLILZLL = awS51S0100100_17.j1;
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS51S0100100_17 awS51S0100100_17, Object obj) {
        ((C1114120f6A) awS51S0100100_17.l0).LLILZIL = awS51S0100100_17.j1;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S0100100_17(long j, DataChannel dataChannel, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S0100100_17(long j, Long l, int i) {
        super(1);
        this.$t = i;
        this.l0 = l;
        this.j1 = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS51S0100100_17) (LINE:50462723) kotlin.jvm.internal.AwS51S0100100_17.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS51S0100100_17) (LINE:50462725) kotlin.jvm.internal.AwS51S0100100_17.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS51S0100100_17] */
    public AwS51S0100100_17(long j, long j2, List<C1132910faT> list) {
        long j3;
        Object obj;
        c09ay.$t = list;
        c09ay.j1 = j3;
        c09ay.l0 = obj;
        ?? c09ay = new C09AY(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S0100100_17(C0GSA c0gsa, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0gsa;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S0100100_17(C1100170ejf c1100170ejf, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1100170ejf;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S0100100_17(C1114120f6A c1114120f6A, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1114120f6A;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S0100100_17(ViewerWishesQueuePage viewerWishesQueuePage, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewerWishesQueuePage;
        this.j1 = j;
    }
}
