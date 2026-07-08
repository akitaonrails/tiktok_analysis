package com.bytedance.android.livesdk.comp.api.image;

import X.C006A;
import X.C0JBN;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public interface IImageService extends C006A {
    boolean Ej1(String str);

    void SP0(String str, Function1<? super Boolean, Unit> function1);

    C0JBN a40();

    void cv();

    void onImageLoaded(boolean z, String str, JSONObject jSONObject);
}
