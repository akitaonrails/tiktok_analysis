package com.lynx.jsbridge.jsi;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbsLynxJSIObjectDescriptor implements ILynxJSIObjectDescriptor {
    public volatile ConcurrentHashMap<String, LynxJSPropertyDescriptor> mFieldInfos;
    public volatile String[] mFields;

    public abstract ConcurrentHashMap<String, LynxJSPropertyDescriptor> createFieldInfos();

    @Override // com.lynx.jsbridge.jsi.ILynxJSIObjectDescriptor
    public abstract String getClassName();

    private void ensureFieldInfos() {
        if (this.mFieldInfos != null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.mFieldInfos != null) {
                    return;
                }
                this.mFieldInfos = createFieldInfos();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.lynx.jsbridge.jsi.ILynxJSIObjectDescriptor
    public String[] getFields() {
        String[] strArr;
        ensureFieldInfos();
        if (this.mFields != null) {
            return this.mFields;
        }
        synchronized (this) {
            try {
                if (this.mFields == null) {
                    this.mFields = (String[]) this.mFieldInfos.keySet().toArray(new String[0]);
                }
                strArr = this.mFields;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return strArr;
    }

    @Override // com.lynx.jsbridge.jsi.ILynxJSIObjectDescriptor
    public void warmUp() {
        ensureFieldInfos();
    }

    @Override // com.lynx.jsbridge.jsi.ILynxJSIObjectDescriptor
    public String[] getLynxObjectDescriptorInfo(String str) {
        ensureFieldInfos();
        LynxJSPropertyDescriptor lynxJSPropertyDescriptor = this.mFieldInfos.get(str);
        if (lynxJSPropertyDescriptor != null) {
            return new String[]{lynxJSPropertyDescriptor.fieldName, lynxJSPropertyDescriptor.fieldJNIDescriptor};
        }
        return null;
    }
}
