package com.bytedance.xelement.markdown;

import X.AbstractC816260W0i;
import X.C1298870ju9;
import X.C1311670kEn;
import X.C1339200kxC;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.xelement.markdown.MarkdownDocument;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.textra.TTText;
import com.lynx.textra.TTTextDefinition;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes21.dex */
public class Markdown {
    public static volatile C1298870ju9 sInitializer;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ju9] */
    public static C1298870ju9 getInitializer() {
        if (sInitializer == null) {
            synchronized (C1298870ju9.class) {
                try {
                    if (sInitializer == null) {
                        sInitializer = new AbstractC816260W0i() { // from class: X.0ju9
                            @Override // X.AbstractC816260W0i
                            public final boolean doInitialize() {
                                try {
                                    try {
                                        TraceEvent.LIZIZ("x-markdown.init");
                                        if (LynxEnv.inst().getLibraryLoader() != null) {
                                            LynxEnv.inst().getLibraryLoader().loadLibrary("lynx_markdown");
                                        } else {
                                            LJFF("tttext_lite");
                                            LJFF("lynxbase");
                                            LJFF("lynx_markdown");
                                        }
                                        TTText.Initial();
                                        MarkdownDocument.initial();
                                        Class.forName(TTTextDefinition.class.getName());
                                        MarkdownDocument markdownDocument = new MarkdownDocument(null, null);
                                        markdownDocument.destroy();
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("MarkdownParser warm:");
                                        sbLIZ.append(markdownDocument.hashCode());
                                        LynxLog.i("Markdown", C2188811AlT.LIZIZ(sbLIZ));
                                        TraceEvent.LJII("x-markdown.init");
                                        return true;
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("load library fail: ");
                                        sbLIZ2.append(e.toString());
                                        LynxLog.e("Markdown", C2188811AlT.LIZIZ(sbLIZ2));
                                        TraceEvent.LJII("x-markdown.init");
                                        return false;
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    TraceEvent.LJII("x-markdown.init");
                                    throw th;
                                }
                            }

                            public static void LJFF(String str) {
                                LoadSoLancet.LIZJ(str);
                                long jUptimeMillis = SystemClock.uptimeMillis();
                                Librarian.LJFF(str);
                                LoadSoLancet.LJ(jUptimeMillis, str);
                                LoadSoLancet.LIZLLL(jUptimeMillis, str);
                                LoadSoLancet.LIZIZ(str);
                            }
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInitializer;
    }

    public static C1311670kEn markdownBehavior() {
        return new C1339200kxC(47);
    }

    public static void ensureInitialized() {
        getInitializer().ensureInitialized();
    }

    public static void init() {
        getInitializer().initialize();
    }
}
