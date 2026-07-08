package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC895380ZAq;
import X.C09CT;
import X.C0ZA7;
import X.C0ZB9;
import X.C13BV;
import X.C13LP;
import X.C1600110rk1;
import X.C1600120rk2;
import X.C1954807lC;
import X.C2188811AlT;
import X.C889930Yvf;
import X.C890610Ywl;
import X.C895350ZAn;
import X.EnumC895310ZAj;
import X.EnumC895370ZAp;
import X.InterfaceC1891350zJl;
import X.InterfaceC1903450zdH;
import X.InterfaceC887660Ys0;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ActivityPod extends AbstractC895380ZAq implements InterfaceC887660Ys0<ActivityPod>, InterfaceC1903450zdH {
    public final transient Drawable LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final long LLILZLL;
    public final int LLIZ;

    @C09CT("cache_time")
    public final long cacheTime;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("data_type")
    public final EnumC895370ZAp dataType;

    @C09CT("extra")
    public final String extra;

    @C09CT("new_notice_content")
    public final String newNoticeContent;

    @C09CT("new_notice_time")
    public final String newNoticeTime;

    @C09CT("read_point")
    public final RedPoint readPoint;

    @C09CT("show_arrow")
    public boolean showArrow;

    @C09CT("small_avatar_url")
    public final ActivityIcon smallAvatarUrl;

    @C09CT("title")
    public final List<String> title;

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

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        return "shop";
    }

    public final String toString() {
        return "ActivityPod(dataType=" + this.dataType + ", title=" + this.title + ", smallAvatarUrl=" + this.smallAvatarUrl + ", newNoticeContent=" + this.newNoticeContent + ", readPoint=" + this.readPoint + ", newNoticeTime=" + this.newNoticeTime + ", showArrow=" + this.showArrow + ", cacheTime=" + this.cacheTime + ", extra=" + this.extra + ", iconDrawable=" + this.LLILLJJLI + ", createTime=" + this.createTime + ", displayInMultiSelectMode=" + this.LLILLL + ", isInMultiSelectMode=" + this.LLILZ + ", isSwitchingMode=" + this.LLILZIL + ')';
    }

    @Override // X.AbstractC895380ZAq
    public final C890610Ywl convertToInboxEntranceWrapper$awemenotice_release() {
        int i;
        RedPoint redPoint = this.readPoint;
        int i2 = redPoint.unreadCount;
        int i3 = C895350ZAn.LIZIZ[redPoint.type.ordinal()];
        int i4 = i3 != 1 ? i3 != 2 ? 0 : 2 : 1;
        int i5 = C895350ZAn.LIZ[this.dataType.ordinal()];
        if (i5 == 1) {
            i = 9;
        } else if (i5 == 2) {
            i = 13;
        } else {
            if (i5 != 3) {
                throw new C1954807lC();
            }
            i = -1;
        }
        return new C890610Ywl(getPriority$awemenotice_release(), this.createTime, this.type, isUnread(), this, new C0ZA7(i2, i4, i), 64);
    }

    @Override // X.AbstractC895380ZAq
    public final int getPriority$awemenotice_release() {
        int i = C895350ZAn.LIZ[this.dataType.ordinal()];
        if (i != 1) {
            return i != 2 ? 0 : 100;
        }
        return 200;
    }

    @Override // X.AbstractC895380ZAq
    public final boolean isUnread() {
        return this.readPoint.unreadCount > 0;
    }

    @Override // X.AbstractC895380ZAq
    public final int hashCode() {
        int iHashCode = super.hashCode() + this.dataType.hashCode() + this.newNoticeContent.hashCode();
        ActivityIcon activityIcon = this.smallAvatarUrl;
        return iHashCode + (activityIcon != null ? activityIcon.hashCode() : 0) + this.readPoint.hashCode();
    }

    @Override // X.InterfaceC1903450zdH
    public final String uniqueItemIdForFirstScreen() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("activity_");
        sbLIZ.append(this.dataType.name());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return new C0ZB9() { // from class: X.0ZAr
        };
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean getDisplayInMultiSelectMode() {
        return this.LLILLL;
    }

    @Override // X.AbstractC895380ZAq
    public final long getLastNoticeTime$awemenotice_release() {
        return this.createTime;
    }

    @Override // X.InterfaceC887560Yrq
    public final int getPriorityInInbox() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC887560Yrq
    public final long getTimestampInInbox() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isInMultiSelectMode() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSwitchingMode() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC895380ZAq
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof ActivityPod)) {
            ActivityPod activityPod = (ActivityPod) obj;
            if (this.dataType == activityPod.dataType && Intrinsics.LJFF(this.newNoticeContent, activityPod.newNoticeContent) && Intrinsics.LJFF(this.smallAvatarUrl, activityPod.smallAvatarUrl) && Intrinsics.LJFF(this.readPoint, activityPod.readPoint) && Intrinsics.LJFF(this.newNoticeTime, activityPod.newNoticeTime) && this.LLILZ == activityPod.LLILZ) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof ActivityPod)) {
            return C1600110rk1.LIZ("unknown");
        }
        ActivityPod activityPod = (ActivityPod) interfaceC1891350zJl;
        if (!TextUtils.equals((CharSequence) C13LP.LJJJLL(activityPod.title), (CharSequence) C13LP.LJJJLL(this.title))) {
            return C1600110rk1.LIZ("title");
        }
        if (!TextUtils.equals(activityPod.newNoticeContent, this.newNoticeContent)) {
            return C1600110rk1.LIZ("content");
        }
        if (activityPod.createTime != this.createTime) {
            return C1600110rk1.LIZ("last_notice_time");
        }
        RedPoint redPoint = activityPod.readPoint;
        int i = redPoint.unreadCount;
        RedPoint redPoint2 = this.readPoint;
        if (i != redPoint2.unreadCount) {
            return C1600110rk1.LIZ("unread_count");
        }
        if (redPoint.type != redPoint2.type) {
            return C1600110rk1.LIZ("unread_count_type");
        }
        return C1600110rk1.LIZJ();
    }

    @Override // X.AbstractC895380ZAq
    public final boolean isSameItem(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ActivityPod) && this.dataType == ((ActivityPod) obj).dataType) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC887660Ys0
    public final ActivityPod copyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1 function1) {
        return new ActivityPod(this.dataType, this.title, this.smallAvatarUrl, this.newNoticeContent, this.readPoint, this.newNoticeTime, this.showArrow, this.cacheTime, this.extra, this.LLILLJJLI, this.createTime, z5, z, z4);
    }

    public ActivityPod(EnumC895370ZAp enumC895370ZAp, List<String> list, ActivityIcon activityIcon, String str, RedPoint redPoint, String str2, boolean z, long j, String str3, Drawable drawable, long j2, boolean z2, boolean z3, boolean z4) {
        super(0);
        this.dataType = enumC895370ZAp;
        this.title = list;
        this.smallAvatarUrl = activityIcon;
        this.newNoticeContent = str;
        this.readPoint = redPoint;
        this.newNoticeTime = str2;
        this.showArrow = z;
        this.cacheTime = j;
        this.extra = str3;
        this.LLILLJJLI = drawable;
        this.createTime = j2;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
        this.LLILZLL = j2;
        this.LLIZ = getPriority$awemenotice_release();
    }

    public ActivityPod(EnumC895370ZAp enumC895370ZAp, List list, ActivityIcon activityIcon, String str, RedPoint redPoint, String str2, boolean z, long j, String str3, Drawable drawable, long j2, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC895370ZAp, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : activityIcon, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? new RedPoint(EnumC895310ZAj.NONE, 0) : redPoint, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? System.currentTimeMillis() : j, (i & 256) == 0 ? str3 : "", (i & 512) == 0 ? drawable : null, (i & 1024) != 0 ? 0L : j2, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? !C889930Yvf.LIZ.LJIIL() : z2, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z3, (i & 8192) == 0 ? z4 : false);
    }
}
