package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    public static abstract class a {
    }

    public abstract boolean LIZ();

    public abstract int LIZIZ();

    public static z LIZJ() {
        y yVar = new y();
        byte b = (byte) (((byte) (yVar.LIZ | 1)) | 2);
        yVar.LIZ = b;
        if (b == 3) {
            return new z(0, false);
        }
        StringBuilder sb = new StringBuilder();
        if ((yVar.LIZ & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((yVar.LIZ & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
