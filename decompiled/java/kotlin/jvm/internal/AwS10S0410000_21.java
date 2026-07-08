package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0I7D;
import X.C0WZX;
import X.C1391380mJM;
import X.C2204961BRm;
import X.C259800zU;
import android.text.Editable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AwS10S0410000_21 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS10S0410000_21 awS10S0410000_21, Object obj) throws JSONException {
        String string;
        C0I7D c0i7d;
        Editable editableLLLLJI;
        C013C c013c = (C013C) awS10S0410000_21.l0;
        if (!c013c.element) {
            c013c.element = true;
            JSONObject jSONObject = new JSONObject();
            boolean z = awS10S0410000_21.z4;
            C259800zU c259800zU = (C259800zU) awS10S0410000_21.l3;
            jSONObject.put("confirm", false);
            jSONObject.put("cancel", true);
            if (!z || (c0i7d = (C0I7D) c259800zU.element) == null || (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehbZbdkjh+wulnh3d1aWCvUEA1n+EiZbMuxg7SZJnVLF5MIwWWcg==", null))) == null || (string = editableLLLLJI.toString()) == null) {
                string = "";
            }
            jSONObject.put("content", string);
            ((C1391380mJM) awS10S0410000_21.l1).LJFF((Number) awS10S0410000_21.l2, jSONObject);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS10S0410000_21 awS10S0410000_21, Object obj) throws JSONException {
        String string;
        C0I7D c0i7d;
        Editable editableLLLLJI;
        C013C c013c = (C013C) awS10S0410000_21.l0;
        if (!c013c.element) {
            c013c.element = true;
            JSONObject jSONObject = new JSONObject();
            boolean z = awS10S0410000_21.z4;
            C259800zU c259800zU = (C259800zU) awS10S0410000_21.l3;
            jSONObject.put("confirm", true);
            jSONObject.put("cancel", false);
            if (!z || (c0i7d = (C0I7D) c259800zU.element) == null || (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehbZbdkjh+wulnh3d1aWCvUEA1n+EiZbMuxg7SZJnVLF5MIwWWcg==", null))) == null || (string = editableLLLLJI.toString()) == null) {
                string = "";
            }
            jSONObject.put("content", string);
            ((C1391380mJM) awS10S0410000_21.l1).LJFF((Number) awS10S0410000_21.l2, jSONObject);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS10S0410000_21(C013C c013c, C013C c013c2, C1391380mJM c1391380mJM, Number number, boolean z, C259800zU<C0I7D> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = c1391380mJM;
        this.z4 = number;
        this.l3 = z;
    }
}
