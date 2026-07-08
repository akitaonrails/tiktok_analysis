package com.tiktok.strategycenter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class TTMStrategyResult {
    public String bizName;
    public Map<Object, Object> customVariables;
    public Exception error;
    public Object[] matchedEvents;
    public String ruleName;
    public boolean success;

    public Map<Object, Object> getCustomVariables() {
        if (this.customVariables == null) {
            this.customVariables = new HashMap();
        }
        return this.customVariables;
    }

    public Map nativeGetCustomVariables() {
        if (this.customVariables == null) {
            this.customVariables = new HashMap();
        }
        return this.customVariables;
    }

    public TTMStrategyResult() {
    }

    public String getBizName() {
        return this.bizName;
    }

    public Exception getError() {
        return this.error;
    }

    public Object[] getMatchedEvents() {
        return this.matchedEvents;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setBizName(String str) {
        this.bizName = str;
    }

    public void setError(String str) {
        this.error = new Exception(str);
    }

    public void setMatchedEvents(Object[] objArr) {
        this.matchedEvents = objArr;
    }

    public void setRuleName(String str) {
        this.ruleName = str;
    }

    public static void nativeSetListBoolValue(List<Object> list, boolean z) {
        list.add(Boolean.valueOf(z));
    }

    public static void nativeSetListDoubleValue(List<Object> list, double d) {
        list.add(Double.valueOf(d));
    }

    public static void nativeSetListLongValue(List<Object> list, long j) {
        list.add(Long.valueOf(j));
    }

    public static void nativeSetListObjectValue(List<Object> list, Object obj) {
        list.add(obj);
    }

    public void setSuccessStatus(boolean z, Object[] objArr) {
        this.success = z;
        this.matchedEvents = objArr;
    }

    public static void nativeSetMapBoolValue(Map<Object, Object> map, Object obj, boolean z) {
        map.put(obj, Boolean.valueOf(z));
    }

    public static void nativeSetMapDoubleValue(Map<Object, Object> map, Object obj, double d) {
        map.put(obj, Double.valueOf(d));
    }

    public static void nativeSetMapLongValue(Map<Object, Object> map, Object obj, long j) {
        map.put(obj, Long.valueOf(j));
    }

    public static void nativeSetMapObjectValue(Map<Object, Object> map, Object obj, Object obj2) {
        map.put(obj, obj2);
    }

    public TTMStrategyResult(String str, String str2, boolean z, Object[] objArr) {
        this.success = z;
        this.matchedEvents = objArr;
        this.ruleName = str2;
        this.bizName = str;
    }

    public TTMStrategyResult(boolean z, String str, String str2, String str3, Object[] objArr) {
        this.success = z;
        if (str != null) {
            this.error = new Exception(str);
        }
        this.ruleName = str2;
        this.bizName = str3;
        this.matchedEvents = objArr;
    }
}
