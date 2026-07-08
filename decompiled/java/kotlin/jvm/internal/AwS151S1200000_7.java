package kotlin.jvm.internal;

import X.AbstractC497160Jec;
import X.C09AY;
import X.C0IX8;
import X.C0X9S;
import X.C1515820pY4;
import X.C20684815ws;
import X.C2344009Gk;
import X.C293501Bt;
import X.C480460Ism;
import X.C497060JeS;
import X.C497120JeY;
import X.C816050Vzn;
import X.InterfaceC594300NSq;
import Y.ACallableS239S0200000_7;
import Y.AfS176S0100000_7;
import com.bytedance.android.live.network.combine.LiveCombineApi;
import com.bytedance.android.live.network.combine.LiveCombineApiRequestParams;
import com.bytedance.android.live.network.combine.LiveCombineRequestBody;
import com.bytedance.android.live.network.combine.LiveCombineResponse;
import com.bytedance.android.live.network.combine.exp.LiveCombineApiRequestSubBizLogData;
import com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public class AwS151S1200000_7 extends C09AY implements Function2 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS151S1200000_7 awS151S1200000_7, Object obj, Object obj2) {
        LiveCombineApiRequestSubBizLogData liveCombineApiRequestSubBizLogDataLIZJ;
        AbstractC497160Jec abstractC497160Jec;
        C0IX8 c0ix8LIZIZ;
        Set<String> set = (Set) obj;
        Set set2 = (Set) obj2;
        ((C497120JeY) awS151S1200000_7.l1).LJI.addAll(set);
        ((C497120JeY) awS151S1200000_7.l1).LJII.addAll(set2);
        ((C497120JeY) awS151S1200000_7.l1).LJIILL = false;
        String str = awS151S1200000_7.s0;
        int size = set.size();
        if (C497060JeS.LIZ() && (c0ix8LIZIZ = C497060JeS.LIZIZ(str)) != null) {
            c0ix8LIZIZ.LIZLLL = System.currentTimeMillis() - c0ix8LIZIZ.LIZ;
            c0ix8LIZIZ.LJ = size;
            c0ix8LIZIZ.LIZJ = 2;
        }
        if (set.isEmpty()) {
            C497060JeS.LIZLLL(6, awS151S1200000_7.s0, false);
        } else {
            C497120JeY c497120JeY = (C497120JeY) awS151S1200000_7.l1;
            c497120JeY.getClass();
            LiveCombineRequestBody liveCombineRequestBody = new LiveCombineRequestBody();
            INPUT_DATA input_data = c497120JeY.LJIIIIZZ;
            if (input_data != 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : c497120JeY.LJI) {
                    ConcurrentHashMap<String, AbstractC497160Jec<?, INPUT_DATA>> concurrentHashMap = c497120JeY.LJ;
                    if (concurrentHashMap != 0 && (abstractC497160Jec = (AbstractC497160Jec) concurrentHashMap.get(obj3)) != null) {
                        LiveCombineApiRequestParams liveCombineApiRequestParams = new LiveCombineApiRequestParams();
                        liveCombineApiRequestParams.queryParams = abstractC497160Jec.LJI(input_data);
                        Object objLIZIZ = abstractC497160Jec.LIZIZ(input_data);
                        if (objLIZIZ != null) {
                            liveCombineApiRequestParams.bodyParams = GsonProtectorUtils.toJson(C293501Bt.LIZ(), objLIZIZ);
                        }
                        abstractC497160Jec.LIZJ();
                        liveCombineApiRequestParams.delayTime = 0L;
                        if (abstractC497160Jec.LJFF().length() > 0) {
                            liveCombineApiRequestParams.contentType = abstractC497160Jec.LJFF();
                        }
                        liveCombineApiRequestParams.method = abstractC497160Jec.LIZLLL();
                        linkedHashMap.put(abstractC497160Jec.LJ(), liveCombineApiRequestParams);
                    }
                }
                liveCombineRequestBody.setRequestInfo(linkedHashMap);
            }
            liveCombineRequestBody.setExtraParams((Map) awS151S1200000_7.l2);
            String str2 = awS151S1200000_7.s0;
            for (String str3 : set) {
                if (C497060JeS.LIZ() && (liveCombineApiRequestSubBizLogDataLIZJ = C497060JeS.LIZJ(str3, str2)) != null) {
                    liveCombineApiRequestSubBizLogDataLIZJ.requestState = 1;
                }
            }
            final C497120JeY c497120JeY2 = (C497120JeY) awS151S1200000_7.l1;
            C0X9S<C1515820pY4<LiveCombineResponse>> c0x9s = c497120JeY2.LIZIZ;
            if (c0x9s != null) {
                c0x9s.cancel();
            }
            C480460Ism.LIZ().getClass();
            C0X9S<C1515820pY4<LiveCombineResponse>> enterRoomCombineApi = ((LiveCombineApi) C480460Ism.LIZLLL(LiveCombineApi.class)).getEnterRoomCombineApi(liveCombineRequestBody);
            c497120JeY2.LIZIZ = enterRoomCombineApi;
            if (enterRoomCombineApi != null) {
                enterRoomCombineApi.enqueue(new InterfaceC594300NSq<C1515820pY4<LiveCombineResponse>>() { // from class: X.0Jea
                    @Override // X.InterfaceC594300NSq
                    public final void onFailure(C0X9S<C1515820pY4<LiveCombineResponse>> c0x9s2, Throwable th) {
                        if (c0x9s2.isCanceled()) {
                            C497060JeS.LIZLLL(9, c497120JeY2.LJIIJJI, false);
                            return;
                        }
                        C497060JeS.LIZLLL(7, c497120JeY2.LJIIJJI, false);
                        if (LiveCombineRequestExp.INSTANCE.shouldAddFailedReqWhenApiFailure()) {
                            c497120JeY2.LJIIIZ.incrementAndGet();
                        }
                        C497120JeY<Object> c497120JeY3 = c497120JeY2;
                        Iterator<T> it2 = c497120JeY3.LJI.iterator();
                        while (it2.hasNext()) {
                            c497120JeY3.LIZ(1, (String) it2.next());
                        }
                    }

                    @Override // X.InterfaceC594300NSq
                    public final void onResponse(C0X9S<C1515820pY4<LiveCombineResponse>> c0x9s2, C0X52<C1515820pY4<LiveCombineResponse>> c0x52) {
                        C11LG c11lgLJIJI = AbstractC19484711Kz.LJIJI(new ACallableS239S0200000_7(c0x52, c497120JeY2, 2));
                        ExecutorService executorService = c497120JeY2.LIZLLL;
                        C11RO c11ro = C11S5.LIZ;
                        InterfaceC420801kM interfaceC420801kMLJJIIZ = c11lgLJIJI.LJJIJIIJI(new C19501611Rm(executorService)).LJJIIZ(new C09JN() { // from class: X.0Jed
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj4) {
                                C1C7U.LIZ("LiveCombineReqeust@92d7.doCombineRequest$1$onResponse$2");
                                C1C7U.LIZIZ("LiveCombineReqeust@92d7.doCombineRequest$1$onResponse$2");
                            }
                        }, new AfS176S0100000_7(c497120JeY2, 249));
                        C11NJ c11nj = c497120JeY2.LJIILJJIL;
                        if (c11nj != null) {
                            c11nj.LIZ(interfaceC420801kMLJJIIZ);
                        }
                    }
                });
            }
        }
        C497120JeY c497120JeY3 = (C497120JeY) awS151S1200000_7.l1;
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            c497120JeY3.LIZ(3, (String) it2.next());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS151S1200000_7 awS151S1200000_7, Object obj, Object obj2) {
        String message;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Throwable th = (Throwable) obj2;
        ((Function2) awS151S1200000_7.l1).invoke(Boolean.valueOf(zBooleanValue), th);
        C816050Vzn c816050Vzn = (C816050Vzn) awS151S1200000_7.l2;
        String str = awS151S1200000_7.s0;
        if (th == null || (message = th.getMessage()) == null) {
            message = "success";
        }
        c816050Vzn.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("method_type", "easy");
        c2344009Gk.LIZJ(zBooleanValue ? 1 : 0, "success");
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("error_msg", message);
        C20684815ws.LJIILLIIL("rd_feed_launcher_shortcut_add_result", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS151S1200000_7(C497120JeY c497120JeY, C497120JeY<Object> c497120JeY2, String str, Map<String, ? extends Object> map) {
        super(2);
        this.$t = map;
        this.l1 = c497120JeY;
        this.s0 = c497120JeY2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S1200000_7(C816050Vzn c816050Vzn, String str, Function2 function2, int i) {
        super(2);
        this.$t = i;
        this.l1 = function2;
        this.l2 = c816050Vzn;
        this.s0 = str;
    }
}
