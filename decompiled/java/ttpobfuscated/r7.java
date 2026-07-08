package ttpobfuscated;

import X.C13LP;
import X.C1507240pKE;
import X.C1697810uHb;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.List;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class r7 implements p7 {
    public final ByteBuffer a;
    public final s b;
    public final ad<Request> c;

    @Override // ttpobfuscated.p7
    public boolean a() {
        return this.a.hasRemaining();
    }

    @Override // ttpobfuscated.p7
    public int b() {
        return this.a.limit();
    }

    @Override // ttpobfuscated.p7
    public int c() {
        return this.a.position();
    }

    @Override // ttpobfuscated.p7
    public o7 a(Integer num) throws pa {
        int iPosition;
        if (num != null) {
            iPosition = num.intValue();
        } else {
            iPosition = this.a.position();
        }
        b(iPosition);
        this.a.position(iPosition);
        IntBuffer intBufferAsIntBuffer = z.a(this.a, (Integer) null, 24, false, 5, (Object) null).asIntBuffer();
        List<C1507240pKE> listLJIIJJI = C1697810uHb.LJIIJJI(new C1507240pKE(intBufferAsIntBuffer.get()), new C1507240pKE(intBufferAsIntBuffer.get()), new C1507240pKE(intBufferAsIntBuffer.get()), new C1507240pKE(intBufferAsIntBuffer.get()), new C1507240pKE(intBufferAsIntBuffer.get()), new C1507240pKE(intBufferAsIntBuffer.get()));
        int i = (((C1507240pKE) C13LP.LJJJJZI(listLJIIJJI)).LL & 67043328) >>> 16;
        ha haVarA = ha.b.a(i);
        if (haVarA != null) {
            return ua.a.b().d().a(haVarA, listLJIIJJI, this.b, this.c);
        }
        throw new pa("Unknown OpCode [" + ((Object) C1507240pKE.LIZJ(i)) + ']');
    }

    public final void b(int i) throws pa {
        if (i + 24 <= this.a.limit()) {
            return;
        }
        throw new pa("Instruction offset [" + i + "] is invalid for limit [" + this.a.limit() + ']');
    }

    @Override // ttpobfuscated.p7
    public void a(int i) {
        this.a.position(i);
    }

    public r7(ByteBuffer byteBuffer, s sVar, ad<Request> adVar) {
        this.a = byteBuffer;
        this.b = sVar;
        this.c = adVar;
    }
}
