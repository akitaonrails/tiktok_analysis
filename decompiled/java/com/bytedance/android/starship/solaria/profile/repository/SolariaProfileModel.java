package com.bytedance.android.starship.solaria.profile.repository;

import X.C01GW;
import X.C09CT;
import X.C1090280eTi;
import X.C452501pT;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class SolariaProfileModel {
    public final transient C01GW flatGroup$delegate;

    @C09CT("profile_groups")
    public List<ProfileGroupConfig> groupList;
    public transient Boolean isNewStruck;

    @C09CT("profiles")
    public Map<String, String> profileDataMap;

    public SolariaProfileModel() {
        this(null, null);
    }

    public final Map<String, HashSet<String>> getFlatGroup$solaria_release() {
        return (Map) this.flatGroup$delegate.getValue();
    }

    public final Boolean isNewStruck$solaria_release() {
        Boolean bool = this.isNewStruck;
        if (bool != null) {
            return bool;
        }
        return Boolean.valueOf(this.groupList != null ? !r0.isEmpty() : false);
    }

    public final void setGroupList(List<ProfileGroupConfig> list) {
        this.groupList = list;
    }

    public final void setNewStruck$solaria_release(Boolean bool) {
        this.isNewStruck = bool;
    }

    public final void setProfileDataMap(Map<String, String> map) {
        this.profileDataMap = map;
    }

    public SolariaProfileModel(Map<String, String> map, List<ProfileGroupConfig> list) {
        this.profileDataMap = map;
        this.groupList = list;
        this.flatGroup$delegate = C452501pT.LIZIZ(new C1090280eTi(this));
    }
}
