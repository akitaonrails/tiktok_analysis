package com.ss.android.ugc.aweme.im.vm;

import X.AbstractC738140SxQ;
import X.AnonymousClass0629;
import X.C01GW;
import X.C05YD;
import X.C069A;
import X.C069P;
import X.C098200Yq;
import X.C0YNP;
import X.C13IQ;
import X.C1419705h5;
import X.C1434905jX;
import X.C14EU;
import X.C1509305vX;
import X.C1535405zk;
import X.C1559260qg8;
import X.C1593606Lu;
import X.C189200o6;
import X.C19719912Dl;
import X.C2201941BFw;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C723600SZy;
import X.C893580Z3s;
import X.C903320ZcA;
import X.C909290Zln;
import X.EnumC1696906kh;
import X.InterfaceC0148002o;
import X.InterfaceC1480505qt;
import X.InterfaceC1513805wG;
import X.InterfaceC1710106mp;
import X.InterfaceC332260D0u;
import X.InterfaceC894800Z8k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import com.ss.android.ugc.aweme.im.vm.ChatCommonViewModelImpl;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatCommonViewModelImpl extends ChatCommonViewModel {
    public final InterfaceC1710106mp LL;
    public final IIMErrorUtils LLILLJJLI;
    public final IIMAnalyticsUtil LLILLL;
    public final C1559260qg8 LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        Object c098200Yq;
        InterfaceC894800Z8k interfaceC894800Z8k;
        long serverTime;
        final C909290Zln c909290Zln;
        super.onPrepared();
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        SessionInfo sessionInfoXQ2 = xQ2();
        if ((sessionInfoXQ2 instanceof C909290Zln) && (c909290Zln = (C909290Zln) sessionInfoXQ2) != null) {
            IMAIServiceAPI.LIZ.getClass();
            if (AnonymousClass0629.LIZ().LIZ().LJIL(c909290Zln.getConversationId())) {
                C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1535405zk(C0YNP.LJII(c909290Zln.getConversationId()), c909290Zln, this, null), 3);
            } else {
                IMUser fromUser = c909290Zln.getFromUser();
                String strValueOf = fromUser == null ? String.valueOf(C0YNP.LJII(c909290Zln.getConversationId())) : fromUser.getUid();
                String secUid = fromUser != null ? fromUser.getSecUid() : null;
                IMUser.Companion.getClass();
                if (!C2201941BFw.LJ(strValueOf)) {
                    this.LL.LIZJ(new InterfaceC1480505qt() { // from class: X.06kf
                        @Override // X.InterfaceC1480505qt
                        public final void LIZ(Throwable th) {
                        }

                        @Override // X.InterfaceC1480505qt
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC1480505qt
                        public final void LIZIZ(IMUser iMUser) {
                            String recType;
                            String recType2;
                            ChatCommonViewModelImpl chatCommonViewModelImpl = this.LIZ;
                            C909290Zln c909290Zln2 = c909290Zln;
                            chatCommonViewModelImpl.getClass();
                            IMUser fromUser2 = c909290Zln2.getFromUser();
                            if (fromUser2 != null && (recType = fromUser2.getRecType()) != null && ((recType2 = iMUser.getRecType()) == null || recType2.length() == 0)) {
                                iMUser.setRecType(recType);
                            }
                            c909290Zln.setFromUser(iMUser);
                            IRemindUsersViewHelper.LIZ.getClass();
                            IRemindUsersViewHelper iRemindUsersViewHelperLIZ = C069A.LIZ();
                            if (iRemindUsersViewHelperLIZ != null) {
                                iRemindUsersViewHelperLIZ.LIZJ(iMUser.getFollowerStatus());
                            }
                            IIMErrorUtils iIMErrorUtils = this.LIZ.LLILLJJLI;
                            if (iIMErrorUtils != null) {
                                iIMErrorUtils.LIZ(c909290Zln.getFromUser(), c909290Zln.getConversationId(), Integer.valueOf(c909290Zln.getEnterFrom()), "SingleChatViewModel");
                            }
                            this.LIZ.setState(new AwS581S0100000_2(iMUser, 381));
                        }
                    }, strValueOf, secUid, "im_chat", true);
                }
            }
        }
        IIMAnalyticsUtil iIMAnalyticsUtil = this.LLILLL;
        if (iIMAnalyticsUtil != null) {
            iIMAnalyticsUtil.LJI(xQ2());
        }
        SessionInfo sessionInfoXQ22 = xQ2();
        if (sessionInfoXQ22 != null && (interfaceC894800Z8k = (InterfaceC894800Z8k) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class)) != null) {
            String conversationId = sessionInfoXQ22.getConversationId();
            EnumC1696906kh enumC1696906kh = EnumC1696906kh.CONVERSATION;
            InterfaceC1513805wG interfaceC1513805wG = (InterfaceC1513805wG) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class);
            if (interfaceC1513805wG == null || !interfaceC1513805wG.LJIIJ()) {
                IMHostApi.LIZ.getClass();
                serverTime = C1419705h5.LIZ() != null ? r0.getServerTime() : 0L;
            } else {
                serverTime = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
            interfaceC894800Z8k.LJJII(conversationId, enumC1696906kh, serverTime);
        }
        try {
            setState(new AwS581S0100000_2(this, 237));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1593606Lu(null, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel
    public final C05YD<C13IQ<? extends AbstractC738140SxQ>> vQ2() {
        return (C05YD) this.LLIZ.getValue();
    }

    public final SessionInfo xQ2() {
        return (SessionInfo) this.LLILZIL.getValue();
    }

    public ChatCommonViewModelImpl() {
        IMContactApi.LIZ.getClass();
        this.LL = C069P.LIZ().LJ();
        IIMErrorUtils.LIZ.getClass();
        this.LLILLJJLI = C903320ZcA.LIZ();
        IIMAnalyticsUtil.LIZ.getClass();
        this.LLILLL = C893580Z3s.LIZ();
        this.LLILZ = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
        this.LLILZIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 599));
        this.LLILZLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(561));
        this.LLIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 600));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZLLL().LJJI(this);
        IRemindUsersViewHelper.LIZ.getClass();
        IRemindUsersViewHelper iRemindUsersViewHelperLIZ = C069A.LIZ();
        if (iRemindUsersViewHelperLIZ != null) {
            iRemindUsersViewHelperLIZ.LIZJ(-1);
        }
        IIMAnalyticsUtil iIMAnalyticsUtil = this.LLILLL;
        if (iIMAnalyticsUtil != null) {
            iIMAnalyticsUtil.LJI(null);
        }
    }

    @C14EU
    public final void onUserUpdate(C1434905jX c1434905jX) {
        C909290Zln c909290Zln;
        String uid = c1434905jX.LIZJ.getUid();
        SessionInfo sessionInfoXQ2 = xQ2();
        String singleChatFromUserId = null;
        if (sessionInfoXQ2 != null) {
            singleChatFromUserId = sessionInfoXQ2.getSingleChatFromUserId();
        }
        if (Intrinsics.LJFF(uid, singleChatFromUserId)) {
            SessionInfo sessionInfoXQ22 = xQ2();
            if ((sessionInfoXQ22 instanceof C909290Zln) && (c909290Zln = (C909290Zln) sessionInfoXQ22) != null) {
                c909290Zln.setFromUser(c1434905jX.LIZJ);
            }
            setState(new AwS581S0100000_2(c1434905jX, 238));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel
    public final void wQ2(C19719912Dl c19719912Dl) {
        ((InterfaceC332260D0u) this.LLILZLL.getValue()).setValue(c19719912Dl);
    }
}
