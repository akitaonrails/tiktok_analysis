package com.ss.android.ugc.aweme.feed.api;

import X.AbstractC2343909Gj;
import X.C040J;
import X.C09S2;
import X.C0CQT;
import X.C0X9S;
import X.C1227904rF;
import X.C1499850p8J;
import X.C1515980pYK;
import X.C1601460rmC;
import X.C1604930rrn;
import X.C1ESV;
import X.C300530BqF;
import X.C592002So;
import X.C842490X3f;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501290pAd;
import X.InterfaceC1501320pAg;
import X.InterfaceC1515510pXZ;
import X.InterfaceC2177008fw;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.api.FeedApi;
import com.ss.android.ugc.aweme.feed.api.recommend.ProcessorRemoteConfig;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.tiktok.ConvertHelper;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedApi {
    public static volatile int LIZ;
    public static volatile RetrofitApi LIZIZ;
    public static C1604930rrn LIZJ;
    public static final Object LIZLLL = new Object();
    public static final C1515980pYK LJ = new InterfaceC1515510pXZ() { // from class: X.0pYK
        @Override // X.InterfaceC1515510pXZ
        public final void LIZ(Exception exc, TypedInput typedInput) {
            long length;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("type", "error");
                jSONObject.put("error_code", 0);
                length = typedInput.length();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2276411E8h.LIZIZ.LIZLLL("common_feed", e);
                length = 0;
            }
            C793770VBv.LJII("foru_data_parse_monitor", jSONObject, jSONObject2, null);
            C1AF0.LJFF(new RuntimeException("length = " + length, exc), "feedapi");
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[Catch: Exception -> 0x0071, TryCatch #0 {Exception -> 0x0071, blocks: (B:14:0x001d, B:17:0x002f, B:20:0x0039, B:22:0x003f, B:33:0x006b, B:24:0x0047, B:26:0x004d, B:27:0x0058, B:31:0x0060, B:32:0x0064), top: B:38:0x001d }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0058 A[Catch: Exception -> 0x0071, TryCatch #0 {Exception -> 0x0071, blocks: (B:14:0x001d, B:17:0x002f, B:20:0x0039, B:22:0x003f, B:33:0x006b, B:24:0x0047, B:26:0x004d, B:27:0x0058, B:31:0x0060, B:32:0x0064), top: B:38:0x001d }] */
        @Override // X.InterfaceC1515510pXZ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(long r9, java.lang.Object r11, com.squareup.wire.Message r12, boolean r13) {
            /*
                r8 = this;
                boolean r0 = X.C300530BqF.LIZ()
                if (r0 == 0) goto L7
                return
            L7:
                r4 = 0
                if (r13 == 0) goto L11
                boolean r0 = r11 instanceof com.ss.android.ugc.aweme.feed.model.FeedItemList
                if (r0 == 0) goto L1c
                com.ss.android.ugc.aweme.feed.model.FeedItemList r11 = (com.ss.android.ugc.aweme.feed.model.FeedItemList) r11
                goto L1d
            L11:
                boolean r0 = r12 instanceof X.C592002So
                if (r0 == 0) goto L1c
                X.02So r12 = (X.C592002So) r12
                com.ss.android.ugc.aweme.feed.model.FeedItemList r11 = com.ss.android.ugc.tiktok.ConvertHelper.com$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(r12, r4)
                goto L1d
            L1c:
                r11 = r4
            L1d:
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L71
                r6.<init>()     // Catch: java.lang.Exception -> L71
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L71
                r5.<init>()     // Catch: java.lang.Exception -> L71
                java.lang.String r7 = "server_empty"
                java.lang.String r3 = "error_code"
                java.lang.String r2 = "type"
                if (r11 == 0) goto L64
                java.util.List r1 = r11.getItems()     // Catch: java.lang.Exception -> L71
                int r0 = r11.status_code     // Catch: java.lang.Exception -> L71
                if (r0 != 0) goto L45
                if (r1 == 0) goto L58
                int r0 = r1.size()     // Catch: java.lang.Exception -> L71
                if (r0 == 0) goto L47
                java.lang.String r0 = "normal"
                r6.put(r2, r0)     // Catch: java.lang.Exception -> L71
                goto L6b
            L45:
                if (r1 == 0) goto L58
            L47:
                int r0 = r1.size()     // Catch: java.lang.Exception -> L71
                if (r0 == 0) goto L58
                java.lang.String r0 = "error"
                r6.put(r2, r0)     // Catch: java.lang.Exception -> L71
                int r0 = r11.status_code     // Catch: java.lang.Exception -> L71
                r6.put(r3, r0)     // Catch: java.lang.Exception -> L71
                goto L6b
            L58:
                r6.put(r2, r7)     // Catch: java.lang.Exception -> L71
                if (r1 != 0) goto L5f
                r0 = 0
                goto L60
            L5f:
                r0 = 2
            L60:
                r6.put(r3, r0)     // Catch: java.lang.Exception -> L71
                goto L6b
            L64:
                r6.put(r2, r7)     // Catch: java.lang.Exception -> L71
                r0 = 1
                r6.put(r3, r0)     // Catch: java.lang.Exception -> L71
            L6b:
                java.lang.String r0 = "foru_data_parse_monitor"
                X.C793770VBv.LJII(r0, r6, r5, r4)     // Catch: java.lang.Exception -> L71
                return
            L71:
                r2 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
                X.1E8h r1 = X.C2276411E8h.LIZIZ
                java.lang.String r0 = "common_feed"
                r1.LIZLLL(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1515980pYK.LIZIZ(long, java.lang.Object, com.squareup.wire.Message, boolean):void");
        }
    };

    /* JADX INFO: loaded from: classes24.dex */
    public interface RetrofitApi {
        @C040J
        @InterfaceC1501170pAR("/aweme/v2/feed/")
        @InterfaceC1501320pAg(2)
        C0X9S<TypedInput> fetchInitialFeedStream(@InterfaceC2177008fw Object obj, @InterfaceC1485405rg C1ESV c1esv);

        @InterfaceC1501290pAd(4)
        @InterfaceC1501170pAR("/aweme/v2/feed/")
        @InterfaceC1501320pAg(3)
        C0X9S<ComposePbAndJson<C592002So, FeedItemList>> postFetchRecommendFeedV2Call(@InterfaceC2177008fw Object obj, @InterfaceC1485405rg C1ESV c1esv);

        @InterfaceC1501290pAd(4)
        @InterfaceC1501170pAR("/aweme/v2/feed/")
        @InterfaceC1501320pAg(3)
        C0X9S<FeedItemList> postFetchRecommendFeedV2CallNew(@InterfaceC2177008fw Object obj, @InterfaceC1485405rg C1ESV c1esv);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0rrn] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0rrn] */
    public static FeedItemList LIZ(C1601460rmC c1601460rmC) {
        if (LIZIZ == null) {
            synchronized (LIZLLL) {
                try {
                    if (LIZIZ == null) {
                        C1499850p8J c1499850p8J = (C1499850p8J) C09S2.LIZIZ(C0CQT.LIZJ);
                        c1499850p8J.LJFF(C842490X3f.LIZ());
                        C1227904rF.LIZ.getClass();
                        final Gson gsonLIZLLL = C1227904rF.LIZLLL();
                        c1499850p8J.LIZJ(new AbstractC2343909Gj(gsonLIZLLL) { // from class: X.0pXT
                            public final Gson LIZ;

                            {
                                if (gsonLIZLLL != null) {
                                    this.LIZ = gsonLIZLLL;
                                    return;
                                }
                                throw new NullPointerException("gson == null");
                            }

                            @Override // X.AbstractC2343909Gj
                            public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
                                if (!(type instanceof Class) || !FeedItemList.class.isAssignableFrom((Class) type)) {
                                    return null;
                                }
                                final Gson gson = this.LIZ;
                                return new InterfaceC1501660pBE<TypedInput, FeedItemList>(gson) { // from class: X.0pXW
                                    public final C1515470pXV<C592002So> LIZ = new C1515470pXV<>(ProtoAdapter.get(C592002So.class));
                                    public final C2337109Dt<FeedItemList> LIZIZ;

                                    {
                                        this.LIZIZ = new C2337109Dt<>(gson, gson.LJIIIZ(TypeToken.get(FeedItemList.class)));
                                    }

                                    @Override // X.InterfaceC1501660pBE
                                    public final FeedItemList LIZ(TypedInput typedInput) {
                                        TypedInput typedInput2 = typedInput;
                                        String strMimeType = typedInput2.mimeType();
                                        if (!TextUtils.isEmpty(strMimeType) && a0.LJJIIZI(strMimeType, "json", false)) {
                                            return this.LIZIZ.LIZ(typedInput2);
                                        }
                                        C592002So c592002So = (C592002So) this.LIZ.LIZ(typedInput2);
                                        FeedItemList feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelper.com$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(c592002So, null);
                                        feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.pbData = c592002So;
                                        return feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
                                    }
                                };
                            }

                            @Override // X.AbstractC2343909Gj
                            public final InterfaceC1501660pBE<?, TypedOutput> LIZLLL(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
                                if (!(type instanceof Class)) {
                                    return null;
                                }
                                Class cls = (Class) type;
                                if (!Message.class.isAssignableFrom(cls)) {
                                    return null;
                                }
                                return new C1515460pXU(ProtoAdapter.get(cls));
                            }
                        });
                        c1499850p8J.LJI = LJ;
                        LIZIZ = (RetrofitApi) c1499850p8J.build().retrofit.LIZ(RetrofitApi.class);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        final RetrofitApi retrofitApi = LIZIZ;
        if (C300530BqF.LIZ()) {
            if (LIZJ == null) {
                LIZJ = new Object(retrofitApi) { // from class: X.0rrn
                    public static int LJ;
                    public final FeedApi.RetrofitApi LIZ;
                    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1604870rrh(this));
                    public final C01GW LIZJ = C452501pT.LIZIZ(new C1601170rlj(this));
                    public final C01GW LIZLLL = C452501pT.LIZ(EnumC452301pR.NONE, new C1601290rlv());

                    public final AbstractC1604130rqV LIZ() {
                        return (AbstractC1604130rqV) this.LIZLLL.getValue();
                    }

                    {
                        this.LIZ = retrofitApi;
                    }

                    public final FeedItemList LIZJ(C1601460rmC c1601460rmC2) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            try {
                                if (C0AET.LIZ()) {
                                    JatoXL.setPriority(Process.myTid(), -1);
                                }
                                C0XLL c0xll = new C0XLL(new C1EST());
                                int i = LJ;
                                LJ = i + 1;
                                c1601460rmC2.LJJJIL = i;
                                LIZLLL(c0xll, c1601460rmC2);
                                C1601590rmP c1601590rmP = c1601460rmC2.LJJJ;
                                if (c1601590rmP != null) {
                                    c1601590rmP.LIZJ = System.currentTimeMillis() - jCurrentTimeMillis;
                                }
                                Pair<C0XLK, FeedItemList> pairLJ = LJ(c0xll, c1601460rmC2);
                                FeedItemList second = pairLJ.getSecond();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                LIZIZ(c1601460rmC2, second);
                                C1601590rmP c1601590rmP2 = c1601460rmC2.LJJJ;
                                if (c1601590rmP2 != null) {
                                    c1601590rmP2.LIZLLL = System.currentTimeMillis() - jCurrentTimeMillis2;
                                }
                                C1601590rmP c1601590rmP3 = c1601460rmC2.LJJJ;
                                if (c1601590rmP3 != null) {
                                    c1601590rmP3.LJ = System.currentTimeMillis() - jCurrentTimeMillis;
                                }
                                C1601950rmz c1601950rmz = C1601950rmz.LIZ;
                                C0XLK first = pairLJ.getFirst();
                                c1601950rmz.getClass();
                                C1601950rmz.LIZIZ(c1601460rmC2, first, second);
                                if (C0AET.LIZ()) {
                                    JatoXL.resetPriority(Process.myTid());
                                }
                                return second;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1601590rmP c1601590rmP4 = c1601460rmC2.LJJJ;
                                if (c1601590rmP4 != null) {
                                    c1601590rmP4.LJ = System.currentTimeMillis() - jCurrentTimeMillis;
                                }
                                C1601950rmz.LIZ.getClass();
                                C1601950rmz.LIZ(c1601460rmC2, e);
                                AbstractC1604130rqV abstractC1604130rqVLIZ = LIZ();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("postFetchRecommendFeedV2 failed, pullType=");
                                sbLIZ.append(c1601460rmC2.LIZIZ);
                                sbLIZ.append(", feedType=");
                                sbLIZ.append(c1601460rmC2.LIZ);
                                sbLIZ.append(", awemeId=");
                                sbLIZ.append(c1601460rmC2.LIZLLL);
                                abstractC1604130rqVLIZ.LJI(C2188811AlT.LIZIZ(sbLIZ), e);
                                throw e;
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            if (C0AET.LIZ()) {
                                JatoXL.resetPriority(Process.myTid());
                            }
                            throw th2;
                        }
                    }

                    public final void LIZIZ(C1601460rmC c1601460rmC2, FeedItemList feedItemList) {
                        ArrayList<String> arrayList;
                        List list = (List) this.LIZJ.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list) {
                            InterfaceC1333005Jo interfaceC1333005Jo = (InterfaceC1333005Jo) obj;
                            ProcessorRemoteConfig processorRemoteConfig = (ProcessorRemoteConfig) C1604980rrs.LIZIZ.getValue();
                            if (processorRemoteConfig == null || (arrayList = processorRemoteConfig.blockList) == null || !arrayList.contains(interfaceC1333005Jo.getTag())) {
                                arrayList2.add(obj);
                            }
                        }
                        new C1440305kP(arrayList2, c1601460rmC2, feedItemList, LIZ()).LIZ();
                    }

                    public final void LIZLLL(C0XLL c0xll, C1601460rmC c1601460rmC2) {
                        C1440305kP c1440305kP;
                        ArrayList<String> arrayList;
                        System.currentTimeMillis();
                        List list = (List) this.LIZIZ.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list) {
                            InterfaceC1333005Jo interfaceC1333005Jo = (InterfaceC1333005Jo) obj;
                            ProcessorRemoteConfig processorRemoteConfig = (ProcessorRemoteConfig) C1604980rrs.LIZIZ.getValue();
                            if (processorRemoteConfig == null || (arrayList = processorRemoteConfig.blockList) == null || !arrayList.contains(interfaceC1333005Jo.getTag())) {
                                arrayList2.add(obj);
                            }
                        }
                        if (((Number) C300530BqF.LIZ.getValue()).intValue() == 1) {
                            LIZ().LJIIIZ("processRequest. adaptive parallel process");
                            c1440305kP = new C1337905Ll(arrayList2, c1601460rmC2, c0xll, LIZ());
                        } else {
                            C1332705Jl c1332705Jl = C1332705Jl.LIZ;
                            int i = c1601460rmC2.LIZIZ;
                            c1332705Jl.getClass();
                            if ((((Boolean) C269610AhT.LIZ.getValue()).booleanValue() && i == 2) || ((((Boolean) C0BZJ.LIZIZ.getValue()).booleanValue() && i == 0) || (((Boolean) C0BZJ.LIZJ.getValue()).booleanValue() && i == 2))) {
                                LIZ().LJIIIZ("processRequest. parallel process");
                                c1440305kP = new C1332905Jn(arrayList2, c1601460rmC2, c0xll, LIZ());
                            } else {
                                LIZ().LJIIIZ("processRequest. serial process");
                                c1440305kP = new C1440305kP(arrayList2, c1601460rmC2, c0xll, LIZ());
                            }
                        }
                        c1440305kP.LIZ();
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:300:0x05f2, code lost:
                    
                        if (r2 == null) goto L301;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c8, code lost:
                    
                        if (r2 != null) goto L319;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:105:0x0254  */
                    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
                    /* JADX WARN: Removed duplicated region for block: B:123:0x02a1  */
                    /* JADX WARN: Removed duplicated region for block: B:172:0x03e4  */
                    /* JADX WARN: Removed duplicated region for block: B:260:0x052d  */
                    /* JADX WARN: Removed duplicated region for block: B:268:0x0557  */
                    /* JADX WARN: Removed duplicated region for block: B:294:0x05db  */
                    /* JADX WARN: Removed duplicated region for block: B:297:0x05e3  */
                    /* JADX WARN: Removed duplicated region for block: B:305:0x05ff  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final kotlin.Pair<X.C0XLK, com.ss.android.ugc.aweme.feed.model.FeedItemList> LJ(X.C0XLL r22, X.C1601460rmC r23) throws java.io.IOException {
                        /*
                            Method dump skipped, instruction units count: 1638
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1604930rrn.LJ(X.0XLL, X.0rmC):kotlin.Pair");
                    }
                };
            }
            return LIZJ.LIZJ(c1601460rmC);
        }
        return new Object(retrofitApi) { // from class: X.0rrn
            public static int LJ;
            public final FeedApi.RetrofitApi LIZ;
            public final C01GW LIZIZ = C452501pT.LIZIZ(new C1604870rrh(this));
            public final C01GW LIZJ = C452501pT.LIZIZ(new C1601170rlj(this));
            public final C01GW LIZLLL = C452501pT.LIZ(EnumC452301pR.NONE, new C1601290rlv());

            public final AbstractC1604130rqV LIZ() {
                return (AbstractC1604130rqV) this.LIZLLL.getValue();
            }

            {
                this.LIZ = retrofitApi;
            }

            public final FeedItemList LIZJ(C1601460rmC c1601460rmC2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        if (C0AET.LIZ()) {
                            JatoXL.setPriority(Process.myTid(), -1);
                        }
                        C0XLL c0xll = new C0XLL(new C1EST());
                        int i = LJ;
                        LJ = i + 1;
                        c1601460rmC2.LJJJIL = i;
                        LIZLLL(c0xll, c1601460rmC2);
                        C1601590rmP c1601590rmP = c1601460rmC2.LJJJ;
                        if (c1601590rmP != null) {
                            c1601590rmP.LIZJ = System.currentTimeMillis() - jCurrentTimeMillis;
                        }
                        Pair<C0XLK, FeedItemList> pairLJ = LJ(c0xll, c1601460rmC2);
                        FeedItemList second = pairLJ.getSecond();
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        LIZIZ(c1601460rmC2, second);
                        C1601590rmP c1601590rmP2 = c1601460rmC2.LJJJ;
                        if (c1601590rmP2 != null) {
                            c1601590rmP2.LIZLLL = System.currentTimeMillis() - jCurrentTimeMillis2;
                        }
                        C1601590rmP c1601590rmP3 = c1601460rmC2.LJJJ;
                        if (c1601590rmP3 != null) {
                            c1601590rmP3.LJ = System.currentTimeMillis() - jCurrentTimeMillis;
                        }
                        C1601950rmz c1601950rmz = C1601950rmz.LIZ;
                        C0XLK first = pairLJ.getFirst();
                        c1601950rmz.getClass();
                        C1601950rmz.LIZIZ(c1601460rmC2, first, second);
                        if (C0AET.LIZ()) {
                            JatoXL.resetPriority(Process.myTid());
                        }
                        return second;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1601590rmP c1601590rmP4 = c1601460rmC2.LJJJ;
                        if (c1601590rmP4 != null) {
                            c1601590rmP4.LJ = System.currentTimeMillis() - jCurrentTimeMillis;
                        }
                        C1601950rmz.LIZ.getClass();
                        C1601950rmz.LIZ(c1601460rmC2, e);
                        AbstractC1604130rqV abstractC1604130rqVLIZ = LIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("postFetchRecommendFeedV2 failed, pullType=");
                        sbLIZ.append(c1601460rmC2.LIZIZ);
                        sbLIZ.append(", feedType=");
                        sbLIZ.append(c1601460rmC2.LIZ);
                        sbLIZ.append(", awemeId=");
                        sbLIZ.append(c1601460rmC2.LIZLLL);
                        abstractC1604130rqVLIZ.LJI(C2188811AlT.LIZIZ(sbLIZ), e);
                        throw e;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (C0AET.LIZ()) {
                        JatoXL.resetPriority(Process.myTid());
                    }
                    throw th2;
                }
            }

            public final void LIZIZ(C1601460rmC c1601460rmC2, FeedItemList feedItemList) {
                ArrayList<String> arrayList;
                List list = (List) this.LIZJ.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    InterfaceC1333005Jo interfaceC1333005Jo = (InterfaceC1333005Jo) obj;
                    ProcessorRemoteConfig processorRemoteConfig = (ProcessorRemoteConfig) C1604980rrs.LIZIZ.getValue();
                    if (processorRemoteConfig == null || (arrayList = processorRemoteConfig.blockList) == null || !arrayList.contains(interfaceC1333005Jo.getTag())) {
                        arrayList2.add(obj);
                    }
                }
                new C1440305kP(arrayList2, c1601460rmC2, feedItemList, LIZ()).LIZ();
            }

            public final void LIZLLL(C0XLL c0xll, C1601460rmC c1601460rmC2) {
                C1440305kP c1440305kP;
                ArrayList<String> arrayList;
                System.currentTimeMillis();
                List list = (List) this.LIZIZ.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    InterfaceC1333005Jo interfaceC1333005Jo = (InterfaceC1333005Jo) obj;
                    ProcessorRemoteConfig processorRemoteConfig = (ProcessorRemoteConfig) C1604980rrs.LIZIZ.getValue();
                    if (processorRemoteConfig == null || (arrayList = processorRemoteConfig.blockList) == null || !arrayList.contains(interfaceC1333005Jo.getTag())) {
                        arrayList2.add(obj);
                    }
                }
                if (((Number) C300530BqF.LIZ.getValue()).intValue() == 1) {
                    LIZ().LJIIIZ("processRequest. adaptive parallel process");
                    c1440305kP = new C1337905Ll(arrayList2, c1601460rmC2, c0xll, LIZ());
                } else {
                    C1332705Jl c1332705Jl = C1332705Jl.LIZ;
                    int i = c1601460rmC2.LIZIZ;
                    c1332705Jl.getClass();
                    if ((((Boolean) C269610AhT.LIZ.getValue()).booleanValue() && i == 2) || ((((Boolean) C0BZJ.LIZIZ.getValue()).booleanValue() && i == 0) || (((Boolean) C0BZJ.LIZJ.getValue()).booleanValue() && i == 2))) {
                        LIZ().LJIIIZ("processRequest. parallel process");
                        c1440305kP = new C1332905Jn(arrayList2, c1601460rmC2, c0xll, LIZ());
                    } else {
                        LIZ().LJIIIZ("processRequest. serial process");
                        c1440305kP = new C1440305kP(arrayList2, c1601460rmC2, c0xll, LIZ());
                    }
                }
                c1440305kP.LIZ();
            }

            /* JADX WARN: Code restructure failed: missing block: B:300:0x05f2, code lost:
            
                if (r2 == null) goto L301;
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x01c8, code lost:
            
                if (r2 != null) goto L319;
             */
            /* JADX WARN: Removed duplicated region for block: B:105:0x0254  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x02a1  */
            /* JADX WARN: Removed duplicated region for block: B:172:0x03e4  */
            /* JADX WARN: Removed duplicated region for block: B:260:0x052d  */
            /* JADX WARN: Removed duplicated region for block: B:268:0x0557  */
            /* JADX WARN: Removed duplicated region for block: B:294:0x05db  */
            /* JADX WARN: Removed duplicated region for block: B:297:0x05e3  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x05ff  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final kotlin.Pair<X.C0XLK, com.ss.android.ugc.aweme.feed.model.FeedItemList> LJ(X.C0XLL r22, X.C1601460rmC r23) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 1638
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1604930rrn.LJ(X.0XLL, X.0rmC):kotlin.Pair");
            }
        }.LIZJ(c1601460rmC);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:145|3|(1:5)(1:6)|7|(2:(1:13)(2:12|14)|15)|16|(1:21)(1:20)|22|(1:24)|25|(5:33|(2:36|34)|151|(2:38|44)(1:(1:40)(1:(1:42)(1:43)))|45)|(24:(2:51|(1:53))|147|67|70|(1:72)|(2:74|(5:76|(6:79|(1:81)|82|(3:152|84|156)(1:155)|154|77)|153|85|(1:87)))|88|(3:90|(1:92)|93)|94|(1:96)|97|(5:99|(2:101|(2:102|(2:104|(2:158|106)(1:159))(1:157)))(0)|107|(2:110|108)|160)|111|(2:113|(1:115))(1:139)|116|(1:118)|119|(1:123)|124|(1:128)|129|(1:135)|(1:137)|138)(26:(1:49)|59|(4:62|149|63|66)|147|67|70|(0)|(0)|88|(0)|94|(0)|97|(0)|111|(0)(0)|116|(0)|119|(2:121|123)|124|(2:126|128)|129|(3:131|133|135)|(0)|138)|54|(1:58)|59|(4:62|149|63|66)(0)|147|67|70|(0)|(0)|88|(0)|94|(0)|97|(0)|111|(0)(0)|116|(0)|119|(0)|124|(0)|129|(0)|(0)|138) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018d, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e A[Catch: ExecutionException -> 0x0327, TRY_LEAVE, TryCatch #0 {ExecutionException -> 0x0327, blocks: (B:3:0x000b, B:7:0x0017, B:14:0x0030, B:15:0x0041, B:16:0x0043, B:18:0x0081, B:22:0x008c, B:24:0x009a, B:25:0x00a0, B:27:0x00c3, B:29:0x00c9, B:31:0x00d3, B:33:0x00d9, B:34:0x00e1, B:36:0x00e7, B:44:0x0105, B:45:0x0107, B:40:0x00fa, B:42:0x00ff, B:43:0x0102, B:54:0x0136, B:56:0x013a, B:58:0x0142, B:70:0x0190, B:72:0x0196, B:69:0x018d, B:62:0x015e, B:63:0x016e, B:66:0x017b, B:65:0x0178, B:51:0x0129, B:53:0x012d, B:67:0x0180), top: B:145:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0196 A[Catch: ExecutionException -> 0x0327, TryCatch #0 {ExecutionException -> 0x0327, blocks: (B:3:0x000b, B:7:0x0017, B:14:0x0030, B:15:0x0041, B:16:0x0043, B:18:0x0081, B:22:0x008c, B:24:0x009a, B:25:0x00a0, B:27:0x00c3, B:29:0x00c9, B:31:0x00d3, B:33:0x00d9, B:34:0x00e1, B:36:0x00e7, B:44:0x0105, B:45:0x0107, B:40:0x00fa, B:42:0x00ff, B:43:0x0102, B:54:0x0136, B:56:0x013a, B:58:0x0142, B:70:0x0190, B:72:0x0196, B:69:0x018d, B:62:0x015e, B:63:0x016e, B:66:0x017b, B:65:0x0178, B:51:0x0129, B:53:0x012d, B:67:0x0180), top: B:145:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.FeedItemList LIZIZ(X.C1601460rmC r17) {
        /*
            Method dump skipped, instruction units count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.api.FeedApi.LIZIZ(X.0rmC):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }
}
