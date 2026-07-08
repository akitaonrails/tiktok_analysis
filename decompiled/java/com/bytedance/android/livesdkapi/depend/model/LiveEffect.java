package com.bytedance.android.livesdkapi.depend.model;

import X.C09CT;
import X.C0U7B;
import X.C0U7E;
import X.C0UIP;
import X.C13BV;
import X.C2188811AlT;
import X.InterfaceC767600U9e;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes13.dex */
public abstract class LiveEffect implements InterfaceC767600U9e, C0UIP, C0U7B {
    public static final UrlModel LIZLLL = new UrlModel();
    public static final HashMap<String, UrlModel> LJ;
    public String LIZ = "";
    public long LIZIZ = -1;
    public Effect LIZJ;

    public static final class AudioGraphBean implements Parcelable, Serializable {
        public static final Parcelable.Creator<AudioGraphBean> CREATOR = new Parcelable.Creator<AudioGraphBean>() { // from class: X.0UGJ
            @Override // android.os.Parcelable.Creator
            public final LiveEffect.AudioGraphBean createFromParcel(Parcel parcel) {
                boolean z;
                Boolean boolValueOf;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
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
                return new LiveEffect.AudioGraphBean(arrayListCreateStringArrayList, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final LiveEffect.AudioGraphBean[] newArray(int i) {
                return new LiveEffect.AudioGraphBean[i];
            }
        };

        @C09CT("sources")
        public ArrayList<String> sources;

        @C09CT("use_output")
        public Boolean useOutput;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            ?? BooleanValue;
            parcel.writeStringList(this.sources);
            Boolean bool = this.useOutput;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                parcel.writeInt(1);
                BooleanValue = bool.booleanValue();
            }
            parcel.writeInt(BooleanValue);
        }

        public AudioGraphBean() {
            this(new ArrayList(), Boolean.FALSE);
        }

        public final ArrayList<String> getSources() {
            return this.sources;
        }

        public final Boolean getUseOutput() {
            return this.useOutput;
        }

        public final void setSources(ArrayList<String> arrayList) {
            this.sources = arrayList;
        }

        public final void setUseOutput(Boolean bool) {
            this.useOutput = bool;
        }

        public AudioGraphBean(ArrayList<String> arrayList, Boolean bool) {
            this.sources = arrayList;
            this.useOutput = bool;
        }
    }

    public static final class CommerceExtra implements Parcelable, Serializable {
        public static final Parcelable.Creator<CommerceExtra> CREATOR = new Parcelable.Creator<CommerceExtra>() { // from class: X.0UDK
            @Override // android.os.Parcelable.Creator
            public final LiveEffect.CommerceExtra createFromParcel(Parcel parcel) {
                return new LiveEffect.CommerceExtra(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LiveEffect.CommerceExtra[] newArray(int i) {
                return new LiveEffect.CommerceExtra[i];
            }
        };

        @C09CT("default_click_url")
        public String defaultClickUrl;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.defaultClickUrl);
        }

        public CommerceExtra() {
            this("");
        }

        public final String getDefaultClickUrl() {
            return this.defaultClickUrl;
        }

        public CommerceExtra(String str) {
            this.defaultClickUrl = str;
        }

        public final void setDefaultClickUrl(String str) {
            this.defaultClickUrl = str;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class LynxGuide implements Parcelable, Serializable {
        public static final Parcelable.Creator<LynxGuide> CREATOR = new Parcelable.Creator<LynxGuide>() { // from class: X.0fop
            @Override // android.os.Parcelable.Creator
            public final LiveEffect.LynxGuide createFromParcel(Parcel parcel) {
                return new LiveEffect.LynxGuide(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LiveEffect.LynxGuide[] newArray(int i) {
                return new LiveEffect.LynxGuide[i];
            }
        };

        @C09CT("schema")
        public String schema;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.schema);
        }

        public LynxGuide() {
            this("");
        }

        public final String getSchema() {
            return this.schema;
        }

        public LynxGuide(String str) {
            this.schema = str;
        }

        public final void setSchema(String str) {
            this.schema = str;
        }
    }

    public static final class StickerSDKExtra {

        @C09CT("audio_graph")
        public AudioGraphBean audioGraph;

        @C09CT("commerce")
        public CommerceExtra commerceExtra;

        @C09CT("enableReplay")
        public boolean enableReplay;

        @C09CT("has_avatar_head")
        public boolean hasAvatarHead;

        @C09CT("is_avatar")
        public boolean isAvatar;

        @C09CT("is_fullbody")
        public boolean isFullBodyAvatar;

        @C09CT("live_goal")
        public LiveGoalExtra liveGoalExtra;

        @C09CT("lynx_guide")
        public LynxGuide lynxGuide;

        @C09CT("pl")
        public PlDataBean pl;

        @C09CT("red_dot_key")
        public String redDotKey;

        @C09CT("type")
        public String type;
    }

    public abstract LiveEffect LLJZIJLIL();

    public boolean LLLF() {
        return false;
    }

    public long LLLFF() {
        return 0L;
    }

    public String LLLFFI() {
        return "";
    }

    public JSONArray LLLFZ() {
        return null;
    }

    public String LLLI() {
        return "";
    }

    public void LLLIIIIL(List<String> list) {
    }

    public void LLLIIIL(long j) {
    }

    public void LLLIIL(boolean z) {
    }

    public void LLLIILIL(long j) {
    }

    public void LLLIL(String str) {
    }

    public void LLLILZ(JSONArray jSONArray) {
    }

    public void LLLILZJ(String str) {
    }

    public void LLLILZLLLI(List<String> list) {
    }

    public static final class ComposerConfig {
        public int LIZ;
        public int LIZIZ;
        public int LIZLLL;
        public float LJFF;

        @C09CT("value")
        public int defaultValue;

        @C09CT("doubleDirection")
        public boolean doubleDirection;

        @C09CT("min")
        public int minValue;

        @C09CT("name")
        public String name = "";

        @C09CT("tag")
        public String tag = "";

        @C09CT("max")
        public int maxValue = 100;
        public int LIZJ = 100;
        public float LJ = 1.0f;

        public final String LIZ() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ComposerConfig: name=");
            sbLIZ.append(this.name);
            sbLIZ.append(" defaultUIValue=");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(" currentUiValue=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" tag=");
            sbLIZ.append(this.tag);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    static {
        new C0U7E();
        LJ = new HashMap<>();
    }

    public List<String> LLLII() {
        return new ArrayList();
    }

    public final boolean LLLIIII() {
        return LLILII() != null;
    }

    public final int hashCode() {
        return getResourceId().hashCode();
    }

    /* JADX INFO: loaded from: classes28.dex */
    public static final class PlDataBean implements Parcelable, Serializable {
        public static final Parcelable.Creator<PlDataBean> CREATOR = new Parcelable.Creator<PlDataBean>() { // from class: X.0wQp
            @Override // android.os.Parcelable.Creator
            public final LiveEffect.PlDataBean createFromParcel(Parcel parcel) {
                boolean z;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new LiveEffect.PlDataBean(arrayListCreateStringArrayList, string, string2, z, z2, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final LiveEffect.PlDataBean[] newArray(int i) {
                return new LiveEffect.PlDataBean[i];
            }
        };

        @C09CT("albumFilter")
        public int albumFilter;

        @C09CT("alg")
        public ArrayList<String> alg;

        @C09CT("face_count_max")
        public int faceCountMax;

        @C09CT("face_count_min")
        public int faceCountMin;

        @C09CT("guide")
        public boolean guide;

        @C09CT("imgK")
        public String imgK;

        @C09CT("loading")
        public boolean loading;

        @C09CT("max_count")
        public int maxCount;

        @C09CT("min_count")
        public int minCount;

        @C09CT("relation")
        public String relation;

        public PlDataBean() {
            this(new ArrayList(), null, null, true, true, 0, 2, 5, -1, -1);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.alg);
            parcel.writeString(this.relation);
            parcel.writeString(this.imgK);
            parcel.writeInt(this.loading ? 1 : 0);
            parcel.writeInt(this.guide ? 1 : 0);
            parcel.writeInt(this.albumFilter);
            parcel.writeInt(this.faceCountMin);
            parcel.writeInt(this.faceCountMax);
            parcel.writeInt(this.minCount);
            parcel.writeInt(this.maxCount);
        }

        public final int getAlbumFilter() {
            return this.albumFilter;
        }

        public final ArrayList<String> getAlg() {
            return this.alg;
        }

        public final int getFaceCountMax() {
            return this.faceCountMax;
        }

        public final int getFaceCountMin() {
            return this.faceCountMin;
        }

        public final boolean getGuide() {
            return this.guide;
        }

        public final String getImgK() {
            return this.imgK;
        }

        public final boolean getLoading() {
            return this.loading;
        }

        public final int getMaxCount() {
            return this.maxCount;
        }

        public final int getMinCount() {
            return this.minCount;
        }

        public final String getRelation() {
            return this.relation;
        }

        public final void setAlbumFilter(int i) {
            this.albumFilter = i;
        }

        public final void setAlg(ArrayList<String> arrayList) {
            this.alg = arrayList;
        }

        public final void setFaceCountMax(int i) {
            this.faceCountMax = i;
        }

        public final void setFaceCountMin(int i) {
            this.faceCountMin = i;
        }

        public final void setGuide(boolean z) {
            this.guide = z;
        }

        public final void setImgK(String str) {
            this.imgK = str;
        }

        public final void setLoading(boolean z) {
            this.loading = z;
        }

        public final void setMaxCount(int i) {
            this.maxCount = i;
        }

        public final void setMinCount(int i) {
            this.minCount = i;
        }

        public final void setRelation(String str) {
            this.relation = str;
        }

        public PlDataBean(ArrayList<String> arrayList, String str, String str2, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5) {
            this.alg = arrayList;
            this.relation = str;
            this.imgK = str2;
            this.loading = z;
            this.guide = z2;
            this.albumFilter = i;
            this.faceCountMin = i2;
            this.faceCountMax = i3;
            this.minCount = i4;
            this.maxCount = i5;
        }
    }

    public static final class LiveGoalExtra implements Parcelable, Serializable {
        public static final Parcelable.Creator<LiveGoalExtra> CREATOR = new Parcelable.Creator<LiveGoalExtra>() { // from class: X.0U6D
            @Override // android.os.Parcelable.Creator
            public final LiveEffect.LiveGoalExtra createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3 = true;
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
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                return new LiveEffect.LiveGoalExtra(z, z2, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final LiveEffect.LiveGoalExtra[] newArray(int i) {
                return new LiveEffect.LiveGoalExtra[i];
            }
        };

        @C09CT("is_full_screen")
        public boolean isFullScreen;

        @C09CT("is_horizontal")
        public boolean isHorizontal;

        @C09CT("is_vertical")
        public boolean isVertical;

        public LiveGoalExtra() {
            this(false, false, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.isFullScreen ? 1 : 0);
            parcel.writeInt(this.isHorizontal ? 1 : 0);
            parcel.writeInt(this.isVertical ? 1 : 0);
        }

        public final boolean isFullScreen() {
            return this.isFullScreen;
        }

        public final boolean isHorizontal() {
            return this.isHorizontal;
        }

        public final boolean isVertical() {
            return this.isVertical;
        }

        public final void setFullScreen(boolean z) {
            this.isFullScreen = z;
        }

        public final void setHorizontal(boolean z) {
            this.isHorizontal = z;
        }

        public final void setVertical(boolean z) {
            this.isVertical = z;
        }

        public LiveGoalExtra(boolean z, boolean z2, boolean z3) {
            this.isFullScreen = z;
            this.isHorizontal = z2;
            this.isVertical = z3;
        }
    }

    public List<String> LLL() {
        return C13BV.INSTANCE;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(cls2, cls)) {
            return false;
        }
        LiveEffect liveEffect = (LiveEffect) obj;
        if (getResourceId().length() != 0 && liveEffect.getResourceId().length() != 0) {
            return Intrinsics.LJFF(getResourceId(), liveEffect.getResourceId());
        }
        if (getEffectId() == liveEffect.getEffectId()) {
            return true;
        }
        return false;
    }
}
