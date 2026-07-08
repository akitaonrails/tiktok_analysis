package webcast.api.room;

import X.C09CT;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;

/* JADX INFO: loaded from: classes13.dex */
public final class CppAgeVerifyResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("age_restricted")
        public boolean ageRestricted;

        @C09CT("age_verification_info")
        public CppAgeVerificationInfo ageVerificationInfo;

        @C09CT("has_gone_live_using_live_studio")
        public boolean hasGoneLiveUsingLiveStudio;
    }

    public static final class Extra {

        @C09CT("now")
        public long now;
    }
}
