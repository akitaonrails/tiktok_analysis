package com.ss.android.ugc.aweme.tako.arch.protocol;

import X.C019F;
import X.C01GW;
import X.C0HZQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C427660Gpo;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC689540R2y;
import X.InterfaceC712990Rxx;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import java.util.List;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public abstract class TakoBaseAssem<ITEM extends InterfaceC689540R2y> extends ReusedUISlotAssem<TakoBaseAssem<ITEM>> implements InterfaceC712990Rxx<ITEM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoBaseAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoBaseAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS571S0100000_27(c19719912DlLIZ, 633), AFwS269S0000000_27.get$arr$(153), null, true);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27((TakoBaseAssem) this, 628));
        this.LLJL = C452501pT.LIZIZ(new AwS571S0100000_27((TakoBaseAssem) this, 631));
        this.LLJLIL = C452501pT.LIZIZ(new AwS571S0100000_27((TakoBaseAssem) this, 634));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS571S0100000_27((TakoBaseAssem) this, 629));
        this.LLJLL = C452501pT.LIZIZ(new AwS571S0100000_27((TakoBaseAssem) this, 632));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS571S0100000_27((TakoBaseAssem) this, 630));
        this.LLJLLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(165));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ap, reason: merged with bridge method [inline-methods] */
    public void up(ITEM item) {
    }

    public abstract C0HZQ Bp();

    public abstract C427660Gpo sp();

    @Override // X.InterfaceC712990Rxx
    public void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final boolean tp() {
        return ((Boolean) this.LLJLLIL.getValue()).booleanValue();
    }

    public boolean up() {
        return ((Boolean) this.LLJLL.getValue()).booleanValue();
    }

    public final boolean yp() {
        return ((Boolean) this.LLJLLL.getValue()).booleanValue();
    }

    public final ITakoContextAbility zp() {
        return (ITakoContextAbility) this.LLJLIL.getValue();
    }

    public static final TakoChatUIAbility op(TakoBaseAssem takoBaseAssem) {
        return (TakoChatUIAbility) takoBaseAssem.LLJLILLLLZIIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[PHI: r8
      0x002d: PHI (r8v3 boolean) = (r8v0 boolean), (r8v4 boolean) binds: [B:39:0x008f, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092 A[PHI: r8
      0x0092: PHI (r8v1 boolean) = (r8v0 boolean), (r8v4 boolean), (r8v4 boolean), (r8v4 boolean) binds: [B:39:0x008f, B:8:0x001b, B:10:0x0025, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r11) {
        /*
            r10 = this;
            r5 = r10
            X.01GW r0 = r5.LLJL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r3 = 1
            if (r1 == 0) goto L88
            X.0HZQ r0 = r5.Bp()
            if (r0 == 0) goto L88
            r8 = 1
        L17:
            X.0Gpo r0 = r5.sp()
            if (r0 == 0) goto L92
            X.01GW r0 = r5.LLJLILLLLZIIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility r0 = (com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility) r0
            if (r0 == 0) goto L92
            boolean r0 = r0.Gx1()
            if (r0 != r3) goto L92
        L2d:
            r6 = 1
        L2e:
            if (r8 == 0) goto L39
            X.0HZQ r0 = r5.Bp()
            if (r0 == 0) goto L39
            X.C0DSB.LIZIZ(r0)
        L39:
            kotlin.jvm.internal.AwS10S0220000_27 r4 = new kotlin.jvm.internal.AwS10S0220000_27
            r9 = 0
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0 = 0
            X.C723830SaL.LIZ(r5, r0, r4)
            if (r8 == 0) goto L52
            Y.ARunnableS96S0200000_27 r2 = new Y.ARunnableS96S0200000_27
            r0 = 8
            r2.<init>(r7, r5, r0)
            r0 = 200(0xc8, double:9.9E-322)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r7, r2, r0)
        L52:
            boolean r0 = r5.up()
            if (r0 == 0) goto L83
            android.view.View r1 = r5.LJJIJL()
            r0 = 2131373330(0x7f0a2d12, float:1.8366748E38)
            android.view.View r2 = r1.findViewById(r0)
            com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility r0 = r5.zp()
            if (r0 == 0) goto L86
            boolean r0 = r0.T91()
            if (r0 != r3) goto L86
            r1 = 1
        L70:
            X.01GW r0 = r5.LLJLILLLLZIIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility r0 = (com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility) r0
            if (r0 == 0) goto L84
            boolean r0 = r0.Gx1()
            if (r0 != r3) goto L84
        L80:
            X.C1857750yRZ.LJIIIZ(r2, r1, r3)
        L83:
            return
        L84:
            r3 = 0
            goto L80
        L86:
            r1 = 0
            goto L70
        L88:
            r8 = 0
            if (r1 != 0) goto L17
            X.0Gpo r0 = r5.sp()
            if (r0 == 0) goto L92
            goto L2d
        L92:
            r6 = 0
            X.0Gpo r0 = r5.sp()
            if (r0 == 0) goto L2e
            X.C0DSB.LIZIZ(r0)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
