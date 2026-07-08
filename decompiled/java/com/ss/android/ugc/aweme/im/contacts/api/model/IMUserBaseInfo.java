package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C051M;
import X.C09CT;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;

/* JADX INFO: loaded from: classes35.dex */
public final class IMUserBaseInfo extends IMContact {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;

    @C09CT("avatars")
    public Avatars avatars;

    @C09CT("block_info")
    public BlockInfo blockInfo;

    @C09CT("nick_name")
    public String contactNickName;

    @C09CT("deleted")
    public int deleted;

    @C09CT("enterprise_verify_reason")
    public String enterpriseVerifyReason;

    @C09CT("extra")
    public String extra;

    @C09CT("follower_status")
    public int followerStatus;

    @C09CT("mutual_struct")
    public MutualStruct mutual;

    @C09CT("rec_type")
    public String recType;

    @C09CT("recommend_reason")
    public String recommendReason;

    @C09CT("signature")
    public String signature;

    @C09CT("unique_id")
    public String uniqueId;

    @C09CT("update_time")
    public long updateTime;

    @C09CT("user_id")
    public long userId;

    @C09CT("user_type")
    public int userType;

    @C09CT("user_verify_reason")
    public String userVerifyReason;

    @C09CT("user_verify_type")
    public int userVerifyType;

    @C09CT("follow_status")
    public Integer followStatus = 0;

    @C09CT("follower_count")
    public Integer followerCount = 0;

    @C09CT("following_count")
    public Integer followingCount = 0;

    @C09CT("maf_status")
    public Integer mafStatus = 0;

    public static /* synthetic */ void getDeleted$annotations() {
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public void setNickName(String str) {
    }

    public final Avatars getAvatars() {
        Object objLIZ;
        if (this.avatars == null) {
            Object objLIZ2 = null;
            try {
                String str = this.LL;
                objLIZ = (str == null || str.length() <= 0) ? null : C051M.LIZ(UrlModel.class, str);
                try {
                    String str2 = this.LLILLJJLI;
                    if (str2 != null && str2.length() > 0) {
                        objLIZ2 = C051M.LIZ(UrlModel.class, str2);
                    }
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Exception e2) {
                e = e2;
                objLIZ = null;
            }
            this.avatars = new Avatars((UrlModel) objLIZ, (UrlModel) objLIZ2);
        }
        return this.avatars;
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public UrlModel getDisplayAvatar() {
        Avatars avatars = getAvatars();
        if (avatars != null) {
            return avatars.avatarThumb;
        }
        return null;
    }

    public final Integer getFollowStatus() {
        boolean zLJI = MethodIDManager.LJI(202371);
        Integer num = this.followStatus;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return num;
    }

    public final String getAvatarMediumStr() {
        return this.LLILLJJLI;
    }

    public final String getAvatarThumbStr() {
        return this.LL;
    }

    public final BlockInfo getBlockInfo() {
        return this.blockInfo;
    }

    public final String getContactNickName() {
        return this.contactNickName;
    }

    public final int getDeleted() {
        return this.deleted;
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public String getDisplayName() {
        return this.contactNickName;
    }

    public final String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Integer getFollowerCount() {
        return this.followerCount;
    }

    public final int getFollowerStatus() {
        return this.followerStatus;
    }

    public final Integer getFollowingCount() {
        return this.followingCount;
    }

    public final String getInitialLetter() {
        return this.LLILZ;
    }

    public final Integer getMafStatus() {
        return this.mafStatus;
    }

    public final MutualStruct getMutual() {
        return this.mutual;
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public String getNickName() {
        return this.contactNickName;
    }

    public final String getRecType() {
        return this.recType;
    }

    public final String getRecommendReason() {
        return this.recommendReason;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getSortWeight() {
        return this.LLILLL;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final int getUserType() {
        return this.userType;
    }

    public final String getUserVerifyReason() {
        return this.userVerifyReason;
    }

    public final int getUserVerifyType() {
        return this.userVerifyType;
    }

    public final void setAvatarMediumStr(String str) {
        this.LLILLJJLI = str;
    }

    public final void setAvatarThumbStr(String str) {
        this.LL = str;
    }

    public final void setAvatars(Avatars avatars) {
        this.avatars = avatars;
    }

    public final void setBlockInfo(BlockInfo blockInfo) {
        this.blockInfo = blockInfo;
    }

    public final void setContactNickName(String str) {
        this.contactNickName = str;
    }

    public final void setDeleted(int i) {
        this.deleted = i;
    }

    public final void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setFollowStatus(Integer num) {
        this.followStatus = num;
    }

    public final void setFollowerCount(Integer num) {
        this.followerCount = num;
    }

    public final void setFollowerStatus(int i) {
        this.followerStatus = i;
    }

    public final void setFollowingCount(Integer num) {
        this.followingCount = num;
    }

    public final void setInitialLetter(String str) {
        this.LLILZ = str;
    }

    public final void setMafStatus(Integer num) {
        this.mafStatus = num;
    }

    public final void setMutual(MutualStruct mutualStruct) {
        this.mutual = mutualStruct;
    }

    public final void setRecType(String str) {
        this.recType = str;
    }

    public final void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public final void setSignature(String str) {
        this.signature = str;
    }

    public final void setSortWeight(String str) {
        this.LLILLL = str;
    }

    public final void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public final void setUserId(long j) {
        this.userId = j;
        Long lValueOf = Long.valueOf(j);
        long jLongValue = lValueOf.longValue();
        String uid = getUid();
        if ((uid == null || uid.length() == 0) && jLongValue > 0) {
            lValueOf.longValue();
            setUid(String.valueOf(this.userId));
        }
    }

    public final void setUserType(int i) {
        this.userType = i;
    }

    public final void setUserVerifyReason(String str) {
        this.userVerifyReason = str;
    }

    public final void setUserVerifyType(int i) {
        this.userVerifyType = i;
    }
}
