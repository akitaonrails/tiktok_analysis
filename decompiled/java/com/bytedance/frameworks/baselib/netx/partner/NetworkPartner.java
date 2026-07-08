package com.bytedance.frameworks.baselib.netx.partner;

import X.C0X52;
import X.C0XM9;
import X.C0XS7;
import X.C1499330p7T;
import com.bytedance.retrofit2.client.Request;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public interface NetworkPartner {

    public interface Blocker extends NetworkPartner {
        C0X52<?> LIZJ(C0XM9 c0xm9, C1499330p7T c1499330p7T);

        C0X52<?> LJFF(C0XM9 c0xm9, C1499330p7T c1499330p7T);
    }

    public static final class BlockerProxy implements Blocker {
        public final Blocker LIZ;
        public final Function0<Boolean> LIZIZ;

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
        public final C0X52<?> LIZJ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
            return this.LIZ.LIZJ(c0xm9, c1499330p7T);
        }

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
        public final C0X52<?> LJFF(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
            return this.LIZ.LJFF(c0xm9, c1499330p7T);
        }

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
        public final String LJII() {
            return this.LIZ.LJII();
        }

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
        public final boolean enable() {
            return this.LIZIZ.invoke().booleanValue();
        }

        public BlockerProxy(Blocker blocker, Function0<Boolean> function0) {
            this.LIZ = blocker;
            this.LIZIZ = function0;
        }
    }

    public interface Bystander extends NetworkPartner {
        void LIZLLL(C0X52<?> c0x52);

        void LJI(Request request);

        void LJIIJ(Request request);

        void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th);

        void onException(Throwable th);
    }

    public static final class BystanderProxy implements Bystander {
        public final Bystander LIZ;
        public final Function0<Boolean> LIZIZ;

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
        public final void LIZLLL(C0X52<?> c0x52) {
            this.LIZ.LIZLLL(c0x52);
        }

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
        public final void LJI(Request request) {
            this.LIZ.LJI(request);
        }

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
        public final void LJIIJ(Request request) {
            this.LIZ.LJIIJ(request);
        }

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
        public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
            this.LIZ.LJIIJJI(request, c0x52, th);
        }

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
        public final void onException(Throwable th) {
            this.LIZ.onException(th);
        }

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
        public final boolean enable() {
            return this.LIZIZ.invoke().booleanValue();
        }

        public BystanderProxy(Bystander bystander, Function0<Boolean> function0) {
            this.LIZ = bystander;
            this.LIZIZ = function0;
        }
    }

    public interface ExceptionHandler extends NetworkPartner {
        boolean LJIIIZ(C0XM9 c0xm9, C1499330p7T c1499330p7T, Throwable th, int i, boolean z);
    }

    public static final class ExceptionHandlerProxy implements ExceptionHandler {
        public final ExceptionHandler LIZ;
        public final Function0<Boolean> LIZIZ;

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
        public final String LJII() {
            return this.LIZ.LJII();
        }

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ExceptionHandler
        public final boolean LJIIIZ(C0XM9 c0xm9, C1499330p7T c1499330p7T, Throwable th, int i, boolean z) {
            return this.LIZ.LJIIIZ(c0xm9, c1499330p7T, th, i, z);
        }

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
        public final boolean enable() {
            return this.LIZIZ.invoke().booleanValue();
        }

        public ExceptionHandlerProxy(ExceptionHandler exceptionHandler, Function0<Boolean> function0) {
            this.LIZ = exceptionHandler;
            this.LIZIZ = function0;
        }
    }

    public interface RequestHandler extends NetworkPartner {
        void LJIIIIZZ(C0XM9 c0xm9, C1499330p7T c1499330p7T);
    }

    public static final class RequestHandlerProxy implements RequestHandler {
        public final RequestHandler LIZ;
        public final Function0<Boolean> LIZIZ;

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
        public final String LJII() {
            return this.LIZ.LJII();
        }

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.RequestHandler
        public final void LJIIIIZZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
            this.LIZ.LJIIIIZZ(c0xm9, c1499330p7T);
        }

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
        public final boolean enable() {
            return this.LIZIZ.invoke().booleanValue();
        }

        public RequestHandlerProxy(RequestHandler requestHandler, Function0<Boolean> function0) {
            this.LIZ = requestHandler;
            this.LIZIZ = function0;
        }
    }

    public interface ResponseHandler extends NetworkPartner {
        void LIZ(C0XS7<?> c0xs7, C1499330p7T c1499330p7T);
    }

    public static final class ResponseHandlerProxy implements ResponseHandler {
        public final ResponseHandler LIZ;
        public final Function0<Boolean> LIZIZ;

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ResponseHandler
        public final void LIZ(C0XS7<?> c0xs7, C1499330p7T c1499330p7T) {
            this.LIZ.LIZ(c0xs7, c1499330p7T);
        }

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
        public final String LJII() {
            return this.LIZ.LJII();
        }

        @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
        public final boolean enable() {
            return this.LIZIZ.invoke().booleanValue();
        }

        public ResponseHandlerProxy(ResponseHandler responseHandler, Function0<Boolean> function0) {
            this.LIZ = responseHandler;
            this.LIZIZ = function0;
        }
    }

    String LJII();

    boolean enable();
}
