package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C09R3;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C15628069y;
import X.C1637806bA;
import X.C1637906bB;
import X.C1715706nj;
import X.C1716006nm;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C869590Y9l;
import X.InterfaceC1146704e9;
import X.InterfaceC1602806Pi;
import X.InterfaceC1715506nh;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.AObjectS378S0100000_2;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.ability.IMChatRoomAlphaVideoAbility;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.lightinteract.api.assem.ChatRoomAlphaVideoCommonVM;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS25S0200100_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatRoomAlphaVideoCommonAssem extends AbstractC738140SxQ implements IMChatRoomAlphaVideoAbility, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public C127G LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatRoomAlphaVideoCommonAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/lightinteract/api/assem/ChatRoomAlphaVideoCommonVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ChatRoomAlphaVideoCommonAssem.class, "chatRoomAlphaVideoViewModel", "getChatRoomAlphaVideoViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/alphavideo/ChatRoomAlphaVideoViewModel;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public ChatRoomAlphaVideoCommonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatRoomAlphaVideoCommonVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 410), AFwS229S0000000_2.get$arr$(276), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ChatRoomAlphaVideoViewModel.class);
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 411), AFwS229S0000000_2.get$arr$(277), null, true);
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

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLILLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLILLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatRoomAlphaVideoViewModel.class, new AObjectS378S0100000_2(this, 21)}, defaultViewModelProviderFactory);
                    this.LLILLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IMChatRoomAlphaVideoAbility.class, null, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IMChatRoomAlphaVideoAbility.class, null);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class});
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        c0qsjLIZIZ.unbindAbility(assemVMLazy.getValue(), InterfaceC1602806Pi.class);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLightInteractionOnScreen(C15628069y c15628069y) {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        ChatRoomAlphaVideoViewModel chatRoomAlphaVideoViewModel = (ChatRoomAlphaVideoViewModel) assemVMLazy.getValue();
        C869590Y9l c869590Y9l = c15628069y.LIZ;
        if (Intrinsics.LJFF(c869590Y9l.getConversationId(), chatRoomAlphaVideoViewModel.LLILLL.getValue())) {
            long jVQ2 = chatRoomAlphaVideoViewModel.vQ2();
            chatRoomAlphaVideoViewModel.xQ2(c869590Y9l.getOrderIndex());
            chatRoomAlphaVideoViewModel.LL.s30(new AwS25S0200100_2(Collections.singletonList(c869590Y9l), (List<? extends C869590Y9l>) chatRoomAlphaVideoViewModel, (ChatRoomAlphaVideoViewModel) jVQ2, 1L));
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class});
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        c0qsjLIZIZ.bindAbility(assemVMLazy.getValue(), InterfaceC1602806Pi.class);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.ability.IMChatRoomAlphaVideoAbility
    public final void pr2(DataSource dataSource) {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        assemVMLazy.getValue().setState(new AwS581S0100000_2(dataSource, 713));
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.ability.IMChatRoomAlphaVideoAbility
    public final void lS0(DataSource dataSource, InterfaceC1715506nh interfaceC1715506nh, Map<String, Bitmap> map, boolean z, C1715706nj c1715706nj) {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        ChatRoomAlphaVideoViewModel chatRoomAlphaVideoViewModel = (ChatRoomAlphaVideoViewModel) assemVMLazy.getValue();
        chatRoomAlphaVideoViewModel.LL.s30(new C1716006nm(chatRoomAlphaVideoViewModel, dataSource, interfaceC1715506nh, map, z, c1715706nj));
    }
}
