package ttp.orbu.sdk.requestvalidator;

import X.C01GW;
import X.C09AY;
import X.C2097608Jq;
import X.C452501pT;
import X.C786410Ut5;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.b2;
import ttpobfuscated.c8;
import ttpobfuscated.m2;
import ttpobfuscated.ng;
import ttpobfuscated.o3;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Request implements Parcelable, b2 {
    public final Integer a;

    public static final class AppToApp extends Request {
        public static final Parcelable.Creator<AppToApp> CREATOR = new a();
        public final Integer b;
        public final String c;
        public final JSONObject d;
        public final Date e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.c;
        }

        public final JSONObject f() {
            return this.d;
        }

        public final Date g() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            Integer num = this.b;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.c);
            parcel.writeValue(this.d);
            parcel.writeSerializable(this.e);
        }

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("x-tt-dataflow-id", this.b);
            jSONObject.put("metadata", jSONObject2);
            jSONObject.putOpt("targetAppName", this.c);
            jSONObject.put("timestamp", o3.c(this.e, null, null, 3, null));
            JSONObject jSONObject3 = this.d;
            if (jSONObject3 != null) {
                jSONObject.putOpt("sharedData", jSONObject3);
            }
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            Integer num = this.b;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            JSONObject jSONObject = this.d;
            return this.e.hashCode() + ((iHashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "AppToApp(dataFlowId=" + this.b + ", targetAppName=" + this.c + ", sharedData=" + this.d + ", interceptTimeStamp=" + this.e + ')';
        }

        @Override // ttp.orbu.sdk.requestvalidator.Request
        public Integer c() {
            return this.b;
        }

        public final Integer d() {
            return this.b;
        }

        public final Date h() {
            return this.e;
        }

        public final JSONObject i() {
            return this.d;
        }

        public final String j() {
            return this.c;
        }

        public static final class a implements Parcelable.Creator<AppToApp> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppToApp createFromParcel(Parcel parcel) {
                Integer numValueOf;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new AppToApp(numValueOf, parcel.readString(), (JSONObject) parcel.readValue(AppToApp.class.getClassLoader()), (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public AppToApp[] newArray(int i) {
                return new AppToApp[i];
            }

            public final AppToApp[] a(int i) {
                return new AppToApp[i];
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppToApp)) {
                return false;
            }
            AppToApp appToApp = (AppToApp) obj;
            if (Intrinsics.LJFF(this.b, appToApp.b) && Intrinsics.LJFF(this.c, appToApp.c) && Intrinsics.LJFF(this.d, appToApp.d) && Intrinsics.LJFF(this.e, appToApp.e)) {
                return true;
            }
            return false;
        }

        public AppToApp(Integer num, String str, JSONObject jSONObject, Date date) {
            super(num);
            this.b = num;
            this.c = str;
            this.d = jSONObject;
            this.e = date;
        }

        public final AppToApp a(Integer num, String str, JSONObject jSONObject, Date date) {
            return new AppToApp(num, str, jSONObject, date);
        }

        public static AppToApp a(AppToApp appToApp, Integer num, String str, JSONObject jSONObject, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                num = appToApp.b;
            }
            if ((i & 2) != 0) {
                str = appToApp.c;
            }
            if ((i & 4) != 0) {
                jSONObject = appToApp.d;
            }
            if ((i & 8) != 0) {
                date = appToApp.e;
            }
            appToApp.getClass();
            return new AppToApp(num, str, jSONObject, date);
        }
    }

    public static final class Configuration extends Request {
        public static final Parcelable.Creator<Configuration> CREATOR = new a();
        public final Integer b;
        public final JSONObject c;
        public final Date d;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final JSONObject e() {
            return this.c;
        }

        public final Date f() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            Integer num = this.b;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeValue(this.c);
            parcel.writeSerializable(this.d);
        }

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("x-tt-dataflow-id", this.b);
            jSONObject.put("metadata", jSONObject2);
            jSONObject.put("config", this.c);
            jSONObject.put("timestamp", o3.c(this.d, null, null, 3, null));
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            Integer num = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31);
        }

        public String toString() {
            return "Configuration(dataFlowId=" + this.b + ", config=" + this.c + ", interceptTimeStamp=" + this.d + ')';
        }

        @Override // ttp.orbu.sdk.requestvalidator.Request
        public Integer c() {
            return this.b;
        }

        public final Integer d() {
            return this.b;
        }

        public final JSONObject g() {
            return this.c;
        }

        public final Date h() {
            return this.d;
        }

        public static final class a implements Parcelable.Creator<Configuration> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Configuration createFromParcel(Parcel parcel) {
                Integer numValueOf;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new Configuration(numValueOf, (JSONObject) parcel.readValue(Configuration.class.getClassLoader()), (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public Configuration[] newArray(int i) {
                return new Configuration[i];
            }

            public final Configuration[] a(int i) {
                return new Configuration[i];
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            if (Intrinsics.LJFF(this.b, configuration.b) && Intrinsics.LJFF(this.c, configuration.c) && Intrinsics.LJFF(this.d, configuration.d)) {
                return true;
            }
            return false;
        }

        public Configuration(Integer num, JSONObject jSONObject, Date date) {
            super(num);
            this.b = num;
            this.c = jSONObject;
            this.d = date;
        }

        public final Configuration a(Integer num, JSONObject jSONObject, Date date) {
            return new Configuration(num, jSONObject, date);
        }

        public static Configuration a(Configuration configuration, Integer num, JSONObject jSONObject, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                num = configuration.b;
            }
            if ((i & 2) != 0) {
                jSONObject = configuration.c;
            }
            if ((i & 4) != 0) {
                date = configuration.d;
            }
            return configuration.a(num, jSONObject, date);
        }
    }

    public static final class Gecko extends Request {
        public static final Parcelable.Creator<Gecko> CREATOR = new a();
        public final Integer b;
        public final String c;
        public final String d;
        public final String e;
        public final Date f;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.c;
        }

        public final String f() {
            return this.d;
        }

        public final String g() {
            return this.e;
        }

        public final Date h() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            Integer num = this.b;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeSerializable(this.f);
        }

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("x-tt-dataflow-id", this.b);
            jSONObject.put("metadata", jSONObject2);
            jSONObject.putOpt("temporaryPath", this.c);
            jSONObject.putOpt("geckoFilePath", this.d);
            jSONObject.putOpt("sourceChannel", this.e);
            jSONObject.put("timestamp", o3.c(this.f, null, null, 3, null));
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            Integer num = this.b;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return this.f.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Gecko(dataFlowId=" + this.b + ", temporaryPath=" + this.c + ", geckoFilePath=" + this.d + ", sourceChannel=" + this.e + ", interceptTimeStamp=" + this.f + ')';
        }

        @Override // ttp.orbu.sdk.requestvalidator.Request
        public Integer c() {
            return this.b;
        }

        public final Integer d() {
            return this.b;
        }

        public final String i() {
            return this.d;
        }

        public final Date j() {
            return this.f;
        }

        public final String k() {
            return this.e;
        }

        public final String l() {
            return this.c;
        }

        public static final class a implements Parcelable.Creator<Gecko> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Gecko createFromParcel(Parcel parcel) {
                Integer numValueOf;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new Gecko(numValueOf, parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public Gecko[] newArray(int i) {
                return new Gecko[i];
            }

            public final Gecko[] a(int i) {
                return new Gecko[i];
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gecko)) {
                return false;
            }
            Gecko gecko = (Gecko) obj;
            if (Intrinsics.LJFF(this.b, gecko.b) && Intrinsics.LJFF(this.c, gecko.c) && Intrinsics.LJFF(this.d, gecko.d) && Intrinsics.LJFF(this.e, gecko.e) && Intrinsics.LJFF(this.f, gecko.f)) {
                return true;
            }
            return false;
        }

        public Gecko(Integer num, String str, String str2, String str3, Date date) {
            super(num);
            this.b = num;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = date;
        }

        public final Gecko a(Integer num, String str, String str2, String str3, Date date) {
            return new Gecko(num, str, str2, str3, date);
        }

        public static Gecko a(Gecko gecko, Integer num, String str, String str2, String str3, Date date, int i, Object obj) {
            Date date2 = date;
            String str4 = str3;
            String str5 = str2;
            String str6 = str;
            Integer num2 = num;
            if ((i & 1) != 0) {
                num2 = gecko.b;
            }
            if ((i & 2) != 0) {
                str6 = gecko.c;
            }
            if ((i & 4) != 0) {
                str5 = gecko.d;
            }
            if ((i & 8) != 0) {
                str4 = gecko.e;
            }
            if ((i & 16) != 0) {
                date2 = gecko.f;
            }
            gecko.getClass();
            return new Gecko(num2, str6, str5, str4, date2);
        }
    }

    public static final class Http extends Request {
        public static final Parcelable.Creator<Http> CREATOR = new a();
        public final Integer b;
        public final String c;
        public final String d;
        public final byte[] e;
        public final Map<String, List<String>> f;
        public final Date g;
        public final C01GW h;

        public final class b extends C09AY implements Function0<c8> {
            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c8 invoke() {
                Http http = Http.this;
                return new c8(http.c, http.d, http.e, http.f);
            }
        }

        public static /* synthetic */ void l() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.c;
        }

        public final String f() {
            return this.d;
        }

        public final byte[] g() {
            return this.e;
        }

        public final Map<String, List<String>> h() {
            return this.f;
        }

        public final Date i() {
            return this.g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            Integer num = this.b;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeByteArray(this.e);
            Map<String, List<String>> map = this.f;
            parcel.writeInt(map.size());
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeStringList(entry.getValue());
            }
            parcel.writeSerializable(this.g);
        }

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("x-tt-dataflow-id", this.b);
            jSONObject.put("metadata", jSONObject2);
            jSONObject.put("url", this.c);
            jSONObject.putOpt("method", this.d);
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, List<String>> entry : this.f.entrySet()) {
                jSONObject3.put(entry.getKey(), new JSONArray((Collection) entry.getValue()));
            }
            jSONObject.put("headers", jSONObject3);
            byte[] bArr = this.e;
            if (bArr != null) {
                jSONObject.put("body", new String(Base64.encode(bArr, 0), Charsets.UTF_8));
            }
            jSONObject.put("timestamp", o3.c(this.g, null, null, 3, null));
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            Integer num = this.b;
            int iA = m2.a(this.c, (num == null ? 0 : num.hashCode()) * 31, 31);
            String str = this.d;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            byte[] bArr = this.e;
            return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31)) * 31);
        }

        public final ng k() {
            return (ng) this.h.getValue();
        }

        public String toString() {
            return "Http(dataFlowId=" + this.b + ", url=" + this.c + ", method=" + this.d + ", body=" + Arrays.toString(this.e) + ", headers=" + this.f + ", interceptTimeStamp=" + this.g + ')';
        }

        @Override // ttp.orbu.sdk.requestvalidator.Request
        public Integer c() {
            return this.b;
        }

        public final Integer d() {
            return this.b;
        }

        public final byte[] j() {
            return this.e;
        }

        public final Map<String, List<String>> m() {
            return this.f;
        }

        public final Date n() {
            return this.g;
        }

        public final String o() {
            return this.d;
        }

        public final String p() {
            return this.c;
        }

        public static final class a implements Parcelable.Creator<Http> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Http createFromParcel(Parcel parcel) {
                Integer numValueOf;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                String string = parcel.readString();
                String string2 = parcel.readString();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
                }
                return new Http(numValueOf, string, string2, bArrCreateByteArray, linkedHashMap, (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public Http[] newArray(int i) {
                return new Http[i];
            }

            public final Http[] a(int i) {
                return new Http[i];
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Http)) {
                return false;
            }
            Http http = (Http) obj;
            if (Intrinsics.LJFF(this.b, http.b) && Intrinsics.LJFF(this.c, http.c) && Intrinsics.LJFF(this.d, http.d) && Intrinsics.LJFF(this.e, http.e) && Intrinsics.LJFF(this.f, http.f) && Intrinsics.LJFF(this.g, http.g)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Http(Integer num, String str, String str2, byte[] bArr, Map<String, ? extends List<String>> map, Date date) {
            super(num);
            this.b = num;
            this.c = str;
            this.d = str2;
            this.e = bArr;
            this.f = map;
            this.g = date;
            this.h = C452501pT.LIZIZ(new b());
        }

        public final Http a(Integer num, String str, String str2, byte[] bArr, Map<String, ? extends List<String>> map, Date date) {
            return new Http(num, str, str2, bArr, map, date);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Http a(Http http, Integer num, String str, String str2, byte[] bArr, Map map, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                num = http.b;
            }
            if ((i & 2) != 0) {
                str = http.c;
            }
            if ((i & 4) != 0) {
                str2 = http.d;
            }
            if ((i & 8) != 0) {
                bArr = http.e;
            }
            if ((i & 16) != 0) {
                map = http.f;
            }
            if ((i & 32) != 0) {
                date = http.g;
            }
            return http.a(num, str, str2, bArr, map, date);
        }
    }

    public static final class LiveAudio extends Request {
        public static final Parcelable.Creator<LiveAudio> CREATOR = new a();
        public final Integer b;
        public final Buffer c;
        public final int d;
        public final int e;
        public final int f;
        public final long g;
        public final Date h;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Buffer e() {
            return this.c;
        }

        public final int f() {
            return this.d;
        }

        public final int g() {
            return this.e;
        }

        public final int h() {
            return this.f;
        }

        public final long i() {
            return this.g;
        }

        public final Date j() {
            return this.h;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            Integer num = this.b;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeValue(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeLong(this.g);
            parcel.writeSerializable(this.h);
        }

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("x-tt-dataflow-id", this.b);
            jSONObject.put("metadata", jSONObject2);
            jSONObject.put("buffer", this.c);
            jSONObject.put("samplesPerChannel", this.d);
            jSONObject.put("sampleRate", this.e);
            jSONObject.put("channel", this.f);
            jSONObject.put("audioTimestamp", this.g);
            jSONObject.put("timestamp", o3.c(this.h, null, null, 3, null));
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            Integer num = this.b;
            return this.h.hashCode() + ((C786410Ut5.Y2(this.g) + ((this.f + ((this.e + ((this.d + ((this.c.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "LiveAudio(dataFlowId=" + this.b + ", buffer=" + this.c + ", samplesPerChannel=" + this.d + ", sampleRate=" + this.e + ", channel=" + this.f + ", timestamp=" + this.g + ", interceptTimeStamp=" + this.h + ')';
        }

        @Override // ttp.orbu.sdk.requestvalidator.Request
        public Integer c() {
            return this.b;
        }

        public final Integer d() {
            return this.b;
        }

        public final Buffer k() {
            return this.c;
        }

        public final int l() {
            return this.f;
        }

        public final Date m() {
            return this.h;
        }

        public final int n() {
            return this.e;
        }

        public final int o() {
            return this.d;
        }

        public final long p() {
            return this.g;
        }

        public static final class a implements Parcelable.Creator<LiveAudio> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LiveAudio createFromParcel(Parcel parcel) {
                Integer numValueOf;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new LiveAudio(numValueOf, (Buffer) parcel.readValue(LiveAudio.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public LiveAudio[] newArray(int i) {
                return new LiveAudio[i];
            }

            public final LiveAudio[] a(int i) {
                return new LiveAudio[i];
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveAudio)) {
                return false;
            }
            LiveAudio liveAudio = (LiveAudio) obj;
            if (Intrinsics.LJFF(this.b, liveAudio.b) && Intrinsics.LJFF(this.c, liveAudio.c) && this.d == liveAudio.d && this.e == liveAudio.e && this.f == liveAudio.f && this.g == liveAudio.g && Intrinsics.LJFF(this.h, liveAudio.h)) {
                return true;
            }
            return false;
        }

        public LiveAudio(Integer num, Buffer buffer, int i, int i2, int i3, long j, Date date) {
            super(num);
            this.b = num;
            this.c = buffer;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = j;
            this.h = date;
        }

        public final LiveAudio a(Integer num, Buffer buffer, int i, int i2, int i3, long j, Date date) {
            return new LiveAudio(num, buffer, i, i2, i3, j, date);
        }

        public static LiveAudio a(LiveAudio liveAudio, Integer num, Buffer buffer, int i, int i2, int i3, long j, Date date, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                num = liveAudio.b;
            }
            if ((i4 & 2) != 0) {
                buffer = liveAudio.c;
            }
            if ((i4 & 4) != 0) {
                i = liveAudio.d;
            }
            if ((i4 & 8) != 0) {
                i2 = liveAudio.e;
            }
            if ((i4 & 16) != 0) {
                i3 = liveAudio.f;
            }
            if ((i4 & 32) != 0) {
                j = liveAudio.g;
            }
            if ((i4 & 64) != 0) {
                date = liveAudio.h;
            }
            return liveAudio.a(num, buffer, i, i2, i3, j, date);
        }
    }

    public static final class LiveSEI extends Request {
        public static final Parcelable.Creator<LiveSEI> CREATOR = new a();
        public final Integer b;
        public final String c;
        public final Object d;
        public final Date e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.c;
        }

        public final Object f() {
            return this.d;
        }

        public final Date g() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            Integer num = this.b;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.c);
            parcel.writeValue(this.d);
            parcel.writeSerializable(this.e);
        }

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("x-tt-dataflow-id", this.b);
            jSONObject.put("metadata", jSONObject2);
            jSONObject.put("seiKey", this.c);
            jSONObject.putOpt("seiValue", this.d);
            jSONObject.put("timestamp", o3.c(this.e, null, null, 3, null));
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            Integer num = this.b;
            int iA = m2.a(this.c, (num == null ? 0 : num.hashCode()) * 31, 31);
            Object obj = this.d;
            return this.e.hashCode() + ((iA + (obj != null ? obj.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "LiveSEI(dataFlowId=" + this.b + ", seiKey=" + this.c + ", seiValue=" + this.d + ", interceptTimeStamp=" + this.e + ')';
        }

        @Override // ttp.orbu.sdk.requestvalidator.Request
        public Integer c() {
            return this.b;
        }

        public final Integer d() {
            return this.b;
        }

        public final Date h() {
            return this.e;
        }

        public final String i() {
            return this.c;
        }

        public final Object j() {
            return this.d;
        }

        public static final class a implements Parcelable.Creator<LiveSEI> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LiveSEI createFromParcel(Parcel parcel) {
                Integer numValueOf;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new LiveSEI(numValueOf, parcel.readString(), parcel.readValue(LiveSEI.class.getClassLoader()), (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public LiveSEI[] newArray(int i) {
                return new LiveSEI[i];
            }

            public final LiveSEI[] a(int i) {
                return new LiveSEI[i];
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveSEI)) {
                return false;
            }
            LiveSEI liveSEI = (LiveSEI) obj;
            if (Intrinsics.LJFF(this.b, liveSEI.b) && Intrinsics.LJFF(this.c, liveSEI.c) && Intrinsics.LJFF(this.d, liveSEI.d) && Intrinsics.LJFF(this.e, liveSEI.e)) {
                return true;
            }
            return false;
        }

        public LiveSEI(Integer num, String str, Object obj, Date date) {
            super(num);
            this.b = num;
            this.c = str;
            this.d = obj;
            this.e = date;
        }

        public final LiveSEI a(Integer num, String str, Object obj, Date date) {
            return new LiveSEI(num, str, obj, date);
        }

        public static LiveSEI a(LiveSEI liveSEI, Integer num, String str, Object obj, Date date, int i, Object obj2) {
            if ((i & 1) != 0) {
                num = liveSEI.b;
            }
            if ((i & 2) != 0) {
                str = liveSEI.c;
            }
            if ((i & 4) != 0) {
                obj = liveSEI.d;
            }
            if ((i & 8) != 0) {
                date = liveSEI.e;
            }
            return liveSEI.a(num, str, obj, date);
        }
    }

    public static final class LiveVideo extends Request {
        public static final Parcelable.Creator<LiveVideo> CREATOR = new a();
        public final Integer b;
        public final int c;
        public final Bitmap d;
        public final Date e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int e() {
            return this.c;
        }

        public final Bitmap f() {
            return this.d;
        }

        public final Date g() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            Integer num = this.b;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.d, i);
            parcel.writeSerializable(this.e);
        }

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("x-tt-dataflow-id", this.b);
            jSONObject.put("metadata", jSONObject2);
            jSONObject.putOpt("textureId", Integer.valueOf(this.c));
            jSONObject.putOpt("bitmap", this.d);
            jSONObject.put("timestamp", o3.c(this.e, null, null, 3, null));
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            Integer num = this.b;
            int iHashCode = (this.c + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
            Bitmap bitmap = this.d;
            return this.e.hashCode() + ((iHashCode + (bitmap != null ? bitmap.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "LiveVideo(dataFlowId=" + this.b + ", textureId=" + this.c + ", bitmap=" + this.d + ", interceptTimeStamp=" + this.e + ')';
        }

        @Override // ttp.orbu.sdk.requestvalidator.Request
        public Integer c() {
            return this.b;
        }

        public final Integer d() {
            return this.b;
        }

        public final Bitmap h() {
            return this.d;
        }

        public final Date i() {
            return this.e;
        }

        public final int j() {
            return this.c;
        }

        public static final class a implements Parcelable.Creator<LiveVideo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LiveVideo createFromParcel(Parcel parcel) {
                Integer numValueOf;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new LiveVideo(numValueOf, parcel.readInt(), (Bitmap) parcel.readParcelable(LiveVideo.class.getClassLoader()), (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public LiveVideo[] newArray(int i) {
                return new LiveVideo[i];
            }

            public final LiveVideo[] a(int i) {
                return new LiveVideo[i];
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveVideo)) {
                return false;
            }
            LiveVideo liveVideo = (LiveVideo) obj;
            if (Intrinsics.LJFF(this.b, liveVideo.b) && this.c == liveVideo.c && Intrinsics.LJFF(this.d, liveVideo.d) && Intrinsics.LJFF(this.e, liveVideo.e)) {
                return true;
            }
            return false;
        }

        public LiveVideo(Integer num, int i, Bitmap bitmap, Date date) {
            super(num);
            this.b = num;
            this.c = i;
            this.d = bitmap;
            this.e = date;
        }

        public final LiveVideo a(Integer num, int i, Bitmap bitmap, Date date) {
            return new LiveVideo(num, i, bitmap, date);
        }

        public static LiveVideo a(LiveVideo liveVideo, Integer num, int i, Bitmap bitmap, Date date, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                num = liveVideo.b;
            }
            if ((i2 & 2) != 0) {
                i = liveVideo.c;
            }
            if ((i2 & 4) != 0) {
                bitmap = liveVideo.d;
            }
            if ((i2 & 8) != 0) {
                date = liveVideo.e;
            }
            liveVideo.getClass();
            return new LiveVideo(num, i, bitmap, date);
        }
    }

    public static final class PreDefinedFlow extends Request {
        public static final Parcelable.Creator<PreDefinedFlow> CREATOR = new a();
        public final Integer b;
        public final Date c;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Date e() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            Integer num = this.b;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeSerializable(this.c);
        }

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("x-tt-dataflow-id", this.b);
            jSONObject.put("metadata", jSONObject2);
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            Integer num = this.b;
            return this.c.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
        }

        public String toString() {
            return "PreDefinedFlow(dataFlowId=" + this.b + ", interceptTimeStamp=" + this.c + ')';
        }

        @Override // ttp.orbu.sdk.requestvalidator.Request
        public Integer c() {
            return this.b;
        }

        public final Integer d() {
            return this.b;
        }

        public final Date f() {
            return this.c;
        }

        public static final class a implements Parcelable.Creator<PreDefinedFlow> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PreDefinedFlow createFromParcel(Parcel parcel) {
                Integer numValueOf;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new PreDefinedFlow(numValueOf, (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public PreDefinedFlow[] newArray(int i) {
                return new PreDefinedFlow[i];
            }

            public final PreDefinedFlow[] a(int i) {
                return new PreDefinedFlow[i];
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreDefinedFlow)) {
                return false;
            }
            PreDefinedFlow preDefinedFlow = (PreDefinedFlow) obj;
            if (Intrinsics.LJFF(this.b, preDefinedFlow.b) && Intrinsics.LJFF(this.c, preDefinedFlow.c)) {
                return true;
            }
            return false;
        }

        public PreDefinedFlow(Integer num, Date date) {
            super(num);
            this.b = num;
            this.c = date;
        }

        public final PreDefinedFlow a(Integer num, Date date) {
            return new PreDefinedFlow(num, date);
        }

        public static PreDefinedFlow a(PreDefinedFlow preDefinedFlow, Integer num, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                num = preDefinedFlow.b;
            }
            if ((i & 2) != 0) {
                date = preDefinedFlow.c;
            }
            preDefinedFlow.getClass();
            return new PreDefinedFlow(num, date);
        }
    }

    public static final class SDK extends Request {
        public static final Parcelable.Creator<SDK> CREATOR = new a();
        public final Integer b;
        public final String c;
        public final String d;
        public final Map<String, Object> e;
        public final Date f;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.c;
        }

        public final String f() {
            return this.d;
        }

        public final Map<String, Object> g() {
            return this.e;
        }

        public final Date h() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Integer num = this.b;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            Map<String, Object> map = this.e;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map.size());
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeValue(entry.getValue());
                }
            }
            parcel.writeSerializable(this.f);
        }

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("x-tt-dataflow-id", this.b);
            jSONObject.put("metadata", jSONObject2);
            jSONObject.putOpt("sdkDescriptor", this.c);
            jSONObject.putOpt("methodName", this.d);
            Map<String, Object> map = this.e;
            if (map != null) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if ((value instanceof Integer) || (value instanceof String) || (value instanceof Boolean)) {
                        jSONObject3.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("params", jSONObject3);
            }
            jSONObject.put("timestamp", o3.c(this.f, null, null, 3, null));
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            Integer num = this.b;
            int iA = m2.a(this.d, m2.a(this.c, (num == null ? 0 : num.hashCode()) * 31, 31), 31);
            Map<String, Object> map = this.e;
            return this.f.hashCode() + ((iA + (map != null ? map.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "SDK(dataFlowId=" + this.b + ", sdkDescriptor=" + this.c + ", methodName=" + this.d + ", params=" + this.e + ", interceptTimeStamp=" + this.f + ')';
        }

        @Override // ttp.orbu.sdk.requestvalidator.Request
        public Integer c() {
            return this.b;
        }

        public final Integer d() {
            return this.b;
        }

        public final Date i() {
            return this.f;
        }

        public final String j() {
            return this.d;
        }

        public final Map<String, Object> k() {
            return this.e;
        }

        public final String l() {
            return this.c;
        }

        public static final class a implements Parcelable.Creator<SDK> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SDK createFromParcel(Parcel parcel) {
                Integer numValueOf;
                LinkedHashMap linkedHashMap = null;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap.put(parcel.readString(), parcel.readValue(SDK.class.getClassLoader()));
                    }
                }
                return new SDK(numValueOf, string, string2, linkedHashMap, (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public SDK[] newArray(int i) {
                return new SDK[i];
            }

            public final SDK[] a(int i) {
                return new SDK[i];
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SDK)) {
                return false;
            }
            SDK sdk = (SDK) obj;
            if (Intrinsics.LJFF(this.b, sdk.b) && Intrinsics.LJFF(this.c, sdk.c) && Intrinsics.LJFF(this.d, sdk.d) && Intrinsics.LJFF(this.e, sdk.e) && Intrinsics.LJFF(this.f, sdk.f)) {
                return true;
            }
            return false;
        }

        public SDK(Integer num, String str, String str2, Map<String, ? extends Object> map, Date date) {
            super(num);
            this.b = num;
            this.c = str;
            this.d = str2;
            this.e = map;
            this.f = date;
        }

        public final SDK a(Integer num, String str, String str2, Map<String, ? extends Object> map, Date date) {
            return new SDK(num, str, str2, map, date);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SDK a(SDK sdk, Integer num, String str, String str2, Map map, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                num = sdk.b;
            }
            if ((i & 2) != 0) {
                str = sdk.c;
            }
            if ((i & 4) != 0) {
                str2 = sdk.d;
            }
            if ((i & 8) != 0) {
                map = sdk.e;
            }
            if ((i & 16) != 0) {
                date = sdk.f;
            }
            return sdk.a(num, str, str2, map, date);
        }
    }

    public static final class SystemAPI extends Request {
        public static final Parcelable.Creator<SystemAPI> CREATOR = new a();
        public final Integer b;
        public final String c;
        public final String d;
        public final Map<String, Object> e;
        public final Date f;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.c;
        }

        public final String f() {
            return this.d;
        }

        public final Map<String, Object> g() {
            return this.e;
        }

        public final Date h() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Integer num = this.b;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            Map<String, Object> map = this.e;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map.size());
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeValue(entry.getValue());
                }
            }
            parcel.writeSerializable(this.f);
        }

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("x-tt-dataflow-id", this.b);
            jSONObject.put("metadata", jSONObject2);
            jSONObject.putOpt("className", this.c);
            jSONObject.putOpt("methodName", this.d);
            Map<String, Object> map = this.e;
            if (map != null) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if ((value instanceof Integer) || (value instanceof String) || (value instanceof Boolean)) {
                        jSONObject3.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("params", jSONObject3);
            }
            jSONObject.put("timestamp", o3.c(this.f, null, null, 3, null));
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            Integer num = this.b;
            int iA = m2.a(this.d, m2.a(this.c, (num == null ? 0 : num.hashCode()) * 31, 31), 31);
            Map<String, Object> map = this.e;
            return this.f.hashCode() + ((iA + (map != null ? map.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "SystemAPI(dataFlowId=" + this.b + ", className=" + this.c + ", methodName=" + this.d + ", params=" + this.e + ", interceptTimeStamp=" + this.f + ')';
        }

        @Override // ttp.orbu.sdk.requestvalidator.Request
        public Integer c() {
            return this.b;
        }

        public final Integer d() {
            return this.b;
        }

        public final String i() {
            return this.c;
        }

        public final Date j() {
            return this.f;
        }

        public final String k() {
            return this.d;
        }

        public final Map<String, Object> l() {
            return this.e;
        }

        public static final class a implements Parcelable.Creator<SystemAPI> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SystemAPI createFromParcel(Parcel parcel) {
                Integer numValueOf;
                LinkedHashMap linkedHashMap = null;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap.put(parcel.readString(), parcel.readValue(SystemAPI.class.getClassLoader()));
                    }
                }
                return new SystemAPI(numValueOf, string, string2, linkedHashMap, (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public SystemAPI[] newArray(int i) {
                return new SystemAPI[i];
            }

            public final SystemAPI[] a(int i) {
                return new SystemAPI[i];
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SystemAPI)) {
                return false;
            }
            SystemAPI systemAPI = (SystemAPI) obj;
            if (Intrinsics.LJFF(this.b, systemAPI.b) && Intrinsics.LJFF(this.c, systemAPI.c) && Intrinsics.LJFF(this.d, systemAPI.d) && Intrinsics.LJFF(this.e, systemAPI.e) && Intrinsics.LJFF(this.f, systemAPI.f)) {
                return true;
            }
            return false;
        }

        public SystemAPI(Integer num, String str, String str2, Map<String, ? extends Object> map, Date date) {
            super(num);
            this.b = num;
            this.c = str;
            this.d = str2;
            this.e = map;
            this.f = date;
        }

        public final SystemAPI a(Integer num, String str, String str2, Map<String, ? extends Object> map, Date date) {
            return new SystemAPI(num, str, str2, map, date);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SystemAPI a(SystemAPI systemAPI, Integer num, String str, String str2, Map map, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                num = systemAPI.b;
            }
            if ((i & 2) != 0) {
                str = systemAPI.c;
            }
            if ((i & 4) != 0) {
                str2 = systemAPI.d;
            }
            if ((i & 8) != 0) {
                map = systemAPI.e;
            }
            if ((i & 16) != 0) {
                date = systemAPI.f;
            }
            return systemAPI.a(num, str, str2, map, date);
        }
    }

    public static final class WebRouter extends Request {
        public static final Parcelable.Creator<WebRouter> CREATOR = new a();
        public final Integer b;
        public final String c;
        public final String d;
        public final String e;
        public final Date f;
        public final C01GW g;

        public final class b extends C09AY implements Function0<c8> {
            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c8 invoke() {
                String str = WebRouter.this.c;
                if (str == null) {
                    str = "";
                }
                return new c8(str, null, null, C2097608Jq.LJ());
            }
        }

        public static /* synthetic */ void j() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.c;
        }

        public final String f() {
            return this.d;
        }

        public final String g() {
            return this.e;
        }

        public final Date h() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            Integer num = this.b;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeSerializable(this.f);
        }

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("x-tt-dataflow-id", this.b);
            jSONObject.put("metadata", jSONObject2);
            jSONObject.putOpt("url", this.c);
            jSONObject.putOpt("webviewRuntime", this.d);
            jSONObject.putOpt("routerString", this.e);
            jSONObject.put("timestamp", o3.c(this.f, null, null, 3, null));
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            Integer num = this.b;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return this.f.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final ng i() {
            return (ng) this.g.getValue();
        }

        public String toString() {
            return "WebRouter(dataFlowId=" + this.b + ", url=" + this.c + ", webviewRuntime=" + this.d + ", routerString=" + this.e + ", interceptTimeStamp=" + this.f + ')';
        }

        @Override // ttp.orbu.sdk.requestvalidator.Request
        public Integer c() {
            return this.b;
        }

        public final Integer d() {
            return this.b;
        }

        public final Date k() {
            return this.f;
        }

        public final String l() {
            return this.e;
        }

        public final String m() {
            return this.c;
        }

        public final String n() {
            return this.d;
        }

        public static final class a implements Parcelable.Creator<WebRouter> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WebRouter createFromParcel(Parcel parcel) {
                Integer numValueOf;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new WebRouter(numValueOf, parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public WebRouter[] newArray(int i) {
                return new WebRouter[i];
            }

            public final WebRouter[] a(int i) {
                return new WebRouter[i];
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebRouter)) {
                return false;
            }
            WebRouter webRouter = (WebRouter) obj;
            if (Intrinsics.LJFF(this.b, webRouter.b) && Intrinsics.LJFF(this.c, webRouter.c) && Intrinsics.LJFF(this.d, webRouter.d) && Intrinsics.LJFF(this.e, webRouter.e) && Intrinsics.LJFF(this.f, webRouter.f)) {
                return true;
            }
            return false;
        }

        public WebRouter(Integer num, String str, String str2, String str3, Date date) {
            super(num);
            this.b = num;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = date;
            this.g = C452501pT.LIZIZ(new b());
        }

        public final WebRouter a(Integer num, String str, String str2, String str3, Date date) {
            return new WebRouter(num, str, str2, str3, date);
        }

        public static WebRouter a(WebRouter webRouter, Integer num, String str, String str2, String str3, Date date, int i, Object obj) {
            Date date2 = date;
            String str4 = str3;
            String str5 = str2;
            String str6 = str;
            Integer num2 = num;
            if ((i & 1) != 0) {
                num2 = webRouter.b;
            }
            if ((i & 2) != 0) {
                str6 = webRouter.c;
            }
            if ((i & 4) != 0) {
                str5 = webRouter.d;
            }
            if ((i & 8) != 0) {
                str4 = webRouter.e;
            }
            if ((i & 16) != 0) {
                date2 = webRouter.f;
            }
            webRouter.getClass();
            return new WebRouter(num2, str6, str5, str4, date2);
        }
    }

    @Override // ttpobfuscated.b2
    public String a() {
        return b();
    }

    public Integer c() {
        return this.a;
    }

    public Request(Integer num) {
        this.a = num;
    }
}
