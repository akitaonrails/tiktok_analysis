package com.ss.android.ugc.aweme.friends.model;

import X.C089E;
import X.C09CT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Friend extends User {
    public static final Companion Companion = new Companion();
    public boolean isFirstOne;
    public boolean isInvited;

    @C09CT("phone_number")
    public String phoneNumber;
    public transient String photoUri;
    public String section = "";

    @C09CT("social_name")
    public String socialName;

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.socialName;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.phoneNumber;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getPhotoUri() {
        return this.photoUri;
    }

    public final String getSection() {
        return this.section;
    }

    public final String getSocialName() {
        return this.socialName;
    }

    public final boolean isFirstOne() {
        return this.isFirstOne;
    }

    public final boolean isInvited() {
        return this.isInvited;
    }

    public static final class Companion {
        public final Friend copyFrom(User user) {
            if (user == null) {
                return null;
            }
            if (user instanceof Friend) {
                return (Friend) user;
            }
            Friend friend = new Friend(null);
            C089E c089e = new C089E(User.class.getDeclaredFields());
            while (c089e.hasNext()) {
                Field field = (Field) c089e.next();
                if (field.getAnnotation(C09CT.class) != null) {
                    field.setAccessible(true);
                    try {
                        field.set(friend, field.get(user));
                    } catch (IllegalAccessException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            friend.setRequestId(user.getRequestId());
            return friend;
        }
    }

    public Friend(String str) {
        this.socialName = str;
    }

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(Friend.class, obj.getClass()) || !super.equals(obj)) {
            return false;
        }
        Friend friend = (Friend) obj;
        if (Intrinsics.LJFF(this.socialName, friend.socialName) && Intrinsics.LJFF(this.phoneNumber, friend.phoneNumber)) {
            return true;
        }
        return false;
    }

    public final void setFirstOne(boolean z) {
        this.isFirstOne = z;
    }

    public final void setInvited(boolean z) {
        this.isInvited = z;
    }

    public final void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public final void setPhotoUri(String str) {
        this.photoUri = str;
    }

    public final void setSection(String str) {
        this.section = str;
    }

    public final void setSocialName(String str) {
        this.socialName = str;
    }
}
