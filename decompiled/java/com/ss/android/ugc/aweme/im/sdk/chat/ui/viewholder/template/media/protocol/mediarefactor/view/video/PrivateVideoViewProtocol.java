package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.video;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C0IB0;
import X.C0IBU;
import X.C0ICS;
import X.C0ZSO;
import X.C0ZSQ;
import X.C0ZWB;
import X.C0ZWC;
import X.C13LE;
import X.C1622206Wu;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C457780HxI;
import X.C457970Hxb;
import X.C462630ICf;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C900980ZWe;
import X.C901030ZWj;
import X.C902710ZbB;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC461380I7k;
import X.InterfaceC724760Sbq;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class PrivateVideoViewProtocol implements SkeletonMessageListProtocol<C901030ZWj, C900980ZWe> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final Fragment LL;
    public final C457780HxI LLILLJJLI;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C901030ZWj>> LLILLL = PrivateVideoViewSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900980ZWe>> LLILZ = PrivateVideoViewReceivePowerCell.class;
    public final AssemVMLazy LLILZIL;
    public final C0ZSQ LLILZLL;
    public final C898790ZNt LLIZ;
    public final MessageListProtocolEnum LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PrivateVideoViewProtocol.class, "chatroomCameraVM", "getChatroomCameraVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/camera/ChatRoomCameraVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C900980ZWe> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C901030ZWj> Wh() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return list;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    public final boolean LIZ() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        int i = C0IBU.LIZ[((C457970Hxb) assemVMLazy.getValue().getState()).LL.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new C1954807lC();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C901030ZWj>> da() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900980ZWe>> gr() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    public PrivateVideoViewProtocol(Fragment fragment, C457780HxI c457780HxI) {
        AssemVMLazy assemVMLazy;
        int i;
        this.LL = fragment;
        this.LLILLJJLI = c457780HxI;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatRoomCameraVM.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 998);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(277);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            i = 1;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 999), aFwS248S0000000_14, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new AwS558S0100000_14(fragment, LSPassThroughRecordSizeConfig.DEFAULT), aFwS248S0000000_14, null, null, null);
            i = 1;
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            i = 1;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 1001), aFwS248S0000000_14, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLILZIL = assemVMLazy;
        this.LLILZLL = new C0ZSQ();
        int[] iArr = new int[i];
        iArr[0] = 1803;
        this.LLIZ = new C898790ZNt(iArr, AFwS248S0000000_14.get$arr$(276));
        this.LLIZLLLIL = MessageListProtocolEnum.PRIVATE_VIDEO_VIEW;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, final C0IB0 c0ib0) {
        SessionInfo sessionInfo;
        final C462630ICf c462630ICf = C0ICS.LIZ(true).LIZ;
        C0ZSQ c0zsq = this.LLILZLL;
        Fragment fragment = this.LL;
        C457780HxI c457780HxI = this.LLILLJJLI;
        if (c457780HxI != null) {
            sessionInfo = c457780HxI.LL;
        } else {
            sessionInfo = null;
        }
        C0ZSO.LIZ(sessionInfo);
        final C0ZWB c0zwbLIZ = c0zsq.LIZ.LIZ(fragment, c869590Y9l, sessionInfo, LIZ());
        return new C0ZWC<VideoCardTemplate>(c0ib0, c462630ICf, c0zwbLIZ) { // from class: X.0ZWj
            public final C0IB0 LL;
            public final C462630ICf LLILLJJLI;
            public final C0ZWB LLILLL;
            public final C901040ZWk LLILZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C901030ZWj)) {
                    return false;
                }
                C901030ZWj c901030ZWj = (C901030ZWj) obj;
                return Intrinsics.LJFF(this.LL, c901030ZWj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c901030ZWj.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c901030ZWj.LLILLL) && Intrinsics.LJFF(this.LLILZ, c901030ZWj.LLILZ);
            }

            public final int hashCode() {
                return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PrivateVideoViewSendData(skeletonLayoutData=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", corners=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", imageData=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", extraData=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C0ZWC
            public final C462630ICf LJLIL() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LL;
            }

            @Override // X.C0ZWC
            public final C901040ZWk getExtraData() {
                return this.LLILZ;
            }

            @Override // X.C0ZWC
            public final C0ZWB getImageData() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C461450I7r.LIZ(this, interfaceC1891350zJl);
            }

            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C0ZWA.LIZ(this, interfaceC1891350zJl);
            }

            {
                boolean z;
                InterfaceC900840ZVq next;
                Iterator<InterfaceC900840ZVq> it2 = c0zwbLIZ.LIZLLL.iterator();
                do {
                    z = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    next = it2.next();
                    if (next instanceof C900910ZVx) {
                        break;
                    }
                } while (!(next instanceof C0ZW1));
                z = true;
                C901040ZWk c901040ZWk = new C901040ZWk(z, true);
                this.LL = c0ib0;
                this.LLILLJJLI = c462630ICf;
                this.LLILLL = c0zwbLIZ;
                this.LLILZ = c901040ZWk;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, final C0IB0 c0ib0) {
        SessionInfo sessionInfo;
        final C462630ICf c462630ICf = C0ICS.LIZ(false).LIZ;
        C0ZSQ c0zsq = this.LLILZLL;
        Fragment fragment = this.LL;
        C457780HxI c457780HxI = this.LLILLJJLI;
        if (c457780HxI != null) {
            sessionInfo = c457780HxI.LL;
        } else {
            sessionInfo = null;
        }
        C0ZSO.LIZ(sessionInfo);
        final C0ZWB c0zwbLIZ = c0zsq.LIZ.LIZ(fragment, c869590Y9l, sessionInfo, LIZ());
        return new C0ZWC<VideoCardTemplate>(c0ib0, c462630ICf, c0zwbLIZ) { // from class: X.0ZWe
            public final C0IB0 LL;
            public final C462630ICf LLILLJJLI;
            public final C0ZWB LLILLL;
            public final C901040ZWk LLILZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C900980ZWe)) {
                    return false;
                }
                C900980ZWe c900980ZWe = (C900980ZWe) obj;
                return Intrinsics.LJFF(this.LL, c900980ZWe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c900980ZWe.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c900980ZWe.LLILLL) && Intrinsics.LJFF(this.LLILZ, c900980ZWe.LLILZ);
            }

            public final int hashCode() {
                return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PrivateVideoViewReceiveData(skeletonLayoutData=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", corners=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", imageData=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", extraData=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C0ZWC
            public final C462630ICf LJLIL() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LL;
            }

            @Override // X.C0ZWC
            public final C901040ZWk getExtraData() {
                return this.LLILZ;
            }

            @Override // X.C0ZWC
            public final C0ZWB getImageData() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C461450I7r.LIZ(this, interfaceC1891350zJl);
            }

            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C0ZWA.LIZ(this, interfaceC1891350zJl);
            }

            {
                boolean z;
                InterfaceC900840ZVq next;
                Iterator<InterfaceC900840ZVq> it2 = c0zwbLIZ.LIZLLL.iterator();
                do {
                    z = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    next = it2.next();
                    if (next instanceof C900910ZVx) {
                        break;
                    }
                } while (!(next instanceof C0ZW1));
                z = true;
                C901040ZWk c901040ZWk = new C901040ZWk(z, true);
                this.LL = c0ib0;
                this.LLILLJJLI = c462630ICf;
                this.LLILLL = c0zwbLIZ;
                this.LLILZ = c901040ZWk;
            }
        };
    }
}
