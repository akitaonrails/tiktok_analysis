package com.google.protobuf;

import X.C19937312zb;
import X.C19937612ze;
import X.C19939112zt;
import X.C2188811AlT;
import X.EnumC19936912zX;
import X.InterfaceC19915412w4;
import X.InterfaceC19930912yZ;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes31.dex */
public final class p implements InterfaceC19915412w4 {
    public static final Set<String> LIZ;
    public static final C19937312zb LIZIZ;

    static {
        new p();
        LIZ = new HashSet(Arrays.asList("Class", "DefaultInstanceForType", "ParserForType", "SerializedSize", "AllFields", "DescriptorForType", "InitializationErrorString", "UnknownFields", "CachedSize"));
        LIZIZ = new C19937312zb();
    }

    public static InterfaceC19930912yZ LJ(Class<?> cls) {
        try {
            return (InterfaceC19930912yZ) cls.getDeclaredMethod("getDefaultInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unable to get default instance for message class ");
            sbLIZ.append(cls.getName());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public static EnumC19936912zX LJFF(C19939112zt c19939112zt) {
        switch (C19937612ze.LIZJ[c19939112zt.LJJI().ordinal()]) {
            case 1:
                if (!c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.BOOL;
                }
                if (c19939112zt.isPacked()) {
                    return EnumC19936912zX.BOOL_LIST_PACKED;
                }
                return EnumC19936912zX.BOOL_LIST;
            case 2:
                if (c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.BYTES_LIST;
                }
                return EnumC19936912zX.BYTES;
            case 3:
                if (!c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.DOUBLE;
                }
                if (c19939112zt.isPacked()) {
                    return EnumC19936912zX.DOUBLE_LIST_PACKED;
                }
                return EnumC19936912zX.DOUBLE_LIST;
            case 4:
                if (!c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.ENUM;
                }
                if (c19939112zt.isPacked()) {
                    return EnumC19936912zX.ENUM_LIST_PACKED;
                }
                return EnumC19936912zX.ENUM_LIST;
            case 5:
                if (!c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.FIXED32;
                }
                if (c19939112zt.isPacked()) {
                    return EnumC19936912zX.FIXED32_LIST_PACKED;
                }
                return EnumC19936912zX.FIXED32_LIST;
            case 6:
                if (!c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.FIXED64;
                }
                if (c19939112zt.isPacked()) {
                    return EnumC19936912zX.FIXED64_LIST_PACKED;
                }
                return EnumC19936912zX.FIXED64_LIST;
            case 7:
                if (!c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.FLOAT;
                }
                if (c19939112zt.isPacked()) {
                    return EnumC19936912zX.FLOAT_LIST_PACKED;
                }
                return EnumC19936912zX.FLOAT_LIST;
            case 8:
                if (c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.GROUP_LIST;
                }
                return EnumC19936912zX.GROUP;
            case BdTuring.TYPE_ECAF /* 9 */:
                if (!c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.INT32;
                }
                if (c19939112zt.isPacked()) {
                    return EnumC19936912zX.INT32_LIST_PACKED;
                }
                return EnumC19936912zX.INT32_LIST;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                if (!c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.INT64;
                }
                if (c19939112zt.isPacked()) {
                    return EnumC19936912zX.INT64_LIST_PACKED;
                }
                return EnumC19936912zX.INT64_LIST;
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (c19939112zt.LJJIIJ()) {
                    return EnumC19936912zX.MAP;
                }
                if (c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.MESSAGE_LIST;
                }
                return EnumC19936912zX.MESSAGE;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                if (!c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.SFIXED32;
                }
                if (c19939112zt.isPacked()) {
                    return EnumC19936912zX.SFIXED32_LIST_PACKED;
                }
                return EnumC19936912zX.SFIXED32_LIST;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                if (!c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.SFIXED64;
                }
                if (c19939112zt.isPacked()) {
                    return EnumC19936912zX.SFIXED64_LIST_PACKED;
                }
                return EnumC19936912zX.SFIXED64_LIST;
            case 14:
                if (!c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.SINT32;
                }
                if (c19939112zt.isPacked()) {
                    return EnumC19936912zX.SINT32_LIST_PACKED;
                }
                return EnumC19936912zX.SINT32_LIST;
            case 15:
                if (!c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.SINT64;
                }
                if (c19939112zt.isPacked()) {
                    return EnumC19936912zX.SINT64_LIST_PACKED;
                }
                return EnumC19936912zX.SINT64_LIST;
            case 16:
                if (c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.STRING_LIST;
                }
                return EnumC19936912zX.STRING;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                if (!c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.UINT32;
                }
                if (c19939112zt.isPacked()) {
                    return EnumC19936912zX.UINT32_LIST_PACKED;
                }
                return EnumC19936912zX.UINT32_LIST;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                if (!c19939112zt.LJJLJ()) {
                    return EnumC19936912zX.UINT64;
                }
                if (c19939112zt.isPacked()) {
                    return EnumC19936912zX.UINT64_LIST_PACKED;
                }
                return EnumC19936912zX.UINT64_LIST;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unsupported field type: ");
                sbLIZ.append(c19939112zt.LJJI());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static String LJI(String str) {
        String strLJII = LJII(str, false);
        return "get" + Character.toUpperCase(strLJII.charAt(0)) + strLJII.substring(1, strLJII.length());
    }

    @Override // X.InterfaceC19915412w4
    public final boolean LIZ(Class<?> cls) {
        return k0.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v8 */
    @Override // X.InterfaceC19915412w4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC19921712x5 LIZIZ(java.lang.Class<?> r32) {
        /*
            Method dump skipped, instruction units count: 1544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.p.LIZIZ(java.lang.Class):X.12x5");
    }

    public static Field LIZJ(C19939112zt c19939112zt, Class cls) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJII(c19939112zt.LJIIIZ(), false));
        sbLIZ.append("MemoizedSerializedSize");
        return LIZLLL(cls, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Field LIZLLL(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unable to find field ");
            sbLIZ.append(str);
            sbLIZ.append(" in message class ");
            sbLIZ.append(cls.getName());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public static String LJII(String str, boolean z) {
        StringBuilder sb = new StringBuilder(str.length() + 1);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '_') {
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                    z = true;
                } else if (z) {
                    sb.append(Character.toUpperCase(cCharAt));
                    z = false;
                } else if (i == 0) {
                    sb.append(Character.toLowerCase(cCharAt));
                } else {
                    sb.append(cCharAt);
                }
            } else {
                z = true;
            }
        }
        return sb.toString();
    }
}
