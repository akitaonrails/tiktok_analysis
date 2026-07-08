package com.bytedance.common.wschannel.model;

import X.C821330WJv;
import X.C854630Xfp;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class SsWsApp implements IWsApp, Parcelable {
    public static final Parcelable.Creator<SsWsApp> CREATOR = new C854630Xfp(9);
    public boolean LL;
    public final List<Integer> LLILLJJLI;
    public String LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public String appKey;
    public int channelId;
    public String extra;
    public int fPid;
    public Map<String, String> headers;
    public int mAppId;
    public int mAppVersion;
    public String mDeviceId;
    public String mInstallId;
    public int mPlatform;
    public List<String> urls;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final JSONObject LJLIIIL() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channel_id", this.channelId);
        jSONObject.put("app_id", this.mAppId);
        jSONObject.put("device_id", this.mDeviceId);
        jSONObject.put("install_id", this.mInstallId);
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.urls;
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
        }
        Map<String, String> map = this.headers;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    try {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        jSONObject.put("headers", jSONObject2);
        jSONObject.put("urls", jSONArray);
        jSONObject.put("app_version", this.mAppVersion);
        jSONObject.put("platform", this.mPlatform);
        jSONObject.put("fpid", this.fPid);
        jSONObject.put("app_kay", this.appKey);
        jSONObject.put("extra", this.extra);
        jSONObject.put("private_protocol_enable", this.LL);
        JSONArray jSONArray2 = new JSONArray();
        List<Integer> list2 = this.LLILLJJLI;
        if (list2 != null) {
            Iterator<Integer> it3 = list2.iterator();
            while (it3.hasNext()) {
                jSONArray2.put(it3.next());
            }
        }
        jSONObject.put("service_id_list", jSONArray2);
        jSONObject.put("private_protocol_url", this.LLILLL);
        jSONObject.put("transport_mode", this.LLILZ);
        jSONObject.put("disable_fallback_websocket", this.LLILZIL);
        return jSONObject;
    }

    public final int hashCode() {
        int iHashCode = this.headers.hashCode() * 31;
        List<String> list = this.urls;
        int iHashCode2 = (((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.channelId) * 31;
        String str = this.extra;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.mAppId) * 31;
        String str2 = this.mDeviceId;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mInstallId;
        int iHashCode5 = (((((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.mAppVersion) * 31) + this.mPlatform) * 31) + this.fPid) * 31;
        String str4 = this.appKey;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public SsWsApp() {
        this.headers = new HashMap();
        this.urls = new ArrayList();
        this.LLILLJJLI = new ArrayList();
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final List<Integer> TJ() {
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final List<String> ZL() {
        return this.urls;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int getAppId() {
        return this.mAppId;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final String getAppKey() {
        return this.appKey;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int getAppVersion() {
        return this.mAppVersion;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int getChannelId() {
        return this.channelId;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final String getDeviceId() {
        return this.mDeviceId;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final String getExtra() {
        return this.extra;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final String getInstallId() {
        return this.mInstallId;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int getPlatform() {
        return this.mPlatform;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final boolean lq() {
        return this.LL;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final boolean oh() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int pf() {
        return this.fPid;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final String sK() {
        return this.LLILLL;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int uM() {
        return this.LLILZ;
    }

    public SsWsApp(Parcel parcel) {
        boolean z;
        this.headers = new HashMap();
        this.urls = new ArrayList();
        this.LLILLJJLI = new ArrayList();
        int i = parcel.readInt();
        this.headers = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.headers.put(parcel.readString(), parcel.readString());
        }
        this.urls = parcel.createStringArrayList();
        this.channelId = parcel.readInt();
        this.extra = parcel.readString();
        this.mAppId = parcel.readInt();
        this.mDeviceId = parcel.readString();
        this.mInstallId = parcel.readString();
        this.mAppVersion = parcel.readInt();
        this.mPlatform = parcel.readInt();
        this.fPid = parcel.readInt();
        this.appKey = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LL = z;
        int i3 = parcel.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            this.LLILLJJLI.add(Integer.valueOf(parcel.readInt()));
        }
        this.LLILLL = parcel.readString();
        this.LLILZ = parcel.readInt();
        this.LLILZIL = parcel.readByte() != 0;
    }

    public final void LIZ(JSONObject jSONObject) {
        String string;
        if (jSONObject == null) {
            return;
        }
        this.channelId = jSONObject.optInt("channel_id");
        this.mAppId = jSONObject.optInt("app_id");
        this.mDeviceId = jSONObject.optString("device_id");
        this.mInstallId = jSONObject.optString("install_id");
        this.mAppVersion = jSONObject.optInt("app_version");
        this.mPlatform = jSONObject.optInt("platform");
        this.fPid = jSONObject.optInt("fpid");
        this.appKey = jSONObject.optString("app_kay");
        this.extra = jSONObject.optString("extra");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("urls");
        this.urls.clear();
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                this.urls.add(jSONArrayOptJSONArray.optString(i));
            }
        }
        this.LL = jSONObject.optBoolean("private_protocol_enable");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("service_id_list");
        this.LLILLJJLI.clear();
        if (jSONArrayOptJSONArray2 != null) {
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                this.LLILLJJLI.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i2)));
            }
        }
        this.LLILLL = jSONObject.optString("private_protocol_url");
        this.LLILZ = jSONObject.optInt("transport_mode");
        this.LLILZIL = jSONObject.optBoolean("disable_fallback_websocket");
        this.headers.clear();
        Map<String, String> map = this.headers;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("headers");
        HashMap map2 = new HashMap();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (objOpt == null) {
                        string = null;
                    } else {
                        string = objOpt.toString();
                    }
                    map2.put(next, string);
                }
            }
        }
        map.putAll(map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SsWsApp ssWsApp = (SsWsApp) obj;
        if (this.channelId != ssWsApp.channelId || this.mAppId != ssWsApp.mAppId || this.mAppVersion != ssWsApp.mAppVersion || this.mPlatform != ssWsApp.mPlatform || this.fPid != ssWsApp.fPid || !this.headers.equals(ssWsApp.headers)) {
            return false;
        }
        List<String> list = this.urls;
        if (list != null) {
            if (!list.equals(ssWsApp.urls)) {
                return false;
            }
        } else if (ssWsApp.urls != null) {
            return false;
        }
        String str = this.extra;
        if (str != null) {
            if (!str.equals(ssWsApp.extra)) {
                return false;
            }
        } else if (ssWsApp.extra != null) {
            return false;
        }
        String str2 = this.mDeviceId;
        if (str2 != null) {
            if (!str2.equals(ssWsApp.mDeviceId)) {
                return false;
            }
        } else if (ssWsApp.mDeviceId != null) {
            return false;
        }
        String str3 = this.mInstallId;
        if (str3 != null) {
            if (!str3.equals(ssWsApp.mInstallId)) {
                return false;
            }
        } else if (ssWsApp.mInstallId != null) {
            return false;
        }
        String str4 = this.appKey;
        String str5 = ssWsApp.appKey;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.headers.size());
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeStringList(this.urls);
        parcel.writeInt(this.channelId);
        parcel.writeString(this.extra);
        parcel.writeInt(this.mAppId);
        parcel.writeString(this.mDeviceId);
        parcel.writeString(this.mInstallId);
        parcel.writeInt(this.mAppVersion);
        parcel.writeInt(this.mPlatform);
        parcel.writeInt(this.fPid);
        parcel.writeString(this.appKey);
        parcel.writeByte(this.LL ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.LLILLJJLI.size());
        Iterator<Integer> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
        parcel.writeString(this.LLILLL);
        parcel.writeInt(this.LLILZ);
        parcel.writeByte(this.LLILZIL ? (byte) 1 : (byte) 0);
    }

    public SsWsApp(int i, int i2, String str, String str2, List list, int i3, int i4, int i5, String str3, String str4, boolean z, List list2, String str5, int i6, boolean z2, C821330WJv c821330WJv) {
        this.headers = new HashMap();
        this.urls = new ArrayList();
        this.LLILLJJLI = new ArrayList();
        this.mAppId = i2;
        this.channelId = i;
        this.mDeviceId = str;
        this.mInstallId = str2;
        if (list != null) {
            this.urls.addAll(list);
        }
        this.mAppVersion = i3;
        this.mPlatform = i4;
        this.fPid = i5;
        this.appKey = str3;
        this.extra = str4;
        Map<String, String> map = c821330WJv.LJIIJ;
        if (map != null) {
            this.headers.putAll(map);
        }
        this.LL = z;
        this.LLILLJJLI = list2;
        this.LLILLL = str5;
        this.LLILZ = i6;
        this.LLILZIL = z2;
    }
}
