package ttp.orbu.sdk.configuration.model;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum SessionIdHeaderFrequency {
    Never(1),
    HeartbeatOnly(2),
    Always(3);

    public static final Companion Companion = new Companion();
    public final int rawValue;

    public static SessionIdHeaderFrequency valueOf(String str) {
        return (SessionIdHeaderFrequency) C08FF.LIZ(SessionIdHeaderFrequency.class, str);
    }

    public final int getRawValue() {
        return this.rawValue;
    }

    public static final class Companion {
        public final SessionIdHeaderFrequency fromInt(Integer num) {
            for (SessionIdHeaderFrequency sessionIdHeaderFrequency : SessionIdHeaderFrequency.values()) {
                int rawValue = sessionIdHeaderFrequency.getRawValue();
                if (num != null && rawValue == num.intValue()) {
                    return sessionIdHeaderFrequency;
                }
            }
            return null;
        }
    }

    SessionIdHeaderFrequency(int i) {
        this.rawValue = i;
    }
}
