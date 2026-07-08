package com.ss.android.ugc.aweme.notification.vm;

import X.C00XD;
import X.C0207004v;
import X.C0ORP;
import X.C11JF;
import X.C1697810uHb;
import X.C635290Ovv;
import X.C635360Ow2;
import X.EnumC635330Ovz;
import X.InterfaceC1891350zJl;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.EntranceSettings;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class UnsubscribeSettingViewModel extends ViewModel {
    public static final /* synthetic */ int LLILZLL = 0;
    public List<GroupUnsubscribeSetting> LL;
    public EntranceSettings LLILLJJLI;
    public C11JF LLILLL;
    public C11JF LLILZ;
    public final MutableLiveData<List<InterfaceC1891350zJl>> LLILZIL = new MutableLiveData<>(new ArrayList());

    public final void vQ2() {
        List<InboxEntranceFunction> list;
        ArrayList arrayList = new ArrayList();
        EntranceSettings entranceSettings = this.LLILLJJLI;
        if (entranceSettings != null && (list = entranceSettings.functionSettings) != null) {
            arrayList.add(new C0207004v(Unit.LIZ));
            int size = list.size();
            if (size > 0) {
                int i = 0;
                for (InboxEntranceFunction inboxEntranceFunction : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    InboxEntranceFunction inboxEntranceFunction2 = inboxEntranceFunction;
                    EnumC635330Ovz enumC635330Ovz = i == 0 ? size == 1 ? EnumC635330Ovz.ONLY : EnumC635330Ovz.FIRST : i == size + (-1) ? EnumC635330Ovz.LAST : EnumC635330Ovz.MIDDLE;
                    int i3 = inboxEntranceFunction2.functionType;
                    int i4 = i3 == C0ORP.PIN.getType() ? R.raw.icon_update_to_top_fill : i3 == C0ORP.MUTE.getType() ? R.raw.icon_bell_fill : 0;
                    EntranceSettings entranceSettings2 = this.LLILLJJLI;
                    arrayList.add(new C635290Ovv(enumC635330Ovz, i4, inboxEntranceFunction2, entranceSettings2 != null ? entranceSettings2.entranceId : -1));
                    i = i2;
                }
            }
        }
        List<GroupUnsubscribeSetting> list2 = this.LL;
        if (list2 != null) {
            arrayList.add(new C0207004v(Unit.LIZ));
            arrayList.add(new C00XD());
            int size2 = list2.size();
            if (size2 > 0) {
                int i5 = 0;
                for (GroupUnsubscribeSetting groupUnsubscribeSetting : list2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    arrayList.add(new C635360Ow2(groupUnsubscribeSetting, i5 == 0, i5 == size2 + (-1)));
                    i5 = i6;
                }
            }
            arrayList.add(new C0207004v(Unit.LIZ));
        }
        this.LLILZIL.setValue(arrayList);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL = null;
        this.LLILLJJLI = null;
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LLILZ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
    }
}
