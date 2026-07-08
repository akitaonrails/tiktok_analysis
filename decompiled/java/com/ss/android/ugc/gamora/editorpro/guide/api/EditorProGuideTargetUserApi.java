package com.ss.android.ugc.gamora.editorpro.guide.api;

import X.C01GW;
import X.C09CT;
import X.C11NZ;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class EditorProGuideTargetUserApi {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(275));

    public interface Api {
        @InterfaceC1501160pAQ("/tiktok/v1/creative/user/feature/")
        C11NZ<FetchIsEpGuideTargetUserResponse> requestIsEpGuideTargetUser(@InterfaceC1501070pAH("need_is_cc_creator") boolean z, @InterfaceC1501070pAH("need_is_video_add_to_series_allowed") boolean z2);
    }

    public static final class FetchIsEpGuideTargetUserResponse extends BaseNetResponse implements Serializable {
        public static final int $stable = 8;

        @C09CT("ansa_prompt_module_resp")
        public final AnsaPromptModuleResponse ansaPromptModule;

        @C09CT("is_cc_creator")
        public final Boolean isCCCreator;

        @C09CT("is_video_add_to_series_allowed")
        public final Boolean isVideoAddToSeriesAllowed;

        @C09CT("should_show_sub_toast")
        public final Boolean shouldShowSubToast;

        public final AnsaPromptModuleResponse getAnsaPromptModule() {
            return this.ansaPromptModule;
        }

        public final Boolean getShouldShowSubToast() {
            return this.shouldShowSubToast;
        }

        public final Boolean isCCCreator() {
            return this.isCCCreator;
        }

        public final Boolean isVideoAddToSeriesAllowed() {
            return this.isVideoAddToSeriesAllowed;
        }
    }

    public static final class AnsaPromptModuleResponse implements Serializable {
        public static final int $stable = 0;

        @C09CT("need_prompt")
        public final Boolean needPrompt;

        @C09CT("video_cover_uri")
        public final String videoCoverUri;

        @C09CT("video_title")
        public final String videoTitle;

        @C09CT("text")
        public final String violationType;

        public AnsaPromptModuleResponse() {
            this(null, null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnsaPromptModuleResponse)) {
                return false;
            }
            AnsaPromptModuleResponse ansaPromptModuleResponse = (AnsaPromptModuleResponse) obj;
            return Intrinsics.LJFF(this.needPrompt, ansaPromptModuleResponse.needPrompt) && Intrinsics.LJFF(this.videoTitle, ansaPromptModuleResponse.videoTitle) && Intrinsics.LJFF(this.videoCoverUri, ansaPromptModuleResponse.videoCoverUri) && Intrinsics.LJFF(this.violationType, ansaPromptModuleResponse.violationType);
        }

        public int hashCode() {
            Boolean bool = this.needPrompt;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.videoTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.videoCoverUri;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.violationType;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AnsaPromptModuleResponse(needPrompt=");
            sbLIZ.append(this.needPrompt);
            sbLIZ.append(", videoTitle=");
            sbLIZ.append(this.videoTitle);
            sbLIZ.append(", videoCoverUri=");
            sbLIZ.append(this.videoCoverUri);
            sbLIZ.append(", violationType=");
            sbLIZ.append(this.violationType);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public AnsaPromptModuleResponse(Boolean bool, String str, String str2, String str3) {
            this.needPrompt = bool;
            this.videoTitle = str;
            this.videoCoverUri = str2;
            this.violationType = str3;
        }
    }
}
