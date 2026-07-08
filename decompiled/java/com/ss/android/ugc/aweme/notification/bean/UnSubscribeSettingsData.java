package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class UnSubscribeSettingsData {

    @C09CT("group")
    public final Integer group;

    @C09CT("is_unsubscribe")
    public final boolean isUnsubscribe;

    @C09CT("label")
    public final Integer label;

    @C09CT("label_title")
    public final String labelTitle;

    @C09CT("subscribe_prompt")
    public final String subscribePrompt;

    @C09CT("unsubscribe_prompt")
    public final String unsubscribePrompt;

    public UnSubscribeSettingsData() {
        this(null, null, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnSubscribeSettingsData)) {
            return false;
        }
        UnSubscribeSettingsData unSubscribeSettingsData = (UnSubscribeSettingsData) obj;
        return Intrinsics.LJFF(this.group, unSubscribeSettingsData.group) && Intrinsics.LJFF(this.label, unSubscribeSettingsData.label) && Intrinsics.LJFF(this.labelTitle, unSubscribeSettingsData.labelTitle) && Intrinsics.LJFF(this.subscribePrompt, unSubscribeSettingsData.subscribePrompt) && Intrinsics.LJFF(this.unsubscribePrompt, unSubscribeSettingsData.unsubscribePrompt) && this.isUnsubscribe == unSubscribeSettingsData.isUnsubscribe;
    }

    public final int hashCode() {
        Integer num = this.group;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.label;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.labelTitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subscribePrompt;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unsubscribePrompt;
        return ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isUnsubscribe);
    }

    public static UnSubscribeSettingsData LIZ(UnSubscribeSettingsData unSubscribeSettingsData, boolean z) {
        Integer num = unSubscribeSettingsData.group;
        Integer num2 = unSubscribeSettingsData.label;
        String str = unSubscribeSettingsData.labelTitle;
        String str2 = unSubscribeSettingsData.subscribePrompt;
        String str3 = unSubscribeSettingsData.unsubscribePrompt;
        unSubscribeSettingsData.getClass();
        return new UnSubscribeSettingsData(num, num2, str, str2, str3, z);
    }

    public UnSubscribeSettingsData(Integer num, Integer num2, String str, String str2, String str3, boolean z) {
        this.group = num;
        this.label = num2;
        this.labelTitle = str;
        this.subscribePrompt = str2;
        this.unsubscribePrompt = str3;
        this.isUnsubscribe = z;
    }
}
