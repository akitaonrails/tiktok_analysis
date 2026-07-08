package com.ss.android.ugc.profile.business.ur.socialavatar.datacenter;

import X.AnonymousClass0951;
import X.C00F6;
import X.C01GW;
import X.C09IC;
import X.C0HY9;
import X.C0LAB;
import X.C1910890zpH;
import X.C1954807lC;
import X.C1BNE;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23250099c;
import X.C440900HQq;
import X.C442720HXq;
import X.C442780HXw;
import X.C452501pT;
import X.EnumC442760HXu;
import X.EnumC442790HXx;
import X.InterfaceC443750Haf;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;
import com.ss.android.ugc.aweme.util.IStickerStoreHelper;
import com.ss.android.ugc.ur.socialavatar.ISAStickerAnimationStatusService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarStickerAnimationStatusServiceImpl implements ISAStickerAnimationStatusService {
    public static final ConcurrentHashMap<String, C442720HXq> LIZIZ = new ConcurrentHashMap<>();
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(373));

    public static C442720HXq LJI(String str) {
        C442720HXq c442720HXqPutIfAbsent;
        ConcurrentHashMap<String, C442720HXq> concurrentHashMap = LIZIZ;
        C442720HXq c442720HXq = concurrentHashMap.get(str);
        if (c442720HXq == null && (c442720HXqPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c442720HXq = new C442720HXq(str)))) != null) {
            c442720HXq = c442720HXqPutIfAbsent;
        }
        return c442720HXq;
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISAStickerAnimationStatusService
    public final AnonymousClass0951 LIZ(String str) {
        if (str.length() == 0) {
            ((C1910890zpH) this.LIZ.getValue()).LIZIZ("SocialAvatarStickerAnimationStatusService", "getStatus: empty uid, returning empty state");
            return C09IC.LIZIZ(C1BNE.LIZ(new C00F6(0)));
        }
        return LJI(str).LJFF;
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISAStickerAnimationStatusService
    public final void LIZLLL(String str) {
        if (str.length() == 0) {
            ((C1910890zpH) this.LIZ.getValue()).LIZIZ("SocialAvatarStickerAnimationStatusService", "triggerPolling: empty uid, ignoring");
        } else {
            LJI(str).LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISAStickerAnimationStatusService
    public final void LIZIZ(String str, long j, EnumC442790HXx enumC442790HXx, int i) {
        if (str.length() == 0) {
            ((C1910890zpH) this.LIZ.getValue()).LIZIZ("SocialAvatarStickerAnimationStatusService", "revertToStatic: empty uid, ignoring");
            return;
        }
        C442720HXq c442720HXqLJI = LJI(str);
        C1910890zpH c1910890zpHLIZIZ = c442720HXqLJI.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("revertToStatic: stickerId=");
        sbLIZ.append(j);
        c1910890zpHLIZIZ.LIZ("SocialAvatarStickerAnimationStatusDataSource", C2188811AlT.LIZIZ(sbLIZ));
        int i2 = C442780HXw.LIZ[enumC442790HXx.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                InterfaceC443750Haf imAiSelfStickerService = IMStickerApi.LIZ.LIZIZ().getImAiSelfStickerService();
                StickerVariant.Companion.getClass();
                imAiSelfStickerService.LIZIZ(1, j);
            } else {
                throw new C1954807lC();
            }
        } else {
            IIMSocialAvatarService imSocialAvatarService = IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService();
            StickerVariant.Companion.getClass();
            imSocialAvatarService.LIZIZ(1, j);
        }
        IStickerStoreHelper.LIZ.getClass();
        IStickerStoreHelper iStickerStoreHelperLIZ = C0HY9.LIZ();
        StickerVariant.Companion.getClass();
        iStickerStoreHelperLIZ.updateFavStickerVariant(j, 1);
        C23250099c.LIZLLL(c442720HXqLJI.LIZLLL, null, null, new C440900HQq(i, j, null), 3);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISAStickerAnimationStatusService
    public final void LIZJ(long j, EnumC442790HXx enumC442790HXx, EnumC442760HXu enumC442760HXu, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LIZIZ(j, "sticker_id");
        c0lab.LJ("sticker_type", enumC442790HXx.getValue());
        c0lab.LJ("tab_name", enumC442790HXx.getValue());
        c0lab.LJ("button_status", enumC442760HXu.getValue());
        C20684815ws.LJIILLIIL("ttsocial_sticker_animation_btn_show", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISAStickerAnimationStatusService
    public final void LJFF(long j, EnumC442790HXx enumC442790HXx, EnumC442760HXu enumC442760HXu, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LIZIZ(j, "sticker_id");
        c0lab.LJ("sticker_type", enumC442790HXx.getValue());
        c0lab.LJ("tab_name", enumC442790HXx.getValue());
        c0lab.LJ("button_status", enumC442760HXu.getValue());
        C20684815ws.LJIILLIIL("ttsocial_sticker_animation_btn_click", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    @Override // com.ss.android.ugc.ur.socialavatar.ISAStickerAnimationStatusService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(long r10, int r12, java.lang.String r13, java.lang.String r14, X.InterfaceC1364105Vn r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof X.C05ED
            if (r0 == 0) goto L61
            r8 = r15
            X.05ED r8 = (X.C05ED) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r3 = r8.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L67
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            int r0 = r13.length()
            if (r0 != 0) goto L51
            X.01GW r0 = r9.LIZ
            java.lang.Object r2 = r0.getValue()
            X.0zpH r2 = (X.C1910890zpH) r2
            java.lang.String r1 = "SocialAvatarStickerAnimationStatusService"
            java.lang.String r0 = "requestAnimation: empty uid"
            r2.LIZIZ(r1, r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "uid is empty"
            r1.<init>(r0)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L51:
            X.0HXq r3 = LJI(r13)
            r8.LLILLL = r1
            r7 = r14
            r4 = r12
            r5 = r10
            java.lang.Object r0 = r3.LIZJ(r4, r5, r7, r8)
            if (r0 != r2) goto L28
            return r2
        L61:
            X.05ED r8 = new X.05ED
            r8.<init>(r9, r15)
            goto L12
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarStickerAnimationStatusServiceImpl.LJ(long, int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
