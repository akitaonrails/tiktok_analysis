package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C150D;
import X.C15ZI;
import X.C15ZO;
import X.C15ZP;
import X.C15ZU;
import X.C15ZV;
import X.C20525915Tl;
import X.C20540515Zb;
import X.InterfaceC1631620sYq;
import X.InterfaceC20540415Za;
import X.InterfaceC20541015Zg;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicStruct;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AwS161S1200000_31 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S1200000_31(C15ZU c15zu, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c15zu;
        this.s0 = str;
        this.l2 = null;
    }

    public static final Object invoke$0(AwS161S1200000_31 awS161S1200000_31, Object obj, Object obj2) {
        ExploreCustomTopicStruct exploreCustomTopicStruct;
        List<Aweme> list;
        int iIntValue = ((Number) obj).intValue();
        C150D c150d = (C150D) obj2;
        if (c150d instanceof C20525915Tl) {
            C20525915Tl c20525915Tl = (C20525915Tl) c150d;
            ArrayList arrayList = new ArrayList(c20525915Tl.LLILZ);
            int i = 0;
            do {
                if (i < arrayList.size() && (list = (exploreCustomTopicStruct = (ExploreCustomTopicStruct) ListProtector.get(arrayList, i)).topicAwemes) != null) {
                    ArrayList arrayList2 = new ArrayList(list);
                    String str = awS161S1200000_31.s0;
                    Iterator it2 = arrayList2.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (Intrinsics.LJFF(((Aweme) it2.next()).getAid(), str)) {
                            if (i2 >= 0 && i2 < arrayList2.size()) {
                                ((C013C) awS161S1200000_31.l1).element = true;
                                ListProtector.remove(arrayList2, i2);
                                ListProtector.set(arrayList, i, exploreCustomTopicStruct.copy(exploreCustomTopicStruct.topicId, exploreCustomTopicStruct.topicName, exploreCustomTopicStruct.relatedItemsCount, arrayList2));
                            }
                        } else {
                            i2++;
                        }
                    }
                }
                i++;
            } while (i < 4);
            if (((C013C) awS161S1200000_31.l1).element) {
                ((ExploreFeedListViewModel) awS161S1200000_31.l2).listSetItemAt(iIntValue, C20525915Tl.LIZ(c20525915Tl, arrayList));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS161S1200000_31 awS161S1200000_31, Object obj, Object obj2) {
        InterfaceC20540415Za interfaceC20540415Za;
        String str;
        C20540515Zb c20540515Zb = (C20540515Zb) obj;
        InterfaceC20541015Zg interfaceC20541015ZgLIZIZ = C15ZV.LIZIZ();
        if (interfaceC20541015ZgLIZIZ != null) {
            JSONObject jSONObject = new JSONObject();
            C15ZI c15zi = ((C15ZO) awS161S1200000_31.l1).LJIIJ;
            if (c15zi != null) {
                str = c15zi.LIZ;
            } else {
                str = null;
            }
            interfaceC20541015ZgLIZIZ.LIZ("pnsscreensdk_sd_perform_callback", jSONObject.put("trigger_key", str).put("strategy_key", ((C15ZO) awS161S1200000_31.l1).LJIIIIZZ).put("timerbox_key", awS161S1200000_31.s0).put("current_used_time", c20540515Zb.LIZJ() - ((C15ZO) awS161S1200000_31.l1).LJIIJJI).put("current_threshold", ((C15ZO) awS161S1200000_31.l1).LJIIIZ.invoke().intValue()), null);
        }
        C15ZO c15zo = (C15ZO) awS161S1200000_31.l1;
        C15ZI c15zi2 = c15zo.LJIIJ;
        if (c15zi2 != null && (interfaceC20540415Za = c15zi2.LIZJ) != null) {
            interfaceC20540415Za.LJFF(new AwS321S0300000_31((InterfaceC1631620sYq) awS161S1200000_31.l2, (InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super Map<Object, ? extends Object>, Unit>) c15zo, (C15ZO) c20540515Zb, (C20540515Zb) 1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS161S1200000_31 awS161S1200000_31, Object obj, Object obj2) {
        C15ZI c15zi;
        InterfaceC20540415Za interfaceC20540415Za;
        InterfaceC20540415Za interfaceC20540415Za2;
        String str;
        C20540515Zb c20540515Zb = (C20540515Zb) obj;
        C15ZP c15zp = ((C15ZU) awS161S1200000_31.l1).LJ;
        if (c15zp instanceof C15ZI) {
            c15zi = (C15ZI) c15zp;
        } else {
            c15zi = null;
        }
        long jLIZJ = c20540515Zb.LIZJ() - ((C15ZU) awS161S1200000_31.l1).LIZLLL;
        InterfaceC20541015Zg interfaceC20541015ZgLIZIZ = C15ZV.LIZIZ();
        if (interfaceC20541015ZgLIZIZ != null) {
            JSONObject jSONObject = new JSONObject();
            if (c15zi != null) {
                str = c15zi.LIZ;
            } else {
                str = null;
            }
            interfaceC20541015ZgLIZIZ.LIZ("pnsscreensdk_sd_perform_callback", jSONObject.put("trigger_key", str).put("strategy_key", ((C15ZU) awS161S1200000_31.l1).LJFF).put("timerbox_key", awS161S1200000_31.s0).put("current_used_time", jLIZJ).put("current_threshold", -1), null);
        }
        if (TextUtils.equals("AppOpenTimesStrategy", ((C15ZU) awS161S1200000_31.l1).LJFF) && c15zi != null && (interfaceC20540415Za2 = c15zi.LIZJ) != null) {
            interfaceC20540415Za2.LIZJ(new AwS186S0400000_31((InterfaceC1631620sYq) awS161S1200000_31.l2, c15zi, (C15ZU) awS161S1200000_31.l1, c20540515Zb, 0));
        }
        if (TextUtils.equals("ScreenTimeDashboardForBackgroundStrategy", ((C15ZU) awS161S1200000_31.l1).LJFF) && c15zi != null && (interfaceC20540415Za = c15zi.LIZJ) != null) {
            interfaceC20540415Za.LJ(jLIZJ, new AwS186S0400000_31((InterfaceC1631620sYq) awS161S1200000_31.l2, c15zi, (C15ZU) awS161S1200000_31.l1, c20540515Zb, 1));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S1200000_31(C013C c013c, ExploreFeedListViewModel exploreFeedListViewModel, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c013c;
        this.l2 = exploreFeedListViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S1200000_31(C15ZO c15zo, String str, AwS680S0100000_31 awS680S0100000_31, int i) {
        super(2);
        this.$t = i;
        this.l1 = c15zo;
        this.s0 = str;
        this.l2 = awS680S0100000_31;
    }
}
