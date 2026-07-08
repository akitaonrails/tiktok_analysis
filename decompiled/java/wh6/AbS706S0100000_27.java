package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0PEM;
import X.C0WZX;
import X.C1125770fOx;
import X.C1308910kAL;
import X.C1355400lNK;
import X.C1390920mIc;
import X.C13LC;
import X.C13LP;
import X.C1444520nh4;
import X.C15438062q;
import X.C1558520qew;
import X.C15TA;
import X.C176600m4;
import X.C1813750xIb;
import X.C1850820yGO;
import X.C1850830yGP;
import X.C1854370yM7;
import X.C1862330yYx;
import X.C1862680yZW;
import X.C1863850ybP;
import X.C1864020ybg;
import X.C1864200yby;
import X.C19EG;
import X.C19EH;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2176841AHi;
import X.C2176881AHm;
import X.C2204961BRm;
import X.C23250099c;
import X.C289470BWf;
import X.C324800CoI;
import X.C485260J1g;
import X.C497820Jfg;
import X.C724240Sb0;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC1864740ycq;
import X.DialogInterfaceOnDismissListenerC1864750ycr;
import X.EnumC1783210wVL;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.RunnableC696420RTk;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.CommentReviewTabFragment;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.ui.KeyboardAttachedDialogFragment;
import com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.topic.ExploreTopicManagementFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.LiveQuickPostFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.EditParams;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostPrivacyConfigModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.privacy.LiveQuickPostPrivacyFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.viewmodel.LiveQuickPostViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.cards.novel.core.TakoNovelBotViewModel;
import com.ss.android.ugc.aweme.tako.botpage.components.source.TakoReferenceAssem;
import com.ss.android.ugc.aweme.tako.botpage.toptitle.TopTitleAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.multipletemplate.TakoTemplateActivity;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.SevenSheetTopTitleAssem;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.SheetTopTitleAssem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.startup.onboarding.vm.TakoOnboardingViewModel;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.AwS606S0100000_27;
import tikcast.api.anchor.HashTag;

/* JADX INFO: loaded from: classes28.dex */
public class AbS706S0100000_27 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) throws Throwable {
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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AbS706S0100000_27(com.ss.android.ugc.aweme.tako.otherpage.sheet.SevenSheetTopTitleAssem r4, int r5) {
        /*
            r3 = this;
            r3.$t = r5
            switch(r5) {
                case 10: goto Le;
                case 11: goto L5;
                case 12: goto Le;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r4
            r0 = 300(0x12c, double:1.48E-321)
        La:
            r2.<init>(r0)
            return
        Le:
            r2 = r3
            r2.l0 = r4
            r0 = 1000(0x3e8, double:4.94E-321)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS706S0100000_27.<init>(com.ss.android.ugc.aweme.tako.otherpage.sheet.SevenSheetTopTitleAssem, int):void");
    }

    public static final void LIZ$0(AbS706S0100000_27 abS706S0100000_27, View view) {
        if (view != null) {
            if (C289470BWf.LIZ()) {
                TakoReferenceAssem takoReferenceAssem = (TakoReferenceAssem) abS706S0100000_27.l0;
                takoReferenceAssem.op(new AwS428S0200000_27(takoReferenceAssem, view, 32), true);
            } else {
                ((TakoReferenceAssem) abS706S0100000_27.l0).tp(view);
            }
        }
    }

    public static final void LIZ$1(AbS706S0100000_27 abS706S0100000_27, View view) {
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        if (view != null) {
            AssemVMLazy assemVMLazy = ((TopTitleAssem) abS706S0100000_27.l0).LLJJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TopTitleAssem.LLLII;
            if (!((TakoOnboardingViewModel) assemVMLazy.getValue()).isVisible()) {
                C1862680yZW.LIZJ(((TopTitleAssem) abS706S0100000_27.l0).getContext(), view, C1558520qew.LJIIL((TopTitleAssem) abS706S0100000_27.l0));
                ((TopTitleAssem) abS706S0100000_27.l0).yp("click_new_chat");
            } else {
                ((TopTitleAssem) abS706S0100000_27.l0).LLJJIJIL.getValue().setStateImmediate(AFwS269S0000000_27.get$arr$(386));
                ((TakoOnboardingViewModel) ((TopTitleAssem) abS706S0100000_27.l0).LLJJIJIL.getValue()).xQ2();
                TopTitleAssem topTitleAssem = (TopTitleAssem) abS706S0100000_27.l0;
                ITakoContextAbility iTakoContextAbilityOp = topTitleAssem.op();
                if (iTakoContextAbilityOp != null && (c13lcAp0 = iTakoContextAbilityOp.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                    str = c1864200yby.LL;
                } else {
                    str = null;
                }
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                ITakoContextAbility iTakoContextAbilityOp2 = topTitleAssem.op();
                if (iTakoContextAbilityOp2 != null && (c13lcT71 = iTakoContextAbilityOp2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    String str3 = c1863850ybP.LL;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = c1863850ybP.LLILLJJLI;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = c1863850ybP.LLILZIL;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    C1862330yYx.LJLIL(c1862330yYx, str3, str4, str2, str, c1863850ybP.LLIZ);
                }
            }
            C1862680yZW.LIZLLL(C1558520qew.LJIIL((TopTitleAssem) abS706S0100000_27.l0));
        }
    }

    public static final void LIZ$10(AbS706S0100000_27 abS706S0100000_27, View view) {
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        if (view != null) {
            C1862680yZW.LIZIZ(C1558520qew.LJIIL((SevenSheetTopTitleAssem) abS706S0100000_27.l0));
            SevenSheetTopTitleAssem sevenSheetTopTitleAssem = (SevenSheetTopTitleAssem) abS706S0100000_27.l0;
            ITakoContextAbility iTakoContextAbilityMp = sevenSheetTopTitleAssem.mp();
            if (iTakoContextAbilityMp != null && (c13lcAp0 = iTakoContextAbilityMp.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                str = c1864200yby.LL;
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            ITakoContextAbility iTakoContextAbilityMp2 = sevenSheetTopTitleAssem.mp();
            if (iTakoContextAbilityMp2 != null && (c13lcT71 = iTakoContextAbilityMp2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str3 = c1863850ybP.LL;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = c1863850ybP.LLILLJJLI;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = c1863850ybP.LLILZIL;
                if (str5 != null) {
                    str2 = str5;
                }
                C1862330yYx.LJLLLL(c1862330yYx, str3, str4, str2, str, c1863850ybP.LLIZ);
            }
            ((SevenSheetTopTitleAssem) abS706S0100000_27.l0).zp("click_sidebar_button");
        }
    }

    public static final void LIZ$11(AbS706S0100000_27 abS706S0100000_27, View view) {
        C1863850ybP c1863850ybP;
        String strNZ0;
        String str;
        String str2;
        String str3;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        C13LC<C1863850ybP> c13lcT71;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        String strNZ02;
        if (view != null) {
            SevenSheetTopTitleAssem sevenSheetTopTitleAssem = (SevenSheetTopTitleAssem) abS706S0100000_27.l0;
            ITakoContextAbility iTakoContextAbilityMp = sevenSheetTopTitleAssem.mp();
            String str4 = null;
            if (iTakoContextAbilityMp != null && (c13lcT712 = iTakoContextAbilityMp.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str5 = c1863850ybP2.LL;
                String str6 = "";
                if (str5 == null) {
                    str5 = "";
                }
                String str7 = c1863850ybP2.LLILLJJLI;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = c1863850ybP2.LLILZIL;
                if (str8 != null) {
                    str6 = str8;
                }
                String strIp = sevenSheetTopTitleAssem.ip();
                ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(sevenSheetTopTitleAssem), ITakoScreenTypeAbility.class, null);
                if (iTakoScreenTypeAbility != null) {
                    strNZ02 = iTakoScreenTypeAbility.nZ0();
                } else {
                    strNZ02 = null;
                }
                C1862330yYx.LJJIFFI(c1862330yYx, str5, str7, str6, strIp, strNZ02, "video");
            }
            C19EG c19egLIZ = C724240Sb0.LIZ((SevenSheetTopTitleAssem) abS706S0100000_27.l0);
            if (c19egLIZ != null) {
                SevenSheetTopTitleAssem sevenSheetTopTitleAssem2 = (SevenSheetTopTitleAssem) abS706S0100000_27.l0;
                TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) sevenSheetTopTitleAssem2.LLLF.getValue();
                if (takoChatUIAbility != null) {
                    takoChatUIAbility.x4();
                }
                IMessageAbility iMessageAbility = (IMessageAbility) sevenSheetTopTitleAssem2.LLLFF.getValue();
                if (iMessageAbility != null) {
                    iMessageAbility.Q31();
                }
                ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(sevenSheetTopTitleAssem2), ITakoChatPageAbility.class, null);
                C324800CoI.LIZ.getClass();
                if (C324800CoI.LIZ() && iTakoChatPageAbility != null) {
                    iTakoChatPageAbility.zY0();
                }
                ITakoContextAbility iTakoContextAbilityMp2 = sevenSheetTopTitleAssem2.mp();
                if (iTakoContextAbilityMp2 != null && (c13lcT71 = iTakoContextAbilityMp2.T71()) != null) {
                    c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ();
                } else {
                    c1863850ybP = null;
                }
                ITakoScreenTypeAbility iTakoScreenTypeAbility2 = (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(sevenSheetTopTitleAssem2), ITakoScreenTypeAbility.class, null);
                if (iTakoScreenTypeAbility2 != null) {
                    strNZ0 = iTakoScreenTypeAbility2.nZ0();
                } else {
                    strNZ0 = null;
                }
                C1864020ybg c1864020ybg = C1864020ybg.LIZ;
                if (c1863850ybP != null) {
                    str = c1863850ybP.LLILZIL;
                    str2 = c1863850ybP.LL;
                    str3 = c1863850ybP.LLILLJJLI;
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                String strIp2 = sevenSheetTopTitleAssem2.ip();
                ITakoContextAbility iTakoContextAbilityMp3 = sevenSheetTopTitleAssem2.mp();
                if (iTakoContextAbilityMp3 != null && (c13lcAp0 = iTakoContextAbilityMp3.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                    str4 = c1864200yby.LLILLJJLI;
                }
                View contentView = sevenSheetTopTitleAssem2.getContentView();
                c1864020ybg.getClass();
                C1864020ybg.LJII(c19egLIZ, str, str2, str3, true, strIp2, strNZ0, str4, contentView);
            }
        }
    }

    public static final void LIZ$12(AbS706S0100000_27 abS706S0100000_27, View view) {
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        if (view != null) {
            AssemVMLazy assemVMLazy = ((SevenSheetTopTitleAssem) abS706S0100000_27.l0).LLLIILIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SevenSheetTopTitleAssem.LLLILZ;
            if (!((TakoOnboardingViewModel) assemVMLazy.getValue()).isVisible()) {
                C1862680yZW.LIZJ(((SevenSheetTopTitleAssem) abS706S0100000_27.l0).getContext(), view, C1558520qew.LJIIL((SevenSheetTopTitleAssem) abS706S0100000_27.l0));
                ((SevenSheetTopTitleAssem) abS706S0100000_27.l0).zp("click_new_chat");
            } else {
                ((SevenSheetTopTitleAssem) abS706S0100000_27.l0).LLLIILIL.getValue().setStateImmediate(AFwS269S0000000_27.get$arr$(386));
                ((TakoOnboardingViewModel) ((SevenSheetTopTitleAssem) abS706S0100000_27.l0).LLLIILIL.getValue()).xQ2();
                SevenSheetTopTitleAssem sevenSheetTopTitleAssem = (SevenSheetTopTitleAssem) abS706S0100000_27.l0;
                ITakoContextAbility iTakoContextAbilityMp = sevenSheetTopTitleAssem.mp();
                if (iTakoContextAbilityMp != null && (c13lcAp0 = iTakoContextAbilityMp.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                    str = c1864200yby.LL;
                } else {
                    str = null;
                }
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                ITakoContextAbility iTakoContextAbilityMp2 = sevenSheetTopTitleAssem.mp();
                if (iTakoContextAbilityMp2 != null && (c13lcT71 = iTakoContextAbilityMp2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    String str3 = c1863850ybP.LL;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = c1863850ybP.LLILLJJLI;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = c1863850ybP.LLILZIL;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    C1862330yYx.LJLIL(c1862330yYx, str3, str4, str2, str, c1863850ybP.LLIZ);
                }
            }
            C1862680yZW.LIZLLL(C1558520qew.LJIIL((SevenSheetTopTitleAssem) abS706S0100000_27.l0));
        }
    }

    public static final void LIZ$13(AbS706S0100000_27 abS706S0100000_27, View view) {
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        if (view != null) {
            C1862680yZW.LIZIZ(C1558520qew.LJIIL((SheetTopTitleAssem) abS706S0100000_27.l0));
            SheetTopTitleAssem sheetTopTitleAssem = (SheetTopTitleAssem) abS706S0100000_27.l0;
            ITakoContextAbility iTakoContextAbilityKp = sheetTopTitleAssem.kp();
            if (iTakoContextAbilityKp != null && (c13lcAp0 = iTakoContextAbilityKp.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                str = c1864200yby.LL;
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            ITakoContextAbility iTakoContextAbilityKp2 = sheetTopTitleAssem.kp();
            if (iTakoContextAbilityKp2 != null && (c13lcT71 = iTakoContextAbilityKp2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str3 = c1863850ybP.LL;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = c1863850ybP.LLILLJJLI;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = c1863850ybP.LLILZIL;
                if (str5 != null) {
                    str2 = str5;
                }
                C1862330yYx.LJLLLL(c1862330yYx, str3, str4, str2, str, c1863850ybP.LLIZ);
            }
            ((SheetTopTitleAssem) abS706S0100000_27.l0).mp("click_sidebar_button");
        }
    }

    public static final void LIZ$14(AbS706S0100000_27 abS706S0100000_27, View view) {
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        if (view != null) {
            AssemVMLazy assemVMLazy = ((SheetTopTitleAssem) abS706S0100000_27.l0).LLLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SheetTopTitleAssem.LLLIIIL;
            if (!((TakoOnboardingViewModel) assemVMLazy.getValue()).isVisible()) {
                C1862680yZW.LIZJ(((SheetTopTitleAssem) abS706S0100000_27.l0).getContext(), view, C1558520qew.LJIIL((SheetTopTitleAssem) abS706S0100000_27.l0));
                ((SheetTopTitleAssem) abS706S0100000_27.l0).mp("click_new_chat");
            } else {
                ((SheetTopTitleAssem) abS706S0100000_27.l0).LLLI.getValue().setStateImmediate(AFwS269S0000000_27.get$arr$(386));
                ((TakoOnboardingViewModel) ((SheetTopTitleAssem) abS706S0100000_27.l0).LLLI.getValue()).xQ2();
                SheetTopTitleAssem sheetTopTitleAssem = (SheetTopTitleAssem) abS706S0100000_27.l0;
                ITakoContextAbility iTakoContextAbilityKp = sheetTopTitleAssem.kp();
                if (iTakoContextAbilityKp != null && (c13lcAp0 = iTakoContextAbilityKp.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                    str = c1864200yby.LL;
                } else {
                    str = null;
                }
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                ITakoContextAbility iTakoContextAbilityKp2 = sheetTopTitleAssem.kp();
                if (iTakoContextAbilityKp2 != null && (c13lcT71 = iTakoContextAbilityKp2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    String str3 = c1863850ybP.LL;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = c1863850ybP.LLILLJJLI;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = c1863850ybP.LLILZIL;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    C1862330yYx.LJLIL(c1862330yYx, str3, str4, str2, str, c1863850ybP.LLIZ);
                }
            }
            C1862680yZW.LIZLLL(C1558520qew.LJIIL((SheetTopTitleAssem) abS706S0100000_27.l0));
        }
    }

    public static final void LIZ$15(AbS706S0100000_27 abS706S0100000_27, View view) throws Throwable {
        Editable editableB;
        EditParams editParams;
        Integer num;
        String str;
        String str2;
        Editable editableB2;
        String str3;
        PostConfigModel postConfigModelVR;
        Map<String, String> map;
        List<String> arrayList;
        if (view != null) {
            View view2 = (View) ((LiveQuickPostFragment) abS706S0100000_27.l0).LLJJJJ.getValue();
            int iIntValue = 0;
            if (view2 != null) {
                view2.setClickable(false);
            }
            LiveQuickPostFragment liveQuickPostFragment = (LiveQuickPostFragment) abS706S0100000_27.l0;
            if (liveQuickPostFragment.LLJILJILJ != 1 && (postConfigModelVR = liveQuickPostFragment.VR()) != null && (map = postConfigModelVR.reportParams) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                C1355400lNK c1355400lNKUR = liveQuickPostFragment.UR();
                if (c1355400lNKUR == null || (arrayList = c1355400lNKUR.getTagSpan()) == null) {
                    arrayList = new ArrayList<>();
                }
                linkedHashMap.put("hashtag_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
                C485260J1g.LIZ.getClass();
                C20684815ws.LJIILLIIL("publish", linkedHashMap);
            }
            LiveQuickPostFragment liveQuickPostFragment2 = (LiveQuickPostFragment) abS706S0100000_27.l0;
            String str4 = "";
            if (liveQuickPostFragment2.LLJILJILJ == 1) {
                LiveQuickPostViewModel liveQuickPostViewModelAS = liveQuickPostFragment2.aS();
                LiveQuickPostFragment liveQuickPostFragment3 = (LiveQuickPostFragment) abS706S0100000_27.l0;
                PostConfigModel postConfigModelVR2 = liveQuickPostFragment3.VR();
                if (postConfigModelVR2 == null || (str2 = postConfigModelVR2.milestoneId) == null) {
                    str2 = "";
                }
                C1355400lNK c1355400lNKUR2 = ((LiveQuickPostFragment) abS706S0100000_27.l0).UR();
                if (c1355400lNKUR2 != null) {
                    editableB2 = C2204961BRm.b(c1355400lNKUR2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciIV4cqq8lsc5e6V+jnToBoLr/qH/p", null));
                } else {
                    editableB2 = null;
                }
                String strValueOf = String.valueOf(editableB2);
                LiveQuickPostFragment liveQuickPostFragment4 = (LiveQuickPostFragment) abS706S0100000_27.l0;
                int i = liveQuickPostFragment4.LLJ;
                liveQuickPostFragment4.SR();
                PostConfigModel postConfigModelVR3 = ((LiveQuickPostFragment) abS706S0100000_27.l0).VR();
                if (postConfigModelVR3 != null && (str3 = postConfigModelVR3.roomId) != null) {
                    str4 = str3;
                }
                InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(liveQuickPostViewModelAS);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C1444520nh4(liveQuickPostFragment3, liveQuickPostViewModelAS, strValueOf, i, str4, str2, null), 2);
                return;
            }
            LiveQuickPostViewModel liveQuickPostViewModelAS2 = liveQuickPostFragment2.aS();
            PostConfigModel postConfigModelVR4 = ((LiveQuickPostFragment) abS706S0100000_27.l0).VR();
            C1355400lNK c1355400lNKUR3 = ((LiveQuickPostFragment) abS706S0100000_27.l0).UR();
            if (c1355400lNKUR3 != null) {
                editableB = C2204961BRm.b(c1355400lNKUR3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciIV4cqq8lsc5e6V+jnToBoLr/qH/p", null));
            } else {
                editableB = null;
            }
            String strValueOf2 = String.valueOf(editableB);
            LiveQuickPostFragment liveQuickPostFragment5 = (LiveQuickPostFragment) abS706S0100000_27.l0;
            int i2 = liveQuickPostFragment5.LLJ;
            List<HashTag> listSR = liveQuickPostFragment5.SR();
            PostConfigModel postConfigModelVR5 = ((LiveQuickPostFragment) abS706S0100000_27.l0).VR();
            if (postConfigModelVR5 != null && (str = postConfigModelVR5.userIdentity) != null) {
                str4 = str;
            }
            PostConfigModel postConfigModelVR6 = ((LiveQuickPostFragment) abS706S0100000_27.l0).VR();
            if (postConfigModelVR6 != null) {
                editParams = postConfigModelVR6.ediParams;
            } else {
                editParams = null;
            }
            PostConfigModel postConfigModelVR7 = ((LiveQuickPostFragment) abS706S0100000_27.l0).VR();
            if (postConfigModelVR7 != null && (num = postConfigModelVR7.postByScene) != null) {
                iIntValue = num.intValue();
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveQuickPostViewModelAS2), C0PEM.LIZJ, null, new C1813750xIb(liveQuickPostViewModelAS2, postConfigModelVR4, strValueOf2, i2, listSR, str4, editParams, iIntValue, null), 2);
        }
    }

    public static final void LIZ$16(AbS706S0100000_27 abS706S0100000_27, View view) {
        C19EG activity;
        if (view != null && (activity = ((LiveQuickPostFragment) abS706S0100000_27.l0).getActivity()) != null) {
            LiveQuickPostFragment liveQuickPostFragment = (LiveQuickPostFragment) abS706S0100000_27.l0;
            int i = liveQuickPostFragment.LLJ;
            Boolean boolValueOf = null;
            PostConfigModel postConfigModelVR = liveQuickPostFragment.VR();
            if (postConfigModelVR != null) {
                boolValueOf = Boolean.valueOf(postConfigModelVR.forceDarkMode);
            }
            PostPrivacyConfigModel postPrivacyConfigModel = new PostPrivacyConfigModel(i, "", C176600m4.LIZIZ(boolValueOf));
            AwS592S0100000_13 awS592S0100000_13 = new AwS592S0100000_13(new AwS606S0100000_27((LiveQuickPostFragment) abS706S0100000_27.l0, 639), 5);
            LiveQuickPostPrivacyFragment liveQuickPostPrivacyFragment = new LiveQuickPostPrivacyFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIJL(bundle, "extra_permission_configure", postPrivacyConfigModel);
            liveQuickPostPrivacyFragment.setArguments(bundle);
            liveQuickPostPrivacyFragment.LLJ = awS592S0100000_13;
            liveQuickPostPrivacyFragment.LLIZ = postPrivacyConfigModel.getCurrentType();
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = liveQuickPostPrivacyFragment;
            c1390920mIc.LJIIIIZZ(0);
            c1390920mIc.LIZ.LLILLJJLI = new DialogInterfaceOnDismissListenerC1864750ycr(null, 0);
            if (C176600m4.LIZIZ(Boolean.valueOf(postPrivacyConfigModel.getForceDarkMode()))) {
                c1390920mIc.LIZLLL(R.style.y0, false);
            } else {
                c1390920mIc.LIZ.LLJI = C1308910kAL.LIZJ(R.attr.a1e, activity);
            }
            c1390920mIc.LIZ.show(activity.getSupportFragmentManager(), "PublishPermissionSheet");
        }
    }

    public static final void LIZ$17(AbS706S0100000_27 abS706S0100000_27, View view) {
        C1863850ybP c1863850ybP;
        String strNZ0;
        String str;
        String str2;
        String str3;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        C13LC<C1863850ybP> c13lcT71;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        String strNZ02;
        if (view != null) {
            TopTitleAssem topTitleAssem = (TopTitleAssem) abS706S0100000_27.l0;
            ITakoContextAbility iTakoContextAbilityOp = topTitleAssem.op();
            String str4 = null;
            if (iTakoContextAbilityOp != null && (c13lcT712 = iTakoContextAbilityOp.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str5 = c1863850ybP2.LL;
                String str6 = "";
                if (str5 == null) {
                    str5 = "";
                }
                String str7 = c1863850ybP2.LLILLJJLI;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = c1863850ybP2.LLILZIL;
                if (str8 != null) {
                    str6 = str8;
                }
                String strIp = topTitleAssem.ip();
                ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(topTitleAssem), ITakoScreenTypeAbility.class, null);
                if (iTakoScreenTypeAbility != null) {
                    strNZ02 = iTakoScreenTypeAbility.nZ0();
                } else {
                    strNZ02 = null;
                }
                C1862330yYx.LJJIFFI(c1862330yYx, str5, str7, str6, strIp, strNZ02, "video");
            }
            C19EG c19egLIZ = C724240Sb0.LIZ((TopTitleAssem) abS706S0100000_27.l0);
            if (c19egLIZ != null) {
                TopTitleAssem topTitleAssem2 = (TopTitleAssem) abS706S0100000_27.l0;
                TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) topTitleAssem2.LLJL.getValue();
                if (takoChatUIAbility != null) {
                    takoChatUIAbility.x4();
                }
                IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(topTitleAssem2), IMessageAbility.class, null);
                if (iMessageAbility != null) {
                    iMessageAbility.Q31();
                }
                ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(topTitleAssem2), ITakoChatPageAbility.class, null);
                C324800CoI.LIZ.getClass();
                if (C324800CoI.LIZ() && iTakoChatPageAbility != null) {
                    iTakoChatPageAbility.zY0();
                }
                ITakoContextAbility iTakoContextAbilityOp2 = topTitleAssem2.op();
                if (iTakoContextAbilityOp2 != null && (c13lcT71 = iTakoContextAbilityOp2.T71()) != null) {
                    c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ();
                } else {
                    c1863850ybP = null;
                }
                ITakoScreenTypeAbility iTakoScreenTypeAbility2 = (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(topTitleAssem2), ITakoScreenTypeAbility.class, null);
                if (iTakoScreenTypeAbility2 != null) {
                    strNZ0 = iTakoScreenTypeAbility2.nZ0();
                } else {
                    strNZ0 = null;
                }
                C1864020ybg c1864020ybg = C1864020ybg.LIZ;
                if (c1863850ybP != null) {
                    str = c1863850ybP.LLILZIL;
                    str2 = c1863850ybP.LL;
                    str3 = c1863850ybP.LLILLJJLI;
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                String strIp2 = topTitleAssem2.ip();
                ITakoContextAbility iTakoContextAbilityOp3 = topTitleAssem2.op();
                if (iTakoContextAbilityOp3 != null && (c13lcAp0 = iTakoContextAbilityOp3.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                    str4 = c1864200yby.LLILLJJLI;
                }
                View contentView = topTitleAssem2.getContentView();
                c1864020ybg.getClass();
                C1864020ybg.LJII(c19egLIZ, str, str2, str3, true, strIp2, strNZ0, str4, contentView);
            }
        }
    }

    public static final void LIZ$18(AbS706S0100000_27 abS706S0100000_27, View view) {
        if (view != null) {
            C19EH c19ehLJIIJ = ((CommentReviewTabFragment) abS706S0100000_27.l0).getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZLLL(new KeyboardAttachedDialogFragment(), "KeyboardDialogFragment");
            c19ehLJIIJ.LJIIJ();
        }
    }

    public static final void LIZ$2(AbS706S0100000_27 abS706S0100000_27, View view) {
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        if (view != null) {
            C1862680yZW.LIZIZ(C1558520qew.LJIIL((TopTitleAssem) abS706S0100000_27.l0));
            TopTitleAssem topTitleAssem = (TopTitleAssem) abS706S0100000_27.l0;
            ITakoContextAbility iTakoContextAbilityOp = topTitleAssem.op();
            if (iTakoContextAbilityOp != null && (c13lcAp0 = iTakoContextAbilityOp.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                str = c1864200yby.LL;
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            ITakoContextAbility iTakoContextAbilityOp2 = topTitleAssem.op();
            if (iTakoContextAbilityOp2 != null && (c13lcT71 = iTakoContextAbilityOp2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str3 = c1863850ybP.LL;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = c1863850ybP.LLILLJJLI;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = c1863850ybP.LLILZIL;
                if (str5 != null) {
                    str2 = str5;
                }
                C1862330yYx.LJLLLL(c1862330yYx, str3, str4, str2, str, c1863850ybP.LLIZ);
            }
            ((TopTitleAssem) abS706S0100000_27.l0).yp("click_sidebar_button");
        }
    }

    public static final void LIZ$3(AbS706S0100000_27 abS706S0100000_27, View view) {
        if (view != null) {
            ((TakoTemplateActivity) abS706S0100000_27.l0).LLLLLZL().setState(new AwS606S0100000_27(EnumC1783210wVL.COLLAPSE, 602));
        }
    }

    public static final void LIZ$4(AbS706S0100000_27 abS706S0100000_27, View view) {
        if (view != null) {
            ((C1854370yM7) abS706S0100000_27.l0).LLILZIL.invoke();
        }
    }

    public static final void LIZ$5(AbS706S0100000_27 abS706S0100000_27, View view) {
        boolean z;
        C2176881AHm c2176881AHm;
        C1125770fOx c1125770fOx;
        ViewerPicksInfo viewerPicksInfo;
        if (view != null) {
            DataChannel dataChannel = ((C1850830yGP) abS706S0100000_27.l0).LLJJJJ;
            if (dataChannel != null && (c2176881AHm = (C2176881AHm) dataChannel.gg0(ViewerWishesStatus.class)) != null && (c1125770fOx = c2176881AHm.LIZIZ) != null && (viewerPicksInfo = c1125770fOx.LIZIZ) != null && viewerPicksInfo.scene == 3) {
                z = true;
            } else {
                z = false;
            }
            C1850830yGP c1850830yGP = (C1850830yGP) abS706S0100000_27.l0;
            if (c1850830yGP.LLJJJIL && !z) {
                String str = ViewerWishesQueuePage._pnsPageId;
                C2176841AHi.LIZ(c1850830yGP.LLJJJJ);
                ((C1850830yGP) abS706S0100000_27.l0).LIZJ(-1, "click");
                ((C1850830yGP) abS706S0100000_27.l0).getClass();
                C1850830yGP.LIZ();
            }
        }
    }

    public static final void LIZ$6(AbS706S0100000_27 abS706S0100000_27, View view) {
        boolean z;
        C2176881AHm c2176881AHm;
        C1125770fOx c1125770fOx;
        ViewerPicksInfo viewerPicksInfo;
        Integer numValueOf;
        if (view != null) {
            DataChannel dataChannel = ((C1850820yGO) abS706S0100000_27.l0).LLJJJJLIIL;
            if (dataChannel != null && (c2176881AHm = (C2176881AHm) dataChannel.gg0(ViewerWishesStatus.class)) != null && (c1125770fOx = c2176881AHm.LIZIZ) != null && (viewerPicksInfo = c1125770fOx.LIZIZ) != null && (numValueOf = Integer.valueOf(viewerPicksInfo.scene)) != null && (numValueOf.intValue() == 3 || numValueOf.intValue() == 5 || numValueOf.intValue() == 6)) {
                z = true;
            } else {
                z = false;
            }
            C1850820yGO c1850820yGO = (C1850820yGO) abS706S0100000_27.l0;
            if (c1850820yGO.LLJJJJJIL && !z) {
                String str = ViewerWishesQueuePage._pnsPageId;
                C2176841AHi.LIZ(c1850820yGO.LLJJJJLIIL);
                ((C1850820yGO) abS706S0100000_27.l0).LIZ(-1, "click");
            }
        }
    }

    public static final void LIZ$7(AbS706S0100000_27 abS706S0100000_27, View view) {
        if (view != null) {
            ((Function0) abS706S0100000_27.l0).invoke();
        }
    }

    public static final void LIZ$8(AbS706S0100000_27 abS706S0100000_27, View view) {
        FragmentManager childFragmentManager;
        if (view != null) {
            C15TA.LIZ.getClass();
            C15TA.LJIILL(new RunnableC696420RTk(0L, 0, "manage", "", false));
            Context context = ((ExploreViewPagerComponent) abS706S0100000_27.l0).getContext();
            if (context == null) {
                context = ((ExploreViewPagerComponent) abS706S0100000_27.l0).LJJIJL().getContext();
            }
            int iLIZ = (int) (((double) C497820Jfg.LIZ(context)) * 0.9d);
            List<ExploreCustomTopicResponse> list = ((ExploreViewPagerComponent) abS706S0100000_27.l0).LLJJI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(((ExploreCustomTopicResponse) it2.next()).topicId);
            }
            ExploreTopicManagementFragment exploreTopicManagementFragment = new ExploreTopicManagementFragment();
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = exploreTopicManagementFragment;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJL = iLIZ;
            tuxSheet.LLJJIJIIJIL = true;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJI = numLIZJ;
            ExploreViewPagerComponent exploreViewPagerComponent = (ExploreViewPagerComponent) abS706S0100000_27.l0;
            tuxSheet2.LLILLJJLI = new DialogInterfaceOnDismissListenerC1864740ycq(exploreViewPagerComponent, arrayList, 1);
            tuxSheet2.LLJLILLLLZIIL = false;
            tuxSheet2.LLJLL = true;
            Fragment fragmentLJI = C724240Sb0.LJI(exploreViewPagerComponent);
            if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
                tuxSheet2.show(childFragmentManager, "explore_vp_component");
            }
        }
    }

    public static final void LIZ$9(AbS706S0100000_27 abS706S0100000_27, View view) {
        Function0<Unit> function0;
        if (view != null && (function0 = ((TakoNovelBotViewModel) abS706S0100000_27.l0).LLILLL) != null) {
            function0.invoke();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AbS706S0100000_27(com.ss.android.ugc.aweme.tako.botpage.toptitle.TopTitleAssem r4, int r5) {
        /*
            r3 = this;
            r3.$t = r5
            switch(r5) {
                case 1: goto Le;
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r4
            r0 = 300(0x12c, double:1.48E-321)
        La:
            r2.<init>(r0)
            return
        Le:
            r2 = r3
            r2.l0 = r4
            r0 = 1000(0x3e8, double:4.94E-321)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS706S0100000_27.<init>(com.ss.android.ugc.aweme.tako.botpage.toptitle.TopTitleAssem, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS706S0100000_27(ExploreViewPagerComponent exploreViewPagerComponent, int i) {
        super(2000L);
        this.$t = i;
        this.l0 = exploreViewPagerComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS706S0100000_27(TakoReferenceAssem takoReferenceAssem, int i) {
        super(1500L);
        this.$t = i;
        this.l0 = takoReferenceAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS706S0100000_27(Object obj, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS706S0100000_27(Object obj, int i, int i2) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }
}
