package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.RecordBeautyConfigModel;
import com.ss.ugc.aweme.creation.base.RecordConfigModel;
import com.ss.ugc.aweme.creation.base.RecordFilterConfigModel;
import com.ss.ugc.aweme.creation.base.RecordFlashConfigModel;
import com.ss.ugc.aweme.creation.base.RecordFlowConfigModel;
import com.ss.ugc.aweme.creation.base.RecordSwapConfigModel;
import com.ss.ugc.aweme.creation.base.RecordUIConfigModel;
import com.ss.ugc.aweme.creation.base.UploadConfigModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class RecordConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordConfigModel> CREATOR = new Parcelable.Creator<RecordConfigModel>() { // from class: X.0wQj
        @Override // android.os.Parcelable.Creator
        public final RecordConfigModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Integer numValueOf;
            Boolean boolValueOf2;
            boolean z;
            boolean z2;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (i != 0) {
                arrayList.add(parcel.readParcelable(RecordConfigModel.class.getClassLoader()));
                i--;
            }
            boolean z3 = true;
            Boolean boolValueOf3 = null;
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf = Boolean.valueOf(z2);
            } else {
                boolValueOf = null;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            } else {
                numValueOf = null;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf2 = Boolean.valueOf(z);
            } else {
                boolValueOf2 = null;
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            return new RecordConfigModel(arrayList, boolValueOf, arrayListCreateStringArrayList, numValueOf, boolValueOf2, string, boolValueOf3, (UploadConfigModel) parcel.readParcelable(RecordConfigModel.class.getClassLoader()), (RecordFilterConfigModel) parcel.readParcelable(RecordConfigModel.class.getClassLoader()), (RecordBeautyConfigModel) parcel.readParcelable(RecordConfigModel.class.getClassLoader()), (RecordSwapConfigModel) parcel.readParcelable(RecordConfigModel.class.getClassLoader()), (RecordFlashConfigModel) parcel.readParcelable(RecordConfigModel.class.getClassLoader()), (RecordUIConfigModel) parcel.readParcelable(RecordConfigModel.class.getClassLoader()), (RecordFlowConfigModel) parcel.readParcelable(RecordConfigModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RecordConfigModel[] newArray(int i) {
            return new RecordConfigModel[i];
        }
    };

    @C09CT("beauty")
    public RecordBeautyConfigModel beauty;

    @C09CT("enable_no_internet_toast")
    public Boolean enableNoInternetToast;

    @C09CT("filter")
    public RecordFilterConfigModel filter;

    @C09CT("flash")
    public RecordFlashConfigModel flash;

    @C09CT("flow_config")
    public RecordFlowConfigModel flowConfig;

    @C09CT("hide_complete_button")
    public Boolean hideCompleteButton;

    @C09CT("pinned_guide_text_key")
    public String pinnedGuideTextKey;

    @C09CT("show_components")
    public List<String> showComponents;

    @C09CT("single_segment_limited")
    public Boolean singleSegmentLimited;

    @C09CT("swap")
    public RecordSwapConfigModel swap;

    @C09CT("tabs")
    public List<RecordTabConfig> tabs;

    @C09CT("ui_config")
    public RecordUIConfigModel uiConfig;

    @C09CT("upload")
    public UploadConfigModel upload;

    @C09CT("video_min_seconds")
    public Integer videoMinSeconds;

    public RecordConfigModel() {
        this(new ArrayList(), null, new ArrayList(), null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List<RecordTabConfig> list = this.tabs;
        parcel.writeInt(list.size());
        Iterator<RecordTabConfig> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        Boolean bool = this.singleSegmentLimited;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeStringList(this.showComponents);
        Integer num = this.videoMinSeconds;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Boolean bool2 = this.enableNoInternetToast;
        if (bool2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.pinnedGuideTextKey);
        Boolean bool3 = this.hideCompleteButton;
        if (bool3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.upload, i);
        parcel.writeParcelable(this.filter, i);
        parcel.writeParcelable(this.beauty, i);
        parcel.writeParcelable(this.swap, i);
        parcel.writeParcelable(this.flash, i);
        parcel.writeParcelable(this.uiConfig, i);
        parcel.writeParcelable(this.flowConfig, i);
    }

    public final RecordBeautyConfigModel getBeauty() {
        return this.beauty;
    }

    public final Boolean getEnableNoInternetToast() {
        return this.enableNoInternetToast;
    }

    public final RecordFilterConfigModel getFilter() {
        return this.filter;
    }

    public final RecordFlashConfigModel getFlash() {
        return this.flash;
    }

    public final RecordFlowConfigModel getFlowConfig() {
        return this.flowConfig;
    }

    public final Boolean getHideCompleteButton() {
        return this.hideCompleteButton;
    }

    public final String getPinnedGuideTextKey() {
        return this.pinnedGuideTextKey;
    }

    public final List<String> getShowComponents() {
        return this.showComponents;
    }

    public final Boolean getSingleSegmentLimited() {
        return this.singleSegmentLimited;
    }

    public final RecordSwapConfigModel getSwap() {
        return this.swap;
    }

    public final List<RecordTabConfig> getTabs() {
        return this.tabs;
    }

    public final RecordUIConfigModel getUiConfig() {
        return this.uiConfig;
    }

    public final UploadConfigModel getUpload() {
        return this.upload;
    }

    public final Integer getVideoMinSeconds() {
        return this.videoMinSeconds;
    }

    public final void setBeauty(RecordBeautyConfigModel recordBeautyConfigModel) {
        this.beauty = recordBeautyConfigModel;
    }

    public final void setEnableNoInternetToast(Boolean bool) {
        this.enableNoInternetToast = bool;
    }

    public final void setFilter(RecordFilterConfigModel recordFilterConfigModel) {
        this.filter = recordFilterConfigModel;
    }

    public final void setFlash(RecordFlashConfigModel recordFlashConfigModel) {
        this.flash = recordFlashConfigModel;
    }

    public final void setFlowConfig(RecordFlowConfigModel recordFlowConfigModel) {
        this.flowConfig = recordFlowConfigModel;
    }

    public final void setHideCompleteButton(Boolean bool) {
        this.hideCompleteButton = bool;
    }

    public final void setPinnedGuideTextKey(String str) {
        this.pinnedGuideTextKey = str;
    }

    public final void setShowComponents(List<String> list) {
        this.showComponents = list;
    }

    public final void setSingleSegmentLimited(Boolean bool) {
        this.singleSegmentLimited = bool;
    }

    public final void setSwap(RecordSwapConfigModel recordSwapConfigModel) {
        this.swap = recordSwapConfigModel;
    }

    public final void setTabs(List<RecordTabConfig> list) {
        this.tabs = list;
    }

    public final void setUiConfig(RecordUIConfigModel recordUIConfigModel) {
        this.uiConfig = recordUIConfigModel;
    }

    public final void setUpload(UploadConfigModel uploadConfigModel) {
        this.upload = uploadConfigModel;
    }

    public final void setVideoMinSeconds(Integer num) {
        this.videoMinSeconds = num;
    }

    public RecordConfigModel(List<RecordTabConfig> list, Boolean bool, List<String> list2, Integer num, Boolean bool2, String str, Boolean bool3, UploadConfigModel uploadConfigModel, RecordFilterConfigModel recordFilterConfigModel, RecordBeautyConfigModel recordBeautyConfigModel, RecordSwapConfigModel recordSwapConfigModel, RecordFlashConfigModel recordFlashConfigModel, RecordUIConfigModel recordUIConfigModel, RecordFlowConfigModel recordFlowConfigModel) {
        this.tabs = list;
        this.singleSegmentLimited = bool;
        this.showComponents = list2;
        this.videoMinSeconds = num;
        this.enableNoInternetToast = bool2;
        this.pinnedGuideTextKey = str;
        this.hideCompleteButton = bool3;
        this.upload = uploadConfigModel;
        this.filter = recordFilterConfigModel;
        this.beauty = recordBeautyConfigModel;
        this.swap = recordSwapConfigModel;
        this.flash = recordFlashConfigModel;
        this.uiConfig = recordUIConfigModel;
        this.flowConfig = recordFlowConfigModel;
    }
}
