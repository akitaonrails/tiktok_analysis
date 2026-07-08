package kotlin.jvm.internal;

import X.C09AY;
import X.C0E1V;
import X.C0E48;
import X.C0EKW;
import X.C0EOK;
import X.C0ERO;
import X.C0FFC;
import X.C0FFP;
import X.C354270Duj;
import X.C389960FQs;
import X.C426750GoL;
import X.EnumC356070Dxd;
import X.InterfaceC361710EGb;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.ies.nle.editor_jni.INLEModelChangeListener;
import com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nleeditor.NLE;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS14S0410000_5 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS14S0410000_5 awS14S0410000_5) {
        boolean z;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        List<C0FFC> listC1;
        C0FFC next;
        C0E1V c0e1v;
        EnumC356070Dxd enumC356070Dxd;
        if (!((C0EKW) awS14S0410000_5.l0).LJJLIIIJLJLI() && !((C0EKW) awS14S0410000_5.l0).LJJLIIIJL() && !((C0EKW) awS14S0410000_5.l0).LJJLIIIJJIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (((TextStickerModel) awS14S0410000_5.l1).isNotEmptyModel()) {
            if (awS14S0410000_5.z4) {
                ((C0EKW) awS14S0410000_5.l0).LJJLIIJ((TextStickerModel) awS14S0410000_5.l1, true);
            }
            TextStickerModel textStickerModel = (TextStickerModel) awS14S0410000_5.l2;
            if (textStickerModel != null && textStickerModel.isNotEmptyModel()) {
                c0e1v = C0E1V.EDIT_TEXT;
            } else {
                c0e1v = C0E1V.ADD_TEXT;
            }
            if (!((C0EKW) awS14S0410000_5.l0).LJJLIIIJL() && !((C0EKW) awS14S0410000_5.l0).LJJLIIIJJIZ()) {
                enumC356070Dxd = EnumC356070Dxd.DONE;
            } else {
                enumC356070Dxd = EnumC356070Dxd.COMMIT;
            }
            C0EKW.LJJLIL((C0EKW) awS14S0410000_5.l0, (TextStickerModel) awS14S0410000_5.l1, (TextStickerModel) awS14S0410000_5.l2, c0e1v, enumC356070Dxd, false, z, 16);
        } else {
            ((C0EKW) awS14S0410000_5.l0).LJJLIIIJLLLLLLLZ((TextStickerModel) awS14S0410000_5.l1, (TextStickerModel) awS14S0410000_5.l2, (NLETrackSlot) awS14S0410000_5.l3);
        }
        C0EKW c0ekw = (C0EKW) awS14S0410000_5.l0;
        C0E48 c0e48LJJLIIIJILLIZJL = c0ekw.LJJLIIIJILLIZJL();
        C0FFP c0ffpLJJIL = null;
        if (c0e48LJJLIIIJILLIZJL != null) {
            nLETrackSlotLLLLLLIL = c0e48LJJLIIIJILLIZJL.LLLLLLIL();
        } else {
            nLETrackSlotLLLLLLIL = null;
        }
        InterfaceC361710EGb interfaceC361710EGb = (InterfaceC361710EGb) c0ekw.LLJIJIL.getValue(c0ekw, C0EKW.LLJJL[2]);
        if (interfaceC361710EGb != null) {
            interfaceC361710EGb.LR1(true);
        }
        if (nLETrackSlotLLLLLLIL != null) {
            C0EOK c0eokLJJLIIIJJI = c0ekw.LJJLIIIJJI();
            if (c0eokLJJLIIIJJI != null && (listC1 = c0eokLJJLIIIJJI.c1()) != null) {
                Iterator<C0FFC> it2 = listC1.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.LJLI().getUuid(), nLETrackSlotLLLLLLIL.getUUID())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0FFC c0ffc = next;
                if (c0ffc != null) {
                    c0ffpLJJIL = c0ffc.LJJIL();
                }
            }
            if (c0ffpLJJIL instanceof C0ERO) {
                C354270Duj.LIZ(200L, new AwS549S0100000_5(c0ffpLJJIL, 1170));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS14S0410000_5 awS14S0410000_5) {
        String resourceFile;
        NLEResourceNode nLEResourceNode = (NLEResourceNode) awS14S0410000_5.l0;
        if (nLEResourceNode != null) {
            NLEResourceNode nLEResourceNode2 = (NLEResourceNode) awS14S0410000_5.l1;
            if (nLEResourceNode2 != null) {
                resourceFile = nLEResourceNode2.getResourceFile();
            } else {
                resourceFile = null;
            }
            nLEResourceNode.setResourceFile(resourceFile);
        }
        List<INLEResourceDownloadStatusListener> list = ((C389960FQs) awS14S0410000_5.l2).LJJIJ;
        NLEResourceNode nLEResourceNode3 = (NLEResourceNode) awS14S0410000_5.l1;
        boolean z = awS14S0410000_5.z4;
        for (INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener : (CopyOnWriteArrayList) list) {
            if (iNLEResourceDownloadStatusListener != null) {
                iNLEResourceDownloadStatusListener.onSuccess(nLEResourceNode3, z);
            }
        }
        if (((C389960FQs) awS14S0410000_5.l2).LJJIIJZLJL != null) {
            NLELoggerListener logger = NLE.INSTANCE.getLogger();
            if (logger != null) {
                logger.onLog(LogLevel.LEVEL_DEBUG, "NLEModelChangeListener normal callback");
            }
            INLEModelChangeListener iNLEModelChangeListener = ((C389960FQs) awS14S0410000_5.l2).LJJIIJZLJL;
            if (iNLEModelChangeListener != null) {
                iNLEModelChangeListener.onInnerChanged(((NLEEditor) awS14S0410000_5.l3).getModel());
            }
            ((C389960FQs) awS14S0410000_5.l2).LJJIIZ = false;
        } else {
            NLELoggerListener logger2 = NLE.INSTANCE.getLogger();
            if (logger2 != null) {
                logger2.onLog(LogLevel.LEVEL_DEBUG, "NLEModelChangeListener save event");
            }
            ((C389960FQs) awS14S0410000_5.l2).LJJIIZ = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS14S0410000_5 awS14S0410000_5) {
        boolean z;
        ((AnimatorSet) awS14S0410000_5.l0).cancel();
        Context context = (Context) awS14S0410000_5.l1;
        if (context != null && C426750GoL.LIZLLL(context)) {
            z = true;
        } else {
            z = false;
        }
        float f = -105.0f;
        float f2 = -45.0f;
        if (z) {
            if (awS14S0410000_5.z4) {
                f2 = 45.0f;
                f = 105.0f;
            }
        } else if (!awS14S0410000_5.z4) {
            f2 = 45.0f;
            f = 105.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((View) awS14S0410000_5.l2, "rotation", f2, f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator((AccelerateDecelerateInterpolator) awS14S0410000_5.l3);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((View) awS14S0410000_5.l2, "rotation", f, f);
        objectAnimatorOfFloat2.setDuration(40L);
        objectAnimatorOfFloat2.setInterpolator((AccelerateDecelerateInterpolator) awS14S0410000_5.l3);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat((View) awS14S0410000_5.l2, "rotation", f, f2);
        objectAnimatorOfFloat3.setDuration(200L);
        objectAnimatorOfFloat3.setInterpolator((AccelerateDecelerateInterpolator) awS14S0410000_5.l3);
        ((AnimatorSet) awS14S0410000_5.l0).playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        ((AnimatorSet) awS14S0410000_5.l0).start();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S0410000_5(C0EKW c0ekw, TextStickerModel textStickerModel, boolean z, TextStickerModel textStickerModel2, NLETrackSlot nLETrackSlot, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0ekw;
        this.l1 = textStickerModel;
        this.z4 = z;
        this.l2 = textStickerModel2;
        this.l3 = nLETrackSlot;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S0410000_5(AnimatorSet animatorSet, Context context, View view, AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = animatorSet;
        this.l1 = context;
        this.z4 = z;
        this.l2 = view;
        this.l3 = accelerateDecelerateInterpolator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S0410000_5(NLEResourceNode nLEResourceNode, NLEResourceNode nLEResourceNode2, C389960FQs c389960FQs, NLEEditor nLEEditor, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = nLEResourceNode;
        this.l1 = nLEResourceNode2;
        this.l2 = c389960FQs;
        this.l3 = nLEEditor;
        this.z4 = z;
    }
}
