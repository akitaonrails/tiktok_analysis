package kotlin.jvm.internal;

import X.AbstractC827810Wdf;
import X.C013C;
import X.C09AY;
import X.C13BV;
import X.C1440005kM;
import X.C1602310rnZ;
import X.C1612820s4W;
import X.C1614710s7Z;
import X.C2188811AlT;
import X.C723240SYo;
import android.net.Uri;
import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentEventParams;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes25.dex */
public class AwS57S0500000_24 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS57S0500000_24 awS57S0500000_24, Object obj) {
        Uri uriBuild;
        LinkedHashMap linkedHashMap;
        ((Function0) awS57S0500000_24.l0).invoke();
        Uri.Builder builder = (Uri.Builder) awS57S0500000_24.l1;
        if (builder != null) {
            uriBuild = builder.build();
        } else {
            uriBuild = null;
        }
        SmartRouter.buildRoute(((SideBarSectionComponent) awS57S0500000_24.l2).getContext(), String.valueOf(uriBuild)).open();
        ((SideBarSectionComponent) awS57S0500000_24.l2).hp("sidebar_entrance_click", (Map) awS57S0500000_24.l3);
        List<SideBarComponentEventParams> list = (List) awS57S0500000_24.l4;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        for (SideBarComponentEventParams sideBarComponentEventParams : list) {
            String str = sideBarComponentEventParams.event;
            if (str != null) {
                Map<String, Object> mapLIZ = sideBarComponentEventParams.LIZ();
                if (mapLIZ != null) {
                    linkedHashMap = new LinkedHashMap(mapLIZ);
                } else {
                    linkedHashMap = new LinkedHashMap();
                }
                ((SideBarSectionComponent) awS57S0500000_24.l2).hp(str, linkedHashMap);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS57S0500000_24 awS57S0500000_24, Object obj) {
        LinkedHashMap linkedHashMap;
        ((Function0) awS57S0500000_24.l0).invoke();
        ((Function2) awS57S0500000_24.l1).invoke(obj, ((SideBarSectionComponent) awS57S0500000_24.l2).LLJJI);
        ((SideBarSectionComponent) awS57S0500000_24.l2).hp("sidebar_entrance_click", (Map) awS57S0500000_24.l3);
        List<SideBarComponentEventParams> list = (List) awS57S0500000_24.l4;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        for (SideBarComponentEventParams sideBarComponentEventParams : list) {
            String str = sideBarComponentEventParams.event;
            if (str != null) {
                Map<String, Object> mapLIZ = sideBarComponentEventParams.LIZ();
                if (mapLIZ != null) {
                    linkedHashMap = new LinkedHashMap(mapLIZ);
                } else {
                    linkedHashMap = new LinkedHashMap();
                }
                ((SideBarSectionComponent) awS57S0500000_24.l2).hp(str, linkedHashMap);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS57S0500000_24 awS57S0500000_24, Object obj) {
        String aid;
        String str = (String) obj;
        if (str != null) {
            User user = (User) awS57S0500000_24.l1;
            FeedUserRoomMonitorMessage feedUserRoomMonitorMessage = (FeedUserRoomMonitorMessage) awS57S0500000_24.l2;
            C013C c013c = (C013C) awS57S0500000_24.l3;
            Aweme aweme = (Aweme) awS57S0500000_24.l4;
            if (user != null) {
                user.roomData = str;
                user.roomId = feedUserRoomMonitorMessage.roomId;
            }
            if (c013c.element) {
                C723240SYo c723240SYo = new C723240SYo();
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                c723240SYo.LIZJ = aid;
                c723240SYo.LIZ = String.valueOf(feedUserRoomMonitorMessage.anchorId);
                c723240SYo.LIZIZ = false;
                C1440005kM.LIZ(c723240SYo);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("post FrontierRoomStatusEvent: ");
                sbLIZ.append(c723240SYo.LIZIZ);
                AbstractC827810Wdf.LIZ("LiveHostRoomStateListener", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            C1602310rnZ c1602310rnZ = (C1602310rnZ) awS57S0500000_24.l0;
            User user2 = (User) awS57S0500000_24.l1;
            user2.fakeRoomId = ((FeedUserRoomMonitorMessage) awS57S0500000_24.l2).roomId;
            c1602310rnZ.getClass();
            C1602310rnZ.LIZ(user2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS57S0500000_24 awS57S0500000_24, Object obj) {
        return C1614710s7Z.LIZ((C1614710s7Z) obj, null, null, null, null, false, null, false, false, (Map) awS57S0500000_24.l0, (Map) awS57S0500000_24.l1, (Map) awS57S0500000_24.l2, (Map) awS57S0500000_24.l3, null, (List) awS57S0500000_24.l4, null, false, null, null, 512255);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0500000_24(C1602310rnZ c1602310rnZ, User user, FeedUserRoomMonitorMessage feedUserRoomMonitorMessage, C013C c013c, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1602310rnZ;
        this.l1 = user;
        this.l2 = feedUserRoomMonitorMessage;
        this.l3 = c013c;
        this.l4 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS57S0500000_24(Map map, Map<String, String> map2, Map<String, IapSubscriptionProduct> map3, Map<String, String> map4, Map<String, String> map5, List<C1612820s4W> list) {
        super(1);
        this.$t = list;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = map3;
        this.l3 = map4;
        this.l4 = map5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0500000_24(AwS425S0200000_24 awS425S0200000_24, Uri.Builder builder, SideBarSectionComponent sideBarSectionComponent, Map map, List list, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS425S0200000_24;
        this.l1 = builder;
        this.l2 = sideBarSectionComponent;
        this.l3 = map;
        this.l4 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0500000_24(AwS425S0200000_24 awS425S0200000_24, Function2 function2, SideBarSectionComponent sideBarSectionComponent, Map map, List list, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS425S0200000_24;
        this.l1 = function2;
        this.l2 = sideBarSectionComponent;
        this.l3 = map;
        this.l4 = list;
    }
}
