package com.ss.android.ugc.aweme.sidebar.components.list;

import X.C01GW;
import X.C1580780rEq;
import X.C1580810rEt;
import X.C19EG;
import X.C2211631BhB;
import X.C452501pT;
import X.C487280J9a;
import X.C724240Sb0;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarRowItemAssem extends SideBarItemAssem<C1580780rEq> {
    public ImageUrlModel LLJL;
    public ImageUrlModel LLJLIL;
    public SmartImageView LLJLILLLLZIIL;
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1141));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cdu;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        ((LinkedHashMap) sp()).clear();
        if (C724240Sb0.LIZ(this) != null) {
            C487280J9a.LIZJ((C1580810rEt) this.LLJLL.getValue());
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C2211631BhB.LJ(view, new AwS390S0200000_24(this, new AwS425S0200000_24(this, view, 42), 40));
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C487280J9a.LIZ(c19egLIZ.hashCode(), (C1580810rEt) this.LLJLL.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01b6  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sidebar.components.list.SideBarRowItemAssem.up(java.lang.Object):void");
    }
}
