package com.ss.android.ugc.aweme.tools.sticker.core.text.util;

import X.C09CT;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class Content {

    @C09CT("gradient")
    public Gradient gradient;

    @C09CT("render_type")
    public String renderType;

    @C09CT("solid")
    public Solid solid;

    @C09CT("texture")
    public Texture texture;

    /* JADX WARN: Multi-variable type inference failed */
    public Content() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public Content(String str, Gradient gradient, Solid solid, Texture texture) {
        this.renderType = str;
        this.gradient = gradient;
        this.solid = solid;
        this.texture = texture;
    }

    public /* synthetic */ Content(String str, Gradient gradient, Solid solid, Texture texture, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : gradient, (i & 4) != 0 ? null : solid, (i & 8) != 0 ? null : texture);
    }
}
