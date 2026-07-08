package com.ss.android.ugc.aweme.social.creation.edit.serviceimpl;

import X.C21146717pB;
import X.C786410Ut5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.social.creation.api.edit.SocialEditLayoutPreloadApi;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class SocialEditLayoutPreloadService implements SocialEditLayoutPreloadApi {
    public final Set<Integer> LIZ = new LinkedHashSet();

    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.SocialEditLayoutPreloadApi
    public final void clearCache() {
        this.LIZ.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.SocialEditLayoutPreloadApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void preloadLayoutFiles(android.content.Context r8, android.os.Bundle r9) {
        /*
            r7 = this;
            if (r9 != 0) goto L3
            return
        L3:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r6 = X.C0MUK.LIZJ(r9)
            boolean r0 = X.C861960Xre.LIZ()
            if (r0 == 0) goto L95
            r5 = 2131570423(0x7f0d2ef7, float:1.87665E38)
        L10:
            X.13DV r4 = X.C1697820uHc.LIZIZ()
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r6.canvasVideoData
            if (r0 == 0) goto L93
            boolean r1 = X.C1444940nhk.LJFF(r0)
            r0 = 1
            if (r1 != r0) goto L93
        L1f:
            r3 = 2131565558(0x7f0d1bf6, float:1.8756633E38)
            r2 = 2131565578(0x7f0d1c0a, float:1.8756673E38)
            r1 = 2131565577(0x7f0d1c09, float:1.8756671E38)
            if (r0 != 0) goto L7d
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.edit.u4.LJJJJJL(r6)
            if (r0 != 0) goto L7d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r4.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r4.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.add(r0)
        L4c:
            java.util.List r0 = X.C1697820uHc.LIZ(r4)
            java.util.Iterator r3 = r0.iterator()
        L54:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.util.Set<java.lang.Integer> r1 = r7.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L54
            java.util.Set<java.lang.Integer> r1 = r7.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.add(r0)
            X.C21146717pB.LIZJ(r8, r2)
            goto L54
        L7d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r4.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r4.add(r0)
            goto L4c
        L93:
            r0 = 0
            goto L1f
        L95:
            r5 = 2131570424(0x7f0d2ef8, float:1.8766502E38)
            goto L10
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.edit.serviceimpl.SocialEditLayoutPreloadService.preloadLayoutFiles(android.content.Context, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.SocialEditLayoutPreloadApi
    public final View LIZ(Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        if (this.LIZ.contains(Integer.valueOf(i))) {
            if (context != null) {
                this.LIZ.remove(Integer.valueOf(i));
                return C21146717pB.LIZIZ(context, i, viewGroup, false);
            }
            return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
