package kotlin.jvm.internal;

import X.C09AY;
import X.C0IJT;
import X.C0KBB;
import X.C0KCF;
import X.C0KVU;
import X.C1161920gLG;
import X.C11KU;
import X.C474500IjA;
import X.C512350K7l;
import X.C520010KaN;
import X.InterfaceC512380K7o;
import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.chatroom.api.PriceChangeInfo;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.subscribe.model.SubscribingInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AwS0S2400100_7 extends C09AY implements Function0 {
    public final int $t;
    public long j6;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS0S2400100_7 awS0S2400100_7) {
        String str;
        String str2;
        Integer num;
        PriceChangeInfo priceChangeInfo;
        PriceChangeInfo priceChangeInfo2;
        PriceChangeInfo priceChangeInfo3;
        FragmentManager fragmentManagerLJIL = C520010KaN.LJIL((Activity) awS0S2400100_7.l2, false);
        if (fragmentManagerLJIL != null) {
            long j = awS0S2400100_7.j6;
            SubscribingInfo subscribingInfo = (SubscribingInfo) awS0S2400100_7.l4;
            String str3 = awS0S2400100_7.s0;
            String str4 = awS0S2400100_7.s1;
            Map map = (Map) awS0S2400100_7.l5;
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).Ae();
            C0KBB.LIZJ(fragmentManagerLJIL, new C0KCF(str3, String.valueOf(j), "sub_change_price_email", true, 0, "normal_sub", "", "app_start", null, Boolean.FALSE, "", str4, "", "", "", true, "", true, null, 0, "", "", null, null, C0KVU.LIZ(subscribingInfo.anchorInfo), 0, null, 0L, 0L, false, -82835712, 15), map);
        }
        C512350K7l c512350K7l = C512350K7l.LIZ;
        Activity activity = (Activity) awS0S2400100_7.l2;
        InterfaceC512380K7o interfaceC512380K7o = (InterfaceC512380K7o) awS0S2400100_7.l3;
        c512350K7l.getClass();
        C512350K7l.LIZLLL(activity, interfaceC512380K7o);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_change_price_sheet_agree");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("app_start", "show_entrance");
        c474500IjALIZ.LJJII("notify_and_consent", "show_type");
        SubInfo subInfo = ((SubscribingInfo) awS0S2400100_7.l4).subInfo;
        Long lValueOf = null;
        if (subInfo != null && (priceChangeInfo3 = subInfo.priceChangeInfo) != null) {
            str = priceChangeInfo3.oldPrice;
        } else {
            str = null;
        }
        c474500IjALIZ.LJJII(str, "old_price");
        SubInfo subInfo2 = ((SubscribingInfo) awS0S2400100_7.l4).subInfo;
        if (subInfo2 != null && (priceChangeInfo2 = subInfo2.priceChangeInfo) != null) {
            str2 = priceChangeInfo2.newPrice;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "new_price");
        SubInfo subInfo3 = ((SubscribingInfo) awS0S2400100_7.l4).subInfo;
        if (subInfo3 != null) {
            num = subInfo3.subscribedMonth;
        } else {
            num = null;
        }
        c474500IjALIZ.LJJII(num, "subscribe_month");
        c474500IjALIZ.LJJII("auto_sub", "subscribe_type");
        SubInfo subInfo4 = ((SubscribingInfo) awS0S2400100_7.l4).subInfo;
        if (subInfo4 != null && (priceChangeInfo = subInfo4.priceChangeInfo) != null) {
            lValueOf = Long.valueOf(priceChangeInfo.nextBillingDate);
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "renewal_time");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S2400100_7 awS0S2400100_7) {
        String str;
        String str2;
        Integer num;
        PriceChangeInfo priceChangeInfo;
        PriceChangeInfo priceChangeInfo2;
        PriceChangeInfo priceChangeInfo3;
        FragmentManager fragmentManagerLJIL = C520010KaN.LJIL((Activity) awS0S2400100_7.l2, false);
        if (fragmentManagerLJIL != null) {
            long j = awS0S2400100_7.j6;
            SubscribingInfo subscribingInfo = (SubscribingInfo) awS0S2400100_7.l4;
            String str3 = awS0S2400100_7.s0;
            String str4 = awS0S2400100_7.s1;
            Map map = (Map) awS0S2400100_7.l5;
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).Ae();
            C0KBB.LIZJ(fragmentManagerLJIL, new C0KCF(str3, String.valueOf(j), "sub_change_price_email", true, 0, "normal_sub", "", "app_start", null, Boolean.FALSE, "", str4, "", "", "", true, "", true, null, 0, "", "", null, null, C0KVU.LIZ(subscribingInfo.anchorInfo), 0, null, 0L, 0L, false, -82835712, 15), map);
        }
        C512350K7l c512350K7l = C512350K7l.LIZ;
        Activity activity = (Activity) awS0S2400100_7.l2;
        InterfaceC512380K7o interfaceC512380K7o = (InterfaceC512380K7o) awS0S2400100_7.l3;
        c512350K7l.getClass();
        C512350K7l.LIZLLL(activity, interfaceC512380K7o);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_change_price_sheet_agree");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("app_start", "show_entrance");
        c474500IjALIZ.LJJII("notify_and_consent", "show_type");
        SubInfo subInfo = ((SubscribingInfo) awS0S2400100_7.l4).subInfo;
        Long lValueOf = null;
        if (subInfo != null && (priceChangeInfo3 = subInfo.priceChangeInfo) != null) {
            str = priceChangeInfo3.oldPrice;
        } else {
            str = null;
        }
        c474500IjALIZ.LJJII(str, "old_price");
        SubInfo subInfo2 = ((SubscribingInfo) awS0S2400100_7.l4).subInfo;
        if (subInfo2 != null && (priceChangeInfo2 = subInfo2.priceChangeInfo) != null) {
            str2 = priceChangeInfo2.newPrice;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "new_price");
        SubInfo subInfo3 = ((SubscribingInfo) awS0S2400100_7.l4).subInfo;
        if (subInfo3 != null) {
            num = subInfo3.subscribedMonth;
        } else {
            num = null;
        }
        c474500IjALIZ.LJJII(num, "subscribe_month");
        c474500IjALIZ.LJJII("auto_sub", "subscribe_type");
        SubInfo subInfo4 = ((SubscribingInfo) awS0S2400100_7.l4).subInfo;
        if (subInfo4 != null && (priceChangeInfo = subInfo4.priceChangeInfo) != null) {
            lValueOf = Long.valueOf(priceChangeInfo.nextBillingDate);
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "renewal_time");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2400100_7(Activity activity, C11KU c11ku, SubscribingInfo subscribingInfo, long j, String str, String str2, Map map, int i) {
        super(0);
        this.$t = i;
        this.l2 = activity;
        this.l3 = c11ku;
        this.l4 = subscribingInfo;
        this.j6 = j;
        this.s0 = str;
        this.s1 = str2;
        this.l5 = map;
    }
}
