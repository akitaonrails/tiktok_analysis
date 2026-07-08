package com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui;

import X.C01GW;
import X.C1830307Ev;
import X.C452501pT;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBestMatchLabelAssem extends ReusedUIContentAssem<SearchBestMatchLabelAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s> {
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 423));

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.InterfaceC435460H5s r5) {
        /*
            r4 = this;
            X.0H5s r5 = (X.InterfaceC435460H5s) r5
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            r3 = 0
            if (r0 == 0) goto L64
            com.ss.android.ugc.aweme.discover.model.VideoTag r2 = r0.getVideoTag()
            if (r2 == 0) goto L65
            java.lang.String r1 = r2.getType()
        L17:
            X.0Ppy r0 = X.EnumC657080Ppy.BEST_MATCH
            java.lang.String r0 = r0.getType()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r1 = 0
            if (r0 == 0) goto L5a
            java.lang.String r0 = r2.getTitle()
            if (r0 == 0) goto L5a
            int r0 = r0.length()
            if (r0 == 0) goto L5a
            android.view.View r0 = r4.LJJIJL()
            X.C786410Ut5.LJLLLLLL(r1, r0)
            X.01GW r0 = r4.LLJJJJ
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L4a
            if (r2 == 0) goto L47
            java.lang.String r3 = r2.getTitle()
        L47:
            r0.setText(r3)
        L4a:
            X.0Ppn r3 = X.C656970Ppn.LIZ
        L4c:
            android.view.View r2 = r4.LJJIJL()
            Y.ARunnableS43S0300000_10 r1 = new Y.ARunnableS43S0300000_10
            r0 = 3
            r1.<init>(r3, r5, r4, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
            return
        L5a:
            android.view.View r1 = r4.LJJIJL()
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
            goto L4c
        L64:
            r2 = r3
        L65:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.SearchBestMatchLabelAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        if (C1830307Ev.LIZ() == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
