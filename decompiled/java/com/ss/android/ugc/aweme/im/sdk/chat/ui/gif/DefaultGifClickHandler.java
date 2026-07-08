package com.ss.android.ugc.aweme.im.sdk.chat.ui.gif;

import X.C019F;
import X.C01D1;
import X.C13IQ;
import X.C13LE;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C5182020e;
import X.C724750Sbp;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListGifClickAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultGifClickHandler implements MessageListGifClickAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final SessionInfo LL;
    public final Fragment LLILLJJLI;
    public final AssemVMLazy LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DefaultGifClickHandler.class, "sendMessageVM", "getSendMessageVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/sendmsg/SendMessageVM;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public DefaultGifClickHandler(Fragment fragment, SessionInfo sessionInfo) {
        AssemVMLazy assemVMLazy;
        this.LL = sessionInfo;
        this.LLILLJJLI = fragment;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SendMessageVM.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 502);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(490);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1353), aFwS236S0000000_6, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new AwS550S0100000_6(fragment, 1354), aFwS236S0000000_6, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1355), aFwS236S0000000_6, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLILLL = assemVMLazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListGifClickAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Qw2(com.ss.android.ugc.aweme.im.message.content.GifContent r29, X.C869590Y9l r30, android.view.View r31) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultGifClickHandler.Qw2(com.ss.android.ugc.aweme.im.message.content.GifContent, X.0Y9l, android.view.View):void");
    }
}
