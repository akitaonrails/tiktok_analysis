package com.ss.android.ugc.aweme.sticker;

import X.C01GW;
import X.C09CT;
import X.C09JN;
import X.C0FS9;
import X.C11NZ;
import X.C11S5;
import X.C123100dR;
import X.C13BV;
import X.C1701940uOG;
import X.C2097608Jq;
import X.C2341909Fp;
import X.C452501pT;
import X.InterfaceC1487280oo2;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2342209Fs;
import Y.AfS141S0200000_5;
import Y.AfS1S0200100_5;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AddYoursStickerTopicRepo implements AddYoursStickerTopicRepoApi {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(66));
    public Map<C0FS9, ? extends List<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic>> LIZIZ = C2097608Jq.LJ();
    public Pair<String, AddYoursAutoSuggestResponse> LIZJ;

    public interface Api {
        @InterfaceC1501160pAQ("/tiktok/v1/addyours/topic/recommend")
        C11NZ<AddYoursStickerTopicRepoApi.AddYoursTopicRecommendResp> getRecommendAddYoursTopicByContent(@InterfaceC1501070pAH("tos_uri") String str);

        @InterfaceC1501160pAQ("/tiktok/v1/addyours/topic/auto_suggest")
        C11NZ<AddYoursAutoSuggestResponse> getRecommendTopicsByText(@InterfaceC1501070pAH("input_text") String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i);

        @InterfaceC1501160pAQ("/tiktok/v1/addyours/topic/suggest")
        C11NZ<Response> getTopicsForAYEditPage();

        @InterfaceC1501160pAQ("/tiktok/v1/addyours/topic/auto_suggest")
        C11NZ<AddYoursAutoSuggestResponse> getTopicsForTextEditPage(@InterfaceC1501070pAH("input_text") String str);
    }

    public final void LJFF(Function1<? super Map<C0FS9, ? extends List<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic>>, Unit> function1) {
        boolean zLJI = MethodIDManager.LJI(202128);
        if (!this.LIZIZ.isEmpty()) {
            function1.invoke(this.LIZIZ);
        } else {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            ((Api) this.LIZ.getValue()).getTopicsForAYEditPage().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS1S0200100_5(this, jCurrentTimeMillis, function1, 0), new C09JN() { // from class: X.0FSR
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AddYoursStickerTopicRepo@822c.requestTopicsForAYEditPage$2");
                    AddYoursStickerTopicRepo addYoursStickerTopicRepo = this.LL;
                    int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                    String message = ((Throwable) obj).getMessage();
                    if (message == null) {
                        message = "";
                    }
                    addYoursStickerTopicRepo.getClass();
                    AddYoursStickerTopicRepo.LIZJ(iCurrentTimeMillis, "1", message, "request_add_yours_topic_suggest_info");
                    C1C7U.LIZIZ("AddYoursStickerTopicRepo@822c.requestTopicsForAYEditPage$2");
                }
            });
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi
    public final void LIZIZ(AwS549S0100000_5 awS549S0100000_5, AwS619S0100000_5 awS619S0100000_5) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ((Api) this.LIZ.getValue()).getTopicsForAYEditPage().LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0FSQ
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                int i;
                AddYoursStickerTopicRepo.Response response = (AddYoursStickerTopicRepo.Response) obj;
                AddYoursStickerTopicRepo addYoursStickerTopicRepo = this.LL;
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                String strValueOf = String.valueOf(response.statusCode);
                String str = response.statusMsg;
                addYoursStickerTopicRepo.getClass();
                AddYoursStickerTopicRepo.LIZJ(iCurrentTimeMillis, strValueOf, str, "request_suggest_add_yours_text_page_info");
                List<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic> list = response.topics;
                if (list != null) {
                    ArrayList<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic> arrayList = new ArrayList();
                    for (AddYoursStickerTopicRepoApi.AddYoursSuggestTopic addYoursSuggestTopic : list) {
                        if (C123100dR.LIZ(addYoursSuggestTopic.text)) {
                            arrayList.add(addYoursSuggestTopic);
                        }
                    }
                    ArrayList<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic> arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    for (AddYoursStickerTopicRepoApi.AddYoursSuggestTopic addYoursSuggestTopic2 : arrayList) {
                        Integer num = addYoursSuggestTopic2.type;
                        if (num != null && num.intValue() == 2) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        arrayList2.add(addYoursSuggestTopic2.copy(addYoursSuggestTopic2.topicId, addYoursSuggestTopic2.text, Integer.valueOf(i), addYoursSuggestTopic2.avatars, addYoursSuggestTopic2.videoCount));
                    }
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                    for (AddYoursStickerTopicRepoApi.AddYoursSuggestTopic addYoursSuggestTopic3 : arrayList2) {
                        arrayList3.add(new AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText(addYoursSuggestTopic3.text, addYoursSuggestTopic3.type));
                    }
                    return arrayList3;
                }
                return null;
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS141S0200000_5(this, awS619S0100000_5, awS549S0100000_5, 1), new AfS1S0200100_5(this, jCurrentTimeMillis, awS549S0100000_5, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r8, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi.AddYoursTopicRecommendResp>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0FST
            if (r0 == 0) goto L6c
            r5 = r9
            X.0FST r5 = (X.C0FST) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r2 = r5.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r5.LLILZ
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 != r0) goto L72
            X.C155000ia.LIZIZ(r2)
        L22:
            X.00o6 r2 = (X.C189200o6) r2
            java.lang.Object r0 = r2.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r2)
            r5.LL = r8
            r5.LLILZ = r0
            X.099m r4 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r5)
            r4.<init>(r0)
            X.01GW r0 = r7.LIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo$Api r0 = (com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo.Api) r0
            X.11NZ r1 = r0.getRecommendAddYoursTopicByContent(r8)
            X.11RO r0 = X.C11S5.LIZ()
            X.11O8 r3 = r1.LJJJLZIJ(r0)
            Y.AfS174S0100000_5 r2 = new Y.AfS174S0100000_5
            r0 = 4
            r2.<init>(r4, r0)
            Y.AfS174S0100000_5 r1 = new Y.AfS174S0100000_5
            r0 = 5
            r1.<init>(r4, r0)
            r3.LJJLL(r2, r1)
            java.lang.Object r2 = r4.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r2 != r0) goto L69
            X.C099Q.LIZJ(r5)
        L69:
            if (r2 != r6) goto L22
            return r6
        L6c:
            X.0FST r5 = new X.0FST
            r5.<init>(r7, r9)
            goto L12
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo.LJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static final class Response {

        @C09CT("status_code")
        public final Integer statusCode;

        @C09CT("status_msg")
        public final String statusMsg;

        @C09CT("suggest_topics")
        public final List<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic> topics;

        public Response() {
            this(null, null, null, 7, null);
        }

        public Response(List<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic> list, Integer num, String str) {
            this.topics = list;
            this.statusCode = num;
            this.statusMsg = str;
        }

        public Response(List list, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "" : str);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi
    public final void LIZ(final String str, final Function0 function0, final Function2 function2) {
        Pair<String, AddYoursAutoSuggestResponse> pair = this.LIZJ;
        if (pair != null && Intrinsics.LJFF(pair.getFirst(), str)) {
            List<AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText> list = pair.getSecond().topics;
            ArrayList arrayList = new ArrayList();
            for (AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText addYoursAutoSuggestTopicForText : list) {
                if (C123100dR.LIZ(addYoursAutoSuggestTopicForText.text)) {
                    arrayList.add(addYoursAutoSuggestTopicForText);
                }
            }
            function2.invoke(arrayList, pair.getSecond().inputText);
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ((Api) this.LIZ.getValue()).getTopicsForTextEditPage(str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0FSS
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AddYoursStickerTopicRepo@822c.requestTopicsForTextEditPage$3");
                AddYoursStickerTopicRepo.AddYoursAutoSuggestResponse addYoursAutoSuggestResponse = (AddYoursStickerTopicRepo.AddYoursAutoSuggestResponse) obj;
                AddYoursStickerTopicRepo addYoursStickerTopicRepo = this.LL;
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                String strValueOf = String.valueOf(addYoursAutoSuggestResponse.statusCode);
                String str2 = addYoursAutoSuggestResponse.statusMsg;
                addYoursStickerTopicRepo.getClass();
                AddYoursStickerTopicRepo.LIZJ(iCurrentTimeMillis, strValueOf, str2, "request_suggest_add_yours_text_page_info");
                Integer num = addYoursAutoSuggestResponse.statusCode;
                if (num != null && num.intValue() == 0 && Intrinsics.LJFF(addYoursAutoSuggestResponse.inputText, str) && (!addYoursAutoSuggestResponse.topics.isEmpty())) {
                    this.LL.LIZJ = new Pair<>(addYoursAutoSuggestResponse.inputText, addYoursAutoSuggestResponse);
                    Function2<List<AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText>, String, Unit> function22 = function2;
                    List<AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText> list2 = addYoursAutoSuggestResponse.topics;
                    ArrayList arrayList2 = new ArrayList();
                    for (AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText addYoursAutoSuggestTopicForText2 : list2) {
                        if (C123100dR.LIZ(addYoursAutoSuggestTopicForText2.text)) {
                            arrayList2.add(addYoursAutoSuggestTopicForText2);
                        }
                    }
                    function22.invoke(arrayList2, addYoursAutoSuggestResponse.inputText);
                } else {
                    function0.invoke();
                }
                C1C7U.LIZIZ("AddYoursStickerTopicRepo@822c.requestTopicsForTextEditPage$3");
            }
        }, new AfS1S0200100_5(this, jCurrentTimeMillis, function0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r11, java.lang.String r12, X.InterfaceC1364105Vn r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C0FSU
            r5 = r10
            if (r0 == 0) goto L70
            r2 = r13
            X.0FSU r2 = (X.C0FSU) r2
            int r3 = r2.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L70
            int r3 = r3 - r1
            r2.LLILZ = r3
        L13:
            java.lang.Object r4 = r2.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r2.LLILZ
            r0 = 1
            if (r1 == 0) goto L2a
            if (r1 != r0) goto L76
            X.C155000ia.LIZIZ(r4)
        L23:
            X.00o6 r4 = (X.C189200o6) r4
            java.lang.Object r0 = r4.m10unboximpl()
            return r0
        L2a:
            X.C155000ia.LIZIZ(r4)
            r2.LL = r12
            r2.LLILZ = r0
            X.099m r8 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r2)
            r8.<init>(r0)
            long r6 = java.lang.System.currentTimeMillis()
            X.01GW r0 = r5.LIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo$Api r0 = (com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo.Api) r0
            X.11NZ r1 = r0.getRecommendTopicsByText(r12, r11)
            X.11RO r0 = X.C11S5.LIZ()
            X.11O8 r1 = r1.LJJJLZIJ(r0)
            Y.AfS1S0200100_5 r4 = new Y.AfS1S0200100_5
            r9 = 1
            r4.<init>(r5, r6, r8, r9)
            X.05X3 r0 = new X.05X3
            r0.<init>()
            r1.LJJLL(r4, r0)
            java.lang.Object r4 = r8.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r4 != r0) goto L6d
            X.C099Q.LIZJ(r2)
        L6d:
            if (r4 != r3) goto L23
            return r3
        L70:
            X.0FSU r2 = new X.0FSU
            r2.<init>(r5, r13)
            goto L13
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo.LIZLLL(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static final class AddYoursAutoSuggestResponse {

        @C09CT("input_text")
        public final String inputText;

        @C09CT("status_code")
        public final Integer statusCode;

        @C09CT("status_msg")
        public final String statusMsg;

        @C09CT("suggest_topics")
        public final List<AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText> topics;

        public AddYoursAutoSuggestResponse() {
            this(null, null, null, null, 15, null);
        }

        public AddYoursAutoSuggestResponse(List<AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText> list, Integer num, String str, String str2) {
            this.topics = list;
            this.statusCode = num;
            this.statusMsg = str;
            this.inputText = str2;
        }

        public AddYoursAutoSuggestResponse(List list, Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
        }
    }

    public static void LIZJ(int i, String str, String str2, String str3) {
        try {
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", i);
            jSONObject.put("status_code", str);
            jSONObject.put("status_msg", str2);
            C2341909Fp.LIZIZ(str3, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
