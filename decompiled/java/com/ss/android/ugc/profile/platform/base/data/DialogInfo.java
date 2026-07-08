package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class DialogInfo implements Serializable {

    @C09CT("buttons")
    public final List<DialogButtonModel> buttons;

    @C09CT("cancel_on_touch_outside")
    public final Boolean cancelOnTouchOutside;

    @C09CT("group_variant")
    public final Integer groupVariant;

    @C09CT("is_vertical")
    public final Boolean isVertical;

    @C09CT("body")
    public final DialogTextModel message;

    @C09CT("title")
    public final DialogTextModel title;

    public final List<DialogButtonModel> getButtons() {
        return this.buttons;
    }

    public final Boolean getCancelOnTouchOutside() {
        return this.cancelOnTouchOutside;
    }

    public final Integer getGroupVariant() {
        return this.groupVariant;
    }

    public final DialogTextModel getMessage() {
        return this.message;
    }

    public final DialogTextModel getTitle() {
        return this.title;
    }

    public final Boolean isVertical() {
        return this.isVertical;
    }
}
