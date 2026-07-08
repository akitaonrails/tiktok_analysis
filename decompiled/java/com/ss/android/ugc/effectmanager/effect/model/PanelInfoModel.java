package com.ss.android.ugc.effectmanager.effect.model;

import X.C01GW;
import X.C13GX;
import X.C13H6;
import X.C13HG;
import X.C19989713Jf;
import X.C19989813Jg;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC1841100y0i;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986513Hz;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public class PanelInfoModel implements Serializable {
    public static final C01GW<C13HG<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public CategoryEffectModel category_effects;
    public List<? extends EffectCategoryModel> category_list;
    public Extra extra;
    public String front_effect_id;
    public String logId;
    public EffectPanelModel panel;
    public String rear_effect_id;
    public List<String> url_prefix;
    public String version;

    public PanelInfoModel() {
        this("", new ArrayList(), null, null, null, null, new ArrayList(), null, null);
    }

    @InterfaceC1841100y0i
    public static final class Extra implements Serializable {
        public String effect_recommend;
        public List<CategoryPageModel.FilterEffect> filtered_effects;
        public String rec_id;
        public static final Companion Companion = new Companion();
        public static final C01GW<C13HG<Object>>[] $childSerializers = {null, C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS219S0000000_30.get$arr$(196)), null};

        public Extra() {
            this.rec_id = "";
            this.effect_recommend = "";
        }

        public static final class Companion {
            public final C13HG<Extra> serializer() {
                return PanelInfoModel$Extra$$serializer.INSTANCE;
            }
        }

        public final String getEffect_recommend() {
            return this.effect_recommend;
        }

        public final List<CategoryPageModel.FilterEffect> getFiltered_effects() {
            return this.filtered_effects;
        }

        public final String getRec_id() {
            return this.rec_id;
        }

        public final void setEffect_recommend(String str) {
            this.effect_recommend = str;
        }

        public final void setFiltered_effects(List<CategoryPageModel.FilterEffect> list) {
            this.filtered_effects = list;
        }

        public final void setRec_id(String str) {
            this.rec_id = str;
        }

        public static final /* synthetic */ void write$Self$ckresource_model_release(Extra extra, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
            C01GW<C13HG<Object>>[] c01gwArr = $childSerializers;
            if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(extra.rec_id, "")) {
                interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 0, extra.rec_id);
            }
            if (interfaceC19986513Hz.LJIJJ() || extra.filtered_effects != null) {
                interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), extra.filtered_effects);
            }
            if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(extra.effect_recommend, "")) {
                interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 2, extra.effect_recommend);
            }
        }

        public /* synthetic */ Extra(int i, String str, List list, String str2, C19989813Jg c19989813Jg) {
            if (0 == 0) {
                if ((i & 1) == 0) {
                    this.rec_id = "";
                } else {
                    this.rec_id = str;
                }
                if ((i & 2) == 0) {
                    this.filtered_effects = null;
                } else {
                    this.filtered_effects = list;
                }
                if ((i & 4) == 0) {
                    this.effect_recommend = "";
                    return;
                } else {
                    this.effect_recommend = str2;
                    return;
                }
            }
            C19989713Jf.LIZ(i, 0, PanelInfoModel$Extra$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.PUBLICATION;
        $childSerializers = new C01GW[]{null, C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(194)), null, null, null, null, C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(195)), null, null};
    }

    public String getRecID() {
        Extra extra = this.extra;
        if (extra != null) {
            return extra.getRec_id();
        }
        return null;
    }

    @InterfaceC1841100y0i
    public static final class FilterEffect implements Serializable {
        public static final Companion Companion = new Companion();
        public Long Id;
        public Long ReasonCode;
        public String ReasonMsg;

        public FilterEffect() {
            this(null, null, null);
        }

        public static final class Companion {
            public final C13HG<FilterEffect> serializer() {
                return PanelInfoModel$FilterEffect$$serializer.INSTANCE;
            }
        }

        public final Long getId() {
            return this.Id;
        }

        public final Long getReasonCode() {
            return this.ReasonCode;
        }

        public final String getReasonMsg() {
            return this.ReasonMsg;
        }

        public final void setId(Long l) {
            this.Id = l;
        }

        public final void setReasonCode(Long l) {
            this.ReasonCode = l;
        }

        public final void setReasonMsg(String str) {
            this.ReasonMsg = str;
        }

        public FilterEffect(Long l, Long l2, String str) {
            this.Id = l;
            this.ReasonCode = l2;
            this.ReasonMsg = str;
        }

        public static final /* synthetic */ void write$Self$ckresource_model_release(FilterEffect filterEffect, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
            if (interfaceC19986513Hz.LJIJJ() || filterEffect.Id != null) {
                interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 0, C13H6.LIZ, filterEffect.Id);
            }
            if (interfaceC19986513Hz.LJIJJ() || filterEffect.ReasonCode != null) {
                interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 1, C13H6.LIZ, filterEffect.ReasonCode);
            }
            if (interfaceC19986513Hz.LJIJJ() || filterEffect.ReasonMsg != null) {
                interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 2, C13GX.LIZ, filterEffect.ReasonMsg);
            }
        }

        public /* synthetic */ FilterEffect(int i, Long l, Long l2, String str, C19989813Jg c19989813Jg) {
            if (0 == 0) {
                if ((i & 1) == 0) {
                    this.Id = null;
                } else {
                    this.Id = l;
                }
                if ((i & 2) == 0) {
                    this.ReasonCode = null;
                } else {
                    this.ReasonCode = l2;
                }
                if ((i & 4) == 0) {
                    this.ReasonMsg = null;
                    return;
                } else {
                    this.ReasonMsg = str;
                    return;
                }
            }
            C19989713Jf.LIZ(i, 0, PanelInfoModel$FilterEffect$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static final class Companion {
        public final C13HG<PanelInfoModel> serializer() {
            return PanelInfoModel$$serializer.INSTANCE;
        }
    }

    public final CategoryEffectModel getCategoryEffectModel() {
        return this.category_effects;
    }

    public final List<EffectCategoryModel> getCategoryList() {
        return this.category_list;
    }

    public final CategoryEffectModel getCategory_effects() {
        return this.category_effects;
    }

    public final List<EffectCategoryModel> getCategory_list() {
        return this.category_list;
    }

    public final EffectPanelModel getEffect_panel() {
        return this.panel;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public final String getFront_effect_id() {
        return this.front_effect_id;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final EffectPanelModel getPanel() {
        return this.panel;
    }

    public final String getRear_effect_id() {
        return this.rear_effect_id;
    }

    public final List<String> getUrlPrefix() {
        return this.url_prefix;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setCategoryEffectModel(CategoryEffectModel categoryEffectModel) {
        this.category_effects = categoryEffectModel;
    }

    public final void setCategoryList(List<? extends EffectCategoryModel> list) {
        this.category_list = list;
    }

    public final void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        this.category_effects = categoryEffectModel;
    }

    public final void setCategory_list(List<? extends EffectCategoryModel> list) {
        this.category_list = list;
    }

    public final void setEffect_panel(EffectPanelModel effectPanelModel) {
        this.panel = effectPanelModel;
    }

    public final void setExtra(Extra extra) {
        this.extra = extra;
    }

    public final void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public final void setPanel(EffectPanelModel effectPanelModel) {
        this.panel = effectPanelModel;
    }

    public final void setRear_effect_id(String str) {
        this.rear_effect_id = str;
    }

    public final void setUrlPrefix(List<String> list) {
        this.url_prefix = list;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public static final /* synthetic */ void write$Self(PanelInfoModel panelInfoModel, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        C01GW<C13HG<Object>>[] c01gwArr = $childSerializers;
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(panelInfoModel.version, "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 0, panelInfoModel.version);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(panelInfoModel.category_list, new ArrayList())) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), panelInfoModel.category_list);
        }
        if (interfaceC19986513Hz.LJIJJ() || panelInfoModel.category_effects != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 2, CategoryEffectModel$$serializer.INSTANCE, panelInfoModel.category_effects);
        }
        if (interfaceC19986513Hz.LJIJJ() || panelInfoModel.panel != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 3, EffectPanelModel$$serializer.INSTANCE, panelInfoModel.panel);
        }
        if (interfaceC19986513Hz.LJIJJ() || panelInfoModel.front_effect_id != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 4, C13GX.LIZ, panelInfoModel.front_effect_id);
        }
        if (interfaceC19986513Hz.LJIJJ() || panelInfoModel.rear_effect_id != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 5, C13GX.LIZ, panelInfoModel.rear_effect_id);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(panelInfoModel.url_prefix, new ArrayList())) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 6, c01gwArr[6].getValue(), panelInfoModel.url_prefix);
        }
        if (interfaceC19986513Hz.LJIJJ() || panelInfoModel.extra != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 7, PanelInfoModel$Extra$$serializer.INSTANCE, panelInfoModel.extra);
        }
        if (interfaceC19986513Hz.LJIJJ() || panelInfoModel.logId != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 8, C13GX.LIZ, panelInfoModel.logId);
        }
    }

    public PanelInfoModel(String str, List<? extends EffectCategoryModel> list, CategoryEffectModel categoryEffectModel, EffectPanelModel effectPanelModel, String str2, String str3, List<String> list2, Extra extra, String str4) {
        this.version = str;
        this.category_list = list;
        this.category_effects = categoryEffectModel;
        this.panel = effectPanelModel;
        this.front_effect_id = str2;
        this.rear_effect_id = str3;
        this.url_prefix = list2;
        this.extra = extra;
        this.logId = str4;
    }

    public /* synthetic */ PanelInfoModel(int i, String str, List list, CategoryEffectModel categoryEffectModel, EffectPanelModel effectPanelModel, String str2, String str3, List list2, Extra extra, String str4, C19989813Jg c19989813Jg) {
        if (0 == 0) {
            this.version = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.category_list = new ArrayList();
            } else {
                this.category_list = list;
            }
            if ((i & 4) == 0) {
                this.category_effects = null;
            } else {
                this.category_effects = categoryEffectModel;
            }
            if ((i & 8) == 0) {
                this.panel = null;
            } else {
                this.panel = effectPanelModel;
            }
            if ((i & 16) == 0) {
                this.front_effect_id = null;
            } else {
                this.front_effect_id = str2;
            }
            if ((i & 32) == 0) {
                this.rear_effect_id = null;
            } else {
                this.rear_effect_id = str3;
            }
            if ((i & 64) == 0) {
                this.url_prefix = new ArrayList();
            } else {
                this.url_prefix = list2;
            }
            if ((i & 128) == 0) {
                this.extra = null;
            } else {
                this.extra = extra;
            }
            if ((i & 256) == 0) {
                this.logId = null;
                return;
            } else {
                this.logId = str4;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, PanelInfoModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
}
