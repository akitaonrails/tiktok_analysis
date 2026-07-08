package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.InterfaceC2262101DgO;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public class UserHonor implements InterfaceC2262101DgO {

    @C09CT("deprecated23")
    public long currentDiamond;

    @C09CT("icon")
    public ImageModel currentHonorIcon;

    @C09CT("diamond_icon")
    public ImageModel diamondIcon;

    @C09CT("grade_icon_list")
    public List<GradeIcon> gradeIconList;

    @C09CT("im_icon")
    public ImageModel imIcon;

    @C09CT("im_icon_with_level")
    public ImageModel imIconWithLevel;

    @C09CT("level")
    public int level;

    @C09CT("live_icon")
    public ImageModel liveIcon;

    @C09CT("new_im_icon_with_level")
    public ImageModel newImIconWithLevel;

    @C09CT("new_live_icon")
    public ImageModel newLiveIcon;

    @C09CT("next_icon")
    public ImageModel nextHonorIcon;

    @C09CT("background_back")
    public ImageModel profileDialogBackBg;

    @C09CT("background")
    public ImageModel profileDialogBg;

    @C09CT("score")
    public long score;

    @C09CT("screen_chat_type")
    public long screenChatType;

    @C09CT("deprecated25")
    public long thisGradeMaxDiamond;

    @C09CT("deprecated24")
    public long thisGradeMinDiamond;

    @C09CT("deprecated20")
    public long totalDiamond;

    @C09CT("upgrade_need_consume")
    public long upgradeNeedConsume;

    @C09CT("next_name")
    public String nextHonorName = "";

    @C09CT("name")
    public String currentHonorName = "";

    @C09CT("grade_describe")
    public String gradeDescribe = "";

    @C09CT("grade_banner")
    public String gradeBanner = "";

    @C09CT("next_privileges")
    public String nextPrivileges = "";

    @Override // X.InterfaceC2262101DgO
    public final ImageModel LJIIL() {
        ImageModel imageModel = this.newImIconWithLevel;
        return imageModel != null ? imageModel : this.imIconWithLevel;
    }

    @Override // X.InterfaceC2262101DgO
    public final ImageModel LJIILL() {
        ImageModel imageModel = this.newLiveIcon;
        return imageModel != null ? imageModel : this.liveIcon;
    }

    public final int hashCode() {
        ImageModel imageModel = this.diamondIcon;
        int iHashCode = (imageModel != null ? imageModel.hashCode() : 0) * 31;
        ImageModel imageModel2 = this.currentHonorIcon;
        int iHashCode2 = (iHashCode + (imageModel2 != null ? imageModel2.hashCode() : 0)) * 31;
        ImageModel imageModel3 = this.nextHonorIcon;
        int iHashCode3 = (iHashCode2 + (imageModel3 != null ? imageModel3.hashCode() : 0)) * 31;
        String str = this.nextHonorName;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.currentHonorName;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        long j = this.totalDiamond;
        int i = (((iHashCode4 + iHashCode5) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.currentDiamond;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        ImageModel imageModel4 = this.imIcon;
        int iHashCode6 = (i2 + (imageModel4 != null ? imageModel4.hashCode() : 0)) * 31;
        ImageModel imageModel5 = this.imIconWithLevel;
        int iHashCode7 = (iHashCode6 + (imageModel5 != null ? imageModel5.hashCode() : 0)) * 31;
        ImageModel imageModel6 = this.newImIconWithLevel;
        int iHashCode8 = (iHashCode7 + (imageModel6 != null ? imageModel6.hashCode() : 0)) * 31;
        ImageModel imageModel7 = this.liveIcon;
        int iHashCode9 = (iHashCode8 + (imageModel7 != null ? imageModel7.hashCode() : 0)) * 31;
        ImageModel imageModel8 = this.newLiveIcon;
        int iHashCode10 = (((iHashCode9 + (imageModel8 != null ? imageModel8.hashCode() : 0)) * 31) + this.level) * 31;
        List<GradeIcon> list = this.gradeIconList;
        int iHashCode11 = (iHashCode10 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.gradeDescribe;
        int iHashCode12 = str3 != null ? str3.hashCode() : 0;
        long j3 = this.thisGradeMaxDiamond;
        int i3 = (((iHashCode11 + iHashCode12) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.thisGradeMinDiamond;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        ImageModel imageModel9 = this.profileDialogBg;
        int iHashCode13 = (i4 + (imageModel9 != null ? imageModel9.hashCode() : 0)) * 31;
        ImageModel imageModel10 = this.profileDialogBackBg;
        return iHashCode13 + (imageModel10 != null ? imageModel10.hashCode() : 0);
    }

    @Override // X.InterfaceC2262101DgO
    public final ImageModel LIZ() {
        return this.profileDialogBg;
    }

    @Override // X.InterfaceC2262101DgO
    public final ImageModel LIZIZ() {
        return this.profileDialogBackBg;
    }

    @Override // X.InterfaceC2262101DgO
    public final ImageModel LIZJ() {
        return this.liveIcon;
    }

    @Override // X.InterfaceC2262101DgO
    public final long LIZLLL() {
        return this.thisGradeMinDiamond;
    }

    @Override // X.InterfaceC2262101DgO
    public final ImageModel LJ() {
        return this.nextHonorIcon;
    }

    @Override // X.InterfaceC2262101DgO
    public final ImageModel LJFF() {
        return this.imIconWithLevel;
    }

    @Override // X.InterfaceC2262101DgO
    public final long LJI() {
        return this.thisGradeMaxDiamond;
    }

    @Override // X.InterfaceC2262101DgO
    public final String LJII() {
        return this.gradeDescribe;
    }

    @Override // X.InterfaceC2262101DgO
    public final long LJIIIIZZ() {
        return this.totalDiamond;
    }

    @Override // X.InterfaceC2262101DgO
    public final List<GradeIcon> LJIIIZ() {
        return this.gradeIconList;
    }

    @Override // X.InterfaceC2262101DgO
    public final long LJIIJ() {
        return this.currentDiamond;
    }

    @Override // X.InterfaceC2262101DgO
    public final String LJIIJJI() {
        return this.currentHonorName;
    }

    @Override // X.InterfaceC2262101DgO
    public final ImageModel LJIILIIL() {
        return this.imIcon;
    }

    @Override // X.InterfaceC2262101DgO
    public final String LJIILJJIL() {
        return this.nextHonorName;
    }

    @Override // X.InterfaceC2262101DgO
    public final ImageModel LJIILLIIL() {
        return this.diamondIcon;
    }

    @Override // X.InterfaceC2262101DgO
    public final ImageModel LJIIZILJ() {
        return this.currentHonorIcon;
    }

    @Override // X.InterfaceC2262101DgO
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
        UserHonor userHonor = (UserHonor) obj;
        if (this.totalDiamond != userHonor.totalDiamond || this.currentDiamond != userHonor.currentDiamond || this.level != userHonor.level) {
            return false;
        }
        ImageModel imageModel = this.diamondIcon;
        if (imageModel != null) {
            if (!imageModel.equals(userHonor.diamondIcon)) {
                return false;
            }
        } else if (userHonor.diamondIcon != null) {
            return false;
        }
        ImageModel imageModel2 = this.currentHonorIcon;
        if (imageModel2 != null) {
            if (!imageModel2.equals(userHonor.currentHonorIcon)) {
                return false;
            }
        } else if (userHonor.currentHonorIcon != null) {
            return false;
        }
        ImageModel imageModel3 = this.nextHonorIcon;
        if (imageModel3 != null) {
            if (!imageModel3.equals(userHonor.nextHonorIcon)) {
                return false;
            }
        } else if (userHonor.nextHonorIcon != null) {
            return false;
        }
        String str = this.nextHonorName;
        if (str != null) {
            if (!str.equals(userHonor.nextHonorName)) {
                return false;
            }
        } else if (userHonor.nextHonorName != null) {
            return false;
        }
        String str2 = this.currentHonorName;
        if (str2 != null) {
            if (!str2.equals(userHonor.currentHonorName)) {
                return false;
            }
        } else if (userHonor.currentHonorName != null) {
            return false;
        }
        ImageModel imageModel4 = this.imIcon;
        if (imageModel4 != null) {
            if (!imageModel4.equals(userHonor.imIcon)) {
                return false;
            }
        } else if (userHonor.imIcon != null) {
            return false;
        }
        ImageModel imageModel5 = this.imIconWithLevel;
        if (imageModel5 != null) {
            if (!imageModel5.equals(userHonor.imIconWithLevel)) {
                return false;
            }
        } else if (userHonor.imIconWithLevel != null) {
            return false;
        }
        ImageModel imageModel6 = this.newImIconWithLevel;
        if (imageModel6 != null) {
            if (!imageModel6.equals(userHonor.newImIconWithLevel)) {
                return false;
            }
        } else if (userHonor.newImIconWithLevel != null) {
            return false;
        }
        ImageModel imageModel7 = this.liveIcon;
        if (imageModel7 != null) {
            if (!imageModel7.equals(userHonor.liveIcon)) {
                return false;
            }
        } else if (userHonor.liveIcon != null) {
            return false;
        }
        ImageModel imageModel8 = this.newLiveIcon;
        if (imageModel8 != null) {
            if (!imageModel8.equals(userHonor.newLiveIcon)) {
                return false;
            }
        } else if (userHonor.newLiveIcon != null) {
            return false;
        }
        List<GradeIcon> list = this.gradeIconList;
        if (list != null) {
            if (!list.equals(userHonor.gradeIconList)) {
                return false;
            }
        } else if (userHonor.gradeIconList != null) {
            return false;
        }
        if (this.thisGradeMinDiamond != userHonor.thisGradeMinDiamond || this.thisGradeMaxDiamond != userHonor.thisGradeMaxDiamond) {
            return false;
        }
        ImageModel imageModel9 = this.profileDialogBg;
        if (imageModel9 != null) {
            if (!imageModel9.equals(userHonor.profileDialogBg)) {
                return false;
            }
        } else if (userHonor.profileDialogBg != null) {
            return false;
        }
        ImageModel imageModel10 = this.profileDialogBackBg;
        if (imageModel10 != null) {
            if (!imageModel10.equals(userHonor.profileDialogBackBg)) {
                return false;
            }
        } else if (userHonor.profileDialogBackBg != null) {
            return false;
        }
        String str3 = this.gradeDescribe;
        String str4 = userHonor.gradeDescribe;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }
}
