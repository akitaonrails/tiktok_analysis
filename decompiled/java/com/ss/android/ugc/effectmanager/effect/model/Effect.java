package com.ss.android.ugc.effectmanager.effect.model;

import X.C01GW;
import X.C09BH;
import X.C09CT;
import X.C0UER;
import X.C0UES;
import X.C0UET;
import X.C0VSJ;
import X.C1211720hda;
import X.C13FZ;
import X.C13GX;
import X.C13HG;
import X.C13J2;
import X.C13KE;
import X.C13KG;
import X.C13LP;
import X.C1901507cb;
import X.C19989813Jg;
import X.C2188811AlT;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC1841100y0i;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986513Hz;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel$$serializer;
import com.ss.ugc.effectplatform.model.DiffEffect;
import com.ss.ugc.effectplatform.model.LocalPerfStats;
import com.ss.ugc.effectplatform.model.PerfMetricEntry;
import com.ss.ugc.effectplatform.model.TemplateEffectExtra;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public class Effect implements Serializable, Parcelable {
    public static final C01GW<C13HG<Object>>[] $childSerializers;

    @C09CT("extra")
    public String _extra;
    public transient JSONObject _extraJSONObject;
    public String _model_names;
    public List<String> _requirements;
    public transient JSONObject _sdkExtraJSONObject;
    public List<String> _type;
    public String ad_raw_data;
    public List<String> bind_ids;
    public List<String> challenge;
    public List<? extends Effect> child_effects;
    public List<String> children;
    public List<String> composerPath;
    public String composer_params;
    public String designer_encrypted_id;
    public String designer_id;
    public String device_platform;
    public String doc_id;
    public String effect_id;
    public final EffectLabel effect_label;
    public String effect_source_id;
    public int effect_type;
    public DiffEffect file_diff;
    public UrlModel file_url;
    public int from_source;
    public String grade_key;
    public final List<String> graph_nodes;
    public String hint;
    public UrlModel hint_file;
    public int hint_file_format;
    public UrlModel hint_icon;
    public UrlModel icon_url;
    public String id;
    public String iop_id;
    public final transient C01GW isCameraGreenScreenV2$delegate;
    public boolean isDownloaded;
    public boolean isZstdDownload;
    public boolean is_busi;
    public boolean is_cached_data;
    public boolean is_iop;
    public String logId;
    public String model_names;
    public String model_names_sec;
    public List<String> music;
    public String name;
    public String original_effect_id;
    public long package_size;
    public String panel;
    public String parent;

    @C09CT("perf_stats")
    public String perfStats;
    public long provider;
    public long ptime;
    public String recId;
    public long rec_tag;
    public String recommend_reason;
    public List<String> recommend_rule_tags;
    public List<String> requirements;
    public List<String> requirements_sec;
    public String resource_id;
    public String schema;
    public String sdk_extra;
    public String searchType;
    public String server_extra;
    public int source;
    public List<String> tags;
    public String tags_updated_at;
    public TemplateEffectExtra template_effect_extra;
    public String template_effect_id;
    public String transResPath;
    public UrlModel trans_file_url;
    public List<String> types;
    public List<String> types_sec;
    public String unzipPath;
    public long use_number;
    public transient boolean verifySignatureExemptionEnabled;
    public transient String verifySignatureExemptionReason;
    public String zipPath;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<Effect> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<Effect> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Effect createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            UrlModel urlModel = (UrlModel) parcel.readParcelable(Effect.class.getClassLoader());
            UrlModel urlModel2 = (UrlModel) parcel.readParcelable(Effect.class.getClassLoader());
            UrlModel urlModel3 = (UrlModel) parcel.readParcelable(Effect.class.getClassLoader());
            UrlModel urlModel4 = (UrlModel) parcel.readParcelable(Effect.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList5 = parcel.createStringArrayList();
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList6 = parcel.createStringArrayList();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(parcel.readParcelable(Effect.class.getClassLoader()));
            }
            return new Effect(string, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, string2, string3, string4, urlModel, urlModel2, urlModel3, urlModel4, i, arrayListCreateStringArrayList3, arrayListCreateStringArrayList4, arrayListCreateStringArrayList5, string5, arrayListCreateStringArrayList6, arrayList, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList(), parcel.readLong(), parcel.readString(), parcel.createStringArrayList(), parcel.readLong(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (UrlModel) parcel.readParcelable(Effect.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readLong(), (TemplateEffectExtra) parcel.readParcelable(Effect.class.getClassLoader()), parcel.readString(), (DiffEffect) parcel.readParcelable(Effect.class.getClassLoader()), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : EffectLabel.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Effect[] newArray(int i) {
            return new Effect[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public Effect() {
        long j = 0;
        int i = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, 0, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, 0 == true ? 1 : 0, objArr27, 0 == true ? 1 : 0, objArr28, objArr29, j, objArr30, objArr31, j, objArr32, objArr33, objArr34, objArr35, objArr36, 0 == true ? 1 : 0, objArr37, objArr38, objArr39, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, j, objArr46, objArr47, objArr48, j, j, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 15, objArr54);
    }

    public static /* synthetic */ void getPerfStats$annotations() {
    }

    public static /* synthetic */ void get_extra$annotations() {
    }

    public static /* synthetic */ void get_extraJSONObject$annotations() {
    }

    public static /* synthetic */ void get_sdkExtraJSONObject$annotations() {
    }

    public static /* synthetic */ void isCameraGreenScreenV2$annotations() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeStringList(this._requirements);
        parcel.writeStringList(this.requirements_sec);
        parcel.writeString(this.hint);
        parcel.writeString(this.id);
        parcel.writeString(this.effect_id);
        parcel.writeParcelable(this.file_url, i);
        parcel.writeParcelable(this.icon_url, i);
        parcel.writeParcelable(this.hint_icon, i);
        parcel.writeParcelable(this.hint_file, i);
        parcel.writeInt(this.hint_file_format);
        parcel.writeStringList(this._type);
        parcel.writeStringList(this.types_sec);
        parcel.writeStringList(this.tags);
        parcel.writeString(this.tags_updated_at);
        parcel.writeStringList(this.children);
        List<? extends Effect> list = this.child_effects;
        parcel.writeInt(list.size());
        Iterator<? extends Effect> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeString(this.parent);
        parcel.writeInt(this.effect_type);
        parcel.writeInt(this.source);
        parcel.writeInt(this.from_source);
        parcel.writeString(this.designer_id);
        parcel.writeString(this.designer_encrypted_id);
        parcel.writeString(this.device_platform);
        parcel.writeString(this.schema);
        parcel.writeStringList(this.music);
        parcel.writeString(this._extra);
        parcel.writeString(this.perfStats);
        parcel.writeString(this.sdk_extra);
        parcel.writeString(this.ad_raw_data);
        parcel.writeString(this.composer_params);
        parcel.writeInt(this.is_busi ? 1 : 0);
        parcel.writeString(this.iop_id);
        parcel.writeInt(this.is_iop ? 1 : 0);
        parcel.writeString(this.resource_id);
        parcel.writeStringList(this.bind_ids);
        parcel.writeLong(this.ptime);
        parcel.writeString(this.grade_key);
        parcel.writeStringList(this.challenge);
        parcel.writeLong(this.use_number);
        parcel.writeString(this.effect_source_id);
        parcel.writeStringList(this.composerPath);
        parcel.writeString(this.zipPath);
        parcel.writeString(this.unzipPath);
        parcel.writeString(this.transResPath);
        parcel.writeInt(this.isDownloaded ? 1 : 0);
        parcel.writeString(this.panel);
        parcel.writeString(this.searchType);
        parcel.writeString(this.recId);
        parcel.writeString(this._model_names);
        parcel.writeString(this.model_names_sec);
        parcel.writeString(this.original_effect_id);
        parcel.writeParcelable(this.trans_file_url, i);
        parcel.writeString(this.template_effect_id);
        parcel.writeString(this.doc_id);
        parcel.writeLong(this.rec_tag);
        parcel.writeParcelable(this.template_effect_extra, i);
        parcel.writeString(this.server_extra);
        parcel.writeParcelable(this.file_diff, i);
        parcel.writeLong(this.provider);
        parcel.writeLong(this.package_size);
        parcel.writeString(this.recommend_reason);
        parcel.writeStringList(this.recommend_rule_tags);
        EffectLabel effectLabel = this.effect_label;
        if (effectLabel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            effectLabel.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.graph_nodes);
        parcel.writeString(this.logId);
        parcel.writeInt(this.is_cached_data ? 1 : 0);
        parcel.writeInt(this.isZstdDownload ? 1 : 0);
    }

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.PUBLICATION;
        $childSerializers = new C01GW[]{null, C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(173)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(174)), null, null, null, null, null, null, null, null, C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(175)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(176)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(177)), null, C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(178)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(179)), null, null, null, null, null, null, null, null, C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(180)), null, null, null, null, null, null, null, null, null, C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(181)), null, null, C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(167)), null, null, C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(168)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(169)), null, C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(170)), null, null, null, C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(171)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(172)), null, null, null};
    }

    public final JSONObject getExtraJsonObject() {
        if (this._extraJSONObject == null) {
            String extra = getExtra();
            if (!(extra == null || a0.LJJJIL(extra))) {
                JSONObject jSONObject = null;
                try {
                    String extra2 = getExtra();
                    if (extra2 != null) {
                        jSONObject = new JSONObject(extra2);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this._extraJSONObject = jSONObject;
            }
        }
        return this._extraJSONObject;
    }

    public final LocalPerfStats getLocalPerfStats() throws Throwable {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getUnzipPath());
            sbLIZ.append("/strategy_evaluation_metrics.json");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (!c0vsj.exists()) {
                return null;
            }
            Map map = (Map) C13J2.LIZ(AFwS274S0000000_30.get$arr$(228)).LIZIZ(new C13FZ(C13GX.LIZ, PerfMetricEntry.Companion.serializer()), C09BH.LJI(c0vsj, Charsets.UTF_8));
            LocalPerfStats.Companion.getClass();
            return C1901507cb.LIZ(map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final String getModel_names() {
        String model_names_sec;
        String str = this._model_names;
        if ((str == null || a0.LJJJIL(str)) && (model_names_sec = getModel_names_sec()) != null && !a0.LJJJIL(model_names_sec)) {
            C0UES c0ues = C0UER.LIZ;
            this._model_names = c0ues != null ? c0ues.decrypt(getModel_names_sec()) : null;
        }
        String str2 = this._model_names;
        return (str2 == null || a0.LJJJIL(str2)) ? this.model_names : this._model_names;
    }

    public final String getRecommendRuleTags() {
        List<String> list = this.recommend_rule_tags;
        if (list != null) {
            return C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        }
        return null;
    }

    public List<String> getRequirements() {
        List<String> list;
        List<String> arrayList;
        List<String> list2 = this.requirements_sec;
        if (list2 != null && !list2.isEmpty() && ((list = this.requirements_sec) == null || list.size() != this._requirements.size())) {
            C0UES c0ues = C0UER.LIZ;
            if (c0ues == null || (arrayList = C0UET.LIZ(c0ues, this.requirements_sec)) == null) {
                arrayList = new ArrayList<>();
            }
            this._requirements = arrayList;
        }
        return this._requirements.isEmpty() ? this.requirements : this._requirements;
    }

    public final JSONObject getSdkExtraJSONObject() {
        JSONObject jSONObject;
        if (this._sdkExtraJSONObject == null && (!a0.LJJJIL(getSdkExtra()))) {
            try {
                jSONObject = new JSONObject(getSdkExtra());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
            this._sdkExtraJSONObject = jSONObject;
        }
        return this._sdkExtraJSONObject;
    }

    public final String getTemplateEffectExtra() {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getUnzipPath());
            sbLIZ.append("/effect/extra.json");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            return c0vsj.exists() ? C09BH.LJI(c0vsj, Charsets.UTF_8) : "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public List<String> getTypes() {
        List<String> list;
        List<String> arrayList;
        List<String> list2 = this.types_sec;
        if (list2 != null && !list2.isEmpty() && ((list = this.types_sec) == null || list.size() != this._type.size())) {
            C0UES c0ues = C0UER.LIZ;
            if (c0ues == null || (arrayList = C0UET.LIZ(c0ues, this.types_sec)) == null) {
                arrayList = new ArrayList<>();
            }
            this._type = arrayList;
        }
        return this._type.isEmpty() ? this.types : this._type;
    }

    public final Pair<Boolean, String> getVerifySignatureExemptionWithReason() {
        JSONObject sdkExtraJSONObject;
        String strOptString;
        if (!this.verifySignatureExemptionEnabled) {
            if (getSource() == 103) {
                this.verifySignatureExemptionEnabled = true;
                this.verifySignatureExemptionReason = "AI Self";
            } else if (getSdkExtraJSONObject() != null && (sdkExtraJSONObject = getSdkExtraJSONObject()) != null && (strOptString = sdkExtraJSONObject.optString("model_name")) != null && strOptString.length() > 0) {
                this.verifySignatureExemptionEnabled = true;
                this.verifySignatureExemptionReason = "AI Self";
            } else if (EffectKt.containDiffInfo(this)) {
                this.verifySignatureExemptionEnabled = true;
                this.verifySignatureExemptionReason = "EffectDiffPackage";
            }
        }
        return new Pair<>(Boolean.valueOf(this.verifySignatureExemptionEnabled), this.verifySignatureExemptionReason);
    }

    public final boolean isCameraGreenScreenV2() {
        return ((Boolean) this.isCameraGreenScreenV2$delegate.getValue()).booleanValue();
    }

    public String toString() {
        return "Effect(name='" + getName() + "', _requirements=" + this._requirements + ", requirements_sec=" + this.requirements_sec + ", hint='" + getHint() + "', id='" + getId() + "', effect_id='" + getEffect_id() + "', file_url=" + getFile_url() + ", icon_url=" + getIcon_url() + ", hint_icon=" + getHint_icon() + ", hint_file=" + getHint_file() + ", hint_file_format=" + getHint_file_format() + ", _type=" + this._type + ", types_sec=" + this.types_sec + ", tags=" + getTags() + ", tags_updated_at='" + getTags_updated_at() + "', children=" + getChildren() + ", child_effects=" + getChild_effects() + ", parent=" + getParent() + ", effect_type=" + getEffect_type() + ", source=" + getSource() + ", from_source=" + getFrom_source() + ", designer_id='" + getDesigner_id() + "', designer_encrypted_id='" + getDesigner_encrypted_id() + "', device_platform='" + getDevice_platform() + "', schema='" + getSchema() + "', music=" + getMusic() + ", extra=" + getExtra() + ", sdk_extra='" + this.sdk_extra + "', ad_raw_data='" + getAd_raw_data() + "', composer_params='" + getComposer_params() + "', is_busi=" + is_busi() + ", iop_id='" + getIop_id() + "', is_iop=" + is_iop() + ", resource_id='" + getResource_id() + "', bind_ids=" + getBind_ids() + ", ptime=" + getPtime() + ", grade_key='" + getGrade_key() + "', challenge=" + getChallenge() + ", composerPath=" + getComposerPath() + ", zipPath='" + getZipPath() + "', unzipPath='" + getUnzipPath() + "', transResPath='" + getTransResPath() + "', isDownloaded=" + isDownloaded() + ", panel='" + getPanel() + "', searchType='" + getSearchType() + "', recId=" + getRecId() + ", _model_names=" + this._model_names + ", model_names_sec=" + getModel_names_sec() + ", original_effect_id=" + getOriginal_effect_id() + ", trans_file_url=" + getTrans_file_url() + ", template_effect_id=" + getTemplate_effect_id() + ", doc_id=" + getDoc_id() + ", rec_tag=" + getRec_tag() + ", requirements=" + getRequirements() + ", types=" + getTypes() + ", model_names=" + getModel_names() + ", template_effect_extra=" + getTemplate_effect_extra() + ", server_extra=" + getServer_extra() + ", file_diff=" + getFile_diff() + ')';
    }

    public final String getAdRawData() {
        return getAd_raw_data();
    }

    public final List<String> getBindIds() {
        return getBind_ids();
    }

    public final List<Effect> getChildEffects() {
        return getChild_effects();
    }

    public final String getComposerParams() {
        return getComposer_params();
    }

    public final String getDesignerEncryptedId() {
        return getDesigner_encrypted_id();
    }

    public final String getDesignerId() {
        return getDesigner_id();
    }

    public final String getDevicePlatform() {
        return getDevice_platform();
    }

    public final String getEffectId() {
        return getEffect_id();
    }

    public final int getEffectType() {
        return getEffect_type();
    }

    public final String getExtraZipMd5() {
        JSONObject extraJsonObject = getExtraJsonObject();
        if (extraJsonObject != null) {
            return extraJsonObject.optString("zipMd5");
        }
        return null;
    }

    public final Integer getExtraZstFileSize() {
        JSONObject extraJsonObject = getExtraJsonObject();
        if (extraJsonObject != null) {
            return Integer.valueOf(extraJsonObject.optInt("zstFileSize"));
        }
        return null;
    }

    public final String getExtraZstUri() {
        JSONObject extraJsonObject = getExtraJsonObject();
        if (extraJsonObject != null) {
            return extraJsonObject.optString("zstFileUri");
        }
        return null;
    }

    public final UrlModel getFileUrl() {
        return getFile_url();
    }

    public final int getFromSource() {
        return getFrom_source();
    }

    public final String getGradeKey() {
        return getGrade_key();
    }

    public final UrlModel getHintFile() {
        return getHint_file();
    }

    public final int getHintFileFormat() {
        return getHint_file_format();
    }

    public final UrlModel getHintIcon() {
        return getHint_icon();
    }

    public final UrlModel getIconUrl() {
        return getIcon_url();
    }

    public final String getIopId() {
        return getIop_id();
    }

    public final String getModelNames() {
        return getModel_names();
    }

    public final String getOriginalEffectId() {
        return getOriginal_effect_id();
    }

    public final String getParentId() {
        return getParent();
    }

    public final long getPublishTime() {
        return getPtime();
    }

    public final String getRawMd5() {
        JSONObject extraJsonObject = getExtraJsonObject();
        if (extraJsonObject != null) {
            return extraJsonObject.optString("raw_md5", null);
        }
        return null;
    }

    public final String getResourceId() {
        return getResource_id();
    }

    public final String getTagsUpdatedAt() {
        return getTags_updated_at();
    }

    public int hashCode() {
        return (((getId().hashCode() * 31) + getEffect_id().hashCode()) * 31) + getResource_id().hashCode();
    }

    public final boolean isBusiness() {
        return is_busi();
    }

    public final boolean isIsIop() {
        return is_iop();
    }

    public final String toLogDetails() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Effect(name='");
        sbLIZ.append(getName());
        sbLIZ.append("', source='");
        sbLIZ.append(getSource());
        sbLIZ.append("', from_source='");
        sbLIZ.append(getFrom_source());
        sbLIZ.append("', effect_id='");
        sbLIZ.append(getEffect_id());
        sbLIZ.append("', file_url='");
        sbLIZ.append(getFile_url());
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Companion {
        public final C13HG<Effect> serializer() {
            return Effect$$serializer.INSTANCE;
        }
    }

    public String getAd_raw_data() {
        return this.ad_raw_data;
    }

    public List<String> getBind_ids() {
        return this.bind_ids;
    }

    public List<String> getChallenge() {
        return this.challenge;
    }

    public List<Effect> getChild_effects() {
        return this.child_effects;
    }

    public List<String> getChildren() {
        return this.children;
    }

    public List<String> getComposerPath() {
        return this.composerPath;
    }

    public String getComposer_params() {
        return this.composer_params;
    }

    public String getDesigner_encrypted_id() {
        return this.designer_encrypted_id;
    }

    public String getDesigner_id() {
        return this.designer_id;
    }

    public String getDevice_platform() {
        return this.device_platform;
    }

    public String getDoc_id() {
        return this.doc_id;
    }

    public final EffectLabel getEffectLabel() {
        return this.effect_label;
    }

    public String getEffect_id() {
        return this.effect_id;
    }

    public String getEffect_source_id() {
        return this.effect_source_id;
    }

    public int getEffect_type() {
        return this.effect_type;
    }

    public final String getExtra() {
        return this._extra;
    }

    public DiffEffect getFile_diff() {
        return this.file_diff;
    }

    public UrlModel getFile_url() {
        return this.file_url;
    }

    public int getFrom_source() {
        return this.from_source;
    }

    public String getGrade_key() {
        return this.grade_key;
    }

    public final List<String> getGraphNodes() {
        return this.graph_nodes;
    }

    public String getHint() {
        return this.hint;
    }

    public UrlModel getHint_file() {
        return this.hint_file;
    }

    public int getHint_file_format() {
        return this.hint_file_format;
    }

    public UrlModel getHint_icon() {
        return this.hint_icon;
    }

    public UrlModel getIcon_url() {
        return this.icon_url;
    }

    public String getId() {
        return this.id;
    }

    public final String getInternalModelNames$ckresource_model_release() {
        return this._model_names;
    }

    public final List<String> getInternalRequirements$ckresource_model_release() {
        return this._requirements;
    }

    public final List<String> getInternalType$ckresource_model_release() {
        return this._type;
    }

    public String getIop_id() {
        return this.iop_id;
    }

    public final String getLogId() {
        return this.logId;
    }

    public String getModel_names_sec() {
        return this.model_names_sec;
    }

    public List<String> getMusic() {
        return this.music;
    }

    public String getName() {
        return this.name;
    }

    public String getOriginal_effect_id() {
        return this.original_effect_id;
    }

    public long getPackage_size() {
        return this.package_size;
    }

    public String getPanel() {
        return this.panel;
    }

    public String getParent() {
        return this.parent;
    }

    public final String getPerfStatsData() {
        return this.perfStats;
    }

    public long getProvider() {
        return this.provider;
    }

    public long getPtime() {
        return this.ptime;
    }

    public String getRecId() {
        return this.recId;
    }

    public long getRec_tag() {
        return this.rec_tag;
    }

    public String getRecommend_reason() {
        return this.recommend_reason;
    }

    public final List<String> getRequirements_sec() {
        return this.requirements_sec;
    }

    public String getResource_id() {
        return this.resource_id;
    }

    public String getSchema() {
        return this.schema;
    }

    public final String getSdkExtra() {
        return this.sdk_extra;
    }

    public String getSearchType() {
        return this.searchType;
    }

    public String getServer_extra() {
        return this.server_extra;
    }

    public int getSource() {
        return this.source;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public TemplateEffectExtra getTemplate_effect_extra() {
        return this.template_effect_extra;
    }

    public String getTemplate_effect_id() {
        return this.template_effect_id;
    }

    public String getTransResPath() {
        return this.transResPath;
    }

    public UrlModel getTrans_file_url() {
        return this.trans_file_url;
    }

    public final List<String> getTypes_sec() {
        return this.types_sec;
    }

    public String getUnzipPath() {
        return this.unzipPath;
    }

    public long getUse_number() {
        return this.use_number;
    }

    public String getZipPath() {
        return this.zipPath;
    }

    public boolean isDownloaded() {
        return this.isDownloaded;
    }

    public final boolean isZstdDownload() {
        return this.isZstdDownload;
    }

    public boolean is_busi() {
        return this.is_busi;
    }

    public final boolean is_cached_data() {
        return this.is_cached_data;
    }

    public boolean is_iop() {
        return this.is_iop;
    }

    public Effect(Effect effect) {
        this(effect.getName(), effect._requirements, effect.requirements_sec, effect.getHint(), effect.getId(), effect.getEffect_id(), effect.getFile_url(), effect.getIcon_url(), effect.getHint_icon(), effect.getHint_file(), effect.getHint_file_format(), effect._type, effect.types_sec, effect.getTags(), effect.getTags_updated_at(), effect.getChildren(), effect.getChild_effects(), effect.getParent(), effect.getEffect_type(), effect.getSource(), effect.getFrom_source(), effect.getDesigner_id(), effect.getDesigner_encrypted_id(), effect.getDevice_platform(), effect.getSchema(), effect.getMusic(), effect.getExtra(), effect.perfStats, effect.sdk_extra, effect.getAd_raw_data(), effect.getComposer_params(), effect.is_busi(), effect.getIop_id(), effect.is_iop(), effect.getResource_id(), effect.getBind_ids(), effect.getPtime(), effect.getGrade_key(), effect.getChallenge(), effect.getUse_number(), effect.getEffect_source_id(), effect.getComposerPath(), effect.getZipPath(), effect.getUnzipPath(), effect.getTransResPath(), effect.isDownloaded(), effect.getPanel(), effect.getSearchType(), effect.getRecId(), effect._model_names, effect.getModel_names_sec(), effect.getOriginal_effect_id(), effect.getTrans_file_url(), effect.getTemplate_effect_id(), effect.getDoc_id(), effect.getRec_tag(), effect.getTemplate_effect_extra(), effect.getServer_extra(), effect.getFile_diff(), effect.getProvider(), effect.getPackage_size(), effect.getRecommend_reason(), effect.recommend_rule_tags, effect.getEffectLabel(), effect.graph_nodes, effect.logId, effect.is_cached_data, effect.isZstdDownload);
        this.verifySignatureExemptionEnabled = effect.verifySignatureExemptionEnabled;
        this.verifySignatureExemptionReason = effect.verifySignatureExemptionReason;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Effect)) {
            return false;
        }
        Effect effect = (Effect) obj;
        if (Intrinsics.LJFF(getId(), effect.getId()) && Intrinsics.LJFF(getEffect_id(), effect.getEffect_id()) && Intrinsics.LJFF(getResource_id(), effect.getResource_id())) {
            return true;
        }
        return false;
    }

    public final void setAdRawData(String str) {
        setAd_raw_data(str);
    }

    public void setAd_raw_data(String str) {
        this.ad_raw_data = str;
    }

    public final void setBindIds(List<String> list) {
        setBind_ids(list);
    }

    public void setBind_ids(List<String> list) {
        this.bind_ids = list;
    }

    public final void setBusiness(boolean z) {
        set_busi(z);
    }

    public void setChallenge(List<String> list) {
        this.challenge = list;
    }

    public final void setChildEffects(List<? extends Effect> list) {
        setChild_effects(list);
    }

    public void setChild_effects(List<? extends Effect> list) {
        this.child_effects = list;
    }

    public void setChildren(List<String> list) {
        this.children = list;
    }

    public final void setComposerParams(String str) {
        setComposer_params(str);
    }

    public void setComposerPath(List<String> list) {
        this.composerPath = list;
    }

    public void setComposer_params(String str) {
        this.composer_params = str;
    }

    public final void setDesignerEncryptedId(String str) {
        setDesigner_encrypted_id(str);
    }

    public final void setDesignerId(String str) {
        setDesigner_id(str);
    }

    public void setDesigner_encrypted_id(String str) {
        this.designer_encrypted_id = str;
    }

    public void setDesigner_id(String str) {
        this.designer_id = str;
    }

    public final void setDevicePlatform(String str) {
        setDevice_platform(str);
    }

    public void setDevice_platform(String str) {
        this.device_platform = str;
    }

    public void setDoc_id(String str) {
        this.doc_id = str;
    }

    public void setDownloaded(boolean z) {
        this.isDownloaded = z;
    }

    public final void setEffectId(String str) {
        setEffect_id(str);
    }

    public final void setEffectType(int i) {
        setEffect_type(i);
    }

    public void setEffect_id(String str) {
        this.effect_id = str;
    }

    public void setEffect_source_id(String str) {
        this.effect_source_id = str;
    }

    public void setEffect_type(int i) {
        this.effect_type = i;
    }

    public final void setExtra(String str) {
        this._extra = str;
        this._extraJSONObject = null;
    }

    public final void setFileUrl(UrlModel urlModel) {
        setFile_url(urlModel);
    }

    public void setFile_diff(DiffEffect diffEffect) {
        this.file_diff = diffEffect;
    }

    public void setFile_url(UrlModel urlModel) {
        this.file_url = urlModel;
    }

    public final void setFromSource(int i) {
        setFrom_source(i);
    }

    public void setFrom_source(int i) {
        this.from_source = i;
    }

    public final void setGradeKey(String str) {
        setGrade_key(str);
    }

    public void setGrade_key(String str) {
        this.grade_key = str;
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public final void setHintFile(UrlModel urlModel) {
        setHint_file(urlModel);
    }

    public final void setHintFileFormat(int i) {
        setHint_file_format(i);
    }

    public final void setHintIcon(UrlModel urlModel) {
        setHint_icon(urlModel);
    }

    public void setHint_file(UrlModel urlModel) {
        this.hint_file = urlModel;
    }

    public void setHint_file_format(int i) {
        this.hint_file_format = i;
    }

    public void setHint_icon(UrlModel urlModel) {
        this.hint_icon = urlModel;
    }

    public final void setIconUrl(UrlModel urlModel) {
        setIcon_url(urlModel);
    }

    public void setIcon_url(UrlModel urlModel) {
        this.icon_url = urlModel;
    }

    public void setId(String str) {
        this.id = str;
    }

    public final void setIopId(String str) {
        setIop_id(str);
    }

    public void setIop_id(String str) {
        this.iop_id = str;
    }

    public final void setIsIop(boolean z) {
        set_iop(z);
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public final void setModelNames(String str) {
        this.model_names = str;
    }

    public final void setModel_names(String str) {
        this.model_names = str;
    }

    public void setModel_names_sec(String str) {
        this.model_names_sec = str;
    }

    public void setMusic(List<String> list) {
        this.music = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public final void setOriginalEffectId(String str) {
        setOriginal_effect_id(str);
    }

    public void setOriginal_effect_id(String str) {
        this.original_effect_id = str;
    }

    public void setPackage_size(long j) {
        this.package_size = j;
    }

    public void setPanel(String str) {
        this.panel = str;
    }

    public void setParent(String str) {
        this.parent = str;
    }

    public final void setParentId(String str) {
        setParent(str);
    }

    public void setProvider(long j) {
        this.provider = j;
    }

    public void setPtime(long j) {
        this.ptime = j;
    }

    public final void setPublishTime(long j) {
        setPtime(j);
    }

    public void setRecId(String str) {
        this.recId = str;
    }

    public void setRec_tag(long j) {
        this.rec_tag = j;
    }

    public void setRecommend_reason(String str) {
        this.recommend_reason = str;
    }

    public void setRequirements(List<String> list) {
        this.requirements = list;
    }

    public final void setRequirements_sec(List<String> list) {
        this.requirements_sec = list;
    }

    public final void setResourceId(String str) {
        setResource_id(str);
    }

    public void setResource_id(String str) {
        this.resource_id = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public final void setSdkExtra(String str) {
        this.sdk_extra = str;
        this._sdkExtraJSONObject = null;
    }

    public void setSearchType(String str) {
        this.searchType = str;
    }

    public void setServer_extra(String str) {
        this.server_extra = str;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTagsUpdatedAt(String str) {
        setTags_updated_at(str);
    }

    public void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public void setTemplate_effect_extra(TemplateEffectExtra templateEffectExtra) {
        this.template_effect_extra = templateEffectExtra;
    }

    public void setTemplate_effect_id(String str) {
        this.template_effect_id = str;
    }

    public void setTransResPath(String str) {
        this.transResPath = str;
    }

    public void setTrans_file_url(UrlModel urlModel) {
        this.trans_file_url = urlModel;
    }

    public void setTypes(List<String> list) {
        this.types = list;
    }

    public final void setTypes_sec(List<String> list) {
        this.types_sec = list;
    }

    public void setUnzipPath(String str) {
        this.unzipPath = str;
    }

    public void setUse_number(long j) {
        this.use_number = j;
    }

    public void setZipPath(String str) {
        this.zipPath = str;
    }

    public final void setZstdDownload(boolean z) {
        this.isZstdDownload = z;
    }

    public void set_busi(boolean z) {
        this.is_busi = z;
    }

    public final void set_cached_data(boolean z) {
        this.is_cached_data = z;
    }

    public void set_iop(boolean z) {
        this.is_iop = z;
    }

    public final void setVerifySignatureExemptionEnabled(boolean z, String str) {
        this.verifySignatureExemptionEnabled = z;
        this.verifySignatureExemptionReason = str;
    }

    public static final /* synthetic */ void write$Self(Effect effect, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        C01GW<C13HG<Object>>[] c01gwArr = $childSerializers;
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getName(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 0, effect.getName());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect._requirements, new ArrayList())) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), effect._requirements);
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.requirements_sec != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 2, c01gwArr[2].getValue(), effect.requirements_sec);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getHint(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 3, effect.getHint());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getId(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 4, effect.getId());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getEffect_id(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 5, effect.getEffect_id());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getFile_url(), new UrlModel(new ArrayList(), null, null, null, null))) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 6, UrlModel$$serializer.INSTANCE, effect.getFile_url());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getIcon_url(), new UrlModel(new ArrayList(), null, null, null, null))) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 7, UrlModel$$serializer.INSTANCE, effect.getIcon_url());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getHint_icon(), new UrlModel(new ArrayList(), null, null, null, null))) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 8, UrlModel$$serializer.INSTANCE, effect.getHint_icon());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getHint_file(), new UrlModel(new ArrayList(), null, null, null, null))) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 9, UrlModel$$serializer.INSTANCE, effect.getHint_file());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getHint_file_format() != 0) {
            interfaceC19986513Hz.LJ(10, effect.getHint_file_format(), interfaceC19983313Gt);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect._type, new ArrayList())) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 11, c01gwArr[11].getValue(), effect._type);
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.types_sec != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 12, c01gwArr[12].getValue(), effect.types_sec);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getTags(), new ArrayList())) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 13, c01gwArr[13].getValue(), effect.getTags());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getTags_updated_at(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 14, effect.getTags_updated_at());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getChildren() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 15, c01gwArr[15].getValue(), effect.getChildren());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getChild_effects(), new ArrayList())) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 16, c01gwArr[16].getValue(), effect.getChild_effects());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getParent() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 17, C13GX.LIZ, effect.getParent());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getEffect_type() != 0) {
            interfaceC19986513Hz.LJ(18, effect.getEffect_type(), interfaceC19983313Gt);
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getSource() != 0) {
            interfaceC19986513Hz.LJ(19, effect.getSource(), interfaceC19983313Gt);
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getFrom_source() != -1) {
            interfaceC19986513Hz.LJ(20, effect.getFrom_source(), interfaceC19983313Gt);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getDesigner_id(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 21, effect.getDesigner_id());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getDesigner_encrypted_id(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 22, effect.getDesigner_encrypted_id());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getDevice_platform(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 23, effect.getDevice_platform());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getSchema(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 24, effect.getSchema());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getMusic() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 25, c01gwArr[25].getValue(), effect.getMusic());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect._extra != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 26, C13GX.LIZ, effect._extra);
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.perfStats != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 27, C13GX.LIZ, effect.perfStats);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.sdk_extra, "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 28, effect.sdk_extra);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getAd_raw_data(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 29, effect.getAd_raw_data());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getComposer_params(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 30, effect.getComposer_params());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.is_busi()) {
            interfaceC19986513Hz.LJIIJ(interfaceC19983313Gt, 31, effect.is_busi());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getIop_id(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 32, effect.getIop_id());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.is_iop()) {
            interfaceC19986513Hz.LJIIJ(interfaceC19983313Gt, 33, effect.is_iop());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getResource_id(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 34, effect.getResource_id());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getBind_ids() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 35, c01gwArr[35].getValue(), effect.getBind_ids());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getPtime() != 0) {
            interfaceC19986513Hz.LJFF(interfaceC19983313Gt, 36, effect.getPtime());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getGrade_key(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 37, effect.getGrade_key());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getChallenge() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 38, c01gwArr[38].getValue(), effect.getChallenge());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getUse_number() != 0) {
            interfaceC19986513Hz.LJFF(interfaceC19983313Gt, 39, effect.getUse_number());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getEffect_source_id() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 40, C13GX.LIZ, effect.getEffect_source_id());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getComposerPath() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 41, c01gwArr[41].getValue(), effect.getComposerPath());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getZipPath(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 42, effect.getZipPath());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getUnzipPath(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 43, effect.getUnzipPath());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getTransResPath(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 44, effect.getTransResPath());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.isDownloaded()) {
            interfaceC19986513Hz.LJIIJ(interfaceC19983313Gt, 45, effect.isDownloaded());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getPanel(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 46, effect.getPanel());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getSearchType(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 47, effect.getSearchType());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getRecId() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 48, C13GX.LIZ, effect.getRecId());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect._model_names != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 49, C13GX.LIZ, effect._model_names);
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getModel_names_sec() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 50, C13GX.LIZ, effect.getModel_names_sec());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getOriginal_effect_id() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 51, C13GX.LIZ, effect.getOriginal_effect_id());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getTrans_file_url() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 52, UrlModel$$serializer.INSTANCE, effect.getTrans_file_url());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getTemplate_effect_id() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 53, C13GX.LIZ, effect.getTemplate_effect_id());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getDoc_id() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 54, C13GX.LIZ, effect.getDoc_id());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getRec_tag() != 0) {
            interfaceC19986513Hz.LJFF(interfaceC19983313Gt, 55, effect.getRec_tag());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getTemplate_effect_extra() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 56, C13KG.LIZ, effect.getTemplate_effect_extra());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getServer_extra() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 57, C13GX.LIZ, effect.getServer_extra());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getFile_diff() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 58, C13KE.LIZ, effect.getFile_diff());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getProvider() != 0) {
            interfaceC19986513Hz.LJFF(interfaceC19983313Gt, 59, effect.getProvider());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getPackage_size() != 0) {
            interfaceC19986513Hz.LJFF(interfaceC19983313Gt, 60, effect.getPackage_size());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getRecommend_reason() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 61, C13GX.LIZ, effect.getRecommend_reason());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.recommend_rule_tags != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 62, c01gwArr[62].getValue(), effect.recommend_rule_tags);
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.effect_label != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 63, EffectLabel$$serializer.INSTANCE, effect.effect_label);
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.graph_nodes != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 64, c01gwArr[64].getValue(), effect.graph_nodes);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.logId, "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 65, effect.logId);
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.is_cached_data) {
            interfaceC19986513Hz.LJIIJ(interfaceC19983313Gt, 66, effect.is_cached_data);
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.isZstdDownload) {
            interfaceC19986513Hz.LJIIJ(interfaceC19983313Gt, 67, effect.isZstdDownload);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getRequirements(), new ArrayList())) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 68, c01gwArr[68].getValue(), effect.getRequirements());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.getTypes(), new ArrayList())) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 69, c01gwArr[69].getValue(), effect.getTypes());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.getModel_names() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 70, C13GX.LIZ, effect.getModel_names());
        }
        if (interfaceC19986513Hz.LJIJJ() || effect.verifySignatureExemptionEnabled) {
            interfaceC19986513Hz.LJIIJ(interfaceC19983313Gt, 71, effect.verifySignatureExemptionEnabled);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effect.verifySignatureExemptionReason, "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 72, effect.verifySignatureExemptionReason);
        }
    }

    public Effect(String str, List<String> list, List<String> list2, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, int i, List<String> list3, List<String> list4, List<String> list5, String str5, List<String> list6, List<? extends Effect> list7, String str6, int i2, int i3, int i4, String str7, String str8, String str9, String str10, List<String> list8, String str11, String str12, String str13, String str14, String str15, boolean z, String str16, boolean z2, String str17, List<String> list9, long j, String str18, List<String> list10, long j2, String str19, List<String> list11, String str20, String str21, String str22, boolean z3, String str23, String str24, String str25, String str26, String str27, String str28, UrlModel urlModel5, String str29, String str30, long j3, TemplateEffectExtra templateEffectExtra, String str31, DiffEffect diffEffect, long j4, long j5, String str32, List<String> list12, EffectLabel effectLabel, List<String> list13, String str33, boolean z4, boolean z5) {
        this.name = str;
        this._requirements = list;
        this.requirements_sec = list2;
        this.hint = str2;
        this.id = str3;
        this.effect_id = str4;
        this.file_url = urlModel;
        this.icon_url = urlModel2;
        this.hint_icon = urlModel3;
        this.hint_file = urlModel4;
        this.hint_file_format = i;
        this._type = list3;
        this.types_sec = list4;
        this.tags = list5;
        this.tags_updated_at = str5;
        this.children = list6;
        this.child_effects = list7;
        this.parent = str6;
        this.effect_type = i2;
        this.source = i3;
        this.from_source = i4;
        this.designer_id = str7;
        this.designer_encrypted_id = str8;
        this.device_platform = str9;
        this.schema = str10;
        this.music = list8;
        this._extra = str11;
        this.perfStats = str12;
        this.sdk_extra = str13;
        this.ad_raw_data = str14;
        this.composer_params = str15;
        this.is_busi = z;
        this.iop_id = str16;
        this.is_iop = z2;
        this.resource_id = str17;
        this.bind_ids = list9;
        this.ptime = j;
        this.grade_key = str18;
        this.challenge = list10;
        this.use_number = j2;
        this.effect_source_id = str19;
        this.composerPath = list11;
        this.zipPath = str20;
        this.unzipPath = str21;
        this.transResPath = str22;
        this.isDownloaded = z3;
        this.panel = str23;
        this.searchType = str24;
        this.recId = str25;
        this._model_names = str26;
        this.model_names_sec = str27;
        this.original_effect_id = str28;
        this.trans_file_url = urlModel5;
        this.template_effect_id = str29;
        this.doc_id = str30;
        this.rec_tag = j3;
        this.template_effect_extra = templateEffectExtra;
        this.server_extra = str31;
        this.file_diff = diffEffect;
        this.provider = j4;
        this.package_size = j5;
        this.recommend_reason = str32;
        this.recommend_rule_tags = list12;
        this.effect_label = effectLabel;
        this.graph_nodes = list13;
        this.logId = str33;
        this.is_cached_data = z4;
        this.isZstdDownload = z5;
        this.requirements = new ArrayList();
        this.types = new ArrayList();
        this.isCameraGreenScreenV2$delegate = C452501pT.LIZIZ(new AwS566S0100000_22(this, 426));
        this.verifySignatureExemptionReason = "";
    }

    public /* synthetic */ Effect(String str, List list, List list2, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, int i, List list3, List list4, List list5, String str5, List list6, List list7, String str6, int i2, int i3, int i4, String str7, String str8, String str9, String str10, List list8, String str11, String str12, String str13, String str14, String str15, boolean z, String str16, boolean z2, String str17, List list9, long j, String str18, List list10, long j2, String str19, List list11, String str20, String str21, String str22, boolean z3, String str23, String str24, String str25, String str26, String str27, String str28, UrlModel urlModel5, String str29, String str30, long j3, TemplateEffectExtra templateEffectExtra, String str31, DiffEffect diffEffect, long j4, long j5, String str32, List list12, EffectLabel effectLabel, List list13, String str33, boolean z4, boolean z5, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? new ArrayList() : list, (i5 & 4) != 0 ? null : list2, (i5 & 8) != 0 ? "" : str2, (i5 & 16) != 0 ? "" : str3, (i5 & 32) != 0 ? "" : str4, (i5 & 64) != 0 ? new UrlModel(new ArrayList(), null, null, null, null) : urlModel, (i5 & 128) != 0 ? new UrlModel(new ArrayList(), null, null, null, null) : urlModel2, (i5 & 256) != 0 ? new UrlModel(new ArrayList(), null, null, null, null) : urlModel3, (i5 & 512) != 0 ? new UrlModel(new ArrayList(), null, null, null, null) : urlModel4, (i5 & 1024) != 0 ? 0 : i, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new ArrayList() : list3, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : list4, (i5 & 8192) != 0 ? new ArrayList() : list5, (i5 & 16384) != 0 ? "" : str5, (i5 & 32768) != 0 ? null : list6, (i5 & 65536) != 0 ? new ArrayList() : list7, (i5 & 131072) != 0 ? null : str6, (262144 & i5) != 0 ? 0 : i2, (524288 & i5) != 0 ? 0 : i3, (1048576 & i5) != 0 ? -1 : i4, (2097152 & i5) != 0 ? "" : str7, (4194304 & i5) != 0 ? "" : str8, (8388608 & i5) != 0 ? "" : str9, (16777216 & i5) != 0 ? "" : str10, (33554432 & i5) != 0 ? null : list8, (67108864 & i5) != 0 ? null : str11, (134217728 & i5) != 0 ? null : str12, (268435456 & i5) != 0 ? "" : str13, (536870912 & i5) != 0 ? "" : str14, (1073741824 & i5) != 0 ? "" : str15, (i5 & Integer.MIN_VALUE) != 0 ? false : z, (i6 & 1) != 0 ? "" : str16, (i6 & 2) != 0 ? false : z2, (i6 & 4) != 0 ? "" : str17, (i6 & 8) != 0 ? null : list9, (i6 & 16) != 0 ? 0L : j, (i6 & 32) != 0 ? "" : str18, (i6 & 64) != 0 ? null : list10, (i6 & 128) != 0 ? 0L : j2, (i6 & 256) != 0 ? null : str19, (i6 & 512) != 0 ? null : list11, (i6 & 1024) != 0 ? "" : str20, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str21, (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str22, (i6 & 8192) != 0 ? false : z3, (i6 & 16384) != 0 ? "" : str23, (i6 & 32768) != 0 ? "" : str24, (i6 & 65536) != 0 ? null : str25, (i6 & 131072) != 0 ? null : str26, (262144 & i6) != 0 ? null : str27, (524288 & i6) != 0 ? null : str28, (1048576 & i6) != 0 ? null : urlModel5, (2097152 & i6) != 0 ? null : str29, (4194304 & i6) != 0 ? null : str30, (8388608 & i6) != 0 ? 0L : j3, (16777216 & i6) != 0 ? null : templateEffectExtra, (33554432 & i6) != 0 ? null : str31, (67108864 & i6) != 0 ? null : diffEffect, (134217728 & i6) != 0 ? 0L : j4, (268435456 & i6) == 0 ? j5 : 0L, (536870912 & i6) != 0 ? null : str32, (1073741824 & i6) != 0 ? null : list12, (i6 & Integer.MIN_VALUE) != 0 ? null : effectLabel, (i7 & 1) != 0 ? null : list13, (i7 & 2) == 0 ? str33 : "", (i7 & 4) != 0 ? false : z4, (i7 & 8) != 0 ? false : z5);
    }

    public Effect(int i, int i2, int i3, String str, List list, List list2, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, int i4, List list3, List list4, List list5, String str5, List list6, List list7, String str6, int i5, int i6, int i7, String str7, String str8, String str9, String str10, List list8, String str11, String str12, String str13, String str14, String str15, boolean z, String str16, boolean z2, String str17, List list9, long j, String str18, List list10, long j2, String str19, List list11, String str20, String str21, String str22, boolean z3, String str23, String str24, String str25, String str26, String str27, String str28, UrlModel urlModel5, String str29, String str30, long j3, TemplateEffectExtra templateEffectExtra, String str31, DiffEffect diffEffect, long j4, long j5, String str32, List list12, EffectLabel effectLabel, List list13, String str33, boolean z4, boolean z5, List list14, List list15, String str34, boolean z6, String str35, C19989813Jg c19989813Jg) {
        List list16 = list7;
        List list17 = list5;
        List list18 = list3;
        int i8 = i7;
        UrlModel urlModel6 = urlModel4;
        List list19 = list15;
        UrlModel urlModel7 = urlModel3;
        List list20 = list14;
        UrlModel urlModel8 = urlModel2;
        UrlModel urlModel9 = urlModel;
        List list21 = list;
        if (0 != 0) {
            int[] iArr = {i, i2, i3};
            int[] iArr2 = {0, 0, 0};
            InterfaceC19983313Gt descriptor = Effect$$serializer.INSTANCE.getDescriptor();
            ArrayList arrayList = new ArrayList();
            int i9 = 0;
            do {
                int i10 = iArr2[i9] & (~iArr[i9]);
                if (i10 != 0) {
                    int i11 = 0;
                    do {
                        if ((i10 & 1) != 0) {
                            arrayList.add(descriptor.LIZJ((i9 * 32) + i11));
                        }
                        i10 >>>= 1;
                        i11++;
                    } while (i11 < 32);
                }
                i9++;
            } while (i9 < 3);
            throw new C1211720hda(arrayList, descriptor.LJI());
        }
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        this._requirements = (i & 2) == 0 ? new ArrayList() : list21;
        if ((i & 4) == 0) {
            this.requirements_sec = null;
        } else {
            this.requirements_sec = list2;
        }
        if ((i & 8) == 0) {
            this.hint = "";
        } else {
            this.hint = str2;
        }
        if ((i & 16) == 0) {
            this.id = "";
        } else {
            this.id = str3;
        }
        if ((i & 32) == 0) {
            this.effect_id = "";
        } else {
            this.effect_id = str4;
        }
        this.file_url = (i & 64) == 0 ? new UrlModel(new ArrayList(), null, null, null, null) : urlModel9;
        this.icon_url = (i & 128) == 0 ? new UrlModel(new ArrayList(), null, null, null, null) : urlModel8;
        this.hint_icon = (i & 256) == 0 ? new UrlModel(new ArrayList(), null, null, null, null) : urlModel7;
        this.hint_file = (i & 512) == 0 ? new UrlModel(new ArrayList(), null, null, null, null) : urlModel6;
        if ((i & 1024) == 0) {
            this.hint_file_format = 0;
        } else {
            this.hint_file_format = i4;
        }
        this._type = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? new ArrayList() : list18;
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0) {
            this.types_sec = null;
        } else {
            this.types_sec = list4;
        }
        this.tags = (i & 8192) == 0 ? new ArrayList() : list17;
        if ((i & 16384) == 0) {
            this.tags_updated_at = "";
        } else {
            this.tags_updated_at = str5;
        }
        if ((i & 32768) == 0) {
            this.children = null;
        } else {
            this.children = list6;
        }
        this.child_effects = (i & 65536) == 0 ? new ArrayList() : list16;
        if ((131072 & i) == 0) {
            this.parent = null;
        } else {
            this.parent = str6;
        }
        if ((262144 & i) == 0) {
            this.effect_type = 0;
        } else {
            this.effect_type = i5;
        }
        if ((524288 & i) == 0) {
            this.source = 0;
        } else {
            this.source = i6;
        }
        this.from_source = (1048576 & i) == 0 ? -1 : i8;
        if ((2097152 & i) == 0) {
            this.designer_id = "";
        } else {
            this.designer_id = str7;
        }
        if ((4194304 & i) == 0) {
            this.designer_encrypted_id = "";
        } else {
            this.designer_encrypted_id = str8;
        }
        if ((8388608 & i) == 0) {
            this.device_platform = "";
        } else {
            this.device_platform = str9;
        }
        if ((16777216 & i) == 0) {
            this.schema = "";
        } else {
            this.schema = str10;
        }
        if ((33554432 & i) == 0) {
            this.music = null;
        } else {
            this.music = list8;
        }
        if ((67108864 & i) == 0) {
            this._extra = null;
        } else {
            this._extra = str11;
        }
        if ((134217728 & i) == 0) {
            this.perfStats = null;
        } else {
            this.perfStats = str12;
        }
        if ((268435456 & i) == 0) {
            this.sdk_extra = "";
        } else {
            this.sdk_extra = str13;
        }
        if ((536870912 & i) == 0) {
            this.ad_raw_data = "";
        } else {
            this.ad_raw_data = str14;
        }
        if ((1073741824 & i) == 0) {
            this.composer_params = "";
        } else {
            this.composer_params = str15;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.is_busi = false;
        } else {
            this.is_busi = z;
        }
        if ((i2 & 1) == 0) {
            this.iop_id = "";
        } else {
            this.iop_id = str16;
        }
        if ((i2 & 2) == 0) {
            this.is_iop = false;
        } else {
            this.is_iop = z2;
        }
        if ((i2 & 4) == 0) {
            this.resource_id = "";
        } else {
            this.resource_id = str17;
        }
        if ((i2 & 8) == 0) {
            this.bind_ids = null;
        } else {
            this.bind_ids = list9;
        }
        if ((i2 & 16) == 0) {
            this.ptime = 0L;
        } else {
            this.ptime = j;
        }
        if ((i2 & 32) == 0) {
            this.grade_key = "";
        } else {
            this.grade_key = str18;
        }
        if ((i2 & 64) == 0) {
            this.challenge = null;
        } else {
            this.challenge = list10;
        }
        if ((i2 & 128) == 0) {
            this.use_number = 0L;
        } else {
            this.use_number = j2;
        }
        if ((i2 & 256) == 0) {
            this.effect_source_id = null;
        } else {
            this.effect_source_id = str19;
        }
        if ((i2 & 512) == 0) {
            this.composerPath = null;
        } else {
            this.composerPath = list11;
        }
        if ((i2 & 1024) == 0) {
            this.zipPath = "";
        } else {
            this.zipPath = str20;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0) {
            this.unzipPath = "";
        } else {
            this.unzipPath = str21;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0) {
            this.transResPath = "";
        } else {
            this.transResPath = str22;
        }
        if ((i2 & 8192) == 0) {
            this.isDownloaded = false;
        } else {
            this.isDownloaded = z3;
        }
        if ((i2 & 16384) == 0) {
            this.panel = "";
        } else {
            this.panel = str23;
        }
        if ((i2 & 32768) == 0) {
            this.searchType = "";
        } else {
            this.searchType = str24;
        }
        if ((i2 & 65536) == 0) {
            this.recId = null;
        } else {
            this.recId = str25;
        }
        if ((131072 & i2) == 0) {
            this._model_names = null;
        } else {
            this._model_names = str26;
        }
        if ((262144 & i2) == 0) {
            this.model_names_sec = null;
        } else {
            this.model_names_sec = str27;
        }
        if ((524288 & i2) == 0) {
            this.original_effect_id = null;
        } else {
            this.original_effect_id = str28;
        }
        if ((1048576 & i2) == 0) {
            this.trans_file_url = null;
        } else {
            this.trans_file_url = urlModel5;
        }
        if ((2097152 & i2) == 0) {
            this.template_effect_id = null;
        } else {
            this.template_effect_id = str29;
        }
        if ((4194304 & i2) == 0) {
            this.doc_id = null;
        } else {
            this.doc_id = str30;
        }
        if ((8388608 & i2) == 0) {
            this.rec_tag = 0L;
        } else {
            this.rec_tag = j3;
        }
        if ((16777216 & i2) == 0) {
            this.template_effect_extra = null;
        } else {
            this.template_effect_extra = templateEffectExtra;
        }
        if ((33554432 & i2) == 0) {
            this.server_extra = null;
        } else {
            this.server_extra = str31;
        }
        if ((67108864 & i2) == 0) {
            this.file_diff = null;
        } else {
            this.file_diff = diffEffect;
        }
        if ((134217728 & i2) == 0) {
            this.provider = 0L;
        } else {
            this.provider = j4;
        }
        if ((268435456 & i2) == 0) {
            this.package_size = 0L;
        } else {
            this.package_size = j5;
        }
        if ((536870912 & i2) == 0) {
            this.recommend_reason = null;
        } else {
            this.recommend_reason = str32;
        }
        if ((1073741824 & i2) == 0) {
            this.recommend_rule_tags = null;
        } else {
            this.recommend_rule_tags = list12;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.effect_label = null;
        } else {
            this.effect_label = effectLabel;
        }
        if ((i3 & 1) == 0) {
            this.graph_nodes = null;
        } else {
            this.graph_nodes = list13;
        }
        if ((i3 & 2) == 0) {
            this.logId = "";
        } else {
            this.logId = str33;
        }
        if ((i3 & 4) == 0) {
            this.is_cached_data = false;
        } else {
            this.is_cached_data = z4;
        }
        if ((i3 & 8) == 0) {
            this.isZstdDownload = false;
        } else {
            this.isZstdDownload = z5;
        }
        this.requirements = (i3 & 16) == 0 ? new ArrayList() : list20;
        this.types = (i3 & 32) == 0 ? new ArrayList() : list19;
        if ((i3 & 64) == 0) {
            this.model_names = null;
        } else {
            this.model_names = str34;
        }
        this._sdkExtraJSONObject = null;
        this._extraJSONObject = null;
        this.isCameraGreenScreenV2$delegate = C452501pT.LIZIZ(new AwS566S0100000_22(this, 426));
        if ((i3 & 128) == 0) {
            this.verifySignatureExemptionEnabled = false;
        } else {
            this.verifySignatureExemptionEnabled = z6;
        }
        if ((i3 & 256) == 0) {
            this.verifySignatureExemptionReason = "";
        } else {
            this.verifySignatureExemptionReason = str35;
        }
    }
}
