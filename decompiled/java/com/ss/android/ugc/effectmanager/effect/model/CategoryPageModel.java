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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public class CategoryPageModel implements Serializable {
    public CategoryEffectModel category_effects;
    public Extra extra;
    public boolean isCache;
    public List<String> url_prefix;
    public static final Companion Companion = new Companion();
    public static final C01GW<C13HG<Object>>[] $childSerializers = {null, C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS219S0000000_30.get$arr$(165)), null, null};

    public CategoryPageModel() {
        this(null, new ArrayList(), null);
    }

    @InterfaceC1841100y0i
    public static final class Extra implements Serializable {
        public int creation_mode_count;
        public String effect_recommend;
        public List<FilterEffect> filtered_effects;
        public String rec_id;
        public static final Companion Companion = new Companion();
        public static final C01GW<C13HG<Object>>[] $childSerializers = {null, C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS219S0000000_30.get$arr$(166)), null, null};

        public Extra() {
            this.rec_id = "";
            this.effect_recommend = "";
        }

        public static final class Companion {
            public final C13HG<Extra> serializer() {
                return CategoryPageModel$Extra$$serializer.INSTANCE;
            }
        }

        public final int getCreation_mode_count() {
            return this.creation_mode_count;
        }

        public final String getEffect_recommend() {
            return this.effect_recommend;
        }

        public final List<FilterEffect> getFiltered_effects() {
            return this.filtered_effects;
        }

        public final String getRec_id() {
            return this.rec_id;
        }

        public final void setCreation_mode_count(int i) {
            this.creation_mode_count = i;
        }

        public final void setEffect_recommend(String str) {
            this.effect_recommend = str;
        }

        public final void setFiltered_effects(List<FilterEffect> list) {
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
            if (interfaceC19986513Hz.LJIJJ() || extra.creation_mode_count != 0) {
                interfaceC19986513Hz.LJ(3, extra.creation_mode_count, interfaceC19983313Gt);
            }
        }

        public /* synthetic */ Extra(int i, String str, List list, String str2, int i2, C19989813Jg c19989813Jg) {
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
                } else {
                    this.effect_recommend = str2;
                }
                if ((i & 8) == 0) {
                    this.creation_mode_count = 0;
                    return;
                } else {
                    this.creation_mode_count = i2;
                    return;
                }
            }
            C19989713Jf.LIZ(i, 0, CategoryPageModel$Extra$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public String getRecId() {
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
                return CategoryPageModel$FilterEffect$$serializer.INSTANCE;
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
            C19989713Jf.LIZ(i, 0, CategoryPageModel$FilterEffect$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static final class Companion {
        public final C13HG<CategoryPageModel> serializer() {
            return CategoryPageModel$$serializer.INSTANCE;
        }
    }

    public final CategoryEffectModel getCategoryEffects() {
        return this.category_effects;
    }

    public final CategoryEffectModel getCategory_effects() {
        return this.category_effects;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }

    public final void setCategoryEffects(CategoryEffectModel categoryEffectModel) {
        this.category_effects = categoryEffectModel;
    }

    public final void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        this.category_effects = categoryEffectModel;
    }

    public final void setExtra(Extra extra) {
        this.extra = extra;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public CategoryPageModel(CategoryEffectModel categoryEffectModel, List<String> list, Extra extra) {
        this.category_effects = categoryEffectModel;
        this.url_prefix = list;
        this.extra = extra;
    }

    public static final /* synthetic */ void write$Self(CategoryPageModel categoryPageModel, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        C01GW<C13HG<Object>>[] c01gwArr = $childSerializers;
        if (interfaceC19986513Hz.LJIJJ() || categoryPageModel.category_effects != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 0, CategoryEffectModel$$serializer.INSTANCE, categoryPageModel.category_effects);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(categoryPageModel.url_prefix, new ArrayList())) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), categoryPageModel.url_prefix);
        }
        if (interfaceC19986513Hz.LJIJJ() || categoryPageModel.extra != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 2, CategoryPageModel$Extra$$serializer.INSTANCE, categoryPageModel.extra);
        }
        if (interfaceC19986513Hz.LJIJJ() || categoryPageModel.isCache) {
            interfaceC19986513Hz.LJIIJ(interfaceC19983313Gt, 3, categoryPageModel.isCache);
        }
    }

    public /* synthetic */ CategoryPageModel(int i, CategoryEffectModel categoryEffectModel, List list, Extra extra, boolean z, C19989813Jg c19989813Jg) {
        if (0 == 0) {
            if ((i & 1) == 0) {
                this.category_effects = null;
            } else {
                this.category_effects = categoryEffectModel;
            }
            if ((i & 2) == 0) {
                this.url_prefix = new ArrayList();
            } else {
                this.url_prefix = list;
            }
            if ((i & 4) == 0) {
                this.extra = null;
            } else {
                this.extra = extra;
            }
            if ((i & 8) == 0) {
                this.isCache = false;
                return;
            } else {
                this.isCache = z;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, CategoryPageModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
}
