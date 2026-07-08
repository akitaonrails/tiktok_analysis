package com.ss.android.ugc.aweme.feed;

import X.C086I;
import X.C0COD;
import X.C1238740iLA;
import X.C1492500owS;
import X.C1594720rbK;
import X.C15O7;
import X.C1601310rlx;
import X.C1602660ro8;
import X.C1C7U;
import X.C20684815ws;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C307420C3g;
import X.C590420NDs;
import X.C810560Vqw;
import X.C823050WQl;
import X.CallableC1601210rln;
import X.InterfaceC1601220rlo;
import X.RunnableC1601200rlm;
import Y.ACallableS94S0101000_4;
import Y.ARunnableS2S2000000_9;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ab.GapFixConfig;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class Feed0VVManager {
    public static Boolean LIZ = null;
    public static long LIZIZ = -1;
    public static volatile Boolean LIZJ = null;
    public static long LIZLLL = -1;
    public static long LJ = -1;
    public static long LJFF = -1;
    public static volatile boolean LJI;
    public static Queue<Runnable> LJII;
    public static boolean LJIIIIZZ;
    public static RunnableC1601200rlm LJIIIZ;

    static {
        TimeUnit.SECONDS.toMillis(3L);
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static class CancelableHandlerWrapper extends BPEAHandler {
        public final Handler LL;

        public CancelableHandlerWrapper(Handler handler) {
            this.LL = handler;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("Feed0VVManager$CancelableHandlerWrapper@8279.handleMessage");
            super.handleMessage(message);
            Feed0VVManager.LIZ = Boolean.FALSE;
            this.LL.handleMessage(message);
            C1C7U.LIZIZ("Feed0VVManager$CancelableHandlerWrapper@8279.handleMessage");
        }
    }

    public static void LIZ(String str, List list) {
        if (C1238740iLA.LIZIZ().LIZ(0, "cold_start_times") <= 1) {
            if (C086I.LIZIZ(list)) {
                LIZLLL("Aweme_Items_is_null", str);
                return;
            }
            Aweme aweme = (Aweme) ListProtector.get(list, 0);
            if (aweme == null) {
                LIZLLL("Aweme_is_null", str);
                return;
            }
            if (aweme.getVideo() == null) {
                LIZLLL("video_is_null", str);
                return;
            }
            if (aweme.getVideo().getPlayAddr() == null) {
                LIZLLL("playAddr_is_null", str);
            } else if (C086I.LIZIZ(aweme.getVideo().getPlayAddr().getUrlList())) {
                LIZLLL("UrlList_is_null", str);
            } else if (TextUtils.isEmpty((CharSequence) ListProtector.get(aweme.getVideo().getPlayAddr().getUrlList(), 0))) {
                LIZLLL("first_video_url_is_null", str);
            }
        }
    }

    public static void LIZLLL(String str, String str2) {
        ARunnableS2S2000000_9 aRunnableS2S2000000_9 = new ARunnableS2S2000000_9(str, str2, 0);
        if (LJ != -1) {
            C810560Vqw.LJ(aRunnableS2S2000000_9);
            return;
        }
        if (LJII == null) {
            LJII = new LinkedBlockingQueue();
        }
        ((LinkedBlockingQueue) LJII).offer(aRunnableS2S2000000_9);
    }

    public static void LIZJ(long j, Object obj, boolean z) {
        if (!C20684815ws.LJI("pull_out_cache_video")) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = CardStruct.IStatusCode.DEFAULT;
        if (obj != null && (obj instanceof FeedItemList)) {
            c2344009Gk.LJIIIIZZ("is_cache", "1");
            if (z) {
                str = "1";
            }
            c2344009Gk.LJIIIIZZ("is_timeout", str);
            FeedItemList feedItemList = (FeedItemList) obj;
            c2344009Gk.LIZJ(feedItemList.getItems().size(), "cache_num");
            StringBuilder sb = new StringBuilder();
            if (!C086I.LIZIZ(feedItemList.getItems())) {
                Iterator<Aweme> it2 = feedItemList.getItems().iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next().getAid());
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            c2344009Gk.LJIIIIZZ("group_id_list", sb.toString());
            c2344009Gk.LIZLLL(j, "cache_time");
            C590420NDs.LIZ.getClass();
            c2344009Gk.LJFF("from_type", C590420NDs.LJI().getString("feed_cache_source", "def"));
        } else {
            c2344009Gk.LJIIIIZZ("is_cache", CardStruct.IStatusCode.DEFAULT);
            c2344009Gk.LJIIIIZZ("is_timeout", CardStruct.IStatusCode.DEFAULT);
            c2344009Gk.LIZJ(0, "cache_num");
            c2344009Gk.LJIIIIZZ("group_id_list", "");
            c2344009Gk.LIZLLL(j, "cache_time");
        }
        C20684815ws.LJIILLIIL("pull_out_cache_video", c2344009Gk.LIZ);
    }

    public static void LJ(int i, String str, List list, boolean z) {
        if (list != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme awemeLLILLL = (Aweme) ListProtector.get(list, i2);
                if (TextUtils.isEmpty(awemeLLILLL.getRequestId())) {
                    awemeLLILLL.setRequestId(str);
                }
                AwemeExtKt.setPb2AwemeMillis(awemeLLILLL, jCurrentTimeMillis);
                String requestId = awemeLLILLL.getRequestId();
                if (!C1594720rbK.LIZIZ(awemeLLILLL)) {
                    awemeLLILLL = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(awemeLLILLL);
                }
                if (z && awemeLLILLL != null && (!((GapFixConfig) C1602660ro8.LIZIZ.getValue()).fixResetItemPosition || !C2093608Ic.LIZJ(requestId, awemeLLILLL.getRequestId()))) {
                    AwemeExtKt.resetSessionData(awemeLLILLL);
                }
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(awemeLLILLL.getAid());
                sbLIZ.append(i);
                iRequestIdService.LIZIZ(i2, C2188811AlT.LIZIZ(sbLIZ), str);
                if (!(list instanceof ArrayList)) {
                    list = new ArrayList(list);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0rlh, java.lang.Object] */
    public static void LIZIZ(final int i, final int i2, WeakHandler weakHandler, final Callable callable, final int i3, boolean z, final Lock lock) {
        final BPEAHandler cancelableHandlerWrapper;
        final Callable callable2;
        boolean z2;
        boolean z3 = false;
        if (z && i == 0 && (LIZ == null ? i2 != 14 : i2 == 0) && weakHandler != null) {
            LIZ = Boolean.TRUE;
            if (LIZLLL != -1) {
                LJFF = SystemClock.elapsedRealtime() - LIZLLL;
            }
            cancelableHandlerWrapper = new CancelableHandlerWrapper(weakHandler);
            callable2 = new Callable(i2, callable) { // from class: X.0rln
                public final Callable LL;
                public final int LLILLJJLI;

                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    FeedItemList data;
                    String strLJIJJ;
                    InterfaceC1601220rlo interfaceC1601220rloLIZ;
                    I18nManagerServiceApi i18nManagerServiceApiLIZ;
                    InterfaceC1601220rlo interfaceC1601220rloLIZ2;
                    C1C7U.LIZ("Feed0VVManager$CallableWrapper@c48d.call");
                    ServiceManager.get().getService(IAwemeService.class);
                    C1393460mMi.LJFF.LIZIZ();
                    C1589360rSg.LIZ.getClass();
                    if (C1589360rSg.LIZIZ) {
                        C1589360rSg.LIZIZ = false;
                        String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
                        if (!Intrinsics.LJFF(C1589360rSg.LJFF, curUserId) && (interfaceC1601220rloLIZ2 = C1601310rlx.LIZIZ.LIZ()) != null) {
                            interfaceC1601220rloLIZ2.LJ(null);
                        }
                        C1589360rSg.LJFF = curUserId;
                        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
                        if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null) {
                            strLJIJJ = null;
                        } else {
                            C844470XAv.LIZ.getClass();
                            strLJIJJ = i18nManagerServiceApiLIZ.LJIJJ(C844470XAv.LIZ());
                        }
                        if ((strLJIJJ == null || !Intrinsics.LJFF(C1589360rSg.LJI, strLJIJJ)) && (interfaceC1601220rloLIZ = C1601310rlx.LIZIZ.LIZ()) != null) {
                            interfaceC1601220rloLIZ.LJ(null);
                        }
                        C1589360rSg.LJI = strLJIJJ;
                    }
                    C1602860roS.LIZ.getClass();
                    if (C1602860roS.LJ() && C1602860roS.LIZLLL()) {
                        try {
                            data = (FeedItemList) C23250099c.LJ(C23271099x.INSTANCE, new C590880NFm(null));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            data = null;
                        }
                    } else {
                        data = C1601310rlx.LIZIZ.LIZ().getData();
                    }
                    C1150504el.LIZ().LJI("feed_api_to_ui_response", false);
                    C1150504el.LIZ().LIZLLL("feed_ui_response_to_post_msg", false);
                    if (data == null || this.LLILLJJLI == 14) {
                        Feed0VVManager.LIZJ(0L, null, false);
                    } else {
                        if (data.isFromBackupVideo) {
                            C1C7U.LIZIZ("Feed0VVManager$CallableWrapper@c48d.call");
                            return data;
                        }
                        if (!data.isFromLocalCache) {
                            C0NEY.LIZ(1, "data_preload_is_loaded");
                            C0NEY.LIZ("preload", "data_type");
                            if (data.isFromUnusedFeed && C581760Mrm.LIZIZ) {
                                C581760Mrm.LJ = 1;
                                C581760Mrm.LJI = data.size();
                            }
                            C1C7U.LIZIZ("Feed0VVManager$CallableWrapper@c48d.call");
                            return data;
                        }
                        long j = C1238740iLA.LIZ().LIZ.getLong("key_feed_cache_time", 0L);
                        if (System.currentTimeMillis() - j <= 0) {
                            Feed0VVManager.LIZJ(j, data, false);
                            C0NEY.LIZ(1, "data_preload_is_loaded");
                            C0NEY.LIZ("preload", "data_type");
                            C1C7U.LIZIZ("Feed0VVManager$CallableWrapper@c48d.call");
                            return data;
                        }
                        Feed0VVManager.LIZJ(j, data, true);
                    }
                    C0NEY.LIZ("common_fetch", "data_type");
                    Object objCall = this.LL.call();
                    C1C7U.LIZIZ("Feed0VVManager$CallableWrapper@c48d.call");
                    return objCall;
                }

                {
                    this.LL = callable;
                    this.LLILLJJLI = i2;
                }
            };
        } else {
            cancelableHandlerWrapper = weakHandler;
            callable2 = callable;
        }
        if (C1492500owS.LIZ() && (i == 1 || i == 0)) {
            NoNetDetectHelper.LIZJ(weakHandler);
        }
        ?? r10 = new Runnable() { // from class: X.0rlh
            /* JADX WARN: Removed duplicated region for block: B:107:0x028b  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x02e6  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x02ed  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 854
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1601150rlh.run():void");
            }
        };
        C307420C3g.LIZ(i2, "full_feed_thread_switch_cost_1");
        if ((C0COD.LIZLLL() & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            InterfaceC1601220rlo interfaceC1601220rloLIZ = C1601310rlx.LIZIZ.LIZ();
            if (interfaceC1601220rloLIZ != 0 && interfaceC1601220rloLIZ.LIZ()) {
                z3 = true;
            }
            if ((callable2 instanceof CallableC1601210rln) && !z3 && interfaceC1601220rloLIZ != 0) {
                interfaceC1601220rloLIZ.LIZLLL(r10);
                return;
            } else {
                C15O7.LIZIZ(new ACallableS94S0101000_4(r10, i2, 1), C823050WQl.LIZLLL(), null);
                return;
            }
        }
        C15O7.LIZIZ(new ACallableS94S0101000_4(r10, i2, 1), C823050WQl.LIZLLL(), null);
    }
}
