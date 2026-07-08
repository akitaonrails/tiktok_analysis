package com.ss.bytertc.base.data;

import X.C810670Vr7;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public class RtcPreferences {
    public static volatile RtcPreferences sInstance;
    public final SharedPreferences mSharedPreferences;

    private void clearCache() {
        this.mSharedPreferences.edit().clear().commit();
    }

    public static RtcPreferences getInstance() {
        return instance(ContextUtils.getApplicationContext());
    }

    public RtcPreferences(Context context) {
        this.mSharedPreferences = C810670Vr7.LIZJ(context, 0, "rtc_preference");
    }

    public static RtcPreferences instance(Context context) {
        if (sInstance == null) {
            synchronized (RtcPreferences.class) {
                try {
                    if (context != null) {
                        if (sInstance == null) {
                            sInstance = new RtcPreferences(context);
                        }
                    } else {
                        throw new RuntimeException("unable to init RtcPreferences without context");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void remove(String str) {
        if (str == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public int getInt(String str, int i) {
        return this.mSharedPreferences.getInt(str, i);
    }

    public String getString(String str, String str2) {
        String string = this.mSharedPreferences.getString(str, str2);
        try {
            string.getBytes("utf-8");
            return string;
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public void putInt(String str, int i) {
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public void putString(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }
}
