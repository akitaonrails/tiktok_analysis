package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import Y.AObjectS67S0000000_14;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.IMAnalyticsUtil;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatCommonAssem extends AbstractC738140SxQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 756));
    public final AssemVMLazy LLILLL;
    public C127G LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatCommonAssem.class, "chatCommonViewModel", "getChatCommonViewModel()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatCommonViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ChatCommonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatCommonViewModel.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 757), AFwS248S0000000_14.get$arr$(214), null, true);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLILZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLILZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatCommonViewModel.class, new AObjectS67S0000000_14(this, 18)}, defaultViewModelProviderFactory);
                    this.LLILZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        IMAnalyticsUtil iMAnalyticsUtil = IMAnalyticsUtil.LIZIZ;
        SessionInfo sessionInfo = (SessionInfo) this.LLILLJJLI.getValue();
        iMAnalyticsUtil.getClass();
        IMAnalyticsUtil.LJ = sessionInfo;
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        assemVMLazy.getValue().getState();
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IMAnalyticsUtil.LIZIZ.getClass();
        IMAnalyticsUtil.LJ = null;
    }
}
