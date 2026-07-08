package com.ss.android.ugc.aweme.sticker.image;

import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.sticker.image.TemplateCover;
import com.ss.android.ugc.aweme.sticker.image.TemplateItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class TemplateItem implements Parcelable {

    @C09CT("app_id")
    public Integer appID;
    public String categorieName;

    @C09CT("cover")
    public TemplateCover cover;

    @C09CT("desc")
    public String desc;

    @C09CT("extra")
    public String extra;

    @C09CT("height")
    public Integer height;
    public boolean isVertical;

    @C09CT("md5")
    public String md5;

    @C09CT("media_id")
    public Long mediaId;

    @C09CT("provider")
    public Integer provider;

    @C09CT("region_key")
    public String regionKey;

    @C09CT("tags")
    public List<String> tags;

    @C09CT("template_id")
    public Long templateID;

    @C09CT("TemplateUri")
    public String templateUri;

    @C09CT("title")
    public String title;

    @C09CT("type")
    public Integer type;

    @C09CT("width")
    public Integer width;
    public static final Parcelable.Creator<TemplateItem> CREATOR = new Parcelable.Creator<TemplateItem>() { // from class: X.0wRU
        @Override // android.os.Parcelable.Creator
        public final TemplateItem createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer numValueOf;
            Integer numValueOf2;
            Long lValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            TemplateCover templateCoverCreateFromParcel;
            Integer numValueOf5 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                templateCoverCreateFromParcel = null;
            } else {
                templateCoverCreateFromParcel = TemplateCover.CREATOR.createFromParcel(parcel);
            }
            TemplateCover templateCover = templateCoverCreateFromParcel;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            return new TemplateItem(lValueOf, numValueOf, string, numValueOf2, lValueOf2, string2, string3, numValueOf3, numValueOf4, string4, string5, templateCover, arrayListCreateStringArrayList, string6, numValueOf5);
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateItem[] newArray(int i) {
            return new TemplateItem[i];
        }
    };
    public static final int $stable = 8;

    public TemplateItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.templateID;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.appID;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.regionKey);
        Integer num2 = this.type;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Long l2 = this.mediaId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.title);
        parcel.writeString(this.desc);
        Integer num3 = this.width;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.height;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.md5);
        parcel.writeString(this.templateUri);
        TemplateCover templateCover = this.cover;
        if (templateCover == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateCover.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.tags);
        parcel.writeString(this.extra);
        Integer num5 = this.provider;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
    }

    public TemplateItem(Long l, Integer num, String str, Integer num2, Long l2, String str2, String str3, Integer num3, Integer num4, String str4, String str5, TemplateCover templateCover, List<String> list, String str6, Integer num5) {
        this.templateID = l;
        this.appID = num;
        this.regionKey = str;
        this.type = num2;
        this.mediaId = l2;
        this.title = str2;
        this.desc = str3;
        this.width = num3;
        this.height = num4;
        this.md5 = str4;
        this.templateUri = str5;
        this.cover = templateCover;
        this.tags = list;
        this.extra = str6;
        this.provider = num5;
        this.categorieName = "";
        this.isVertical = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TemplateItem(Long l, Integer num, String str, Integer num2, Long l2, String str2, String str3, Integer num3, Integer num4, String str4, String str5, TemplateCover templateCover, List list, String str6, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? l : l, (i & 2) != 0 ? -1 : num, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? -1 : num2, (i & 16) == 0 ? l2 : -1L, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? -1 : num3, (i & 256) != 0 ? -1 : num4, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? "" : str5, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : templateCover, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list, (i & 8192) == 0 ? str6 : "", (i & 16384) != 0 ? null : num5);
    }
}
