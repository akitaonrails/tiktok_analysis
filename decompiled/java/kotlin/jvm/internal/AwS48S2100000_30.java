package kotlin.jvm.internal;

import X.C09AY;
import X.C1533790q13;
import X.C1864020ybg;
import X.C2097608Jq;
import X.C2252611DEt;
import X.InterfaceC20236714Gf;
import android.content.Context;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.util.DMGreetingCardGeckoChannelManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS48S2100000_30 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS48S2100000_30 awS48S2100000_30, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (((InterfaceC20236714Gf) awS48S2100000_30.l2).isActive()) {
            if (!c1533790q13.LIZIZ) {
                ((InterfaceC20236714Gf) awS48S2100000_30.l2).LJJIFFI(AFwS274S0000000_30.get$arr$(226), null);
            } else {
                String strLIZLLL = c1533790q13.LIZLLL();
                if (strLIZLLL != null) {
                    String str = awS48S2100000_30.s0;
                    String str2 = awS48S2100000_30.s1;
                    Map map = (Map) ((ConcurrentHashMap) DMGreetingCardGeckoChannelManager.LIZJ).get(str);
                    if (map != null) {
                        map.put(str2, strLIZLLL);
                    }
                }
                ((InterfaceC20236714Gf) awS48S2100000_30.l2).LJJIFFI(AFwS274S0000000_30.get$arr$(227), c1533790q13.LIZLLL());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS48S2100000_30 awS48S2100000_30, Object obj) {
        C1864020ybg.LJIIIZ((Context) obj, C2097608Jq.LJ(), C2097608Jq.LJI(new Pair("enter_from", ((TakoEnterParams) awS48S2100000_30.l2).enterFrom), new Pair("enter_method", ((TakoEnterParams) awS48S2100000_30.l2).enterMethod), new Pair("process_id", ((TakoEnterParams) awS48S2100000_30.l2).processId), new Pair("tako_session_id", awS48S2100000_30.s0), new Pair("tako_chat_id", awS48S2100000_30.s1), new Pair("search_id", ((TakoEnterParams) awS48S2100000_30.l2).getEnterSearchId()), new Pair("bot_id", String.valueOf(((TakoEnterParams) awS48S2100000_30.l2).botInfo.botId))));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS48S2100000_30 awS48S2100000_30, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (((InterfaceC20236714Gf) awS48S2100000_30.l2).isActive()) {
            if (!c1533790q13.LIZIZ) {
                ((InterfaceC20236714Gf) awS48S2100000_30.l2).LJJIFFI(AFwS274S0000000_30.get$arr$(339), null);
            } else {
                String strLIZLLL = c1533790q13.LIZLLL();
                if (strLIZLLL != null) {
                    String str = awS48S2100000_30.s0;
                    String str2 = awS48S2100000_30.s1;
                    Map map = (Map) ((ConcurrentHashMap) DMGreetingCardGeckoChannelManager.LIZJ).get(str);
                    if (map != null) {
                        map.put(str2, strLIZLLL);
                    }
                }
                ((InterfaceC20236714Gf) awS48S2100000_30.l2).LJJIFFI(AFwS274S0000000_30.get$arr$(340), c1533790q13.LIZLLL());
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S2100000_30(TakoEnterParams takoEnterParams, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = takoEnterParams;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S2100000_30(String str, String str2, C2252611DEt c2252611DEt, int i) {
        super(1);
        this.$t = i;
        this.l2 = c2252611DEt;
        this.s0 = str;
        this.s1 = str2;
    }
}
