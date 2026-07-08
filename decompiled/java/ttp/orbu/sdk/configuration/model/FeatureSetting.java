package ttp.orbu.sdk.configuration.model;

/* JADX INFO: loaded from: classes24.dex */
public final class FeatureSetting {
    public final boolean enabled;
    public final String name;

    public String toString() {
        return "FeatureSetting(name=" + this.name + ", enabled=" + this.enabled + ')';
    }

    public FeatureSetting(String str, boolean z) {
        this.name = str;
        this.enabled = z;
    }
}
