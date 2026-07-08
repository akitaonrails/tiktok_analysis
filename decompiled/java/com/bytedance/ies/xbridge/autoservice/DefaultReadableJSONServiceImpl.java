package com.bytedance.ies.xbridge.autoservice;

import X.C1323500kXs;
import X.C1697810uHb;
import X.C1872780ypo;
import X.InterfaceC1107470evR;
import X.InterfaceC1107590evd;
import X.InterfaceC1871920yoQ;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class DefaultReadableJSONServiceImpl implements IReadableJSONService {
    @Override // com.bytedance.ies.xbridge.autoservice.IReadableJSONService
    public JSONArray xReadableArrayToJSONArray(InterfaceC1871920yoQ interfaceC1871920yoQ) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<Object> it2 = interfaceC1871920yoQ.toList().iterator();
        int i = 0;
        while (it2.hasNext()) {
            it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                switch (C1323500kXs.LIZ[interfaceC1871920yoQ.getType(i).ordinal()]) {
                    case 1:
                        InterfaceC1871920yoQ array = interfaceC1871920yoQ.getArray(i);
                        if (array != null) {
                            C1872780ypo.LIZ.getClass();
                            jSONArray.put(C1872780ypo.LIZ(array));
                        }
                        break;
                    case 2:
                        InterfaceC1107590evd map = interfaceC1871920yoQ.getMap(i);
                        if (map != null) {
                            C1872780ypo.LIZ.getClass();
                            jSONArray.put(C1872780ypo.LIZIZ(map));
                        }
                        break;
                    case 3:
                        jSONArray.put(interfaceC1871920yoQ.getString(i));
                        break;
                    case 4:
                        jSONArray.put(interfaceC1871920yoQ.getDouble(i));
                        break;
                    case 5:
                        jSONArray.put(interfaceC1871920yoQ.getInt(i));
                        break;
                    case 6:
                        jSONArray.put(interfaceC1871920yoQ.getBoolean(i));
                        break;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return jSONArray;
    }

    @Override // com.bytedance.ies.xbridge.autoservice.IReadableJSONService
    public JSONObject xReadableMapToJSONObject(InterfaceC1107590evd interfaceC1107590evd) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        InterfaceC1107470evR interfaceC1107470evRLIZIZ = interfaceC1107590evd.LIZIZ();
        while (interfaceC1107470evRLIZIZ.hasNextKey()) {
            String strNextKey = interfaceC1107470evRLIZIZ.nextKey();
            switch (C1323500kXs.LIZ[interfaceC1107590evd.getType(strNextKey).ordinal()]) {
                case 1:
                    InterfaceC1871920yoQ array = interfaceC1107590evd.getArray(strNextKey);
                    if (array != null) {
                        C1872780ypo.LIZ.getClass();
                        jSONObject.put(strNextKey, C1872780ypo.LIZ(array));
                    }
                    break;
                case 2:
                    InterfaceC1107590evd map = interfaceC1107590evd.getMap(strNextKey);
                    if (map != null) {
                        C1872780ypo.LIZ.getClass();
                        jSONObject.put(strNextKey, C1872780ypo.LIZIZ(map));
                    }
                    break;
                case 3:
                    jSONObject.put(strNextKey, interfaceC1107590evd.getString(strNextKey));
                    break;
                case 4:
                    jSONObject.put(strNextKey, interfaceC1107590evd.getDouble(strNextKey));
                    break;
                case 5:
                    jSONObject.put(strNextKey, interfaceC1107590evd.getInt(strNextKey));
                    break;
                case 6:
                    jSONObject.put(strNextKey, interfaceC1107590evd.getBoolean(strNextKey));
                    break;
            }
        }
        return jSONObject;
    }
}
