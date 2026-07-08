package com.ss.android.ugc.aweme.im.actionbar.common.viewmodel;

import X.AbstractC1765006vg;
import X.AbstractC908770Zkx;
import X.AnonymousClass0951;
import X.C01GW;
import X.C04TD;
import X.C05YD;
import X.C06C8;
import X.C098200Yq;
import X.C09IC;
import X.C0BBI;
import X.C0I0B;
import X.C0PEM;
import X.C1400340mXo;
import X.C1559260qg8;
import X.C1586906Jf;
import X.C1598206No;
import X.C1598606Ns;
import X.C1598706Nt;
import X.C1598806Nu;
import X.C1611706St;
import X.C1611806Su;
import X.C1770006wU;
import X.C189200o6;
import X.C1BNE;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C723600SZy;
import X.C7740030o;
import X.C869590Y9l;
import X.C908760Zkw;
import X.C908970ZlH;
import X.C909000ZlK;
import X.C909060ZlQ;
import X.C914160Zte;
import X.InterfaceC0148002o;
import X.InterfaceC1583506Hx;
import X.InterfaceC908660Zkm;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService;
import com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.SocialActionBarLightInteractionViewModel;
import com.ss.android.ugc.aweme.im.actionbar.serviceimpl.ActionBarServiceImpl;
import com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonConf;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes15.dex */
public final class SocialActionBarLightInteractionViewModel extends AssemViewModel<InterfaceC0148002o> {
    public IMUser LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(327));
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C2252321DDq LLILZ;
    public final AnonymousClass0951 LLILZIL;
    public final C2252321DDq LLILZLL;
    public final AnonymousClass0951 LLIZ;
    public boolean LLIZLLLIL;
    public C05YD<? extends InterfaceC908660Zkm> LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C1770006wU LLJJJIL;
    public final C1598806Nu LLJJJJ;
    public final C1598706Nt LLJJJJJIL;

    public static IActionBarService yQ2() {
        Object objLIZ = C04TD.LIZ(IActionBarService.class, false);
        if (objLIZ != null) {
            return (IActionBarService) objLIZ;
        }
        if (C04TD.R0 == null) {
            synchronized (IActionBarService.class) {
                if (C04TD.R0 == null) {
                    C04TD.R0 = new ActionBarServiceImpl.ActionBarServiceManage();
                }
            }
        }
        return C04TD.R0;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C914160Zte(2);
    }

    public final C457780HxI zQ2() {
        return (C457780HxI) this.LLILLL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.06Nu] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.06Nt] */
    public SocialActionBarLightInteractionViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new AbstractC908770Zkx() { // from class: X.0Zky
        });
        this.LLILZ = c2252321DDqLIZ;
        this.LLILZIL = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(new AbstractC1765006vg() { // from class: X.06vh
        });
        this.LLILZLL = c2252321DDqLIZ2;
        this.LLIZ = C09IC.LIZIZ(c2252321DDqLIZ2);
        this.LLJJ = true;
        this.LLJJI = true;
        this.LLJJIII = true;
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 234));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 233));
        this.LLJJJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(326));
        this.LLJJJIL = new C1770006wU(CoroutineExceptionHandler.LJJLIL, 1);
        this.LLJJJJ = new InterfaceC1583506Hx() { // from class: X.06Nu
            @Override // X.InterfaceC1583506Hx
            public final void LIZ() {
                SocialActionBarLightInteractionViewModel.vQ2(this.LIZ, null, null, null, 7);
            }
        };
        this.LLJJJJJIL = new C06C8() { // from class: X.06Nt
            @Override // X.C06C8
            public final void Ro1(String str) {
            }

            @Override // X.C06C8
            public final void SI2(String str, StreakPetData streakPetData, StreakPetData streakPetData2) {
                String conversationId;
                boolean z;
                SessionInfo sessionInfo;
                C457780HxI c457780HxIZQ2 = this.LL.zQ2();
                if (c457780HxIZQ2 != null && (sessionInfo = c457780HxIZQ2.LL) != null) {
                    conversationId = sessionInfo.getConversationId();
                } else {
                    conversationId = null;
                }
                if (Intrinsics.LJFF(str, conversationId)) {
                    boolean z2 = false;
                    if (streakPetData != null) {
                        z = streakPetData.isHidden;
                    } else {
                        z = false;
                    }
                    boolean z3 = streakPetData2.isHidden;
                    if (streakPetData != null) {
                        z2 = streakPetData.isEggHidden;
                    }
                    boolean z4 = streakPetData2.isEggHidden;
                    if (z != z3 || z2 != z4) {
                        SocialActionBarLightInteractionViewModel.vQ2(this.LL, null, null, null, 7);
                    }
                }
            }

            @Override // X.C06C8
            public final void wK0(String str, StreakExtension streakExtension, StreakPetData streakPetData) {
                String conversationId;
                SessionInfo sessionInfo;
                if (C296670Bk1.LIZ()) {
                    C457780HxI c457780HxIZQ2 = this.LL.zQ2();
                    if (c457780HxIZQ2 != null && (sessionInfo = c457780HxIZQ2.LL) != null) {
                        conversationId = sessionInfo.getConversationId();
                    } else {
                        conversationId = null;
                    }
                    if (Intrinsics.LJFF(str, conversationId)) {
                        SocialActionBarLightInteractionViewModel.vQ2(this.LL, null, null, null, 7);
                    }
                }
            }
        };
    }

    public final ILightInteractionPlatformService AQ2() {
        return (ILightInteractionPlatformService) ServiceManager.get().getService(ILightInteractionPlatformService.class);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        IStreakPetService.LIZ.getClass();
        C1586906Jf.LIZ().LJIJJLI(this.LLJJJJ);
        C1586906Jf.LIZ().LJJIJIIJIL(this.LLJJJJJIL);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        IStreakPetService.LIZ.getClass();
        C1586906Jf.LIZ().LJIIL(this.LLJJJJ);
        C1586906Jf.LIZ().LJJIIJZLJL(this.LLJJJJJIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CQ2(com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonConf r10) {
        /*
            r9 = this;
            java.lang.Integer r2 = r10.type
            com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonType r0 = com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonType.LIGHT_INTERACTION
            int r1 = r0.getValue()
            java.lang.String r8 = ""
            if (r2 == 0) goto L40
            int r0 = r2.intValue()
            if (r0 != r1) goto L40
            com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService r1 = r9.AQ2()
            java.lang.String r0 = r10.lightInteractionName
            if (r0 == 0) goto L1b
            r8 = r0
        L1b:
            java.lang.String r8 = r1.LJII(r8)
        L1f:
            com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService r0 = r9.AQ2()
            X.0Yzu r1 = r0.LJJIJIIJIL(r9)
            java.lang.String r0 = r10.lightInteractionName
            java.lang.String r2 = java.lang.String.valueOf(r0)
            X.0zlE r0 = X.EnumC1908380zlE.CHAT
            java.lang.String r3 = r0.getValue()
            X.0zlD r0 = X.EnumC1908370zlD.ACTION_BAR
            java.lang.String r4 = r0.getValue()
            r5 = 0
            r6 = r5
            r7 = r5
            r1.LIZIZ(r2, r3, r4, r5, r6, r7, r8)
            return
        L40:
            com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonType r0 = com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonType.NUDGE
            int r1 = r0.getValue()
            if (r2 == 0) goto L4e
            int r0 = r2.intValue()
            if (r0 == r1) goto L5c
        L4e:
            com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonType r0 = com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonType.NUDGE_BACK
            int r1 = r0.getValue()
            if (r2 == 0) goto L5f
            int r0 = r2.intValue()
            if (r0 != r1) goto L5f
        L5c:
            java.lang.String r8 = "nudge"
            goto L1f
        L5f:
            com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonType r0 = com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonType.STREAK
            int r1 = r0.getValue()
            if (r2 == 0) goto L6d
            int r0 = r2.intValue()
            if (r0 == r1) goto L7b
        L6d:
            com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonType r0 = com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonType.STREAK_BACK
            int r1 = r0.getValue()
            if (r2 == 0) goto L7e
            int r0 = r2.intValue()
            if (r0 != r1) goto L7e
        L7b:
            java.lang.String r8 = "spark"
            goto L1f
        L7e:
            com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonType r0 = com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonType.FORTUNE_COOKIE
            int r1 = r0.getValue()
            if (r2 == 0) goto L1f
            int r0 = r2.intValue()
            if (r0 != r1) goto L1f
            java.lang.String r8 = "cookie"
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.SocialActionBarLightInteractionViewModel.CQ2(com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonConf):void");
    }

    public final void wQ2(String str) {
        Keva repo;
        String strLIZIZ;
        synchronized (C909060ZlQ.LIZ) {
            repo = C909060ZlQ.LIZIZ;
            if (repo == null) {
                repo = Keva.getRepo("action_bar_button_config_list");
                C909060ZlQ.LIZIZ = repo;
            }
        }
        String strLIZ = C909060ZlQ.LIZ();
        if (strLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append('_');
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        String[] stringArray = repo.getStringArray(strLIZIZ, new String[0]);
        ArrayList arrayList = new ArrayList(stringArray.length);
        for (String str2 : stringArray) {
            arrayList.add(GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), str2, ActionBarButtonConf.class));
        }
        boolean zIsEmpty = arrayList.isEmpty();
        this.LLJJI = zIsEmpty;
        if (!zIsEmpty) {
            this.LLILZ.setValue(new C908760Zkw(arrayList));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void BQ2(com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonConf r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.SocialActionBarLightInteractionViewModel.BQ2(com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonConf, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0394 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r42, X.C869590Y9l r43, X.C1598606Ns r44, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarButtonStrategyConf>> r45) {
        /*
            Method dump skipped, instruction units count: 1287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.SocialActionBarLightInteractionViewModel.xQ2(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser, X.0Y9l, X.06Ns, X.05Vn):java.lang.Object");
    }

    public static void vQ2(SocialActionBarLightInteractionViewModel socialActionBarLightInteractionViewModel, IMUser iMUser, C869590Y9l c869590Y9l, C1598606Ns c1598606Ns, int i) {
        String conversationId;
        C457780HxI c457780HxIZQ2;
        SessionInfo sessionInfo;
        String string;
        Object c098200Yq;
        SessionInfo sessionInfo2;
        C1598606Ns c1598606Ns2 = c1598606Ns;
        C869590Y9l c869590Y9l2 = c869590Y9l;
        IMUser iMUser2 = iMUser;
        if ((i & 1) != 0) {
            iMUser2 = null;
        }
        if ((i & 2) != 0) {
            c869590Y9l2 = null;
        }
        if ((i & 4) != 0) {
            c1598606Ns2 = null;
        }
        C457780HxI c457780HxIZQ22 = socialActionBarLightInteractionViewModel.zQ2();
        if (c457780HxIZQ22 != null && (sessionInfo2 = c457780HxIZQ22.LL) != null) {
            conversationId = sessionInfo2.getConversationId();
        } else {
            conversationId = null;
        }
        if (conversationId == null) {
            conversationId = "";
        }
        boolean z = false;
        if (c1598606Ns2 == null) {
            if (socialActionBarLightInteractionViewModel.LLJJIJI && (c457780HxIZQ2 = socialActionBarLightInteractionViewModel.zQ2()) != null && (sessionInfo = c457780HxIZQ2.LL) != null && sessionInfo.isGroupChat()) {
                C1611706St.LIZ.getClass();
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("dm_group_action_bar_open_live_opt", false) && C1611806Su.LIZ()) {
                    Keva kevaLIZJ = C1598206No.LIZJ();
                    String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                    if (curUserId == null) {
                        curUserId = "";
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("action_bar_live_button_entrance_data_");
                    sbLIZ.append(conversationId);
                    sbLIZ.append('_');
                    sbLIZ.append(curUserId);
                    string = kevaLIZJ.getString(C2188811AlT.LIZIZ(sbLIZ), "");
                } else {
                    string = null;
                }
                try {
                    c098200Yq = (C1598606Ns) C7740030o.LIZ().getGson().LJII(string, C1598606Ns.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                c1598606Ns2 = (C1598606Ns) c098200Yq;
            } else {
                c1598606Ns2 = null;
            }
        }
        if (((Number) C0BBI.LIZ.getValue()).intValue() > 0) {
            z = true;
        }
        if (z && socialActionBarLightInteractionViewModel.LLJJIJI) {
            C23250099c.LIZLLL(socialActionBarLightInteractionViewModel.getAssemVMScope(), C0PEM.LIZJ.plus(socialActionBarLightInteractionViewModel.LLJJJIL), null, new C909000ZlK(socialActionBarLightInteractionViewModel, conversationId, null), 2);
        }
        C23250099c.LIZLLL(socialActionBarLightInteractionViewModel.getAssemVMScope(), C0PEM.LIZJ.plus(socialActionBarLightInteractionViewModel.LLJJJIL), null, new C908970ZlH(socialActionBarLightInteractionViewModel, iMUser2, c869590Y9l2, c1598606Ns2, conversationId, null), 2);
    }
}
