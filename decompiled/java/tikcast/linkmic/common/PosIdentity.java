package tikcast.linkmic.common;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class PosIdentity implements Comparable<PosIdentity> {

    @C09CT("type")
    public int type;

    @C09CT("value")
    public String value = "";

    public final JSONObject LJI() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.type);
        jSONObject.put("value", this.value);
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('{');
        sbLIZ.append(this.type);
        sbLIZ.append(", ");
        sbLIZ.append(this.value);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZJ(String str) {
        if (this.type == 1 && Intrinsics.LJFF(this.value, str)) {
            return true;
        }
        return false;
    }

    public final boolean LJFF(String str) {
        if (this.type == 2 && Intrinsics.LJFF(this.value, str)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(PosIdentity posIdentity) {
        return this.value.compareTo(posIdentity.value);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PosIdentity)) {
            return false;
        }
        PosIdentity posIdentity = (PosIdentity) obj;
        if (this.type != posIdentity.type || !Intrinsics.LJFF(this.value, posIdentity.value)) {
            return false;
        }
        return true;
    }
}
