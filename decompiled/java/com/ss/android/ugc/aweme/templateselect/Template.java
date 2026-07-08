package com.ss.android.ugc.aweme.templateselect;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class Template {
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Template)) {
            return false;
        }
        Template template = (Template) obj;
        return Intrinsics.LJFF(this.LIZ, template.LIZ) && Intrinsics.LJFF(this.LIZIZ, template.LIZIZ) && this.LIZJ == template.LIZJ && this.LIZLLL == template.LIZLLL;
    }

    public static final class Extras implements Serializable {

        @C09CT("count")
        public final int count;

        @C09CT("cover_img")
        public final String coverImg;

        @C09CT("cover_url")
        public final String coverUrl;

        public Extras() {
            this(0, "", "");
        }

        public Extras(int i, String str, String str2) {
            this.count = i;
            this.coverUrl = str;
            this.coverImg = str2;
        }
    }

    public Template(int i, String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = z;
    }
}
