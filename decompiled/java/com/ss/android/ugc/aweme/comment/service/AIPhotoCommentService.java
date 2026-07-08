package com.ss.android.ugc.aweme.comment.service;

import X.C0HWQ;
import X.C0P0T;
import X.C1215170hj9;
import X.C1216310hkz;
import X.C1347720lAw;
import X.C1347730lAx;
import X.C1350920lG6;
import X.C1354660lM8;
import X.C1391600mJi;
import X.C1697810uHb;
import X.C418440Gaw;
import X.C443090HZb;
import X.C814420VxA;
import X.InterfaceC1215160hj8;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import kotlin.jvm.internal.AwS263S0300000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class AIPhotoCommentService implements IAIPhotoCommentService {
    public C0P0T LIZ;

    @Override // com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService
    public final void LIZ() {
        C0P0T c0p0t = this.LIZ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService
    public final boolean LIZJ() {
        C0P0T c0p0t = this.LIZ;
        return c0p0t != null && c0p0t.isShowing();
    }

    @Override // com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService
    public final boolean LIZLLL(Aweme aweme) {
        if (aweme == null || !C1354660lM8.LJIIIIZZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService
    public final void LIZIZ(Context context, View view, C1216310hkz c1216310hkz, InterfaceC1215160hj8 interfaceC1215160hj8) {
        boolean z;
        boolean z2;
        AwS598S0100000_19 awS598S0100000_19;
        int i;
        if (context == null || view == null) {
            return;
        }
        if (!C1215170hj9.LIZ().getBoolean("key_local_upload_badge_fetched", false)) {
            if (C1215170hj9.LIZ().getBoolean("key_local_upload_badge_consumed", false)) {
                C1215170hj9.LIZ().storeInt("key_local_upload_badge_display_count", 3);
                C1215170hj9.LIZ().storeBoolean("key_local_upload_badge_retired", true);
            } else {
                C1215170hj9.LIZ().storeInt("key_local_upload_badge_display_count", 0);
                C1215170hj9.LIZ().storeBoolean("key_local_upload_badge_retired", false);
            }
            C1215170hj9.LIZ().storeBoolean("key_local_upload_badge_fetched", true);
        }
        if (!C1215170hj9.LIZ().getBoolean("key_local_upload_badge_retired", false) && C1215170hj9.LIZ().getInt("key_local_upload_badge_display_count", 0) < 3) {
            z = true;
            if (!C1215170hj9.LIZ().getBoolean("key_local_upload_badge_retired", false)) {
                int i2 = C1215170hj9.LIZ().getInt("key_local_upload_badge_display_count", 0) + 1;
                if (i2 > 3) {
                    i2 = 3;
                }
                C1215170hj9.LIZ().storeInt("key_local_upload_badge_display_count", i2);
                if (i2 >= 3) {
                    C1215170hj9.LIZ().storeBoolean("key_local_upload_badge_retired", true);
                }
            }
        } else {
            z = false;
        }
        Aweme aweme = c1216310hkz.LIZIZ;
        if (aweme != null && C1354660lM8.LIZIZ(aweme)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0HWQ c0hwq = new C0HWQ(context);
        C443090HZb[] c443090HZbArr = new C443090HZb[2];
        c443090HZbArr[0] = new C443090HZb(context.getString(C1354660lM8.LIZ()), new AwS563S0100000_19(interfaceC1215160hj8, 642), 0, new AwS598S0100000_19(context, 110), 0, null, 0, z2, false, new AwS263S0300000_19(interfaceC1215160hj8, this, context, 4), 372);
        String string = context.getString(2131837122);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(interfaceC1215160hj8, 643);
        AwS598S0100000_19 awS598S0100000_192 = new AwS598S0100000_19(context, 111);
        if (z) {
            awS598S0100000_19 = new AwS598S0100000_19(context, 112);
        } else {
            awS598S0100000_19 = null;
        }
        c443090HZbArr[1] = new C443090HZb(string, awS563S0100000_19, 0, awS598S0100000_192, 0, awS598S0100000_19, 0, false, false, null, 980);
        c0hwq.LJIIL(Collections.singletonList(C1697810uHb.LJIIJJI(c443090HZbArr)));
        C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LJIIL = true;
        c0hwq.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C0P0T c0p0tLIZIZ = c0hwq.LIZIZ();
        this.LIZ = c0p0tLIZIZ;
        c0p0tLIZIZ.show();
        String str = c1216310hkz.LIZ;
        Aweme aweme2 = c1216310hkz.LIZIZ;
        C1347730lAx c1347730lAxLJIIIIZZ = C1347720lAw.LJIIIIZZ(c1216310hkz.LIZLLL);
        c1347730lAxLJIIIIZZ.LJI = c1216310hkz.LIZJ;
        if (z2) {
            i = 0;
        } else {
            i = 1;
        }
        c1347730lAxLJIIIIZZ.LJIILL = i;
        C1350920lG6.LLFZ(str, aweme2, false, c1347730lAxLJIIIIZZ);
        String str2 = c1216310hkz.LIZ;
        Aweme aweme3 = c1216310hkz.LIZIZ;
        C1347730lAx c1347730lAxLJIILL = C1347720lAw.LJIILL(c1216310hkz.LIZLLL);
        c1347730lAxLJIILL.LJI = c1216310hkz.LIZJ;
        C1350920lG6.LLFZ(str2, aweme3, false, c1347730lAxLJIILL);
    }
}
