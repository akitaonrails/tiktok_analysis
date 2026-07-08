package com.ss.android.ugc.aweme.tako.botpage.cards.answer.mix;

import X.AbstractC604650Nnb;
import X.C013C;
import X.C01GW;
import X.C07I7;
import X.C0HZQ;
import X.C0R2W;
import X.C0R3X;
import X.C13BV;
import X.C13LP;
import X.C14J2;
import X.C15438062q;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1859840yUw;
import X.C1860130yVP;
import X.C1919007fQ;
import X.C427660Gpo;
import X.C452501pT;
import X.C689590R3d;
import X.C723830SaL;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC1860810yWV;
import X.InterfaceC342000Daw;
import X.InterfaceC434180H0u;
import X.InterfaceC665370Q7z;
import X.ViewOnLongClickListenerC1864690ycl;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerMixAssem extends TakoAnswerBaseAssem<C0R3X> implements InterfaceC434180H0u {
    public static final AtomicBoolean LLLZL = new AtomicBoolean(false);
    public final C01GW LLLLZLLLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 715));
    public final C01GW LLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 718));
    public final C01GW LLLZI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 719));
    public final C01GW LLLZIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 716));
    public final C01GW LLLZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 717));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmk;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final InterfaceC434180H0u nO() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final boolean Eq() {
        SpannableStringBuilder spannableStringBuilderLIZLLL;
        C1860130yVP c1860130yVP = this.LLLLZI;
        if (c1860130yVP == null) {
            return false;
        }
        InterfaceC342000Daw markdownContent = c1860130yVP.getMarkdownContent();
        C1859840yUw[] c1859840yUwArr = null;
        if (markdownContent != null && (spannableStringBuilderLIZLLL = markdownContent.LIZLLL()) != null) {
            c1859840yUwArr = (C1859840yUw[]) spannableStringBuilderLIZLLL.getSpans(0, spannableStringBuilderLIZLLL.length(), C1859840yUw.class);
        }
        ArrayList arrayList = new ArrayList();
        if (c1859840yUwArr != null) {
            for (C1859840yUw c1859840yUw : c1859840yUwArr) {
                arrayList.add(new Pair(Integer.valueOf(SpannedString.valueOf(c1860130yVP.getText()).getSpanStart(c1859840yUw)), Integer.valueOf(SpannedString.valueOf(c1860130yVP.getText()).getSpanEnd(c1859840yUw))));
            }
        }
        Layout layout = c1860130yVP.getLayout();
        if (layout == null) {
            return false;
        }
        C14J2 c14j2Pq = pq();
        int lineForVertical = layout.getLineForVertical(c14j2Pq != null ? (int) c14j2Pq.getClickY() : 0);
        C14J2 c14j2Pq2 = pq();
        int iU3 = C786410Ut5.U3(layout, lineForVertical, c14j2Pq2 != null ? c14j2Pq2.getClickX() : 0.0f);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Pair pair = (Pair) next;
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            if (iIntValue <= iU3 && iU3 <= iIntValue2) {
                if (next == null) {
                    break;
                }
                return false;
            }
        }
        return true;
    }

    public final FrameLayout Vr() {
        return (FrameLayout) this.LLLLZLLLI.getValue();
    }

    public final boolean Wr() {
        return ((Boolean) this.LLLZIL.getValue()).booleanValue();
    }

    public final FrameLayout Xr() {
        return (FrameLayout) this.LLLZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public final boolean Yr() {
        ?? arrayList;
        Layout layout;
        SpannableStringBuilder spannableStringBuilderLIZLLL;
        C1859840yUw[] c1859840yUwArr;
        C1860130yVP c1860130yVP = this.LLLLZI;
        if (c1860130yVP == null) {
            return false;
        }
        InterfaceC342000Daw markdownContent = c1860130yVP.getMarkdownContent();
        if (markdownContent == null || (spannableStringBuilderLIZLLL = markdownContent.LIZLLL()) == null || (c1859840yUwArr = (C1859840yUw[]) spannableStringBuilderLIZLLL.getSpans(0, spannableStringBuilderLIZLLL.length(), C1859840yUw.class)) == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList();
            for (C1859840yUw c1859840yUw : c1859840yUwArr) {
                if (Intrinsics.LJFF(c1859840yUw.LL, "video-group")) {
                    arrayList.add(c1859840yUw);
                }
            }
        }
        if (arrayList.isEmpty() || (layout = c1860130yVP.getLayout()) == null) {
            return false;
        }
        C14J2 c14j2Pq = pq();
        int lineForVertical = layout.getLineForVertical(c14j2Pq != null ? (int) c14j2Pq.getClickY() : 0);
        C14J2 c14j2Pq2 = pq();
        int iU3 = C786410Ut5.U3(layout, lineForVertical, c14j2Pq2 != null ? c14j2Pq2.getClickX() : 0.0f);
        SpannedString spannedStringValueOf = SpannedString.valueOf(c1860130yVP.getText());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            int spanStart = spannedStringValueOf.getSpanStart(next);
            int spanEnd = spannedStringValueOf.getSpanEnd(next);
            if (spanStart >= 0 && spanEnd >= 0 && spanStart <= iU3 && iU3 <= spanEnd) {
                return next != null;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final InterfaceC1860810yWV Tp() {
        return pq();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void jr() {
        ViewGroup viewGroupY4 = Y4();
        if (viewGroupY4 == null) {
            return;
        }
        C1919007fQ.LIZ.getClass();
        final boolean zLIZIZ = C1919007fQ.LIZIZ();
        final boolean z = false;
        if (zLIZIZ) {
            viewGroupY4.setHapticFeedbackEnabled(false);
            C1860130yVP c1860130yVP = this.LLLLZI;
            if (c1860130yVP != null) {
                c1860130yVP.setHapticFeedbackEnabled(false);
            }
        }
        final C013C c013c = new C013C();
        c013c.element = viewGroupY4.isHapticFeedbackEnabled();
        final boolean z2 = true;
        viewGroupY4.setOnTouchListener(new View.OnTouchListener() { // from class: X.0yQw
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C14J2 c14j2Pq;
                if (z2 && (c14j2Pq = this.pq()) != null) {
                    c14j2Pq.setClickX(motionEvent.getX());
                    c14j2Pq.setClickY(motionEvent.getY());
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        view.setHapticFeedbackEnabled(c013c.element);
                        return false;
                    }
                } else {
                    c013c.element = view.isHapticFeedbackEnabled();
                    if (zLIZIZ) {
                        view.setHapticFeedbackEnabled(false);
                        return false;
                    }
                    C1919007fQ.LIZ.getClass();
                    if (C1919007fQ.LIZ() && this.Yr()) {
                        view.setHapticFeedbackEnabled(true);
                        return false;
                    }
                }
                return false;
            }
        });
        C1860130yVP c1860130yVP2 = this.LLLLZI;
        if (c1860130yVP2 != null) {
            final C013C c013c2 = new C013C();
            c013c2.element = c1860130yVP2.isHapticFeedbackEnabled();
            c1860130yVP2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0yQw
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    C14J2 c14j2Pq;
                    if (z && (c14j2Pq = this.pq()) != null) {
                        c14j2Pq.setClickX(motionEvent.getX());
                        c14j2Pq.setClickY(motionEvent.getY());
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0) {
                        if (actionMasked == 1 || actionMasked == 3) {
                            view.setHapticFeedbackEnabled(c013c2.element);
                            return false;
                        }
                    } else {
                        c013c2.element = view.isHapticFeedbackEnabled();
                        if (zLIZIZ) {
                            view.setHapticFeedbackEnabled(false);
                            return false;
                        }
                        C1919007fQ.LIZ.getClass();
                        if (C1919007fQ.LIZ() && this.Yr()) {
                            view.setHapticFeedbackEnabled(true);
                            return false;
                        }
                    }
                    return false;
                }
            });
        }
        viewGroupY4.setOnLongClickListener(new ViewOnLongClickListenerC1864690ycl(this, 2));
    }

    @Override // X.InterfaceC434180H0u
    public final LifecycleCoroutineScope pa() {
        return LifecycleOwnerKt.getLifecycleScope(this);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void Kq() {
        super.Kq();
    }

    @Override // X.InterfaceC434180H0u
    public final List<TakoVideoItem> P3(String str) {
        Object obj;
        TakoPlaceholderSource takoPlaceholderSource;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Map<String, TakoPlaceholderSource> map = ((C0R3X) obj).LLJJJIL;
        if (map != null && (takoPlaceholderSource = map.get(str)) != null) {
            Integer num = takoPlaceholderSource.sourceType;
            if (num != null && num.intValue() == 0) {
                List<TakoVideoItem> list = takoPlaceholderSource.itemList;
                if (list == null) {
                    return C13BV.INSTANCE;
                }
                return list;
            }
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: cs, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C0R3X r9) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.answer.mix.TakoAnswerMixAssem.Ap(X.0R3X):void");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C07I7.LIZIZ = true;
        C723830SaL.LIZ(this, null, new AwS609S0100000_30(this, 288));
    }

    @Override // X.InterfaceC434180H0u
    public final void b2(View view, String str) {
        Object obj;
        TakoPlaceholderSource takoPlaceholderSource;
        Integer num;
        List<TakoVideoItem> list;
        TakoVideoItem takoVideoItem;
        Object obj2;
        final TakoEnterParams takoEnterParamsDN1;
        final Integer num2;
        final Integer num3;
        Object obj3;
        final String str2;
        Object obj4;
        final String strValueOf;
        Integer num4;
        Integer num5;
        Object obj5;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Map<String, TakoPlaceholderSource> map = ((C0R3X) obj).LLJJJIL;
        if (map != null && (takoPlaceholderSource = map.get(str)) != null && (num = takoPlaceholderSource.sourceType) != null && num.intValue() == 0 && (list = takoPlaceholderSource.itemList) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<TakoVideoItem> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().awemeId);
            }
            List<TakoVideoItem> list2 = takoPlaceholderSource.itemList;
            if (list2 != null && (takoVideoItem = (TakoVideoItem) C13LP.LJJJLL(list2)) != null) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                final String str3 = ((C0R3X) obj2).LLJJIJI.LLILLL.uuid;
                IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(this, IMessageAbility.class, null);
                if (iMessageAbility != null) {
                    takoEnterParamsDN1 = iMessageAbility.DN1();
                } else {
                    takoEnterParamsDN1 = null;
                }
                final String str4 = takoVideoItem.awemeId;
                C689590R3d c689590R3d = takoPlaceholderSource.LIZ;
                if (c689590R3d != null) {
                    num2 = c689590R3d.LIZ;
                    num3 = c689590R3d.LIZJ;
                } else {
                    num2 = null;
                    num3 = null;
                }
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                } else {
                    obj3 = null;
                }
                if (((C0R3X) obj3).LLJJIJI.LLILLL.isMultiAnswer) {
                    str2 = "multi_answer";
                } else {
                    str2 = "default";
                }
                if (c724270Sb33 != null) {
                    obj4 = c724270Sb33.LL;
                } else {
                    obj4 = null;
                }
                if (((C0R3X) obj4).LLJJIJI.LLILLL.isMultiAnswer) {
                    if (c724270Sb33 != null) {
                        obj5 = c724270Sb33.LL;
                    } else {
                        obj5 = null;
                    }
                    strValueOf = String.valueOf(((C0R3X) obj5).LLJJIJI.LLILLL.selectedAnswerIndex + 1);
                } else {
                    strValueOf = null;
                }
                new AbstractC604650Nnb(str3, takoEnterParamsDN1, str4, num2, num3, str2, strValueOf) { // from class: X.0Nnc
                    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZLLL;

                    static {
                        C2217381BqS c2217381BqS = new C2217381BqS(C604660Nnc.class, "inlineContentId", "getInlineContentId()Ljava/lang/String;", 0);
                        C09R3 c09r3 = C13LE.LIZ;
                        c09r3.getClass();
                        C2217381BqS c2217381BqS2 = new C2217381BqS(C604660Nnc.class, "inlineStyle", "getInlineStyle()Ljava/lang/String;", 0);
                        c09r3.getClass();
                        C2217371BqR c2217371BqR = new C2217371BqR(C604660Nnc.class, "responseType", "getResponseType()Ljava/lang/String;", 0);
                        c09r3.getClass();
                        C2217371BqR c2217371BqR2 = new C2217371BqR(C604660Nnc.class, "responseRank", "getResponseRank()Ljava/lang/String;", 0);
                        c09r3.getClass();
                        C2217401BqU c2217401BqU = new C2217401BqU(C604660Nnc.class, "index", "<v#0>", 0);
                        c09r3.getClass();
                        C2217401BqU c2217401BqU2 = new C2217401BqU(C604660Nnc.class, "wordsPos", "<v#1>", 0);
                        c09r3.getClass();
                        LIZLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217371BqR, c2217371BqR2, c2217401BqU, c2217401BqU2};
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        ((ArrayList) this.LIZIZ).add(new C596940NbA(str4, "inline_content_id", true));
                        ((ArrayList) this.LIZIZ).add(new C596940NbA("cover_number", "inline_style", true));
                        ((ArrayList) this.LIZIZ).add(new C596940NbA(str2, "response_type", true));
                        C596940NbA c596940NbA = new C596940NbA(null, "response_rank", false);
                        ((ArrayList) this.LIZIZ).add(c596940NbA);
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZLLL;
                        c596940NbA.LLILLL = strValueOf;
                        if (num2 != null) {
                            ((ArrayList) this.LIZIZ).add(new C596940NbA(String.valueOf(num2.intValue()), "index", true));
                        }
                        if (num3 != null) {
                            ((ArrayList) this.LIZIZ).add(new C596940NbA(Integer.valueOf(num3.intValue()), "words_pos", true));
                        }
                    }
                }.LIZ();
                C0R2W c0r2w = C0R2W.LIZ;
                String str5 = takoVideoItem.awemeId;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                int i = 0;
                for (Object obj6 : arrayList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        arrayList2.add(new Pair(obj6, Long.valueOf(i)));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                Aweme aweme = takoVideoItem.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                List<TakoVideoItem> list3 = takoPlaceholderSource.itemList;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C689590R3d c689590R3d2 = takoPlaceholderSource.LIZ;
                if (c689590R3d2 != null && (num5 = c689590R3d2.LIZ) != null) {
                    linkedHashMap.put("tako_index", String.valueOf(num5.intValue()));
                }
                C689590R3d c689590R3d3 = takoPlaceholderSource.LIZ;
                if (c689590R3d3 != null && (num4 = c689590R3d3.LIZJ) != null) {
                    linkedHashMap.put("tako_words_pos", String.valueOf(num4.intValue()));
                }
                linkedHashMap.put("tako_style", "cover_number");
                C0R2W.LIZ(c0r2w, view, str5, arrayList2, aweme, interfaceC665370Q7zLJIIL, list3, linkedHashMap, null, 640);
            }
        }
    }

    @Override // X.InterfaceC434180H0u
    public final void tb(String str, C689590R3d c689590R3d) {
        Object obj;
        TakoPlaceholderSource takoPlaceholderSource;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Map<String, TakoPlaceholderSource> map = ((C0R3X) obj).LLJJJIL;
        if (map != null && (takoPlaceholderSource = map.get(str)) != null) {
            takoPlaceholderSource.LIZ = c689590R3d;
        }
    }
}
