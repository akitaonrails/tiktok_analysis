package com.ss.android.ugc.gamora.editorpro.aiediting.aigc.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AfrItem {

    /* JADX INFO: renamed from: pic, reason: collision with root package name */
    @C09CT("pic")
    public final String f425pic;

    @C09CT("pic_conf")
    public final String picConf;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfrItem)) {
            return false;
        }
        AfrItem afrItem = (AfrItem) obj;
        return Intrinsics.LJFF(this.f425pic, afrItem.f425pic) && Intrinsics.LJFF(this.picConf, afrItem.picConf);
    }

    public final int hashCode() {
        return (this.f425pic.hashCode() * 31) + this.picConf.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AfrItem(pic=");
        sbLIZ.append(this.f425pic);
        sbLIZ.append(", picConf=");
        sbLIZ.append(this.picConf);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AfrItem() {
        this("", "");
    }

    public AfrItem(String str, String str2) {
        this.f425pic = str;
        this.picConf = str2;
    }
}
