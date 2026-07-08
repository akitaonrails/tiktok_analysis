package com.ss.android.ugc.aweme.filter;

import X.C09CT;
import X.C1698130uI7;
import X.C2188811AlT;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes26.dex */
public class FilterBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<FilterBean> CREATOR = new C1698130uI7(1);

    @C09CT("category_extra")
    public FilterCategoryExtra categoryExtra;

    @C09CT("filter_category")
    public String categoryKey;
    public String compareKey;

    @C09CT("enter_method")
    public transient String enterMethod;
    public transient boolean executeSetFilterFolder;

    @C09CT("extra")
    public String extra;
    public transient float internalDefaultIntensity;
    public transient boolean isSaveFilter2BeautySequence;

    @C09CT("en_name")
    public String mEnName;

    @C09CT("filter_file_path")
    public String mFilterFilePath;

    @C09CT("filter_folder")
    public String mFilterFolder;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String mId;
    public transient int mIndex;

    @C09CT("name")
    public String mName;

    @C09CT("resource")
    public transient ToolsUrlModel mResource;
    public transient String mTagUpdateAt;
    public transient String mThumbnailFilePath;
    public transient Uri mThumbnailFileUri;

    @C09CT("resource_id")
    public String resId;
    public transient List<String> tags;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return Objects.hash(this.mId, getCompareKey());
    }

    public void resetCompareKey() {
        this.compareKey = null;
    }

    public String getCategoryKey() {
        String str = this.categoryKey;
        return str == null ? "" : str;
    }

    public List<String> getTags() {
        List<String> list = this.tags;
        return (list == null || list.isEmpty()) ? new ArrayList() : this.tags;
    }

    public String toString() {
        ToolsUrlModel toolsUrlModel = this.mResource;
        String string = toolsUrlModel != null ? toolsUrlModel.toString() : "";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilterBean{mId=");
        sbLIZ.append(this.mId);
        sbLIZ.append(", resId:");
        sbLIZ.append(this.resId);
        sbLIZ.append(", mName='");
        sbLIZ.append(this.mName);
        sbLIZ.append('\'');
        sbLIZ.append(", mEnName='");
        sbLIZ.append(this.mEnName);
        sbLIZ.append('\'');
        sbLIZ.append(", mCategory");
        sbLIZ.append(this.categoryKey);
        sbLIZ.append('\'');
        sbLIZ.append(", mResource=");
        sbLIZ.append(string);
        sbLIZ.append(", mIndex=");
        sbLIZ.append(this.mIndex);
        sbLIZ.append(", mThumbnailFileUri=");
        sbLIZ.append(this.mThumbnailFileUri);
        sbLIZ.append(", mThumbnailFilePath='");
        sbLIZ.append(this.mThumbnailFilePath);
        sbLIZ.append('\'');
        sbLIZ.append(", mFilterFilePath='");
        sbLIZ.append(this.mFilterFilePath);
        sbLIZ.append('\'');
        sbLIZ.append(", mFilterFolder='");
        sbLIZ.append(this.mFilterFolder);
        sbLIZ.append('\'');
        sbLIZ.append(", tags=");
        sbLIZ.append(this.tags);
        sbLIZ.append(", mTagUpdateAt=");
        sbLIZ.append(this.mTagUpdateAt);
        sbLIZ.append(", internalDefaultIntensity=");
        sbLIZ.append(this.internalDefaultIntensity);
        sbLIZ.append(", executeSetFilterFolder=");
        sbLIZ.append(this.executeSetFilterFolder);
        sbLIZ.append(", isSaveFilter2BeautySequence=");
        sbLIZ.append(this.isSaveFilter2BeautySequence);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", categoryExtra");
        sbLIZ.append(this.categoryExtra);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FilterBean() {
        this.mId = "-1";
        this.mName = "";
        this.mTagUpdateAt = "";
        this.categoryKey = "";
        this.enterMethod = "";
        this.internalDefaultIntensity = -1.0f;
        this.isSaveFilter2BeautySequence = true;
        this.resId = "";
        this.extra = "";
        this.categoryExtra = new FilterCategoryExtra();
    }

    public FilterCategoryExtra getCategoryExtra() {
        return this.categoryExtra;
    }

    public String getCompareKey() {
        return this.compareKey;
    }

    public String getEnName() {
        return this.mEnName;
    }

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public boolean getExecuteSetFilterFolder() {
        return this.executeSetFilterFolder;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getFilterFilePath() {
        return this.mFilterFilePath;
    }

    public String getFilterFolder() {
        return this.mFilterFolder;
    }

    public String getId() {
        return this.mId;
    }

    public String getName() {
        return this.mName;
    }

    public String getResId() {
        return this.resId;
    }

    public ToolsUrlModel getResource() {
        return this.mResource;
    }

    public String getTagUpdateAt() {
        return this.mTagUpdateAt;
    }

    public String getThumbnailFilePath() {
        return this.mThumbnailFilePath;
    }

    public Uri getThumbnailFileUri() {
        return this.mThumbnailFileUri;
    }

    public boolean isSaveFilter2BeautySequence() {
        return this.isSaveFilter2BeautySequence;
    }

    public FilterBean(Parcel parcel) {
        this.mId = "-1";
        this.mName = "";
        this.mTagUpdateAt = "";
        this.categoryKey = "";
        this.enterMethod = "";
        this.internalDefaultIntensity = -1.0f;
        this.isSaveFilter2BeautySequence = true;
        this.resId = "";
        this.extra = "";
        this.categoryExtra = new FilterCategoryExtra();
        this.mId = parcel.readString();
        this.mName = parcel.readString();
        this.mEnName = parcel.readString();
        this.mFilterFilePath = parcel.readString();
        this.mFilterFolder = parcel.readString();
        this.resId = parcel.readString();
        this.extra = parcel.readString();
        this.tags = parcel.createStringArrayList();
        this.categoryKey = parcel.readString();
        this.mResource = (ToolsUrlModel) parcel.readParcelable(ToolsUrlModel.class.getClassLoader());
        this.mThumbnailFileUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.categoryExtra = (FilterCategoryExtra) parcel.readSerializable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterBean)) {
            return false;
        }
        FilterBean filterBean = (FilterBean) obj;
        if (Objects.equals(this.mId, filterBean.mId) && TextUtils.equals(this.categoryKey, filterBean.categoryKey) && TextUtils.equals(getCompareKey(), filterBean.getCompareKey())) {
            return true;
        }
        return false;
    }

    public void setCategoryExtra(FilterCategoryExtra filterCategoryExtra) {
        this.categoryExtra = filterCategoryExtra;
    }

    public void setCategoryKey(String str) {
        this.categoryKey = str;
    }

    public void setCompareKey(String str) {
        this.compareKey = str;
    }

    public void setEnName(String str) {
        this.mEnName = str;
    }

    public void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public void setExecuteSetFilterFolder(boolean z) {
        this.executeSetFilterFolder = z;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFilterFilePath(String str) {
        this.mFilterFilePath = str;
    }

    public void setFilterFolder(String str) {
        this.mFilterFolder = str;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setResId(String str) {
        this.resId = str;
    }

    public void setResource(ToolsUrlModel toolsUrlModel) {
        this.mResource = toolsUrlModel;
    }

    public void setSaveFilter2BeautySequence(boolean z) {
        this.isSaveFilter2BeautySequence = z;
    }

    public void setTagUpdateAt(String str) {
        this.mTagUpdateAt = str;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setThumbnailFilePath(String str) {
        this.mThumbnailFilePath = str;
    }

    public void setThumbnailFileUri(Uri uri) {
        this.mThumbnailFileUri = uri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mName);
        parcel.writeString(this.mEnName);
        parcel.writeString(this.mFilterFilePath);
        parcel.writeString(this.mFilterFolder);
        parcel.writeString(this.resId);
        parcel.writeString(this.extra);
        parcel.writeStringList(this.tags);
        parcel.writeString(this.categoryKey);
        parcel.writeParcelable(this.mResource, i);
        parcel.writeParcelable(this.mThumbnailFileUri, i);
        parcel.writeSerializable(this.categoryExtra);
    }
}
