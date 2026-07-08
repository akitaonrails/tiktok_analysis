package com.ss.android.ugc.aweme.msg;

import X.C01GW;
import X.C06XR;
import X.C1559260qg8;
import X.C2241931Cox;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;
import wh6.AbS695S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class AwemeCardCenterAssem extends ReusedUISlotAssem<AwemeCardCenterAssem> implements InterfaceC712990Rxx<C06XR> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ciy;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final SmartImageView op() {
        return (SmartImageView) this.LLJLIL.getValue();
    }

    public final String sp() {
        VideoCoverComponent videoCoverComponent;
        C724270Sb3 c724270Sb3 = this.LLJI;
        AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) C2241931Cox.LIZJ(((C06XR) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLJJLI, AwemeCardTemplate.class);
        if (awemeCardTemplate == null || (videoCoverComponent = awemeCardTemplate.baseVideoComponent) == null) {
            return null;
        }
        return videoCoverComponent.id;
    }

    public AwemeCardCenterAssem() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJL = C452501pT.LIZ(enumC452301pR, new AwS558S0100000_14(this, 1073));
        this.LLJLIL = C452501pT.LIZ(enumC452301pR, new AwS558S0100000_14(this, 1074));
        this.LLJLILLLLZIIL = C452501pT.LIZ(enumC452301pR, new AwS558S0100000_14(this, 1075));
        this.LLJLL = C452501pT.LIZ(enumC452301pR, new AwS558S0100000_14(this, 1076));
        this.LLJLLIL = C452501pT.LIZ(enumC452301pR, new AwS558S0100000_14(this, 1077));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new AbS695S0100000_14(this, 5), op());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0173  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C06XR r17) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.msg.AwemeCardCenterAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C06XR c06xr) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C06XR c06xr) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
