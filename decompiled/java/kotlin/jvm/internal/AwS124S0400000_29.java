package kotlin.jvm.internal;

import X.AbstractC1252750ihl;
import X.C09AY;
import X.C0FHM;
import X.C0FSC;
import X.C118300cf;
import X.C11DL;
import X.C11H6;
import X.C11Z5;
import X.C11ZF;
import X.C1252520ihO;
import X.C1252540ihQ;
import X.C12HN;
import X.C12QA;
import X.C12QB;
import X.C1397620mTQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19466211Dw;
import X.C19522211Zk;
import X.C19658811vm;
import X.C201955140j;
import X.C2188811AlT;
import X.C23260099m;
import X.C388340FKm;
import X.C390420FSm;
import X.InterfaceC1364105Vn;
import X.InterfaceC19526611aS;
import X.InterfaceC2217241BqE;
import X.InterfaceC874803bO;
import android.app.Activity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautifyInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautifyTag;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes30.dex */
public class AwS124S0400000_29 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS124S0400000_29 awS124S0400000_29, Object obj) {
        return new C19658811vm((TextStickerModel) awS124S0400000_29.l0, (C390420FSm) awS124S0400000_29.l1, C0FHM.VISIBLE, (C0FSC) awS124S0400000_29.l2, (C388340FKm) awS124S0400000_29.l3);
    }

    public static final Object invoke$1(AwS124S0400000_29 awS124S0400000_29, Object obj) {
        return new C11H6(((InterfaceC2217241BqE) awS124S0400000_29.l0).get(obj), ((InterfaceC2217241BqE) awS124S0400000_29.l1).get(obj), ((InterfaceC2217241BqE) awS124S0400000_29.l2).get(obj), ((InterfaceC2217241BqE) awS124S0400000_29.l3).get(obj));
    }

    public static final Object invoke$2(AwS124S0400000_29 awS124S0400000_29, Object obj) {
        boolean z;
        ComposerBeauty composerBeauty = (ComposerBeauty) obj;
        ArrayList arrayList = (ArrayList) awS124S0400000_29.l0;
        C12HN c12hn = (C12HN) awS124S0400000_29.l1;
        C118300cf c118300cf = (C118300cf) awS124S0400000_29.l2;
        C118300cf c118300cf2 = (C118300cf) awS124S0400000_29.l3;
        ArrayList arrayList2 = new ArrayList();
        c12hn.getClass();
        if (!composerBeauty.getExtra().isNone() && (c12hn.LJFF(composerBeauty) || composerBeauty.getAdd2Nodes())) {
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null) {
                for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
                    arrayList2.add(new BeautifyTag(itemsBean.tag, c12hn.LJIILL(composerBeauty).LIZ.intValue()));
                    float fGf = c12hn.gf(composerBeauty, itemsBean.tag, itemsBean.value);
                    if (itemsBean.value == fGf) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (fGf == 0.0f) {
                            if (c118300cf2.element != 1) {
                                c118300cf2.element = 2;
                            }
                        } else {
                            c118300cf2.element = 1;
                        }
                    } else if (fGf != 0.0f && c118300cf2.element == 2) {
                        c118300cf2.element = 1;
                    }
                }
            }
            c118300cf.element = 1;
        }
        arrayList.add(new BeautifyInfo(composerBeauty.getEffect().getEffectId(), arrayList2));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS124S0400000_29 awS124S0400000_29, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        C12QA c12qa = (C12QA) awS124S0400000_29.l0;
        C12QB c12qb = (C12QB) awS124S0400000_29.l1;
        Activity activity = (Activity) awS124S0400000_29.l2;
        c12qa.getClass();
        C12QA.LIZIZ(c1397620mTQ, c12qb, activity);
        C12QA c12qa2 = (C12QA) awS124S0400000_29.l0;
        C12QB c12qb2 = (C12QB) awS124S0400000_29.l3;
        Activity activity2 = (Activity) awS124S0400000_29.l2;
        c12qa2.getClass();
        C12QA.LIZIZ(c1397620mTQ, c12qb2, activity2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS124S0400000_29 awS124S0400000_29, Object obj) {
        Function2 function2;
        InterfaceC874803bO receiver;
        InterfaceC874803bO receiver2;
        InterfaceC874803bO receiver3;
        AbstractC1252750ihl abstractC1252750ihl = (AbstractC1252750ihl) obj;
        if (abstractC1252750ihl instanceof C19466211Dw) {
            Function1 function1 = (Function1) awS124S0400000_29.l0;
            if (function1 != null && (receiver3 = ((C11DL) awS124S0400000_29.l3).getReceiver()) != null) {
                function1.invoke(receiver3);
            }
        } else if (abstractC1252750ihl instanceof C1252520ihO) {
            Function2 function22 = (Function2) awS124S0400000_29.l1;
            if (function22 != null && (receiver2 = ((C11DL) awS124S0400000_29.l3).getReceiver()) != null) {
                function22.invoke(receiver2, ((C1252520ihO) abstractC1252750ihl).LIZ);
            }
        } else if ((abstractC1252750ihl instanceof C1252540ihQ) && (function2 = (Function2) awS124S0400000_29.l2) != null && (receiver = ((C11DL) awS124S0400000_29.l3).getReceiver()) != null) {
            function2.invoke(receiver, ((C1252540ihQ) abstractC1252750ihl).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS124S0400000_29 awS124S0400000_29, Object obj) {
        List<String> list = (List) obj;
        C19522211Zk c19522211Zk = C19522211Zk.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PPFetchTTSAudioHandler doRealFetch-->onSuccessCallback:");
        sbLIZ.append(list);
        C201955140j.LIZJ(c19522211Zk, C2188811AlT.LIZIZ(sbLIZ));
        List list2 = (List) awS124S0400000_29.l2;
        int i = 0;
        for (String str : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = str;
                if (i < list2.size()) {
                    ((TTSModel) ListProtector.get(list2, i)).audioTrackFilePath = str2;
                    ((TTSModel) ListProtector.get(list2, i)).audioPathList.add(str2);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ((C11Z5) awS124S0400000_29.l0).LJJIJIIJI((InterfaceC19526611aS) awS124S0400000_29.l1, "tts_model_list", (List) awS124S0400000_29.l2);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS124S0400000_29.l3;
        C11ZF c11zf = new C11ZF();
        c11zf.LIZLLL = list;
        C189200o6.m2constructorimpl(c11zf);
        interfaceC1364105Vn.resumeWith(c11zf);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0400000_29(C11Z5 c11z5, InterfaceC19526611aS interfaceC19526611aS, List list, C23260099m c23260099m, int i) {
        super(1);
        this.$t = i;
        this.l0 = c11z5;
        this.l1 = interfaceC19526611aS;
        this.l2 = list;
        this.l3 = c23260099m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0400000_29(C12QA c12qa, C12QB c12qb, Activity activity, C12QB c12qb2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c12qa;
        this.l1 = c12qb;
        this.l2 = activity;
        this.l3 = c12qb2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS124S0400000_29(InterfaceC2217241BqE interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE5) {
        super(1);
        this.$t = interfaceC2217241BqE5;
        this.l0 = interfaceC2217241BqE;
        this.l1 = interfaceC2217241BqE2;
        this.l2 = interfaceC2217241BqE3;
        this.l3 = interfaceC2217241BqE4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0400000_29(TextStickerModel textStickerModel, C388340FKm c388340FKm, C390420FSm c390420FSm, C0FSC c0fsc, int i) {
        super(1);
        this.$t = i;
        this.l0 = textStickerModel;
        this.l1 = c390420FSm;
        this.l2 = c0fsc;
        this.l3 = c388340FKm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS124S0400000_29(ArrayList arrayList, ArrayList<BeautifyInfo> arrayList2, C12HN c12hn, C118300cf c118300cf, C118300cf c118300cf2) {
        super(1);
        this.$t = c118300cf2;
        this.l0 = arrayList;
        this.l1 = arrayList2;
        this.l2 = c12hn;
        this.l3 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS124S0400000_29(Function1 function1, Function1<? super RECEIVER, Unit> function12, Function2<? super RECEIVER, ? super Throwable, Unit> function2, Function2<? super RECEIVER, ? super T, Unit> function22, C11DL<? extends RECEIVER> c11dl) {
        super(1);
        this.$t = c11dl;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = function2;
        this.l3 = function22;
    }
}
