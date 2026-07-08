package kotlin.jvm.internal;

import X.C01TT;
import X.C09AY;
import X.C1727806pg;
import X.C1761106v3;
import X.C2097608Jq;
import X.C461720I8s;
import X.C877500Ybc;
import X.C880000Yfe;
import X.C895680ZBu;
import X.EnumC877490Ybb;
import com.ss.android.ugc.aweme.im.chatroom.api.IChatRoomEventTrackingStore;
import com.ss.android.ugc.aweme.utils.oh;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AwS99S1000000_14 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

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
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS99S1000000_14 awS99S1000000_14) {
        oh.LIZLLL.remove(awS99S1000000_14.s0);
        oh.LIZ().destroyMonitors(awS99S1000000_14.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS99S1000000_14 awS99S1000000_14) {
        C01TT.LIZLLL(new AwS99S1000000_14(awS99S1000000_14.s0, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS99S1000000_14 awS99S1000000_14) {
        C895680ZBu.LIZIZ.remove(awS99S1000000_14.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS99S1000000_14 awS99S1000000_14) {
        boolean z;
        if (!C880000Yfe.LIZ && C877500Ybc.LIZ(awS99S1000000_14.s0) != EnumC877490Ybb.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AwS99S1000000_14 awS99S1000000_14) {
        return Boolean.valueOf(C1727806pg.LIZ.LIZ("group_chat_show_on_profile", awS99S1000000_14.s0, C461720I8s.LIZIZ(), false));
    }

    public static final Object invoke$5(AwS99S1000000_14 awS99S1000000_14) {
        return Boolean.valueOf(C1727806pg.LIZ.LIZ("group_chat_leave_group", awS99S1000000_14.s0, C461720I8s.LIZIZ(), false));
    }

    public static final Object invoke$6(AwS99S1000000_14 awS99S1000000_14) {
        Map<String, String> mapLIZIZ;
        IChatRoomEventTrackingStore.LIZ.getClass();
        IChatRoomEventTrackingStore iChatRoomEventTrackingStoreLIZ = C1761106v3.LIZ();
        if (iChatRoomEventTrackingStoreLIZ == null || (mapLIZIZ = iChatRoomEventTrackingStoreLIZ.LIZIZ(awS99S1000000_14.s0)) == null) {
            return C2097608Jq.LJ();
        }
        return mapLIZIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S1000000_14(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
