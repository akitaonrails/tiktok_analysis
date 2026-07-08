package com.ss.android.ugc.aweme.im.saas.host.impl.favorite;

import X.AbstractC738140SxQ;
import X.C06IT;
import X.C0I0B;
import X.C1171750gb7;
import X.C13IQ;
import X.C13LE;
import X.C1400340mXo;
import X.C19EG;
import X.C2217401BqU;
import X.C869590Y9l;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.favorites.business.collaboration.CollaborativeUserInfo;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.saas.host.api.favorite.IMFavoriteBridgeApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IMFavoriteBridgeImpl implements IMFavoriteBridgeApi {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(IMFavoriteBridgeImpl.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.favorite.IMFavoriteBridgeApi
    public final C13IQ<? extends UISlotAssem> LIZIZ() {
        IFavoriteService iFavoriteService = (IFavoriteService) PluggableExtentionKt.pluggableSpi$default(IFavoriteService.class, false, false, false, 14, null);
        if (iFavoriteService != null) {
            return iFavoriteService.LIZIZ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.favorite.IMFavoriteBridgeApi
    public final boolean LIZLLL() {
        return C1171750gb7.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.favorite.IMFavoriteBridgeApi
    public final void LIZ(AbstractC738140SxQ abstractC738140SxQ, List<? extends C869590Y9l> list) {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        for (C869590Y9l c869590Y9l : list) {
            C869590Y9l c869590Y9l2 = c869590Y9l;
            if (c869590Y9l2.getMsgType() == 2000 && Intrinsics.LJFF(c869590Y9l2.getScene(), "ci_share_collaborative_collection") && !Intrinsics.LJFF(String.valueOf(c869590Y9l2.getSender()), curUserId)) {
                if (c869590Y9l != null) {
                    try {
                        AssemVMLazy assemVMLazyLIZ = C06IT.LIZ(abstractC738140SxQ);
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZIZ;
                        ((ICommonChatNoticeViewModel) assemVMLazyLIZ.getValue()).PQ2();
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.favorite.IMFavoriteBridgeApi
    public final void LIZJ(C19EG c19eg, CollaborativeUserInfo collaborativeUserInfo, String str) {
        IFavoriteService iFavoriteService = (IFavoriteService) PluggableExtentionKt.pluggableSpi$default(IFavoriteService.class, false, false, false, 14, null);
        if (iFavoriteService != null) {
            iFavoriteService.LIZJ(c19eg, collaborativeUserInfo, str);
        }
    }
}
