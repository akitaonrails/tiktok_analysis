package com.ss.android.ugc.aweme.im.b2c.analytics;

import X.C019F;
import X.C01GW;
import X.C054G;
import X.C05LS;
import X.C05LT;
import X.C06M6;
import X.C0PEM;
import X.C0ZDX;
import X.C11NJ;
import X.C127G;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1DEV;
import X.C2191201ApK;
import X.C2217381BqS;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C869590Y9l;
import X.EnumC1660706er;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.AObjectS55S0000000_2;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.common.ability.SystemNoticeBindAbility;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class B2CAnalyticsAssem extends UIContentAssem implements SystemNoticeBindAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final Set<String> LLIZLLLIL = new LinkedHashSet();
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJI = new C1559260qg8(new C723580SZw(this, C06M6.class, null), checkSupervisorPrepared());
    public final C01GW LLJIJIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS546S0100000_2(this, 302));
    public final C054G LLJILJIL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final AssemVMLazy LLJILJILJ;
    public final C11NJ LLJILLL;
    public final C1DEV LLJJ;
    public boolean LLJJI;
    public C127G LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(B2CAnalyticsAssem.class, "chatCommonViewModel", "getChatCommonViewModel()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatCommonViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public B2CAnalyticsAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatCommonViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 303), AFwS229S0000000_2.get$arr$(233), null, true);
        this.LLJILLL = new C11NJ();
        this.LLJJ = C2191201ApK.LIZ();
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        ChatFeatureListConf chatFeatureListConf;
        super.onCreate();
        C06M6 c06m6 = (C06M6) this.LLJI.getValue();
        if (c06m6 == null || (chatFeatureListConf = c06m6.LL) == null || chatFeatureListConf.componentEnable(EnumC1660706er.EVENT_TRACKING.getId())) {
            AssemVMLazy assemVMLazy = this.LLJILJILJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06Lr
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1593606Lu) obj).LLILLL;
                }
            }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 35), 4);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C05LT(this, null), 3);
        }
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 111378981) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIII;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIII;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatCommonViewModel.class, new AObjectS55S0000000_2(this, 38)}, defaultViewModelProviderFactory);
                    this.LLJJIII = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJILLL.LJ();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.im.common.ability.SystemNoticeBindAbility
    public final void cH1(C869590Y9l c869590Y9l) {
        String conversationId;
        String strLJII = C0ZDX.LJII(c869590Y9l);
        if (strLJII != null && strLJII.length() != 0) {
            String uuid = c869590Y9l.getUuid();
            if (this.LLIZLLLIL.contains(uuid)) {
                return;
            }
            SessionInfo sessionInfo = (SessionInfo) this.LLJIJIL.getValue();
            if (sessionInfo == null || (conversationId = sessionInfo.getConversationId()) == null) {
                conversationId = "";
            }
            C23250099c.LIZLLL(this.LLJILJIL, null, null, new C05LS(uuid, conversationId, this, c869590Y9l, null), 3);
            this.LLIZLLLIL.add(uuid);
        }
    }
}
