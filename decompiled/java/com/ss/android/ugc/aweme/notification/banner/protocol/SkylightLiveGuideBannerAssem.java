package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C0DMM;
import X.C0S4U;
import X.C13IQ;
import X.C13LE;
import X.C1903680zde;
import X.C19EG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.homepage.api.data.InboxFollowGuideViewModel;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.ss.android.ugc.aweme.notification.banner.vh.SkylightLiveGuideBannerItem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes29.dex */
public final class SkylightLiveGuideBannerAssem extends InboxBannerCustomAssem {
    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final void lo(RecyclerView.ViewHolder viewHolder) {
        C1903680zde c1903680zde;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        MutableLiveData<Boolean> mutableLiveData;
        if ((viewHolder instanceof C1903680zde) && (c1903680zde = (C1903680zde) viewHolder) != null) {
            InboxFollowGuideViewModel inboxFollowGuideViewModel = c1903680zde.LLJILJIL;
            if (inboxFollowGuideViewModel != null && (mutableLiveData = inboxFollowGuideViewModel.LL) != null) {
                mutableLiveData.setValue(Boolean.TRUE);
            }
            C19EG activity = c1903680zde.LLILLJJLI.getActivity();
            if (activity != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(activity)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                homeTabAbilityLIZ.UC1(c1903680zde.LLJJ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final void mo(RecyclerView.ViewHolder viewHolder) {
        C1903680zde c1903680zde;
        C19EG activity;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        if ((viewHolder instanceof C1903680zde) && (c1903680zde = (C1903680zde) viewHolder) != null && (activity = c1903680zde.LLILLJJLI.getActivity()) != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(activity)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
            homeTabAbilityLIZ.Ik0(c1903680zde.LLJJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLiveNoticeReceive(X.C1599120riQ r13) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.banner.protocol.SkylightLiveGuideBannerAssem.onLiveNoticeReceive(X.0riQ):void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final RecyclerView.ViewHolder ko(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        Fragment fragmentLJI;
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(SkylightLiveGuideBannerItem.class)) && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
            return new C1903680zde(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ab1, viewGroup, false), fragmentLJI);
        }
        return null;
    }
}
