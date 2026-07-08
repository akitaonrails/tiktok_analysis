package ttpobfuscated;

import X.C13LQ;
import X.C15438062q;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class qa implements xc {
    public static final a c = new a();
    public final ByteBuffer a;
    public final byte b;

    public static final class a {
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g3.values().length];
            try {
                iArr[g3.Null.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[g3.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[g3.Int32.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[g3.Float.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                iArr[g3.String.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                iArr[g3.ArrayOfBooleans.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                iArr[g3.ArrayOfInt32s.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                iArr[g3.ArrayOfFloats.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                iArr[g3.ArrayOfStrings.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            a = iArr;
        }
    }

    @Override // ttpobfuscated.xc
    public byte a() {
        return this.b;
    }

    public qa(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.b = (byte) Math.ceil(((double) byteBuffer.limit()) / ((double) 4194304));
    }

    @Override // ttpobfuscated.xc
    public ByteBuffer a(byte b2) throws pa {
        if (b2 >= 0 && b2 < this.b) {
            int i = b2 * 4194304;
            if (i <= this.a.limit()) {
                return z.a(this.a, Integer.valueOf(i), Math.min(this.a.limit() - i, 4194304), false, 4, (Object) null);
            }
            throw new pa("Data table start [" + i + "] is out of bounds [" + this.a.limit() + ']');
        }
        throw new pa("Data table index [" + ((int) b2) + "] is out of bounds [0, " + ((int) this.b) + ')');
    }

    @Override // ttpobfuscated.xc
    public Object a(int i, byte b2, g3 g3Var) {
        int i2 = b.a[g3Var.ordinal()];
        boolean z = true;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return a(a(b2), i, b2, g3Var);
                    }
                    ByteBuffer byteBufferOrder = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder.putInt(i);
                    byteBufferOrder.position(0);
                    return Float.valueOf(byteBufferOrder.getFloat());
                }
                return Integer.valueOf(i);
            }
            if (i != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return g3.Null;
    }

    public final Object a(ByteBuffer byteBuffer, int i, byte b2, g3 g3Var) throws pa {
        switch (b.a[g3Var.ordinal()]) {
            case 5:
                return z.a(byteBuffer, i, b2, (Charset) null, 4, (Object) null);
            case 6:
                List<Integer> listA = z.a(byteBuffer, i, b2);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listA, 10));
                Iterator<Integer> it2 = listA.iterator();
                while (it2.hasNext()) {
                    boolean z = true;
                    if (it2.next().intValue() != 1) {
                        z = false;
                    }
                    arrayList.add(Boolean.valueOf(z));
                }
                return arrayList;
            case 7:
                return z.a(byteBuffer, i, b2);
            case 8:
                int iA = f3.a(i);
                float[] fArr = new float[iA];
                z.a(byteBuffer, Integer.valueOf(f3.a(i, b2)), iA * 4, false, 4, (Object) null).asFloatBuffer().get(fArr);
                return C13LQ.LJJLIL(fArr);
            case BdTuring.TYPE_ECAF /* 9 */:
                List<Integer> listA2 = z.a(byteBuffer, i, b2);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listA2, 10));
                Iterator<Integer> it3 = listA2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(z.a(byteBuffer, it3.next().intValue(), b2, (Charset) null, 4, (Object) null));
                }
                return arrayList2;
            default:
                throw new pa("Unhandled data type [" + g3Var + ']');
        }
    }
}
