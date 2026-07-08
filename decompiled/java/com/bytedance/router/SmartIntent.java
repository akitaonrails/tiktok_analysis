package com.bytedance.router;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.mt.protector.impl.string2number.CastShortProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class SmartIntent extends Intent {
    @Override // android.content.Intent
    public Uri getData() {
        return super.getData();
    }

    @Override // android.content.Intent
    public Bundle getExtras() {
        return INVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
    }

    public SmartIntent(Intent intent) {
        super(intent);
    }

    public static Bundle INVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return super.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean isSmartIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent instanceof SmartIntent;
    }

    public static Intent smartIntent(Intent intent) {
        if (intent == null || (intent instanceof SmartIntent)) {
            return intent;
        }
        return new SmartIntent(intent);
    }

    public static Object INVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    @Override // android.content.Intent
    public boolean getBooleanExtra(String str, boolean z) {
        Object objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return z;
        }
        if (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Boolean.parseBoolean((String) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Boolean", Boolean.valueOf(z), e);
                return z;
            }
        }
        try {
            return ((Boolean) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).booleanValue();
        } catch (ClassCastException e2) {
            TryCatchGuardChecker.doCheck(e2);
            typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Boolean", Boolean.valueOf(z), e2);
            return z;
        }
    }

    @Override // android.content.Intent
    public byte getByteExtra(String str, byte b) {
        Object objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return b;
        }
        if (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Byte.parseByte((String) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Byte", Byte.valueOf(b), e);
                return b;
            }
        }
        try {
            return ((Byte) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).byteValue();
        } catch (ClassCastException e2) {
            TryCatchGuardChecker.doCheck(e2);
            typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Byte", Byte.valueOf(b), e2);
            return b;
        }
    }

    @Override // android.content.Intent
    public char getCharExtra(String str, char c) {
        Object objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return c;
        }
        if (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            String str2 = (String) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
            if (str2.length() == 1) {
                return str2.charAt(0);
            }
            typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Char", Character.valueOf(c), null);
            return c;
        }
        try {
            return ((Character) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).charValue();
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Char", Character.valueOf(c), e);
            return c;
        }
    }

    @Override // android.content.Intent
    public double getDoubleExtra(String str, double d) {
        Object objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return d;
        }
        if (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return CastDoubleProtector.parseDouble((String) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Double", Double.valueOf(d), e);
                return d;
            }
        }
        try {
            return ((Double) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).doubleValue();
        } catch (ClassCastException e2) {
            TryCatchGuardChecker.doCheck(e2);
            typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Double", Double.valueOf(d), e2);
            return d;
        }
    }

    @Override // android.content.Intent
    public float getFloatExtra(String str, float f) {
        Object objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return f;
        }
        if (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return CastFloatProtector.parseFloat((String) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Float", Float.valueOf(f), e);
                return f;
            }
        }
        try {
            return ((Float) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).floatValue();
        } catch (ClassCastException e2) {
            TryCatchGuardChecker.doCheck(e2);
            typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Float", Float.valueOf(f), e2);
            return f;
        }
    }

    @Override // android.content.Intent
    public int getIntExtra(String str, int i) {
        Object objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return i;
        }
        if (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return CastIntegerProtector.parseInt((String) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Integer", Integer.valueOf(i), e);
                return i;
            }
        }
        try {
            return ((Integer) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).intValue();
        } catch (ClassCastException e2) {
            TryCatchGuardChecker.doCheck(e2);
            typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Integer", Integer.valueOf(i), e2);
            return i;
        }
    }

    @Override // android.content.Intent
    public long getLongExtra(String str, long j) {
        Object objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return j;
        }
        if (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return CastLongProtector.parseLong((String) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Long", Long.valueOf(j), e);
                return j;
            }
        }
        try {
            return ((Long) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).longValue();
        } catch (ClassCastException e2) {
            TryCatchGuardChecker.doCheck(e2);
            typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Long", Long.valueOf(j), e2);
            return j;
        }
    }

    @Override // android.content.Intent
    public short getShortExtra(String str, short s) {
        Object objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this);
        if (bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKESPECIAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return s;
        }
        if (objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Short.valueOf(CastShortProtector.parseShort((String) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get)).shortValue();
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Short", Short.valueOf(s), e);
                return s;
            }
        }
        try {
            return ((Short) objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).shortValue();
        } catch (ClassCastException e2) {
            TryCatchGuardChecker.doCheck(e2);
            typeWarning(str, objINVOKEVIRTUAL_com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Short", Short.valueOf(s), e2);
            return s;
        }
    }

    private void typeWarning(String str, Object obj, String str2, Object obj2, RuntimeException runtimeException) {
        obj.getClass();
        Objects.toString(obj2);
    }
}
