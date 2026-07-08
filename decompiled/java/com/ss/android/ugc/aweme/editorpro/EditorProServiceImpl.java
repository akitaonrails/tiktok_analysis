package com.ss.android.ugc.aweme.editorpro;

import X.C0MWG;
import X.C1653530t8B;
import X.C19A3;
import X.C1DRG;
import X.C524290KhH;
import X.C569480MVe;
import X.InterfaceC1425510nCP;
import X.InterfaceC1648020szI;
import X.InterfaceC1653190t7d;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tiktok.IEditorProService;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes9.dex */
public final class EditorProServiceImpl implements IEditorProService {
    @Override // com.ss.android.ugc.tiktok.IEditorProService
    public final void LIZ(C1DRG c1drg) {
        if (c1drg != null) {
            InterfaceC1648020szI interfaceC1648020szI = (InterfaceC1648020szI) c1drg.LJIIL(null, InterfaceC1648020szI.class);
            if (interfaceC1648020szI != null) {
                interfaceC1648020szI.showBottomTab(true);
            }
            InterfaceC1425510nCP interfaceC1425510nCP = (InterfaceC1425510nCP) c1drg.LJIIL(null, InterfaceC1425510nCP.class);
            if (interfaceC1425510nCP != null) {
                interfaceC1425510nCP.AT1(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    @Override // com.ss.android.ugc.tiktok.IEditorProService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5) {
        /*
            r4 = this;
            boolean r0 = X.C297150Bkn.LIZ()
            r3 = 0
            r2 = 1
            if (r0 == 0) goto Le
            boolean r0 = X.C338630DPh.LIZ()
            if (r0 != 0) goto L26
        Le:
            if (r5 == 0) goto L47
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.creative.model.LandingModel r0 = r0.landingModel
            if (r0 == 0) goto L47
            java.lang.String r1 = r0.landingTab
        L1a:
            java.lang.String r0 = "editor_tab"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L26
            boolean r0 = X.C569600MVq.LIZ
            if (r0 == 0) goto L34
        L26:
            if (r5 == 0) goto L35
            boolean r0 = r5.LJJLL()
            if (r0 == r2) goto L34
            boolean r0 = r5.LJJJJLL()
            if (r0 != r2) goto L35
        L34:
            return r3
        L35:
            X.0o1f r0 = lth.o.LJIIZILJ
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L34
            X.0o1f r0 = lth.o.LJIIZILJ
            boolean r0 = r0.LJIIJJI()
            if (r0 != 0) goto L34
            r3 = 1
            return r3
        L47:
            r1 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editorpro.EditorProServiceImpl.LIZLLL(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):boolean");
    }

    @Override // com.ss.android.ugc.tiktok.IEditorProService
    public final InterfaceC1653190t7d LIZIZ(C1DRG c1drg, String str, boolean z) {
        return new C1653530t8B(c1drg, str, z);
    }

    @Override // com.ss.android.ugc.tiktok.IEditorProService
    public final void LIZJ(String str, C19A3 c19a3, ShortVideoContext shortVideoContext) {
        if (!a0.LJJJIL(str) && u.LJJIIJZLJL(str, "editor://", false)) {
            boolean zLJJIIJZLJL = u.LJJIIJZLJL(str, "editor://pro", false);
            C524290KhH.LIZIZ(c19a3, shortVideoContext, a0.LJJLJLI(str, "/", str), zLJJIIJZLJL);
            C0MWG c0mwg = C0MWG.LIZ;
            C569480MVe.LIZ.getClass();
            String strLIZIZ = C569480MVe.LIZIZ(str);
            c0mwg.getClass();
            C0MWG.LIZ(strLIZIZ, shortVideoContext, zLJJIIJZLJL);
        }
    }
}
