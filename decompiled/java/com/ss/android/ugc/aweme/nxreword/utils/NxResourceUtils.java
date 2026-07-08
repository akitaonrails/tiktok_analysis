package com.ss.android.ugc.aweme.nxreword.utils;

import X.C0WZX;
import X.C13LE;
import X.C1AF0;
import X.C21411718qp;
import X.C2204961BRm;
import X.C786410Ut5;
import android.R;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class NxResourceUtils {
    public static Method getImplMethod;
    public static Method getPluralRuleMethod;
    public static Object nativePluralRulesObject;
    public static Method pluralRulemethod;
    public static Class<?> resourceImplClass;
    public static Class<?> resourceManagerClass;
    public static Class<?> resourcesClass;
    public static Method setImplMethod;
    public static Method stringForQuantityCodeMethod;
    public static final NxResourceUtils INSTANCE = new NxResourceUtils();
    public static boolean InitReflectError = true;
    public static final int[] textViewAttrs = {R.attr.text, R.attr.hint, R.attr.textOn, R.attr.textOff};

    public final native long initNativeResourceManager(AssetManager assetManager);

    public final native long nativeGetNativeResourceManagerCode(long j);

    public final native CharSequence nativeGetQuantityString(long j, int i, int i2);

    public final native CharSequence nativeGetText(long j, int i);

    public final native long nativeLoadOtherResource(String str, AssetManager assetManager, long j);

    public final native void nativeSetCustomFilePath(String str);

    public final native long nativeUpdateLocale(long j, String str, AssetManager assetManager);

    static {
        try {
            resourcesClass = Resources.class;
            Class<?> cls = Class.forName("android.content.res.ResourcesImpl");
            resourceImplClass = cls;
            Class<?> cls2 = resourcesClass;
            if (cls2 == null) {
                cls2 = null;
            }
            setImplMethod = cls2.getDeclaredMethod("setImpl", cls);
            Class<?> cls3 = resourcesClass;
            if (cls3 == null) {
                cls3 = null;
            }
            Method declaredMethod = cls3.getDeclaredMethod("getImpl", new Class[0]);
            getImplMethod = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            Method method = setImplMethod;
            if (method != null) {
                method.setAccessible(true);
            }
            if (Build.VERSION.SDK_INT < 24) {
                Method declaredMethod2 = Resources.class.getDeclaredMethod("getPluralRule", new Class[0]);
                pluralRulemethod = declaredMethod2;
                (declaredMethod2 != null ? declaredMethod2 : null).setAccessible(true);
                Method declaredMethod3 = Resources.class.getDeclaredMethod("stringForQuantityCode", Integer.TYPE);
                stringForQuantityCodeMethod = declaredMethod3;
                if (declaredMethod3 != null) {
                    declaredMethod3.setAccessible(true);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdk_version:", Build.VERSION.SDK_INT);
            jSONObject.put("error message:", String.valueOf(e.getMessage()));
            C1AF0.LIZJ(C786410Ut5.J3(jSONObject));
        }
    }

    public final Method getGetImplMethod$NxReword_release() {
        return getImplMethod;
    }

    public final Method getSetImplMethod$NxReword_release() {
        return setImplMethod;
    }

    public static final CharSequence convertStringToSpannedString(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }

    public final void setGetImplMethod$NxReword_release(Method method) {
        getImplMethod = method;
    }

    public final void setSetImplMethod$NxReword_release(Method method) {
        setImplMethod = method;
    }

    public final String getPluralRulesString(Resources resources, int i) {
        Object objA0;
        Integer num;
        Object objA02;
        Method declaredMethod;
        try {
            Method method = pluralRulemethod;
            if (method == null) {
                method = null;
            }
            Object objA03 = C2204961BRm.a0(method, resources, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOSwcZrZ0yBXV6APSCDbrNznC6WWhhKYkyYRJhZGpw==", null));
            nativePluralRulesObject = objA03;
            if (getPluralRuleMethod == null) {
                if (objA03 == null) {
                    declaredMethod = null;
                } else {
                    declaredMethod = objA03.getClass().getDeclaredMethod("quantityForInt", Integer.TYPE);
                }
                getPluralRuleMethod = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
            }
            Method method2 = getPluralRuleMethod;
            if (method2 == null) {
                objA0 = null;
            } else {
                objA0 = C2204961BRm.a0(method2, nativePluralRulesObject, new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOSwcZrZ0yBXV6APSCDbrNznC6WWhhKYkyYRJhZGpw==", null));
            }
            if (objA0 instanceof Integer) {
                num = (Integer) objA0;
            } else {
                num = null;
            }
            Method method3 = stringForQuantityCodeMethod;
            if (method3 == null) {
                objA02 = null;
            } else {
                objA02 = C2204961BRm.a0(method3, resources, new Object[]{num}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOSwcZrZ0yBXV6APSCDbrNznC6WWhhKYkyYRJhZGpw==", null));
            }
            if (!(objA02 instanceof String)) {
                return null;
            }
            return (String) objA02;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            th.getMessage();
            return "other";
        }
    }

    public static final void setTextViewText(Context context, AttributeSet attributeSet, String str, TextView textView) {
        String strValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, textViewAttrs);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            textView.setText(context.getResources().getText(resourceId));
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            textView.setHint(context.getResources().getText(resourceId2));
        }
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        if (resourceId3 != 0) {
            if (str.length() == 0) {
                strValueOf = String.valueOf(C13LE.LIZ(textView.getClass()).LJI());
            } else {
                strValueOf = str;
            }
            int iHashCode = strValueOf.hashCode();
            if (iHashCode != -1805606060) {
                if (iHashCode != 799298502) {
                    if (iHashCode == 944370678 && strValueOf.equals("SwitchCompat")) {
                        ((C21411718qp) textView).setTextOn(context.getResources().getText(resourceId3));
                    }
                } else if (strValueOf.equals("ToggleButton")) {
                    ((ToggleButton) textView).setTextOn(context.getResources().getText(resourceId3));
                }
            } else if (strValueOf.equals("Switch")) {
                ((Switch) textView).setTextOn(context.getResources().getText(resourceId3));
            }
        }
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        if (resourceId4 != 0) {
            if (str.length() == 0) {
                str = String.valueOf(C13LE.LIZ(textView.getClass()).LJI());
            }
            int iHashCode2 = str.hashCode();
            if (iHashCode2 != -1805606060) {
                if (iHashCode2 != 799298502) {
                    if (iHashCode2 == 944370678 && str.equals("SwitchCompat")) {
                        ((C21411718qp) textView).setTextOff(context.getResources().getText(resourceId4));
                    }
                } else if (str.equals("ToggleButton")) {
                    ((ToggleButton) textView).setTextOff(context.getResources().getText(resourceId4));
                }
            } else if (str.equals("Switch")) {
                ((Switch) textView).setTextOff(context.getResources().getText(resourceId4));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
