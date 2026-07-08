package com.tiktok.json.gson;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.m;
import java.io.StringWriter;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public class GsonOrigin {
    public static String toJson(Gson gson, Object obj) {
        if (obj == null) {
            return toJson(gson, (k) m.LL);
        }
        return toJson(gson, obj, obj.getClass());
    }

    public static String toJson(Gson gson, k kVar) {
        StringWriter stringWriter = new StringWriter();
        GsonProtectorUtils.toJson(gson, kVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public static String toJson(Gson gson, Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        GsonProtectorUtils.toJson(gson, obj, type, stringWriter);
        return stringWriter.toString();
    }
}
