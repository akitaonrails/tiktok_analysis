package ttp.orbu.sdk.constants;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum TTPErrorCode {
    NotModified(304),
    BadRequest(400),
    Unauthorized(401),
    Forbidden(403),
    NotFound(404),
    RequestSizeLargerThanAllowed(413),
    RateLimitExceeded(429),
    InternalServer(500),
    Unavailable(503),
    RequestThrottledInternally(900),
    InterceptorException(999),
    Unknown(-1),
    IOException(-2),
    UnknownHostException(-3),
    Exception(-4);

    public static final a Companion = new a();
    public final int value;

    public static TTPErrorCode valueOf(String str) {
        return (TTPErrorCode) C08FF.LIZ(TTPErrorCode.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    public static final class a {
        public final TTPErrorCode a(int i) {
            for (TTPErrorCode tTPErrorCode : TTPErrorCode.values()) {
                if (tTPErrorCode.getValue() == i) {
                    return tTPErrorCode;
                }
            }
            return TTPErrorCode.Unknown;
        }
    }

    TTPErrorCode(int i) {
        this.value = i;
    }
}
