package com.tiktok.myna.render.render.elements;

import X.C1547320qMs;
import X.InterfaceC1547330qMt;
import X.InterfaceC21329918dd;
import X.InterfaceC21330018de;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.tiktok.myna.render.action.MynaActionTypeAdapter;
import com.tiktok.myna.render.render.MynaElement;
import com.tiktok.myna.render.render.MynaTemplateProtocol;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes33.dex */
public final class MynaTypeAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        if (type == null) {
            return null;
        }
        if (!InterfaceC21329918dd.class.equals(type) && !MynaTemplateProtocol.class.equals(type)) {
            if (!InterfaceC21330018de.class.equals(type) && !MynaElement.class.equals(type)) {
                if (!InterfaceC1547330qMt.class.equals(type) && !C1547320qMs.class.equals(type)) {
                    return null;
                }
                return new MynaActionTypeAdapter(gson);
            }
            return new MynaElementTypeAdapter(gson, this);
        }
        return new MynaTemplateTypeAdapter(gson);
    }
}
