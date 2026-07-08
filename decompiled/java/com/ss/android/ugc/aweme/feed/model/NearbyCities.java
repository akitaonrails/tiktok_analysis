package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public class NearbyCities implements Parcelable {
    public static final Parcelable.Creator<NearbyCities> CREATOR = new Parcelable.Creator<NearbyCities>() { // from class: com.ss.android.ugc.aweme.feed.model.NearbyCities.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NearbyCities createFromParcel(Parcel parcel) {
            return new NearbyCities(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NearbyCities[] newArray(int i) {
            return new NearbyCities[i];
        }
    };
    public List<CityBean> all;
    public CityBean current;
    public List<CityBean> hot;
    public List<CityBean> old;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static class CityBean implements Comparable<CityBean>, Parcelable {
        public static final Parcelable.Creator<CityBean> CREATOR = new Parcelable.Creator<CityBean>() { // from class: com.ss.android.ugc.aweme.feed.model.NearbyCities.CityBean.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CityBean createFromParcel(Parcel parcel) {
                return new CityBean(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CityBean[] newArray(int i) {
                return new CityBean[i];
            }
        };

        @C09CT("ad_code")
        public String adCode;

        @C09CT("cn_pinyin")
        public String cnPinyin;
        public String code;

        @C09CT("code_local")
        public String codeLocal;

        @C09CT("country")
        public String country;

        @C09CT("country_code")
        public String countryCode;

        @C09CT("current_position_name")
        public String currentPositionName;

        @C09CT("districts")
        public List<CityBean> districts;
        public String en;
        public boolean isL3;
        public String l2Name = "";
        public String name;

        @C09CT("name_en")
        public String nameEn;

        @C09CT("nearby_label_name")
        public String nearbyLabelName;

        @C09CT("nearby_tab_name")
        public String nearbyTabName;

        @C09CT("show_name")
        public String showName;

        @C09CT("show_type")
        public int showType;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public CityBean() {
        }

        public String getAdCode() {
            return this.adCode;
        }

        public String getCnPinyin() {
            return this.cnPinyin;
        }

        public String getCode() {
            return this.code;
        }

        public String getEn() {
            return this.en;
        }

        public String getName() {
            return this.name;
        }

        public CityBean(Parcel parcel) {
            this.name = parcel.readString();
            this.code = parcel.readString();
            this.en = parcel.readString();
        }

        @Override // java.lang.Comparable
        public int compareTo(CityBean cityBean) {
            boolean z = this.isL3;
            if (z && !cityBean.isL3) {
                return 1;
            }
            if ((!z && cityBean.isL3) || TextUtils.isEmpty(this.cnPinyin)) {
                return -1;
            }
            if (TextUtils.isEmpty(cityBean.cnPinyin)) {
                return 1;
            }
            return this.cnPinyin.compareTo(cityBean.cnPinyin);
        }

        public void setCnPinyin(String str) {
            this.cnPinyin = str;
        }

        public void setCode(String str) {
            this.code = str;
        }

        public void setEn(String str) {
            this.en = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.code);
            parcel.writeString(this.en);
        }
    }

    public NearbyCities() {
    }

    public List<CityBean> getAll() {
        return this.all;
    }

    public CityBean getCurrent() {
        return this.current;
    }

    public List<CityBean> getHot() {
        return this.hot;
    }

    public List<CityBean> getOld() {
        return this.old;
    }

    public NearbyCities(Parcel parcel) {
        this.current = (CityBean) parcel.readParcelable(CityBean.class.getClassLoader());
        Parcelable.Creator<CityBean> creator = CityBean.CREATOR;
        this.all = parcel.createTypedArrayList(creator);
        this.hot = parcel.createTypedArrayList(creator);
        this.old = parcel.createTypedArrayList(creator);
    }

    public void setAll(List<CityBean> list) {
        this.all = list;
    }

    public void setCurrent(CityBean cityBean) {
        this.current = cityBean;
    }

    public void setHot(List<CityBean> list) {
        this.hot = list;
    }

    public void setOld(List<CityBean> list) {
        this.old = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.current, i);
        parcel.writeTypedList(this.all);
        parcel.writeTypedList(this.hot);
        parcel.writeTypedList(this.old);
    }
}
