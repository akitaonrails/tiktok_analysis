package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.photoswap;

import X.C01GW;
import X.C0IB0;
import X.C0ICS;
import X.C0ZSO;
import X.C0ZST;
import X.C0ZSU;
import X.C0ZWB;
import X.C0ZWC;
import X.C1509305vX;
import X.C452501pT;
import X.C457780HxI;
import X.C462630ICf;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C900720ZVe;
import X.C900860ZVs;
import X.C901010ZWh;
import X.C901020ZWi;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPhotoClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability.PhotoSwapAnimationAbility;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class PhotoSwapNewProtocol implements SkeletonMessageListProtocol<C901020ZWi, C901010ZWh> {
    public final Fragment LL;
    public final C457780HxI LLILLJJLI;
    public final C01GW LLILLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 997));
    public final C01GW<MessageListPhotoClickAbility> LLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 996));
    public final C0ZST LLILZIL = new Object() { // from class: X.0ZST
    };
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C901020ZWi>> LLILZLL = PhotoSwapSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C901010ZWh>> LLIZ = PhotoSwapReceivePowerCell.class;
    public final C898790ZNt LLIZLLLIL = new C898790ZNt(new int[]{1802}, AFwS248S0000000_14.get$arr$(275));
    public final MessageListProtocolEnum LLJ = MessageListProtocolEnum.PHOTO_SWAP_REFACTOR;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C901010ZWh> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C901020ZWi> Wh() {
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

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C901020ZWi>> da() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLJ;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C901010ZWh>> gr() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ZST] */
    public PhotoSwapNewProtocol(Fragment fragment, C457780HxI c457780HxI) {
        this.LL = fragment;
        this.LLILLJJLI = c457780HxI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, final C0IB0 c0ib0) {
        SessionInfo sessionInfo;
        final C462630ICf c462630ICf = C0ICS.LIZ(true).LIZ;
        C0ZST c0zst = this.LLILZIL;
        Fragment fragment = this.LL;
        C457780HxI c457780HxI = this.LLILLJJLI;
        if (c457780HxI != null) {
            sessionInfo = c457780HxI.LL;
        } else {
            sessionInfo = null;
        }
        C0ZSO.LIZ(sessionInfo);
        C0ZSU c0zsu = C0ZSU.LIZ;
        PhotoSwapAnimationAbility photoSwapAnimationAbility = (PhotoSwapAnimationAbility) this.LLILLL.getValue();
        c0zsu.getClass();
        boolean zLJIIIIZZ = C0ZSU.LJIIIIZZ(c869590Y9l, photoSwapAnimationAbility);
        C01GW<MessageListPhotoClickAbility> c01gw = this.LLILZ;
        c0zst.getClass();
        final C0ZWB c0zwbLIZ = new C900860ZVs(new C900720ZVe(zLJIIIIZZ, c01gw)).LIZ(fragment, c869590Y9l, sessionInfo, false);
        return new C0ZWC<PictureCardTemplate>(c0ib0, c462630ICf, c0zwbLIZ) { // from class: X.0ZWi
            public final C0IB0 LL;
            public final C462630ICf LLILLJJLI;
            public final C0ZWB LLILLL;
            public final C901040ZWk LLILZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C901020ZWi)) {
                    return false;
                }
                C901020ZWi c901020ZWi = (C901020ZWi) obj;
                return Intrinsics.LJFF(this.LL, c901020ZWi.LL) && Intrinsics.LJFF(this.LLILLJJLI, c901020ZWi.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c901020ZWi.LLILLL) && Intrinsics.LJFF(this.LLILZ, c901020ZWi.LLILZ);
            }

            public final int hashCode() {
                return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PhotoSwapSendData(skeletonLayoutData=");
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
                Iterator<InterfaceC900840ZVq> it2 = c0zwbLIZ.LIZLLL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        InterfaceC900840ZVq next = it2.next();
                        z = true;
                        if ((next instanceof C900910ZVx) || (next instanceof C0ZW1)) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                C901040ZWk c901040ZWk = new C901040ZWk(z, false);
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
        C0ZST c0zst = this.LLILZIL;
        Fragment fragment = this.LL;
        C457780HxI c457780HxI = this.LLILLJJLI;
        if (c457780HxI != null) {
            sessionInfo = c457780HxI.LL;
        } else {
            sessionInfo = null;
        }
        C0ZSO.LIZ(sessionInfo);
        C0ZSU c0zsu = C0ZSU.LIZ;
        PhotoSwapAnimationAbility photoSwapAnimationAbility = (PhotoSwapAnimationAbility) this.LLILLL.getValue();
        c0zsu.getClass();
        boolean zLJIIIIZZ = C0ZSU.LJIIIIZZ(c869590Y9l, photoSwapAnimationAbility);
        C01GW<MessageListPhotoClickAbility> c01gw = this.LLILZ;
        c0zst.getClass();
        final C0ZWB c0zwbLIZ = new C900860ZVs(new C900720ZVe(zLJIIIIZZ, c01gw)).LIZ(fragment, c869590Y9l, sessionInfo, false);
        return new C0ZWC<PictureCardTemplate>(c0ib0, c462630ICf, c0zwbLIZ) { // from class: X.0ZWh
            public final C0IB0 LL;
            public final C462630ICf LLILLJJLI;
            public final C0ZWB LLILLL;
            public final C901040ZWk LLILZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C901010ZWh)) {
                    return false;
                }
                C901010ZWh c901010ZWh = (C901010ZWh) obj;
                return Intrinsics.LJFF(this.LL, c901010ZWh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c901010ZWh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c901010ZWh.LLILLL) && Intrinsics.LJFF(this.LLILZ, c901010ZWh.LLILZ);
            }

            public final int hashCode() {
                return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PhotoSwapReceiveData(skeletonLayoutData=");
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
                Iterator<InterfaceC900840ZVq> it2 = c0zwbLIZ.LIZLLL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        InterfaceC900840ZVq next = it2.next();
                        z = true;
                        if ((next instanceof C900910ZVx) || (next instanceof C0ZW1)) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                C901040ZWk c901040ZWk = new C901040ZWk(z, false);
                this.LL = c0ib0;
                this.LLILLJJLI = c462630ICf;
                this.LLILLL = c0zwbLIZ;
                this.LLILZ = c901040ZWk;
            }
        };
    }
}
