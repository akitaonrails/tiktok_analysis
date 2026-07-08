package kotlin.jvm.internal;

import X.C08OC;
import X.C08QG;
import X.C09AY;
import X.C0OPX;
import X.C1720106oR;
import X.C194396113q;
import X.C1957107lZ;
import X.C2129108Vt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2253208sE;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC23255099h;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.sun.jna.JnaLibrarianLancetHelper;
import com.sun.jna.Native;
import com.tts.oecverify.BdTuring;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public class AFwS286S0000000_3 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(23);
    public final int $t;

    public static AFwS286S0000000_3 get$arr$(int i) {
        AFwS286S0000000_3 aFwS286S0000000_3 = (AFwS286S0000000_3) arr$.get(i);
        if (aFwS286S0000000_3 != null) {
            return aFwS286S0000000_3;
        }
        arr$.compareAndSet(i, null, new AFwS286S0000000_3(i));
        return (AFwS286S0000000_3) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS286S0000000_3(int i) {
        super(2);
        this.$t = i;
    }

    public static void INVOKESTATIC_com_sun_jna_JnaLibrarianLancetHelper$loadLibraryRetries$3_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary$0(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static final Object invoke$0(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        ((Number) obj2).floatValue();
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
    }

    public static final Object invoke$1(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        ((Number) obj2).floatValue();
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
    }

    public static final /* bridge */ /* synthetic */ Object invoke$10(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$11(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$12(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$13(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        CoroutineContext coroutineContext = (CoroutineContext) obj;
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        if (element instanceof InterfaceC23255099h) {
            return coroutineContext.plus(((InterfaceC23255099h) element).LJJLIIJ());
        }
        return coroutineContext.plus(element);
    }

    public static final Object invoke$15(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        boolean z;
        if (!((Boolean) obj).booleanValue() && !(obj2 instanceof InterfaceC23255099h)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$16(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, obj2));
    }

    public static final Object invoke$17(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        return C08QG.SKIP;
    }

    public static final Object invoke$18(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get bulletin gecko image path: ");
        sbLIZ.append(zBooleanValue);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$19(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        return Integer.valueOf(((Number) obj).intValue() + 1);
    }

    public static final Object invoke$2(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        List list = (List) obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (!C2129108Vt.LIZ.contains(obj3)) {
                    arrayList.add(obj3);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C2129108Vt.LIZ.add((String) it2.next());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        C1957107lZ.LIZ.getClass();
        return Boolean.valueOf(Intrinsics.LJFF(C1957107lZ.LIZIZ((String) obj), C1957107lZ.LIZIZ((String) obj2)));
    }

    public static final Object invoke$21(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current userCardState: ");
        sbLIZ.append(obj2.getClass().getSimpleName());
        C1720106oR.LJI("UserCard_Assem", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$22(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        EffectCategoryModel effectCategoryModel = (EffectCategoryModel) obj;
        Effect effect = (Effect) obj2;
        C194396113q.LIZIZ(effect, effectCategoryModel.getName(), effectCategoryModel.getId(), effectCategoryModel.getExtra());
        return effect;
    }

    public static final Object invoke$3(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, C2253208sE.LIZ));
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        return Long.valueOf(Native.open((String) obj, ((Number) obj2).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        BaseDexClassLoader baseDexClassLoader;
        String str = (String) obj;
        int iIntValue = ((Number) obj2).intValue();
        ClassLoader classLoader = JnaLibrarianLancetHelper.INSTANCE.getClass().getClassLoader();
        if ((classLoader instanceof BaseDexClassLoader) && (baseDexClassLoader = (BaseDexClassLoader) classLoader) != null) {
            String strFindLibrary = baseDexClassLoader.findLibrary(str);
            if (strFindLibrary != null) {
                return Long.valueOf(Native.open(strFindLibrary, iIntValue));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unable to find ");
            sbLIZ.append(str);
            sbLIZ.append(" from classloader");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IllegalStateException("Classloader is not BaseDexClassLoader");
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        String str = (String) obj;
        int iIntValue = ((Number) obj2).intValue();
        INVOKESTATIC_com_sun_jna_JnaLibrarianLancetHelper$loadLibraryRetries$3_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary$0(str);
        return Long.valueOf(Native.open(str, iIntValue));
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        String str = (String) obj;
        int iIntValue = ((Number) obj2).intValue();
        File[] fileArrListFiles = ((File) C08OC.LIZJ.getValue()).listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file : fileArrListFiles) {
            if (!Intrinsics.LJFF(file.getName(), str)) {
                String name = file.getName();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lib");
                sbLIZ.append(str);
                sbLIZ.append(".so");
                if (!Intrinsics.LJFF(name, C2188811AlT.LIZIZ(sbLIZ))) {
                }
            }
            return Long.valueOf(Native.open(file.getAbsolutePath(), iIntValue));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Unable to find ");
        sbLIZ2.append(str);
        sbLIZ2.append(" from path-fixed directory");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final Object invoke$8(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        if (obj == null) {
            throw new RuntimeException();
        }
        return obj;
    }

    public static final Object invoke$9(AFwS286S0000000_3 aFwS286S0000000_3, Object obj, Object obj2) {
        if (obj == null) {
            throw new RuntimeException();
        }
        return obj;
    }
}
