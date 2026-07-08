package kotlin.jvm.internal;

import X.AbstractC1386130mAt;
import X.C09AY;
import X.C0S5L;
import X.C0T6L;
import X.C2187451AjH;
import X.C291001Au;
import X.C688420QzQ;
import X.C693070RGn;
import X.C698980RbM;
import X.C699000RbO;
import X.C700170RdH;
import X.C701270Rf3;
import X.C724270Sb3;
import X.InterfaceC1445905lJ;
import X.InterfaceC1449905lx;
import X.InterfaceC1452505mN;
import X.InterfaceC1452605mO;
import X.InterfaceC1631620sYq;
import android.os.Message;
import com.ss.android.ugc.aweme.api.component.translation.CommerceTranslationAssem;
import com.ss.android.ugc.aweme.api.component.translation.TranslationOptimizeHandler;
import com.ss.android.ugc.aweme.feed.collection.common.component.SimpleRootCellComponent;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AFwS335S0000000_11 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(7);
    public final int $t;

    public static AFwS335S0000000_11 get$arr$(int i) {
        AFwS335S0000000_11 aFwS335S0000000_11 = (AFwS335S0000000_11) arr$.get(i);
        if (aFwS335S0000000_11 != null) {
            return aFwS335S0000000_11;
        }
        arr$.compareAndSet(i, null, new AFwS335S0000000_11(i));
        return (AFwS335S0000000_11) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS335S0000000_11(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS335S0000000_11 aFwS335S0000000_11, Object obj, Object obj2, Object obj3) {
        String str;
        InterfaceC1452505mN interfaceC1452505mN;
        InterfaceC1449905lx interfaceC1449905lx = (InterfaceC1449905lx) obj;
        Function1 function1 = (Function1) obj2;
        InterfaceC1445905lJ interfaceC1445905lJ = (InterfaceC1445905lJ) obj3;
        String str2 = null;
        if ((interfaceC1445905lJ instanceof InterfaceC1452605mO) && (interfaceC1452505mN = (InterfaceC1452505mN) interfaceC1445905lJ) != null) {
            str = (String) interfaceC1452505mN.getType();
        } else {
            str = null;
        }
        C700170RdH c700170RdH = ((C701270Rf3) interfaceC1449905lx.getState()).LIZIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Intrinsics.LJFF(str, "fcp_execute_exchange_action")) {
            new AwS13S1100100_11(jCurrentTimeMillis, c700170RdH, str, 1);
            C0T6L.LIZLLL();
        }
        Object objInvoke = function1.invoke(interfaceC1445905lJ);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (Intrinsics.LJFF(str, "fcp_execute_exchange_action")) {
            C688420QzQ c688420QzQ = C688420QzQ.LIZIZ;
            if (c700170RdH != null) {
                str2 = c700170RdH.LIZLLL;
            }
            c688420QzQ.LJIIIIZZ(str2, jCurrentTimeMillis2 - jCurrentTimeMillis);
            new AwS2S1100200_11(jCurrentTimeMillis2, c700170RdH, str, jCurrentTimeMillis, 0);
            C0T6L.LIZLLL();
        }
        return objInvoke;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AFwS335S0000000_11 aFwS335S0000000_11, Object obj, Object obj2, Object obj3) {
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AFwS335S0000000_11 aFwS335S0000000_11, Object obj, Object obj2, Object obj3) {
        boolean z;
        Object obj4;
        C693070RGn c693070RGn;
        SimpleRootCellComponent simpleRootCellComponent = (SimpleRootCellComponent) obj;
        C291001Au c291001Au = (C291001Au) obj3;
        if (c291001Au != null && (c693070RGn = (C693070RGn) c291001Au.LIZ) != null) {
            z = c693070RGn.LJ;
        } else {
            z = false;
        }
        if (obj2 != null || z) {
            C698980RbM c698980RbM = (C698980RbM) simpleRootCellComponent.LLJLIL.getValue();
            C724270Sb3 c724270Sb3 = simpleRootCellComponent.LLJI;
            if (c724270Sb3 != null) {
                obj4 = c724270Sb3.LL;
            } else {
                obj4 = null;
            }
            c698980RbM.LIZ(new C699000RbO(1, ((VideoItemParams) obj4).getAweme().getAid()));
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS335S0000000_11 aFwS335S0000000_11, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        ((Boolean) obj3).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS335S0000000_11 aFwS335S0000000_11, Object obj, Object obj2, Object obj3) {
        Object obj4;
        IAdTranslatableData translatableData;
        Object obj5;
        CommerceTranslationAssem commerceTranslationAssem = (CommerceTranslationAssem) obj;
        IAdTranslationData iAdTranslationData = (IAdTranslationData) obj3;
        Object obj6 = null;
        if ((obj2 instanceof C0S5L) && iAdTranslationData != null) {
            C724270Sb3 c724270Sb3 = commerceTranslationAssem.LLJI;
            if (c724270Sb3 != null) {
                obj6 = c724270Sb3.LL;
            }
            AwemeRawAd awemeRawAd = ((VideoItemParams) obj6).getAweme().getAwemeRawAd();
            if (awemeRawAd != null) {
                awemeRawAd.setTranslationData(iAdTranslationData);
            }
            TranslationOptimizeHandler translationOptimizeHandler = commerceTranslationAssem.LLJJJ;
            translationOptimizeHandler.removeMessages(1);
            if (C2187451AjH.LJ) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = iAdTranslationData;
                translationOptimizeHandler.sendMessageDelayed(messageObtain, 16L);
            } else {
                translationOptimizeHandler.LL.qh(iAdTranslationData);
            }
        } else {
            C724270Sb3 c724270Sb32 = commerceTranslationAssem.LLJI;
            if (c724270Sb32 != null) {
                obj4 = c724270Sb32.LL;
            } else {
                obj4 = null;
            }
            AwemeRawAd awemeRawAd2 = ((VideoItemParams) obj4).getAweme().getAwemeRawAd();
            if (awemeRawAd2 != null && (translatableData = awemeRawAd2.getTranslatableData()) != null) {
                C724270Sb3 c724270Sb33 = commerceTranslationAssem.LLJI;
                if (c724270Sb33 != null) {
                    obj5 = c724270Sb33.LL;
                } else {
                    obj5 = null;
                }
                AwemeRawAd awemeRawAd3 = ((VideoItemParams) obj5).getAweme().getAwemeRawAd();
                if (awemeRawAd3 != null) {
                    awemeRawAd3.setTranslationData(null);
                }
                TranslationOptimizeHandler translationOptimizeHandler2 = commerceTranslationAssem.LLJJJ;
                translationOptimizeHandler2.removeMessages(1);
                if (C2187451AjH.LJ) {
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = 1;
                    messageObtain2.obj = translatableData;
                    translationOptimizeHandler2.sendMessageDelayed(messageObtain2, 16L);
                } else {
                    translationOptimizeHandler2.LL.Nn(translatableData);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS335S0000000_11 aFwS335S0000000_11, Object obj, Object obj2, Object obj3) {
        return ((Function1) obj2).invoke(obj3);
    }

    public static final Object invoke$6(AFwS335S0000000_11 aFwS335S0000000_11, Object obj, Object obj2, Object obj3) {
        ((AbstractC1386130mAt) obj).LJ((String) obj2, (String) obj3);
        return Unit.LIZ;
    }
}
