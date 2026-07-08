package kotlin.jvm.internal;

import X.C09AY;
import X.C1713870uhV;
import X.C1717770unn;
import X.C1729860v7I;
import X.C2097608Jq;
import X.EnumC743970TGh;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public class AwS40S0000100_26 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0000100_26(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS40S0000100_26 awS40S0000100_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("input_box_name", "one_box_search");
        laneParams.plusAssign("stay_time", String.valueOf(awS40S0000100_26.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS40S0000100_26 awS40S0000100_26, Object obj) {
        String str;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        long jCurrentTimeMillis = System.currentTimeMillis() - awS40S0000100_26.j0;
        if (zBooleanValue && ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJFF(EnumC743970TGh.BNPL)) {
            str = "succeed";
        } else {
            str = "fail";
        }
        C1717770unn.LJIIIZ().onEventV3("rd_pipo_bnpl_df_download_end", C2097608Jq.LJIIJ(new Pair("bnpl_source_id", "init_task"), new Pair("download_scene", "initTask"), new Pair("download_status", str), new Pair("download_cost", String.valueOf(jCurrentTimeMillis)), new Pair("download_retry_count", CardStruct.IStatusCode.DEFAULT)));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS40S0000100_26 awS40S0000100_26, Object obj) throws JSONException {
        String str;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        long jCurrentTimeMillis = System.currentTimeMillis() - awS40S0000100_26.j0;
        if (zBooleanValue && ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJI()) {
            str = "succeed";
        } else {
            str = "failed";
        }
        C1713870uhV.LIZ("rd_pipo_payment_df_download_end", C2097608Jq.LJIIIIZZ(new Pair("source_id", "init_task"), new Pair("download_scene", "initTask"), new Pair("download_status", str), new Pair("download_cost", String.valueOf(jCurrentTimeMillis)), new Pair("download_retry_count", CardStruct.IStatusCode.DEFAULT)));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS40S0000100_26 awS40S0000100_26, Object obj) {
        ((Map) obj).put("duration", String.valueOf(awS40S0000100_26.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS40S0000100_26 awS40S0000100_26, Object obj) {
        return C1729860v7I.LIZ((C1729860v7I) obj, null, null, 0, null, awS40S0000100_26.j0, null, null, null, 239);
    }
}
