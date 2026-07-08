package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0SVE;
import X.C189200o6;
import X.C2344009Gk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.tag.viewmodel.FeedTaggedListViewModel;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class AwS37S2100000_11 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS37S2100000_11 awS37S2100000_11, Object obj) throws JSONException {
        String aid;
        String authorUid;
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("to_user_id", awS37S2100000_11.s0);
        jSONObject.put("enter_from", ((FeedTaggedListViewModel) awS37S2100000_11.l2).vQ2().LLILLL);
        Aweme aweme = ((FeedTaggedListViewModel) awS37S2100000_11.l2).vQ2().LL;
        String str = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        jSONObject.put("group_id", aid);
        Aweme aweme2 = ((FeedTaggedListViewModel) awS37S2100000_11.l2).vQ2().LL;
        if (aweme2 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme2)) != null) {
            str = authorUid;
        }
        jSONObject.put("author_id", str);
        jSONObject.put("anchor_type", ((FeedTaggedListViewModel) awS37S2100000_11.l2).vQ2().LLILZ);
        jSONObject.put("click_type", awS37S2100000_11.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS37S2100000_11 awS37S2100000_11, Object obj) {
        Object c098200Yq;
        JSONObject jSONObject = (JSONObject) obj;
        String str = awS37S2100000_11.s0;
        CopyOnWriteArrayList<C0SVE> copyOnWriteArrayList = (CopyOnWriteArrayList) awS37S2100000_11.l2;
        String str2 = awS37S2100000_11.s1;
        try {
            jSONObject.put("trigger_method", str);
            JSONArray jSONArray = new JSONArray();
            for (C0SVE c0sve : copyOnWriteArrayList) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("select_method_list", new JSONArray((Collection) c0sve.LIZIZ));
                jSONObject2.put("rec_type", c0sve.LIZJ);
                jSONObject2.put("read_status", c0sve.LIZLLL);
                jSONObject2.put("author_id", c0sve.LIZ);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("update_info", jSONArray.toString());
            c098200Yq = jSONObject.put("enter_from", str2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS37S2100000_11 awS37S2100000_11, Object obj) {
        C2344009Gk c2344009Gk = (C2344009Gk) obj;
        c2344009Gk.LJ((Integer) awS37S2100000_11.l2, "avatar_click_type");
        c2344009Gk.LJIIIIZZ("avatar_click_node", awS37S2100000_11.s0);
        c2344009Gk.LJIIIIZZ("avatar_click_node_state", awS37S2100000_11.s1);
        return c2344009Gk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S2100000_11(Integer num, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = num;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S2100000_11(String str, FeedTaggedListViewModel feedTaggedListViewModel, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = feedTaggedListViewModel;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS37S2100000_11(String str, String str2, CopyOnWriteArrayList<C0SVE> copyOnWriteArrayList, String str3) {
        super(1);
        this.$t = str3;
        this.s0 = str;
        this.l2 = str2;
        this.s1 = copyOnWriteArrayList;
    }
}
