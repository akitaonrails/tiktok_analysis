package com.ss.android.ugc.aweme.creative.model.common;

import X.C09CT;
import X.C2188811AlT;
import X.C555190Lq1;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MentionDataItem implements Parcelable {

    @C09CT("cameo_activate_filter")
    public final Integer cameoFilter;

    @C09CT("cameo_id")
    public final String cameoId;

    @C09CT("followers")
    public final Long followers;

    @C09CT("generating_task_Id")
    public final String generatingTaskId;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("invited")
    public final Boolean invited;

    @C09CT("is_virtual")
    public final Boolean isVirtual;

    @C09CT("name")
    public final String name;

    @C09CT("permission_result")
    public final Integer permissionResult;

    @C09CT("myself_generating_progress")
    public final Integer progress;

    @C09CT("relation_type")
    public final String relationType;

    @C09CT("uid")
    public final String uid;

    @C09CT("unique_id")
    public final String uniqueId;
    public static final C555190Lq1 Companion = new Object() { // from class: X.0Lq1
    };
    public static final Parcelable.Creator<MentionDataItem> CREATOR = new Parcelable.Creator<MentionDataItem>() { // from class: X.0J2v
        @Override // android.os.Parcelable.Creator
        public final MentionDataItem createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            boolean z2 = true;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new MentionDataItem(string, string2, string3, string4, lValueOf, string5, string6, numValueOf, boolValueOf, numValueOf2, string7, numValueOf3, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final MentionDataItem[] newArray(int i) {
            return new MentionDataItem[i];
        }
    };

    public MentionDataItem() {
        this(null, null, null, null, 0L, null, null, 1, Boolean.FALSE, null, null, null, Boolean.FALSE);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MentionDataItem(iconUrl=" + this.iconUrl + ", name=" + this.name + ", uid=" + this.uid + ", uniqueId=" + this.uniqueId + ", followers=" + this.followers + ", cameoId=" + this.cameoId + ", relationType=" + this.relationType + ", permissionResult=" + this.permissionResult + ", invited=" + this.invited + ", progress=" + this.progress + ", generatingTaskId=" + this.generatingTaskId + ", cameoFilter=" + this.cameoFilter + ", isVirtual=" + this.isVirtual + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.uid);
        parcel.writeString(this.uniqueId);
        Long l = this.followers;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.cameoId);
        parcel.writeString(this.relationType);
        Integer num = this.permissionResult;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.invited;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.progress;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.generatingTaskId);
        Integer num3 = this.cameoFilter;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Boolean bool2 = this.isVirtual;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public final int hashCode() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.cameoId);
        sbLIZ.append(this.uid);
        return C2188811AlT.LIZIZ(sbLIZ).hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MentionDataItem) {
            MentionDataItem mentionDataItem = (MentionDataItem) obj;
            if (Intrinsics.LJFF(this.cameoId, mentionDataItem.cameoId) && Intrinsics.LJFF(this.uid, mentionDataItem.uid)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static MentionDataItem LIZ(MentionDataItem mentionDataItem, String str, String str2, Integer num, Boolean bool, Integer num2, int i) {
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        String str7;
        Integer num3;
        Integer num4 = num2;
        Boolean bool2 = bool;
        Integer num5 = num;
        String str8 = str2;
        String str9 = str;
        Boolean bool3 = null;
        if ((i & 1) != 0) {
            str3 = mentionDataItem.iconUrl;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str4 = mentionDataItem.name;
        } else {
            str4 = null;
        }
        if ((i & 4) != 0) {
            str5 = mentionDataItem.uid;
        } else {
            str5 = null;
        }
        if ((i & 8) != 0) {
            str6 = mentionDataItem.uniqueId;
        } else {
            str6 = null;
        }
        if ((i & 16) != 0) {
            l = mentionDataItem.followers;
        } else {
            l = null;
        }
        if ((i & 32) != 0) {
            str9 = mentionDataItem.cameoId;
        }
        if ((i & 64) != 0) {
            str8 = mentionDataItem.relationType;
        }
        if ((i & 128) != 0) {
            num5 = mentionDataItem.permissionResult;
        }
        if ((i & 256) != 0) {
            bool2 = mentionDataItem.invited;
        }
        if ((i & 512) != 0) {
            num4 = mentionDataItem.progress;
        }
        if ((i & 1024) != 0) {
            str7 = mentionDataItem.generatingTaskId;
        } else {
            str7 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num3 = mentionDataItem.cameoFilter;
        } else {
            num3 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            bool3 = mentionDataItem.isVirtual;
        }
        mentionDataItem.getClass();
        return new MentionDataItem(str3, str4, str5, str6, l, str9, str8, num5, bool2, num4, str7, num3, bool3);
    }

    public MentionDataItem(String str, String str2, String str3, String str4, Long l, String str5, String str6, Integer num, Boolean bool, Integer num2, String str7, Integer num3, Boolean bool2) {
        this.iconUrl = str;
        this.name = str2;
        this.uid = str3;
        this.uniqueId = str4;
        this.followers = l;
        this.cameoId = str5;
        this.relationType = str6;
        this.permissionResult = num;
        this.invited = bool;
        this.progress = num2;
        this.generatingTaskId = str7;
        this.cameoFilter = num3;
        this.isVirtual = bool2;
    }
}
