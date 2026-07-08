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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public class EffectPanelModel implements Serializable {
    public String extra;
    public UrlModel icon;
    public String id;
    public List<String> tags;
    public String tags_updated_at;
    public String text;
    public static final Companion Companion = new Companion();
    public static final C01GW<C13HG<Object>>[] $childSerializers = {null, null, null, C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS219S0000000_30.get$arr$(187)), null, null};

    public EffectPanelModel() {
        this(null, null, new UrlModel(new ArrayList(), null, null, null, null), new ArrayList(), null, null);
    }

    public final boolean checkValued() {
        if (this.icon != null) {
            return true;
        }
        this.icon = new UrlModel(new ArrayList(), null, null, null, null);
        return true;
    }

    public static final class Companion {
        public final C13HG<EffectPanelModel> serializer() {
            return EffectPanelModel$$serializer.INSTANCE;
        }
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public final String getText() {
        return this.text;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public static final /* synthetic */ void write$Self(EffectPanelModel effectPanelModel, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        C01GW<C13HG<Object>>[] c01gwArr = $childSerializers;
        if (interfaceC19986513Hz.LJIJJ() || effectPanelModel.text != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 0, C13GX.LIZ, effectPanelModel.text);
        }
        if (interfaceC19986513Hz.LJIJJ() || effectPanelModel.id != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 1, C13GX.LIZ, effectPanelModel.id);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effectPanelModel.icon, new UrlModel(new ArrayList(), null, null, null, null))) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 2, UrlModel$$serializer.INSTANCE, effectPanelModel.icon);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effectPanelModel.tags, new ArrayList())) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 3, c01gwArr[3].getValue(), effectPanelModel.tags);
        }
        if (interfaceC19986513Hz.LJIJJ() || effectPanelModel.tags_updated_at != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 4, C13GX.LIZ, effectPanelModel.tags_updated_at);
        }
        if (interfaceC19986513Hz.LJIJJ() || effectPanelModel.extra != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 5, C13GX.LIZ, effectPanelModel.extra);
        }
    }

    public EffectPanelModel(String str, String str2, UrlModel urlModel, List<String> list, String str3, String str4) {
        this.text = str;
        this.id = str2;
        this.icon = urlModel;
        this.tags = list;
        this.tags_updated_at = str3;
        this.extra = str4;
    }

    public /* synthetic */ EffectPanelModel(int i, String str, String str2, UrlModel urlModel, List list, String str3, String str4, C19989813Jg c19989813Jg) {
        UrlModel urlModel2 = urlModel;
        if (0 == 0) {
            if ((i & 1) == 0) {
                this.text = null;
            } else {
                this.text = str;
            }
            if ((i & 2) == 0) {
                this.id = null;
            } else {
                this.id = str2;
            }
            this.icon = (i & 4) == 0 ? new UrlModel(new ArrayList(), null, null, null, null) : urlModel2;
            this.tags = (i & 8) == 0 ? new ArrayList() : list;
            if ((i & 16) == 0) {
                this.tags_updated_at = null;
            } else {
                this.tags_updated_at = str3;
            }
            if ((i & 32) == 0) {
                this.extra = null;
                return;
            } else {
                this.extra = str4;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, EffectPanelModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
}
