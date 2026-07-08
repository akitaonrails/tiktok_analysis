package com.ss.android.ugc.aweme.music.understanding;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class NodeTag {
    public final String value;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NodeTag m282boximpl(String str) {
        return new NodeTag(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m283constructorimpl(String str) {
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m284equalsimpl(String str, Object obj) {
        return (obj instanceof NodeTag) && Intrinsics.LJFF(str, ((NodeTag) obj).m288unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m285equalsimpl0(String str, String str2) {
        return Intrinsics.LJFF(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m286hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m287toStringimpl(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NodeTag(value=");
        sbLIZ.append(str);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean equals(Object obj) {
        return m284equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m286hashCodeimpl(this.value);
    }

    public String toString() {
        return m287toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m288unboximpl() {
        return this.value;
    }

    public final String getValue() {
        return this.value;
    }

    public /* synthetic */ NodeTag(String str) {
        this.value = str;
    }
}
