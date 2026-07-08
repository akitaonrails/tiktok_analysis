package com.google.protobuf;

import X.AbstractC19922812xG;
import X.AbstractC19925412xg;
import X.AbstractC19925812xk;
import X.AbstractC19927312xz;
import X.AbstractC19928912yF;
import X.AbstractC19932312yn;
import X.AbstractC19933212yw;
import X.AbstractC19933412yy;
import X.AbstractC19933512yz;
import X.AnonymousClass1301;
import X.C0WZX;
import X.C19917912wT;
import X.C19926312xp;
import X.C19926612xs;
import X.C19927612y2;
import X.C19932112yl;
import X.C19933612z0;
import X.C19934812zC;
import X.C19935812zM;
import X.C19939112zt;
import X.C19939212zu;
import X.C2188811AlT;
import X.C2204961BRm;
import X.EnumC19934512z9;
import X.EnumC19937812zg;
import X.InterfaceC19916512wF;
import X.InterfaceC19921012wy;
import X.InterfaceC19922412xC;
import X.InterfaceC19925712xj;
import X.InterfaceC19930912yZ;
import X.InterfaceC19931912yj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes31.dex */
public abstract class k0 extends AbstractC19932312yn implements Serializable {
    public static boolean alwaysUseFieldBuilders = false;
    public static final long serialVersionUID = 1;
    public C19927612y2 unknownFields;

    public abstract C19935812zM LJI();

    public Map<C19939112zt, Object> getAllFields() {
        return Collections.unmodifiableMap(getAllFieldsMutable(false));
    }

    public Map<C19939112zt, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(getAllFieldsMutable(true));
    }

    @Override // X.AbstractC19932312yn, X.InterfaceC19916512wF
    public abstract /* synthetic */ InterfaceC19930912yZ getDefaultInstanceForType();

    @Override // X.AbstractC19932312yn, X.InterfaceC19925612xi
    public abstract /* synthetic */ InterfaceC19931912yj newBuilderForType();

    @Override // X.AbstractC19932312yn, X.InterfaceC19925612xi
    public abstract /* synthetic */ InterfaceC19931912yj toBuilder();

    static {
        Logger.getLogger(k0.class.getName());
        alwaysUseFieldBuilders = false;
        new CopyOnWriteArraySet();
    }

    @Override // X.InterfaceC19925612xi
    public InterfaceC19925712xj<? extends k0> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // X.AbstractC19932312yn, X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLIZIZ = C19932112yl.LIZIZ(this, getAllFieldsRaw());
        this.LL = iLIZIZ;
        return iLIZIZ;
    }

    public Object writeReplace() {
        return new C19917912wT(this);
    }

    public k0() {
        this.unknownFields = C19927612y2.LLILLJJLI;
    }

    @Override // X.InterfaceC19933112yv
    public AnonymousClass1301 getDescriptorForType() {
        return LJI().LIZ;
    }

    @Override // X.AbstractC19932312yn, X.InterfaceC19916512wF
    public boolean isInitialized() {
        for (C19939112zt c19939112zt : getDescriptorForType().LJIJJ()) {
            if (c19939112zt.LJJIJ() && !hasField(c19939112zt)) {
                return false;
            }
            if (c19939112zt.LJIJJ() == EnumC19937812zg.MESSAGE) {
                if (c19939112zt.LJJLJ()) {
                    Iterator it2 = ((List) getField(c19939112zt)).iterator();
                    while (it2.hasNext()) {
                        if (!((InterfaceC19916512wF) it2.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(c19939112zt) && !((InterfaceC19916512wF) getField(c19939112zt)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC19933112yv
    public C19927612y2 getUnknownFields() {
        return this.unknownFields;
    }

    public k0(AbstractC19933512yz<?> abstractC19933512yz) {
        this.unknownFields = abstractC19933512yz.getUnknownFields();
    }

    public static int LJFF(Object obj) {
        if (obj instanceof String) {
            return AbstractC19928912yF.LJIIJJI((String) obj);
        }
        return AbstractC19928912yF.LIZLLL((AbstractC19922812xG) obj);
    }

    public static InterfaceC19921012wy LJII(InterfaceC19922412xC interfaceC19922412xC) {
        int i;
        int size = interfaceC19922412xC.size();
        if (size < 0 || (i = size * 2) <= 0) {
            i = 10;
        }
        return interfaceC19922412xC.LJIILL2(i);
    }

    public static <MessageT extends AbstractC19933412yy<MessageT>, T> AbstractC19933212yw<MessageT, T> checkNotLite(AbstractC19925412xg<? extends MessageT, T> abstractC19925412xg) {
        if (!abstractC19925412xg.LIZ()) {
            return (AbstractC19933212yw) abstractC19925412xg;
        }
        throw new IllegalArgumentException("Expected non-lite extension.");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<X.C19939112zt, java.lang.Object> getAllFieldsMutable(boolean r7) {
        /*
            r6 = this;
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>()
            X.12zM r0 = r6.LJI()
            X.1301 r0 = r0.LIZ
            java.util.List r3 = r0.LJIJJ()
            r2 = 0
        L10:
            int r0 = r3.size()
            if (r2 >= r0) goto L70
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r2)
            X.12zt r5 = (X.C19939112zt) r5
            X.12zu r1 = r5.LLJILJIL
            if (r1 == 0) goto L53
            int r0 = r1.LLILZLL
            int r0 = r0 + (-1)
            int r2 = r2 + r0
            boolean r0 = r6.hasOneof(r1)
            if (r0 == 0) goto L48
            X.12zt r5 = r6.getOneofFieldDescriptor(r1)
        L2f:
            if (r7 == 0) goto L4b
            X.12zg r1 = r5.LJIJJ()
            X.12zg r0 = X.EnumC19937812zg.STRING
            if (r1 != r0) goto L4b
            X.12zM r0 = r6.LJI()
            X.12z1 r0 = r0.LIZIZ(r5)
            java.lang.Object r0 = r0.LJIIIZ(r6)
            r4.put(r5, r0)
        L48:
            int r2 = r2 + 1
            goto L10
        L4b:
            java.lang.Object r0 = r6.getField(r5)
            r4.put(r5, r0)
            goto L48
        L53:
            boolean r0 = r5.LJJLJ()
            if (r0 == 0) goto L69
            java.lang.Object r1 = r6.getField(r5)
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L48
            r4.put(r5, r1)
            goto L48
        L69:
            boolean r0 = r6.hasField(r5)
            if (r0 != 0) goto L2f
            goto L48
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k0.getAllFieldsMutable(boolean):java.util.Map");
    }

    public Object getField(C19939112zt c19939112zt) {
        return LJI().LIZIZ(c19939112zt).LIZIZ(this);
    }

    @Override // X.AbstractC19932312yn
    public C19939112zt getOneofFieldDescriptor(C19939212zu c19939212zu) {
        return LJI().LIZJ(c19939212zu).LIZIZ(this);
    }

    public int getRepeatedFieldCount(C19939112zt c19939112zt) {
        return LJI().LIZIZ(c19939112zt).LJ(this);
    }

    public boolean hasField(C19939112zt c19939112zt) {
        return LJI().LIZIZ(c19939112zt).LIZJ(this);
    }

    @Override // X.AbstractC19932312yn
    public boolean hasOneof(C19939212zu c19939212zu) {
        return LJI().LIZJ(c19939212zu).LIZJ(this);
    }

    @Override // X.AbstractC19932312yn, X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        C19932112yl.LJ(this, getAllFieldsRaw(), abstractC19928912yF);
    }

    public static int LJ(int i, Object obj) {
        if (obj instanceof String) {
            return AbstractC19928912yF.LJIIL(i) + AbstractC19928912yF.LJIIJJI((String) obj);
        }
        return AbstractC19928912yF.LIZJ(i, (AbstractC19922812xG) obj);
    }

    public static InterfaceC19930912yZ LJIIIIZZ(AbstractC19925812xk abstractC19925812xk, InputStream inputStream) throws IOException {
        try {
            return (InterfaceC19930912yZ) abstractC19925812xk.LIZLLL(inputStream);
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            throw e.unwrapIOException();
        }
    }

    public static InterfaceC19930912yZ LJIIJ(AbstractC19925812xk abstractC19925812xk, AbstractC19927312xz abstractC19927312xz) throws IOException {
        try {
            return (InterfaceC19930912yZ) abstractC19925812xk.LJII(abstractC19927312xz);
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            throw e.unwrapIOException();
        }
    }

    public static InterfaceC19930912yZ LJIIL(AbstractC19925812xk abstractC19925812xk, InputStream inputStream) throws IOException {
        try {
            return (InterfaceC19930912yZ) abstractC19925812xk.LJIIIIZZ(inputStream);
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            throw e.unwrapIOException();
        }
    }

    public static <ContainingT extends InterfaceC19930912yZ, T> C19933612z0<ContainingT, T> newFileScopedGeneratedExtension(Class<?> cls, InterfaceC19930912yZ interfaceC19930912yZ) {
        return new C19933612z0<>(null, cls, interfaceC19930912yZ, EnumC19934512z9.IMMUTABLE);
    }

    public Object getRepeatedField(C19939112zt c19939112zt, int i) {
        return LJI().LIZIZ(c19939112zt).LJFF(this, i);
    }

    public static InterfaceC19930912yZ LJIIIZ(AbstractC19925812xk abstractC19925812xk, InputStream inputStream, C19926312xp c19926312xp) throws IOException {
        try {
            return (InterfaceC19930912yZ) abstractC19925812xk.LJ(inputStream, c19926312xp);
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            throw e.unwrapIOException();
        }
    }

    public static InterfaceC19930912yZ LJIIJJI(AbstractC19925812xk abstractC19925812xk, AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws IOException {
        try {
            return (InterfaceC19930912yZ) abstractC19925812xk.LJIIL(abstractC19927312xz, c19926312xp);
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            throw e.unwrapIOException();
        }
    }

    public static InterfaceC19930912yZ LJIILIIL(AbstractC19925812xk abstractC19925812xk, InputStream inputStream, C19926312xp c19926312xp) throws IOException {
        try {
            return (InterfaceC19930912yZ) abstractC19925812xk.LJIILIIL(inputStream, c19926312xp);
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            throw e.unwrapIOException();
        }
    }

    public static void LJIILJJIL(AbstractC19928912yF abstractC19928912yF, int i, Object obj) {
        if (obj instanceof String) {
            abstractC19928912yF.LJJIJ(i, (String) obj);
        } else {
            abstractC19928912yF.LJIJI(i, (AbstractC19922812xG) obj);
        }
    }

    public static Method getMethodOrDie(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Generated message class \"");
            sbLIZ.append(cls.getName());
            sbLIZ.append("\" missing method \"");
            sbLIZ.append(str);
            sbLIZ.append("\".");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) throws Throwable {
        try {
            return C2204961BRm.a0(method, obj, objArr, new C0WZX("dzBzEgU1UM3QUBkxVx2QaW1CwM1G8aMcweyw5vpI4YvFYgRj", null));
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw new IllegalStateException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <ContainingT extends InterfaceC19930912yZ, T> C19933612z0<ContainingT, T> newMessageScopedGeneratedExtension(InterfaceC19930912yZ interfaceC19930912yZ, int i, Class<?> cls, InterfaceC19930912yZ interfaceC19930912yZ2) {
        return new C19933612z0<>(new C19934812zC(interfaceC19930912yZ, i), cls, interfaceC19930912yZ2, EnumC19934512z9.IMMUTABLE);
    }
}
