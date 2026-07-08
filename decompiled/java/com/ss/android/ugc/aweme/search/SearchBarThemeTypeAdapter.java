package com.ss.android.ugc.aweme.search;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C0QNH;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SearchBarThemeTypeAdapter extends TypeAdapter<C0QNH> {
    @Override // com.google.gson.TypeAdapter
    public final C0QNH read(C09CU c09cu) {
        C09D6 c09d6LJJLIIIJ;
        if (c09cu != null && (c09d6LJJLIIIJ = c09cu.LJJLIIIJ()) != null) {
            if (c09d6LJJLIIIJ == C09D6.NULL) {
                c09cu.LJJJJJL();
            } else {
                String strLJJJZ = c09cu.LJJJZ();
                C0QNH.Companion.getClass();
                if (strLJJJZ != null) {
                    for (C0QNH c0qnh : C0QNH.getEntries()) {
                        if (Intrinsics.LJFF(c0qnh.getValue(), strLJJJZ)) {
                            return c0qnh;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, C0QNH c0qnh) {
        C0QNH c0qnh2 = c0qnh;
        if (c0qnh2 == null) {
            if (c09dl != null) {
                c09dl.LJIJJ();
            }
        } else {
            if (c09dl == null) {
                return;
            }
            c09dl.LJJJJJ(c0qnh2.getValue());
        }
    }
}
