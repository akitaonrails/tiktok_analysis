package com.bytedance.pia.core;

import X.C09CT;
import X.C2188811AlT;
import android.net.Uri;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes35.dex */
public final class PiaManifest {
    public static final Gson LJI = new Gson();
    public final Uri LIZ;
    public final String LIZIZ;
    public final Uri LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public static final class InlineManifest {

        @C09CT("nsr")
        public Boolean nsr;

        @C09CT("page_name")
        public String pageName;

        @C09CT("public_path")
        public String publicPath;

        @C09CT("snapshot")
        public Boolean snapshot;

        @C09CT("worker")
        public Boolean worker;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("InlineManifest(worker=");
            sbLIZ.append(this.worker);
            sbLIZ.append(", publicPath=");
            sbLIZ.append(this.publicPath);
            sbLIZ.append(", pageName=");
            sbLIZ.append(this.pageName);
            sbLIZ.append(", snapshot=");
            sbLIZ.append(this.snapshot);
            sbLIZ.append(", nsr=");
            sbLIZ.append(this.nsr);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public InlineManifest(Boolean bool, String str, String str2, Boolean bool2, Boolean bool3) {
            this.worker = bool;
            this.publicPath = str;
            this.pageName = str2;
            this.snapshot = bool2;
            this.nsr = bool3;
        }
    }

    public PiaManifest(Uri uri, String str, Uri uri2, boolean z, boolean z2, boolean z3) {
        this.LIZ = uri;
        this.LIZIZ = str;
        this.LIZJ = uri2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
    }
}
