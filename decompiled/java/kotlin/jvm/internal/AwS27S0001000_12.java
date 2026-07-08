package kotlin.jvm.internal;

import X.C09AY;
import X.C0WZX;
import X.C2204961BRm;
import X.C773210UUt;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.livesdk.chatroom.api.LinkReviewApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS27S0001000_12 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f982i0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0001000_12(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f982i0 = i;
    }

    public static final Object invoke$0(AwS27S0001000_12 awS27S0001000_12, Object obj) {
        int i;
        LinkReviewApi linkReviewApi = (LinkReviewApi) obj;
        int i2 = awS27S0001000_12.f982i0;
        if (i2 != 2 && i2 != 13) {
            i = 0;
        } else {
            i = 3;
        }
        return linkReviewApi.requestViolation(i);
    }

    public static final Object invoke$1(AwS27S0001000_12 awS27S0001000_12, Object obj) {
        return C2204961BRm.LJJJJZI(awS27S0001000_12.f982i0, new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8JkU7S83oC39JceYzy+GxSptlI1", null));
    }

    public static final Object invoke$2(AwS27S0001000_12 awS27S0001000_12, Object obj) {
        C773210UUt c773210UUt = (C773210UUt) obj;
        c773210UUt.LJ(String.valueOf(awS27S0001000_12.f982i0));
        c773210UUt.LIZJ("system_exit_room_local_fail", "");
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS27S0001000_12 awS27S0001000_12, Object obj) {
        C773210UUt c773210UUt = (C773210UUt) obj;
        c773210UUt.LJ(String.valueOf(awS27S0001000_12.f982i0));
        c773210UUt.LIZJ("system_exit_room_local_fail", "");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS27S0001000_12 awS27S0001000_12, Object obj) {
        boolean z;
        if (((BlockWord) obj).id == awS27S0001000_12.f982i0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$5(AwS27S0001000_12 awS27S0001000_12, Object obj) {
        ((C773210UUt) obj).LIZJ("system_exit_broadcast_service_end", String.valueOf(awS27S0001000_12.f982i0));
        return Unit.LIZ;
    }
}
