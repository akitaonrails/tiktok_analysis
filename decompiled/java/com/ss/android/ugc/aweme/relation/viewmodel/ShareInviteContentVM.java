package com.ss.android.ugc.aweme.relation.viewmodel;

import X.C1355130lMt;
import X.C1697810uHb;
import X.InterfaceC1369790lkX;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.relation.share.InviteFriendsSheetPackage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareInviteContentVM extends ViewModel {
    public static final List<String> LLILZLL = C1697810uHb.LJIILJJIL("whatsapp_status", "instagram", "instagram_story", "snapchat", "zalo", "imo");
    public final List<InterfaceC1369790lkX> LL = new ArrayList();
    public final NextLiveData<Unit> LLILLJJLI;
    public final NextLiveData LLILLL;
    public InviteFriendsSheetPackage LLILZ;
    public C1355130lMt LLILZIL;

    public ShareInviteContentVM() {
        NextLiveData<Unit> nextLiveData = new NextLiveData<>();
        this.LLILLJJLI = nextLiveData;
        this.LLILLL = nextLiveData;
    }
}
