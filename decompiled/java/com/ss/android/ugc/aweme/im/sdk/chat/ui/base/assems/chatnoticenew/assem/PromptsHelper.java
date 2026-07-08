package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem;

import X.C13LE;
import X.C19719912Dl;
import X.C453330Hq7;
import X.InterfaceC453160Hpq;
import X.InterfaceC453410HqF;
import X.InterfaceC453460HqK;
import com.ss.android.ugc.aweme.utils.IPromptsHelper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PromptsHelper implements IPromptsHelper {
    @Override // com.ss.android.ugc.aweme.utils.IPromptsHelper
    public final C19719912Dl LIZIZ() {
        return C13LE.LIZ(SingleChatNoticeAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.utils.IPromptsHelper
    public final C453330Hq7 LIZ(List list, InterfaceC453160Hpq interfaceC453160Hpq, InterfaceC453460HqK interfaceC453460HqK, InterfaceC453410HqF interfaceC453410HqF) {
        return new C453330Hq7(list, interfaceC453160Hpq, interfaceC453460HqK, interfaceC453410HqF, 16);
    }
}
