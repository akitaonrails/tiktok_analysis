package kotlin.jvm.internal;

import X.C09AY;
import X.C1BV2;
import X.C20340414iQ;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.ugc.live.sdk.message.data.warlock.WLDataModel;
import com.ss.ugc.live.sdk.message.data.warlock.WLType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AwS183S1100000_34 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS183S1100000_34 awS183S1100000_34) {
        WLDataModel wLDataModel = new WLDataModel();
        String str = awS183S1100000_34.s0;
        LiveWsMessage liveWsMessage = (LiveWsMessage) awS183S1100000_34.l1;
        wLDataModel.setType(WLType.COMMON);
        wLDataModel.setSubType("im_upside");
        wLDataModel.setName(str);
        wLDataModel.setResult(GsonProtectorUtils.toJson(C20340414iQ.LIZ(), liveWsMessage));
        return wLDataModel;
    }

    public static final Object invoke$1(AwS183S1100000_34 awS183S1100000_34) {
        ((C1BV2) awS183S1100000_34.l1).LIZIZ(awS183S1100000_34.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS183S1100000_34(C1BV2 c1bv2, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1bv2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS183S1100000_34(String str, LiveWsMessage liveWsMessage, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = liveWsMessage;
    }
}
