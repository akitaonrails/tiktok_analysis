package webcast.data.multi_guest_play;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Playbook {

    @C09CT("author_info")
    public SimpleUser authorInfo;

    @C09CT("automation_user_setting")
    public int automationUserSetting;

    @C09CT("content")
    public PlaybookContent content;

    @C09CT("create_time")
    public long createTime;

    @C09CT("is_modified")
    public boolean isModified;

    @C09CT("is_my_creation")
    public boolean isMyCreation;

    @C09CT("is_my_favorite")
    public boolean isMyFavorite;

    @C09CT("is_updated_version")
    public boolean isUpdatedVersion;

    @C09CT("playbook_id")
    public long playbookId;

    @C09CT("playbook_type")
    public int playbookType;

    @C09CT("playbook_visibility")
    public int playbookVisibility;

    @C09CT("total_favorites")
    public long totalFavorites;

    @C09CT("total_usage")
    public long totalUsage;

    @C09CT("update_time")
    public long updateTime;

    public final boolean LIZ() {
        return this.playbookType == 4;
    }

    public final int hashCode() {
        int iY2 = ((((((((((((((((((((((C786410Ut5.Y2(this.playbookId) * 31) + C786410Ut5.Y2(this.totalFavorites)) * 31) + C786410Ut5.Y2(this.totalUsage)) * 31) + C786410Ut5.Y2(this.createTime)) * 31) + C786410Ut5.Y2(this.updateTime)) * 31) + C786410Ut5.Z2(this.isUpdatedVersion)) * 31) + C786410Ut5.Z2(this.isMyFavorite)) * 31) + C786410Ut5.Z2(this.isMyCreation)) * 31) + this.playbookVisibility) * 31) + C786410Ut5.Z2(this.isModified)) * 31) + this.playbookType) * 31) + this.automationUserSetting) * 31;
        SimpleUser simpleUser = this.authorInfo;
        int iHashCode = (iY2 + (simpleUser != null ? simpleUser.hashCode() : 0)) * 31;
        PlaybookContent playbookContent = this.content;
        return iHashCode + (playbookContent != null ? playbookContent.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(Playbook.class, cls)) {
            return false;
        }
        Playbook playbook = (Playbook) obj;
        if (this.playbookId == playbook.playbookId && this.totalFavorites == playbook.totalFavorites && this.totalUsage == playbook.totalUsage && this.createTime == playbook.createTime && this.updateTime == playbook.updateTime && this.isUpdatedVersion == playbook.isUpdatedVersion && this.isMyFavorite == playbook.isMyFavorite && this.isMyCreation == playbook.isMyCreation && this.playbookVisibility == playbook.playbookVisibility && this.isModified == playbook.isModified && this.playbookType == playbook.playbookType && this.automationUserSetting == playbook.automationUserSetting && Intrinsics.LJFF(this.authorInfo, playbook.authorInfo) && Intrinsics.LJFF(this.content, playbook.content)) {
            return true;
        }
        return false;
    }
}
