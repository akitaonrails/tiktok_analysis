package com.ss.android.ugc.templatecore.templatedata;

import X.C09CT;
import X.C1446130njf;
import X.C2188811AlT;
import X.C580130Mp9;
import X.C580950MqT;
import X.C7740030o;
import X.EnumC1412640mre;
import X.InterfaceC1419170n2B;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class MvThemeData implements Parcelable, InterfaceC1419170n2B {
    public static final Parcelable.Creator<MvThemeData> CREATOR = new C580950MqT(6);

    @C09CT("algorithmKeyForSave")
    public List<String> algorithmKeyForSave;

    @C09CT("effect")
    public Effect effect;

    @C09CT("hasCommerceMusic")
    public boolean hasCommerceMusic;

    @C09CT("imgMd5")
    public String imgMd5;

    @C09CT("isDefaultType")
    public boolean isDefaultType;

    @C09CT("is_mv_anchor")
    public int isMvAnchor;

    @C09CT("maxCount")
    public int maxCount;

    @C09CT("minCount")
    public int minCount;

    @C09CT("mvAlgorithmHint")
    public String mvAlgorithmHint;

    @C09CT("mvAutoSaveToast")
    public String mvAutoSaveToast;

    @C09CT("mvType")
    public int mvType;

    @C09CT("needServerExecute")
    public boolean needServerExecute;

    @C09CT("resFillMode")
    public String resFillMode;

    @C09CT("resHeight")
    public int resHeight;

    @C09CT("resWidth")
    public int resWidth;

    @C09CT("source_id")
    public int sourceId;

    @C09CT("srcLimitHeight")
    public int srcLimitHeight;

    @C09CT("srcLimitToast")
    public String srcLimitToast;

    @C09CT("srcLimitWidth")
    public int srcLimitWidth;

    @C09CT("urlPrefixList")
    public List<String> urlPrefixList;

    @C09CT("videoMd5")
    public String videoMd5;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC1419170n2B
    public final VideoUrlModel LIZ() {
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setBytevc1(false);
        ArrayList arrayList = new ArrayList();
        String strLIZIZ = null;
        if (!TextUtils.isEmpty(this.videoMd5) && !C580130Mp9.LIZ(this.urlPrefixList)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) ListProtector.get(this.urlPrefixList, 0));
            sbLIZ.append(this.videoMd5);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        arrayList.add(strLIZIZ);
        videoUrlModel.setUrlList(arrayList);
        videoUrlModel.setUrlKey(this.videoMd5);
        videoUrlModel.setUri(this.videoMd5);
        return videoUrlModel;
    }

    public final String LIZJ() {
        Effect effect = this.effect;
        if (effect != null) {
            return effect.getUnzipPath();
        }
        return null;
    }

    public final String LIZLLL() {
        UrlModel fileUrl;
        Effect effect = this.effect;
        if (effect == null || (fileUrl = effect.getFileUrl()) == null || C580130Mp9.LIZ(fileUrl.getUrlList())) {
            return null;
        }
        return (String) ListProtector.get(fileUrl.getUrlList(), 0);
    }

    public final String LJ() {
        Effect effect = this.effect;
        if (effect != null) {
            return effect.getEffectId();
        }
        return null;
    }

    public final String LJFF() {
        String str = this.mvAlgorithmHint;
        return str == null ? "" : str;
    }

    public MvThemeData() {
        this.sourceId = 1;
    }

    @Override // X.InterfaceC1419170n2B
    public final String getMvId() {
        String strLJ = LJ();
        return strLJ == null ? "" : strLJ;
    }

    @Override // X.InterfaceC1419170n2B
    public final EnumC1412640mre LIZIZ() {
        return EnumC1412640mre.MV_TEMPLATE;
    }

    public MvThemeData(Parcel parcel) {
        boolean z;
        boolean z2;
        this.sourceId = 1;
        this.effect = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.urlPrefixList = parcel.createStringArrayList();
        this.minCount = parcel.readInt();
        this.maxCount = parcel.readInt();
        this.videoMd5 = parcel.readString();
        this.imgMd5 = parcel.readString();
        this.resFillMode = parcel.readString();
        this.resWidth = parcel.readInt();
        this.resHeight = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isDefaultType = z;
        this.mvType = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.needServerExecute = z2;
        this.mvAlgorithmHint = parcel.readString();
        this.mvAutoSaveToast = parcel.readString();
        this.algorithmKeyForSave = parcel.createStringArrayList();
        this.hasCommerceMusic = parcel.readByte() != 0;
        this.sourceId = parcel.readInt();
        this.isMvAnchor = parcel.readInt();
    }

    public final void LJI(Effect effect) {
        this.effect = effect;
        C1446130njf.LIZ.getClass();
        JSONObject jSONObjectLJII = C1446130njf.LJII(effect);
        if (jSONObjectLJII != null) {
            try {
                this.minCount = jSONObjectLJII.optInt("template_min_material", 0);
                this.maxCount = jSONObjectLJII.optInt("template_max_material", 0);
                this.videoMd5 = jSONObjectLJII.optString("template_video_cover", "");
                this.imgMd5 = jSONObjectLJII.optString("template_picture_cover", "");
                this.resFillMode = jSONObjectLJII.optString("template_pic_fill_mode", "AspectFit");
                this.resWidth = jSONObjectLJII.optInt("template_pic_input_width", 720);
                this.resHeight = jSONObjectLJII.optInt("template_pic_input_height", 1280);
                this.mvType = jSONObjectLJII.optInt("template_type", 0);
                this.mvAlgorithmHint = jSONObjectLJII.optString("mv_algorithm_hint");
                this.mvAutoSaveToast = jSONObjectLJII.optString("mv_auto_save_toast");
                this.srcLimitToast = jSONObjectLJII.optString("mv_resolution_limited_toast");
                this.srcLimitWidth = jSONObjectLJII.optInt("mv_resolution_limited_width");
                this.srcLimitHeight = jSONObjectLJII.optInt("mv_resolution_limited_height");
                this.algorithmKeyForSave = (List) C7740030o.LIZ().getGson().LJIIIIZZ(jSONObjectLJII.optString("mv_server_algorithm_result_save_keys"), new TypeToken<List<String>>() { // from class: X.04ZO
                }.getType());
                this.hasCommerceMusic = jSONObjectLJII.optBoolean("is_commerce_music", false);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.effect, i);
        parcel.writeStringList(this.urlPrefixList);
        parcel.writeInt(this.minCount);
        parcel.writeInt(this.maxCount);
        parcel.writeString(this.videoMd5);
        parcel.writeString(this.imgMd5);
        parcel.writeString(this.resFillMode);
        parcel.writeInt(this.resWidth);
        parcel.writeInt(this.resHeight);
        parcel.writeByte(this.isDefaultType ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mvType);
        parcel.writeByte(this.needServerExecute ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mvAlgorithmHint);
        parcel.writeString(this.mvAutoSaveToast);
        parcel.writeStringList(this.algorithmKeyForSave);
        parcel.writeByte(this.hasCommerceMusic ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.sourceId);
        parcel.writeInt(this.isMvAnchor);
    }
}
