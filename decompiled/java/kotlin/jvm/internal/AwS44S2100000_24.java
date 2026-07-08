package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C1397630mTR;
import X.C15438062q;
import X.C1575290r5z;
import X.C1595990rdN;
import X.C1613170s55;
import X.C1720106oR;
import X.C189200o6;
import X.C2187451AjH;
import X.EnumC912680ZrG;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.business.live.cell.GoLiveSkylightCell;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel;
import com.ss.android.ugc.aweme.model.PaidCollectionEpisode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.payment.fragment.SeriesRefundFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class AwS44S2100000_24 extends C09AY implements Function1 {
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
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS44S2100000_24 awS44S2100000_24, Object obj) {
        Object c098200Yq;
        String uid;
        User user;
        JSONObject jSONObject = (JSONObject) obj;
        String str = awS44S2100000_24.s0;
        GoLiveSkylightCell goLiveSkylightCell = (GoLiveSkylightCell) awS44S2100000_24.l2;
        try {
            jSONObject.put("live_entrance_name", "fyp_live_cover_camera");
            jSONObject.put("live_tab_show_type", str);
            C1595990rdN c1595990rdN = (C1595990rdN) goLiveSkylightCell.getItem();
            if (c1595990rdN != null && (user = c1595990rdN.LL) != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            c098200Yq = jSONObject.put("user_id", uid);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str2 = awS44S2100000_24.s1;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZJ(str2, thM5exceptionOrNullimpl);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS44S2100000_24 awS44S2100000_24, Object obj) {
        C1575290r5z c1575290r5z = C1575290r5z.LIZ;
        String str = awS44S2100000_24.s0;
        String str2 = awS44S2100000_24.s1;
        EnumC912680ZrG enumC912680ZrG = (EnumC912680ZrG) awS44S2100000_24.l2;
        c1575290r5z.getClass();
        C1575290r5z.LJI(str, str2, "leave_popup", "cancel", enumC912680ZrG);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS44S2100000_24 awS44S2100000_24, Object obj) {
        C1575290r5z c1575290r5z = C1575290r5z.LIZ;
        String str = awS44S2100000_24.s0;
        String str2 = awS44S2100000_24.s1;
        EnumC912680ZrG enumC912680ZrG = (EnumC912680ZrG) awS44S2100000_24.l2;
        c1575290r5z.getClass();
        C1575290r5z.LJI(str, str2, "turn_off_popup", "cancel", enumC912680ZrG);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS44S2100000_24 awS44S2100000_24, Object obj) {
        List<ITEM> listListGetAll = ((SeriesPanelSquareViewModel) awS44S2100000_24.l2).listGetAll();
        if (listListGetAll != 0 && !listListGetAll.isEmpty()) {
            String str = awS44S2100000_24.s0;
            String str2 = awS44S2100000_24.s1;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listListGetAll, 10));
            for (ITEM c1613170s55 : listListGetAll) {
                if (c1613170s55 instanceof C1613170s55) {
                    C1613170s55 c1613170s552 = (C1613170s55) c1613170s55;
                    if (!Intrinsics.LJFF(c1613170s552.LLILLL, str) || !Intrinsics.LJFF(c1613170s552.LLILZIL, str2)) {
                        List<PaidCollectionEpisode> list = c1613170s552.LL;
                        c1613170s55 = new C1613170s55(c1613170s552.LLILZ, c1613170s552.LLILLJJLI, str, str2, list);
                    }
                }
                arrayList.add(c1613170s55);
            }
            if (!arrayList.isEmpty()) {
                ((SeriesPanelSquareViewModel) awS44S2100000_24.l2).listSetItems(arrayList);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS44S2100000_24 awS44S2100000_24, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LJ(2131847525, new AwS138S1100000_24((SeriesRefundFragment) awS44S2100000_24.l2, awS44S2100000_24.s0, awS44S2100000_24.s1, 12));
        c1397630mTR.LJI(2131847524, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S2100000_24(SeriesPanelSquareViewModel seriesPanelSquareViewModel, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = seriesPanelSquareViewModel;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S2100000_24(SeriesRefundFragment seriesRefundFragment, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = seriesRefundFragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S2100000_24(String str, GoLiveSkylightCell goLiveSkylightCell, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = goLiveSkylightCell;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S2100000_24(String str, String str2, EnumC912680ZrG enumC912680ZrG, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = enumC912680ZrG;
    }
}
