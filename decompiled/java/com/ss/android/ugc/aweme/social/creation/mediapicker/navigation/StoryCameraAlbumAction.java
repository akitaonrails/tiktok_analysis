package com.ss.android.ugc.aweme.social.creation.mediapicker.navigation;

import X.C0CSR;
import X.C0M9S;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C298680BnG;
import X.C817503Hh;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.router.route.IRouteAction;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryCameraAlbumAction implements IRouteAction {
    public static final int $stable = 0;
    public static final C0M9S Companion = new Object() { // from class: X.0M9S
    };
    public static final String TYPE = "type";

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013 A[PHI: r8
      0x0013: PHI (r8v2 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String) binds: [B:7:0x0011, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void realOpenAlbum(android.content.Context r35, android.os.Bundle r36) {
        /*
            r34 = this;
            r4 = r35
            java.lang.String r7 = ""
            r1 = r36
            if (r1 == 0) goto L10
            java.lang.String r0 = "enter_from"
            java.lang.String r8 = r1.getString(r0)
            if (r8 != 0) goto L13
        L10:
            r8 = r7
            if (r1 == 0) goto L1c
        L13:
            java.lang.String r0 = "enter_method"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L1c
            r7 = r0
        L1c:
            com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam r5 = new com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam
            r6 = 0
            r15 = 0
            r19 = 0
            r20 = 18
            r32 = 67092473(0x3ffbff9, float:1.5031628E-36)
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r16 = r15
            r17 = r15
            r18 = r15
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r6
            r25 = r6
            r26 = r6
            r27 = r15
            r28 = r6
            r29 = r15
            r30 = r6
            r31 = r6
            r33 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Class<com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService> r12 = com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService.class
            r16 = 14
            r13 = r15
            r14 = r15
            r17 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r12, r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService r0 = (com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService) r0
            if (r0 == 0) goto L75
            X.0M9f r3 = r0.LIZLLL()
            if (r3 == 0) goto L75
            java.lang.String r2 = "bpea-story_top_cell_request_read_storage_permission"
            java.lang.String r1 = "bpea-story_top_cell_request_read_storage_permission_target34"
            java.lang.String r0 = "bpea-story_top_cell_request_read_storage_permission_target33"
            com.bytedance.bpea.cert.token.TokenCert r0 = r3.chooseBPEAToken(r1, r0, r2)
            if (r4 == 0) goto L75
            android.app.Activity r4 = (android.app.Activity) r4
            r3.startStoryPublish(r4, r5, r0)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.mediapicker.navigation.StoryCameraAlbumAction.realOpenAlbum(android.content.Context, android.os.Bundle):void");
    }

    /* JADX INFO: renamed from: open, reason: collision with other method in class */
    public void m319open(Context context, String str, Bundle bundle) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            if (C298680BnG.LIZ()) {
                realOpenAlbumV2(context, str, bundle);
                return;
            } else {
                realOpenAlbum(context, bundle);
                return;
            }
        }
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C0CSR(this, context, str, bundle, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[PHI: r8
      0x0022: PHI (r8v2 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String) binds: [B:12:0x0020, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void realOpenAlbumV2(android.content.Context r35, java.lang.String r36, android.os.Bundle r37) {
        /*
            r34 = this;
            r2 = r35
            r1 = 0
            if (r36 == 0) goto L11
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r36)
            if (r3 == 0) goto L11
            java.lang.String r0 = "type"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r3, r0)
        L11:
            java.lang.String r7 = ""
            r3 = r37
            if (r3 == 0) goto L1f
            java.lang.String r0 = "enter_from"
            java.lang.String r8 = r3.getString(r0)
            if (r8 != 0) goto L22
        L1f:
            r8 = r7
            if (r3 == 0) goto L2b
        L22:
            java.lang.String r0 = "enter_method"
            java.lang.String r0 = r3.getString(r0)
            if (r0 == 0) goto L2b
            r7 = r0
        L2b:
            java.lang.String r0 = "sub_only_story"
            boolean r29 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam r5 = new com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam
            r6 = 0
            r15 = 0
            r19 = 0
            r20 = 18
            r32 = 58703865(0x37fbff9, float:7.515814E-37)
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r16 = r15
            r17 = r15
            r18 = r15
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r6
            r25 = r6
            r26 = r6
            r27 = r15
            r28 = r6
            r30 = r6
            r31 = r6
            r33 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Class<com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService> r12 = com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService.class
            r16 = 14
            r13 = r15
            r14 = r15
            r17 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r12, r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService r0 = (com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService) r0
            if (r0 == 0) goto L88
            X.0M9f r4 = r0.LIZLLL()
            if (r4 == 0) goto L88
            java.lang.String r3 = "bpea-story_top_cell_request_read_storage_permission"
            java.lang.String r1 = "bpea-story_top_cell_request_read_storage_permission_target34"
            java.lang.String r0 = "bpea-story_top_cell_request_read_storage_permission_target33"
            com.bytedance.bpea.cert.token.TokenCert r0 = r4.chooseBPEAToken(r1, r0, r3)
            if (r2 == 0) goto L88
            android.app.Activity r2 = (android.app.Activity) r2
            r4.startStoryPublish(r2, r5, r0)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.mediapicker.navigation.StoryCameraAlbumAction.realOpenAlbumV2(android.content.Context, java.lang.String, android.os.Bundle):void");
    }

    @Override // com.bytedance.router.route.IRouteAction
    public /* bridge */ /* synthetic */ Object open(Context context, String str, Bundle bundle) {
        m319open(context, str, bundle);
        return Unit.LIZ;
    }
}
