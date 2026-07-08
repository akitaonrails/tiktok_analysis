package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC895380ZAq;
import X.C09CT;
import X.C0ZA7;
import X.C0ZB9;
import X.C0ZBF;
import X.C1600110rk1;
import X.C1600120rk2;
import X.C1902710zc5;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C890610Ywl;
import X.InterfaceC1891350zJl;
import X.InterfaceC1903450zdH;
import X.InterfaceC887660Ys0;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCellUIInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class InboxEntrancePod extends AbstractC895380ZAq implements InterfaceC887660Ys0<InboxEntrancePod>, InterfaceC1903450zdH {
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;
    public final long LLILZLL;

    @C09CT("entrance_cell")
    public final InboxEntranceCell entranceCell;

    @Override // X.InterfaceC887660Ys0
    public final boolean getEnableSelect() {
        return false;
    }

    @Override // X.InterfaceC887660Ys0
    public final Function1<InterfaceC887660Ys0<?>, Unit> getOnSelect() {
        return null;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSelected() {
        return false;
    }

    public final boolean LIZLLL() {
        return Intrinsics.LJFF(this.entranceCell.getArchiveStatus(), Boolean.TRUE);
    }

    @Override // X.AbstractC895380ZAq
    public final C890610Ywl convertToInboxEntranceWrapper$awemenotice_release() {
        int i = isMute() ? 0 : this.entranceCell.unreadCount;
        InboxEntranceCell inboxEntranceCell = this.entranceCell;
        InboxEntranceCellUIInfo inboxEntranceCellUIInfo = inboxEntranceCell.uiInfo;
        int i2 = inboxEntranceCellUIInfo != null ? inboxEntranceCellUIInfo.unreadType : 0;
        int i3 = inboxEntranceCell.filterType;
        Integer numValueOf = Integer.valueOf(inboxEntranceCell.cellId);
        InboxEntranceCell inboxEntranceCell2 = this.entranceCell;
        return new C890610Ywl(inboxEntranceCell2.priority, inboxEntranceCell2.lastNoticeCreateTime, this.type, inboxEntranceCell2.unreadCount > 0, this, new C0ZA7(i, i2, i3, numValueOf, inboxEntranceCell2.entranceKey), 64);
    }

    @Override // X.AbstractC895380ZAq
    public final long getLastNoticeTime$awemenotice_release() {
        return this.entranceCell.lastNoticeCreateTime;
    }

    @Override // X.AbstractC895380ZAq
    public final int getPriority$awemenotice_release() {
        return this.entranceCell.priority;
    }

    public final boolean isMute() {
        return this.entranceCell.getMuteStatus() == C0ZBF.MUTE;
    }

    @Override // X.AbstractC895380ZAq
    public final boolean isUnread() {
        return this.entranceCell.unreadCount > 0;
    }

    public final Pair<Integer, String> LIZIZ() {
        Integer numValueOf;
        int i = 0;
        int i2 = C1902710zc5.LIZJ() ? 0 : this.entranceCell.unreadCount;
        if (C1902710zc5.LIZJ()) {
            numValueOf = Integer.valueOf(i);
        } else {
            InboxEntranceCellUIInfo inboxEntranceCellUIInfo = this.entranceCell.uiInfo;
            if (inboxEntranceCellUIInfo != null) {
                i = inboxEntranceCellUIInfo.unreadType;
                numValueOf = Integer.valueOf(i);
            } else {
                numValueOf = null;
            }
        }
        String str = "report_null";
        if (i2 > 0 && numValueOf != null) {
            if (numValueOf.intValue() == 1) {
                str = "yellow_dot";
            } else if (numValueOf.intValue() == 2) {
                str = "number_dot";
            }
        }
        return new Pair<>(Integer.valueOf(i2), str);
    }

    @Override // X.AbstractC895380ZAq
    public final int hashCode() {
        int iHashCode = super.hashCode();
        InboxEntranceCell inboxEntranceCell = this.entranceCell;
        return iHashCode + inboxEntranceCell.cellId + inboxEntranceCell.priority + inboxEntranceCell.unreadCount + C786410Ut5.Y2(inboxEntranceCell.lastNoticeCreateTime) + this.entranceCell.beforeMarkUnreadCount;
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("entrance_");
        sbLIZ.append(this.entranceCell.cellId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1903450zdH
    public final String uniqueItemIdForFirstScreen() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("entrance_");
        sbLIZ.append(this.entranceCell.cellId);
        sbLIZ.append('_');
        String str = this.entranceCell.entranceKey;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return new C0ZB9() { // from class: X.0ZBA
        };
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean getDisplayInMultiSelectMode() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC887560Yrq
    public final int getPriorityInInbox() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC887560Yrq
    public final long getTimestampInInbox() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isInMultiSelectMode() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSwitchingMode() {
        return this.LLILZ;
    }

    @Override // X.AbstractC895380ZAq
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof InboxEntrancePod)) {
            InboxEntrancePod inboxEntrancePod = (InboxEntrancePod) obj;
            InboxEntranceCell inboxEntranceCell = inboxEntrancePod.entranceCell;
            int i = inboxEntranceCell.cellId;
            InboxEntranceCell inboxEntranceCell2 = this.entranceCell;
            if (i == inboxEntranceCell2.cellId && inboxEntranceCell.priority == inboxEntranceCell2.priority && inboxEntranceCell.unreadCount == inboxEntranceCell2.unreadCount && inboxEntranceCell.lastNoticeCreateTime == inboxEntranceCell2.lastNoticeCreateTime && inboxEntranceCell.beforeMarkUnreadCount == inboxEntranceCell2.beforeMarkUnreadCount && Intrinsics.LJFF(inboxEntranceCell.exposedInfo, inboxEntranceCell2.exposedInfo) && Intrinsics.LJFF(inboxEntrancePod.entranceCell.uiInfo, this.entranceCell.uiInfo) && Intrinsics.LJFF(inboxEntrancePod.entranceCell.entranceKey, this.entranceCell.entranceKey) && inboxEntrancePod.entranceCell.getMuteStatus() == this.entranceCell.getMuteStatus() && Intrinsics.LJFF(inboxEntrancePod.entranceCell.getPinStatus(), this.entranceCell.getPinStatus()) && Intrinsics.LJFF(inboxEntrancePod.entranceCell.getArchiveStatus(), this.entranceCell.getArchiveStatus()) && inboxEntrancePod.LLILLL == this.LLILLL) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer numValueOf;
        if (!(interfaceC1891350zJl instanceof InboxEntrancePod)) {
            return C1600110rk1.LIZ("unknown");
        }
        InboxEntranceCell inboxEntranceCell = this.entranceCell;
        int i = inboxEntranceCell.unreadCount;
        InboxEntrancePod inboxEntrancePod = (InboxEntrancePod) interfaceC1891350zJl;
        InboxEntranceCell inboxEntranceCell2 = inboxEntrancePod.entranceCell;
        if (i != inboxEntranceCell2.unreadCount) {
            return C1600110rk1.LIZ("unread_count");
        }
        InboxEntranceCellUIInfo inboxEntranceCellUIInfo = inboxEntranceCell.uiInfo;
        Integer numValueOf2 = null;
        if (inboxEntranceCellUIInfo != null) {
            str = inboxEntranceCellUIInfo.title;
        } else {
            str = null;
        }
        InboxEntranceCellUIInfo inboxEntranceCellUIInfo2 = inboxEntranceCell2.uiInfo;
        if (inboxEntranceCellUIInfo2 != null) {
            str2 = inboxEntranceCellUIInfo2.title;
        } else {
            str2 = null;
        }
        if (!TextUtils.equals(str, str2)) {
            return C1600110rk1.LIZ("title");
        }
        InboxEntranceCellUIInfo inboxEntranceCellUIInfo3 = this.entranceCell.uiInfo;
        if (inboxEntranceCellUIInfo3 != null) {
            str3 = inboxEntranceCellUIInfo3.content;
        } else {
            str3 = null;
        }
        InboxEntranceCellUIInfo inboxEntranceCellUIInfo4 = inboxEntrancePod.entranceCell.uiInfo;
        if (inboxEntranceCellUIInfo4 != null) {
            str4 = inboxEntranceCellUIInfo4.content;
        } else {
            str4 = null;
        }
        if (!TextUtils.equals(str3, str4)) {
            return C1600110rk1.LIZ("content");
        }
        InboxEntranceCellUIInfo inboxEntranceCellUIInfo5 = this.entranceCell.uiInfo;
        if (inboxEntranceCellUIInfo5 != null) {
            numValueOf = Integer.valueOf(inboxEntranceCellUIInfo5.unreadType);
        } else {
            numValueOf = null;
        }
        InboxEntranceCellUIInfo inboxEntranceCellUIInfo6 = inboxEntrancePod.entranceCell.uiInfo;
        if (inboxEntranceCellUIInfo6 != null) {
            numValueOf2 = Integer.valueOf(inboxEntranceCellUIInfo6.unreadType);
        }
        if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
            return C1600110rk1.LIZ("unread_type");
        }
        return C1600110rk1.LIZJ();
    }

    @Override // X.AbstractC895380ZAq
    public final boolean isSameItem(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InboxEntrancePod)) {
            return false;
        }
        InboxEntranceCell inboxEntranceCell = this.entranceCell;
        int i = inboxEntranceCell.cellId;
        InboxEntranceCell inboxEntranceCell2 = ((InboxEntrancePod) obj).entranceCell;
        if (i == inboxEntranceCell2.cellId && Intrinsics.LJFF(inboxEntranceCell.entranceKey, inboxEntranceCell2.entranceKey)) {
            return true;
        }
        return false;
    }

    public InboxEntrancePod(InboxEntranceCell inboxEntranceCell, boolean z, boolean z2, boolean z3, int i) {
        super(i);
        this.entranceCell = inboxEntranceCell;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = getPriority$awemenotice_release();
        this.LLILZLL = inboxEntranceCell.lastNoticeCreateTime;
    }

    @Override // X.InterfaceC887660Ys0
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public InboxEntrancePod copyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1<? super InterfaceC887660Ys0<?>, Unit> function1) {
        return new InboxEntrancePod(this.entranceCell, z5, z, z4, 102);
    }
}
