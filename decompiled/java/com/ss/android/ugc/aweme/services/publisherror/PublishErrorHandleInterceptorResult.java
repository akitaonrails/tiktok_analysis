package com.ss.android.ugc.aweme.services.publisherror;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class PublishErrorHandleInterceptorResult {

    public static final class Pass extends PublishErrorHandleInterceptorResult {
        public static final Pass INSTANCE = new Pass();
    }

    public static final class Resolved extends PublishErrorHandleInterceptorResult {
        public final ResolvedPublishErrorHandle handle;

        public final Resolved copy(ResolvedPublishErrorHandle resolvedPublishErrorHandle) {
            return new Resolved(resolvedPublishErrorHandle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resolved) && Intrinsics.LJFF(this.handle, ((Resolved) obj).handle);
        }

        public int hashCode() {
            return this.handle.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Resolved(handle=");
            sbLIZ.append(this.handle);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final ResolvedPublishErrorHandle getHandle() {
            return this.handle;
        }

        public Resolved(ResolvedPublishErrorHandle resolvedPublishErrorHandle) {
            this.handle = resolvedPublishErrorHandle;
        }
    }
}
