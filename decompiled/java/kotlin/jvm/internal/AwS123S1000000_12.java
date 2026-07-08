package kotlin.jvm.internal;

import X.C09AY;
import X.C0UUC;
import X.C1161920gLG;
import X.C500260Jjc;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import android.os.Bundle;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public class AwS123S1000000_12 extends C09AY implements Function2 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1000000_12(String str, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS123S1000000_12 awS123S1000000_12, Object obj, Object obj2) {
        DataChannel dataChannel = (DataChannel) obj;
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LIZJ(awS123S1000000_12.s0, String.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)), dataChannel, new Bundle(), null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS123S1000000_12 awS123S1000000_12, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            C0UUC c0uuc = C0UUC.LIZ;
            EnumC773040UUc enumC773040UUc = EnumC773040UUc.STICKER;
            EnumC771230UNd enumC771230UNd = EnumC771230UNd.APPLYING;
            String str = awS123S1000000_12.s0;
            c0uuc.getClass();
            C0UUC.LIZIZ(enumC773040UUc, enumC771230UNd, str);
        } else {
            C0UUC c0uuc2 = C0UUC.LIZ;
            EnumC773040UUc enumC773040UUc2 = EnumC773040UUc.STICKER;
            EnumC771230UNd enumC771230UNd2 = EnumC771230UNd.APPLY_FAILED;
            c0uuc2.getClass();
            C0UUC.LIZIZ(enumC773040UUc2, enumC771230UNd2, null);
        }
        return Unit.LIZ;
    }
}
