package com.ss.android.ugc.aweme.msg.qrcode;

import X.C019F;
import X.C01GW;
import X.C0ZHB;
import X.C0ZVT;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AFwS317S0000000_29;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS573S0100000_29;
import wh6.AbS514S0200000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class AbstractQrGroupCreationAssem extends ReusedUISlotAssem<AbstractQrGroupCreationAssem> implements InterfaceC712990Rxx<C0ZVT> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final InterfaceC1731706qJ LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final AtomicBoolean LLJLLL;
    public final C01GW LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractQrGroupCreationAssem.class, "qrGroupCreationMessageVM", "getQrGroupCreationMessageVM()Lcom/ss/android/ugc/aweme/msg/qrcode/QRGroupCreationMessageVM;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AbstractQrGroupCreationAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QRGroupCreationMessageVM.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 1090), null, AFwS273S0000000_29.get$arr$(92));
        this.LLJLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 161));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 159));
        this.LLJLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 158));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 160));
        this.LLJLLL = new AtomicBoolean(false);
        this.LLJZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 157));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cjn;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final QRGroupCreationMessageVM op() {
        return (QRGroupCreationMessageVM) this.LLJL.getValue(this, LLJZIJLIL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        view.setTag(R.id.k__, C0ZHB.LAST_ITEM_FILL_BOTTOM);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.12Px
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1159300gH2) obj).LLILLJJLI);
            }
        }, C736820SvI.LIZLLL(), AFwS317S0000000_29.get$arr$(6), 4);
        C723830SaL.LIZ(this, null, new AwS380S0200000_14(this, view, 64));
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.12Q0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159300gH2) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS317S0000000_29.get$arr$(7), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0ZVT c0zvt) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            op().BQ2(((SessionInfo) this.LLJLIL.getValue()).getConversationId(), false, null);
            if (!this.LLJLLL.get()) {
                QRGroupCreationMessageVM qRGroupCreationMessageVMOp = op();
                qRGroupCreationMessageVMOp.getClass();
                QRGroupCreationMessageVM.AQ2(qRGroupCreationMessageVMOp, "show_group_chat_qr_code");
                this.LLJLLL.compareAndSet(false, true);
            }
            C786410Ut5.I7(new AbS514S0200000_29(this, c19egLIZ, 0), (View) this.LLJLILLLLZIIL.getValue());
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ZVT c0zvt) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ZVT c0zvt) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
