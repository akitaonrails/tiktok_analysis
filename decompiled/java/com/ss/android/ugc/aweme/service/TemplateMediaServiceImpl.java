package com.ss.android.ugc.aweme.service;

import X.AnonymousClass0956;
import X.C096W;
import X.C096X;
import X.C096Y;
import X.C096Z;
import X.C0PEM;
import X.C1954807lC;
import X.C2286708xd;
import X.C23175096f;
import X.C23177096h;
import X.C23179096j;
import X.C23250099c;
import X.C2473209mc;
import X.C539510LDx;
import X.C817503Hh;
import X.InterfaceC23176096g;
import X.InterfaceC352560Dry;
import android.content.Context;
import com.ss.android.ugc.aweme.interfaces.ITemplateMediaService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class TemplateMediaServiceImpl implements ITemplateMediaService {
    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMediaService
    public final AnonymousClass0956 LIZ(Context context, List list, String str, InterfaceC23176096g interfaceC23176096g) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (!((ArrayList) list).isEmpty()) {
            for (C23179096j c23179096j : (ArrayList) list) {
                if (c23179096j.LIZ.length() == 0 || !C2286708xd.LIZJ(c23179096j.LIZ)) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            if (interfaceC23176096g != null) {
                interfaceC23176096g.onFailure();
            }
            return null;
        }
        return C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C23175096f(list, interfaceC23176096g, jCurrentTimeMillis, this, context, str, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012c  */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a2 -> B:23:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x011a -> B:12:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(android.content.Context r23, java.util.List<X.C23179096j> r24, java.lang.String r25, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.Boolean, java.lang.Long>> r26) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.TemplateMediaServiceImpl.LIZJ(android.content.Context, java.util.List, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMediaService
    public final void LIZIZ(Context context, String str, String str2, C096Y c096y, C096X c096x) {
        C096W c096w;
        C23177096h c23177096h;
        int i = C096Z.LIZ[c096y.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if ((c096x instanceof C23177096h) && (c23177096h = (C23177096h) c096x) != null) {
                    C539510LDx c539510LDx = C539510LDx.LIZ;
                    int i2 = c23177096h.LIZ;
                    int i3 = c23177096h.LIZIZ;
                    String str3 = c23177096h.LIZJ;
                    Integer num = c23177096h.LIZLLL;
                    int[] iArr = c23177096h.LJ;
                    int[] iArr2 = c23177096h.LJFF;
                    InterfaceC352560Dry interfaceC352560Dry = c23177096h.LJI;
                    c539510LDx.getClass();
                    C539510LDx.LIZIZ(context, str, str2, i2, i3, str3, num, iArr, iArr2, interfaceC352560Dry, null);
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        if (!(c096x instanceof C096W) || (c096w = (C096W) c096x) == null) {
            return;
        }
        C2473209mc.LIZ(context, str, str2, c096w.LIZ, null);
    }
}
