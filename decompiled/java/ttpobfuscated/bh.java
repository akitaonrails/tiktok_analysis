package ttpobfuscated;

import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class bh {
    public static final a c = new a();
    public static bh d = new bh();
    public boolean a;
    public boolean b;

    public static final class a {
        public final bh a() {
            return bh.d;
        }
    }

    public final boolean b() {
        return this.b;
    }

    public final void a(JSONObject jSONObject) {
        Boolean boolB;
        boolean z;
        if (jSONObject != null && (boolB = q4.b(jSONObject, "enableOlderVersion")) != null) {
            boolean zBooleanValue = boolB.booleanValue();
            if (this.a != zBooleanValue) {
                z = true;
            } else {
                z = false;
            }
            this.b = z;
            this.a = zBooleanValue;
            if (Unit.LIZ != null) {
                return;
            }
        }
        this.b = false;
    }

    public final boolean a(String str) {
        return this.a;
    }

    public static boolean a(bh bhVar, String str, int i, Object obj) {
        return bhVar.a;
    }
}
