package irm;

import X.AbstractC1387200mCc;
import X.AbstractC1838030xvl;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0DHG;
import X.C0DQF;
import X.C0GXB;
import X.C0I7D;
import X.C0PEM;
import X.C0R2Q;
import X.C0WZX;
import X.C1161920gLG;
import X.C1210500hbc;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LC;
import X.C14FU;
import X.C15438062q;
import X.C1558520qew;
import X.C1701330uNH;
import X.C1777310wLp;
import X.C1777320wLq;
import X.C1813730xIZ;
import X.C1833570xoZ;
import X.C1833740xoq;
import X.C1834240xpe;
import X.C1834580xqC;
import X.C1835140xr6;
import X.C1835920xsM;
import X.C1835970xsR;
import X.C1837000xu6;
import X.C1838060xvo;
import X.C1852530yJ9;
import X.C1852540yJA;
import X.C1854150yLl;
import X.C1856220yP6;
import X.C1856470yPV;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C1906580ziK;
import X.C19549411e8;
import X.C19549911eD;
import X.C197039127h;
import X.C19719212De;
import X.C19EG;
import X.C20235014Fo;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C23250099c;
import X.C485260J1g;
import X.C497740JfY;
import X.C500260Jjc;
import X.C540190LGn;
import X.C597050NbL;
import X.C632670Orh;
import X.C724240Sb0;
import X.C766270U4b;
import X.C782110Um9;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC1154810g9n;
import X.EnumC1219690hqR;
import X.EnumC1782300wTs;
import X.EnumC1813540xIG;
import X.EnumC1858090yS7;
import X.InterfaceC435390H5l;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ALAdapterS22S0100000_27;
import Y.AcS498S0100000_27;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Property;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayHighlightMixStyleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.HighlightGeneratingFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.HighlightPreviewClipFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.ui.LiveHighlightVideoCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.EditParams;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PublishParams;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.LiveReplayListActivity;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.ui.LiveReplayCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.components.shortcut.TakoShortcutInteractionAssem;
import com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeItemAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.menuwindow.MenuItemAssem;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoMediaChooseView;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.previewphoto.PreviewPhotoFragment;
import com.ss.android.ugc.aweme.tako.otherpage.entitysug.TakoEntityInfoSheetFragment;
import com.ss.android.ugc.aweme.tako.otherpage.entitysug.TakoEntitySugAssem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.AwS653S0100000_4;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: loaded from: classes28.dex */
public class AkS94S0100000_27 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
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
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            case 25:
                LIZ$25(this, view);
                break;
            case 26:
                LIZ$26(this, view);
                break;
            case 27:
                LIZ$27(this, view);
                break;
            case 28:
                LIZ$28(this, view);
                break;
            case 29:
                LIZ$29(this, view);
                break;
            case 30:
                LIZ$30(this, view);
                break;
            case 31:
                LIZ$31(this, view);
                break;
            case 32:
                LIZ$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                LIZ$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                LIZ$34(this, view);
                break;
            case 35:
                LIZ$35(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                LIZ$36(this, view);
                break;
            case 37:
                LIZ$37(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public AkS94S0100000_27(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AkS94S0100000_27 akS94S0100000_27, View view) {
        C19549411e8 c19549411e8 = (C19549411e8) akS94S0100000_27.l0;
        C19549911eD keyboardHelper = c19549411e8.getKeyboardHelper();
        if (keyboardHelper != null) {
            C0I7D c0i7d = c19549411e8.LLJI;
            if (c0i7d == null) {
                c0i7d = null;
            }
            ((InputMethodManager) C786410Ut5.F2(keyboardHelper.LIZ, "input_method")).hideSoftInputFromWindow(c0i7d.getWindowToken(), 0);
        }
    }

    public static final void LIZ$1(AkS94S0100000_27 akS94S0100000_27, View view) {
        C19549411e8 c19549411e8 = (C19549411e8) akS94S0100000_27.l0;
        C19549911eD keyboardHelper = c19549411e8.getKeyboardHelper();
        if (keyboardHelper != null) {
            C0I7D c0i7d = c19549411e8.LLJI;
            if (c0i7d == null) {
                c0i7d = null;
            }
            ((InputMethodManager) C786410Ut5.F2(keyboardHelper.LIZ, "input_method")).hideSoftInputFromWindow(c0i7d.getWindowToken(), 0);
        }
    }

    public static final void LIZ$10(AkS94S0100000_27 akS94S0100000_27, View view) {
        ((LiveReplayCell) akS94S0100000_27.l0).N5(0, "highlights_and_clips");
    }

    public static final void LIZ$11(AkS94S0100000_27 akS94S0100000_27, View view) {
        ((LiveReplayCell) akS94S0100000_27.l0).L5(0, "post_mixes", "post_mixes");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$12(irm.AkS94S0100000_27 r5, android.view.View r6) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS94S0100000_27.LIZ$12(irm.AkS94S0100000_27, android.view.View):void");
    }

    public static final void LIZ$13(AkS94S0100000_27 akS94S0100000_27, View view) {
        ((AbstractC1838030xvl) akS94S0100000_27.l0).LLILZLL.invoke();
    }

    public static final void LIZ$14(AkS94S0100000_27 akS94S0100000_27, View view) {
        ((C1837000xu6) akS94S0100000_27.l0).LLILZLL.invoke();
    }

    public static final void LIZ$15(AkS94S0100000_27 akS94S0100000_27, View view) {
        ((TakoShortcutInteractionAssem) akS94S0100000_27.l0).op();
        ((TakoShortcutInteractionAssem) akS94S0100000_27.l0).sp("not_now");
    }

    public static final void LIZ$16(AkS94S0100000_27 akS94S0100000_27, View view) {
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ((TakoShortcutInteractionAssem) akS94S0100000_27.l0).op();
        ((TakoShortcutInteractionAssem) akS94S0100000_27.l0).sp("add");
        Context context = ((TakoShortcutInteractionAssem) akS94S0100000_27.l0).getContext();
        if (context != null) {
            C14FU c14fu = C14FU.LIZ;
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) ((TakoShortcutInteractionAssem) akS94S0100000_27.l0).LLJLLIL.getValue();
            if (iTakoContextAbility == null || (c13lcT71 = iTakoContextAbility.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || (str = c1863850ybP.LL) == null) {
                str = "";
            }
            c14fu.getClass();
            InterfaceC435390H5l interfaceC435390H5l = (InterfaceC435390H5l) C14FU.LJFF.getValue();
            if (interfaceC435390H5l != null) {
                interfaceC435390H5l.LIZ(context, str, null);
            }
        }
    }

    public static final void LIZ$17(AkS94S0100000_27 akS94S0100000_27, View view) {
        C1854150yLl c1854150yLl = ((TakoSubModeItemAssem) akS94S0100000_27.l0).LLJLL;
        if (c1854150yLl != null) {
            ((TakoSubModeItemAssem) akS94S0100000_27.l0).sp(c1854150yLl);
            Function1<C1854150yLl, Unit> function1 = c1854150yLl.LLJIJIL;
            if (function1 != null) {
                function1.invoke(c1854150yLl);
            }
        }
    }

    public static final void LIZ$18(AkS94S0100000_27 akS94S0100000_27, View view) {
        Function1<C1854150yLl, Unit> function1;
        C1854150yLl c1854150yLl = ((MenuItemAssem) akS94S0100000_27.l0).LLJLL;
        if (c1854150yLl != null && (function1 = c1854150yLl.LLJIJIL) != null) {
            function1.invoke(c1854150yLl);
        }
    }

    public static final void LIZ$19(AkS94S0100000_27 akS94S0100000_27, View view) {
        PreviewPhotoFragment previewPhotoFragment = (PreviewPhotoFragment) akS94S0100000_27.l0;
        TikTokMediaModel tikTokMediaModel = previewPhotoFragment.LLIZ;
        if (tikTokMediaModel != null) {
            if (tikTokMediaModel.selectIndex > 0) {
                previewPhotoFragment.UR().AQ2(tikTokMediaModel, false);
            } else {
                previewPhotoFragment.UR().yQ2(tikTokMediaModel, ((PreviewPhotoFragment) akS94S0100000_27.l0).getActivity(), EnumC1154810g9n.PREVIEW);
            }
        }
    }

    public static final void LIZ$2(AkS94S0100000_27 akS94S0100000_27, View view) {
        Function1<String, Unit> function1;
        C1852530yJ9 c1852530yJ9 = (C1852530yJ9) akS94S0100000_27.l0;
        C1852540yJA c1852540yJA = c1852530yJ9.LLIZ;
        if (c1852540yJA != null && (function1 = c1852540yJA.LIZ) != null) {
            function1.invoke(String.valueOf(C2204961BRm.v(c1852530yJ9.LLILLJJLI, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA0yZP5SGk0u70KzM2C1bcULlh489L8H/lFvO8iwQ/6GBqmmdqIRZPXxyj4xapGqU94kxOwBk=", null))));
        }
    }

    public static final void LIZ$20(AkS94S0100000_27 akS94S0100000_27, View view) throws JSONException {
        InterfaceC665370Q7z interfaceC665370Q7z;
        ITakoContextAbility iTakoContextAbility;
        InterfaceC665370Q7z interfaceC665370Q7z2;
        IMessageAbility iMessageAbility;
        InterfaceC665370Q7z interfaceC665370Q7z3;
        IMessageAbility iMessageAbility2;
        Map<String, String> mapLJ;
        InterfaceC665370Q7z interfaceC665370Q7z4;
        ITakoContextAbility iTakoContextAbility2;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str;
        Function0<Unit> function0;
        TakoEntitySugAssem takoEntitySugAssem = (TakoEntitySugAssem) akS94S0100000_27.l0;
        if (takoEntitySugAssem.LLJJLIIIJLLLLLLLZ != null) {
            C1856220yP6 c1856220yP6 = takoEntitySugAssem.LLJLL;
            if (c1856220yP6 != null && (function0 = c1856220yP6.LLJI) != null) {
                function0.invoke();
            }
            C1856220yP6 c1856220yP62 = ((TakoEntitySugAssem) akS94S0100000_27.l0).LLJLL;
            String str2 = "highlighted_word";
            if (c1856220yP62 != null && (interfaceC665370Q7z4 = c1856220yP62.LL) != null && (iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z4, ITakoContextAbility.class, null)) != null && (c13lcT71 = iTakoContextAbility2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str3 = c1863850ybP.LL;
                String str4 = c1863850ybP.LLILLJJLI;
                String str5 = c1863850ybP.LLILZIL;
                String str6 = c1863850ybP.LLILZLL;
                String str7 = c1863850ybP.LLIZ;
                String str8 = c1856220yP62.LLIZ;
                String str9 = c1856220yP62.LLILLJJLI;
                String str10 = c1856220yP62.LLILLL;
                int iLIZ = C0R2Q.LIZ(c1856220yP62.LLILZ);
                boolean z = c1856220yP62.LLIZLLLIL;
                C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
                c1862330yYx.getClass();
                if (z) {
                    str = "tikbot_highlighted_word_context_click";
                } else {
                    str = "tikbot_segmented_word_context_click";
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("process_id", str5);
                if (str6 != null && str6.length() > 0) {
                    jSONObject.put("tako_session_id", str6);
                }
                if (str7 != null && str7.length() > 0) {
                    jSONObject.put("tako_chat_id", str7);
                }
                jSONObject.put("enter_from", str3);
                jSONObject.put("enter_method", str4);
                jSONObject.put("message_id", str8);
                jSONObject.put("highlighted_word", str9);
                jSONObject.put("word_content", str10);
                jSONObject.put("rank", iLIZ);
                c20235014FoLIZ.LIZIZ(str, jSONObject);
            }
            C1856220yP6 c1856220yP63 = ((TakoEntitySugAssem) akS94S0100000_27.l0).LLJLL;
            if (c1856220yP63 != null && (interfaceC665370Q7z2 = c1856220yP63.LL) != null && (iMessageAbility = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z2, IMessageAbility.class, null)) != null && iMessageAbility.oj()) {
                C1856220yP6 c1856220yP64 = ((TakoEntitySugAssem) akS94S0100000_27.l0).LLJLL;
                if (c1856220yP64 != null && (interfaceC665370Q7z3 = c1856220yP64.LL) != null && (iMessageAbility2 = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z3, IMessageAbility.class, null)) != null) {
                    String str11 = c1856220yP64.LLILLL;
                    EnumC1858090yS7 enumC1858090yS7 = EnumC1858090yS7.ENTITY_WORD;
                    ITakoContextAbility iTakoContextAbility3 = (ITakoContextAbility) C1558520qew.LIZ(c1856220yP64.LL, ITakoContextAbility.class, null);
                    if (iTakoContextAbility3 == null || (mapLJ = iTakoContextAbility3.getCommonParams()) == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    Pair[] pairArr = new Pair[3];
                    pairArr[0] = new Pair("is_resend", CardStruct.IStatusCode.DEFAULT);
                    pairArr[1] = new Pair("message_type", "text");
                    if (!c1856220yP64.LLIZLLLIL) {
                        str2 = "segmented_word";
                    }
                    pairArr[2] = new Pair("interaction_type", str2);
                    iMessageAbility2.Rl2(str11, true, enumC1858090yS7, mapLJ, C2097608Jq.LJIIJ(pairArr), new LinkedHashMap(), null, null, "", 0, null, 0, 216, null, null, UUID.randomUUID().toString(), null, null);
                    return;
                }
                return;
            }
            TakoEntitySugAssem takoEntitySugAssem2 = (TakoEntitySugAssem) akS94S0100000_27.l0;
            C1856220yP6 c1856220yP65 = takoEntitySugAssem2.LLJLL;
            C19EG c19egLIZ = C724240Sb0.LIZ(takoEntitySugAssem2);
            if (c19egLIZ == null || c1856220yP65 == null || (interfaceC665370Q7z = c1856220yP65.LL) == null || (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null)) == null) {
                return;
            }
            C0DQF c0dqf = C0DQF.LIZ;
            View contentView = takoEntitySugAssem2.getContentView();
            Map<String, String> commonParams = iTakoContextAbility.getCommonParams();
            long j = ((C1863850ybP) iTakoContextAbility.T71().LIZIZ()).LLJJ;
            int i = ((C1863850ybP) iTakoContextAbility.T71().LIZIZ()).LLJJI;
            String str12 = ((C1863850ybP) iTakoContextAbility.T71().LIZIZ()).LLJJIII;
            if (str12 == null) {
                str12 = "";
            }
            c0dqf.LJIIL(c19egLIZ, contentView, commonParams, new AIBotInfo(j, str12, null, i, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388596, null));
        }
    }

    public static final void LIZ$21(AkS94S0100000_27 akS94S0100000_27, View view) {
        ((LiveReplayVideoPlayerDialogFragment) akS94S0100000_27.l0).wS("livesdk_live_replay_click", "live_analytics");
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((LiveReplayVideoPlayerDialogFragment) akS94S0100000_27.l0).getContext(), C1834240xpe.LIZIZ("live_analytics_detail_schema", "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_analytics%2Fpages%2Fdetails%2Ftemplate.js%3Fenable_canvas%3D1%26hide_loading%3D1&should_full_screen=1&hide_nav_bar=1&hide_status_bar=0&enable_canvas=1&hide_loading=1&trans_status_bar=1&bdhm_bid=tiktok_live_fundamental_live_analytics&bdhm_pid=details").appendQueryParameter("room_id", ((LiveReplayVideoPlayerDialogFragment) akS94S0100000_27.l0).LLLF).appendQueryParameter("filter_type", "date").appendQueryParameter("request_from", "video_page").build().toString());
    }

    public static final void LIZ$22(AkS94S0100000_27 akS94S0100000_27, View view) {
        LiveReplayListActivity liveReplayListActivity = (LiveReplayListActivity) akS94S0100000_27.l0;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = liveReplayListActivity.LLILLJJLI;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJJ(liveReplayListActivity.LLJJIJIIJIL);
        }
    }

    public static final void LIZ$23(AkS94S0100000_27 akS94S0100000_27, View view) {
        LiveReplayListActivity liveReplayListActivity = (LiveReplayListActivity) akS94S0100000_27.l0;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = liveReplayListActivity.LLILLJJLI;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJJ(liveReplayListActivity.LLJJIJI);
        }
        LiveReplayListViewModel liveReplayListViewModelLLLLZLL = ((LiveReplayListActivity) akS94S0100000_27.l0).LLLLZLL();
        C23250099c.LIZLLL(liveReplayListViewModelLLLLZLL.getAssemVMScope(), C0PEM.LIZJ, null, new C1833740xoq(liveReplayListViewModelLLLLZLL, null), 2);
        C1833570xoZ.LIZ.getClass();
        C1833570xoZ.LIZ("subscribe_inbox_turnon", "", "");
    }

    public static final void LIZ$24(AkS94S0100000_27 akS94S0100000_27, View view) {
        C1210500hbc.LIZ.getClass();
        Keva keva = C1210500hbc.LIZIZ;
        keva.storeInt(C1210500hbc.LIZIZ("live_reply_high_lights_click_count"), keva.getInt(C1210500hbc.LIZIZ("live_reply_high_lights_click_count"), 0) + 1);
        keva.storeLong(C1210500hbc.LIZIZ("live_reply_high_lights_click_time"), System.currentTimeMillis());
        LiveReplayListActivity liveReplayListActivity = (LiveReplayListActivity) akS94S0100000_27.l0;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = liveReplayListActivity.LLILLJJLI;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJJ(liveReplayListActivity.LLJJIJI);
        }
        C1833570xoZ.LIZ.getClass();
        C1833570xoZ.LIZ("subscribe_inbox_close", "", "");
    }

    public static final void LIZ$25(AkS94S0100000_27 akS94S0100000_27, View view) {
        C1856470yPV.LIZ((C1856470yPV) akS94S0100000_27.l0, true, 2, null, 4);
    }

    public static final void LIZ$26(AkS94S0100000_27 akS94S0100000_27, View view) {
        C485260J1g c485260J1g = C485260J1g.LIZ;
        Map<String, String> map = LiveHighLightPageFragment.bS((LiveHighLightPageFragment) akS94S0100000_27.l0, null, 0L, true, 3).LIZ;
        c485260J1g.getClass();
        C20684815ws.LJIILLIIL("livesdk_anchor_highlight_edit_click", map);
        ((LiveHighLightPageFragment) akS94S0100000_27.l0).oS();
    }

    public static final void LIZ$27(AkS94S0100000_27 akS94S0100000_27, View view) {
        ((LiveHighLightPageFragment) akS94S0100000_27.l0).kS();
    }

    public static final void LIZ$28(AkS94S0100000_27 akS94S0100000_27, View view) {
        if (!((LiveHighLightPageFragment) akS94S0100000_27.l0).LLJL && !LiveReplayHighlightMixStyleSetting.INSTANCE.isV2()) {
            ((LiveHighLightPageFragment) akS94S0100000_27.l0).oS();
            return;
        }
        LiveHighLightPageFragment liveHighLightPageFragment = (LiveHighLightPageFragment) akS94S0100000_27.l0;
        C1834580xqC c1834580xqCLIZ = liveHighLightPageFragment.iS().getState().LLILZ.LIZ();
        if (c1834580xqCLIZ != null && c1834580xqCLIZ.LLJJIII == EnumC1219690hqR.POST_STATUS_PROCESSING.getValue()) {
            return;
        }
        C1834580xqC c1834580xqCLIZ2 = liveHighLightPageFragment.iS().getState().LLILZ.LIZ();
        if (!liveHighLightPageFragment.zS()) {
            if (c1834580xqCLIZ2 == null || c1834580xqCLIZ2.LL != EnumC1782300wTs.HIGHLIGHT.getValue() || !liveHighLightPageFragment.uS()) {
                return;
            }
            if (LiveHighLightPageFragment.wS(Integer.valueOf(c1834580xqCLIZ2.LLJILJILJ))) {
                C766270U4b.LIZLLL(2131843968);
                return;
            } else {
                C766270U4b.LIZLLL(2131842145);
                return;
            }
        }
        if (liveHighLightPageFragment.yS()) {
            liveHighLightPageFragment.VS(1, new AwS428S0200000_27(liveHighLightPageFragment, c1834580xqCLIZ2, 83));
        } else {
            if (c1834580xqCLIZ2 == null) {
                return;
            }
            liveHighLightPageFragment.GS(c1834580xqCLIZ2);
        }
    }

    public static final void LIZ$29(AkS94S0100000_27 akS94S0100000_27, View view) {
        ((TakoEntityInfoSheetFragment) akS94S0100000_27.l0).SR(0);
    }

    public static final void LIZ$3(AkS94S0100000_27 akS94S0100000_27, View view) {
        Function0<Unit> function0;
        C1852540yJA c1852540yJA = ((C1852530yJ9) akS94S0100000_27.l0).LLIZ;
        if (c1852540yJA != null && (function0 = c1852540yJA.LIZIZ) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$30(AkS94S0100000_27 akS94S0100000_27, View view) {
        ((TakoEntityInfoSheetFragment) akS94S0100000_27.l0).SR(1);
    }

    public static final void LIZ$31(AkS94S0100000_27 akS94S0100000_27, View view) {
        ((HighlightPreviewClipFragment) akS94S0100000_27.l0).PR();
        ((HighlightPreviewClipFragment) akS94S0100000_27.l0).UR("close");
    }

    public static final void LIZ$32(AkS94S0100000_27 akS94S0100000_27, View view) {
        float fFloatValue;
        Pair<Integer, Integer> pair;
        HighlightPreviewClipFragment highlightPreviewClipFragment;
        C1835970xsR c1835970xsR;
        C1835920xsM c1835920xsM = ((HighlightPreviewClipFragment) akS94S0100000_27.l0).LLJJ;
        if (c1835920xsM != null) {
            fFloatValue = c1835920xsM.getCurrentPercentage().invoke().floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        HighlightPreviewClipFragment highlightPreviewClipFragment2 = (HighlightPreviewClipFragment) akS94S0100000_27.l0;
        float f = fFloatValue * highlightPreviewClipFragment2.LLJJIJIL;
        if (highlightPreviewClipFragment2.LLJJJIL && (pair = highlightPreviewClipFragment2.LLJJJJ) != null) {
            int iIntValue = 0;
            int iIntValue2 = pair.getFirst().intValue();
            Pair<Integer, Integer> pair2 = ((HighlightPreviewClipFragment) akS94S0100000_27.l0).LLJJJJ;
            if (pair2 != null) {
                iIntValue = pair2.getSecond().intValue();
            }
            float f2 = iIntValue2;
            if ((f <= f2 || f >= iIntValue) && (c1835970xsR = (highlightPreviewClipFragment = (HighlightPreviewClipFragment) akS94S0100000_27.l0).LLIZLLLIL) != null) {
                c1835970xsR.LJIIIIZZ(f2 / highlightPreviewClipFragment.LLJJIJIL);
            }
        }
        ((HighlightPreviewClipFragment) akS94S0100000_27.l0).OR(true);
        ((HighlightPreviewClipFragment) akS94S0100000_27.l0).UR("cancel");
    }

    public static final void LIZ$33(AkS94S0100000_27 akS94S0100000_27, View view) {
        HighlightPreviewClipFragment highlightPreviewClipFragment = (HighlightPreviewClipFragment) akS94S0100000_27.l0;
        highlightPreviewClipFragment.getClass();
        C782110Um9 c782110Um9 = new C782110Um9(highlightPreviewClipFragment.getContext());
        c782110Um9.LJIIZILJ(2131852405);
        c782110Um9.LJIIIZ(C497740JfY.LJIIL(2131755842, 3, 3));
        c782110Um9.LJIIJ(2131852403, new AcS498S0100000_27(highlightPreviewClipFragment, 13));
        c782110Um9.LJIILIIL(2131852404, new AcS498S0100000_27(highlightPreviewClipFragment, 14));
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        highlightPreviewClipFragment.LLJZIJLIL = liveDialogLIZ;
        C786410Ut5.E4(liveDialogLIZ);
        ((HighlightPreviewClipFragment) akS94S0100000_27.l0).UR("delete");
    }

    public static final void LIZ$34(AkS94S0100000_27 akS94S0100000_27, View view) {
        Pair<Integer, Integer> pair;
        String str;
        String str2;
        String str3;
        Activity activityLIZ;
        C19EG c19eg;
        String str4;
        List<String> list;
        Activity activityLIZIZ;
        String str5;
        HighlightPreviewClipFragment highlightPreviewClipFragment = (HighlightPreviewClipFragment) akS94S0100000_27.l0;
        LiveFragmentDetail liveFragmentDetail = highlightPreviewClipFragment.LLILLJJLI;
        if (liveFragmentDetail != null) {
            highlightPreviewClipFragment.PR();
            EditParams editParams = null;
            if (highlightPreviewClipFragment.LLJJJIL) {
                pair = highlightPreviewClipFragment.LLJJJJ;
                if (pair == null) {
                    pair = new Pair<>(0, Integer.valueOf(highlightPreviewClipFragment.LLJJIJIL));
                }
            } else {
                pair = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("fragment_id", liveFragmentDetail.fragmentIdStr);
            linkedHashMap.put("fragment_type", String.valueOf(liveFragmentDetail.fragmentTypeNew));
            Map<String, String> map = highlightPreviewClipFragment.LL;
            String str6 = "";
            if (map == null || (str = map.get("enter_from")) == null) {
                str = "";
            }
            linkedHashMap.put("enter_from", str);
            Map<String, String> map2 = highlightPreviewClipFragment.LL;
            if (map2 == null || (str2 = map2.get("enter_from_page")) == null) {
                str2 = "";
            }
            linkedHashMap.put("enter_from_page", str2);
            Map<String, String> map3 = highlightPreviewClipFragment.LL;
            if (map3 == null || (str3 = map3.get("enter_method")) == null) {
                str3 = "";
            }
            linkedHashMap.put("enter_method", str3);
            linkedHashMap.put("publisher_identity", "view_fans");
            linkedHashMap.put("shoot_way", "live_highlights_quickpost");
            Map<String, String> map4 = highlightPreviewClipFragment.LL;
            if (map4 != null && (str5 = map4.get("anchor_id")) != null) {
                str6 = str5;
            }
            linkedHashMap.put("anchor_id", str6);
            linkedHashMap.put("room_id", String.valueOf(liveFragmentDetail.roomId));
            C1835140xr6 c1835140xr6 = C1835140xr6.LL;
            String str7 = highlightPreviewClipFragment.LLJLLL;
            if (!C1835140xr6.LLILZIL) {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                    activityLIZ = C1388190mED.LIZ(activityLIZIZ);
                } else {
                    activityLIZ = null;
                }
                if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                    PublishPageParams publishPageParams = liveFragmentDetail.publishPageParams;
                    if (publishPageParams != null) {
                        str4 = publishPageParams.defaultText;
                        list = publishPageParams.challenges;
                    } else {
                        str4 = null;
                        list = null;
                    }
                    PublishParams publishParams = new PublishParams(str4, list, new ArrayList(), "");
                    if (pair != null) {
                        editParams = new EditParams(0, 0, null);
                        editParams.setStartTime(pair.getFirst().intValue());
                        editParams.setEndTime(pair.getSecond().intValue());
                    }
                    C1813730xIZ.LIZ(false, 0, new PostConfigModel(String.valueOf(liveFragmentDetail.fragmentId), liveFragmentDetail.coverUrl, publishParams, Integer.valueOf(EnumC1813540xIG.PUBLIC.getValue()), linkedHashMap, "fans_club", str7, editParams, "", "", null, 0, "", false, false), c19eg, new AwS641S0100000_27(liveFragmentDetail, 132), null, new DialogInterface.OnDismissListener() { // from class: X.0xr8
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            C1835140xr6 c1835140xr62 = C1835140xr6.LL;
                            C1835140xr6.LLILZIL = false;
                        }
                    }, null, null);
                    C1835140xr6.LLILZIL = true;
                }
            }
        }
        ((HighlightPreviewClipFragment) akS94S0100000_27.l0).UR("next");
    }

    public static final void LIZ$35(AkS94S0100000_27 akS94S0100000_27, View view) {
        ObjectAnimator objectAnimatorOfFloat;
        HighlightPreviewClipFragment highlightPreviewClipFragment = (HighlightPreviewClipFragment) akS94S0100000_27.l0;
        if (!highlightPreviewClipFragment.LLJJJ) {
            AnimatorSet animatorSet = highlightPreviewClipFragment.LLJJJJJIL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            highlightPreviewClipFragment.SR();
            ArrayList arrayList = new ArrayList();
            ImageView imageView = highlightPreviewClipFragment.LLILZIL;
            ObjectAnimator objectAnimatorOfFloat2 = null;
            if (imageView != null && C500260Jjc.LJJJJIZL(imageView)) {
                arrayList.add(imageView);
            }
            TuxIconView tuxIconView = highlightPreviewClipFragment.LLJILJIL;
            if (tuxIconView != null && C500260Jjc.LJJJJIZL(tuxIconView)) {
                arrayList.add(tuxIconView);
            }
            C0GXB c0gxb = highlightPreviewClipFragment.LLJ;
            if (c0gxb != null && C500260Jjc.LJJJJIZL(c0gxb)) {
                arrayList.add(c0gxb);
            }
            View view2 = highlightPreviewClipFragment.LLJIJIL;
            if (view2 != null && C500260Jjc.LJJJJIZL(view2)) {
                arrayList.add(view2);
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(it2.next(), (Property<Object, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat3.setDuration(highlightPreviewClipFragment.LLL);
                objectAnimatorOfFloat3.setInterpolator(highlightPreviewClipFragment.LLLFF);
                arrayList2.add(objectAnimatorOfFloat3);
            }
            View view3 = highlightPreviewClipFragment.LLJILLL;
            if (view3 != null && view3.getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, view3);
                C786410Ut5.T4(view3, 0.0f);
                C786410Ut5.ed(view3, highlightPreviewClipFragment.LLLF);
            }
            View view4 = highlightPreviewClipFragment.LLJILLL;
            if (view4 != null) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.ALPHA, view4.getAlpha(), 1.0f);
                objectAnimatorOfFloat.setDuration(highlightPreviewClipFragment.LLL);
                objectAnimatorOfFloat.setInterpolator(highlightPreviewClipFragment.LLLFFI);
            } else {
                objectAnimatorOfFloat = null;
            }
            View view5 = highlightPreviewClipFragment.LLJILLL;
            if (view5 != null) {
                objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view5, (Property<View, Float>) View.TRANSLATION_Y, view5.getTranslationY(), 0.0f);
                objectAnimatorOfFloat2.setDuration(highlightPreviewClipFragment.LLL);
                objectAnimatorOfFloat2.setInterpolator(highlightPreviewClipFragment.LLLFFI);
            }
            ValueAnimator valueAnimatorNR = highlightPreviewClipFragment.NR(0.7889f);
            ValueAnimator valueAnimatorMR = highlightPreviewClipFragment.MR(((Number) highlightPreviewClipFragment.LLJLL.getValue()).intValue(), ((Number) highlightPreviewClipFragment.LLJLL.getValue()).intValue());
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(arrayList2);
            if (objectAnimatorOfFloat != null) {
                arrayList3.add(objectAnimatorOfFloat);
            }
            if (objectAnimatorOfFloat2 != null) {
                arrayList3.add(objectAnimatorOfFloat2);
            }
            if (valueAnimatorNR != null) {
                arrayList3.add(valueAnimatorNR);
            }
            if (valueAnimatorMR != null) {
                arrayList3.add(valueAnimatorMR);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList3);
            animatorSet2.addListener(new ALAdapterS22S0100000_27(highlightPreviewClipFragment, 8));
            animatorSet2.start();
            highlightPreviewClipFragment.LLJJJJJIL = animatorSet2;
        }
        ((HighlightPreviewClipFragment) akS94S0100000_27.l0).UR("clip");
    }

    public static final void LIZ$36(AkS94S0100000_27 akS94S0100000_27, View view) throws Throwable {
        ((TakoMediaChooseView) akS94S0100000_27.l0).kp();
        C19EG c19egLIZ = C724240Sb0.LIZ((TakoMediaChooseView) akS94S0100000_27.l0);
        if (c19egLIZ != null) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("package:");
                sbLIZ.append(c19egLIZ.getPackageName());
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                intent.addFlags(268435456);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egLIZ, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, c19egLIZ);
                C2204961BRm.LLJJJJ(c19egLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA0SeIG7CUfRSNWhLA3XSYnl/nvsyHlRmsZAMelyfvZsfu5DzFmk/B02br3fju2mn2mQ==", null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void LIZ$37(AkS94S0100000_27 akS94S0100000_27, View view) {
        C540190LGn.LIZ = true;
        ((TakoMediaChooseView) akS94S0100000_27.l0).hp(0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01d3  */
    /* JADX WARN: Type inference failed for: r0v52, types: [CALLBACK, X.0xuF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$4(irm.AkS94S0100000_27 r21, android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS94S0100000_27.LIZ$4(irm.AkS94S0100000_27, android.view.View):void");
    }

    public static final void LIZ$5(AkS94S0100000_27 akS94S0100000_27, View view) {
        ((C1838060xvo) akS94S0100000_27.l0).LLIZLLLIL.invoke();
    }

    public static final void LIZ$6(AkS94S0100000_27 akS94S0100000_27, View view) {
        Boolean boolValueOf;
        C197039127h c197039127h = ((PostedListFragment) akS94S0100000_27.l0).LLIZLLLIL;
        if (c197039127h != null) {
            boolValueOf = Boolean.valueOf(c197039127h.LLLII);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            ((PostedListFragment) akS94S0100000_27.l0).PR().vQ2(new C1777310wLp(((PostedListFragment) akS94S0100000_27.l0).NR(), "delete"));
            PostedListFragment postedListFragment = (PostedListFragment) akS94S0100000_27.l0;
            Context context = postedListFragment.getContext();
            if (context != null) {
                postedListFragment.PR().vQ2(new C1777320wLq("show", null, postedListFragment.NR()));
                if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                    C632670Orh.LIZIZ(context, new C19719212De(-2135028000, new AwS653S0100000_4(postedListFragment, 12), true));
                    return;
                }
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LIZ(2131851294);
                C985403tE.LIZ(c1397580mTM, new AwS606S0100000_27(postedListFragment, 324));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
        }
    }

    public static final void LIZ$7(AkS94S0100000_27 akS94S0100000_27, View view) {
        ((HighlightGeneratingFragment) akS94S0100000_27.l0).MR();
        ((HighlightGeneratingFragment) akS94S0100000_27.l0).NR("click");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$8(irm.AkS94S0100000_27 r4, android.view.View r5) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS94S0100000_27.LIZ$8(irm.AkS94S0100000_27, android.view.View):void");
    }

    public static final void LIZ$9(AkS94S0100000_27 akS94S0100000_27, View view) {
        C1834580xqC item = ((LiveHighlightVideoCell) akS94S0100000_27.l0).getItem();
        if (item != null) {
            ((LiveHighlightVideoCell) akS94S0100000_27.l0).L5().GQ2(item, true);
        }
    }
}
