package kotlin.jvm.internal;

import X.AbstractC19526011aM;
import X.C01GW;
import X.C098200Yq;
import X.C09AY;
import X.C0JAI;
import X.C0X2A;
import X.C111Y;
import X.C113E;
import X.C11VK;
import X.C11VM;
import X.C11Y7;
import X.C12Z0;
import X.C1528405yc;
import X.C1537900q7g;
import X.C1541950qED;
import X.C189200o6;
import X.C19389810tU;
import X.C19513011Vw;
import X.C197039127h;
import X.C19EH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC19523011Zs;
import X.InterfaceC19523111Zt;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerConfigResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneAgreementFragment;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneFinishFragment;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneRecordFragment;
import com.ss.android.ugc.gamora.recorder.navi.core.EffectDependencyLoader;
import com.tts.oecverify.BdTuring;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public class AwS178S1100000_29 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS178S1100000_29 awS178S1100000_29) {
        C1528405yc.LIZ((Integer) awS178S1100000_29.l1, "group_onboarding_card_comment_guide", "close", awS178S1100000_29.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS178S1100000_29 awS178S1100000_29) {
        C1528405yc.LIZ((Integer) awS178S1100000_29.l1, "group_onboarding_card_creation_guide", "close", awS178S1100000_29.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS178S1100000_29 awS178S1100000_29) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        ((C19513011Vw) awS178S1100000_29.l1).getClass();
        sbLIZ.append(C19513011Vw.LIZ());
        sbLIZ.append(": ");
        sbLIZ.append(awS178S1100000_29.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS178S1100000_29 awS178S1100000_29) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAssetConfig[");
        sbLIZ.append(awS178S1100000_29.s0);
        sbLIZ.append("]: ");
        sbLIZ.append((ArticleStickerConfigResponse.ArticleStickerAssetConfig) awS178S1100000_29.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS178S1100000_29 awS178S1100000_29) {
        C19EH c19ehLJIIJ;
        ViewGroup.LayoutParams layoutParams;
        C19EH c19ehLJIIJ2;
        ViewGroup.LayoutParams layoutParams2;
        C19EH c19ehLJIIJ3;
        ViewGroup.LayoutParams layoutParams3;
        C11VM c11vm = (C11VM) awS178S1100000_29.l1;
        String str = awS178S1100000_29.s0;
        c11vm.LLJIJIL = str;
        try {
            FrameLayout frameLayout = null;
            if (!Intrinsics.LJFF(str, "agreement_page")) {
                if (Intrinsics.LJFF(c11vm.LLJIJIL, "agreement_detail_page")) {
                    RelativeLayout vopLayout = c11vm.getVopLayout();
                    if (vopLayout != null) {
                        C786410Ut5.LLIIL(vopLayout, 8);
                    }
                    if (c11vm.LLJJIJI == null) {
                        C197039127h c197039127h = c11vm.LLIZ;
                        if (c197039127h == null) {
                            c197039127h = null;
                        }
                        c197039127h.setEnabled(false);
                        String str2 = C0X2A.LIZJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("&store_country=");
                        sbLIZ.append(str2);
                        String strEncode = URLEncoder.encode(C2188811AlT.LIZIZ(sbLIZ));
                        SparkContext sparkContext = new SparkContext();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("aweme://webview?url=https%3A%2F%2Fspeech.tiktokv.com%2Fweb%2Flegal%2Finstant-clone%3Fuse_spark%3D1");
                        sbLIZ2.append(strEncode);
                        sparkContext.LJJLIIJ(C2188811AlT.LIZIZ(sbLIZ2));
                        sparkContext.LJJJJZI(new C12Z0(c11vm, 2));
                        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                        Context context = c11vm.getContext();
                        if (context != null) {
                            c1537900q7g.getClass();
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                            c11vm.LLJJIJI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
                            FrameLayout frameLayout2 = c11vm.LLILZ;
                            if (frameLayout2 != null) {
                                frameLayout = frameLayout2;
                            }
                            frameLayout.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    RelativeLayout agreementDetailLayout = c11vm.getAgreementDetailLayout();
                    if (agreementDetailLayout != null) {
                        C786410Ut5.LLIIL(agreementDetailLayout, 0);
                    }
                    c11vm.LIZ();
                    C11VK.LIZ.getClass();
                    C11VK.LJIIJJI("show");
                } else if (Intrinsics.LJFF(c11vm.LLJIJIL, "record_page")) {
                    if (Intrinsics.LJFF(c11vm.LLJI, "half_screen")) {
                        RelativeLayout vopLayout2 = c11vm.getVopLayout();
                        if (vopLayout2 != null) {
                            layoutParams3 = vopLayout2.getLayoutParams();
                            if (layoutParams3 != null) {
                                layoutParams3.width = -1;
                                layoutParams3.height = (int) C0JAI.LIZ(580.0f, c11vm.getContext());
                            }
                        } else {
                            layoutParams3 = null;
                        }
                        RelativeLayout vopLayout3 = c11vm.getVopLayout();
                        if (vopLayout3 != null) {
                            C786410Ut5.e6(vopLayout3, layoutParams3);
                        }
                    }
                    RelativeLayout agreementDetailLayout2 = c11vm.getAgreementDetailLayout();
                    if (agreementDetailLayout2 != null) {
                        C786410Ut5.LLIIL(agreementDetailLayout2, 8);
                    }
                    FragmentManager fragmentManager = c11vm.getFragmentManager();
                    if (fragmentManager != null) {
                        c19ehLJIIJ3 = fragmentManager.LJIIJ();
                    } else {
                        c19ehLJIIJ3 = null;
                    }
                    c11vm.setFragmentTransaction(c19ehLJIIJ3);
                    C19EH fragmentTransaction = c11vm.getFragmentTransaction();
                    if (fragmentTransaction != null) {
                        int fragmentContainerViewId = c11vm.getFragmentContainerViewId();
                        InstantCloneRecordFragment instantCloneRecordFragment = c11vm.LLJJI;
                        if (instantCloneRecordFragment != null) {
                            fragmentTransaction.LJIJ(fragmentContainerViewId, instantCloneRecordFragment, null);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    C19EH fragmentTransaction2 = c11vm.getFragmentTransaction();
                    if (fragmentTransaction2 != null) {
                        fragmentTransaction2.LJIIJ();
                    }
                    RelativeLayout vopLayout4 = c11vm.getVopLayout();
                    if (vopLayout4 != null) {
                        C786410Ut5.LLIIL(vopLayout4, 0);
                    }
                    C11VK.LIZ.getClass();
                    C01GW c01gw = C11VK.LIZIZ;
                    Keva keva = (Keva) c01gw.getValue();
                    String str3 = C11VK.LJ;
                    if (keva.getInt(str3, 1) == 1) {
                        ((Keva) c01gw.getValue()).storeInt(str3, 0);
                    }
                } else if (Intrinsics.LJFF(c11vm.LLJIJIL, "finish_page")) {
                    if (Intrinsics.LJFF(c11vm.LLJI, "half_screen")) {
                        RelativeLayout vopLayout5 = c11vm.getVopLayout();
                        if (vopLayout5 != null) {
                            layoutParams2 = vopLayout5.getLayoutParams();
                            if (layoutParams2 != null) {
                                layoutParams2.width = -1;
                                layoutParams2.height = (int) C0JAI.LIZ(580.0f, c11vm.getContext());
                            }
                        } else {
                            layoutParams2 = null;
                        }
                        RelativeLayout vopLayout6 = c11vm.getVopLayout();
                        if (vopLayout6 != null) {
                            C786410Ut5.e6(vopLayout6, layoutParams2);
                        }
                    }
                    RelativeLayout agreementDetailLayout3 = c11vm.getAgreementDetailLayout();
                    if (agreementDetailLayout3 != null) {
                        C786410Ut5.LLIIL(agreementDetailLayout3, 8);
                    }
                    FragmentManager fragmentManager2 = c11vm.getFragmentManager();
                    if (fragmentManager2 != null) {
                        c19ehLJIIJ2 = fragmentManager2.LJIIJ();
                    } else {
                        c19ehLJIIJ2 = null;
                    }
                    c11vm.setFragmentTransaction(c19ehLJIIJ2);
                    C19EH fragmentTransaction3 = c11vm.getFragmentTransaction();
                    if (fragmentTransaction3 != null) {
                        int fragmentContainerViewId2 = c11vm.getFragmentContainerViewId();
                        InstantCloneFinishFragment instantCloneFinishFragment = c11vm.LLJJIII;
                        if (instantCloneFinishFragment != null) {
                            fragmentTransaction3.LJIJ(fragmentContainerViewId2, instantCloneFinishFragment, null);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    C19EH fragmentTransaction4 = c11vm.getFragmentTransaction();
                    if (fragmentTransaction4 != null) {
                        fragmentTransaction4.LJIIJ();
                    }
                    RelativeLayout vopLayout7 = c11vm.getVopLayout();
                    if (vopLayout7 != null) {
                        C786410Ut5.LLIIL(vopLayout7, 0);
                    }
                }
            } else {
                if (Intrinsics.LJFF(c11vm.LLJI, "half_screen")) {
                    RelativeLayout vopLayout8 = c11vm.getVopLayout();
                    if (vopLayout8 != null) {
                        layoutParams = vopLayout8.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = -1;
                            layoutParams.height = (int) C0JAI.LIZ(580.0f, c11vm.getContext());
                        }
                    } else {
                        layoutParams = null;
                    }
                    RelativeLayout vopLayout9 = c11vm.getVopLayout();
                    if (vopLayout9 != null) {
                        C786410Ut5.e6(vopLayout9, layoutParams);
                    }
                }
                RelativeLayout agreementDetailLayout4 = c11vm.getAgreementDetailLayout();
                if (agreementDetailLayout4 != null) {
                    C786410Ut5.LLIIL(agreementDetailLayout4, 8);
                }
                FragmentManager fragmentManager3 = c11vm.getFragmentManager();
                if (fragmentManager3 != null) {
                    c19ehLJIIJ = fragmentManager3.LJIIJ();
                } else {
                    c19ehLJIIJ = null;
                }
                c11vm.setFragmentTransaction(c19ehLJIIJ);
                C19EH fragmentTransaction5 = c11vm.getFragmentTransaction();
                if (fragmentTransaction5 != null) {
                    int fragmentContainerViewId3 = c11vm.getFragmentContainerViewId();
                    InstantCloneAgreementFragment instantCloneAgreementFragment = c11vm.LLJJ;
                    if (instantCloneAgreementFragment != null) {
                        fragmentTransaction5.LJIJ(fragmentContainerViewId3, instantCloneAgreementFragment, null);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                C19EH fragmentTransaction6 = c11vm.getFragmentTransaction();
                if (fragmentTransaction6 != null) {
                    fragmentTransaction6.LJIIJ();
                }
                RelativeLayout vopLayout10 = c11vm.getVopLayout();
                if (vopLayout10 != null) {
                    C786410Ut5.LLIIL(vopLayout10, 0);
                }
                C11VK c11vk = C11VK.LIZ;
                String str4 = c11vm.LLJILJIL;
                c11vk.getClass();
                C11VK.LJFF(str4);
            }
            c11vm.LIZIZ();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0086 A[PHI: r1
      0x0086: PHI (r1v23 java.lang.String) = (r1v22 java.lang.String), (r1v25 java.lang.String), (r1v25 java.lang.String), (r1v25 java.lang.String) binds: [B:44:0x0083, B:14:0x002d, B:16:0x0033, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111 A[PHI: r1
      0x0111: PHI (r1v12 java.lang.String) = (r1v11 java.lang.String), (r1v14 java.lang.String), (r1v14 java.lang.String), (r1v14 java.lang.String) binds: [B:92:0x010e, B:62:0x00b8, B:64:0x00be, B:66:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS178S1100000_29 r7) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS178S1100000_29.invoke$4(kotlin.jvm.internal.AwS178S1100000_29):java.lang.Object");
    }

    public static final Object invoke$5(AwS178S1100000_29 awS178S1100000_29) {
        ((EffectDependencyLoader) awS178S1100000_29.l1).LLILLL.add(awS178S1100000_29.s0);
        if (((EffectDependencyLoader) awS178S1100000_29.l1).LLILZ.containsKey(awS178S1100000_29.s0)) {
            List<C111Y> list = (List) ((LinkedHashMap) ((EffectDependencyLoader) awS178S1100000_29.l1).LLILZ).get(awS178S1100000_29.s0);
            if (list != null && !list.isEmpty()) {
                for (C111Y c111y : list) {
                    ((EffectDependencyLoader) awS178S1100000_29.l1).LIZIZ(c111y.LIZ, c111y.LIZIZ, c111y.LIZJ, c111y.LIZLLL);
                }
            }
            ((EffectDependencyLoader) awS178S1100000_29.l1).LLILZ.remove(awS178S1100000_29.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS178S1100000_29 awS178S1100000_29) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPausePlay. sourceId=");
        sbLIZ.append(awS178S1100000_29.s0);
        sbLIZ.append(", curSourceId:");
        sbLIZ.append(((C19389810tU) awS178S1100000_29.l1).LLJILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS178S1100000_29 awS178S1100000_29) {
        InterfaceC19523111Zt interfaceC19523111ZtLIZ;
        InterfaceC19523011Zs interfaceC19523011Zs = ((AbstractC19526011aM) awS178S1100000_29.l1).LIZLLL;
        if (interfaceC19523011Zs != null && (interfaceC19523111ZtLIZ = interfaceC19523011Zs.LIZ(awS178S1100000_29.s0)) != null) {
            return interfaceC19523111ZtLIZ.LJIIIIZZ();
        }
        return null;
    }

    public static final Object invoke$8(AwS178S1100000_29 awS178S1100000_29) {
        ((C113E) awS178S1100000_29.l1).LJIJ(awS178S1100000_29.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS178S1100000_29 awS178S1100000_29) {
        ((C113E) awS178S1100000_29.l1).LJIJ(awS178S1100000_29.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S1100000_29(C19389810tU c19389810tU, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c19389810tU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S1100000_29(C113E c113e, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c113e;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S1100000_29(C11VM c11vm, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c11vm;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S1100000_29(C19513011Vw c19513011Vw, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c19513011Vw;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S1100000_29(C11Y7 c11y7, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c11y7;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S1100000_29(AbstractC19526011aM abstractC19526011aM, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC19526011aM;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S1100000_29(EffectDependencyLoader effectDependencyLoader, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = effectDependencyLoader;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S1100000_29(String str, ArticleStickerConfigResponse.ArticleStickerAssetConfig articleStickerAssetConfig, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = articleStickerAssetConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S1100000_29(String str, Integer num, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = num;
    }
}
