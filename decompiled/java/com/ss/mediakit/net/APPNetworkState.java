package com.ss.mediakit.net;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public class APPNetworkState {
    public final Status status;

    public interface APPNetworkStateCallback {
        void onAPPNetworkStateChanged(APPNetworkState aPPNetworkState);
    }

    public enum Status {
        UNKNOWN(-1),
        NOT_AVAILABLE(0),
        FAKE(1),
        WEAK(2),
        STRONG(3);

        public final int int32Value;

        @Override // java.lang.Enum
        public String toString() {
            return name();
        }

        public int toInt32Value() {
            return this.int32Value;
        }

        public static Status valueOf(String str) {
            return (Status) C08FF.LIZ(Status.class, str);
        }

        Status(int i) {
            this.int32Value = i;
        }
    }

    public int toInt32Value() {
        return this.status.toInt32Value();
    }

    public String toString() {
        return this.status.toString();
    }

    public APPNetworkState() {
        this.status = Status.UNKNOWN;
    }

    public Status getStatus() {
        return this.status;
    }

    public APPNetworkState(Status status) {
        this.status = status;
    }
}
