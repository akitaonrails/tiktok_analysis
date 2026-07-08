package kotlin.jvm.internal;

import X.AbstractC431380Gvo;
import X.C05YD;
import X.C08CX;
import X.C09AY;
import X.C0HOM;
import X.C0HQC;
import X.C0HQD;
import X.C0HQE;
import X.C0HRK;
import X.C0HRL;
import X.C0IA3;
import X.C1255650imR;
import X.C13LP;
import X.C1697810uHb;
import X.C19EG;
import X.C2188811AlT;
import X.C416750GVt;
import X.C418440Gaw;
import X.C420930Gex;
import X.C432010Gwp;
import X.C440440HOw;
import X.C443120HZe;
import X.C444920HcY;
import X.C461930I9n;
import X.C461970I9r;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC429240GsM;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PublishStatusViewModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.iddropdown.MixStudioIdDropdownViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS92S0201000_6 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS92S0201000_6 awS92S0201000_6, Object obj) {
        final C432010Gwp c432010Gwp = (C432010Gwp) obj;
        final int iLIZ = C960203pA.LIZ(awS92S0201000_6.i2, (Activity) awS92S0201000_6.l0);
        final int iLIZ2 = C960203pA.LIZ(awS92S0201000_6.i2, (Activity) awS92S0201000_6.l0);
        final Function2 function2 = (Function2) awS92S0201000_6.l1;
        return C1697810uHb.LJIILJJIL(new AbstractC431380Gvo(iLIZ, iLIZ2) { // from class: X.0Gwo
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                Function2<String, String, Unit> function22 = function2;
                C432010Gwp c432010Gwp2 = c432010Gwp;
                function22.invoke(c432010Gwp2.LIZJ, c432010Gwp2.LIZLLL);
            }

            @Override // X.AbstractC431380Gvo, android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        }, new C444920HcY(12, true));
    }

    public static final Object invoke$1(AwS92S0201000_6 awS92S0201000_6, Object obj) {
        ((C1255650imR) awS92S0201000_6.l0).LIZ(awS92S0201000_6.i2, (Activity) awS92S0201000_6.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS92S0201000_6 awS92S0201000_6, Object obj) {
        int i = ((C0HRK) obj).LLILLL;
        int i2 = awS92S0201000_6.i2;
        if (i != i2 && i2 < ((C0HRL) awS92S0201000_6.l0).LIZIZ.size()) {
            C0HQC c0hqc = (C0HQC) ListProtector.get(((C0HRL) awS92S0201000_6.l0).LIZIZ, awS92S0201000_6.i2);
            Object objLJJJJZI = C13LP.LJJJJZI(c0hqc.LIZIZ);
            C0HQE<Set<C443120HZe<Integer, String, C05YD<C0HOM<? extends C440440HOw>>>>, Integer> c0hqeInvoke = c0hqc.LIZJ.invoke(C08CX.INSTANCE, (C443120HZe<Integer, String, ? extends C05YD<? extends C0HOM<? extends C440440HOw>>>) objLJJJJZI);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (c0hqeInvoke instanceof C0HQD) {
                linkedHashSet.add(objLJJJJZI);
            }
            ((MixStudioIdDropdownViewModel) awS92S0201000_6.l1).setState(new AwS114S0101000_6(linkedHashSet, (Set<C443120HZe<Integer, String, C05YD<C0HOM<? extends C440440HOw>>>>) awS92S0201000_6.i2, 4));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS92S0201000_6 awS92S0201000_6, Object obj) {
        Set set = (Set) awS92S0201000_6.l0;
        int i = awS92S0201000_6.i2;
        List<C0HQC> list = ((C0HRL) awS92S0201000_6.l1).LIZIZ;
        obj.getClass();
        return new C0HRK(set, null, i, list);
    }

    public static final Object invoke$4(AwS92S0201000_6 awS92S0201000_6, Object obj) {
        return C461930I9n.LIZ((C461930I9n) obj, null, (List) awS92S0201000_6.l0, (EnumC429240GsM) awS92S0201000_6.l1, null, new Pair(Integer.valueOf(Math.min(awS92S0201000_6.i2, ((List) awS92S0201000_6.l0).size())), Integer.valueOf(((List) awS92S0201000_6.l0).size())), 0, null, 0, 100, null, 745);
    }

    public static final Object invoke$5(AwS92S0201000_6 awS92S0201000_6, Object obj) {
        return C461930I9n.LIZ((C461930I9n) obj, null, (List) awS92S0201000_6.l0, (EnumC429240GsM) awS92S0201000_6.l1, null, new Pair(Integer.valueOf(Math.min(awS92S0201000_6.i2, ((List) awS92S0201000_6.l0).size())), Integer.valueOf(((List) awS92S0201000_6.l0).size())), 0, null, 0, 100, null, 745);
    }

    public static final Object invoke$6(AwS92S0201000_6 awS92S0201000_6, Object obj) {
        return C461930I9n.LIZ((C461930I9n) obj, (C0IA3) awS92S0201000_6.l0, (List) awS92S0201000_6.l1, EnumC429240GsM.PUBLISHING, null, null, 0, null, 0, awS92S0201000_6.i2, null, 760);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS92S0201000_6 r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS92S0201000_6.invoke$7(kotlin.jvm.internal.AwS92S0201000_6, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$8(AwS92S0201000_6 awS92S0201000_6, Object obj) {
        int i;
        C461930I9n c461930I9n = (C461930I9n) obj;
        ArrayList arrayList = new ArrayList(c461930I9n.LLILLJJLI);
        PublishModel publishModel = (PublishModel) awS92S0201000_6.l0;
        Iterator it2 = arrayList.iterator();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(((C0IA3) it2.next()).LIZIZ().creationId, publishModel.creationId)) {
                if (i2 >= 0) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c461930I9n.LLIZ);
                    linkedHashMap.put(Integer.valueOf(i2), Integer.valueOf(awS92S0201000_6.i2));
                    if (i2 == c461930I9n.LLILZLL) {
                        z = true;
                        i = awS92S0201000_6.i2;
                    } else {
                        i = c461930I9n.LLIZLLLIL;
                    }
                    C0IA3 c0ia3 = (C0IA3) ListProtector.get(arrayList, i2);
                    if (!(c0ia3 instanceof C461970I9r)) {
                        ListProtector.set(arrayList, i2, new C461970I9r((PublishModel) awS92S0201000_6.l0, c0ia3.LIZ(), awS92S0201000_6.i2));
                    } else {
                        C461970I9r c461970I9r = (C461970I9r) c0ia3;
                        ListProtector.set(arrayList, i2, new C461970I9r(c461970I9r.LIZLLL, c461970I9r.LJ, awS92S0201000_6.i2));
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updatePublishProgress, taskIndex:");
                    sbLIZ.append(i2);
                    sbLIZ.append(" shouldUpdateDisplay:");
                    sbLIZ.append(z);
                    sbLIZ.append(" progress:");
                    sbLIZ.append(awS92S0201000_6.i2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    ((FriendsV3PublishStatusViewModel) awS92S0201000_6.l1).setState(new AwS39S0301000_6(c0ia3, (C0IA3) arrayList, (List<C0IA3>) linkedHashMap, (Map<Integer, Integer>) i, 3));
                }
            } else {
                i2++;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updatePublishProgress, cannot find publishing task, creationId=");
        sbLIZ2.append(((PublishModel) awS92S0201000_6.l0).creationId);
        C2188811AlT.LIZIZ(sbLIZ2);
        FriendsV3PublishStatusViewModel friendsV3PublishStatusViewModel = (FriendsV3PublishStatusViewModel) awS92S0201000_6.l1;
        PublishModel publishModel2 = (PublishModel) awS92S0201000_6.l0;
        friendsV3PublishStatusViewModel.getClass();
        friendsV3PublishStatusViewModel.withState(new AwS372S0200000_6(publishModel2, friendsV3PublishStatusViewModel, 69));
        FriendsV3PublishStatusViewModel friendsV3PublishStatusViewModel2 = (FriendsV3PublishStatusViewModel) awS92S0201000_6.l1;
        PublishModel publishModel3 = (PublishModel) awS92S0201000_6.l0;
        int i3 = awS92S0201000_6.i2;
        friendsV3PublishStatusViewModel2.getClass();
        friendsV3PublishStatusViewModel2.withState(new AwS92S0201000_6(publishModel3, friendsV3PublishStatusViewModel2, i3, 8));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS92S0201000_6 awS92S0201000_6, Object obj) {
        Layout layout;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        int lineCount = ((TextView) awS92S0201000_6.l0).getLineCount() - 1;
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(spannableStringBuilder);
        if (lineCount > 0 && (layout = ((TextView) awS92S0201000_6.l0).getLayout()) != null) {
            TextView textView = (TextView) awS92S0201000_6.l0;
            Drawable drawable = (Drawable) awS92S0201000_6.l1;
            int i = awS92S0201000_6.i2;
            String strLIZ = C420930Gex.LIZ(layout.getLineStart(lineCount), layout.getLineEnd(lineCount), spannableStringBuilder);
            if (strLIZ.length() != 0) {
                if (strLIZ.length() <= 2) {
                    textView.setText(spannableStringBuilderValueOf.subSequence(0, spannableStringBuilder.length() - 2));
                } else {
                    int length = spannableStringBuilderValueOf.length() - 2;
                    int length2 = spannableStringBuilderValueOf.length() - 1;
                    C416750GVt c416750GVt = new C416750GVt(drawable);
                    c416750GVt.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                    C786410Ut5.q2(spannableStringBuilderValueOf, c416750GVt, length, length2, 18);
                    textView.setText(spannableStringBuilderValueOf);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S0201000_6(Activity activity, AwS461S0200000_26 awS461S0200000_26, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.i2 = R.attr.a1h;
        this.l1 = awS461S0200000_26;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S0201000_6(C1255650imR c1255650imR, C19EG c19eg, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1255650imR;
        this.i2 = 0;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S0201000_6(int i, C0HRL c0hrl, MixStudioIdDropdownViewModel mixStudioIdDropdownViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c0hrl;
        this.l1 = mixStudioIdDropdownViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S0201000_6(int i, C0IA3 c0ia3, List list, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c0ia3;
        this.l1 = list;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS92S0201000_6(int i, int i2, List<C0IA3> list, EnumC429240GsM enumC429240GsM) {
        super(1);
        this.$t = enumC429240GsM;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S0201000_6(TextView textView, Drawable drawable, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = textView;
        this.l1 = drawable;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S0201000_6(PublishModel publishModel, FriendsV3PublishStatusViewModel friendsV3PublishStatusViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = publishModel;
        this.l1 = friendsV3PublishStatusViewModel;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS92S0201000_6(Set set, Set<? extends C443120HZe<Integer, String, ? extends C05YD<? extends C0HOM<? extends C440440HOw>>>> set2, int i, C0HRL c0hrl) {
        super(1);
        this.$t = c0hrl;
        this.l0 = set;
        this.i2 = set2;
        this.l1 = i;
    }
}
