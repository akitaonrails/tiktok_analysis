package com.squareup.wire;

import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes24.dex */
public final class FieldBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> {
    public final String LIZ;
    public final String LIZIZ;
    public final Field LIZJ;
    public final Field LIZLLL;
    public final Method LJ;
    public ProtoAdapter<?> LJFF;
    public ProtoAdapter<?> LJI;
    public ProtoAdapter<Object> LJII;
    public final WireField.Label label;
    public final String name;
    public final boolean redacted;
    public final int tag;

    public final ProtoAdapter<Object> LIZ() {
        ProtoAdapter<Object> protoAdapter = this.LJII;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        if (!(!this.LIZ.isEmpty())) {
            ProtoAdapter<?> protoAdapterWithLabel = LJ().withLabel(this.label);
            this.LJII = protoAdapterWithLabel;
            return protoAdapterWithLabel;
        }
        ProtoAdapter<?> protoAdapter2 = this.LJI;
        if (protoAdapter2 == null) {
            protoAdapter2 = ProtoAdapter.get(this.LIZ);
            this.LJI = protoAdapter2;
        }
        ProtoAdapter<Object> protoAdapterNewMapAdapter = ProtoAdapter.newMapAdapter(protoAdapter2, LJ());
        this.LJII = protoAdapterNewMapAdapter;
        return protoAdapterNewMapAdapter;
    }

    public final ProtoAdapter<?> LJ() {
        ProtoAdapter<?> protoAdapter = this.LJFF;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapter2 = ProtoAdapter.get(this.LIZIZ);
        this.LJFF = protoAdapter2;
        return protoAdapter2;
    }

    public final Object LIZIZ(M m) {
        try {
            return this.LIZJ.get(m);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }

    public final Object LIZJ(B b) {
        try {
            return this.LIZLLL.get(b);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }

    public final void LIZLLL(B b, Object obj) {
        try {
            WireField.Label label = this.label;
            label.getClass();
            if (label == WireField.Label.ONE_OF) {
                C2204961BRm.a0(this.LJ, b, new Object[]{obj}, new C0WZX("dzBzEhErSsvOUEIxCwWNdMpcTJMDRulGQp9Ozuwl", null));
            } else {
                this.LIZLLL.set(b, obj);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }

    public FieldBinding(WireField wireField, Field field, Class<B> cls) {
        this.label = wireField.label();
        String name = field.getName();
        this.name = name;
        this.tag = wireField.tag();
        this.LIZ = wireField.keyAdapter();
        this.LIZIZ = wireField.adapter();
        this.redacted = wireField.redacted();
        this.LIZJ = field;
        try {
            this.LIZLLL = cls.getField(name);
            Class<?> type = field.getType();
            try {
                this.LJ = cls.getMethod(name, type);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("No builder method ");
                sbLIZ.append(cls.getName());
                sbLIZ.append(e3.d);
                sbLIZ.append(name);
                sbLIZ.append(e3.h);
                sbLIZ.append(type.getName());
                sbLIZ.append(")");
                throw new AssertionError(C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("No builder field ");
            sbLIZ2.append(cls.getName());
            sbLIZ2.append(e3.d);
            sbLIZ2.append(name);
            throw new AssertionError(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
