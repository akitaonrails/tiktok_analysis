package com.bytedance.android.livesdk.broadcast.preview.widget.serviceplus;

import X.AnonymousClass0101;
import X.C01GW;
import X.C01N7;
import X.C01QN;
import X.C06MM;
import X.C0IJT;
import X.C0IR5;
import X.C0IXL;
import X.C0J1N;
import X.C0JT6;
import X.C0KA3;
import X.C0PEM;
import X.C0UJW;
import X.C0UO0;
import X.C0UOP;
import X.C0UX6;
import X.C1097370ef9;
import X.C1097400efC;
import X.C1100630ekP;
import X.C1106750euH;
import X.C1108110ewT;
import X.C1119780fFI;
import X.C1121610fIF;
import X.C1121780fIW;
import X.C1121790fIX;
import X.C1121800fIY;
import X.C1121810fIZ;
import X.C1121860fIe;
import X.C1121950fIn;
import X.C1122150fJ7;
import X.C1148310fzJ;
import X.C1151480g4Q;
import X.C1161920gLG;
import X.C11RD;
import X.C1548820qPI;
import X.C1808280x9m;
import X.C1889207ac;
import X.C19EG;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C23250099c;
import X.C262100zr;
import X.C2660011e;
import X.C452501pT;
import X.C474500IjA;
import X.C480460Ism;
import X.C500260Jjc;
import X.C752520TfW;
import X.C752530TfX;
import X.C752700Tfo;
import X.C758410Tp1;
import X.C760180Trs;
import X.C770500UKi;
import X.C772050UQh;
import X.C781270Ukn;
import X.C823050WQl;
import X.EnumC1120860fH2;
import X.InterfaceC1097470efJ;
import X.InterfaceC1100640ekQ;
import X.InterfaceC1103460eoy;
import X.InterfaceC1106030et7;
import X.InterfaceC1107590evd;
import X.InterfaceC1121760fIU;
import X.InterfaceC1121770fIV;
import X.InterfaceC1121900fIi;
import X.InterfaceC1141530foN;
import X.InterfaceC2262081DgM;
import X.InterfaceC493650JXn;
import X.InterfaceC500940Jki;
import Y.ARunnableS112S0100000_12;
import Y.AfS186S0100000_17;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.chatroom.api.SMBKYBInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBKYCInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api.SmbDeactivationInfo;
import com.bytedance.android.livesdk.chatroom.api.UpsellIndustry;
import com.bytedance.android.livesdk.chatroom.api.UpsellInfo;
import com.bytedance.android.livesdk.chatroom.api.UpsellRevokeInfo;
import com.bytedance.android.livesdk.chatroom.api.VerificationWarningInfo;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.PcsServicePlusALogEnableSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onboarding.LivePcsCreatorRevampSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onboarding.LivePcsOptinPageUIStyleSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastPreviewBatchLoadSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.pcs.LivePcsOnboardingPerfOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.subscription.SubscribeUpsellLynxUrlSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LivePCSAnchorTitleAnaliseWithAISetting;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostPCS;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS661S0100000_12;
import kotlin.jvm.internal.AwS666S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SMBOptInQualificationResponse;
import webcast.api.sub.SmbPendingRevokeInfo;
import webcast.data.BottomContainerComponent;

/* JADX INFO: loaded from: classes18.dex */
public class PreviewServicePlusWidget extends PreviewToolBaseWidget implements InterfaceC1141530foN {
    public C1121790fIX LLILZLL;
    public long LLJILJIL;
    public boolean LLJILJILJ;
    public Boolean LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public volatile boolean LLJJIII;
    public Boolean LLJJIJI;
    public long LLJJIJIIJIL;
    public long LLJJIJIL;
    public long LLJJJ;
    public long LLJJJIL;
    public long LLJJJJ;
    public long LLJJJJJIL;
    public int LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLL;
    public Boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public Boolean LLJZIJLIL;
    public Boolean LLL;
    public boolean LLLF;
    public InterfaceC1097470efJ LLLII;
    public long LLLIIII;
    public SMBOptInQualificationResponse.ResponseData LLLIIIIL;
    public AwS561S0100000_17 LLLIILIL;
    public final InterfaceC493650JXn LLLILZJ;
    public final C1151480g4Q LLLILZLLLI;
    public final C1121610fIF LLIZ = new C1121610fIF();
    public final AwS666S0100000_17 LLIZLLLIL = new AwS666S0100000_17(this, 0);
    public final C1121780fIW LLJ = new C1121780fIW();
    public final AwS661S0100000_12 LLJI = new AwS661S0100000_12(this, 2);
    public final C1121860fIe LLJIJIL = new C1121860fIe();
    public String LLJLILLLLZIIL = "guidance";
    public final C01GW LLLFF = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(74));
    public final int LLLFFI = 2131856022;
    public final int LLLFZ = R.drawable.c55;
    public int LLLI = R.raw.icon_bubble_arrow;
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 188));
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 187));
    public final C01GW LLLIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(31));
    public final C1121810fIZ LLLILZ = new C1121810fIZ(0);

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a2  */
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1() {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.serviceplus.PreviewServicePlusWidget.E1():void");
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLLFZ);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final boolean N1() {
        return this.LLLI != R.raw.icon_bubble_arrow;
    }

    public final String Y1() {
        String str;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            C2660011e c2660011e = (C2660011e) dataChannel.gg0(C770500UKi.class);
            C1121950fIn c1121950fIn = (C1121950fIn) (c2660011e != null ? c2660011e.LIZ(C1121950fIn.class) : null);
            if (c1121950fIn != null && (str = c1121950fIn.LLIZLLLIL) != null) {
                return str;
            }
        }
        return "";
    }

    public final void a2() {
        User userLJIJJLI;
        View view = getView();
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        if (Intrinsics.LJFF(this.LLJJIJI, Boolean.FALSE)) {
            this.LLLIIII = System.currentTimeMillis();
            if (PreviewEnterFpsOptSetting.INSTANCE.enable()) {
                C823050WQl.LIZIZ().submit(new ARunnableS112S0100000_12(this, 283));
            } else {
                l2();
                C760180Trs.LJIIJJI(this.dataChannel, "service_plus");
            }
            this.LLJJIJI = Boolean.TRUE;
        }
        if (!this.LLJJLIIIJLLLLLLLZ && (!LivePcsCreatorRevampSetting.INSTANCE.isEnabled() || this.LLLIIIIL != null)) {
            e2(0, 0, 0, 0, 0, 0, 0, 0, "show");
            p2();
            C1121810fIZ c1121810fIZ = this.LLLILZ;
            if (PcsServicePlusALogEnableSetting.INSTANCE.getValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PreviewServicePlusWidget entrance show ");
                sbLIZ.append(C1121800fIY.LIZJ(c1121810fIZ));
                C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ));
            }
            C1121780fIW c1121780fIW = this.LLJ;
            VerificationWarningInfo verificationWarningInfo = c1121780fIW.LIZ;
            if (verificationWarningInfo != null && verificationWarningInfo.hasWarning) {
                Object value = this.LLLIIL.getValue();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_verification_warning_show");
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                c474500IjALIZ.LJJII((interfaceC500940JkiUser == null || (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) == null) ? null : Long.valueOf(userLJIJJLI.getId()), "anchor_id");
                if (!Intrinsics.LJFF(value, "service_plus_fyp_card") || value == null) {
                    value = "live_take_page";
                }
                c474500IjALIZ.LJJII(value, "show_entrance");
                c474500IjALIZ.LJJII(c1121780fIW.LIZ(), "permission_status");
                c474500IjALIZ.LIZ();
            }
            this.LLJJLIIIJLLLLLLLZ = true;
        }
        if (this.LLJL && !S1()) {
            C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_PREVIEW_SERVICE_PLUS_VERIFICATION;
            View view2 = getView();
            RedDotExtensionKt.LJI(view2 != null ? view2.findViewById(R.id.widget_red_dot) : null, this, this, c0ux6, new AwS596S0100000_17(this, 346));
        }
        o2();
    }

    public final void c2() {
        String string;
        InterfaceC2262081DgM currentUser;
        String secUid;
        if (this.LLJJIII) {
            return;
        }
        if (Intrinsics.LJFF(this.LLJILLL, Boolean.TRUE)) {
            show();
        }
        o2();
        C2660011e c2660011e = (C2660011e) this.dataChannel.gg0(C770500UKi.class);
        C1121950fIn c1121950fIn = (C1121950fIn) (c2660011e != null ? c2660011e.LIZ(C1121950fIn.class) : null);
        if (c1121950fIn != null) {
            c1121950fIn.LIZ(Boolean.valueOf(this.LLJJ == 1), 2, new AwS561S0100000_17(this, 348));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        String str = "";
        if (interfaceC500940JkiUser == null || (string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("user_id", string);
        InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
        if (interfaceC500940JkiUser2 != null && (currentUser = interfaceC500940JkiUser2.getCurrentUser()) != null && (secUid = currentUser.getSecUid()) != null) {
            str = secUid;
        }
        linkedHashMap.put("sec_user_id", str);
        C1097370ef9 c1097370ef9LIZ = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0().LIZ(linkedHashMap, linkedHashMap, linkedHashMap, this.context);
        this.LLLII = c1097370ef9LIZ;
        if (c1097370ef9LIZ != null) {
            ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0().LIZLLL();
            C1097400efC.LIZIZ(c1097370ef9LIZ);
        }
        this.LLJJIII = true;
    }

    public final void k2() {
        LivePcsOnboardingPerfOptSetting livePcsOnboardingPerfOptSetting = LivePcsOnboardingPerfOptSetting.INSTANCE;
        if (livePcsOnboardingPerfOptSetting.enabledFrontPrefetch()) {
            C1106750euH c1106750euHLJJIIZI = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0().LJJIIZI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearSmbQualification dataCenter=");
            sbLIZ.append(c1106750euHLJJIIZI);
            C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ));
            if (c1106750euHLJJIIZI != null) {
                c1106750euHLJJIIZI.LIZ("/webcast/sub/smb/qualification/", C2097608Jq.LJ());
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LivePcsOnboardingPerfOptSetting.enabledFrontPrefetch()=");
        sbLIZ2.append(livePcsOnboardingPerfOptSetting.enabledFrontPrefetch());
        C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ2));
        if (!livePcsOnboardingPerfOptSetting.enabledFrontPrefetch()) {
            W1();
            return;
        }
        C1106750euH c1106750euHLJJIIZI2 = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0().LJJIIZI();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("prefetchSmbQualification dataCenter=");
        sbLIZ3.append(c1106750euHLJJIIZI2);
        C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ3));
        if (c1106750euHLJJIIZI2 == null) {
            W1();
            return;
        }
        C20441214yg.LIZIZ("PCS", "prefetchSmbQualification prefetch");
        c1106750euHLJJIIZI2.LIZIZ(new C1100630ekP(C0KA3.LIZ), "/webcast/sub/smb/qualification/", C2097608Jq.LJ(), new AwS383S0200000_17(this, c1106750euHLJJIIZI2, 57), new AwS596S0100000_17(this, 345));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l2() {
        /*
            r9 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r9.dataChannel
            r2 = 0
            if (r1 == 0) goto L43
            java.lang.Class<X.0Tfo> r0 = X.C752700Tfo.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L43
            long r4 = r0.longValue()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L43
            r2 = r4
        L19:
            long r5 = r9.LLLIIII
            long r5 = r5 - r2
            X.0KAy r1 = X.C1826730xdX.LIZIZ()
            if (r1 == 0) goto L35
            X.0KRj r2 = new X.0KRj
            int r3 = r9.hashCode()
            java.lang.String r7 = "live_take_page"
            r8 = 0
            r4 = 40
            r2.<init>(r3, r4, r5, r7, r8)
            java.lang.String r0 = "ServicePlusEntranceBeforeLive"
            r1.LIZLLL(r0, r2)
        L35:
            X.01GW r0 = r9.LLLIL
            java.lang.Object r0 = r0.getValue()
            X.0fIV r0 = (X.InterfaceC1121770fIV) r0
            if (r0 == 0) goto L42
            r0.LIZ()
        L42:
            return
        L43:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r9.dataChannel
            if (r1 == 0) goto L19
            java.lang.Class<X.0Tp1> r0 = X.C758410Tp1.class
            java.lang.Object r0 = r1.gg0(r0)
            X.0UOP r0 = (X.C0UOP) r0
            if (r0 == 0) goto L19
            long r2 = r0.LIZ
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.serviceplus.PreviewServicePlusWidget.l2():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0397 A[PHI: r11
      0x0397: PHI (r11v5 boolean) = (r11v3 boolean), (r11v6 boolean) binds: [B:144:0x04f9, B:92:0x0395] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o2() {
        /*
            Method dump skipped, instruction units count: 1558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.serviceplus.PreviewServicePlusWidget.o2():void");
    }

    public final void p2() {
        C1121810fIZ c1121810fIZ = this.LLLILZ;
        String str = (String) this.LLLIIL.getValue();
        if (!Intrinsics.LJFF(str, "service_plus_fyp_card") || str == null) {
            str = "live_take_page";
        }
        c1121810fIZ.LIZJ = str;
        this.LLLILZ.LIZIZ = C500260Jjc.LJJJI(Boolean.valueOf(this.LLLIIIIL != null)) ? 1 : 0;
        C1121810fIZ c1121810fIZ2 = this.LLLILZ;
        SMBOptInQualificationResponse.ResponseData responseData = this.LLLIIIIL;
        c1121810fIZ2.LJ = C500260Jjc.LJJJI(responseData != null ? Boolean.valueOf(responseData.qualification) : null) ? 1 : 0;
        C1121810fIZ c1121810fIZ3 = this.LLLILZ;
        c1121810fIZ3.LIZLLL = this.LLJJ;
        c1121810fIZ3.LJFF = this.LLJJJJLIIL;
        c1121810fIZ3.LJI = C500260Jjc.LJJJI(Boolean.valueOf(this.LLJLLL)) ? 1 : 0;
        this.LLLILZ.LJII = C500260Jjc.LJJJI(Boolean.valueOf(this.LLJZ)) ? 1 : 0;
        C1121810fIZ c1121810fIZ4 = this.LLLILZ;
        c1121810fIZ4.LJIIIIZZ = (this.LLJJJJLIIL == 10 || this.LLJZ) ? "disabled" : this.LLJLLL ? "warning" : "available";
        c1121810fIZ4.LJIIIZ = C500260Jjc.LJJJI(this.LLJZIJLIL) ? 1 : 0;
    }

    public PreviewServicePlusWidget() {
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0().LIZLLL();
        C1097400efC.LIZ();
        if (BroadcastPreviewBatchLoadSetting.INSTANCE.enable()) {
            C781270Ukn.LJJIII().pa();
            this.LLLILZJ = C1108110ewT.LIZJ();
        }
        this.LLLILZLLLI = new C1151480g4Q(this, 0);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        Boolean bool = this.LLJILLL;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            show();
        }
        if (C500260Jjc.LJJJJIZL(getView()) && Intrinsics.LJFF(this.LLJILLL, bool2)) {
            C760180Trs.LJIIJJI(this.dataChannel, "service_plus");
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer L1() {
        return Integer.valueOf(C760180Trs.LJFF() ? this.LLLI : 0);
    }

    public final void W1() {
        p2();
        C1121800fIY.LIZIZ("request_start", this.LLLILZ, "");
        C480460Ism.LIZ().getClass();
        ((C0J1N) C1808280x9m.LJFF(((PcsApi) C480460Ism.LIZLLL(PcsApi.class)).getSmbQualification().LJIILIIL(new C0UO0()), (String) this.LLLIIIL.getValue(), "/sub/smb/qualification/", null, 12).LIZJ(C11RD.LJ(this))).LIZ(new AfS186S0100000_17(this, 25), new AfS186S0100000_17(this, 26));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C01QN(this, null), 2);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        super.onDestroy();
        C20441214yg.LIZIZ("PreviewServicePlusWidget", "onDestroy");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C772050UQh.class, "");
        }
        C1121790fIX c1121790fIX = this.LLILZLL;
        if (c1121790fIX != null && c1121790fIX.LIZJ) {
            C20441214yg.LIZIZ("ServicePlusTitleUnderstandingDelegate", "unload Model");
            ((IHostPCS) C1161920gLG.LIZJ(IHostPCS.class)).jb2(LivePCSAnchorTitleAnaliseWithAISetting.INSTANCE.getAndroidScene());
        }
        InterfaceC1097470efJ interfaceC1097470efJ = this.LLLII;
        if (interfaceC1097470efJ != null) {
            ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0().LIZLLL();
            C1097400efC.LIZJ(interfaceC1097470efJ);
        }
        Activity activityLIZ = C06MM.LIZ(this.context);
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            supportFragmentManager.LLIILZL(this.LLLILZLLLI);
        }
        p2();
        C1121810fIZ c1121810fIZ = this.LLLILZ;
        if (PcsServicePlusALogEnableSetting.INSTANCE.getValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PreviewServicePlusWidget entrance hide ");
            sbLIZ.append(C1121800fIY.LIZJ(c1121810fIZ));
            C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDetachWidget() {
        super.onDetachWidget();
        C20441214yg.LIZIZ("PreviewServicePlusWidget", "onDetachWidget");
        C1548820qPI.LJIIIIZZ("smb_optin_process_ended", this);
        C1548820qPI.LJIIIIZZ("pcs_fe_go_live", this);
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        if (this.LLLF) {
            this.LLLF = false;
            k2();
        }
        AwS561S0100000_17 awS561S0100000_17 = this.LLLIILIL;
        if (awS561S0100000_17 != null) {
            awS561S0100000_17.invoke();
            this.LLLIILIL = null;
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLLFFI;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        a2();
    }

    public static void i2(InterfaceC1100640ekQ interfaceC1100640ekQ) {
        if (!LivePcsOnboardingPerfOptSetting.INSTANCE.enabledDownstreamPrefetch()) {
            C20441214yg.LIZIZ("PCS", "prefetchSmbOptInProgress skipped (downstream prefetch disabled)");
            return;
        }
        C20441214yg.LIZIZ("PCS", "prefetchSmbOptInProgress request");
        interfaceC1100640ekQ.LIZIZ(new C1100630ekP(C0KA3.LIZ), "/webcast/smb/opt_in/progress/", C2097608Jq.LJ(), AFwS254S0000000_17.get$arr$(40), AFwS254S0000000_17.get$arr$(41));
    }

    public final void b2(SMBOptInQualificationResponse.ResponseData responseData) {
        int i;
        boolean z;
        boolean z2;
        Integer numValueOf;
        Integer numValueOf2;
        int i2;
        String string;
        SMBKYCInfo sMBKYCInfo;
        SMBKYBInfo sMBKYBInfo;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleSmbQualification ");
        sbLIZ.append(responseData);
        C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJ = responseData.servicePlusOptInStatus;
        C752530TfX c752530TfXLIZ = C752520TfW.LIZ();
        int i3 = this.LLJJ;
        c752530TfXLIZ.LIZ = i3;
        if (i3 == 5) {
            C1106750euH c1106750euHLJJIIZI = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0().LJJIIZI();
            if (c1106750euHLJJIIZI != null) {
                i2(c1106750euHLJJIIZI);
            }
            if (!LivePcsOnboardingPerfOptSetting.INSTANCE.enabledWebp()) {
                C20441214yg.LIZIZ("PCS", "triggerOnboardingShowcaseGeckoPreload skipped (webp disabled)");
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("triggerOnboardingShowcaseGeckoPreload channel=");
                sbLIZ2.append("tiktok_live_pcs_onboarding_1_webp");
                C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ2));
                IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
                if (iHostResource != null) {
                    iHostResource.ud2("tiktok_live_pcs_onboarding_1_webp");
                }
            }
        }
        int i4 = this.LLJJ;
        if (i4 != 1 && i4 != 5) {
            if (!LivePcsOnboardingPerfOptSetting.INSTANCE.enabledWebp()) {
                C20441214yg.LIZIZ("PCS", "triggerOnboardingFrontGeckoPreload skipped (webp disabled)");
            } else {
                if (LivePcsOptinPageUIStyleSetting.INSTANCE.getValue() == 1) {
                    str = "tiktok_live_pcs_onboarding_front_a_webp";
                } else {
                    str = "tiktok_live_pcs_onboarding_front_b_webp";
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("triggerOnboardingFrontGeckoPreload channel=");
                sbLIZ3.append(str);
                C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ3));
                IHostResource iHostResource2 = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
                if (iHostResource2 != null) {
                    iHostResource2.ud2(str);
                }
            }
        }
        UpsellRevokeInfo upsellRevokeInfo = responseData.revokeInfo;
        if (upsellRevokeInfo != null) {
            i = upsellRevokeInfo.revokeReason;
        } else {
            i = 0;
        }
        this.LLJJJJLIIL = i;
        this.LLJLLIL = Boolean.valueOf(responseData.inBlockIndustryCoolingDown);
        this.LLLI = R.raw.icon_bubble_arrow;
        T1((ImageView) findViewById(R.id.widget_icon));
        SmbPendingRevokeInfo smbPendingRevokeInfo = responseData.smbPendingRevokeInfo;
        if (smbPendingRevokeInfo != null) {
            z = smbPendingRevokeInfo.isPendingRevoke;
        } else {
            z = false;
        }
        this.LLJLLL = z;
        SMBOptInQualificationResponse.SmbDeactivationInfo smbDeactivationInfo = responseData.smbDeactivationInfo;
        if (smbDeactivationInfo != null) {
            z2 = smbDeactivationInfo.isSmbDeactivated;
        } else {
            z2 = false;
        }
        this.LLJZ = z2;
        this.LLIZ.LIZJ(z);
        this.LLIZ.LJ(this.LLJZ);
        this.LLIZ.LIZLLL(this.LLJJJJLIIL);
        this.LLIZ.LIZ(this.dataChannel, this.LLIZLLLIL);
        this.LLJ.LIZIZ(this.dataChannel, responseData.verificationWarningInfo, this.LLJI);
        InterfaceC1121770fIV interfaceC1121770fIV = (InterfaceC1121770fIV) this.LLLIL.getValue();
        if (interfaceC1121770fIV != null) {
            interfaceC1121770fIV.LIZIZ(responseData.servicePlusOptInStatus);
        }
        Integer numValueOf3 = null;
        if (responseData.canUseAiDmGeneration) {
            C0JT6<Boolean> c0jt6 = InterfaceC1106030et7.m8;
            Boolean boolLIZ = c0jt6.LIZ();
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.LJFF(boolLIZ, bool)) {
                c0jt6.LIZJ(bool);
                m2(this, EnumC1120860fH2.GOLIVE_GUIDE_SERVICE_PLUS_AIGC_CHAT_BUILDER, 2131851603, null, 4);
            }
        }
        InterfaceC1121900fIi interfaceC1121900fIiLJFF = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).UN1().LIZJ().LJFF();
        if (interfaceC1121900fIiLJFF != null) {
            int i5 = responseData.servicePlusOptInStatus;
            boolean z3 = responseData.qualification;
            long j = responseData.activeSkuCount;
            SMBVerificationInfo sMBVerificationInfo = responseData.verificationInfo;
            if (sMBVerificationInfo != null && (sMBKYBInfo = sMBVerificationInfo.kybInfo) != null) {
                numValueOf = Integer.valueOf(sMBKYBInfo.status);
            } else {
                numValueOf = null;
            }
            SMBVerificationInfo sMBVerificationInfo2 = responseData.verificationInfo;
            if (sMBVerificationInfo2 != null && (sMBKYCInfo = sMBVerificationInfo2.kycInfo) != null) {
                numValueOf2 = Integer.valueOf(sMBKYCInfo.status);
            } else {
                numValueOf2 = null;
            }
            boolean z4 = responseData.inBlockIndustryCoolingDown;
            UpsellRevokeInfo upsellRevokeInfo2 = responseData.revokeInfo;
            if (upsellRevokeInfo2 != null) {
                i2 = upsellRevokeInfo2.revokeReason;
            } else {
                i2 = 0;
            }
            Integer numValueOf4 = Integer.valueOf(responseData.inferredIndustryType);
            if (numValueOf4.intValue() != 0) {
                string = numValueOf4.toString();
            } else {
                string = null;
            }
            UpsellIndustry upsellIndustry = responseData.selectedIndustryExtra;
            if (upsellIndustry != null) {
                numValueOf3 = Integer.valueOf(upsellIndustry.industryType);
            }
            interfaceC1121900fIiLJFF.LJII(new C1889207ac(i5, z3, j, numValueOf, numValueOf2, z4, i2, string, numValueOf3));
        }
        this.LLLIIIIL = responseData;
        p2();
        C1121800fIY.LIZIZ("request_success", this.LLLILZ, "hasData=1");
        if (LivePcsCreatorRevampSetting.INSTANCE.isEnabled() && !this.LLJJLIIIJLLLLLLLZ) {
            a2();
        }
    }

    public final void d2(String str) {
        Long lValueOf;
        User userLJIJJLI;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_entrance_bubble_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) != null) {
            lValueOf = Long.valueOf(userLJIJJLI.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        c474500IjALIZ.LJJII("", "room_id");
        c474500IjALIZ.LJJII("live_take_page", "show_entrance");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII(str, "bubble_type");
        c474500IjALIZ.LIZ();
    }

    public final void f2(String str) {
        Long lValueOf;
        User userLJIJJLI;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) != null) {
            lValueOf = Long.valueOf(userLJIJJLI.getId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        String smbIndustryBlockPage = SubscribeUpsellLynxUrlSetting.INSTANCE.getSmbIndustryBlockPage(str, strValueOf, strValueOf, true, true, this.LLJZIJLIL, Y1(), "serviceplus");
        Context context = this.context;
        if (context != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, smbIndustryBlockPage);
        }
    }

    public final void h2(String str) {
        AnonymousClass0101 anonymousClass0101LIZ;
        long j;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        String secUid = UserService.getInstance().user().LJIJJLI().getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        C2660011e c2660011e = (C2660011e) this.dataChannel.gg0(C770500UKi.class);
        if (c2660011e != null) {
            anonymousClass0101LIZ = c2660011e.LIZ(C1121950fIn.class);
        } else {
            anonymousClass0101LIZ = null;
        }
        C1121950fIn c1121950fIn = (C1121950fIn) anonymousClass0101LIZ;
        if (c1121950fIn != null) {
            j = c1121950fIn.LLIZ;
        } else {
            j = 0;
        }
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJIJ(this.context, new PcsServicePlusOptinPageParams(strValueOf, secUid, str, j, Y1(), new HashMap()));
    }

    public final void j2(GetSubInfoResponse getSubInfoResponse) {
        Map mapLJIIZILJ;
        Boolean boolValueOf;
        int i;
        int i2;
        int i3;
        Boolean boolValueOf2;
        SmbDeactivationInfo smbDeactivationInfo;
        String str;
        Integer numLJIIJJI;
        boolean z;
        UpsellInfo upsellInfo;
        UpsellRevokeInfo upsellRevokeInfo;
        Map<String, String> map;
        BottomContainerComponent bottomContainerComponentLIZ = C0UJW.LIZ(20);
        VerificationWarningInfo verificationWarningInfo = null;
        if (bottomContainerComponentLIZ != null && (map = bottomContainerComponentLIZ.extra) != null) {
            mapLJIIZILJ = C2097608Jq.LJIIZILJ(map);
        } else {
            mapLJIIZILJ = null;
        }
        if (getSubInfoResponse != null) {
            boolValueOf = Boolean.valueOf(getSubInfoResponse.smbDisplay);
        } else {
            boolValueOf = Boolean.FALSE;
        }
        this.LLJILLL = boolValueOf;
        boolean z2 = false;
        if (getSubInfoResponse != null) {
            i = getSubInfoResponse.smbOptInStatus;
        } else {
            i = 0;
        }
        this.LLJJ = i;
        if (getSubInfoResponse != null) {
            i2 = getSubInfoResponse.smbOptInSource;
        } else {
            i2 = 0;
        }
        this.LLJJI = i2;
        if (getSubInfoResponse != null && (upsellInfo = getSubInfoResponse.upsellInfo) != null && (upsellRevokeInfo = upsellInfo.revokeInfo) != null) {
            i3 = upsellRevokeInfo.revokeReason;
        } else {
            i3 = 0;
        }
        this.LLJJJJLIIL = i3;
        if (mapLJIIZILJ != null && (str = (String) mapLJIIZILJ.get("revocation_restored")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            if (numLJIIJJI.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf2 = Boolean.valueOf(z);
        } else {
            boolValueOf2 = null;
        }
        this.LLJZIJLIL = boolValueOf2;
        C752520TfW.LIZ().LIZ = this.LLJJ;
        if (getSubInfoResponse != null && (smbDeactivationInfo = getSubInfoResponse.smbDeactivationInfo) != null && smbDeactivationInfo.isSmbDeactivated) {
            z2 = true;
        }
        this.LLJZ = z2;
        this.LLIZ.LJ(z2);
        this.LLIZ.LIZLLL(this.LLJJJJLIIL);
        C1121780fIW c1121780fIW = this.LLJ;
        if (getSubInfoResponse != null) {
            verificationWarningInfo = getSubInfoResponse.smbVerificationWarningInfo;
        }
        c1121780fIW.LIZ = verificationWarningInfo;
        InterfaceC1121900fIi interfaceC1121900fIiLJFF = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).UN1().LIZJ().LJFF();
        if (interfaceC1121900fIiLJFF != null) {
            interfaceC1121900fIiLJFF.LJIIIIZZ(this.LLJJ);
        }
        if (Intrinsics.LJFF(this.LLJILLL, Boolean.TRUE)) {
            c2();
        } else {
            hide();
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String string;
        String str = c262100zr.LIZ;
        Object string2 = null;
        if (Intrinsics.LJFF(str, "smb_optin_process_ended")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                string = interfaceC1107590evd.getString(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            } else {
                string = null;
            }
            if (Intrinsics.LJFF(string, "success")) {
                C2660011e c2660011e = (C2660011e) this.dataChannel.gg0(C770500UKi.class);
                if (c2660011e != null) {
                    string2 = c2660011e.LIZ(C1121950fIn.class);
                }
                C1121950fIn c1121950fIn = (C1121950fIn) string2;
                if (c1121950fIn != null && c1121950fIn.LLILLJJLI == 1) {
                    this.LLLIILIL = new AwS561S0100000_17(this, 347);
                }
                InterfaceC1121770fIV interfaceC1121770fIV = (InterfaceC1121770fIV) this.LLLIL.getValue();
                if (interfaceC1121770fIV != null) {
                    interfaceC1121770fIV.LIZIZ(1);
                }
                InterfaceC1121900fIi interfaceC1121900fIiLJFF = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).UN1().LIZJ().LJFF();
                if (interfaceC1121900fIiLJFF != null) {
                    interfaceC1121900fIiLJFF.LJIIIIZZ(1);
                }
                InterfaceC1121760fIU interfaceC1121760fIULIZIZ = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).UN1().LIZIZ();
                if (interfaceC1121760fIULIZIZ != null) {
                    interfaceC1121760fIULIZIZ.LIZJ();
                    interfaceC1121760fIULIZIZ.LIZLLL();
                    return;
                }
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "pcs_fe_go_live")) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        if (interfaceC1107590evd2 != null) {
            string2 = interfaceC1107590evd2.getString("show_entrance");
        }
        this.dataChannel.SX0(C772050UQh.class, string2);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_PREVIEW_SERVICE_PLUS_VERIFICATION);
        long j = 7000;
        if (System.currentTimeMillis() - this.LLJJIJIIJIL < j) {
            i = 1;
        } else {
            i = 0;
        }
        if (System.currentTimeMillis() - 0 < j) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (System.currentTimeMillis() - this.LLJJIJIL < j) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (System.currentTimeMillis() - this.LLJJJ < j) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (System.currentTimeMillis() - this.LLJJJIL < j) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        if (System.currentTimeMillis() - this.LLJJJJ < j) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        if (System.currentTimeMillis() - this.LLJILJIL < j) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (System.currentTimeMillis() - this.LLJJJJJIL < j) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        e2(i, i2, i3, i4, i5, i6, i7, i8, "click");
        if (i8 == 1) {
            str = "live_tool_script";
        } else {
            str = "";
        }
        X1(this, false, null, str, 3);
        this.LLLF = true;
        Activity activityLIZ = C06MM.LIZ(this.context);
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            supportFragmentManager.LJZL(this.LLLILZLLLI, false);
        }
    }

    public final void g2(String str, String str2) {
        User userLJIJJLI;
        String secUid;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        Long lValueOf = null;
        if (interfaceC500940JkiUser != null) {
            userLJIJJLI = interfaceC500940JkiUser.LJIJJLI();
            if (userLJIJJLI != null) {
                lValueOf = Long.valueOf(userLJIJJLI.getId());
            }
        } else {
            userLJIJJLI = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        SubscribeUpsellLynxUrlSetting subscribeUpsellLynxUrlSetting = SubscribeUpsellLynxUrlSetting.INSTANCE;
        if (userLJIJJLI == null || (secUid = userLJIJJLI.getSecUid()) == null) {
            secUid = "";
        }
        String smbManagementPage = subscribeUpsellLynxUrlSetting.getSmbManagementPage(str, strValueOf, secUid, strValueOf, this.LLJLIL, Y1(), str2, false);
        Context context = this.context;
        if (context != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, smbManagementPage);
        }
    }

    public static void X1(PreviewServicePlusWidget previewServicePlusWidget, boolean z, String str, String str2, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = (String) previewServicePlusWidget.LLLIIIL.getValue();
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        Boolean bool = previewServicePlusWidget.LLJLLIL;
        Boolean bool2 = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(bool, bool2);
        previewServicePlusWidget.p2();
        int i2 = previewServicePlusWidget.LLJJJJLIIL;
        if (i2 != 10 && i2 != 5) {
            if (previewServicePlusWidget.LLJLLL) {
                C1121810fIZ c1121810fIZ = previewServicePlusWidget.LLLILZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isPendingRevoke=");
                sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(previewServicePlusWidget.LLJLLL)) ? 1 : 0);
                sbLIZ.append(", isFromScheme=");
                sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
                sbLIZ.append(", showEntrance=");
                sbLIZ.append(str);
                C1121800fIY.LIZ("open_management_page", c1121810fIZ, C2188811AlT.LIZIZ(sbLIZ));
                previewServicePlusWidget.g2(str, "");
                return;
            }
            if (i2 == 0 && !zLJFF && !Intrinsics.LJFF(previewServicePlusWidget.LLJZIJLIL, bool2)) {
                VerificationWarningInfo verificationWarningInfo = previewServicePlusWidget.LLJ.LIZ;
                if (verificationWarningInfo != null && verificationWarningInfo.warningType == 2) {
                    C1121810fIZ c1121810fIZ2 = previewServicePlusWidget.LLLILZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("trigger=verification_warning_revoked, isFromScheme=");
                    sbLIZ2.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
                    sbLIZ2.append(", showEntrance=");
                    sbLIZ2.append(str);
                    C1121800fIY.LIZ("open_block_industry_page", c1121810fIZ2, C2188811AlT.LIZIZ(sbLIZ2));
                    previewServicePlusWidget.f2(str);
                    return;
                }
                if (previewServicePlusWidget.LLJJ == 1) {
                    C1121810fIZ c1121810fIZ3 = previewServicePlusWidget.LLLILZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("isFromScheme=");
                    sbLIZ3.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
                    sbLIZ3.append(", showEntrance=");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", locateTo=");
                    sbLIZ3.append(str2);
                    C1121800fIY.LIZ("open_management_page", c1121810fIZ3, C2188811AlT.LIZIZ(sbLIZ3));
                    previewServicePlusWidget.g2(str, str2);
                    return;
                }
                if (previewServicePlusWidget.LLJZ) {
                    C1121810fIZ c1121810fIZ4 = previewServicePlusWidget.LLLILZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("isSmbDeactivated=");
                    sbLIZ4.append(previewServicePlusWidget.LLJZ);
                    sbLIZ4.append(", isFromScheme=");
                    sbLIZ4.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
                    sbLIZ4.append(", showEntrance=");
                    sbLIZ4.append(str);
                    C1121800fIY.LIZ("open_management_page", c1121810fIZ4, C2188811AlT.LIZIZ(sbLIZ4));
                    previewServicePlusWidget.g2(str, "");
                    return;
                }
                C1121810fIZ c1121810fIZ5 = previewServicePlusWidget.LLLILZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("isFromScheme=");
                sbLIZ5.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
                sbLIZ5.append(", showEntrance=");
                sbLIZ5.append(str);
                C1121800fIY.LIZ("open_optin_page", c1121810fIZ5, C2188811AlT.LIZIZ(sbLIZ5));
                previewServicePlusWidget.h2(str);
                return;
            }
            C1121810fIZ c1121810fIZ6 = previewServicePlusWidget.LLLILZ;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("isFromScheme=");
            sbLIZ6.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
            sbLIZ6.append(", showEntrance=");
            sbLIZ6.append(str);
            C1121800fIY.LIZ("open_block_industry_page", c1121810fIZ6, C2188811AlT.LIZIZ(sbLIZ6));
            previewServicePlusWidget.f2(str);
            return;
        }
        C1121810fIZ c1121810fIZ7 = previewServicePlusWidget.LLLILZ;
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("revokeReason=");
        sbLIZ7.append(previewServicePlusWidget.LLJJJJLIIL);
        sbLIZ7.append(", isFromScheme=");
        sbLIZ7.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
        sbLIZ7.append(", showEntrance=");
        sbLIZ7.append(str);
        C1121800fIY.LIZ("open_optin_page", c1121810fIZ7, C2188811AlT.LIZIZ(sbLIZ7));
        previewServicePlusWidget.h2(str);
    }

    public static void m2(PreviewServicePlusWidget previewServicePlusWidget, EnumC1120860fH2 enumC1120860fH2, int i, String str, int i2) {
        String str2 = str;
        int i3 = i;
        if ((i2 & 2) != 0) {
            previewServicePlusWidget.getClass();
            i3 = 2131856021;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if (previewServicePlusWidget.isShowing()) {
            C1119780fFI.LIZ(i3, 0, 0, previewServicePlusWidget.getView(), enumC1120860fH2, previewServicePlusWidget.dataChannel, null, str2, AFwS205S0000000_17.get$arr$(258), AFwS205S0000000_17.get$arr$(259));
        }
    }

    public static void n2(PreviewServicePlusWidget previewServicePlusWidget, EnumC1120860fH2 enumC1120860fH2, int i, String str, int i2, int i3, Function0 function0, Function0 function02, int i4) {
        Function0 function03 = function0;
        int i5 = i3;
        int i6 = i2;
        String str2 = str;
        Function0 function04 = function02;
        int i7 = i;
        if ((i4 & 2) != 0) {
            previewServicePlusWidget.getClass();
            i7 = 2131856021;
        }
        if ((i4 & 4) != 0) {
            str2 = "";
        }
        if ((i4 & 8) != 0) {
            i6 = 0;
        }
        if ((i4 & 16) != 0) {
            i5 = 0;
        }
        if ((i4 & 32) != 0) {
            function03 = AFwS205S0000000_17.get$arr$(158);
        }
        if ((i4 & 64) != 0) {
            function04 = AFwS205S0000000_17.get$arr$(159);
        }
        if (previewServicePlusWidget.isShowing()) {
            C1119780fFI.LIZ(i7, i6, i5, previewServicePlusWidget.getView(), enumC1120860fH2, previewServicePlusWidget.dataChannel, null, str2, function03, function04);
        }
    }

    public final void e2(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str) {
        Map mapLIZ;
        Object obj;
        Object objValueOf;
        int i9;
        Object obj2;
        int i10;
        Integer numValueOf;
        Object objLIZIZ;
        Integer numValueOf2;
        C0IXL c0ixl;
        Object obj3;
        boolean z;
        C0UOP c0uop;
        Long l;
        User userLJIJJLI;
        InterfaceC1103460eoy interfaceC1103460eoyEi;
        IPcsService iPcsService = (IPcsService) C1161920gLG.LIZJ(IPcsService.class);
        if (iPcsService != null && (interfaceC1103460eoyEi = iPcsService.ei()) != null) {
            interfaceC1103460eoyEi.LIZ();
            mapLIZ = C01N7.LIZ(Y1());
        } else {
            mapLIZ = null;
        }
        Boolean bool = this.LLJZIJLIL;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            obj = "restorable";
        } else {
            int i11 = this.LLJJJJLIIL;
            if (i11 != 10 && !this.LLJZ && i11 == 0) {
                obj = "normal";
            } else {
                obj = "revoked";
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_entrance");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) != null) {
            objValueOf = Long.valueOf(userLJIJJLI.getId());
        } else {
            objValueOf = null;
        }
        c474500IjALIZ.LJJII(objValueOf, "anchor_id");
        Object obj4 = "";
        c474500IjALIZ.LJJII("", "room_id");
        if (this.LLJJ == 1) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i9), "is_opt_in");
        Object value = this.LLLIIL.getValue();
        if (!Intrinsics.LJFF(value, "service_plus_fyp_card") || value == null) {
            value = "live_take_page";
        }
        c474500IjALIZ.LJJII(value, "show_entrance");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "has_upgrade_bubble");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "has_title_understanding_bubble");
        c474500IjALIZ.LJJII(Integer.valueOf(i6), "has_third_party_service_bubble");
        c474500IjALIZ.LJJII(Integer.valueOf(i8), "has_content_template_bubble");
        c474500IjALIZ.LJJII(Integer.valueOf(Math.max(i3, Math.max(i4, i5))), "has_service_bio_activation_bubble");
        if (i5 > 0) {
            obj2 = "revoke";
        } else if (i4 > 0) {
            obj2 = "update_service";
        } else if (i3 <= 0) {
            obj2 = "";
        } else {
            obj2 = "activate_service";
        }
        c474500IjALIZ.LJJII(obj2, "service_bio_activation_bubble_type");
        Object obj5 = CardStruct.IStatusCode.DEFAULT;
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "has_upgrade_red_dot");
        c474500IjALIZ.LJJII(this.LLLILZ.LJIIIIZZ, "icon_status");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(this.LLJJL)) ? 1 : 0), "is_kyb_tools_bubble");
        c474500IjALIZ.LJJII(String.valueOf(this.LLJLIL ? 1 : 0), "has_verify_red_dot");
        if (this.LLJLIL) {
            c474500IjALIZ.LJJII(this.LLJLILLLLZIIL, "verify_notice_type");
        }
        if (Intrinsics.LJFF(str, "click")) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (l = (Long) dataChannel.gg0(C752700Tfo.class)) != null && l.longValue() != 0) {
                obj5 = "1";
            }
            c474500IjALIZ.LJJII(obj5, "is_more_clicked");
            c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis - this.LLLIIII), "click_duration");
            C0UOP c0uop2 = (C0UOP) this.dataChannel.gg0(C758410Tp1.class);
            if (c0uop2 != null) {
                c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis - c0uop2.LJ), "click_time");
            }
        }
        if (Intrinsics.LJFF(str, "show") && (c0uop = (C0UOP) this.dataChannel.gg0(C758410Tp1.class)) != null) {
            c474500IjALIZ.LJJII(Long.valueOf(this.LLLIIII - c0uop.LJ), "show_latency");
        }
        VerificationWarningInfo verificationWarningInfo = this.LLJ.LIZ;
        if (verificationWarningInfo != null && verificationWarningInfo.hasWarning) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        c474500IjALIZ.LJJII(String.valueOf(i10), "has_verify_warning");
        c474500IjALIZ.LJJII(this.LLJ.LIZ(), "permission_status");
        c474500IjALIZ.LJJII(Integer.valueOf(i7), "is_industry_verify_bubble");
        c474500IjALIZ.LJJII(obj, "revoke_status");
        if (Intrinsics.LJFF(obj, "restorable")) {
            if (Intrinsics.LJFF(this.LLJZIJLIL, bool2) && !Intrinsics.LJFF(InterfaceC1106030et7.i8.LIZ(), bool2)) {
                z = true;
            } else {
                z = false;
            }
            c474500IjALIZ.LJJII(String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "has_restore_bubble");
        }
        c474500IjALIZ.LJJII(this.LLLIIL.getValue(), "previous_page");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII(str, "action_type");
        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
        if (c0ir5 != null && (c0ixl = c0ir5.LJFF) != null && (obj3 = c0ixl.LJFF) != null) {
            obj4 = obj3;
        }
        c474500IjALIZ.LJJII(obj4, "live_action_type");
        c474500IjALIZ.LJJIIZI(mapLIZ);
        SMBOptInQualificationResponse.ResponseData responseData = this.LLLIIIIL;
        if (responseData != null) {
            c474500IjALIZ.LJJII(String.valueOf(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(responseData))) ? 1 : 0)), "smb_tag");
            SMBOptInQualificationResponse.ResponseData responseData2 = this.LLLIIIIL;
            if (responseData2 != null) {
                numValueOf = Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(responseData2))) ? 1 : 0);
            } else {
                numValueOf = null;
            }
            c474500IjALIZ.LJJII(String.valueOf(numValueOf), "region_support_kyb");
            SMBOptInQualificationResponse.ResponseData responseData3 = this.LLLIIIIL;
            if (responseData3 != null) {
                objLIZIZ = C1122150fJ7.LIZIZ(responseData3);
            } else {
                objLIZIZ = null;
            }
            c474500IjALIZ.LJJII(objLIZIZ, "industry_tag");
            SMBOptInQualificationResponse.ResponseData responseData4 = this.LLLIIIIL;
            if (responseData4 != null) {
                numValueOf2 = Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(responseData4))) ? 1 : 0);
            } else {
                numValueOf2 = null;
            }
            c474500IjALIZ.LJJII(String.valueOf(numValueOf2), "existing_verification");
        }
        c474500IjALIZ.LIZ();
    }
}
