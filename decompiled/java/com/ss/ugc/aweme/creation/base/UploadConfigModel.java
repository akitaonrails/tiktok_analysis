package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import X.EnumC0145002l;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.UploadConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class UploadConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<UploadConfigModel> CREATOR = new Parcelable.Creator<UploadConfigModel>() { // from class: X.0mdx
        @Override // android.os.Parcelable.Creator
        public final UploadConfigModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            Integer numValueOf5;
            Integer numValueOf6;
            boolean z;
            boolean z2;
            Boolean boolValueOf;
            boolean z3;
            boolean z4;
            EnumC0145002l enumC0145002l = null;
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            } else {
                numValueOf = null;
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            } else {
                numValueOf2 = null;
            }
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            } else {
                numValueOf3 = null;
            }
            if (parcel.readInt() != 0) {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            } else {
                numValueOf4 = null;
            }
            if (parcel.readInt() != 0) {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            } else {
                numValueOf5 = null;
            }
            if (parcel.readInt() != 0) {
                numValueOf6 = Integer.valueOf(parcel.readInt());
            } else {
                numValueOf6 = null;
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf = Boolean.valueOf(z4);
            } else {
                boolValueOf = null;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                enumC0145002l = (EnumC0145002l) C08FF.LIZ(EnumC0145002l.class, parcel.readString());
            }
            return new UploadConfigModel(numValueOf, string, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, z, z2, boolValueOf, z3, enumC0145002l);
        }

        @Override // android.os.Parcelable.Creator
        public final UploadConfigModel[] newArray(int i) {
            return new UploadConfigModel[i];
        }
    };

    @C09CT("enable_bottom_switch_mode_button")
    public Boolean enableBottomSwitchModeButton;

    @C09CT("enable_bottom_view")
    public boolean enableBottomView;

    @C09CT("enable_multi_select")
    public boolean enableMultiSelect;

    @C09CT("enable_preview")
    public boolean enablePreview;

    @C09CT("max_photo_count")
    public Integer maxPhotoCount;

    @C09CT("max_total_selection_count")
    public Integer maxTotalSelectionCount;

    @C09CT("max_video_count")
    public Integer maxVideoCount;

    @C09CT("max_video_seconds")
    public Integer maxVideoSeconds;

    @C09CT("min_video_seconds")
    public Integer minVideoSeconds;

    @C09CT("tabs")
    public String tabs;

    @C09CT("vc_type")
    public Integer vcType;

    @C09CT("video_adjust_time_range_bar_style_in_preview")
    public EnumC0145002l videoAdjustTimeRangeBarStyleInPreview;

    public UploadConfigModel() {
        this(null, null, null, null, null, null, null, false, false, null, false, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Integer num = this.vcType;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.tabs);
        Integer num2 = this.minVideoSeconds;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num3 = this.maxVideoSeconds;
        if (num3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num4 = this.maxVideoCount;
        if (num4 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num5 = this.maxPhotoCount;
        if (num5 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num6 = this.maxTotalSelectionCount;
        if (num6 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.enableMultiSelect ? 1 : 0);
        parcel.writeInt(this.enablePreview ? 1 : 0);
        Boolean bool = this.enableBottomSwitchModeButton;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.enableBottomView ? 1 : 0);
        EnumC0145002l enumC0145002l = this.videoAdjustTimeRangeBarStyleInPreview;
        if (enumC0145002l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC0145002l.name());
        }
    }

    public final Boolean getEnableBottomSwitchModeButton() {
        return this.enableBottomSwitchModeButton;
    }

    public final boolean getEnableBottomView() {
        return this.enableBottomView;
    }

    public final boolean getEnableMultiSelect() {
        return this.enableMultiSelect;
    }

    public final boolean getEnablePreview() {
        return this.enablePreview;
    }

    public final Integer getMaxPhotoCount() {
        return this.maxPhotoCount;
    }

    public final Integer getMaxTotalSelectionCount() {
        return this.maxTotalSelectionCount;
    }

    public final Integer getMaxVideoCount() {
        return this.maxVideoCount;
    }

    public final Integer getMaxVideoSeconds() {
        return this.maxVideoSeconds;
    }

    public final Integer getMinVideoSeconds() {
        return this.minVideoSeconds;
    }

    public final String getTabs() {
        return this.tabs;
    }

    public final Integer getVcType() {
        return this.vcType;
    }

    public final EnumC0145002l getVideoAdjustTimeRangeBarStyleInPreview() {
        return this.videoAdjustTimeRangeBarStyleInPreview;
    }

    public final void setEnableBottomSwitchModeButton(Boolean bool) {
        this.enableBottomSwitchModeButton = bool;
    }

    public final void setEnableBottomView(boolean z) {
        this.enableBottomView = z;
    }

    public final void setEnableMultiSelect(boolean z) {
        this.enableMultiSelect = z;
    }

    public final void setEnablePreview(boolean z) {
        this.enablePreview = z;
    }

    public final void setMaxPhotoCount(Integer num) {
        this.maxPhotoCount = num;
    }

    public final void setMaxTotalSelectionCount(Integer num) {
        this.maxTotalSelectionCount = num;
    }

    public final void setMaxVideoCount(Integer num) {
        this.maxVideoCount = num;
    }

    public final void setMaxVideoSeconds(Integer num) {
        this.maxVideoSeconds = num;
    }

    public final void setMinVideoSeconds(Integer num) {
        this.minVideoSeconds = num;
    }

    public final void setTabs(String str) {
        this.tabs = str;
    }

    public final void setVcType(Integer num) {
        this.vcType = num;
    }

    public final void setVideoAdjustTimeRangeBarStyleInPreview(EnumC0145002l enumC0145002l) {
        this.videoAdjustTimeRangeBarStyleInPreview = enumC0145002l;
    }

    public UploadConfigModel(Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, boolean z, boolean z2, Boolean bool, boolean z3, EnumC0145002l enumC0145002l) {
        this.vcType = num;
        this.tabs = str;
        this.minVideoSeconds = num2;
        this.maxVideoSeconds = num3;
        this.maxVideoCount = num4;
        this.maxPhotoCount = num5;
        this.maxTotalSelectionCount = num6;
        this.enableMultiSelect = z;
        this.enablePreview = z2;
        this.enableBottomSwitchModeButton = bool;
        this.enableBottomView = z3;
        this.videoAdjustTimeRangeBarStyleInPreview = enumC0145002l;
    }
}
