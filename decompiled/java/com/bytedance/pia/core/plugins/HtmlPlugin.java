package com.bytedance.pia.core.plugins;

import X.C1287700jc8;
import X.C1953107kv;
import X.C1BNF;
import X.C1BNJ;
import X.C1BNN;
import X.C1BO6;
import X.C1BPP;
import X.C2203961BNq;
import X.C2204041BNy;
import X.InterfaceC1532650pzD;
import X.InterfaceC1535470q3l;
import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.pia.core.tracing.EventName;
import com.bytedance.pia.core.tracing.Tracing;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes35.dex */
public class HtmlPlugin extends C1BO6 {
    public final CountDownLatch LIZJ;
    public volatile C1BNN LIZLLL;
    public C1BNJ LJ;
    public boolean LJFF;

    @Override // X.C1BO6
    public final String LIZ() {
        return "html";
    }

    @Override // X.C1BO6
    public final void LIZIZ() {
        C1287700jc8.LIZJ(new Runnable() { // from class: X.1BNL
            /* JADX WARN: Removed duplicated region for block: B:54:0x01fd  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0201  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 549
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1BNL.run():void");
            }
        });
    }

    @Override // X.C1BO6, X.InterfaceC1542530qF9
    public final void release() {
        this.LIZJ.countDown();
    }

    public HtmlPlugin(C2204041BNy c2204041BNy) {
        super(c2204041BNy);
        this.LIZJ = new CountDownLatch(1);
        this.LJ = null;
        this.LJFF = false;
    }

    @Override // X.C1BO6
    public final InterfaceC1532650pzD LIZJ(InterfaceC1535470q3l interfaceC1535470q3l) {
        Boolean bool;
        String strLIZJ = C1953107kv.LIZJ(interfaceC1535470q3l.getUrl(), null);
        if (strLIZJ != null && strLIZJ.equals(this.LIZIZ.LJFF) && interfaceC1535470q3l.isForMainFrame()) {
            try {
                C1BPP.LJ("[HTML] Start intercepting main document.");
                Tracing.Event eventLIZ = this.LIZIZ.LJIILL.LIZ(EventName.ResourceInterceptStart);
                eventLIZ.args.put("url", interfaceC1535470q3l.getUrl());
                eventLIZ.LIZ();
                this.LIZJ.await(C2203961BNq.LIZ().htmlInterceptTimeout, TimeUnit.SECONDS);
                C1BPP.LJ("[HTML] Finish waiting response.");
                C1BNJ c1bnj = this.LJ;
                if (c1bnj != null && (bool = c1bnj.LIZJ.marked) != null && !bool.booleanValue() && !this.LJFF) {
                    Uri uri = this.LIZIZ.LJ;
                    C1BNJ c1bnj2 = this.LJ;
                    Keva keva = C1BNF.LIZ;
                    if (C2203961BNq.LIZ().isCacheEnabled && C1BNF.LJ.get()) {
                        C1BNF.LJ(uri, c1bnj2, true);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (this.LIZLLL != null) {
                C1BPP.LJ("[HTML] Intercept: " + interfaceC1535470q3l.getUrl().toString());
                Tracing.Event eventLIZ2 = this.LIZIZ.LJIILL.LIZ(EventName.ResourceInterceptEnd);
                eventLIZ2.args.put("url", interfaceC1535470q3l.getUrl());
                eventLIZ2.LIZ();
                C1BPP.LJ("[HTML] Finish intercepting main document.");
                return this.LIZLLL;
            }
        }
        return null;
    }

    public final void LJI(String str, Throwable th) {
        this.LIZJ.countDown();
        this.LIZIZ.LJIILJJIL.LIZJ(System.currentTimeMillis(), "request_html.end");
        this.LIZIZ.LJIILL.LIZ(EventName.HTMLResponseEnd).LIZ();
        if (th != null) {
            C1BPP.LIZJ(4, "[Manifest] Request Manifest Error:", th);
        }
        if (str != null) {
            this.LIZIZ.LJIIJJI("event-on-html-ready", str);
        } else {
            this.LIZIZ.LJIIJJI("event-on-html-error", th);
        }
    }
}
