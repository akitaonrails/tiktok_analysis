package com.bytedance.android.livesdk.usermanage;

import X.C099R;
import X.C09JN;
import X.C0IXW;
import X.C0KXC;
import X.C0TYC;
import X.C0UO0;
import X.C1106210etP;
import X.C1161920gLG;
import X.C11HU;
import X.C11NJ;
import X.C11S5;
import X.C1701940uOG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C482260Ivg;
import X.C488040JBy;
import X.C745220TLc;
import X.C749670Tav;
import X.C749810Tb9;
import X.C749830TbB;
import X.C749860TbE;
import X.C750740Tce;
import X.C751460Tdo;
import X.C759930TrT;
import X.C759940TrU;
import X.C759990TrZ;
import X.C930760aKQ;
import X.DialogC752370TfH;
import X.InterfaceC1364105Vn;
import X.InterfaceC2183451Acp;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import X.InterfaceC749850TbD;
import X.InterfaceC750020TbU;
import X.InterfaceC750500TcG;
import X.InterfaceC752380TfI;
import X.InterfaceC760020Trc;
import X.InterfaceC775230Ub3;
import Y.AfS0S0110200_12;
import Y.AfS181S0100000_12;
import Y.AfS1S1110200_12;
import Y.AfS3S0200100_12;
import Y.AfS4S0100100_12;
import Y.AfS56S0110000_12;
import Y.AfS63S0400000_12;
import Y.AfS64S0201000_12;
import Y.AfS80S0101000_12;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMuteCommentsListSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveReportViolationPreloadSetting;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.usermanage.UserManageService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import qo2.w;
import tikcast.api.perception.ViolationStatusResponse;

/* JADX INFO: loaded from: classes13.dex */
public class UserManageService implements IUserManageService {
    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final boolean aQ0() {
        return C488040JBy.LIZ(2);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final boolean gQ0() {
        return C488040JBy.LIZ(3);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final boolean hw0() {
        return C488040JBy.LIZ(4);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final boolean OX1() {
        return C488040JBy.LIZ(16);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final String hL0() {
        return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vp0() ? "manual_pk" : ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9() ? "anchor" : ((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJII() > 0 ? "audience" : Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C930760aKQ.class), Boolean.TRUE) ? "group_live" : "regular";
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final boolean py0() {
        return C488040JBy.LIZ(8);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final boolean qA2() {
        return C488040JBy.LIZ(12);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final C745220TLc Ru0() {
        return C751460Tdo.LIZ();
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final int mx() {
        return C0TYC.LIZ(C751460Tdo.LIZ());
    }

    public static String LIZ(C759930TrT c759930TrT) {
        InterfaceC2262081DgM currentUser;
        if (UserService.getInstance().user() != null && (currentUser = UserService.getInstance().user().getCurrentUser()) != null) {
            if (currentUser.getId() == c759930TrT.LIZLLL) {
                return "anchor";
            }
            if (currentUser.getUserAttr() != null && currentUser.getUserAttr().isAdmin) {
                return "admin";
            }
            if (c759930TrT.LJJIII) {
                return "guest_viewer";
            }
            return "viewer";
        }
        return "";
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void KW0(C749810Tb9 c749810Tb9) {
        WeakReference weakReference = new WeakReference(c749810Tb9);
        ((AdminApi) C482260Ivg.LIZJ(AdminApi.class)).requestModeratorIHostList().LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(weakReference, 220), new AfS181S0100000_12(weakReference, 221));
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void OP1(Function1<? super List<C745220TLc>, Unit> function1) {
        double[] value = LiveMuteCommentsListSetting.INSTANCE.getValue();
        ArrayList arrayList = new ArrayList(value.length);
        for (double d : value) {
            arrayList.add(new C745220TLc((long) d));
        }
        function1.invoke(arrayList);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final C11HU qe0(DataChannel dataChannel) {
        return C751460Tdo.LIZIZ(dataChannel);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void RN0(Context context, C1106210etP c1106210etP) throws JSONException {
        String str;
        w.LIZ.getClass();
        String strLJIIIZ = w.LJIIIZ();
        String strLJIIL = w.LJIIL();
        String str2 = c1106210etP.LJJIFFI;
        if (str2 != null && str2.length() != 0) {
            str = c1106210etP.LJJIFFI;
        } else {
            str = "share";
        }
        long j = c1106210etP.LIZIZ;
        long j2 = c1106210etP.LIZJ;
        C759930TrT c759930TrT = new C759930TrT(j, j2, j2, c1106210etP.LJIJJ, str, strLJIIIZ, strLJIIL, w.LIZLLL(), "report_anchor", c1106210etP.LJIJ, C0IXW.LIZIZ(null, null, "user_live_duration"), c1106210etP.LJJJJZI, "");
        c759930TrT.LJJIIJ = c1106210etP.LJJIZ;
        c759930TrT.LJIILJJIL = c1106210etP.LJJJIL;
        c759930TrT.LJJIJL = c1106210etP.LJL;
        fJ2(context, c759930TrT);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void Sw0(InterfaceC749850TbD interfaceC749850TbD, long j) {
        C749830TbB.LIZ(interfaceC749850TbD, j, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0343 A[LOOP:0: B:123:0x033d->B:125:0x0343, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[PHI: r1 r31
      0x005b: PHI (r1v1 java.lang.String) = (r1v74 java.lang.String), (r1v75 java.lang.String) binds: [B:24:0x0059, B:22:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r31v1 java.lang.String) = (r31v2 java.lang.String), (r31v3 java.lang.String) binds: [B:24:0x0059, B:22:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0269  */
    @Override // com.bytedance.android.live.usermanage.IUserManageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fJ2(android.content.Context r34, X.C759930TrT r35) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usermanage.UserManageService.fJ2(android.content.Context, X.0TrT):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(tikcast.api.perception.ViolationStatusResponse r3, int r4, com.bytedance.ies.sdk.datachannel.DataChannel r5) {
        /*
            if (r3 == 0) goto L57
            tikcast.api.perception.ViolationStatusResponse$ResponseData r0 = r3.data
            if (r0 == 0) goto L57
            int r1 = r0.status
            r0 = 1
            if (r1 != r0) goto L57
            tikcast.api.perception.ViolationStatusResponse$ResponseData r3 = r3.data
            r2 = 0
            if (r3 == 0) goto L53
            com.bytedance.android.livesdk.model.message.PerceptionDialogInfo r0 = r3.perceptionDialog
            if (r0 == 0) goto L53
            com.bytedance.android.livesdk.model.message.common.Text r1 = r0.subTitle
        L16:
            com.bytedance.android.livesdk.model.message.PerceptionDialogInfo r0 = r3.perceptionDialog
            if (r0 == 0) goto L20
            com.bytedance.android.livesdk.model.message.common.Text r0 = r0.subTitle
            if (r0 == 0) goto L20
            java.lang.String r2 = r0.defaultPattern
        L20:
            android.text.Spannable r3 = X.C1133830fbx.LJIILIIL(r1, r2)
            if (r5 == 0) goto L2d
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.GreenScreenCreatorBlockChannel> r1 = com.bytedance.android.livesdk.dataChannel.GreenScreenCreatorBlockChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.zW(r1, r0)
        L2d:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r2 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.live.effect.api.GreenScreenLiveGoalBlockGlobalChannel> r1 = com.bytedance.android.live.effect.api.GreenScreenLiveGoalBlockGlobalChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.HQ2(r1, r0)
            r0 = 7
            if (r4 == r0) goto L47
            r0 = 8
            if (r4 != r0) goto L46
            java.lang.Class<X.0aKv> r1 = X.C931070aKv.class
            java.lang.String r0 = r3.toString()
            r2.JQ2(r1, r0)
        L46:
            return
        L47:
            if (r5 == 0) goto L46
            java.lang.Class<X.0Tra> r1 = X.C760000Tra.class
            java.lang.String r0 = r3.toString()
            r5.SX0(r1, r0)
            return
        L53:
            r1 = r2
            if (r3 == 0) goto L20
            goto L16
        L57:
            if (r5 == 0) goto L60
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.GreenScreenCreatorBlockChannel> r1 = com.bytedance.android.livesdk.dataChannel.GreenScreenCreatorBlockChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.zW(r1, r0)
        L60:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r2 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.live.effect.api.GreenScreenLiveGoalBlockGlobalChannel> r1 = com.bytedance.android.live.effect.api.GreenScreenLiveGoalBlockGlobalChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.HQ2(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usermanage.UserManageService.LIZIZ(tikcast.api.perception.ViolationStatusResponse, int, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void AQ(C749670Tav c749670Tav, long j, long j2) {
        C749830TbB.LIZ(c749670Tav, j, Long.valueOf(j2));
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void Ag2(long j, long j2, C749810Tb9 c749810Tb9) {
        WeakReference weakReference = new WeakReference(c749810Tb9);
        ((AdminApi) C482260Ivg.LIZJ(AdminApi.class)).delHostIModerator(j, j2).LJIILIIL(new C0UO0()).LJJLL(new AfS4S0100100_12(j, weakReference, 15), new AfS4S0100100_12(j, weakReference, 16));
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void BP(C749860TbE c749860TbE, long j, int i) {
        String secUid;
        InterfaceC2262081DgM currentUser;
        WeakReference weakReference = new WeakReference(c749860TbE);
        c749860TbE.LIZJ();
        MuteApi muteApi = (MuteApi) C482260Ivg.LIZJ(MuteApi.class);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            secUid = currentUser.getSecUid();
        } else {
            secUid = null;
        }
        muteApi.getMuteList(j, 20, i, secUid).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(weakReference, 222), new AfS181S0100000_12(weakReference, 223));
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void BR1(C749860TbE c749860TbE, long j, int i) {
        String secUid;
        InterfaceC2262081DgM currentUser;
        WeakReference weakReference = new WeakReference(c749860TbE);
        c749860TbE.LIZJ();
        KickOutApi kickOutApi = (KickOutApi) C482260Ivg.LIZJ(KickOutApi.class);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            secUid = currentUser.getSecUid();
        } else {
            secUid = null;
        }
        kickOutApi.getKickedOutList(j, 20, i, secUid).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(weakReference, 224), new AfS181S0100000_12(weakReference, 225));
    }

    public final void LIZLLL(final Context context, final C759930TrT c759930TrT, final DataChannel dataChannel) {
        c759930TrT.LJIILLIIL = false;
        if (LiveReportViolationPreloadSetting.getEnable()) {
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            long j = c759930TrT.LIZJ;
            InterfaceC760020Trc interfaceC760020Trc = new InterfaceC760020Trc() { // from class: X.0TrW
                @Override // X.InterfaceC760020Trc
                public final void LIZ(C759990TrZ c759990TrZ, boolean z) {
                    if (c759990TrZ != null) {
                        C759930TrT c759930TrT2 = c759930TrT;
                        UserManageService userManageService = this;
                        Context context2 = context;
                        DataChannel dataChannel2 = dataChannel;
                        c759930TrT2.LJJIIZI = z;
                        int i = c759990TrZ.LIZ;
                        if (i != 0) {
                            if (i == 1) {
                                userManageService.LIZJ(context2, c759990TrZ.LIZIZ, dataChannel2, c759930TrT2);
                                return;
                            }
                            return;
                        }
                        userManageService.fJ2(context2, c759930TrT2);
                    }
                }
            };
            C759990TrZ c759990TrZ = C759940TrU.LIZ;
            if (c759990TrZ != null) {
                if (c759990TrZ.LIZJ == currentUserId && c759990TrZ.LIZLLL == j) {
                    interfaceC760020Trc.LIZ(c759990TrZ, true);
                    C759940TrU.LIZ = null;
                    return;
                }
                C759940TrU.LIZ = null;
            }
            C759940TrU.LIZ(j, currentUserId, interfaceC760020Trc, false);
            return;
        }
        ((AdminApi) C482260Ivg.LIZJ(AdminApi.class)).requestReportViolation(6, c759930TrT.LIZJ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS63S0400000_12(context, this, c759930TrT, dataChannel, 1), new C09JN() { // from class: X.0TrV
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("UserManageService@d46e.violationReport$3");
                C1C7U.LIZIZ("UserManageService@d46e.violationReport$3");
            }
        });
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final Object QX(C745220TLc c745220TLc, DataChannel dataChannel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJFF = C751460Tdo.LIZ.LJFF(c745220TLc, dataChannel, interfaceC1364105Vn);
        if (objLJFF != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJFF;
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final C0KXC Re1(BaseFragment baseFragment, DataChannel dataChannel, C11NJ c11nj) {
        return new C0KXC(baseFragment, dataChannel, c11nj);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void qo1(long j, User user, InterfaceC750500TcG interfaceC750500TcG) {
        WeakReference weakReference = new WeakReference(interfaceC750500TcG);
        ((MuteApi) C482260Ivg.LIZJ(MuteApi.class)).unmute(j, user.getId(), user.getSecUid()).LJIILIIL(new C0UO0()).LJJLL(new AfS3S0200100_12(j, user, weakReference, 4), new AfS3S0200100_12(j, user, weakReference, 5));
    }

    public final void LIZJ(Context context, final ViolationStatusResponse.ResponseData responseData, DataChannel dataChannel, final C759930TrT c759930TrT) {
        PerceptionDialogInfo perceptionDialogInfo;
        if (context != null) {
            PerceptionMessage perceptionMessage = new PerceptionMessage();
            PunishEventInfo punishEventInfo = null;
            if (responseData != null) {
                perceptionDialogInfo = responseData.perceptionDialog;
            } else {
                perceptionDialogInfo = null;
            }
            perceptionMessage.dialog = perceptionDialogInfo;
            if (responseData != null) {
                punishEventInfo = responseData.punishEvent;
            }
            perceptionMessage.publicEventInfo = punishEventInfo;
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).showDialog(context, perceptionMessage, dataChannel, new InterfaceC775230Ub3() { // from class: X.0Trd
                @Override // X.InterfaceC775230Ub3
                public final void LIZ(String str, String str2) {
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
                    String strLIZ;
                    String str8;
                    String str9;
                    PunishEventInfo punishEventInfo2;
                    PunishEventInfo punishEventInfo3;
                    LiveMode streamType;
                    PerceptionDialogInfo perceptionDialogInfo2;
                    PunishEventInfo punishEventInfo4;
                    PunishEventInfo punishEventInfo5;
                    UserManageService userManageService = this.LIZ;
                    C759930TrT c759930TrT2 = c759930TrT;
                    ViolationStatusResponse.ResponseData responseData2 = responseData;
                    userManageService.getClass();
                    long currentUserId = UserService.getInstance().user().getCurrentUserId();
                    if (currentUserId == c759930TrT2.LIZLLL) {
                        str3 = "anchor";
                    } else {
                        str3 = "user";
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_popup");
                    c474500IjALIZ.LJIL();
                    if (responseData2 != null && (punishEventInfo5 = responseData2.punishEvent) != null) {
                        str4 = punishEventInfo5.punishType;
                    } else {
                        str4 = null;
                    }
                    c474500IjALIZ.LJJII(str4, "violation_type");
                    c474500IjALIZ.LJJII(Long.valueOf(currentUserId), "perception_reach_user_id");
                    if (responseData2 != null && (punishEventInfo4 = responseData2.punishEvent) != null) {
                        str5 = punishEventInfo4.punishReason;
                    } else {
                        str5 = null;
                    }
                    c474500IjALIZ.LJJII(str5, "violation_reason");
                    c474500IjALIZ.LJJII(str, "action_type");
                    c474500IjALIZ.LJJII(str3, "user_type");
                    c474500IjALIZ.LJJII(c759930TrT2.LJII, "scene_type");
                    if (responseData2 != null && (perceptionDialogInfo2 = responseData2.perceptionDialog) != null) {
                        str6 = perceptionDialogInfo2.violationDetailUrl;
                    } else {
                        str6 = null;
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        str7 = "1";
                    } else {
                        str7 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c474500IjALIZ.LJJII(str7, "is_detail_button");
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    if (room != null && (streamType = room.getStreamType()) != null) {
                        strLIZ = C354201Zc.LIZ(streamType);
                    } else {
                        strLIZ = null;
                    }
                    c474500IjALIZ.LJJII(strLIZ, "live_type");
                    if (responseData2 != null && (punishEventInfo3 = responseData2.punishEvent) != null) {
                        str8 = punishEventInfo3.punishPerceptionCode;
                    } else {
                        str8 = null;
                    }
                    c474500IjALIZ.LJJII(str8, "perception_code");
                    if (responseData2 != null && (punishEventInfo2 = responseData2.punishEvent) != null) {
                        str9 = punishEventInfo2.showReason;
                    } else {
                        str9 = null;
                    }
                    c474500IjALIZ.LJJII(str9, "show_reason");
                    c474500IjALIZ.LIZ();
                    if (LiveReportViolationPreloadSetting.getEnable()) {
                        C759940TrU.LIZ = null;
                    }
                }
            });
        }
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void B22(long j, User user, C745220TLc c745220TLc, InterfaceC750500TcG interfaceC750500TcG, Long l) {
        long j2;
        long jLongValue;
        if (Intrinsics.LJFF(c745220TLc, C745220TLc.LIZJ)) {
            j2 = -1;
        } else if (Intrinsics.LJFF(c745220TLc, C745220TLc.LIZIZ)) {
            j2 = 0;
        } else {
            j2 = 1;
        }
        long j3 = c745220TLc.LIZ;
        if (j2 == -1) {
            j3 = C0TYC.LIZJ(Integer.valueOf(C0TYC.LIZ(C751460Tdo.LIZ()))).LIZ;
        }
        WeakReference weakReference = new WeakReference(interfaceC750500TcG);
        MuteApi muteApi = (MuteApi) C482260Ivg.LIZJ(MuteApi.class);
        long id = user.getId();
        String secUid = user.getSecUid();
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        muteApi.mute(j, id, j2, secUid, j3, jLongValue).LJIILIIL(new C0UO0()).LJJLL(new AfS3S0200100_12(j, user, weakReference, 2), new AfS3S0200100_12(j, user, weakReference, 3));
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void w60(long j, DataChannel dataChannel, int i, boolean z, ViolationStatusResponse violationStatusResponse) {
        if (z) {
            LIZIZ(violationStatusResponse, i, dataChannel);
        } else {
            ((AdminApi) C482260Ivg.LIZJ(AdminApi.class)).requestReportViolation(i, j).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS64S0201000_12(i, this, dataChannel, 0));
        }
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void KJ2(InterfaceC749850TbD interfaceC749850TbD, final boolean z, final C750740Tce c750740Tce, final long j, final long j2, final String str) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isAdmin: ");
        sbLIZ.append(z);
        sbLIZ.append(", user: ");
        sbLIZ.append(c750740Tce.LIZJ);
        sbLIZ.append(", userAdmin: ");
        sbLIZ.append(c750740Tce.LJII);
        C20441214yg.LIZIZ("AdminMonitor#update", C2188811AlT.LIZIZ(sbLIZ));
        final WeakReference weakReference = new WeakReference(interfaceC749850TbD);
        AdminApi adminApi = (AdminApi) C482260Ivg.LIZJ(AdminApi.class);
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        adminApi.updateAdmin(i, c750740Tce.LIZ, j, j2).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0TbC
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AdminManager@fd5f.updateAdmin$1");
                InterfaceC749850TbD interfaceC749850TbD2 = weakReference.get();
                if (interfaceC749850TbD2 != null) {
                    interfaceC749850TbD2.OO(c750740Tce.LIZ, z);
                }
                boolean z2 = z;
                C750740Tce c750740Tce2 = c750740Tce;
                C749830TbB.LIZIZ(z2, c750740Tce2.LIZ, j, j2, str, c750740Tce2);
                C1C7U.LIZIZ("AdminManager@fd5f.updateAdmin$1");
            }
        }, new AfS56S0110000_12(weakReference, z, 1));
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void S70(InterfaceC750020TbU interfaceC750020TbU, boolean z, long j, long j2, String str, Long l) {
        WeakReference weakReference = new WeakReference(interfaceC750020TbU);
        if (z) {
            ((KickOutApi) C482260Ivg.LIZJ(KickOutApi.class)).kickOut(j, j2, l).LJIILIIL(new C0UO0()).LJJLL(new AfS1S1110200_12(weakReference, z, str, j2, j, 0), new AfS0S0110200_12(j, j2, weakReference, z, 1));
        } else {
            ((KickOutApi) C482260Ivg.LIZJ(KickOutApi.class)).unKickOut(j, j2).LJIILIIL(new C0UO0()).LJJLL(new AfS1S1110200_12(weakReference, false, str, j2, j, 1), new AfS0S0110200_12(j, j2, weakReference, false, 2));
        }
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final DialogC752370TfH Bm0(Context context, long j, long j2, long j3, boolean z, InterfaceC752380TfI interfaceC752380TfI, String str, DataChannel dataChannel) {
        return new DialogC752370TfH(context, j, j2, j3, z, interfaceC752380TfI, str, dataChannel);
    }

    @Override // com.bytedance.android.live.usermanage.IUserManageService
    public final void ac0(InterfaceC749850TbD interfaceC749850TbD, int i, int i2, long j, long j2, long j3, String str, String str2) {
        ((AdminApi) C482260Ivg.LIZJ(AdminApi.class)).updateAdminPermission(i, i2, j, j2, j3, str, str2).LJIILIIL(new C0UO0()).LJJLL(new AfS80S0101000_12(i, interfaceC749850TbD, 2), new AfS80S0101000_12(i, interfaceC749850TbD, 3));
    }
}
