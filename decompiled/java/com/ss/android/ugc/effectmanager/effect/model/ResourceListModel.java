package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class ResourceListModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<ResourceListModel> CREATOR = new Creator();
    public String icon_uri;
    public String params;
    public List<? extends ResourceListBean> resource_list;
    public List<String> url_prefix;

    public static final class Creator implements Parcelable.Creator<ResourceListModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResourceListModel createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(ResourceListModel.class.getClassLoader()));
            }
            return new ResourceListModel(arrayList, parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResourceListModel[] newArray(int i) {
            return new ResourceListModel[i];
        }
    }

    public ResourceListModel() {
        this(new ArrayList(), new ArrayList(), null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List<? extends ResourceListBean> list = this.resource_list;
        parcel.writeInt(list.size());
        Iterator<? extends ResourceListBean> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeStringList(this.url_prefix);
        parcel.writeString(this.icon_uri);
        parcel.writeString(this.params);
    }

    public static class ResourceListBean implements Serializable, Parcelable {
        public static final Parcelable.Creator<ResourceListBean> CREATOR = new Creator();
        public String name;
        public String resource_uri;
        public String value;

        public static final class Creator implements Parcelable.Creator<ResourceListBean> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResourceListBean createFromParcel(Parcel parcel) {
                return new ResourceListBean(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResourceListBean[] newArray(int i) {
                return new ResourceListBean[i];
            }
        }

        public ResourceListBean() {
            this(null, null, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.value);
            parcel.writeString(this.resource_uri);
        }

        public final String getName() {
            return this.name;
        }

        public final String getResourceUrl() {
            return this.resource_uri;
        }

        public final String getResource_uri() {
            return this.resource_uri;
        }

        public final String getValue() {
            return this.value;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setResourceUrl(String str) {
            this.resource_uri = str;
        }

        public final void setResource_uri(String str) {
            this.resource_uri = str;
        }

        public final void setValue(String str) {
            this.value = str;
        }

        public ResourceListBean(String str, String str2, String str3) {
            this.name = str;
            this.value = str2;
            this.resource_uri = str3;
        }
    }

    public final String getIconUri() {
        return this.icon_uri;
    }

    public final String getIcon_uri() {
        return this.icon_uri;
    }

    public final String getParam() {
        return this.params;
    }

    public final String getParams() {
        return this.params;
    }

    public final List<ResourceListBean> getResourceList() {
        return this.resource_list;
    }

    public final List<ResourceListBean> getResource_list() {
        return this.resource_list;
    }

    public final List<String> getUrlPrefix() {
        return this.url_prefix;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final void setIconUri(String str) {
        this.icon_uri = str;
    }

    public final void setIcon_uri(String str) {
        this.icon_uri = str;
    }

    public final void setParam(String str) {
        this.params = str;
    }

    public final void setParams(String str) {
        this.params = str;
    }

    public final void setResourceList(List<? extends ResourceListBean> list) {
        this.resource_list = list;
    }

    public final void setResource_list(List<? extends ResourceListBean> list) {
        this.resource_list = list;
    }

    public final void setUrlPrefix(List<String> list) {
        this.url_prefix = list;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public ResourceListModel(List<? extends ResourceListBean> list, List<String> list2, String str, String str2) {
        this.resource_list = list;
        this.url_prefix = list2;
        this.icon_uri = str;
        this.params = str2;
    }
}
