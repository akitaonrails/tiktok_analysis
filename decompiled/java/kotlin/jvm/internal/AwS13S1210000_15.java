package kotlin.jvm.internal;

import X.C09AY;
import X.C1158050gF1;
import X.C19EG;
import X.C2188811AlT;
import X.C925710aCH;
import X.C935540aS8;
import X.C935650aSJ;
import X.C936710aU1;
import X.EnumC485960J3y;
import com.bytedance.android.live.liveinteract.api.monitor.MultiGuestMonitorExternalEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.livesdk.livesetting.MultiGuestLayoutMonitorSwitchSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS13S1210000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS13S1210000_15 awS13S1210000_15, Object obj) {
        boolean zXQ2 = true;
        if (awS13S1210000_15.z3) {
            zXQ2 = ((MultiGuestSharedBgGuestViewModel) awS13S1210000_15.l1).xQ2(true);
        }
        String str = awS13S1210000_15.s0;
        String strLLJLLIL = ((LiveEffect) awS13S1210000_15.l2).LLJLLIL();
        String strLJJ = ((LiveEffect) awS13S1210000_15.l2).LJJ();
        obj.getClass();
        C935650aSJ c935650aSJ = new C935650aSJ(zXQ2, str, strLLJLLIL, strLJJ);
        ((MultiGuestSharedBgGuestViewModel) awS13S1210000_15.l1).DQ2(awS13S1210000_15.s0, c935650aSJ);
        return c935650aSJ;
    }

    public static final Object invoke$1(AwS13S1210000_15 awS13S1210000_15, Object obj) {
        DataChannel dataChannel;
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = (MultiGuestSharedBgGuestViewModel) awS13S1210000_15.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onApplySharedBg, download image ");
        sbLIZ.append(awS13S1210000_15.s0);
        sbLIZ.append(' ');
        sbLIZ.append(((LiveEffect) awS13S1210000_15.l2).LLJLLIL());
        sbLIZ.append(" success");
        multiGuestSharedBgGuestViewModel.yQ2(C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(((MultiGuestSharedBgGuestViewModel) awS13S1210000_15.l1).LLILZ, awS13S1210000_15.s0)) {
            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel2 = (MultiGuestSharedBgGuestViewModel) awS13S1210000_15.l1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onApplySharedBg, apply shared bg ");
            sbLIZ2.append(awS13S1210000_15.s0);
            sbLIZ2.append(' ');
            sbLIZ2.append(((LiveEffect) awS13S1210000_15.l2).LLJLLIL());
            multiGuestSharedBgGuestViewModel2.yQ2(C2188811AlT.LIZIZ(sbLIZ2));
            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel3 = (MultiGuestSharedBgGuestViewModel) awS13S1210000_15.l1;
            multiGuestSharedBgGuestViewModel3.setState(new C936710aU1(awS13S1210000_15.z3, multiGuestSharedBgGuestViewModel3, awS13S1210000_15.s0, (LiveEffect) awS13S1210000_15.l2, downloadInfo));
            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel4 = (MultiGuestSharedBgGuestViewModel) awS13S1210000_15.l1;
            multiGuestSharedBgGuestViewModel4.getClass();
            if (MultiGuestLayoutMonitorSwitchSetting.INSTANCE.isSwitch() && (dataChannel = multiGuestSharedBgGuestViewModel4.LL) != null) {
                dataChannel.LC0(MultiGuestMonitorExternalEvent.class, new C1158050gF1(MultiGuestSharedBgGuestViewModel.wQ2(), EnumC485960J3y.SHARED_BG_DOWNLOAD_LOCAL, null, 0, null, 124));
            }
            ((MultiGuestSharedBgGuestViewModel) awS13S1210000_15.l1).LLILZ = null;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS13S1210000_15 awS13S1210000_15, Object obj) {
        String targetFilePath;
        C935540aS8 c935540aS8 = (C935540aS8) obj;
        boolean zBQ2 = true;
        if (awS13S1210000_15.z3) {
            zBQ2 = ((MultiGuestSharedBgAnchorViewModel) awS13S1210000_15.l1).BQ2(true);
        }
        String str = awS13S1210000_15.s0;
        DownloadInfo downloadInfo = (DownloadInfo) awS13S1210000_15.l2;
        if (downloadInfo != null) {
            targetFilePath = downloadInfo.getTargetFilePath();
        } else {
            targetFilePath = null;
        }
        return C935540aS8.LIZ(c935540aS8, false, zBQ2, str, str, targetFilePath, false, 67);
    }

    public static final Object invoke$3(AwS13S1210000_15 awS13S1210000_15, Object obj) {
        boolean zXQ2 = true;
        if (awS13S1210000_15.z3) {
            zXQ2 = ((MultiGuestSharedBgGuestViewModel) awS13S1210000_15.l1).xQ2(true);
        }
        String str = awS13S1210000_15.s0;
        C935650aSJ c935650aSJ = (C935650aSJ) awS13S1210000_15.l2;
        String str2 = c935650aSJ.LLILLL;
        String str3 = c935650aSJ.LLILZ;
        obj.getClass();
        return new C935650aSJ(zXQ2, str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS13S1210000_15 r7, java.lang.Object r8) {
        /*
            java.lang.Number r8 = (java.lang.Number) r8
            r8.intValue()
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkMicVEPluginAdapt.enable()
            r6 = 1
            if (r0 == 0) goto L37
            java.lang.String r2 = r7.s0
            if (r2 == 0) goto L34
            int r0 = r2.length()
            if (r0 <= 0) goto L34
        L16:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostCreativeTool> r0 = com.bytedance.android.livesdkapi.host.IHostCreativeTool.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostCreativeTool r1 = (com.bytedance.android.livesdkapi.host.IHostCreativeTool) r1
            if (r1 == 0) goto L37
            java.lang.Object r0 = r7.l1
            X.19EG r0 = (X.C19EG) r0
            boolean r0 = r1.a72(r0, r2)
            if (r0 != 0) goto L37
            java.lang.Object r0 = r7.l2
            X.0aCH r0 = (X.C925710aCH) r0
            r0.LJIILL()
        L31:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L34:
            java.lang.String r2 = "linkmic_interact"
            goto L16
        L37:
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLyraxPluginAdapt.enable()
            if (r0 == 0) goto L59
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostCreativeTool> r0 = com.bytedance.android.livesdkapi.host.IHostCreativeTool.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostCreativeTool r1 = (com.bytedance.android.livesdkapi.host.IHostCreativeTool) r1
            if (r1 == 0) goto L59
            java.lang.Object r0 = r7.l1
            X.19EG r0 = (X.C19EG) r0
            boolean r0 = r1.cd(r0)
            if (r0 != 0) goto L59
            java.lang.Object r0 = r7.l2
            X.0aCH r0 = (X.C925710aCH) r0
            r0.LJIILL()
            goto L31
        L59:
            java.lang.Object r5 = r7.l2
            X.0aCH r5 = (X.C925710aCH) r5
            boolean r4 = r7.z3
            r5.getClass()
            X.0a5J r3 = X.C921390a5J.LIZ
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r5.LLILLL
            X.11NJ r1 = r5.LLJILJILJ
            X.0aCL r0 = new X.0aCL
            r0.<init>(r5, r4)
            r3.getClass()
            X.C921390a5J.LIZ(r6, r4, r2, r1, r0)
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS13S1210000_15.invoke$4(kotlin.jvm.internal.AwS13S1210000_15, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S1210000_15(C19EG c19eg, C925710aCH c925710aCH, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = "isReserveDirect_false";
        this.l1 = c19eg;
        this.l2 = c925710aCH;
        this.z3 = z;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS13S1210000_15(com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel r3, com.bytedance.android.livesdkapi.depend.model.LiveEffect r4, java.lang.String r5, boolean r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            if (r7 == 0) goto L12
            r1 = r2
            r1.l1 = r3
            r1.s0 = r5
            r1.l2 = r4
            r1.z3 = r6
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.z3 = r6
            r1.l1 = r3
            r1.s0 = r5
            r1.l2 = r4
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS13S1210000_15.<init>(com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel, com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S1210000_15(boolean z, MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, String str, DownloadInfo downloadInfo, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l1 = multiGuestSharedBgAnchorViewModel;
        this.s0 = str;
        this.l2 = downloadInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S1210000_15(boolean z, MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel, String str, C935650aSJ c935650aSJ, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l1 = multiGuestSharedBgGuestViewModel;
        this.s0 = str;
        this.l2 = c935650aSJ;
    }
}
