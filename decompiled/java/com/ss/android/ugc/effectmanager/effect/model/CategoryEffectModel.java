package com.ss.android.ugc.effectmanager.effect.model;

import X.C01GW;
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
public class CategoryEffectModel implements Serializable {
    public static final C01GW<C13HG<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public List<? extends Effect> bind_effects;
    public String category_key;
    public List<? extends Effect> collection;
    public int creation_mode_count;
    public int cursor;
    public List<? extends Effect> effects;
    public boolean has_more;
    public boolean isCache;
    public int sorting_position;
    public String version;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.PUBLICATION;
        $childSerializers = new C01GW[]{null, null, null, null, null, C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(162)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(163)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(164)), null, null};
    }

    public CategoryEffectModel() {
        this("", "", false, 0, 0, new ArrayList(), new ArrayList(), new ArrayList(), 0);
    }

    public final CategoryEffectModel copy() {
        return new CategoryEffectModel(this.category_key, this.version, this.has_more, this.cursor, this.sorting_position, this.collection, this.effects, this.bind_effects, this.creation_mode_count);
    }

    public static final class Companion {
        public final C13HG<CategoryEffectModel> serializer() {
            return CategoryEffectModel$$serializer.INSTANCE;
        }
    }

    public final List<Effect> getBindEffects() {
        return this.bind_effects;
    }

    public final List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    public final String getCategoryKey() {
        return this.category_key;
    }

    public final List<Effect> getCategory_effects() {
        return this.effects;
    }

    public final String getCategory_key() {
        return this.category_key;
    }

    public final List<Effect> getCollectEffects() {
        return this.collection;
    }

    public final List<Effect> getCollection() {
        return this.collection;
    }

    public final int getCreation_mode_count() {
        return this.creation_mode_count;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final List<Effect> getEffects() {
        return this.effects;
    }

    public final boolean getHasMore() {
        return this.has_more;
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    public final int getSortingPosition() {
        return this.sorting_position;
    }

    public final int getSorting_position() {
        return this.sorting_position;
    }

    public final String getVersion() {
        return this.version;
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public final void setBindEffects(List<? extends Effect> list) {
        this.bind_effects = list;
    }

    public final void setBind_effects(List<? extends Effect> list) {
        this.bind_effects = list;
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }

    public final void setCategoryKey(String str) {
        this.category_key = str;
    }

    public final void setCategory_effects(List<? extends Effect> list) {
        this.effects = list;
    }

    public final void setCategory_key(String str) {
        this.category_key = str;
    }

    public final void setCollectEffects(List<? extends Effect> list) {
        this.collection = list;
    }

    public final void setCollection(List<? extends Effect> list) {
        this.collection = list;
    }

    public final void setCreation_mode_count(int i) {
        this.creation_mode_count = i;
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public final void setEffects(List<? extends Effect> list) {
        this.effects = list;
    }

    public final void setHasMore(boolean z) {
        this.has_more = z;
    }

    public final void setHas_more(boolean z) {
        this.has_more = z;
    }

    public final void setSortingPosition(int i) {
        this.sorting_position = i;
    }

    public final void setSorting_position(int i) {
        this.sorting_position = i;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public static final /* synthetic */ void write$Self(CategoryEffectModel categoryEffectModel, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        C01GW<C13HG<Object>>[] c01gwArr = $childSerializers;
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(categoryEffectModel.category_key, "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 0, categoryEffectModel.category_key);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(categoryEffectModel.version, "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 1, categoryEffectModel.version);
        }
        if (interfaceC19986513Hz.LJIJJ() || categoryEffectModel.has_more) {
            interfaceC19986513Hz.LJIIJ(interfaceC19983313Gt, 2, categoryEffectModel.has_more);
        }
        if (interfaceC19986513Hz.LJIJJ() || categoryEffectModel.cursor != 0) {
            interfaceC19986513Hz.LJ(3, categoryEffectModel.cursor, interfaceC19983313Gt);
        }
        if (interfaceC19986513Hz.LJIJJ() || categoryEffectModel.sorting_position != 0) {
            interfaceC19986513Hz.LJ(4, categoryEffectModel.sorting_position, interfaceC19983313Gt);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(categoryEffectModel.collection, new ArrayList())) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 5, c01gwArr[5].getValue(), categoryEffectModel.collection);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(categoryEffectModel.effects, new ArrayList())) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 6, c01gwArr[6].getValue(), categoryEffectModel.effects);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(categoryEffectModel.bind_effects, new ArrayList())) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 7, c01gwArr[7].getValue(), categoryEffectModel.bind_effects);
        }
        if (interfaceC19986513Hz.LJIJJ() || categoryEffectModel.creation_mode_count != 0) {
            interfaceC19986513Hz.LJ(8, categoryEffectModel.creation_mode_count, interfaceC19983313Gt);
        }
        if (interfaceC19986513Hz.LJIJJ() || categoryEffectModel.isCache) {
            interfaceC19986513Hz.LJIIJ(interfaceC19983313Gt, 9, categoryEffectModel.isCache);
        }
    }

    public CategoryEffectModel(String str, String str2, boolean z, int i, int i2, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3, int i3) {
        this.category_key = str;
        this.version = str2;
        this.has_more = z;
        this.cursor = i;
        this.sorting_position = i2;
        this.collection = list;
        this.effects = list2;
        this.bind_effects = list3;
        this.creation_mode_count = i3;
    }

    public /* synthetic */ CategoryEffectModel(int i, String str, String str2, boolean z, int i2, int i3, List list, List list2, List list3, int i4, boolean z2, C19989813Jg c19989813Jg) {
        if (0 == 0) {
            if ((i & 1) == 0) {
                this.category_key = "";
            } else {
                this.category_key = str;
            }
            if ((i & 2) == 0) {
                this.version = "";
            } else {
                this.version = str2;
            }
            if ((i & 4) == 0) {
                this.has_more = false;
            } else {
                this.has_more = z;
            }
            if ((i & 8) == 0) {
                this.cursor = 0;
            } else {
                this.cursor = i2;
            }
            if ((i & 16) == 0) {
                this.sorting_position = 0;
            } else {
                this.sorting_position = i3;
            }
            if ((i & 32) == 0) {
                this.collection = new ArrayList();
            } else {
                this.collection = list;
            }
            if ((i & 64) == 0) {
                this.effects = new ArrayList();
            } else {
                this.effects = list2;
            }
            if ((i & 128) == 0) {
                this.bind_effects = new ArrayList();
            } else {
                this.bind_effects = list3;
            }
            if ((i & 256) == 0) {
                this.creation_mode_count = 0;
            } else {
                this.creation_mode_count = i4;
            }
            if ((i & 512) == 0) {
                this.isCache = false;
                return;
            } else {
                this.isCache = z2;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, CategoryEffectModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
}
