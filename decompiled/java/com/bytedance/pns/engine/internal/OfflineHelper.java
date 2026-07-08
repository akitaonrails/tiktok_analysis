package com.bytedance.pns.engine.internal;

import X.C810670Vr7;
import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes14.dex */
public final class OfflineHelper {
    public static final OfflineHelper INSTANCE = new OfflineHelper();
    public static SharedPreferences sp;

    public static final void clearStorage() {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorRemove = editorEdit.remove("offline_strategy")) == null) {
            return;
        }
        editorRemove.apply();
    }

    public static final boolean hasInit() {
        return sp != null;
    }

    public static final String takeLocalStrategy() {
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences != null) {
            return sharedPreferences.getString("offline_strategy", "{}");
        }
        return null;
    }

    public static final boolean isEnableMock() {
        SharedPreferences sharedPreferences;
        return hasInit() && (sharedPreferences = sp) != null && sharedPreferences.getBoolean("mock_enable", false);
    }

    public static final void storeStrategy(String str) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString("offline_strategy", str)) != null) {
            editorPutString.apply();
        }
    }

    public static final void switchMock(boolean z) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutBoolean = editorEdit.putBoolean("mock_enable", z)) != null) {
            editorPutBoolean.apply();
        }
    }

    public final void init(Context context) {
        sp = C810670Vr7.LIZJ(context, 0, "pumbaa_rule_engine_offline");
    }
}
