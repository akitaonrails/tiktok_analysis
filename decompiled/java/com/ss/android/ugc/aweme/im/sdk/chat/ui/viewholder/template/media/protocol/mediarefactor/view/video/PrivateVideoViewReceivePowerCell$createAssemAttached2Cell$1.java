package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.video;

import X.AbstractC899510ZQn;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0IBF;
import X.C0QSJ;
import X.C0ZL0;
import X.C0ZQI;
import X.C0ZSU;
import X.C0ZSY;
import X.C13IQ;
import X.C13LE;
import X.C1559260qg8;
import X.C1562980qm8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1807670x8n;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C452501pT;
import X.C457780HxI;
import X.C457970Hxb;
import X.C462510IBt;
import X.C5182020e;
import X.C687700QyG;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C869590Y9l;
import X.InterfaceC1146704e9;
import X.InterfaceC1808750xAX;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC889250YuZ;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class PrivateVideoViewReceivePowerCell$createAssemAttached2Cell$1 extends IMSkeletonLayoutReusedUISlotAssemReceive implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJ;
    public final AssemVMLazy LLLIIII;
    public final AssemVMLazy LLLIIIIL;
    public final C1559260qg8 LLLIIIL;
    public final C01GW LLLIIL;
    public final AssemVMLazy LLLIILIL;
    public volatile InterfaceC1808750xAX LLLIL;
    public volatile SessionInfo LLLILZ;
    public volatile C0ZSY LLLILZJ;
    public InterfaceC665370Q7z LLLILZLLLI;
    public C0QSJ LLLIZZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PrivateVideoViewReceivePowerCell$createAssemAttached2Cell$1.class, "chatRoomCameraVM", "getChatRoomCameraVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/camera/ChatRoomCameraVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PrivateVideoViewReceivePowerCell$createAssemAttached2Cell$1.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PrivateVideoViewReceivePowerCell$createAssemAttached2Cell$1.class, "photo2StickerRepo", "getPhoto2StickerRepo()Lcom/ss/android/ugc/aweme/im/sticker/api/service/photo2sticker/Photo2StickerInlineRepository;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(PrivateVideoViewReceivePowerCell$createAssemAttached2Cell$1.class, "photo2StickerSessionInfo", "getPhoto2StickerSessionInfo()Lcom/ss/android/ugc/aweme/im/chatroom/api/model/SessionInfo;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(PrivateVideoViewReceivePowerCell$createAssemAttached2Cell$1.class, "photo2StickerService", "getPhoto2StickerService()Lcom/ss/android/ugc/aweme/im/sticker/api/service/IIMPhoto2StickerService;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(PrivateVideoViewReceivePowerCell$createAssemAttached2Cell$1.class, "photo2StickerViewModel", "getPhoto2StickerViewModel()Lcom/ss/android/ugc/aweme/im/sticker/api/viewmodel/Photo2StickerViewModel;", 0);
        c09r3.getClass();
        LLLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    public final InterfaceC1808750xAX Wp() {
        InterfaceC1808750xAX interfaceC1808750xAX = this.LLLIL;
        if (interfaceC1808750xAX == null) {
            synchronized (this) {
                interfaceC1808750xAX = this.LLLIL;
                if (interfaceC1808750xAX == null) {
                    InterfaceC1808750xAX interfaceC1808750xAX2 = (InterfaceC1808750xAX) C1807670x8n.LLLLZIL();
                    this.LLLIL = interfaceC1808750xAX2;
                    return interfaceC1808750xAX2;
                }
            }
        }
        return interfaceC1808750xAX;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    public final SessionInfo Vp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLLIZZ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLILZLLLI;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLLILZLLLI = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLLIZZ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        SessionInfo sessionInfo = (SessionInfo) c0qsjLIZLLL.getAbility(SessionInfo.class);
        C687700QyG.LJ(sessionInfo, SessionInfo.class);
        return sessionInfo;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem
    public final void op() {
        super.op();
        SkeletonLayoutAssemblerBridge skeletonLayoutAssemblerBridgeBp = Bp();
        AbstractC899510ZQn<?, ?> abstractC899510ZQnFQ2 = skeletonLayoutAssemblerBridgeBp != null ? skeletonLayoutAssemblerBridgeBp.fQ2(C462510IBt.LIZ) : null;
        if (!(abstractC899510ZQnFQ2 instanceof AbstractC899510ZQn) || abstractC899510ZQnFQ2 == null) {
            return;
        }
        tp(C462510IBt.LIZ);
        sp(new AwS380S0200000_14(this, (PrivateVideoViewReceivePowerCell$createAssemAttached2Cell$1) abstractC899510ZQnFQ2, (AbstractC899510ZQn<?, MessageLeftIconState>) 54));
    }

    public PrivateVideoViewReceivePowerCell$createAssemAttached2Cell$1(C19719912Dl c19719912Dl) {
        super(c19719912Dl);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatRoomCameraVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLIIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ, 504), AFwS248S0000000_14.get$arr$(501), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLLIIIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ2, 505), AFwS248S0000000_14.get$arr$(502), null, true);
        this.LLLIIIL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLLIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1555));
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 1554);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(Photo2StickerViewModel.class);
        this.LLLIILIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ3, 506), AFwS248S0000000_14.get$arr$(503), awS558S0100000_14, true);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
    public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
        SessionInfo sessionInfo;
        C0ZSU c0zsu = C0ZSU.LIZ;
        C0ZQI c0zqiUp = Up();
        C457780HxI c457780HxI = (C457780HxI) this.LLLIIIL.getValue();
        LifecycleCoroutineScope lifecycleScope = null;
        if (c457780HxI != null) {
            sessionInfo = c457780HxI.LL;
        } else {
            sessionInfo = null;
        }
        AssemVMLazy assemVMLazy = this.LLLIIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLJ;
        C0IBF c0ibf = ((C457970Hxb) assemVMLazy.getValue().getState()).LL;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        PanelStateViewModel panelStateViewModel = (PanelStateViewModel) this.LLLIIIIL.getValue();
        InterfaceC889250YuZ interfaceC889250YuZ = (InterfaceC889250YuZ) this.LLLIIL.getValue();
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentLJI2);
        }
        Photo2StickerViewModel photo2StickerViewModel = (Photo2StickerViewModel) this.LLLIILIL.getValue();
        C0ZSY c0zsy = this.LLLILZJ;
        if (c0zsy == null) {
            synchronized (this) {
                c0zsy = this.LLLILZJ;
                if (c0zsy == null) {
                    c0zsy = (C0ZSY) C1807670x8n.LLLLLLZ();
                    this.LLLILZJ = c0zsy;
                }
            }
        }
        c0zsu.getClass();
        return C0ZSU.LIZJ(c19egLIZ, fragmentLJI, c869590Y9l, interfaceC889250YuZ, sessionInfo, c0ibf, c0zqiUp, c0zsy, photo2StickerViewModel, panelStateViewModel, lifecycleScope);
    }
}
