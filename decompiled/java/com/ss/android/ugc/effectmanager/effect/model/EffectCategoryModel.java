package com.ss.android.ugc.effectmanager.effect.model;

import X.C01GW;
import X.C13GX;
import X.C13HG;
import X.C19989713Jf;
import X.C19989813Jg;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC1841100y0i;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986513Hz;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel$$serializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public class EffectCategoryModel implements Serializable {
    public static final C01GW<C13HG<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public List<String> effects;
    public String extra;
    public UrlModel icon;
    public UrlModel icon_selected;
    public String id;
    public boolean is_default;
    public String key;
    public String name;
    public List<String> tags;
    public String tags_updated_at;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectCategoryModel() {
        this((String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (UrlModel) (0 == true ? 1 : 0), (UrlModel) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), false, (String) (0 == true ? 1 : 0), 1023, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.PUBLICATION;
        $childSerializers = new C01GW[]{null, null, null, null, null, C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(182)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(183)), null, null, null};
    }

    public final boolean checkValued() {
        if (this.icon == null) {
            this.icon = new UrlModel(new ArrayList(), null, null, null, null);
        }
        if (this.icon == null) {
            return false;
        }
        if (this.icon_selected == null) {
            this.icon_selected = new UrlModel(new ArrayList(), null, null, null, null);
        }
        if (this.icon_selected == null) {
            return false;
        }
        return !Intrinsics.LJFF(this.id, "");
    }

    public static final class Companion {
        public final C13HG<EffectCategoryModel> serializer() {
            return EffectCategoryModel$$serializer.INSTANCE;
        }
    }

    public final List<String> getEffects() {
        return this.effects;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final UrlModel getIcon_selected() {
        return this.icon_selected;
    }

    public final String getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTagsUpdateTime() {
        return this.tags_updated_at;
    }

    public final String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public final boolean isDefault() {
        return this.is_default;
    }

    public final boolean is_default() {
        return this.is_default;
    }

    public final void setDefault(boolean z) {
        this.is_default = z;
    }

    public final void setEffects(List<String> list) {
        this.effects = list;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setIcon_selected(UrlModel urlModel) {
        this.icon_selected = urlModel;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setIsDefault(boolean z) {
        this.is_default = z;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTagsUpdateTime(String str) {
        this.tags_updated_at = str;
    }

    public final void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public final void set_default(boolean z) {
        this.is_default = z;
    }

    public static final /* synthetic */ void write$Self(EffectCategoryModel effectCategoryModel, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        C01GW<C13HG<Object>>[] c01gwArr = $childSerializers;
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effectCategoryModel.id, "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 0, effectCategoryModel.id);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effectCategoryModel.name, "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 1, effectCategoryModel.name);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effectCategoryModel.key, "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 2, effectCategoryModel.key);
        }
        if (interfaceC19986513Hz.LJIJJ() || effectCategoryModel.icon != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 3, UrlModel$$serializer.INSTANCE, effectCategoryModel.icon);
        }
        if (interfaceC19986513Hz.LJIJJ() || effectCategoryModel.icon_selected != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 4, UrlModel$$serializer.INSTANCE, effectCategoryModel.icon_selected);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effectCategoryModel.effects, new ArrayList())) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 5, c01gwArr[5].getValue(), effectCategoryModel.effects);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effectCategoryModel.tags, new ArrayList())) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 6, c01gwArr[6].getValue(), effectCategoryModel.tags);
        }
        if (interfaceC19986513Hz.LJIJJ() || effectCategoryModel.tags_updated_at != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 7, C13GX.LIZ, effectCategoryModel.tags_updated_at);
        }
        if (interfaceC19986513Hz.LJIJJ() || effectCategoryModel.is_default) {
            interfaceC19986513Hz.LJIIJ(interfaceC19983313Gt, 8, effectCategoryModel.is_default);
        }
        if (interfaceC19986513Hz.LJIJJ() || effectCategoryModel.extra != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 9, C13GX.LIZ, effectCategoryModel.extra);
        }
    }

    public EffectCategoryModel(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, List<String> list, List<String> list2, String str4, boolean z, String str5) {
        this.id = str;
        this.name = str2;
        this.key = str3;
        this.icon = urlModel;
        this.icon_selected = urlModel2;
        this.effects = list;
        this.tags = list2;
        this.tags_updated_at = str4;
        this.is_default = z;
        this.extra = str5;
    }

    public /* synthetic */ EffectCategoryModel(int i, String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, List list, List list2, String str4, boolean z, String str5, C19989813Jg c19989813Jg) {
        if (0 == 0) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 4) == 0) {
                this.key = "";
            } else {
                this.key = str3;
            }
            if ((i & 8) == 0) {
                this.icon = null;
            } else {
                this.icon = urlModel;
            }
            if ((i & 16) == 0) {
                this.icon_selected = null;
            } else {
                this.icon_selected = urlModel2;
            }
            if ((i & 32) == 0) {
                this.effects = new ArrayList();
            } else {
                this.effects = list;
            }
            if ((i & 64) == 0) {
                this.tags = new ArrayList();
            } else {
                this.tags = list2;
            }
            if ((i & 128) == 0) {
                this.tags_updated_at = null;
            } else {
                this.tags_updated_at = str4;
            }
            if ((i & 256) == 0) {
                this.is_default = false;
            } else {
                this.is_default = z;
            }
            if ((i & 512) == 0) {
                this.extra = null;
                return;
            } else {
                this.extra = str5;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, EffectCategoryModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public /* synthetic */ EffectCategoryModel(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, List list, List list2, String str4, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : urlModel, (i & 16) != 0 ? null : urlModel2, (i & 32) != 0 ? new ArrayList() : list, (i & 64) != 0 ? new ArrayList() : list2, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? false : z, (i & 512) == 0 ? str5 : null);
    }
}
