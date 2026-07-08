package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera;

import X.C01GW;
import X.C05YD;
import X.C06M6;
import X.C06NP;
import X.C0IBF;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZNY;
import X.C111900bd;
import X.C11NJ;
import X.C11S5;
import X.C1239300iM4;
import X.C13LE;
import X.C1559260qg8;
import X.C1701940uOG;
import X.C1BNE;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C2272701DxU;
import X.C283940BAy;
import X.C452501pT;
import X.C457780HxI;
import X.C457970Hxb;
import X.C458120Hxq;
import X.C461620I8i;
import X.C723600SZy;
import X.C902310ZaX;
import X.C903170Zbv;
import X.C903930Zd9;
import X.C909290Zln;
import X.C911570ZpT;
import X.C914170Ztf;
import X.EnumC1660606eq;
import X.InterfaceC0148002o;
import X.InterfaceC19483011Ki;
import X.InterfaceC2217461Bqa;
import X.InterfaceC456680HvW;
import X.InterfaceC876950Yaj;
import X.InterfaceC905060Zey;
import Y.AkS476S0100000_14;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.exp.game.GameChallengeConfig;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatRoomCameraVM extends AssemViewModel<C457970Hxb> implements InterfaceC456680HvW, C06NP {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C111900bd.class, null), true);
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723600SZy(this, C06M6.class, null), true);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(207));
    public String LLILZIL;
    public C0IBF LLILZLL;
    public boolean LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final C2252321DDq LLJ;
    public final C01GW LLJI;
    public volatile C903930Zd9 LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatRoomCameraVM.class, "imConvoRepoProvider", "getImConvoRepoProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMConversationRepositoryProvider;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC456680HvW
    public final boolean El2() {
        Integer numValueOf;
        SessionInfo sessionInfo;
        boolean zBooleanValue = ((Boolean) C283940BAy.LIZIZ.getValue()).booleanValue();
        C457780HxI c457780HxIVQ2 = vQ2();
        if (c457780HxIVQ2 == null || (sessionInfo = c457780HxIVQ2.LL) == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(sessionInfo.getChatType());
            if (numValueOf != null) {
                numValueOf.intValue();
            }
        }
        return zBooleanValue && numValueOf != null && numValueOf.intValue() == 0;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C457970Hxb(0);
    }

    public final C457780HxI vQ2() {
        return (C457780HxI) this.LLILLJJLI.getValue();
    }

    public final String wQ2() {
        SessionInfo sessionInfo;
        String str;
        C111900bd c111900bd = (C111900bd) this.LL.getValue();
        if (c111900bd != null && (str = c111900bd.LL) != null) {
            return str;
        }
        C457780HxI c457780HxIVQ2 = vQ2();
        return (c457780HxIVQ2 == null || (sessionInfo = c457780HxIVQ2.LL) == null) ? "" : sessionInfo.getConversationId();
    }

    @Override // X.C06NP
    public final boolean yT1() {
        C457780HxI c457780HxIVQ2;
        SessionInfo sessionInfo;
        String conversationId;
        C06M6 c06m6;
        SessionInfo sessionInfo2;
        Integer numValueOf;
        ChatFeatureListConf chatFeatureListConf;
        if (!((GameChallengeConfig) C902310ZaX.LIZIZ.getValue()).enableGameChallenge || (c457780HxIVQ2 = vQ2()) == null || (sessionInfo = c457780HxIVQ2.LL) == null || (conversationId = sessionInfo.getConversationId()) == null || ((c06m6 = (C06M6) this.LLILLL.getValue()) != null && (chatFeatureListConf = c06m6.LL) != null && !chatFeatureListConf.componentEnable(EnumC1660606eq.SOCIAL_GAME_CHALLENGE.getStrRep()))) {
            return false;
        }
        C457780HxI c457780HxIVQ22 = vQ2();
        if (c457780HxIVQ22 != null && (sessionInfo2 = c457780HxIVQ22.LL) != null && (numValueOf = Integer.valueOf(sessionInfo2.getChatType())) != null) {
            if (numValueOf.intValue() == 3) {
                IMMediaServiceInternalBridge iMMediaServiceInternalBridgeLIZ = IMMediaServiceInternalBridge.LIZ.LIZ();
                if (iMMediaServiceInternalBridgeLIZ != null && iMMediaServiceInternalBridgeLIZ.LIZLLL(numValueOf.intValue(), null, conversationId)) {
                    return true;
                }
            } else if (numValueOf.intValue() == 0) {
                C457780HxI c457780HxIVQ23 = vQ2();
                SessionInfo sessionInfo3 = c457780HxIVQ23 != null ? c457780HxIVQ23.LL : null;
                if (!(sessionInfo3 instanceof C909290Zln) || sessionInfo3 == null) {
                    return false;
                }
                IMUser singleChatFromUser = sessionInfo3.getSingleChatFromUser();
                IMMediaServiceInternalBridge iMMediaServiceInternalBridgeLIZ2 = IMMediaServiceInternalBridge.LIZ.LIZ();
                if (iMMediaServiceInternalBridgeLIZ2 != null && iMMediaServiceInternalBridgeLIZ2.LIZLLL(numValueOf.intValue(), singleChatFromUser, conversationId)) {
                    return true;
                }
            }
        }
        return false;
    }

    public ChatRoomCameraVM() {
        C0IBF c0ibf = C0IBF.FEATURE_STATUS_UNKNOWN;
        this.LLILZLL = c0ibf;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(c0ibf);
        this.LLIZLLLIL = c2252321DDqLIZ;
        this.LLJ = c2252321DDqLIZ;
        this.LLJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 758));
        new C914170Ztf(CoroutineExceptionHandler.LJJLIL, 4);
    }

    @Override // X.C06NP
    public final boolean Ei0() {
        C457780HxI c457780HxIVQ2;
        SessionInfo sessionInfo;
        String conversationId;
        C06M6 c06m6;
        SessionInfo sessionInfo2;
        Integer numValueOf;
        ChatFeatureListConf chatFeatureListConf;
        if (!C911570ZpT.LIZ().enableGroupShot || (c457780HxIVQ2 = vQ2()) == null || (sessionInfo = c457780HxIVQ2.LL) == null || (conversationId = sessionInfo.getConversationId()) == null || ((c06m6 = (C06M6) this.LLILLL.getValue()) != null && (chatFeatureListConf = c06m6.LL) != null && !chatFeatureListConf.componentEnable(EnumC1660606eq.SOCIAL_AI_GROUP_SHOT.getStrRep()))) {
            return false;
        }
        C457780HxI c457780HxIVQ22 = vQ2();
        if (c457780HxIVQ22 != null && (sessionInfo2 = c457780HxIVQ22.LL) != null && (numValueOf = Integer.valueOf(sessionInfo2.getChatType())) != null) {
            if (numValueOf.intValue() == 3) {
                IMMediaServiceInternalBridge iMMediaServiceInternalBridgeLIZ = IMMediaServiceInternalBridge.LIZ.LIZ();
                if (iMMediaServiceInternalBridgeLIZ != null && iMMediaServiceInternalBridgeLIZ.LJIIJJI(numValueOf.intValue(), conversationId, true)) {
                    return true;
                }
            } else if (numValueOf.intValue() == 0) {
                IMCameraBridgeApi.LIZ.getClass();
                IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
                if (iMCameraBridgeApiLIZ == null || !iMCameraBridgeApiLIZ.LJIJI(conversationId)) {
                    return false;
                }
                C457780HxI c457780HxIVQ23 = vQ2();
                SessionInfo sessionInfo3 = c457780HxIVQ23 != null ? c457780HxIVQ23.LL : null;
                if (!(sessionInfo3 instanceof C909290Zln) || sessionInfo3 == null) {
                    return false;
                }
                IMUser singleChatFromUser = sessionInfo3.getSingleChatFromUser();
                IMMediaServiceInternalBridge iMMediaServiceInternalBridgeLIZ2 = IMMediaServiceInternalBridge.LIZ.LIZ();
                if (iMMediaServiceInternalBridgeLIZ2 != null && iMMediaServiceInternalBridgeLIZ2.LJIIL(conversationId, numValueOf.intValue(), singleChatFromUser, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC456680HvW
    public final boolean aW() {
        SessionInfo sessionInfo;
        boolean zLIZIZ = C458120Hxq.LIZIZ();
        C457780HxI c457780HxIVQ2 = vQ2();
        Integer numValueOf = (c457780HxIVQ2 == null || (sessionInfo = c457780HxIVQ2.LL) == null) ? null : Integer.valueOf(sessionInfo.getChatType());
        boolean z = numValueOf != null && numValueOf.intValue() == 3 && C0ZNY.LIZJ();
        if (zLIZIZ) {
            return (numValueOf != null && numValueOf.intValue() == 0) || z;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C11NJ) this.LLILZ.getValue()).dispose();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C2272701DxU c2272701DxULIZ;
        super.onPrepared();
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(wQ2());
        if (c0y8tLIZ != null && (c2272701DxULIZ = C903170Zbv.LIZ(c0y8tLIZ)) != null) {
            C2252321DDq c2252321DDq = this.LLIZLLLIL;
            C0IBF c0ibf = c2272701DxULIZ.camera_status;
            if (this.LLIZ) {
                c0ibf = C0IBF.FEATURE_STATUS_HIDE;
            } else if (c0ibf == null) {
                c0ibf = C0IBF.FEATURE_STATUS_UNKNOWN;
            }
            c2252321DDq.setValue(c0ibf);
            setState(new AwS372S0200000_6(this, c2272701DxULIZ, 10));
            String str = c2272701DxULIZ.camera_disabled_tips;
            if (str == null) {
                str = null;
            }
            this.LLILZIL = str;
        }
        ((C11NJ) this.LLILZ.getValue()).LIZ(C1239300iM4.LJ(((InterfaceC905060Zey) this.LLJI.getValue()).LIZ(wQ2()).LJJJLZIJ(C11S5.LIZ()).LJJIL(new InterfaceC19483011Ki() { // from class: X.0Zbx
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                boolean z;
                AbstractC1702506lb abstractC1702506lb = (AbstractC1702506lb) obj;
                if ((abstractC1702506lb instanceof C1702406la) && ((C1702406la) abstractC1702506lb).LIZIZ == 10) {
                    z = true;
                } else {
                    z = false;
                }
                return !z;
            }
        }).LJJIL(new InterfaceC19483011Ki() { // from class: X.0Zbw
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (!(obj instanceof C1702406la) && !(obj instanceof C1703706ln) && !(obj instanceof C1702706ld)) {
                    return false;
                }
                return true;
            }
        }).LJJJJZI(new AkS476S0100000_14(this, 0)).LJL(C1701940uOG.LIZIZ()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new AwS585S0100000_6(this, 95)));
    }

    @Override // X.InterfaceC456680HvW
    public final C05YD<C0IBF> Jw2() {
        return this.LLJ;
    }
}
