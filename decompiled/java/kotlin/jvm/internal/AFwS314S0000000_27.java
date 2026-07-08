package kotlin.jvm.internal;

import X.C09AY;
import X.C0DVB;
import X.C1391990mKL;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1749280vcc;
import X.C1782920wUs;
import X.C1786460waa;
import X.C1786470wab;
import X.C1787770wch;
import X.C1787830wcn;
import X.C1788060wdA;
import X.C1789460wfQ;
import X.C1789490wfT;
import X.C1789570wfb;
import X.C1789750wft;
import X.C1789780wfw;
import X.C1789850wg3;
import X.C1835580xro;
import X.C1854150yLl;
import X.C1855760yOM;
import X.C1855930yOd;
import X.C1863850ybP;
import X.C1863930ybX;
import X.C1954807lC;
import X.C2097908Jt;
import X.C323580CmK;
import X.C337180DJs;
import X.C517450KRb;
import X.C627660Ojc;
import X.EnumC1780720wRK;
import X.EnumC1782910wUr;
import X.EnumC1787180wbk;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.iap.core.model.IAPQueryRequest;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.HighLightItemAssem;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.HighlightTabAssem;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.myclips.MyClipsTabAssem;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.replay.ReplayTabAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes28.dex */
public class AFwS314S0000000_27 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(30);
    public final int $t;

    public static AFwS314S0000000_27 get$arr$(int i) {
        AFwS314S0000000_27 aFwS314S0000000_27 = (AFwS314S0000000_27) arr$.get(i);
        if (aFwS314S0000000_27 != null) {
            return aFwS314S0000000_27;
        }
        arr$.compareAndSet(i, null, new AFwS314S0000000_27(i));
        return (AFwS314S0000000_27) arr$.get(i);
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
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS314S0000000_27(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        return ((C1789460wfQ) obj).LJFF;
    }

    public static final Object invoke$1(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        C1789460wfQ c1789460wfQ = (C1789460wfQ) obj;
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1788060wdA) it2.next()).LIZIZ);
        }
        return new C1789490wfT(c1789460wfQ, arrayList);
    }

    public static final Object invoke$10(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        HighLightItemAssem highLightItemAssem = (HighLightItemAssem) obj;
        EnumC1782910wUr enumC1782910wUr = (EnumC1782910wUr) obj2;
        if (highLightItemAssem.yp()) {
            int i = C1782920wUs.LIZ[enumC1782910wUr.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new C1954807lC();
                    }
                } else {
                    highLightItemAssem.zp();
                }
            } else {
                C1835580xro c1835580xro = highLightItemAssem.LLLFFI;
                if (c1835580xro != null) {
                    highLightItemAssem.op(c1835580xro.LLJIJIL, c1835580xro.LLJILJIL);
                }
                SmartImageView smartImageView = highLightItemAssem.LLJLIL;
                if (smartImageView != null) {
                    C337180DJs.LIZ(smartImageView);
                }
                boolean z = highLightItemAssem.tp().getState().LL;
                highLightItemAssem.up().vQ2(z);
                highLightItemAssem.Ep(z);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        HighlightTabAssem highlightTabAssem = (HighlightTabAssem) obj;
        C627660Ojc c627660Ojc = (C627660Ojc) obj2;
        List<ITEM> list = c627660Ojc.LLILZ;
        C0DVB.LIZ(c627660Ojc, (ViewOnAttachStateChangeListenerC20604515jv) highlightTabAssem.LLJJLIIIJLLLLLLLZ.getValue(), (C1749280vcc) highlightTabAssem.LLJL.getValue(), 2131853376, 2131853377);
        if (!highlightTabAssem.LLJZ && list != 0 && !list.isEmpty()) {
            highlightTabAssem.LLJZ = true;
            highlightTabAssem.sp().setState(new AwS33S0000100_18(((C1835580xro) C13LP.LJJJJZI(list)).LL, 8));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        MyClipsTabAssem myClipsTabAssem = (MyClipsTabAssem) obj;
        C0DVB.LIZ((C627660Ojc) obj2, (ViewOnAttachStateChangeListenerC20604515jv) myClipsTabAssem.LLJJLIIIJLLLLLLLZ.getValue(), (C1749280vcc) myClipsTabAssem.LLJL.getValue(), 2131853361, 2131853362);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        ReplayTabAssem replayTabAssem = (ReplayTabAssem) obj;
        C0DVB.LIZ((C627660Ojc) obj2, (ViewOnAttachStateChangeListenerC20604515jv) replayTabAssem.LLJJLIIIJLLLLLLLZ.getValue(), (C1749280vcc) replayTabAssem.LLJL.getValue(), 2131853380, 2131853381);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        C323580CmK c323580CmK = new C323580CmK(3);
        c323580CmK.LIZ("");
        c323580CmK.LIZIZ(((List) obj2).toArray(new String[0]));
        c323580CmK.LIZ("");
        return C1697810uHb.LJIILJJIL(c323580CmK.LIZLLL(new String[c323580CmK.LIZJ()]));
    }

    public static final Object invoke$15(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        ((Number) obj).intValue();
        ((TextView) obj2).setText("");
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$16(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$17(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        IAPQueryRequest iAPQueryRequest = (IAPQueryRequest) obj;
        List list = (List) obj2;
        String str = iAPQueryRequest.merchantId;
        List<String> list2 = iAPQueryRequest.productIds;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1788060wdA) it2.next()).LIZJ);
        }
        return new C1789850wg3(str, list2, arrayList);
    }

    public static final Object invoke$18(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        List list = (List) obj2;
        EnumC1780720wRK enumC1780720wRK = ((IAPQueryRequest) obj).productType;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1786470wab) it2.next()).LIZIZ);
        }
        return new C1786460waa(enumC1780720wRK, arrayList, list);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$19(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        LinkedHashMap linkedHashMap;
        Pair pair = (Pair) obj2;
        List<String> list = ((C1789460wfQ) obj).LJ;
        C1789780wfw c1789780wfw = (C1789780wfw) pair.getFirst();
        List<C1789750wft> list2 = (List) pair.getSecond();
        if (list2 != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (C1789750wft c1789750wft : list2) {
                Pair pair2 = new Pair(c1789750wft.LIZ, c1789750wft);
                linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
            }
        } else {
            linkedHashMap = null;
        }
        return new C1789570wfb(list, c1789780wfw, linkedHashMap);
    }

    public static final Object invoke$20(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        return Boolean.TRUE;
    }

    public static final Object invoke$21(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        return C517450KRb.LIZ(((Number) obj).intValue(), (Throwable) obj2);
    }

    public static final Object invoke$22(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        return new C1787770wch((C1787830wcn) ((Pair) obj).getSecond(), (EnumC1787180wbk) obj2);
    }

    public static final Object invoke$23(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        EnumC1787180wbk enumC1787180wbk = ((C1787770wch) obj2).LIZIZ;
        if (enumC1787180wbk == null) {
            enumC1787180wbk = EnumC1787180wbk.UNKNOWN_ERROR;
        }
        return new Pair(obj, enumC1787180wbk);
    }

    public static final Object invoke$24(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        return new C1787770wch((C1787830wcn) obj2, null);
    }

    public static final Object invoke$26(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        return ((Pair) obj).getFirst();
    }

    public static final Object invoke$27(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        return C1863850ybP.LIZ((C1863850ybP) obj, null, null, null, null, null, null, null, ((C1855930yOd) obj2).LIZ, null, null, null, null, null, 0L, 0L, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -129);
    }

    public static final Object invoke$28(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        C1863930ybX c1863930ybX = (C1863930ybX) obj2;
        return C1863850ybP.LIZ((C1863850ybP) obj, c1863930ybX.LIZ, c1863930ybX.LIZIZ, c1863930ybX.LIZJ, c1863930ybX.LIZLLL, c1863930ybX.LJ, c1863930ybX.LJFF, c1863930ybX.LJI, null, c1863930ybX.LJII, c1863930ybX.LJIIIIZZ, c1863930ybX.LJIIIZ, c1863930ybX.LJIIJ, c1863930ybX.LJIILL, 0L, c1863930ybX.LJIIJJI, c1863930ybX.LJIIL, c1863930ybX.LJIILIIL, c1863930ybX.LJIILJJIL, null, c1863930ybX.LJIILLIIL, c1863930ybX.LJIIZILJ, null, null, c1863930ybX.LJIJ, c1863930ybX.LJIJI, c1863930ybX.LJIJJ, c1863930ybX.LJIJJLI, false, c1863930ybX.LJIL, c1863930ybX.LJJ, c1863930ybX.LJJI, c1863930ybX.LJJIFFI, 140779648);
    }

    public static final Object invoke$29(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        String str;
        String str2;
        C1863850ybP c1863850ybP = (C1863850ybP) obj;
        C1855760yOM c1855760yOM = (C1855760yOM) obj2;
        C1854150yLl c1854150yLl = c1855760yOM.LIZ;
        if (c1854150yLl == null || (str = c1854150yLl.LLJ) == null || str.length() <= 0) {
            str = "default";
        }
        C1854150yLl c1854150yLl2 = c1855760yOM.LIZ;
        if (c1854150yLl2 == null || (str2 = c1854150yLl2.LLJJI) == null || str2.length() <= 0) {
            str2 = "default";
        }
        return C1863850ybP.LIZ(c1863850ybP, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, 0, null, null, null, null, null, str, str2, null, null, false, null, false, null, null, null, null, -6291457);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        ((C1391990mKL) obj2).LIZIZ = true;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        ((Number) obj).intValue();
        ((TextView) obj2).setText("");
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        HighLightItemAssem highLightItemAssem = (HighLightItemAssem) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (highLightItemAssem.yp()) {
            highLightItemAssem.up().vQ2(zBooleanValue);
            highLightItemAssem.Ep(zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        ((HighLightItemAssem) obj).Bp();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        ((HighLightItemAssem) obj).Bp();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        ((HighLightItemAssem) obj).Ap((Long) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AFwS314S0000000_27 aFwS314S0000000_27, Object obj, Object obj2) {
        return obj;
    }
}
