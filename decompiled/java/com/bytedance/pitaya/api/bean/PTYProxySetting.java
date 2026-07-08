package com.bytedance.pitaya.api.bean;

import X.C2188811AlT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes4.dex */
public final class PTYProxySetting implements ReflectionCall {
    public boolean applogProxyEnabled;
    public boolean featureStoreProxyEnabled;
    public final boolean provideAppLog;
    public boolean useCustomApplogEvents;
    public String customApplogEvents = "";
    public int maxApplogEventCacheNum = 100;

    public final PTYProxySetting copy(boolean z) {
        return new PTYProxySetting(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PTYProxySetting) && this.provideAppLog == ((PTYProxySetting) obj).provideAppLog;
    }

    public int hashCode() {
        boolean z = this.provideAppLog;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PTYProxySetting(provideAppLog=");
        sbLIZ.append(this.provideAppLog);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getApplogProxyEnabled() {
        return this.applogProxyEnabled;
    }

    public final String getCustomApplogEvents() {
        return this.customApplogEvents;
    }

    public final boolean getFeatureStoreProxyEnabled() {
        return this.featureStoreProxyEnabled;
    }

    public final int getMaxApplogEventCacheNum() {
        return this.maxApplogEventCacheNum;
    }

    public final boolean getProvideAppLog() {
        return this.provideAppLog;
    }

    public final boolean getUseCustomApplogEvents() {
        return this.useCustomApplogEvents;
    }

    public PTYProxySetting(boolean z) {
        this.provideAppLog = z;
    }

    public final void setApplogProxyEnabled(boolean z) {
        this.applogProxyEnabled = z;
    }

    public final void setCustomApplogEvents(String str) {
        this.customApplogEvents = str;
    }

    public final void setFeatureStoreProxyEnabled(boolean z) {
        this.featureStoreProxyEnabled = z;
    }

    public final void setMaxApplogEventCacheNum(int i) {
        this.maxApplogEventCacheNum = i;
    }

    public final void setUseCustomApplogEvents(boolean z) {
        this.useCustomApplogEvents = z;
    }
}
