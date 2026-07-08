package kotlin.jvm.internal;

import X.C09AY;
import X.C103L;
import X.C10AA;
import X.C19EG;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import android.os.Bundle;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.PrivacySettingDialogRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tiktok.tpsc.privacy.video.PrivacyVideoRestrictionModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS2S0520000_28 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;
    public boolean z6;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS2S0520000_28 awS2S0520000_28, Object obj) {
        PrivacyVideoRestrictionModel privacyVideoRestrictionModel = (PrivacyVideoRestrictionModel) obj;
        C10AA.LJ((Aweme) awS2S0520000_28.l0, privacyVideoRestrictionModel.getSettings());
        C786410Ut5.LJIIJ((DialogC1389620mGW) awS2S0520000_28.l1);
        ((PrivacySettingDialogRouter) awS2S0520000_28.l2).tryOpenSheet((Aweme) awS2S0520000_28.l0, (C19EG) awS2S0520000_28.l3, (Bundle) awS2S0520000_28.l4, privacyVideoRestrictionModel, awS2S0520000_28.z5, awS2S0520000_28.z6);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$1(kotlin.jvm.internal.AwS2S0520000_28 r11, java.lang.Object r12) {
        /*
            r9 = r12
            com.ss.android.ugc.tiktok.tpsc.privacy.video.PrivacyVideoRestrictionModel r9 = (com.ss.android.ugc.tiktok.tpsc.privacy.video.PrivacyVideoRestrictionModel) r9
            java.lang.Object r1 = r11.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            com.ss.android.ugc.tiktok.tpsc.model.VideoItemSettings r0 = r9.getSettings()
            X.C10AA.LJ(r1, r0)
            com.ss.android.ugc.tiktok.tpsc.model.VideoItemRestriction r0 = r9.getRestriction()
            if (r0 == 0) goto L88
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem r0 = r0.contentReuse
        L16:
            X.108y r0 = X.C191985108x.LIZLLL(r0)
            boolean r0 = r0.LIZIZ
            if (r0 == 0) goto L69
            java.lang.Object r1 = r11.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            boolean r0 = X.C729510SjV.LJJIJIL(r1)
            if (r0 != 0) goto L69
            boolean r0 = r1.getIsCommentPostVideo()
            if (r0 != 0) goto L69
            java.lang.Class<com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService> r0 = com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService r2 = (com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService) r2
            if (r2 == 0) goto L66
            java.lang.Object r1 = r11.l1
            X.19EG r1 = (X.C19EG) r1
            androidx.fragment.app.FragmentManager r0 = r1.getSupportFragmentManager()
            X.10BN r3 = new X.10BN
            java.lang.Object r4 = r11.l2
            X.0mGW r4 = (X.DialogC1389620mGW) r4
            java.lang.Object r5 = r11.l3
            com.ss.android.ugc.aweme.compliance.privacy.settings.video.PrivacySettingDialogRouter r5 = (com.ss.android.ugc.aweme.compliance.privacy.settings.video.PrivacySettingDialogRouter) r5
            java.lang.Object r6 = r11.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = (com.ss.android.ugc.aweme.feed.model.Aweme) r6
            java.lang.Object r7 = r11.l1
            X.19EG r7 = (X.C19EG) r7
            java.lang.Object r8 = r11.l4
            android.os.Bundle r8 = (android.os.Bundle) r8
            boolean r10 = r11.z5
            boolean r11 = r11.z6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.LJIILL(r1, r0, r3)
        L66:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L69:
            java.lang.Object r0 = r11.l2
            X.0mGW r0 = (X.DialogC1389620mGW) r0
            X.C786410Ut5.LJIIJ(r0)
            java.lang.Object r5 = r11.l3
            com.ss.android.ugc.aweme.compliance.privacy.settings.video.PrivacySettingDialogRouter r5 = (com.ss.android.ugc.aweme.compliance.privacy.settings.video.PrivacySettingDialogRouter) r5
            java.lang.Object r6 = r11.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = (com.ss.android.ugc.aweme.feed.model.Aweme) r6
            java.lang.Object r7 = r11.l1
            X.19EG r7 = (X.C19EG) r7
            java.lang.Object r8 = r11.l4
            android.os.Bundle r8 = (android.os.Bundle) r8
            boolean r10 = r11.z5
            boolean r11 = r11.z6
            r5.tryOpenSheet(r6, r7, r8, r9, r10, r11)
            goto L66
        L88:
            r0 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS2S0520000_28.invoke$1(kotlin.jvm.internal.AwS2S0520000_28, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS2S0520000_28 awS2S0520000_28, Object obj) {
        PrivacySettingDialogRouter privacySettingDialogRouter = (PrivacySettingDialogRouter) awS2S0520000_28.l0;
        Aweme aweme = (Aweme) awS2S0520000_28.l1;
        privacySettingDialogRouter.doOpenSheet(aweme, (C19EG) awS2S0520000_28.l2, privacySettingDialogRouter.getSheetV2((Bundle) awS2S0520000_28.l3, (PrivacyVideoRestrictionModel) awS2S0520000_28.l4, aweme, (C103L) obj), awS2S0520000_28.z5, awS2S0520000_28.z6);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS2S0520000_28(android.os.Bundle r3, X.C19EG r4, X.DialogC1389620mGW r5, com.ss.android.ugc.aweme.compliance.privacy.settings.video.PrivacySettingDialogRouter r6, com.ss.android.ugc.aweme.feed.model.Aweme r7, boolean r8, boolean r9, int r10) {
        /*
            r2 = this;
            r2.$t = r10
            if (r10 == 0) goto L18
            r1 = r2
            r1.l0 = r7
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r6
            r1.l4 = r3
            r1.z5 = r8
            r1.z6 = r9
            r0 = 1
        L14:
            r1.<init>(r0)
            return
        L18:
            r1 = r2
            r1.l0 = r7
            r1.l1 = r5
            r1.l2 = r6
            r1.l3 = r4
            r1.l4 = r3
            r1.z5 = r8
            r1.z6 = r9
            r0 = 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS2S0520000_28.<init>(android.os.Bundle, X.19EG, X.0mGW, com.ss.android.ugc.aweme.compliance.privacy.settings.video.PrivacySettingDialogRouter, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0520000_28(PrivacySettingDialogRouter privacySettingDialogRouter, Aweme aweme, C19EG c19eg, Bundle bundle, PrivacyVideoRestrictionModel privacyVideoRestrictionModel, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = privacySettingDialogRouter;
        this.l1 = aweme;
        this.l2 = c19eg;
        this.l3 = bundle;
        this.l4 = privacyVideoRestrictionModel;
        this.z5 = z;
        this.z6 = z2;
    }
}
