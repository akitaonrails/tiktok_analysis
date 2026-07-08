package com.ss.android.ugc.tiktok.tpsc.model;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.tiktok.tpsc.util.JsonToStringAdapter;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacySettingsAgreementRecordV2 {

    @C09CT("extra")
    @C09CS(JsonToStringAdapter.class)
    public final String extra;

    @C09CT("props")
    public final String props;

    @C09CT("props_int")
    public final Map<String, Integer> propsInt;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySettingsAgreementRecordV2)) {
            return false;
        }
        PrivacySettingsAgreementRecordV2 privacySettingsAgreementRecordV2 = (PrivacySettingsAgreementRecordV2) obj;
        return Intrinsics.LJFF(this.propsInt, privacySettingsAgreementRecordV2.propsInt) && Intrinsics.LJFF(this.extra, privacySettingsAgreementRecordV2.extra) && Intrinsics.LJFF(this.props, privacySettingsAgreementRecordV2.props);
    }

    public PrivacySettingsAgreementRecordV2() {
        this(new HashMap(), "", "{}");
    }

    public PrivacySettingsAgreementRecordV2(Map<String, Integer> map, String str, String str2) {
        this.propsInt = map;
        this.extra = str;
        this.props = str2;
    }
}
