package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.preshown;

import X.C019F;
import X.C01D1;
import X.C0ZTD;
import X.C13LE;
import X.C1622206Wu;
import X.C1636906b1;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C457780HxI;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902730ZbD;
import X.C987103tV;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class PreshownStickerBannerProtocol implements IMMessageListProtocol<C0ZTD> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C457780HxI LL;
    public final C898790ZNt LLILLJJLI = new C898790ZNt(new int[]{4042});
    public final Class<? extends PowerCell<C0ZTD>> LLILLL = PreshownStickerBannerPowerCell.class;
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.PRESHOWN_STICKER_BANNER_PROTOCOL;
    public final AssemVMLazy LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PreshownStickerBannerProtocol.class, "messageListFooterViewModel", "getMessageListFooterViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/mesagelist/MessageListFooterViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C0ZTD> getPowerItemClazz() {
        return null;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C0ZTD> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC902770ZbH
    public final /* bridge */ /* synthetic */ InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<C0ZTD>> getWithCell() {
        return this.LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        SessionInfo sessionInfo;
        C457780HxI c457780HxI = this.LL;
        if (c457780HxI == null || (sessionInfo = c457780HxI.LL) == null || !sessionInfo.isReportPage()) {
            AssemVMLazy assemVMLazy = this.LLILZIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
            if (((C1636906b1) assemVMLazy.getValue().getState()).LL != null) {
                return list;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C869590Y9l) obj).getMsgType() != 4042) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public PreshownStickerBannerProtocol(Fragment fragment, C457780HxI c457780HxI) {
        AssemVMLazy assemVMLazy;
        this.LL = c457780HxI;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageListFooterViewModel.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 769);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(224);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 770), aFwS248S0000000_14, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new AwS558S0100000_14(fragment, 771), aFwS248S0000000_14, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 772), aFwS248S0000000_14, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLILZIL = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        return C0ZTD.LL;
    }
}
