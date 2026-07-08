package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class Vision {

    @C09CT("checkBoxPos")
    public final Integer _checkBoxPos;

    @C09CT("hasSASAButton")
    public final Integer _hasSASAButton;

    @C09CT("ospEmptyMethodStyle")
    public final Integer _ospEmptyMethodStyle;

    @C09CT("saveCardPos")
    public final Integer _saveCardPos;

    public Vision() {
        this(0, 1, 1, 0);
    }

    public Vision(Integer num, Integer num2, Integer num3, Integer num4) {
        this._checkBoxPos = num;
        this._saveCardPos = num2;
        this._hasSASAButton = num3;
        this._ospEmptyMethodStyle = num4;
    }
}
