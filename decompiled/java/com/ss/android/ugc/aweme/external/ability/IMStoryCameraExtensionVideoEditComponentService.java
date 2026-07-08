package com.ss.android.ugc.aweme.external.ability;

import X.C0ET4;
import X.C1428660nHU;
import X.C1455250nyN;
import X.C1599690rjL;
import X.C1659700tI8;
import X.C19A3;
import X.C2188811AlT;
import X.C385670FAf;
import X.C536960L4c;
import X.C539960LFq;
import X.C559610Lx9;
import X.EnumC1642750sqn;
import X.InterfaceC1431860nMe;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.social.creation.api.StoryCreationEditComponentService;
import com.ss.android.ugc.aweme.social.sendtodm.SendToDMComponent;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class IMStoryCameraExtensionVideoEditComponentService implements StoryCreationEditComponentService {
    @Override // com.ss.android.ugc.aweme.social.creation.api.StoryCreationEditComponentService
    public final void LIZ(C539960LFq c539960LFq, C1455250nyN c1455250nyN, C1428660nHU c1428660nHU, C536960L4c c536960L4c) {
        IMSharePanelApi.LIZ.getClass();
        if (C1599690rjL.LIZ().LIZ().isEnable()) {
            EnumC1642750sqn enumC1642750sqn = c1428660nHU.LIZ;
            C385670FAf<Boolean> c385670FAf = c536960L4c.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register component ");
            sbLIZ.append(SendToDMComponent.class.getName());
            sbLIZ.append(" api ");
            sbLIZ.append(InterfaceC1431860nMe.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, c385670FAf, InterfaceC1431860nMe.class, SendToDMComponent.class, new AwS388S0200000_22(new C0ET4(), (C559610Lx9) c539960LFq, (C19A3) c1455250nyN, 252));
        }
    }
}
