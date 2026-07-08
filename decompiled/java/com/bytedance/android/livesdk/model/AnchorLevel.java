package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.InterfaceC2262111DgP;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes36.dex */
public class AnchorLevel implements InterfaceC2262111DgP {

    @C09CT("experience")
    public long experience;

    @C09CT("highest_experience_this_level")
    public long highestExperienceThisLevel;

    @C09CT("level")
    public int level;

    @C09CT("small_icon")
    public ImageModel levelIcon;

    @C09CT("lowest_experience_this_level")
    public long lowestExperienceThisLevel;

    @C09CT("profile_dialog_bg_back")
    public ImageModel profileDialogBackBg;

    @C09CT("profile_dialog_bg")
    public ImageModel profileDialogBg;

    @C09CT("stage_level")
    public ImageModel stageLevelIcon;

    @C09CT("task_decrease_experience")
    public long taskDecreaseExperience;

    @C09CT("task_end_time")
    public long taskEndTime;

    @C09CT("task_start_experience")
    public long taskStartExperience;

    @C09CT("task_start_time")
    public long taskStartTime;

    @C09CT("task_target_experience")
    public long taskTargetExperience;

    public final int hashCode() {
        ImageModel imageModel = this.levelIcon;
        int iHashCode = (((imageModel != null ? imageModel.hashCode() : 0) * 31) + this.level) * 31;
        long j = this.experience;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.lowestExperienceThisLevel;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.highestExperienceThisLevel;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.taskStartExperience;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.taskStartTime;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.taskDecreaseExperience;
        int i6 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.taskTargetExperience;
        int i7 = (i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.taskEndTime;
        int i8 = (i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        ImageModel imageModel2 = this.profileDialogBg;
        int iHashCode2 = (i8 + (imageModel2 != null ? imageModel2.hashCode() : 0)) * 31;
        ImageModel imageModel3 = this.profileDialogBackBg;
        int iHashCode3 = (iHashCode2 + (imageModel3 != null ? imageModel3.hashCode() : 0)) * 31;
        ImageModel imageModel4 = this.stageLevelIcon;
        int iHashCode4 = (iHashCode3 + (imageModel4 != null ? imageModel4.hashCode() : 0)) * 31;
        ImageModel imageModel5 = this.levelIcon;
        return iHashCode4 + (imageModel5 != null ? imageModel5.hashCode() : 0);
    }

    @Override // X.InterfaceC2262111DgP
    public final ImageModel LIZ() {
        return this.profileDialogBg;
    }

    @Override // X.InterfaceC2262111DgP
    public final ImageModel LIZIZ() {
        return this.profileDialogBackBg;
    }

    @Override // X.InterfaceC2262111DgP
    public final long LIZJ() {
        return this.lowestExperienceThisLevel;
    }

    @Override // X.InterfaceC2262111DgP
    public final long LIZLLL() {
        return this.taskEndTime;
    }

    @Override // X.InterfaceC2262111DgP
    public final ImageModel LJ() {
        return this.levelIcon;
    }

    @Override // X.InterfaceC2262111DgP
    public final long LJFF() {
        return this.highestExperienceThisLevel;
    }

    @Override // X.InterfaceC2262111DgP
    public final ImageModel LJI() {
        return this.stageLevelIcon;
    }

    @Override // X.InterfaceC2262111DgP
    public final long LJII() {
        return this.experience;
    }

    @Override // X.InterfaceC2262111DgP
    public final long LJIIIIZZ() {
        return this.taskStartExperience;
    }

    @Override // X.InterfaceC2262111DgP
    public final long LJIIIZ() {
        return this.taskTargetExperience;
    }

    @Override // X.InterfaceC2262111DgP
    public final long LJIIJ() {
        return this.taskDecreaseExperience;
    }

    @Override // X.InterfaceC2262111DgP
    public final long LJIIJJI() {
        return this.taskStartTime;
    }

    @Override // X.InterfaceC2262111DgP
    public final int getLevel() {
        return this.level;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnchorLevel anchorLevel = (AnchorLevel) obj;
        if (this.level != anchorLevel.level || this.experience != anchorLevel.experience || this.lowestExperienceThisLevel != anchorLevel.lowestExperienceThisLevel || this.highestExperienceThisLevel != anchorLevel.highestExperienceThisLevel || this.taskStartExperience != anchorLevel.taskStartExperience || this.taskStartTime != anchorLevel.taskStartTime || this.taskDecreaseExperience != anchorLevel.taskDecreaseExperience || this.taskTargetExperience != anchorLevel.taskTargetExperience || this.taskEndTime != anchorLevel.taskEndTime) {
            return false;
        }
        ImageModel imageModel = this.profileDialogBg;
        if (imageModel != null) {
            if (!imageModel.equals(anchorLevel.profileDialogBg)) {
                return false;
            }
        } else if (anchorLevel.profileDialogBg != null) {
            return false;
        }
        ImageModel imageModel2 = this.profileDialogBackBg;
        if (imageModel2 != null) {
            if (!imageModel2.equals(anchorLevel.profileDialogBackBg)) {
                return false;
            }
        } else if (anchorLevel.profileDialogBackBg != null) {
            return false;
        }
        ImageModel imageModel3 = this.stageLevelIcon;
        if (imageModel3 != null) {
            if (!imageModel3.equals(anchorLevel.stageLevelIcon)) {
                return false;
            }
        } else if (anchorLevel.stageLevelIcon != null) {
            return false;
        }
        ImageModel imageModel4 = this.levelIcon;
        ImageModel imageModel5 = anchorLevel.levelIcon;
        if (imageModel4 != null) {
            return imageModel4.equals(imageModel5);
        }
        if (imageModel5 == null) {
            return true;
        }
        return false;
    }
}
