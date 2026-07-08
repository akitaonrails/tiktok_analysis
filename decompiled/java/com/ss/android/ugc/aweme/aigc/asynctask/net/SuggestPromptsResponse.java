package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.asynctask.net.SuggestPromptsResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class SuggestPromptsResponse implements Parcelable {

    @C09CT("default_prompt")
    public final DefaultPrompt defaultPrompt;

    @C09CT("prompts")
    public final List<PromptItem> prompts;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;
    public static final Parcelable.Creator<SuggestPromptsResponse> CREATOR = new Parcelable.Creator<SuggestPromptsResponse>() { // from class: X.0LX4
        @Override // android.os.Parcelable.Creator
        public final SuggestPromptsResponse createFromParcel(Parcel parcel) {
            SuggestPromptsResponse.DefaultPrompt defaultPromptCreateFromParcel;
            ArrayList arrayList;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                defaultPromptCreateFromParcel = null;
            } else {
                defaultPromptCreateFromParcel = SuggestPromptsResponse.DefaultPrompt.CREATOR.createFromParcel(parcel);
            }
            SuggestPromptsResponse.DefaultPrompt defaultPrompt = defaultPromptCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SuggestPromptsResponse.PromptItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new SuggestPromptsResponse(defaultPrompt, arrayList, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestPromptsResponse[] newArray(int i) {
            return new SuggestPromptsResponse[i];
        }
    };
    public static final int $stable = 8;

    public SuggestPromptsResponse() {
        this(null, null, null, null);
    }

    public final SuggestPromptsResponse copy(DefaultPrompt defaultPrompt, List<PromptItem> list, Integer num, String str) {
        return new SuggestPromptsResponse(defaultPrompt, list, num, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestPromptsResponse)) {
            return false;
        }
        SuggestPromptsResponse suggestPromptsResponse = (SuggestPromptsResponse) obj;
        return Intrinsics.LJFF(this.defaultPrompt, suggestPromptsResponse.defaultPrompt) && Intrinsics.LJFF(this.prompts, suggestPromptsResponse.prompts) && Intrinsics.LJFF(this.statusCode, suggestPromptsResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, suggestPromptsResponse.statusMsg);
    }

    public int hashCode() {
        DefaultPrompt defaultPrompt = this.defaultPrompt;
        int iHashCode = (defaultPrompt == null ? 0 : defaultPrompt.hashCode()) * 31;
        List<PromptItem> list = this.prompts;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.statusMsg;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestPromptsResponse(defaultPrompt=");
        sbLIZ.append(this.defaultPrompt);
        sbLIZ.append(", prompts=");
        sbLIZ.append(this.prompts);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DefaultPrompt defaultPrompt = this.defaultPrompt;
        if (defaultPrompt == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            defaultPrompt.writeToParcel(parcel, i);
        }
        List<PromptItem> list = this.prompts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PromptItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.statusCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.statusMsg);
    }

    public static final class DefaultPrompt implements Parcelable {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final Integer id;

        @C09CT("text")
        public final String text;

        @C09CT("title")
        public final String title;
        public static final Parcelable.Creator<DefaultPrompt> CREATOR = new Parcelable.Creator<DefaultPrompt>() { // from class: X.0LX6
            @Override // android.os.Parcelable.Creator
            public final SuggestPromptsResponse.DefaultPrompt createFromParcel(Parcel parcel) {
                Integer numValueOf;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new SuggestPromptsResponse.DefaultPrompt(numValueOf, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuggestPromptsResponse.DefaultPrompt[] newArray(int i) {
                return new SuggestPromptsResponse.DefaultPrompt[i];
            }
        };
        public static final int $stable = 8;

        public DefaultPrompt() {
            this(null, null, null);
        }

        public final DefaultPrompt copy(Integer num, String str, String str2) {
            return new DefaultPrompt(num, str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DefaultPrompt)) {
                return false;
            }
            DefaultPrompt defaultPrompt = (DefaultPrompt) obj;
            return Intrinsics.LJFF(this.id, defaultPrompt.id) && Intrinsics.LJFF(this.text, defaultPrompt.text) && Intrinsics.LJFF(this.title, defaultPrompt.title);
        }

        public int hashCode() {
            Integer num = this.id;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.text;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DefaultPrompt(id=");
            sbLIZ.append(this.id);
            sbLIZ.append(", text=");
            sbLIZ.append(this.text);
            sbLIZ.append(", title=");
            sbLIZ.append(this.title);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            Integer num = this.id;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.text);
            parcel.writeString(this.title);
        }

        public final Integer getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public DefaultPrompt(Integer num, String str, String str2) {
            this.id = num;
            this.text = str;
            this.title = str2;
        }
    }

    public static final class PromptItem implements Parcelable {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final Integer id;

        @C09CT("text")
        public final String text;

        @C09CT("title")
        public final String title;
        public static final Parcelable.Creator<PromptItem> CREATOR = new Parcelable.Creator<PromptItem>() { // from class: X.0LX7
            @Override // android.os.Parcelable.Creator
            public final SuggestPromptsResponse.PromptItem createFromParcel(Parcel parcel) {
                Integer numValueOf;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new SuggestPromptsResponse.PromptItem(numValueOf, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuggestPromptsResponse.PromptItem[] newArray(int i) {
                return new SuggestPromptsResponse.PromptItem[i];
            }
        };
        public static final int $stable = 8;

        public PromptItem() {
            this(null, null, null);
        }

        public final PromptItem copy(Integer num, String str, String str2) {
            return new PromptItem(num, str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromptItem)) {
                return false;
            }
            PromptItem promptItem = (PromptItem) obj;
            return Intrinsics.LJFF(this.id, promptItem.id) && Intrinsics.LJFF(this.text, promptItem.text) && Intrinsics.LJFF(this.title, promptItem.title);
        }

        public int hashCode() {
            Integer num = this.id;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.text;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PromptItem(id=");
            sbLIZ.append(this.id);
            sbLIZ.append(", text=");
            sbLIZ.append(this.text);
            sbLIZ.append(", title=");
            sbLIZ.append(this.title);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            Integer num = this.id;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.text);
            parcel.writeString(this.title);
        }

        public final Integer getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public PromptItem(Integer num, String str, String str2) {
            this.id = num;
            this.text = str;
            this.title = str2;
        }
    }

    public final DefaultPrompt getDefaultPrompt() {
        return this.defaultPrompt;
    }

    public final List<PromptItem> getPrompts() {
        return this.prompts;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public SuggestPromptsResponse(DefaultPrompt defaultPrompt, List<PromptItem> list, Integer num, String str) {
        this.defaultPrompt = defaultPrompt;
        this.prompts = list;
        this.statusCode = num;
        this.statusMsg = str;
    }
}
