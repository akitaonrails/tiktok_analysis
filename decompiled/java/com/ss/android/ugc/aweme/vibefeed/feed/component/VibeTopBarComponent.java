package com.ss.android.ugc.aweme.vibefeed.feed.component;

import X.C01GW;
import X.C452501pT;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeTopBarComponent extends BasePanelUIComponent {
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 638));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1496));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1497));

    public final JSONObject Go() {
        return (JSONObject) this.LLJIJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r4) {
        /*
            r3 = this;
            super.onViewCreated(r4)
            android.view.View r1 = r3.LJJIJL()
            r0 = 2131398190(0x7f0a8e2e, float:1.841717E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L30
            X.01GW r0 = r3.LLJILJIL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "shared_feed_like_history"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3b
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L49
            r0 = 2131848002(0x7f116b42, float:1.9329497E38)
            java.lang.String r0 = r1.getString(r0)
        L2d:
            r2.setText(r0)
        L30:
            kotlin.jvm.internal.AwS603S0100000_24 r1 = new kotlin.jvm.internal.AwS603S0100000_24
            r0 = 393(0x189, float:5.51E-43)
            r1.<init>(r3, r0)
            X.C723850SaN.LIZLLL(r3, r1)
            return
        L3b:
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L49
            r0 = 2131847970(0x7f116b22, float:1.9329432E38)
            java.lang.String r0 = r1.getString(r0)
            goto L2d
        L49:
            r0 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vibefeed.feed.component.VibeTopBarComponent.onViewCreated(android.view.View):void");
    }
}
