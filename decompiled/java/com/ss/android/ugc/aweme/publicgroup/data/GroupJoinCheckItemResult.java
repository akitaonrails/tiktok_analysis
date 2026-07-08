package com.ss.android.ugc.aweme.publicgroup.data;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import X.EnumC994330byx;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class GroupJoinCheckItemResult {

    @C09CT("group_join_check_item_type")
    public final int checkItemType;

    @C09CT("desc")
    public final String desc;

    @C09CT("meet_criteria")
    public final boolean meetCriteria;

    @C09CT("place_holders")
    public final List<Placeholder> placeHolders;

    public GroupJoinCheckItemResult() {
        this(0, false, null, null, 15, null);
    }

    public final int hashCode() {
        return (((((this.checkItemType * 31) + C786410Ut5.Z2(this.meetCriteria)) * 31) + this.desc.hashCode()) * 31) + this.placeHolders.hashCode();
    }

    public GroupJoinCheckItemResult(int i, boolean z, String str, List<Placeholder> list) {
        this.checkItemType = i;
        this.meetCriteria = z;
        this.desc = str;
        this.placeHolders = list;
    }

    public GroupJoinCheckItemResult(int i, boolean z, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EnumC994330byx.GROUP_JOIN_CHECK_ITEM_TYPE_UNKNOWN.getValue() : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
