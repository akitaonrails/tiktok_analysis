package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC895380ZAq;
import X.C09CT;
import X.C0ZB9;
import X.C13BV;
import X.C1600110rk1;
import X.C1600120rk2;
import X.C786410Ut5;
import X.C890610Ywl;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SkylightLiveGuidePod extends AbstractC895380ZAq {
    public final int LLILLJJLI;

    @C09CT("live_notices")
    public List<InboxLiveNotice> liveNotices;

    public SkylightLiveGuidePod() {
        this(null, 1, null);
    }

    @Override // X.InterfaceC887560Yrq
    public final long getTimestampInInbox() {
        return 0L;
    }

    @Override // X.AbstractC895380ZAq
    public final boolean isUnread() {
        return false;
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        return "skylight_live_guide";
    }

    @Override // X.AbstractC895380ZAq
    public final C890610Ywl convertToInboxEntranceWrapper$awemenotice_release() {
        return new C890610Ywl(550, 0L, this.type, false, this, null, 96);
    }

    @Override // X.AbstractC895380ZAq
    public final int hashCode() {
        return (((super.hashCode() * 31) + this.liveNotices.hashCode()) * 31) + C786410Ut5.Z2(false);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return new C0ZB9() { // from class: X.0ZB8
        };
    }

    @Override // X.InterfaceC887560Yrq
    public final int getPriorityInInbox() {
        return this.LLILLJJLI;
    }

    public SkylightLiveGuidePod(List<InboxLiveNotice> list) {
        super(200);
        this.liveNotices = list;
        this.LLILLJJLI = 550;
    }

    @Override // X.AbstractC895380ZAq
    public final boolean equals(Object obj) {
        SkylightLiveGuidePod skylightLiveGuidePod;
        if (super.equals(obj)) {
            List<InboxLiveNotice> list = this.liveNotices;
            List<InboxLiveNotice> list2 = null;
            if ((obj instanceof SkylightLiveGuidePod) && (skylightLiveGuidePod = (SkylightLiveGuidePod) obj) != null) {
                list2 = skylightLiveGuidePod.liveNotices;
            }
            if (Intrinsics.LJFF(list, list2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof SkylightLiveGuidePod)) {
            return C1600110rk1.LIZ("unknown");
        }
        return C1600110rk1.LIZJ();
    }

    public SkylightLiveGuidePod(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
