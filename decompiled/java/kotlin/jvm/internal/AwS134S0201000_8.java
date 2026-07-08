package kotlin.jvm.internal;

import X.AbstractC420130Gdf;
import X.C00IR;
import X.C09AY;
import X.C0CHQ;
import X.C0L92;
import X.C0M0P;
import X.C0M5M;
import X.C0M6S;
import X.C0M6V;
import X.C0M6Y;
import X.C0MFP;
import X.C0ZDN;
import X.C1388190mED;
import X.C198H;
import X.C19EG;
import X.C20642515q3;
import X.C2188811AlT;
import X.C420140Gdg;
import X.C426320Gne;
import X.C522360KeA;
import X.C523870Kgb;
import X.C530490KrH;
import X.C531590Kt3;
import X.C553680Lna;
import X.C562830M5p;
import X.C564410MBr;
import X.C574840Mgc;
import X.C574860Mge;
import X.C576730Mjf;
import X.C577530Mkx;
import X.C580090Mp5;
import X.C786410Ut5;
import X.EnumC545550LaT;
import X.EnumC562840M5q;
import X.InterfaceC20597015ii;
import X.InterfaceC562000M2k;
import X.InterfaceC562850M5r;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS134S0201000_8 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS134S0201000_8 awS134S0201000_8) {
        C198H c198hLC = ((InterfaceC20597015ii) awS134S0201000_8.l0).LC();
        if (c198hLC != null) {
            c198hLC.setResult(awS134S0201000_8.i2, (Intent) awS134S0201000_8.l1);
        }
        C198H c198hLC2 = ((InterfaceC20597015ii) awS134S0201000_8.l0).LC();
        if (c198hLC2 != null) {
            c198hLC2.finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS134S0201000_8 awS134S0201000_8) {
        boolean z;
        C522360KeA.LIZ(C523870Kgb.LIZIZ((Intent) awS134S0201000_8.l0, C0L92.SUCCESS, ""));
        C580090Mp5 c580090Mp5 = (C580090Mp5) ((C531590Kt3) awS134S0201000_8.l1).LLILZ.getValue();
        Activity activity = ((C531590Kt3) awS134S0201000_8.l1).LL;
        Intent intent = (Intent) awS134S0201000_8.l0;
        if (awS134S0201000_8.i2 == 31001) {
            z = true;
        } else {
            z = false;
        }
        c580090Mp5.LIZ(new C0M5M(activity, intent, z));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS134S0201000_8 awS134S0201000_8) {
        C0M6V c0m6v = (C0M6V) awS134S0201000_8.l0;
        C0M6S c0m6s = C0M6S.NONE;
        c0m6v.V5(c0m6s, ((C00IR) awS134S0201000_8.l1).LIZ, false);
        C0M6Y c0m6y = C0M6Y.LIZ;
        C0M6S c0m6s2 = ((C0M6V) awS134S0201000_8.l0).LLJJJJLIIL;
        int i = awS134S0201000_8.i2;
        c0m6y.getClass();
        C0M6Y.LJFF(c0m6s2, c0m6s, i);
        ((C0M6V) awS134S0201000_8.l0).LLJJJJLIIL = c0m6s;
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS134S0201000_8 awS134S0201000_8) {
        String strLJI;
        int i = awS134S0201000_8.i2;
        C562830M5p c562830M5p = (C562830M5p) awS134S0201000_8.l0;
        if (i == c562830M5p.LLJJJIL) {
            ViewGroup viewGroup = c562830M5p.LLJJIJIIJIL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
            }
            C562830M5p c562830M5p2 = (C562830M5p) awS134S0201000_8.l0;
            C553680Lna c553680Lna = (C553680Lna) awS134S0201000_8.l1;
            c562830M5p2.getClass();
            if (c553680Lna.LIZJ == EnumC545550LaT.NONE) {
                ViewGroup viewGroup2 = c562830M5p2.LLJILJIL;
                if (viewGroup2 != null) {
                    C786410Ut5.LJLZ(8, viewGroup2);
                }
                ViewGroup viewGroup3 = c562830M5p2.LLJIJIL;
                if (viewGroup3 != null) {
                    C786410Ut5.LJLZ(8, viewGroup3);
                }
                c562830M5p2.LLJJJ = EnumC562840M5q.LLILLL;
                c562830M5p2.S5(c553680Lna);
            } else {
                c562830M5p2.LLJJJ = EnumC562840M5q.LLILLJJLI;
                ViewGroup viewGroup4 = c562830M5p2.LLJJI;
                if (viewGroup4 != null) {
                    C786410Ut5.LJLZ(8, viewGroup4);
                }
                ViewGroup viewGroup5 = c562830M5p2.LLJILJIL;
                if (viewGroup5 != null) {
                    C786410Ut5.LJLZ(0, viewGroup5);
                }
                EnumC545550LaT enumC545550LaT = c553680Lna.LIZJ;
                if (enumC545550LaT == EnumC545550LaT.PROCESSING) {
                    TuxIconView tuxIconView = c562830M5p2.LLJILJILJ;
                    if (tuxIconView != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                    }
                    C426320Gne c426320Gne = c562830M5p2.LLJILLL;
                    if (c426320Gne != null) {
                        C786410Ut5.LLLZZ(c426320Gne, 0);
                    }
                    float f = c553680Lna.LIZLLL;
                    C426320Gne c426320Gne2 = c562830M5p2.LLJILLL;
                    if (c426320Gne2 != null) {
                        c426320Gne2.LIZ(f, false);
                    }
                    TuxTextView tuxTextView = c562830M5p2.LLJJ;
                    if (tuxTextView != null) {
                        tuxTextView.setText(C20642515q3.LJI(2131850029));
                    }
                } else if (enumC545550LaT == EnumC545550LaT.COMPLETE) {
                    TuxIconView tuxIconView2 = c562830M5p2.LLJILJILJ;
                    if (tuxIconView2 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                    }
                    TuxIconView tuxIconView3 = c562830M5p2.LLJILJILJ;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setIconRes(R.raw.icon_color_tick_circle_green);
                    }
                    TuxIconView tuxIconView4 = c562830M5p2.LLJILJILJ;
                    if (tuxIconView4 != null) {
                        tuxIconView4.LIZ();
                    }
                    C426320Gne c426320Gne3 = c562830M5p2.LLJILLL;
                    if (c426320Gne3 != null) {
                        C786410Ut5.LLLZZ(c426320Gne3, 8);
                    }
                    TuxTextView tuxTextView2 = c562830M5p2.LLJJ;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(C20642515q3.LJI(2131850028));
                    }
                } else if (enumC545550LaT == EnumC545550LaT.FAILED) {
                    TuxIconView tuxIconView5 = c562830M5p2.LLJILJILJ;
                    if (tuxIconView5 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView5, 0);
                    }
                    TuxIconView tuxIconView6 = c562830M5p2.LLJILJILJ;
                    if (tuxIconView6 != null) {
                        tuxIconView6.setIconRes(R.raw.icon_exclamation_mark_circle);
                    }
                    TuxIconView tuxIconView7 = c562830M5p2.LLJILJILJ;
                    if (tuxIconView7 != null) {
                        tuxIconView7.setTintColorRes(R.attr.ee);
                    }
                    C426320Gne c426320Gne4 = c562830M5p2.LLJILLL;
                    if (c426320Gne4 != null) {
                        C786410Ut5.LLLZZ(c426320Gne4, 8);
                    }
                    TuxTextView tuxTextView3 = c562830M5p2.LLJJ;
                    if (tuxTextView3 != null) {
                        if (C0CHQ.LIZ().LJI().LJIILIIL()) {
                            strLJI = C20642515q3.LJI(2131832400);
                        } else {
                            strLJI = C20642515q3.LJI(2131850027);
                        }
                        tuxTextView3.setText(strLJI);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS134S0201000_8 awS134S0201000_8) {
        C19EG c19egLIZIZ;
        ViewGroup viewGroup;
        InterfaceC562850M5r interfaceC562850M5rLJIIJJI;
        int i = awS134S0201000_8.i2;
        C562830M5p c562830M5p = (C562830M5p) awS134S0201000_8.l0;
        if (i == c562830M5p.LLJJJIL) {
            AwS94S0201000_8 awS94S0201000_8 = new AwS94S0201000_8(i, (C553680Lna) awS134S0201000_8.l1, c562830M5p, 4);
            Context context = c562830M5p.LLILZIL;
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (viewGroup = c562830M5p.LLJJIJIIJIL) != null && (interfaceC562850M5rLJIIJJI = c562830M5p.P5().LJIIJJI()) != null) {
                interfaceC562850M5rLJIIJJI.LIZIZ(viewGroup, c562830M5p.itemView.getContext(), LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ), new AwS444S0200000_8(c562830M5p, awS94S0201000_8, 18));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS134S0201000_8 awS134S0201000_8) {
        C522360KeA.LIZ(C523870Kgb.LIZIZ((Intent) awS134S0201000_8.l0, C0L92.SUCCESS, ""));
        C198H c198hLC = ((InterfaceC20597015ii) awS134S0201000_8.l1).LC();
        if (c198hLC != null) {
            c198hLC.setResult(awS134S0201000_8.i2, (Intent) awS134S0201000_8.l0);
        }
        C198H c198hLC2 = ((InterfaceC20597015ii) awS134S0201000_8.l1).LC();
        if (c198hLC2 != null) {
            c198hLC2.finish();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS134S0201000_8 r6) {
        /*
            java.lang.Object r0 = r6.l0
            X.0Mgc r0 = (X.C574840Mgc) r0
            r3 = 0
            r0.LIZIZ = r3
            X.0ntP r0 = r0.LJ
            X.0Dkm r5 = X.C352130DrH.LIZIZ(r0)
            if (r5 == 0) goto L5a
            r5.LIZ()
            java.lang.Object r0 = r6.l1
            com.ss.android.vesdk.runtime.VEEditorResManager r0 = (com.ss.android.vesdk.runtime.VEEditorResManager) r0
            java.lang.String[] r1 = r0.mReverseVideoPath
            r4 = 1
            if (r1 == 0) goto L2b
            int r0 = r1.length
            if (r0 == 0) goto L57
            int r0 = r1.length
            if (r0 != r4) goto L57
            X.0EYJ r2 = r5.LIZLLL()
            r1 = r1[r3]
            r0 = 0
            r2.LJJIIZ(r0, r1)
        L2b:
            java.lang.Object r0 = r6.l1
            com.ss.android.vesdk.runtime.VEEditorResManager r0 = (com.ss.android.vesdk.runtime.VEEditorResManager) r0
            java.lang.String[] r2 = r0.mReverseAudioPaths
            if (r2 == 0) goto L42
            int r0 = r2.length
            if (r0 == 0) goto L57
            int r0 = r2.length
            if (r0 != r4) goto L57
            X.0EYJ r1 = r5.LIZLLL()
            r0 = r2[r3]
            r1.LJJJIL(r0)
        L42:
            r5.LIZIZ()
            int r0 = r6.i2
            if (r0 != 0) goto L4a
            r3 = 1
        L4a:
            java.lang.Object r0 = r6.l0
            X.0Mgc r0 = (X.C574840Mgc) r0
            v7.o<java.lang.Boolean> r1 = r0.LJI
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.LJ(r0)
        L57:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS134S0201000_8.invoke$3(kotlin.jvm.internal.AwS134S0201000_8):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS134S0201000_8 r6) {
        /*
            java.lang.Object r0 = r6.l0
            X.0Mge r0 = (X.C574860Mge) r0
            r3 = 0
            r0.LIZIZ = r3
            X.0ntP r0 = r0.LJ
            X.0Dkm r5 = X.C352130DrH.LIZIZ(r0)
            if (r5 == 0) goto L5a
            r5.LIZ()
            java.lang.Object r0 = r6.l1
            com.ss.android.vesdk.runtime.VEEditorResManager r0 = (com.ss.android.vesdk.runtime.VEEditorResManager) r0
            java.lang.String[] r1 = r0.mReverseVideoPath
            r4 = 1
            if (r1 == 0) goto L2b
            int r0 = r1.length
            if (r0 == 0) goto L57
            int r0 = r1.length
            if (r0 != r4) goto L57
            X.0EYJ r2 = r5.LIZLLL()
            r1 = r1[r3]
            r0 = 0
            r2.LJJIIZ(r0, r1)
        L2b:
            java.lang.Object r0 = r6.l1
            com.ss.android.vesdk.runtime.VEEditorResManager r0 = (com.ss.android.vesdk.runtime.VEEditorResManager) r0
            java.lang.String[] r2 = r0.mReverseAudioPaths
            if (r2 == 0) goto L42
            int r0 = r2.length
            if (r0 == 0) goto L57
            int r0 = r2.length
            if (r0 != r4) goto L57
            X.0EYJ r1 = r5.LIZLLL()
            r0 = r2[r3]
            r1.LJJJIL(r0)
        L42:
            r5.LIZIZ()
            int r0 = r6.i2
            if (r0 != 0) goto L4a
            r3 = 1
        L4a:
            java.lang.Object r0 = r6.l0
            X.0Mge r0 = (X.C574860Mge) r0
            v7.o<java.lang.Boolean> r1 = r0.LJI
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.LJ(r0)
        L57:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS134S0201000_8.invoke$4(kotlin.jvm.internal.AwS134S0201000_8):java.lang.Object");
    }

    public static final Object invoke$5(AwS134S0201000_8 awS134S0201000_8) {
        int width = ((TuxIconView) awS134S0201000_8.l0).getWidth();
        int height = ((TuxIconView) awS134S0201000_8.l0).getHeight();
        if (width > 0 && height > 0) {
            C530490KrH c530490KrH = (C530490KrH) awS134S0201000_8.l1;
            c530490KrH.LLILZ = ((long) height) | (((long) width) << 32);
            c530490KrH.LLILZIL = awS134S0201000_8.i2;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS134S0201000_8 awS134S0201000_8) {
        C0MFP c0mfp = (C0MFP) awS134S0201000_8.l0;
        PromptModel promptModel = (PromptModel) awS134S0201000_8.l1;
        int i = awS134S0201000_8.i2;
        new C0ZDN(c0mfp.requireSceneContext()).LIZ(0);
        PromptPageMobParam promptPageMobParam = c0mfp.LLLLILI().LIZ.LIZIZ.getAILivePhotoModel().mobParam;
        PromptType promptType = promptModel.promptType;
        if (promptType == PromptType.RECOMMEND_FROM_GPT) {
            promptPageMobParam.hasGeneratePrompt = true;
        }
        if (promptType == PromptType.RECOMMEND_PRESET) {
            promptPageMobParam.hasPresetPrompt = true;
        }
        c0mfp.LLLLIL().LJFF.invoke(promptPageMobParam);
        c0mfp.LLLLIL().LIZ.invoke(promptModel);
        C564410MBr.LIZ.getClass();
        C564410MBr.LJIJJ(c0mfp.LLLLILI().LIZ.LIZIZ, i + 1, promptModel);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS134S0201000_8 awS134S0201000_8) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on toolbar panel icon clicked: ");
        sbLIZ.append(awS134S0201000_8.i2);
        C576730Mjf.LJIIIZ("CameraLayoutToolbarScene", C2188811AlT.LIZIZ(sbLIZ));
        if (!((C577530Mkx) awS134S0201000_8.l0).LLLLILI().LIZ.LJ) {
            C576730Mjf.LJIIIZ("CameraLayoutToolbarScene", "do nothing on panel icon clicked");
        } else {
            ((C577530Mkx) awS134S0201000_8.l0).LLLLLJIL().setOption((AbstractC420130Gdf) awS134S0201000_8.l1);
            if (((AbstractC420130Gdf) awS134S0201000_8.l1) instanceof C420140Gdg) {
                ((C577530Mkx) awS134S0201000_8.l0).LLLLIL().LIZ.invoke(((C420140Gdg) ((AbstractC420130Gdf) awS134S0201000_8.l1)).LIZLLL, Boolean.FALSE);
            } else {
                ((C577530Mkx) awS134S0201000_8.l0).LLLLIL().LIZIZ.invoke();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS134S0201000_8 awS134S0201000_8) {
        InterfaceC562000M2k interfaceC562000M2kT5 = ((DraftBoxTaskItemViewHolder) awS134S0201000_8.l0).T5();
        if (interfaceC562000M2kT5 != null) {
            interfaceC562000M2kT5.LLLLZLLIL(awS134S0201000_8.i2, (C0M0P) awS134S0201000_8.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS134S0201000_8 awS134S0201000_8) {
        InterfaceC562000M2k interfaceC562000M2kT5 = ((DraftBoxNormalItemViewHolder) awS134S0201000_8.l0).T5();
        if (interfaceC562000M2kT5 != null) {
            interfaceC562000M2kT5.LLLLZLLIL(awS134S0201000_8.i2, (C0M0P) awS134S0201000_8.l1);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS134S0201000_8(int r3, android.content.Intent r4, X.InterfaceC20597015ii r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            if (r6 == 0) goto L10
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.i2 = r3
            r0 = 0
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r5
            r1.i2 = r3
            r1.l1 = r4
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS134S0201000_8.<init>(int, android.content.Intent, X.15ii, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0201000_8(int i, C553680Lna c553680Lna, C562830M5p c562830M5p, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c562830M5p;
        this.l1 = c553680Lna;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0201000_8(int i, C577530Mkx c577530Mkx, AbstractC420130Gdf abstractC420130Gdf, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c577530Mkx;
        this.l1 = abstractC420130Gdf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0201000_8(C0M6V c0m6v, C00IR c00ir, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0m6v;
        this.l1 = c00ir;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0201000_8(C0MFP c0mfp, PromptModel promptModel, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0mfp;
        this.l1 = promptModel;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0201000_8(C574840Mgc c574840Mgc, VEEditorResManager vEEditorResManager, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c574840Mgc;
        this.l1 = vEEditorResManager;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0201000_8(C574860Mge c574860Mge, VEEditorResManager vEEditorResManager, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c574860Mge;
        this.l1 = vEEditorResManager;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0201000_8(Intent intent, C531590Kt3 c531590Kt3, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = intent;
        this.l1 = c531590Kt3;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0201000_8(TuxIconView tuxIconView, C530490KrH c530490KrH, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = tuxIconView;
        this.l1 = c530490KrH;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0201000_8(DraftBoxNormalItemViewHolder draftBoxNormalItemViewHolder, int i, C0M0P c0m0p, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = draftBoxNormalItemViewHolder;
        this.i2 = i;
        this.l1 = c0m0p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0201000_8(DraftBoxTaskItemViewHolder draftBoxTaskItemViewHolder, int i, C0M0P c0m0p, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = draftBoxTaskItemViewHolder;
        this.i2 = i;
        this.l1 = c0m0p;
    }
}
