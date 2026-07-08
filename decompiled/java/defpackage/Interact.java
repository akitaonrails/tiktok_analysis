package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class Interact {

    @C09CT("ccdcInteract")
    public final Integer _ccdcInteract;

    public Interact() {
        this(0);
    }

    public final boolean LIZ() {
        Integer num = this._ccdcInteract;
        if (num == null) {
            Interact interact = w1.LIZIZ.interact;
            if (interact == null) {
                interact = new Interact(0);
            }
            num = interact._ccdcInteract;
            if (num == null) {
                return false;
            }
        }
        return num.intValue() == 1;
    }

    public Interact(Integer num) {
        this._ccdcInteract = num;
    }
}
