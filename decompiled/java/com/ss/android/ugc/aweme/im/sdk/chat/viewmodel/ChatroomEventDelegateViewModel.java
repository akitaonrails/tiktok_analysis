package com.ss.android.ugc.aweme.im.sdk.chat.viewmodel;

import X.C01GW;
import X.C11NJ;
import X.C11S5;
import X.C1239300iM4;
import X.C13LE;
import X.C2217381BqS;
import X.C452501pT;
import X.C902950ZbZ;
import X.C903200Zby;
import X.C903930Zd9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461830I9d;
import X.InterfaceC903260Zc4;
import X.InterfaceC905060Zey;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper;
import com.ss.android.ugc.aweme.im.service.service.IAwemeCardManager;
import com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import com.ss.android.ugc.aweme.story.highlights.IHighlightFetchManager;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatroomEventDelegateViewModel extends ViewModel {
    public static final C902950ZbZ LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final String LL;
    public final InterfaceC461830I9d LLILLJJLI;
    public final C11NJ LLILLL;
    public final InterfaceC903260Zc4 LLILZ;
    public final C01GW LLILZIL;
    public volatile C903930Zd9 LLILZLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ZbZ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatroomEventDelegateViewModel.class, "imConvoRepoProvider", "getImConvoRepoProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMConversationRepositoryProvider;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = new Object() { // from class: X.0ZbZ
        };
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLL.LJ();
        this.LLILLJJLI.LIZLLL(this.LL);
    }

    public ChatroomEventDelegateViewModel(String str) {
        InterfaceC461830I9d interfaceC461830I9d = new InterfaceC461830I9d() { // from class: X.0Z5l
            @Override // X.InterfaceC461830I9d
            public final void LIZ(C0Y8T c0y8t) {
                IAuthorSupporterHelper iAuthorSupporterHelper = (IAuthorSupporterHelper) PluggableExtentionKt.pluggableSpiForReal(IAuthorSupporterHelper.class);
                if (iAuthorSupporterHelper != null) {
                    iAuthorSupporterHelper.LIZ(c0y8t);
                }
            }

            @Override // X.InterfaceC461830I9d
            public final void LIZIZ(List list) {
                IAwemeCoverManager.LIZ.getClass();
                IAwemeCoverManager iAwemeCoverManagerLIZ = C0Z69.LIZ();
                if (iAwemeCoverManagerLIZ != null) {
                    iAwemeCoverManagerLIZ.LIZIZ(list, true);
                }
            }

            @Override // X.InterfaceC461830I9d
            public final void LIZLLL(String str2) {
                C1336205Ku.LIZ(false).getMessageRefreshManager().LIZIZ(str2);
                if (C06A9.LIZJ) {
                    C06A9.LIZJ = false;
                    ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIJI().LJFF();
                }
            }

            @Override // X.InterfaceC461830I9d
            public final void LJ(String str2) {
                C1440005kM.LIZ(new C1671206gY(str2));
            }

            @Override // X.InterfaceC461830I9d
            public final void LIZJ(String str2, List list) {
                InterfaceC1335505Kn eventCenter;
                LIZIZ(list);
                C1336205Ku.LIZ(false).getMessageRefreshManager().LIZJ(str2, list);
                C1336205Ku.LIZ(false).getMessageRefreshManager().LIZ(str2, list);
                IAwemeCardManager.LIZ.getClass();
                IAwemeCardManager iAwemeCardManagerLIZ = C0I5D.LIZ();
                if (iAwemeCardManagerLIZ != null) {
                    iAwemeCardManagerLIZ.LJ(str2, list);
                }
                IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
                if (iIMPreloadService != null && (eventCenter = iIMPreloadService.getEventCenter()) != null) {
                    eventCenter.LIZ(new C05GP(list));
                }
                IHighlightFetchManager.LIZ.getClass();
                IHighlightFetchManager value = C06UO.LIZIZ.getValue();
                if (value != null) {
                    value.LIZLLL(list);
                }
                C06A9 c06a9 = C06A9.LIZ;
                if (!C06A9.LIZJ) {
                    C06A9.LIZJ = true;
                    ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIJI().LJIIIZ(c06a9);
                }
            }
        };
        C11S5.LIZ();
        C11NJ c11nj = new C11NJ();
        C903200Zby c903200Zby = new C903200Zby("ChatRoomViewModel");
        this.LL = str;
        this.LLILLJJLI = interfaceC461830I9d;
        this.LLILLL = c11nj;
        this.LLILZ = c903200Zby;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1674));
        this.LLILZIL = c01gwLIZIZ;
        c11nj.LIZ(C1239300iM4.LJ(((InterfaceC905060Zey) c01gwLIZIZ.getValue()).LIZ(str), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new AwS593S0100000_14(this, 359)));
    }
}
