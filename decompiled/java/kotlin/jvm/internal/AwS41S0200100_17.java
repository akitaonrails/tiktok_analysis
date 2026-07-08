package kotlin.jvm.internal;

import X.AbstractC1140580fmq;
import X.C09AY;
import X.C1123380fL6;
import X.C1125090fNr;
import X.C1125360fOI;
import X.C1139900flk;
import X.C1161920gLG;
import X.C150400hq;
import X.C2188811AlT;
import X.C495520Jby;
import X.EnumC1140010flv;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RandomGiftPanelBanner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AwS41S0200100_17 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS41S0200100_17 awS41S0200100_17) {
        C1139900flk c1139900flk = (C1139900flk) awS41S0200100_17.l0;
        if (c1139900flk != null) {
            c1139900flk.LJI = false;
            c1139900flk.LJIIJ = awS41S0200100_17.j2;
            c1139900flk.LJIIIIZZ = EnumC1140010flv.CANCEL;
        }
        AbstractC1140580fmq abstractC1140580fmq = (AbstractC1140580fmq) awS41S0200100_17.l1;
        if (abstractC1140580fmq != null) {
            abstractC1140580fmq.LIZ(c1139900flk);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS41S0200100_17 awS41S0200100_17) {
        Long lValueOf;
        Room room;
        if (!C1125360fOI.LIZIZ(awS41S0200100_17.j2, true)) {
            if (C1123380fL6.LIZIZ()) {
                C1123380fL6.LIZJ(301, false);
            }
            C150400hq.LIZIZ(awS41S0200100_17.j2);
            DataChannel dataChannel = ((C1125090fNr) awS41S0200100_17.l0).LL;
            Long lValueOf2 = null;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                lValueOf = Long.valueOf(room.getOwnerUserId());
                lValueOf2 = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((RandomGiftPanelBanner) awS41S0200100_17.l1).schemaUrl);
            sbLIZ.append("&gift_id=");
            sbLIZ.append(awS41S0200100_17.j2);
            sbLIZ.append("&anchor_id=");
            sbLIZ.append(lValueOf);
            sbLIZ.append("&room_id=");
            sbLIZ.append(lValueOf2);
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((C1125090fNr) awS41S0200100_17.l0).LLILLJJLI, UriProtector.parse(new C495520Jby(C2188811AlT.LIZIZ(sbLIZ)).LIZLLL()));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0200100_17(long j, C1125090fNr c1125090fNr, RandomGiftPanelBanner randomGiftPanelBanner, int i) {
        super(0);
        this.$t = i;
        this.j2 = j;
        this.l0 = c1125090fNr;
        this.l1 = randomGiftPanelBanner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0200100_17(C1139900flk c1139900flk, long j, AbstractC1140580fmq abstractC1140580fmq, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1139900flk;
        this.j2 = j;
        this.l1 = abstractC1140580fmq;
    }
}
