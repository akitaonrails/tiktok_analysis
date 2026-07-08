package kotlin.jvm.internal;

import X.C062P;
import X.C098200Yq;
import X.C09AY;
import X.C0IJT;
import X.C1101640em2;
import X.C1101790emH;
import X.C1114060f64;
import X.C1134410fct;
import X.C1136870fgr;
import X.C1142020fpA;
import X.C1142070fpF;
import X.C1148840g0A;
import X.C1148910g0H;
import X.C1151190g3x;
import X.C1161920gLG;
import X.C189200o6;
import X.C19748512Ol;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2209908lF;
import X.C474500IjA;
import X.C766270U4b;
import X.EnumC1134460fcy;
import X.EnumC1142040fpC;
import X.EnumC1142140fpM;
import X.InterfaceC1085330eLj;
import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.gift.base.business.dialog.v2.favorite.GiftFavoriteDialogFragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class AwS131S1100000_17 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

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
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS131S1100000_17 awS131S1100000_17, Object obj) {
        Assembler assembler = (Assembler) obj;
        GiftFavoriteDialogFragment giftFavoriteDialogFragment = (GiftFavoriteDialogFragment) awS131S1100000_17.l1;
        assembler.DQ2(giftFavoriteDialogFragment, new AwS131S1100000_17(giftFavoriteDialogFragment, awS131S1100000_17.s0, 1));
        assembler.QQ2((GiftFavoriteDialogFragment) awS131S1100000_17.l1, AFwS254S0000000_17.get$arr$(46));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS131S1100000_17 awS131S1100000_17, Object obj) {
        C062P c062p = (C062P) obj;
        GiftFavoriteDialogFragment giftFavoriteDialogFragment = (GiftFavoriteDialogFragment) awS131S1100000_17.l1;
        DataChannel dataChannel = giftFavoriteDialogFragment.dataChannel;
        boolean z = giftFavoriteDialogFragment.LLILZ;
        boolean z2 = giftFavoriteDialogFragment.LLILZIL;
        boolean z3 = giftFavoriteDialogFragment.LLILZLL;
        LinkedList<C1148910g0H> linkedList = giftFavoriteDialogFragment.LLILLJJLI;
        if (linkedList == null) {
            linkedList = null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C1148910g0H> it2 = linkedList.iterator();
        while (it2.hasNext()) {
            Long l = it2.next().LIZLLL;
            if (l != null) {
                arrayList.add(l);
            }
        }
        c062p.LIZ = new C1148840g0A(dataChannel, z, z2, z3, awS131S1100000_17.s0, arrayList, ((GiftFavoriteDialogFragment) awS131S1100000_17.l1).LLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS131S1100000_17 awS131S1100000_17, Object obj) throws JSONException {
        C1101790emH c1101790emH = (C1101790emH) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent(controlGroup): sendExpandResult to FE, id=");
        sbLIZ.append(c1101790emH.LIZ);
        sbLIZ.append(", success=");
        sbLIZ.append(c1101790emH.LJ);
        sbLIZ.append(", failedReason=");
        sbLIZ.append(c1101790emH.LJFF);
        sbLIZ.append(", frequency_controlled_reason=");
        sbLIZ.append(c1101790emH.LJI);
        C20441214yg.LJ("matao-short", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1085330eLj interfaceC1085330eLj = ((C1101640em2) awS131S1100000_17.l1).LIZ;
        JSONObject jSONObject = new JSONObject();
        String str = awS131S1100000_17.s0;
        jSONObject.put("component", c1101790emH.LJII);
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, c1101790emH.LIZ);
        jSONObject.put(Scene.SCENE_SERVICE, c1101790emH.LIZIZ);
        jSONObject.put("biz", c1101790emH.LIZJ);
        jSONObject.put("room_id", c1101790emH.LIZLLL);
        jSONObject.put("container_id", str);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, !Intrinsics.LJFF(c1101790emH.LJ, Boolean.TRUE) ? 1 : 0);
        jSONObject.put("failed_reason", c1101790emH.LJFF);
        jSONObject.put("frequency_controlled_reason", c1101790emH.LJI);
        interfaceC1085330eLj.JG1("shorttouch_lynx_client_expanded", jSONObject);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS131S1100000_17 awS131S1100000_17, Object obj) throws JSONException {
        C1101790emH c1101790emH = (C1101790emH) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent(controlGroup): sendForceShrink to FE, id=");
        sbLIZ.append(c1101790emH.LIZ);
        C20441214yg.LJ("matao-short", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1085330eLj interfaceC1085330eLj = ((C1101640em2) awS131S1100000_17.l1).LIZ;
        JSONObject jSONObject = new JSONObject();
        String str = awS131S1100000_17.s0;
        jSONObject.put("component", c1101790emH.LJII);
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, c1101790emH.LIZ);
        jSONObject.put(Scene.SCENE_SERVICE, c1101790emH.LIZIZ);
        jSONObject.put("biz", c1101790emH.LIZJ);
        jSONObject.put("room_id", c1101790emH.LIZLLL);
        jSONObject.put("container_id", str);
        jSONObject.put("action", "force_shrink");
        interfaceC1085330eLj.JG1("shorttouch_lynx_client_force_shrink", jSONObject);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS131S1100000_17 awS131S1100000_17, Object obj) {
        Object obj2;
        SparkContext sparkContext = (SparkContext) obj;
        AFwS254S0000000_17 aFwS254S0000000_17 = AFwS254S0000000_17.get$arr$(107);
        try {
            sparkContext.LJJLIIIJ(new JSONObject(C19748512Ol.LIZIZ.LJIILL((User) awS131S1100000_17.l1)), "to_user");
            C189200o6.m2constructorimpl(sparkContext);
            obj2 = sparkContext;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj2);
        if (thM5exceptionOrNullimpl != null) {
            aFwS254S0000000_17.invoke(thM5exceptionOrNullimpl);
        }
        C20441214yg.LJIIIZ("LiveGiftIconGuideClickHandler", "open fe page by scheme: scheme=" + awS131S1100000_17.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS131S1100000_17 awS131S1100000_17, Object obj) {
        String string;
        String str;
        C1142020fpA c1142020fpA = (C1142020fpA) obj;
        C1136870fgr c1136870fgr = c1142020fpA.LIZ;
        if (c1136870fgr != null && (str = c1136870fgr.LJFF) != null) {
            string = a0.LJLIIIL(str).toString();
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, awS131S1100000_17.s0)) {
            List list = (List) awS131S1100000_17.l1;
            if (list != null && !list.isEmpty()) {
                C1142070fpF c1142070fpF = C1142070fpF.LIZ;
                C1142020fpA c1142020fpALIZ = C1142020fpA.LIZ(c1142020fpA, null, null, 0L, 0L, 0, null, null, 0.0f, 0, EnumC1142040fpC.READY, null, 3071);
                long j = c1142020fpA.LIZLLL;
                long j2 = c1142020fpALIZ.LJ;
                c1142070fpF.getClass();
                return C1142070fpF.LJJIII(c1142020fpALIZ, j, j2);
            }
            return C1142020fpA.LIZ(c1142020fpA, null, null, 0L, 0L, 0, "", "", 0.0f, 0, EnumC1142040fpC.ERROR, null, 2079);
        }
        return c1142020fpA;
    }

    public static final Object invoke$6(AwS131S1100000_17 awS131S1100000_17, Object obj) {
        return new C1142020fpA((C1136870fgr) awS131S1100000_17.l1, awS131S1100000_17.s0, EnumC1142140fpM.ERROR, 0L, 0L, 0, null, null, 0.0f, 0, null, "audio url is empty", 2040);
    }

    public static final Object invoke$7(AwS131S1100000_17 awS131S1100000_17, Object obj) {
        ((C1114060f64) awS131S1100000_17.l1).LIZ = awS131S1100000_17.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS131S1100000_17 awS131S1100000_17, Object obj) {
        Object obj2;
        SparkContext sparkContext = (SparkContext) obj;
        AFwS254S0000000_17 aFwS254S0000000_17 = AFwS254S0000000_17.get$arr$(443);
        try {
            sparkContext.LJJLIIIJ(new JSONObject(C19748512Ol.LIZIZ.LJIILL((User) awS131S1100000_17.l1)), "to_user");
            C189200o6.m2constructorimpl(sparkContext);
            obj2 = sparkContext;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj2);
        if (thM5exceptionOrNullimpl != null) {
            aFwS254S0000000_17.invoke(thM5exceptionOrNullimpl);
        }
        C20441214yg.LJIIIZ("LiveGiftSchemeEntranceHelper", "open fe page by scheme: scheme=" + awS131S1100000_17.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS131S1100000_17 awS131S1100000_17, Object obj) {
        EnumC1134460fcy enumC1134460fcyLIZJ;
        C1134410fct c1134410fctLJI = ((IRevenueStrategyService) C1161920gLG.LIZJ(IRevenueStrategyService.class)).KE0().LJI(11);
        if (c1134410fctLJI != null && (enumC1134460fcyLIZJ = c1134410fctLJI.LIZJ()) != null) {
            if (enumC1134460fcyLIZJ.compareTo(EnumC1134460fcy.TASK_EXIT) < 0) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exchange_preview_click");
                c474500IjALIZ.LJJII(Integer.valueOf(C1151190g3x.LJI()), "is_first_recharge");
                c474500IjALIZ.LJJII(11, "task_type");
                c474500IjALIZ.LIZ();
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) awS131S1100000_17.l1, awS131S1100000_17.s0);
            } else {
                C766270U4b.LJFF(2131853068, (Context) awS131S1100000_17.l1);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S1100000_17(C1101640em2 c1101640em2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1101640em2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S1100000_17(C1114060f64 c1114060f64, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1114060f64;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S1100000_17(C1136870fgr c1136870fgr, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1136870fgr;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S1100000_17(Context context, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S1100000_17(User user, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S1100000_17(GiftFavoriteDialogFragment giftFavoriteDialogFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = giftFavoriteDialogFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS131S1100000_17(String str, String str2, List<C2209908lF> list) {
        super(1);
        this.$t = list;
        this.s0 = str;
        this.l1 = str2;
    }
}
