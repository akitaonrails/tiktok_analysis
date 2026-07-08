package com.orbu.core;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class TTKOrbuConstants {
    public static final TTKOrbuConstants INSTANCE = new TTKOrbuConstants();

    public final boolean isTransitionDFID(String str) {
        if (!Intrinsics.LJFF(str, "672137215") && !Intrinsics.LJFF(str, "671088895") && !Intrinsics.LJFF(str, "671088640") && !Intrinsics.LJFF(str, "738197504") && !Intrinsics.LJFF(str, "134217728")) {
            return false;
        }
        return true;
    }
}
