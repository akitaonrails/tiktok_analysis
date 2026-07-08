package ttp.orbu.sdk.netnative;

/* JADX INFO: loaded from: classes24.dex */
public abstract class ValidationEventType {
    public static final a Companion = new a();
    public final int code;

    public static final class Error extends ValidationEventType {
        public static final Error INSTANCE = new Error();

        public Error() {
            super(2002);
        }
    }

    public static final class Failure extends ValidationEventType {
        public static final Failure INSTANCE = new Failure();

        public Failure() {
            super(1);
        }
    }

    public static final class Log extends ValidationEventType {
        public static final Log INSTANCE = new Log();

        public Log() {
            super(2003);
        }
    }

    public static final class NotDefined extends ValidationEventType {
        public static final NotDefined INSTANCE = new NotDefined();

        public NotDefined() {
            super(2000);
        }
    }

    public static final class NotValidDataFlowId extends ValidationEventType {
        public static final NotValidDataFlowId INSTANCE = new NotValidDataFlowId();

        public NotValidDataFlowId() {
            super(2);
        }
    }

    public static final class Success extends ValidationEventType {
        public static final Success INSTANCE = new Success();

        public Success() {
            super(0);
        }
    }

    public static final class UnHandled extends ValidationEventType {
        public static final UnHandled INSTANCE = new UnHandled();

        public UnHandled() {
            super(2001);
        }
    }

    public final int getCode() {
        return this.code;
    }

    public static final class ReturnCodeValue extends ValidationEventType {
        public ReturnCodeValue(int i) {
            super(i);
        }
    }

    public static final class a {
        public final ValidationEventType a(Integer num) {
            int iIntValue;
            if (num != null) {
                if (num.intValue() == 0) {
                    return Success.INSTANCE;
                }
                if (num.intValue() == 1) {
                    return Failure.INSTANCE;
                }
                if (num.intValue() == 2) {
                    return NotValidDataFlowId.INSTANCE;
                }
                if (num.intValue() == 2000) {
                    return NotDefined.INSTANCE;
                }
                if (num.intValue() == 2001) {
                    return UnHandled.INSTANCE;
                }
                if (num.intValue() == 2002) {
                    return Error.INSTANCE;
                }
                if (num.intValue() == 2003) {
                    return Log.INSTANCE;
                }
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            return new ReturnCodeValue(iIntValue);
        }
    }

    public ValidationEventType(int i) {
        this.code = i;
    }
}
