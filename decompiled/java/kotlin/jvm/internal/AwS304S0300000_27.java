package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C123100dR;
import X.C1388190mED;
import X.C1391990mKL;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1683130ttv;
import X.C1845110y7B;
import X.C1845120y7C;
import X.C1854150yLl;
import X.C1854760yMk;
import X.C1856230yP7;
import X.C1857420yR2;
import X.C1862330yYx;
import X.C1862470yZB;
import X.C19EG;
import X.C20237214Gk;
import X.C20237414Gm;
import X.C20441214yg;
import X.C20600815jK;
import X.C2188811AlT;
import X.C259800zU;
import X.C747440TTq;
import X.C973660bRc;
import X.EnumC1858090yS7;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.contactselect.ContactSelectPanel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.botcenter.TakoBotCenterRecentlyChatAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.imagelist.TakoImageListNewAssem;
import com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionAIImageItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.net.BotCategoryInfo;
import com.ss.android.ugc.aweme.tako.ccl.net.BriefBot;
import com.ss.android.ugc.aweme.tako.ccl.net.CategoryBot;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoBotCenterResponse;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoDisclaimerDialogProcessor;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public class AwS304S0300000_27 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$0(AwS304S0300000_27 awS304S0300000_27, Object obj, Object obj2) {
        C1391990mKL c1391990mKL = (C1391990mKL) obj2;
        c1391990mKL.LIZIZ = ((C1845120y7C) awS304S0300000_27.l0).LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Guide panel primaryAction clicked: ");
        sbLIZ.append(((C1845120y7C) awS304S0300000_27.l0).LIZ);
        C20441214yg.LIZIZ("AICommentaryIntroPanelHelper", C2188811AlT.LIZIZ(sbLIZ));
        Function2<TuxPanel, C1391990mKL, Unit> function2 = ((C1845120y7C) awS304S0300000_27.l0).LIZJ;
        if (function2 != null) {
            T t = ((C259800zU) awS304S0300000_27.l1).element;
            if (t != 0) {
                function2.invoke(t, c1391990mKL);
                C973660bRc c973660bRc = C973660bRc.LIZ;
                C1845110y7B c1845110y7B = (C1845110y7B) awS304S0300000_27.l2;
                c973660bRc.LJJJJL(c1845110y7B.LIZLLL, c1845110y7B.LJ, true, c1845110y7B.LJII, c1845110y7B.LJFF, c1845110y7B.LJI);
            }
        } else {
            C973660bRc c973660bRc2 = C973660bRc.LIZ;
            C1845110y7B c1845110y7B2 = (C1845110y7B) awS304S0300000_27.l2;
            c973660bRc2.LJJJJL(c1845110y7B2.LIZLLL, c1845110y7B2.LJ, true, c1845110y7B2.LJII, c1845110y7B2.LJFF, c1845110y7B2.LJI);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$1(AwS304S0300000_27 awS304S0300000_27, Object obj, Object obj2) {
        C1391990mKL c1391990mKL = (C1391990mKL) obj2;
        c1391990mKL.LIZIZ = ((C1845120y7C) awS304S0300000_27.l0).LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Guide panel secondaryAction clicked: ");
        sbLIZ.append(((C1845120y7C) awS304S0300000_27.l0).LIZ);
        C20441214yg.LIZIZ("AICommentaryIntroPanelHelper", C2188811AlT.LIZIZ(sbLIZ));
        Function2<TuxPanel, C1391990mKL, Unit> function2 = ((C1845120y7C) awS304S0300000_27.l0).LIZJ;
        if (function2 != null) {
            T t = ((C259800zU) awS304S0300000_27.l1).element;
            if (t != 0) {
                function2.invoke(t, c1391990mKL);
                C973660bRc c973660bRc = C973660bRc.LIZ;
                C1845110y7B c1845110y7B = (C1845110y7B) awS304S0300000_27.l2;
                c973660bRc.LJJJJL(c1845110y7B.LIZLLL, c1845110y7B.LJ, true, c1845110y7B.LJIIIIZZ, c1845110y7B.LJFF, c1845110y7B.LJI);
            }
        } else {
            C973660bRc c973660bRc2 = C973660bRc.LIZ;
            C1845110y7B c1845110y7B2 = (C1845110y7B) awS304S0300000_27.l2;
            c973660bRc2.LJJJJL(c1845110y7B2.LIZLLL, c1845110y7B2.LJ, true, c1845110y7B2.LJIIIIZZ, c1845110y7B2.LJFF, c1845110y7B2.LJI);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS304S0300000_27 awS304S0300000_27, Object obj, Object obj2) {
        TakoCardAbility takoCardAbility;
        Message messageYy1;
        C19EG c19egLIZIZ;
        boolean z;
        String str;
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        if (!((BaseImage) awS304S0300000_27.l0).urlList.isEmpty() && (takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL((TakoImageListNewAssem) awS304S0300000_27.l1), TakoCardAbility.class, null)) != null && (messageYy1 = takoCardAbility.Yy1()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(((C1856230yP7) awS304S0300000_27.l2).getContext())) != null) {
            C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
            C1856230yP7 c1856230yP7 = (C1856230yP7) awS304S0300000_27.l2;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((TakoImageListNewAssem) awS304S0300000_27.l1);
            TakoImageListNewAssem takoImageListNewAssem = (TakoImageListNewAssem) awS304S0300000_27.l1;
            BaseImage baseImage = (BaseImage) awS304S0300000_27.l0;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL((TakoImageListNewAssem) awS304S0300000_27.l1);
            C1856230yP7 c1856230yP72 = (C1856230yP7) awS304S0300000_27.l2;
            takoImageListNewAssem.getClass();
            ArrayList arrayList = new ArrayList();
            C1857420yR2.LJIILIIL(arrayList, (String) C13LP.LJJJLL(baseImage.urlList), messageYy1, interfaceC665370Q7zLJIIL2, c19egLIZIZ, c1856230yP72, "long_press", false);
            TakoMixFeed takoMixFeedLJIIIZ = messageYy1.LJIIIZ();
            if (takoMixFeedLJIIIZ != null && (str = takoMixFeedLJIIIZ.text) != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C1857420yR2.LJI(arrayList, messageYy1, interfaceC665370Q7zLJIIL2);
            }
            C1857420yR2.LJIILLIIL(24, c1856230yP72, interfaceC665370Q7zLJIIL2, messageYy1, null, arrayList, null);
            C1857420yR2.LIZLLL(arrayList, c19egLIZIZ, messageYy1, Collections.singletonList(messageYy1), interfaceC665370Q7zLJIIL2);
            C1857420yR2.LJJIII(c1856230yP7, interfaceC665370Q7zLJIIL, messageYy1, arrayList, fFloatValue, fFloatValue2, false, false, 192);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS304S0300000_27 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS304S0300000_27.invoke$2(kotlin.jvm.internal.AwS304S0300000_27, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS304S0300000_27 awS304S0300000_27, Object obj, Object obj2) {
        BaseImage baseImage = (BaseImage) obj;
        ((Number) obj2).intValue();
        if (baseImage != null) {
            ((BottomInputAssem) awS304S0300000_27.l0).Wp("ai_image_panel", (Context) awS304S0300000_27.l1, baseImage, (NewActionAIImageItem) awS304S0300000_27.l2);
        } else {
            TakoSubModeBarAbility takoSubModeBarAbilityEp = ((BottomInputAssem) awS304S0300000_27.l0).Ep();
            if (takoSubModeBarAbilityEp != null) {
                takoSubModeBarAbilityEp.zJ0();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS304S0300000_27 awS304S0300000_27, Object obj, Object obj2) {
        List<BriefBot> list;
        String str;
        BotCategoryInfo botCategoryInfo;
        TakoBotCenterResponse takoBotCenterResponse = (TakoBotCenterResponse) obj2;
        if (takoBotCenterResponse != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) awS304S0300000_27.l0;
            TuxTextView tuxTextView = (TuxTextView) awS304S0300000_27.l1;
            TakoBotCenterRecentlyChatAssem takoBotCenterRecentlyChatAssem = (TakoBotCenterRecentlyChatAssem) awS304S0300000_27.l2;
            CategoryBot categoryBot = takoBotCenterResponse.userInteractedBots;
            if (categoryBot != null && (list = categoryBot.bots) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<BriefBot> it2 = list.iterator();
                while (it2.hasNext()) {
                    TakoBotInfo takoBotInfo = takoBotCenterResponse.botDetailInfos.get(it2.next().botId);
                    if (takoBotInfo != null) {
                        arrayList.add(takoBotInfo);
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(new C20237214Gk((TakoBotInfo) it3.next(), (C20237414Gm) takoBotCenterRecentlyChatAssem.LLJJIII.getValue()));
                    }
                    state.LJIILL(arrayList2, null);
                    viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
                    CategoryBot categoryBot2 = takoBotCenterResponse.userInteractedBots;
                    if (categoryBot2 == null || (botCategoryInfo = categoryBot2.category) == null || (str = botCategoryInfo.category) == null) {
                        str = "";
                    }
                    tuxTextView.setText(str);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS304S0300000_27 awS304S0300000_27, Object obj, Object obj2) throws JSONException {
        int iIntValue = ((Number) obj2).intValue();
        TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor = (TakoDisclaimerDialogProcessor) awS304S0300000_27.l0;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS304S0300000_27.l1;
        IMessageAbility iMessageAbility = (IMessageAbility) awS304S0300000_27.l2;
        takoDisclaimerDialogProcessor.getClass();
        TakoDisclaimerDialogProcessor.LJ(iMessageAbility, takoEnterParams);
        ((TakoDisclaimerDialogProcessor) awS304S0300000_27.l0).LIZ((IMessageAbility) awS304S0300000_27.l2, (TakoEnterParams) awS304S0300000_27.l1);
        C1862330yYx.LJJJZ(C1862330yYx.LIZ, ((TakoEnterParams) awS304S0300000_27.l1).getCommonParams(), "click_confirm");
        TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor2 = (TakoDisclaimerDialogProcessor) awS304S0300000_27.l0;
        TakoEnterParams takoEnterParams2 = (TakoEnterParams) awS304S0300000_27.l1;
        String str = C747440TTq.LIZJ().confirmQuery;
        if (str == null) {
            str = "";
        }
        takoDisclaimerDialogProcessor2.getClass();
        TakoDisclaimerDialogProcessor.LIZJ(true, takoEnterParams2, str, iIntValue);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS304S0300000_27 awS304S0300000_27, Object obj, Object obj2) throws JSONException {
        int iIntValue = ((Number) obj2).intValue();
        TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor = (TakoDisclaimerDialogProcessor) awS304S0300000_27.l0;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS304S0300000_27.l1;
        IMessageAbility iMessageAbility = (IMessageAbility) awS304S0300000_27.l2;
        takoDisclaimerDialogProcessor.getClass();
        TakoDisclaimerDialogProcessor.LJ(iMessageAbility, takoEnterParams);
        ((TakoDisclaimerDialogProcessor) awS304S0300000_27.l0).LIZ((IMessageAbility) awS304S0300000_27.l2, (TakoEnterParams) awS304S0300000_27.l1);
        C1862330yYx.LJJJZ(C1862330yYx.LIZ, ((TakoEnterParams) awS304S0300000_27.l1).getCommonParams(), "click_confirm");
        TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor2 = (TakoDisclaimerDialogProcessor) awS304S0300000_27.l0;
        TakoEnterParams takoEnterParams2 = (TakoEnterParams) awS304S0300000_27.l1;
        String str = C747440TTq.LIZJ().confirmQuery;
        if (str == null) {
            str = "";
        }
        takoDisclaimerDialogProcessor2.getClass();
        TakoDisclaimerDialogProcessor.LIZJ(true, takoEnterParams2, str, iIntValue);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS304S0300000_27 awS304S0300000_27, Object obj, Object obj2) throws JSONException {
        int iIntValue = ((Number) obj2).intValue();
        TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor = (TakoDisclaimerDialogProcessor) awS304S0300000_27.l0;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS304S0300000_27.l1;
        IMessageAbility iMessageAbility = (IMessageAbility) awS304S0300000_27.l2;
        takoDisclaimerDialogProcessor.getClass();
        TakoDisclaimerDialogProcessor.LJ(iMessageAbility, takoEnterParams);
        ((TakoDisclaimerDialogProcessor) awS304S0300000_27.l0).LIZ((IMessageAbility) awS304S0300000_27.l2, (TakoEnterParams) awS304S0300000_27.l1);
        C1862330yYx.LJJJZ(C1862330yYx.LIZ, ((TakoEnterParams) awS304S0300000_27.l1).getCommonParams(), "click_confirm");
        TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor2 = (TakoDisclaimerDialogProcessor) awS304S0300000_27.l0;
        TakoEnterParams takoEnterParams2 = (TakoEnterParams) awS304S0300000_27.l1;
        String str = C747440TTq.LIZJ().confirmQuery;
        if (str == null) {
            str = "";
        }
        takoDisclaimerDialogProcessor2.getClass();
        TakoDisclaimerDialogProcessor.LIZJ(true, takoEnterParams2, str, iIntValue);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS304S0300000_27 awS304S0300000_27, Object obj, Object obj2) throws JSONException {
        EnumC1858090yS7 enumC1858090yS7;
        String str = (String) obj;
        int iIntValue = ((Number) obj2).intValue();
        IMessageAbility iMessageAbility = (IMessageAbility) awS304S0300000_27.l0;
        String autoSendMsgContent = ((TakoEnterParams) awS304S0300000_27.l1).getAutoSendMsgContent();
        if (!C123100dR.LIZ(autoSendMsgContent) || autoSendMsgContent == null) {
            autoSendMsgContent = str;
        }
        boolean zLIZ = C123100dR.LIZ(((TakoEnterParams) awS304S0300000_27.l1).getAutoSendMsgContent());
        if (C123100dR.LIZ(((TakoEnterParams) awS304S0300000_27.l1).getAutoSendMsgContent())) {
            enumC1858090yS7 = EnumC1858090yS7.SEARCH_SUG;
        } else {
            enumC1858090yS7 = EnumC1858090yS7.DIALOG_SUG;
        }
        iMessageAbility.Rl2(autoSendMsgContent, zLIZ, enumC1858090yS7, ((TakoEnterParams) awS304S0300000_27.l1).getCommonParams(), C1862470yZB.LIZ((TakoEnterParams) awS304S0300000_27.l1), new LinkedHashMap(), null, null, "", 0, null, 0, -1, null, null, UUID.randomUUID().toString(), null, null);
        ((TakoDisclaimerDialogProcessor) awS304S0300000_27.l2).LIZ((IMessageAbility) awS304S0300000_27.l0, (TakoEnterParams) awS304S0300000_27.l1);
        C1862330yYx.LJJJZ(C1862330yYx.LIZ, ((TakoEnterParams) awS304S0300000_27.l1).getCommonParams(), "click_question");
        TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor = (TakoDisclaimerDialogProcessor) awS304S0300000_27.l2;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS304S0300000_27.l1;
        takoDisclaimerDialogProcessor.getClass();
        TakoDisclaimerDialogProcessor.LIZJ(true, takoEnterParams, str, iIntValue);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS304S0300000_27 awS304S0300000_27, Object obj, Object obj2) {
        String str;
        int iIntValue = ((Number) obj2).intValue();
        if (obj != null) {
            TakoSubModeBarAbility takoSubModeBarAbility = (TakoSubModeBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL((BottomInputAssem) awS304S0300000_27.l0), TakoSubModeBarAbility.class, null);
            if (takoSubModeBarAbility != null) {
                takoSubModeBarAbility.br0();
            }
            ((BottomInputAssem) awS304S0300000_27.l0).lp((C1854150yLl) awS304S0300000_27.l1);
            C1854760yMk c1854760yMk = ((BottomInputAssem) awS304S0300000_27.l0).LLJJJ;
            if (c1854760yMk != null) {
                c1854760yMk.setActive(true);
            }
        } else {
            TakoSubModeBarAbility takoSubModeBarAbility2 = (TakoSubModeBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL((BottomInputAssem) awS304S0300000_27.l0), TakoSubModeBarAbility.class, null);
            if (takoSubModeBarAbility2 != null) {
                takoSubModeBarAbility2.zJ0();
            }
            BottomInputAssem bottomInputAssem = (BottomInputAssem) awS304S0300000_27.l0;
            C1854150yLl c1854150yLl = (C1854150yLl) awS304S0300000_27.l2;
            if (iIntValue == 4) {
                str = "click_cancel";
            } else {
                str = "image_non_compliant";
            }
            bottomInputAssem.wq(c1854150yLl, str);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS304S0300000_27(com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility r3, com.ss.android.ugc.aweme.tako.model.TakoEnterParams r4, com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoDisclaimerDialogProcessor r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 5: goto L11;
                case 6: goto L11;
                case 7: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 2
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS304S0300000_27.<init>(com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility, com.ss.android.ugc.aweme.tako.model.TakoEnterParams, com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoDisclaimerDialogProcessor, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS304S0300000_27(C1845120y7C c1845120y7C, C1845120y7C c1845120y7C2, C259800zU<TuxPanel> c259800zU, C1845110y7B c1845110y7B) {
        super(2);
        this.$t = c1845110y7B;
        this.l0 = c1845120y7C;
        this.l1 = c1845120y7C2;
        this.l2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS304S0300000_27(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, TuxTextView tuxTextView, TakoBotCenterRecentlyChatAssem takoBotCenterRecentlyChatAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC20604515jv;
        this.l1 = tuxTextView;
        this.l2 = takoBotCenterRecentlyChatAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS304S0300000_27(ContactSelectPanel contactSelectPanel, ContactSelectPanel contactSelectPanel2, C259800zU<C1683130ttv> c259800zU, C013C c013c) {
        super(2);
        this.$t = c013c;
        this.l0 = contactSelectPanel;
        this.l1 = contactSelectPanel2;
        this.l2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS304S0300000_27(BottomInputAssem bottomInputAssem, C1854150yLl c1854150yLl, C1854150yLl c1854150yLl2, int i) {
        super(2);
        this.$t = i;
        this.l0 = bottomInputAssem;
        this.l1 = c1854150yLl;
        this.l2 = c1854150yLl2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS304S0300000_27(BottomInputAssem bottomInputAssem, Context context, NewActionAIImageItem newActionAIImageItem, int i) {
        super(2);
        this.$t = i;
        this.l0 = bottomInputAssem;
        this.l1 = context;
        this.l2 = newActionAIImageItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS304S0300000_27(BaseImage baseImage, TakoImageListNewAssem takoImageListNewAssem, C1856230yP7 c1856230yP7, int i) {
        super(2);
        this.$t = i;
        this.l0 = baseImage;
        this.l1 = takoImageListNewAssem;
        this.l2 = c1856230yP7;
    }
}
