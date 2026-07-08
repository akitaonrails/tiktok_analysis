package ttp.orbu.sdk.configuration.model;

import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.m2;

/* JADX INFO: loaded from: classes24.dex */
public final class OrbuCodeConfig implements Config {
    public final String content;
    public final String orbuHash;
    public final int samplingBufferSize;
    public final UnhandledReturnStrategy strategy;
    public final ConfigType type;
    public final int version;

    public final int component1() {
        return getVersion();
    }

    public final ConfigType component2() {
        return getType();
    }

    public final OrbuCodeConfig copy(int i, ConfigType configType, String str, String str2, UnhandledReturnStrategy unhandledReturnStrategy, int i2) {
        return new OrbuCodeConfig(i, configType, str, str2, unhandledReturnStrategy, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrbuCodeConfig)) {
            return false;
        }
        OrbuCodeConfig orbuCodeConfig = (OrbuCodeConfig) obj;
        return getVersion() == orbuCodeConfig.getVersion() && Intrinsics.LJFF(getType(), orbuCodeConfig.getType()) && Intrinsics.LJFF(this.content, orbuCodeConfig.content) && Intrinsics.LJFF(this.orbuHash, orbuCodeConfig.orbuHash) && Intrinsics.LJFF(this.strategy, orbuCodeConfig.strategy) && this.samplingBufferSize == orbuCodeConfig.samplingBufferSize;
    }

    public String toString() {
        return "OrbuCodeConfig(version=" + getVersion() + ", type=" + getType() + ", content=" + this.content + ", orbuHash=" + this.orbuHash + ", strategy=" + this.strategy + ", samplingBufferSize=" + this.samplingBufferSize + ')';
    }

    public int hashCode() {
        return this.samplingBufferSize + ((this.strategy.hashCode() + m2.a(this.orbuHash, m2.a(this.content, (getType().hashCode() + (getVersion() * 31)) * 31, 31), 31)) * 31);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getOrbuHash() {
        return this.orbuHash;
    }

    public final int getSamplingBufferSize() {
        return this.samplingBufferSize;
    }

    public final UnhandledReturnStrategy getStrategy() {
        return this.strategy;
    }

    @Override // ttp.orbu.sdk.configuration.model.Config
    public ConfigType getType() {
        return this.type;
    }

    @Override // ttp.orbu.sdk.configuration.model.Config
    public int getVersion() {
        return this.version;
    }

    public OrbuCodeConfig(int i, ConfigType configType, String str, String str2, UnhandledReturnStrategy unhandledReturnStrategy, int i2) {
        this.version = i;
        this.type = configType;
        this.content = str;
        this.orbuHash = str2;
        this.strategy = unhandledReturnStrategy;
        this.samplingBufferSize = i2;
    }
}
