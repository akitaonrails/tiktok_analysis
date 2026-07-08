package kotlin.jvm.internal;

import X.C09AY;
import X.C15438062q;
import X.C877320YbK;
import X.C885310YoD;
import X.C897110ZHh;
import X.EnumC885270Yo9;
import X.InterfaceC879010Ye3;
import android.app.Activity;
import android.content.Context;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.ss.android.ugc.aweme.experiment.IndependentAppBubbleItem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AwS36S1400000_14 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
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

    public static final Object invoke$0(AwS36S1400000_14 awS36S1400000_14) {
        return ((C897110ZHh) awS36S1400000_14.l1).LIZJ((SessionInfo) awS36S1400000_14.l2, awS36S1400000_14.s0, (Context) awS36S1400000_14.l3, (IndependentAppBubbleItem) awS36S1400000_14.l4);
    }

    public static final Object invoke$1(AwS36S1400000_14 awS36S1400000_14) {
        C877320YbK c877320YbK = C877320YbK.LIZ;
        Activity activity = (Activity) awS36S1400000_14.l1;
        String str = awS36S1400000_14.s0;
        List list = (List) awS36S1400000_14.l2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((SetConversationSettingInfoResponseBody) it2.next()).setting_info.conversation_id);
        }
        c877320YbK.LJII(activity, str, arrayList, (InterfaceC879010Ye3) awS36S1400000_14.l3, (EnumC885270Yo9) awS36S1400000_14.l4, true, null);
        C885310YoD c885310YoD = C885310YoD.LIZ;
        String str2 = awS36S1400000_14.s0;
        String batchActionTypeMobValue = ((EnumC885270Yo9) awS36S1400000_14.l4).getBatchActionTypeMobValue();
        C877320YbK c877320YbK2 = C877320YbK.LIZ;
        InterfaceC879010Ye3 interfaceC879010Ye3 = (InterfaceC879010Ye3) awS36S1400000_14.l3;
        c877320YbK2.getClass();
        c885310YoD.LJ(((List) awS36S1400000_14.l2).size(), str2, "toast_retry", batchActionTypeMobValue, C877320YbK.LJIIJ(interfaceC879010Ye3));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS36S1400000_14(Activity activity, Activity activity2, String str, List<SetConversationSettingInfoResponseBody> list, InterfaceC879010Ye3 interfaceC879010Ye3, EnumC885270Yo9 enumC885270Yo9) {
        super(0);
        this.$t = enumC885270Yo9;
        this.l1 = activity;
        this.s0 = activity2;
        this.l2 = str;
        this.l3 = list;
        this.l4 = interfaceC879010Ye3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S1400000_14(Context context, IndependentAppBubbleItem independentAppBubbleItem, SessionInfo sessionInfo, C897110ZHh c897110ZHh, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c897110ZHh;
        this.l2 = sessionInfo;
        this.s0 = str;
        this.l3 = context;
        this.l4 = independentAppBubbleItem;
    }
}
