package com.ss.android.ugc.aweme.im.actionbar.serviceimpl;

import X.C0I0B;
import X.C1400340mXo;
import X.C1BU3;
import X.C269800Ahm;
import X.C603820NmG;
import com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMemoryCacheService;
import com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonConf;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class ActionBarMemoryCacheServiceImpl implements IActionBarMemoryCacheService {
    public static final ActionBarMemoryCacheServiceImpl LL;
    public static final C1BU3 LLILLJJLI;

    public static final class ActionBarMemoryCacheServiceManage implements IActionBarMemoryCacheService {
        public final /* synthetic */ ActionBarMemoryCacheServiceImpl LL = ActionBarMemoryCacheServiceImpl.LL;

        @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMemoryCacheService
        public final void LIZ() {
            this.LL.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMemoryCacheService
        public final void LJIIIIZZ(String str, List<ActionBarButtonConf> list) {
            this.LL.LJIIIIZZ(str, list);
        }

        @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMemoryCacheService
        public final List<ActionBarButtonConf> LJJJI(String str) {
            return this.LL.LJJJI(str);
        }

        @Override // X.InterfaceC908170Zjz
        public final void onAccountResult(int i, boolean z, int i2, User user) {
            this.LL.onAccountResult(i, z, 0, user);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1BU3] */
    static {
        ActionBarMemoryCacheServiceImpl actionBarMemoryCacheServiceImpl = new ActionBarMemoryCacheServiceImpl();
        LL = actionBarMemoryCacheServiceImpl;
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(actionBarMemoryCacheServiceImpl);
        final int iIntValue = ((Number) C269800Ahm.LIZ.getValue()).intValue();
        LLILLJJLI = new C603820NmG<String, List<? extends ActionBarButtonConf>>(iIntValue) { // from class: X.1BU3
            @Override // X.C603820NmG
            public final /* bridge */ /* synthetic */ int LJII(String str, List<? extends ActionBarButtonConf> list) {
                return 1;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMemoryCacheService
    public final void LIZ() {
        LLILLJJLI.LJIIIZ(-1);
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMemoryCacheService
    public final List<ActionBarButtonConf> LJJJI(String str) {
        return (List) LLILLJJLI.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMemoryCacheService
    public final void LJIIIIZZ(String str, List<ActionBarButtonConf> list) {
        LLILLJJLI.LIZLLL(str, list);
    }

    @Override // X.InterfaceC908170Zjz
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        LLILLJJLI.LJIIIZ(-1);
    }
}
