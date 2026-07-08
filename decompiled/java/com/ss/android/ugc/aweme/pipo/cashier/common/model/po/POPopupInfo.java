package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C08FF;
import X.C09CT;
import X.C2188811AlT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class POPopupInfo {

    @C09CT("type")
    public final Type type;

    @C09CT("url")
    public final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final /* synthetic */ Type[] LL;
        public static final /* synthetic */ C2254308sP LLILLJJLI;

        @C09CT("url")
        public static final Type URL;

        public static InterfaceC2044707zh<Type> getEntries() {
            return LLILLJJLI;
        }

        static {
            Type type = new Type("URL", 0);
            URL = type;
            Type[] typeArr = {type};
            LL = typeArr;
            LLILLJJLI = new C2254308sP(typeArr);
        }

        public static Type[] values() {
            return (Type[]) LL.clone();
        }

        public static Type valueOf(String str) {
            return (Type) C08FF.LIZ(Type.class, str);
        }

        public Type(String str, int i) {
        }
    }

    public POPopupInfo() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POPopupInfo)) {
            return false;
        }
        POPopupInfo pOPopupInfo = (POPopupInfo) obj;
        return this.type == pOPopupInfo.type && Intrinsics.LJFF(this.url, pOPopupInfo.url);
    }

    public final int hashCode() {
        Type type = this.type;
        int iHashCode = (type == null ? 0 : type.hashCode()) * 31;
        String str = this.url;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POPopupInfo(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public POPopupInfo(Type type, String str) {
        this.type = type;
        this.url = str;
    }
}
