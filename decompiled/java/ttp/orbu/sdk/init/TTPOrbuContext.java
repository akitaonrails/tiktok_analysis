package ttp.orbu.sdk.init;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class TTPOrbuContext {
    public String a;
    public String b;
    public String c;
    public String d;
    public final Context e;
    public final JSONObject f;
    public Function0<String> g;
    public Function0<String> h;

    public String toString() {
        return "TTPOrbuContext(region=" + this.a + ", userId=" + this.b + ", deviceId=" + this.c + ", userAction=" + this.d + ", applicationContext=" + this.e + ", extraInfo=" + this.f + ')';
    }

    public final Context getApplicationContext() {
        return this.e;
    }

    public final String getDeviceId() {
        return this.c;
    }

    public final JSONObject getExtraInfo() {
        return this.f;
    }

    public final Function0<String> getGeneralConfigProvider$ttp_productionRelease() {
        return this.g;
    }

    public final Function0<String> getOrbuCodeConfigProvider$ttp_productionRelease() {
        return this.h;
    }

    public final String getRegion() {
        return this.a;
    }

    public final String getUserAction() {
        return this.d;
    }

    public final String getUserId() {
        return this.b;
    }

    public final void setDeviceId(String str) {
        this.c = str;
    }

    public final void setGeneralConfigProvider$ttp_productionRelease(Function0<String> function0) {
        this.g = function0;
    }

    public final void setOrbuCodeConfigProvider$ttp_productionRelease(Function0<String> function0) {
        this.h = function0;
    }

    public final void setRegion(String str) {
        this.a = str;
    }

    public final void setUserAction(String str) {
        this.d = str;
    }

    public final void setUserId(String str) {
        this.b = str;
    }

    public TTPOrbuContext(String str, String str2, String str3, String str4, Context context, JSONObject jSONObject) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = context;
        this.f = jSONObject;
    }
}
