package com.ss.android.ugc.effectmanager.common.model;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface ApiState<T> {

    public static final class Loading implements ApiState {
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -1624078818;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class Error implements ApiState {
        public final Throwable throwable;

        public final Error copy(Throwable th) {
            return new Error(th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.LJFF(this.throwable, ((Error) obj).throwable);
        }

        public int hashCode() {
            Throwable th = this.throwable;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error(throwable=");
            sbLIZ.append(this.throwable);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public Error(Throwable th) {
            this.throwable = th;
        }
    }

    public static final class Success<T> implements ApiState<T> {
        public final T data;

        public final Success<T> copy(T t) {
            return new Success<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.LJFF(this.data, ((Success) obj).data);
        }

        public int hashCode() {
            T t = this.data;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Success(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final T getData() {
            return this.data;
        }

        public Success(T t) {
            this.data = t;
        }
    }
}
