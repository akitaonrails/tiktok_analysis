package com.ss.android.ugc.aweme.aigc.quality.mob.definitions;

import X.C09CS;
import X.C09CT;
import X.C2188811AlT;
import X.C542160LOc;
import X.C549680Lh8;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.q;
import com.google.gson.r;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public interface AIGC<T> {

    @C09CS(GsonAdapter.class)
    public static abstract class RecallWay implements AIGC<String>, Parcelable {
        public static final C542160LOc Companion = new C542160LOc();

        @C09CT("recall_way_value")
        public final String value;

        /* JADX INFO: loaded from: classes36.dex */
        public static final class CHAT extends RecallWay {
            public static final CHAT INSTANCE = new CHAT();
            public static final Parcelable.Creator<CHAT> CREATOR = new Parcelable.Creator<CHAT>() { // from class: X.1DPi
                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.CHAT createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RecallWay.CHAT.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.CHAT[] newArray(int i) {
                    return new AIGC.RecallWay.CHAT[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CHAT() {
                super("chat");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class CLOUD_HAS_LOCAL_DRAFT extends RecallWay {
            public static final CLOUD_HAS_LOCAL_DRAFT INSTANCE = new CLOUD_HAS_LOCAL_DRAFT();
            public static final Parcelable.Creator<CLOUD_HAS_LOCAL_DRAFT> CREATOR = new Parcelable.Creator<CLOUD_HAS_LOCAL_DRAFT>() { // from class: X.1DPk
                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.CLOUD_HAS_LOCAL_DRAFT createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RecallWay.CLOUD_HAS_LOCAL_DRAFT.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.CLOUD_HAS_LOCAL_DRAFT[] newArray(int i) {
                    return new AIGC.RecallWay.CLOUD_HAS_LOCAL_DRAFT[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CLOUD_HAS_LOCAL_DRAFT() {
                super("cloud_has_local_draft");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class CLOUD_NO_LOCAL_DRAFT extends RecallWay {
            public static final CLOUD_NO_LOCAL_DRAFT INSTANCE = new CLOUD_NO_LOCAL_DRAFT();
            public static final Parcelable.Creator<CLOUD_NO_LOCAL_DRAFT> CREATOR = new Parcelable.Creator<CLOUD_NO_LOCAL_DRAFT>() { // from class: X.1DPj
                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.CLOUD_NO_LOCAL_DRAFT createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RecallWay.CLOUD_NO_LOCAL_DRAFT.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.CLOUD_NO_LOCAL_DRAFT[] newArray(int i) {
                    return new AIGC.RecallWay.CLOUD_NO_LOCAL_DRAFT[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CLOUD_NO_LOCAL_DRAFT() {
                super("cloud_no_local_draft");
            }
        }

        public static final class DM_CARD_GENERATE_FAILED extends RecallWay {
            public static final DM_CARD_GENERATE_FAILED INSTANCE = new DM_CARD_GENERATE_FAILED();
            public static final Parcelable.Creator<DM_CARD_GENERATE_FAILED> CREATOR = new Parcelable.Creator<DM_CARD_GENERATE_FAILED>() { // from class: X.0MUS
                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.DM_CARD_GENERATE_FAILED createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RecallWay.DM_CARD_GENERATE_FAILED.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.DM_CARD_GENERATE_FAILED[] newArray(int i) {
                    return new AIGC.RecallWay.DM_CARD_GENERATE_FAILED[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public DM_CARD_GENERATE_FAILED() {
                super("dm_card_generate_failed");
            }
        }

        public static final class DRAFT extends RecallWay {
            public static final DRAFT INSTANCE = new DRAFT();
            public static final Parcelable.Creator<DRAFT> CREATOR = new Parcelable.Creator<DRAFT>() { // from class: X.0MUN
                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.DRAFT createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RecallWay.DRAFT.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.DRAFT[] newArray(int i) {
                    return new AIGC.RecallWay.DRAFT[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public DRAFT() {
                super("draft");
            }
        }

        public static final class EDIT_PAGE_SIDEBAR_FROM_CRT extends RecallWay {
            public static final EDIT_PAGE_SIDEBAR_FROM_CRT INSTANCE = new EDIT_PAGE_SIDEBAR_FROM_CRT();
            public static final Parcelable.Creator<EDIT_PAGE_SIDEBAR_FROM_CRT> CREATOR = new Parcelable.Creator<EDIT_PAGE_SIDEBAR_FROM_CRT>() { // from class: X.0Lw8
                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.EDIT_PAGE_SIDEBAR_FROM_CRT createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RecallWay.EDIT_PAGE_SIDEBAR_FROM_CRT.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.EDIT_PAGE_SIDEBAR_FROM_CRT[] newArray(int i) {
                    return new AIGC.RecallWay.EDIT_PAGE_SIDEBAR_FROM_CRT[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public EDIT_PAGE_SIDEBAR_FROM_CRT() {
                super("edit_page_sidebar_from_crt");
            }
        }

        public static final class EDIT_PAGE_SIDEBAR_FROM_DRAFT extends RecallWay {
            public static final EDIT_PAGE_SIDEBAR_FROM_DRAFT INSTANCE = new EDIT_PAGE_SIDEBAR_FROM_DRAFT();
            public static final Parcelable.Creator<EDIT_PAGE_SIDEBAR_FROM_DRAFT> CREATOR = new Parcelable.Creator<EDIT_PAGE_SIDEBAR_FROM_DRAFT>() { // from class: X.0Lw9
                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.EDIT_PAGE_SIDEBAR_FROM_DRAFT createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RecallWay.EDIT_PAGE_SIDEBAR_FROM_DRAFT.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.EDIT_PAGE_SIDEBAR_FROM_DRAFT[] newArray(int i) {
                    return new AIGC.RecallWay.EDIT_PAGE_SIDEBAR_FROM_DRAFT[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public EDIT_PAGE_SIDEBAR_FROM_DRAFT() {
                super("edit_page_sidebar_from_draft");
            }
        }

        public static final class GENERATE_AITHEATER_VIDEO_SUCCESS extends RecallWay {
            public static final GENERATE_AITHEATER_VIDEO_SUCCESS INSTANCE = new GENERATE_AITHEATER_VIDEO_SUCCESS();
            public static final Parcelable.Creator<GENERATE_AITHEATER_VIDEO_SUCCESS> CREATOR = new Parcelable.Creator<GENERATE_AITHEATER_VIDEO_SUCCESS>() { // from class: X.0MUQ
                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.GENERATE_AITHEATER_VIDEO_SUCCESS createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RecallWay.GENERATE_AITHEATER_VIDEO_SUCCESS.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.GENERATE_AITHEATER_VIDEO_SUCCESS[] newArray(int i) {
                    return new AIGC.RecallWay.GENERATE_AITHEATER_VIDEO_SUCCESS[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public GENERATE_AITHEATER_VIDEO_SUCCESS() {
                super("generate_aitheater_video_success");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class INBOX extends RecallWay {
            public static final INBOX INSTANCE = new INBOX();
            public static final Parcelable.Creator<INBOX> CREATOR = new Parcelable.Creator<INBOX>() { // from class: X.1DPl
                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.INBOX createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RecallWay.INBOX.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.INBOX[] newArray(int i) {
                    return new AIGC.RecallWay.INBOX[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public INBOX() {
                super("inbox");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class INNER_PUSH extends RecallWay {
            public static final INNER_PUSH INSTANCE = new INNER_PUSH();
            public static final Parcelable.Creator<INNER_PUSH> CREATOR = new Parcelable.Creator<INNER_PUSH>() { // from class: X.1DPn
                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.INNER_PUSH createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RecallWay.INNER_PUSH.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.INNER_PUSH[] newArray(int i) {
                    return new AIGC.RecallWay.INNER_PUSH[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public INNER_PUSH() {
                super("inner_push");
            }
        }

        public static final class OUTER_PUSH extends RecallWay {
            public static final OUTER_PUSH INSTANCE = new OUTER_PUSH();
            public static final Parcelable.Creator<OUTER_PUSH> CREATOR = new Parcelable.Creator<OUTER_PUSH>() { // from class: X.0M7B
                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.OUTER_PUSH createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RecallWay.OUTER_PUSH.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.OUTER_PUSH[] newArray(int i) {
                    return new AIGC.RecallWay.OUTER_PUSH[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public OUTER_PUSH() {
                super("outer_push");
            }
        }

        public static final class PROFILE_CAMEO_DRAFT extends RecallWay {
            public static final PROFILE_CAMEO_DRAFT INSTANCE = new PROFILE_CAMEO_DRAFT();
            public static final Parcelable.Creator<PROFILE_CAMEO_DRAFT> CREATOR = new Parcelable.Creator<PROFILE_CAMEO_DRAFT>() { // from class: X.0LtK
                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.PROFILE_CAMEO_DRAFT createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RecallWay.PROFILE_CAMEO_DRAFT.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.PROFILE_CAMEO_DRAFT[] newArray(int i) {
                    return new AIGC.RecallWay.PROFILE_CAMEO_DRAFT[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public PROFILE_CAMEO_DRAFT() {
                super("profile_cameo_draft");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class VIDEO_EDIT_PAGE extends RecallWay {
            public static final VIDEO_EDIT_PAGE INSTANCE = new VIDEO_EDIT_PAGE();
            public static final Parcelable.Creator<VIDEO_EDIT_PAGE> CREATOR = new Parcelable.Creator<VIDEO_EDIT_PAGE>() { // from class: X.1DPm
                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.VIDEO_EDIT_PAGE createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RecallWay.VIDEO_EDIT_PAGE.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.VIDEO_EDIT_PAGE[] newArray(int i) {
                    return new AIGC.RecallWay.VIDEO_EDIT_PAGE[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public VIDEO_EDIT_PAGE() {
                super("video_edit_page");
            }
        }

        public final int hashCode() {
            return getValue().hashCode();
        }

        public static final class Custom extends RecallWay {
            public static final Parcelable.Creator<Custom> CREATOR = new Parcelable.Creator<Custom>() { // from class: X.0LPe
                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.Custom createFromParcel(Parcel parcel) {
                    return new AIGC.RecallWay.Custom(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RecallWay.Custom[] newArray(int i) {
                    return new AIGC.RecallWay.Custom[i];
                }
            };
            public final String value;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Custom(value=");
                sbLIZ.append(this.value);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.value);
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RecallWay
            /* JADX INFO: renamed from: LIZ */
            public final String getValue() {
                return this.value;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RecallWay, com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC
            public final String getValue() {
                return this.value;
            }

            public Custom(String str) {
                super(str);
                this.value = str;
            }
        }

        @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC
        /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
        public String getValue() {
            return this.value;
        }

        public RecallWay(String str) {
            this.value = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof RecallWay) && Intrinsics.LJFF(getValue(), ((RecallWay) obj).getValue())) {
                return true;
            }
            return false;
        }

        /* JADX INFO: loaded from: classes35.dex */
        public static final class GsonAdapter implements r<RecallWay>, j<RecallWay> {
            @Override // com.google.gson.r
            public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
                String value;
                RecallWay recallWay = (RecallWay) obj;
                if (recallWay == null || (value = recallWay.getValue()) == null) {
                    value = "";
                }
                return new q(value);
            }

            @Override // com.google.gson.j
            public final RecallWay deserialize(k kVar, Type type, i iVar) {
                q qVar;
                String strLJIL = null;
                if ((kVar instanceof q) && (qVar = (q) kVar) != null && (qVar.LL instanceof String)) {
                    strLJIL = qVar.LJIL();
                }
                RecallWay.Companion.getClass();
                return C542160LOc.LIZ(strLJIL);
            }
        }
    }

    public static class RefPageName implements AIGC<String>, Parcelable {
        public static final Parcelable.Creator<RefPageName> CREATOR = new Parcelable.Creator<RefPageName>() { // from class: X.0Lhh
            @Override // android.os.Parcelable.Creator
            public final AIGC.RefPageName createFromParcel(Parcel parcel) {
                return new AIGC.RefPageName(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AIGC.RefPageName[] newArray(int i) {
                return new AIGC.RefPageName[i];
            }
        };

        @C09CT("pre_page_name_value")
        public final String value;

        public static final class AICreationSubPage extends RefPageName {
            public static final AICreationSubPage INSTANCE = new AICreationSubPage();
            public static final Parcelable.Creator<AICreationSubPage> CREATOR = new Parcelable.Creator<AICreationSubPage>() { // from class: X.0MWo
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.AICreationSubPage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.AICreationSubPage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.AICreationSubPage[] newArray(int i) {
                    return new AIGC.RefPageName.AICreationSubPage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public AICreationSubPage() {
                super("aicreation_subpage");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class AITheaterDraftPage extends RefPageName {
            public static final AITheaterDraftPage INSTANCE = new AITheaterDraftPage();
            public static final Parcelable.Creator<AITheaterDraftPage> CREATOR = new Parcelable.Creator<AITheaterDraftPage>() { // from class: X.1DPo
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.AITheaterDraftPage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.AITheaterDraftPage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.AITheaterDraftPage[] newArray(int i) {
                    return new AIGC.RefPageName.AITheaterDraftPage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public AITheaterDraftPage() {
                super("aitheater_draft_page");
            }
        }

        public static final class CameoManagePage extends RefPageName {
            public static final CameoManagePage INSTANCE = new CameoManagePage();
            public static final Parcelable.Creator<CameoManagePage> CREATOR = new Parcelable.Creator<CameoManagePage>() { // from class: X.0Lpc
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.CameoManagePage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.CameoManagePage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.CameoManagePage[] newArray(int i) {
                    return new AIGC.RefPageName.CameoManagePage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CameoManagePage() {
                super("cameo_manage_page");
            }
        }

        public static final class Chat extends RefPageName {
            public static final Chat INSTANCE = new Chat();
            public static final Parcelable.Creator<Chat> CREATOR = new Parcelable.Creator<Chat>() { // from class: X.0L6m
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.Chat createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.Chat.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.Chat[] newArray(int i) {
                    return new AIGC.RefPageName.Chat[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public Chat() {
                super("chat");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class CloudDraftCameoPreview extends RefPageName {
            public static final CloudDraftCameoPreview INSTANCE = new CloudDraftCameoPreview();
            public static final Parcelable.Creator<CloudDraftCameoPreview> CREATOR = new Parcelable.Creator<CloudDraftCameoPreview>() { // from class: X.1DPp
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.CloudDraftCameoPreview createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.CloudDraftCameoPreview.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.CloudDraftCameoPreview[] newArray(int i) {
                    return new AIGC.RefPageName.CloudDraftCameoPreview[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CloudDraftCameoPreview() {
                super("cloud_draft_cameo_preview");
            }
        }

        public static final class CreatedVideoUnavailablePage extends RefPageName {
            public static final CreatedVideoUnavailablePage INSTANCE = new CreatedVideoUnavailablePage();
            public static final Parcelable.Creator<CreatedVideoUnavailablePage> CREATOR = new Parcelable.Creator<CreatedVideoUnavailablePage>() { // from class: X.0LOd
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.CreatedVideoUnavailablePage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.CreatedVideoUnavailablePage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.CreatedVideoUnavailablePage[] newArray(int i) {
                    return new AIGC.RefPageName.CreatedVideoUnavailablePage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CreatedVideoUnavailablePage() {
                super("created_video_unavailable_page");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class DraftPage extends RefPageName {
            public static final DraftPage INSTANCE = new DraftPage();
            public static final Parcelable.Creator<DraftPage> CREATOR = new Parcelable.Creator<DraftPage>() { // from class: X.1DPq
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.DraftPage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.DraftPage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.DraftPage[] newArray(int i) {
                    return new AIGC.RefPageName.DraftPage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public DraftPage() {
                super("draft_page");
            }
        }

        /* JADX INFO: loaded from: classes26.dex */
        public static final class FaceSoundVerify extends RefPageName {
            public static final FaceSoundVerify INSTANCE = new FaceSoundVerify();
            public static final Parcelable.Creator<FaceSoundVerify> CREATOR = new Parcelable.Creator<FaceSoundVerify>() { // from class: X.0u0V
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.FaceSoundVerify createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.FaceSoundVerify.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.FaceSoundVerify[] newArray(int i) {
                    return new AIGC.RefPageName.FaceSoundVerify[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public FaceSoundVerify() {
                super("face_sound_verify");
            }
        }

        public static final class GenerationPage extends RefPageName {
            public static final GenerationPage INSTANCE = new GenerationPage();
            public static final Parcelable.Creator<GenerationPage> CREATOR = new Parcelable.Creator<GenerationPage>() { // from class: X.0Liy
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.GenerationPage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.GenerationPage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.GenerationPage[] newArray(int i) {
                    return new AIGC.RefPageName.GenerationPage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public GenerationPage() {
                super("generating_page");
            }
        }

        /* JADX INFO: loaded from: classes26.dex */
        public static final class NoNeed extends RefPageName {
            public static final NoNeed INSTANCE = new NoNeed();
            public static final Parcelable.Creator<NoNeed> CREATOR = new Parcelable.Creator<NoNeed>() { // from class: X.0u0M
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.NoNeed createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.NoNeed.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.NoNeed[] newArray(int i) {
                    return new AIGC.RefPageName.NoNeed[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public NoNeed() {
                super("");
            }
        }

        public static final class Notification extends RefPageName {
            public static final Notification INSTANCE = new Notification();
            public static final Parcelable.Creator<Notification> CREATOR = new Parcelable.Creator<Notification>() { // from class: X.0LPY
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.Notification createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.Notification.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.Notification[] newArray(int i) {
                    return new AIGC.RefPageName.Notification[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public Notification() {
                super("notification");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class OthersHomepage extends RefPageName {
            public static final OthersHomepage INSTANCE = new OthersHomepage();
            public static final Parcelable.Creator<OthersHomepage> CREATOR = new Parcelable.Creator<OthersHomepage>() { // from class: X.1DPs
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.OthersHomepage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.OthersHomepage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.OthersHomepage[] newArray(int i) {
                    return new AIGC.RefPageName.OthersHomepage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public OthersHomepage() {
                super("others_homepage");
            }
        }

        public static final class PersonalHomepage extends RefPageName {
            public static final PersonalHomepage INSTANCE = new PersonalHomepage();
            public static final Parcelable.Creator<PersonalHomepage> CREATOR = new Parcelable.Creator<PersonalHomepage>() { // from class: X.0Liv
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.PersonalHomepage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.PersonalHomepage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.PersonalHomepage[] newArray(int i) {
                    return new AIGC.RefPageName.PersonalHomepage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public PersonalHomepage() {
                super("personal_homepage");
            }
        }

        public static final class Profile extends RefPageName {
            public static final Profile INSTANCE = new Profile();
            public static final Parcelable.Creator<Profile> CREATOR = new Parcelable.Creator<Profile>() { // from class: X.0Lw3
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.Profile createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.Profile.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.Profile[] newArray(int i) {
                    return new AIGC.RefPageName.Profile[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public Profile() {
                super("profile");
            }
        }

        public static final class PromptEditPage extends RefPageName {
            public static final PromptEditPage INSTANCE = new PromptEditPage();
            public static final Parcelable.Creator<PromptEditPage> CREATOR = new Parcelable.Creator<PromptEditPage>() { // from class: X.0Kn9
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.PromptEditPage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.PromptEditPage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.PromptEditPage[] newArray(int i) {
                    return new AIGC.RefPageName.PromptEditPage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public PromptEditPage() {
                super("prompt_edit_page");
            }
        }

        public static final class ResultLoadingPage extends RefPageName {
            public static final ResultLoadingPage INSTANCE = new ResultLoadingPage();
            public static final Parcelable.Creator<ResultLoadingPage> CREATOR = new Parcelable.Creator<ResultLoadingPage>() { // from class: X.0Liz
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.ResultLoadingPage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.ResultLoadingPage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.ResultLoadingPage[] newArray(int i) {
                    return new AIGC.RefPageName.ResultLoadingPage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public ResultLoadingPage() {
                super("result_loading_page");
            }
        }

        /* JADX INFO: loaded from: classes26.dex */
        public static final class TemplatePreviewPage extends RefPageName {
            public static final TemplatePreviewPage INSTANCE = new TemplatePreviewPage();
            public static final Parcelable.Creator<TemplatePreviewPage> CREATOR = new Parcelable.Creator<TemplatePreviewPage>() { // from class: X.0u0N
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.TemplatePreviewPage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.TemplatePreviewPage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.TemplatePreviewPage[] newArray(int i) {
                    return new AIGC.RefPageName.TemplatePreviewPage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public TemplatePreviewPage() {
                super("template_preview_page");
            }
        }

        public static final class UploadPage extends RefPageName {
            public static final UploadPage INSTANCE = new UploadPage();
            public static final Parcelable.Creator<UploadPage> CREATOR = new Parcelable.Creator<UploadPage>() { // from class: X.0Kqt
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.UploadPage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.UploadPage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.UploadPage[] newArray(int i) {
                    return new AIGC.RefPageName.UploadPage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public UploadPage() {
                super("upload_page");
            }
        }

        public static final class VideoEditPage extends RefPageName {
            public static final VideoEditPage INSTANCE = new VideoEditPage();
            public static final Parcelable.Creator<VideoEditPage> CREATOR = new Parcelable.Creator<VideoEditPage>() { // from class: X.0Lj0
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.VideoEditPage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.VideoEditPage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.VideoEditPage[] newArray(int i) {
                    return new AIGC.RefPageName.VideoEditPage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public VideoEditPage() {
                super("edit_page");
            }
        }

        public static final class VideoShootPage extends RefPageName {
            public static final VideoShootPage INSTANCE = new VideoShootPage();
            public static final Parcelable.Creator<VideoShootPage> CREATOR = new Parcelable.Creator<VideoShootPage>() { // from class: X.0LpY
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.VideoShootPage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.VideoShootPage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.VideoShootPage[] newArray(int i) {
                    return new AIGC.RefPageName.VideoShootPage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public VideoShootPage() {
                super("video_shoot_page");
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.value);
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class TemplateDetailPage extends RefPageName {
            public static final TemplateDetailPage INSTANCE = new TemplateDetailPage();
            public static final Parcelable.Creator<TemplateDetailPage> CREATOR = new Parcelable.Creator<TemplateDetailPage>() { // from class: X.1DPr
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.TemplateDetailPage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.RefPageName.TemplateDetailPage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.TemplateDetailPage[] newArray(int i) {
                    return new AIGC.RefPageName.TemplateDetailPage[i];
                }
            };

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public TemplateDetailPage() {
                super("template_detail_page");
            }
        }

        public RefPageName() {
            this("");
        }

        @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC
        public final /* bridge */ /* synthetic */ String getValue() {
            return this.value;
        }

        public static final class Custom extends RefPageName {
            public static final Parcelable.Creator<Custom> CREATOR = new Parcelable.Creator<Custom>() { // from class: X.0Lnh
                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.Custom createFromParcel(Parcel parcel) {
                    return new AIGC.RefPageName.Custom(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.RefPageName.Custom[] newArray(int i) {
                    return new AIGC.RefPageName.Custom[i];
                }
            };

            @C09CT("name")
            public final String name;

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.name);
            }

            public Custom(String str) {
                super(str);
                this.name = str;
            }
        }

        public RefPageName(String str) {
            this.value = str;
        }
    }

    T getValue();

    @C09CS(GsonAdapter.class)
    public static abstract class AICreationSceneName implements AIGC<String>, Parcelable {
        public static final C549680Lh8 Companion = new C549680Lh8();

        @C09CT("scene_name_value")
        public final String value;

        public static final class AIVIDEO_DELETED_NOTICE extends AICreationSceneName {
            public static final AIVIDEO_DELETED_NOTICE INSTANCE = new AIVIDEO_DELETED_NOTICE();
            public static final Parcelable.Creator<AIVIDEO_DELETED_NOTICE> CREATOR = new Parcelable.Creator<AIVIDEO_DELETED_NOTICE>() { // from class: X.0LOZ
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.AIVIDEO_DELETED_NOTICE createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.AIVIDEO_DELETED_NOTICE.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.AIVIDEO_DELETED_NOTICE[] newArray(int i) {
                    return new AIGC.AICreationSceneName.AIVIDEO_DELETED_NOTICE[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public AIVIDEO_DELETED_NOTICE() {
                super("aivideo_deleted_notice");
            }
        }

        public static final class AI_IMAGE_NEW_AISELF extends AICreationSceneName {
            public static final AI_IMAGE_NEW_AISELF INSTANCE = new AI_IMAGE_NEW_AISELF();
            public static final Parcelable.Creator<AI_IMAGE_NEW_AISELF> CREATOR = new Parcelable.Creator<AI_IMAGE_NEW_AISELF>() { // from class: X.0Kqv
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.AI_IMAGE_NEW_AISELF createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.AI_IMAGE_NEW_AISELF.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.AI_IMAGE_NEW_AISELF[] newArray(int i) {
                    return new AIGC.AICreationSceneName.AI_IMAGE_NEW_AISELF[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public AI_IMAGE_NEW_AISELF() {
                super("ai_image_new_aiself");
            }
        }

        /* JADX INFO: loaded from: classes26.dex */
        public static final class AI_PORTRAIT_ANCHOR extends AICreationSceneName {
            public static final AI_PORTRAIT_ANCHOR INSTANCE = new AI_PORTRAIT_ANCHOR();
            public static final Parcelable.Creator<AI_PORTRAIT_ANCHOR> CREATOR = new Parcelable.Creator<AI_PORTRAIT_ANCHOR>() { // from class: X.0u0W
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.AI_PORTRAIT_ANCHOR createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.AI_PORTRAIT_ANCHOR.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.AI_PORTRAIT_ANCHOR[] newArray(int i) {
                    return new AIGC.AICreationSceneName.AI_PORTRAIT_ANCHOR[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public AI_PORTRAIT_ANCHOR() {
                super("ai_portrait_anchor");
            }
        }

        public static final class AI_THEATER_DEEPLINK extends AICreationSceneName {
            public static final AI_THEATER_DEEPLINK INSTANCE = new AI_THEATER_DEEPLINK();
            public static final Parcelable.Creator<AI_THEATER_DEEPLINK> CREATOR = new Parcelable.Creator<AI_THEATER_DEEPLINK>() { // from class: X.0Lhb
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.AI_THEATER_DEEPLINK createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.AI_THEATER_DEEPLINK.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.AI_THEATER_DEEPLINK[] newArray(int i) {
                    return new AIGC.AICreationSceneName.AI_THEATER_DEEPLINK[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public AI_THEATER_DEEPLINK() {
                super("ai_theater_deeplink");
            }
        }

        public static final class CAMEO_CREATED_CONTINUE extends AICreationSceneName {
            public static final CAMEO_CREATED_CONTINUE INSTANCE = new CAMEO_CREATED_CONTINUE();
            public static final Parcelable.Creator<CAMEO_CREATED_CONTINUE> CREATOR = new Parcelable.Creator<CAMEO_CREATED_CONTINUE>() { // from class: X.0MUL
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CAMEO_CREATED_CONTINUE createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.CAMEO_CREATED_CONTINUE.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CAMEO_CREATED_CONTINUE[] newArray(int i) {
                    return new AIGC.AICreationSceneName.CAMEO_CREATED_CONTINUE[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CAMEO_CREATED_CONTINUE() {
                super("cameo_created_continue");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class CAMEO_MANAGE_CAST_BUTTON extends AICreationSceneName {
            public static final CAMEO_MANAGE_CAST_BUTTON INSTANCE = new CAMEO_MANAGE_CAST_BUTTON();
            public static final Parcelable.Creator<CAMEO_MANAGE_CAST_BUTTON> CREATOR = new Parcelable.Creator<CAMEO_MANAGE_CAST_BUTTON>() { // from class: X.1DPb
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CAMEO_MANAGE_CAST_BUTTON createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.CAMEO_MANAGE_CAST_BUTTON.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CAMEO_MANAGE_CAST_BUTTON[] newArray(int i) {
                    return new AIGC.AICreationSceneName.CAMEO_MANAGE_CAST_BUTTON[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CAMEO_MANAGE_CAST_BUTTON() {
                super("cameo_manage_cast_button");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class CAMEO_MANAGE_CAST_PAGE extends AICreationSceneName {
            public static final CAMEO_MANAGE_CAST_PAGE INSTANCE = new CAMEO_MANAGE_CAST_PAGE();
            public static final Parcelable.Creator<CAMEO_MANAGE_CAST_PAGE> CREATOR = new Parcelable.Creator<CAMEO_MANAGE_CAST_PAGE>() { // from class: X.1DPc
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CAMEO_MANAGE_CAST_PAGE createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.CAMEO_MANAGE_CAST_PAGE.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CAMEO_MANAGE_CAST_PAGE[] newArray(int i) {
                    return new AIGC.AICreationSceneName.CAMEO_MANAGE_CAST_PAGE[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CAMEO_MANAGE_CAST_PAGE() {
                super("cameo_manage_cast_page");
            }
        }

        public static final class CAMEO_MANAGE_PAGE extends AICreationSceneName {
            public static final CAMEO_MANAGE_PAGE INSTANCE = new CAMEO_MANAGE_PAGE();
            public static final Parcelable.Creator<CAMEO_MANAGE_PAGE> CREATOR = new Parcelable.Creator<CAMEO_MANAGE_PAGE>() { // from class: X.0Lpd
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CAMEO_MANAGE_PAGE createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.CAMEO_MANAGE_PAGE.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CAMEO_MANAGE_PAGE[] newArray(int i) {
                    return new AIGC.AICreationSceneName.CAMEO_MANAGE_PAGE[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CAMEO_MANAGE_PAGE() {
                super("cameo_manage_page");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class CAMEO_MANAGE_PORTRAIT_PAGE extends AICreationSceneName {
            public static final CAMEO_MANAGE_PORTRAIT_PAGE INSTANCE = new CAMEO_MANAGE_PORTRAIT_PAGE();
            public static final Parcelable.Creator<CAMEO_MANAGE_PORTRAIT_PAGE> CREATOR = new Parcelable.Creator<CAMEO_MANAGE_PORTRAIT_PAGE>() { // from class: X.1DPd
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CAMEO_MANAGE_PORTRAIT_PAGE createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.CAMEO_MANAGE_PORTRAIT_PAGE.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CAMEO_MANAGE_PORTRAIT_PAGE[] newArray(int i) {
                    return new AIGC.AICreationSceneName.CAMEO_MANAGE_PORTRAIT_PAGE[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CAMEO_MANAGE_PORTRAIT_PAGE() {
                super("cameo_manage_portrait_page");
            }
        }

        public static final class CHAT_ACTION_BAR_INVITE_AI_THEATER extends AICreationSceneName {
            public static final CHAT_ACTION_BAR_INVITE_AI_THEATER INSTANCE = new CHAT_ACTION_BAR_INVITE_AI_THEATER();
            public static final Parcelable.Creator<CHAT_ACTION_BAR_INVITE_AI_THEATER> CREATOR = new Parcelable.Creator<CHAT_ACTION_BAR_INVITE_AI_THEATER>() { // from class: X.0LgE
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CHAT_ACTION_BAR_INVITE_AI_THEATER createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.CHAT_ACTION_BAR_INVITE_AI_THEATER.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CHAT_ACTION_BAR_INVITE_AI_THEATER[] newArray(int i) {
                    return new AIGC.AICreationSceneName.CHAT_ACTION_BAR_INVITE_AI_THEATER[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CHAT_ACTION_BAR_INVITE_AI_THEATER() {
                super("chat_action_bar_invite_ai_theater");
            }
        }

        public static final class CHAT_ACTION_BAR_SENDER_AI_THEATER extends AICreationSceneName {
            public static final CHAT_ACTION_BAR_SENDER_AI_THEATER INSTANCE = new CHAT_ACTION_BAR_SENDER_AI_THEATER();
            public static final Parcelable.Creator<CHAT_ACTION_BAR_SENDER_AI_THEATER> CREATOR = new Parcelable.Creator<CHAT_ACTION_BAR_SENDER_AI_THEATER>() { // from class: X.0LgF
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CHAT_ACTION_BAR_SENDER_AI_THEATER createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.CHAT_ACTION_BAR_SENDER_AI_THEATER.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CHAT_ACTION_BAR_SENDER_AI_THEATER[] newArray(int i) {
                    return new AIGC.AICreationSceneName.CHAT_ACTION_BAR_SENDER_AI_THEATER[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CHAT_ACTION_BAR_SENDER_AI_THEATER() {
                super("chat_action_bar_sender_ai_theater");
            }
        }

        public static final class CHAT_AI_THEATER extends AICreationSceneName {
            public static final CHAT_AI_THEATER INSTANCE = new CHAT_AI_THEATER();
            public static final Parcelable.Creator<CHAT_AI_THEATER> CREATOR = new Parcelable.Creator<CHAT_AI_THEATER>() { // from class: X.0LpZ
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CHAT_AI_THEATER createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.CHAT_AI_THEATER.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CHAT_AI_THEATER[] newArray(int i) {
                    return new AIGC.AICreationSceneName.CHAT_AI_THEATER[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CHAT_AI_THEATER() {
                super("chat_ai_theater");
            }
        }

        public static final class CHAT_BOTTLE_CAST_ENTRANCE_AI_THEATER extends AICreationSceneName {
            public static final CHAT_BOTTLE_CAST_ENTRANCE_AI_THEATER INSTANCE = new CHAT_BOTTLE_CAST_ENTRANCE_AI_THEATER();
            public static final Parcelable.Creator<CHAT_BOTTLE_CAST_ENTRANCE_AI_THEATER> CREATOR = new Parcelable.Creator<CHAT_BOTTLE_CAST_ENTRANCE_AI_THEATER>() { // from class: X.0L6e
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CHAT_BOTTLE_CAST_ENTRANCE_AI_THEATER createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.CHAT_BOTTLE_CAST_ENTRANCE_AI_THEATER.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CHAT_BOTTLE_CAST_ENTRANCE_AI_THEATER[] newArray(int i) {
                    return new AIGC.AICreationSceneName.CHAT_BOTTLE_CAST_ENTRANCE_AI_THEATER[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CHAT_BOTTLE_CAST_ENTRANCE_AI_THEATER() {
                super("chat_bottle_cast_entrance_ai_theater");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class CLOUD_NO_LOCAL_DRAFT extends AICreationSceneName {
            public static final CLOUD_NO_LOCAL_DRAFT INSTANCE = new CLOUD_NO_LOCAL_DRAFT();
            public static final Parcelable.Creator<CLOUD_NO_LOCAL_DRAFT> CREATOR = new Parcelable.Creator<CLOUD_NO_LOCAL_DRAFT>() { // from class: X.1DPh
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CLOUD_NO_LOCAL_DRAFT createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.CLOUD_NO_LOCAL_DRAFT.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.CLOUD_NO_LOCAL_DRAFT[] newArray(int i) {
                    return new AIGC.AICreationSceneName.CLOUD_NO_LOCAL_DRAFT[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public CLOUD_NO_LOCAL_DRAFT() {
                super("cloud_no_local_draft");
            }
        }

        public static final class DISSUPPORT_REMIX_CAST extends AICreationSceneName {
            public static final DISSUPPORT_REMIX_CAST INSTANCE = new DISSUPPORT_REMIX_CAST();
            public static final Parcelable.Creator<DISSUPPORT_REMIX_CAST> CREATOR = new Parcelable.Creator<DISSUPPORT_REMIX_CAST>() { // from class: X.0Lpa
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.DISSUPPORT_REMIX_CAST createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.DISSUPPORT_REMIX_CAST.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.DISSUPPORT_REMIX_CAST[] newArray(int i) {
                    return new AIGC.AICreationSceneName.DISSUPPORT_REMIX_CAST[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public DISSUPPORT_REMIX_CAST() {
                super("dissupport_remix_cast");
            }
        }

        public static final class DRAFT extends AICreationSceneName {
            public static final DRAFT INSTANCE = new DRAFT();
            public static final Parcelable.Creator<DRAFT> CREATOR = new Parcelable.Creator<DRAFT>() { // from class: X.0Lha
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.DRAFT createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.DRAFT.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.DRAFT[] newArray(int i) {
                    return new AIGC.AICreationSceneName.DRAFT[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public DRAFT() {
                super("draft");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class DRAFT_FEED_ENTRY extends AICreationSceneName {
            public static final DRAFT_FEED_ENTRY INSTANCE = new DRAFT_FEED_ENTRY();
            public static final Parcelable.Creator<DRAFT_FEED_ENTRY> CREATOR = new Parcelable.Creator<DRAFT_FEED_ENTRY>() { // from class: X.1DPe
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.DRAFT_FEED_ENTRY createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.DRAFT_FEED_ENTRY.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.DRAFT_FEED_ENTRY[] newArray(int i) {
                    return new AIGC.AICreationSceneName.DRAFT_FEED_ENTRY[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public DRAFT_FEED_ENTRY() {
                super("draft_feed_entry");
            }
        }

        public static final class GENERATE_AITHEATER_VIDEO_SUCCESS_NO_DRAFT extends AICreationSceneName {
            public static final GENERATE_AITHEATER_VIDEO_SUCCESS_NO_DRAFT INSTANCE = new GENERATE_AITHEATER_VIDEO_SUCCESS_NO_DRAFT();
            public static final Parcelable.Creator<GENERATE_AITHEATER_VIDEO_SUCCESS_NO_DRAFT> CREATOR = new Parcelable.Creator<GENERATE_AITHEATER_VIDEO_SUCCESS_NO_DRAFT>() { // from class: X.0MUP
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.GENERATE_AITHEATER_VIDEO_SUCCESS_NO_DRAFT createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.GENERATE_AITHEATER_VIDEO_SUCCESS_NO_DRAFT.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.GENERATE_AITHEATER_VIDEO_SUCCESS_NO_DRAFT[] newArray(int i) {
                    return new AIGC.AICreationSceneName.GENERATE_AITHEATER_VIDEO_SUCCESS_NO_DRAFT[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public GENERATE_AITHEATER_VIDEO_SUCCESS_NO_DRAFT() {
                super("generate_aitheater_video_success_no_draft");
            }
        }

        public static final class GENERATION_FAIL extends AICreationSceneName {
            public static final GENERATION_FAIL INSTANCE = new GENERATION_FAIL();
            public static final Parcelable.Creator<GENERATION_FAIL> CREATOR = new Parcelable.Creator<GENERATION_FAIL>() { // from class: X.0Liw
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.GENERATION_FAIL createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.GENERATION_FAIL.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.GENERATION_FAIL[] newArray(int i) {
                    return new AIGC.AICreationSceneName.GENERATION_FAIL[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public GENERATION_FAIL() {
                super("generation_fail");
            }
        }

        public static final class INBOX_SUCCESS_NO_DRAFT extends AICreationSceneName {
            public static final INBOX_SUCCESS_NO_DRAFT INSTANCE = new INBOX_SUCCESS_NO_DRAFT();
            public static final Parcelable.Creator<INBOX_SUCCESS_NO_DRAFT> CREATOR = new Parcelable.Creator<INBOX_SUCCESS_NO_DRAFT>() { // from class: X.0LOk
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.INBOX_SUCCESS_NO_DRAFT createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.INBOX_SUCCESS_NO_DRAFT.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.INBOX_SUCCESS_NO_DRAFT[] newArray(int i) {
                    return new AIGC.AICreationSceneName.INBOX_SUCCESS_NO_DRAFT[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public INBOX_SUCCESS_NO_DRAFT() {
                super("inbox_success_no_draft");
            }
        }

        public static final class NO_NEED extends AICreationSceneName {
            public static final NO_NEED INSTANCE = new NO_NEED();
            public static final Parcelable.Creator<NO_NEED> CREATOR = new Parcelable.Creator<NO_NEED>() { // from class: X.0LhH
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.NO_NEED createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.NO_NEED.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.NO_NEED[] newArray(int i) {
                    return new AIGC.AICreationSceneName.NO_NEED[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public NO_NEED() {
                super("");
            }
        }

        public static final class PROACTIVE_CRT_CREATE extends AICreationSceneName {
            public static final PROACTIVE_CRT_CREATE INSTANCE = new PROACTIVE_CRT_CREATE();
            public static final Parcelable.Creator<PROACTIVE_CRT_CREATE> CREATOR = new Parcelable.Creator<PROACTIVE_CRT_CREATE>() { // from class: X.0LyC
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.PROACTIVE_CRT_CREATE createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.PROACTIVE_CRT_CREATE.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.PROACTIVE_CRT_CREATE[] newArray(int i) {
                    return new AIGC.AICreationSceneName.PROACTIVE_CRT_CREATE[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public PROACTIVE_CRT_CREATE() {
                super("proactive_crt_create");
            }
        }

        /* JADX INFO: loaded from: classes26.dex */
        public static final class PROACTIVE_CRT_POST extends AICreationSceneName {
            public static final PROACTIVE_CRT_POST INSTANCE = new PROACTIVE_CRT_POST();
            public static final Parcelable.Creator<PROACTIVE_CRT_POST> CREATOR = new Parcelable.Creator<PROACTIVE_CRT_POST>() { // from class: X.0u0L
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.PROACTIVE_CRT_POST createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.PROACTIVE_CRT_POST.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.PROACTIVE_CRT_POST[] newArray(int i) {
                    return new AIGC.AICreationSceneName.PROACTIVE_CRT_POST[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public PROACTIVE_CRT_POST() {
                super("proactive_crt_post");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class PROFILE_BANNER extends AICreationSceneName {
            public static final PROFILE_BANNER INSTANCE = new PROFILE_BANNER();
            public static final Parcelable.Creator<PROFILE_BANNER> CREATOR = new Parcelable.Creator<PROFILE_BANNER>() { // from class: X.1DPf
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.PROFILE_BANNER createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.PROFILE_BANNER.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.PROFILE_BANNER[] newArray(int i) {
                    return new AIGC.AICreationSceneName.PROFILE_BANNER[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public PROFILE_BANNER() {
                super("profile_banner");
            }
        }

        public static final class PROFILE_CAMEO_DRAFT extends AICreationSceneName {
            public static final PROFILE_CAMEO_DRAFT INSTANCE = new PROFILE_CAMEO_DRAFT();
            public static final Parcelable.Creator<PROFILE_CAMEO_DRAFT> CREATOR = new Parcelable.Creator<PROFILE_CAMEO_DRAFT>() { // from class: X.0LtL
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.PROFILE_CAMEO_DRAFT createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.PROFILE_CAMEO_DRAFT.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.PROFILE_CAMEO_DRAFT[] newArray(int i) {
                    return new AIGC.AICreationSceneName.PROFILE_CAMEO_DRAFT[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public PROFILE_CAMEO_DRAFT() {
                super("profile_cameo_draft");
            }
        }

        public static final class PROFILE_CAMEO_TAB extends AICreationSceneName {
            public static final PROFILE_CAMEO_TAB INSTANCE = new PROFILE_CAMEO_TAB();
            public static final Parcelable.Creator<PROFILE_CAMEO_TAB> CREATOR = new Parcelable.Creator<PROFILE_CAMEO_TAB>() { // from class: X.0Lhc
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.PROFILE_CAMEO_TAB createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.PROFILE_CAMEO_TAB.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.PROFILE_CAMEO_TAB[] newArray(int i) {
                    return new AIGC.AICreationSceneName.PROFILE_CAMEO_TAB[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public PROFILE_CAMEO_TAB() {
                super("profile_cameo_tab");
            }
        }

        /* JADX INFO: loaded from: classes36.dex */
        public static final class PROFILE_MANAGEMENT extends AICreationSceneName {
            public static final PROFILE_MANAGEMENT INSTANCE = new PROFILE_MANAGEMENT();
            public static final Parcelable.Creator<PROFILE_MANAGEMENT> CREATOR = new Parcelable.Creator<PROFILE_MANAGEMENT>() { // from class: X.1DPg
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.PROFILE_MANAGEMENT createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.PROFILE_MANAGEMENT.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.PROFILE_MANAGEMENT[] newArray(int i) {
                    return new AIGC.AICreationSceneName.PROFILE_MANAGEMENT[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public PROFILE_MANAGEMENT() {
                super("profile_management");
            }
        }

        public static final class PUSH_SUCCESS_NO_DRAFT extends AICreationSceneName {
            public static final PUSH_SUCCESS_NO_DRAFT INSTANCE = new PUSH_SUCCESS_NO_DRAFT();
            public static final Parcelable.Creator<PUSH_SUCCESS_NO_DRAFT> CREATOR = new Parcelable.Creator<PUSH_SUCCESS_NO_DRAFT>() { // from class: X.0LOl
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.PUSH_SUCCESS_NO_DRAFT createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.PUSH_SUCCESS_NO_DRAFT.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.PUSH_SUCCESS_NO_DRAFT[] newArray(int i) {
                    return new AIGC.AICreationSceneName.PUSH_SUCCESS_NO_DRAFT[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public PUSH_SUCCESS_NO_DRAFT() {
                super("push_success_no_draft");
            }
        }

        public static final class REMIX_FEED_POST extends AICreationSceneName {
            public static final REMIX_FEED_POST INSTANCE = new REMIX_FEED_POST();
            public static final Parcelable.Creator<REMIX_FEED_POST> CREATOR = new Parcelable.Creator<REMIX_FEED_POST>() { // from class: X.0LyD
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.REMIX_FEED_POST createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.REMIX_FEED_POST.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.REMIX_FEED_POST[] newArray(int i) {
                    return new AIGC.AICreationSceneName.REMIX_FEED_POST[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public REMIX_FEED_POST() {
                super("remix_feed_post");
            }
        }

        public static final class REMIX_FEED_STORY extends AICreationSceneName {
            public static final REMIX_FEED_STORY INSTANCE = new REMIX_FEED_STORY();
            public static final Parcelable.Creator<REMIX_FEED_STORY> CREATOR = new Parcelable.Creator<REMIX_FEED_STORY>() { // from class: X.0LyE
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.REMIX_FEED_STORY createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.REMIX_FEED_STORY.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.REMIX_FEED_STORY[] newArray(int i) {
                    return new AIGC.AICreationSceneName.REMIX_FEED_STORY[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public REMIX_FEED_STORY() {
                super("remix_feed_story");
            }
        }

        public static final class SAVE_DRAFT_CAST_AGAIN extends AICreationSceneName {
            public static final SAVE_DRAFT_CAST_AGAIN INSTANCE = new SAVE_DRAFT_CAST_AGAIN();
            public static final Parcelable.Creator<SAVE_DRAFT_CAST_AGAIN> CREATOR = new Parcelable.Creator<SAVE_DRAFT_CAST_AGAIN>() { // from class: X.0Lix
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.SAVE_DRAFT_CAST_AGAIN createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.SAVE_DRAFT_CAST_AGAIN.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.SAVE_DRAFT_CAST_AGAIN[] newArray(int i) {
                    return new AIGC.AICreationSceneName.SAVE_DRAFT_CAST_AGAIN[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public SAVE_DRAFT_CAST_AGAIN() {
                super("save_draft_cast_again");
            }
        }

        public static final class SUPPORT_REMIX_ANCHOR extends AICreationSceneName {
            public static final SUPPORT_REMIX_ANCHOR INSTANCE = new SUPPORT_REMIX_ANCHOR();
            public static final Parcelable.Creator<SUPPORT_REMIX_ANCHOR> CREATOR = new Parcelable.Creator<SUPPORT_REMIX_ANCHOR>() { // from class: X.0Lpb
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.SUPPORT_REMIX_ANCHOR createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AIGC.AICreationSceneName.SUPPORT_REMIX_ANCHOR.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.SUPPORT_REMIX_ANCHOR[] newArray(int i) {
                    return new AIGC.AICreationSceneName.SUPPORT_REMIX_ANCHOR[i];
                }
            };

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }

            public SUPPORT_REMIX_ANCHOR() {
                super("support_remix_anchor");
            }
        }

        public final int hashCode() {
            return getValue().hashCode();
        }

        public static final class Custom extends AICreationSceneName {
            public static final Parcelable.Creator<Custom> CREATOR = new Parcelable.Creator<Custom>() { // from class: X.0Lh9
                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.Custom createFromParcel(Parcel parcel) {
                    return new AIGC.AICreationSceneName.Custom(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AIGC.AICreationSceneName.Custom[] newArray(int i) {
                    return new AIGC.AICreationSceneName.Custom[i];
                }
            };
            public final String value;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Custom(value=");
                sbLIZ.append(this.value);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.value);
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.AICreationSceneName
            /* JADX INFO: renamed from: LIZ */
            public final String getValue() {
                return this.value;
            }

            @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.AICreationSceneName, com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC
            public final String getValue() {
                return this.value;
            }

            public Custom(String str) {
                super(str);
                this.value = str;
            }
        }

        @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC
        /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
        public String getValue() {
            return this.value;
        }

        public AICreationSceneName(String str) {
            this.value = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof AICreationSceneName) && Intrinsics.LJFF(getValue(), ((AICreationSceneName) obj).getValue())) {
                return true;
            }
            return false;
        }

        /* JADX INFO: loaded from: classes35.dex */
        public static final class GsonAdapter implements r<AICreationSceneName>, j<AICreationSceneName> {
            @Override // com.google.gson.r
            public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
                String value;
                AICreationSceneName aICreationSceneName = (AICreationSceneName) obj;
                if (aICreationSceneName == null || (value = aICreationSceneName.getValue()) == null) {
                    value = "";
                }
                return new q(value);
            }

            @Override // com.google.gson.j
            public final AICreationSceneName deserialize(k kVar, Type type, i iVar) {
                q qVar;
                String strLJIL = null;
                if ((kVar instanceof q) && (qVar = (q) kVar) != null && (qVar.LL instanceof String)) {
                    strLJIL = qVar.LJIL();
                }
                AICreationSceneName.Companion.getClass();
                return C549680Lh8.LIZ(strLJIL);
            }
        }
    }
}
