package com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment;

import X.C09CT;
import X.C11NZ;
import X.C15438062q;
import X.C1735430vGH;
import X.C1907807dc;
import X.C1908007de;
import X.C20546415aY;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C603550Nlp;
import X.C814420VxA;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1735440vGI;
import X.InterfaceC20685415wy;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import realtimefeedback.IRealtimeFeedbackService;

/* JADX INFO: loaded from: classes32.dex */
public final class RealtimeFeedbackInterceptor implements InterfaceC20685415wy {
    public static boolean LIZIZ;
    public static C1735430vGH LIZLLL;
    public static Function0<Unit> LJ;
    public static IRealtimeFeedbackService LJI;
    public static final RealtimeFeedbackInterceptor LIZ = new RealtimeFeedbackInterceptor();
    public static final ArrayList<C1908007de> LIZJ = new ArrayList<>();
    public static final C20546415aY LJFF = new C20546415aY();

    public interface RealtimeApi {
        @InterfaceC1501170pAR("/tiktok/v1/realtime/feedback/")
        C11NZ<RealtimeFeedbackModel.RealtimeFeedbackResponse> uploadCombinedRealtimeFeedbackRequest(@InterfaceC1485405rg RealtimeFeedbackModel.RealtimeFeedbackVideoRequest realtimeFeedbackVideoRequest);
    }

    public final synchronized void LIZIZ() {
        C1735430vGH c1735430vGH = LIZLLL;
        if (c1735430vGH == null || c1735430vGH.LIZIZ()) {
            C1735430vGH c1735430vGH2 = new C1735430vGH(6000L, Mp4ScreenVideoLoadTimeout.CONTROL, new InterfaceC1735440vGI() { // from class: X.15aW
                @Override // X.InterfaceC1735440vGI
                public final void onStart() {
                }

                @Override // X.InterfaceC1735440vGI
                public final void LIZLLL() {
                    C1735430vGH c1735430vGH3 = RealtimeFeedbackInterceptor.LIZLLL;
                    if (c1735430vGH3 != null) {
                        c1735430vGH3.LIZ();
                    }
                    RealtimeFeedbackInterceptor.LIZLLL = null;
                    if (!RealtimeFeedbackInterceptor.LIZJ.isEmpty()) {
                        C15O7.LIZJ(new Callable() { // from class: X.08A5
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C1C7U.LIZ("RealtimeFeedbackInterceptor@e5f0.createTimerInstanceIfNeeded$1$onFinish$1");
                                RealtimeFeedbackInterceptor.LIZ.LIZIZ();
                                Unit unit = Unit.LIZ;
                                C1C7U.LIZIZ("RealtimeFeedbackInterceptor@e5f0.createTimerInstanceIfNeeded$1$onFinish$1");
                                return unit;
                            }
                        });
                    }
                }

                @Override // X.InterfaceC1735440vGI
                public final void LJJI(long j) {
                    if (j >= Mp4ScreenVideoLoadTimeout.CONTROL) {
                        return;
                    }
                    ArrayList<C1908007de> arrayList = RealtimeFeedbackInterceptor.LIZJ;
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    arrayList.clear();
                    IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("https://");
                    sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
                    RealtimeFeedbackInterceptor.RealtimeApi realtimeApi = (RealtimeFeedbackInterceptor.RealtimeApi) iRetrofitFactory.createBuilder(C2188811AlT.LIZIZ(sbLIZ)).build().retrofit.LIZ(RealtimeFeedbackInterceptor.RealtimeApi.class);
                    try {
                        RealtimeFeedbackInterceptor.LIZ.getClass();
                        realtimeApi.uploadCombinedRealtimeFeedbackRequest(RealtimeFeedbackInterceptor.LIZJ(arrayList2)).LJL(C11S5.LIZ()).LJLIIL(1L).LIZIZ(new InterfaceC626120Oh8<RealtimeFeedbackInterceptor.RealtimeFeedbackModel.RealtimeFeedbackResponse>() { // from class: X.15aX
                            @Override // X.InterfaceC626120Oh8
                            public final void onComplete() {
                            }

                            @Override // X.InterfaceC626120Oh8
                            public final void onError(Throwable th) {
                            }

                            @Override // X.InterfaceC626120Oh8
                            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                            }

                            @Override // X.InterfaceC626120Oh8
                            public final void onNext(RealtimeFeedbackInterceptor.RealtimeFeedbackModel.RealtimeFeedbackResponse realtimeFeedbackResponse) {
                                if (Intrinsics.LJFF(realtimeFeedbackResponse.stop, Boolean.TRUE)) {
                                    C1735430vGH c1735430vGH3 = RealtimeFeedbackInterceptor.LIZLLL;
                                    if (c1735430vGH3 != null) {
                                        c1735430vGH3.LIZ();
                                    }
                                    RealtimeFeedbackInterceptor.LIZLLL = null;
                                    RealtimeFeedbackInterceptor.LJFF.LIZIZ.storeBoolean("kill_switch", true);
                                    Function0<Unit> function0 = RealtimeFeedbackInterceptor.LJ;
                                    if (function0 != null) {
                                        function0.invoke();
                                    }
                                }
                            }
                        });
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
            LIZLLL = c1735430vGH2;
            c1735430vGH2.LIZ();
            C1735430vGH c1735430vGH3 = LIZLLL;
            if (c1735430vGH3 != null) {
                c1735430vGH3.LJFF();
            }
        } else {
            C1735430vGH c1735430vGH4 = LIZLLL;
            if (c1735430vGH4 != null) {
                c1735430vGH4.LJ();
            }
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static final class RealtimeFeedbackModel {
        public static final Map<String, Integer> LIZ = C2097608Jq.LJIIIIZZ(new Pair("7189836604524267521", Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT)), new Pair("7317204396889081858", 1001), new Pair("7241029222343378946", 1002), new Pair("7206222432464537602", 1003), new Pair("7225532031613011970", 1004), new Pair("7225893443347286017", 1005), new Pair("7312665698193377281", 1006), new Pair("7327951628873500674", 1007), new Pair("7327952245894350849", 1008));
        public static final Map<String, Integer> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("like", 100), new Pair("video_play_finish", 101), new Pair("follow", 102), new Pair("share_video", 103), new Pair("enter_music_detail", 104), new Pair("favourite_video", 105), new Pair("enter_personal_detail", 106), new Pair("dislike", 200), new Pair("like_cancel", 201), new Pair("video_play_end", Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)), new Pair("post_comment", 301), new Pair("download", 400), new Pair("search", 401), new Pair("click_comment_button", 402), new Pair("Video_feedback_bar_disappear", 403), new Pair("play_time", 501));

        public static final class RealtimeFeedbackResponse extends BaseResponse {

            @C09CT("stop")
            public final Boolean stop;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RealtimeFeedbackResponse) && Intrinsics.LJFF(this.stop, ((RealtimeFeedbackResponse) obj).stop);
            }

            public final int hashCode() {
                Boolean bool = this.stop;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RealtimeFeedbackResponse(stop=");
                sbLIZ.append(this.stop);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public RealtimeFeedbackResponse(Boolean bool) {
                this.stop = bool;
            }
        }

        public static final class RealtimeFeedbackVideoRequest {

            @C09CT("realtime_feedback_video")
            public final List<ContentParamsV2> contentParamsV2;

            @C09CT("is_reinstall")
            public final Integer isReinstall;

            public RealtimeFeedbackVideoRequest(List<ContentParamsV2> list, Integer num) {
                this.contentParamsV2 = list;
                this.isReinstall = num;
            }
        }

        public static final class ContentParamsV2 {

            @C09CT("action_types")
            public final List<Integer> actionTypes;

            @C09CT("author_id")
            public final String authorId;

            @C09CT("group_id")
            public final String groupId;

            @C09CT("impr_count")
            public final Integer imprCount;

            @C09CT("impr_count_per_session")
            public final Integer imprCountPerSession;

            @C09CT("item_id")
            public final String itemId;

            @C09CT("play_duration")
            public final Object playDuration;

            @C09CT("video_duration")
            public final Object videoDuration;

            public ContentParamsV2(String str, Object obj, Object obj2, String str2, String str3, Integer num, List<Integer> list, Integer num2) {
                this.itemId = str;
                this.playDuration = obj;
                this.videoDuration = obj2;
                this.groupId = str2;
                this.authorId = str3;
                this.imprCount = num;
                this.actionTypes = list;
                this.imprCountPerSession = num2;
            }
        }
    }

    public static RealtimeFeedbackModel.RealtimeFeedbackVideoRequest LIZJ(ArrayList arrayList) {
        String string;
        String str;
        Long lValueOf;
        String str2;
        Long lValueOf2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Integer numValueOf;
        String str12;
        Integer numValueOf2;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        ArrayList<C1908007de> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            String str21 = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            C1908007de c1908007de = (C1908007de) next;
            Map<String, Integer> map = RealtimeFeedbackModel.LIZ;
            String str22 = c1908007de.LIZ;
            Map<String, String> map2 = c1908007de.LIZIZ;
            if (map2 != null) {
                str18 = map2.get("survey_id");
            } else {
                str18 = null;
            }
            if (str18 instanceof String) {
                str19 = str18;
            } else {
                str19 = null;
            }
            Map<String, String> map3 = c1908007de.LIZIZ;
            if (map3 != null) {
                str20 = map3.get("result");
            } else {
                str20 = null;
            }
            if (str20 instanceof String) {
                str21 = str20;
            }
            if (C603550Nlp.LIZ(str22, str19, str21) != -1) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        for (C1908007de c1908007de2 : arrayList2) {
            Map<String, String> map4 = c1908007de2.LIZIZ;
            if (map4 != null && (str17 = map4.get("item_id")) != null) {
                string = str17.toString();
            } else {
                string = null;
            }
            Map<String, String> map5 = c1908007de2.LIZIZ;
            if (map5 != null) {
                str = map5.get("play_duration");
            } else {
                str = null;
            }
            if ((str instanceof String) && (str16 = str) != null) {
                lValueOf = Long.valueOf(CastLongProtector.parseLong(str16));
            } else {
                lValueOf = null;
            }
            Map<String, String> map6 = c1908007de2.LIZIZ;
            if (map6 != null) {
                str2 = map6.get("video_duration");
            } else {
                str2 = null;
            }
            if ((str2 instanceof String) && (str15 = str2) != null) {
                lValueOf2 = Long.valueOf(C814420VxA.LIZJ(CastFloatProtector.parseFloat(str15)));
            } else {
                lValueOf2 = null;
            }
            Map<String, Integer> map7 = RealtimeFeedbackModel.LIZ;
            String str23 = c1908007de2.LIZ;
            Map<String, String> map8 = c1908007de2.LIZIZ;
            if (map8 != null) {
                str3 = map8.get("survey_id");
            } else {
                str3 = null;
            }
            if (str3 instanceof String) {
                str4 = str3;
            } else {
                str4 = null;
            }
            Map<String, String> map9 = c1908007de2.LIZIZ;
            if (map9 != null) {
                str5 = map9.get("result");
            } else {
                str5 = null;
            }
            if (str5 instanceof String) {
                str6 = str5;
            } else {
                str6 = null;
            }
            List listSingletonList = Collections.singletonList(Integer.valueOf(C603550Nlp.LIZ(str23, str4, str6)));
            Map<String, String> map10 = c1908007de2.LIZIZ;
            if (map10 != null) {
                str7 = map10.get("group_id");
            } else {
                str7 = null;
            }
            if (str7 instanceof String) {
                str8 = str7;
            } else {
                str8 = null;
            }
            Map<String, String> map11 = c1908007de2.LIZIZ;
            if (map11 != null) {
                str9 = map11.get("author_id");
            } else {
                str9 = null;
            }
            if (str9 instanceof String) {
                str10 = str9;
            } else {
                str10 = null;
            }
            Map<String, String> map12 = c1908007de2.LIZIZ;
            if (map12 != null) {
                str11 = map12.get("impr_count");
            } else {
                str11 = null;
            }
            if ((str11 instanceof String) && (str14 = str11) != null) {
                numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str14));
            } else {
                numValueOf = null;
            }
            Map<String, String> map13 = c1908007de2.LIZIZ;
            if (map13 != null) {
                str12 = map13.get("impr_count_per_session");
            } else {
                str12 = null;
            }
            if ((str12 instanceof String) && (str13 = str12) != null) {
                numValueOf2 = Integer.valueOf(CastIntegerProtector.parseInt(str13));
            } else {
                numValueOf2 = null;
            }
            arrayList3.add(new RealtimeFeedbackModel.ContentParamsV2(string, lValueOf, lValueOf2, str8, str10, numValueOf, listSingletonList, numValueOf2));
        }
        return new RealtimeFeedbackModel.RealtimeFeedbackVideoRequest(arrayList3, Integer.valueOf(((IPluginService) ServiceManager.get().getService(IPluginService.class)).getDeviceCheckResult().getValue()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0228 A[PHI: r2
      0x0228: PHI (r2v60 java.lang.String) = (r2v53 java.lang.String), (r2v61 java.lang.String) binds: [B:88:0x01fe, B:86:0x01fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0213 A[PHI: r2
      0x0213: PHI (r2v58 java.lang.String) = (r2v55 java.lang.String), (r2v59 java.lang.String) binds: [B:95:0x0211, B:93:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.AbstractC1907907dd r17) {
        /*
            Method dump skipped, instruction units count: 1156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor.LIZLLL(X.07dd):void");
    }

    @Override // X.InterfaceC20685415wy
    public void onEvent(String str) {
        if (str == null) {
            return;
        }
        LIZLLL(new C1908007de(str, null));
    }

    @Override // X.InterfaceC20685415wy
    public final void LIZ(String str, Map<String, String> map) {
        if (str == null) {
            return;
        }
        LIZLLL(new C1908007de(str, map));
    }

    @Override // X.InterfaceC20685415wy
    public final void onEvent(String str, JSONObject jSONObject) {
        if (str == null) {
            return;
        }
        LIZLLL(new C1907807dc(str, jSONObject));
    }
}
