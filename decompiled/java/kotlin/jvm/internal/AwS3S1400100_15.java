package kotlin.jvm.internal;

import X.C09AY;
import X.C956380azk;
import X.C958040b2Q;
import X.C981480beE;
import X.InterfaceC954180awC;
import X.InterfaceC958070b2T;
import X.InterfaceC967450bHb;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS3S1400100_15 extends C09AY implements Function0 {
    public final int $t;
    public long j5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S1400100_15 awS3S1400100_15) {
        InterfaceC958070b2T interfaceC958070b2TLLJJ = ((InterfaceC954180awC) awS3S1400100_15.l1).LLJJ();
        List list = (List) awS3S1400100_15.l2;
        final InterfaceC954180awC interfaceC954180awC = (InterfaceC954180awC) awS3S1400100_15.l1;
        interfaceC958070b2TLLJJ.LJJJJJ(list, new InterfaceC967450bHb() { // from class: X.0aX4
            @Override // X.InterfaceC967500bHg
            public final void LJIIL() {
            }

            @Override // X.InterfaceC967500bHg
            public final void LJIILJJIL(int i, C967130bH5 c967130bH5) {
            }

            @Override // X.InterfaceC967500bHg
            public final void LJIILLIIL(List<LinkUser> list2, List<LinkUser> list3) {
            }

            @Override // X.InterfaceC967450bHb
            public final void LJJIIJ(List<LinkUser> list2, List<LinkUser> list3) {
            }

            @Override // X.InterfaceC967450bHb
            public final void LJJJJZ(List<LinkUser> list2, List<LinkUser> list3) {
            }

            @Override // X.InterfaceC967450bHb
            public final void LJJJJZI(List<LinkUser> list2) {
            }

            @Override // X.InterfaceC967450bHb
            public final void LJJJLL(List<LinkUser> list2) {
            }

            @Override // X.InterfaceC967450bHb
            public final void LJJJLZIJ(LinkUser linkUser) {
            }

            @Override // X.InterfaceC967450bHb
            public final void LJJL() {
                if (interfaceC954180awC.LJJJLIIL() == EnumC952680atm.SINGLE_VIEWMODE) {
                    interfaceC954180awC.LLIIJLIL().LJLJJL(null);
                }
            }
        });
        C958040b2Q.LJIIL(awS3S1400100_15.s0, (C981480beE) awS3S1400100_15.l4, awS3S1400100_15.j5, true);
        DataChannel dataChannel = (DataChannel) awS3S1400100_15.l3;
        if (dataChannel != null) {
            dataChannel.zW(LinkCrossRoomStateChangeEvent.class, new C956380azk(7, "other_perform"));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S1400100_15 awS3S1400100_15) {
        InterfaceC958070b2T interfaceC958070b2TLLJJ = ((InterfaceC954180awC) awS3S1400100_15.l1).LLJJ();
        List list = (List) awS3S1400100_15.l2;
        final InterfaceC954180awC interfaceC954180awC = (InterfaceC954180awC) awS3S1400100_15.l1;
        interfaceC958070b2TLLJJ.LJJJJJ(list, new InterfaceC967450bHb() { // from class: X.0aX5
            @Override // X.InterfaceC967500bHg
            public final void LJIIL() {
            }

            @Override // X.InterfaceC967500bHg
            public final void LJIILJJIL(int i, C967130bH5 c967130bH5) {
            }

            @Override // X.InterfaceC967500bHg
            public final void LJIILLIIL(List<LinkUser> list2, List<LinkUser> list3) {
            }

            @Override // X.InterfaceC967450bHb
            public final void LJJIIJ(List<LinkUser> list2, List<LinkUser> list3) {
            }

            @Override // X.InterfaceC967450bHb
            public final void LJJJJZ(List<LinkUser> list2, List<LinkUser> list3) {
            }

            @Override // X.InterfaceC967450bHb
            public final void LJJJJZI(List<LinkUser> list2) {
            }

            @Override // X.InterfaceC967450bHb
            public final void LJJJLL(List<LinkUser> list2) {
            }

            @Override // X.InterfaceC967450bHb
            public final void LJJJLZIJ(LinkUser linkUser) {
            }

            @Override // X.InterfaceC967450bHb
            public final void LJJL() {
                if (interfaceC954180awC.LJJJLIIL() == EnumC952680atm.SINGLE_VIEWMODE) {
                    interfaceC954180awC.LLIIJLIL().LJLJJL(null);
                }
            }
        });
        C958040b2Q.LJIIL(awS3S1400100_15.s0, (C981480beE) awS3S1400100_15.l4, awS3S1400100_15.j5, true);
        DataChannel dataChannel = (DataChannel) awS3S1400100_15.l3;
        if (dataChannel != null) {
            dataChannel.zW(LinkCrossRoomStateChangeEvent.class, new C956380azk(8, "self_perform"));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0000: IPUT (r10 I:int), (r2 I:kotlin.jvm.internal.AwS3S1400100_15) (LINE:117440512) kotlin.jvm.internal.AwS3S1400100_15.$t int, block:B:2:0x0000 */
    public AwS3S1400100_15(InterfaceC954180awC interfaceC954180awC, InterfaceC954180awC interfaceC954180awC2, List<LinkUser> list, String str, DataChannel dataChannel, C981480beE c981480beE, long j) {
        int i;
        super(0);
        this.$t = i;
        this.l1 = interfaceC954180awC;
        this.l2 = interfaceC954180awC2;
        this.s0 = list;
        this.l3 = str;
        this.l4 = dataChannel;
        this.j5 = c981480beE;
    }
}
