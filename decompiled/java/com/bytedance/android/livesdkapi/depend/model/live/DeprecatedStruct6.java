package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class DeprecatedStruct6 {

    @C09CT("deprecated1")
    public DeprecatedStruct7 deprecated1;

    @C09CT("deprecated10")
    public String deprecated10;

    @C09CT("deprecated11")
    public ImageModel deprecated11;

    @C09CT("deprecated2")
    public DeprecatedStruct7 deprecated2;

    @C09CT("deprecated3")
    public String deprecated3;

    @C09CT("deprecated4")
    public String deprecated4;

    @C09CT("deprecated5")
    public String deprecated5;

    @C09CT("deprecated6")
    public String deprecated6;

    @C09CT("deprecated7")
    public String deprecated7;

    @C09CT("deprecated8")
    public ImageModel deprecated8;

    @C09CT("deprecated9")
    public ImageModel deprecated9;

    public static final class DeprecatedStruct7 {

        @C09CT("deprecated1")
        public String deprecated1;

        @C09CT("deprecated2")
        public String deprecated2;

        @C09CT("deprecated3")
        public String deprecated3;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.deprecated1 != null) {
                sb.append(", deprecated1=");
                sb.append(this.deprecated1);
            }
            if (this.deprecated2 != null) {
                sb.append(", deprecated2=");
                sb.append(this.deprecated2);
            }
            if (this.deprecated3 != null) {
                sb.append(", deprecated3=");
                sb.append(this.deprecated3);
            }
            sb.replace(0, 2, "DeprecatedStruct7{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.deprecated1 != null) {
            sb.append(", deprecated1=");
            sb.append(this.deprecated1);
        }
        if (this.deprecated2 != null) {
            sb.append(", deprecated2=");
            sb.append(this.deprecated2);
        }
        if (this.deprecated3 != null) {
            sb.append(", deprecated3=");
            sb.append(this.deprecated3);
        }
        if (this.deprecated4 != null) {
            sb.append(", deprecated4=");
            sb.append(this.deprecated4);
        }
        if (this.deprecated5 != null) {
            sb.append(", deprecated5=");
            sb.append(this.deprecated5);
        }
        if (this.deprecated6 != null) {
            sb.append(", deprecated6=");
            sb.append(this.deprecated6);
        }
        if (this.deprecated7 != null) {
            sb.append(", deprecated7=");
            sb.append(this.deprecated7);
        }
        if (this.deprecated8 != null) {
            sb.append(", deprecated8=");
            sb.append(this.deprecated8);
        }
        if (this.deprecated9 != null) {
            sb.append(", deprecated9=");
            sb.append(this.deprecated9);
        }
        if (this.deprecated10 != null) {
            sb.append(", deprecated10=");
            sb.append(this.deprecated10);
        }
        if (this.deprecated11 != null) {
            sb.append(", deprecated11=");
            sb.append(this.deprecated11);
        }
        sb.replace(0, 2, "DeprecatedStruct6{");
        sb.append('}');
        return sb.toString();
    }
}
