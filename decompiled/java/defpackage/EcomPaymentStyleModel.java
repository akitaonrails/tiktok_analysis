package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomPaymentStyleModel {

    @C09CT("interact")
    public final Interact interact;

    @C09CT("vision")
    public final Vision vision;

    public EcomPaymentStyleModel() {
        this(new Interact(0), new Vision(0, 1, 1, 0));
    }

    public EcomPaymentStyleModel(Interact interact, Vision vision) {
        this.interact = interact;
        this.vision = vision;
    }
}
