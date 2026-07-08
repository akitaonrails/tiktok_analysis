package com.bytedance.pns.engine;

import X.C098200Yq;
import X.C09CT;
import X.C09DE;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class Action {

    @C09DE(deserialize = true, serialize = false)
    public Map<String, ? extends Object> _params;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String actionId;

    @C09DE(deserialize = true, serialize = false)
    public String computeResult;

    @C09DE(deserialize = true, serialize = false)
    public String configFixedParam;

    @C09CT("name")
    public String name;

    public Action() {
        this(null, null, null, null);
    }

    public final Map<String, Object> getParams() {
        if (this._params == null) {
            this._params = mergeJsonStringsToMap(this.computeResult, this.configFixedParam);
        }
        return this._params;
    }

    public final void setActionId(String str) {
        this.actionId = str;
    }

    public final void setComputeResult(String str) {
        this.computeResult = str;
    }

    public final void setConfigFixedParam(String str) {
        this.configFixedParam = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setParams(Map<String, ? extends Object> map) {
        this._params = map;
    }

    private final Map<String, Object> mergeJsonStringsToMap(String str, String str2) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Iterator<String> itKeys;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys2 = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            itKeys = jSONObject.keys();
        } else {
            itKeys = null;
        }
        if (itKeys != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.opt(next));
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        if (str2 != null) {
            try {
                jSONObject2 = new JSONObject(str2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
                return linkedHashMap;
            }
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            itKeys2 = jSONObject2.keys();
        }
        if (itKeys2 != null) {
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                linkedHashMap.put(next2, jSONObject2.opt(next2));
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return linkedHashMap;
    }

    public Action(String str, String str2, String str3, String str4) {
        this.computeResult = str;
        this.configFixedParam = str2;
        this.name = str3;
        this.actionId = str4;
    }
}
