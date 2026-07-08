package kotlinx.coroutines.flow;

import X.AbstractC23133094p;
import X.AnonymousClass0954;
import X.C094D;
import X.C094X;
import X.C095B;
import X.C099R;
import X.C2188811AlT;
import X.C23271099x;
import X.EnumC2252401DDy;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ChannelAsFlow<T> extends AbstractC23133094p<T> {
    public static final AtomicIntegerFieldUpdater consumed$FU = AtomicIntegerFieldUpdater.newUpdater(ChannelAsFlow.class, "consumed");
    public final AnonymousClass0954<T> channel;
    public final boolean consume;
    public volatile int consumed;

    private final void markConsumed() {
        if (!this.consume || consumed$FU.getAndSet(this, 1) == 0) {
            return;
        }
        "ReceiveChannel.consumeAsFlow can be collected just once".toString();
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC23133094p
    public InterfaceC346201Wa<T> dropChannelOperators() {
        return new ChannelAsFlow(this.channel, this.consume, null, 0, 0 == true ? 1 : 0, 28, 0 == true ? 1 : 0);
    }

    @Override // X.AbstractC23133094p
    public String additionalToStringProps() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("channel=");
        sbLIZ.append(this.channel);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC23133094p
    public AnonymousClass0954<T> produceImpl(InterfaceC497601wk interfaceC497601wk) {
        markConsumed();
        if (this.capacity == -3) {
            return this.channel;
        }
        return super.produceImpl(interfaceC497601wk);
    }

    @Override // X.AbstractC23133094p, X.InterfaceC346201Wa
    public Object collect(InterfaceC346701Wf<? super T> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        if (this.capacity == -3) {
            markConsumed();
            Object objLIZ = C095B.LIZ(interfaceC346701Wf, this.channel, this.consume, interfaceC1364105Vn);
            if (objLIZ == C099R.LJFF()) {
                return objLIZ;
            }
            return Unit.LIZ;
        }
        Object objCollect = super.collect(interfaceC346701Wf, interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    @Override // X.AbstractC23133094p
    public Object collectTo(C094D<? super T> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLIZ = C095B.LIZ(new C094X(c094d), this.channel, this.consume, interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    @Override // X.AbstractC23133094p
    public AbstractC23133094p<T> create(CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        return new ChannelAsFlow(this.channel, this.consume, coroutineContext, i, enumC2252401DDy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelAsFlow(AnonymousClass0954<? extends T> anonymousClass0954, boolean z, CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        super(coroutineContext, i, enumC2252401DDy);
        this.channel = anonymousClass0954;
        this.consume = z;
    }

    public /* synthetic */ ChannelAsFlow(AnonymousClass0954 anonymousClass0954, boolean z, CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(anonymousClass0954, z, (i2 & 4) != 0 ? C23271099x.INSTANCE : coroutineContext, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? EnumC2252401DDy.SUSPEND : enumC2252401DDy);
    }
}
