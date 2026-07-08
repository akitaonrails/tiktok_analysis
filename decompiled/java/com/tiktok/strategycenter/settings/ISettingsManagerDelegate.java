package com.tiktok.strategycenter.settings;

import X.C2208791Bcb;

/* JADX INFO: loaded from: classes35.dex */
public interface ISettingsManagerDelegate {
    public static final C2208791Bcb Companion = C2208791Bcb.LIZ;

    boolean getSettingsBoolean(String str, boolean z);

    double getSettingsDouble(String str, double d);

    float getSettingsFloat(String str, float f);

    int getSettingsInt(String str, int i);

    String getSettingsJsonValue(String str);

    long getSettingsLong(String str, long j);

    String getSettingsString(String str, String str2);
}
