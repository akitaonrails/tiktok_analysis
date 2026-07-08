package com.ugc.android.clientai.lang.request;

import X.C09CT;
import X.C0Z10;
import X.C13LP;
import X.C15438062q;
import com.ugc.android.clientai.lang.message.Message;
import com.ugc.android.clientai.lang.request.InferenceParameter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatCompletionRequest {

    @C09CT("diversity_penalty")
    public final float diversityPenalty;

    @C09CT("do_sample")
    public final boolean doSample;

    @C09CT("length_penalty")
    public final float lengthPenalty;

    @C09CT("max_new_tokens")
    public final int maxLength;

    @C09CT("messages")
    public final List<Message> messages;

    @C09CT("model")
    public final String model;

    @C09CT("num_beams")
    public final int numBeams;
    public final transient InferenceParameter param;

    @C09CT("penalty_alpha")
    public final float penaltyAlpha;

    @C09CT("random_seed")
    public final int randomSeed;

    @C09CT("repetition_penalty")
    public final float repetitionPenalty;

    @C09CT("stream")
    public final boolean stream;

    @C09CT("temperature")
    public final float temperature;

    @C09CT("top_k")
    public final int topK;

    @C09CT("top_p")
    public final float topP;

    @C09CT("typical_p")
    public final float typicalP;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Z10] */
    public final C0Z10 convert() {
        List<Message> list = this.messages;
        ArrayList arrayList = new ArrayList();
        for (Message message : list) {
            Message message2 = message;
            if (message2.role == Message.Role.USER && message2.imageContent != null) {
                arrayList.add(message);
            }
        }
        C13LP.LJJJLL(arrayList);
        String strMessagePrompt = messagePrompt();
        String strSystemPrompt = systemPrompt();
        if (strSystemPrompt == null) {
            strSystemPrompt = "";
        }
        return new Object(strMessagePrompt, strSystemPrompt, this.param) { // from class: X.0Z10
            public final String LIZ;
            public final String LIZIZ;
            public final InferenceParameter LIZJ;

            static {
                new InferenceParameter(1, 100, false, 0.0f, 1.0f, 50, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0, false, 64, new LinkedHashMap());
            }

            public final Map<String, String> LIZ() {
                String strLIZ;
                String strLIZ2;
                String str = this.LIZJ.LIZ.get("system_prompt_template");
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = this.LIZJ.LIZ.get("user_prompt_template");
                if (str3 == null) {
                    str3 = "";
                }
                Map<String, ? extends Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("system_prompt", this.LIZIZ), new Pair("user_prompt", this.LIZ));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                InterfaceC892870Z0z interfaceC892870Z0z = (InterfaceC892870Z0z) new C0Z12(str).LIZIZ.getValue();
                String str4 = null;
                if (interfaceC892870Z0z == null || (strLIZ2 = interfaceC892870Z0z.LIZ(mapLJIIIIZZ)) == null) {
                    str2 = null;
                } else {
                    String str5 = new C892850Z0x(strLIZ2).LIZ;
                    if (str5 != null) {
                        str2 = str5;
                    }
                }
                sbLIZ.append(str2);
                InterfaceC892870Z0z interfaceC892870Z0z2 = (InterfaceC892870Z0z) new C0Z12(str3).LIZIZ.getValue();
                if (interfaceC892870Z0z2 != null && (strLIZ = interfaceC892870Z0z2.LIZ(mapLJIIIIZZ)) != null) {
                    str4 = new C892850Z0x(strLIZ).LIZ;
                }
                sbLIZ.append(str4);
                return C2097608Jq.LJIIL(C2097908Jt.LIZJ(new Pair("prompt", C2188811AlT.LIZIZ(sbLIZ))), this.LIZJ.LIZ());
            }

            public final Map<String, String> LIZIZ(String str) {
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("system_prompt", this.LIZIZ);
                String str2 = this.LIZJ.LIZ.get("system_prompt_template");
                if (str2 == null) {
                    str2 = "";
                }
                pairArr[1] = new Pair("system_prompt_template", str2);
                pairArr[2] = new Pair("cache_file_path", str);
                return C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), this.LIZJ.LIZ());
            }

            {
                this.LIZ = strMessagePrompt;
                this.LIZIZ = strSystemPrompt;
                this.LIZJ = inferenceParameter;
            }
        };
    }

    public final String messagePrompt() {
        List<Message> list = this.messages;
        ArrayList arrayList = new ArrayList();
        for (Message message : list) {
            if (message.role != Message.Role.SYSTEM) {
                arrayList.add(message);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Message) it2.next()).content);
        }
        return C13LP.LJJLIIIJ(arrayList2, "\n", null, null, 0, null, null, 62);
    }

    public final String systemPrompt() {
        Message next;
        Iterator<Message> it2 = this.messages.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.role == Message.Role.SYSTEM) {
                break;
            }
        }
        Message message = next;
        if (message != null) {
            return message.content;
        }
        return null;
    }

    public ChatCompletionRequest(String str, List<Message> list, InferenceParameter inferenceParameter, boolean z) {
        this.model = str;
        this.messages = list;
        this.param = inferenceParameter;
        this.stream = z;
        this.numBeams = inferenceParameter.numBeams;
        this.maxLength = inferenceParameter.maxLength;
        this.doSample = inferenceParameter.doSample;
        this.penaltyAlpha = inferenceParameter.penaltyAlpha;
        this.temperature = inferenceParameter.temperature;
        this.topK = inferenceParameter.topK;
        this.topP = inferenceParameter.topP;
        this.typicalP = inferenceParameter.typicalP;
        this.diversityPenalty = inferenceParameter.diversityPenalty;
        this.repetitionPenalty = inferenceParameter.repetitionPenalty;
        this.lengthPenalty = inferenceParameter.lengthPenalty;
        this.randomSeed = inferenceParameter.randomSeed;
    }
}
