package com.tiktok.forestx.builtin.processor;

import X.AbstractC1532320pyg;
import X.AbstractC1532350pyj;
import X.AbstractC830440Whu;
import X.C01GW;
import X.C1519970pel;
import X.C1531760pxm;
import X.C1532170pyR;
import X.C1532340pyi;
import X.C1532470pyv;
import X.C1532680pzG;
import X.C1532710pzJ;
import X.C452501pT;
import X.C830460Whw;
import X.InterfaceC1532800pzS;
import Y.ARunnableS113S0100000_13;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
@InterfaceC1532800pzS(inputClass = File.class, outputClass = ByteBuffer.class)
public final class File2BufferProcessor extends AbstractC1532320pyg<File, ByteBuffer> {
    public static final C830460Whw LJI = new C830460Whw();
    public static final C01GW<File2BufferProcessor> LJII = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(199));
    public final AbstractC830440Whu LIZJ;
    public final String LIZLLL;
    public final ConcurrentHashMap<PhantomReference<ByteBuffer>, Long> LJ;
    public final ReferenceQueue<ByteBuffer> LJFF;

    public static final native void freeMemory(long j);

    public static final native long[] readFileToNativeMemory(String str);

    @Override // X.InterfaceC1532520pz0
    public final boolean LIZ() {
        return false;
    }

    @Override // X.AbstractC1532320pyg
    public final int LJI() {
        C1532680pzG.LIZ.getClass();
        return C1532680pzG.LJIIL ? 3 : 100;
    }

    @Override // X.AbstractC1532320pyg, X.InterfaceC1532520pz0
    public final boolean LJFF() {
        return !C1531760pxm.LIZ();
    }

    @Override // X.InterfaceC1532520pz0
    public final String getName() {
        return this.LIZLLL;
    }

    public File2BufferProcessor(AbstractC830440Whu abstractC830440Whu, String str) {
        super(File.class, ByteBuffer.class);
        this.LIZJ = abstractC830440Whu;
        this.LIZLLL = str;
        this.LJ = new ConcurrentHashMap<>();
        this.LJFF = new ReferenceQueue<>();
        new BPEAThread(new ARunnableS113S0100000_13(this, 137)).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1532320pyg
    public final void LJII(C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, AbstractC1532350pyj abstractC1532350pyj, C1532340pyi c1532340pyi, Function1 function1) {
        try {
            Pair<ByteBuffer, Long> pairLIZ = this.LIZJ.LIZ(((File) abstractC1532350pyj.LIZ).getAbsolutePath());
            if (pairLIZ == null) {
                function1.invoke(null);
                return;
            }
            ByteBuffer first = pairLIZ.getFirst();
            long jLongValue = pairLIZ.getSecond().longValue();
            this.LJ.put(new PhantomReference<>(first, this.LJFF), Long.valueOf(jLongValue));
            function1.invoke(new C1532340pyi(new C1519970pel(first), null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            c1532470pyv.LIZIZ(0, message);
            function1.invoke(null);
        }
    }
}
