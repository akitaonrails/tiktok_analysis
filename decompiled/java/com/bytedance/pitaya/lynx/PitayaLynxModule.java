package com.bytedance.pitaya.lynx;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188811AlT;
import X.InterfaceC1063790dmz;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pitaya.api.PTYMessageHandler;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.api.feature.IKVStore;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.pitaya.lynx.PitayaLynxModule;
import com.lynx.jsbridge.LynxContextModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.LynxView;
import j27.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class PitayaLynxModule extends LynxContextModule implements ReflectionCall {
    public final String mHostAid;

    @InterfaceC1063790dmz
    public boolean isPreloadReady() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "isPreloadReady", this, new Object[0], "boolean", new C0WZW(false, "()Z", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        String str = this.mHostAid;
        if (str == null) {
            return false;
        }
        return PitayaCoreFactory.getCore(str).isPreloadReady();
    }

    @InterfaceC1063790dmz
    public boolean isReady() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "isReady", this, new Object[0], "boolean", new C0WZW(false, "()Z", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        String str = this.mHostAid;
        if (str == null) {
            return false;
        }
        return PitayaCoreFactory.getCore(str).isReady();
    }

    public static String getErrorStr(PTYError pTYError) {
        StringBuilder sb = new StringBuilder("code:");
        sb.append(pTYError.getCode());
        sb.append(",summary:");
        sb.append(pTYError.getSummary());
        List<String> stacks = pTYError.getStacks();
        if (stacks != null) {
            int size = stacks.size();
            sb.append(",stack:");
            for (int i = 0; i < size; i++) {
                sb.append((String) ListProtector.get(stacks, i));
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static JavaOnlyArray toArray(JSONArray jSONArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        if (jSONArray == null) {
            return javaOnlyArray;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof JSONObject) {
                javaOnlyArray.add(toMap((JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                javaOnlyArray.add(toArray((JSONArray) objOpt));
            } else {
                javaOnlyArray.add(objOpt);
            }
        }
        return javaOnlyArray;
    }

    public static JavaOnlyMap toMap(JSONObject jSONObject) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (jSONObject == null) {
            return javaOnlyMap;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                javaOnlyMap.put(next, toMap((JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                javaOnlyMap.put(next, toArray((JSONArray) objOpt));
            } else {
                javaOnlyMap.put(next, objOpt);
            }
        }
        return javaOnlyMap;
    }

    @InterfaceC1063790dmz
    public void preCreatellmEngine(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "preCreatellmEngine", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        String str2 = this.mHostAid;
        if (str2 == null) {
            return;
        }
        PitayaCoreFactory.getCore(str2).preCreateLLMEngine(str);
    }

    @InterfaceC1063790dmz
    public void preDownloadPackage(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "preDownloadPackage", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        if (this.mHostAid == null) {
            return;
        }
        PitayaCoreFactory.getCore(this.mHostAid).downloadPackage(str, new PTYPackageCallback() { // from class: com.bytedance.pitaya.lynx.PitayaLynxModule.4
            @Override // com.bytedance.pitaya.api.PTYPackageCallback
            public void onResult(boolean z, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
            }
        });
    }

    @InterfaceC1063790dmz
    public boolean registerAppLogRunEventCallback2(final String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "registerAppLogRunEventCallback2", this, new Object[]{str}, "boolean", new C0WZW(false, "(Ljava/lang/String;)Z", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        String str2 = this.mHostAid;
        if (str2 == null) {
            return false;
        }
        PitayaCoreFactory.getCore(str2).registerApplogRunEventCallback(str, new PTYTaskResultCallback() { // from class: X.18pt
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public final void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                this.LL.lambda$registerAppLogRunEventCallback2$2(str, z, pTYError, pTYTaskData, pTYPackageInfo);
            }
        });
        return true;
    }

    @InterfaceC1063790dmz
    public boolean registerMessageHandler2(final String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "registerMessageHandler2", this, new Object[]{str}, "boolean", new C0WZW(false, "(Ljava/lang/String;)Z", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        String str2 = this.mHostAid;
        if (str2 == null) {
            return false;
        }
        PitayaCoreFactory.getCore(str2).registerMessageHandler(str, new PTYMessageHandler() { // from class: X.18pu
            @Override // com.bytedance.pitaya.api.PTYMessageHandler
            public final JSONObject onMessage(JSONObject jSONObject) {
                return this.LL.lambda$registerMessageHandler2$0(str, jSONObject);
            }
        });
        return true;
    }

    @InterfaceC1063790dmz
    public void releasellmEngine(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "releasellmEngine", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        String str2 = this.mHostAid;
        if (str2 == null) {
            return;
        }
        PitayaCoreFactory.getCore(str2).releaseLLMEngine(str);
    }

    @InterfaceC1063790dmz
    public boolean removeApplogRunEventCallback(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "removeApplogRunEventCallback", this, new Object[]{str}, "boolean", new C0WZW(false, "(Ljava/lang/String;)Z", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        String str2 = this.mHostAid;
        if (str2 == null) {
            return false;
        }
        PitayaCoreFactory.getCore(str2).removeApplogRunEventCallback(str);
        return true;
    }

    @InterfaceC1063790dmz
    public boolean removeMessageHandler(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "removeMessageHandler", this, new Object[]{str}, "boolean", new C0WZW(false, "(Ljava/lang/String;)Z", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        String str2 = this.mHostAid;
        if (str2 == null) {
            return false;
        }
        PitayaCoreFactory.getCore(str2).removeMessageHandler(str);
        return true;
    }

    public PitayaLynxModule(s sVar, Object obj) {
        super(sVar, obj);
        this.mHostAid = (String) obj;
    }

    private IKVStore getKVStore(String str, boolean z) {
        if (!isReady()) {
            return null;
        }
        if (z) {
            return FeatureCoreFactory.INSTANCE.getFeatureCore(this.mHostAid).createInMemoryKVStore(str);
        }
        return FeatureCoreFactory.INSTANCE.getFeatureCore(this.mHostAid).createKVStore(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ JSONObject lambda$registerMessageHandler2$0(String str, JSONObject jSONObject) {
        JavaOnlyMap map = toMap(jSONObject);
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        javaOnlyArray.add(map);
        LynxView lynxViewLJIILJJIL = this.mLynxContext.LJIILJJIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message_handler_callback_");
        sbLIZ.append(str);
        lynxViewLJIILJJIL.sendGlobalEvent(C2188811AlT.LIZIZ(sbLIZ), javaOnlyArray);
        return null;
    }

    @InterfaceC1063790dmz
    public WritableMap getKVData(String str, boolean z) throws Throwable {
        boolean zBooleanValue = z;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "getKVData", this, new Object[]{str, Boolean.valueOf(zBooleanValue)}, "com.lynx.react.bridge.WritableMap", new C0WZW(false, "(Ljava/lang/String;Z)Lcom/lynx/react/bridge/WritableMap;", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (WritableMap) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                zBooleanValue = ((Boolean) obj2).booleanValue();
            }
        }
        IKVStore kVStore = getKVStore(str, zBooleanValue);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (kVStore == null) {
            javaOnlyMap.putNull("value");
            javaOnlyMap.putBoolean("hasValue", false);
            return javaOnlyMap;
        }
        JSONObject kVData = kVStore.getKVData();
        if (kVData != null) {
            javaOnlyMap.putMap("value", toMap(kVData));
            javaOnlyMap.putBoolean("hasValue", true);
            return javaOnlyMap;
        }
        javaOnlyMap.putNull("value");
        javaOnlyMap.putBoolean("hasValue", false);
        return javaOnlyMap;
    }

    @InterfaceC1063790dmz
    public boolean registerAppLogRunEventCallback(String str, final Callback callback) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "registerAppLogRunEventCallback", this, new Object[]{str, callback}, "boolean", new C0WZW(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/Callback;)Z", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                callback = (Callback) obj2;
            }
        }
        String str2 = this.mHostAid;
        if (str2 == null) {
            return false;
        }
        PitayaCoreFactory.getCore(str2).registerApplogRunEventCallback(str, new PTYTaskResultCallback() { // from class: X.18ps
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public final void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                PitayaLynxModule.lambda$registerAppLogRunEventCallback$1(callback, z, pTYError, pTYTaskData, pTYPackageInfo);
            }
        });
        return true;
    }

    @InterfaceC1063790dmz
    public boolean registerMessageHandler(String str, final Callback callback) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "registerMessageHandler", this, new Object[]{str, callback}, "boolean", new C0WZW(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/Callback;)Z", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                callback = (Callback) obj2;
            }
        }
        if (this.mHostAid == null) {
            return false;
        }
        PitayaCoreFactory.getCore(this.mHostAid).registerMessageHandler(str, new PTYMessageHandler() { // from class: com.bytedance.pitaya.lynx.PitayaLynxModule.5
            @Override // com.bytedance.pitaya.api.PTYMessageHandler
            public JSONObject onMessage(JSONObject jSONObject) {
                callback.invoke(PitayaLynxModule.toMap(jSONObject));
                return new JSONObject();
            }
        });
        return true;
    }

    @InterfaceC1063790dmz
    public boolean contain(String str, String str2, boolean z) throws Throwable {
        String str3 = str;
        boolean zBooleanValue = z;
        String str4 = str2;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "contain", this, new Object[]{str3, str4, Boolean.valueOf(zBooleanValue)}, "boolean", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;Z)Z", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str3 = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                str4 = (String) obj2;
            }
            Object obj3 = objArr[2];
            if (obj3 != null) {
                zBooleanValue = ((Boolean) obj3).booleanValue();
            }
        }
        IKVStore kVStore = getKVStore(str3, zBooleanValue);
        if (kVStore == null) {
            return false;
        }
        return kVStore.contain(str4);
    }

    @InterfaceC1063790dmz
    public WritableMap getValueForKey(String str, String str2, boolean z) throws Throwable {
        String str3 = str;
        boolean zBooleanValue = z;
        String str4 = str2;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "getValueForKey", this, new Object[]{str3, str4, Boolean.valueOf(zBooleanValue)}, "com.lynx.react.bridge.WritableMap", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/lynx/react/bridge/WritableMap;", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (WritableMap) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str3 = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                str4 = (String) obj2;
            }
            Object obj3 = objArr[2];
            if (obj3 != null) {
                zBooleanValue = ((Boolean) obj3).booleanValue();
            }
        }
        IKVStore kVStore = getKVStore(str3, zBooleanValue);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (kVStore == null) {
            javaOnlyMap.putNull("value");
            javaOnlyMap.putBoolean("hasValue", false);
            return javaOnlyMap;
        }
        Object valueForKey = kVStore.getValueForKey(str4);
        if (valueForKey != null) {
            if (valueForKey instanceof String) {
                javaOnlyMap.putString("value", (String) valueForKey);
            } else if (valueForKey instanceof Boolean) {
                javaOnlyMap.putBoolean("value", ((Boolean) valueForKey).booleanValue());
            } else if (valueForKey instanceof Integer) {
                javaOnlyMap.putInt("value", ((Integer) valueForKey).intValue());
            } else if (valueForKey instanceof Double) {
                javaOnlyMap.putDouble("value", ((Double) valueForKey).doubleValue());
            } else if (valueForKey instanceof JSONObject) {
                javaOnlyMap.putMap("value", toMap((JSONObject) valueForKey));
            } else if (valueForKey instanceof JSONArray) {
                javaOnlyMap.putArray("value", toArray((JSONArray) valueForKey));
            } else {
                javaOnlyMap.putString("value", valueForKey.toString());
            }
            javaOnlyMap.putBoolean("hasValue", true);
            return javaOnlyMap;
        }
        javaOnlyMap.putNull("value");
        javaOnlyMap.putBoolean("hasValue", false);
        return javaOnlyMap;
    }

    @InterfaceC1063790dmz
    public WritableMap getValueForKeys(String str, ReadableArray readableArray, boolean z) throws Throwable {
        String str2 = str;
        boolean zBooleanValue = z;
        ReadableArray readableArray2 = readableArray;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "getValueForKeys", this, new Object[]{str2, readableArray2, Boolean.valueOf(zBooleanValue)}, "com.lynx.react.bridge.WritableMap", new C0WZW(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableArray;Z)Lcom/lynx/react/bridge/WritableMap;", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (WritableMap) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str2 = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                readableArray2 = (ReadableArray) obj2;
            }
            Object obj3 = objArr[2];
            if (obj3 != null) {
                zBooleanValue = ((Boolean) obj3).booleanValue();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray2.size(); i++) {
            arrayList.add(readableArray2.getString(i));
        }
        IKVStore kVStore = getKVStore(str2, zBooleanValue);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (kVStore == null) {
            javaOnlyMap.putNull("value");
            javaOnlyMap.putBoolean("hasValue", false);
            return javaOnlyMap;
        }
        JSONObject valueForKeys = kVStore.getValueForKeys(arrayList);
        if (valueForKeys != null) {
            javaOnlyMap.putMap("value", toMap(valueForKeys));
            javaOnlyMap.putBoolean("hasValue", true);
            return javaOnlyMap;
        }
        javaOnlyMap.putNull("value");
        javaOnlyMap.putBoolean("hasValue", false);
        return javaOnlyMap;
    }

    @InterfaceC1063790dmz
    public boolean removeKeys(String str, ReadableArray readableArray, boolean z) throws Throwable {
        String str2 = str;
        boolean zBooleanValue = z;
        ReadableArray readableArray2 = readableArray;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "removeKeys", this, new Object[]{str2, readableArray2, Boolean.valueOf(zBooleanValue)}, "boolean", new C0WZW(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableArray;Z)Z", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str2 = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                readableArray2 = (ReadableArray) obj2;
            }
            Object obj3 = objArr[2];
            if (obj3 != null) {
                zBooleanValue = ((Boolean) obj3).booleanValue();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray2.size(); i++) {
            arrayList.add(readableArray2.getString(i));
        }
        IKVStore kVStore = getKVStore(str2, zBooleanValue);
        if (kVStore == null) {
            return false;
        }
        return kVStore.removeKeys(arrayList);
    }

    @InterfaceC1063790dmz
    public boolean setKVData(String str, ReadableMap readableMap, boolean z) throws Throwable {
        String str2 = str;
        boolean zBooleanValue = z;
        ReadableMap readableMap2 = readableMap;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "setKVData", this, new Object[]{str2, readableMap2, Boolean.valueOf(zBooleanValue)}, "boolean", new C0WZW(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;Z)Z", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str2 = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                readableMap2 = (ReadableMap) obj2;
            }
            Object obj3 = objArr[2];
            if (obj3 != null) {
                zBooleanValue = ((Boolean) obj3).booleanValue();
            }
        }
        IKVStore kVStore = getKVStore(str2, zBooleanValue);
        if (kVStore == null) {
            return false;
        }
        return kVStore.setKVData(new JSONObject(readableMap2.toHashMap()));
    }

    @InterfaceC1063790dmz
    public boolean setValueForKey(String str, String str2, ReadableMap readableMap, boolean z) throws Throwable {
        String str3;
        String str4;
        Object obj;
        boolean zBooleanValue = z;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/pitaya/lynx/PitayaLynxModule", "setValueForKey", this, new Object[]{str, str2, readableMap, Boolean.valueOf(zBooleanValue)}, "boolean", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;Z)Z", new C0WZX("dzBzEgAjS8/YVFkiQFyUb/KF0BZUQDQvNVhnxQvnX/GyJ97ArQmz6uTu", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj2 = objArr[0];
            if (obj2 != null) {
                str3 = (String) obj2;
            } else {
                str3 = str;
            }
            Object obj3 = objArr[1];
            if (obj3 != null) {
                str4 = (String) obj3;
            } else {
                str4 = str2;
            }
            obj = objArr[2];
            if (obj == null) {
                obj = readableMap;
            }
            Object obj4 = objArr[3];
            if (obj4 != null) {
                zBooleanValue = ((Boolean) obj4).booleanValue();
            }
        } else {
            str3 = str;
            str4 = str2;
            obj = readableMap;
        }
        IKVStore kVStore = getKVStore(str3, zBooleanValue);
        if (kVStore == null) {
            return false;
        }
        return kVStore.setValueForKey(str4, obj);
    }

    public static /* synthetic */ void lambda$registerAppLogRunEventCallback$1(Callback callback, boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (pTYTaskData != null) {
            javaOnlyMap = toMap(pTYTaskData.getParams());
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        String summary = "success";
        javaOnlyMap2.put("success", Integer.valueOf(z ? 1 : 0));
        if (pTYError != null) {
            summary = pTYError.getSummary();
        }
        javaOnlyMap2.put("msg", summary);
        javaOnlyMap2.put("result", javaOnlyMap);
        javaOnlyMap2.put("pitaya_extra_info", "registerAppLogRunEventCallback was Deprecated, using registerAppLogRunEventCallback2");
        callback.invoke(javaOnlyMap2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerAppLogRunEventCallback2$2(String str, boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (pTYTaskData != null) {
            javaOnlyMap = toMap(pTYTaskData.getParams());
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        String summary = "success";
        javaOnlyMap2.put("success", Integer.valueOf(z ? 1 : 0));
        if (pTYError != null) {
            summary = pTYError.getSummary();
        }
        javaOnlyMap2.put("msg", summary);
        javaOnlyMap2.put("result", javaOnlyMap);
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        javaOnlyArray.add(javaOnlyMap2);
        LynxView lynxViewLJIILJJIL = this.mLynxContext.LJIILJJIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applog_run_event_callback_");
        sbLIZ.append(str);
        lynxViewLJIILJJIL.sendGlobalEvent(C2188811AlT.LIZIZ(sbLIZ), javaOnlyArray);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    @X.InterfaceC1063790dmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void runTask(java.lang.String r21, com.lynx.react.bridge.ReadableMap r22, java.lang.String r23, float r24, com.lynx.react.bridge.Callback r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pitaya.lynx.PitayaLynxModule.runTask(java.lang.String, com.lynx.react.bridge.ReadableMap, java.lang.String, float, com.lynx.react.bridge.Callback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    @X.InterfaceC1063790dmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void llmRunTask(java.lang.String r21, com.lynx.react.bridge.ReadableMap r22, java.lang.String r23, float r24, com.lynx.react.bridge.Callback r25, com.lynx.react.bridge.Callback r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pitaya.lynx.PitayaLynxModule.llmRunTask(java.lang.String, com.lynx.react.bridge.ReadableMap, java.lang.String, float, com.lynx.react.bridge.Callback, com.lynx.react.bridge.Callback):void");
    }
}
