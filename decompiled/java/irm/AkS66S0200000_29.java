package irm;

import X.AbstractC1391830mK5;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.AnonymousClass1290;
import X.AnonymousClass1297;
import X.AnonymousClass1298;
import X.C098200Yq;
import X.C0CHQ;
import X.C0WZX;
import X.C129X;
import X.C12E6;
import X.C12E8;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C189200o6;
import X.C19401110vJ;
import X.C19407410wK;
import X.C19417010xs;
import X.C19417110xt;
import X.C19644911tX;
import X.C19645011tY;
import X.C19645711tf;
import X.C19646111tj;
import X.C19772712Xt;
import X.C20145713s7;
import X.C20467080b;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C444920HcY;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC19645311tb;
import X.EnumC19645411tc;
import X.InterfaceC19401310vL;
import X.InterfaceC19407610wM;
import X.InterfaceC19417310xv;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.panel.EditTTSPanelFragment;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
public class AkS66S0200000_29 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS66S0200000_29 akS66S0200000_29, View view) {
        int adapterPosition;
        AnonymousClass1290 anonymousClass1290 = (AnonymousClass1290) akS66S0200000_29.l0;
        AnonymousClass1297 anonymousClass1297 = anonymousClass1290.LL;
        if (anonymousClass1290.getBindingAdapter() == null) {
            adapterPosition = 0;
        } else {
            adapterPosition = ((AnonymousClass1290) akS66S0200000_29.l0).getAdapterPosition();
        }
        anonymousClass1297.LJIIL(adapterPosition);
        AnonymousClass1290 anonymousClass12902 = (AnonymousClass1290) akS66S0200000_29.l0;
        MusicModel musicModel = anonymousClass12902.LLILLJJLI;
        if (musicModel != null) {
            anonymousClass12902.I5(musicModel);
        }
    }

    public static final void LIZ$1(AkS66S0200000_29 akS66S0200000_29, View view) {
        InterfaceC19407610wM interfaceC19407610wM = ((EditTTSPanelFragment) akS66S0200000_29.l0).LLILLL;
        if (interfaceC19407610wM != null) {
            interfaceC19407610wM.LLJZIJLIL((VoiceCloneReadTextEffectBean) ((ReadTextEffectBean) akS66S0200000_29.l1));
        }
    }

    public static final void LIZ$10(AkS66S0200000_29 akS66S0200000_29, View view) {
        ((C12E6) akS66S0200000_29.l0).N5((C12E8) akS66S0200000_29.l1);
    }

    public static final void LIZ$11(AkS66S0200000_29 akS66S0200000_29, View view) {
        C19401110vJ c19401110vJ = (C19401110vJ) akS66S0200000_29.l0;
        InterfaceC19401310vL interfaceC19401310vL = c19401110vJ.LL;
        if (interfaceC19401310vL != null) {
            interfaceC19401310vL.LIZ(c19401110vJ.getAdapterPosition(), (View) akS66S0200000_29.l1);
        }
    }

    public static final void LIZ$12(AkS66S0200000_29 akS66S0200000_29, View view) {
        int adapterPosition;
        C129X c129x = (C129X) akS66S0200000_29.l0;
        AnonymousClass1297 anonymousClass1297 = c129x.LLILLJJLI;
        View view2 = (View) akS66S0200000_29.l1;
        if (c129x.getBindingAdapter() == null) {
            adapterPosition = 0;
        } else {
            adapterPosition = ((C129X) akS66S0200000_29.l0).getAdapterPosition();
        }
        anonymousClass1297.LJIIIIZZ(adapterPosition, view2);
    }

    public static final void LIZ$2(AkS66S0200000_29 akS66S0200000_29, View view) {
        C19407410wK c19407410wK = (C19407410wK) akS66S0200000_29.l0;
        ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) akS66S0200000_29.l1;
        InterfaceC19407610wM interfaceC19407610wM = c19407410wK.LLJILJIL.LL.LLILLL;
        if (interfaceC19407610wM != null) {
            interfaceC19407610wM.LLLI(readTextEffectBean);
        }
    }

    public static final void LIZ$3(AkS66S0200000_29 akS66S0200000_29, View view) {
        C19407410wK c19407410wK = (C19407410wK) akS66S0200000_29.l0;
        ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) akS66S0200000_29.l1;
        InterfaceC19407610wM interfaceC19407610wM = c19407410wK.LLJILJIL.LL.LLILLL;
        if (interfaceC19407610wM != null) {
            interfaceC19407610wM.LLLI(readTextEffectBean);
        }
    }

    public static final void LIZ$4(AkS66S0200000_29 akS66S0200000_29, View view) {
        Object c098200Yq;
        ClipboardManager clipboardManager;
        ClipData clipDataLIZIZ;
        ClipData.Item itemLJJIIZ;
        CharSequence charSequenceLJJIIJ;
        String string;
        C19645011tY c19645011tY = ((C19644911tX) akS66S0200000_29.l0).LJIIIZ;
        if (c19645011tY != null) {
            Context context = ((TuxTextView) akS66S0200000_29.l1).getContext();
            EnumC19645311tb value = c19645011tY.LJIIIZ.getValue();
            if (value != null) {
                int i = C19645711tf.LIZ[value.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        c19645011tY.LJIIL.postValue(EnumC19645411tc.ON_EDIT);
                        return;
                    }
                    return;
                }
                try {
                    Object objH2 = C786410Ut5.H2(context, "clipboard");
                    c098200Yq = null;
                    if ((objH2 instanceof ClipboardManager) && (clipboardManager = (ClipboardManager) objH2) != null && (clipDataLIZIZ = C20145713s7.LIZIZ(clipboardManager, CertProviderManagerKt.findCert("bpea-article_sticker_link_paste", 1476399151))) != null && (itemLJJIIZ = C2204961BRm.LJJIIZ(clipDataLIZIZ, 0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOWvYNHA2SWLHScjorMhBP/18g3s3p/dcUTi1TcY6iDh1INeLo3Ggjebk2crksdtPIniZblFnGZim/LcDRhncbRAudIGnA==", null))) != null && (charSequenceLJJIIJ = C2204961BRm.LJJIIJ(itemLJJIIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOWvYNHA2SWLHScjorMhBP/18g3s3p/dcUTi1TcY6iDh1INeLo3Ggjebk2crksdtPIniZblFnGZim/LcDRhncbRAudIGnA==", null))) != null && (string = charSequenceLJJIIJ.toString()) != null) {
                        c19645011tY.LJIIJJI.postValue(string);
                        c098200Yq = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            }
        }
    }

    public static final void LIZ$5(AkS66S0200000_29 akS66S0200000_29, View view) {
        Object obj;
        C19646111tj c19646111tj = ((C19644911tX) akS66S0200000_29.l0).LJIIL;
        if (c19646111tj != null) {
            KeyboardUtils.LIZ(c19646111tj.getContext(), c19646111tj.getEditor());
        }
        C19644911tX c19644911tX = (C19644911tX) akS66S0200000_29.l0;
        final Context context = ((TuxIconView) akS66S0200000_29.l1).getContext();
        C1397510mTF c1397510mTF = c19644911tX.LJIILIIL;
        if (c1397510mTF == null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJIIIZ = new AbstractC1391830mK5(context) { // from class: X.0DVO
                public final /* synthetic */ Context LJ;

                @Override // X.AbstractC1397490mTD
                public final View LIZIZ() {
                    FrameLayout frameLayout = new FrameLayout(this.LJ);
                    Context context2 = this.LJ;
                    C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88))));
                    TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
                    layoutParams.gravity = 17;
                    C786410Ut5.M6(tuxIconView, layoutParams);
                    tuxIconView.setIconRes(R.raw.icon_info_circle);
                    tuxIconView.setTintColorRes(R.attr.a1j);
                    frameLayout.addView(tuxIconView);
                    return frameLayout;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(context, 0);
                    this.LJ = context;
                }
            };
            String strLIZIZ = C20467080b.LIZIZ(2131826630);
            CharSequence charSequence = "";
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            c1397580mTM.LJI(strLIZIZ);
            try {
                String strLIZIZ2 = C20467080b.LIZIZ(2131826627);
                if (strLIZIZ2 == null) {
                    strLIZIZ2 = "";
                }
                String strLIZIZ3 = C20467080b.LIZIZ(2131826631);
                if (strLIZIZ3 == null) {
                    strLIZIZ3 = "";
                }
                String string = context.getString(2131826628, strLIZIZ3);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ2);
                sbLIZ.append("\n-\n");
                sbLIZ.append(string);
                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ);
                SpannableString spannableString = new SpannableString(strLIZIZ4);
                int iLJJJ = a0.LJJJ(strLIZIZ4, "\n-\n", 0, false, 6);
                C786410Ut5.p2(spannableString, new C444920HcY(42, false), iLJJJ, iLJJJ + 3, 17);
                int iLJJJ2 = a0.LJJJ(strLIZIZ4, strLIZIZ3, 0, false, 6);
                int length = strLIZIZ3.length() + iLJJJ2;
                C786410Ut5.p2(spannableString, new C19772712Xt(context, 4), iLJJJ2, length, 17);
                C786410Ut5.p2(spannableString, new C444920HcY(42, false), iLJJJ2, length, 17);
                C189200o6.m2constructorimpl(spannableString);
                obj = spannableString;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
            Object obj2 = obj;
            if (zM7isFailureimpl) {
                obj2 = null;
            }
            SpannableString spannableString2 = (SpannableString) obj2;
            if (spannableString2 != null) {
                charSequence = spannableString2;
            }
            c1397580mTM.LIZIZ(charSequence);
            C985403tE.LIZ(c1397580mTM, AFwS245S0000000_12.get$arr$(158));
            c1397580mTM.LIZLLL(new AwS608S0100000_29(c19644911tX, 637));
            c1397510mTF = new C1397510mTF(c1397580mTM);
            c19644911tX.LJIILIIL = c1397510mTF;
        }
        c1397510mTF.LIZLLL();
    }

    public static final void LIZ$6(AkS66S0200000_29 akS66S0200000_29, View view) {
        int adapterPosition;
        C0CHQ.LIZ().LJJJJI().sceneReport("click_music_edit");
        AnonymousClass1298 anonymousClass1298 = (AnonymousClass1298) akS66S0200000_29.l0;
        AnonymousClass1297 anonymousClass1297 = anonymousClass1298.LLILLJJLI;
        View view2 = (View) akS66S0200000_29.l1;
        if (anonymousClass1298.getBindingAdapter() == null) {
            adapterPosition = 0;
        } else {
            adapterPosition = ((AnonymousClass1298) akS66S0200000_29.l0).getAdapterPosition();
        }
        anonymousClass1297.LIZ(adapterPosition, view2);
    }

    public static final void LIZ$7(AkS66S0200000_29 akS66S0200000_29, View view) {
        boolean z;
        View view2 = ((C19417010xs) akS66S0200000_29.l0).LLILZ;
        if (view2 != null && view2.getVisibility() == 0) {
            return;
        }
        C19417010xs c19417010xs = (C19417010xs) akS66S0200000_29.l0;
        if (c19417010xs.LLJIJIL == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c19417010xs.LIZIZ(2, false);
            ((InterfaceC19417310xv) akS66S0200000_29.l1).di();
            ((C19417010xs) akS66S0200000_29.l0).setSelectedView(true);
        }
        C19417010xs c19417010xs2 = (C19417010xs) akS66S0200000_29.l0;
        if (c19417010xs2.LL == 2) {
            ((InterfaceC19417310xv) akS66S0200000_29.l1).zI(c19417010xs2.LLJIJIL);
        }
        C19417010xs c19417010xs3 = (C19417010xs) akS66S0200000_29.l0;
        if (c19417010xs3.LL == 0) {
            c19417010xs3.LIZIZ(2, false);
            ((InterfaceC19417310xv) akS66S0200000_29.l1).p7(((C19417010xs) akS66S0200000_29.l0).LLJIJIL);
        }
        C19417010xs c19417010xs4 = (C19417010xs) akS66S0200000_29.l0;
        if (c19417010xs4.LL == 1) {
            ((InterfaceC19417310xv) akS66S0200000_29.l1).p7(c19417010xs4.LLJIJIL);
        }
    }

    public static final void LIZ$8(AkS66S0200000_29 akS66S0200000_29, View view) {
        C19417110xt c19417110xt = (C19417110xt) akS66S0200000_29.l0;
        if (c19417110xt.LLJ == 2) {
            ((InterfaceC19417310xv) akS66S0200000_29.l1).zI(c19417110xt.LLJIJIL);
        }
        C19417110xt c19417110xt2 = (C19417110xt) akS66S0200000_29.l0;
        if (c19417110xt2.LLJ == 0) {
            VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean = c19417110xt2.LLJILJIL;
            if (voiceCloneReadTextEffectBean != null && !voiceCloneReadTextEffectBean.isRecordCompleted) {
                ((InterfaceC19417310xv) akS66S0200000_29.l1).wg(false);
            } else {
                c19417110xt2.I5(2, false);
                ((InterfaceC19417310xv) akS66S0200000_29.l1).p7(((C19417110xt) akS66S0200000_29.l0).LLJIJIL);
            }
        }
        C19417110xt c19417110xt3 = (C19417110xt) akS66S0200000_29.l0;
        if (c19417110xt3.LLJ == 1) {
            if (c19417110xt3.LLJI) {
                ((InterfaceC19417310xv) akS66S0200000_29.l1).wg(true);
            } else {
                ((InterfaceC19417310xv) akS66S0200000_29.l1).p7(c19417110xt3.LLJIJIL);
            }
        }
    }

    public static final void LIZ$9(AkS66S0200000_29 akS66S0200000_29, View view) {
        ((C12E6) akS66S0200000_29.l0).N5((C12E8) akS66S0200000_29.l1);
    }

    public AkS66S0200000_29(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
