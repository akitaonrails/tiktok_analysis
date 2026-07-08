package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.bot;

import X.C019F;
import X.C1250250idj;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C898670ZNh;
import X.InterfaceC2217461Bqa;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNavAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class BotDetailNavAssem extends ChatDetailNavAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BotDetailNavAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/redesign/detailpage/viewmodel/BotDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BotDetailNavAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BotDetailViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 565), AFwS229S0000000_2.get$arr$(320), null, true);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNavAssem
    public final void Ho() {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNavAssem
    public final void No() {
        IMAIBotInfo iMAIBotInfo;
        String str;
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ == null || !iMCrossAppFeatureDiffApiLIZIZ.LIZLLL()) {
            return;
        }
        Object obj = getConfig().LLILZ.get("key_bot_info");
        if (!(obj instanceof IMAIBotInfo) || (iMAIBotInfo = (IMAIBotInfo) obj) == null || (str = iMAIBotInfo.nickname) == null) {
            return;
        }
        TuxNavBar tuxNavBarJo = Jo();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = str;
        tuxNavBarJo.LJIJJ(c1250250idj);
    }
}
