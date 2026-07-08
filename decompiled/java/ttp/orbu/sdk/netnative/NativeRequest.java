package ttp.orbu.sdk.netnative;

import X.C1697810uHb;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.m2;
import ttpobfuscated.n0;

/* JADX INFO: loaded from: classes14.dex */
public final class NativeRequest implements Parcelable {
    public static final Parcelable.Creator<NativeRequest> CREATOR = new a();
    public final int a;
    public final String b;
    public final String c;
    public final byte[] d;
    public final HashMap<String, String> e;
    public final String f;

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final byte[] d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final HashMap<String, String> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeRequest)) {
            return false;
        }
        NativeRequest nativeRequest = (NativeRequest) obj;
        return this.a == nativeRequest.a && Intrinsics.LJFF(this.b, nativeRequest.b) && Intrinsics.LJFF(this.c, nativeRequest.c) && Intrinsics.LJFF(this.d, nativeRequest.d) && Intrinsics.LJFF(this.e, nativeRequest.e) && Intrinsics.LJFF(this.f, nativeRequest.f);
    }

    public final String f() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
        HashMap<String, String> map = this.e;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.f);
    }

    public NativeRequest() {
        this(0, "", null, null, new HashMap(), "");
    }

    public final String g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("x-tt-dataflow-id", this.a);
        jSONObject.put("metadata", jSONObject2);
        jSONObject.put("url", this.b);
        jSONObject.putOpt("method", this.c);
        JSONObject jSONObject3 = new JSONObject();
        for (Map.Entry<String, String> entry : this.e.entrySet()) {
            jSONObject3.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put("headers", jSONObject3);
        byte[] bArr = this.d;
        if (bArr != null) {
            jSONObject.put("body", new String(Base64.encode(bArr, 0), Charsets.UTF_8));
        }
        return C786410Ut5.J3(jSONObject);
    }

    public int hashCode() {
        int iA = m2.a(this.b, this.a * 31, 31);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        byte[] bArr = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31)) * 31;
        String str2 = this.f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeRequest(dataFlowId=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", method=");
        sb.append(this.c);
        sb.append(", body=");
        sb.append(Arrays.toString(this.d));
        sb.append(", headers=");
        sb.append(this.e);
        sb.append(", timestamp=");
        return n0.a(sb, this.f, ')');
    }

    public final int a() {
        return this.a;
    }

    public final byte[] h() {
        return this.d;
    }

    public final int i() {
        return this.a;
    }

    public final HashMap<String, String> j() {
        return this.e;
    }

    public final String k() {
        return this.c;
    }

    public final String l() {
        return this.f;
    }

    public final String m() {
        return this.b;
    }

    public static final class a implements Parcelable.Creator<NativeRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NativeRequest createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            byte[] bArrCreateByteArray = parcel.createByteArray();
            int i2 = parcel.readInt();
            HashMap map = new HashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                map.put(parcel.readString(), parcel.readString());
            }
            return new NativeRequest(i, string, string2, bArrCreateByteArray, map, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public NativeRequest[] newArray(int i) {
            return new NativeRequest[i];
        }

        public final NativeRequest[] a(int i) {
            return new NativeRequest[i];
        }
    }

    public final String a(ArrayList<NativeRequest> arrayList) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        for (NativeRequest nativeRequest : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                NativeRequest nativeRequest2 = nativeRequest;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x-tt-dataflow-id", nativeRequest2.a);
                jSONObject.put("metadata", jSONObject2);
                jSONObject.put("url", nativeRequest2.b);
                jSONObject.putOpt("method", nativeRequest2.c);
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, String> entry : nativeRequest2.e.entrySet()) {
                    jSONObject3.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("headers", jSONObject3);
                byte[] bArr = nativeRequest2.d;
                if (bArr != null) {
                    jSONObject.put("body", new String(Base64.encode(bArr, 0), Charsets.UTF_8));
                }
                String str = nativeRequest2.f;
                if (str != null) {
                    jSONObject.put("timestamp", str);
                }
                jSONArray.put(C786410Ut5.J3(jSONObject));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return jSONArray.toString();
    }

    public NativeRequest(int i, String str, String str2, byte[] bArr, HashMap<String, String> map, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = map;
        this.f = str3;
    }

    public final NativeRequest a(int i, String str, String str2, byte[] bArr, HashMap<String, String> map, String str3) {
        return new NativeRequest(i, str, str2, bArr, map, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeRequest a(NativeRequest nativeRequest, int i, String str, String str2, byte[] bArr, HashMap map, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nativeRequest.a;
        }
        if ((i2 & 2) != 0) {
            str = nativeRequest.b;
        }
        if ((i2 & 4) != 0) {
            str2 = nativeRequest.c;
        }
        if ((i2 & 8) != 0) {
            bArr = nativeRequest.d;
        }
        if ((i2 & 16) != 0) {
            map = nativeRequest.e;
        }
        if ((i2 & 32) != 0) {
            str3 = nativeRequest.f;
        }
        return nativeRequest.a(i, str, str2, bArr, map, str3);
    }
}
