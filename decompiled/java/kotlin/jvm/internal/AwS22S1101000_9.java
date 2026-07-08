package kotlin.jvm.internal;

import X.AbstractC1732680vBq;
import X.AbstractC1732690vBr;
import X.C09AY;
import X.C0NSL;
import X.C197039127h;
import X.C598410NdX;
import X.C786410Ut5;
import Y.ACListenerS144S0100000_9;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.api.SeaLiveBillboardApi;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.BillboardApi;
import com.ss.android.ugc.aweme.offlinemode.ui.pagestate.OfflineModeDetailPageStateImp;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS22S1101000_9 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS22S1101000_9 awS22S1101000_9, Object obj) {
        long ownerUserId;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String strLJJJJZ = a0.LJJJJZ("/", C598410NdX.LJ(awS22S1101000_9.s0, "/aweme/v1/ttec/sea_content/live/billboards"));
        AbstractC1732680vBq abstractC1732680vBq = (AbstractC1732680vBq) awS22S1101000_9.l1;
        Room room = abstractC1732680vBq.LLILZIL;
        if (room != null) {
            room.getOwnerUserId();
        } else {
            abstractC1732680vBq.LJJIII("billboard_get_request", "api_start but no author id");
        }
        SeaLiveBillboardApi seaLiveBillboardApi = (SeaLiveBillboardApi) C0NSL.LIZ().create(SeaLiveBillboardApi.class);
        Room room2 = ((AbstractC1732680vBq) awS22S1101000_9.l1).LLILZIL;
        if (room2 != null) {
            ownerUserId = room2.getOwnerUserId();
        } else {
            ownerUserId = -1;
        }
        return new Pair(seaLiveBillboardApi.getBillboards(strLJJJJZ, ownerUserId, awS22S1101000_9.i2, zBooleanValue, awS22S1101000_9.s0), strLJJJJZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS22S1101000_9 awS22S1101000_9, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        c197039127h.setText(awS22S1101000_9.s0);
        c197039127h.setButtonSize(3);
        c197039127h.setButtonVariant(awS22S1101000_9.i2);
        C786410Ut5.U8(c197039127h, new ACListenerS144S0100000_9((OfflineModeDetailPageStateImp) awS22S1101000_9.l1, 120));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS22S1101000_9 awS22S1101000_9, Object obj) {
        long ownerUserId;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String strLJJJJZ = a0.LJJJJZ("/", C598410NdX.LJ(awS22S1101000_9.s0, "/aweme/v1/oec/live/billboard/get"));
        AbstractC1732690vBr abstractC1732690vBr = (AbstractC1732690vBr) awS22S1101000_9.l1;
        Room room = abstractC1732690vBr.LLILZIL;
        if (room != null) {
            room.getOwnerUserId();
        } else {
            abstractC1732690vBr.LJJIIJZLJL("billboard_get_request", "api_start but no author id");
        }
        BillboardApi billboardApi = (BillboardApi) C0NSL.LIZ().create(BillboardApi.class);
        Room room2 = ((AbstractC1732690vBr) awS22S1101000_9.l1).LLILZIL;
        if (room2 != null) {
            ownerUserId = room2.getOwnerUserId();
        } else {
            ownerUserId = -1;
        }
        return new Pair(billboardApi.getBillboards(strLJJJJZ, ownerUserId, awS22S1101000_9.i2, zBooleanValue, awS22S1101000_9.s0), strLJJJJZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S1101000_9(String str, int i, OfflineModeDetailPageStateImp offlineModeDetailPageStateImp, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i2 = i;
        this.l1 = offlineModeDetailPageStateImp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S1101000_9(String str, AbstractC1732680vBq abstractC1732680vBq, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l1 = abstractC1732680vBq;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S1101000_9(String str, AbstractC1732690vBr abstractC1732690vBr, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l1 = abstractC1732690vBr;
        this.i2 = i;
    }
}
