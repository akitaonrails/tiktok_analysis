package com.ss.android.ugc.aweme.detail.prefab.videos;

import X.C607770Nsd;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class VideoCoverAssem extends ReusedUISlotAssem<VideoCoverAssem> implements InterfaceC712990Rxx<C607770Nsd>, View.OnAttachStateChangeListener {
    public SmartImageView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bka;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        SmartImageView smartImageView = this.LLJJLIIIJLLLLLLLZ;
        SmartImageView smartImageView2 = null;
        if (smartImageView == null) {
            smartImageView = null;
        }
        smartImageView.setAttached(true);
        SmartImageView smartImageView3 = this.LLJJLIIIJLLLLLLLZ;
        if (smartImageView3 != null) {
            smartImageView2 = smartImageView3;
        }
        smartImageView2.LJI();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        SmartImageView smartImageView = (SmartImageView) getContentView();
        this.LLJJLIIIJLLLLLLLZ = smartImageView;
        smartImageView.addOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        SmartImageView smartImageView = this.LLJJLIIIJLLLLLLLZ;
        SmartImageView smartImageView2 = null;
        if (smartImageView == null) {
            smartImageView = null;
        }
        smartImageView.setAttached(false);
        SmartImageView smartImageView3 = this.LLJJLIIIJLLLLLLLZ;
        if (smartImageView3 != null) {
            smartImageView2 = smartImageView3;
        }
        smartImageView2.LJII();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C607770Nsd r11) {
        /*
            r10 = this;
            X.0Nsd r11 = (X.C607770Nsd) r11
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.getAweme()
            android.view.View r0 = r10.getContentView()
            android.content.Context r2 = r0.getContext()
            boolean r0 = X.C20595415iS.LIZIZ()
            r1 = 1
            if (r0 != 0) goto L23
            X.0Vh4 r0 = X.C036E.LIZ     // Catch: java.lang.Exception -> L1e
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L2b
            goto L25
        L1e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L2b
        L23:
            r0 = 0
            goto L34
        L25:
            boolean r0 = X.C0XJA.LIZ(r2)
            if (r0 == 0) goto L23
        L2b:
            java.lang.String r0 = "use_dynamic_cover"
            boolean r0 = X.C0VO3.LIZIZ(r0, r1)
            if (r0 == 0) goto L23
            r0 = 1
        L34:
            r2 = 0
            if (r0 == 0) goto L5d
            com.bytedance.lighten.loader.SmartImageView r4 = r10.LLJJLIIIJLLLLLLLZ
            if (r4 != 0) goto L3c
            r4 = r2
        L3c:
            com.ss.android.ugc.aweme.feed.model.Video r5 = r3.getVideo()
            java.lang.String r6 = "DetailVideoListCell"
            r7 = 0
            r9 = 248(0xf8, float:3.48E-43)
            r8 = r7
            boolean r0 = X.C1620160sGM.LIZLLL(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L5d
            com.bytedance.lighten.loader.SmartImageView r0 = r10.LLJJLIIIJLLLLLLLZ
            if (r0 != 0) goto L51
            r0 = r2
        L51:
            r0.setAttached(r1)
            com.bytedance.lighten.loader.SmartImageView r0 = r10.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L59
            r2 = r0
        L59:
            r2.LJI()
            return
        L5d:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r3.getVideo()
            if (r0 == 0) goto L83
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getCover()
            if (r1 == 0) goto L83
            java.lang.String r0 = r1.getUri()
            if (r0 == 0) goto L75
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 == 0) goto L8f
        L75:
            if (r1 == 0) goto L83
            java.util.List r0 = r1.getUrlList()
            if (r0 == 0) goto L83
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8f
        L83:
            com.bytedance.lighten.loader.SmartImageView r0 = r10.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L88
            r2 = r0
        L88:
            r0 = 2131099670(0x7f060016, float:1.78117E38)
            r2.setActualImageResource(r0)
            return
        L8f:
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C438710HIf.LIZ(r1)
            X.0kl3 r1 = X.C1331660kl2.LJIIIIZZ(r0)
            com.bytedance.lighten.loader.SmartImageView r0 = r10.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L9c
            r2 = r0
        L9c:
            r1.LJJ(r2)
            r0 = 200(0xc8, float:2.8E-43)
            int[] r0 = X.C422830Gi1.LIZ(r0)
            if (r0 == 0) goto Laa
            r1.LJJIJ(r0)
        Laa:
            boolean r0 = X.C294660Bgm.LIZ()
            if (r0 == 0) goto Lb4
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r1.LJIL = r0
        Lb4:
            X.C786410Ut5.h3(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.prefab.videos.VideoCoverAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C607770Nsd c607770Nsd) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C607770Nsd c607770Nsd) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
