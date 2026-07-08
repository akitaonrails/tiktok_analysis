package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.prompt;

import X.C0Z4E;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C637600Oze;
import X.C888800Ytq;
import X.C889570Yv5;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestPromptInboxBannerProtocol extends InboxBannerProtocol {
    public final C637600Oze LL = C637600Oze.LJIIZILJ;
    public final C19719912Dl LLILLJJLI = C13LE.LIZ(MessageRequestPromptInboxBannerAssem.class);

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final boolean LIZ() {
        C0Z4E.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableInboxBanner(): MessageRequestPromptExperiment.enableInboxBanner():");
        sbLIZ.append(C888800Ytq.LIZIZ());
        sbLIZ.append(", isU18FeatureEnabled():");
        sbLIZ.append(C0Z4E.LJI());
        sbLIZ.append(", isBusinessUser(): ");
        sbLIZ.append(C0Z4E.LJFF());
        sbLIZ.append(", checkPromptCanShow(SCENE_INBOX_BANNER):");
        sbLIZ.append(C0Z4E.LIZJ("inbox_banner"));
        C889570Yv5.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return C888800Ytq.LIZIZ() && C0Z4E.LJI() && !C0Z4E.LJFF() && C0Z4E.LIZJ("inbox_banner");
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C19719912Dl LIZJ() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C637600Oze LIZLLL() {
        return this.LL;
    }
}
