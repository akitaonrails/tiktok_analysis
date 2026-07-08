package com.ss.android.ugc.profile.business.ur;

import X.AbstractC20656215sG;
import X.C1252030igb;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.profile.ui.uiinterface.INotificationLiveService;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationLiveServiceImpl implements INotificationLiveService {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.profile.ui.uiinterface.INotificationLiveService
    public final String LIZ() {
        AbstractC20656215sG abstractC20656215sGLJ = PopupManager.LJ();
        return (!(abstractC20656215sGLJ instanceof C1252030igb) || abstractC20656215sGLJ == null) ? "general" : "notification";
    }
}
