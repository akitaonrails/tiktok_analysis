package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C1880860z2q;
import X.C1881800z4M;
import X.C452501pT;
import com.google.gson.k;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class MixCardModel {
    public C1881800z4M LIZ;
    public int LIZIZ;
    public final C01GW LIZJ;

    @C09CT("card_class")
    public final String cardClass;

    @C09CT("card_data")
    public final k cardData;

    @C09CT("card_scheme")
    public final String cardScheme;

    @C09CT("card_type")
    public final String cardType;

    @C09CT("data_key_path")
    public final List<String> dataKeyPath;

    @C09CT("extra_card_config")
    public final k extraCardConfig;

    @C09CT("top_margin")
    public final Float topMargin;

    public MixCardModel() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public MixCardModel(String str) {
        this(str, null, null, null, null, null, null, 126, null);
    }

    public MixCardModel(String str, String str2) {
        this(str, str2, null, null, null, null, null, 124, null);
    }

    public MixCardModel(String str, String str2, String str3) {
        this(str, str2, str3, null, null, null, null, 120, null);
    }

    public MixCardModel(String str, String str2, String str3, List<String> list) {
        this(str, str2, str3, list, null, null, null, 112, null);
    }

    public MixCardModel(String str, String str2, String str3, List<String> list, k kVar) {
        this(str, str2, str3, list, kVar, null, null, 96, null);
    }

    public MixCardModel(String str, String str2, String str3, List<String> list, k kVar, Float f) {
        this(str, str2, str3, list, kVar, f, null, 64, null);
    }

    public final JSONObject LIZ() {
        return (JSONObject) this.LIZJ.getValue();
    }

    public MixCardModel(String str, String str2, String str3, List<String> list, k kVar, Float f, k kVar2) {
        this.cardType = str;
        this.cardClass = str2;
        this.cardScheme = str3;
        this.dataKeyPath = list;
        this.cardData = kVar;
        this.topMargin = f;
        this.extraCardConfig = kVar2;
        this.LIZ = new C1881800z4M(-1, "");
        this.LIZJ = C452501pT.LIZIZ(new C1880860z2q(this));
    }

    public MixCardModel(String str, String str2, String str3, List list, k kVar, Float f, k kVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? null : kVar, (i & 32) != 0 ? Float.valueOf(0.0f) : f, (i & 64) == 0 ? kVar2 : null);
    }
}
